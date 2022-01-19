package xml

import domain.presentation.Player

object dataset {

  def player = Player("Lukasz", "Fabianski")

  def apply =
    <SoccerFeed TimeStamp="20180414T154054+0100">
          <SoccerDocument Type="Latest" detail_id="1" uID="f919230">
            <Competition uID="c8">
              <Country>England</Country>
              <Name>English Premier League</Name>
            </Competition>
            <MatchData>
              <TeamData Score="0" Side="Home" TeamRef="t80">
                <PlayerLineUp>
                  <MatchPlayer PlayerRef="p37096" Position="Goalkeeper" ShirtNumber="1" Status="Start">
                    <Stat Type="leftside_pass">1</Stat>
                    <Stat Type="accurate_pass">6</Stat>
                  </MatchPlayer>
                </PlayerLineUp>
              </TeamData>
            </MatchData>
            <Team uID="t80">
              <Country>England</Country>
              <Name>Swansea City</Name>
              <Player Position="Goalkeeper" uID="p37096">
                <PersonName>
                  <First>Lukasz</First>
                  <Last>Fabianski</Last>
                </PersonName>
              </Player>
            </Team>
          </SoccerDocument>
        </SoccerFeed>

}
