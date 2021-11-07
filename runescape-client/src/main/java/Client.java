import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthTokens {
	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "[Ldm;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = 1318637709
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = -538262805
	)
	static int field678;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		longValue = 3974849306413912327L
	)
	static long field687;
	@ObfuscatedName("rg")
	static boolean field710;
	@ObfuscatedName("pf")
	static boolean[] field594;
	@ObfuscatedName("pc")
	static boolean[] field651;
	@ObfuscatedName("pn")
	static boolean[] field553;
	@ObfuscatedName("qe")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = -1647730605
	)
	public static int field742;
	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("qa")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("pa")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = -1255487241
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("qq")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	static final ApproximateRouteStrategy field743;
	@ObfuscatedName("pt")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("su")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		descriptor = "[Lkh;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("ug")
	static int[] field538;
	@ObfuscatedName("um")
	static int[] field748;
	@ObfuscatedName("sc")
	static boolean[] field718;
	@ObfuscatedName("ra")
	@ObfuscatedGetter(
		intValue = 211285431
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("sr")
	static int[] field719;
	@ObfuscatedName("sq")
	static int[] field598;
	@ObfuscatedName("so")
	static int[] field721;
	@ObfuscatedName("sh")
	static int[] field722;
	@ObfuscatedName("rb")
	@ObfuscatedGetter(
		intValue = -595533075
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("rc")
	@ObfuscatedGetter(
		intValue = 2048545999
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = 1780596505
	)
	static int field737;
	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "[Lea;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 2141771055
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = -1984953373
	)
	static int field581;
	@ObfuscatedName("uj")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = 1418203349
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = 1404229279
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = 1629793717
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("se")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("sv")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("sa")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "[Lat;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("sy")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("qn")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = -136098309
	)
	static int field701;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = 1315900691
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		longValue = 6414008887290405915L
	)
	static long field565;
	@ObfuscatedName("sw")
	static short field464;
	@ObfuscatedName("st")
	static short field550;
	@ObfuscatedName("to")
	static short field729;
	@ObfuscatedName("th")
	static short field730;
	@ObfuscatedName("tk")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("ti")
	static short field600;
	@ObfuscatedName("rw")
	@ObfuscatedGetter(
		intValue = -1202743261
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("tz")
	@ObfuscatedGetter(
		intValue = 1171128355
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("tf")
	static short field727;
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		intValue = -1988115801
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("rh")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("rk")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tg")
	@ObfuscatedGetter(
		intValue = -943486725
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("ts")
	@ObfuscatedGetter(
		intValue = 452108079
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		intValue = 1749362703
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("tx")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("tn")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = 1275977781
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("uf")
	@ObfuscatedGetter(
		intValue = 1680846629
	)
	static int field745;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = -1572669425
	)
	static int field695;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = 1785278473
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("qy")
	static int[] field697;
	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static NodeDeque field674;
	@ObfuscatedName("qp")
	static int[] field696;
	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static NodeDeque field675;
	@ObfuscatedName("qg")
	static int[] field689;
	@ObfuscatedName("qd")
	static String field692;
	@ObfuscatedName("ta")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lfq;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("ay")
	static boolean field497;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 351012489
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 2034448565
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1913834087
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bs")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bh")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -168480125
	)
	static int field467;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1336183037
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1541445221
	)
	static int field469;
	@ObfuscatedName("bz")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 235091161
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cm")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1803490967
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		longValue = -4321776978045133027L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1993769567
	)
	static int field475;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1440855955
	)
	static int field476;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		longValue = -3998157933727729695L
	)
	static long field477;
	@ObfuscatedName("dw")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dn")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 524609557
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 207642979
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 704173975
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -1671516751
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -1956341453
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 747205027
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -991742052
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 217183296
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 53883072
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 974303941
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 1817594467
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 622774087
	)
	static int field572;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = 1010630599
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -1726990903
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = -957566801
	)
	static int field496;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = -549727883
	)
	static int field685;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = 921847519
	)
	static int field498;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	static class112 field693;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	static class404 field500;
	@ObfuscatedName("fc")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fx")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "[Lcp;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = -1362315605
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("go")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -2135073429
	)
	static int field512;
	@ObfuscatedName("gn")
	static int[] field513;
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = 225699983
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ga")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("gs")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("gz")
	static boolean field619;
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("ge")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = 2056665983
	)
	static int field521;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = 25303697
	)
	static int field522;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = 363989163
	)
	static int field523;
	@ObfuscatedName("hf")
	@ObfuscatedGetter(
		intValue = -313172501
	)
	static int field524;
	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		intValue = 132761911
	)
	static int field485;
	@ObfuscatedName("hr")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("hp")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("hg")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("hc")
	static final int[] field530;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = 1163249681
	)
	static int field531;
	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		intValue = -2143676759
	)
	static int field628;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = 170443145
	)
	static int field534;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = -125520475
	)
	static int field535;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = 1324928345
	)
	static int field506;
	@ObfuscatedName("im")
	static boolean field465;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = 1325089479
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = -613321371
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = -999156139
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = -567570165
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = 503166845
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = 1038338863
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = 851159249
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 682763337
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = -953648473
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = -1959842021
	)
	static int field547;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -612526431
	)
	static int field520;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = 1932679935
	)
	static int field549;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -567507933
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 2001475371
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = -2052313535
	)
	static int field552;
	@ObfuscatedName("js")
	static boolean field511;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -1449900521
	)
	static int field620;
	@ObfuscatedName("jg")
	static boolean field555;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = 1902791501
	)
	static int field556;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = -384375877
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = -367077625
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("jd")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("jo")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("jq")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("ja")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("jr")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("ju")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("jb")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("jc")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("kg")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = -538809643
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = 1177959045
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = -1589309887
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = -1580074049
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -1310849273
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = -79046396
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = -776648095
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("kr")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = -1997052949
	)
	static int field576;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = -1194890067
	)
	static int field577;
	@ObfuscatedName("kv")
	@ObfuscatedGetter(
		intValue = -1781843123
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 1331142965
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -115957737
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("ke")
	@ObfuscatedGetter(
		intValue = 445396889
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("kz")
	static boolean field667;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 2009355879
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = -839662267
	)
	static int field539;
	@ObfuscatedName("kn")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "[Lcx;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = -296903929
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 1537694345
	)
	static int field588;
	@ObfuscatedName("ls")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 484882315
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 1643293445
	)
	static int field591;
	@ObfuscatedName("lx")
	static int[] field592;
	@ObfuscatedName("ln")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("lo")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("lu")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("lh")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = 398938707
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "[[[Lkn;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("lz")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("lv")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("lw")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -195460363
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("la")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -2068095649
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("mw")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("me")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("mb")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("mr")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("mq")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ms")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("mo")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("mc")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("md")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("ml")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("mf")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -96034183
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = 501918403
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = 1898641855
	)
	static int field621;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = 786548003
	)
	static int field714;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = -1422128073
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("nh")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = 124054907
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = 1744337675
	)
	static int field627;
	@ObfuscatedName("nj")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("np")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = 562838955
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = -1369344199
	)
	static int field479;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = 467301507
	)
	static int field633;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = -1388268323
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("nx")
	@ObfuscatedGetter(
		intValue = -1981485819
	)
	static int field656;
	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = -1598051109
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("nv")
	@ObfuscatedGetter(
		intValue = 878706649
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("nw")
	@ObfuscatedGetter(
		intValue = -755396483
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("nk")
	@ObfuscatedGetter(
		intValue = 1189338431
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("no")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = 641959691
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = 902517461
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("oo")
	static boolean field648;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = 1606030359
	)
	static int field649;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = 1355964353
	)
	static int field650;
	@ObfuscatedName("oi")
	static boolean field680;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = -30477907
	)
	static int field652;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = -1581362061
	)
	static int field468;
	@ObfuscatedName("op")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = 105350317
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("ov")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = -346434099
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("od")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = -1624807725
	)
	static int field659;
	@ObfuscatedName("oe")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = 936825
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("ou")
	static int[] field662;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 101503795
	)
	static int field663;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = 550781787
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = 651234723
	)
	static int field679;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -1548223605
	)
	static int field666;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = -1373827689
	)
	static int field681;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = 2096555667
	)
	static int field724;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = -1852458019
	)
	static int field536;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -789131501
	)
	static int field670;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 863379247
	)
	static int field494;
	@ObfuscatedName("ft")
	String field501;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Ll;"
	)
	class14 field491;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Ld;"
	)
	class19 field537;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	Buffer field579;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lp;"
	)
	class7 field507;

	static {
		field497 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field467 = -1;
		clientType = -1;
		field469 = -1;
		onMobile = false;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = 1L;
		field475 = -1;
		field476 = -1;
		field477 = -1L;
		hadFocus = true;
		displayFps = false;
		rebootTimer = 0;
		hintArrowType = 0;
		hintArrowNpcIndex = 0;
		hintArrowPlayerIndex = 0;
		hintArrowX = 0;
		hintArrowY = 0;
		hintArrowHeight = 0;
		hintArrowSubX = 0;
		hintArrowSubY = 0;
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		titleLoadingStage = 0;
		js5ConnectState = 0;
		field572 = 0;
		js5Errors = 0;
		loginState = 0;
		field496 = 0;
		field685 = 0;
		field498 = 0;
		field693 = class112.field1346;
		field500 = class404.field4351;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[32768];
		npcCount = 0;
		npcIndices = new int[32768];
		field512 = 0;
		field513 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		useBufferedSocket = true;
		field619 = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field521 = 0;
		field522 = 1;
		field523 = 0;
		field524 = 1;
		field485 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field530 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field531 = 0;
		field628 = 2301979;
		field534 = 5063219;
		field535 = 3353893;
		field506 = 7759444;
		field465 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field547 = 0;
		field520 = 0;
		field549 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field552 = 0;
		field511 = false;
		field620 = 0;
		field555 = false;
		field556 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		overheadTextCyclesRemaining = new int[overheadTextLimit];
		overheadText = new String[overheadTextLimit];
		tileLastDrawnActor = new int[104][104];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		showMouseCross = true;
		field576 = 0;
		field577 = 0;
		dragItemSlotSource = 0;
		draggedWidgetX = 0;
		draggedWidgetY = 0;
		dragItemSlotDestination = 0;
		field667 = false;
		itemDragDuration = 0;
		field539 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field588 = 0;
		renderSelf = true;
		drawPlayerNames = 0;
		field591 = 0;
		field592 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		groundItems = new NodeDeque[4][104][104];
		pendingSpawns = new NodeDeque();
		projectiles = new NodeDeque();
		graphicsObjects = new NodeDeque();
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		leftClickOpensMenu = 0;
		isMenuOpen = false;
		menuOptionsCount = 0;
		menuArguments1 = new int[500];
		menuArguments2 = new int[500];
		menuOpcodes = new int[500];
		menuIdentifiers = new int[500];
		menuActions = new String[500];
		menuTargets = new String[500];
		menuShiftClick = new boolean[500];
		followerOpsLowPriority = false;
		shiftClickDrop = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field621 = 0;
		field714 = 50;
		isItemSelected = 0;
		selectedItemName = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		field627 = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field479 = 0;
		field633 = -1;
		chatEffects = 0;
		field656 = 0;
		meslayerContinueWidget = null;
		runEnergy = 0;
		weight = 0;
		staffModLevel = 0;
		followerIndex = -1;
		playerMod = false;
		viewportWidget = null;
		clickedWidget = null;
		clickedWidgetParent = null;
		widgetClickX = 0;
		widgetClickY = 0;
		draggedOnWidget = null;
		field648 = false;
		field649 = -1;
		field650 = -1;
		field680 = false;
		field652 = -1;
		field468 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field659 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field662 = new int[32];
		field663 = 0;
		chatCycle = 0;
		field679 = 0;
		field666 = 0;
		field681 = 0;
		field724 = 0;
		field536 = 0;
		field670 = 0;
		field494 = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		field674 = new NodeDeque();
		field675 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field678 = -2;
		field594 = new boolean[100];
		field553 = new boolean[100];
		field651 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field687 = 0L;
		isResizable = true;
		field689 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field692 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field695 = 0;
		field696 = new int[128];
		field697 = new int[128];
		field565 = -1L;
		currentClanSettings = new ClanSettings[2];
		currentClanChannels = new ClanChannel[2];
		field701 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		currentTrackGroupId = -1;
		field710 = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field718 = new boolean[5];
		field719 = new int[5];
		field598 = new int[5];
		field721 = new int[5];
		field722 = new int[5];
		field464 = 256;
		field550 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field727 = 1;
		field600 = 32767;
		field729 = 1;
		field730 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field737 = -1;
		field581 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field742 = -1;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field745 = 0;
		field743 = new ApproximateRouteStrategy();
		field538 = new int[50];
		field748 = new int[50];
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1701018417"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field687 = class111.method2516() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2071280922"
	)
	@Export("setUp")
	protected final void setUp() {
		ItemComposition.method3408(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		ApproximateRouteStrategy.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		ParamComposition.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		ScriptEvent.currentPort = ApproximateRouteStrategy.worldPort;
		DesktopPlatformInfoProvider.field4081 = class260.field3035;
		class137.field1519 = class260.field3039;
		Varps.field3013 = class260.field3036;
		ClanChannel.field1512 = class260.field3037;
		class320.urlRequester = new UrlRequester();
		this.setUpKeyboard();
		this.method440();
		MouseHandler.mouseWheel = this.mouseWheel();
		WorldMapArea.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var2 = null;
		ClientPreferences var3 = new ClientPreferences();

		try {
			var2 = DevicePcmPlayerProvider.getPreferencesFile("", RouteStrategy.field1986.name, false);
			byte[] var4 = new byte[(int)var2.length()];

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) {
				var6 = var2.read(var4, var5, var4.length - var5);
				if (var6 == -1) {
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4));
		} catch (Exception var8) {
		}

		try {
			if (var2 != null) {
				var2.close();
			}
		} catch (Exception var7) {
		}

		class408.clientPreferences = var3;
		this.setUpClipboard();
		GrandExchangeOfferWorldComparator.method5440(this, VarcInt.field1645);
		if (gameBuild != 0) {
			displayFps = true;
		}

		HorizontalAlignment.setWindowedMode(class408.clientPreferences.windowMode);
		class112.friendSystem = new FriendSystem(GrandExchangeOfferUnitPriceComparator.loginType);
		this.field491 = new class14("tokenRequest", 1, 1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "466223513"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();
		Coord.method5011();
		class131.method2753();
		class14.playPcmPlayers();
		int var2;
		synchronized(KeyHandler.KeyHandler_instance) {
			++KeyHandler.KeyHandler_idleCycles;
			KeyHandler.field107 = KeyHandler.field131;
			KeyHandler.field110 = 0;
			KeyHandler.field135 = 0;
			Arrays.fill(KeyHandler.field118, false);
			Arrays.fill(KeyHandler.field119, false);
			if (KeyHandler.field122 < 0) {
				Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false);
				KeyHandler.field122 = KeyHandler.field133;
			} else {
				while (KeyHandler.field133 != KeyHandler.field122) {
					var2 = KeyHandler.field120[KeyHandler.field133];
					KeyHandler.field133 = KeyHandler.field133 + 1 & 127;
					if (var2 < 0) {
						var2 = ~var2;
						if (KeyHandler.KeyHandler_pressedKeys[var2]) {
							KeyHandler.KeyHandler_pressedKeys[var2] = false;
							KeyHandler.field119[var2] = true;
							KeyHandler.field127[KeyHandler.field135] = var2;
							++KeyHandler.field135;
						}
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var2] && KeyHandler.field110 < KeyHandler.field125.length - 1) {
							KeyHandler.field118[var2] = true;
							KeyHandler.field125[++KeyHandler.field110 - 1] = var2;
						}

						KeyHandler.KeyHandler_pressedKeys[var2] = true;
					}
				}
			}

			if (KeyHandler.field110 > 0) {
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field131 = KeyHandler.field130;
		}

		ModeWhere.method5542();
		int var45;
		if (MouseHandler.mouseWheel != null) {
			var45 = MouseHandler.mouseWheel.useRotation();
			mouseWheelRotation = var45;
		}

		if (gameState == 0) {
			NetSocket.load();
			Clock.clock.mark();

			for (var45 = 0; var45 < 32; ++var45) {
				GameEngine.graphicsTickTimes[var45] = 0L;
			}

			for (var45 = 0; var45 < 32; ++var45) {
				GameEngine.clientTickTimes[var45] = 0L;
			}

			class1.gameCyclesToDo = 0;
		} else if (gameState == 5) {
			class272.method5197(this, class6.fontPlain12);
			NetSocket.load();
			Clock.clock.mark();

			for (var45 = 0; var45 < 32; ++var45) {
				GameEngine.graphicsTickTimes[var45] = 0L;
			}

			for (var45 = 0; var45 < 32; ++var45) {
				GameEngine.clientTickTimes[var45] = 0L;
			}

			class1.gameCyclesToDo = 0;
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class272.method5197(this, class6.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 25) {
				MenuAction.method1912(false);
				field521 = 0;
				boolean var70 = true;

				for (var2 = 0; var2 < ModeWhere.regionLandArchives.length; ++var2) {
					if (class119.regionMapArchiveIds[var2] != -1 && ModeWhere.regionLandArchives[var2] == null) {
						ModeWhere.regionLandArchives[var2] = class11.archive5.takeFile(class119.regionMapArchiveIds[var2], 0);
						if (ModeWhere.regionLandArchives[var2] == null) {
							var70 = false;
							++field521;
						}
					}

					if (class21.regionLandArchiveIds[var2] != -1 && class184.regionMapArchives[var2] == null) {
						class184.regionMapArchives[var2] = class11.archive5.takeFileEncrypted(class21.regionLandArchiveIds[var2], 0, xteaKeys[var2]);
						if (class184.regionMapArchives[var2] == null) {
							var70 = false;
							++field521;
						}
					}
				}

				if (!var70) {
					field485 = 1;
				} else {
					field523 = 0;
					var70 = true;

					int var4;
					int var5;
					for (var2 = 0; var2 < ModeWhere.regionLandArchives.length; ++var2) {
						byte[] var3 = class184.regionMapArchives[var2];
						if (var3 != null) {
							var4 = (LoginScreenAnimation.regions[var2] >> 8) * 64 - class19.baseX * 64;
							var5 = (LoginScreenAnimation.regions[var2] & 255) * 64 - DefaultsGroup.baseY * 64;
							if (isInInstance) {
								var4 = 10;
								var5 = 10;
							}

							var70 &= class9.method69(var3, var4, var5);
						}
					}

					if (!var70) {
						field485 = 2;
					} else {
						if (field485 != 0) {
							class91.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
						}

						class14.playPcmPlayers();
						GameBuild.scene.clear();

						for (var2 = 0; var2 < 4; ++var2) {
							collisionMaps[var2].clear();
						}

						int var46;
						for (var2 = 0; var2 < 4; ++var2) {
							for (var46 = 0; var46 < 104; ++var46) {
								for (var4 = 0; var4 < 104; ++var4) {
									Tiles.Tiles_renderFlags[var2][var46][var4] = 0;
								}
							}
						}

						class14.playPcmPlayers();
						Tiles.Tiles_minPlane = 99;
						Tiles.Tiles_underlays = new byte[4][104][104];
						Tiles.Tiles_overlays = new byte[4][104][104];
						Tiles.Tiles_shapes = new byte[4][104][104];
						Tiles.field969 = new byte[4][104][104];
						Tiles.field962 = new int[4][105][105];
						class54.field419 = new byte[4][105][105];
						DirectByteArrayCopier.field3212 = new int[105][105];
						TileItem.Tiles_hue = new int[104];
						class397.Tiles_saturation = new int[104];
						Tiles.Tiles_lightness = new int[104];
						class1.Tiles_hueMultiplier = new int[104];
						class81.field1039 = new int[104];
						var2 = ModeWhere.regionLandArchives.length;

						for (ObjectSound var59 = (ObjectSound)ObjectSound.objectSounds.last(); var59 != null; var59 = (ObjectSound)ObjectSound.objectSounds.previous()) {
							if (var59.stream1 != null) {
								BuddyRankComparator.pcmStreamMixer.removeSubStream(var59.stream1);
								var59.stream1 = null;
							}

							if (var59.stream2 != null) {
								BuddyRankComparator.pcmStreamMixer.removeSubStream(var59.stream2);
								var59.stream2 = null;
							}
						}

						ObjectSound.objectSounds.clear();
						MenuAction.method1912(true);
						int var48;
						if (!isInInstance) {
							byte[] var6;
							for (var46 = 0; var46 < var2; ++var46) {
								var4 = (LoginScreenAnimation.regions[var46] >> 8) * 64 - class19.baseX * 64;
								var5 = (LoginScreenAnimation.regions[var46] & 255) * 64 - DefaultsGroup.baseY * 64;
								var6 = ModeWhere.regionLandArchives[var46];
								if (var6 != null) {
									class14.playPcmPlayers();
									FontName.method6688(var6, var4, var5, ItemLayer.field2243 * 8 - 48, WallDecoration.field2630 * 8 - 48, collisionMaps);
								}
							}

							for (var46 = 0; var46 < var2; ++var46) {
								var4 = (LoginScreenAnimation.regions[var46] >> 8) * 64 - class19.baseX * 64;
								var5 = (LoginScreenAnimation.regions[var46] & 255) * 64 - DefaultsGroup.baseY * 64;
								var6 = ModeWhere.regionLandArchives[var46];
								if (var6 == null && WallDecoration.field2630 < 800) {
									class14.playPcmPlayers();
									class247.method4751(var4, var5, 64, 64);
								}
							}

							MenuAction.method1912(true);

							for (var46 = 0; var46 < var2; ++var46) {
								byte[] var47 = class184.regionMapArchives[var46];
								if (var47 != null) {
									var5 = (LoginScreenAnimation.regions[var46] >> 8) * 64 - class19.baseX * 64;
									var48 = (LoginScreenAnimation.regions[var46] & 255) * 64 - DefaultsGroup.baseY * 64;
									class14.playPcmPlayers();
									PendingSpawn.method2162(var47, var5, var48, GameBuild.scene, collisionMaps);
								}
							}
						}

						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						int var12;
						int var13;
						int var14;
						int var15;
						int var16;
						int var17;
						int var21;
						int var22;
						int var23;
						int var24;
						int var25;
						int var26;
						int var27;
						int var28;
						int var29;
						int var30;
						int var32;
						int var33;
						int var34;
						if (isInInstance) {
							var46 = 0;

							label1259:
							while (true) {
								if (var46 >= 4) {
									for (var46 = 0; var46 < 13; ++var46) {
										for (var4 = 0; var4 < 13; ++var4) {
											var5 = instanceChunkTemplates[0][var46][var4];
											if (var5 == -1) {
												class247.method4751(var46 * 8, var4 * 8, 8, 8);
											}
										}
									}

									MenuAction.method1912(true);
									var46 = 0;

									while (true) {
										if (var46 >= 4) {
											break label1259;
										}

										class14.playPcmPlayers();

										for (var4 = 0; var4 < 13; ++var4) {
											label1182:
											for (var5 = 0; var5 < 13; ++var5) {
												var48 = instanceChunkTemplates[var46][var4][var5];
												if (var48 != -1) {
													var7 = var48 >> 24 & 3;
													var8 = var48 >> 1 & 3;
													var9 = var48 >> 14 & 1023;
													var10 = var48 >> 3 & 2047;
													var11 = (var9 / 8 << 8) + var10 / 8;

													for (var12 = 0; var12 < LoginScreenAnimation.regions.length; ++var12) {
														if (LoginScreenAnimation.regions[var12] == var11 && class184.regionMapArchives[var12] != null) {
															byte[] var49 = class184.regionMapArchives[var12];
															var14 = var4 * 8;
															var15 = var5 * 8;
															var16 = (var9 & 7) * 8;
															var17 = (var10 & 7) * 8;
															Scene var18 = GameBuild.scene;
															CollisionMap[] var19 = collisionMaps;
															Buffer var20 = new Buffer(var49);
															var21 = -1;

															while (true) {
																var22 = var20.method6981();
																if (var22 == 0) {
																	continue label1182;
																}

																var21 += var22;
																var23 = 0;

																while (true) {
																	var24 = var20.readUShortSmart();
																	if (var24 == 0) {
																		break;
																	}

																	var23 += var24 - 1;
																	var25 = var23 & 63;
																	var26 = var23 >> 6 & 63;
																	var27 = var23 >> 12;
																	var28 = var20.readUnsignedByte();
																	var29 = var28 >> 2;
																	var30 = var28 & 3;
																	if (var27 == var7 && var26 >= var16 && var26 < var16 + 8 && var25 >= var17 && var25 < var17 + 8) {
																		ObjectComposition var31 = KitDefinition.getObjectDefinition(var21);
																		Object var10001 = null;
																		var32 = var14 + SoundSystem.method780(var26 & 7, var25 & 7, var8, var31.sizeX, var31.sizeY, var30);
																		var10001 = null;
																		var33 = var15 + WorldMapRectangle.method3960(var26 & 7, var25 & 7, var8, var31.sizeX, var31.sizeY, var30);
																		if (var32 > 0 && var33 > 0 && var32 < 103 && var33 < 103) {
																			var34 = var46;
																			if ((Tiles.Tiles_renderFlags[1][var32][var33] & 2) == 2) {
																				var34 = var46 - 1;
																			}

																			CollisionMap var35 = null;
																			if (var34 >= 0) {
																				var35 = var19[var34];
																			}

																			class92.method2276(var46, var32, var33, var21, var8 + var30 & 3, var29, var18, var35);
																		}
																	}
																}
															}
														}
													}
												}
											}
										}

										++var46;
									}
								}

								class14.playPcmPlayers();

								for (var4 = 0; var4 < 13; ++var4) {
									for (var5 = 0; var5 < 13; ++var5) {
										boolean var71 = false;
										var7 = instanceChunkTemplates[var46][var4][var5];
										if (var7 != -1) {
											var8 = var7 >> 24 & 3;
											var9 = var7 >> 1 & 3;
											var10 = var7 >> 14 & 1023;
											var11 = var7 >> 3 & 2047;
											var12 = (var10 / 8 << 8) + var11 / 8;

											for (var13 = 0; var13 < LoginScreenAnimation.regions.length; ++var13) {
												if (LoginScreenAnimation.regions[var13] == var12 && ModeWhere.regionLandArchives[var13] != null) {
													FloorOverlayDefinition.method3427(ModeWhere.regionLandArchives[var13], var46, var4 * 8, var5 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9, collisionMaps);
													var71 = true;
													break;
												}
											}
										}

										if (!var71) {
											var8 = var46;
											var9 = var4 * 8;
											var10 = var5 * 8;

											for (var11 = 0; var11 < 8; ++var11) {
												for (var12 = 0; var12 < 8; ++var12) {
													Tiles.Tiles_heights[var8][var11 + var9][var10 + var12] = 0;
												}
											}

											if (var9 > 0) {
												for (var11 = 1; var11 < 8; ++var11) {
													Tiles.Tiles_heights[var8][var9][var10 + var11] = Tiles.Tiles_heights[var8][var9 - 1][var11 + var10];
												}
											}

											if (var10 > 0) {
												for (var11 = 1; var11 < 8; ++var11) {
													Tiles.Tiles_heights[var8][var9 + var11][var10] = Tiles.Tiles_heights[var8][var9 + var11][var10 - 1];
												}
											}

											if (var9 > 0 && Tiles.Tiles_heights[var8][var9 - 1][var10] != 0) {
												Tiles.Tiles_heights[var8][var9][var10] = Tiles.Tiles_heights[var8][var9 - 1][var10];
											} else if (var10 > 0 && Tiles.Tiles_heights[var8][var9][var10 - 1] != 0) {
												Tiles.Tiles_heights[var8][var9][var10] = Tiles.Tiles_heights[var8][var9][var10 - 1];
											} else if (var9 > 0 && var10 > 0 && Tiles.Tiles_heights[var8][var9 - 1][var10 - 1] != 0) {
												Tiles.Tiles_heights[var8][var9][var10] = Tiles.Tiles_heights[var8][var9 - 1][var10 - 1];
											}
										}
									}
								}

								++var46;
							}
						}

						MenuAction.method1912(true);
						class14.playPcmPlayers();
						Scene var60 = GameBuild.scene;
						CollisionMap[] var69 = collisionMaps;

						for (var5 = 0; var5 < 4; ++var5) {
							for (var48 = 0; var48 < 104; ++var48) {
								for (var7 = 0; var7 < 104; ++var7) {
									if ((Tiles.Tiles_renderFlags[var5][var48][var7] & 1) == 1) {
										var8 = var5;
										if ((Tiles.Tiles_renderFlags[1][var48][var7] & 2) == 2) {
											var8 = var5 - 1;
										}

										if (var8 >= 0) {
											var69[var8].setBlockedByFloor(var48, var7);
										}
									}
								}
							}
						}

						Tiles.rndHue += (int)(Math.random() * 5.0D) - 2;
						if (Tiles.rndHue < -8) {
							Tiles.rndHue = -8;
						}

						if (Tiles.rndHue > 8) {
							Tiles.rndHue = 8;
						}

						Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2;
						if (Tiles.rndLightness < -16) {
							Tiles.rndLightness = -16;
						}

						if (Tiles.rndLightness > 16) {
							Tiles.rndLightness = 16;
						}

						int[] var10000;
						int var50;
						int var51;
						int var52;
						for (var5 = 0; var5 < 4; ++var5) {
							byte[][] var61 = class54.field419[var5];
							var12 = (int)Math.sqrt(5100.0D);
							var13 = var12 * 768 >> 8;

							for (var14 = 1; var14 < 103; ++var14) {
								for (var15 = 1; var15 < 103; ++var15) {
									var16 = Tiles.Tiles_heights[var5][var15 + 1][var14] - Tiles.Tiles_heights[var5][var15 - 1][var14];
									var17 = Tiles.Tiles_heights[var5][var15][var14 + 1] - Tiles.Tiles_heights[var5][var15][var14 - 1];
									var50 = (int)Math.sqrt((double)(var16 * var16 + var17 * var17 + 65536));
									var51 = (var16 << 8) / var50;
									var52 = 65536 / var50;
									var21 = (var17 << 8) / var50;
									var22 = (var51 * -50 + var21 * -50 + var52 * -10) / var13 + 96;
									var23 = (var61[var15][var14 + 1] >> 3) + (var61[var15 - 1][var14] >> 2) + (var61[var15][var14 - 1] >> 2) + (var61[var15 + 1][var14] >> 3) + (var61[var15][var14] >> 1);
									DirectByteArrayCopier.field3212[var15][var14] = var22 - var23;
								}
							}

							for (var14 = 0; var14 < 104; ++var14) {
								TileItem.Tiles_hue[var14] = 0;
								class397.Tiles_saturation[var14] = 0;
								Tiles.Tiles_lightness[var14] = 0;
								class1.Tiles_hueMultiplier[var14] = 0;
								class81.field1039[var14] = 0;
							}

							for (var14 = -5; var14 < 109; ++var14) {
								for (var15 = 0; var15 < 104; ++var15) {
									var16 = var14 + 5;
									int var10002;
									if (var16 >= 0 && var16 < 104) {
										var17 = Tiles.Tiles_underlays[var5][var16][var15] & 255;
										if (var17 > 0) {
											var51 = var17 - 1;
											FloorUnderlayDefinition var67 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var51);
											FloorUnderlayDefinition var64;
											if (var67 != null) {
												var64 = var67;
											} else {
												byte[] var53 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var51);
												var67 = new FloorUnderlayDefinition();
												if (var53 != null) {
													var67.decode(new Buffer(var53), var51);
												}

												var67.postDecode();
												FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var67, (long)var51);
												var64 = var67;
											}

											var10000 = TileItem.Tiles_hue;
											var10000[var15] += var64.hue;
											var10000 = class397.Tiles_saturation;
											var10000[var15] += var64.saturation;
											var10000 = Tiles.Tiles_lightness;
											var10000[var15] += var64.lightness;
											var10000 = class1.Tiles_hueMultiplier;
											var10000[var15] += var64.hueMultiplier;
											var10002 = class81.field1039[var15]++;
										}
									}

									var17 = var14 - 5;
									if (var17 >= 0 && var17 < 104) {
										var50 = Tiles.Tiles_underlays[var5][var17][var15] & 255;
										if (var50 > 0) {
											var52 = var50 - 1;
											FloorUnderlayDefinition var72 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var52);
											FloorUnderlayDefinition var65;
											if (var72 != null) {
												var65 = var72;
											} else {
												byte[] var54 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var52);
												var72 = new FloorUnderlayDefinition();
												if (var54 != null) {
													var72.decode(new Buffer(var54), var52);
												}

												var72.postDecode();
												FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var72, (long)var52);
												var65 = var72;
											}

											var10000 = TileItem.Tiles_hue;
											var10000[var15] -= var65.hue;
											var10000 = class397.Tiles_saturation;
											var10000[var15] -= var65.saturation;
											var10000 = Tiles.Tiles_lightness;
											var10000[var15] -= var65.lightness;
											var10000 = class1.Tiles_hueMultiplier;
											var10000[var15] -= var65.hueMultiplier;
											var10002 = class81.field1039[var15]--;
										}
									}
								}

								if (var14 >= 1 && var14 < 103) {
									var15 = 0;
									var16 = 0;
									var17 = 0;
									var50 = 0;
									var51 = 0;

									for (var52 = -5; var52 < 109; ++var52) {
										var21 = var52 + 5;
										if (var21 >= 0 && var21 < 104) {
											var15 += TileItem.Tiles_hue[var21];
											var16 += class397.Tiles_saturation[var21];
											var17 += Tiles.Tiles_lightness[var21];
											var50 += class1.Tiles_hueMultiplier[var21];
											var51 += class81.field1039[var21];
										}

										var22 = var52 - 5;
										if (var22 >= 0 && var22 < 104) {
											var15 -= TileItem.Tiles_hue[var22];
											var16 -= class397.Tiles_saturation[var22];
											var17 -= Tiles.Tiles_lightness[var22];
											var50 -= class1.Tiles_hueMultiplier[var22];
											var51 -= class81.field1039[var22];
										}

										if (var52 >= 1 && var52 < 103 && (!isLowDetail || (Tiles.Tiles_renderFlags[0][var14][var52] & 2) != 0 || (Tiles.Tiles_renderFlags[var5][var14][var52] & 16) == 0)) {
											if (var5 < Tiles.Tiles_minPlane) {
												Tiles.Tiles_minPlane = var5;
											}

											var23 = Tiles.Tiles_underlays[var5][var14][var52] & 255;
											var24 = Tiles.Tiles_overlays[var5][var14][var52] & 255;
											if (var23 > 0 || var24 > 0) {
												var25 = Tiles.Tiles_heights[var5][var14][var52];
												var26 = Tiles.Tiles_heights[var5][var14 + 1][var52];
												var27 = Tiles.Tiles_heights[var5][var14 + 1][var52 + 1];
												var28 = Tiles.Tiles_heights[var5][var14][var52 + 1];
												var29 = DirectByteArrayCopier.field3212[var14][var52];
												var30 = DirectByteArrayCopier.field3212[var14 + 1][var52];
												int var55 = DirectByteArrayCopier.field3212[var14 + 1][var52 + 1];
												var32 = DirectByteArrayCopier.field3212[var14][var52 + 1];
												var33 = -1;
												var34 = -1;
												int var36;
												int var56;
												if (var23 > 0) {
													var56 = var15 * 256 / var50;
													var36 = var16 / var51;
													int var37 = var17 / var51;
													var33 = class17.hslToRgb(var56, var36, var37);
													var56 = var56 + Tiles.rndHue & 255;
													var37 += Tiles.rndLightness;
													if (var37 < 0) {
														var37 = 0;
													} else if (var37 > 255) {
														var37 = 255;
													}

													var34 = class17.hslToRgb(var56, var36, var37);
												}

												if (var5 > 0) {
													boolean var73 = true;
													if (var23 == 0 && Tiles.Tiles_shapes[var5][var14][var52] != 0) {
														var73 = false;
													}

													if (var24 > 0 && !InvDefinition.method2987(var24 - 1).hideUnderlay) {
														var73 = false;
													}

													if (var73 && var26 == var25 && var25 == var27 && var25 == var28) {
														var10000 = Tiles.field962[var5][var14];
														var10000[var52] |= 2340;
													}
												}

												var56 = 0;
												if (var34 != -1) {
													var56 = Rasterizer3D.Rasterizer3D_colorPalette[UserComparator8.method2456(var34, 96)];
												}

												if (var24 == 0) {
													var60.addTile(var5, var14, var52, 0, 0, -1, var25, var26, var27, var28, UserComparator8.method2456(var33, var29), UserComparator8.method2456(var33, var30), UserComparator8.method2456(var33, var55), UserComparator8.method2456(var33, var32), 0, 0, 0, 0, var56, 0);
												} else {
													var36 = Tiles.Tiles_shapes[var5][var14][var52] + 1;
													byte var68 = Tiles.field969[var5][var14][var52];
													FloorOverlayDefinition var38 = InvDefinition.method2987(var24 - 1);
													int var39 = var38.texture;
													int var40;
													int var41;
													int var42;
													int var43;
													if (var39 >= 0) {
														var41 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var39);
														var40 = -1;
													} else if (var38.primaryRgb == 16711935) {
														var40 = -2;
														var39 = -1;
														var41 = -2;
													} else {
														var40 = class17.hslToRgb(var38.hue, var38.saturation, var38.lightness);
														var42 = var38.hue + Tiles.rndHue & 255;
														var43 = var38.lightness + Tiles.rndLightness;
														if (var43 < 0) {
															var43 = 0;
														} else if (var43 > 255) {
															var43 = 255;
														}

														var41 = class17.hslToRgb(var42, var38.saturation, var43);
													}

													var42 = 0;
													if (var41 != -2) {
														var42 = Rasterizer3D.Rasterizer3D_colorPalette[WorldMapIcon_0.method3885(var41, 96)];
													}

													if (var38.secondaryRgb != -1) {
														var43 = var38.secondaryHue + Tiles.rndHue & 255;
														int var44 = var38.secondaryLightness + Tiles.rndLightness;
														if (var44 < 0) {
															var44 = 0;
														} else if (var44 > 255) {
															var44 = 255;
														}

														var41 = class17.hslToRgb(var43, var38.secondarySaturation, var44);
														var42 = Rasterizer3D.Rasterizer3D_colorPalette[WorldMapIcon_0.method3885(var41, 96)];
													}

													var60.addTile(var5, var14, var52, var36, var68, var39, var25, var26, var27, var28, UserComparator8.method2456(var33, var29), UserComparator8.method2456(var33, var30), UserComparator8.method2456(var33, var55), UserComparator8.method2456(var33, var32), WorldMapIcon_0.method3885(var40, var29), WorldMapIcon_0.method3885(var40, var30), WorldMapIcon_0.method3885(var40, var55), WorldMapIcon_0.method3885(var40, var32), var56, var42);
												}
											}
										}
									}
								}
							}

							for (var14 = 1; var14 < 103; ++var14) {
								for (var15 = 1; var15 < 103; ++var15) {
									if ((Tiles.Tiles_renderFlags[var5][var15][var14] & 8) != 0) {
										var52 = 0;
									} else if (var5 > 0 && (Tiles.Tiles_renderFlags[1][var15][var14] & 2) != 0) {
										var52 = var5 - 1;
									} else {
										var52 = var5;
									}

									var60.setTileMinPlane(var5, var15, var14, var52);
								}
							}

							Tiles.Tiles_underlays[var5] = null;
							Tiles.Tiles_overlays[var5] = null;
							Tiles.Tiles_shapes[var5] = null;
							Tiles.field969[var5] = null;
							class54.field419[var5] = null;
						}

						var60.method4310(-50, -10, -50);

						for (var5 = 0; var5 < 104; ++var5) {
							for (var48 = 0; var48 < 104; ++var48) {
								if ((Tiles.Tiles_renderFlags[1][var5][var48] & 2) == 2) {
									var60.setLinkBelow(var5, var48);
								}
							}
						}

						var5 = 1;
						var48 = 2;
						var7 = 4;

						for (var8 = 0; var8 < 4; ++var8) {
							if (var8 > 0) {
								var5 <<= 3;
								var48 <<= 3;
								var7 <<= 3;
							}

							for (var9 = 0; var9 <= var8; ++var9) {
								for (var10 = 0; var10 <= 104; ++var10) {
									for (var11 = 0; var11 <= 104; ++var11) {
										short var66;
										if ((Tiles.field962[var9][var11][var10] & var5) != 0) {
											var12 = var10;
											var13 = var10;
											var14 = var9;

											for (var15 = var9; var12 > 0 && (Tiles.field962[var9][var11][var12 - 1] & var5) != 0; --var12) {
											}

											while (var13 < 104 && (Tiles.field962[var9][var11][var13 + 1] & var5) != 0) {
												++var13;
											}

											label901:
											while (var14 > 0) {
												for (var16 = var12; var16 <= var13; ++var16) {
													if ((Tiles.field962[var14 - 1][var11][var16] & var5) == 0) {
														break label901;
													}
												}

												--var14;
											}

											label890:
											while (var15 < var8) {
												for (var16 = var12; var16 <= var13; ++var16) {
													if ((Tiles.field962[var15 + 1][var11][var16] & var5) == 0) {
														break label890;
													}
												}

												++var15;
											}

											var16 = (var15 + 1 - var14) * (var13 - var12 + 1);
											if (var16 >= 8) {
												var66 = 240;
												var50 = Tiles.Tiles_heights[var15][var11][var12] - var66;
												var51 = Tiles.Tiles_heights[var14][var11][var12];
												Scene.Scene_addOccluder(var8, 1, var11 * 128, var11 * 128, var12 * 128, var13 * 128 + 128, var50, var51);

												for (var52 = var14; var52 <= var15; ++var52) {
													for (var21 = var12; var21 <= var13; ++var21) {
														var10000 = Tiles.field962[var52][var11];
														var10000[var21] &= ~var5;
													}
												}
											}
										}

										if ((Tiles.field962[var9][var11][var10] & var48) != 0) {
											var12 = var11;
											var13 = var11;
											var14 = var9;

											for (var15 = var9; var12 > 0 && (Tiles.field962[var9][var12 - 1][var10] & var48) != 0; --var12) {
											}

											while (var13 < 104 && (Tiles.field962[var9][var13 + 1][var10] & var48) != 0) {
												++var13;
											}

											label954:
											while (var14 > 0) {
												for (var16 = var12; var16 <= var13; ++var16) {
													if ((Tiles.field962[var14 - 1][var16][var10] & var48) == 0) {
														break label954;
													}
												}

												--var14;
											}

											label943:
											while (var15 < var8) {
												for (var16 = var12; var16 <= var13; ++var16) {
													if ((Tiles.field962[var15 + 1][var16][var10] & var48) == 0) {
														break label943;
													}
												}

												++var15;
											}

											var16 = (var13 - var12 + 1) * (var15 + 1 - var14);
											if (var16 >= 8) {
												var66 = 240;
												var50 = Tiles.Tiles_heights[var15][var12][var10] - var66;
												var51 = Tiles.Tiles_heights[var14][var12][var10];
												Scene.Scene_addOccluder(var8, 2, var12 * 128, var13 * 128 + 128, var10 * 128, var10 * 128, var50, var51);

												for (var52 = var14; var52 <= var15; ++var52) {
													for (var21 = var12; var21 <= var13; ++var21) {
														var10000 = Tiles.field962[var52][var21];
														var10000[var10] &= ~var48;
													}
												}
											}
										}

										if ((Tiles.field962[var9][var11][var10] & var7) != 0) {
											var12 = var11;
											var13 = var11;
											var14 = var10;

											for (var15 = var10; var14 > 0 && (Tiles.field962[var9][var11][var14 - 1] & var7) != 0; --var14) {
											}

											while (var15 < 104 && (Tiles.field962[var9][var11][var15 + 1] & var7) != 0) {
												++var15;
											}

											label1007:
											while (var12 > 0) {
												for (var16 = var14; var16 <= var15; ++var16) {
													if ((Tiles.field962[var9][var12 - 1][var16] & var7) == 0) {
														break label1007;
													}
												}

												--var12;
											}

											label996:
											while (var13 < 104) {
												for (var16 = var14; var16 <= var15; ++var16) {
													if ((Tiles.field962[var9][var13 + 1][var16] & var7) == 0) {
														break label996;
													}
												}

												++var13;
											}

											if ((var13 - var12 + 1) * (var15 - var14 + 1) >= 4) {
												var16 = Tiles.Tiles_heights[var9][var12][var14];
												Scene.Scene_addOccluder(var8, 4, var12 * 128, var13 * 128 + 128, var14 * 128, var15 * 128 + 128, var16, var16);

												for (var17 = var12; var17 <= var13; ++var17) {
													for (var50 = var14; var50 <= var15; ++var50) {
														var10000 = Tiles.field962[var9][var17];
														var10000[var50] &= ~var7;
													}
												}
											}
										}
									}
								}
							}
						}

						MenuAction.method1912(true);
						var5 = Tiles.Tiles_minPlane;
						if (var5 > GrandExchangeOfferTotalQuantityComparator.Client_plane) {
							var5 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
						}

						if (var5 < GrandExchangeOfferTotalQuantityComparator.Client_plane - 1) {
							var5 = GrandExchangeOfferTotalQuantityComparator.Client_plane - 1;
						}

						if (isLowDetail) {
							GameBuild.scene.init(Tiles.Tiles_minPlane);
						} else {
							GameBuild.scene.init(0);
						}

						for (var48 = 0; var48 < 104; ++var48) {
							for (var7 = 0; var7 < 104; ++var7) {
								WallDecoration.updateItemPile(var48, var7);
							}
						}

						class14.playPcmPlayers();

						for (PendingSpawn var62 = (PendingSpawn)pendingSpawns.last(); var62 != null; var62 = (PendingSpawn)pendingSpawns.previous()) {
							if (var62.hitpoints == -1) {
								var62.delay = 0;
								class14.method180(var62);
							} else {
								var62.remove();
							}
						}

						ObjectComposition.ObjectDefinition_cachedModelData.clear();
						PacketBufferNode var63;
						if (ArchiveLoader.client.hasFrame()) {
							var63 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2679, packetWriter.isaacCipher);
							var63.packetBuffer.writeInt(1057001181);
							packetWriter.addNode(var63);
						}

						if (!isInInstance) {
							var48 = (ItemLayer.field2243 - 6) / 8;
							var7 = (ItemLayer.field2243 + 6) / 8;
							var8 = (WallDecoration.field2630 - 6) / 8;
							var9 = (WallDecoration.field2630 + 6) / 8;

							for (var10 = var48 - 1; var10 <= var7 + 1; ++var10) {
								for (var11 = var8 - 1; var11 <= var9 + 1; ++var11) {
									if (var10 < var48 || var10 > var7 || var11 < var8 || var11 > var9) {
										class11.archive5.loadRegionFromName("m" + var10 + "_" + var11);
										class11.archive5.loadRegionFromName("l" + var10 + "_" + var11);
									}
								}
							}
						}

						WorldMapData_1.updateGameState(30);
						class14.playPcmPlayers();
						class113.method2533();
						var63 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2713, packetWriter.isaacCipher);
						packetWriter.addNode(var63);
						Clock.clock.mark();

						for (var7 = 0; var7 < 32; ++var7) {
							GameEngine.graphicsTickTimes[var7] = 0L;
						}

						for (var7 = 0; var7 < 32; ++var7) {
							GameEngine.clientTickTimes[var7] = 0L;
						}

						class1.gameCyclesToDo = 0;
					}
				}
			}
		} else {
			class272.method5197(this, class6.fontPlain12);
		}

		if (gameState == 30) {
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) {
			this.doCycleLoggedOut();
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1302395481"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label166: {
			try {
				if (class247.musicPlayerStatus == 2) {
					if (class14.musicTrack == null) {
						class14.musicTrack = MusicTrack.readTrack(class128.musicTrackArchive, FillMode.musicTrackGroupId, ArchiveDiskActionHandler.musicTrackFileId);
						if (class14.musicTrack == null) {
							var2 = false;
							break label166;
						}
					}

					if (class247.soundCache == null) {
						class247.soundCache = new SoundCache(class408.soundEffectsArchive, class247.musicSamplesArchive);
					}

					if (class247.midiPcmStream.loadMusicTrack(class14.musicTrack, class247.musicPatchesArchive, class247.soundCache, 22050)) {
						class247.midiPcmStream.clearAll();
						class247.midiPcmStream.setPcmStreamVolume(class247.musicTrackVolume);
						class247.midiPcmStream.setMusicTrack(class14.musicTrack, SecureRandomCallable.musicTrackBoolean);
						class247.musicPlayerStatus = 0;
						class14.musicTrack = null;
						class247.soundCache = null;
						class128.musicTrackArchive = null;
						var2 = true;
						break label166;
					}
				}
			} catch (Exception var6) {
				var6.printStackTrace();
				class247.midiPcmStream.clear();
				class247.musicPlayerStatus = 0;
				class14.musicTrack = null;
				class247.soundCache = null;
				class128.musicTrackArchive = null;
			}

			var2 = false;
		}

		if (var2 && field710 && HealthBar.pcmPlayer0 != null) {
			HealthBar.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field687 && class111.method2516() > field687) {
			HorizontalAlignment.setWindowedMode(class134.getWindowedMode());
		}

		int var4;
		if (var1) {
			for (var4 = 0; var4 < 100; ++var4) {
				field594[var4] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			class12.drawTitle(Login.fontBold12, FriendLoginUpdate.fontPlain11, class6.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class12.drawTitle(Login.fontBold12, FriendLoginUpdate.fontPlain11, class6.fontPlain12);
			} else if (gameState == 25) {
				if (field485 == 1) {
					if (field521 > field522) {
						field522 = field521;
					}

					var4 = (field522 * 50 - field521 * 50) / field522;
					class91.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
				} else if (field485 == 2) {
					if (field523 > field524) {
						field524 = field523;
					}

					var4 = (field524 * 50 - field523 * 50) / field524 + 50;
					class91.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
				} else {
					class91.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				class91.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				class91.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class12.drawTitle(Login.fontBold12, FriendLoginUpdate.fontPlain11, class6.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				if (field553[var4]) {
					Canvas.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]);
					field553[var4] = false;
				}
			}
		} else if (gameState > 0) {
			Canvas.rasterProvider.drawFull(0, 0);

			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				field553[var4] = false;
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-9054"
	)
	@Export("kill0")
	protected final void kill0() {
		if (Message.varcs.hasUnwrittenChanges()) {
			Message.varcs.write();
		}

		if (Interpreter.mouseRecorder != null) {
			Interpreter.mouseRecorder.isRunning = false;
		}

		Interpreter.mouseRecorder = null;
		packetWriter.close();
		if (KeyHandler.KeyHandler_instance != null) {
			synchronized(KeyHandler.KeyHandler_instance) {
				KeyHandler.KeyHandler_instance = null;
			}
		}

		NPC.method2248();
		MouseHandler.mouseWheel = null;
		if (HealthBar.pcmPlayer0 != null) {
			HealthBar.pcmPlayer0.shutdown();
		}

		if (ScriptEvent.pcmPlayer1 != null) {
			ScriptEvent.pcmPlayer1.shutdown();
		}

		Script.method1989();
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3662 != 0) {
				ArchiveDiskActionHandler.field3662 = 1;

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
				} catch (InterruptedException var5) {
				}
			}
		}

		if (class320.urlRequester != null) {
			class320.urlRequester.close();
			class320.urlRequester = null;
		}

		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var4 = 0; var4 < ItemContainer.idxCount; ++var4) {
				WorldMapID.JagexCache_idxFiles[var4].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var7) {
		}

		this.field491.method181();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-71"
	)
	protected final void vmethod1164() {
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-863844580"
	)
	boolean method1166() {
		return JagexCache.field1560 != null && !JagexCache.field1560.trim().isEmpty();
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1299370997"
	)
	void method1453(String var1) throws MalformedURLException, IOException {
		class10 var2 = new class10(new URL(WorldMapSection1.field2203 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"), class9.field27);
		var2.method86("Authorization", "Bearer " + var1);
		this.field537 = this.field491.method187(var2);
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "23725"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			long var2 = class111.method2516();
			int var4 = (int)(var2 - class423.field4436);
			class423.field4436 = var2;
			if (var4 > 200) {
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4;
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) {
				var1 = true;
			} else if (NetCache.NetCache_socket == null) {
				var1 = false;
			} else {
				try {
					label245: {
						if (NetCache.NetCache_loadTime > 30000) {
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) {
							var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first();
							var6 = new Buffer(4);
							var6.writeByte(1);
							var6.writeMedium((int)var5.key);
							NetCache.NetCache_socket.write(var6.array, 0, 4);
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key);
							--NetCache.NetCache_pendingPriorityWritesCount;
							++NetCache.NetCache_pendingPriorityResponsesCount;
						}

						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) {
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast();
							var6 = new Buffer(4);
							var6.writeByte(0);
							var6.writeMedium((int)var5.key);
							NetCache.NetCache_socket.write(var6.array, 0, 4);
							var5.removeDual();
							NetCache.NetCache_pendingResponses.put(var5, var5.key);
							--NetCache.NetCache_pendingWritesCount;
							++NetCache.NetCache_pendingResponsesCount;
						}

						for (int var17 = 0; var17 < 100; ++var17) {
							int var18 = NetCache.NetCache_socket.available();
							if (var18 < 0) {
								throw new IOException();
							}

							if (var18 == 0) {
								break;
							}

							NetCache.NetCache_loadTime = 0;
							byte var7 = 0;
							if (class131.NetCache_currentResponse == null) {
								var7 = 8;
							} else if (NetCache.field3707 == 0) {
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							int var12;
							byte[] var10000;
							int var10001;
							Buffer var25;
							if (var7 > 0) {
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset;
								if (var8 > var18) {
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8);
								if (NetCache.field3719 != 0) {
									for (var9 = 0; var9 < var8; ++var9) {
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field3719;
									}
								}

								var25 = NetCache.NetCache_responseHeaderBuffer;
								var25.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) {
									break;
								}

								if (class131.NetCache_currentResponse == null) {
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var12 = NetCache.NetCache_responseHeaderBuffer.readInt();
									long var13 = (long)(var10 + (var9 << 16));
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13);
									class120.field1401 = true;
									if (var15 == null) {
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13);
										class120.field1401 = false;
									}

									if (var15 == null) {
										throw new IOException();
									}

									int var16 = var11 == 0 ? 5 : 9;
									class131.NetCache_currentResponse = var15;
									class138.NetCache_responseArchiveBuffer = new Buffer(var12 + var16 + class131.NetCache_currentResponse.padding);
									class138.NetCache_responseArchiveBuffer.writeByte(var11);
									class138.NetCache_responseArchiveBuffer.writeInt(var12);
									NetCache.field3707 = 8;
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
								} else if (NetCache.field3707 == 0) {
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
										NetCache.field3707 = 1;
										NetCache.NetCache_responseHeaderBuffer.offset = 0;
									} else {
										class131.NetCache_currentResponse = null;
									}
								}
							} else {
								var8 = class138.NetCache_responseArchiveBuffer.array.length - class131.NetCache_currentResponse.padding;
								var9 = 512 - NetCache.field3707;
								if (var9 > var8 - class138.NetCache_responseArchiveBuffer.offset) {
									var9 = var8 - class138.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) {
									var9 = var18;
								}

								NetCache.NetCache_socket.read(class138.NetCache_responseArchiveBuffer.array, class138.NetCache_responseArchiveBuffer.offset, var9);
								if (NetCache.field3719 != 0) {
									for (var10 = 0; var10 < var9; ++var10) {
										var10000 = class138.NetCache_responseArchiveBuffer.array;
										var10001 = class138.NetCache_responseArchiveBuffer.offset + var10;
										var10000[var10001] ^= NetCache.field3719;
									}
								}

								var25 = class138.NetCache_responseArchiveBuffer;
								var25.offset += var9;
								NetCache.field3707 += var9;
								if (var8 == class138.NetCache_responseArchiveBuffer.offset) {
									if (class131.NetCache_currentResponse.key == 16711935L) {
										class139.NetCache_reference = class138.NetCache_responseArchiveBuffer;

										for (var10 = 0; var10 < 256; ++var10) {
											Archive var19 = NetCache.NetCache_archives[var10];
											if (var19 != null) {
												class139.NetCache_reference.offset = var10 * 8 + 5;
												var12 = class139.NetCache_reference.readInt();
												int var20 = class139.NetCache_reference.readInt();
												var19.loadIndex(var12, var20);
											}
										}
									} else {
										NetCache.NetCache_crc.reset();
										NetCache.NetCache_crc.update(class138.NetCache_responseArchiveBuffer.array, 0, var8);
										var10 = (int)NetCache.NetCache_crc.getValue();
										if (var10 != class131.NetCache_currentResponse.crc) {
											try {
												NetCache.NetCache_socket.close();
											} catch (Exception var23) {
											}

											++NetCache.NetCache_crcMismatches;
											NetCache.NetCache_socket = null;
											NetCache.field3719 = (byte)((int)(Math.random() * 255.0D + 1.0D));
											var1 = false;
											break label245;
										}

										NetCache.NetCache_crcMismatches = 0;
										NetCache.NetCache_ioExceptions = 0;
										class131.NetCache_currentResponse.archive.write((int)(class131.NetCache_currentResponse.key & 65535L), class138.NetCache_responseArchiveBuffer.array, 16711680L == (class131.NetCache_currentResponse.key & 16711680L), class120.field1401);
									}

									class131.NetCache_currentResponse.remove();
									if (class120.field1401) {
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount;
									}

									NetCache.field3707 = 0;
									class131.NetCache_currentResponse = null;
									class138.NetCache_responseArchiveBuffer = null;
								} else {
									if (NetCache.field3707 != 512) {
										break;
									}

									NetCache.field3707 = 0;
								}
							}
						}

						var1 = true;
					}
				} catch (IOException var24) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var22) {
					}

					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
					var1 = false;
				}
			}

			if (!var1) {
				this.doCycleJs5Connect();
			}

		}
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1173138453"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) {
			this.error("js5crc");
			WorldMapData_1.updateGameState(1000);
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					WorldMapData_1.updateGameState(1000);
					return;
				}

				field572 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}

			if (--field572 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class114.js5SocketTask = GameEngine.taskHandler.newSocketTask(WorldMapIcon_0.worldHost, ScriptEvent.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class114.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class114.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						if (useBufferedSocket) {
							ItemLayer.js5Socket = class132.method2767((Socket)class114.js5SocketTask.result, 40000, 5000);
						} else {
							ItemLayer.js5Socket = new NetSocket((Socket)class114.js5SocketTask.result, GameEngine.taskHandler, 5000);
						}

						Buffer var1 = new Buffer(5);
						var1.writeByte(15);
						var1.writeInt(201);
						ItemLayer.js5Socket.write(var1.array, 0, 5);
						++js5ConnectState;
						Login.field889 = class111.method2516();
					}

					if (js5ConnectState == 3) {
						if (ItemLayer.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) {
							int var2 = ItemLayer.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (class111.method2516() - Login.field889 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						GameObject.method4647(ItemLayer.js5Socket, gameState > 20);
						class114.js5SocketTask = null;
						ItemLayer.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-88"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class114.js5SocketTask = null;
		ItemLayer.js5Socket = null;
		js5ConnectState = 0;
		if (ApproximateRouteStrategy.worldPort == ScriptEvent.currentPort) {
			ScriptEvent.currentPort = ParamComposition.js5Port;
		} else {
			ScriptEvent.currentPort = ApproximateRouteStrategy.worldPort;
		}

		++js5Errors;
		if (js5Errors < 2 || var1 != 7 && var1 != 9) {
			if (js5Errors >= 2 && var1 == 6) {
				this.error("js5connect_outofdate");
				WorldMapData_1.updateGameState(1000);
			} else if (js5Errors >= 4) {
				if (gameState <= 5) {
					this.error("js5connect");
					WorldMapData_1.updateGameState(1000);
				} else {
					field572 = 3000;
				}
			}
		} else if (gameState <= 5) {
			this.error("js5connect_full");
			WorldMapData_1.updateGameState(1000);
		} else {
			field572 = 3000;
		}

	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1167591664"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (UserComparator4.secureRandom == null && (secureRandomFuture.isDone() || field496 > 250)) {
					UserComparator4.secureRandom = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (UserComparator4.secureRandom != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					PcmPlayer.socketTask = null;
					hadNetworkError = false;
					field496 = 0;
					if (field500.method7220()) {
						try {
							this.method1453(JagexCache.field1560);
							UserComparator6.method2503(20);
						} catch (Throwable var20) {
							MilliClock.RunException_sendStackTrace((String)null, var20);
							SecureRandomFuture.getLoginError(65);
							return;
						}
					} else {
						UserComparator6.method2503(1);
					}
				}
			}

			if (loginState == 20) {
				if (!this.field537.method280()) {
					return;
				}

				if (this.field537.method276()) {
					MilliClock.RunException_sendStackTrace(this.field537.method293(), (Throwable)null);
					SecureRandomFuture.getLoginError(65);
					return;
				}

				class21 var3 = this.field537.method281();
				if (var3.method310() != 200) {
					MilliClock.RunException_sendStackTrace("Response code: " + var3.method310() + "Response body: " + var3.method303(), (Throwable)null);
					SecureRandomFuture.getLoginError(65);
					return;
				}

				field496 = 0;
				this.field501 = var3.method303();
				UserComparator6.method2503(1);
			}

			if (loginState == 1) {
				if (PcmPlayer.socketTask == null) {
					PcmPlayer.socketTask = GameEngine.taskHandler.newSocketTask(WorldMapIcon_0.worldHost, ScriptEvent.currentPort);
				}

				if (PcmPlayer.socketTask.status == 2) {
					throw new IOException();
				}

				if (PcmPlayer.socketTask.status == 1) {
					if (useBufferedSocket) {
						var1 = class132.method2767((Socket)PcmPlayer.socketTask.result, 40000, 5000);
					} else {
						var1 = new NetSocket((Socket)PcmPlayer.socketTask.result, GameEngine.taskHandler, 5000);
					}

					packetWriter.setSocket((AbstractSocket)var1);
					PcmPlayer.socketTask = null;
					UserComparator6.method2503(2);
				}
			}

			PacketBufferNode var4;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var4 = class92.method2296();
				var4.clientPacket = null;
				var4.clientPacketLength = 0;
				var4.packetBuffer = new PacketBuffer(5000);
				var4.packetBuffer.writeByte(LoginPacket.field2901.id);
				packetWriter.addNode(var4);
				packetWriter.flush();
				var2.offset = 0;
				UserComparator6.method2503(3);
			}

			boolean var13;
			int var14;
			if (loginState == 3) {
				if (HealthBar.pcmPlayer0 != null) {
					HealthBar.pcmPlayer0.method750();
				}

				if (ScriptEvent.pcmPlayer1 != null) {
					ScriptEvent.pcmPlayer1.method750();
				}

				var13 = true;
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) {
					var13 = false;
				}

				if (var13) {
					var14 = ((AbstractSocket)var1).readUnsignedByte();
					if (HealthBar.pcmPlayer0 != null) {
						HealthBar.pcmPlayer0.method750();
					}

					if (ScriptEvent.pcmPlayer1 != null) {
						ScriptEvent.pcmPlayer1.method750();
					}

					if (var14 != 0) {
						SecureRandomFuture.getLoginError(var14);
						return;
					}

					var2.offset = 0;
					UserComparator6.method2503(4);
				}
			}

			int var33;
			if (loginState == 4) {
				if (var2.offset < 8) {
					var33 = ((AbstractSocket)var1).available();
					if (var33 > 8 - var2.offset) {
						var33 = 8 - var2.offset;
					}

					if (var33 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset, var33);
						var2.offset += var33;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					ItemLayer.field2244 = var2.readLong();
					UserComparator6.method2503(5);
				}
			}

			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var22 = new PacketBuffer(500);
				int[] var25 = new int[]{UserComparator4.secureRandom.nextInt(), UserComparator4.secureRandom.nextInt(), UserComparator4.secureRandom.nextInt(), UserComparator4.secureRandom.nextInt()};
				var22.offset = 0;
				var22.writeByte(1);
				var22.writeInt(var25[0]);
				var22.writeInt(var25[1]);
				var22.writeInt(var25[2]);
				var22.writeInt(var25[3]);
				var22.writeLong(ItemLayer.field2244);
				if (gameState == 40) {
					var22.writeInt(ServerPacket.field2893[0]);
					var22.writeInt(ServerPacket.field2893[1]);
					var22.writeInt(ServerPacket.field2893[2]);
					var22.writeInt(ServerPacket.field2893[3]);
				} else {
					var22.writeByte(field693.rsOrdinal());
					switch(field693.field1344) {
					case 0:
					case 3:
						var22.writeMedium(ReflectionCheck.field429);
						++var22.offset;
						break;
					case 1:
						var22.writeInt((Integer)class408.clientPreferences.parameters.get(ClanChannel.method2824(Login.Login_username)));
						break;
					case 2:
						var22.offset += 4;
					}

					if (field500.method7220()) {
						var22.writeByte(class404.field4352.rsOrdinal());
						var22.writeStringCp1252NullTerminated(this.field501);
					} else {
						var22.writeByte(class404.field4351.rsOrdinal());
						var22.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var22.encryptRsa(class67.field840, class67.field843);
				ServerPacket.field2893 = var25;
				PacketBufferNode var6 = class92.method2296();
				var6.clientPacket = null;
				var6.clientPacketLength = 0;
				var6.packetBuffer = new PacketBuffer(5000);
				var6.packetBuffer.offset = 0;
				if (gameState == 40) {
					var6.packetBuffer.writeByte(LoginPacket.field2894.id);
				} else {
					var6.packetBuffer.writeByte(LoginPacket.field2896.id);
				}

				var6.packetBuffer.writeShort(0);
				int var7 = var6.packetBuffer.offset;
				var6.packetBuffer.writeInt(201);
				var6.packetBuffer.writeInt(1);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeByte(field469);
				var6.packetBuffer.writeBytes(var22.array, 0, var22.offset);
				int var8 = var6.packetBuffer.offset;
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var6.packetBuffer.writeShort(GameEngine.canvasWidth);
				var6.packetBuffer.writeShort(KeyHandler.canvasHeight);
				PacketBuffer var9 = var6.packetBuffer;
				if (randomDatData != null) {
					var9.writeBytes(randomDatData, 0, randomDatData.length);
				} else {
					byte[] var10 = ObjectSound.method1771();
					var9.writeBytes(var10, 0, var10.length);
				}

				var6.packetBuffer.writeStringCp1252NullTerminated(UserComparator3.field1316);
				var6.packetBuffer.writeInt(TextureProvider.field2483);
				Buffer var32 = new Buffer(class54.platformInfo.size());
				class54.platformInfo.write(var32);
				var6.packetBuffer.writeBytes(var32.array, 0, var32.array.length);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeInt(0);
				var6.packetBuffer.method7010(Messages.archive6.hash);
				var6.packetBuffer.writeInt(Archive.archive15.hash);
				var6.packetBuffer.writeIntME(SecureRandomCallable.archive14.hash);
				var6.packetBuffer.method7126(HorizontalAlignment.archive7.hash);
				var6.packetBuffer.method7010(GrandExchangeOfferOwnWorldComparator.archive20.hash);
				var6.packetBuffer.writeIntME(Message.archive17.hash);
				var6.packetBuffer.writeIntME(GrandExchangeOfferOwnWorldComparator.archive8.hash);
				var6.packetBuffer.method7010(Messages.archive18.hash);
				var6.packetBuffer.method7126(class1.archive2.hash);
				var6.packetBuffer.method7010(0);
				var6.packetBuffer.method7010(class14.archive12.hash);
				var6.packetBuffer.method7010(SecureRandomFuture.archive9.hash);
				var6.packetBuffer.writeInt(ApproximateRouteStrategy.archive1.hash);
				var6.packetBuffer.writeInt(InvDefinition.archive0.hash);
				var6.packetBuffer.method7010(ChatChannel.archive10.hash);
				var6.packetBuffer.writeInt(class11.archive5.hash);
				var6.packetBuffer.writeIntME(class111.archive19.hash);
				var6.packetBuffer.writeIntME(class12.archive4.hash);
				var6.packetBuffer.writeIntME(ParamComposition.archive3.hash);
				var6.packetBuffer.writeInt(LoginScreenAnimation.archive13.hash);
				var6.packetBuffer.writeInt(AbstractWorldMapIcon.archive11.hash);
				var6.packetBuffer.xteaEncrypt(var25, var8, var6.packetBuffer.offset);
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var7);
				packetWriter.addNode(var6);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var25);
				int[] var11 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var11[var12] = var25[var12] + 50;
				}

				var2.newIsaacCipher(var11);
				UserComparator6.method2503(6);
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
				var33 = ((AbstractSocket)var1).readUnsignedByte();
				if (var33 == 21 && gameState == 20) {
					UserComparator6.method2503(12);
				} else if (var33 == 2) {
					UserComparator6.method2503(14);
				} else if (var33 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					UserComparator6.method2503(19);
				} else if (var33 == 64) {
					UserComparator6.method2503(10);
				} else if (var33 == 23 && field685 < 1) {
					++field685;
					UserComparator6.method2503(0);
				} else if (var33 == 29) {
					UserComparator6.method2503(17);
				} else {
					if (var33 != 69) {
						SecureRandomFuture.getLoginError(var33);
						return;
					}

					UserComparator6.method2503(7);
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				class320.field3868 = var2.readUnsignedShort();
				UserComparator6.method2503(8);
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= class320.field3868) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, class320.field3868);
				class6 var23 = class135.method2797()[var2.readUnsignedByte()];

				try {
					switch(var23.field12) {
					case 0:
						class0 var26 = new class0();
						this.field507 = new class7(var2, var26);
						UserComparator6.method2503(9);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var19) {
					SecureRandomFuture.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field507.method46()) {
				this.field579 = this.field507.method48();
				this.field507.method47();
				this.field507 = null;
				if (this.field579 == null) {
					SecureRandomFuture.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var4 = class92.method2296();
				var4.clientPacket = null;
				var4.clientPacketLength = 0;
				var4.packetBuffer = new PacketBuffer(5000);
				var4.packetBuffer.writeByte(LoginPacket.field2900.id);
				var4.packetBuffer.writeShort(this.field579.offset);
				var4.packetBuffer.method6960(this.field579);
				packetWriter.addNode(var4);
				packetWriter.flush();
				this.field579 = null;
				UserComparator6.method2503(6);
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
				VarbitComposition.field1775 = ((AbstractSocket)var1).readUnsignedByte();
				UserComparator6.method2503(11);
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= VarbitComposition.field1775) {
				((AbstractSocket)var1).read(var2.array, 0, VarbitComposition.field1775);
				var2.offset = 0;
				UserComparator6.method2503(6);
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
				field498 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				UserComparator6.method2503(13);
			}

			if (loginState == 13) {
				field496 = 0;
				class1.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field498 / 60 + " seconds.");
				if (--field498 <= 0) {
					UserComparator6.method2503(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
					TextureProvider.field2485 = ((AbstractSocket)var1).readUnsignedByte();
					UserComparator6.method2503(15);
				}

				int var15;
				boolean var34;
				if (loginState == 15 && ((AbstractSocket)var1).available() >= TextureProvider.field2485) {
					var13 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					var34 = false;
					if (var13) {
						var14 = var2.readByteIsaac() << 24;
						var14 |= var2.readByteIsaac() << 16;
						var14 |= var2.readByteIsaac() << 8;
						var14 |= var2.readByteIsaac();
						var15 = ClanChannel.method2824(Login.Login_username);
						if (class408.clientPreferences.parameters.size() >= 10 && !class408.clientPreferences.parameters.containsKey(var15)) {
							Iterator var31 = class408.clientPreferences.parameters.entrySet().iterator();
							var31.next();
							var31.remove();
						}

						class408.clientPreferences.parameters.put(var15, var14);
					}

					if (Login_isUsernameRemembered) {
						class408.clientPreferences.rememberedUsername = Login.Login_username;
					} else {
						class408.clientPreferences.rememberedUsername = null;
					}

					Login.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field588 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var5 = class128.ServerPacket_values();
					int var16 = var2.readSmartByteShortIsaac();
					if (var16 < 0 || var16 >= var5.length) {
						throw new IOException(var16 + " " + var2.offset);
					}

					packetWriter.serverPacket = var5[var16];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						Client var17 = ArchiveLoader.client;
						JSObject.getWindow(var17).call("zap", (Object[])null);
					} catch (Throwable var18) {
					}

					UserComparator6.method2503(16);
				}

				if (loginState != 16) {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						class122.field1420 = var2.readUnsignedShort();
						UserComparator6.method2503(18);
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= class122.field1420) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, class122.field1420);
						var2.offset = 0;
						String var27 = var2.readStringCp1252NullTerminated();
						String var30 = var2.readStringCp1252NullTerminated();
						String var28 = var2.readStringCp1252NullTerminated();
						class1.setLoginResponseString(var27, var30, var28);
						WorldMapData_1.updateGameState(10);
					}

					if (loginState == 19) {
						if (packetWriter.serverPacketLength == -1) {
							if (((AbstractSocket)var1).available() < 2) {
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2);
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0;
							var33 = packetWriter.serverPacketLength;
							timer.method5970();
							Bounds.method6370();
							LoginScreenAnimation.updatePlayer(var2);
							if (var33 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field496;
						if (field496 > 2000) {
							if (field685 < 1) {
								if (ScriptEvent.currentPort == ApproximateRouteStrategy.worldPort) {
									ScriptEvent.currentPort = ParamComposition.js5Port;
								} else {
									ScriptEvent.currentPort = ApproximateRouteStrategy.worldPort;
								}

								++field685;
								UserComparator6.method2503(0);
							} else {
								SecureRandomFuture.getLoginError(-3);
							}
						}
					}
				} else {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method5974();
						mouseLastLastPressedTimeMillis = 1L;
						Interpreter.mouseRecorder.index = 0;
						WorldMapSectionType.hasFocus = true;
						hadFocus = true;
						field565 = -1L;
						class125.method2637();
						packetWriter.clearBuffer();
						packetWriter.packetBuffer.offset = 0;
						packetWriter.serverPacket = null;
						packetWriter.field1277 = null;
						packetWriter.field1284 = null;
						packetWriter.field1285 = null;
						packetWriter.serverPacketLength = 0;
						packetWriter.field1275 = 0;
						rebootTimer = 0;
						logoutTimer = 0;
						hintArrowType = 0;
						KeyHandler.method343();
						ClanSettings.method2703(0);
						Strings.method5220();
						isItemSelected = 0;
						isSpellSelected = false;
						soundEffectCount = 0;
						camAngleY = 0;
						oculusOrbState = 0;
						ClanSettings.field1440 = null;
						minimapState = 0;
						field701 = -1;
						destinationX = 0;
						destinationY = 0;
						playerAttackOption = AttackOption.AttackOption_hidden;
						npcAttackOption = AttackOption.AttackOption_hidden;
						npcCount = 0;
						Players.Players_count = 0;

						for (var33 = 0; var33 < 2048; ++var33) {
							Players.field1242[var33] = null;
							Players.field1241[var33] = 1;
						}

						for (var33 = 0; var33 < 2048; ++var33) {
							players[var33] = null;
						}

						for (var33 = 0; var33 < 32768; ++var33) {
							npcs[var33] = null;
						}

						combatTargetPlayerIndex = -1;
						projectiles.clear();
						graphicsObjects.clear();

						for (var33 = 0; var33 < 4; ++var33) {
							for (var14 = 0; var14 < 104; ++var14) {
								for (var15 = 0; var15 < 104; ++var15) {
									groundItems[var33][var14][var15] = null;
								}
							}
						}

						pendingSpawns = new NodeDeque();
						class112.friendSystem.clear();

						for (var33 = 0; var33 < VarpDefinition.VarpDefinition_fileCount; ++var33) {
							VarpDefinition var29 = ArchiveLoader.VarpDefinition_get(var33);
							if (var29 != null) {
								Varps.Varps_temp[var33] = 0;
								Varps.Varps_main[var33] = 0;
							}
						}

						Message.varcs.clearTransient();
						followerIndex = -1;
						if (rootInterface != -1) {
							var33 = rootInterface;
							if (var33 != -1 && class132.Widget_loadedInterfaces[var33]) {
								class283.Widget_archive.clearFilesGroup(var33);
								if (WorldMapSection1.Widget_interfaceComponents[var33] != null) {
									var34 = true;

									for (var15 = 0; var15 < WorldMapSection1.Widget_interfaceComponents[var33].length; ++var15) {
										if (WorldMapSection1.Widget_interfaceComponents[var33][var15] != null) {
											if (WorldMapSection1.Widget_interfaceComponents[var33][var15].type != 2) {
												WorldMapSection1.Widget_interfaceComponents[var33][var15] = null;
											} else {
												var34 = false;
											}
										}
									}

									if (var34) {
										WorldMapSection1.Widget_interfaceComponents[var33] = null;
									}

									class132.Widget_loadedInterfaces[var33] = false;
								}
							}
						}

						for (InterfaceParent var24 = (InterfaceParent)interfaceParents.first(); var24 != null; var24 = (InterfaceParent)interfaceParents.next()) {
							Players.closeInterface(var24, true);
						}

						rootInterface = -1;
						interfaceParents = new NodeHashTable(8);
						meslayerContinueWidget = null;
						KeyHandler.method343();
						playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

						for (var33 = 0; var33 < 8; ++var33) {
							playerMenuActions[var33] = null;
							playerOptionsPriorities[var33] = false;
						}

						GrandExchangeOfferUnitPriceComparator.method5485();
						isLoading = true;

						for (var33 = 0; var33 < 100; ++var33) {
							field594[var33] = true;
						}

						Frames.method4481();
						AbstractArchive.friendsChatManager = null;
						class67.guestClanSettings = null;
						Arrays.fill(currentClanSettings, (Object)null);
						class115.guestClanChannel = null;
						Arrays.fill(currentClanChannels, (Object)null);

						for (var33 = 0; var33 < 8; ++var33) {
							grandExchangeOffers[var33] = new GrandExchangeOffer();
						}

						JagexCache.grandExchangeEvents = null;
						LoginScreenAnimation.updatePlayer(var2);
						ItemLayer.field2243 = -1;
						Canvas.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				}
			}
		} catch (IOException var21) {
			if (field685 < 1) {
				if (ApproximateRouteStrategy.worldPort == ScriptEvent.currentPort) {
					ScriptEvent.currentPort = ParamComposition.js5Port;
				} else {
					ScriptEvent.currentPort = ApproximateRouteStrategy.worldPort;
				}

				++field685;
				UserComparator6.method2503(0);
			} else {
				SecureRandomFuture.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-681213511"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (hadNetworkError) {
			hadNetworkError = false;
			Clock.method2960();
		} else {
			if (!isMenuOpen) {
				FriendSystem.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1180(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class54.reflectionChecks.last();
					boolean var32;
					if (var2 == null) {
						var32 = false;
					} else {
						var32 = true;
					}

					int var3;
					PacketBufferNode var33;
					if (!var32) {
						PacketBufferNode var14;
						int var15;
						if (timer.field3900) {
							var14 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2666, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							var15 = var14.packetBuffer.offset;
							timer.write(var14.packetBuffer);
							var14.packetBuffer.method6963(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
							timer.method5975();
						}

						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						int var12;
						PacketBuffer var10000;
						synchronized(Interpreter.mouseRecorder.lock) {
							if (!field497) {
								Interpreter.mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || Interpreter.mouseRecorder.index >= 40) {
								var33 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < Interpreter.mouseRecorder.index && (var33 == null || var33.packetBuffer.offset - var3 < 246); ++var7) {
									var4 = var7;
									var8 = Interpreter.mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = Interpreter.mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field475 || var8 != field476) {
										if (var33 == null) {
											var33 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2704, packetWriter.isaacCipher);
											var33.packetBuffer.writeByte(0);
											var3 = var33.packetBuffer.offset;
											var10000 = var33.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										if (field477 != -1L) {
											var10 = var9 - field475;
											var11 = var8 - field476;
											var12 = (int)((Interpreter.mouseRecorder.millis[var7] - field477) / 20L);
											var5 = (int)((long)var5 + (Interpreter.mouseRecorder.millis[var7] - field477) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field475 = var9;
										field476 = var8;
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
											var10 += 32;
											var11 += 32;
											var33.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
											var10 += 128;
											var11 += 128;
											var33.packetBuffer.writeByte(var12 + 128);
											var33.packetBuffer.writeShort(var11 + (var10 << 8));
										} else if (var12 < 32) {
											var33.packetBuffer.writeByte(var12 + 192);
											if (var9 != -1 && var8 != -1) {
												var33.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var33.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var33.packetBuffer.writeShort((var12 & 8191) + 57344);
											if (var9 != -1 && var8 != -1) {
												var33.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var33.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6;
										field477 = Interpreter.mouseRecorder.millis[var7];
									}
								}

								if (var33 != null) {
									var33.packetBuffer.method6963(var33.packetBuffer.offset - var3);
									var7 = var33.packetBuffer.offset;
									var33.packetBuffer.offset = var3;
									var33.packetBuffer.writeByte(var5 / var6);
									var33.packetBuffer.writeByte(var5 % var6);
									var33.packetBuffer.offset = var7;
									packetWriter.addNode(var33);
								}

								if (var4 >= Interpreter.mouseRecorder.index) {
									Interpreter.mouseRecorder.index = 0;
								} else {
									class81 var55 = Interpreter.mouseRecorder;
									var55.index -= var4;
									System.arraycopy(Interpreter.mouseRecorder.xs, var4, Interpreter.mouseRecorder.xs, 0, Interpreter.mouseRecorder.index);
									System.arraycopy(Interpreter.mouseRecorder.ys, var4, Interpreter.mouseRecorder.ys, 0, Interpreter.mouseRecorder.index);
									System.arraycopy(Interpreter.mouseRecorder.millis, var4, Interpreter.mouseRecorder.millis, 0, Interpreter.mouseRecorder.index);
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !ApproximateRouteStrategy.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
							if (var16 > 32767L) {
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
							var3 = MouseHandler.MouseHandler_lastPressedY;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > KeyHandler.canvasHeight) {
								var3 = KeyHandler.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > GameEngine.canvasWidth) {
								var4 = GameEngine.canvasWidth;
							}

							var5 = (int)var16;
							var18 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2725, packetWriter.isaacCipher);
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
							var18.packetBuffer.writeShort(var4);
							var18.packetBuffer.writeShort(var3);
							packetWriter.addNode(var18);
						}

						if (KeyHandler.field110 > 0) {
							var14 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2716, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(0);
							var15 = var14.packetBuffer.offset;
							long var19 = class111.method2516();

							for (var5 = 0; var5 < KeyHandler.field110; ++var5) {
								long var21 = var19 - field565;
								if (var21 > 16777215L) {
									var21 = 16777215L;
								}

								field565 = var19;
								var14.packetBuffer.method7009((int)var21);
								var14.packetBuffer.method6947(KeyHandler.field125[var5]);
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
						}

						if (field620 > 0) {
							--field620;
						}

						if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
							field555 = true;
						}

						if (field555 && field620 <= 0) {
							field620 = 20;
							field555 = false;
							var14 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2699, packetWriter.isaacCipher);
							var14.packetBuffer.method7001(camAngleX);
							var14.packetBuffer.method7003(camAngleY);
							packetWriter.addNode(var14);
						}

						if (WorldMapSectionType.hasFocus && !hadFocus) {
							hadFocus = true;
							var14 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2743, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(1);
							packetWriter.addNode(var14);
						}

						if (!WorldMapSectionType.hasFocus && hadFocus) {
							hadFocus = false;
							var14 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2743, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							packetWriter.addNode(var14);
						}

						if (class133.worldMap != null) {
							class133.worldMap.method6487();
						}

						if (class6.FriendsChatManager_inFriendsChat) {
							if (AbstractArchive.friendsChatManager != null) {
								AbstractArchive.friendsChatManager.sort();
							}

							TileItem.method2315();
							class6.FriendsChatManager_inFriendsChat = false;
						}

						if (class29.field162) {
							UserComparator10.method2494();
							class29.field162 = false;
						}

						if (GrandExchangeOfferTotalQuantityComparator.Client_plane != field701) {
							field701 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
							var1 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
							int[] var34 = class10.sceneMinimapSprite.pixels;
							var3 = var34.length;

							for (var4 = 0; var4 < var3; ++var4) {
								var34[var4] = 0;
							}

							for (var4 = 1; var4 < 103; ++var4) {
								var5 = (103 - var4) * 2048 + 24628;

								for (var6 = 1; var6 < 103; ++var6) {
									if ((Tiles.Tiles_renderFlags[var1][var6][var4] & 24) == 0) {
										GameBuild.scene.drawTileMinimap(var34, var5, 512, var1, var6, var4);
									}

									if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var6][var4] & 8) != 0) {
										GameBuild.scene.drawTileMinimap(var34, var5, 512, var1 + 1, var6, var4);
									}

									var5 += 4;
								}
							}

							var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
							var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
							class10.sceneMinimapSprite.setRaster();

							for (var6 = 1; var6 < 103; ++var6) {
								for (var7 = 1; var7 < 103; ++var7) {
									if ((Tiles.Tiles_renderFlags[var1][var7][var6] & 24) == 0) {
										class111.drawObject(var1, var7, var6, var4, var5);
									}

									if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var7][var6] & 8) != 0) {
										class111.drawObject(var1 + 1, var7, var6, var4, var5);
									}
								}
							}

							mapIconCount = 0;

							for (var6 = 0; var6 < 104; ++var6) {
								for (var7 = 0; var7 < 104; ++var7) {
									long var23 = GameBuild.scene.getFloorDecorationTag(GrandExchangeOfferTotalQuantityComparator.Client_plane, var6, var7);
									if (var23 != 0L) {
										var10 = class21.Entity_unpackID(var23);
										var11 = KitDefinition.getObjectDefinition(var10).mapIconId;
										if (var11 >= 0 && ItemComposition.WorldMapElement_get(var11).field1629) {
											mapIcons[mapIconCount] = ItemComposition.WorldMapElement_get(var11).getSpriteBool(false);
											mapIconXs[mapIconCount] = var6;
											mapIconYs[mapIconCount] = var7;
											++mapIconCount;
										}
									}
								}
							}

							Canvas.rasterProvider.apply();
						}

						if (gameState != 30) {
							return;
						}

						for (PendingSpawn var42 = (PendingSpawn)pendingSpawns.last(); var42 != null; var42 = (PendingSpawn)pendingSpawns.previous()) {
							if (var42.hitpoints > 0) {
								--var42.hitpoints;
							}

							if (var42.hitpoints == 0) {
								if (var42.objectId < 0 || NPC.method2265(var42.objectId, var42.field1076)) {
									MusicPatchNode2.addPendingSpawnToScene(var42.plane, var42.type, var42.x, var42.y, var42.objectId, var42.field1075, var42.field1076);
									var42.remove();
								}
							} else {
								if (var42.delay > 0) {
									--var42.delay;
								}

								if (var42.delay == 0 && var42.x >= 1 && var42.y >= 1 && var42.x <= 102 && var42.y <= 102 && (var42.id < 0 || NPC.method2265(var42.id, var42.field1082))) {
									MusicPatchNode2.addPendingSpawnToScene(var42.plane, var42.type, var42.x, var42.y, var42.id, var42.orientation, var42.field1082);
									var42.delay = -1;
									if (var42.id == var42.objectId && var42.objectId == -1) {
										var42.remove();
									} else if (var42.objectId == var42.id && var42.field1075 == var42.orientation && var42.field1076 == var42.field1082) {
										var42.remove();
									}
								}
							}
						}

						int var10002;
						for (var1 = 0; var1 < soundEffectCount; ++var1) {
							var10002 = queuedSoundEffectDelays[var1]--;
							if (queuedSoundEffectDelays[var1] >= -10) {
								SoundEffect var35 = soundEffects[var1];
								if (var35 == null) {
									var10000 = null;
									var35 = SoundEffect.readSoundEffect(class12.archive4, soundEffectIds[var1], 0);
									if (var35 == null) {
										continue;
									}

									int[] var56 = queuedSoundEffectDelays;
									var56[var1] += var35.calculateDelay();
									soundEffects[var1] = var35;
								}

								if (queuedSoundEffectDelays[var1] < 0) {
									if (soundLocations[var1] != 0) {
										var4 = (soundLocations[var1] & 255) * 128;
										var5 = soundLocations[var1] >> 16 & 255;
										var6 = var5 * 128 + 64 - HealthBarDefinition.localPlayer.x;
										if (var6 < 0) {
											var6 = -var6;
										}

										var7 = soundLocations[var1] >> 8 & 255;
										var8 = var7 * 128 + 64 - HealthBarDefinition.localPlayer.y;
										if (var8 < 0) {
											var8 = -var8;
										}

										var9 = var8 + var6 - 128;
										if (var9 > var4) {
											queuedSoundEffectDelays[var1] = -100;
											continue;
										}

										if (var9 < 0) {
											var9 = 0;
										}

										var3 = (var4 - var9) * class408.clientPreferences.areaSoundEffectsVolume / var4;
									} else {
										var3 = class408.clientPreferences.soundEffectsVolume;
									}

									if (var3 > 0) {
										RawSound var25 = var35.toRawSound().resample(FontName.decimator);
										RawPcmStream var26 = RawPcmStream.createRawPcmStream(var25, 100, var3);
										var26.setNumLoops(queuedSoundEffectLoops[var1] - 1);
										BuddyRankComparator.pcmStreamMixer.addSubStream(var26);
									}

									queuedSoundEffectDelays[var1] = -100;
								}
							} else {
								--soundEffectCount;

								for (var15 = var1; var15 < soundEffectCount; ++var15) {
									soundEffectIds[var15] = soundEffectIds[var15 + 1];
									soundEffects[var15] = soundEffects[var15 + 1];
									queuedSoundEffectLoops[var15] = queuedSoundEffectLoops[var15 + 1];
									queuedSoundEffectDelays[var15] = queuedSoundEffectDelays[var15 + 1];
									soundLocations[var15] = soundLocations[var15 + 1];
								}

								--var1;
							}
						}

						if (field710) {
							if (class247.musicPlayerStatus != 0) {
								var32 = true;
							} else {
								var32 = class247.midiPcmStream.isReady();
							}

							if (!var32) {
								if (class408.clientPreferences.musicVolume != 0 && currentTrackGroupId != -1) {
									Archive var36 = Messages.archive6;
									var3 = currentTrackGroupId;
									var4 = class408.clientPreferences.musicVolume;
									class247.musicPlayerStatus = 1;
									class128.musicTrackArchive = var36;
									FillMode.musicTrackGroupId = var3;
									ArchiveDiskActionHandler.musicTrackFileId = 0;
									class247.musicTrackVolume = var4;
									SecureRandomCallable.musicTrackBoolean = false;
									class247.pcmSampleLength = 10000;
								}

								field710 = false;
							}
						}

						++packetWriter.field1275;
						if (packetWriter.field1275 > 750) {
							Clock.method2960();
							return;
						}

						VerticalAlignment.method3159();

						for (var1 = 0; var1 < npcCount; ++var1) {
							var15 = npcIndices[var1];
							NPC var27 = npcs[var15];
							if (var27 != null) {
								class135.updateActorSequence(var27, var27.definition.size);
							}
						}

						int[] var43 = Players.Players_indices;

						for (var15 = 0; var15 < Players.Players_count; ++var15) {
							Player var53 = players[var43[var15]];
							if (var53 != null && var53.overheadTextCyclesRemaining > 0) {
								--var53.overheadTextCyclesRemaining;
								if (var53.overheadTextCyclesRemaining == 0) {
									var53.overheadText = null;
								}
							}
						}

						for (var15 = 0; var15 < npcCount; ++var15) {
							var3 = npcIndices[var15];
							NPC var48 = npcs[var3];
							if (var48 != null && var48.overheadTextCyclesRemaining > 0) {
								--var48.overheadTextCyclesRemaining;
								if (var48.overheadTextCyclesRemaining == 0) {
									var48.overheadText = null;
								}
							}
						}

						++field531;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 400;
							if (mouseCrossState * 20 >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (WorldMapSection2.field2037 != null) {
							++field576;
							if (field576 >= 15) {
								class184.invalidateWidget(WorldMapSection2.field2037);
								WorldMapSection2.field2037 = null;
							}
						}

						Widget var44 = WorldMapData_0.mousedOverWidgetIf1;
						Widget var37 = Skills.field3247;
						WorldMapData_0.mousedOverWidgetIf1 = null;
						Skills.field3247 = null;
						draggedOnWidget = null;
						field680 = false;
						field648 = false;
						field695 = 0;

						while (WorldMapElement.isKeyDown() && field695 < 128) {
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && class12.field55 == 66) {
								String var49 = "";

								Message var45;
								for (Iterator var50 = Messages.Messages_hashTable.iterator(); var50.hasNext(); var49 = var49 + var45.sender + ':' + var45.text + '\n') {
									var45 = (Message)var50.next();
								}

								ArchiveLoader.client.method484(var49);
							} else if (oculusOrbState != 1 || class319.field3858 <= 0) {
								field697[field695] = class12.field55;
								field696[field695] = class319.field3858;
								++field695;
							}
						}

						boolean var38 = staffModLevel >= 2;
						if (var38 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) {
							var4 = HealthBarDefinition.localPlayer.plane - mouseWheelRotation;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}

							if (var4 != HealthBarDefinition.localPlayer.plane) {
								InvDefinition.method2986(HealthBarDefinition.localPlayer.pathX[0] + class19.baseX * 64, HealthBarDefinition.localPlayer.pathY[0] + DefaultsGroup.baseY * 64, var4, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							Messages.updateRootInterface(rootInterface, 0, 0, GameEngine.canvasWidth, KeyHandler.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var46;
							ScriptEvent var51;
							Widget var52;
							do {
								var51 = (ScriptEvent)field674.removeLast();
								if (var51 == null) {
									while (true) {
										do {
											var51 = (ScriptEvent)field675.removeLast();
											if (var51 == null) {
												while (true) {
													do {
														var51 = (ScriptEvent)scriptEvents.removeLast();
														if (var51 == null) {
															this.menu();
															if (class133.worldMap != null) {
																class133.worldMap.method6497(GrandExchangeOfferTotalQuantityComparator.Client_plane, class19.baseX * 64 + (HealthBarDefinition.localPlayer.x >> 7), DefaultsGroup.baseY * 64 + (HealthBarDefinition.localPlayer.y >> 7), false);
																class133.worldMap.loadCache();
															}

															if (clickedWidget != null) {
																this.method1186();
															}

															if (class247.dragInventoryWidget != null) {
																class184.invalidateWidget(class247.dragInventoryWidget);
																++itemDragDuration;
																if (MouseHandler.MouseHandler_currentButton == 0) {
																	if (field667) {
																		if (class274.hoveredItemContainer == class247.dragInventoryWidget && dragItemSlotDestination != dragItemSlotSource) {
																			Widget var54 = class247.dragInventoryWidget;
																			byte var39 = 0;
																			if (field656 == 1 && var54.contentType == 206) {
																				var39 = 1;
																			}

																			if (var54.itemIds[dragItemSlotDestination] <= 0) {
																				var39 = 0;
																			}

																			if (TileItem.method2316(PendingSpawn.getWidgetFlags(var54))) {
																				var6 = dragItemSlotSource;
																				var7 = dragItemSlotDestination;
																				var54.itemIds[var7] = var54.itemIds[var6];
																				var54.itemQuantities[var7] = var54.itemQuantities[var6];
																				var54.itemIds[var6] = -1;
																				var54.itemQuantities[var6] = 0;
																			} else if (var39 == 1) {
																				var6 = dragItemSlotSource;
																				var7 = dragItemSlotDestination;

																				while (var7 != var6) {
																					if (var6 > var7) {
																						var54.swapItems(var6 - 1, var6);
																						--var6;
																					} else if (var6 < var7) {
																						var54.swapItems(var6 + 1, var6);
																						++var6;
																					}
																				}
																			} else {
																				var54.swapItems(dragItemSlotDestination, dragItemSlotSource);
																			}

																			var18 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2669, packetWriter.isaacCipher);
																			var18.packetBuffer.method7001(dragItemSlotDestination);
																			var18.packetBuffer.method7003(dragItemSlotSource);
																			var18.packetBuffer.method6993(var39);
																			var18.packetBuffer.method7010(class247.dragInventoryWidget.id);
																			packetWriter.addNode(var18);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX, draggedWidgetY);
																	} else if (menuOptionsCount > 0) {
																		var4 = draggedWidgetX;
																		var5 = draggedWidgetY;
																		MenuAction var47 = class274.tempMenuAction;
																		class14.menuAction(var47.param0, var47.param1, var47.opcode, var47.identifier, var47.action, var47.action, var4, var5);
																		class274.tempMenuAction = null;
																	}

																	field576 = 10;
																	MouseHandler.MouseHandler_lastButton = 0;
																	class247.dragInventoryWidget = null;
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
																	field667 = true;
																}
															}

															if (Scene.shouldSendWalk()) {
																var4 = Scene.Scene_selectedX;
																var5 = Scene.Scene_selectedY;
																var18 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2703, packetWriter.isaacCipher);
																var18.packetBuffer.writeByte(5);
																var18.packetBuffer.method6962(class19.baseX * 64 + var4);
																var18.packetBuffer.method6993(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
																var18.packetBuffer.method7003(DefaultsGroup.baseY * 64 + var5);
																packetWriter.addNode(var18);
																Scene.method4451();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																mouseCrossColor = 1;
																mouseCrossState = 0;
																destinationX = var4;
																destinationY = var5;
															}

															if (var44 != WorldMapData_0.mousedOverWidgetIf1) {
																if (var44 != null) {
																	class184.invalidateWidget(var44);
																}

																if (WorldMapData_0.mousedOverWidgetIf1 != null) {
																	class184.invalidateWidget(WorldMapData_0.mousedOverWidgetIf1);
																}
															}

															if (var37 != Skills.field3247 && field714 == field621) {
																if (var37 != null) {
																	class184.invalidateWidget(var37);
																}

																if (Skills.field3247 != null) {
																	class184.invalidateWidget(Skills.field3247);
																}
															}

															if (Skills.field3247 != null) {
																if (field621 < field714) {
																	++field621;
																	if (field621 == field714) {
																		class184.invalidateWidget(Skills.field3247);
																	}
																}
															} else if (field621 > 0) {
																--field621;
															}

															if (oculusOrbState == 0) {
																var4 = HealthBarDefinition.localPlayer.x;
																var5 = HealthBarDefinition.localPlayer.y;
																if (class320.oculusOrbFocalPointX - var4 < -500 || class320.oculusOrbFocalPointX - var4 > 500 || class18.oculusOrbFocalPointY - var5 < -500 || class18.oculusOrbFocalPointY - var5 > 500) {
																	class320.oculusOrbFocalPointX = var4;
																	class18.oculusOrbFocalPointY = var5;
																}

																if (var4 != class320.oculusOrbFocalPointX) {
																	class320.oculusOrbFocalPointX += (var4 - class320.oculusOrbFocalPointX) / 16;
																}

																if (var5 != class18.oculusOrbFocalPointY) {
																	class18.oculusOrbFocalPointY += (var5 - class18.oculusOrbFocalPointY) / 16;
																}

																var6 = class320.oculusOrbFocalPointX >> 7;
																var7 = class18.oculusOrbFocalPointY >> 7;
																var8 = class392.getTileHeight(class320.oculusOrbFocalPointX, class18.oculusOrbFocalPointY, GrandExchangeOfferTotalQuantityComparator.Client_plane);
																var9 = 0;
																if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) {
																	for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
																		for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
																			var12 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
																			if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) {
																				++var12;
																			}

																			int var28 = var8 - Tiles.Tiles_heights[var12][var10][var11];
																			if (var28 > var9) {
																				var9 = var28;
																			}
																		}
																	}
																}

																var10 = var9 * 192;
																if (var10 > 98048) {
																	var10 = 98048;
																}

																if (var10 < 32768) {
																	var10 = 32768;
																}

																if (var10 > field556) {
																	field556 += (var10 - field556) / 24;
																} else if (var10 < field556) {
																	field556 += (var10 - field556) / 80;
																}

																DynamicObject.field942 = class392.getTileHeight(HealthBarDefinition.localPlayer.x, HealthBarDefinition.localPlayer.y, GrandExchangeOfferTotalQuantityComparator.Client_plane) - camFollowHeight;
															} else if (oculusOrbState == 1) {
																if (field511 && HealthBarDefinition.localPlayer != null) {
																	var4 = HealthBarDefinition.localPlayer.pathX[0];
																	var5 = HealthBarDefinition.localPlayer.pathY[0];
																	if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
																		class320.oculusOrbFocalPointX = HealthBarDefinition.localPlayer.x;
																		var6 = class392.getTileHeight(HealthBarDefinition.localPlayer.x, HealthBarDefinition.localPlayer.y, GrandExchangeOfferTotalQuantityComparator.Client_plane) - camFollowHeight;
																		if (var6 < DynamicObject.field942) {
																			DynamicObject.field942 = var6;
																		}

																		class18.oculusOrbFocalPointY = HealthBarDefinition.localPlayer.y;
																		field511 = false;
																	}
																}

																short var40 = -1;
																if (KeyHandler.KeyHandler_pressedKeys[33]) {
																	var40 = 0;
																} else if (KeyHandler.KeyHandler_pressedKeys[49]) {
																	var40 = 1024;
																}

																if (KeyHandler.KeyHandler_pressedKeys[48]) {
																	if (var40 == 0) {
																		var40 = 1792;
																	} else if (var40 == 1024) {
																		var40 = 1280;
																	} else {
																		var40 = 1536;
																	}
																} else if (KeyHandler.KeyHandler_pressedKeys[50]) {
																	if (var40 == 0) {
																		var40 = 256;
																	} else if (var40 == 1024) {
																		var40 = 768;
																	} else {
																		var40 = 512;
																	}
																}

																byte var41 = 0;
																if (KeyHandler.KeyHandler_pressedKeys[35]) {
																	var41 = -1;
																} else if (KeyHandler.KeyHandler_pressedKeys[51]) {
																	var41 = 1;
																}

																var6 = 0;
																if (var40 >= 0 || var41 != 0) {
																	var6 = KeyHandler.KeyHandler_pressedKeys[81] ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
																	var6 *= 16;
																	field520 = var40;
																	field549 = var41;
																}

																if (field547 < var6) {
																	field547 += var6 / 8;
																	if (field547 > var6) {
																		field547 = var6;
																	}
																} else if (field547 > var6) {
																	field547 = field547 * 9 / 10;
																}

																if (field547 > 0) {
																	var7 = field547 / 16;
																	if (field520 >= 0) {
																		var4 = field520 - WorldMapRegion.cameraYaw & 2047;
																		var8 = Rasterizer3D.Rasterizer3D_sine[var4];
																		var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
																		class320.oculusOrbFocalPointX += var8 * var7 / 65536;
																		class18.oculusOrbFocalPointY += var7 * var9 / 65536;
																	}

																	if (field549 != 0) {
																		DynamicObject.field942 += var7 * field549;
																		if (DynamicObject.field942 > 0) {
																			DynamicObject.field942 = 0;
																		}
																	}
																} else {
																	field520 = -1;
																	field549 = -1;
																}

																if (KeyHandler.KeyHandler_pressedKeys[13]) {
																	class29.method413();
																}
															}

															if (MouseHandler.MouseHandler_currentButton == 4 && ApproximateRouteStrategy.mouseCam) {
																var4 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																camAngleDX = var4 * 2;
																mouseCamClickedY = var4 != -1 && var4 != 1 ? (mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y;
																var5 = mouseCamClickedX - MouseHandler.MouseHandler_x;
																camAngleDY = var5 * 2;
																mouseCamClickedX = var5 != -1 && var5 != 1 ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
															} else {
																if (KeyHandler.KeyHandler_pressedKeys[96]) {
																	camAngleDY += (-24 - camAngleDY) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[97]) {
																	camAngleDY += (24 - camAngleDY) / 2;
																} else {
																	camAngleDY /= 2;
																}

																if (KeyHandler.KeyHandler_pressedKeys[98]) {
																	camAngleDX += (12 - camAngleDX) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[99]) {
																	camAngleDX += (-12 - camAngleDX) / 2;
																} else {
																	camAngleDX /= 2;
																}

																mouseCamClickedY = MouseHandler.MouseHandler_y;
																mouseCamClickedX = MouseHandler.MouseHandler_x;
															}

															camAngleY = camAngleDY / 2 + camAngleY & 2047;
															camAngleX += camAngleDX / 2;
															if (camAngleX < 128) {
																camAngleX = 128;
															}

															if (camAngleX > 383) {
																camAngleX = 383;
															}

															if (isCameraLocked) {
																class123.method2621();
															}

															for (var4 = 0; var4 < 5; ++var4) {
																var10002 = field722[var4]++;
															}

															Message.varcs.tryWrite();
															var4 = ++MouseHandler.MouseHandler_idleCycles - 1;
															var6 = GameEngine.method584();
															PacketBufferNode var29;
															if (var4 > 15000 && var6 > 15000) {
																logoutTimer = 250;
																ClanSettings.method2703(14500);
																var29 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2719, packetWriter.isaacCipher);
																packetWriter.addNode(var29);
															}

															class112.friendSystem.processFriendUpdates();
															++packetWriter.pendingWrites;
															if (packetWriter.pendingWrites > 50) {
																var29 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2726, packetWriter.isaacCipher);
																packetWriter.addNode(var29);
															}

															try {
																packetWriter.flush();
															} catch (IOException var30) {
																Clock.method2960();
															}

															return;
														}

														var52 = var51.widget;
														if (var52.childIndex < 0) {
															break;
														}

														var46 = UserComparator9.getWidget(var52.parentId);
													} while(var46 == null || var46.children == null || var52.childIndex >= var46.children.length || var52 != var46.children[var52.childIndex]);

													Tile.runScriptEvent(var51);
												}
											}

											var52 = var51.widget;
											if (var52.childIndex < 0) {
												break;
											}

											var46 = UserComparator9.getWidget(var52.parentId);
										} while(var46 == null || var46.children == null || var52.childIndex >= var46.children.length || var52 != var46.children[var52.childIndex]);

										Tile.runScriptEvent(var51);
									}
								}

								var52 = var51.widget;
								if (var52.childIndex < 0) {
									break;
								}

								var46 = UserComparator9.getWidget(var52.parentId);
							} while(var46 == null || var46.children == null || var52.childIndex >= var46.children.length || var52 != var46.children[var52.childIndex]);

							Tile.runScriptEvent(var51);
						}
					}

					var33 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2676, packetWriter.isaacCipher);
					var33.packetBuffer.writeByte(0);
					var3 = var33.packetBuffer.offset;
					class16.performReflectionCheck(var33.packetBuffer);
					var33.packetBuffer.method6963(var33.packetBuffer.offset - var3);
					packetWriter.addNode(var33);
				}
			}
		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "43"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GameEngine.canvasWidth;
		int var2 = KeyHandler.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (class408.clientPreferences != null) {
			try {
				class27.method394(ArchiveLoader.client, "resize", new Object[]{class134.getWindowedMode()});
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-693987024"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			DirectByteArrayCopier.method5179(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field594[var1]) {
				field553[var1] = true;
			}

			field651[var1] = field594[var1];
			field594[var1] = false;
		}

		field678 = cycle;
		viewportX = -1;
		viewportY = -1;
		class274.hoveredItemContainer = null;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			HorizontalAlignment.drawWidgets(rootInterface, 0, 0, GameEngine.canvasWidth, KeyHandler.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				UserComparator10.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				UserComparator10.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				SecureRandomFuture.method1979(viewportX, viewportY);
			}
		} else {
			Message.method1146();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field651[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field553[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		class130.method2746(GrandExchangeOfferTotalQuantityComparator.Client_plane, HealthBarDefinition.localPlayer.x, HealthBarDefinition.localPlayer.y, field531);
		field531 = 0;
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)Z",
		garbageValue = "-1849354153"
	)
	final boolean method1180(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var18;
			String var19;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1280) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1275 = 0;
						var1.field1280 = false;
					}

					var3.offset = 0;
					if (var3.method6912()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1275 = 0;
					}

					var1.field1280 = true;
					ServerPacket[] var4 = class128.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if (var5 < 0 || var5 >= var4.length) {
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length;
				}

				if (var1.serverPacketLength == -1) {
					if (!var2.isAvailable(1)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1275 = 0;
				timer.method5972();
				var1.field1285 = var1.field1284;
				var1.field1284 = var1.field1277;
				var1.field1277 = var1.serverPacket;
				int var17;
				String var53;
				if (ServerPacket.field2865 == var1.serverPacket) {
					var17 = var3.method6997();
					var5 = var3.method6996();
					var53 = var3.readStringCp1252NullTerminated();
					if (var17 >= 1 && var17 <= 8) {
						if (var53.equalsIgnoreCase("null")) {
							var53 = null;
						}

						playerMenuActions[var17 - 1] = var53;
						playerOptionsPriorities[var17 - 1] = var5 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				int var7;
				int var8;
				int var9;
				int var10;
				if (ServerPacket.field2806 == var1.serverPacket) {
					isCameraLocked = true;
					UrlRequest.field1298 = var3.readUnsignedByte() * 128;
					SoundSystem.field288 = var3.readUnsignedByte() * 128;
					ArchiveLoader.field985 = var3.readUnsignedShort();
					class269.field3221 = var3.readUnsignedByte();
					TextureProvider.field2484 = var3.readUnsignedByte();
					if (TextureProvider.field2484 >= 100) {
						var17 = UrlRequest.field1298 * 16384 + 64;
						var5 = SoundSystem.field288 * 16384 + 64;
						var18 = class392.getTileHeight(var17, var5, GrandExchangeOfferTotalQuantityComparator.Client_plane) - ArchiveLoader.field985;
						var7 = var17 - WorldMapSectionType.cameraX;
						var8 = var18 - class174.cameraY;
						var9 = var5 - class65.cameraZ;
						var10 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7));
						class121.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.949D) & 2047;
						WorldMapRegion.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047;
						if (class121.cameraPitch < 128) {
							class121.cameraPitch = 128;
						}

						if (class121.cameraPitch > 383) {
							class121.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2805 == var1.serverPacket) {
					ItemComposition.method3406();
					weight = var3.readShort();
					field494 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2890 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var17] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var17] = new GrandExchangeOffer(var3, false);
					}

					field536 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2804 == var1.serverPacket) {
					class21.method309(class240.field2772);
					var1.serverPacket = null;
					return true;
				}

				byte var61;
				if (ServerPacket.field2802 == var1.serverPacket) {
					var61 = var3.readByte();
					var5 = var3.method7120();
					Varps.Varps_temp[var5] = var61;
					if (Varps.Varps_main[var5] != var61) {
						Varps.Varps_main[var5] = var61;
					}

					WorldMapLabelSize.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2824 == var1.serverPacket) {
					class21.method309(class240.field2780);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2858 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var18 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field718[var17] = true;
					field719[var17] = var5;
					field598[var17] = var18;
					field721[var17] = var7;
					field722[var17] = 0;
					var1.serverPacket = null;
					return true;
				}

				int var15;
				String var25;
				if (ServerPacket.field2878 == var1.serverPacket) {
					var61 = var3.readByte();
					var19 = var3.readStringCp1252NullTerminated();
					long var20 = (long)var3.readUnsignedShort();
					long var22 = (long)var3.readMedium();
					PlayerType var70 = (PlayerType)UserComparator4.findEnumerated(VarbitComposition.PlayerType_values(), var3.readUnsignedByte());
					long var11 = var22 + (var20 << 32);
					boolean var58 = false;
					ClanChannel var14 = null;
					var14 = var61 >= 0 ? currentClanChannels[var61] : class115.guestClanChannel;
					if (var14 == null) {
						var58 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var70.isUser && class112.friendSystem.isIgnored(new Username(var19, GrandExchangeOfferUnitPriceComparator.loginType))) {
									var58 = true;
								}
								break;
							}

							if (var11 == crossWorldMessageIds[var15]) {
								var58 = true;
								break;
							}

							++var15;
						}
					}

					if (!var58) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var11;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var25 = AbstractFont.escapeBrackets(MilliClock.method2955(var3));
						int var16 = var61 >= 0 ? 41 : 44;
						if (var70.modIcon != -1) {
							class269.addChatMessage(var16, SpriteMask.method4998(var70.modIcon) + var19, var25, var14.name);
						} else {
							class269.addChatMessage(var16, var19, var25, var14.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2864 == var1.serverPacket) {
					if (rootInterface != -1) {
						ItemComposition.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2849 == var1.serverPacket) {
					class21.method309(class240.field2773);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2883 == var1.serverPacket) {
					var17 = var3.method7004();
					ClanSettings.method2714(var17);
					changedItemContainers[++field659 - 1 & 31] = var17 & 32767;
					var1.serverPacket = null;
					return true;
				}

				int var13;
				long var26;
				long var28;
				String var33;
				String var47;
				if (ServerPacket.field2838 == var1.serverPacket) {
					var47 = var3.readStringCp1252NullTerminated();
					var26 = (long)var3.readUnsignedShort();
					var28 = (long)var3.readMedium();
					PlayerType var30 = (PlayerType)UserComparator4.findEnumerated(VarbitComposition.PlayerType_values(), var3.readUnsignedByte());
					long var31 = (var26 << 32) + var28;
					boolean var12 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (crossWorldMessageIds[var13] == var31) {
							var12 = true;
							break;
						}
					}

					if (class112.friendSystem.isIgnored(new Username(var47, GrandExchangeOfferUnitPriceComparator.loginType))) {
						var12 = true;
					}

					if (!var12 && field539 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var31;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var33 = AbstractFont.escapeBrackets(class19.method277(MilliClock.method2955(var3)));
						byte var72;
						if (var30.isPrivileged) {
							var72 = 7;
						} else {
							var72 = 3;
						}

						if (var30.modIcon != -1) {
							class397.addGameMessage(var72, SpriteMask.method4998(var30.modIcon) + var47, var33);
						} else {
							class397.addGameMessage(var72, var47, var33);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2884 == var1.serverPacket) {
					field724 = cycleCntr;
					var61 = var3.readByte();
					class133 var67 = new class133(var3);
					ClanChannel var57;
					if (var61 >= 0) {
						var57 = currentClanChannels[var61];
					} else {
						var57 = class115.guestClanChannel;
					}

					var67.method2777(var57);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2888 == var1.serverPacket) {
					Players.field1254 = true;
					class16.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2811 == var1.serverPacket) {
					class16.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				Widget var52;
				if (ServerPacket.field2818 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readUnsignedShort();
					var52 = UserComparator9.getWidget(var17);
					if (var52.modelType != 2 || var5 != var52.modelId) {
						var52.modelType = 2;
						var52.modelId = var5;
						class184.invalidateWidget(var52);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2803 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var17 < -70000) {
						var5 += 32768;
					}

					if (var17 >= 0) {
						var52 = UserComparator9.getWidget(var17);
					} else {
						var52 = null;
					}

					for (; var3.offset < var1.serverPacketLength; DynamicObject.itemContainerSetItem(var5, var7, var8 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var9 = 0;
						if (var8 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var52 != null && var7 >= 0 && var7 < var52.itemIds.length) {
							var52.itemIds[var7] = var8;
							var52.itemQuantities[var7] = var9;
						}
					}

					if (var52 != null) {
						class184.invalidateWidget(var52);
					}

					ItemComposition.method3406();
					changedItemContainers[++field659 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2843 == var1.serverPacket) {
					var17 = var3.method7044();
					var5 = var3.method7006();
					var18 = var5 >> 10 & 31;
					var7 = var5 >> 5 & 31;
					var8 = var5 & 31;
					var9 = (var7 << 11) + (var18 << 19) + (var8 << 3);
					Widget var69 = UserComparator9.getWidget(var17);
					if (var9 != var69.color) {
						var69.color = var9;
						class184.invalidateWidget(var69);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2892 == var1.serverPacket) {
					Players.field1254 = true;
					class16.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2859 == var1.serverPacket) {
					byte[] var50 = new byte[var1.serverPacketLength];
					var3.method6939(var50, 0, var50.length);
					Buffer var66 = new Buffer(var50);
					var53 = var66.readStringCp1252NullTerminated();
					class91.openURL(var53, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2833 == var1.serverPacket) {
					isCameraLocked = true;
					SpotAnimationDefinition.field1761 = var3.readUnsignedByte() * 16384;
					BuddyRankComparator.field1333 = var3.readUnsignedByte() * 16384;
					Renderable.field2442 = var3.readUnsignedShort();
					UserComparator8.field1305 = var3.readUnsignedByte();
					Login.field888 = var3.readUnsignedByte();
					if (Login.field888 >= 100) {
						WorldMapSectionType.cameraX = SpotAnimationDefinition.field1761 * 128 + 64;
						class65.cameraZ = BuddyRankComparator.field1333 * 128 + 64;
						class174.cameraY = class392.getTileHeight(WorldMapSectionType.cameraX, class65.cameraZ, GrandExchangeOfferTotalQuantityComparator.Client_plane) - Renderable.field2442;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2826 == var1.serverPacket) {
					var17 = var3.method7015();
					var5 = var3.method7004();
					var52 = UserComparator9.getWidget(var17);
					if (var52 != null && var52.type == 0) {
						if (var5 > var52.scrollHeight - var52.height) {
							var5 = var52.scrollHeight - var52.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var52.scrollY) {
							var52.scrollY = var5;
							class184.invalidateWidget(var52);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2797 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					CollisionMap.forceDisconnect(var17);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2841 == var1.serverPacket) {
					ItemComposition.method3406();
					runEnergy = var3.readUnsignedByte();
					field494 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2875 == var1.serverPacket) {
					ApproximateRouteStrategy.privateChatMode = FloorDecoration.method4189(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2845 == var1.serverPacket) {
					var47 = var3.readStringCp1252NullTerminated();
					var5 = var3.method7021();
					var52 = UserComparator9.getWidget(var5);
					if (!var47.equals(var52.text)) {
						var52.text = var47;
						class184.invalidateWidget(var52);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2874 == var1.serverPacket) {
					Canvas.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2861 == var1.serverPacket) {
					rebootTimer = var3.method7120() * 30;
					field494 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2813 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						class274.method5198(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2853 == var1.serverPacket) {
					CollisionMap.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2820 == var1.serverPacket) {
					var47 = var3.readStringCp1252NullTerminated();
					Object[] var65 = new Object[var47.length() + 1];

					for (var18 = var47.length() - 1; var18 >= 0; --var18) {
						if (var47.charAt(var18) == 's') {
							var65[var18 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var65[var18 + 1] = new Integer(var3.readInt());
						}
					}

					var65[0] = new Integer(var3.readInt());
					ScriptEvent var54 = new ScriptEvent();
					var54.args = var65;
					Tile.runScriptEvent(var54);
					var1.serverPacket = null;
					return true;
				}

				boolean var56;
				if (ServerPacket.field2854 == var1.serverPacket) {
					var17 = var3.method7044();
					var56 = var3.readUnsignedByte() == 1;
					var52 = UserComparator9.getWidget(var17);
					if (var56 != var52.isHidden) {
						var52.isHidden = var56;
						class184.invalidateWidget(var52);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2852 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.method7004();
					var52 = UserComparator9.getWidget(var17);
					if (var52.modelType != 1 || var5 != var52.modelId) {
						var52.modelType = 1;
						var52.modelId = var5;
						class184.invalidateWidget(var52);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2836 == var1.serverPacket) {
					Actor.field1146 = var3.method6995();
					ItemComposition.field1931 = var3.readUnsignedByte();

					for (var17 = ItemComposition.field1931; var17 < ItemComposition.field1931 + 8; ++var17) {
						for (var5 = Actor.field1146; var5 < Actor.field1146 + 8; ++var5) {
							if (groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var17][var5] != null) {
								groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var17][var5] = null;
								WallDecoration.updateItemPile(var17, var5);
							}
						}
					}

					for (PendingSpawn var49 = (PendingSpawn)pendingSpawns.last(); var49 != null; var49 = (PendingSpawn)pendingSpawns.previous()) {
						if (var49.x >= ItemComposition.field1931 && var49.x < ItemComposition.field1931 + 8 && var49.y >= Actor.field1146 && var49.y < Actor.field1146 + 8 && var49.plane == GrandExchangeOfferTotalQuantityComparator.Client_plane) {
							var49.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2870 == var1.serverPacket) {
					SequenceDefinition.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2856 == var1.serverPacket) {
					class112.friendSystem.method1746();
					field679 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2871 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var18 = var3.readUnsignedShort();
					class128.queueSoundEffect(var17, var5, var18);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2793 == var1.serverPacket) {
					isCameraLocked = false;

					for (var17 = 0; var17 < 5; ++var17) {
						field718[var17] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2844 == var1.serverPacket) {
					for (var17 = 0; var17 < VarpDefinition.VarpDefinition_fileCount; ++var17) {
						VarpDefinition var64 = ArchiveLoader.VarpDefinition_get(var17);
						if (var64 != null) {
							Varps.Varps_temp[var17] = 0;
							Varps.Varps_main[var17] = 0;
						}
					}

					ItemComposition.method3406();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var35;
				if (ServerPacket.field2809 == var1.serverPacket) {
					var17 = var3.method7006();
					var5 = var3.method7015();
					var18 = var3.method6995();
					var35 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var35 != null) {
						Players.closeInterface(var35, var17 != var35.group);
					}

					DynamicObject.method1997(var5, var17, var18);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2847 == var1.serverPacket) {
					class21.method309(class240.field2781);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2846 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var17 < -70000) {
						var5 += 32768;
					}

					if (var17 >= 0) {
						var52 = UserComparator9.getWidget(var17);
					} else {
						var52 = null;
					}

					if (var52 != null) {
						for (var7 = 0; var7 < var52.itemIds.length; ++var7) {
							var52.itemIds[var7] = 0;
							var52.itemQuantities[var7] = 0;
						}
					}

					class20.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var3.method6996();
						if (var9 == 255) {
							var9 = var3.method7015();
						}

						var10 = var3.method7004();
						if (var52 != null && var8 < var52.itemIds.length) {
							var52.itemIds[var8] = var10;
							var52.itemQuantities[var8] = var9;
						}

						DynamicObject.itemContainerSetItem(var5, var8, var10 - 1, var9);
					}

					if (var52 != null) {
						class184.invalidateWidget(var52);
					}

					ItemComposition.method3406();
					changedItemContainers[++field659 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2860 == var1.serverPacket) {
					var17 = var3.readUShortSmart();
					var56 = var3.readUnsignedByte() == 1;
					var53 = "";
					boolean var55 = false;
					if (var56) {
						var53 = var3.readStringCp1252NullTerminated();
						if (class112.friendSystem.isIgnored(new Username(var53, GrandExchangeOfferUnitPriceComparator.loginType))) {
							var55 = true;
						}
					}

					String var76 = var3.readStringCp1252NullTerminated();
					if (!var55) {
						class397.addGameMessage(var17, var53, var76);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2839 == var1.serverPacket) {
					Canvas.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2885 == var1.serverPacket) {
					ItemComposition.field1931 = var3.method6995();
					Actor.field1146 = var3.readUnsignedByte();

					while (var3.offset < var1.serverPacketLength) {
						var17 = var3.readUnsignedByte();
						class240 var63 = class130.method2748()[var17];
						class21.method309(var63);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2796 == var1.serverPacket) {
					class128.method2728(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2812 == var1.serverPacket) {
					class21.method309(class240.field2782);
					var1.serverPacket = null;
					return true;
				}

				Widget var73;
				if (ServerPacket.field2842 == var1.serverPacket) {
					var17 = var3.method7120();
					var5 = var3.method7004();
					var18 = var3.method7021();
					var73 = UserComparator9.getWidget(var18);
					var73.field3165 = var5 + (var17 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2834 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readInt();
					var18 = Occluder.getGcDuration();
					PacketBufferNode var75 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2680, packetWriter.isaacCipher);
					var75.packetBuffer.writeByte(GameEngine.fps);
					var75.packetBuffer.method7126(var17);
					var75.packetBuffer.method7126(var5);
					var75.packetBuffer.method6947(var18);
					packetWriter.addNode(var75);
					var1.serverPacket = null;
					return true;
				}

				boolean var68;
				if (ServerPacket.field2821 == var1.serverPacket) {
					var68 = var3.readUnsignedByte() == 1;
					if (var68) {
						GrandExchangeOfferUnitPriceComparator.field3758 = class111.method2516() - var3.readLong();
						JagexCache.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						JagexCache.grandExchangeEvents = null;
					}

					field670 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2850 == var1.serverPacket) {
					var17 = var3.method7008();
					var5 = var3.method7044();
					var52 = UserComparator9.getWidget(var5);
					if (var17 != var52.sequenceId || var17 == -1) {
						var52.sequenceId = var17;
						var52.modelFrame = 0;
						var52.modelFrameCycle = 0;
						class184.invalidateWidget(var52);
					}

					var1.serverPacket = null;
					return true;
				}

				long var37;
				if (ServerPacket.field2827 == var1.serverPacket) {
					var61 = var3.readByte();
					var26 = (long)var3.readUnsignedShort();
					var28 = (long)var3.readMedium();
					var37 = var28 + (var26 << 32);
					boolean var77 = false;
					ClanChannel var40 = var61 >= 0 ? currentClanChannels[var61] : class115.guestClanChannel;
					if (var40 == null) {
						var77 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (crossWorldMessageIds[var13] == var37) {
								var77 = true;
								break;
							}
						}
					}

					if (!var77) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var37;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var33 = MilliClock.method2955(var3);
						int var71 = var61 >= 0 ? 43 : 46;
						class269.addChatMessage(var71, "", var33, var40.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2868 == var1.serverPacket) {
					for (var17 = 0; var17 < players.length; ++var17) {
						if (players[var17] != null) {
							players[var17].sequence = -1;
						}
					}

					for (var17 = 0; var17 < npcs.length; ++var17) {
						if (npcs[var17] != null) {
							npcs[var17].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var36;
				if (ServerPacket.field2828 == var1.serverPacket) {
					var17 = var3.method7044();
					var5 = var3.method7044();
					InterfaceParent var51 = (InterfaceParent)interfaceParents.get((long)var17);
					var35 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var35 != null) {
						Players.closeInterface(var35, var51 == null || var51.group != var35.group);
					}

					if (var51 != null) {
						var51.remove();
						interfaceParents.put(var51, (long)var5);
					}

					var36 = UserComparator9.getWidget(var17);
					if (var36 != null) {
						class184.invalidateWidget(var36);
					}

					var36 = UserComparator9.getWidget(var5);
					if (var36 != null) {
						class184.invalidateWidget(var36);
						class81.revalidateWidgetScroll(WorldMapSection1.Widget_interfaceComponents[var36.id >>> 16], var36, true);
					}

					if (rootInterface != -1) {
						ItemComposition.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2822 == var1.serverPacket) {
					publicChatMode = var3.method6996();
					tradeChatMode = var3.method6997();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2887 == var1.serverPacket) {
					destinationX = var3.readUnsignedByte();
					if (destinationX == 255) {
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte();
					if (destinationY == 255) {
						destinationY = 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2815 == var1.serverPacket) {
					ItemComposition.method3406();
					var17 = var3.method6997();
					var5 = var3.method7015();
					var18 = var3.method6995();
					experience[var17] = var5;
					currentLevels[var17] = var18;
					levels[var17] = 1;

					for (var7 = 0; var7 < 98; ++var7) {
						if (var5 >= Skills.Skills_experienceTable[var7]) {
							levels[var17] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var17;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2807 == var1.serverPacket) {
					UserComparator6.method2509();
					var61 = var3.readByte();
					class119 var62 = new class119(var3);
					ClanSettings var6;
					if (var61 >= 0) {
						var6 = currentClanSettings[var61];
					} else {
						var6 = class67.guestClanSettings;
					}

					var62.method2577(var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2877 == var1.serverPacket) {
					var17 = var3.method7021();
					var5 = var3.readInt();
					var18 = var3.readUnsignedShort();
					if (var18 == 65535) {
						var18 = -1;
					}

					var7 = var3.method7120();
					if (var7 == 65535) {
						var7 = -1;
					}

					for (var8 = var7; var8 <= var18; ++var8) {
						var37 = (long)var8 + ((long)var5 << 32);
						Node var78 = widgetFlags.get(var37);
						if (var78 != null) {
							var78.remove();
						}

						widgetFlags.put(new IntegerNode(var17), var37);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2800 == var1.serverPacket) {
					UserComparator6.method2509();
					var61 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var61 >= 0) {
							currentClanSettings[var61] = null;
						} else {
							class67.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var61 >= 0) {
						currentClanSettings[var61] = new ClanSettings(var3);
					} else {
						class67.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2798 == var1.serverPacket) {
					var17 = var3.method7006();
					rootInterface = var17;
					this.resizeRoot(false);
					Player.Widget_resetModelFrames(var17);
					class54.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field594[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var59;
				if (ServerPacket.field2794 == var1.serverPacket) {
					var17 = var3.method7021();
					var59 = UserComparator9.getWidget(var17);
					var59.modelType = 3;
					var59.modelId = HealthBarDefinition.localPlayer.appearance.getChatHeadId();
					class184.invalidateWidget(var59);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2808 == var1.serverPacket) {
					var17 = var3.readInt();
					InterfaceParent var60 = (InterfaceParent)interfaceParents.get((long)var17);
					if (var60 != null) {
						Players.closeInterface(var60, true);
					}

					if (meslayerContinueWidget != null) {
						class184.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2873 == var1.serverPacket) {
					class21.method309(class240.field2778);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2857 == var1.serverPacket) {
					class112.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field679 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2832 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2863 == var1.serverPacket) {
					var47 = var3.readStringCp1252NullTerminated();
					var19 = AbstractFont.escapeBrackets(class19.method277(MilliClock.method2955(var3)));
					class397.addGameMessage(6, var47, var19);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2855 == var1.serverPacket) {
					class21.method309(class240.field2774);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2816 == var1.serverPacket) {
					World var48 = new World();
					var48.host = var3.readStringCp1252NullTerminated();
					var48.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var48.properties = var5;
					WorldMapData_1.updateGameState(45);
					var2.close();
					var2 = null;
					MidiPcmStream.changeWorld(var48);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2814 == var1.serverPacket) {
					var68 = var3.readBoolean();
					if (var68) {
						if (ClanSettings.field1440 == null) {
							ClanSettings.field1440 = new class300();
						}
					} else {
						ClanSettings.field1440 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2823 == var1.serverPacket) {
					class21.method309(class240.field2775);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2869 == var1.serverPacket) {
					class21.method309(class240.field2777);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2825 == var1.serverPacket) {
					var17 = var3.method7006();
					if (var17 == 65535) {
						var17 = -1;
					}

					var5 = var3.readInt();
					var18 = var3.method7015();
					var73 = UserComparator9.getWidget(var5);
					ItemComposition var74;
					if (!var73.isIf3) {
						if (var17 == -1) {
							var73.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var74 = TaskHandler.ItemDefinition_get(var17);
						var73.modelType = 4;
						var73.modelId = var17;
						var73.modelAngleX = var74.xan2d;
						var73.modelAngleY = var74.yan2d;
						var73.modelZoom = var74.zoom2d * 100 / var18;
						class184.invalidateWidget(var73);
					} else {
						var73.itemId = var17;
						var73.itemQuantity = var18;
						var74 = TaskHandler.ItemDefinition_get(var17);
						var73.modelAngleX = var74.xan2d;
						var73.modelAngleY = var74.yan2d;
						var73.modelAngleZ = var74.zan2d;
						var73.modelOffsetX = var74.offsetX2d;
						var73.modelOffsetY = var74.offsetY2d;
						var73.modelZoom = var74.zoom2d;
						if (var74.isStackable == 1) {
							var73.itemQuantityMode = 1;
						} else {
							var73.itemQuantityMode = 2;
						}

						if (var73.field3106 > 0) {
							var73.modelZoom = var73.modelZoom * 32 / var73.field3106;
						} else if (var73.rawWidth > 0) {
							var73.modelZoom = var73.modelZoom * 32 / var73.rawWidth;
						}

						class184.invalidateWidget(var73);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2880 == var1.serverPacket) {
					var17 = var3.method7044();
					var5 = var3.readUnsignedShort();
					Varps.Varps_temp[var5] = var17;
					if (Varps.Varps_main[var5] != var17) {
						Varps.Varps_main[var5] = var17;
					}

					WorldMapLabelSize.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2876 == var1.serverPacket) {
					class21.method309(class240.field2779);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2872 == var1.serverPacket) {
					var17 = var3.readInt();
					if (var17 != field552) {
						field552 = var17;
						class126.method2646();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2837 == var1.serverPacket) {
					field724 = cycleCntr;
					var61 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var61 >= 0) {
							currentClanChannels[var61] = null;
						} else {
							class115.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var61 >= 0) {
						currentClanChannels[var61] = new ClanChannel(var3);
					} else {
						class115.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				long var42;
				if (ServerPacket.field2829 == var1.serverPacket) {
					var47 = var3.readStringCp1252NullTerminated();
					var26 = var3.readLong();
					var28 = (long)var3.readUnsignedShort();
					var37 = (long)var3.readMedium();
					PlayerType var41 = (PlayerType)UserComparator4.findEnumerated(VarbitComposition.PlayerType_values(), var3.readUnsignedByte());
					var42 = var37 + (var28 << 32);
					boolean var34 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (var42 == crossWorldMessageIds[var15]) {
							var34 = true;
							break;
						}
					}

					if (var41.isUser && class112.friendSystem.isIgnored(new Username(var47, GrandExchangeOfferUnitPriceComparator.loginType))) {
						var34 = true;
					}

					if (!var34 && field539 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var42;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var25 = AbstractFont.escapeBrackets(class19.method277(MilliClock.method2955(var3)));
						if (var41.modIcon != -1) {
							class269.addChatMessage(9, SpriteMask.method4998(var41.modIcon) + var47, var25, FontName.base37DecodeLong(var26));
						} else {
							class269.addChatMessage(9, var47, var25, FontName.base37DecodeLong(var26));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2801 == var1.serverPacket) {
					if (NPC.field1210 == null) {
						NPC.field1210 = new class353(class240.HitSplatDefinition_cachedSprites);
					}

					class408 var46 = class240.HitSplatDefinition_cachedSprites.method6391(var3);
					NPC.field1210.field4033.vmethod6736(var46.field4363, var46.field4361);
					field662[++field663 - 1 & 31] = var46.field4363;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2886 == var1.serverPacket) {
					var17 = var3.method7015();
					var5 = var3.method7007();
					var18 = var3.method7007();
					var73 = UserComparator9.getWidget(var17);
					if (var5 != var73.rawX || var18 != var73.rawY || var73.xAlignment != 0 || var73.yAlignment != 0) {
						var73.rawX = var5;
						var73.rawY = var18;
						var73.xAlignment = 0;
						var73.yAlignment = 0;
						class184.invalidateWidget(var73);
						this.alignWidget(var73);
						if (var73.type == 0) {
							class81.revalidateWidgetScroll(WorldMapSection1.Widget_interfaceComponents[var17 >> 16], var73, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2851 == var1.serverPacket) {
					var17 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					var18 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						Player.Widget_resetModelFrames(rootInterface);
						class54.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							field594[var7] = true;
						}
					}

					InterfaceParent var24;
					for (; var18-- > 0; var24.field1011 = true) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var24 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var24 != null && var8 != var24.group) {
							Players.closeInterface(var24, true);
							var24 = null;
						}

						if (var24 == null) {
							var24 = DynamicObject.method1997(var7, var8, var9);
						}
					}

					for (var35 = (InterfaceParent)interfaceParents.first(); var35 != null; var35 = (InterfaceParent)interfaceParents.next()) {
						if (var35.field1011) {
							var35.field1011 = false;
						} else {
							Players.closeInterface(var35, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var17) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var10 = var3.readInt();

						for (int var39 = var8; var39 <= var9; ++var39) {
							var42 = (long)var39 + ((long)var7 << 32);
							widgetFlags.put(new IntegerNode(var10), var42);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2792 == var1.serverPacket) {
					class16.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2810 == var1.serverPacket) {
					var17 = var3.method7120();
					if (var17 == 65535) {
						var17 = -1;
					}

					ModeWhere.playSong(var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2862 == var1.serverPacket) {
					var17 = var3.readMedium();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					Friend.method6057(var5, var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2881 == var1.serverPacket) {
					if (var1.serverPacketLength == 0) {
						AbstractArchive.friendsChatManager = null;
					} else {
						if (AbstractArchive.friendsChatManager == null) {
							AbstractArchive.friendsChatManager = new FriendsChatManager(GrandExchangeOfferUnitPriceComparator.loginType, ArchiveLoader.client);
						}

						AbstractArchive.friendsChatManager.readUpdate(var3);
					}

					ReflectionCheck.method1114();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2867 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					ArchiveLoader.method2056(var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2819 == var1.serverPacket) {
					for (var17 = 0; var17 < Varps.Varps_main.length; ++var17) {
						if (Varps.Varps_temp[var17] != Varps.Varps_main[var17]) {
							Varps.Varps_main[var17] = Varps.Varps_temp[var17];
							WorldMapLabelSize.changeGameOptions(var17);
							changedVarps[++changedVarpCount - 1 & 31] = var17;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2817 == var1.serverPacket) {
					class112.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					TextureProvider.FriendSystem_invalidateIgnoreds();
					field679 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2882 == var1.serverPacket) {
					NPC.field1210 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2835 == var1.serverPacket) {
					var17 = var3.method7015();
					var59 = UserComparator9.getWidget(var17);

					for (var18 = 0; var18 < var59.itemIds.length; ++var18) {
						var59.itemIds[var18] = -1;
						var59.itemIds[var18] = 0;
					}

					class184.invalidateWidget(var59);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2840 == var1.serverPacket) {
					ItemComposition.field1931 = var3.readUnsignedByte();
					Actor.field1146 = var3.method6996();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2830 == var1.serverPacket) {
					GameBuild.updatePlayers(var3, var1.serverPacketLength);
					class279.method5216();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2879 == var1.serverPacket) {
					NPC.field1210 = new class353(class240.HitSplatDefinition_cachedSprites);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2795 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					var18 = var3.readUnsignedShort();
					var7 = var3.method7015();
					var36 = UserComparator9.getWidget(var7);
					if (var17 != var36.modelAngleX || var5 != var36.modelAngleY || var18 != var36.modelZoom) {
						var36.modelAngleX = var17;
						var36.modelAngleY = var5;
						var36.modelZoom = var18;
						class184.invalidateWidget(var36);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2831 == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) {
						if (hintArrowType == 2) {
							hintArrowSubX = 4096;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 8192;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 4096;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 4096;
							hintArrowSubY = 8192;
						}

						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						hintArrowHeight = var3.readUnsignedByte() * 4;
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2799 == var1.serverPacket) {
					if (AbstractArchive.friendsChatManager != null) {
						AbstractArchive.friendsChatManager.method6040(var3);
					}

					ReflectionCheck.method1114();
					var1.serverPacket = null;
					return true;
				}

				MilliClock.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1284 != null ? var1.field1284.id : -1) + "," + (var1.field1285 != null ? var1.field1285.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				SequenceDefinition.logOut();
			} catch (IOException var44) {
				Clock.method2960();
			} catch (Exception var45) {
				var19 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1284 != null ? var1.field1284.id : -1) + "," + (var1.field1285 != null ? var1.field1285.id : -1) + "," + var1.serverPacketLength + "," + (HealthBarDefinition.localPlayer.pathX[0] + class19.baseX * 64) + "," + (HealthBarDefinition.localPlayer.pathY[0] + DefaultsGroup.baseY * 64) + ",";

				for (var18 = 0; var18 < var1.serverPacketLength && var18 < 50; ++var18) {
					var19 = var19 + var3.array[var18] + ",";
				}

				MilliClock.RunException_sendStackTrace(var19, var45);
				SequenceDefinition.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "46102630"
	)
	@Export("menu")
	final void menu() {
		class29.method414();
		if (class247.dragInventoryWidget == null) {
			if (clickedWidget == null) {
				int var1 = MouseHandler.MouseHandler_lastButton;
				int var2;
				int var4;
				int var5;
				int var6;
				int var8;
				int var9;
				if (isMenuOpen) {
					int var3;
					int var13;
					if (var1 != 1 && (ApproximateRouteStrategy.mouseCam || var1 != 4)) {
						var2 = MouseHandler.MouseHandler_x;
						var3 = MouseHandler.MouseHandler_y;
						if (var2 < SecureRandomCallable.menuX - 10 || var2 > SecureRandomCallable.menuX + ObjectComposition.menuWidth + 10 || var3 < Frames.menuY - 10 || var3 > StudioGame.menuHeight + Frames.menuY + 10) {
							isMenuOpen = false;
							var4 = SecureRandomCallable.menuX;
							var5 = Frames.menuY;
							var6 = ObjectComposition.menuWidth;
							var13 = StudioGame.menuHeight;

							for (var8 = 0; var8 < rootWidgetCount; ++var8) {
								if (rootWidgetWidths[var8] + rootWidgetXs[var8] > var4 && rootWidgetXs[var8] < var6 + var4 && rootWidgetHeights[var8] + rootWidgetYs[var8] > var5 && rootWidgetYs[var8] < var5 + var13) {
									field594[var8] = true;
								}
							}
						}
					}

					if (var1 == 1 || !ApproximateRouteStrategy.mouseCam && var1 == 4) {
						var2 = SecureRandomCallable.menuX;
						var3 = Frames.menuY;
						var4 = ObjectComposition.menuWidth;
						var5 = MouseHandler.MouseHandler_lastPressedX;
						var6 = MouseHandler.MouseHandler_lastPressedY;
						var13 = -1;

						for (var8 = 0; var8 < menuOptionsCount; ++var8) {
							var9 = (menuOptionsCount - 1 - var8) * 15 + var3 + 31;
							if (var5 > var2 && var5 < var2 + var4 && var6 > var9 - 13 && var6 < var9 + 3) {
								var13 = var8;
							}
						}

						if (var13 != -1) {
							class67.method1913(var13);
						}

						isMenuOpen = false;
						var8 = SecureRandomCallable.menuX;
						var9 = Frames.menuY;
						int var14 = ObjectComposition.menuWidth;
						int var11 = StudioGame.menuHeight;

						for (int var12 = 0; var12 < rootWidgetCount; ++var12) {
							if (rootWidgetXs[var12] + rootWidgetWidths[var12] > var8 && rootWidgetXs[var12] < var14 + var8 && rootWidgetHeights[var12] + rootWidgetYs[var12] > var9 && rootWidgetYs[var12] < var11 + var9) {
								field594[var12] = true;
							}
						}
					}
				} else {
					var2 = menuOptionsCount - 1;
					if ((var1 == 1 || !ApproximateRouteStrategy.mouseCam && var1 == 4) && var2 >= 0) {
						var4 = menuOpcodes[var2];
						if (var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) {
							var5 = menuArguments1[var2];
							var6 = menuArguments2[var2];
							Widget var7 = UserComparator9.getWidget(var6);
							if (HorizontalAlignment.method3114(PendingSpawn.getWidgetFlags(var7)) || TileItem.method2316(PendingSpawn.getWidgetFlags(var7))) {
								if (class247.dragInventoryWidget != null && !field667 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
									var8 = draggedWidgetX;
									var9 = draggedWidgetY;
									MenuAction var10 = class274.tempMenuAction;
									class14.menuAction(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.action, var10.action, var8, var9);
									class274.tempMenuAction = null;
								}

								field667 = false;
								itemDragDuration = 0;
								if (class247.dragInventoryWidget != null) {
									class184.invalidateWidget(class247.dragInventoryWidget);
								}

								class247.dragInventoryWidget = UserComparator9.getWidget(var6);
								dragItemSlotSource = var5;
								draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
								draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
								if (var2 >= 0) {
									class12.method170(var2);
								}

								class184.invalidateWidget(class247.dragInventoryWidget);
								return;
							}
						}
					}

					if ((var1 == 1 || !ApproximateRouteStrategy.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) {
						var1 = 2;
					}

					if ((var1 == 1 || !ApproximateRouteStrategy.mouseCam && var1 == 4) && menuOptionsCount > 0) {
						class67.method1913(var2);
					}

					if (var1 == 2 && menuOptionsCount > 0) {
						this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
				}

			}
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-296322242"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1;
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || UrlRequest.method2446(var1)) && !menuShiftClick[var1];
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "8"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		class392.method6871(var1, var2);
		GameBuild.scene.menuOpen(GrandExchangeOfferTotalQuantityComparator.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-586334153"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		SecureRandomCallable.method2051(rootInterface, GameEngine.canvasWidth, KeyHandler.canvasHeight, var1);
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)V",
		garbageValue = "925917033"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : UserComparator9.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = GameEngine.canvasWidth;
			var4 = KeyHandler.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		WorldMapScaleHandler.alignWidgetSize(var1, var3, var4, false);
		LoginPacket.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "407876174"
	)
	final void method1186() {
		class184.invalidateWidget(clickedWidget);
		++class134.widgetDragDuration;
		if (field680 && field648) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field649) {
				var1 = field649;
			}

			if (var1 + clickedWidget.width > field649 + clickedWidgetParent.width) {
				var1 = field649 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field650) {
				var2 = field650;
			}

			if (var2 + clickedWidget.height > field650 + clickedWidgetParent.height) {
				var2 = field650 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field652;
			int var4 = var2 - field468;
			int var5 = clickedWidget.dragZoneSize;
			if (class134.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field649 + clickedWidgetParent.scrollX;
			int var7 = var2 - field650 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				Tile.runScriptEvent(var8);
			}

			if (MouseHandler.MouseHandler_currentButton == 0) {
				if (isDraggingWidget) {
					if (clickedWidget.onDragComplete != null) {
						var8 = new ScriptEvent();
						var8.widget = clickedWidget;
						var8.mouseX = var6;
						var8.mouseY = var7;
						var8.dragTarget = draggedOnWidget;
						var8.args = clickedWidget.onDragComplete;
						Tile.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && BuddyRankComparator.method2501(clickedWidget) != null) {
						PacketBufferNode var12 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2727, packetWriter.isaacCipher);
						var12.packetBuffer.method7001(draggedOnWidget.itemId);
						var12.packetBuffer.writeShort(draggedOnWidget.childIndex);
						var12.packetBuffer.method7001(clickedWidget.childIndex);
						var12.packetBuffer.method7126(draggedOnWidget.id);
						var12.packetBuffer.method7001(clickedWidget.itemId);
						var12.packetBuffer.writeIntME(clickedWidget.id);
						packetWriter.addNode(var12);
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field652 + widgetClickX, widgetClickY + field468);
				} else if (menuOptionsCount > 0) {
					int var11 = widgetClickX + field652;
					int var9 = widgetClickY + field468;
					MenuAction var10 = class274.tempMenuAction;
					class14.menuAction(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.action, var10.action, var11, var9);
					class274.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		} else {
			if (class134.widgetDragDuration > 1) {
				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(I)Lpb;",
		garbageValue = "-1245448697"
	)
	@Export("username")
	public Username username() {
		return HealthBarDefinition.localPlayer != null ? HealthBarDefinition.localPlayer.username : null;
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 27; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						switch(var1) {
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0;
						case 2:
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						default:
							break;
						case 3:
							if (var2.equalsIgnoreCase("true")) {
								isMembersWorld = true;
							} else {
								isMembersWorld = false;
							}
							break;
						case 4:
							if (clientType == -1) {
								clientType = Integer.parseInt(var2);
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2);
							break;
						case 6:
							MouseHandler.clientLanguage = Language.method5519(Integer.parseInt(var2));
							break;
						case 7:
							ArchiveLoader.field984 = WorldMapIcon_0.method3890(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							UserComparator3.field1316 = var2;
							break;
						case 10:
							RouteStrategy.field1986 = (StudioGame)UserComparator4.findEnumerated(class157.method3084(), Integer.parseInt(var2));
							if (StudioGame.oldscape == RouteStrategy.field1986) {
								GrandExchangeOfferUnitPriceComparator.loginType = LoginType.oldscape;
							} else {
								GrandExchangeOfferUnitPriceComparator.loginType = LoginType.field4231;
							}
							break;
						case 11:
							WorldMapSection1.field2203 = var2;
							break;
						case 12:
							worldId = Integer.parseInt(var2);
							break;
						case 14:
							TextureProvider.field2483 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							BoundaryObject.field2618 = var2;
							break;
						case 21:
							field467 = Integer.parseInt(var2);
							break;
						case 22:
							field619 = Integer.parseInt(var2) != 0;
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				WorldMapIcon_0.worldHost = this.getCodeBase().getHost();
				String var4 = ArchiveLoader.field984.name;
				byte var5 = 0;

				try {
					class300.method5507("oldschool", var4, var5, 21);
				} catch (Exception var6) {
					MilliClock.RunException_sendStackTrace((String)null, var6);
				}

				ArchiveLoader.client = this;
				RunException.clientType = clientType;
				if (field469 == -1) {
					field469 = 0;
				}

				JagexCache.field1560 = System.getenv("JX_ACCESS_TOKEN");
				System.getenv("JX_REFRESH_TOKEN");
				this.startThread(765, 503, 201);
			}
		} catch (RuntimeException var7) {
			throw MouseHandler.newRunException(var7, "client.init(" + ')');
		}
	}

	public void setOAuthTokens(String var1, String var2) {
		if (var1 != null && !var1.trim().isEmpty() && var2 != null && !var2.trim().isEmpty()) {
			JagexCache.field1560 = var1;
			class275.method5201(10);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I",
		garbageValue = "-6598"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1972300304"
	)
	static boolean method1643() {
		if (archiveLoaders != null && archiveLoadersDone < archiveLoaders.size()) {
			while (archiveLoadersDone < archiveLoaders.size()) {
				ArchiveLoader var0 = (ArchiveLoader)archiveLoaders.get(archiveLoadersDone);
				if (!var0.isLoaded()) {
					return false;
				}

				++archiveLoadersDone;
			}

			return true;
		} else {
			return true;
		}
	}
}
