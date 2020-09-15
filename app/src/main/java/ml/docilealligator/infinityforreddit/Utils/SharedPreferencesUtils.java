package ml.docilealligator.infinityforreddit.Utils;

/**
 * Created by alex on 2/23/18.
 */

public class SharedPreferencesUtils {
    public static final String ENABLE_NOTIFICATION_KEY = "enable_notification";
    public static final String NOTIFICATION_INTERVAL_KEY = "notificaiton_interval";
    public static final String LAZY_MODE_INTERVAL_KEY = "lazy_mode_interval";
    public static final String NSFW_KEY = "nsfw";
    public static final String BLUR_NSFW_KEY = "blur_nsfw";
    public static final String BLUR_SPOILER_KEY = "blur_spoiler";
    public static final String THEME_KEY = "theme";
    public static final String ICON_FOREGROUND_KEY = "icon_foreground";
    public static final String ICON_BACKGROUND_KEY = "icon_background";
    public static final String ERROR_IMAGE_KEY = "error_image";
    public static final String GILDED_ICON_KEY = "gilded_icon";
    public static final String CROSSPOST_ICON_KEY = "crosspost_icon";
    public static final String THUMBTACK_ICON_KEY = "thumbtack_icon";
    public static final String BEST_ROCKET_ICON_KEY = "best_rocket_icon";
    public static final String MATERIAL_ICONS_KEY = "material_icons";
    public static final String OPEN_SOURCE_KEY = "open_source";
    public static final String RATE_KEY = "rate";
    public static final String F_DROID_KEY = "f-droid";
    public static final String EMAIL_KEY = "email";
    public static final String REDDIT_ACCOUNT_KEY = "reddit_account";
    public static final String SUBREDDIT_KEY = "subreddit";
    public static final String SHARE_KEY = "share";
    public static final String VERSION_KEY = "version";
    public static final String FONT_SIZE_KEY = "font_size";
    public static final String TITLE_FONT_SIZE_KEY = "title_font_size";
    public static final String CONTENT_FONT_SIZE_KEY = "content_font_size";
    public static final String FONT_FAMILY_KEY = "font_family";
    public static final String TITLE_FONT_FAMILY_KEY = "title_font_family";
    public static final String CONTENT_FONT_FAMILY_KEY = "content_font_family";
    public static final String AMOLED_DARK_KEY = "amoled_dark";
    public static final String IMMERSIVE_INTERFACE_ENTRY_KEY = "immersive_interface_entry";
    public static final String IMMERSIVE_INTERFACE_KEY = "immersive_interface";
    public static final String IMMERSIVE_INTERFACE_IGNORE_NAV_BAR_KEY = "immersive_interface_ignore_nav_bar";
    public static final String BOTTOM_APP_BAR_KEY = "bottom_app_bar";
    public static final String VOTE_BUTTONS_ON_THE_RIGHT_KEY = "vote_buttons_on_the_right";

    public static final String SORT_TYPE_SHARED_PREFERENCES_FILE = "ml.docilealligator.infinityforreddit.sort_type";
    public static final String SORT_TYPE_BEST_POST = "sort_type_best_post";
    public static final String SORT_TIME_BEST_POST = "sort_time_best_post";
    public static final String SORT_TYPE_SEARCH_POST = "sort_type_search_post";
    public static final String SORT_TIME_SEARCH_POST = "sort_time_search_post";
    public static final String SORT_TYPE_SUBREDDIT_POST_BASE = "sort_type_subreddit_post_";
    public static final String SORT_TIME_SUBREDDIT_POST_BASE = "sort_time_subreddit_post_";
    public static final String SORT_TYPE_MULTI_REDDIT_POST_BASE = "sort_type_multi_reddit_post_";
    public static final String SORT_TIME_MULTI_REDDIT_POST_BASE = "sort_time_multi_reddit_post_";
    public static final String SORT_TYPE_USER_POST_BASE = "sort_type_user_post_";
    public static final String SORT_TIME_USER_POST_BASE = "sort_time_user_post_";
    public static final String SORT_TYPE_USER_COMMENT = "sort_type_user_comment";
    public static final String SORT_TIME_USER_COMMENT = "sort_time_user_comment";
    public static final String SORT_TYPE_SEARCH_SUBREDDIT = "sort_type_search_subreddit";
    public static final String SORT_TYPE_SEARCH_USER = "sort_type_search_user";
    public static final String SORT_TYPE_POST_COMMENT = "sort_type_post_comment";

    public static final String POST_LAYOUT_SHARED_PREFERENCES_FILE = "ml.docilealligator.infinityforreddit.post_layout";
    public static final String POST_LAYOUT_FRONT_PAGE_POST = "post_layout_best_post";
    public static final String POST_LAYOUT_SUBREDDIT_POST_BASE = "post_layout_subreddit_post_";
    public static final String POST_LAYOUT_MULTI_REDDIT_POST_BASE = "post_layout_multi_reddit_post_";
    public static final String POST_LAYOUT_USER_POST_BASE = "post_layout_user_post_";
    public static final String POST_LAYOUT_SEARCH_POST = "post_layout_search_post";
    public static final int POST_LAYOUT_CARD = 0;
    public static final int POST_LAYOUT_COMPACT = 1;

