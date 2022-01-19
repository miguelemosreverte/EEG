package domain

case class Common(
    total_cross: Int = 0,
    clearance_off_line: Int = 0,
    accurate_keeper_sweeper: Int = 0,
    accurate_pull_back: Int = 0,
    att_cmiss_high_left: Int = 0,
    att_cmiss_left: Int = 0,
    goal_assist_setplay: Int = 0,
    passes_left: Int = 0,
    won_tackle: Int = 0,
    total_chipped_pass: Int = 0,
    att_sv_low_left: Int = 0,
    aerial_lost: Int = 0,
    total_high_claim: Int = 0,
    shot_off_target: Int = 0,
    blocked_pass: Int = 0,
    att_sv_high_right: Int = 0,
    aerial_won: Int = 0,
    penalty_save: Int = 0,
    second_yellow: Int = 0,
    att_obox_target: Int = 0,
    att_ibox_miss: Int = 0,
    att_cmiss_high_right: Int = 0,
    att_rf_total: Int = 0,
    ontarget_scoring_att: Int = 0,
    att_obox_blocked: Int = 0,
    big_chance_scored: Int = 0,
    shield_ball_oop: Int = 0,
    total_keeper_sweeper: Int = 0,
    duel_lost: Int = 0,
    accurate_throws: Int = 0,
    total_layoffs: Int = 0,
    total_fwd_zone_pass: Int = 0,
    att_obp_goal: Int = 0,
    att_sv_high_left: Int = 0,
    att_sv_low_centre: Int = 0,
    att_obx_centre: Int = 0,
    att_ibox_goal: Int = 0,
    att_rf_goal: Int = 0,
    goals_conceded_obox: Int = 0,
    att_obox_miss: Int = 0,
    accurate_chipped_pass: Int = 0,
    foul_throw_in: Int = 0,
    pen_area_entries: Int = 0,
    total_offside: Int = 0,
    att_lf_goal: Int = 0,
    att_sv_low_right: Int = 0,
    att_hd_total: Int = 0,
    accurate_goal_kicks: Int = 0,
    att_bx_left: Int = 0,
    goal_assist_intentional: Int = 0,
    open_play_pass: Int = 0,
    att_hd_goal: Int = 0,
    total_tackle: Int = 0,
    interception: Int = 0,
    big_chance_missed: Int = 0,
    att_bx_right: Int = 0,
    att_rf_target: Int = 0,
    penalty_faced: Int = 0,
    total_final_third_passes: Int = 0,
    total_back_zone_pass: Int = 0,
    goal_assist_deadball: Int = 0,
    att_goal_high_left: Int = 0,
    total_through_ball: Int = 0,
    effective_clearance: Int = 0,
    post_scoring_att: Int = 0,
    six_yard_block: Int = 0,
    att_goal_high_centre: Int = 0,
    att_freekick_post: Int = 0,
    crosses_yard: Int = 0,
    att_goal_low_left: Int = 0,
    total_long_balls: Int = 0,
    challenge_lost: Int = 0,
    long_pass_own_to_opp_success: Int = 0,
    duel_won: Int = 0,
    att_openplay: Int = 0,
    att_cmiss_high: Int = 0,
    final_third_entries: Int = 0,
    fouled_final_third: Int = 0,
    att_freekick_miss: Int = 0,
    saved_obox: Int = 0,
    attempts_conceded_ibox: Int = 0,
    att_goal_low_right: Int = 0,
    offtarget_att_assist: Int = 0,
    total_corners_intobox: Int = 0,
    successful_final_third_passes: Int = 0,
    accurate_flick_on: Int = 0,
    goal_assist_openplay: Int = 0,
    att_setpiece: Int = 0,
    accurate_corners_intobox: Int = 0,
    att_cmiss_right: Int = 0,
    shot_fastbreak: Int = 0,
    total_contest: Int = 0,
    att_hd_target: Int = 0,
    long_pass_own_to_opp: Int = 0,
    att_freekick_total: Int = 0,
    touches_in_opp_box: Int = 0,
    att_ibox_post: Int = 0,
    error_lead_to_shot: Int = 0,
    total_cross_nocorner: Int = 0,
    interception_won: Int = 0,
    att_miss_right: Int = 0,
    att_freekick_goal: Int = 0,
    accurate_pass: Int = 0,
    att_pen_miss: Int = 0,
    interceptions_in_box: Int = 0,
    goal_assist: Int = 0,
    goal_fastbreak: Int = 0,
    last_man_tackle: Int = 0,
    accurate_cross_nocorner: Int = 0,
    corner_taken: Int = 0,
    att_pen_goal: Int = 0,
    accurate_launches: Int = 0,
    leftside_pass: Int = 0,
    attempts_conceded_obox: Int = 0,
    att_post_right: Int = 0,
    saved_ibox: Int = 0,
    accurate_fwd_zone_pass: Int = 0,
    freekick_cross: Int = 0,
    head_clearance: Int = 0,
    rightside_pass: Int = 0,
    att_ibox_target: Int = 0,
    total_launches: Int = 0,
    accurate_long_balls: Int = 0,
    total_clearance: Int = 0,
    hand_ball: Int = 0,
    att_one_on_one: Int = 0,
    punches: Int = 0,
    att_obox_goal: Int = 0,
    att_goal_high_right: Int = 0,
    att_post_high: Int = 0,
    touches: Int = 0,
    blocked_scoring_att: Int = 0,
    att_hd_miss: Int = 0,
    att_lf_target: Int = 0,
    accurate_cross: Int = 0,
    lost_corners: Int = 0,
    accurate_layoffs: Int = 0,
    poss_won_mid_rd: Int = 0,
    hit_woodwork: Int = 0,
    good_high_claim: Int = 0,
    goals: Int = 0,
    att_miss_high_right: Int = 0,
    diving_save: Int = 0,
    att_fastbreak: Int = 0,
    effective_head_clearance: Int = 0,
    ontarget_att_assist: Int = 0,
    poss_lost_ctrl: Int = 0,
    total_pass: Int = 0,
    accurate_freekick_cross: Int = 0,
    att_obxd_right: Int = 0,
    ball_recovery: Int = 0,
    goals_conceded: Int = 0,
    fwd_pass: Int = 0,
    att_lf_total: Int = 0,
    keeper_throws: Int = 0,
    total_pull_back: Int = 0,
    att_assist_openplay: Int = 0,
    att_goal_low_centre: Int = 0,
    effective_blocked_cross: Int = 0,
    own_goals: Int = 0,
    accurate_back_zone_pass: Int = 0,
    att_ibox_blocked: Int = 0,
    won_contest: Int = 0,
    att_miss_high_left: Int = 0,
    att_lg_left: Int = 0,
    successful_open_play_pass: Int = 0,
    att_pen_target: Int = 0,
    att_obxd_left: Int = 0,
    att_post_left: Int = 0,
    attempted_tackle_foul: Int = 0,
    backward_pass: Int = 0,
    att_freekick_target: Int = 0,
    att_obx_right: Int = 0,
    saves: Int = 0,
    blocked_cross: Int = 0,
    unsuccessful_touch: Int = 0,
    error_lead_to_goal: Int = 0,
    att_miss_high: Int = 0,
    att_sv_high_centre: Int = 0,
    put_through: Int = 0,
    accurate_keeper_throws: Int = 0,
    goals_conceded_ibox: Int = 0,
    att_obx_left: Int = 0,
    poss_won_def_rd: Int = 0,
    overrun: Int = 0,
    won_corners: Int = 0,
    total_throws: Int = 0,
    att_obox_post: Int = 0,
    att_lg_right: Int = 0,
    att_assist_setplay: Int = 0,
    total_fastbreak: Int = 0,
    pen_goals_conceded: Int = 0,
    goals_openplay: Int = 0,
    goal_kicks: Int = 0,
    crosses_yardplus: Int = 0,
    outfielder_block: Int = 0,
    poss_lost_all: Int = 0,
    successful_put_through: Int = 0,
    total_att_assist: Int = 0,
    dispossessed: Int = 0,
    total_flick_on: Int = 0,
    att_bx_centre: Int = 0,
    big_chance_created: Int = 0,
    penalty_conceded: Int = 0,
    att_hd_post: Int = 0,
    att_miss_left: Int = 0,
    att_lg_centre: Int = 0,
    accurate_through_ball: Int = 0,
    passes_right: Int = 0,
    poss_won_att_rd: Int = 0,
    penalty_won: Int = 0,
    att_pen_post: Int = 0,
    total_scoring_att: Int = 0
)
