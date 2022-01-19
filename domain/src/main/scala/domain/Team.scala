package domain

case class Team(
    att_obox_own_goal: Int = 0,
    contentious_decision: Int = 0,
    total_red_card: Int = 0,
    fk_foul_lost: Int = 0,
    total_yel_card: Int = 0,
    defender_goals: Int = 0,
    possession_percentage: Float = 0,
    subs_made: Int = 0,
    midfielder_goals: Int = 0,
    own_goal_accrued: Int = 0,
    att_ibox_own_goal: Int = 0,
    fk_foul_won: Int = 0,
    forward_goals: Int = 0
)