    public static final String FRONT_PAGE_SCROLLED_POSITION_SHARED_PREFERENCES_FILE = "ml.docilealligator.infinityforreddit.front_page_scrolled_position";
    public static final String FRONT_PAGE_SCROLLED_POSITION_FRONT_PAGE_BASE = "_front_page";
    public static final String FRONT_PAGE_SCROLLED_POSITION_ANONYMOUS = ".anonymous";

    public static final String PULL_NOTIFICATION_TIME = "pull_notification_time";
    public static final String SHOW_ELAPSED_TIME_KEY = "show_elapsed_time";
    public static final String TIME_FORMAT_KEY = "time_format";
    public static final String TIME_FORMAT_DEFAULT_VALUE = "MMM d, yyyy, HH:mm";
    public static final String DEFAULT_POST_LAYOUT_KEY = "default_post_layout";
    public static final String SHOW_DIVIDER_IN_COMPACT_LAYOUT = "show_divider_in_compact_layout";
    public static final String SHOW_THUMBNAIL_ON_THE_LEFT_IN_COMPACT_LAYOUT = "show_thumbnail_on_the_left_in_compact_layout";
    public static final String NUMBER_OF_COLUMNS_IN_POST_FEED_PORTRAIT = "number_of_columns_in_post_feed_portrait";
    public static final String NUMBER_OF_COLUMNS_IN_POST_FEED_LANDSCAPE = "number_of_columns_in_post_feed_landscape";
    public static final String SWIPE_RIGHT_TO_GO_BACK = "swipe_to_go_back_from_post_detail";
    public static final String VOLUME_KEYS_NAVIGATE_COMMENTS = "volume_keys_navigate_comments";
    public static final String VOLUME_KEYS_NAVIGATE_POSTS = "volume_keys_navigate_posts";
    public static final String MUTE_VIDEO = "mute_video";
    public static final String OPEN_LINK_IN_APP = "open_link_in_app";
    public static final String VIDEO_AUTOPLAY = "video_autoplay";
    public static final String VIDEO_AUTOPLAY_VALUE_ALWAYS_ON = "2";
    public static final String VIDEO_AUTOPLAY_VALUE_ON_WIFI = "1";
    public static final String VIDEO_AUTOPLAY_VALUE_NEVER = "0";
    public static final String MUTE_AUTOPLAYING_VIDEOS = "mute_autoplaying_videos";
    public static final String AUTOPLAY_NSFW_VIDEOS = "autoplay_nsfw_videos";
    public static final String AUTOMATICALLY_TRY_REDGIFS = "automatically_try_redgifs";
    public static final String LOCK_JUMP_TO_NEXT_TOP_LEVEL_COMMENT_BUTTON = "lock_jump_to_next_top_level_comment_button";
    public static final String SWAP_TAP_AND_LONG_COMMENTS = "swap_tap_and_long_in_comments";
    public static final String SWIPE_UP_TO_HIDE_JUMP_TO_NEXT_TOP_LEVEL_COMMENT_BUTTON = "swipe_up_to_hide_jump_to_next_top_level_comments_button";
    public static final String SHOW_TOP_LEVEL_COMMENTS_FIRST = "show_top_level_comments_first";
    public static final String CONFIRM_TO_EXIT = "confirm_to_exit";
    public static final String LOCK_BOTTOM_APP_BAR = "lock_bottom_app_bar";
    public static final String COMMENT_TOOLBAR_HIDDEN = "comment_toolbar_hidden";
    public static final String COMMENT_TOOLBAR_HIDE_ON_CLICK = "comment_toolbar_hide_on_click";
    public static final String FULLY_COLLAPSE_COMMENT = "fully_collapse_comment";
    public static final String SHOW_COMMENT_DIVIDER = "show_comment_divider";
    public static final String SHOW_ABSOLUTE_NUMBER_OF_VOTES = "show_absolute_number_of_votes";
    public static final String CUSTOMIZE_LIGHT_THEME = "customize_light_theme";
    public static final String CUSTOMIZE_DARK_THEME = "customize_dark_theme";
    public static final String CUSTOMIZE_AMOLED_THEME = "customize_amoled_theme";
    public static final String MANAGE_THEMES = "manage_themes";
    public static final String DELETE_ALL_SUBREDDITS_DATA_IN_DATABASE = "delete_all_subreddits_data_in_database";
    public static final String DELETE_ALL_USERS_DATA_IN_DATABASE = "delete_all_users_data_in_database";
    public static final String DELETE_ALL_SORT_TYPE_DATA_IN_DATABASE = "delete_all_sort_type_data_in_database";
    public static final String DELETE_ALL_POST_LAYOUT_DATA_IN_DATABASE = "delete_all_post_layout_data_in_database";
    public static final String DELETE_ALL_THEMES_IN_DATABASE = "delete_all_themes_in_database";
    public static final String DELETE_FRONT_PAGE_SCROLLED_POSITIONS_IN_DATABASE = "delete_front_page_scrolled_positions_in_database";
    public static final String DELETE_ALL_LEGACY_SETTINGS = "delete_all_legacy_settings";
    public static final String RESET_ALL_SETTINGS = "reset_all_settings";
    public static final String IMAGE_DOWNLOAD_LOCATION = "image_download_location";
    public static final String GIF_DOWNLOAD_LOCATION = "gif_download_location";
    public static final String VIDEO_DOWNLOAD_LOCATION = "video_download_location";
    public static final String SEPARATE_FOLDER_FOR_EACH_SUBREDDIT = "separate_folder_for_each_subreddit";
    public static final String VIBRATE_WHEN_ACTION_TRIGGERED = "vibrate_when_action_triggered";
    public static final String DISABLE_SWIPING_BETWEEN_TABS = "disable_swiping_between_tabs";

