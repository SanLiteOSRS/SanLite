import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed {
	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = -967608343
	)
	static int field748;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -159421781
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		longValue = 3335751163548503689L
	)
	static long field879;
	@ObfuscatedName("ou")
	static boolean[] field834;
	@ObfuscatedName("ot")
	static boolean[] field745;
	@ObfuscatedName("oj")
	static boolean[] field758;
	@ObfuscatedName("nl")
	static boolean field705;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = -1723544013
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pz")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = 954341551
	)
	public static int field950;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 1826821479
	)
	static int field874;
	@ObfuscatedName("nx")
	static boolean field859;
	@ObfuscatedName("qq")
	static boolean field916;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = -115501903
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("nh")
	@ObfuscatedGetter(
		intValue = -1615551305
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		intValue = 897589711
	)
	static int field860;
	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("ob")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("ol")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = -1965324355
	)
	static int field861;
	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = -1215664047
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("on")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = 1050326365
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("oh")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	@Export("widgetClickMasks")
	static NodeHashTable widgetClickMasks;
	@ObfuscatedName("tz")
	@ObfuscatedSignature(
		signature = "Lbx;"
	)
	static final ApproximateRouteStrategy field877;
	@ObfuscatedName("og")
	@ObfuscatedSignature(
		signature = "Lja;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("ne")
	@ObfuscatedGetter(
		intValue = -532029863
	)
	static int field931;
	@ObfuscatedName("ny")
	@ObfuscatedGetter(
		intValue = -467484497
	)
	static int field868;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = -400221737
	)
	static int field701;
	@ObfuscatedName("rj")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = 2067578655
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = -1857927441
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("tl")
	static int[] field695;
	@ObfuscatedName("tj")
	static int[] field956;
	@ObfuscatedName("np")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = 1446456861
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = 1875055983
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = 12933011
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = 373944835
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = 1660756197
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("rg")
	static boolean[] field926;
	@ObfuscatedName("rw")
	static int[] field927;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = -905823515
	)
	static int field945;
	@ObfuscatedName("ro")
	static int[] field928;
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		signature = "Lhu;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("ru")
	static int[] field898;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = 1478190693
	)
	@Export("areaSoundEffectVolume")
	static int areaSoundEffectVolume;
	@ObfuscatedName("sb")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("rp")
	static int[] field918;
	@ObfuscatedName("so")
	@ObfuscatedGetter(
		intValue = 1105285413
	)
	static int field895;
	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = 2064359385
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = -361533157
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("pb")
	static long[] field900;
	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		signature = "[Lj;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = 845536339
	)
	static int field901;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 1746826411
	)
	static int field885;
	@ObfuscatedName("nk")
	static int[] field867;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = 1183562103
	)
	static int field878;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = -770002343
	)
	static int field875;
	@ObfuscatedName("na")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -1931074951
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		longValue = 7054518271740632067L
	)
	static long field905;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = 743392311
	)
	static int field906;
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		signature = "Lmy;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = -1587883567
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = -1411709539
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = -1821649225
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = 637100393
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("nv")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = -1001910639
	)
	static int field941;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = -696027355
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("qw")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("qv")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("qf")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = 1888830449
	)
	@Export("musicVolume")
	static int musicVolume;
	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		signature = "[Ldq;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = -481995573
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 977040321
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("py")
	static int[] field723;
	@ObfuscatedName("qg")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = -1728090839
	)
	@Export("soundEffectVolume")
	static int soundEffectVolume;
	@ObfuscatedName("pd")
	static int[] field909;
	@ObfuscatedName("rt")
	static short field873;
	@ObfuscatedName("rc")
	static short field932;
	@ObfuscatedName("rd")
	static short field937;
	@ObfuscatedName("rz")
	static short field935;
	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		signature = "[Llc;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("ra")
	static short field753;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = -840703781
	)
	static int field852;
	@ObfuscatedName("sl")
	@ObfuscatedGetter(
		intValue = -462473275
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("rs")
	static short field865;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = 476049569
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("sd")
	@ObfuscatedGetter(
		intValue = 996380993
	)
	static int field953;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = 1006230257
	)
	static int field846;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = 1182698243
	)
	static int field902;
	@ObfuscatedName("rm")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("ry")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = -1815216699
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pm")
	static int[] field904;
	@ObfuscatedName("pu")
	static int[] field903;
	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		signature = "Lja;"
	)
	static NodeDeque field881;
	@ObfuscatedName("om")
	@ObfuscatedSignature(
		signature = "Lja;"
	)
	static NodeDeque field939;
	@ObfuscatedName("ns")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = 1489885445
	)
	static int field843;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = -1530697045
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = 1279066227
	)
	static int field844;
	@ObfuscatedName("ps")
	static String field710;
	@ObfuscatedName("pq")
	static int[] field896;
	@ObfuscatedName("su")
	@ObfuscatedSignature(
		signature = "Lbu;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("s")
	static String[] field957;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "[Lfh;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("ad")
	static boolean field772;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1952252433
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1836293151
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1500455873
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bl")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bn")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 530446497
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1817623855
	)
	static int field686;
	@ObfuscatedName("by")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1008452177
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("ca")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1633145881
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		longValue = 7364036271402416249L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -345670979
	)
	static int field719;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 711078459
	)
	static int field693;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		longValue = 6513468436641987539L
	)
	static long field694;
	@ObfuscatedName("cm")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("cb")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1097232173
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 663263241
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1168701183
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1852952069
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1012584603
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 285496787
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1578688308
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 1178111296
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 952040384
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		signature = "Lcd;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		signature = "Lcd;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -772944549
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -207137197
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -910834387
	)
	static int field794;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		longValue = 1178443596221129289L
	)
	static long field696;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -85937083
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = 474300455
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = 506244731
	)
	static int field947;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = 1618145807
	)
	static int field715;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = 764009473
	)
	static int field716;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		signature = "Lfz;"
	)
	static class169 field717;
	@ObfuscatedName("el")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		signature = "Lct;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fw")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		signature = "[Lca;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = -2146265857
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ff")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		intValue = -1153230115
	)
	static int field726;
	@ObfuscatedName("fv")
	static int[] field727;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		signature = "Ldg;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("fd")
	@ObfuscatedGetter(
		intValue = 416640201
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("fe")
	static boolean field730;
	@ObfuscatedName("fx")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		signature = "Ljr;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("ft")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 955711481
	)
	static int field734;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = 926514475
	)
	static int field735;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = 1079386381
	)
	static int field848;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = 28672383
	)
	static int field737;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = 1298064441
	)
	static int field722;
	@ObfuscatedName("gu")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("gb")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("gj")
	static final int[] field954;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = -1423039985
	)
	static int field743;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = 2098595987
	)
	static int field925;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = -1305614333
	)
	static int field765;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = 1632535067
	)
	static int field746;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = 845386571
	)
	static int field747;
	@ObfuscatedName("hp")
	static boolean field690;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -504309469
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("hc")
	@ObfuscatedGetter(
		intValue = 694250825
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = -1414005751
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("hf")
	@ObfuscatedGetter(
		intValue = -1795969885
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = -56354123
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = 2135930637
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("he")
	@ObfuscatedGetter(
		intValue = -77775685
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = -1649155215
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = 39732577
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 1110148459
	)
	static int field692;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = -2023417181
	)
	static int field759;
	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		intValue = 2143690291
	)
	static int field760;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = -1776720113
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = -285231223
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = 1473843199
	)
	static int field763;
	@ObfuscatedName("ib")
	static boolean field725;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = 1886979431
	)
	static int field882;
	@ObfuscatedName("ir")
	static boolean field750;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = 300729757
	)
	static int field810;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = -735595377
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = -251508065
	)
	static int field955;
	@ObfuscatedName("ie")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("ia")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ii")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("iu")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("iy")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("ju")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("jo")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("jd")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("jx")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -1171972661
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 1986908281
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = 1344112683
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = -1678392525
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 379363511
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = 2115175527
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = -1792879987
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("js")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = 1659427899
	)
	static int field828;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = -1858381215
	)
	static int field788;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = 1955491125
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = 2107596607
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = -1255636543
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = 1843538815
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("jw")
	static boolean field830;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = 1543846117
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = 1665596697
	)
	static int field795;
	@ObfuscatedName("jz")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		signature = "[Lbi;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = 1876036055
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = -651069671
	)
	static int field799;
	@ObfuscatedName("kd")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = 1408541917
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = 725006111
	)
	static int field802;
	@ObfuscatedName("kf")
	static int[] field803;
	@ObfuscatedName("kr")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ko")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("kn")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("kc")
	static int[] field807;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = -1515987941
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		signature = "[[[Lja;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		signature = "Lja;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		signature = "Lja;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		signature = "Lja;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("kb")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("kh")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("ln")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = 1331910575
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("lg")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = -315201447
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("lk")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("lo")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("lh")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("lr")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("la")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ll")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("ls")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("lp")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("lf")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("lm")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("ly")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -689178451
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = -1951728151
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = 812853429
	)
	static int field832;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = -2049020101
	)
	static int field833;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = 1700020883
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ma")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = -718961001
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = 2082291921
	)
	static int field838;
	@ObfuscatedName("mo")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("mc")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -906778899
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		signature = "Lkb;"
	)
	Buffer field720;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		signature = "Lt;"
	)
	class9 field721;

	static {
		field772 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		clientType = -1;
		field686 = -1;
		onMobile = false;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = 1L;
		field719 = -1;
		field693 = -1;
		field694 = -1L;
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
		field794 = 0;
		js5Errors = 0;
		loginState = 0;
		field947 = 0;
		field715 = 0;
		field716 = 0;
		field717 = class169.field2028;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[32768];
		npcCount = 0;
		npcIndices = new int[32768];
		field726 = 0;
		field727 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		field730 = false;
		useBufferedSocket = true;
		timer = new Timer();
		fontsMap = new HashMap();
		field734 = 0;
		field735 = 1;
		field848 = 0;
		field737 = 1;
		field722 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field954 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field743 = 0;
		field925 = 2301979;
		field765 = 5063219;
		field746 = 3353893;
		field747 = 7759444;
		field690 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field692 = 0;
		field759 = 0;
		field760 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field763 = 0;
		field725 = false;
		field882 = 0;
		field750 = false;
		field810 = 0;
		overheadTextCount = 0;
		field955 = 50;
		overheadTextXs = new int[field955];
		overheadTextYs = new int[field955];
		overheadTextAscents = new int[field955];
		overheadTextXOffsets = new int[field955];
		overheadTextColors = new int[field955];
		overheadTextEffects = new int[field955];
		overheadTextCyclesRemaining = new int[field955];
		overheadText = new String[field955];
		tileLastDrawnActor = new int[104][104];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		showMouseCross = true;
		field828 = 0;
		field788 = 0;
		dragItemSlotSource = 0;
		draggedWidgetX = 0;
		draggedWidgetY = 0;
		dragItemSlotDestination = 0;
		field830 = false;
		itemDragDuration = 0;
		field795 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field799 = 0;
		renderSelf = true;
		drawPlayerNames = 0;
		field802 = 0;
		field803 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		field807 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
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
		field832 = 0;
		field833 = 50;
		isItemSelected = 0;
		selectedItemName = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		field838 = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field843 = 0;
		field844 = -1;
		chatEffects = 0;
		field846 = 0;
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
		field859 = false;
		field860 = -1;
		field861 = -1;
		field705 = false;
		field931 = -1;
		field701 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		field867 = new int[32];
		field868 = 0;
		changedItemContainers = new int[32];
		field941 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		chatCycle = 0;
		field874 = 0;
		field875 = 0;
		field885 = 0;
		field852 = 0;
		field878 = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		field881 = new NodeDeque();
		field939 = new NodeDeque();
		widgetClickMasks = new NodeHashTable(512);
		rootWidgetCount = 0;
		field748 = -2;
		field834 = new boolean[100];
		field758 = new boolean[100];
		field745 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field879 = 0L;
		isResizable = true;
		field896 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field710 = "";
		field900 = new long[100];
		field901 = 0;
		field902 = 0;
		field903 = new int[128];
		field904 = new int[128];
		field905 = -1L;
		field906 = -1;
		mapIconCount = 0;
		field723 = new int[1000];
		field909 = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		musicVolume = 255;
		currentTrackGroupId = -1;
		field916 = false;
		soundEffectVolume = 127;
		areaSoundEffectVolume = 127;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field926 = new boolean[5];
		field927 = new int[5];
		field928 = new int[5];
		field898 = new int[5];
		field918 = new int[5];
		field873 = 256;
		field932 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field865 = 1;
		field753 = 32767;
		field937 = 1;
		field935 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field945 = -1;
		field895 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field950 = -1;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field953 = 0;
		field877 = new ApproximateRouteStrategy();
		field695 = new int[50];
		field956 = new int[50];
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1977357922"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field879 = Nameable.currentTimeMillis() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1060461771"
	)
	@Export("setUp")
	protected final void setUp() {
		FaceNormal.method3392(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		Coord.port1 = gameBuild == 0 ? 43594 : worldId + 40000;
		Coord.port2 = gameBuild == 0 ? 443 : worldId + 50000;
		class41.port3 = Coord.port1;
		PlayerComposition.field2559 = class224.field2570;
		MouseRecorder.field628 = class224.field2573;
		FriendLoginUpdate.field3671 = class224.field2571;
		MusicPatchPcmStream.field2516 = class224.field2572;
		class52.urlRequester = new UrlRequester();
		this.setUpKeyboard();
		this.setUpMouse();
		class8.mouseWheel = this.mouseWheel();
		GrandExchangeOfferWorldComparator.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var2 = null;
		ClientPreferences var3 = new ClientPreferences();

		try {
			var2 = WorldMapID.getPreferencesFile("", GrandExchangeOfferWorldComparator.field58.name, false);
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

		GrandExchangeOfferAgeComparator.clientPreferences = var3;
		this.setUpClipboard();
		String var9 = PendingSpawn.null_string;
		class60.applet = this;
		if (var9 != null) {
			class60.field453 = var9;
		}

		if (gameBuild != 0) {
			displayFps = true;
		}

		class277.setWindowedMode(GrandExchangeOfferAgeComparator.clientPreferences.windowMode);
		WorldMapLabelSize.friendSystem = new FriendSystem(UserComparator4.loginType);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1100660042"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var1 == null) {
				int var45;
				try {
					if (class206.musicPlayerStatus == 1) {
						var45 = class13.midiPcmStream.method3856();
						if (var45 > 0 && class13.midiPcmStream.isReady()) {
							var45 -= MusicPatch.pcmSampleLength;
							if (var45 < 0) {
								var45 = 0;
							}

							class13.midiPcmStream.setPcmStreamVolume(var45);
						} else {
							class13.midiPcmStream.clear();
							class13.midiPcmStream.removeAll();
							if (class23.musicTrackArchive != null) {
								class206.musicPlayerStatus = 2;
							} else {
								class206.musicPlayerStatus = 0;
							}

							InterfaceParent.musicTrack = null;
							LoginType.soundCache = null;
						}
					}
				} catch (Exception var64) {
					var64.printStackTrace();
					class13.midiPcmStream.clear();
					class206.musicPlayerStatus = 0;
					InterfaceParent.musicTrack = null;
					LoginType.soundCache = null;
					class23.musicTrackArchive = null;
				}

				FriendSystem.playPcmPlayers();
				FriendSystem.method2017();
				synchronized(MouseHandler.MouseHandler_instance) {
					MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
					MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
					MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
					MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
					MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
					MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
					MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
					MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
					MouseHandler.MouseHandler_lastButtonVolatile = 0;
				}

				if (class8.mouseWheel != null) {
					var45 = class8.mouseWheel.useRotation();
					mouseWheelRotation = var45;
				}

				if (gameState == 0) {
					class336.load();
					WorldMapLabel.method519();
				} else if (gameState == 5) {
					Canvas.doCycleTitle(this);
					class336.load();
					WorldMapLabel.method519();
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						Canvas.doCycleTitle(this);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						GrandExchangeOfferAgeComparator.method243(false);
						field734 = 0;
						boolean var75 = true;

						int var46;
						for (var46 = 0; var46 < GrandExchangeOffer.regionLandArchives.length; ++var46) {
							if (class22.regionMapArchiveIds[var46] != -1 && GrandExchangeOffer.regionLandArchives[var46] == null) {
								GrandExchangeOffer.regionLandArchives[var46] = Varcs.archive5.takeFile(class22.regionMapArchiveIds[var46], 0);
								if (GrandExchangeOffer.regionLandArchives[var46] == null) {
									var75 = false;
									++field734;
								}
							}

							if (WallDecoration.regionLandArchiveIds[var46] != -1 && GameEngine.regionMapArchives[var46] == null) {
								GameEngine.regionMapArchives[var46] = Varcs.archive5.takeFileEncrypted(WallDecoration.regionLandArchiveIds[var46], 0, WorldMapEvent.xteaKeys[var46]);
								if (GameEngine.regionMapArchives[var46] == null) {
									var75 = false;
									++field734;
								}
							}
						}

						if (!var75) {
							field722 = 1;
						} else {
							field848 = 0;
							var75 = true;

							int var5;
							Buffer var9;
							int var10;
							int var11;
							int var12;
							int var14;
							int var15;
							int var16;
							int var17;
							int var18;
							int var19;
							int var47;
							for (var46 = 0; var46 < GrandExchangeOffer.regionLandArchives.length; ++var46) {
								byte[] var3 = GameEngine.regionMapArchives[var46];
								if (var3 != null) {
									var47 = (class52.regions[var46] >> 8) * 64 - FloorDecoration.baseX * 64;
									var5 = (class52.regions[var46] & 255) * 64 - WorldMapData_0.baseY * 64;
									if (isInInstance) {
										var47 = 10;
										var5 = 10;
									}

									boolean var8 = true;
									var9 = new Buffer(var3);
									var10 = -1;

									label1377:
									while (true) {
										var11 = var9.method5743();
										if (var11 == 0) {
											var75 &= var8;
											break;
										}

										var10 += var11;
										var12 = 0;
										boolean var13 = false;

										while (true) {
											while (!var13) {
												var14 = var9.readUShortSmart();
												if (var14 == 0) {
													continue label1377;
												}

												var12 += var14 - 1;
												var15 = var12 & 63;
												var16 = var12 >> 6 & 63;
												var17 = var9.readUnsignedByte() >> 2;
												var18 = var47 + var16;
												var19 = var15 + var5;
												if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
													ObjectComposition var20 = ScriptEvent.getObjectDefinition(var10);
													if (var17 != 22 || !isLowDetail || var20.int1 != 0 || var20.interactType == 1 || var20.boolean2) {
														if (!var20.needsModelFiles()) {
															++field848;
															var8 = false;
														}

														var13 = true;
													}
												}
											}

											var14 = var9.readUShortSmart();
											if (var14 == 0) {
												break;
											}

											var9.readUnsignedByte();
										}
									}
								}
							}

							if (!var75) {
								field722 = 2;
							} else {
								if (field722 != 0) {
									AbstractWorldMapData.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
								}

								FriendSystem.playPcmPlayers();
								ModeWhere.scene.clear();

								for (var46 = 0; var46 < 4; ++var46) {
									collisionMaps[var46].clear();
								}

								int var48;
								for (var46 = 0; var46 < 4; ++var46) {
									for (var48 = 0; var48 < 104; ++var48) {
										for (var47 = 0; var47 < 104; ++var47) {
											Tiles.Tiles_renderFlags[var46][var48][var47] = 0;
										}
									}
								}

								FriendSystem.playPcmPlayers();
								AbstractArchive.method4397();
								var46 = GrandExchangeOffer.regionLandArchives.length;

								for (ObjectSound var65 = (ObjectSound)ObjectSound.objectSounds.last(); var65 != null; var65 = (ObjectSound)ObjectSound.objectSounds.previous()) {
									if (var65.stream1 != null) {
										GrandExchangeEvents.pcmStreamMixer.removeSubStream(var65.stream1);
										var65.stream1 = null;
									}

									if (var65.stream2 != null) {
										GrandExchangeEvents.pcmStreamMixer.removeSubStream(var65.stream2);
										var65.stream2 = null;
									}
								}

								ObjectSound.objectSounds.clear();
								GrandExchangeOfferAgeComparator.method243(true);
								int var6;
								int var7;
								int[] var10000;
								int var21;
								int var22;
								int var53;
								int var69;
								int var71;
								if (!isInInstance) {
									var48 = 0;

									label1309:
									while (true) {
										byte[] var49;
										if (var48 >= var46) {
											for (var48 = 0; var48 < var46; ++var48) {
												var47 = (class52.regions[var48] >> 8) * 64 - FloorDecoration.baseX * 64;
												var5 = (class52.regions[var48] & 255) * 64 - WorldMapData_0.baseY * 64;
												var49 = GrandExchangeOffer.regionLandArchives[var48];
												if (var49 == null && AbstractWorldMapData.field198 < 800) {
													FriendSystem.playPcmPlayers();
													method1838(var47, var5, 64, 64);
												}
											}

											GrandExchangeOfferAgeComparator.method243(true);
											var48 = 0;

											while (true) {
												if (var48 >= var46) {
													break label1309;
												}

												byte[] var4 = GameEngine.regionMapArchives[var48];
												if (var4 != null) {
													var5 = (class52.regions[var48] >> 8) * 64 - FloorDecoration.baseX * 64;
													var6 = (class52.regions[var48] & 255) * 64 - WorldMapData_0.baseY * 64;
													FriendSystem.playPcmPlayers();
													Scene var51 = ModeWhere.scene;
													CollisionMap[] var52 = collisionMaps;
													var9 = new Buffer(var4);
													var10 = -1;

													while (true) {
														var11 = var9.method5743();
														if (var11 == 0) {
															break;
														}

														var10 += var11;
														var12 = 0;

														while (true) {
															var71 = var9.readUShortSmart();
															if (var71 == 0) {
																break;
															}

															var12 += var71 - 1;
															var14 = var12 & 63;
															var15 = var12 >> 6 & 63;
															var16 = var12 >> 12;
															var17 = var9.readUnsignedByte();
															var18 = var17 >> 2;
															var19 = var17 & 3;
															var53 = var5 + var15;
															var21 = var14 + var6;
															if (var53 > 0 && var21 > 0 && var53 < 103 && var21 < 103) {
																var22 = var16;
																if ((Tiles.Tiles_renderFlags[1][var53][var21] & 2) == 2) {
																	var22 = var16 - 1;
																}

																CollisionMap var23 = null;
																if (var22 >= 0) {
																	var23 = var52[var22];
																}

																NPC.method2160(var16, var53, var21, var10, var19, var18, var51, var23);
															}
														}
													}
												}

												++var48;
											}
										}

										var47 = (class52.regions[var48] >> 8) * 64 - FloorDecoration.baseX * 64;
										var5 = (class52.regions[var48] & 255) * 64 - WorldMapData_0.baseY * 64;
										var49 = GrandExchangeOffer.regionLandArchives[var48];
										if (var49 != null) {
											FriendSystem.playPcmPlayers();
											var7 = GrandExchangeEvent.field78 * 8 - 48;
											var69 = AbstractWorldMapData.field198 * 8 - 48;
											CollisionMap[] var70 = collisionMaps;
											var10 = 0;

											label1306:
											while (true) {
												if (var10 >= 4) {
													Buffer var50 = new Buffer(var49);
													var11 = 0;

													while (true) {
														if (var11 >= 4) {
															break label1306;
														}

														for (var12 = 0; var12 < 64; ++var12) {
															for (var71 = 0; var71 < 64; ++var71) {
																HealthBarUpdate.loadTerrain(var50, var11, var47 + var12, var5 + var71, var7, var69, 0);
															}
														}

														++var11;
													}
												}

												for (var11 = 0; var11 < 64; ++var11) {
													for (var12 = 0; var12 < 64; ++var12) {
														if (var11 + var47 > 0 && var47 + var11 < 103 && var12 + var5 > 0 && var5 + var12 < 103) {
															var10000 = var70[var10].flags[var11 + var47];
															var10000[var5 + var12] &= -16777217;
														}
													}
												}

												++var10;
											}
										}

										++var48;
									}
								}

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
								int var54;
								int var58;
								if (isInInstance) {
									var48 = 0;

									label1242:
									while (true) {
										if (var48 >= 4) {
											for (var48 = 0; var48 < 13; ++var48) {
												for (var47 = 0; var47 < 13; ++var47) {
													var5 = instanceChunkTemplates[0][var48][var47];
													if (var5 == -1) {
														method1838(var48 * 8, var47 * 8, 8, 8);
													}
												}
											}

											GrandExchangeOfferAgeComparator.method243(true);
											var48 = 0;

											while (true) {
												if (var48 >= 4) {
													break label1242;
												}

												FriendSystem.playPcmPlayers();

												for (var47 = 0; var47 < 13; ++var47) {
													label1199:
													for (var5 = 0; var5 < 13; ++var5) {
														var6 = instanceChunkTemplates[var48][var47][var5];
														if (var6 != -1) {
															var7 = var6 >> 24 & 3;
															var69 = var6 >> 1 & 3;
															var54 = var6 >> 14 & 1023;
															var10 = var6 >> 3 & 2047;
															var11 = (var54 / 8 << 8) + var10 / 8;

															for (var12 = 0; var12 < class52.regions.length; ++var12) {
																if (class52.regions[var12] == var11 && GameEngine.regionMapArchives[var12] != null) {
																	byte[] var55 = GameEngine.regionMapArchives[var12];
																	var14 = var47 * 8;
																	var15 = var5 * 8;
																	var16 = (var54 & 7) * 8;
																	var17 = (var10 & 7) * 8;
																	Scene var56 = ModeWhere.scene;
																	CollisionMap[] var57 = collisionMaps;
																	Buffer var72 = new Buffer(var55);
																	var21 = -1;

																	while (true) {
																		var22 = var72.method5743();
																		if (var22 == 0) {
																			continue label1199;
																		}

																		var21 += var22;
																		var58 = 0;

																		while (true) {
																			var24 = var72.readUShortSmart();
																			if (var24 == 0) {
																				break;
																			}

																			var58 += var24 - 1;
																			var25 = var58 & 63;
																			var26 = var58 >> 6 & 63;
																			var27 = var58 >> 12;
																			var28 = var72.readUnsignedByte();
																			var29 = var28 >> 2;
																			var30 = var28 & 3;
																			if (var7 == var27 && var26 >= var16 && var26 < var16 + 8 && var25 >= var17 && var25 < var17 + 8) {
																				ObjectComposition var31 = ScriptEvent.getObjectDefinition(var21);
																				var32 = var14 + TextureProvider.method2906(var26 & 7, var25 & 7, var69, var31.sizeX, var31.sizeY, var30);
																				var33 = var15 + InterfaceParent.method1272(var26 & 7, var25 & 7, var69, var31.sizeX, var31.sizeY, var30);
																				if (var32 > 0 && var33 > 0 && var32 < 103 && var33 < 103) {
																					var34 = var48;
																					if ((Tiles.Tiles_renderFlags[1][var32][var33] & 2) == 2) {
																						var34 = var48 - 1;
																					}

																					CollisionMap var35 = null;
																					if (var34 >= 0) {
																						var35 = var57[var34];
																					}

																					NPC.method2160(var48, var32, var33, var21, var69 + var30 & 3, var29, var56, var35);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}

												++var48;
											}
										}

										FriendSystem.playPcmPlayers();

										for (var47 = 0; var47 < 13; ++var47) {
											for (var5 = 0; var5 < 13; ++var5) {
												boolean var68 = false;
												var7 = instanceChunkTemplates[var48][var47][var5];
												if (var7 != -1) {
													var69 = var7 >> 24 & 3;
													var54 = var7 >> 1 & 3;
													var10 = var7 >> 14 & 1023;
													var11 = var7 >> 3 & 2047;
													var12 = (var10 / 8 << 8) + var11 / 8;

													for (var71 = 0; var71 < class52.regions.length; ++var71) {
														if (class52.regions[var71] == var12 && GrandExchangeOffer.regionLandArchives[var71] != null) {
															MouseHandler.method1174(GrandExchangeOffer.regionLandArchives[var71], var48, var47 * 8, var5 * 8, var69, (var10 & 7) * 8, (var11 & 7) * 8, var54, collisionMaps);
															var68 = true;
															break;
														}
													}
												}

												if (!var68) {
													NetFileRequest.method4293(var48, var47 * 8, var5 * 8);
												}
											}
										}

										++var48;
									}
								}

								GrandExchangeOfferAgeComparator.method243(true);
								FriendSystem.playPcmPlayers();
								Scene var66 = ModeWhere.scene;
								CollisionMap[] var67 = collisionMaps;

								for (var5 = 0; var5 < 4; ++var5) {
									for (var6 = 0; var6 < 104; ++var6) {
										for (var7 = 0; var7 < 104; ++var7) {
											if ((Tiles.Tiles_renderFlags[var5][var6][var7] & 1) == 1) {
												var69 = var5;
												if ((Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) {
													var69 = var5 - 1;
												}

												if (var69 >= 0) {
													var67[var69].setBlockedByFloor(var6, var7);
												}
											}
										}
									}
								}

								Tiles.field539 += (int)(Math.random() * 5.0D) - 2;
								if (Tiles.field539 < -8) {
									Tiles.field539 = -8;
								}

								if (Tiles.field539 > 8) {
									Tiles.field539 = 8;
								}

								Tiles.field540 += (int)(Math.random() * 5.0D) - 2;
								if (Tiles.field540 < -16) {
									Tiles.field540 = -16;
								}

								if (Tiles.field540 > 16) {
									Tiles.field540 = 16;
								}

								for (var5 = 0; var5 < 4; ++var5) {
									byte[][] var76 = class299.field3679[var5];
									var12 = (int)Math.sqrt(5100.0D);
									var71 = var12 * 768 >> 8;

									for (var14 = 1; var14 < 103; ++var14) {
										for (var15 = 1; var15 < 103; ++var15) {
											var16 = Tiles.Tiles_heights[var5][var15 + 1][var14] - Tiles.Tiles_heights[var5][var15 - 1][var14];
											var17 = Tiles.Tiles_heights[var5][var15][var14 + 1] - Tiles.Tiles_heights[var5][var15][var14 - 1];
											var18 = (int)Math.sqrt((double)(var16 * var16 + var17 * var17 + 65536));
											var19 = (var16 << 8) / var18;
											var53 = 65536 / var18;
											var21 = (var17 << 8) / var18;
											var22 = (var19 * -50 + var21 * -50 + var53 * -10) / var71 + 96;
											var58 = (var76[var15 - 1][var14] >> 2) + (var76[var15][var14 - 1] >> 2) + (var76[var15 + 1][var14] >> 3) + (var76[var15][var14 + 1] >> 3) + (var76[var15][var14] >> 1);
											UserComparator10.field1999[var15][var14] = var22 - var58;
										}
									}

									for (var14 = 0; var14 < 104; ++var14) {
										GrandExchangeOfferOwnWorldComparator.Tiles_hue[var14] = 0;
										class238.Tiles_saturation[var14] = 0;
										ItemLayer.Tiles_lightness[var14] = 0;
										class248.Tiles_hueMultiplier[var14] = 0;
										class1.field1[var14] = 0;
									}

									for (var14 = -5; var14 < 109; ++var14) {
										for (var15 = 0; var15 < 104; ++var15) {
											var16 = var14 + 5;
											int var10002;
											if (var16 >= 0 && var16 < 104) {
												var17 = TileItem.field1273[var5][var16][var15] & 255;
												if (var17 > 0) {
													FloorUnderlayDefinition var79 = class234.method4260(var17 - 1);
													var10000 = GrandExchangeOfferOwnWorldComparator.Tiles_hue;
													var10000[var15] += var79.hue;
													var10000 = class238.Tiles_saturation;
													var10000[var15] += var79.saturation;
													var10000 = ItemLayer.Tiles_lightness;
													var10000[var15] += var79.lightness;
													var10000 = class248.Tiles_hueMultiplier;
													var10000[var15] += var79.hueMultiplier;
													var10002 = class1.field1[var15]++;
												}
											}

											var17 = var14 - 5;
											if (var17 >= 0 && var17 < 104) {
												var18 = TileItem.field1273[var5][var17][var15] & 255;
												if (var18 > 0) {
													FloorUnderlayDefinition var80 = class234.method4260(var18 - 1);
													var10000 = GrandExchangeOfferOwnWorldComparator.Tiles_hue;
													var10000[var15] -= var80.hue;
													var10000 = class238.Tiles_saturation;
													var10000[var15] -= var80.saturation;
													var10000 = ItemLayer.Tiles_lightness;
													var10000[var15] -= var80.lightness;
													var10000 = class248.Tiles_hueMultiplier;
													var10000[var15] -= var80.hueMultiplier;
													var10002 = class1.field1[var15]--;
												}
											}
										}

										if (var14 >= 1 && var14 < 103) {
											var15 = 0;
											var16 = 0;
											var17 = 0;
											var18 = 0;
											var19 = 0;

											for (var53 = -5; var53 < 109; ++var53) {
												var21 = var53 + 5;
												if (var21 >= 0 && var21 < 104) {
													var15 += GrandExchangeOfferOwnWorldComparator.Tiles_hue[var21];
													var16 += class238.Tiles_saturation[var21];
													var17 += ItemLayer.Tiles_lightness[var21];
													var18 += class248.Tiles_hueMultiplier[var21];
													var19 += class1.field1[var21];
												}

												var22 = var53 - 5;
												if (var22 >= 0 && var22 < 104) {
													var15 -= GrandExchangeOfferOwnWorldComparator.Tiles_hue[var22];
													var16 -= class238.Tiles_saturation[var22];
													var17 -= ItemLayer.Tiles_lightness[var22];
													var18 -= class248.Tiles_hueMultiplier[var22];
													var19 -= class1.field1[var22];
												}

												if (var53 >= 1 && var53 < 103 && (!isLowDetail || (Tiles.Tiles_renderFlags[0][var14][var53] & 2) != 0 || (Tiles.Tiles_renderFlags[var5][var14][var53] & 16) == 0)) {
													if (var5 < Tiles.Tiles_minPlane) {
														Tiles.Tiles_minPlane = var5;
													}

													var58 = TileItem.field1273[var5][var14][var53] & 255;
													var24 = NPC.field1161[var5][var14][var53] & 255;
													if (var58 > 0 || var24 > 0) {
														var25 = Tiles.Tiles_heights[var5][var14][var53];
														var26 = Tiles.Tiles_heights[var5][var14 + 1][var53];
														var27 = Tiles.Tiles_heights[var5][var14 + 1][var53 + 1];
														var28 = Tiles.Tiles_heights[var5][var14][var53 + 1];
														var29 = UserComparator10.field1999[var14][var53];
														var30 = UserComparator10.field1999[var14 + 1][var53];
														int var59 = UserComparator10.field1999[var14 + 1][var53 + 1];
														var32 = UserComparator10.field1999[var14][var53 + 1];
														var33 = -1;
														var34 = -1;
														int var36;
														int var60;
														if (var58 > 0) {
															var60 = var15 * 256 / var18;
															var36 = var16 / var19;
															int var37 = var17 / var19;
															var33 = WorldMapEvent.hslToRgb(var60, var36, var37);
															var60 = var60 + Tiles.field539 & 255;
															var37 += Tiles.field540;
															if (var37 < 0) {
																var37 = 0;
															} else if (var37 > 255) {
																var37 = 255;
															}

															var34 = WorldMapEvent.hslToRgb(var60, var36, var37);
														}

														if (var5 > 0) {
															boolean var81 = true;
															if (var58 == 0 && Tiles.field531[var5][var14][var53] != 0) {
																var81 = false;
															}

															if (var24 > 0 && !PendingSpawn.method1839(var24 - 1).hideUnderlay) {
																var81 = false;
															}

															if (var81 && var26 == var25 && var25 == var27 && var25 == var28) {
																var10000 = UserComparator10.field2000[var5][var14];
																var10000[var53] |= 2340;
															}
														}

														var60 = 0;
														if (var34 != -1) {
															var60 = Rasterizer3D.Rasterizer3D_colorPalette[VarcInt.method4555(var34, 96)];
														}

														if (var24 == 0) {
															var66.addTile(var5, var14, var53, 0, 0, -1, var25, var26, var27, var28, VarcInt.method4555(var33, var29), VarcInt.method4555(var33, var30), VarcInt.method4555(var33, var59), VarcInt.method4555(var33, var32), 0, 0, 0, 0, var60, 0);
														} else {
															var36 = Tiles.field531[var5][var14][var53] + 1;
															byte var74 = UserComparator2.field3859[var5][var14][var53];
															FloorOverlayDefinition var38 = PendingSpawn.method1839(var24 - 1);
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
																var40 = WorldMapEvent.hslToRgb(var38.hue, var38.saturation, var38.lightness);
																var42 = var38.hue + Tiles.field539 & 255;
																var43 = var38.lightness + Tiles.field540;
																if (var43 < 0) {
																	var43 = 0;
																} else if (var43 > 255) {
																	var43 = 255;
																}

																var41 = WorldMapEvent.hslToRgb(var42, var38.saturation, var43);
															}

															var42 = 0;
															if (var41 != -2) {
																var42 = Rasterizer3D.Rasterizer3D_colorPalette[class1.method20(var41, 96)];
															}

															if (var38.secondaryRgb != -1) {
																var43 = var38.secondaryHue + Tiles.field539 & 255;
																int var44 = var38.secondaryLightness + Tiles.field540;
																if (var44 < 0) {
																	var44 = 0;
																} else if (var44 > 255) {
																	var44 = 255;
																}

																var41 = WorldMapEvent.hslToRgb(var43, var38.secondarySaturation, var44);
																var42 = Rasterizer3D.Rasterizer3D_colorPalette[class1.method20(var41, 96)];
															}

															var66.addTile(var5, var14, var53, var36, var74, var39, var25, var26, var27, var28, VarcInt.method4555(var33, var29), VarcInt.method4555(var33, var30), VarcInt.method4555(var33, var59), VarcInt.method4555(var33, var32), class1.method20(var40, var29), class1.method20(var40, var30), class1.method20(var40, var59), class1.method20(var40, var32), var60, var42);
														}
													}
												}
											}
										}
									}

									for (var14 = 1; var14 < 103; ++var14) {
										for (var15 = 1; var15 < 103; ++var15) {
											if ((Tiles.Tiles_renderFlags[var5][var15][var14] & 8) != 0) {
												var53 = 0;
											} else if (var5 > 0 && (Tiles.Tiles_renderFlags[1][var15][var14] & 2) != 0) {
												var53 = var5 - 1;
											} else {
												var53 = var5;
											}

											var66.setTileMinPlane(var5, var15, var14, var53);
										}
									}

									TileItem.field1273[var5] = null;
									NPC.field1161[var5] = null;
									Tiles.field531[var5] = null;
									UserComparator2.field3859[var5] = null;
									class299.field3679[var5] = null;
								}

								var66.method3248(-50, -10, -50);

								for (var5 = 0; var5 < 104; ++var5) {
									for (var6 = 0; var6 < 104; ++var6) {
										if ((Tiles.Tiles_renderFlags[1][var5][var6] & 2) == 2) {
											var66.setLinkBelow(var5, var6);
										}
									}
								}

								var5 = 1;
								var6 = 2;
								var7 = 4;

								for (var69 = 0; var69 < 4; ++var69) {
									if (var69 > 0) {
										var5 <<= 3;
										var6 <<= 3;
										var7 <<= 3;
									}

									for (var54 = 0; var54 <= var69; ++var54) {
										for (var10 = 0; var10 <= 104; ++var10) {
											for (var11 = 0; var11 <= 104; ++var11) {
												short var73;
												if ((UserComparator10.field2000[var54][var11][var10] & var5) != 0) {
													var12 = var10;
													var71 = var10;
													var14 = var54;

													for (var15 = var54; var12 > 0 && (UserComparator10.field2000[var54][var11][var12 - 1] & var5) != 0; --var12) {
													}

													while (var71 < 104 && (UserComparator10.field2000[var54][var11][var71 + 1] & var5) != 0) {
														++var71;
													}

													label918:
													while (var14 > 0) {
														for (var16 = var12; var16 <= var71; ++var16) {
															if ((UserComparator10.field2000[var14 - 1][var11][var16] & var5) == 0) {
																break label918;
															}
														}

														--var14;
													}

													label907:
													while (var15 < var69) {
														for (var16 = var12; var16 <= var71; ++var16) {
															if ((UserComparator10.field2000[var15 + 1][var11][var16] & var5) == 0) {
																break label907;
															}
														}

														++var15;
													}

													var16 = (var71 - var12 + 1) * (var15 + 1 - var14);
													if (var16 >= 8) {
														var73 = 240;
														var18 = Tiles.Tiles_heights[var15][var11][var12] - var73;
														var19 = Tiles.Tiles_heights[var14][var11][var12];
														Scene.Scene_addOccluder(var69, 1, var11 * 128, var11 * 128, var12 * 128, var71 * 128 + 128, var18, var19);

														for (var53 = var14; var53 <= var15; ++var53) {
															for (var21 = var12; var21 <= var71; ++var21) {
																var10000 = UserComparator10.field2000[var53][var11];
																var10000[var21] &= ~var5;
															}
														}
													}
												}

												if ((UserComparator10.field2000[var54][var11][var10] & var6) != 0) {
													var12 = var11;
													var71 = var11;
													var14 = var54;

													for (var15 = var54; var12 > 0 && (UserComparator10.field2000[var54][var12 - 1][var10] & var6) != 0; --var12) {
													}

													while (var71 < 104 && (UserComparator10.field2000[var54][var71 + 1][var10] & var6) != 0) {
														++var71;
													}

													label971:
													while (var14 > 0) {
														for (var16 = var12; var16 <= var71; ++var16) {
															if ((UserComparator10.field2000[var14 - 1][var16][var10] & var6) == 0) {
																break label971;
															}
														}

														--var14;
													}

													label960:
													while (var15 < var69) {
														for (var16 = var12; var16 <= var71; ++var16) {
															if ((UserComparator10.field2000[var15 + 1][var16][var10] & var6) == 0) {
																break label960;
															}
														}

														++var15;
													}

													var16 = (var71 - var12 + 1) * (var15 + 1 - var14);
													if (var16 >= 8) {
														var73 = 240;
														var18 = Tiles.Tiles_heights[var15][var12][var10] - var73;
														var19 = Tiles.Tiles_heights[var14][var12][var10];
														Scene.Scene_addOccluder(var69, 2, var12 * 128, var71 * 128 + 128, var10 * 128, var10 * 128, var18, var19);

														for (var53 = var14; var53 <= var15; ++var53) {
															for (var21 = var12; var21 <= var71; ++var21) {
																var10000 = UserComparator10.field2000[var53][var21];
																var10000[var10] &= ~var6;
															}
														}
													}
												}

												if ((UserComparator10.field2000[var54][var11][var10] & var7) != 0) {
													var12 = var11;
													var71 = var11;
													var14 = var10;

													for (var15 = var10; var14 > 0 && (UserComparator10.field2000[var54][var11][var14 - 1] & var7) != 0; --var14) {
													}

													while (var15 < 104 && (UserComparator10.field2000[var54][var11][var15 + 1] & var7) != 0) {
														++var15;
													}

													label1024:
													while (var12 > 0) {
														for (var16 = var14; var16 <= var15; ++var16) {
															if ((UserComparator10.field2000[var54][var12 - 1][var16] & var7) == 0) {
																break label1024;
															}
														}

														--var12;
													}

													label1013:
													while (var71 < 104) {
														for (var16 = var14; var16 <= var15; ++var16) {
															if ((UserComparator10.field2000[var54][var71 + 1][var16] & var7) == 0) {
																break label1013;
															}
														}

														++var71;
													}

													if ((var71 - var12 + 1) * (var15 - var14 + 1) >= 4) {
														var16 = Tiles.Tiles_heights[var54][var12][var14];
														Scene.Scene_addOccluder(var69, 4, var12 * 128, var71 * 128 + 128, var14 * 128, var15 * 128 + 128, var16, var16);

														for (var17 = var12; var17 <= var71; ++var17) {
															for (var18 = var14; var18 <= var15; ++var18) {
																var10000 = UserComparator10.field2000[var54][var17];
																var10000[var18] &= ~var7;
															}
														}
													}
												}
											}
										}
									}
								}

								GrandExchangeOfferAgeComparator.method243(true);
								var5 = Tiles.Tiles_minPlane;
								if (var5 > GrandExchangeOfferUnitPriceComparator.Client_plane) {
									var5 = GrandExchangeOfferUnitPriceComparator.Client_plane;
								}

								if (var5 < GrandExchangeOfferUnitPriceComparator.Client_plane - 1) {
									var5 = GrandExchangeOfferUnitPriceComparator.Client_plane - 1;
								}

								if (isLowDetail) {
									ModeWhere.scene.init(Tiles.Tiles_minPlane);
								} else {
									ModeWhere.scene.init(0);
								}

								for (var6 = 0; var6 < 104; ++var6) {
									for (var7 = 0; var7 < 104; ++var7) {
										class41.updateItemPile(var6, var7);
									}
								}

								FriendSystem.playPcmPlayers();

								for (PendingSpawn var77 = (PendingSpawn)pendingSpawns.last(); var77 != null; var77 = (PendingSpawn)pendingSpawns.previous()) {
									if (var77.hitpoints == -1) {
										var77.delay = 0;
										JagexCache.method3619(var77);
									} else {
										var77.remove();
									}
								}

								ObjectComposition.ObjectDefinition_cachedModelData.clear();
								PacketBufferNode var78;
								if (ByteArrayPool.client.hasFrame()) {
									var78 = class4.getPacketBufferNode(ClientPacket.field2330, packetWriter.isaacCipher);
									var78.packetBuffer.writeInt(1057001181);
									packetWriter.addNode(var78);
								}

								if (!isInInstance) {
									var6 = (GrandExchangeEvent.field78 - 6) / 8;
									var7 = (GrandExchangeEvent.field78 + 6) / 8;
									var69 = (AbstractWorldMapData.field198 - 6) / 8;
									var54 = (AbstractWorldMapData.field198 + 6) / 8;

									for (var10 = var6 - 1; var10 <= var7 + 1; ++var10) {
										for (var11 = var69 - 1; var11 <= var54 + 1; ++var11) {
											if (var10 < var6 || var10 > var7 || var11 < var69 || var11 > var54) {
												Varcs.archive5.loadRegionFromName("m" + var10 + "_" + var11);
												Varcs.archive5.loadRegionFromName("l" + var10 + "_" + var11);
											}
										}
									}
								}

								BuddyRankComparator.updateGameState(30);
								FriendSystem.playPcmPlayers();
								TileItem.field1273 = null;
								NPC.field1161 = null;
								Tiles.field531 = null;
								UserComparator2.field3859 = null;
								UserComparator10.field2000 = null;
								class299.field3679 = null;
								UserComparator10.field1999 = null;
								GrandExchangeOfferOwnWorldComparator.Tiles_hue = null;
								class238.Tiles_saturation = null;
								ItemLayer.Tiles_lightness = null;
								class248.Tiles_hueMultiplier = null;
								class1.field1 = null;
								var78 = class4.getPacketBufferNode(ClientPacket.field2319, packetWriter.isaacCipher);
								packetWriter.addNode(var78);
								WorldMapLabel.method519();
							}
						}
					}
				} else {
					Canvas.doCycleTitle(this);
				}

				if (gameState == 30) {
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) {
					this.doCycleLoggedOut();
				}

				return;
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "-1812204618"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = GrandExchangeOfferTotalQuantityComparator.method174();
		if (var2 && field916 && class195.pcmPlayer0 != null) {
			class195.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field879 != 0L && Nameable.currentTimeMillis() > field879) {
			class277.setWindowedMode(UrlRequester.getWindowedMode());
		}

		int var3;
		if (var1) {
			for (var3 = 0; var3 < 100; ++var3) {
				field834[var3] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			class60.drawTitle(ReflectionCheck.fontBold12, DevicePcmPlayerProvider.fontPlain11, WorldMapCacheName.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class60.drawTitle(ReflectionCheck.fontBold12, DevicePcmPlayerProvider.fontPlain11, WorldMapCacheName.fontPlain12);
			} else if (gameState == 25) {
				if (field722 == 1) {
					if (field734 > field735) {
						field735 = field734;
					}

					var3 = (field735 * 50 - field734 * 50) / field735;
					AbstractWorldMapData.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else if (field722 == 2) {
					if (field848 > field737) {
						field737 = field848;
					}

					var3 = (field737 * 50 - field848 * 50) / field737 + 50;
					AbstractWorldMapData.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else {
					AbstractWorldMapData.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				AbstractWorldMapData.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				AbstractWorldMapData.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class60.drawTitle(ReflectionCheck.fontBold12, DevicePcmPlayerProvider.fontPlain11, WorldMapCacheName.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				if (field758[var3]) {
					class22.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]);
					field758[var3] = false;
				}
			}
		} else if (gameState > 0) {
			class22.rasterProvider.drawFull(0, 0);

			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				field758[var3] = false;
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "118"
	)
	@Export("kill0")
	protected final void kill0() {
		if (FriendSystem.varcs.hasUnwrittenChanges()) {
			FriendSystem.varcs.write();
		}

		if (class204.mouseRecorder != null) {
			class204.mouseRecorder.isRunning = false;
		}

		class204.mouseRecorder = null;
		packetWriter.close();
		if (KeyHandler.KeyHandler_instance != null) {
			synchronized(KeyHandler.KeyHandler_instance) {
				KeyHandler.KeyHandler_instance = null;
			}
		}

		NPC.method2146();
		class8.mouseWheel = null;
		if (class195.pcmPlayer0 != null) {
			class195.pcmPlayer0.shutdown();
		}

		if (class23.pcmPlayer1 != null) {
			class23.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) {
			NetCache.NetCache_socket.close();
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3176 != 0) {
				ArchiveDiskActionHandler.field3176 = 1;

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
				} catch (InterruptedException var4) {
				}
			}
		}

		if (class52.urlRequester != null) {
			class52.urlRequester.close();
			class52.urlRequester = null;
		}

		InterfaceParent.method1270();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-51"
	)
	protected final void vmethod1384() {
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 20; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						switch(var1) {
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0;
						case 2:
						case 11:
						case 13:
						case 16:
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
							FontName.clientLanguage = Language.method3800(Integer.parseInt(var2));
							break;
						case 7:
							int var4 = Integer.parseInt(var2);
							GameBuild[] var5 = new GameBuild[]{GameBuild.RC, GameBuild.BUILDLIVE, GameBuild.LIVE, GameBuild.WIP};
							GameBuild[] var6 = var5;
							int var7 = 0;

							GameBuild var3;
							while (true) {
								if (var7 >= var6.length) {
									var3 = null;
									break;
								}

								GameBuild var8 = var6[var7];
								if (var4 == var8.buildId) {
									var3 = var8;
									break;
								}

								++var7;
							}

							ChatChannel.field1334 = var3;
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							WorldMapRegion.field281 = var2;
							break;
						case 10:
							GrandExchangeOfferWorldComparator.field58 = (StudioGame)class195.findEnumerated(TileItem.method2237(), Integer.parseInt(var2));
							if (StudioGame.oldscape == GrandExchangeOfferWorldComparator.field58) {
								UserComparator4.loginType = LoginType.oldscape;
							} else {
								UserComparator4.loginType = LoginType.field4061;
							}
							break;
						case 12:
							worldId = Integer.parseInt(var2);
							break;
						case 14:
							TextureProvider.field1561 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							PcmPlayer.field1436 = var2;
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				UserComparator6.worldHost = this.getCodeBase().getHost();
				String var9 = ChatChannel.field1334.name;
				byte var10 = 0;

				try {
					MusicPatchPcmStream.method4041("oldschool", var9, var10, 21);
				} catch (Exception var11) {
					PacketWriter.RunException_sendStackTrace((String)null, var11);
				}

				ByteArrayPool.client = this;
				NetFileRequest.clientType = clientType;
				if (field686 == -1) {
					field686 = 0;
				}

				this.startThread(765, 503, 192);
			}
		} catch (RuntimeException var12) {
			throw Login.newRunException(var12, "client.init(" + ')');
		}
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "627377805"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = Occluder.method3411();
			if (!var1) {
				this.doCycleJs5Connect();
			}

		}
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-55"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) {
			this.error("js5crc");
			gameState = 1000;
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					gameState = 1000;
					return;
				}

				field794 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}

			if (--field794 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						UserComparator10.js5SocketTask = GameEngine.taskHandler.newSocketTask(UserComparator6.worldHost, class41.port3);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (UserComparator10.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (UserComparator10.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						if (useBufferedSocket) {
							Socket var2 = (Socket)UserComparator10.js5SocketTask.result;
							BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000);
							KeyHandler.js5Socket = var1;
						} else {
							KeyHandler.js5Socket = new NetSocket((Socket)UserComparator10.js5SocketTask.result, GameEngine.taskHandler, 5000);
						}

						Buffer var11 = new Buffer(5);
						var11.writeByte(15);
						var11.writeInt(192);
						KeyHandler.js5Socket.write(var11.array, 0, 5);
						++js5ConnectState;
						field696 = Nameable.currentTimeMillis();
					}

					if (js5ConnectState == 3) {
						if (KeyHandler.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) {
							int var5 = KeyHandler.js5Socket.readUnsignedByte();
							if (var5 != 0) {
								this.js5Error(var5);
								return;
							}

							++js5ConnectState;
						} else if (Nameable.currentTimeMillis() - field696 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						AbstractSocket var12 = KeyHandler.js5Socket;
						boolean var6 = gameState > 20;
						if (NetCache.NetCache_socket != null) {
							try {
								NetCache.NetCache_socket.close();
							} catch (Exception var9) {
							}

							NetCache.NetCache_socket = null;
						}

						NetCache.NetCache_socket = var12;
						WorldMapSection0.method323(var6);
						NetCache.NetCache_responseHeaderBuffer.offset = 0;
						NetCache.NetCache_currentResponse = null;
						NetCache.NetCache_responseArchiveBuffer = null;
						NetCache.field3190 = 0;

						while (true) {
							NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
							if (var3 == null) {
								while (true) {
									var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
									if (var3 == null) {
										if (NetCache.field3207 != 0) {
											try {
												Buffer var13 = new Buffer(4);
												var13.writeByte(4);
												var13.writeByte(NetCache.field3207);
												var13.writeShort(0);
												NetCache.NetCache_socket.write(var13.array, 0, 4);
											} catch (IOException var8) {
												try {
													NetCache.NetCache_socket.close();
												} catch (Exception var7) {
												}

												++NetCache.NetCache_ioExceptions;
												NetCache.NetCache_socket = null;
											}
										}

										NetCache.NetCache_loadTime = 0;
										JagexCache.field2081 = Nameable.currentTimeMillis();
										UserComparator10.js5SocketTask = null;
										KeyHandler.js5Socket = null;
										js5ConnectState = 0;
										js5Errors = 0;
										return;
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var3);
									NetCache.NetCache_pendingWrites.put(var3, var3.key);
									++NetCache.NetCache_pendingWritesCount;
									--NetCache.NetCache_pendingResponsesCount;
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var3, var3.key);
							++NetCache.NetCache_pendingPriorityWritesCount;
							--NetCache.NetCache_pendingPriorityResponsesCount;
						}
					}
				} catch (IOException var10) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1036771448"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		UserComparator10.js5SocketTask = null;
		KeyHandler.js5Socket = null;
		js5ConnectState = 0;
		if (Coord.port1 == class41.port3) {
			class41.port3 = Coord.port2;
		} else {
			class41.port3 = Coord.port1;
		}

		++js5Errors;
		if (js5Errors < 2 || var1 != 7 && var1 != 9) {
			if (js5Errors >= 2 && var1 == 6) {
				this.error("js5connect_outofdate");
				gameState = 1000;
			} else if (js5Errors >= 4) {
				if (gameState <= 5) {
					this.error("js5connect");
					gameState = 1000;
				} else {
					field794 = 3000;
				}
			}
		} else if (gameState <= 5) {
			this.error("js5connect_full");
			gameState = 1000;
		} else {
			field794 = 3000;
		}

	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-89707600"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (class195.secureRandom == null && (secureRandomFuture.isDone() || field947 > 250)) {
					class195.secureRandom = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (class195.secureRandom != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					UserComparator5.socketTask = null;
					field730 = false;
					field947 = 0;
					loginState = 1;
				}
			}

			if (loginState == 1) {
				if (UserComparator5.socketTask == null) {
					UserComparator5.socketTask = GameEngine.taskHandler.newSocketTask(UserComparator6.worldHost, class41.port3);
				}

				if (UserComparator5.socketTask.status == 2) {
					throw new IOException();
				}

				if (UserComparator5.socketTask.status == 1) {
					if (useBufferedSocket) {
						Socket var4 = (Socket)UserComparator5.socketTask.result;
						BufferedNetSocket var3 = new BufferedNetSocket(var4, 40000, 5000);
						var1 = var3;
					} else {
						var1 = new NetSocket((Socket)UserComparator5.socketTask.result, GameEngine.taskHandler, 5000);
					}

					packetWriter.setSocket((AbstractSocket)var1);
					UserComparator5.socketTask = null;
					loginState = 2;
				}
			}

			PacketBufferNode var22;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var22 = class206.method3853();
				var22.packetBuffer.writeByte(LoginPacket.field2340.id);
				packetWriter.addNode(var22);
				packetWriter.flush();
				var2.offset = 0;
				loginState = 3;
			}

			boolean var12;
			int var13;
			if (loginState == 3) {
				if (class195.pcmPlayer0 != null) {
					class195.pcmPlayer0.method2562();
				}

				if (class23.pcmPlayer1 != null) {
					class23.pcmPlayer1.method2562();
				}

				var12 = true;
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) {
					var12 = false;
				}

				if (var12) {
					var13 = ((AbstractSocket)var1).readUnsignedByte();
					if (class195.pcmPlayer0 != null) {
						class195.pcmPlayer0.method2562();
					}

					if (class23.pcmPlayer1 != null) {
						class23.pcmPlayer1.method2562();
					}

					if (var13 != 0) {
						WorldMapData_0.getLoginError(var13);
						return;
					}

					var2.offset = 0;
					loginState = 4;
				}
			}

			int var37;
			if (loginState == 4) {
				if (var2.offset < 8) {
					var37 = ((AbstractSocket)var1).available();
					if (var37 > 8 - var2.offset) {
						var37 = 8 - var2.offset;
					}

					if (var37 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset, var37);
						var2.offset += var37;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					VerticalAlignment.field3222 = var2.readLong();
					loginState = 5;
				}
			}

			int var7;
			int var9;
			int var14;
			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var23 = new PacketBuffer(500);
				int[] var25 = new int[]{class195.secureRandom.nextInt(), class195.secureRandom.nextInt(), class195.secureRandom.nextInt(), class195.secureRandom.nextInt()};
				var23.offset = 0;
				var23.writeByte(1);
				var23.writeInt(var25[0]);
				var23.writeInt(var25[1]);
				var23.writeInt(var25[2]);
				var23.writeInt(var25[3]);
				var23.writeLong(VerticalAlignment.field3222);
				int var10;
				if (gameState == 40) {
					var23.writeInt(GrandExchangeEvent.field77[0]);
					var23.writeInt(GrandExchangeEvent.field77[1]);
					var23.writeInt(GrandExchangeEvent.field77[2]);
					var23.writeInt(GrandExchangeEvent.field77[3]);
				} else {
					var23.writeByte(field717.rsOrdinal());
					switch(field717.field2032) {
					case 0:
					case 3:
						var23.writeMedium(class169.field2035);
						++var23.offset;
						break;
					case 1:
						var23.offset += 4;
						break;
					case 2:
						LinkedHashMap var6 = GrandExchangeOfferAgeComparator.clientPreferences.parameters;
						String var8 = Login.Login_username;
						var9 = var8.length();
						var10 = 0;

						for (int var11 = 0; var11 < var9; ++var11) {
							var10 = (var10 << 5) - var10 + var8.charAt(var11);
						}

						var23.writeInt((Integer)var6.get(var10));
					}

					var23.writeByte(class323.field3849.rsOrdinal());
					var23.writeStringCp1252NullTerminated(Login.Login_password);
				}

				var23.encryptRsa(class92.field1198, class92.field1197);
				GrandExchangeEvent.field77 = var25;
				PacketBufferNode var5 = class206.method3853();
				var5.packetBuffer.offset = 0;
				if (gameState == 40) {
					var5.packetBuffer.writeByte(LoginPacket.field2341.id);
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field2339.id);
				}

				var5.packetBuffer.writeShort(0);
				var14 = var5.packetBuffer.offset;
				var5.packetBuffer.writeInt(192);
				var5.packetBuffer.writeInt(1);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeByte(field686);
				var5.packetBuffer.writeBytes(var23.array, 0, var23.offset);
				var7 = var5.packetBuffer.offset;
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var5.packetBuffer.writeShort(ItemContainer.canvasWidth);
				var5.packetBuffer.writeShort(HealthBar.canvasHeight);
				Language.method3801(var5.packetBuffer);
				var5.packetBuffer.writeStringCp1252NullTerminated(WorldMapRegion.field281);
				var5.packetBuffer.writeInt(TextureProvider.field1561);
				Buffer var35 = new Buffer(Skills.platformInfo.size());
				Skills.platformInfo.write(var35);
				var5.packetBuffer.writeBytes(var35.array, 0, var35.array.length);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeInt(0);
				var5.packetBuffer.writeInt(Username.archive4.hash);
				var5.packetBuffer.writeInt(class1.archive15.hash);
				var5.packetBuffer.writeInt(FaceNormal.archive3.hash);
				var5.packetBuffer.method5684(Tiles.archive20.hash);
				var5.packetBuffer.writeInt(class281.archive10.hash);
				var5.packetBuffer.method5684(MenuAction.archive0.hash);
				var5.packetBuffer.method5682(class236.archive7.hash);
				var5.packetBuffer.method5683(AbstractByteArrayCopier.archive11.hash);
				var5.packetBuffer.method5682(AbstractByteArrayCopier.archive14.hash);
				var5.packetBuffer.method5682(GrandExchangeOffer.archive8.hash);
				var5.packetBuffer.method5683(ViewportMouse.archive12.hash);
				var5.packetBuffer.method5683(ModelData0.archive18.hash);
				var5.packetBuffer.method5682(class8.archive13.hash);
				var5.packetBuffer.writeInt(ApproximateRouteStrategy.archive6.hash);
				var5.packetBuffer.writeInt(class60.archive19.hash);
				var5.packetBuffer.writeInt(class23.archive17.hash);
				var5.packetBuffer.method5683(WorldMapManager.archive1.hash);
				var5.packetBuffer.method5682(0);
				var5.packetBuffer.writeInt(WorldMapSection3.archive2.hash);
				var5.packetBuffer.method5682(WorldMapData_1.archive9.hash);
				var5.packetBuffer.method5684(Varcs.archive5.hash);
				var5.packetBuffer.xteaEncrypt(var25, var7, var5.packetBuffer.offset);
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var14);
				packetWriter.addNode(var5);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var25);
				int[] var15 = new int[4];

				for (var10 = 0; var10 < 4; ++var10) {
					var15[var10] = var25[var10] + 50;
				}

				var2.newIsaacCipher(var15);
				loginState = 6;
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
				var37 = ((AbstractSocket)var1).readUnsignedByte();
				if (var37 == 21 && gameState == 20) {
					loginState = 12;
				} else if (var37 == 2) {
					loginState = 14;
				} else if (var37 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					loginState = 19;
				} else if (var37 == 64) {
					loginState = 10;
				} else if (var37 == 23 && field715 < 1) {
					++field715;
					loginState = 0;
				} else if (var37 == 29) {
					loginState = 17;
				} else {
					if (var37 != 69) {
						WorldMapData_0.getLoginError(var37);
						return;
					}

					loginState = 7;
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				class58.field445 = var2.readUnsignedShort();
				loginState = 8;
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= class58.field445) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, class58.field445);
				class7[] var24 = new class7[]{class7.field26};
				class7 var26 = var24[var2.readUnsignedByte()];

				try {
					class12 var29 = ServerPacket.method3742(var26);
					this.field721 = new class9(var2, var29);
					loginState = 9;
				} catch (Exception var20) {
					WorldMapData_0.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field721.method120()) {
				this.field720 = this.field721.method122();
				this.field721.method121();
				this.field721 = null;
				if (this.field720 == null) {
					WorldMapData_0.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var22 = class206.method3853();
				var22.packetBuffer.writeByte(LoginPacket.field2342.id);
				var22.packetBuffer.writeShort(this.field720.offset);
				var22.packetBuffer.method5713(this.field720);
				packetWriter.addNode(var22);
				packetWriter.flush();
				this.field720 = null;
				loginState = 6;
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
				ScriptFrame.field552 = ((AbstractSocket)var1).readUnsignedByte();
				loginState = 11;
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= ScriptFrame.field552) {
				((AbstractSocket)var1).read(var2.array, 0, ScriptFrame.field552);
				var2.offset = 0;
				loginState = 6;
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
				field716 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				loginState = 13;
			}

			if (loginState == 13) {
				field947 = 0;
				GrandExchangeOfferNameComparator.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field716 / 60 + " seconds.");
				if (--field716 <= 0) {
					loginState = 0;
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
					SpotAnimationDefinition.field3282 = ((AbstractSocket)var1).readUnsignedByte();
					loginState = 15;
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= SpotAnimationDefinition.field3282) {
					var12 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var38 = false;
					if (var12) {
						var13 = var2.readByteIsaac() << 24;
						var13 |= var2.readByteIsaac() << 16;
						var13 |= var2.readByteIsaac() << 8;
						var13 |= var2.readByteIsaac();
						String var34 = Login.Login_username;
						var7 = var34.length();
						int var16 = 0;
						var9 = 0;

						while (true) {
							if (var9 >= var7) {
								if (GrandExchangeOfferAgeComparator.clientPreferences.parameters.size() >= 10 && !GrandExchangeOfferAgeComparator.clientPreferences.parameters.containsKey(var16)) {
									Iterator var36 = GrandExchangeOfferAgeComparator.clientPreferences.parameters.entrySet().iterator();
									var36.next();
									var36.remove();
								}

								GrandExchangeOfferAgeComparator.clientPreferences.parameters.put(var16, var13);
								break;
							}

							var16 = (var16 << 5) - var16 + var34.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) {
						GrandExchangeOfferAgeComparator.clientPreferences.rememberedUsername = Login.Login_username;
					} else {
						GrandExchangeOfferAgeComparator.clientPreferences.rememberedUsername = null;
					}

					Tile.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field799 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var32 = ArchiveDiskActionHandler.ServerPacket_values();
					var14 = var2.readSmartByteShortIsaac();
					if (var14 < 0 || var14 >= var32.length) {
						throw new IOException(var14 + " " + var2.offset);
					}

					packetWriter.serverPacket = var32[var14];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						Client var18 = ByteArrayPool.client;
						JSObject.getWindow(var18).call("zap", (Object[])null);
					} catch (Throwable var19) {
					}

					loginState = 16;
				}

				if (loginState != 16) {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						KitDefinition.field3297 = var2.readUnsignedShort();
						loginState = 18;
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= KitDefinition.field3297) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, KitDefinition.field3297);
						var2.offset = 0;
						String var30 = var2.readStringCp1252NullTerminated();
						String var31 = var2.readStringCp1252NullTerminated();
						String var33 = var2.readStringCp1252NullTerminated();
						GrandExchangeOfferNameComparator.setLoginResponseString(var30, var31, var33);
						BuddyRankComparator.updateGameState(10);
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
							var37 = packetWriter.serverPacketLength;
							timer.method5139();
							Language.method3791();
							TileItem.updatePlayer(var2);
							if (var37 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field947;
						if (field947 > 2000) {
							if (field715 < 1) {
								if (Coord.port1 == class41.port3) {
									class41.port3 = Coord.port2;
								} else {
									class41.port3 = Coord.port1;
								}

								++field715;
								loginState = 0;
							} else {
								WorldMapData_0.getLoginError(-3);
							}
						}
					}
				} else {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method5137();
						mouseLastLastPressedTimeMillis = 1L;
						class204.mouseRecorder.index = 0;
						class8.hasFocus = true;
						hadFocus = true;
						field905 = -1L;
						class105.reflectionChecks = new IterableNodeDeque();
						packetWriter.clearBuffer();
						packetWriter.packetBuffer.offset = 0;
						packetWriter.serverPacket = null;
						packetWriter.field1348 = null;
						packetWriter.field1339 = null;
						packetWriter.field1350 = null;
						packetWriter.serverPacketLength = 0;
						packetWriter.field1337 = 0;
						rebootTimer = 0;
						logoutTimer = 0;
						hintArrowType = 0;
						AbstractWorldMapData.method375();
						class228.method4246(0);
						UrlRequest.method3436();
						isItemSelected = 0;
						isSpellSelected = false;
						soundEffectCount = 0;
						camAngleY = 0;
						oculusOrbState = 0;
						ModelData0.field1895 = null;
						minimapState = 0;
						field906 = -1;
						destinationX = 0;
						destinationY = 0;
						playerAttackOption = AttackOption.AttackOption_hidden;
						npcAttackOption = AttackOption.AttackOption_hidden;
						npcCount = 0;
						class89.method2163();

						for (var37 = 0; var37 < 2048; ++var37) {
							players[var37] = null;
						}

						for (var37 = 0; var37 < 32768; ++var37) {
							npcs[var37] = null;
						}

						combatTargetPlayerIndex = -1;
						projectiles.clear();
						graphicsObjects.clear();

						for (var37 = 0; var37 < 4; ++var37) {
							for (var13 = 0; var13 < 104; ++var13) {
								for (int var17 = 0; var17 < 104; ++var17) {
									groundItems[var37][var13][var17] = null;
								}
							}
						}

						pendingSpawns = new NodeDeque();
						WorldMapLabelSize.friendSystem.clear();

						for (var37 = 0; var37 < VarpDefinition.VarpDefinition_fileCount; ++var37) {
							VarpDefinition var28 = PendingSpawn.VarpDefinition_get(var37);
							if (var28 != null) {
								Varps.Varps_temp[var37] = 0;
								Varps.Varps_main[var37] = 0;
							}
						}

						FriendSystem.varcs.clearTransient();
						followerIndex = -1;
						if (rootInterface != -1) {
							class206.method3852(rootInterface);
						}

						for (InterfaceParent var27 = (InterfaceParent)interfaceParents.first(); var27 != null; var27 = (InterfaceParent)interfaceParents.next()) {
							Player.closeInterface(var27, true);
						}

						rootInterface = -1;
						interfaceParents = new NodeHashTable(8);
						meslayerContinueWidget = null;
						AbstractWorldMapData.method375();
						playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

						for (var37 = 0; var37 < 8; ++var37) {
							playerMenuActions[var37] = null;
							playerOptionsPriorities[var37] = false;
						}

						class4.method78();
						isLoading = true;

						for (var37 = 0; var37 < 100; ++var37) {
							field834[var37] = true;
						}

						Actor.method1855();
						DevicePcmPlayerProvider.clanChat = null;

						for (var37 = 0; var37 < 8; ++var37) {
							grandExchangeOffers[var37] = new GrandExchangeOffer();
						}

						WorldMapDecoration.grandExchangeEvents = null;
						TileItem.updatePlayer(var2);
						GrandExchangeEvent.field78 = -1;
						PacketWriter.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				}
			}
		} catch (IOException var21) {
			if (field715 < 1) {
				if (class41.port3 == Coord.port1) {
					class41.port3 = Coord.port2;
				} else {
					class41.port3 = Coord.port1;
				}

				++field715;
				loginState = 0;
			} else {
				WorldMapData_0.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-769999345"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (field730) {
			field730 = false;
			FloorDecoration.method2986();
		} else {
			if (!isMenuOpen) {
				WorldMapSection2.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1616(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				int var2;
				PacketBufferNode var14;
				while (class206.method3851()) {
					var14 = class4.getPacketBufferNode(ClientPacket.field2303, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					ItemLayer.performReflectionCheck(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				}

				if (timer.field3606) {
					var14 = class4.getPacketBufferNode(ClientPacket.field2287, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					timer.write(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
					timer.method5142();
				}

				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				synchronized(class204.mouseRecorder.lock) {
					if (!field772) {
						class204.mouseRecorder.index = 0;
					} else if (MouseHandler.MouseHandler_lastButton != 0 || class204.mouseRecorder.index >= 40) {
						PacketBufferNode var15 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;

						for (var7 = 0; var7 < class204.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) {
							var4 = var7;
							var8 = class204.mouseRecorder.ys[var7];
							if (var8 < -1) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}

							int var9 = class204.mouseRecorder.xs[var7];
							if (var9 < -1) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}

							if (var9 != field719 || var8 != field693) {
								if (var15 == null) {
									var15 = class4.getPacketBufferNode(ClientPacket.field2314, packetWriter.isaacCipher);
									var15.packetBuffer.writeByte(0);
									var3 = var15.packetBuffer.offset;
									PacketBuffer var10000 = var15.packetBuffer;
									var10000.offset += 2;
									var5 = 0;
									var6 = 0;
								}

								int var10;
								int var11;
								int var12;
								if (-1L != field694) {
									var10 = var9 - field719;
									var11 = var8 - field693;
									var12 = (int)((class204.mouseRecorder.millis[var7] - field694) / 20L);
									var5 = (int)((long)var5 + (class204.mouseRecorder.millis[var7] - field694) % 20L);
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}

								field719 = var9;
								field693 = var8;
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
									var10 += 32;
									var11 += 32;
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
									var10 += 128;
									var11 += 128;
									var15.packetBuffer.writeByte(var12 + 128);
									var15.packetBuffer.writeShort(var11 + (var10 << 8));
								} else if (var12 < 32) {
									var15.packetBuffer.writeByte(var12 + 192);
									if (var9 != -1 && var8 != -1) {
										var15.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344);
									if (var9 != -1 && var8 != -1) {
										var15.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6;
								field694 = class204.mouseRecorder.millis[var7];
							}
						}

						if (var15 != null) {
							var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var3);
							var7 = var15.packetBuffer.offset;
							var15.packetBuffer.offset = var3;
							var15.packetBuffer.writeByte(var5 / var6);
							var15.packetBuffer.writeByte(var5 % var6);
							var15.packetBuffer.offset = var7;
							packetWriter.addNode(var15);
						}

						if (var4 >= class204.mouseRecorder.index) {
							class204.mouseRecorder.index = 0;
						} else {
							MouseRecorder var38 = class204.mouseRecorder;
							var38.index -= var4;
							System.arraycopy(class204.mouseRecorder.xs, var4, class204.mouseRecorder.xs, 0, class204.mouseRecorder.index);
							System.arraycopy(class204.mouseRecorder.ys, var4, class204.mouseRecorder.ys, 0, class204.mouseRecorder.index);
							System.arraycopy(class204.mouseRecorder.millis, var4, class204.mouseRecorder.millis, 0, class204.mouseRecorder.index);
						}
					}
				}

				PacketBufferNode var18;
				if (MouseHandler.MouseHandler_lastButton == 1 || !MusicPatchNode.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
					if (var16 > 32767L) {
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
					var3 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 < 0) {
						var3 = 0;
					} else if (var3 > HealthBar.canvasHeight) {
						var3 = HealthBar.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX;
					if (var4 < 0) {
						var4 = 0;
					} else if (var4 > ItemContainer.canvasWidth) {
						var4 = ItemContainer.canvasWidth;
					}

					var5 = (int)var16;
					var18 = class4.getPacketBufferNode(ClientPacket.field2322, packetWriter.isaacCipher);
					var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
					var18.packetBuffer.writeShort(var4);
					var18.packetBuffer.writeShort(var3);
					packetWriter.addNode(var18);
				}

				if (KeyHandler.field427 > 0) {
					var14 = class4.getPacketBufferNode(ClientPacket.field2255, packetWriter.isaacCipher);
					var14.packetBuffer.writeShort(0);
					var2 = var14.packetBuffer.offset;
					long var19 = Nameable.currentTimeMillis();

					for (var5 = 0; var5 < KeyHandler.field427; ++var5) {
						long var21 = var19 - field905;
						if (var21 > 16777215L) {
							var21 = 16777215L;
						}

						field905 = var19;
						var14.packetBuffer.method5680((int)var21);
						var14.packetBuffer.method5664(KeyHandler.field430[var5]);
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				}

				if (field882 > 0) {
					--field882;
				}

				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
					field750 = true;
				}

				if (field750 && field882 <= 0) {
					field882 = 20;
					field750 = false;
					var14 = class4.getPacketBufferNode(ClientPacket.field2321, packetWriter.isaacCipher);
					var14.packetBuffer.method5674(camAngleX);
					var14.packetBuffer.method5673(camAngleY);
					packetWriter.addNode(var14);
				}

				if (class8.hasFocus && !hadFocus) {
					hadFocus = true;
					var14 = class4.getPacketBufferNode(ClientPacket.field2312, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(1);
					packetWriter.addNode(var14);
				}

				if (!class8.hasFocus && hadFocus) {
					hadFocus = false;
					var14 = class4.getPacketBufferNode(ClientPacket.field2312, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					packetWriter.addNode(var14);
				}

				if (KeyHandler.worldMap != null) {
					KeyHandler.worldMap.method6454();
				}

				class2.method30();
				if (field906 != GrandExchangeOfferUnitPriceComparator.Client_plane) {
					field906 = GrandExchangeOfferUnitPriceComparator.Client_plane;
					SoundCache.method2646(GrandExchangeOfferUnitPriceComparator.Client_plane);
				}

				if (gameState == 30) {
					FloorDecoration.method2988();
					ChatChannel.method2381();
					++packetWriter.field1337;
					if (packetWriter.field1337 > 750) {
						FloorDecoration.method2986();
					} else {
						class2.method41();

						for (var1 = 0; var1 < npcCount; ++var1) {
							var2 = npcIndices[var1];
							NPC var23 = npcs[var2];
							if (var23 != null) {
								class13.updateActorSequence(var23, var23.definition.size);
							}
						}

						ApproximateRouteStrategy.method1317();
						++field743;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 20;
							if (mouseCrossState * 400 >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (MouseHandler.field525 != null) {
							++field828;
							if (field828 >= 15) {
								GrandExchangeOfferOwnWorldComparator.invalidateWidget(MouseHandler.field525);
								MouseHandler.field525 = null;
							}
						}

						Widget var31 = GrandExchangeEvent.mousedOverWidgetIf1;
						Widget var32 = GrandExchangeOfferOwnWorldComparator.field677;
						GrandExchangeEvent.mousedOverWidgetIf1 = null;
						GrandExchangeOfferOwnWorldComparator.field677 = null;
						draggedOnWidget = null;
						field705 = false;
						field859 = false;
						field902 = 0;

						while (Clock.isKeyDown() && field902 < 128) {
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && SecureRandomCallable.field555 == 66) {
								String var33 = class234.method4262();
								ByteArrayPool.client.clipboardSetString(var33);
							} else if (oculusOrbState != 1 || WorldMapManager.field335 <= 0) {
								field904[field902] = SecureRandomCallable.field555;
								field903[field902] = WorldMapManager.field335;
								++field902;
							}
						}

						if (MilliClock.method3590() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) {
							var3 = PlayerType.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != PlayerType.localPlayer.plane) {
								class2.method42(PlayerType.localPlayer.pathX[0] + FloorDecoration.baseX * 64, PlayerType.localPlayer.pathY[0] + WorldMapData_0.baseY * 64, var3, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							DynamicObject.updateRootInterface(rootInterface, 0, 0, ItemContainer.canvasWidth, HealthBar.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var24;
							Widget var25;
							ScriptEvent var34;
							do {
								var34 = (ScriptEvent)field881.removeLast();
								if (var34 == null) {
									while (true) {
										do {
											var34 = (ScriptEvent)field939.removeLast();
											if (var34 == null) {
												while (true) {
													do {
														var34 = (ScriptEvent)scriptEvents.removeLast();
														if (var34 == null) {
															this.menu();
															if (KeyHandler.worldMap != null) {
																KeyHandler.worldMap.method6464(GrandExchangeOfferUnitPriceComparator.Client_plane, FloorDecoration.baseX * 64 + (PlayerType.localPlayer.x >> 7), WorldMapData_0.baseY * 64 + (PlayerType.localPlayer.y >> 7), false);
																KeyHandler.worldMap.loadCache();
															}

															if (clickedWidget != null) {
																this.method1405();
															}

															if (GameBuild.dragInventoryWidget != null) {
																GrandExchangeOfferOwnWorldComparator.invalidateWidget(GameBuild.dragInventoryWidget);
																++itemDragDuration;
																if (MouseHandler.MouseHandler_currentButton == 0) {
																	if (field830) {
																		if (GameBuild.dragInventoryWidget == class217.field2532 && dragItemSlotSource != dragItemSlotDestination) {
																			Widget var35 = GameBuild.dragInventoryWidget;
																			byte var29 = 0;
																			if (field846 == 1 && var35.contentType == 206) {
																				var29 = 1;
																			}

																			if (var35.itemIds[dragItemSlotDestination] <= 0) {
																				var29 = 0;
																			}

																			var6 = WorldMapData_0.getWidgetClickMask(var35);
																			boolean var30 = (var6 >> 29 & 1) != 0;
																			if (var30) {
																				var7 = dragItemSlotSource;
																				var8 = dragItemSlotDestination;
																				var35.itemIds[var8] = var35.itemIds[var7];
																				var35.itemQuantities[var8] = var35.itemQuantities[var7];
																				var35.itemIds[var7] = -1;
																				var35.itemQuantities[var7] = 0;
																			} else if (var29 == 1) {
																				var7 = dragItemSlotSource;
																				var8 = dragItemSlotDestination;

																				while (var8 != var7) {
																					if (var7 > var8) {
																						var35.swapItems(var7 - 1, var7);
																						--var7;
																					} else if (var7 < var8) {
																						var35.swapItems(var7 + 1, var7);
																						++var7;
																					}
																				}
																			} else {
																				var35.swapItems(dragItemSlotDestination, dragItemSlotSource);
																			}

																			PacketBufferNode var26 = class4.getPacketBufferNode(ClientPacket.field2267, packetWriter.isaacCipher);
																			var26.packetBuffer.writeShort(dragItemSlotDestination);
																			var26.packetBuffer.method5674(dragItemSlotSource);
																			var26.packetBuffer.writeByte(var29);
																			var26.packetBuffer.method5683(GameBuild.dragInventoryWidget.id);
																			packetWriter.addNode(var26);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX, draggedWidgetY);
																	} else if (menuOptionsCount > 0) {
																		var3 = draggedWidgetX;
																		var4 = draggedWidgetY;
																		MenuAction var36 = GrandExchangeOffer.tempMenuAction;
																		Calendar.menuAction(var36.param0, var36.param1, var36.opcode, var36.identifier, var36.action, var36.action, var3, var4);
																		GrandExchangeOffer.tempMenuAction = null;
																	}

																	field828 = 10;
																	MouseHandler.MouseHandler_lastButton = 0;
																	GameBuild.dragInventoryWidget = null;
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
																	field830 = true;
																}
															}

															if (Scene.method3256()) {
																var3 = Scene.Scene_selectedX;
																var4 = Scene.Scene_selectedY;
																PacketBufferNode var37 = class4.getPacketBufferNode(ClientPacket.field2260, packetWriter.isaacCipher);
																var37.packetBuffer.writeByte(5);
																var37.packetBuffer.method5674(FloorDecoration.baseX * 64 + var3);
																var37.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
																var37.packetBuffer.method5672(WorldMapData_0.baseY * 64 + var4);
																packetWriter.addNode(var37);
																Scene.method3253();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																mouseCrossColor = 1;
																mouseCrossState = 0;
																destinationX = var3;
																destinationY = var4;
															}

															if (var31 != GrandExchangeEvent.mousedOverWidgetIf1) {
																if (var31 != null) {
																	GrandExchangeOfferOwnWorldComparator.invalidateWidget(var31);
																}

																if (GrandExchangeEvent.mousedOverWidgetIf1 != null) {
																	GrandExchangeOfferOwnWorldComparator.invalidateWidget(GrandExchangeEvent.mousedOverWidgetIf1);
																}
															}

															if (var32 != GrandExchangeOfferOwnWorldComparator.field677 && field833 == field832) {
																if (var32 != null) {
																	GrandExchangeOfferOwnWorldComparator.invalidateWidget(var32);
																}

																if (GrandExchangeOfferOwnWorldComparator.field677 != null) {
																	GrandExchangeOfferOwnWorldComparator.invalidateWidget(GrandExchangeOfferOwnWorldComparator.field677);
																}
															}

															if (GrandExchangeOfferOwnWorldComparator.field677 != null) {
																if (field832 < field833) {
																	++field832;
																	if (field833 == field832) {
																		GrandExchangeOfferOwnWorldComparator.invalidateWidget(GrandExchangeOfferOwnWorldComparator.field677);
																	}
																}
															} else if (field832 > 0) {
																--field832;
															}

															InterfaceParent.method1269();
															if (isCameraLocked) {
																WorldMapIcon_1.method392();
															}

															for (var3 = 0; var3 < 5; ++var3) {
																int var10002 = field918[var3]++;
															}

															FriendSystem.varcs.tryWrite();
															var3 = ++MouseHandler.MouseHandler_idleCycles - 1;
															var5 = class236.method4264();
															if (var3 > 15000 && var5 > 15000) {
																logoutTimer = 250;
																class228.method4246(14500);
																var18 = class4.getPacketBufferNode(ClientPacket.field2271, packetWriter.isaacCipher);
																packetWriter.addNode(var18);
															}

															WorldMapLabelSize.friendSystem.processFriendUpdates();
															++packetWriter.pendingWrites;
															if (packetWriter.pendingWrites > 50) {
																var18 = class4.getPacketBufferNode(ClientPacket.field2247, packetWriter.isaacCipher);
																packetWriter.addNode(var18);
															}

															try {
																packetWriter.flush();
															} catch (IOException var27) {
																FloorDecoration.method2986();
															}

															return;
														}

														var24 = var34.widget;
														if (var24.childIndex < 0) {
															break;
														}

														var25 = UserComparator4.getWidget(var24.parentId);
													} while(var25 == null || var25.children == null || var24.childIndex >= var25.children.length || var24 != var25.children[var24.childIndex]);

													Renderable.runScriptEvent(var34);
												}
											}

											var24 = var34.widget;
											if (var24.childIndex < 0) {
												break;
											}

											var25 = UserComparator4.getWidget(var24.parentId);
										} while(var25 == null || var25.children == null || var24.childIndex >= var25.children.length || var24 != var25.children[var24.childIndex]);

										Renderable.runScriptEvent(var34);
									}
								}

								var24 = var34.widget;
								if (var24.childIndex < 0) {
									break;
								}

								var25 = UserComparator4.getWidget(var24.parentId);
							} while(var25 == null || var25.children == null || var24.childIndex >= var25.children.length || var24 != var25.children[var24.childIndex]);

							Renderable.runScriptEvent(var34);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-68"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = ItemContainer.canvasWidth;
		int var2 = HealthBar.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (GrandExchangeOfferAgeComparator.clientPreferences != null) {
			try {
				class56.method944(ByteArrayPool.client, "resize", new Object[]{UrlRequester.getWindowedMode()});
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1208840742"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) {
			var1 = rootInterface;
			if (ScriptFrame.loadInterface(var1)) {
				Frames.drawModelComponents(Widget.Widget_interfaceComponents[var1], -1);
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field834[var1]) {
				field758[var1] = true;
			}

			field745[var1] = field834[var1];
			field834[var1] = false;
		}

		field748 = cycle;
		viewportX = -1;
		viewportY = -1;
		class217.field2532 = null;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			FriendsChatManager.drawWidgets(rootInterface, 0, 0, ItemContainer.canvasWidth, HealthBar.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				class60.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				class60.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		int var2;
		int var3;
		int var4;
		int var6;
		int var7;
		int var8;
		if (!isMenuOpen) {
			if (viewportX != -1) {
				var1 = viewportX;
				var2 = viewportY;
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
					var3 = FileSystem.method3638();
					String var19;
					if (isItemSelected == 1 && menuOptionsCount < 2) {
						var19 = "Use" + " " + selectedItemName + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) {
						var19 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						String var5;
						if (var3 < 0) {
							var5 = "";
						} else if (menuTargets[var3].length() > 0) {
							var5 = menuActions[var3] + " " + menuTargets[var3];
						} else {
							var5 = menuActions[var3];
						}

						var19 = var5;
					}

					if (menuOptionsCount > 2) {
						var19 = var19 + colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					ReflectionCheck.fontBold12.drawRandomAlphaAndSpacing(var19, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			var1 = Coord.menuX;
			var2 = WorldMapArea.menuY;
			var3 = KeyHandler.menuWidth;
			var4 = ServerPacket.menuHeight;
			int var13 = 6116423;
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var13);
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
			ReflectionCheck.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var13, -1);
			var6 = MouseHandler.MouseHandler_x;
			var7 = MouseHandler.MouseHandler_y;

			int var9;
			int var10;
			for (var8 = 0; var8 < menuOptionsCount; ++var8) {
				var9 = (menuOptionsCount - 1 - var8) * 15 + var2 + 31;
				var10 = 16777215;
				if (var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) {
					var10 = 16776960;
				}

				Font var11 = ReflectionCheck.fontBold12;
				String var12;
				if (var8 < 0) {
					var12 = "";
				} else if (menuTargets[var8].length() > 0) {
					var12 = menuActions[var8] + " " + menuTargets[var8];
				} else {
					var12 = menuActions[var8];
				}

				var11.draw(var12, var1 + 3, var9, var10, 0);
			}

			var8 = Coord.menuX;
			var9 = WorldMapArea.menuY;
			var10 = KeyHandler.menuWidth;
			int var14 = ServerPacket.menuHeight;

			for (int var15 = 0; var15 < rootWidgetCount; ++var15) {
				if (rootWidgetWidths[var15] + rootWidgetXs[var15] > var8 && rootWidgetXs[var15] < var10 + var8 && rootWidgetHeights[var15] + rootWidgetYs[var15] > var9 && rootWidgetYs[var15] < var9 + var14) {
					field758[var15] = true;
				}
			}
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field745[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field758[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		var1 = GrandExchangeOfferUnitPriceComparator.Client_plane;
		var2 = PlayerType.localPlayer.x;
		var3 = PlayerType.localPlayer.y;
		var4 = field743;

		for (ObjectSound var20 = (ObjectSound)ObjectSound.objectSounds.last(); var20 != null; var20 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var20.soundEffectId != -1 || var20.soundEffectIds != null) {
				var6 = 0;
				if (var2 > var20.field1103 * 16384) {
					var6 += var2 - var20.field1103 * 16384;
				} else if (var2 < var20.x * 128) {
					var6 += var20.x * 128 - var2;
				}

				if (var3 > var20.field1112 * 128) {
					var6 += var3 - var20.field1112 * 128;
				} else if (var3 < var20.y * 128) {
					var6 += var20.y * 128 - var3;
				}

				if (var6 - 64 <= var20.field1104 && areaSoundEffectVolume != 0 && var1 == var20.plane) {
					var6 -= 64;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = (var20.field1104 - var6) * areaSoundEffectVolume / var20.field1104;
					Object var10000;
					if (var20.stream1 == null) {
						if (var20.soundEffectId >= 0) {
							var10000 = null;
							SoundEffect var16 = SoundEffect.readSoundEffect(Username.archive4, var20.soundEffectId, 0);
							if (var16 != null) {
								RawSound var17 = var16.toRawSound().resample(NetSocket.decimator);
								RawPcmStream var18 = RawPcmStream.createRawPcmStream(var17, 100, var7);
								var18.setNumLoops(-1);
								GrandExchangeEvents.pcmStreamMixer.addSubStream(var18);
								var20.stream1 = var18;
							}
						}
					} else {
						var20.stream1.method2677(var7);
					}

					if (var20.stream2 == null) {
						if (var20.soundEffectIds != null && (var20.field1108 -= var4) <= 0) {
							var8 = (int)(Math.random() * (double)var20.soundEffectIds.length);
							var10000 = null;
							SoundEffect var22 = SoundEffect.readSoundEffect(Username.archive4, var20.soundEffectIds[var8], 0);
							if (var22 != null) {
								RawSound var23 = var22.toRawSound().resample(NetSocket.decimator);
								RawPcmStream var21 = RawPcmStream.createRawPcmStream(var23, 100, var7);
								var21.setNumLoops(0);
								GrandExchangeEvents.pcmStreamMixer.addSubStream(var21);
								var20.stream2 = var21;
								var20.field1108 = var20.field1107 + (int)(Math.random() * (double)(var20.field1109 - var20.field1107));
							}
						}
					} else {
						var20.stream2.method2677(var7);
						if (!var20.stream2.hasNext()) {
							var20.stream2 = null;
						}
					}
				} else {
					if (var20.stream1 != null) {
						GrandExchangeEvents.pcmStreamMixer.removeSubStream(var20.stream1);
						var20.stream1 = null;
					}

					if (var20.stream2 != null) {
						GrandExchangeEvents.pcmStreamMixer.removeSubStream(var20.stream2);
						var20.stream2 = null;
					}
				}
			}
		}

		field743 = 0;
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		signature = "(Ldg;I)Z",
		garbageValue = "-1472094898"
	)
	final boolean method1616(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var17;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1340) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1337 = 0;
						var1.field1340 = false;
					}

					var3.offset = 0;
					if (var3.method5582()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1337 = 0;
					}

					var1.field1340 = true;
					ServerPacket[] var4 = ArchiveDiskActionHandler.ServerPacket_values();
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
				var1.field1337 = 0;
				timer.method5135();
				var1.field1350 = var1.field1339;
				var1.field1339 = var1.field1348;
				var1.field1348 = var1.serverPacket;
				int var16;
				InterfaceParent var41;
				if (ServerPacket.field2207 == var1.serverPacket) {
					var16 = var3.method5687();
					var5 = var3.readUnsignedShort();
					var6 = var3.method5650();
					var41 = (InterfaceParent)interfaceParents.get((long)var16);
					if (var41 != null) {
						Player.closeInterface(var41, var5 != var41.group);
					}

					ModelData0.method3381(var16, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2202 == var1.serverPacket) {
					for (var16 = 0; var16 < VarpDefinition.VarpDefinition_fileCount; ++var16) {
						VarpDefinition var51 = PendingSpawn.VarpDefinition_get(var16);
						if (var51 != null) {
							Varps.Varps_temp[var16] = 0;
							Varps.Varps_main[var16] = 0;
						}
					}

					ItemComposition.method4874();
					field868 += 32;
					var1.serverPacket = null;
					return true;
				}

				String var38;
				if (ServerPacket.field2157 == var1.serverPacket) {
					var38 = var3.readStringCp1252NullTerminated();
					var5 = var3.method5650();
					var6 = var3.method5650();
					if (var5 >= 1 && var5 <= 8) {
						if (var38.equalsIgnoreCase("null")) {
							var38 = null;
						}

						playerMenuActions[var5 - 1] = var38;
						playerOptionsPriorities[var5 - 1] = var6 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				long var18;
				long var20;
				if (ServerPacket.field2224 == var1.serverPacket) {
					var38 = var3.readStringCp1252NullTerminated();
					var18 = (long)var3.readUnsignedShort();
					var20 = (long)var3.readMedium();
					PlayerType var9 = (PlayerType)class195.findEnumerated(WorldMapLabelSize.PlayerType_values(), var3.readUnsignedByte());
					long var10 = var20 + (var18 << 32);
					boolean var12 = false;

					for (int var13 = 0; var13 < 100; ++var13) {
						if (var10 == field900[var13]) {
							var12 = true;
							break;
						}
					}

					if (WorldMapLabelSize.friendSystem.isIgnored(new Username(var38, UserComparator4.loginType))) {
						var12 = true;
					}

					if (!var12 && field795 == 0) {
						field900[field901] = var10;
						field901 = (field901 + 1) % 100;
						String var22 = AbstractFont.escapeBrackets(WorldMapSection0.method328(Tile.method3004(var3)));
						byte var44;
						if (var9.isPrivileged) {
							var44 = 7;
						} else {
							var44 = 3;
						}

						if (var9.modIcon != -1) {
							DevicePcmPlayerProvider.addGameMessage(var44, PrivateChatMode.method6034(var9.modIcon) + var38, var22);
						} else {
							DevicePcmPlayerProvider.addGameMessage(var44, var38, var22);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				int var8;
				int var24;
				int var25;
				int var52;
				if (ServerPacket.field2165 == var1.serverPacket) {
					isCameraLocked = true;
					MilliClock.field2048 = var3.readUnsignedByte() * 128;
					PcmPlayer.field1449 = var3.readUnsignedByte() * 128;
					AbstractRasterProvider.field3890 = var3.readUnsignedShort();
					WorldMapCacheName.field326 = var3.readUnsignedByte();
					class60.field452 = var3.readUnsignedByte();
					if (class60.field452 >= 100) {
						var16 = MilliClock.field2048 * 16384 + 64;
						var5 = PcmPlayer.field1449 * 16384 + 64;
						var6 = GrandExchangeOfferWorldComparator.getTileHeight(var16, var5, GrandExchangeOfferUnitPriceComparator.Client_plane) - AbstractRasterProvider.field3890;
						var52 = var16 - ItemContainer.cameraX;
						var8 = var6 - ChatChannel.cameraY;
						var24 = var5 - WorldMapManager.cameraZ;
						var25 = (int)Math.sqrt((double)(var52 * var52 + var24 * var24));
						World.cameraPitch = (int)(Math.atan2((double)var8, (double)var25) * 325.949D) & 2047;
						ViewportMouse.cameraYaw = (int)(Math.atan2((double)var52, (double)var24) * -325.949D) & 2047;
						if (World.cameraPitch < 128) {
							World.cameraPitch = 128;
						}

						if (World.cameraPitch > 383) {
							World.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2194 == var1.serverPacket) {
					publicChatMode = var3.method5619();
					tradeChatMode = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2153 == var1.serverPacket) {
					WorldMapAreaData.method790(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2145 == var1.serverPacket) {
					class39.privateChatMode = MouseRecorder.method1287(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2220 == var1.serverPacket) {
					var16 = var3.readInt();
					InterfaceParent var50 = (InterfaceParent)interfaceParents.get((long)var16);
					if (var50 != null) {
						Player.closeInterface(var50, true);
					}

					if (meslayerContinueWidget != null) {
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var47;
				if (ServerPacket.field2172 == var1.serverPacket) {
					var16 = var3.method5686();
					var47 = UserComparator4.getWidget(var16);

					for (var6 = 0; var6 < var47.itemIds.length; ++var6) {
						var47.itemIds[var6] = -1;
						var47.itemIds[var6] = 0;
					}

					GrandExchangeOfferOwnWorldComparator.invalidateWidget(var47);
					var1.serverPacket = null;
					return true;
				}

				Widget var7;
				if (ServerPacket.field2188 == var1.serverPacket) {
					var16 = var3.method5797();
					if (var16 == 65535) {
						var16 = -1;
					}

					var5 = var3.method5685();
					var6 = var3.readInt();
					var7 = UserComparator4.getWidget(var6);
					ItemComposition var54;
					if (!var7.isIf3) {
						if (var16 == -1) {
							var7.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var54 = AbstractWorldMapData.ItemDefinition_get(var16);
						var7.modelType = 4;
						var7.modelId = var16;
						var7.modelAngleX = var54.xan2d;
						var7.modelAngleY = var54.yan2d;
						var7.modelZoom = var54.zoom2d * 100 / var5;
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var7);
					} else {
						var7.itemId = var16;
						var7.itemQuantity = var5;
						var54 = AbstractWorldMapData.ItemDefinition_get(var16);
						var7.modelAngleX = var54.xan2d;
						var7.modelAngleY = var54.yan2d;
						var7.modelAngleZ = var54.zan2d;
						var7.modelOffsetX = var54.offsetX2d;
						var7.modelOffsetY = var54.offsetY2d;
						var7.modelZoom = var54.zoom2d;
						if (var54.isStackable == 1) {
							var7.itemQuantityMode = 1;
						} else {
							var7.itemQuantityMode = 2;
						}

						if (var7.field2678 > 0) {
							var7.modelZoom = var7.modelZoom * 32 / var7.field2678;
						} else if (var7.rawWidth > 0) {
							var7.modelZoom = var7.modelZoom * 32 / var7.rawWidth;
						}

						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var7);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2166 == var1.serverPacket) {
					if (rootInterface != -1) {
						WorldMapAreaData.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2218 == var1.serverPacket) {
					var16 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var52 = var3.readUnsignedByte();
					field926[var16] = true;
					field927[var16] = var5;
					field928[var16] = var6;
					field898[var16] = var52;
					field918[var16] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2162 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.readInt();
					var6 = class238.getGcDuration();
					PacketBufferNode var43 = class4.getPacketBufferNode(ClientPacket.field2296, packetWriter.isaacCipher);
					var43.packetBuffer.writeByte(var6);
					var43.packetBuffer.writeIntME(GameEngine.fps);
					var43.packetBuffer.method5684(var16);
					var43.packetBuffer.writeInt(var5);
					packetWriter.addNode(var43);
					var1.serverPacket = null;
					return true;
				}

				Widget var27;
				if (ServerPacket.field2185 == var1.serverPacket) {
					var16 = var3.method5685();
					var17 = var3.readStringCp1252NullTerminated();
					var27 = UserComparator4.getWidget(var16);
					if (!var17.equals(var27.text)) {
						var27.text = var17;
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var27);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2204 == var1.serverPacket) {
					WorldMapLabelSize.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					class52.FriendSystem_invalidateIgnoreds();
					field874 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2184 == var1.serverPacket) {
					WorldMapEvent.method865(class194.field2351);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2216 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				long var29;
				if (ServerPacket.field2195 == var1.serverPacket) {
					var16 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						FontName.Widget_resetModelFrames(rootInterface);
						ScriptFrame.runWidgetOnLoadListener(rootInterface);

						for (var52 = 0; var52 < 100; ++var52) {
							field834[var52] = true;
						}
					}

					InterfaceParent var57;
					for (; var6-- > 0; var57.field596 = true) {
						var52 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var24 = var3.readUnsignedByte();
						var57 = (InterfaceParent)interfaceParents.get((long)var52);
						if (var57 != null && var8 != var57.group) {
							Player.closeInterface(var57, true);
							var57 = null;
						}

						if (var57 == null) {
							var57 = ModelData0.method3381(var52, var8, var24);
						}
					}

					for (var41 = (InterfaceParent)interfaceParents.first(); var41 != null; var41 = (InterfaceParent)interfaceParents.next()) {
						if (var41.field596) {
							var41.field596 = false;
						} else {
							Player.closeInterface(var41, true);
						}
					}

					widgetClickMasks = new NodeHashTable(512);

					while (var3.offset < var16) {
						var52 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var24 = var3.readUnsignedShort();
						var25 = var3.readInt();

						for (int var11 = var8; var11 <= var24; ++var11) {
							var29 = (long)var11 + ((long)var52 << 32);
							widgetClickMasks.put(new IntegerNode(var25), var29);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2144 == var1.serverPacket) {
					var16 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var16] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var16] = new GrandExchangeOffer(var3, false);
					}

					field885 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2221 == var1.serverPacket) {
					var16 = var3.readUnsignedShort();
					byte var45 = var3.method5669();
					Varps.Varps_temp[var16] = var45;
					if (Varps.Varps_main[var16] != var45) {
						Varps.Varps_main[var16] = var45;
					}

					class23.changeGameOptions(var16);
					field867[++field868 - 1 & 31] = var16;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2182 == var1.serverPacket) {
					class39.updatePlayers(var3, var1.serverPacketLength);
					class197.method3783();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2179 == var1.serverPacket) {
					ItemComposition.method4874();
					var16 = var3.readUnsignedByte();
					var5 = var3.method5650();
					var6 = var3.readInt();
					experience[var5] = var6;
					currentLevels[var5] = var16;
					levels[var5] = 1;

					for (var52 = 0; var52 < 98; ++var52) {
						if (var6 >= Skills.Skills_experienceTable[var52]) {
							levels[var5] = var52 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				long var31;
				if (ServerPacket.field2196 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.method5675();
					if (var6 == 65535) {
						var6 = -1;
					}

					var52 = var3.readInt();

					for (var8 = var6; var8 <= var5; ++var8) {
						var31 = ((long)var52 << 32) + (long)var8;
						Node var60 = widgetClickMasks.get(var31);
						if (var60 != null) {
							var60.remove();
						}

						widgetClickMasks.put(new IntegerNode(var16), var31);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2167 == var1.serverPacket) {
					ItemComposition.method4874();
					runEnergy = var3.readUnsignedByte();
					field878 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2150 == var1.serverPacket) {
					isCameraLocked = true;
					WorldMapSection2.field225 = var3.readUnsignedByte() * 128;
					WorldMapLabelSize.field152 = var3.readUnsignedByte() * 16384;
					SpriteMask.field2542 = var3.readUnsignedShort();
					Player.field674 = var3.readUnsignedByte();
					ReflectionCheck.field1364 = var3.readUnsignedByte();
					if (ReflectionCheck.field1364 >= 100) {
						ItemContainer.cameraX = WorldMapSection2.field225 * 16384 + 64;
						WorldMapManager.cameraZ = WorldMapLabelSize.field152 * 128 + 64;
						ChatChannel.cameraY = GrandExchangeOfferWorldComparator.getTileHeight(ItemContainer.cameraX, WorldMapManager.cameraZ, GrandExchangeOfferUnitPriceComparator.Client_plane) - SpriteMask.field2542;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2189 == var1.serverPacket) {
					if (DevicePcmPlayerProvider.clanChat != null) {
						DevicePcmPlayerProvider.clanChat.method5371(var3);
					}

					ClientPacket.method3744();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2168 == var1.serverPacket) {
					GrandExchangeEvents.field64 = var3.readUnsignedByte();
					GameEngine.field466 = var3.method5650();

					while (var3.offset < var1.serverPacketLength) {
						var16 = var3.readUnsignedByte();
						class194 var49 = GrandExchangeOffer.method208()[var16];
						WorldMapEvent.method865(var49);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2177 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var16 < -70000) {
						var5 += 32768;
					}

					if (var16 >= 0) {
						var27 = UserComparator4.getWidget(var16);
					} else {
						var27 = null;
					}

					for (; var3.offset < var1.serverPacketLength; GrandExchangeEvents.itemContainerSetItem(var5, var52, var8 - 1, var24)) {
						var52 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var24 = 0;
						if (var8 != 0) {
							var24 = var3.readUnsignedByte();
							if (var24 == 255) {
								var24 = var3.readInt();
							}
						}

						if (var27 != null && var52 >= 0 && var52 < var27.itemIds.length) {
							var27.itemIds[var52] = var8;
							var27.itemQuantities[var52] = var24;
						}
					}

					if (var27 != null) {
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var27);
					}

					ItemComposition.method4874();
					changedItemContainers[++field941 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				Widget var53;
				if (ServerPacket.field2219 == var1.serverPacket) {
					var16 = var3.method5797();
					var5 = var3.method5686();
					var6 = var3.method5659();
					var52 = var3.method5797();
					var53 = UserComparator4.getWidget(var5);
					if (var6 != var53.modelAngleX || var16 != var53.modelAngleY || var52 != var53.modelZoom) {
						var53.modelAngleX = var6;
						var53.modelAngleY = var16;
						var53.modelZoom = var52;
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var53);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2227 == var1.serverPacket) {
					WorldMapEvent.method865(class194.field2348);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2193 == var1.serverPacket) {
					ItemComposition.method4874();
					weight = var3.readShort();
					field878 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2143 == var1.serverPacket) {
					var16 = var3.method5797();
					var5 = var3.readInt();
					var6 = var16 >> 10 & 31;
					var52 = var16 >> 5 & 31;
					var8 = var16 & 31;
					var24 = (var52 << 11) + (var6 << 19) + (var8 << 3);
					Widget var28 = UserComparator4.getWidget(var5);
					if (var24 != var28.color) {
						var28.color = var24;
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2158 == var1.serverPacket) {
					PacketWriter.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2159 == var1.serverPacket) {
					GrandExchangeEvents.field64 = var3.method5668();
					GameEngine.field466 = var3.method5650();
					var1.serverPacket = null;
					return true;
				}

				boolean var55;
				if (ServerPacket.field2170 == var1.serverPacket) {
					var55 = var3.readUnsignedByte() == 1;
					var5 = var3.method5685();
					var27 = UserComparator4.getWidget(var5);
					if (var55 != var27.isHidden) {
						var27.isHidden = var55;
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var27);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2214 == var1.serverPacket) {
					var38 = var3.readStringCp1252NullTerminated();
					var18 = var3.readLong();
					var20 = (long)var3.readUnsignedShort();
					var31 = (long)var3.readMedium();
					PlayerType var33 = (PlayerType)class195.findEnumerated(WorldMapLabelSize.PlayerType_values(), var3.readUnsignedByte());
					var29 = (var20 << 32) + var31;
					boolean var14 = false;

					for (int var15 = 0; var15 < 100; ++var15) {
						if (field900[var15] == var29) {
							var14 = true;
							break;
						}
					}

					if (var33.isUser && WorldMapLabelSize.friendSystem.isIgnored(new Username(var38, UserComparator4.loginType))) {
						var14 = true;
					}

					if (!var14 && field795 == 0) {
						field900[field901] = var29;
						field901 = (field901 + 1) % 100;
						String var34 = AbstractFont.escapeBrackets(WorldMapSection0.method328(Tile.method3004(var3)));
						if (var33.modIcon != -1) {
							class3.addChatMessage(9, PrivateChatMode.method6034(var33.modIcon) + var38, var34, class69.base37DecodeLong(var18));
						} else {
							class3.addChatMessage(9, var38, var34, class69.base37DecodeLong(var18));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2210 == var1.serverPacket) {
					class89.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2156 == var1.serverPacket) {
					var55 = var3.readBoolean();
					if (var55) {
						if (ModelData0.field1895 == null) {
							ModelData0.field1895 = new class248();
						}
					} else {
						ModelData0.field1895 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2171 == var1.serverPacket) {
					var16 = var3.method5659();
					var5 = var3.method5685();
					Varps.Varps_temp[var16] = var5;
					if (Varps.Varps_main[var16] != var5) {
						Varps.Varps_main[var16] = var5;
					}

					class23.changeGameOptions(var16);
					field867[++field868 - 1 & 31] = var16;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2190 == var1.serverPacket) {
					var16 = var3.method5686();
					var5 = var3.method5679();
					var27 = UserComparator4.getWidget(var16);
					if (var5 != var27.sequenceId || var5 == -1) {
						var27.sequenceId = var5;
						var27.modelFrame = 0;
						var27.modelFrameCycle = 0;
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var27);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2180 == var1.serverPacket) {
					MusicPatch.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2183 == var1.serverPacket) {
					var55 = var3.readUnsignedByte() == 1;
					if (var55) {
						class58.field444 = Nameable.currentTimeMillis() - var3.readLong();
						WorldMapDecoration.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						WorldMapDecoration.grandExchangeEvents = null;
					}

					field852 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2222 == var1.serverPacket) {
					var38 = var3.readStringCp1252NullTerminated();
					Object[] var48 = new Object[var38.length() + 1];

					for (var6 = var38.length() - 1; var6 >= 0; --var6) {
						if (var38.charAt(var6) == 's') {
							var48[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var48[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var48[0] = new Integer(var3.readInt());
					ScriptEvent var59 = new ScriptEvent();
					var59.args = var48;
					Renderable.runScriptEvent(var59);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2142 == var1.serverPacket) {
					var16 = var3.method5685();
					var47 = UserComparator4.getWidget(var16);
					var47.modelType = 3;
					var47.modelId = PlayerType.localPlayer.appearance.getChatHeadId();
					GrandExchangeOfferOwnWorldComparator.invalidateWidget(var47);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2175 == var1.serverPacket) {
					WorldMapEvent.method865(class194.field2355);
					var1.serverPacket = null;
					return true;
				}

				String var56;
				if (ServerPacket.field2164 == var1.serverPacket) {
					byte[] var40 = new byte[var1.serverPacketLength];
					var3.method5584(var40, 0, var40.length);
					Buffer var46 = new Buffer(var40);
					var56 = var46.readStringCp1252NullTerminated();
					Skeleton.openURL(var56, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2176 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var16 < -70000) {
						var5 += 32768;
					}

					if (var16 >= 0) {
						var27 = UserComparator4.getWidget(var16);
					} else {
						var27 = null;
					}

					if (var27 != null) {
						for (var52 = 0; var52 < var27.itemIds.length; ++var52) {
							var27.itemIds[var52] = 0;
							var27.itemQuantities[var52] = 0;
						}
					}

					class3.clearItemContainer(var5);
					var52 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var52; ++var8) {
						var24 = var3.method5650();
						if (var24 == 255) {
							var24 = var3.readInt();
						}

						var25 = var3.readUnsignedShort();
						if (var27 != null && var8 < var27.itemIds.length) {
							var27.itemIds[var8] = var25;
							var27.itemQuantities[var8] = var24;
						}

						GrandExchangeEvents.itemContainerSetItem(var5, var8, var25 - 1, var24);
					}

					if (var27 != null) {
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var27);
					}

					ItemComposition.method4874();
					changedItemContainers[++field941 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2223 == var1.serverPacket) {
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

				if (ServerPacket.field2230 == var1.serverPacket) {
					WorldMapEvent.method865(class194.field2349);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2152 == var1.serverPacket) {
					var16 = var3.method5675();
					if (var16 == 65535) {
						var16 = -1;
					}

					Messages.playSong(var16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2178 == var1.serverPacket) {
					var16 = var3.method5675();
					if (var16 == 65535) {
						var16 = -1;
					}

					var5 = var3.method5852();
					Projectile.playSoundJingle(var16, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2206 == var1.serverPacket) {
					var16 = var3.method5686();
					var5 = var3.method5685();
					InterfaceParent var58 = (InterfaceParent)interfaceParents.get((long)var5);
					var41 = (InterfaceParent)interfaceParents.get((long)var16);
					if (var41 != null) {
						Player.closeInterface(var41, var58 == null || var41.group != var58.group);
					}

					if (var58 != null) {
						var58.remove();
						interfaceParents.put(var58, (long)var16);
					}

					var53 = UserComparator4.getWidget(var5);
					if (var53 != null) {
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var53);
					}

					var53 = UserComparator4.getWidget(var16);
					if (var53 != null) {
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var53);
						UserComparator9.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var53.id >>> 16], var53, true);
					}

					if (rootInterface != -1) {
						WorldMapAreaData.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2211 == var1.serverPacket) {
					var16 = var3.readUnsignedShort();
					rootInterface = var16;
					this.resizeRoot(false);
					FontName.Widget_resetModelFrames(var16);
					ScriptFrame.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field834[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2199 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						UserComparator6.method3565(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2174 == var1.serverPacket) {
					WorldMapEvent.method865(class194.field2356);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2191 == var1.serverPacket) {
					WorldMapEvent.method865(class194.field2352);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2181 == var1.serverPacket) {
					var16 = var3.readUShortSmart();
					boolean var42 = var3.readUnsignedByte() == 1;
					var56 = "";
					boolean var23 = false;
					if (var42) {
						var56 = var3.readStringCp1252NullTerminated();
						if (WorldMapLabelSize.friendSystem.isIgnored(new Username(var56, UserComparator4.loginType))) {
							var23 = true;
						}
					}

					String var26 = var3.readStringCp1252NullTerminated();
					if (!var23) {
						DevicePcmPlayerProvider.addGameMessage(var16, var56, var26);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2217 == var1.serverPacket) {
					WorldMapEvent.method865(class194.field2357);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2225 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.method5797();
					var27 = UserComparator4.getWidget(var16);
					if (var27.modelType != 1 || var5 != var27.modelId) {
						var27.modelType = 1;
						var27.modelId = var5;
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var27);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2154 == var1.serverPacket) {
					for (var16 = 0; var16 < Varps.Varps_main.length; ++var16) {
						if (Varps.Varps_main[var16] != Varps.Varps_temp[var16]) {
							Varps.Varps_main[var16] = Varps.Varps_temp[var16];
							class23.changeGameOptions(var16);
							field867[++field868 - 1 & 31] = var16;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2203 == var1.serverPacket) {
					WorldMapEvent.method865(class194.field2359);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2163 == var1.serverPacket) {
					if (var1.serverPacketLength == 0) {
						DevicePcmPlayerProvider.clanChat = null;
					} else {
						if (DevicePcmPlayerProvider.clanChat == null) {
							DevicePcmPlayerProvider.clanChat = new FriendsChatManager(UserComparator4.loginType, ByteArrayPool.client);
						}

						DevicePcmPlayerProvider.clanChat.readUpdate(var3);
					}

					ClientPacket.method3744();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2160 == var1.serverPacket) {
					rebootTimer = var3.method5659() * 30;
					field878 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2205 == var1.serverPacket) {
					WorldMapEvent.method865(class194.field2353);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2213 == var1.serverPacket) {
					var16 = var3.readInt();
					if (var16 != field763) {
						field763 = var16;
						ScriptEvent.method1282();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2197 == var1.serverPacket) {
					var16 = var3.method5659();
					var5 = var3.readInt();
					var6 = var3.method5659();
					var7 = UserComparator4.getWidget(var5);
					var7.field2734 = var16 + (var6 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2200 == var1.serverPacket) {
					World var39 = new World();
					var39.host = var3.readStringCp1252NullTerminated();
					var39.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var39.properties = var5;
					BuddyRankComparator.updateGameState(45);
					var2.close();
					var2 = null;
					AbstractByteArrayCopier.changeWorld(var39);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2212 == var1.serverPacket) {
					var38 = var3.readStringCp1252NullTerminated();
					var17 = AbstractFont.escapeBrackets(WorldMapSection0.method328(Tile.method3004(var3)));
					DevicePcmPlayerProvider.addGameMessage(6, var38, var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2151 == var1.serverPacket) {
					WorldMapLabelSize.friendSystem.method1957();
					field874 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2209 == var1.serverPacket) {
					PacketWriter.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2161 == var1.serverPacket) {
					isCameraLocked = false;

					for (var16 = 0; var16 < 5; ++var16) {
						field926[var16] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2201 == var1.serverPacket) {
					var16 = var3.method5678();
					var5 = var3.readShort();
					var6 = var3.method5685();
					var7 = UserComparator4.getWidget(var6);
					if (var16 != var7.rawX || var5 != var7.rawY || var7.xAlignment != 0 || var7.yAlignment != 0) {
						var7.rawX = var16;
						var7.rawY = var5;
						var7.xAlignment = 0;
						var7.yAlignment = 0;
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var7);
						this.alignWidget(var7);
						if (var7.type == 0) {
							UserComparator9.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var6 >> 16], var7, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2173 == var1.serverPacket) {
					WorldMapLabelSize.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field874 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2198 == var1.serverPacket) {
					for (var16 = 0; var16 < players.length; ++var16) {
						if (players[var16] != null) {
							players[var16].sequence = -1;
						}
					}

					for (var16 = 0; var16 < npcs.length; ++var16) {
						if (npcs[var16] != null) {
							npcs[var16].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2187 == var1.serverPacket) {
					var16 = var3.readUnsignedByte();
					WorldMapArea.forceDisconnect(var16);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2148 == var1.serverPacket) {
					WorldMapData_1.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2149 == var1.serverPacket) {
					WorldMapEvent.method865(class194.field2354);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2169 == var1.serverPacket) {
					MusicPatch.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2186 == var1.serverPacket) {
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

				if (ServerPacket.field2215 == var1.serverPacket) {
					var16 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					KitDefinition.queueSoundEffect(var16, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2226 == var1.serverPacket) {
					var16 = var3.method5675();
					WorldMapData_1.method817(var16);
					changedItemContainers[++field941 - 1 & 31] = var16 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2192 == var1.serverPacket) {
					var16 = var3.readUnsignedByte();
					Decimator.method2668(var16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2155 == var1.serverPacket) {
					GameEngine.field466 = var3.method5650();
					GrandExchangeEvents.field64 = var3.readUnsignedByte();

					for (var16 = GameEngine.field466; var16 < GameEngine.field466 + 8; ++var16) {
						for (var5 = GrandExchangeEvents.field64; var5 < GrandExchangeEvents.field64 + 8; ++var5) {
							if (groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var16][var5] != null) {
								groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var16][var5] = null;
								class41.updateItemPile(var16, var5);
							}
						}
					}

					for (PendingSpawn var37 = (PendingSpawn)pendingSpawns.last(); var37 != null; var37 = (PendingSpawn)pendingSpawns.previous()) {
						if (var37.x >= GameEngine.field466 && var37.x < GameEngine.field466 + 8 && var37.y >= GrandExchangeEvents.field64 && var37.y < GrandExchangeEvents.field64 + 8 && var37.plane == GrandExchangeOfferUnitPriceComparator.Client_plane) {
							var37.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2146 == var1.serverPacket) {
					var16 = var3.readUnsignedShort();
					var5 = var3.method5686();
					var27 = UserComparator4.getWidget(var5);
					if (var27 != null && var27.type == 0) {
						if (var16 > var27.scrollHeight - var27.height) {
							var16 = var27.scrollHeight - var27.height;
						}

						if (var16 < 0) {
							var16 = 0;
						}

						if (var16 != var27.scrollY) {
							var27.scrollY = var16;
							GrandExchangeOfferOwnWorldComparator.invalidateWidget(var27);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2147 == var1.serverPacket) {
					var16 = var3.readUnsignedShort();
					var5 = var3.readInt();
					var27 = UserComparator4.getWidget(var5);
					if (var27.modelType != 2 || var16 != var27.modelId) {
						var27.modelType = 2;
						var27.modelId = var16;
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var27);
					}

					var1.serverPacket = null;
					return true;
				}

				PacketWriter.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1339 != null ? var1.field1339.id : -1) + "," + (var1.field1350 != null ? var1.field1350.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				class89.logOut();
			} catch (IOException var35) {
				FloorDecoration.method2986();
			} catch (Exception var36) {
				var17 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1339 != null ? var1.field1339.id : -1) + "," + (var1.field1350 != null ? var1.field1350.id : -1) + "," + var1.serverPacketLength + "," + (PlayerType.localPlayer.pathX[0] + FloorDecoration.baseX * 64) + "," + (PlayerType.localPlayer.pathY[0] + WorldMapData_0.baseY * 64) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var17 = var17 + var3.array[var6] + ",";
				}

				PacketWriter.RunException_sendStackTrace(var17, var36);
				class89.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1619365796"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false;

		int var2;
		int var5;
		while (!var1) {
			var1 = true;

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) {
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) {
					String var3 = menuTargets[var2];
					menuTargets[var2] = menuTargets[var2 + 1];
					menuTargets[var2 + 1] = var3;
					String var4 = menuActions[var2];
					menuActions[var2] = menuActions[var2 + 1];
					menuActions[var2 + 1] = var4;
					var5 = menuOpcodes[var2];
					menuOpcodes[var2] = menuOpcodes[var2 + 1];
					menuOpcodes[var2 + 1] = var5;
					var5 = menuArguments1[var2];
					menuArguments1[var2] = menuArguments1[var2 + 1];
					menuArguments1[var2 + 1] = var5;
					var5 = menuArguments2[var2];
					menuArguments2[var2] = menuArguments2[var2 + 1];
					menuArguments2[var2 + 1] = var5;
					var5 = menuIdentifiers[var2];
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1];
					menuIdentifiers[var2 + 1] = var5;
					boolean var6 = menuShiftClick[var2];
					menuShiftClick[var2] = menuShiftClick[var2 + 1];
					menuShiftClick[var2 + 1] = var6;
					var1 = false;
				}
			}
		}

		if (GameBuild.dragInventoryWidget == null) {
			if (clickedWidget == null) {
				int var10;
				int var14;
				int var20;
				label318: {
					int var17 = MouseHandler.MouseHandler_lastButton;
					int var8;
					int var13;
					if (isMenuOpen) {
						int var18;
						int var19;
						if (var17 != 1 && (MusicPatchNode.mouseCam || var17 != 4)) {
							var2 = MouseHandler.MouseHandler_x;
							var13 = MouseHandler.MouseHandler_y;
							if (var2 < Coord.menuX - 10 || var2 > KeyHandler.menuWidth + Coord.menuX + 10 || var13 < WorldMapArea.menuY - 10 || var13 > ServerPacket.menuHeight + WorldMapArea.menuY + 10) {
								isMenuOpen = false;
								var14 = Coord.menuX;
								var5 = WorldMapArea.menuY;
								var18 = KeyHandler.menuWidth;
								var19 = ServerPacket.menuHeight;

								for (var8 = 0; var8 < rootWidgetCount; ++var8) {
									if (rootWidgetWidths[var8] + rootWidgetXs[var8] > var14 && rootWidgetXs[var8] < var18 + var14 && rootWidgetHeights[var8] + rootWidgetYs[var8] > var5 && rootWidgetYs[var8] < var5 + var19) {
										field834[var8] = true;
									}
								}
							}
						}

						if (var17 == 1 || !MusicPatchNode.mouseCam && var17 == 4) {
							var2 = Coord.menuX;
							var13 = WorldMapArea.menuY;
							var14 = KeyHandler.menuWidth;
							var5 = MouseHandler.MouseHandler_lastPressedX;
							var18 = MouseHandler.MouseHandler_lastPressedY;
							var19 = -1;

							for (var8 = 0; var8 < menuOptionsCount; ++var8) {
								var20 = var13 + (menuOptionsCount - 1 - var8) * 15 + 31;
								if (var5 > var2 && var5 < var14 + var2 && var18 > var20 - 13 && var18 < var20 + 3) {
									var19 = var8;
								}
							}

							if (var19 != -1) {
								EnumComposition.method4721(var19);
							}

							isMenuOpen = false;
							var8 = Coord.menuX;
							var20 = WorldMapArea.menuY;
							var10 = KeyHandler.menuWidth;
							int var11 = ServerPacket.menuHeight;

							for (int var12 = 0; var12 < rootWidgetCount; ++var12) {
								if (rootWidgetWidths[var12] + rootWidgetXs[var12] > var8 && rootWidgetXs[var12] < var10 + var8 && rootWidgetHeights[var12] + rootWidgetYs[var12] > var20 && rootWidgetYs[var12] < var11 + var20) {
									field834[var12] = true;
								}
							}
						}
					} else {
						var2 = FileSystem.method3638();
						if ((var17 == 1 || !MusicPatchNode.mouseCam && var17 == 4) && var2 >= 0) {
							var13 = menuOpcodes[var2];
							if (var13 == 39 || var13 == 40 || var13 == 41 || var13 == 42 || var13 == 43 || var13 == 33 || var13 == 34 || var13 == 35 || var13 == 36 || var13 == 37 || var13 == 38 || var13 == 1005) {
								var14 = menuArguments1[var2];
								var5 = menuArguments2[var2];
								Widget var15 = UserComparator4.getWidget(var5);
								var8 = WorldMapData_0.getWidgetClickMask(var15);
								boolean var7 = (var8 >> 28 & 1) != 0;
								if (var7) {
									break label318;
								}

								var10 = WorldMapData_0.getWidgetClickMask(var15);
								boolean var9 = (var10 >> 29 & 1) != 0;
								if (var9) {
									break label318;
								}
							}
						}

						if ((var17 == 1 || !MusicPatchNode.mouseCam && var17 == 4) && this.shouldLeftClickOpenMenu()) {
							var17 = 2;
						}

						if ((var17 == 1 || !MusicPatchNode.mouseCam && var17 == 4) && menuOptionsCount > 0) {
							EnumComposition.method4721(var2);
						}

						if (var17 == 2 && menuOptionsCount > 0) {
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}

					return;
				}

				if (GameBuild.dragInventoryWidget != null && !field830 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
					var20 = draggedWidgetX;
					var10 = draggedWidgetY;
					MenuAction var16 = GrandExchangeOffer.tempMenuAction;
					Calendar.menuAction(var16.param0, var16.param1, var16.opcode, var16.identifier, var16.action, var16.action, var20, var10);
					GrandExchangeOffer.tempMenuAction = null;
				}

				field830 = false;
				itemDragDuration = 0;
				if (GameBuild.dragInventoryWidget != null) {
					GrandExchangeOfferOwnWorldComparator.invalidateWidget(GameBuild.dragInventoryWidget);
				}

				GameBuild.dragInventoryWidget = UserComparator4.getWidget(var5);
				dragItemSlotSource = var14;
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
				if (var2 >= 0) {
					AbstractByteArrayCopier.method4087(var2);
				}

				GrandExchangeOfferOwnWorldComparator.invalidateWidget(GameBuild.dragInventoryWidget);
			}
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "279427498"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = FileSystem.method3638();
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || WorldMapSectionType.method336(var1)) && !menuShiftClick[var1];
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "-4"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		KitDefinition.method4634(var1, var2);
		ModeWhere.scene.menuOpen(GrandExchangeOfferUnitPriceComparator.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		signature = "(ZB)V",
		garbageValue = "4"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		Fonts.method5463(rootInterface, ItemContainer.canvasWidth, HealthBar.canvasHeight, var1);
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		signature = "(Lht;B)V",
		garbageValue = "121"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : UserComparator4.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = ItemContainer.canvasWidth;
			var4 = HealthBar.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		WorldMapIcon_0.alignWidgetSize(var1, var3, var4, false);
		FileSystem.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1835347071"
	)
	final void method1405() {
		GrandExchangeOfferOwnWorldComparator.invalidateWidget(clickedWidget);
		++GrandExchangeEvent.widgetDragDuration;
		if (field705 && field859) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field860) {
				var1 = field860;
			}

			if (var1 + clickedWidget.width > field860 + clickedWidgetParent.width) {
				var1 = field860 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field861) {
				var2 = field861;
			}

			if (var2 + clickedWidget.height > field861 + clickedWidgetParent.height) {
				var2 = field861 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field931;
			int var4 = var2 - field701;
			int var5 = clickedWidget.dragZoneSize;
			if (GrandExchangeEvent.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field860 + clickedWidgetParent.scrollX;
			int var7 = var2 - field861 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				Renderable.runScriptEvent(var8);
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
						Renderable.runScriptEvent(var8);
					}

					if (draggedOnWidget != null) {
						Widget var9 = clickedWidget;
						int var11 = WorldMapData_0.getWidgetClickMask(var9);
						int var10 = var11 >> 17 & 7;
						int var12 = var10;
						Widget var17;
						if (var10 == 0) {
							var17 = null;
						} else {
							int var13 = 0;

							while (true) {
								if (var13 >= var12) {
									var17 = var9;
									break;
								}

								var9 = UserComparator4.getWidget(var9.parentId);
								if (var9 == null) {
									var17 = null;
									break;
								}

								++var13;
							}
						}

						if (var17 != null) {
							PacketBufferNode var18 = class4.getPacketBufferNode(ClientPacket.field2315, packetWriter.isaacCipher);
							var18.packetBuffer.method5682(draggedOnWidget.id);
							var18.packetBuffer.writeShort(draggedOnWidget.itemId);
							var18.packetBuffer.method5673(clickedWidget.itemId);
							var18.packetBuffer.method5673(clickedWidget.childIndex);
							var18.packetBuffer.method5674(draggedOnWidget.childIndex);
							var18.packetBuffer.method5684(clickedWidget.id);
							packetWriter.addNode(var18);
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(widgetClickX + field931, field701 + widgetClickY);
				} else if (menuOptionsCount > 0) {
					int var15 = widgetClickX + field931;
					int var16 = widgetClickY + field701;
					MenuAction var14 = GrandExchangeOffer.tempMenuAction;
					Calendar.menuAction(var14.param0, var14.param1, var14.opcode, var14.identifier, var14.action, var14.action, var15, var16);
					GrandExchangeOffer.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		} else {
			if (GrandExchangeEvent.widgetDragDuration > 1) {
				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		signature = "(B)Lkm;",
		garbageValue = "104"
	)
	@Export("username")
	public Username username() {
		return PlayerType.localPlayer != null ? PlayerType.localPlayer.username : null;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IB)Ljava/lang/String;",
		garbageValue = "89"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IIIIB)V",
		garbageValue = "3"
	)
	static final void method1838(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) {
			for (int var5 = var0; var5 <= var0 + var2; ++var5) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					class299.field3679[0][var5][var4] = 127;
					if (var0 == var5 && var5 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var5 == var0 + var2 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		signature = "(Lde;I)V",
		garbageValue = "964773449"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}
}
