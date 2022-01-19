package xml

object Validate {

  import domain.presentation._
  def apply(parseResult: Map[Player, PlayerStats]) = {
    import infrastructure.shapeless.ObjectMapper.{fromMap}
    parseResult.toSeq
      .map { parseResult =>
        (
          fromMap[domain.Common](parseResult._2.statistics),
          fromMap[domain.Player](parseResult._2.statistics)
        )
      }
      .map {
        case (Right(common), Right(player)) => Right(common, player)
        case (Left(common), Right(player))  => Left(common)
        case (Right(common), Left(player))  => Left(player)
        case (Left(common), Left(player)) =>
          Left(
            Seq(common, player).mkString("\n")
          )
      }
      .partitionMap(identity) match {
      case (Nil, rights) => Right(rights)
      case (lefts, _)    => Left(lefts)
    }
  }

}