    public static final String MAIN_PAGE_TABS_SHARED_PREFERENCES_FILE = "ml.docilealligator.infinityforreddit.main_page_tabs";
    public static final String MAIN_PAGE_TAB_1_TITLE = "_main_page_tab_1_title";
    public static final String MAIN_PAGE_TAB_2_TITLE = "_main_page_tab_2_title";
    public static final String MAIN_PAGE_TAB_3_TITLE = "_main_page_tab_3_title";
    public static final String MAIN_PAGE_TAB_1_POST_TYPE = "_main_page_tab_1_post_type";
    public static final String MAIN_PAGE_TAB_2_POST_TYPE = "_main_page_tab_2_post_type";
    public static final String MAIN_PAGE_TAB_3_POST_TYPE = "_main_page_tab_3_post_type";
    public static final String MAIN_PAGE_TAB_1_NAME = "_main_page_tab_1_name";
    public static final String MAIN_PAGE_TAB_2_NAME = "_main_page_tab_2_name";
    public static final String MAIN_PAGE_TAB_3_NAME = "_main_page_tab_3_name";
    public static final int MAIN_PAGE_TAB_POST_TYPE_HOME = 0;
    public static final int MAIN_PAGE_TAB_POST_TYPE_POPULAR = 1;
    public static final int MAIN_PAGE_TAB_POST_TYPE_ALL = 2;
    public static final int MAIN_PAGE_TAB_POST_TYPE_SUBREDDIT = 3;
    public static final int MAIN_PAGE_TAB_POST_TYPE_MULTIREDDIT = 4;
    public static final int MAIN_PAGE_TAB_POST_TYPE_USER = 5;

    public static final String START_AUTOPLAY_VISIBLE_AREA_OFFSET_PORTRAIT = "start_autoplay_visible_area_offset_portrait";
    public static final String START_AUTOPLAY_VISIBLE_AREA_OFFSET_LANDSCAPE = "start_autoplay_visible_area_offset_landscape";
    public static final String MUTE_NSFW_VIDEO = "mute_nsfw_video";
    public static final String VIDEO_PLAYER_IGNORE_NAV_BAR = "video_player_ignore_nav_bar";
    public static final String SAVE_FRONT_PAGE_SCROLLED_POSITION = "save_front_page_scrolled_position";

    //Legacy Settings
    public static final String MAIN_PAGE_TAB_1_TITLE_LEGACY = "main_page_tab_1_title";
    public static final String MAIN_PAGE_TAB_2_TITLE_LEGACY = "main_page_tab_2_title";
    public static final String MAIN_PAGE_TAB_3_TITLE_LEGACY = "main_page_tab_3_title";
    public static final String MAIN_PAGE_TAB_1_POST_TYPE_LEGACY = "main_page_tab_1_post_type";
    public static final String MAIN_PAGE_TAB_2_POST_TYPE_LEGACY = "main_page_tab_2_post_type";
    public static final String MAIN_PAGE_TAB_3_POST_TYPE_LEGACY = "main_page_tab_3_post_type";
    public static final String MAIN_PAGE_TAB_1_NAME_LEGACY = "main_page_tab_1_name";
    public static final String MAIN_PAGE_TAB_2_NAME_LEGACY = "main_page_tab_2_name";
    public static final String MAIN_PAGE_TAB_3_NAME_LEGACY = "main_page_tab_3_name";

    public static final String SORT_TYPE_ALL_POST_LEGACY = "sort_type_all_post";
    public static final String SORT_TIME_ALL_POST_LEGACY = "sort_time_all_post";
    public static final String SORT_TYPE_POPULAR_POST_LEGACY = "sort_type_popular_post";
    public static final String SORT_TIME_POPULAR_POST_LEGACY = "sort_time_popular_post";

    public static final String POST_LAYOUT_POPULAR_POST_LEGACY = "post_layout_popular_post";
    public static final String POST_LAYOUT_ALL_POST_LEGACY = "post_layout_all_post";
}
