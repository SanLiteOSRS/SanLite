import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import netscape.javascript.JSObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi {
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "[Lep;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("sw")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("vw")
	@ObfuscatedGetter(
		intValue = -461355959
	)
	public static int field801;
	@ObfuscatedName("uj")
	@ObfuscatedGetter(
		intValue = 304920807
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = 658238419
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("ws")
	static int[] field806;
	@ObfuscatedName("sx")
	@ObfuscatedGetter(
		intValue = 1298103577
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("wt")
	static int[] field785;
	@ObfuscatedName("wd")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	static final ApproximateRouteStrategy field805;
	@ObfuscatedName("su")
	@ObfuscatedGetter(
		intValue = -801254203
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("ts")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("th")
	static boolean field772;
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		intValue = 421577261
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "[Lfn;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("vg")
	@ObfuscatedSignature(
		descriptor = "[Lmz;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = 1282025529
	)
	static int field792;
	@ObfuscatedName("ur")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = 1524201085
	)
	static int field793;
	@ObfuscatedName("vj")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("vt")
	@ObfuscatedGetter(
		intValue = -1259057673
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("tw")
	@ObfuscatedGetter(
		intValue = -604972557
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("to")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("tj")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("tf")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = 1125738065
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tr")
	@ObfuscatedSignature(
		descriptor = "[Lak;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("vh")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ta")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("vp")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("ud")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("ro")
	@ObfuscatedGetter(
		longValue = -7145298952818642997L
	)
	static long field679;
	@ObfuscatedName("sd")
	@ObfuscatedGetter(
		intValue = -1881747885
	)
	static int field619;
	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("archive5")
	static class384 archive5;
	@ObfuscatedName("ut")
	static boolean[] field773;
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = -117040113
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("sl")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("sv")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("ul")
	static short field778;
	@ObfuscatedName("uz")
	static short field550;
	@ObfuscatedName("uh")
	static short field784;
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "[Lrx;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("uy")
	static short field510;
	@ObfuscatedName("up")
	static short field783;
	@ObfuscatedName("uu")
	@ObfuscatedGetter(
		intValue = -2061488415
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("ua")
	static short field690;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = -509639003
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vv")
	@ObfuscatedGetter(
		intValue = 1660289605
	)
	static int field804;
	@ObfuscatedName("uq")
	@ObfuscatedGetter(
		intValue = -897458695
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("ue")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("ug")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("ux")
	static int[] field775;
	@ObfuscatedName("uo")
	static int[] field803;
	@ObfuscatedName("un")
	static int[] field617;
	@ObfuscatedName("uv")
	static int[] field776;
	@ObfuscatedName("ve")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("vr")
	@ObfuscatedGetter(
		intValue = -2006147263
	)
	static int field800;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lgw;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("bh")
	static boolean field674;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1786376969
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -478869749
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 459972555
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bc")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bl")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 905296419
	)
	static int field511;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 505322101
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1427734597
	)
	static int field698;
	@ObfuscatedName("bn")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -880846561
	)
	public static int field515;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 849546905
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dn")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1399173809
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		longValue = -8630714732823869625L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -1006687007
	)
	static int field520;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 89733947
	)
	static int field552;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		longValue = 421294918074731913L
	)
	static long field522;
	@ObfuscatedName("ds")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -1446195321
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 1689383815
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 53054479
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 689063901
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1525015337
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1084314735
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1831543250
	)
	static int field530;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 861413925
	)
	static int field531;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 382549312
	)
	static int field626;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -1081196793
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = -419480225
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = -877919317
	)
	static int field537;
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = -321791745
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -83131829
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = 924613849
	)
	static int field648;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = 689653777
	)
	static int field541;
	@ObfuscatedName("ft")
	@ObfuscatedGetter(
		intValue = 1039768403
	)
	static int field527;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	static class132 field540;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	static class471 field640;
	@ObfuscatedName("gh")
	static final String field554;
	@ObfuscatedName("gr")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("gg")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "[Lcg;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = 1742658927
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("hx")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -337463323
	)
	static int field564;
	@ObfuscatedName("he")
	static int[] field565;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("hf")
	@ObfuscatedGetter(
		intValue = 914543801
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("hr")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("hg")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = -1576974551
	)
	static int field601;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = -674553043
	)
	static int field755;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = -1304022513
	)
	static int field786;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = 240003967
	)
	static int field574;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 1301428805
	)
	static int field658;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("iy")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("ia")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("im")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("in")
	static final int[] field579;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = -1594730517
	)
	static int field563;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = -1593842591
	)
	static int field719;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -1767197721
	)
	static int field651;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = 660716575
	)
	static int field532;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = 1934461207
	)
	static int field584;
	@ObfuscatedName("jt")
	static boolean field689;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = -606509143
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = 1701036907
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = -1633873355
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = -110318655
	)
	static int field589;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = 1894306029
	)
	static int field663;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = -1822435885
	)
	static int field591;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = -606441225
	)
	static int field592;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 1951368499
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = 1891106199
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = -1280049195
	)
	static int field638;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = 205514029
	)
	static int field596;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -590989363
	)
	static int field597;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = -904534999
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = 807828661
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ke")
	@ObfuscatedGetter(
		intValue = 230448641
	)
	public static int field789;
	@ObfuscatedName("kv")
	static boolean field529;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = -2097151229
	)
	static int field807;
	@ObfuscatedName("ky")
	static boolean field603;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = -64075329
	)
	static int field604;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = -1080955203
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = -251743249
	)
	static int field606;
	@ObfuscatedName("ku")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("kt")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ko")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("ki")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("kz")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("kd")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("kf")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("kq")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("kk")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = 1676158973
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = -1444752263
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = -1136866163
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = -1284637171
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = -1923066637
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = -1441414620
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = -2144438923
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("lu")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = -712957839
	)
	static int field624;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = -1814256945
	)
	static int field625;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = -2075416401
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 1800438489
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = 778021723
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 1981845999
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("le")
	static boolean field630;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = 1731996675
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = -279617941
	)
	static int field691;
	@ObfuscatedName("ln")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "[Lcj;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = -653603109
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -1216879407
	)
	static int field692;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		longValue = -6907940148224560471L
	)
	static long field637;
	@ObfuscatedName("mn")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = -1173896191
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = 832020011
	)
	static int field779;
	@ObfuscatedName("me")
	static int[] field641;
	@ObfuscatedName("mb")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("mr")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("mi")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("md")
	static int[] field645;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = 444610161
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "[[[Lmq;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("mm")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("mj")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("my")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("mp")
	static boolean field598;
	@ObfuscatedName("mc")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = 2013462879
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("nv")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("nu")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("ny")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("np")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("ne")
	static int[] field661;
	@ObfuscatedName("na")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("nl")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("nk")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("nf")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("nh")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("nr")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("nd")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = -749158239
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = 1174058235
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = 165156689
	)
	static int field553;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = -808600101
	)
	static int field521;
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = -1639704995
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("nc")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = -825825707
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = -264024497
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("os")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("od")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = -1495174825
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = 341482921
	)
	static int field791;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = 905492675
	)
	static int field683;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = 812943257
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = 1322109871
	)
	static int field685;
	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = 809546495
	)
	static int field629;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = -761634595
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = 643587025
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = -1825146679
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("oc")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = 1107452813
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 1093404483
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("pa")
	static boolean field745;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = 1291525931
	)
	static int field699;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = -1906364423
	)
	static int field613;
	@ObfuscatedName("pu")
	static boolean field701;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = -287645029
	)
	static int field519;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = -1757770101
	)
	static int field703;
	@ObfuscatedName("px")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = 673017441
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pl")
	static int[] field706;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = -535441981
	)
	static int field707;
	@ObfuscatedName("pk")
	static int[] field708;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = 1841099769
	)
	static int field709;
	@ObfuscatedName("pc")
	static int[] field636;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = 2040914153
	)
	static int field711;
	@ObfuscatedName("pz")
	static int[] field712;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = -2143156255
	)
	static int field713;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = 756647275
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = -1828686225
	)
	static int field715;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = -1970316617
	)
	static int field610;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = 166181489
	)
	static int field717;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = 399726531
	)
	static int field513;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = 1891329815
	)
	static int field777;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = -252352091
	)
	static int field720;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = -1748768741
	)
	static int field721;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = -142840217
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	static class484 field505;
	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	static NodeDeque field725;
	@ObfuscatedName("qg")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	static NodeDeque field726;
	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	static NodeDeque field727;
	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = 1685586111
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = -582413719
	)
	static int field808;
	@ObfuscatedName("qw")
	static boolean[] field731;
	@ObfuscatedName("qe")
	static boolean[] field732;
	@ObfuscatedName("qx")
	static boolean[] field733;
	@ObfuscatedName("qy")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("qz")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("rf")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("rq")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = -544956459
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("rh")
	@ObfuscatedGetter(
		longValue = -6655508283216562127L
	)
	static long field739;
	@ObfuscatedName("rl")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("ra")
	static int[] field741;
	@ObfuscatedName("rx")
	@ObfuscatedGetter(
		intValue = 1034069959
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("rs")
	@ObfuscatedGetter(
		intValue = -1887729789
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("rg")
	static String field744;
	@ObfuscatedName("rt")
	static long[] field523;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = 1059950709
	)
	static int field746;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	public static class201 field747;
	@ObfuscatedName("re")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	static class199 field572;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = -400698351
	)
	static int field710;
	@ObfuscatedName("rb")
	static int[] field774;
	@ObfuscatedName("rw")
	static int[] field751;
	@ObfuscatedName("fj")
	String field781;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	class14 field546;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	class19 field547;
	@ObfuscatedName("go")
	@Export("otlTokenRequester")
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("gj")
	Future field549;
	@ObfuscatedName("gp")
	boolean field590;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	class19 field654;
	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field666;
	@ObfuscatedName("gq")
	@Export("otlTokenRequest")
	Future otlTokenRequest;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	Buffer field557;
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	class7 field573;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		longValue = -3708619133328893535L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field674 = true; // L: 155
		worldId = 1; // L: 156
		worldProperties = 0; // L: 157
		gameBuild = 0; // L: 159
		isMembersWorld = false; // L: 162
		isLowDetail = false; // L: 163
		field511 = -1; // L: 168
		clientType = -1; // L: 169
		field698 = -1; // L: 170
		onMobile = false; // L: 171
		field515 = 210; // L: 172
		gameState = 0; // L: 184
		isLoading = true; // L: 208
		cycle = 0; // L: 209
		mouseLastLastPressedTimeMillis = 1L; // L: 210
		field520 = -1; // L: 212
		field552 = -1; // L: 213
		field522 = -1L; // L: 214
		hadFocus = true; // L: 215
		rebootTimer = 0; // L: 216
		hintArrowType = 0; // L: 217
		hintArrowNpcIndex = 0; // L: 218
		hintArrowPlayerIndex = 0; // L: 219
		hintArrowX = 0; // L: 220
		hintArrowY = 0; // L: 221
		field530 = 0; // L: 222
		field531 = 0; // L: 223
		field626 = 0; // L: 224
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 226
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 227
		titleLoadingStage = 0; // L: 238
		js5ConnectState = 0; // L: 241
		field537 = 0; // L: 242
		js5Errors = 0; // L: 265
		loginState = 0; // L: 267
		field648 = 0; // L: 268
		field541 = 0; // L: 269
		field527 = 0; // L: 270
		field540 = class132.field1625; // L: 271
		field640 = class471.field4976; // L: 272
		int var1 = "com_jagex_auth_desktop_osrs:public".length(); // L: 297
		byte[] var2 = new byte[var1]; // L: 298

		for (int var3 = 0; var3 < var1; ++var3) { // L: 299
			char var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3); // L: 300
			if (var4 > 127) { // L: 301
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 302
			}
		}

		field554 = EnumComposition.method3650(var2); // L: 306
		Login_isUsernameRemembered = false; // L: 315
		secureRandomFuture = new SecureRandomFuture(); // L: 316
		randomDatData = null; // L: 322
		npcs = new NPC[65536]; // L: 326
		npcCount = 0; // L: 327
		npcIndices = new int[65536]; // L: 328
		field564 = 0; // L: 329
		field565 = new int[250]; // L: 330
		packetWriter = new PacketWriter(); // L: 333
		logoutTimer = 0; // L: 335
		hadNetworkError = false; // L: 336
		timer = new Timer(); // L: 337
		fontsMap = new HashMap(); // L: 343
		field601 = 0; // L: 350
		field755 = 1; // L: 351
		field786 = 0; // L: 352
		field574 = 1; // L: 353
		field658 = 0; // L: 354
		collisionMaps = new CollisionMap[4]; // L: 362
		isInInstance = false; // L: 363
		instanceChunkTemplates = new int[4][13][13]; // L: 364
		field579 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 365
		field563 = 0; // L: 368
		field719 = 2301979; // L: 380
		field651 = 5063219; // L: 381
		field532 = 3353893; // L: 382
		field584 = 7759444; // L: 383
		field689 = false; // L: 384
		alternativeScrollbarWidth = 0; // L: 385
		camAngleX = 128; // L: 393
		camAngleY = 0; // L: 394
		field589 = 0; // L: 395
		field663 = 0; // L: 396
		field591 = 0; // L: 397
		field592 = 0; // L: 398
		oculusOrbState = 0; // L: 399
		camFollowHeight = 50; // L: 400
		field638 = 0; // L: 404
		field596 = 0; // L: 405
		field597 = 0; // L: 406
		oculusOrbNormalSpeed = 12; // L: 408
		oculusOrbSlowedSpeed = 6; // L: 409
		field789 = 0; // L: 410
		field529 = false; // L: 411
		field807 = 0; // L: 412
		field603 = false; // L: 413
		field604 = 0; // L: 414
		overheadTextCount = 0; // L: 415
		field606 = 50; // L: 416
		overheadTextXs = new int[field606]; // L: 417
		overheadTextYs = new int[field606]; // L: 418
		overheadTextAscents = new int[field606]; // L: 419
		overheadTextXOffsets = new int[field606]; // L: 420
		overheadTextColors = new int[field606]; // L: 421
		overheadTextEffects = new int[field606]; // L: 422
		overheadTextCyclesRemaining = new int[field606]; // L: 423
		overheadText = new String[field606]; // L: 424
		tileLastDrawnActor = new int[104][104]; // L: 425
		viewportDrawCount = 0; // L: 426
		viewportTempX = -1; // L: 427
		viewportTempY = -1; // L: 428
		mouseCrossX = 0; // L: 429
		mouseCrossY = 0; // L: 430
		mouseCrossState = 0; // L: 431
		mouseCrossColor = 0; // L: 432
		showMouseCross = true; // L: 433
		field624 = 0; // L: 435
		field625 = 0; // L: 436
		dragItemSlotSource = 0; // L: 439
		draggedWidgetX = 0; // L: 440
		draggedWidgetY = 0; // L: 441
		dragItemSlotDestination = 0; // L: 442
		field630 = false; // L: 443
		itemDragDuration = 0; // L: 444
		field691 = 0; // L: 445
		showLoadingMessages = true; // L: 447
		players = new Player[2048]; // L: 449
		localPlayerIndex = -1; // L: 451
		field692 = 0; // L: 452
		field637 = -1L; // L: 453
		renderSelf = true; // L: 455
		drawPlayerNames = 0; // L: 460
		field779 = 0; // L: 461
		field641 = new int[1000]; // L: 462
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 464
		playerMenuActions = new String[8]; // L: 465
		playerOptionsPriorities = new boolean[8]; // L: 466
		field645 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 467
		combatTargetPlayerIndex = -1; // L: 468
		groundItems = new NodeDeque[4][104][104]; // L: 469
		pendingSpawns = new NodeDeque(); // L: 470
		projectiles = new NodeDeque(); // L: 471
		graphicsObjects = new NodeDeque(); // L: 472
		currentLevels = new int[25]; // L: 473
		levels = new int[25]; // L: 474
		experience = new int[25]; // L: 475
		field598 = false; // L: 476
		isMenuOpen = false; // L: 477
		menuOptionsCount = 0; // L: 483
		menuArguments1 = new int[500]; // L: 484
		menuArguments2 = new int[500]; // L: 485
		menuOpcodes = new int[500]; // L: 486
		menuIdentifiers = new int[500]; // L: 487
		field661 = new int[500]; // L: 488
		menuActions = new String[500]; // L: 489
		menuTargets = new String[500]; // L: 490
		menuShiftClick = new boolean[500]; // L: 491
		followerOpsLowPriority = false; // L: 492
		shiftClickDrop = false; // L: 494
		tapToDrop = false; // L: 495
		showMouseOverText = true; // L: 496
		viewportX = -1; // L: 497
		viewportY = -1; // L: 498
		field553 = 0; // L: 502
		field521 = 50; // L: 503
		isItemSelected = 0; // L: 504
		selectedItemName = null; // L: 508
		isSpellSelected = false; // L: 509
		selectedSpellChildIndex = -1; // L: 511
		selectedSpellItemId = -1; // L: 512
		selectedSpellActionName = null; // L: 514
		selectedSpellName = null; // L: 515
		rootInterface = -1; // L: 516
		interfaceParents = new NodeHashTable(8); // L: 517
		field791 = 0; // L: 522
		field683 = -1; // L: 523
		chatEffects = 0; // L: 524
		field685 = 0; // L: 525
		meslayerContinueWidget = null; // L: 526
		field629 = 0; // L: 527
		weight = 0; // L: 528
		staffModLevel = 0; // L: 529
		followerIndex = -1; // L: 530
		playerMod = false; // L: 531
		viewportWidget = null; // L: 532
		clickedWidget = null; // L: 533
		clickedWidgetParent = null; // L: 534
		widgetClickX = 0; // L: 535
		widgetClickY = 0; // L: 536
		draggedOnWidget = null; // L: 537
		field745 = false; // L: 538
		field699 = -1; // L: 539
		field613 = -1; // L: 540
		field701 = false; // L: 541
		field519 = -1; // L: 542
		field703 = -1; // L: 543
		isDraggingWidget = false; // L: 544
		cycleCntr = 1; // L: 549
		field706 = new int[32]; // L: 552
		field707 = 0; // L: 553
		field708 = new int[32]; // L: 554
		field709 = 0; // L: 555
		field636 = new int[32]; // L: 556
		field711 = 0; // L: 557
		field712 = new int[32]; // L: 558
		field713 = 0; // L: 559
		chatCycle = 0; // L: 560
		field715 = 0; // L: 561
		field610 = 0; // L: 562
		field717 = 0; // L: 563
		field513 = 0; // L: 564
		field777 = 0; // L: 565
		field720 = 0; // L: 566
		field721 = 0; // L: 567
		mouseWheelRotation = 0; // L: 573
		field505 = new class484(); // L: 574
		scriptEvents = new NodeDeque(); // L: 575
		field725 = new NodeDeque(); // L: 576
		field726 = new NodeDeque(); // L: 577
		field727 = new NodeDeque(); // L: 578
		widgetFlags = new NodeHashTable(512); // L: 579
		rootWidgetCount = 0; // L: 581
		field808 = -2; // L: 582
		field731 = new boolean[100]; // L: 583
		field732 = new boolean[100]; // L: 584
		field733 = new boolean[100]; // L: 585
		rootWidgetXs = new int[100]; // L: 586
		rootWidgetYs = new int[100]; // L: 587
		rootWidgetWidths = new int[100]; // L: 588
		rootWidgetHeights = new int[100]; // L: 589
		gameDrawingMode = 0; // L: 590
		field739 = 0L; // L: 591
		isResizable = true; // L: 592
		field741 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 599
		publicChatMode = 0; // L: 600
		tradeChatMode = 0; // L: 602
		field744 = ""; // L: 603
		field523 = new long[100]; // L: 605
		field746 = 0; // L: 606
		field747 = new class201(); // L: 607
		field572 = new class199(); // L: 608
		field710 = 0; // L: 610
		field774 = new int[128]; // L: 611
		field751 = new int[128]; // L: 612
		field679 = -1L; // L: 613
		currentClanSettings = new ClanSettings[4]; // L: 617
		currentClanChannels = new ClanChannel[4]; // L: 619
		field619 = -1; // L: 621
		mapIconCount = 0; // L: 622
		mapIconXs = new int[1000]; // L: 623
		mapIconYs = new int[1000]; // L: 624
		mapIcons = new SpritePixels[1000]; // L: 625
		destinationX = 0; // L: 626
		destinationY = 0; // L: 627
		minimapState = 0; // L: 634
		currentTrackGroupId = -1; // L: 635
		playingJingle = false; // L: 636
		soundEffectCount = 0; // L: 642
		soundEffectIds = new int[50]; // L: 643
		queuedSoundEffectLoops = new int[50]; // L: 644
		queuedSoundEffectDelays = new int[50]; // L: 645
		soundLocations = new int[50]; // L: 646
		soundEffects = new SoundEffect[50]; // L: 647
		isCameraLocked = false; // L: 649
		field772 = false; // L: 660
		field773 = new boolean[5]; // L: 668
		field803 = new int[5]; // L: 669
		field775 = new int[5]; // L: 670
		field776 = new int[5]; // L: 671
		field617 = new int[5]; // L: 672
		field778 = 256; // L: 673
		field550 = 205; // L: 674
		zoomHeight = 256; // L: 675
		zoomWidth = 320; // L: 676
		field690 = 1; // L: 677
		field783 = 32767; // L: 678
		field784 = 1; // L: 679
		field510 = 32767; // L: 680
		viewportOffsetX = 0; // L: 681
		viewportOffsetY = 0; // L: 682
		viewportWidth = 0; // L: 683
		viewportHeight = 0; // L: 684
		viewportZoom = 0; // L: 685
		playerAppearance = new PlayerComposition(); // L: 687
		field792 = -1; // L: 688
		field793 = -1; // L: 689
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 691
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 693
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 696
		archive5 = new class384(8, class382.field4481); // L: 698
		Widget_cachedModels = new EvictingDualNodeHashTable(64); // L: 699
		Widget_cachedFonts = new EvictingDualNodeHashTable(64); // L: 700
		field800 = -1; // L: 703
		field801 = -1; // L: 709
		archiveLoaders = new ArrayList(10); // L: 710
		archiveLoadersDone = 0; // L: 711
		field804 = 0; // L: 712
		field805 = new ApproximateRouteStrategy(); // L: 722
		field806 = new int[50]; // L: 723
		field785 = new int[50]; // L: 724
	}

	public Client() {
		this.field590 = false; // L: 288
		this.accountHash = -1L;
	} // L: 321

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-101"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field739 = Message.method1197() + 500L; // L: 4288
		this.resizeJS(); // L: 4289
		if (rootInterface != -1) { // L: 4290
			this.resizeRoot(true);
		}

	} // L: 4291

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000}; // L: 1013
		int[] var2 = new int[]{1000, 100, 500}; // L: 1014
		if (var1 != null && var2 != null) { // L: 1016
			Frames.ByteArrayPool_alternativeSizes = var1; // L: 1029
			ModelData0.ByteArrayPool_altSizeArrayCounts = new int[var1.length]; // L: 1030
			SceneTilePaint.ByteArrayPool_arrays = new byte[var1.length][][]; // L: 1031

			for (int var3 = 0; var3 < Frames.ByteArrayPool_alternativeSizes.length; ++var3) { // L: 1032
				SceneTilePaint.ByteArrayPool_arrays[var3] = new byte[var2[var3]][]; // L: 1033
				ByteArrayPool.field4446.add(var1[var3]); // L: 1034
			}

			Collections.sort(ByteArrayPool.field4446); // L: 1036
		} else {
			Frames.ByteArrayPool_alternativeSizes = null; // L: 1017
			ModelData0.ByteArrayPool_altSizeArrayCounts = null; // L: 1018
			SceneTilePaint.ByteArrayPool_arrays = null; // L: 1019
			ByteArrayPool.field4446.clear(); // L: 1021
			ByteArrayPool.field4446.add(100); // L: 1022
			ByteArrayPool.field4446.add(5000); // L: 1023
			ByteArrayPool.field4446.add(10000); // L: 1024
			ByteArrayPool.field4446.add(30000); // L: 1025
		}

		ClanChannel.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 1038
		class137.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 1039
		class31.currentPort = ClanChannel.worldPort; // L: 1040
		class86.field1104 = class304.field3516; // L: 1041
		TriBool.field4548 = class304.field3515; // L: 1042
		class185.field2017 = class304.field3521; // L: 1043
		Varps.field3445 = class304.field3517; // L: 1044
		TaskHandler.urlRequester = new class109(this.field590, 210); // L: 1045
		this.setUpKeyboard(); // L: 1046
		this.method539(); // L: 1047
		class86.mouseWheel = this.mouseWheel(); // L: 1048
		this.method501(field572, 0); // L: 1049
		this.method501(field747, 1); // L: 1050
		WorldMapArea.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1051
		StructComposition.clientPreferences = class319.method6375(); // L: 1052
		this.setUpClipboard(); // L: 1053
		String var4 = WallObject.field2787; // L: 1055
		class32.field182 = this; // L: 1057
		if (var4 != null) { // L: 1058
			class32.field183 = var4;
		}

		class101.setWindowedMode(StructComposition.clientPreferences.method2434()); // L: 1060
		DefaultsGroup.friendSystem = new FriendSystem(SecureRandomFuture.loginType); // L: 1061
		this.field546 = new class14("tokenRequest", 1, 1); // L: 1062
	} // L: 1063

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-22"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 1067
		this.doCycleJs5(); // L: 1068

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 1072
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 1073
			} // L: 1074

			if (var1 == null) { // L: 1075
				Occluder.method4627(); // L: 1079
				playPcmPlayers(); // L: 1080
				field747.method4103(); // L: 1081
				this.method500(); // L: 1082
				synchronized(MouseHandler.MouseHandler_instance) { // L: 1084
					MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 1085
					MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 1086
					MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 1087
					MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 1088
					MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 1089
					MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 1090
					MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 1091
					MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 1092
					MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 1093
				} // L: 1094

				if (class86.mouseWheel != null) { // L: 1096
					int var5 = class86.mouseWheel.useRotation(); // L: 1097
					mouseWheelRotation = var5; // L: 1098
				}

				if (gameState == 0) { // L: 1100
					Tiles.load(); // L: 1101
					KeyHandler.method430(); // L: 1102
				} else if (gameState == 5) { // L: 1104
					class175.loginScreen(this, AbstractWorldMapData.fontPlain12); // L: 1105
					Tiles.load(); // L: 1106
					KeyHandler.method430(); // L: 1107
				} else if (gameState != 10 && gameState != 11) { // L: 1109
					if (gameState == 20) { // L: 1110
						class175.loginScreen(this, AbstractWorldMapData.fontPlain12); // L: 1111
						this.doCycleLoggedOut(); // L: 1112
					} else if (gameState == 50) { // L: 1114
						class175.loginScreen(this, AbstractWorldMapData.fontPlain12); // L: 1115
						this.doCycleLoggedOut(); // L: 1116
					} else if (gameState == 25) { // L: 1118
						GameEngine.method667();
					}
				} else {
					class175.loginScreen(this, AbstractWorldMapData.fontPlain12);
				}

				if (gameState == 30) { // L: 1119
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) { // L: 1120
					this.doCycleLoggedOut();
				}

				return; // L: 1121
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false); // L: 1076
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "920051106"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = class37.method701(); // L: 1125
		if (var2 && playingJingle && TileItem.pcmPlayer0 != null) { // L: 1126 1127
			TileItem.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field739 && Message.method1197() > field739) { // L: 1129 1130
			class101.setWindowedMode(Message.getWindowedMode()); // L: 1131
		}

		int var3;
		if (var1) { // L: 1134
			for (var3 = 0; var3 < 100; ++var3) { // L: 1135
				field731[var3] = true;
			}
		}

		if (gameState == 0) { // L: 1137
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1138
			class199.drawTitle(class146.fontBold12, class151.fontPlain11, AbstractWorldMapData.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1139
			if (gameState == 20) { // L: 1140
				class199.drawTitle(class146.fontBold12, class151.fontPlain11, AbstractWorldMapData.fontPlain12);
			} else if (gameState == 50) { // L: 1141
				class199.drawTitle(class146.fontBold12, class151.fontPlain11, AbstractWorldMapData.fontPlain12);
			} else if (gameState == 25) { // L: 1142
				if (field658 == 1) { // L: 1143
					if (field601 > field755) { // L: 1144
						field755 = field601;
					}

					var3 = (field755 * 50 - field601 * 50) / field755; // L: 1145
					SoundSystem.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1146
				} else if (field658 == 2) { // L: 1148
					if (field786 > field574) { // L: 1149
						field574 = field786;
					}

					var3 = (field574 * 50 - field786 * 50) / field574 + 50; // L: 1150
					SoundSystem.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1151
				} else {
					SoundSystem.drawLoadingMessage("Loading - please wait.", false); // L: 1153
				}
			} else if (gameState == 30) { // L: 1155
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1156
				SoundSystem.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1157
				SoundSystem.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class199.drawTitle(class146.fontBold12, class151.fontPlain11, AbstractWorldMapData.fontPlain12); // L: 1147
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1158
			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1159
				if (field732[var3]) { // L: 1160
					RouteStrategy.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]); // L: 1161
					field732[var3] = false; // L: 1162
				}
			}
		} else if (gameState > 0) { // L: 1166
			RouteStrategy.rasterProvider.drawFull(0, 0); // L: 1167

			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1168
				field732[var3] = false;
			}
		}

	} // L: 1170

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1295386641"
	)
	@Export("kill0")
	protected final void kill0() {
		if (WorldMapArea.varcs.hasUnwrittenChanges()) { // L: 1173
			WorldMapArea.varcs.write();
		}

		if (class271.mouseRecorder != null) { // L: 1174
			class271.mouseRecorder.isRunning = false;
		}

		class271.mouseRecorder = null; // L: 1175
		packetWriter.close(); // L: 1176
		if (MouseHandler.MouseHandler_instance != null) { // L: 1178
			synchronized(MouseHandler.MouseHandler_instance) { // L: 1179
				MouseHandler.MouseHandler_instance = null; // L: 1180
			} // L: 1181
		}

		class86.mouseWheel = null; // L: 1184
		if (TileItem.pcmPlayer0 != null) { // L: 1185
			TileItem.pcmPlayer0.shutdown();
		}

		if (UserComparator8.pcmPlayer1 != null) { // L: 1186
			UserComparator8.pcmPlayer1.shutdown();
		}

		class241.method5186(); // L: 1187
		class182.method3634(); // L: 1188
		if (TaskHandler.urlRequester != null) { // L: 1189
			TaskHandler.urlRequester.close(); // L: 1190
			TaskHandler.urlRequester = null; // L: 1191
		}

		try {
			JagexCache.JagexCache_dat2File.close(); // L: 1195

			for (int var3 = 0; var3 < class145.idxCount; ++var3) { // L: 1196
				JagexCache.JagexCache_idxFiles[var3].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 1197
			JagexCache.JagexCache_randomDat.close(); // L: 1198
		} catch (Exception var5) { // L: 1200
		}

		this.field546.method171(); // L: 1202
	} // L: 1203

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1344730333"
	)
	protected final void vmethod1227() {
	} // L: 731

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "854239934"
	)
	boolean method1230() {
		return class146.field1717 != null && !class146.field1717.trim().isEmpty() && EnumComposition.field2006 != null && !EnumComposition.field2006.trim().isEmpty(); // L: 958
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1394434953"
	)
	@Export("isOtlTokenRequesterInitialized")
	boolean isOtlTokenRequesterInitialized() {
		return this.otlTokenRequester != null; // L: 962
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1380875152"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 966
		var2.put("grant_type", "refresh_token"); // L: 967
		var2.put("scope", "gamesso.token.create"); // L: 968
		var2.put("refresh_token", var1); // L: 969
		URL var3 = new URL(class17.field102 + "shield/oauth/token" + (new class423(var2)).method7925()); // L: 970
		HashMap var4 = new HashMap(); // L: 971
		var4.put("Authorization", "Basic " + field554); // L: 972
		var4.put("Host", (new URL(class17.field102)).getHost()); // L: 973
		var4.put("Accept", class420.field4652.method7905()); // L: 974
		class9 var5 = class9.field43; // L: 975
		RefreshAccessTokenRequester var6 = this.field666; // L: 976
		if (var6 != null) { // L: 977
			this.otlTokenRequest = var6.request(var5.method70(), var3, var4, ""); // L: 978
		} else {
			class10 var7 = new class10(var3, var5, this.field590); // L: 981
			Iterator var8 = var4.entrySet().iterator(); // L: 982

			while (var8.hasNext()) {
				Entry var9 = (Entry)var8.next(); // L: 983
				var7.method86((String)var9.getKey(), (String)var9.getValue()); // L: 985
			}

			this.field654 = this.field546.method167(var7); // L: 988
		}
	} // L: 979 989

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-426259759"
	)
	void method1233(String var1) throws MalformedURLException, IOException {
		URL var2 = new URL(class17.field102 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 992
		HashMap var3 = new HashMap(); // L: 993
		var3.put("Authorization", "Bearer " + var1); // L: 994
		class9 var4 = class9.field33; // L: 995
		OtlTokenRequester var5 = this.otlTokenRequester; // L: 996
		if (var5 != null) { // L: 997
			this.field549 = var5.request(var4.method70(), var2, var3, ""); // L: 998
		} else {
			class10 var6 = new class10(var2, var4, this.field590); // L: 1001
			Iterator var7 = var3.entrySet().iterator(); // L: 1002

			while (var7.hasNext()) {
				Entry var8 = (Entry)var7.next(); // L: 1003
				var6.method86((String)var8.getKey(), (String)var8.getValue()); // L: 1005
			}

			this.field547 = this.field546.method167(var6); // L: 1008
		}
	} // L: 999 1009

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1825291822"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1255
			boolean var1 = DecorativeObject.method4830(); // L: 1256
			if (!var1) { // L: 1257
				this.doCycleJs5Connect();
			}

		}
	} // L: 1258

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-924281456"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1261
			this.error("js5crc"); // L: 1262
			class140.method3102(1000); // L: 1263
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1266
				if (gameState <= 5) { // L: 1267
					this.error("js5io"); // L: 1268
					class140.method3102(1000); // L: 1269
					return; // L: 1270
				}

				field537 = 3000; // L: 1273
				NetCache.NetCache_ioExceptions = 3; // L: 1274
			}

			if (--field537 + 1 <= 0) { // L: 1277
				try {
					if (js5ConnectState == 0) { // L: 1279
						class357.js5SocketTask = class242.taskHandler.newSocketTask(class139.worldHost, class31.currentPort); // L: 1280
						++js5ConnectState; // L: 1281
					}

					if (js5ConnectState == 1) { // L: 1283
						if (class357.js5SocketTask.status == 2) { // L: 1284
							this.js5Error(-1); // L: 1285
							return; // L: 1286
						}

						if (class357.js5SocketTask.status == 1) { // L: 1288
							++js5ConnectState;
						}
					}

					Buffer var3;
					if (js5ConnectState == 2) { // L: 1290
						Socket var2 = (Socket)class357.js5SocketTask.result; // L: 1292
						BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000); // L: 1294
						WorldMapIcon_1.js5Socket = var1; // L: 1296
						var3 = new Buffer(5); // L: 1297
						var3.writeByte(15); // L: 1298
						var3.method8536(210); // L: 1299
						WorldMapIcon_1.js5Socket.write(var3.array, 0, 5); // L: 1300
						++js5ConnectState; // L: 1301
						FileSystem.field1866 = Message.method1197(); // L: 1302
					}

					if (js5ConnectState == 3) { // L: 1304
						if (WorldMapIcon_1.js5Socket.available() > 0) { // L: 1305
							int var5 = WorldMapIcon_1.js5Socket.readUnsignedByte(); // L: 1306
							if (var5 != 0) { // L: 1307
								this.js5Error(var5); // L: 1308
								return; // L: 1309
							}

							++js5ConnectState; // L: 1311
						} else if (Message.method1197() - FileSystem.field1866 > 30000L) { // L: 1314
							this.js5Error(-2); // L: 1315
							return; // L: 1316
						}
					}

					if (js5ConnectState == 4) { // L: 1320
						AbstractSocket var13 = WorldMapIcon_1.js5Socket; // L: 1321
						boolean var6 = gameState > 20; // L: 1322
						if (NetCache.NetCache_socket != null) { // L: 1324
							try {
								NetCache.NetCache_socket.close(); // L: 1326
							} catch (Exception var11) { // L: 1328
							}

							NetCache.NetCache_socket = null; // L: 1329
						}

						NetCache.NetCache_socket = var13; // L: 1331
						if (NetCache.NetCache_socket != null) { // L: 1333
							try {
								var3 = new Buffer(4); // L: 1335
								var3.writeByte(var6 ? 2 : 3); // L: 1336
								var3.writeMedium(0); // L: 1337
								NetCache.NetCache_socket.write(var3.array, 0, 4); // L: 1338
							} catch (IOException var10) {
								try {
									NetCache.NetCache_socket.close(); // L: 1342
								} catch (Exception var9) { // L: 1344
								}

								++NetCache.NetCache_ioExceptions; // L: 1345
								NetCache.NetCache_socket = null; // L: 1346
							}
						}

						NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1349
						class185.NetCache_currentResponse = null; // L: 1350
						ModeWhere.NetCache_responseArchiveBuffer = null; // L: 1351
						NetCache.field4216 = 0; // L: 1352

						while (true) {
							NetFileRequest var14 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 1354
							if (var14 == null) { // L: 1355
								while (true) {
									var14 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 1361
									if (var14 == null) { // L: 1362
										if (NetCache.field4232 != 0) { // L: 1368
											try {
												var3 = new Buffer(4); // L: 1370
												var3.writeByte(4); // L: 1371
												var3.writeByte(NetCache.field4232); // L: 1372
												var3.writeShort(0); // L: 1373
												NetCache.NetCache_socket.write(var3.array, 0, 4); // L: 1374
											} catch (IOException var8) {
												try {
													NetCache.NetCache_socket.close(); // L: 1378
												} catch (Exception var7) { // L: 1380
												}

												++NetCache.NetCache_ioExceptions; // L: 1381
												NetCache.NetCache_socket = null; // L: 1382
											}
										}

										NetCache.NetCache_loadTime = 0; // L: 1385
										NetCache.field4218 = Message.method1197(); // L: 1386
										class357.js5SocketTask = null; // L: 1388
										WorldMapIcon_1.js5Socket = null; // L: 1389
										js5ConnectState = 0; // L: 1390
										js5Errors = 0; // L: 1391
										return; // L: 1397
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var14); // L: 1363
									NetCache.NetCache_pendingWrites.put(var14, var14.key); // L: 1364
									++NetCache.NetCache_pendingWritesCount; // L: 1365
									--NetCache.NetCache_pendingResponsesCount; // L: 1366
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var14, var14.key); // L: 1356
							++NetCache.NetCache_pendingPriorityWritesCount; // L: 1357
							--NetCache.NetCache_pendingPriorityResponsesCount; // L: 1358
						}
					}
				} catch (IOException var12) { // L: 1394
					this.js5Error(-3); // L: 1395
				}

			}
		}
	} // L: 1264

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1264077438"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class357.js5SocketTask = null; // L: 1400
		WorldMapIcon_1.js5Socket = null; // L: 1401
		js5ConnectState = 0; // L: 1402
		if (class31.currentPort == ClanChannel.worldPort) { // L: 1403
			class31.currentPort = class137.js5Port;
		} else {
			class31.currentPort = ClanChannel.worldPort; // L: 1404
		}

		++js5Errors; // L: 1405
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1406
			if (gameState <= 5) { // L: 1407
				this.error("js5connect_full"); // L: 1408
				class140.method3102(1000); // L: 1409
			} else {
				field537 = 3000; // L: 1411
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1413
			this.error("js5connect_outofdate"); // L: 1414
			class140.method3102(1000); // L: 1415
		} else if (js5Errors >= 4) { // L: 1417
			if (gameState <= 5) { // L: 1418
				this.error("js5connect"); // L: 1419
				class140.method3102(1000); // L: 1420
			} else {
				field537 = 3000; // L: 1422
			}
		}

	} // L: 1424

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "25"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 1831
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 1832

		try {
			if (loginState == 0) { // L: 1834
				if (class34.secureRandom == null && (secureRandomFuture.isDone() || field648 > 250)) { // L: 1835
					class34.secureRandom = secureRandomFuture.get(); // L: 1836
					secureRandomFuture.shutdown(); // L: 1837
					secureRandomFuture = null; // L: 1838
				}

				if (class34.secureRandom != null) { // L: 1840
					if (var1 != null) { // L: 1841
						((AbstractSocket)var1).close(); // L: 1842
						var1 = null; // L: 1843
					}

					class19.socketTask = null; // L: 1845
					hadNetworkError = false; // L: 1846
					field648 = 0; // L: 1847
					if (field640.method8841()) { // L: 1848
						try {
							this.requestOtlToken(EnumComposition.field2006); // L: 1850
							class37.method709(21); // L: 1851
						} catch (Throwable var25) { // L: 1853
							class132.RunException_sendStackTrace((String)null, var25); // L: 1854
							class32.getLoginError(65); // L: 1855
							return; // L: 1856
						}
					} else {
						class37.method709(1); // L: 1860
					}
				}
			}

			class21 var28;
			if (loginState == 21) { // L: 1864
				if (this.otlTokenRequest != null) { // L: 1865
					if (!this.otlTokenRequest.isDone()) { // L: 1866
						return; // L: 1867
					}

					if (this.otlTokenRequest.isCancelled()) { // L: 1869
						class32.getLoginError(65); // L: 1870
						this.otlTokenRequest = null; // L: 1871
						return; // L: 1872
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.otlTokenRequest.get(); // L: 1875
						if (!var3.isSuccess()) { // L: 1876
							class32.getLoginError(65); // L: 1877
							this.otlTokenRequest = null; // L: 1878
							return; // L: 1879
						}

						class146.field1717 = var3.getAccessToken(); // L: 1881
						EnumComposition.field2006 = var3.getRefreshToken(); // L: 1882
						this.otlTokenRequest = null; // L: 1883
					} catch (Exception var24) { // L: 1885
						class132.RunException_sendStackTrace((String)null, var24); // L: 1886
						class32.getLoginError(65); // L: 1887
						this.otlTokenRequest = null; // L: 1888
						return; // L: 1889
					}
				} else {
					if (this.field654 == null) { // L: 1892
						class32.getLoginError(65); // L: 1922
						return; // L: 1923
					}

					if (!this.field654.method279()) { // L: 1893
						return; // L: 1894
					}

					if (this.field654.method281()) { // L: 1896
						class132.RunException_sendStackTrace(this.field654.method275(), (Throwable)null); // L: 1897
						class32.getLoginError(65); // L: 1898
						this.field654 = null; // L: 1899
						return; // L: 1900
					}

					var28 = this.field654.method286(); // L: 1902
					if (var28.method297() != 200) { // L: 1903
						class32.getLoginError(65); // L: 1904
						this.field654 = null; // L: 1905
						return; // L: 1906
					}

					field648 = 0; // L: 1908
					class422 var4 = new class422(var28.method298()); // L: 1909

					try {
						class146.field1717 = var4.method7917().getString("access_token"); // L: 1911
						EnumComposition.field2006 = var4.method7917().getString("refresh_token"); // L: 1912
					} catch (Exception var23) { // L: 1914
						class132.RunException_sendStackTrace("Error parsing tokens", var23); // L: 1915
						class32.getLoginError(65); // L: 1916
						this.field654 = null; // L: 1917
						return; // L: 1918
					}
				}

				this.method1233(class146.field1717); // L: 1925
				class37.method709(20); // L: 1926
			}

			if (loginState == 20) { // L: 1928
				if (this.field549 != null) { // L: 1929
					if (!this.field549.isDone()) { // L: 1930
						return; // L: 1931
					}

					if (this.field549.isCancelled()) { // L: 1933
						class32.getLoginError(65); // L: 1934
						this.field549 = null; // L: 1935
						return; // L: 1936
					}

					try {
						OtlTokenResponse var29 = (OtlTokenResponse)this.field549.get(); // L: 1939
						if (!var29.isSuccess()) { // L: 1940
							class32.getLoginError(65); // L: 1941
							this.field549 = null; // L: 1942
							return; // L: 1943
						}

						this.field781 = var29.getToken(); // L: 1945
						this.field549 = null; // L: 1946
					} catch (Exception var22) { // L: 1948
						class132.RunException_sendStackTrace((String)null, var22); // L: 1949
						class32.getLoginError(65); // L: 1950
						this.field549 = null; // L: 1951
						return; // L: 1952
					}
				} else {
					if (this.field547 == null) { // L: 1955
						class32.getLoginError(65); // L: 1976
						return; // L: 1977
					}

					if (!this.field547.method279()) { // L: 1956
						return; // L: 1957
					}

					if (this.field547.method281()) { // L: 1959
						class132.RunException_sendStackTrace(this.field547.method275(), (Throwable)null); // L: 1960
						class32.getLoginError(65); // L: 1961
						this.field547 = null; // L: 1962
						return; // L: 1963
					}

					var28 = this.field547.method286(); // L: 1965
					if (var28.method297() != 200) { // L: 1966
						class132.RunException_sendStackTrace("Response code: " + var28.method297() + "Response body: " + var28.method298(), (Throwable)null); // L: 1967
						class32.getLoginError(65); // L: 1968
						this.field547 = null; // L: 1969
						return; // L: 1970
					}

					this.field781 = var28.method298(); // L: 1972
					this.field547 = null; // L: 1973
				}

				field648 = 0; // L: 1979
				class37.method709(1); // L: 1980
			}

			if (loginState == 1) { // L: 1982
				if (class19.socketTask == null) { // L: 1983
					class19.socketTask = class242.taskHandler.newSocketTask(class139.worldHost, class31.currentPort); // L: 1984
				}

				if (class19.socketTask.status == 2) { // L: 1986
					throw new IOException();
				}

				if (class19.socketTask.status == 1) { // L: 1987
					Socket var30 = (Socket)class19.socketTask.result; // L: 1989
					BufferedNetSocket var31 = new BufferedNetSocket(var30, 40000, 5000); // L: 1991
					var1 = var31; // L: 1993
					packetWriter.setSocket(var31); // L: 1994
					class19.socketTask = null; // L: 1995
					class37.method709(2); // L: 1996
				}
			}

			PacketBufferNode var32;
			if (loginState == 2) { // L: 1999
				packetWriter.clearBuffer(); // L: 2000
				var32 = class109.method2781(); // L: 2003
				var32.clientPacket = null; // L: 2004
				var32.clientPacketLength = 0; // L: 2005
				var32.packetBuffer = new PacketBuffer(5000); // L: 2006
				var32.packetBuffer.writeByte(LoginPacket.field3300.id); // L: 2010
				packetWriter.addNode(var32); // L: 2011
				packetWriter.flush(); // L: 2012
				var2.offset = 0; // L: 2013
				class37.method709(3); // L: 2014
			}

			int var15;
			if (loginState == 3) { // L: 2016
				if (TileItem.pcmPlayer0 != null) { // L: 2017
					TileItem.pcmPlayer0.method817();
				}

				if (UserComparator8.pcmPlayer1 != null) { // L: 2018
					UserComparator8.pcmPlayer1.method817();
				}

				if (((AbstractSocket)var1).isAvailable(1)) { // L: 2019
					var15 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2020
					if (TileItem.pcmPlayer0 != null) { // L: 2021
						TileItem.pcmPlayer0.method817();
					}

					if (UserComparator8.pcmPlayer1 != null) { // L: 2022
						UserComparator8.pcmPlayer1.method817();
					}

					if (var15 != 0) { // L: 2023
						class32.getLoginError(var15); // L: 2024
						return; // L: 2025
					}

					var2.offset = 0; // L: 2027
					class37.method709(4); // L: 2028
				}
			}

			if (loginState == 4) { // L: 2031
				if (var2.offset < 8) { // L: 2032
					var15 = ((AbstractSocket)var1).available(); // L: 2033
					if (var15 > 8 - var2.offset) { // L: 2034
						var15 = 8 - var2.offset;
					}

					if (var15 > 0) { // L: 2035
						((AbstractSocket)var1).read(var2.array, var2.offset, var15); // L: 2036
						var2.offset += var15; // L: 2037
					}
				}

				if (var2.offset == 8) { // L: 2040
					var2.offset = 0; // L: 2041
					VerticalAlignment.field2075 = var2.readLong(); // L: 2042
					class37.method709(5); // L: 2043
				}
			}

			if (loginState == 5) { // L: 2046
				packetWriter.packetBuffer.offset = 0; // L: 2047
				packetWriter.clearBuffer(); // L: 2048
				PacketBuffer var33 = new PacketBuffer(500); // L: 2049
				int[] var34 = new int[]{class34.secureRandom.nextInt(), class34.secureRandom.nextInt(), class34.secureRandom.nextInt(), class34.secureRandom.nextInt()}; // L: 2050 2051 2052 2053 2054
				var33.offset = 0; // L: 2055
				var33.writeByte(1); // L: 2056
				var33.method8536(var34[0]); // L: 2057
				var33.method8536(var34[1]); // L: 2058
				var33.method8536(var34[2]); // L: 2059
				var33.method8536(var34[3]); // L: 2060
				var33.writeLong(VerticalAlignment.field2075); // L: 2061
				if (gameState == 40) { // L: 2062
					var33.method8536(WorldMapEvent.field3020[0]); // L: 2063
					var33.method8536(WorldMapEvent.field3020[1]); // L: 2064
					var33.method8536(WorldMapEvent.field3020[2]); // L: 2065
					var33.method8536(WorldMapEvent.field3020[3]); // L: 2066
				} else {
					if (gameState == 50) { // L: 2069
						var33.writeByte(class132.field1628.rsOrdinal()); // L: 2070
						var33.method8536(KeyHandler.field172); // L: 2071
					} else {
						var33.writeByte(field540.rsOrdinal()); // L: 2074
						switch(field540.field1627) { // L: 2075
						case 0:
							var33.offset += 4; // L: 2078
						case 1:
						default:
							break;
						case 2:
							var33.method8536(StructComposition.clientPreferences.method2437(Login.Login_username)); // L: 2090
							break;
						case 3:
						case 4:
							var33.writeMedium(class143.field1697); // L: 2084
							++var33.offset; // L: 2085
						}
					}

					if (field640.method8841()) { // L: 2095
						var33.writeByte(class471.field4969.rsOrdinal()); // L: 2096
						var33.writeStringCp1252NullTerminated(this.field781); // L: 2097
					} else {
						var33.writeByte(class471.field4976.rsOrdinal()); // L: 2100
						var33.writeStringCp1252NullTerminated(Login.Login_password); // L: 2101
					}
				}

				var33.encryptRsa(class71.field911, class71.field908); // L: 2104
				WorldMapEvent.field3020 = var34; // L: 2105
				PacketBufferNode var6 = class109.method2781(); // L: 2108
				var6.clientPacket = null; // L: 2109
				var6.clientPacketLength = 0; // L: 2110
				var6.packetBuffer = new PacketBuffer(5000); // L: 2111
				var6.packetBuffer.offset = 0; // L: 2115
				if (gameState == 40) { // L: 2116
					var6.packetBuffer.writeByte(LoginPacket.field3303.id); // L: 2117
				} else {
					var6.packetBuffer.writeByte(LoginPacket.field3301.id); // L: 2120
				}

				var6.packetBuffer.writeShort(0); // L: 2122
				int var7 = var6.packetBuffer.offset; // L: 2123
				var6.packetBuffer.method8536(210); // L: 2124
				var6.packetBuffer.method8536(1); // L: 2125
				var6.packetBuffer.writeByte(clientType); // L: 2126
				var6.packetBuffer.writeByte(field698); // L: 2127
				byte var8 = 0; // L: 2128
				var6.packetBuffer.writeByte(var8); // L: 2129
				var6.packetBuffer.writeBytes(var33.array, 0, var33.offset); // L: 2130
				int var9 = var6.packetBuffer.offset; // L: 2131
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2132
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2133
				var6.packetBuffer.writeShort(CollisionMap.canvasWidth); // L: 2134
				var6.packetBuffer.writeShort(Language.canvasHeight); // L: 2135
				PacketBuffer var10 = var6.packetBuffer; // L: 2136
				int var13;
				if (randomDatData != null) { // L: 2138
					var10.writeBytes(randomDatData, 0, randomDatData.length); // L: 2139
				} else {
					byte[] var12 = new byte[24]; // L: 2144

					try {
						JagexCache.JagexCache_randomDat.seek(0L); // L: 2146
						JagexCache.JagexCache_randomDat.readFully(var12); // L: 2147

						for (var13 = 0; var13 < 24 && var12[var13] == 0; ++var13) { // L: 2148 2149 2150
						}

						if (var13 >= 24) { // L: 2152
							throw new IOException();
						}
					} catch (Exception var26) {
						for (int var14 = 0; var14 < 24; ++var14) { // L: 2155
							var12[var14] = -1;
						}
					}

					var10.writeBytes(var12, 0, var12.length); // L: 2160
				}

				var6.packetBuffer.writeStringCp1252NullTerminated(class133.field1635); // L: 2162
				var6.packetBuffer.method8536(DecorativeObject.field2799); // L: 2163
				Buffer var11 = new Buffer(class213.platformInfo.size()); // L: 2164
				class213.platformInfo.write(var11); // L: 2165
				var6.packetBuffer.writeBytes(var11.array, 0, var11.array.length); // L: 2166
				var6.packetBuffer.writeByte(clientType); // L: 2167
				var6.packetBuffer.method8536(0); // L: 2168
				var6.packetBuffer.method8536(FloorUnderlayDefinition.archive4.hash); // L: 2169
				var6.packetBuffer.method8600(class71.archive12.hash); // L: 2170
				var6.packetBuffer.method8600(VerticalAlignment.archive17.hash); // L: 2171
				var6.packetBuffer.method8599(class89.archive15.hash); // L: 2172
				var6.packetBuffer.method8600(VarpDefinition.archive14.hash); // L: 2173
				var6.packetBuffer.method8599(HitSplatDefinition.archive2.hash); // L: 2174
				var6.packetBuffer.method8600(0); // L: 2175
				var6.packetBuffer.writeInt(ClientPreferences.archive8.hash); // L: 2176
				var6.packetBuffer.method8599(class162.archive6.hash); // L: 2177
				var6.packetBuffer.method8536(class358.archive13.hash); // L: 2178
				var6.packetBuffer.method8600(class170.archive18.hash); // L: 2179
				var6.packetBuffer.method8536(Frames.archive10.hash); // L: 2180
				var6.packetBuffer.writeInt(class301.archive11.hash); // L: 2181
				var6.packetBuffer.method8536(class9.archive7.hash); // L: 2182
				var6.packetBuffer.method8536(FontName.archive19.hash); // L: 2183
				var6.packetBuffer.writeInt(WorldMapArea.archive20.hash); // L: 2184
				var6.packetBuffer.method8536(class21.field123.hash); // L: 2185
				var6.packetBuffer.method8599(ClanChannelMember.field1666.hash); // L: 2186
				var6.packetBuffer.method8599(class4.field7.hash); // L: 2187
				var6.packetBuffer.method8536(WorldMapSection0.archive9.hash); // L: 2188
				var6.packetBuffer.writeInt(HealthBar.field1306.hash); // L: 2189
				var6.packetBuffer.xteaEncrypt(var34, var9, var6.packetBuffer.offset); // L: 2190
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var7); // L: 2191
				packetWriter.addNode(var6); // L: 2192
				packetWriter.flush(); // L: 2193
				packetWriter.isaacCipher = new IsaacCipher(var34); // L: 2194
				int[] var41 = new int[4]; // L: 2195

				for (var13 = 0; var13 < 4; ++var13) { // L: 2196
					var41[var13] = var34[var13] + 50;
				}

				var2.newIsaacCipher(var41); // L: 2197
				class37.method709(6); // L: 2198
			}

			int var17;
			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2200 2201
				var15 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2202
				if (var15 == 61) { // L: 2203
					var17 = ((AbstractSocket)var1).available(); // L: 2204
					class155.field1785 = var17 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2205
					class37.method709(5); // L: 2206
				}

				if (var15 == 21 && gameState == 20) { // L: 2208
					class37.method709(12); // L: 2209
				} else if (var15 == 2) { // L: 2211
					class37.method709(14); // L: 2212
				} else if (var15 == 15 && gameState == 40) { // L: 2214
					packetWriter.serverPacketLength = -1; // L: 2215
					class37.method709(19); // L: 2216
				} else if (var15 == 64) { // L: 2218
					class37.method709(10); // L: 2219
				} else if (var15 == 23 && field541 < 1) { // L: 2221
					++field541; // L: 2222
					class37.method709(0); // L: 2223
				} else if (var15 == 29) { // L: 2225
					class37.method709(17); // L: 2226
				} else {
					if (var15 != 69) { // L: 2228
						class32.getLoginError(var15); // L: 2232
						return; // L: 2233
					}

					class37.method709(7); // L: 2229
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2237 2238
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2239
				var2.offset = 0; // L: 2240
				UserComparator8.field1461 = var2.readUnsignedShort(); // L: 2241
				class37.method709(8); // L: 2242
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= UserComparator8.field1461) { // L: 2245 2246
				var2.offset = 0; // L: 2247
				((AbstractSocket)var1).read(var2.array, var2.offset, UserComparator8.field1461); // L: 2248
				class6 var35 = Skills.method6369()[var2.readUnsignedByte()]; // L: 2249

				try {
					class3 var36 = NetCache.method6566(var35); // L: 2251
					this.field573 = new class7(var2, var36); // L: 2252
					class37.method709(9); // L: 2253
				} catch (Exception var21) { // L: 2255
					class32.getLoginError(22); // L: 2256
					return; // L: 2257
				}
			}

			if (loginState == 9 && this.field573.method57()) { // L: 2262
				this.field557 = this.field573.method56();
				this.field573.method45();
				this.field573 = null;
				if (this.field557 == null) { // L: 2266
					class32.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var32 = class109.method2781();
				var32.clientPacket = null;
				var32.clientPacketLength = 0;
				var32.packetBuffer = new PacketBuffer(5000);
				var32.packetBuffer.writeByte(LoginPacket.field3304.id);
				var32.packetBuffer.writeShort(this.field557.offset); // L: 2281
				var32.packetBuffer.method8544(this.field557); // L: 2282
				packetWriter.addNode(var32);
				packetWriter.flush();
				this.field557 = null;
				class37.method709(6);
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2289
				TextureProvider.field2643 = ((AbstractSocket)var1).readUnsignedByte();
				class37.method709(11);
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= TextureProvider.field2643) {
				((AbstractSocket)var1).read(var2.array, 0, TextureProvider.field2643); // L: 2297
				var2.offset = 0; // L: 2298
				class37.method709(6); // L: 2299
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2302
				field527 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				class37.method709(13); // L: 2305
			}

			if (loginState == 13) { // L: 2308
				field648 = 0;
				TaskHandler.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field527 / 60 + " seconds.");
				if (--field527 <= 0) { // L: 2311
					class37.method709(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2314 2315
					class420.field4655 = ((AbstractSocket)var1).readUnsignedByte();
					class37.method709(15);
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= class420.field4655) { // L: 2320
					boolean var42 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2322
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2323
					var2.offset = 0; // L: 2324
					boolean var43 = false; // L: 2325
					if (var42) {
						var17 = var2.readByteIsaac() << 24;
						var17 |= var2.readByteIsaac() << 16; // L: 2328
						var17 |= var2.readByteIsaac() << 8; // L: 2329
						var17 |= var2.readByteIsaac(); // L: 2330
						StructComposition.clientPreferences.method2435(Login.Login_username, var17);
					}

					if (Login_isUsernameRemembered) { // L: 2333
						StructComposition.clientPreferences.method2429(Login.Login_username); // L: 2334
					} else {
						StructComposition.clientPreferences.method2429((String)null);
					}

					Tile.savePreferences(); // L: 2339
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2340
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2344
					field692 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2345
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2346
					var2.offset = 0; // L: 2347
					this.accountHash = var2.readLong();
					if (class420.field4655 >= 29) { // L: 2349
						((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2350
						var2.offset = 0;
						field637 = var2.readLong();
					}

					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0; // L: 2355
					ServerPacket[] var5 = EnumComposition.ServerPacket_values(); // L: 2356
					int var18 = var2.readSmartByteShortIsaac(); // L: 2357
					if (var18 < 0 || var18 >= var5.length) {
						throw new IOException(var18 + " " + var2.offset);
					}

					packetWriter.serverPacket = var5[var18];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2360
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2361
					var2.offset = 0; // L: 2362
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						class27.method390(BuddyRankComparator.client, "zap");
					} catch (Throwable var20) { // L: 2367
					}

					class37.method709(16); // L: 2368
				}

				if (loginState == 16) {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2372
						var2.offset = 0; // L: 2373
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2374
						timer.method7332();
						class104.method2650();
						class280.updatePlayer(var2);
						class17.field101 = -1;
						InterfaceParent.loadRegions(false, var2); // L: 2379
						packetWriter.serverPacket = null; // L: 2380
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						class155.field1788 = var2.readUnsignedShort();
						class37.method709(18);
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= class155.field1788) { // L: 2393 2394
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, class155.field1788);
						var2.offset = 0;
						String var37 = var2.readStringCp1252NullTerminated();
						String var40 = var2.readStringCp1252NullTerminated();
						String var38 = var2.readStringCp1252NullTerminated(); // L: 2400
						TaskHandler.setLoginResponseString(var37, var40, var38); // L: 2401
						class140.method3102(10);
						if (field640.method8841()) {
							class12.method155(9);
						}
					}

					if (loginState != 19) {
						++field648; // L: 2460
						if (field648 > 2000) { // L: 2461
							if (field541 < 1) {
								if (ClanChannel.worldPort == class31.currentPort) {
									class31.currentPort = class137.js5Port;
								} else {
									class31.currentPort = ClanChannel.worldPort;
								}

								++field541; // L: 2465
								class37.method709(0); // L: 2466
							} else {
								class32.getLoginError(-3);
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) { // L: 2409
							if (((AbstractSocket)var1).available() < 2) { // L: 2410
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2411
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0; // L: 2417
							var15 = packetWriter.serverPacketLength;
							timer.method7328();
							packetWriter.clearBuffer();
							packetWriter.packetBuffer.offset = 0;
							packetWriter.serverPacket = null; // L: 2423
							packetWriter.field1431 = null;
							packetWriter.field1432 = null;
							packetWriter.field1433 = null; // L: 2426
							packetWriter.serverPacketLength = 0; // L: 2427
							packetWriter.field1420 = 0;
							rebootTimer = 0; // L: 2429
							WorldMapSectionType.method5230(); // L: 2430
							minimapState = 0; // L: 2431
							destinationX = 0; // L: 2432

							for (var17 = 0; var17 < 2048; ++var17) {
								players[var17] = null;
							}

							class155.localPlayer = null;

							for (var17 = 0; var17 < npcs.length; ++var17) { // L: 2435
								NPC var39 = npcs[var17]; // L: 2436
								if (var39 != null) { // L: 2437
									var39.targetIndex = -1;
									var39.false0 = false;
								}
							}

							class32.method459(); // L: 2442
							class140.method3102(30);

							for (var17 = 0; var17 < 100; ++var17) {
								field731[var17] = true;
							}

							var32 = class136.getPacketBufferNode(ClientPacket.field3057, packetWriter.isaacCipher); // L: 2447
							var32.packetBuffer.writeByte(Message.getWindowedMode());
							var32.packetBuffer.writeShort(CollisionMap.canvasWidth);
							var32.packetBuffer.writeShort(Language.canvasHeight); // L: 2450
							packetWriter.addNode(var32); // L: 2451
							class280.updatePlayer(var2);
							if (var15 != var2.offset) { // L: 2455
								throw new RuntimeException(); // L: 2456
							}
						}
					}
				}
			}
		} catch (IOException var27) { // L: 2473
			if (field541 < 1) {
				if (class31.currentPort == ClanChannel.worldPort) {
					class31.currentPort = class137.js5Port;
				} else {
					class31.currentPort = ClanChannel.worldPort; // L: 2476
				}

				++field541; // L: 2477
				class37.method709(0); // L: 2478
			} else {
				class32.getLoginError(-2);
			}
		}
	} // L: 2458 2467 2482 2484

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-35306056"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 2804
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 2805
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 2806
			hadNetworkError = false; // L: 2807
			FaceNormal.method4619(); // L: 2808
		} else {
			if (!isMenuOpen) { // L: 2811
				FriendsChatManager.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1727(packetWriter); ++var1) { // L: 2812 2813
			}

			if (gameState == 30) { // L: 2815
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class37.reflectionChecks.last(); // L: 2819
					boolean var29;
					if (var2 == null) { // L: 2820
						var29 = false; // L: 2821
					} else {
						var29 = true; // L: 2824
					}

					int var3;
					PacketBufferNode var30;
					if (!var29) { // L: 2826
						PacketBufferNode var14;
						int var15;
						if (timer.field4452) { // L: 2834
							var14 = class136.getPacketBufferNode(ClientPacket.field3143, packetWriter.isaacCipher); // L: 2836
							var14.packetBuffer.writeByte(0); // L: 2837
							var15 = var14.packetBuffer.offset; // L: 2838
							timer.write(var14.packetBuffer); // L: 2839
							var14.packetBuffer.method8622(var14.packetBuffer.offset - var15); // L: 2840
							packetWriter.addNode(var14); // L: 2841
							timer.method7333(); // L: 2842
						}

						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						synchronized(class271.mouseRecorder.lock) { // L: 2845
							if (!field674) { // L: 2846
								class271.mouseRecorder.index = 0; // L: 2932
							} else if (MouseHandler.MouseHandler_lastButton != 0 || class271.mouseRecorder.index >= 40) { // L: 2847
								var30 = null; // L: 2849
								var3 = 0; // L: 2850
								var4 = 0; // L: 2851
								var5 = 0; // L: 2852
								var6 = 0; // L: 2853

								for (var7 = 0; var7 < class271.mouseRecorder.index && (var30 == null || var30.packetBuffer.offset - var3 < 246); ++var7) { // L: 2854 2855
									var4 = var7; // L: 2856
									var8 = class271.mouseRecorder.ys[var7]; // L: 2857
									if (var8 < -1) { // L: 2858
										var8 = -1;
									} else if (var8 > 65534) { // L: 2859
										var8 = 65534;
									}

									var9 = class271.mouseRecorder.xs[var7]; // L: 2860
									if (var9 < -1) { // L: 2861
										var9 = -1;
									} else if (var9 > 65534) { // L: 2862
										var9 = 65534;
									}

									if (var9 != field520 || var8 != field552) { // L: 2863
										if (var30 == null) { // L: 2866
											var30 = class136.getPacketBufferNode(ClientPacket.field3121, packetWriter.isaacCipher); // L: 2867
											var30.packetBuffer.writeByte(0); // L: 2868
											var3 = var30.packetBuffer.offset; // L: 2869
											PacketBuffer var10000 = var30.packetBuffer; // L: 2870
											var10000.offset += 2;
											var5 = 0; // L: 2871
											var6 = 0; // L: 2872
										}

										int var12;
										if (field522 != -1L) { // L: 2877
											var10 = var9 - field520; // L: 2878
											var11 = var8 - field552; // L: 2879
											var12 = (int)((class271.mouseRecorder.millis[var7] - field522) / 20L); // L: 2880
											var5 = (int)((long)var5 + (class271.mouseRecorder.millis[var7] - field522) % 20L); // L: 2881
										} else {
											var10 = var9; // L: 2884
											var11 = var8; // L: 2885
											var12 = Integer.MAX_VALUE; // L: 2886
										}

										field520 = var9; // L: 2888
										field552 = var8; // L: 2889
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 2890
											var10 += 32; // L: 2891
											var11 += 32; // L: 2892
											var30.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 2893
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 2895
											var10 += 128; // L: 2896
											var11 += 128; // L: 2897
											var30.packetBuffer.writeByte(var12 + 128); // L: 2898
											var30.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 2899
										} else if (var12 < 32) { // L: 2901
											var30.packetBuffer.writeByte(var12 + 192); // L: 2902
											if (var9 != -1 && var8 != -1) { // L: 2903
												var30.packetBuffer.method8536(var9 | var8 << 16); // L: 2904
											} else {
												var30.packetBuffer.method8536(Integer.MIN_VALUE);
											}
										} else {
											var30.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 2907
											if (var9 != -1 && var8 != -1) { // L: 2908
												var30.packetBuffer.method8536(var9 | var8 << 16); // L: 2909
											} else {
												var30.packetBuffer.method8536(Integer.MIN_VALUE);
											}
										}

										++var6; // L: 2911
										field522 = class271.mouseRecorder.millis[var7]; // L: 2912
									}
								}

								if (var30 != null) { // L: 2914
									var30.packetBuffer.method8622(var30.packetBuffer.offset - var3); // L: 2915
									var7 = var30.packetBuffer.offset; // L: 2916
									var30.packetBuffer.offset = var3; // L: 2917
									var30.packetBuffer.writeByte(var5 / var6); // L: 2918
									var30.packetBuffer.writeByte(var5 % var6); // L: 2919
									var30.packetBuffer.offset = var7; // L: 2920
									packetWriter.addNode(var30); // L: 2921
								}

								if (var4 >= class271.mouseRecorder.index) { // L: 2923
									class271.mouseRecorder.index = 0;
								} else {
									MouseRecorder var49 = class271.mouseRecorder; // L: 2925
									var49.index -= var4;
									System.arraycopy(class271.mouseRecorder.xs, var4, class271.mouseRecorder.xs, 0, class271.mouseRecorder.index); // L: 2926
									System.arraycopy(class271.mouseRecorder.ys, var4, class271.mouseRecorder.ys, 0, class271.mouseRecorder.index); // L: 2927
									System.arraycopy(class271.mouseRecorder.millis, var4, class271.mouseRecorder.millis, 0, class271.mouseRecorder.index); // L: 2928
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !SceneTilePaint.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 2934
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L; // L: 2935
							if (var16 > 32767L) { // L: 2936
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L; // L: 2937
							var3 = MouseHandler.MouseHandler_lastPressedY; // L: 2938
							if (var3 < 0) { // L: 2939
								var3 = 0;
							} else if (var3 > Language.canvasHeight) { // L: 2940
								var3 = Language.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX; // L: 2941
							if (var4 < 0) { // L: 2942
								var4 = 0;
							} else if (var4 > CollisionMap.canvasWidth) { // L: 2943
								var4 = CollisionMap.canvasWidth;
							}

							var5 = (int)var16; // L: 2944
							var18 = class136.getPacketBufferNode(ClientPacket.field3114, packetWriter.isaacCipher); // L: 2945
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 2946
							var18.packetBuffer.writeShort(var4); // L: 2947
							var18.packetBuffer.writeShort(var3); // L: 2948
							packetWriter.addNode(var18); // L: 2949
						}

						if (field747.field2326 > 0) { // L: 2951
							var14 = class136.getPacketBufferNode(ClientPacket.field3048, packetWriter.isaacCipher); // L: 2952
							var14.packetBuffer.writeShort(0); // L: 2953
							var15 = var14.packetBuffer.offset; // L: 2954
							long var19 = Message.method1197(); // L: 2955

							for (var5 = 0; var5 < field747.field2326; ++var5) { // L: 2956
								long var21 = var19 - field679; // L: 2957
								if (var21 > 16777215L) { // L: 2958
									var21 = 16777215L;
								}

								field679 = var19; // L: 2959
								var14.packetBuffer.writeMedium((int)var21); // L: 2960
								var14.packetBuffer.writeByte(field747.field2323[var5]); // L: 2961
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15); // L: 2963
							packetWriter.addNode(var14); // L: 2964
						}

						if (field807 > 0) { // L: 2966
							--field807;
						}

						if (field747.method4106(96) || field747.method4106(97) || field747.method4106(98) || field747.method4106(99)) { // L: 2967
							field603 = true; // L: 2968
						}

						if (field603 && field807 <= 0) { // L: 2970
							field807 = 20; // L: 2971
							field603 = false; // L: 2972
							var14 = class136.getPacketBufferNode(ClientPacket.field3149, packetWriter.isaacCipher); // L: 2974
							var14.packetBuffer.writeShort(camAngleY); // L: 2975
							var14.packetBuffer.writeShort(camAngleX); // L: 2976
							packetWriter.addNode(var14); // L: 2977
						}

						if (PacketBuffer.hasFocus && !hadFocus) { // L: 2979
							hadFocus = true; // L: 2980
							var14 = class136.getPacketBufferNode(ClientPacket.field3135, packetWriter.isaacCipher); // L: 2982
							var14.packetBuffer.writeByte(1); // L: 2983
							packetWriter.addNode(var14); // L: 2984
						}

						if (!PacketBuffer.hasFocus && hadFocus) { // L: 2986
							hadFocus = false; // L: 2987
							var14 = class136.getPacketBufferNode(ClientPacket.field3135, packetWriter.isaacCipher); // L: 2989
							var14.packetBuffer.writeByte(0); // L: 2990
							packetWriter.addNode(var14); // L: 2991
						}

						if (KitDefinition.worldMap != null) { // L: 2994
							KitDefinition.worldMap.method7989();
						}

						if (class281.FriendsChatManager_inFriendsChat) { // L: 2996
							if (class281.friendsChatManager != null) { // L: 2997
								class281.friendsChatManager.sort(); // L: 2998
							}

							class169.method3484(); // L: 3000
							class281.FriendsChatManager_inFriendsChat = false; // L: 3001
						}

						KeyHandler.method429(); // L: 3004
						class253.method5283(); // L: 3005
						if (gameState != 30) { // L: 3006
							return;
						}

						for (PendingSpawn var35 = (PendingSpawn)pendingSpawns.last(); var35 != null; var35 = (PendingSpawn)pendingSpawns.previous()) { // L: 3008 3009 3040
							if (var35.hitpoints > 0) { // L: 3010
								--var35.hitpoints;
							}

							if (var35.hitpoints == 0) { // L: 3011
								if (var35.objectId >= 0) { // L: 3013
									var3 = var35.objectId; // L: 3015
									var4 = var35.field1166; // L: 3016
									ObjectComposition var23 = VarpDefinition.getObjectDefinition(var3); // L: 3018
									if (var4 == 11) { // L: 3019
										var4 = 10;
									}

									if (var4 >= 5 && var4 <= 8) { // L: 3020
										var4 = 4;
									}

									boolean var36 = var23.method3867(var4); // L: 3021
									if (!var36) { // L: 3023
										continue;
									}
								}

								BuddyRankComparator.addPendingSpawnToScene(var35.plane, var35.type, var35.x, var35.y, var35.objectId, var35.field1175, var35.field1166); // L: 3025
								var35.remove(); // L: 3026
							} else {
								if (var35.delay > 0) {
									--var35.delay; // L: 3030
								}

								if (var35.delay == 0 && var35.x >= 1 && var35.y >= 1 && var35.x <= 102 && var35.y <= 102 && (var35.field1167 < 0 || Archive.method6426(var35.field1167, var35.field1169))) { // L: 3031 3032
									BuddyRankComparator.addPendingSpawnToScene(var35.plane, var35.type, var35.x, var35.y, var35.field1167, var35.field1168, var35.field1169); // L: 3033
									var35.delay = -1; // L: 3034
									if (var35.objectId == var35.field1167 && var35.objectId == -1) { // L: 3035
										var35.remove();
									} else if (var35.field1167 == var35.objectId && var35.field1168 == var35.field1175 && var35.field1166 == var35.field1169) { // L: 3036
										var35.remove();
									}
								}
							}
						}

						class130.method3029(); // L: 3043
						++packetWriter.field1420; // L: 3044
						if (packetWriter.field1420 > 750) { // L: 3045
							FaceNormal.method4619(); // L: 3046
							return; // L: 3047
						}

						HitSplatDefinition.method3860(); // L: 3049

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 3051
							var15 = npcIndices[var1]; // L: 3052
							NPC var24 = npcs[var15]; // L: 3053
							if (var24 != null) { // L: 3054
								GroundObject.updateActorSequence(var24, var24.definition.size); // L: 3055
							}
						}

						int[] var37 = Players.Players_indices; // L: 3060

						for (var15 = 0; var15 < Players.Players_count; ++var15) { // L: 3061
							Player var41 = players[var37[var15]]; // L: 3062
							if (var41 != null && var41.field1248 > 0) { // L: 3063
								--var41.field1248; // L: 3064
								if (var41.field1248 == 0) { // L: 3065
									var41.overheadText = null;
								}
							}
						}

						for (var15 = 0; var15 < npcCount; ++var15) { // L: 3068
							var3 = npcIndices[var15]; // L: 3069
							NPC var25 = npcs[var3]; // L: 3070
							if (var25 != null && var25.field1248 > 0) { // L: 3071
								--var25.field1248; // L: 3072
								if (var25.field1248 == 0) { // L: 3073
									var25.overheadText = null;
								}
							}
						}

						++field563; // L: 3077
						if (mouseCrossColor != 0) { // L: 3078
							mouseCrossState = mouseCrossState * 400 + 400; // L: 3079
							if (mouseCrossState * 20 >= 400) { // L: 3080
								mouseCrossColor = 0;
							}
						}

						if (MusicPatchPcmStream.field3411 != null) { // L: 3082
							++field624; // L: 3083
							if (field624 >= 15) { // L: 3084
								class69.invalidateWidget(MusicPatchPcmStream.field3411); // L: 3085
								MusicPatchPcmStream.field3411 = null; // L: 3086
							}
						}

						Widget var38 = WorldMapScaleHandler.mousedOverWidgetIf1; // L: 3089
						Widget var31 = class380.field4470; // L: 3090
						WorldMapScaleHandler.mousedOverWidgetIf1 = null; // L: 3091
						class380.field4470 = null; // L: 3092
						draggedOnWidget = null; // L: 3093
						field701 = false; // L: 3094
						field745 = false; // L: 3095
						field710 = 0; // L: 3096

						while (field747.method4114() && field710 < 128) { // L: 3097
							if (staffModLevel >= 2 && field747.method4106(82) && field747.field2328 == 66) { // L: 3098
								String var43 = LoginScreenAnimation.method2390(); // L: 3099
								BuddyRankComparator.client.method497(var43); // L: 3100
							} else if (oculusOrbState != 1 || field747.field2315 <= 0) { // L: 3103
								field751[field710] = field747.field2328; // L: 3106
								field774[field710] = field747.field2315; // L: 3107
								++field710; // L: 3108
							}
						}

						if (TaskHandler.method3443() && field747.method4106(82) && field747.method4106(81) && mouseWheelRotation != 0) { // L: 3110
							var3 = class155.localPlayer.plane - mouseWheelRotation; // L: 3111
							if (var3 < 0) { // L: 3112
								var3 = 0;
							} else if (var3 > 3) { // L: 3113
								var3 = 3;
							}

							if (var3 != class155.localPlayer.plane) { // L: 3114
								var4 = class155.localPlayer.pathX[0] + class154.baseX * 64; // L: 3115
								var5 = class155.localPlayer.pathY[0] + class365.baseY * 64; // L: 3116
								var18 = class136.getPacketBufferNode(ClientPacket.field3120, packetWriter.isaacCipher); // L: 3119
								var18.packetBuffer.method8607(var5); // L: 3120
								var18.packetBuffer.method8578(var3); // L: 3121
								var18.packetBuffer.writeIntME(var4); // L: 3122
								var18.packetBuffer.writeInt(0); // L: 3123
								packetWriter.addNode(var18); // L: 3124
							}

							mouseWheelRotation = 0; // L: 3127
						}

						if (MouseHandler.MouseHandler_lastButton == 1) { // L: 3129
							field572.method4068(); // L: 3130
						}

						if (rootInterface != -1) { // L: 3132
							class378.updateRootInterface(rootInterface, 0, 0, CollisionMap.canvasWidth, Language.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3133

						while (true) {
							Widget var40;
							ScriptEvent var44;
							Widget var45;
							do {
								var44 = (ScriptEvent)field725.removeLast(); // L: 3135
								if (var44 == null) { // L: 3136
									while (true) {
										do {
											var44 = (ScriptEvent)field726.removeLast(); // L: 3147
											if (var44 == null) { // L: 3148
												while (true) {
													do {
														var44 = (ScriptEvent)scriptEvents.removeLast(); // L: 3159
														if (var44 == null) { // L: 3160
															while (true) {
																while (true) {
																	PacketBufferNode var26;
																	class200 var46;
																	do {
																		do {
																			do {
																				var46 = (class200)field727.removeLast(); // L: 3171
																				if (var46 == null) { // L: 3172
																					this.menu(); // L: 3225
																					if (KitDefinition.worldMap != null) { // L: 3227
																						KitDefinition.worldMap.method7999(class383.Client_plane, class154.baseX * 64 + (class155.localPlayer.x >> 7), class365.baseY * 64 + (class155.localPlayer.y >> 7), false); // L: 3228
																						KitDefinition.worldMap.loadCache(); // L: 3229
																					}

																					if (clickedWidget != null) { // L: 3232
																						this.method1261();
																					}

																					if (class368.dragInventoryWidget != null) { // L: 3233
																						class69.invalidateWidget(class368.dragInventoryWidget); // L: 3234
																						++itemDragDuration; // L: 3235
																						if (MouseHandler.MouseHandler_currentButton == 0) { // L: 3236
																							if (field630) { // L: 3237
																								if (class368.dragInventoryWidget == WorldMapID.hoveredItemContainer && dragItemSlotDestination != dragItemSlotSource) { // L: 3238
																									Widget var47 = class368.dragInventoryWidget; // L: 3239
																									byte var34 = 0; // L: 3240
																									if (field685 == 1 && var47.contentType == 206) { // L: 3241
																										var34 = 1;
																									}

																									if (var47.itemIds[dragItemSlotDestination] <= 0) {
																										var34 = 0; // L: 3242
																									}

																									var6 = Clock.getWidgetFlags(var47); // L: 3244
																									boolean var33 = (var6 >> 29 & 1) != 0; // L: 3246
																									if (var33) { // L: 3248
																										var7 = dragItemSlotSource; // L: 3249
																										var8 = dragItemSlotDestination; // L: 3250
																										var47.itemIds[var8] = var47.itemIds[var7]; // L: 3251
																										var47.itemQuantities[var8] = var47.itemQuantities[var7]; // L: 3252
																										var47.itemIds[var7] = -1; // L: 3253
																										var47.itemQuantities[var7] = 0; // L: 3254
																									} else if (var34 == 1) { // L: 3256
																										var7 = dragItemSlotSource; // L: 3257
																										var8 = dragItemSlotDestination; // L: 3258

																										while (var7 != var8) { // L: 3259
																											if (var7 > var8) { // L: 3260
																												var47.swapItems(var7 - 1, var7); // L: 3261
																												--var7; // L: 3262
																											} else if (var7 < var8) { // L: 3264
																												var47.swapItems(var7 + 1, var7); // L: 3265
																												++var7; // L: 3266
																											}
																										}
																									} else {
																										var47.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 3271
																									}

																									var26 = class136.getPacketBufferNode(ClientPacket.field3058, packetWriter.isaacCipher); // L: 3274
																									var26.packetBuffer.writeInt(class368.dragInventoryWidget.id); // L: 3275
																									var26.packetBuffer.method8607(dragItemSlotSource); // L: 3276
																									var26.packetBuffer.writeShort(dragItemSlotDestination); // L: 3277
																									var26.packetBuffer.method8580(var34); // L: 3278
																									packetWriter.addNode(var26); // L: 3279
																								}
																							} else if (this.shouldLeftClickOpenMenu()) { // L: 3283
																								this.openMenu(draggedWidgetX, draggedWidgetY); // L: 3284
																							} else if (menuOptionsCount > 0) { // L: 3286
																								WorldMapLabelSize.method4861(draggedWidgetX, draggedWidgetY); // L: 3287
																							}

																							field624 = 10; // L: 3290
																							MouseHandler.MouseHandler_lastButton = 0; // L: 3291
																							class368.dragInventoryWidget = null; // L: 3292
																						} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 3295 3296
																							field630 = true; // L: 3297
																						}
																					}

																					if (Scene.shouldSendWalk()) { // L: 3302
																						var3 = Scene.Scene_selectedX; // L: 3303
																						var4 = Scene.Scene_selectedY; // L: 3304
																						PacketBufferNode var42 = class136.getPacketBufferNode(ClientPacket.field3083, packetWriter.isaacCipher); // L: 3306
																						var42.packetBuffer.writeByte(5); // L: 3307
																						var42.packetBuffer.method8580(field747.method4106(82) ? (field747.method4106(81) ? 2 : 1) : 0); // L: 3308
																						var42.packetBuffer.method8607(class154.baseX * 64 + var3); // L: 3309
																						var42.packetBuffer.writeIntME(class365.baseY * 64 + var4); // L: 3310
																						packetWriter.addNode(var42); // L: 3311
																						Scene.method4470(); // L: 3312
																						mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3313
																						mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3314
																						mouseCrossColor = 1; // L: 3315
																						mouseCrossState = 0; // L: 3316
																						destinationX = var3; // L: 3317
																						destinationY = var4; // L: 3318
																					}

																					if (var38 != WorldMapScaleHandler.mousedOverWidgetIf1) { // L: 3320
																						if (var38 != null) { // L: 3321
																							class69.invalidateWidget(var38);
																						}

																						if (WorldMapScaleHandler.mousedOverWidgetIf1 != null) { // L: 3322
																							class69.invalidateWidget(WorldMapScaleHandler.mousedOverWidgetIf1);
																						}
																					}

																					if (var31 != class380.field4470 && field553 == field521) { // L: 3324
																						if (var31 != null) { // L: 3325
																							class69.invalidateWidget(var31);
																						}

																						if (class380.field4470 != null) { // L: 3326
																							class69.invalidateWidget(class380.field4470);
																						}
																					}

																					if (class380.field4470 != null) { // L: 3328
																						if (field553 < field521) { // L: 3329
																							++field553; // L: 3330
																							if (field521 == field553) { // L: 3331
																								class69.invalidateWidget(class380.field4470);
																							}
																						}
																					} else if (field553 > 0) { // L: 3334
																						--field553;
																					}

																					class9.method80(); // L: 3335
																					if (field772) { // L: 3336
																						class31.method453();
																					} else if (isCameraLocked) { // L: 3337
																						var3 = class155.field1787 * 128 + 64; // L: 3338
																						var4 = class34.field208 * 16384 + 64; // L: 3339
																						var5 = SpotAnimationDefinition.getTileHeight(var3, var4, class383.Client_plane) - Script.field1001; // L: 3340
																						class280.method5498(var3, var5, var4); // L: 3341
																						var3 = class109.field1442 * 16384 + 64; // L: 3342
																						var4 = class146.field1718 * 16384 + 64; // L: 3343
																						var5 = SpotAnimationDefinition.getTileHeight(var3, var4, class383.Client_plane) - class104.field1398; // L: 3344
																						var6 = var3 - class145.cameraX; // L: 3345
																						var7 = var5 - class414.cameraY; // L: 3346
																						var8 = var4 - ClanChannel.cameraZ; // L: 3347
																						var9 = (int)Math.sqrt((double)(var8 * var8 + var6 * var6)); // L: 3348
																						var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.9490051269531D) & 2047; // L: 3349
																						var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.9490051269531D) & 2047; // L: 3350
																						class158.method3335(var10, var11); // L: 3351
																					}

																					for (var3 = 0; var3 < 5; ++var3) { // L: 3353
																						int var10002 = field617[var3]++;
																					}

																					WorldMapArea.varcs.tryWrite(); // L: 3354
																					var3 = ++MouseHandler.MouseHandler_idleCycles - 1; // L: 3357
																					var5 = class168.method3482(); // L: 3360
																					if (var3 > 15000 && var5 > 15000) { // L: 3361
																						logoutTimer = 250; // L: 3362
																						Player.method2333(14500); // L: 3363
																						var18 = class136.getPacketBufferNode(ClientPacket.field3124, packetWriter.isaacCipher); // L: 3365
																						packetWriter.addNode(var18); // L: 3366
																					}

																					DefaultsGroup.friendSystem.processFriendUpdates(); // L: 3368
																					++packetWriter.pendingWrites; // L: 3369
																					if (packetWriter.pendingWrites > 50) { // L: 3370
																						var18 = class136.getPacketBufferNode(ClientPacket.field3129, packetWriter.isaacCipher); // L: 3372
																						packetWriter.addNode(var18); // L: 3373
																					}

																					try {
																						packetWriter.flush(); // L: 3376
																					} catch (IOException var27) { // L: 3378
																						FaceNormal.method4619(); // L: 3379
																					}

																					return; // L: 3381
																				}
																			} while(var46 == null); // L: 3174
																		} while(var46.field2312 == null);

																		if (var46.field2312.childIndex < 0) { // L: 3175
																			break;
																		}

																		var45 = class175.getWidget(var46.field2312.parentId); // L: 3176
																	} while(var45 == null || var45.children == null || var45.children.length == 0 || var46.field2312.childIndex >= var45.children.length || var46.field2312 != var45.children[var46.field2312.childIndex]); // L: 3177

																	if (var46.field2312.type == 11 && var46.field2307 == 0) { // L: 3181
																		switch(var46.field2312.method6174()) { // L: 3182
																		case 0:
																			ModeWhere.openURL(var46.field2312.method6177(), true, false); // L: 3184
																			break; // L: 3185
																		case 1:
																			var5 = Clock.getWidgetFlags(var46.field2312); // L: 3188
																			boolean var32 = (var5 >> 22 & 1) != 0; // L: 3190
																			if (var32) { // L: 3192
																				int[] var39 = var46.field2312.method6178(); // L: 3193
																				if (var39 != null) { // L: 3194
																					var26 = class136.getPacketBufferNode(ClientPacket.field3154, packetWriter.isaacCipher); // L: 3195
																					var26.packetBuffer.method8599(var39[2]); // L: 3196
																					var26.packetBuffer.method8536(var46.field2312.id); // L: 3197
																					var26.packetBuffer.method8599(var46.field2312.method6176()); // L: 3198
																					var26.packetBuffer.method8536(var39[1]); // L: 3199
																					var26.packetBuffer.writeShort(var46.field2312.childIndex); // L: 3200
																					var26.packetBuffer.writeInt(var39[0]); // L: 3201
																					packetWriter.addNode(var26); // L: 3202
																				}
																			}
																		}
																	} else if (var46.field2312.type == 12) { // L: 3208
																		class303 var48 = var46.field2312.method6167(); // L: 3209
																		if (var48 != null && var48.method5878()) { // L: 3210
																			switch(var46.field2307) { // L: 3211
																			case 0:
																				field572.method4066(var46.field2312); // L: 3213
																				var48.method5880(true); // L: 3214
																				var48.method5919(var46.field2311, var46.field2310, field747.method4106(82), field747.method4106(81)); // L: 3215
																				break; // L: 3216
																			case 1:
																				var48.method6102(var46.field2311, var46.field2310); // L: 3218
																			}
																		}
																	}
																}
															}
														}

														var45 = var44.widget; // L: 3161
														if (var45.childIndex < 0) { // L: 3162
															break;
														}

														var40 = class175.getWidget(var45.parentId); // L: 3163
													} while(var40 == null || var40.children == null || var45.childIndex >= var40.children.length || var45 != var40.children[var45.childIndex]); // L: 3164

													WorldMapElement.runScriptEvent(var44); // L: 3168
												}
											}

											var45 = var44.widget; // L: 3149
											if (var45.childIndex < 0) { // L: 3150
												break;
											}

											var40 = class175.getWidget(var45.parentId); // L: 3151
										} while(var40 == null || var40.children == null || var45.childIndex >= var40.children.length || var45 != var40.children[var45.childIndex]); // L: 3152

										WorldMapElement.runScriptEvent(var44); // L: 3156
									}
								}

								var45 = var44.widget; // L: 3137
								if (var45.childIndex < 0) { // L: 3138
									break;
								}

								var40 = class175.getWidget(var45.parentId); // L: 3139
							} while(var40 == null || var40.children == null || var45.childIndex >= var40.children.length || var45 != var40.children[var45.childIndex]); // L: 3140

							WorldMapElement.runScriptEvent(var44); // L: 3144
						}
					}

					var30 = class136.getPacketBufferNode(ClientPacket.field3136, packetWriter.isaacCipher); // L: 2827
					var30.packetBuffer.writeByte(0); // L: 2828
					var3 = var30.packetBuffer.offset; // L: 2829
					ModelData0.performReflectionCheck(var30.packetBuffer); // L: 2830
					var30.packetBuffer.method8622(var30.packetBuffer.offset - var3); // L: 2831
					packetWriter.addNode(var30); // L: 2832
				}
			}
		}
	} // L: 2809

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1654731746"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = CollisionMap.canvasWidth; // L: 4294
		int var2 = Language.canvasHeight; // L: 4295
		if (super.contentWidth < var1) { // L: 4296
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) { // L: 4297
			var2 = super.contentHeight;
		}

		if (StructComposition.clientPreferences != null) { // L: 4298
			try {
				Client var3 = BuddyRankComparator.client; // L: 4300
				Object[] var4 = new Object[]{Message.getWindowedMode()}; // L: 4301
				JSObject.getWindow(var3).call("resize", var4); // L: 4304
			} catch (Throwable var5) { // L: 4307
			}
		}

	} // L: 4309

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-25398"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) { // L: 4312
			var1 = rootInterface; // L: 4313
			if (Players.loadInterface(var1)) { // L: 4315
				UserComparator10.drawModelComponents(class71.Widget_interfaceComponents[var1], -1); // L: 4316
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4319
			if (field731[var1]) { // L: 4320
				field732[var1] = true;
			}

			field733[var1] = field731[var1]; // L: 4321
			field731[var1] = false; // L: 4322
		}

		field808 = cycle; // L: 4324
		viewportX = -1; // L: 4325
		viewportY = -1; // L: 4326
		WorldMapID.hoveredItemContainer = null; // L: 4327
		if (rootInterface != -1) { // L: 4328
			rootWidgetCount = 0; // L: 4329
			HealthBar.drawWidgets(rootInterface, 0, 0, CollisionMap.canvasWidth, Language.canvasHeight, 0, 0, -1); // L: 4330
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4332
		if (showMouseCross) { // L: 4333
			if (mouseCrossColor == 1) { // L: 4334
				MouseHandler.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4335
			}

			if (mouseCrossColor == 2) { // L: 4337
				MouseHandler.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4338
			}
		}

		int var2;
		int var3;
		if (!isMenuOpen) { // L: 4341
			if (viewportX != -1) { // L: 4342
				var1 = viewportX; // L: 4343
				var2 = viewportY; // L: 4344
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) { // L: 4346 4347
					var3 = menuOptionsCount - 1; // L: 4350
					String var5;
					if (isItemSelected == 1 && menuOptionsCount < 2) { // L: 4354
						var5 = "Use" + " " + selectedItemName + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) { // L: 4355
						var5 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						String var6;
						if (var3 < 0) { // L: 4359
							var6 = ""; // L: 4360
						} else if (menuTargets[var3].length() > 0) { // L: 4363
							var6 = menuActions[var3] + " " + menuTargets[var3];
						} else {
							var6 = menuActions[var3]; // L: 4364
						}

						var5 = var6; // L: 4366
					}

					if (menuOptionsCount > 2) { // L: 4368
						var5 = var5 + MouseRecorder.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					class146.fontBold12.drawRandomAlphaAndSpacing(var5, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000); // L: 4369
				}
			}
		} else {
			GrandExchangeOfferOwnWorldComparator.method1219(); // L: 4373
		}

		if (gameDrawingMode == 3) { // L: 4374
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4375
				if (field733[var1]) { // L: 4376
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4377
				} else if (field732[var1]) { // L: 4379
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4380
				}
			}
		}

		var1 = class383.Client_plane; // L: 4384
		var2 = class155.localPlayer.x; // L: 4385
		var3 = class155.localPlayer.y; // L: 4386
		int var4 = field563; // L: 4387

		for (ObjectSound var14 = (ObjectSound)ObjectSound.objectSounds.last(); var14 != null; var14 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 4389
			if (var14.soundEffectId != -1 || var14.soundEffectIds != null) { // L: 4390
				int var12 = 0; // L: 4391
				if (var2 > var14.maxX * 128) { // L: 4392
					var12 += var2 - var14.maxX * 128;
				} else if (var2 < var14.x * 128) { // L: 4393
					var12 += var14.x * 128 - var2;
				}

				if (var3 > var14.maxY * 16384) { // L: 4394
					var12 += var3 - var14.maxY * 16384;
				} else if (var3 < var14.y * 16384) { // L: 4395
					var12 += var14.y * 16384 - var3;
				}

				if (var12 - 64 <= var14.field847 && StructComposition.clientPreferences.method2506() != 0 && var1 == var14.plane) { // L: 4396
					var12 -= 64; // L: 4407
					if (var12 < 0) { // L: 4408
						var12 = 0;
					}

					int var7 = (var14.field847 - var12) * StructComposition.clientPreferences.method2506() / var14.field847; // L: 4409
					Object var10000;
					if (var14.stream1 == null) { // L: 4410
						if (var14.soundEffectId >= 0) { // L: 4411
							var10000 = null; // L: 4412
							SoundEffect var8 = SoundEffect.readSoundEffect(WorldMapSection0.archive9, var14.soundEffectId, 0);
							if (var8 != null) { // L: 4413
								RawSound var9 = var8.toRawSound().resample(DevicePcmPlayerProvider.decimator); // L: 4414
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var7); // L: 4415
								var10.setNumLoops(-1); // L: 4416
								ApproximateRouteStrategy.pcmStreamMixer.addSubStream(var10); // L: 4417
								var14.stream1 = var10; // L: 4418
							}
						}
					} else {
						var14.stream1.method906(var7); // L: 4422
					}

					if (var14.stream2 == null) { // L: 4423
						if (var14.soundEffectIds != null && (var14.field850 -= var4) <= 0) { // L: 4424
							int var13 = (int)(Math.random() * (double)var14.soundEffectIds.length); // L: 4425
							var10000 = null; // L: 4426
							SoundEffect var15 = SoundEffect.readSoundEffect(WorldMapSection0.archive9, var14.soundEffectIds[var13], 0);
							if (var15 != null) { // L: 4427
								RawSound var16 = var15.toRawSound().resample(DevicePcmPlayerProvider.decimator); // L: 4428
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var16, 100, var7); // L: 4429
								var11.setNumLoops(0); // L: 4430
								ApproximateRouteStrategy.pcmStreamMixer.addSubStream(var11); // L: 4431
								var14.stream2 = var11; // L: 4432
								var14.field850 = var14.field842 + (int)(Math.random() * (double)(var14.field839 - var14.field842)); // L: 4433
							}
						}
					} else {
						var14.stream2.method906(var7); // L: 4438
						if (!var14.stream2.hasNext()) { // L: 4439
							var14.stream2 = null; // L: 4440
						}
					}
				} else {
					if (var14.stream1 != null) { // L: 4397
						ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(var14.stream1); // L: 4398
						var14.stream1 = null; // L: 4399
					}

					if (var14.stream2 != null) { // L: 4401
						ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(var14.stream2); // L: 4402
						var14.stream2 = null; // L: 4403
					}
				}
			}
		}

		field563 = 0; // L: 4445
	} // L: 4446

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Lde;II)Z",
		garbageValue = "-1959466740"
	)
	boolean method1432(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 6050
			class281.friendsChatManager = null; // L: 6051
		} else {
			if (class281.friendsChatManager == null) { // L: 6054
				class281.friendsChatManager = new FriendsChatManager(SecureRandomFuture.loginType, BuddyRankComparator.client); // L: 6055
			}

			class281.friendsChatManager.method7444(var1.packetBuffer, var2); // L: 6057
		}

		field610 = cycleCntr; // L: 6060
		class281.FriendsChatManager_inFriendsChat = true; // L: 6061
		var1.serverPacket = null; // L: 6063
		return true; // L: 6064
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Lde;I)Z",
		garbageValue = "-1099758914"
	)
	boolean method1428(PacketWriter var1) {
		if (class281.friendsChatManager != null) { // L: 6068
			class281.friendsChatManager.method7437(var1.packetBuffer); // L: 6069
		}

		field610 = cycleCntr; // L: 6072
		class281.FriendsChatManager_inFriendsChat = true; // L: 6073
		var1.serverPacket = null; // L: 6075
		return true; // L: 6076
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(Lde;I)Z",
		garbageValue = "-42701230"
	)
	final boolean method1727(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6081
		PacketBuffer var3 = var1.packetBuffer; // L: 6082
		if (var2 == null) { // L: 6083
			return false;
		} else {
			String var21;
			int var27;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6085
					if (var1.field1430) { // L: 6086
						if (!var2.isAvailable(1)) { // L: 6087
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6088
						var1.field1420 = 0; // L: 6089
						var1.field1430 = false; // L: 6090
					}

					var3.offset = 0; // L: 6092
					if (var3.method8496()) { // L: 6093
						if (!var2.isAvailable(1)) { // L: 6094
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6095
						var1.field1420 = 0; // L: 6096
					}

					var1.field1430 = true; // L: 6098
					ServerPacket[] var4 = EnumComposition.ServerPacket_values(); // L: 6099
					var5 = var3.readSmartByteShortIsaac(); // L: 6100
					if (var5 < 0 || var5 >= var4.length) { // L: 6101
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6102
					var1.serverPacketLength = var1.serverPacket.length; // L: 6103
				}

				if (var1.serverPacketLength == -1) { // L: 6105
					if (!var2.isAvailable(1)) { // L: 6106
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6107
					var1.serverPacketLength = var3.array[0] & 255; // L: 6108
				}

				if (var1.serverPacketLength == -2) { // L: 6110
					if (!var2.isAvailable(2)) { // L: 6111
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6112
					var3.offset = 0; // L: 6113
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6114
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6116
					return false;
				}

				var3.offset = 0; // L: 6117
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6118
				var1.field1420 = 0; // L: 6119
				timer.method7352(); // L: 6120
				var1.field1433 = var1.field1432; // L: 6121
				var1.field1432 = var1.field1431; // L: 6122
				var1.field1431 = var1.serverPacket; // L: 6123
				if (ServerPacket.field3208 == var1.serverPacket) { // L: 6124
					DevicePcmPlayerProvider.method315(class276.field3171); // L: 6125
					var1.serverPacket = null; // L: 6126
					return true; // L: 6127
				}

				if (ServerPacket.field3193 == var1.serverPacket) { // L: 6129
					DevicePcmPlayerProvider.method315(class276.field3168); // L: 6130
					var1.serverPacket = null; // L: 6131
					return true; // L: 6132
				}

				if (ServerPacket.field3255 == var1.serverPacket) { // L: 6134
					class312.updateNpcs(false, var3); // L: 6135
					var1.serverPacket = null; // L: 6136
					return true; // L: 6137
				}

				if (ServerPacket.field3206 == var1.serverPacket) { // L: 6139
					if (LoginScreenAnimation.field1286 == null) { // L: 6140
						LoginScreenAnimation.field1286 = new class414(class34.Ignored_cached);
					}

					class475 var54 = class34.Ignored_cached.method7877(var3); // L: 6141
					LoginScreenAnimation.field1286.field4644.vmethod8269(var54.field4980, var54.field4981); // L: 6142
					field712[++field713 - 1 & 31] = var54.field4980; // L: 6143
					var1.serverPacket = null; // L: 6144
					return true; // L: 6145
				}

				int var20;
				if (ServerPacket.field3246 == var1.serverPacket) { // L: 6147
					InvDefinition.field1918 = var3.readUnsignedByte(); // L: 6148
					class125.field1560 = var3.method8699(); // L: 6149

					while (var3.offset < var1.serverPacketLength) { // L: 6150
						var20 = var3.readUnsignedByte(); // L: 6151
						class276 var79 = SpotAnimationDefinition.method3732()[var20]; // L: 6152
						DevicePcmPlayerProvider.method315(var79); // L: 6153
					}

					var1.serverPacket = null; // L: 6155
					return true; // L: 6156
				}

				Widget var6;
				int var7;
				int var8;
				int var9;
				if (ServerPacket.field3225 == var1.serverPacket) { // L: 6158
					var20 = var3.readInt(); // L: 6159
					var5 = var3.readUnsignedShort(); // L: 6160
					if (var20 < -70000) { // L: 6161
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 6163
						var6 = class175.getWidget(var20);
					} else {
						var6 = null; // L: 6164
					}

					for (; var3.offset < var1.serverPacketLength; class12.itemContainerSetItem(var5, var7, var8 - 1, var9)) { // L: 6165 6179
						var7 = var3.readUShortSmart(); // L: 6166
						var8 = var3.readUnsignedShort(); // L: 6167
						var9 = 0; // L: 6168
						if (var8 != 0) { // L: 6169
							var9 = var3.readUnsignedByte(); // L: 6170
							if (var9 == 255) { // L: 6171
								var9 = var3.readInt();
							}
						}

						if (var6 != null && var7 >= 0 && var7 < var6.itemIds.length) { // L: 6173 6174
							var6.itemIds[var7] = var8; // L: 6175
							var6.itemQuantities[var7] = var9; // L: 6176
						}
					}

					if (var6 != null) { // L: 6181
						class69.invalidateWidget(var6);
					}

					class136.method3073(); // L: 6182
					field708[++field709 - 1 & 31] = var5 & 32767; // L: 6183
					var1.serverPacket = null; // L: 6184
					return true; // L: 6185
				}

				GameObject var14;
				int var15;
				int var16;
				String var26;
				byte var74;
				if (ServerPacket.field3283 == var1.serverPacket) { // L: 6187
					var74 = var3.readByte(); // L: 6188
					var21 = var3.readStringCp1252NullTerminated(); // L: 6189
					long var22 = (long)var3.readUnsignedShort(); // L: 6190
					long var24 = (long)var3.readMedium(); // L: 6191
					PlayerType var60 = (PlayerType)World.findEnumerated(class149.PlayerType_values(), var3.readUnsignedByte()); // L: 6192
					long var11 = var24 + (var22 << 32); // L: 6193
					boolean var68 = false; // L: 6194
					var14 = null; // L: 6195
					ClanChannel var69 = var74 >= 0 ? currentClanChannels[var74] : VarcInt.guestClanChannel; // L: 6197
					if (var69 == null) { // L: 6198
						var68 = true; // L: 6199
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var60.isUser && DefaultsGroup.friendSystem.isIgnored(new Username(var21, SecureRandomFuture.loginType))) { // L: 6208 6209
									var68 = true;
								}
								break;
							}

							if (var11 == field523[var15]) { // L: 6203
								var68 = true; // L: 6204
								break; // L: 6205
							}

							++var15; // L: 6202
						}
					}

					if (!var68) { // L: 6212
						field523[field746] = var11; // L: 6213
						field746 = (field746 + 1) % 100; // L: 6214
						var26 = AbstractFont.escapeBrackets(class153.method3285(var3)); // L: 6215
						var16 = var74 >= 0 ? 41 : 44; // L: 6216
						if (var60.modIcon != -1) { // L: 6217
							class381.addChatMessage(var16, class456.method8410(var60.modIcon) + var21, var26, var69.name);
						} else {
							class381.addChatMessage(var16, var21, var26, var69.name); // L: 6218
						}
					}

					var1.serverPacket = null; // L: 6220
					return true; // L: 6221
				}

				if (ServerPacket.field3272 == var1.serverPacket) { // L: 6223
					isCameraLocked = true; // L: 6224
					field772 = false; // L: 6225
					class155.field1787 = var3.readUnsignedByte() * 16384; // L: 6226
					class34.field208 = var3.readUnsignedByte() * 128; // L: 6227
					Script.field1001 = var3.readUnsignedShort(); // L: 6228
					class31.field181 = var3.readUnsignedByte(); // L: 6229
					Tile.field2481 = var3.readUnsignedByte(); // L: 6230
					if (Tile.field2481 >= 100) { // L: 6231
						class145.cameraX = class155.field1787 * 128 + 64; // L: 6232
						ClanChannel.cameraZ = class34.field208 * 16384 + 64; // L: 6233
						class414.cameraY = SpotAnimationDefinition.getTileHeight(class145.cameraX, ClanChannel.cameraZ, class383.Client_plane) - Script.field1001; // L: 6234
					}

					var1.serverPacket = null; // L: 6236
					return true; // L: 6237
				}

				if (ServerPacket.field3195 == var1.serverPacket) { // L: 6239
					var20 = var3.method8591(); // L: 6240
					if (var20 == 65535) { // L: 6241
						var20 = -1;
					}

					class169.playSong(var20); // L: 6242
					var1.serverPacket = null; // L: 6243
					return true; // L: 6244
				}

				if (ServerPacket.field3248 == var1.serverPacket) { // L: 6246
					var20 = var3.method8629(); // L: 6247
					var5 = var3.method8530(); // L: 6248
					if (var5 == 65535) { // L: 6249
						var5 = -1;
					}

					class16.method197(var5, var20); // L: 6250
					var1.serverPacket = null; // L: 6251
					return true; // L: 6252
				}

				if (ServerPacket.field3192 == var1.serverPacket) { // L: 6254
					LoginScreenAnimation.field1286 = null; // L: 6255
					var1.serverPacket = null; // L: 6256
					return true; // L: 6257
				}

				if (ServerPacket.field3267 == var1.serverPacket) { // L: 6259
					field513 = cycleCntr; // L: 6260
					var74 = var3.readByte(); // L: 6261
					class153 var78 = new class153(var3); // L: 6262
					ClanChannel var63;
					if (var74 >= 0) { // L: 6264
						var63 = currentClanChannels[var74];
					} else {
						var63 = VarcInt.guestClanChannel; // L: 6265
					}

					var78.method3284(var63); // L: 6266
					var1.serverPacket = null; // L: 6267
					return true; // L: 6268
				}

				if (ServerPacket.field3244 == var1.serverPacket) { // L: 6270
					var20 = var3.method8604(); // L: 6271
					var5 = var3.method8592(); // L: 6272
					var27 = var5 >> 10 & 31; // L: 6273
					var7 = var5 >> 5 & 31; // L: 6274
					var8 = var5 & 31; // L: 6275
					var9 = (var7 << 11) + (var27 << 19) + (var8 << 3); // L: 6276
					Widget var59 = class175.getWidget(var20); // L: 6277
					if (var9 != var59.color) { // L: 6278
						var59.color = var9; // L: 6279
						class69.invalidateWidget(var59); // L: 6280
					}

					var1.serverPacket = null; // L: 6282
					return true; // L: 6283
				}

				if (ServerPacket.field3290 == var1.serverPacket) { // L: 6285
					for (var20 = 0; var20 < players.length; ++var20) { // L: 6286
						if (players[var20] != null) { // L: 6287
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) { // L: 6289
						if (npcs[var20] != null) { // L: 6290
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 6292
					return true; // L: 6293
				}

				if (ServerPacket.field3239 == var1.serverPacket) { // L: 6295
					var20 = var3.readUnsignedByte(); // L: 6296
					if (var3.readUnsignedByte() == 0) { // L: 6297
						grandExchangeOffers[var20] = new GrandExchangeOffer(); // L: 6298
						var3.offset += 18; // L: 6299
					} else {
						--var3.offset; // L: 6302
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false); // L: 6303
					}

					field777 = cycleCntr; // L: 6305
					var1.serverPacket = null; // L: 6306
					return true; // L: 6307
				}

				if (ServerPacket.field3233 == var1.serverPacket) { // L: 6309
					InterfaceParent.loadRegions(false, var1.packetBuffer); // L: 6310
					var1.serverPacket = null; // L: 6311
					return true; // L: 6312
				}

				if (ServerPacket.field3190 == var1.serverPacket) { // L: 6314
					World var53 = new World(); // L: 6315
					var53.host = var3.readStringCp1252NullTerminated(); // L: 6316
					var53.id = var3.readUnsignedShort(); // L: 6317
					var5 = var3.readInt(); // L: 6318
					var53.properties = var5; // L: 6319
					class140.method3102(45); // L: 6320
					var2.close(); // L: 6321
					var2 = null; // L: 6322
					UserComparator6.changeWorld(var53); // L: 6323
					var1.serverPacket = null; // L: 6324
					return false; // L: 6325
				}

				if (ServerPacket.field3229 == var1.serverPacket) { // L: 6327
					GameEngine.method563(); // L: 6328
					var74 = var3.readByte(); // L: 6329
					if (var1.serverPacketLength == 1) { // L: 6330
						if (var74 >= 0) { // L: 6331
							currentClanSettings[var74] = null;
						} else {
							class20.guestClanSettings = null; // L: 6332
						}

						var1.serverPacket = null; // L: 6333
						return true; // L: 6334
					}

					if (var74 >= 0) { // L: 6336
						currentClanSettings[var74] = new ClanSettings(var3); // L: 6337
					} else {
						class20.guestClanSettings = new ClanSettings(var3); // L: 6340
					}

					var1.serverPacket = null; // L: 6342
					return true; // L: 6343
				}

				if (ServerPacket.field3221 == var1.serverPacket) { // L: 6345
					DevicePcmPlayerProvider.method315(class276.field3160); // L: 6346
					var1.serverPacket = null; // L: 6347
					return true; // L: 6348
				}

				if (ServerPacket.field3264 == var1.serverPacket) { // L: 6350
					LoginScreenAnimation.privateChatMode = SceneTilePaint.method4808(var3.readUnsignedByte()); // L: 6351
					var1.serverPacket = null; // L: 6352
					return true; // L: 6353
				}

				int var13;
				long var28;
				long var30;
				String var35;
				String var49;
				if (ServerPacket.field3277 == var1.serverPacket) { // L: 6355
					var49 = var3.readStringCp1252NullTerminated(); // L: 6356
					var28 = (long)var3.readUnsignedShort(); // L: 6357
					var30 = (long)var3.readMedium(); // L: 6358
					PlayerType var32 = (PlayerType)World.findEnumerated(class149.PlayerType_values(), var3.readUnsignedByte()); // L: 6359
					long var33 = var30 + (var28 << 32); // L: 6360
					boolean var64 = false; // L: 6361

					for (var13 = 0; var13 < 100; ++var13) { // L: 6362
						if (field523[var13] == var33) { // L: 6363
							var64 = true; // L: 6364
							break; // L: 6365
						}
					}

					if (DefaultsGroup.friendSystem.isIgnored(new Username(var49, SecureRandomFuture.loginType))) { // L: 6368
						var64 = true;
					}

					if (!var64 && field691 == 0) { // L: 6369
						field523[field746] = var33; // L: 6370
						field746 = (field746 + 1) % 100; // L: 6371
						var35 = AbstractFont.escapeBrackets(VarbitComposition.method3779(class153.method3285(var3))); // L: 6372
						byte var83;
						if (var32.isPrivileged) { // L: 6374
							var83 = 7;
						} else {
							var83 = 3; // L: 6375
						}

						if (var32.modIcon != -1) { // L: 6376
							KitDefinition.addGameMessage(var83, class456.method8410(var32.modIcon) + var49, var35);
						} else {
							KitDefinition.addGameMessage(var83, var49, var35); // L: 6377
						}
					}

					var1.serverPacket = null; // L: 6379
					return true; // L: 6380
				}

				int var12;
				int var17;
				int var18;
				Projectile var19;
				int var36;
				int var38;
				byte var61;
				int var84;
				byte var87;
				if (ServerPacket.field3279 == var1.serverPacket) { // L: 6382
					var61 = var3.readByte(); // L: 6398
					var27 = var3.method8595(); // L: 6399
					var20 = var27 >> 16; // L: 6400
					var5 = var27 >> 8 & 255; // L: 6401
					var7 = var20 + (var27 >> 4 & 7); // L: 6402
					var8 = var5 + (var27 & 7); // L: 6403
					var84 = var3.readShort(); // L: 6404
					var15 = var3.method8592(); // L: 6405
					var87 = var3.method8718(); // L: 6406
					var17 = var3.method8699(); // L: 6407
					var13 = var3.method8702() * 4; // L: 6408
					var16 = var3.method8592(); // L: 6409
					var18 = var3.readUnsignedByte(); // L: 6410
					var12 = var3.method8591(); // L: 6411
					var36 = var3.method8702() * 4; // L: 6412
					var9 = var61 + var7; // L: 6413
					var38 = var87 + var8; // L: 6414
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var9 >= 0 && var38 >= 0 && var9 < 104 && var38 < 104 && var12 != 65535) { // L: 6415
						var7 = var7 * 128 + 64; // L: 6416
						var8 = var8 * 128 + 64; // L: 6417
						var9 = var9 * 128 + 64; // L: 6418
						var38 = var38 * 128 + 64; // L: 6419
						var19 = new Projectile(var12, class383.Client_plane, var7, var8, SpotAnimationDefinition.getTileHeight(var7, var8, class383.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var84, var36); // L: 6420
						var19.setDestination(var9, var38, SpotAnimationDefinition.getTileHeight(var9, var38, class383.Client_plane) - var36, var15 + cycle); // L: 6421
						projectiles.addFirst(var19); // L: 6422
					}

					var1.serverPacket = null; // L: 6424
					return true; // L: 6425
				}

				if (ServerPacket.field3200 == var1.serverPacket) { // L: 6427
					var36 = var3.method8581() * 4; // L: 6443
					var87 = var3.method8718(); // L: 6444
					var17 = var3.readUnsignedByte(); // L: 6445
					var61 = var3.method8718(); // L: 6446
					var12 = var3.method8592(); // L: 6447
					var84 = var3.method8674(); // L: 6448
					var27 = var3.method8594(); // L: 6449
					var20 = var27 >> 16; // L: 6450
					var5 = var27 >> 8 & 255; // L: 6451
					var7 = var20 + (var27 >> 4 & 7); // L: 6452
					var8 = var5 + (var27 & 7); // L: 6453
					var13 = var3.readUnsignedByte() * 4; // L: 6454
					var18 = var3.method8699(); // L: 6455
					var15 = var3.method8530(); // L: 6456
					var16 = var3.method8592(); // L: 6457
					var9 = var61 + var7; // L: 6458
					var38 = var87 + var8; // L: 6459
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var9 >= 0 && var38 >= 0 && var9 < 104 && var38 < 104 && var12 != 65535) { // L: 6460
						var7 = var7 * 128 + 64; // L: 6461
						var8 = var8 * 128 + 64; // L: 6462
						var9 = var9 * 128 + 64; // L: 6463
						var38 = var38 * 128 + 64; // L: 6464
						var19 = new Projectile(var12, class383.Client_plane, var7, var8, SpotAnimationDefinition.getTileHeight(var7, var8, class383.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var84, var36); // L: 6465
						var19.setDestination(var9, var38, SpotAnimationDefinition.getTileHeight(var9, var38, class383.Client_plane) - var36, var15 + cycle); // L: 6466
						projectiles.addFirst(var19); // L: 6467
					}

					var1.serverPacket = null; // L: 6469
					return true; // L: 6470
				}

				if (ServerPacket.field3209 == var1.serverPacket) { // L: 6472
					DefaultsGroup.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 6473
					AbstractWorldMapData.FriendSystem_invalidateIgnoreds(); // L: 6474
					field715 = cycleCntr; // L: 6475
					var1.serverPacket = null; // L: 6476
					return true; // L: 6477
				}

				if (ServerPacket.field3187 == var1.serverPacket) { // L: 6479
					var20 = var3.method8591(); // L: 6480
					byte var70 = var3.method8701(); // L: 6481
					Varps.Varps_temp[var20] = var70; // L: 6482
					if (Varps.Varps_main[var20] != var70) { // L: 6483
						Varps.Varps_main[var20] = var70; // L: 6484
					}

					MouseRecorder.changeGameOptions(var20); // L: 6486
					field706[++field707 - 1 & 31] = var20; // L: 6487
					var1.serverPacket = null; // L: 6488
					return true; // L: 6489
				}

				if (ServerPacket.field3249 == var1.serverPacket) { // L: 6491
					DefaultsGroup.friendSystem.method1822(); // L: 6492
					field715 = cycleCntr; // L: 6493
					var1.serverPacket = null; // L: 6494
					return true; // L: 6495
				}

				if (ServerPacket.field3282 == var1.serverPacket) { // L: 6497
					var20 = var3.method8581(); // L: 6498
					var21 = var3.readStringCp1252NullTerminated(); // L: 6499
					var27 = var3.readUnsignedByte(); // L: 6500
					if (var27 >= 1 && var27 <= 8) { // L: 6501
						if (var21.equalsIgnoreCase("null")) { // L: 6502
							var21 = null;
						}

						playerMenuActions[var27 - 1] = var21; // L: 6503
						playerOptionsPriorities[var27 - 1] = var20 == 0; // L: 6504
					}

					var1.serverPacket = null; // L: 6506
					return true; // L: 6507
				}

				if (ServerPacket.field3230 == var1.serverPacket) { // L: 6509
					var20 = var3.method8530(); // L: 6514
					Player var92;
					if (var20 == localPlayerIndex) { // L: 6515
						var92 = class155.localPlayer; // L: 6516
					} else {
						var92 = players[var20]; // L: 6519
					}

					var5 = var3.method8591(); // L: 6521
					var27 = var3.method8604(); // L: 6522
					if (var92 != null) { // L: 6523
						var92.spotAnimation = var5; // L: 6524
						var92.spotAnimationHeight = var27 >> 16; // L: 6525
						var92.field1227 = (var27 & 65535) + cycle; // L: 6526
						var92.spotAnimationFrame = 0; // L: 6527
						var92.spotAnimationFrameCycle = 0; // L: 6528
						if (var92.field1227 > cycle) { // L: 6529
							var92.spotAnimationFrame = -1; // L: 6530
						}

						if (var92.spotAnimation == 65535) { // L: 6532
							var92.spotAnimation = -1; // L: 6533
						}
					}

					var1.serverPacket = null; // L: 6536
					return true; // L: 6537
				}

				if (ServerPacket.field3278 == var1.serverPacket) { // L: 6539
					InterfaceParent.loadRegions(true, var1.packetBuffer); // L: 6540
					var1.serverPacket = null; // L: 6541
					return true; // L: 6542
				}

				if (ServerPacket.field3212 == var1.serverPacket) { // L: 6544
					rebootTimer = var3.method8530() * 30; // L: 6545
					field721 = cycleCntr; // L: 6546
					var1.serverPacket = null; // L: 6547
					return true; // L: 6548
				}

				if (ServerPacket.field3232 == var1.serverPacket) { // L: 6550
					field513 = cycleCntr; // L: 6551
					var74 = var3.readByte(); // L: 6552
					if (var1.serverPacketLength == 1) { // L: 6553
						if (var74 >= 0) { // L: 6554
							currentClanChannels[var74] = null;
						} else {
							VarcInt.guestClanChannel = null; // L: 6555
						}

						var1.serverPacket = null; // L: 6556
						return true; // L: 6557
					}

					if (var74 >= 0) { // L: 6559
						currentClanChannels[var74] = new ClanChannel(var3); // L: 6560
					} else {
						VarcInt.guestClanChannel = new ClanChannel(var3); // L: 6563
					}

					var1.serverPacket = null; // L: 6565
					return true; // L: 6566
				}

				if (ServerPacket.field3183 == var1.serverPacket) { // L: 6568
					var20 = var3.method8530(); // L: 6569
					rootInterface = var20; // L: 6570
					this.resizeRoot(false); // L: 6571
					class69.Widget_resetModelFrames(var20); // L: 6572
					class31.runWidgetOnLoadListener(rootInterface); // L: 6573

					for (var5 = 0; var5 < 100; ++var5) { // L: 6574
						field731[var5] = true;
					}

					var1.serverPacket = null; // L: 6575
					return true; // L: 6576
				}

				if (ServerPacket.field3284 == var1.serverPacket) { // L: 6578
					DevicePcmPlayerProvider.method315(class276.field3164); // L: 6579
					var1.serverPacket = null; // L: 6580
					return true; // L: 6581
				}

				if (ServerPacket.field3295 == var1.serverPacket) { // L: 6583
					class136.method3073(); // L: 6584
					field629 = var3.readUnsignedShort(); // L: 6585
					field721 = cycleCntr; // L: 6586
					var1.serverPacket = null; // L: 6587
					return true; // L: 6588
				}

				if (ServerPacket.field3243 == var1.serverPacket) { // L: 6590
					for (var20 = 0; var20 < VarpDefinition.field1922; ++var20) { // L: 6591
						VarpDefinition var77 = class109.VarpDefinition_get(var20); // L: 6592
						if (var77 != null) { // L: 6593
							Varps.Varps_temp[var20] = 0; // L: 6594
							Varps.Varps_main[var20] = 0; // L: 6595
						}
					}

					class136.method3073(); // L: 6598
					field707 += 32; // L: 6599
					var1.serverPacket = null; // L: 6600
					return true; // L: 6601
				}

				if (ServerPacket.field3237 == var1.serverPacket) { // L: 6603
					isCameraLocked = false; // L: 6604

					for (var20 = 0; var20 < 5; ++var20) { // L: 6605
						field773[var20] = false;
					}

					var1.serverPacket = null; // L: 6606
					return true; // L: 6607
				}

				Widget var86;
				if (ServerPacket.field3280 == var1.serverPacket) { // L: 6609
					var20 = var3.method8593(); // L: 6610
					var5 = var3.method8604(); // L: 6611
					var27 = var3.readShort(); // L: 6612
					var86 = class175.getWidget(var5); // L: 6613
					if (var27 != var86.rawX || var20 != var86.rawY || var86.xAlignment != 0 || var86.yAlignment != 0) { // L: 6614
						var86.rawX = var27; // L: 6615
						var86.rawY = var20; // L: 6616
						var86.xAlignment = 0; // L: 6617
						var86.yAlignment = 0; // L: 6618
						class69.invalidateWidget(var86); // L: 6619
						this.alignWidget(var86); // L: 6620
						if (var86.type == 0) { // L: 6621
							class169.revalidateWidgetScroll(class71.Widget_interfaceComponents[var5 >> 16], var86, false);
						}
					}

					var1.serverPacket = null; // L: 6623
					return true; // L: 6624
				}

				if (ServerPacket.field3215 == var1.serverPacket && isCameraLocked) { // L: 6626 6627
					field772 = true; // L: 6628
					class31.field181 = var3.readUnsignedByte(); // L: 6629
					Tile.field2481 = var3.readUnsignedByte(); // L: 6630
					class415.field4647 = var3.readUnsignedByte(); // L: 6631
					LoginScreenAnimation.field1283 = var3.readUnsignedByte(); // L: 6632

					for (var20 = 0; var20 < 5; ++var20) { // L: 6633
						field773[var20] = false;
					}

					var1.serverPacket = null; // L: 6634
					return true; // L: 6635
				}

				if (ServerPacket.field3259 == var1.serverPacket) { // L: 6638
					class136.method3073(); // L: 6639
					var20 = var3.method8604(); // L: 6640
					var5 = var3.method8702(); // L: 6641
					var27 = var3.method8702(); // L: 6642
					experience[var27] = var20; // L: 6643
					currentLevels[var27] = var5; // L: 6644
					levels[var27] = 1; // L: 6645

					for (var7 = 0; var7 < 98; ++var7) { // L: 6646
						if (var20 >= Skills.Skills_experienceTable[var7]) {
							levels[var27] = var7 + 2;
						}
					}

					field636[++field711 - 1 & 31] = var27; // L: 6647
					var1.serverPacket = null; // L: 6648
					return true; // L: 6649
				}

				if (ServerPacket.field3205 == var1.serverPacket) { // L: 6651
					GameEngine.method563(); // L: 6652
					var74 = var3.readByte(); // L: 6653
					class139 var76 = new class139(var3); // L: 6654
					ClanSettings var58;
					if (var74 >= 0) { // L: 6656
						var58 = currentClanSettings[var74];
					} else {
						var58 = class20.guestClanSettings; // L: 6657
					}

					var76.method3094(var58); // L: 6658
					var1.serverPacket = null; // L: 6659
					return true; // L: 6660
				}

				if (ServerPacket.field3296 == var1.serverPacket) { // L: 6662
					var20 = var3.readInt(); // L: 6663
					var5 = var3.method8702(); // L: 6664
					short var81 = (short)var3.readShort(); // L: 6665
					var7 = var3.method8592(); // L: 6666
					NPC var91 = npcs[var7]; // L: 6667
					if (var91 != null) { // L: 6668
						var91.method2539(var5, var20, var81); // L: 6669
					}

					var1.serverPacket = null; // L: 6671
					return true; // L: 6672
				}

				if (ServerPacket.field3228 == var1.serverPacket) { // L: 6674
					hintArrowType = var3.readUnsignedByte(); // L: 6675
					if (hintArrowType == 1) { // L: 6676
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 6677
						if (hintArrowType == 2) { // L: 6678
							field531 = 64; // L: 6679
							field626 = 4096; // L: 6680
						}

						if (hintArrowType == 3) { // L: 6682
							field531 = 0; // L: 6683
							field626 = 4096; // L: 6684
						}

						if (hintArrowType == 4) { // L: 6686
							field531 = 128; // L: 6687
							field626 = 4096; // L: 6688
						}

						if (hintArrowType == 5) { // L: 6690
							field531 = 64; // L: 6691
							field626 = 0; // L: 6692
						}

						if (hintArrowType == 6) { // L: 6694
							field531 = 64; // L: 6695
							field626 = 8192; // L: 6696
						}

						hintArrowType = 2; // L: 6698
						hintArrowX = var3.readUnsignedShort(); // L: 6699
						hintArrowY = var3.readUnsignedShort(); // L: 6700
						field530 = var3.readUnsignedByte() * 2; // L: 6701
					}

					if (hintArrowType == 10) { // L: 6703
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 6704
					return true; // L: 6705
				}

				if (ServerPacket.field3223 == var1.serverPacket) { // L: 6707
					DevicePcmPlayerProvider.method315(class276.field3157); // L: 6708
					var1.serverPacket = null; // L: 6709
					return true; // L: 6710
				}

				if (ServerPacket.field3289 == var1.serverPacket) { // L: 6712
					var27 = var3.readMedium(); // L: 6723
					var20 = var27 >> 16; // L: 6724
					var5 = var27 >> 8 & 255; // L: 6725
					var7 = var20 + (var27 >> 4 & 7); // L: 6726
					var8 = var5 + (var27 & 7); // L: 6727
					var9 = var3.method8702(); // L: 6728
					var38 = var9 >> 2; // L: 6729
					var84 = var9 & 3; // L: 6730
					var12 = field579[var38]; // L: 6731
					var13 = var3.method8530(); // L: 6732
					if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) { // L: 6733
						if (var12 == 0) { // L: 6734
							WallObject var67 = ReflectionCheck.scene.method4452(class383.Client_plane, var7, var8); // L: 6735
							if (var67 != null) { // L: 6736
								var15 = Occluder.Entity_unpackID(var67.tag); // L: 6737
								if (var38 == 2) { // L: 6738
									var67.renderable1 = new DynamicObject(var15, 2, var84 + 4, class383.Client_plane, var7, var8, var13, false, var67.renderable1); // L: 6739
									var67.renderable2 = new DynamicObject(var15, 2, var84 + 1 & 3, class383.Client_plane, var7, var8, var13, false, var67.renderable2); // L: 6740
								} else {
									var67.renderable1 = new DynamicObject(var15, var38, var84, class383.Client_plane, var7, var8, var13, false, var67.renderable1); // L: 6742
								}
							}
						} else if (var12 == 1) { // L: 6745
							DecorativeObject var66 = ReflectionCheck.scene.method4604(class383.Client_plane, var7, var8); // L: 6746
							if (var66 != null) { // L: 6747
								var15 = Occluder.Entity_unpackID(var66.tag); // L: 6748
								if (var38 != 4 && var38 != 5) { // L: 6749
									if (var38 == 6) { // L: 6752
										var66.renderable1 = new DynamicObject(var15, 4, var84 + 4, class383.Client_plane, var7, var8, var13, false, var66.renderable1); // L: 6753
									} else if (var38 == 7) { // L: 6755
										var66.renderable1 = new DynamicObject(var15, 4, (var84 + 2 & 3) + 4, class383.Client_plane, var7, var8, var13, false, var66.renderable1); // L: 6756
									} else if (var38 == 8) { // L: 6758
										var66.renderable1 = new DynamicObject(var15, 4, var84 + 4, class383.Client_plane, var7, var8, var13, false, var66.renderable1); // L: 6759
										var66.renderable2 = new DynamicObject(var15, 4, (var84 + 2 & 3) + 4, class383.Client_plane, var7, var8, var13, false, var66.renderable2); // L: 6760
									}
								} else {
									var66.renderable1 = new DynamicObject(var15, 4, var84, class383.Client_plane, var7, var8, var13, false, var66.renderable1); // L: 6750
								}
							}
						} else if (var12 == 2) { // L: 6764
							var14 = ReflectionCheck.scene.getGameObject(class383.Client_plane, var7, var8); // L: 6765
							if (var38 == 11) { // L: 6766
								var38 = 10; // L: 6767
							}

							if (var14 != null) { // L: 6769
								var14.renderable = new DynamicObject(Occluder.Entity_unpackID(var14.tag), var38, var84, class383.Client_plane, var7, var8, var13, false, var14.renderable); // L: 6770
							}
						} else if (var12 == 3) { // L: 6773
							GroundObject var65 = ReflectionCheck.scene.getGroundObject(class383.Client_plane, var7, var8); // L: 6774
							if (var65 != null) { // L: 6775
								var65.renderable = new DynamicObject(Occluder.Entity_unpackID(var65.tag), 22, var84, class383.Client_plane, var7, var8, var13, false, var65.renderable); // L: 6776
							}
						}
					}

					var1.serverPacket = null; // L: 6780
					return true; // L: 6781
				}

				if (ServerPacket.field3260 == var1.serverPacket) { // L: 6783
					class19.updatePlayers(var3, var1.serverPacketLength); // L: 6784
					WorldMapID.method5276(); // L: 6785
					var1.serverPacket = null; // L: 6786
					return true; // L: 6787
				}

				if (ServerPacket.field3227 == var1.serverPacket) { // L: 6789
					class200.field2314 = true; // L: 6790
					class19.updatePlayers(var3, var1.serverPacketLength); // L: 6791
					WorldMapID.method5276(); // L: 6792
					var1.serverPacket = null; // L: 6793
					return true; // L: 6794
				}

				InterfaceParent var85;
				if (ServerPacket.field3247 == var1.serverPacket) { // L: 6796
					var20 = var3.method8760(); // L: 6797
					var5 = var3.method8702(); // L: 6798
					var27 = var3.readUnsignedShort(); // L: 6799
					var85 = (InterfaceParent)interfaceParents.get((long)var20); // L: 6800
					if (var85 != null) { // L: 6801
						class9.closeInterface(var85, var27 != var85.group);
					}

					class7.method44(var20, var27, var5); // L: 6802
					var1.serverPacket = null; // L: 6803
					return true; // L: 6804
				}

				if (ServerPacket.field3288 == var1.serverPacket) { // L: 6806
					var20 = var3.method8585(); // L: 6807
					var5 = var3.readUnsignedShort(); // L: 6808
					var27 = var3.readUnsignedShort(); // L: 6809
					var86 = class175.getWidget(var20); // L: 6810
					var86.field3598 = var27 + (var5 << 16); // L: 6811
					var1.serverPacket = null; // L: 6812
					return true; // L: 6813
				}

				if (ServerPacket.field3281 == var1.serverPacket) { // L: 6815
					return this.method1428(var1); // L: 6816
				}

				if (ServerPacket.field3292 == var1.serverPacket) { // L: 6818
					DevicePcmPlayerProvider.method315(class276.field3169); // L: 6819
					var1.serverPacket = null; // L: 6820
					return true; // L: 6821
				}

				if (ServerPacket.field3214 == var1.serverPacket) { // L: 6823
					return this.method1432(var1, 1); // L: 6824
				}

				Widget var40;
				if (ServerPacket.field3217 == var1.serverPacket) { // L: 6826
					var20 = var3.method8585(); // L: 6827
					var5 = var3.readInt(); // L: 6828
					InterfaceParent var57 = (InterfaceParent)interfaceParents.get((long)var20); // L: 6829
					var85 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6830
					if (var85 != null) { // L: 6831
						class9.closeInterface(var85, var57 == null || var85.group != var57.group);
					}

					if (var57 != null) { // L: 6832
						var57.remove(); // L: 6833
						interfaceParents.put(var57, (long)var5); // L: 6834
					}

					var40 = class175.getWidget(var20); // L: 6836
					if (var40 != null) { // L: 6837
						class69.invalidateWidget(var40);
					}

					var40 = class175.getWidget(var5); // L: 6838
					if (var40 != null) { // L: 6839
						class69.invalidateWidget(var40); // L: 6840
						class169.revalidateWidgetScroll(class71.Widget_interfaceComponents[var40.id >>> 16], var40, true); // L: 6841
					}

					if (rootInterface != -1) { // L: 6843
						GrandExchangeOfferAgeComparator.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 6844
					return true; // L: 6845
				}

				if (ServerPacket.field3297 == var1.serverPacket) { // L: 6847
					var20 = var3.method8760(); // L: 6848
					var5 = var3.readUnsignedShort(); // L: 6849
					var6 = class175.getWidget(var20); // L: 6850
					if (var6.modelType != 6 || var5 != var6.modelId) { // L: 6851
						var6.modelType = 6; // L: 6852
						var6.modelId = var5; // L: 6853
						class69.invalidateWidget(var6); // L: 6854
					}

					var1.serverPacket = null; // L: 6856
					return true; // L: 6857
				}

				boolean var55;
				String var56;
				if (ServerPacket.field3185 == var1.serverPacket) { // L: 6859
					var20 = var3.readUShortSmart(); // L: 6860
					var55 = var3.readUnsignedByte() == 1; // L: 6861
					var56 = ""; // L: 6862
					boolean var62 = false; // L: 6863
					if (var55) { // L: 6864
						var56 = var3.readStringCp1252NullTerminated(); // L: 6865
						if (DefaultsGroup.friendSystem.isIgnored(new Username(var56, SecureRandomFuture.loginType))) { // L: 6866
							var62 = true;
						}
					}

					String var90 = var3.readStringCp1252NullTerminated(); // L: 6868
					if (!var62) { // L: 6869
						KitDefinition.addGameMessage(var20, var56, var90);
					}

					var1.serverPacket = null; // L: 6870
					return true; // L: 6871
				}

				if (ServerPacket.field3294 == var1.serverPacket) { // L: 6873
					byte[] var51 = new byte[var1.serverPacketLength]; // L: 6874
					var3.method8492(var51, 0, var51.length); // L: 6875
					Buffer var75 = new Buffer(var51); // L: 6876
					var56 = var75.readStringCp1252NullTerminated(); // L: 6877
					ModeWhere.openURL(var56, true, false); // L: 6878
					var1.serverPacket = null; // L: 6879
					return true; // L: 6880
				}

				if (ServerPacket.field3238 == var1.serverPacket) { // L: 6882
					Player.logOut(); // L: 6883
					var1.serverPacket = null; // L: 6884
					return false; // L: 6885
				}

				if (ServerPacket.field3275 == var1.serverPacket) { // L: 6887
					var20 = var3.method8585(); // L: 6888
					var5 = var3.method8591(); // L: 6889
					var6 = class175.getWidget(var20); // L: 6890
					if (var6.modelType != 1 || var5 != var6.modelId) { // L: 6891
						var6.modelType = 1; // L: 6892
						var6.modelId = var5; // L: 6893
						class69.invalidateWidget(var6); // L: 6894
					}

					var1.serverPacket = null; // L: 6896
					return true; // L: 6897
				}

				if (ServerPacket.field3263 == var1.serverPacket) { // L: 6899
					var20 = var3.readShort(); // L: 6900
					var5 = var3.method8604(); // L: 6901
					var6 = class175.getWidget(var5); // L: 6902
					if (var20 != var6.sequenceId || var20 == -1) { // L: 6903
						var6.sequenceId = var20; // L: 6904
						var6.modelFrame = 0; // L: 6905
						var6.modelFrameCycle = 0; // L: 6906
						class69.invalidateWidget(var6); // L: 6907
					}

					var1.serverPacket = null; // L: 6909
					return true; // L: 6910
				}

				if (ServerPacket.field3203 == var1.serverPacket) { // L: 6912
					ParamComposition.field2121 = true; // L: 6913
					class312.updateNpcs(false, var3); // L: 6914
					var1.serverPacket = null; // L: 6915
					return true; // L: 6916
				}

				if (ServerPacket.field3194 == var1.serverPacket) { // L: 6918
					DevicePcmPlayerProvider.method315(class276.field3166); // L: 6919
					var1.serverPacket = null; // L: 6920
					return true; // L: 6921
				}

				if (ServerPacket.field3226 == var1.serverPacket) { // L: 6923
					DevicePcmPlayerProvider.method315(class276.field3167); // L: 6924
					var1.serverPacket = null; // L: 6925
					return true; // L: 6926
				}

				if (ServerPacket.field3236 == var1.serverPacket) { // L: 6928
					class125.field1560 = var3.method8581(); // L: 6929
					InvDefinition.field1918 = var3.method8699(); // L: 6930

					for (var20 = InvDefinition.field1918; var20 < InvDefinition.field1918 + 8; ++var20) { // L: 6931
						for (var5 = class125.field1560; var5 < class125.field1560 + 8; ++var5) { // L: 6932
							if (groundItems[class383.Client_plane][var20][var5] != null) { // L: 6933
								groundItems[class383.Client_plane][var20][var5] = null; // L: 6934
								class358.updateItemPile(var20, var5); // L: 6935
							}
						}
					}

					for (PendingSpawn var50 = (PendingSpawn)pendingSpawns.last(); var50 != null; var50 = (PendingSpawn)pendingSpawns.previous()) { // L: 6939 6940 6942
						if (var50.x >= InvDefinition.field1918 && var50.x < InvDefinition.field1918 + 8 && var50.y >= class125.field1560 && var50.y < class125.field1560 + 8 && var50.plane == class383.Client_plane) { // L: 6941
							var50.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 6944
					return true; // L: 6945
				}

				if (ServerPacket.field3268 == var1.serverPacket) { // L: 6947
					LoginScreenAnimation.field1286 = new class414(class34.Ignored_cached); // L: 6948
					var1.serverPacket = null; // L: 6949
					return true; // L: 6950
				}

				NPC var39;
				if (ServerPacket.field3273 == var1.serverPacket) { // L: 6952
					var27 = var3.method8699(); // L: 6956
					var20 = var3.method8591(); // L: 6957
					var5 = var3.method8530(); // L: 6958
					if (var5 == 65535) { // L: 6959
						var5 = -1; // L: 6960
					}

					var39 = npcs[var20]; // L: 6962
					if (var39 != null) { // L: 6963
						if (var5 == var39.sequence && var5 != -1) { // L: 6964
							var8 = class216.SequenceDefinition_get(var5).field2276; // L: 6965
							if (var8 == 1) { // L: 6966
								var39.sequenceFrame = 0; // L: 6967
								var39.sequenceFrameCycle = 0; // L: 6968
								var39.sequenceDelay = var27; // L: 6969
								var39.field1223 = 0; // L: 6970
							} else if (var8 == 2) { // L: 6972
								var39.field1223 = 0; // L: 6973
							}
						} else if (var5 == -1 || var39.sequence == -1 || class216.SequenceDefinition_get(var5).field2300 >= class216.SequenceDefinition_get(var39.sequence).field2300) { // L: 6976
							var39.sequence = var5; // L: 6977
							var39.sequenceFrame = 0; // L: 6978
							var39.sequenceFrameCycle = 0; // L: 6979
							var39.sequenceDelay = var27; // L: 6980
							var39.field1223 = 0; // L: 6981
							var39.field1252 = var39.pathLength; // L: 6982
						}
					}

					var1.serverPacket = null; // L: 6986
					return true; // L: 6987
				}

				long var41;
				long var44;
				if (ServerPacket.field3197 == var1.serverPacket) { // L: 6989
					var49 = var3.readStringCp1252NullTerminated(); // L: 6990
					var28 = var3.readLong(); // L: 6991
					var30 = (long)var3.readUnsignedShort(); // L: 6992
					var41 = (long)var3.readMedium(); // L: 6993
					PlayerType var93 = (PlayerType)World.findEnumerated(class149.PlayerType_values(), var3.readUnsignedByte()); // L: 6994
					var44 = (var30 << 32) + var41; // L: 6995
					boolean var82 = false; // L: 6996

					for (var15 = 0; var15 < 100; ++var15) { // L: 6997
						if (var44 == field523[var15]) { // L: 6998
							var82 = true; // L: 6999
							break; // L: 7000
						}
					}

					if (var93.isUser && DefaultsGroup.friendSystem.isIgnored(new Username(var49, SecureRandomFuture.loginType))) { // L: 7003 7004
						var82 = true;
					}

					if (!var82 && field691 == 0) { // L: 7006
						field523[field746] = var44; // L: 7007
						field746 = (field746 + 1) % 100; // L: 7008
						var26 = AbstractFont.escapeBrackets(VarbitComposition.method3779(class153.method3285(var3))); // L: 7009
						if (var93.modIcon != -1) { // L: 7010
							class381.addChatMessage(9, class456.method8410(var93.modIcon) + var49, var26, ModeWhere.base37DecodeLong(var28));
						} else {
							class381.addChatMessage(9, var49, var26, ModeWhere.base37DecodeLong(var28)); // L: 7011
						}
					}

					var1.serverPacket = null; // L: 7013
					return true; // L: 7014
				}

				if (ServerPacket.field3211 == var1.serverPacket) { // L: 7016
					DefaultsGroup.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 7017
					field715 = cycleCntr; // L: 7018
					var1.serverPacket = null; // L: 7019
					return true; // L: 7020
				}

				boolean var80;
				if (ServerPacket.field3291 == var1.serverPacket) { // L: 7022
					var80 = var3.readUnsignedByte() == 1; // L: 7023
					if (var80) { // L: 7024
						WorldMapLabelSize.field2824 = Message.method1197() - var3.readLong(); // L: 7025
						ItemContainer.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 7026
					} else {
						ItemContainer.grandExchangeEvents = null; // L: 7028
					}

					field720 = cycleCntr; // L: 7029
					var1.serverPacket = null; // L: 7030
					return true; // L: 7031
				}

				if (ServerPacket.field3224 == var1.serverPacket) { // L: 7033
					DevicePcmPlayerProvider.method315(class276.field3159); // L: 7034
					var1.serverPacket = null; // L: 7035
					return true; // L: 7036
				}

				if (ServerPacket.field3252 == var1.serverPacket) { // L: 7038
					minimapState = var3.readUnsignedByte(); // L: 7039
					var1.serverPacket = null; // L: 7040
					return true; // L: 7041
				}

				if (ServerPacket.field3286 == var1.serverPacket) { // L: 7043
					var20 = var3.method8604(); // L: 7044
					var5 = var3.method8591(); // L: 7045
					if (var5 == 65535) { // L: 7046
						var5 = -1;
					}

					var27 = var3.method8604(); // L: 7047
					var7 = var3.method8591(); // L: 7048
					if (var7 == 65535) { // L: 7049
						var7 = -1;
					}

					for (var8 = var5; var8 <= var7; ++var8) { // L: 7050
						var41 = (long)var8 + ((long)var20 << 32); // L: 7051
						Node var43 = widgetFlags.get(var41); // L: 7052
						if (var43 != null) { // L: 7053
							var43.remove();
						}

						widgetFlags.put(new IntegerNode(var27), var41); // L: 7054
					}

					var1.serverPacket = null; // L: 7056
					return true; // L: 7057
				}

				if (ServerPacket.field3188 == var1.serverPacket) { // L: 7059
					var20 = var3.method8591(); // L: 7060
					var5 = var3.method8760(); // L: 7061
					Varps.Varps_temp[var20] = var5; // L: 7062
					if (Varps.Varps_main[var20] != var5) { // L: 7063
						Varps.Varps_main[var20] = var5; // L: 7064
					}

					MouseRecorder.changeGameOptions(var20); // L: 7066
					field706[++field707 - 1 & 31] = var20; // L: 7067
					var1.serverPacket = null; // L: 7068
					return true; // L: 7069
				}

				if (ServerPacket.field3285 == var1.serverPacket) { // L: 7071
					var80 = var3.readBoolean(); // L: 7072
					if (var80) { // L: 7073
						if (GameEngine.field241 == null) { // L: 7074
							GameEngine.field241 = new class343();
						}
					} else {
						GameEngine.field241 = null; // L: 7076
					}

					var1.serverPacket = null; // L: 7077
					return true; // L: 7078
				}

				if (ServerPacket.field3201 == var1.serverPacket) { // L: 7080
					var9 = var3.method8530(); // L: 7089
					var27 = var3.method8629(); // L: 7090
					var20 = var27 >> 16; // L: 7091
					var5 = var27 >> 8 & 255; // L: 7092
					var7 = var20 + (var27 >> 4 & 7); // L: 7093
					var8 = var5 + (var27 & 7); // L: 7094
					var38 = var3.method8702(); // L: 7095
					var84 = var3.method8592(); // L: 7096
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 7097
						var7 = var7 * 128 + 64; // L: 7098
						var8 = var8 * 128 + 64; // L: 7099
						GraphicsObject var94 = new GraphicsObject(var9, class383.Client_plane, var7, var8, SpotAnimationDefinition.getTileHeight(var7, var8, class383.Client_plane) - var38, var84, cycle); // L: 7100
						graphicsObjects.addFirst(var94); // L: 7101
					}

					var1.serverPacket = null; // L: 7103
					return true; // L: 7104
				}

				if (ServerPacket.field3207 == var1.serverPacket) { // L: 7106
					var20 = var3.readUnsignedByte(); // L: 7107
					class272.method5475(var20); // L: 7108
					var1.serverPacket = null; // L: 7109
					return true; // L: 7110
				}

				if (ServerPacket.field3250 == var1.serverPacket) { // L: 7112
					var20 = var3.readInt(); // L: 7113
					var5 = var3.readInt(); // L: 7114
					var27 = class276.getGcDuration(); // L: 7115
					PacketBufferNode var88 = class136.getPacketBufferNode(ClientPacket.field3051, packetWriter.isaacCipher); // L: 7117
					var88.packetBuffer.writeInt(var20); // L: 7118
					var88.packetBuffer.method8599(var5); // L: 7119
					var88.packetBuffer.writeByte(GameEngine.fps); // L: 7120
					var88.packetBuffer.writeByte(var27); // L: 7121
					packetWriter.addNode(var88); // L: 7122
					var1.serverPacket = null; // L: 7123
					return true; // L: 7124
				}

				if (ServerPacket.field3234 == var1.serverPacket) { // L: 7126
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) { // L: 7127
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) { // L: 7128
							Varps.Varps_main[var20] = Varps.Varps_temp[var20]; // L: 7129
							MouseRecorder.changeGameOptions(var20); // L: 7130
							field706[++field707 - 1 & 31] = var20; // L: 7131
						}
					}

					var1.serverPacket = null; // L: 7134
					return true; // L: 7135
				}

				if (ServerPacket.field3245 == var1.serverPacket) { // L: 7137
					MilliClock.readReflectionCheck(var3, var1.serverPacketLength); // L: 7138
					var1.serverPacket = null; // L: 7139
					return true; // L: 7140
				}

				if (ServerPacket.field3213 == var1.serverPacket) { // L: 7142
					DevicePcmPlayerProvider.method315(class276.field3170); // L: 7143
					var1.serverPacket = null; // L: 7144
					return true; // L: 7145
				}

				if (ServerPacket.field3204 == var1.serverPacket) { // L: 7147
					var49 = var3.readStringCp1252NullTerminated(); // L: 7148
					var21 = AbstractFont.escapeBrackets(VarbitComposition.method3779(class153.method3285(var3))); // L: 7149
					KitDefinition.addGameMessage(6, var49, var21); // L: 7150
					var1.serverPacket = null; // L: 7151
					return true; // L: 7152
				}

				if (ServerPacket.field3198 == var1.serverPacket) { // L: 7154
					var20 = var3.readInt(); // L: 7155
					InterfaceParent var73 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7156
					if (var73 != null) { // L: 7157
						class9.closeInterface(var73, true);
					}

					if (meslayerContinueWidget != null) { // L: 7158
						class69.invalidateWidget(meslayerContinueWidget); // L: 7159
						meslayerContinueWidget = null; // L: 7160
					}

					var1.serverPacket = null; // L: 7162
					return true; // L: 7163
				}

				if (ServerPacket.field3276 == var1.serverPacket) { // L: 7165
					UrlRequester.method2748(var3.readStringCp1252NullTerminated()); // L: 7166
					var1.serverPacket = null; // L: 7167
					return true; // L: 7168
				}

				if (ServerPacket.field3199 == var1.serverPacket) { // L: 7170
					var49 = var3.readStringCp1252NullTerminated(); // L: 7171
					var5 = var3.method8760(); // L: 7172
					var6 = class175.getWidget(var5); // L: 7173
					if (!var49.equals(var6.text)) { // L: 7174
						var6.text = var49; // L: 7175
						class69.invalidateWidget(var6); // L: 7176
					}

					var1.serverPacket = null; // L: 7178
					return true; // L: 7179
				}

				if (ServerPacket.field3254 == var1.serverPacket) { // L: 7181
					var20 = var3.readUnsignedShort(); // L: 7182
					var5 = var3.method8760(); // L: 7183
					var6 = class175.getWidget(var5); // L: 7184
					if (var6.modelType != 2 || var20 != var6.modelId) { // L: 7185
						var6.modelType = 2; // L: 7186
						var6.modelId = var20; // L: 7187
						class69.invalidateWidget(var6); // L: 7188
					}

					var1.serverPacket = null; // L: 7190
					return true; // L: 7191
				}

				if (ServerPacket.field3265 == var1.serverPacket) { // L: 7193
					var20 = var3.readUnsignedShort(); // L: 7194
					var5 = var3.readUnsignedByte(); // L: 7195
					var27 = var3.readUnsignedShort(); // L: 7196
					class1.queueSoundEffect(var20, var5, var27); // L: 7197
					var1.serverPacket = null; // L: 7198
					return true; // L: 7199
				}

				if (ServerPacket.field3256 == var1.serverPacket) { // L: 7201
					var20 = var3.readInt(); // L: 7202
					var5 = var3.readUnsignedShort(); // L: 7203
					if (var20 < -70000) { // L: 7204
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 7206
						var6 = class175.getWidget(var20);
					} else {
						var6 = null; // L: 7207
					}

					if (var6 != null) { // L: 7208
						for (var7 = 0; var7 < var6.itemIds.length; ++var7) { // L: 7209
							var6.itemIds[var7] = 0; // L: 7210
							var6.itemQuantities[var7] = 0; // L: 7211
						}
					}

					Script.clearItemContainer(var5); // L: 7214
					var7 = var3.readUnsignedShort(); // L: 7215

					for (var8 = 0; var8 < var7; ++var8) { // L: 7216
						var9 = var3.method8581(); // L: 7217
						if (var9 == 255) { // L: 7218
							var9 = var3.method8604();
						}

						var38 = var3.method8530(); // L: 7219
						if (var6 != null && var8 < var6.itemIds.length) { // L: 7220 7221
							var6.itemIds[var8] = var38; // L: 7222
							var6.itemQuantities[var8] = var9; // L: 7223
						}

						class12.itemContainerSetItem(var5, var8, var38 - 1, var9); // L: 7226
					}

					if (var6 != null) { // L: 7228
						class69.invalidateWidget(var6);
					}

					class136.method3073(); // L: 7229
					field708[++field709 - 1 & 31] = var5 & 32767; // L: 7230
					var1.serverPacket = null; // L: 7231
					return true; // L: 7232
				}

				if (ServerPacket.field3257 == var1.serverPacket) { // L: 7234
					class312.updateNpcs(true, var3); // L: 7235
					var1.serverPacket = null; // L: 7236
					return true; // L: 7237
				}

				if (ServerPacket.field3210 == var1.serverPacket) { // L: 7239
					var3.offset += 28; // L: 7240
					if (var3.checkCrc()) { // L: 7241
						TileItem.method2619(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 7242
					return true; // L: 7243
				}

				if (ServerPacket.field3222 == var1.serverPacket) { // L: 7245
					DevicePcmPlayerProvider.method315(class276.field3161); // L: 7246
					var1.serverPacket = null; // L: 7247
					return true; // L: 7248
				}

				if (ServerPacket.field3299 == var1.serverPacket) { // L: 7250
					var20 = var3.method8530(); // L: 7251
					if (var20 == 65535) { // L: 7252
						var20 = -1;
					}

					var5 = var3.method8760(); // L: 7253
					var27 = var3.method8604(); // L: 7254
					var86 = class175.getWidget(var5); // L: 7255
					ItemComposition var89;
					if (!var86.isIf3) { // L: 7256
						if (var20 == -1) { // L: 7257
							var86.modelType = 0; // L: 7258
							var1.serverPacket = null; // L: 7259
							return true; // L: 7260
						}

						var89 = NPCComposition.ItemComposition_get(var20); // L: 7262
						var86.modelType = 4; // L: 7263
						var86.modelId = var20; // L: 7264
						var86.modelAngleX = var89.xan2d; // L: 7265
						var86.modelAngleY = var89.yan2d; // L: 7266
						var86.modelZoom = var89.zoom2d * 100 / var27; // L: 7267
						class69.invalidateWidget(var86); // L: 7268
					} else {
						var86.itemId = var20; // L: 7271
						var86.itemQuantity = var27; // L: 7272
						var89 = NPCComposition.ItemComposition_get(var20); // L: 7273
						var86.modelAngleX = var89.xan2d; // L: 7274
						var86.modelAngleY = var89.yan2d; // L: 7275
						var86.modelAngleZ = var89.zan2d; // L: 7276
						var86.modelOffsetX = var89.offsetX2d; // L: 7277
						var86.modelOffsetY = var89.offsetY2d; // L: 7278
						var86.modelZoom = var89.zoom2d; // L: 7279
						if (var89.isStackable == 1) { // L: 7280
							var86.itemQuantityMode = 1;
						} else {
							var86.itemQuantityMode = 2; // L: 7281
						}

						if (var86.field3659 > 0) { // L: 7282
							var86.modelZoom = var86.modelZoom * 32 / var86.field3659;
						} else if (var86.rawWidth > 0) { // L: 7283
							var86.modelZoom = var86.modelZoom * 32 / var86.rawWidth;
						}

						class69.invalidateWidget(var86); // L: 7284
					}

					var1.serverPacket = null; // L: 7286
					return true; // L: 7287
				}

				if (ServerPacket.field3293 == var1.serverPacket) { // L: 7289
					DevicePcmPlayerProvider.method315(class276.field3163); // L: 7290
					var1.serverPacket = null; // L: 7291
					return true; // L: 7292
				}

				if (ServerPacket.field3287 == var1.serverPacket) { // L: 7294
					class125.field1560 = var3.method8699(); // L: 7295
					InvDefinition.field1918 = var3.method8699(); // L: 7296
					var1.serverPacket = null; // L: 7297
					return true; // L: 7298
				}

				if (ServerPacket.field3271 == var1.serverPacket) { // L: 7300
					var20 = var3.method8760(); // L: 7301
					var5 = var3.method8591(); // L: 7302
					var27 = var3.method8591(); // L: 7303
					var7 = var3.method8591(); // L: 7304
					var40 = class175.getWidget(var20); // L: 7305
					if (var5 != var40.modelAngleX || var7 != var40.modelAngleY || var27 != var40.modelZoom) { // L: 7306
						var40.modelAngleX = var5; // L: 7307
						var40.modelAngleY = var7; // L: 7308
						var40.modelZoom = var27; // L: 7309
						class69.invalidateWidget(var40); // L: 7310
					}

					var1.serverPacket = null; // L: 7312
					return true; // L: 7313
				}

				if (ServerPacket.field3269 == var1.serverPacket) { // L: 7315
					var20 = var3.offset + var1.serverPacketLength; // L: 7316
					var5 = var3.readUnsignedShort(); // L: 7317
					var27 = var3.readUnsignedShort(); // L: 7318
					if (var5 != rootInterface) { // L: 7319
						rootInterface = var5; // L: 7320
						this.resizeRoot(false); // L: 7321
						class69.Widget_resetModelFrames(rootInterface); // L: 7322
						class31.runWidgetOnLoadListener(rootInterface); // L: 7323

						for (var7 = 0; var7 < 100; ++var7) { // L: 7324
							field731[var7] = true;
						}
					}

					InterfaceParent var10;
					for (; var27-- > 0; var10.field1067 = true) { // L: 7326 7336
						var7 = var3.readInt(); // L: 7327
						var8 = var3.readUnsignedShort(); // L: 7328
						var9 = var3.readUnsignedByte(); // L: 7329
						var10 = (InterfaceParent)interfaceParents.get((long)var7); // L: 7330
						if (var10 != null && var8 != var10.group) { // L: 7331
							class9.closeInterface(var10, true); // L: 7332
							var10 = null; // L: 7333
						}

						if (var10 == null) { // L: 7335
							var10 = class7.method44(var7, var8, var9);
						}
					}

					for (var85 = (InterfaceParent)interfaceParents.first(); var85 != null; var85 = (InterfaceParent)interfaceParents.next()) { // L: 7338
						if (var85.field1067) { // L: 7339
							var85.field1067 = false;
						} else {
							class9.closeInterface(var85, true); // L: 7341
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 7344

					while (var3.offset < var20) { // L: 7345
						var7 = var3.readInt(); // L: 7346
						var8 = var3.readUnsignedShort(); // L: 7347
						var9 = var3.readUnsignedShort(); // L: 7348
						var38 = var3.readInt(); // L: 7349

						for (var84 = var8; var84 <= var9; ++var84) { // L: 7350
							var44 = ((long)var7 << 32) + (long)var84; // L: 7351
							widgetFlags.put(new IntegerNode(var38), var44); // L: 7352
						}
					}

					var1.serverPacket = null; // L: 7355
					return true; // L: 7356
				}

				if (ServerPacket.field3202 == var1.serverPacket) { // L: 7358
					var5 = var3.method8760(); // L: 7363
					var20 = var3.readUnsignedShort(); // L: 7364
					var39 = npcs[var20]; // L: 7365
					var27 = var3.readUnsignedShort(); // L: 7366
					if (var39 != null) { // L: 7367
						var39.spotAnimation = var27; // L: 7368
						var39.spotAnimationHeight = var5 >> 16; // L: 7369
						var39.field1227 = (var5 & 65535) + cycle; // L: 7370
						var39.spotAnimationFrame = 0; // L: 7371
						var39.spotAnimationFrameCycle = 0; // L: 7372
						if (var39.field1227 > cycle) { // L: 7373
							var39.spotAnimationFrame = -1; // L: 7374
						}

						if (var39.spotAnimation == 65535) { // L: 7376
							var39.spotAnimation = -1; // L: 7377
						}
					}

					var1.serverPacket = null; // L: 7380
					return true; // L: 7381
				}

				if (ServerPacket.field3235 == var1.serverPacket) { // L: 7383
					DevicePcmPlayerProvider.method315(class276.field3165); // L: 7384
					var1.serverPacket = null; // L: 7385
					return true; // L: 7386
				}

				if (ServerPacket.field3219 == var1.serverPacket) { // L: 7388
					if (rootInterface != -1) { // L: 7389
						GrandExchangeOfferAgeComparator.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 7390
					return true; // L: 7391
				}

				if (ServerPacket.field3196 == var1.serverPacket) { // L: 7393
					isCameraLocked = true; // L: 7394
					field772 = false; // L: 7395
					class109.field1442 = var3.readUnsignedByte() * 128; // L: 7396
					class146.field1718 = var3.readUnsignedByte() * 128; // L: 7397
					class104.field1398 = var3.readUnsignedShort(); // L: 7398
					class415.field4647 = var3.readUnsignedByte(); // L: 7399
					LoginScreenAnimation.field1283 = var3.readUnsignedByte(); // L: 7400
					if (LoginScreenAnimation.field1283 >= 100) { // L: 7401
						var20 = class109.field1442 * 16384 + 64; // L: 7402
						var5 = class146.field1718 * 16384 + 64; // L: 7403
						var27 = SpotAnimationDefinition.getTileHeight(var20, var5, class383.Client_plane) - class104.field1398; // L: 7404
						var7 = var20 - class145.cameraX; // L: 7405
						var8 = var27 - class414.cameraY; // L: 7406
						var9 = var5 - ClanChannel.cameraZ; // L: 7407
						var38 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7)); // L: 7408
						class97.cameraPitch = (int)(Math.atan2((double)var8, (double)var38) * 325.9490051269531D) & 2047; // L: 7409
						class128.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047; // L: 7410
						if (class97.cameraPitch < 128) { // L: 7411
							class97.cameraPitch = 128;
						}

						if (class97.cameraPitch > 383) { // L: 7412
							class97.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 7414
					return true; // L: 7415
				}

				if (ServerPacket.field3266 == var1.serverPacket) { // L: 7417
					var74 = var3.readByte(); // L: 7418
					var28 = (long)var3.readUnsignedShort(); // L: 7419
					var30 = (long)var3.readMedium(); // L: 7420
					var41 = var30 + (var28 << 32); // L: 7421
					boolean var37 = false; // L: 7422
					ClanChannel var46 = var74 >= 0 ? currentClanChannels[var74] : VarcInt.guestClanChannel; // L: 7423
					if (var46 == null) { // L: 7424
						var37 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 7426
							if (field523[var13] == var41) { // L: 7427
								var37 = true; // L: 7428
								break; // L: 7429
							}
						}
					}

					if (!var37) { // L: 7433
						field523[field746] = var41; // L: 7434
						field746 = (field746 + 1) % 100; // L: 7435
						var35 = class153.method3285(var3); // L: 7436
						var36 = var74 >= 0 ? 43 : 46; // L: 7437
						class381.addChatMessage(var36, "", var35, var46.name); // L: 7438
					}

					var1.serverPacket = null; // L: 7440
					return true; // L: 7441
				}

				if (ServerPacket.field3241 == var1.serverPacket) { // L: 7443
					class136.method3073(); // L: 7444
					field629 = var3.readUnsignedByte(); // L: 7445
					field629 *= 100; // L: 7446
					field721 = cycleCntr; // L: 7447
					var1.serverPacket = null; // L: 7448
					return true; // L: 7449
				}

				if (ServerPacket.field3191 == var1.serverPacket) { // L: 7451
					var20 = var3.method8604(); // L: 7452
					var55 = var3.readUnsignedByte() == 1; // L: 7453
					var6 = class175.getWidget(var20); // L: 7454
					if (var55 != var6.isHidden) { // L: 7455
						var6.isHidden = var55; // L: 7456
						class69.invalidateWidget(var6); // L: 7457
					}

					var1.serverPacket = null; // L: 7459
					return true; // L: 7460
				}

				if (ServerPacket.field3270 == var1.serverPacket) { // L: 7462
					ParamComposition.field2121 = true; // L: 7463
					class312.updateNpcs(true, var3); // L: 7464
					var1.serverPacket = null; // L: 7465
					return true; // L: 7466
				}

				Widget var71;
				if (ServerPacket.field3231 == var1.serverPacket) { // L: 7468
					var20 = var3.method8604(); // L: 7469
					var71 = class175.getWidget(var20); // L: 7470
					var71.modelType = 3; // L: 7471
					var71.modelId = class155.localPlayer.appearance.getChatHeadId(); // L: 7472
					class69.invalidateWidget(var71); // L: 7473
					var1.serverPacket = null; // L: 7474
					return true; // L: 7475
				}

				if (ServerPacket.field3242 == var1.serverPacket) { // L: 7477
					class136.method3073(); // L: 7478
					weight = var3.readShort(); // L: 7479
					field721 = cycleCntr; // L: 7480
					var1.serverPacket = null; // L: 7481
					return true; // L: 7482
				}

				if (ServerPacket.field3189 == var1.serverPacket) { // L: 7484
					var1.serverPacket = null; // L: 7485
					return true; // L: 7486
				}

				if (ServerPacket.field3251 == var1.serverPacket) { // L: 7488
					return this.method1432(var1, 2); // L: 7489
				}

				if (ServerPacket.field3184 == var1.serverPacket) { // L: 7491
					var20 = var3.readInt(); // L: 7492
					if (var20 != field789) { // L: 7493
						field789 = var20; // L: 7494
						CollisionMap.method4157(); // L: 7495
					}

					var1.serverPacket = null; // L: 7497
					return true; // L: 7498
				}

				if (ServerPacket.field3218 == var1.serverPacket) { // L: 7500
					var49 = var3.readStringCp1252NullTerminated(); // L: 7501
					Object[] var72 = new Object[var49.length() + 1]; // L: 7502

					for (var27 = var49.length() - 1; var27 >= 0; --var27) { // L: 7503
						if (var49.charAt(var27) == 's') { // L: 7504
							var72[var27 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var72[var27 + 1] = new Integer(var3.readInt()); // L: 7505
						}
					}

					var72[0] = new Integer(var3.readInt()); // L: 7507
					ScriptEvent var52 = new ScriptEvent(); // L: 7508
					var52.args = var72; // L: 7509
					WorldMapElement.runScriptEvent(var52); // L: 7510
					var1.serverPacket = null; // L: 7511
					return true; // L: 7512
				}

				if (ServerPacket.field3258 == var1.serverPacket) { // L: 7514
					var20 = var3.readInt(); // L: 7515
					var5 = var3.method8591(); // L: 7516
					var6 = class175.getWidget(var20); // L: 7517
					if (var6 != null && var6.type == 0) { // L: 7518
						if (var5 > var6.scrollHeight - var6.height) { // L: 7519
							var5 = var6.scrollHeight - var6.height;
						}

						if (var5 < 0) { // L: 7520
							var5 = 0;
						}

						if (var5 != var6.scrollY) { // L: 7521
							var6.scrollY = var5; // L: 7522
							class69.invalidateWidget(var6); // L: 7523
						}
					}

					var1.serverPacket = null; // L: 7526
					return true; // L: 7527
				}

				if (ServerPacket.field3262 == var1.serverPacket) { // L: 7529
					var20 = var3.method8592(); // L: 7530
					DynamicObject.method2139(var20); // L: 7531
					field708[++field709 - 1 & 31] = var20 & 32767; // L: 7532
					var1.serverPacket = null; // L: 7533
					return true; // L: 7534
				}

				if (ServerPacket.field3253 == var1.serverPacket) { // L: 7536
					var20 = var3.readUnsignedByte(); // L: 7537
					var5 = var3.readUnsignedByte(); // L: 7538
					var27 = var3.readUnsignedByte(); // L: 7539
					var7 = var3.readUnsignedByte(); // L: 7540
					field773[var20] = true; // L: 7541
					field803[var20] = var5; // L: 7542
					field775[var20] = var27; // L: 7543
					field776[var20] = var7; // L: 7544
					field617[var20] = 0; // L: 7545
					var1.serverPacket = null; // L: 7546
					return true; // L: 7547
				}

				if (ServerPacket.field3274 == var1.serverPacket) { // L: 7549
					destinationX = var3.readUnsignedByte(); // L: 7550
					if (destinationX == 255) { // L: 7551
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 7552
					if (destinationY == 255) { // L: 7553
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 7554
					return true; // L: 7555
				}

				if (ServerPacket.field3240 == var1.serverPacket) { // L: 7557
					var20 = var3.readInt(); // L: 7558
					var71 = class175.getWidget(var20); // L: 7559

					for (var27 = 0; var27 < var71.itemIds.length; ++var27) { // L: 7560
						var71.itemIds[var27] = -1; // L: 7561
						var71.itemIds[var27] = 0; // L: 7562
					}

					class69.invalidateWidget(var71); // L: 7564
					var1.serverPacket = null; // L: 7565
					return true; // L: 7566
				}

				if (ServerPacket.field3261 == var1.serverPacket) { // L: 7568
					var20 = var3.readUnsignedByte(); // L: 7569
					PlayerComposition.forceDisconnect(var20); // L: 7570
					var1.serverPacket = null; // L: 7571
					return false; // L: 7572
				}

				if (ServerPacket.field3216 == var1.serverPacket) { // L: 7574
					publicChatMode = var3.readUnsignedByte(); // L: 7575
					tradeChatMode = var3.method8699(); // L: 7576
					var1.serverPacket = null; // L: 7577
					return true; // L: 7578
				}

				if (ServerPacket.field3186 == var1.serverPacket) { // L: 7580
					DevicePcmPlayerProvider.method315(class276.field3158); // L: 7581
					var1.serverPacket = null; // L: 7582
					return true; // L: 7583
				}

				class132.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1432 != null ? var1.field1432.id : -1) + "," + (var1.field1433 != null ? var1.field1433.id : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 7585
				Player.logOut(); // L: 7586
			} catch (IOException var47) { // L: 7588
				FaceNormal.method4619(); // L: 7589
			} catch (Exception var48) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1432 != null ? var1.field1432.id : -1) + "," + (var1.field1433 != null ? var1.field1433.id : -1) + "," + var1.serverPacketLength + "," + (class155.localPlayer.pathX[0] + class154.baseX * 64) + "," + (class155.localPlayer.pathY[0] + class365.baseY * 64) + ","; // L: 7592

				for (var27 = 0; var27 < var1.serverPacketLength && var27 < 50; ++var27) { // L: 7593
					var21 = var21 + var3.array[var27] + ",";
				}

				class132.RunException_sendStackTrace(var21, var48); // L: 7594
				Player.logOut(); // L: 7595
			}

			return true; // L: 7597
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "919576358"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false; // L: 8787

		int var2;
		int var5;
		while (!var1) { // L: 8788
			var1 = true; // L: 8789

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) { // L: 8790
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) { // L: 8791
					String var18 = menuTargets[var2]; // L: 8792
					menuTargets[var2] = menuTargets[var2 + 1]; // L: 8793
					menuTargets[var2 + 1] = var18; // L: 8794
					String var19 = menuActions[var2]; // L: 8795
					menuActions[var2] = menuActions[var2 + 1]; // L: 8796
					menuActions[var2 + 1] = var19; // L: 8797
					var5 = menuOpcodes[var2]; // L: 8798
					menuOpcodes[var2] = menuOpcodes[var2 + 1]; // L: 8799
					menuOpcodes[var2 + 1] = var5; // L: 8800
					var5 = menuArguments1[var2]; // L: 8801
					menuArguments1[var2] = menuArguments1[var2 + 1]; // L: 8802
					menuArguments1[var2 + 1] = var5; // L: 8803
					var5 = menuArguments2[var2]; // L: 8804
					menuArguments2[var2] = menuArguments2[var2 + 1]; // L: 8805
					menuArguments2[var2 + 1] = var5; // L: 8806
					var5 = menuIdentifiers[var2]; // L: 8807
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1]; // L: 8808
					menuIdentifiers[var2 + 1] = var5; // L: 8809
					var5 = field661[var2]; // L: 8810
					field661[var2] = field661[var2 + 1]; // L: 8811
					field661[var2 + 1] = var5; // L: 8812
					boolean var6 = menuShiftClick[var2]; // L: 8813
					menuShiftClick[var2] = menuShiftClick[var2 + 1]; // L: 8814
					menuShiftClick[var2 + 1] = var6; // L: 8815
					var1 = false; // L: 8816
				}
			}
		}

		if (class368.dragInventoryWidget == null) { // L: 8821
			if (clickedWidget == null) { // L: 8822
				int var21;
				label270: {
					int var20 = MouseHandler.MouseHandler_lastButton; // L: 8823
					int var4;
					int var9;
					int var11;
					int var15;
					int var22;
					if (isMenuOpen) { // L: 8824
						int var3;
						if (var20 != 1 && (SceneTilePaint.mouseCam || var20 != 4)) { // L: 8825
							var2 = MouseHandler.MouseHandler_x; // L: 8826
							var3 = MouseHandler.MouseHandler_y; // L: 8827
							if (var2 < VarcInt.menuX - 10 || var2 > AttackOption.menuWidth + VarcInt.menuX + 10 || var3 < NPC.menuY - 10 || var3 > MouseHandler.menuHeight + NPC.menuY + 10) { // L: 8828
								isMenuOpen = false; // L: 8829
								ReflectionCheck.method714(VarcInt.menuX, NPC.menuY, AttackOption.menuWidth, MouseHandler.menuHeight); // L: 8830
							}
						}

						if (var20 == 1 || !SceneTilePaint.mouseCam && var20 == 4) { // L: 8833
							var2 = VarcInt.menuX; // L: 8834
							var3 = NPC.menuY; // L: 8835
							var4 = AttackOption.menuWidth; // L: 8836
							var5 = MouseHandler.MouseHandler_lastPressedX; // L: 8837
							var21 = MouseHandler.MouseHandler_lastPressedY; // L: 8838
							var15 = -1; // L: 8839

							for (var22 = 0; var22 < menuOptionsCount; ++var22) { // L: 8840
								var9 = var3 + (menuOptionsCount - 1 - var22) * 15 + 31; // L: 8841
								if (var5 > var2 && var5 < var4 + var2 && var21 > var9 - 13 && var21 < var9 + 3) { // L: 8842
									var15 = var22;
								}
							}

							if (var15 != -1 && var15 >= 0) { // L: 8844 8845
								var22 = menuArguments1[var15]; // L: 8846
								var9 = menuArguments2[var15]; // L: 8847
								int var23 = menuOpcodes[var15]; // L: 8848
								var11 = menuIdentifiers[var15]; // L: 8849
								int var12 = field661[var15]; // L: 8850
								String var13 = menuActions[var15]; // L: 8851
								String var14 = menuTargets[var15]; // L: 8852
								WorldMapData_0.method4844(var22, var9, var23, var11, var12, var13, var14, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8853
							}

							isMenuOpen = false; // L: 8855
							ReflectionCheck.method714(VarcInt.menuX, NPC.menuY, AttackOption.menuWidth, MouseHandler.menuHeight); // L: 8856
						}
					} else {
						var2 = menuOptionsCount - 1; // L: 8862
						if ((var20 == 1 || !SceneTilePaint.mouseCam && var20 == 4) && var2 >= 0) { // L: 8865
							var4 = menuOpcodes[var2]; // L: 8866
							if (var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) { // L: 8867
								var5 = menuArguments1[var2]; // L: 8868
								var21 = menuArguments2[var2]; // L: 8869
								Widget var7 = class175.getWidget(var21); // L: 8870
								var9 = Clock.getWidgetFlags(var7); // L: 8872
								boolean var8 = (var9 >> 28 & 1) != 0; // L: 8874
								if (var8) { // L: 8877
									break label270;
								}

								var11 = Clock.getWidgetFlags(var7); // L: 8879
								boolean var10 = (var11 >> 29 & 1) != 0; // L: 8881
								if (var10) { // L: 8883
									break label270;
								}
							}
						}

						if ((var20 == 1 || !SceneTilePaint.mouseCam && var20 == 4) && this.shouldLeftClickOpenMenu()) { // L: 8903 8904
							var20 = 2; // L: 8905
						}

						if ((var20 == 1 || !SceneTilePaint.mouseCam && var20 == 4) && menuOptionsCount > 0 && var2 >= 0) { // L: 8908 8910
							var4 = menuArguments1[var2]; // L: 8911
							var5 = menuArguments2[var2]; // L: 8912
							var21 = menuOpcodes[var2]; // L: 8913
							var15 = menuIdentifiers[var2]; // L: 8914
							var22 = field661[var2]; // L: 8915
							String var16 = menuActions[var2]; // L: 8916
							String var17 = menuTargets[var2]; // L: 8917
							WorldMapData_0.method4844(var4, var5, var21, var15, var22, var16, var17, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8918
						}

						if (var20 == 2 && menuOptionsCount > 0) { // L: 8921
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}

					return; // L: 8923
				}

				if (class368.dragInventoryWidget != null && !field630 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 8885 8886
					WorldMapLabelSize.method4861(draggedWidgetX, draggedWidgetY); // L: 8887
				}

				field630 = false; // L: 8890
				itemDragDuration = 0; // L: 8891
				if (class368.dragInventoryWidget != null) { // L: 8892
					class69.invalidateWidget(class368.dragInventoryWidget);
				}

				class368.dragInventoryWidget = class175.getWidget(var21); // L: 8893
				dragItemSlotSource = var5; // L: 8894
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 8895
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 8896
				if (var2 >= 0) { // L: 8897
					ReflectionCheck.method711(var2);
				}

				class69.invalidateWidget(class368.dragInventoryWidget); // L: 8898
			}
		}
	} // L: 8899

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1964270751"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1; // L: 8928
		return (field598 && menuOptionsCount > 2 || class281.method5505(var1)) && !menuShiftClick[var1]; // L: 8931
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "712334109"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		int var3 = class146.fontBold12.stringWidth("Choose Option"); // L: 8936

		int var4;
		int var5;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) { // L: 8937
			var5 = class146.fontBold12.stringWidth(class34.method491(var4)); // L: 8938
			if (var5 > var3) { // L: 8939
				var3 = var5;
			}
		}

		var3 += 8; // L: 8941
		var4 = menuOptionsCount * 15 + 22; // L: 8942
		var5 = var1 - var3 / 2; // L: 8943
		if (var3 + var5 > CollisionMap.canvasWidth) { // L: 8944
			var5 = CollisionMap.canvasWidth - var3;
		}

		if (var5 < 0) { // L: 8945
			var5 = 0;
		}

		int var6 = var2; // L: 8946
		if (var4 + var2 > Language.canvasHeight) { // L: 8947
			var6 = Language.canvasHeight - var4;
		}

		if (var6 < 0) { // L: 8948
			var6 = 0;
		}

		VarcInt.menuX = var5; // L: 8949
		NPC.menuY = var6; // L: 8950
		AttackOption.menuWidth = var3; // L: 8951
		MouseHandler.menuHeight = menuOptionsCount * 15 + 22; // L: 8952
		var1 -= viewportOffsetX; // L: 8954
		var2 -= viewportOffsetY; // L: 8955
		ReflectionCheck.scene.menuOpen(class383.Client_plane, var1, var2, false); // L: 8956
		isMenuOpen = true; // L: 8957
	} // L: 8958

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-462347970"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		ByteArrayPool.method7319(rootInterface, CollisionMap.canvasWidth, Language.canvasHeight, var1); // L: 10884
	} // L: 10885

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(Lkd;I)V",
		garbageValue = "-1538657910"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class175.getWidget(var1.parentId); // L: 10888
		int var3;
		int var4;
		if (var2 == null) { // L: 10891
			var3 = CollisionMap.canvasWidth; // L: 10892
			var4 = Language.canvasHeight; // L: 10893
		} else {
			var3 = var2.width; // L: 10896
			var4 = var2.height; // L: 10897
		}

		Player.alignWidgetSize(var1, var3, var4, false); // L: 10899
		class89.alignWidgetPosition(var1, var3, var4); // L: 10900
	} // L: 10901

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "607225278"
	)
	final void method1261() {
		class69.invalidateWidget(clickedWidget); // L: 11912
		++class87.widgetDragDuration; // L: 11913
		if (field701 && field745) { // L: 11914
			int var1 = MouseHandler.MouseHandler_x; // L: 11923
			int var2 = MouseHandler.MouseHandler_y; // L: 11924
			var1 -= widgetClickX; // L: 11925
			var2 -= widgetClickY; // L: 11926
			if (var1 < field699) { // L: 11927
				var1 = field699;
			}

			if (var1 + clickedWidget.width > field699 + clickedWidgetParent.width) { // L: 11928
				var1 = field699 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field613) { // L: 11929
				var2 = field613;
			}

			if (var2 + clickedWidget.height > field613 + clickedWidgetParent.height) { // L: 11930
				var2 = field613 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field519; // L: 11931
			int var4 = var2 - field703; // L: 11932
			int var5 = clickedWidget.dragZoneSize; // L: 11933
			if (class87.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 11934 11935
				isDraggingWidget = true; // L: 11936
			}

			int var6 = var1 - field699 + clickedWidgetParent.scrollX; // L: 11939
			int var7 = var2 - field613 + clickedWidgetParent.scrollY; // L: 11940
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 11941
				var8 = new ScriptEvent(); // L: 11942
				var8.widget = clickedWidget; // L: 11943
				var8.mouseX = var6; // L: 11944
				var8.mouseY = var7; // L: 11945
				var8.args = clickedWidget.onDrag; // L: 11946
				WorldMapElement.runScriptEvent(var8); // L: 11947
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 11949
				if (isDraggingWidget) { // L: 11950
					if (clickedWidget.onDragComplete != null) { // L: 11951
						var8 = new ScriptEvent(); // L: 11952
						var8.widget = clickedWidget; // L: 11953
						var8.mouseX = var6; // L: 11954
						var8.mouseY = var7; // L: 11955
						var8.dragTarget = draggedOnWidget; // L: 11956
						var8.args = clickedWidget.onDragComplete; // L: 11957
						WorldMapElement.runScriptEvent(var8); // L: 11958
					}

					if (draggedOnWidget != null) { // L: 11960
						Widget var9 = clickedWidget; // L: 11962
						int var11 = Clock.getWidgetFlags(var9); // L: 11965
						int var10 = var11 >> 17 & 7; // L: 11967
						int var12 = var10; // L: 11969
						Widget var15;
						if (var10 == 0) { // L: 11970
							var15 = null; // L: 11971
						} else {
							int var13 = 0;

							while (true) {
								if (var13 >= var12) {
									var15 = var9; // L: 11981
									break;
								}

								var9 = class175.getWidget(var9.parentId); // L: 11975
								if (var9 == null) { // L: 11976
									var15 = null; // L: 11977
									break; // L: 11978
								}

								++var13; // L: 11974
							}
						}

						if (var15 != null) { // L: 11983
							PacketBufferNode var14 = class136.getPacketBufferNode(ClientPacket.field3126, packetWriter.isaacCipher); // L: 11985
							var14.packetBuffer.method8607(clickedWidget.itemId); // L: 11986
							var14.packetBuffer.method8589(clickedWidget.childIndex); // L: 11987
							var14.packetBuffer.writeInt(draggedOnWidget.id); // L: 11988
							var14.packetBuffer.method8599(clickedWidget.id); // L: 11989
							var14.packetBuffer.method8607(draggedOnWidget.childIndex); // L: 11990
							var14.packetBuffer.method8607(draggedOnWidget.itemId); // L: 11991
							packetWriter.addNode(var14); // L: 11992
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 11997
					this.openMenu(field519 + widgetClickX, widgetClickY + field703); // L: 11998
				} else if (menuOptionsCount > 0) { // L: 12000
					WorldMapLabelSize.method4861(field519 + widgetClickX, field703 + widgetClickY); // L: 12001
				}

				clickedWidget = null; // L: 12004
			}

		} else {
			if (class87.widgetDragDuration > 1) { // L: 11915
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 11916
					WorldMapLabelSize.method4861(widgetClickX + field519, field703 + widgetClickY); // L: 11917
				}

				clickedWidget = null; // L: 11919
			}

		}
	} // L: 11921 12006

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(B)Lrp;",
		garbageValue = "77"
	)
	@Export("username")
	public Username username() {
		return class155.localPlayer != null ? class155.localPlayer.username : null; // L: 12688
	}

	public final void init() {
		try {
			if (this.checkHost()) { // L: 737
				int var8;
				for (int var1 = 0; var1 <= 28; ++var1) { // L: 738
					String var2 = this.getParameter(Integer.toString(var1)); // L: 739
					if (var2 != null) { // L: 740
						switch(var1) { // L: 741
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 813
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 814
							}
							break;
						case 4:
							if (clientType == -1) { // L: 801
								clientType = Integer.parseInt(var2); // L: 802
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 755
							break; // L: 756
						case 6:
							int var4 = Integer.parseInt(var2); // L: 761
							Language var17;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) { // L: 763
								var17 = Language.Language_valuesOrdered[var4]; // L: 767
							} else {
								var17 = null; // L: 764
							}

							class173.clientLanguage = var17; // L: 769
							break; // L: 770
						case 7:
							ModeWhere.field4325 = class16.method198(Integer.parseInt(var2)); // L: 796
							break; // L: 797
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 749
							}
							break;
						case 9:
							class133.field1635 = var2; // L: 835
							break; // L: 836
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.game3, StudioGame.stellardawn, StudioGame.runescape, StudioGame.oldscape, StudioGame.game5, StudioGame.game4}; // L: 821
							LoginPacket.field3302 = (StudioGame)World.findEnumerated(var3, Integer.parseInt(var2)); // L: 823
							if (LoginPacket.field3302 == StudioGame.oldscape) { // L: 824
								SecureRandomFuture.loginType = LoginType.oldscape;
							} else {
								SecureRandomFuture.loginType = LoginType.field4837; // L: 825
							}
							break;
						case 11:
							class17.field102 = var2; // L: 840
							break;
						case 12:
							worldId = Integer.parseInt(var2); // L: 744
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						case 22:
						case 23:
						case 24:
						default:
							break;
						case 14:
							DecorativeObject.field2799 = Integer.parseInt(var2); // L: 774
							break; // L: 775
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 791
							break; // L: 792
						case 17:
							class9.field41 = var2; // L: 808
							break; // L: 809
						case 21:
							field511 = Integer.parseInt(var2); // L: 830
							break; // L: 831
						case 25:
							var8 = var2.indexOf("."); // L: 779
							if (var8 == -1) { // L: 780
								field515 = Integer.parseInt(var2); // L: 781
							} else {
								field515 = Integer.parseInt(var2.substring(0, var8)); // L: 784
								Integer.parseInt(var2.substring(var8 + 1)); // L: 785
							}
						}
					}
				}

				class34.method485(); // L: 846
				class139.worldHost = this.getCodeBase().getHost(); // L: 847
				String var9 = ModeWhere.field4325.name; // L: 848
				byte var10 = 0; // L: 849

				try {
					class145.idxCount = 22; // L: 852
					LoginPacket.cacheGamebuild = var10; // L: 853

					try {
						class478.operatingSystemName = System.getProperty("os.name"); // L: 855
					} catch (Exception var14) { // L: 857
						class478.operatingSystemName = "Unknown"; // L: 858
					}

					Decimator.formattedOperatingSystemName = class478.operatingSystemName.toLowerCase(); // L: 860

					try {
						UserComparator3.userHomeDirectory = System.getProperty("user.home"); // L: 862
						if (UserComparator3.userHomeDirectory != null) { // L: 863
							UserComparator3.userHomeDirectory = UserComparator3.userHomeDirectory + "/";
						}
					} catch (Exception var13) { // L: 865
					}

					try {
						if (Decimator.formattedOperatingSystemName.startsWith("win")) { // L: 867
							if (UserComparator3.userHomeDirectory == null) { // L: 868
								UserComparator3.userHomeDirectory = System.getenv("USERPROFILE");
							}
						} else if (UserComparator3.userHomeDirectory == null) { // L: 871
							UserComparator3.userHomeDirectory = System.getenv("HOME");
						}

						if (UserComparator3.userHomeDirectory != null) { // L: 873
							UserComparator3.userHomeDirectory = UserComparator3.userHomeDirectory + "/";
						}
					} catch (Exception var12) { // L: 875
					}

					if (UserComparator3.userHomeDirectory == null) { // L: 876
						UserComparator3.userHomeDirectory = "~/";
					}

					class121.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", UserComparator3.userHomeDirectory, "/tmp/", ""}; // L: 877
					class89.cacheSubPaths = new String[]{".jagex_cache_" + LoginPacket.cacheGamebuild, ".file_store_" + LoginPacket.cacheGamebuild}; // L: 878

					label135:
					for (var8 = 0; var8 < 4; ++var8) { // L: 879
						class281.cacheDir = VarcInt.method3572("oldschool", var9, var8); // L: 880
						if (!class281.cacheDir.exists()) { // L: 881
							class281.cacheDir.mkdirs();
						}

						File[] var11 = class281.cacheDir.listFiles(); // L: 882
						if (var11 == null) { // L: 883
							break;
						}

						File[] var5 = var11; // L: 885
						int var6 = 0;

						while (true) {
							if (var6 >= var5.length) {
								break label135;
							}

							File var7 = var5[var6]; // L: 887
							if (!WorldMapLabelSize.method4858(var7, false)) { // L: 889
								break;
							}

							++var6; // L: 886
						}
					}

					class170.method3487(class281.cacheDir); // L: 896
					WorldMapSectionType.method5237(); // L: 897
					JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class306.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 898
					JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class306.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 899
					JagexCache.JagexCache_idxFiles = new BufferedFile[class145.idxCount]; // L: 900

					for (var8 = 0; var8 < class145.idxCount; ++var8) { // L: 901
						JagexCache.JagexCache_idxFiles[var8] = new BufferedFile(new AccessFile(class306.getFile("main_file_cache.idx" + var8), "rw", 1048576L), 6000, 0); // L: 902
					}
				} catch (Exception var15) { // L: 906
					class132.RunException_sendStackTrace((String)null, var15); // L: 907
				}

				BuddyRankComparator.client = this; // L: 909
				RunException.clientType = clientType; // L: 910
				if (field698 == -1) { // L: 911
					field698 = 0; // L: 912
				}

				class146.field1717 = System.getenv("JX_ACCESS_TOKEN"); // L: 914
				EnumComposition.field2006 = System.getenv("JX_REFRESH_TOKEN"); // L: 915
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) { // L: 916
					this.field590 = true; // L: 917
				}

				this.startThread(765, 503, 210, 1); // L: 919
			}
		} catch (RuntimeException var16) {
			throw EnumComposition.newRunException(var16, "client.init(" + ')');
		}
	} // L: 920

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 930
			this.otlTokenRequester = var1; // L: 933
			class12.method155(10); // L: 934
		}
	} // L: 931 935

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 949
	}

	public long getAccountHash() {
		return this.accountHash; // L: 954
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 940
			this.field666 = var1; // L: 943
		}
	} // L: 941 944

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "-1945377907"
	)
	static int method1742(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 2258
			class87.Interpreter_intStackSize -= 3; // L: 2259
			class1.queueSoundEffect(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]); // L: 2260
			return 1; // L: 2261
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 2263
			class169.playSong(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 2264
			return 1; // L: 2265
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 2267
			class87.Interpreter_intStackSize -= 2; // L: 2268
			class16.method197(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]); // L: 2269
			return 1; // L: 2270
		} else {
			class87 var3;
			class86 var4;
			int var5;
			int var6;
			String var7;
			if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 2272
				if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 2384
					return var0 == 3211 ? 1 : 2; // L: 2493 2494 2496
				} else {
					var3 = class87.field1114; // L: 2385
					var4 = class86.field1106; // L: 2386
					boolean var8 = false; // L: 2387
					if (var0 == 3214) { // L: 2388
						var6 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2389
						var3 = (class87)World.findEnumerated(class163.method3425(), var6); // L: 2390
						if (var3 == null) { // L: 2391
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2392
						}
					}

					if (var0 == 3215) { // L: 2395
						var6 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2396
						var4 = (class86)World.findEnumerated(WorldMapEvent.method5404(), var6); // L: 2397
						if (var4 == null) { // L: 2398
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2399
						}
					}

					if (var0 == 3210) { // L: 2402
						var6 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2403
						var3 = (class87)World.findEnumerated(class163.method3425(), var6); // L: 2404
						if (var3 == null) { // L: 2405
							var4 = (class86)World.findEnumerated(WorldMapEvent.method5404(), var6); // L: 2406
							if (var4 == null) { // L: 2407
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2408
							}
						}
					} else if (var0 == 3182) { // L: 2412
						var3 = class87.field1118; // L: 2413
					} else if (var0 == 3204) { // L: 2415
						var4 = class86.field1097; // L: 2416
					} else if (var0 == 3206) { // L: 2418
						var4 = class86.field1100; // L: 2419
					} else if (var0 == 3208) { // L: 2421
						var4 = class86.field1101; // L: 2422
					}

					if (var4 == class86.field1106) { // L: 2424
						switch(var3.field1115) { // L: 2425
						case 1:
							var5 = StructComposition.clientPreferences.method2413() ? 1 : 0; // L: 2443
							break; // L: 2444
						case 2:
							var5 = StructComposition.clientPreferences.method2428() ? 1 : 0; // L: 2453
							break; // L: 2454
						case 3:
							var5 = StructComposition.clientPreferences.method2419() ? 1 : 0; // L: 2428
							break;
						case 4:
							var5 = StructComposition.clientPreferences.method2421(); // L: 2433
							break; // L: 2434
						case 5:
							var5 = class273.method5478(); // L: 2448
							break; // L: 2449
						default:
							var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 2438
							throw new RuntimeException(var7); // L: 2439
						}
					} else {
						switch(var4.field1099) { // L: 2459
						case 1:
							var5 = StructComposition.clientPreferences.method2412() ? 1 : 0; // L: 2485
							break;
						case 2:
							var6 = StructComposition.clientPreferences.method2425(); // L: 2468
							var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2469
							break; // L: 2470
						case 3:
							var6 = StructComposition.clientPreferences.method2426(); // L: 2479
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2480
							break; // L: 2481
						case 4:
							var6 = StructComposition.clientPreferences.method2506(); // L: 2462
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2463
							break; // L: 2464
						default:
							var7 = String.format("Unkown game option: %s.", var4.toString()); // L: 2474
							throw new RuntimeException(var7); // L: 2475
						}
					}

					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5; // L: 2490
					return 1; // L: 2491
				}
			} else {
				var3 = class87.field1114; // L: 2273
				var4 = class86.field1106; // L: 2274
				var5 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2275
				if (var0 == 3212) { // L: 2276
					var6 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2277
					var3 = (class87)World.findEnumerated(class163.method3425(), var6); // L: 2278
					if (var3 == null) { // L: 2279
						throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2280
					}
				}

				if (var0 == 3213) { // L: 2283
					var6 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2284
					var4 = (class86)World.findEnumerated(WorldMapEvent.method5404(), var6); // L: 2285
					if (var4 == null) { // L: 2286
						throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2287
					}
				}

				if (var0 == 3209) { // L: 2290
					var6 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2291
					var3 = (class87)World.findEnumerated(class163.method3425(), var6); // L: 2292
					if (var3 == null) { // L: 2293
						var4 = (class86)World.findEnumerated(WorldMapEvent.method5404(), var6); // L: 2294
						if (var4 == null) { // L: 2295
							throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2296
						}
					}
				} else if (var0 == 3181) { // L: 2300
					var3 = class87.field1118; // L: 2301
				} else if (var0 == 3203) { // L: 2303
					var4 = class86.field1097; // L: 2304
				} else if (var0 == 3205) { // L: 2306
					var4 = class86.field1100; // L: 2307
				} else if (var0 == 3207) { // L: 2309
					var4 = class86.field1101; // L: 2310
				}

				if (var4 == class86.field1106) { // L: 2312
					switch(var3.field1115) { // L: 2313
					case 1:
						StructComposition.clientPreferences.method2461(var5 == 1); // L: 2326
						break; // L: 2327
					case 2:
						StructComposition.clientPreferences.method2448(var5 == 1); // L: 2321
						break;
					case 3:
						StructComposition.clientPreferences.method2470(var5 == 1); // L: 2336
						break; // L: 2337
					case 4:
						if (var5 < 0) { // L: 2341
							var5 = 0;
						}

						StructComposition.clientPreferences.method2420(var5); // L: 2342
						break; // L: 2343
					case 5:
						class14.method170(var5); // L: 2331
						break; // L: 2332
					default:
						var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 2316
						throw new RuntimeException(var7); // L: 2317
					}
				} else {
					switch(var4.field1099) { // L: 2348
					case 1:
						StructComposition.clientPreferences.method2486(var5 == 1); // L: 2370
						break; // L: 2371
					case 2:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2375
						var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 2376
						class299.method5834(var6); // L: 2377
						break; // L: 2378
					case 3:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2351
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2352
						class7.method43(var6); // L: 2353
						break; // L: 2354
					case 4:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2363
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2364
						class18.method270(var6); // L: 2365
						break; // L: 2366
					default:
						var7 = String.format("Unkown game option: %s.", var4.toString()); // L: 2358
						throw new RuntimeException(var7); // L: 2359
					}
				}

				return 1; // L: 2382
			}
		}
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(B)Lpb;",
		garbageValue = "45"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return KitDefinition.worldMap; // L: 727
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-4511"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (UserComparator8.pcmPlayer1 != null) { // L: 3384
			UserComparator8.pcmPlayer1.run();
		}

		if (TileItem.pcmPlayer0 != null) { // L: 3385
			TileItem.pcmPlayer0.run();
		}

	} // L: 3386
}
