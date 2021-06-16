import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import netscape.javascript.JSObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed {
	@ObfuscatedName("qq")
	@ObfuscatedSignature(
		descriptor = "[Lb;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = 660476359
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = 360388647
	)
	static int field830;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		longValue = -4989319872898383139L
	)
	static long field839;
	@ObfuscatedName("ov")
	static boolean[] field831;
	@ObfuscatedName("px")
	static boolean[] field833;
	@ObfuscatedName("oe")
	static boolean[] field712;
	@ObfuscatedName("pa")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = -1878723319
	)
	public static int field798;
	@ObfuscatedName("qd")
	static boolean field862;
	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("pr")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("pj")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = -1136245775
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("pf")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	static final ApproximateRouteStrategy field733;
	@ObfuscatedName("po")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = -1081070029
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = 605086857
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tk")
	static int[] field739;
	@ObfuscatedName("ta")
	static int[] field631;
	@ObfuscatedName("rg")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("rx")
	static boolean[] field871;
	@ObfuscatedName("ry")
	static int[] field872;
	@ObfuscatedName("rc")
	static int[] field873;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = 1152521
	)
	static int field890;
	@ObfuscatedName("rt")
	static int[] field867;
	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("sa")
	static int[] field875;
	@ObfuscatedName("su")
	@ObfuscatedSignature(
		descriptor = "[Lju;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = 1731824615
	)
	static int field902;
	@ObfuscatedName("pn")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = 1839633675
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("rm")
	@ObfuscatedGetter(
		intValue = -1711547959
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("rd")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("tv")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = -1256134345
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = 375081575
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("rs")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("rk")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("rb")
	@ObfuscatedGetter(
		intValue = -85390661
	)
	static int field659;
	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "[Lax;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("rr")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		longValue = -3503174245678770383L
	)
	static long field850;
	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("sy")
	static short field876;
	@ObfuscatedName("sv")
	static short field877;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = -1807179709
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("so")
	static short field881;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = 1305420667
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("qs")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("sn")
	static short field690;
	@ObfuscatedName("si")
	static short field864;
	@ObfuscatedName("st")
	@ObfuscatedGetter(
		intValue = 1279050647
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("sm")
	static short field880;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = -1918427539
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("qc")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = 743767761
	)
	static int field853;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = 1112444085
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = -853632551
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = -1851870409
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "[Ly;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("sc")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("sl")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		intValue = 392522533
	)
	static int field898;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = -426545695
	)
	static int field847;
	@ObfuscatedName("ph")
	static int[] field786;
	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	static NodeDeque field812;
	@ObfuscatedName("pb")
	static int[] field848;
	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	static NodeDeque field860;
	@ObfuscatedName("pv")
	static int[] field725;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = -2084785053
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = -1755958915
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("pq")
	static String field642;
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lfl;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	static Bounds field903;
	@ObfuscatedName("af")
	static boolean field730;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -479860063
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1336794433
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1086569323
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bc")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("be")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1302427087
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1019445121
	)
	static int field625;
	@ObfuscatedName("bg")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -2033553753
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cg")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1506924847
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		longValue = 3330415476350692251L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 2057081131
	)
	static int field843;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1549041823
	)
	static int field633;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		longValue = -7081451214242002295L
	)
	static long field760;
	@ObfuscatedName("cs")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("co")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1450898569
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -884240111
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1021178359
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1821645449
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 986591039
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 359883245
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -809682322
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -449075904
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 16481216
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 645722257
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 1743859217
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -1425708355
	)
	static int field800;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = 1445831209
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 1594897445
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		intValue = -86832127
	)
	static int field811;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = -775816439
	)
	static int field654;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 1385967613
	)
	static int field655;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static class126 field656;
	@ObfuscatedName("eg")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("ed")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fm")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "[Ldu;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = -2000479971
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("fg")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("fe")
	@ObfuscatedGetter(
		intValue = -22894005
	)
	static int field636;
	@ObfuscatedName("fs")
	static int[] field763;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		intValue = 796481149
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("fp")
	static boolean field670;
	@ObfuscatedName("fi")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("fd")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = 1919520289
	)
	static int field618;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = -1712660563
	)
	static int field789;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 852398613
	)
	static int field742;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = -1878164651
	)
	static int field677;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = 143152059
	)
	static int field678;
	@ObfuscatedName("gp")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("gr")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("gy")
	static final int[] field682;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = -270595563
	)
	static int field683;
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = 173125819
	)
	static int field685;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = 527282429
	)
	static int field686;
	@ObfuscatedName("hc")
	@ObfuscatedGetter(
		intValue = 713325161
	)
	static int field818;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = -742100795
	)
	static int field688;
	@ObfuscatedName("hh")
	static boolean field689;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = -126848597
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = 625342135
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = 1330409253
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = 1581889061
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("hb")
	@ObfuscatedGetter(
		intValue = 182124091
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -474499607
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = -1521559245
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = 399806555
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = -210927579
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = 44183997
	)
	static int field699;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = 1634750831
	)
	static int field676;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = -2080387383
	)
	static int field857;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 1614384069
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = 930603185
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 1986123723
	)
	public static int field704;
	@ObfuscatedName("iv")
	static boolean field705;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = -572863563
	)
	static int field706;
	@ObfuscatedName("ii")
	static boolean field707;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = 482365293
	)
	static int field708;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = -1595418399
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = -2069034471
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("ik")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("is")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ij")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("ig")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("im")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("jc")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("jj")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("ji")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("js")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = 1472746363
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = 646714111
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = 1866904061
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = -1814244043
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = 1740953143
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = -161820321
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = -1567280515
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("jw")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = -756322907
	)
	static int field869;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = 198485255
	)
	static int field729;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 1180846677
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = 2098466217
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -1854794411
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = 1229722503
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("jv")
	static boolean field734;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = 433289591
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = -1284891995
	)
	static int field629;
	@ObfuscatedName("jx")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "[Lcj;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -990316241
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = -1153104715
	)
	static int field740;
	@ObfuscatedName("ka")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = -1689088739
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = 506159691
	)
	static int field783;
	@ObfuscatedName("ks")
	static int[] field859;
	@ObfuscatedName("kr")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ko")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("kw")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("kt")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = -263949421
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "[[[Lkq;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("ki")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("kv")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("lg")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = -1921591875
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("le")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 125901859
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("lt")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("lf")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("lr")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("ld")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("lq")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ly")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("lu")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("lc")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ll")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("lx")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("lv")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = 1932466889
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = -936888801
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = -2134544589
	)
	static int field773;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = 1407129087
	)
	static int field693;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = -56477685
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ma")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = -1880896879
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = 239487695
	)
	static int field634;
	@ObfuscatedName("mm")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("mh")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = -65357441
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -397561133
	)
	static int field784;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = -1298961303
	)
	static int field694;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = 1894201327
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = 1703378305
	)
	static int field891;
	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -932901887
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = 2078766509
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -91677995
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = 1939957429
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("nv")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = 123822307
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = -1215830949
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("nq")
	static boolean field821;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = 392956681
	)
	static int field801;
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = -207848961
	)
	static int field802;
	@ObfuscatedName("nk")
	static boolean field731;
	@ObfuscatedName("ne")
	@ObfuscatedGetter(
		intValue = -1026128313
	)
	static int field804;
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = 1520709181
	)
	static int field805;
	@ObfuscatedName("nl")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("ns")
	@ObfuscatedGetter(
		intValue = -627437657
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("no")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = 1626383345
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("nr")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = 942162965
	)
	static int field711;
	@ObfuscatedName("nd")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = -887652095
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("oo")
	static int[] field814;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = -1384400453
	)
	static int field759;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = 811091313
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = -892031395
	)
	static int field817;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = -2026013483
	)
	static int field882;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = 976614793
	)
	static int field819;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = 1591480271
	)
	static int field820;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 1602383115
	)
	static int field827;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = 1877231855
	)
	static int field822;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = -451521007
	)
	static int field823;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 807145243
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	Buffer field660;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	class35 field661;

	static {
		field730 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		clientType = -1;
		field625 = -1;
		onMobile = false;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = 1L;
		field843 = -1;
		field633 = -1;
		field760 = -1L;
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
		field800 = 0;
		js5Errors = 0;
		loginState = 0;
		field811 = 0;
		field654 = 0;
		field655 = 0;
		field656 = class126.field1475;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[32768];
		npcCount = 0;
		npcIndices = new int[32768];
		field636 = 0;
		field763 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		field670 = false;
		useBufferedSocket = true;
		timer = new Timer();
		fontsMap = new HashMap();
		field618 = 0;
		field789 = 1;
		field742 = 0;
		field677 = 1;
		field678 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field682 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field683 = 0;
		field685 = 2301979;
		field686 = 5063219;
		field818 = 3353893;
		field688 = 7759444;
		field689 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field699 = 0;
		field676 = 0;
		field857 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field704 = 0;
		field705 = false;
		field706 = 0;
		field707 = false;
		field708 = 0;
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
		field869 = 0;
		field729 = 0;
		dragItemSlotSource = 0;
		draggedWidgetX = 0;
		draggedWidgetY = 0;
		dragItemSlotDestination = 0;
		field734 = false;
		itemDragDuration = 0;
		field629 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field740 = 0;
		renderSelf = true;
		drawPlayerNames = 0;
		field783 = 0;
		field859 = new int[1000];
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
		field773 = 0;
		field693 = 50;
		isItemSelected = 0;
		selectedItemName = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		field634 = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field784 = 0;
		field694 = -1;
		chatEffects = 0;
		field891 = 0;
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
		field821 = false;
		field801 = -1;
		field802 = -1;
		field731 = false;
		field804 = -1;
		field805 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field711 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field814 = new int[32];
		field759 = 0;
		chatCycle = 0;
		field817 = 0;
		field882 = 0;
		field819 = 0;
		field820 = 0;
		field827 = 0;
		field822 = 0;
		field823 = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		field812 = new NodeDeque();
		field860 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field830 = -2;
		field831 = new boolean[100];
		field712 = new boolean[100];
		field833 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field839 = 0L;
		isResizable = true;
		field725 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field642 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field847 = 0;
		field848 = new int[128];
		field786 = new int[128];
		field850 = -1L;
		currentClanSettings = new ClanSettings[1];
		currentClanChannels = new ClanChannel[1];
		field853 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		currentTrackGroupId = -1;
		field862 = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field871 = new boolean[5];
		field872 = new int[5];
		field873 = new int[5];
		field867 = new int[5];
		field875 = new int[5];
		field876 = 256;
		field877 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field880 = 1;
		field864 = 32767;
		field881 = 1;
		field690 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field890 = -1;
		field902 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field798 = -1;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field898 = 0;
		field733 = new ApproximateRouteStrategy();
		field739 = new int[50];
		field631 = new int[50];
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-95"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field839 = ClientPacket.currentTimeMillis() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1587549695"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000};
		int[] var2 = new int[]{1000, 100, 500};
		if (var1 != null && var2 != null) {
			class372.ByteArrayPool_alternativeSizes = var1;
			WorldMapScaleHandler.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
			Tiles.ByteArrayPool_arrays = new byte[var1.length][][];

			for (int var3 = 0; var3 < class372.ByteArrayPool_alternativeSizes.length; ++var3) {
				Tiles.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
			}
		} else {
			class372.ByteArrayPool_alternativeSizes = null;
			WorldMapScaleHandler.ByteArrayPool_altSizeArrayCounts = null;
			Tiles.ByteArrayPool_arrays = null;
		}

		UserComparator7.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		class96.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		UserComparator2.currentPort = UserComparator7.worldPort;
		VarcInt.field1581 = class246.field2945;
		class69.field568 = class246.field2944;
		ModelData0.field2517 = class246.field2943;
		Skills.field3175 = class246.field2946;
		ArchiveDiskActionHandler.urlRequester = new UrlRequester();
		this.setUpKeyboard();
		this.setUpMouse();
		Projectile.mouseWheel = this.mouseWheel();
		WorldMapID.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		class4.clientPreferences = VarpDefinition.method2715();
		this.setUpClipboard();
		UserComparator5.method2543(this, InvDefinition.null_string);
		if (gameBuild != 0) {
			displayFps = true;
		}

		WorldMapDecorationType.setWindowedMode(class4.clientPreferences.windowMode);
		DevicePcmPlayerProvider.friendSystem = new FriendSystem(LoginScreenAnimation.loginType);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2087654500"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();
		class35.method422();
		Frames.method4257();
		class233.playPcmPlayers();
		int var2;
		synchronized(KeyHandler.KeyHandler_instance) {
			++KeyHandler.KeyHandler_idleCycles;
			KeyHandler.field276 = KeyHandler.field277;
			KeyHandler.field271 = 0;
			KeyHandler.field274 = 0;
			Arrays.fill(KeyHandler.field264, false);
			Arrays.fill(KeyHandler.field265, false);
			if (KeyHandler.field268 < 0) {
				Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false);
				KeyHandler.field268 = KeyHandler.field267;
			} else {
				while (KeyHandler.field267 != KeyHandler.field268) {
					var2 = KeyHandler.field283[KeyHandler.field267];
					KeyHandler.field267 = KeyHandler.field267 + 1 & 127;
					if (var2 < 0) {
						var2 = ~var2;
						if (KeyHandler.KeyHandler_pressedKeys[var2]) {
							KeyHandler.KeyHandler_pressedKeys[var2] = false;
							KeyHandler.field265[var2] = true;
							KeyHandler.field273[KeyHandler.field274] = var2;
							++KeyHandler.field274;
						}
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var2] && KeyHandler.field271 < KeyHandler.field257.length - 1) {
							KeyHandler.field264[var2] = true;
							KeyHandler.field257[++KeyHandler.field271 - 1] = var2;
						}

						KeyHandler.KeyHandler_pressedKeys[var2] = true;
					}
				}
			}

			if (KeyHandler.field271 > 0) {
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field277 = KeyHandler.field255;
		}

		class34.method406();
		if (Projectile.mouseWheel != null) {
			int var24 = Projectile.mouseWheel.useRotation();
			mouseWheelRotation = var24;
		}

		if (gameState == 0) {
			class34.load();
			class26.method350();
		} else if (gameState == 5) {
			class21.doCycleTitle(this);
			class34.load();
			class26.method350();
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class21.doCycleTitle(this);
				this.doCycleLoggedOut();
			} else if (gameState == 25) {
				DynamicObject.method2099(false);
				field618 = 0;
				boolean var35 = true;

				for (var2 = 0; var2 < UrlRequest.regionLandArchives.length; ++var2) {
					if (UrlRequester.regionMapArchiveIds[var2] != -1 && UrlRequest.regionLandArchives[var2] == null) {
						UrlRequest.regionLandArchives[var2] = class4.archive7.takeFile(UrlRequester.regionMapArchiveIds[var2], 0);
						if (UrlRequest.regionLandArchives[var2] == null) {
							var35 = false;
							++field618;
						}
					}

					if (class286.regionLandArchiveIds[var2] != -1 && WorldMapDecorationType.regionMapArchives[var2] == null) {
						WorldMapDecorationType.regionMapArchives[var2] = class4.archive7.takeFileEncrypted(class286.regionLandArchiveIds[var2], 0, class7.xteaKeys[var2]);
						if (WorldMapDecorationType.regionMapArchives[var2] == null) {
							var35 = false;
							++field618;
						}
					}
				}

				if (!var35) {
					field678 = 1;
				} else {
					field742 = 0;
					var35 = true;

					int var4;
					int var5;
					for (var2 = 0; var2 < UrlRequest.regionLandArchives.length; ++var2) {
						byte[] var3 = WorldMapDecorationType.regionMapArchives[var2];
						if (var3 != null) {
							var4 = (UserComparator4.regions[var2] >> 8) * 64 - class15.baseX * 64;
							var5 = (UserComparator4.regions[var2] & 255) * 64 - WorldMapSprite.baseY * 64;
							if (isInInstance) {
								var4 = 10;
								var5 = 10;
							}

							var35 &= class69.method1222(var3, var4, var5);
						}
					}

					if (!var35) {
						field678 = 2;
					} else {
						if (field678 != 0) {
							class143.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
						}

						class233.playPcmPlayers();
						DevicePcmPlayerProvider.scene.clear();

						for (var2 = 0; var2 < 4; ++var2) {
							collisionMaps[var2].clear();
						}

						int var25;
						for (var2 = 0; var2 < 4; ++var2) {
							for (var25 = 0; var25 < 104; ++var25) {
								for (var4 = 0; var4 < 104; ++var4) {
									Tiles.Tiles_renderFlags[var2][var25][var4] = 0;
								}
							}
						}

						class233.playPcmPlayers();
						Tiles.Tiles_minPlane = 99;
						AccessFile.field4098 = new byte[4][104][104];
						Tiles.field1111 = new byte[4][104][104];
						class22.field186 = new byte[4][104][104];
						class16.field132 = new byte[4][104][104];
						Tiles.field1101 = new int[4][105][105];
						class43.field307 = new byte[4][105][105];
						NPC.field1328 = new int[105][105];
						class230.Tiles_hue = new int[104];
						Tiles.Tiles_saturation = new int[104];
						AbstractByteArrayCopier.Tiles_lightness = new int[104];
						WorldMapSectionType.Tiles_hueMultiplier = new int[104];
						Tiles.field1095 = new int[104];
						var2 = UrlRequest.regionLandArchives.length;

						for (ObjectSound var33 = (ObjectSound)ObjectSound.objectSounds.last(); var33 != null; var33 = (ObjectSound)ObjectSound.objectSounds.previous()) {
							if (var33.stream1 != null) {
								UserComparator7.pcmStreamMixer.removeSubStream(var33.stream1);
								var33.stream1 = null;
							}

							if (var33.stream2 != null) {
								UserComparator7.pcmStreamMixer.removeSubStream(var33.stream2);
								var33.stream2 = null;
							}
						}

						ObjectSound.objectSounds.clear();
						DynamicObject.method2099(true);
						int var7;
						int var8;
						int var10;
						int var11;
						int var12;
						int var13;
						int var28;
						if (!isInInstance) {
							var25 = 0;

							label579:
							while (true) {
								byte[] var6;
								if (var25 >= var2) {
									for (var25 = 0; var25 < var2; ++var25) {
										var4 = (UserComparator4.regions[var25] >> 8) * 64 - class15.baseX * 64;
										var5 = (UserComparator4.regions[var25] & 255) * 64 - WorldMapSprite.baseY * 64;
										var6 = UrlRequest.regionLandArchives[var25];
										if (var6 == null && RouteStrategy.field1919 < 800) {
											class233.playPcmPlayers();
											UrlRequest.method2520(var4, var5, 64, 64);
										}
									}

									DynamicObject.method2099(true);
									var25 = 0;

									while (true) {
										if (var25 >= var2) {
											break label579;
										}

										byte[] var27 = WorldMapDecorationType.regionMapArchives[var25];
										if (var27 != null) {
											var5 = (UserComparator4.regions[var25] >> 8) * 64 - class15.baseX * 64;
											var28 = (UserComparator4.regions[var25] & 255) * 64 - WorldMapSprite.baseY * 64;
											class233.playPcmPlayers();
											Scene var29 = DevicePcmPlayerProvider.scene;
											CollisionMap[] var30 = collisionMaps;
											Buffer var34 = new Buffer(var27);
											var10 = -1;

											while (true) {
												var11 = var34.method6628();
												if (var11 == 0) {
													break;
												}

												var10 += var11;
												var12 = 0;

												while (true) {
													var13 = var34.readUShortSmart();
													if (var13 == 0) {
														break;
													}

													var12 += var13 - 1;
													int var14 = var12 & 63;
													int var15 = var12 >> 6 & 63;
													int var16 = var12 >> 12;
													int var17 = var34.readUnsignedByte();
													int var18 = var17 >> 2;
													int var19 = var17 & 3;
													int var20 = var5 + var15;
													int var21 = var14 + var28;
													if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
														int var22 = var16;
														if ((Tiles.Tiles_renderFlags[1][var20][var21] & 2) == 2) {
															var22 = var16 - 1;
														}

														CollisionMap var23 = null;
														if (var22 >= 0) {
															var23 = var30[var22];
														}

														Player.method2258(var16, var20, var21, var10, var19, var18, var29, var23);
													}
												}
											}
										}

										++var25;
									}
								}

								var4 = (UserComparator4.regions[var25] >> 8) * 64 - class15.baseX * 64;
								var5 = (UserComparator4.regions[var25] & 255) * 64 - WorldMapSprite.baseY * 64;
								var6 = UrlRequest.regionLandArchives[var25];
								if (var6 != null) {
									class233.playPcmPlayers();
									var7 = class12.field111 * 8 - 48;
									var8 = RouteStrategy.field1919 * 8 - 48;
									CollisionMap[] var9 = collisionMaps;
									var10 = 0;

									label576:
									while (true) {
										if (var10 >= 4) {
											Buffer var26 = new Buffer(var6);
											var11 = 0;

											while (true) {
												if (var11 >= 4) {
													break label576;
												}

												for (var12 = 0; var12 < 64; ++var12) {
													for (var13 = 0; var13 < 64; ++var13) {
														Huffman.loadTerrain(var26, var11, var4 + var12, var13 + var5, var7, var8, 0);
													}
												}

												++var11;
											}
										}

										for (var11 = 0; var11 < 64; ++var11) {
											for (var12 = 0; var12 < 64; ++var12) {
												if (var4 + var11 > 0 && var11 + var4 < 103 && var5 + var12 > 0 && var5 + var12 < 103) {
													int[] var10000 = var9[var10].flags[var4 + var11];
													var10000[var5 + var12] &= -16777217;
												}
											}
										}

										++var10;
									}
								}

								++var25;
							}
						}

						int var31;
						if (isInInstance) {
							var25 = 0;

							label512:
							while (true) {
								if (var25 >= 4) {
									for (var25 = 0; var25 < 13; ++var25) {
										for (var4 = 0; var4 < 13; ++var4) {
											var5 = instanceChunkTemplates[0][var25][var4];
											if (var5 == -1) {
												UrlRequest.method2520(var25 * 8, var4 * 8, 8, 8);
											}
										}
									}

									DynamicObject.method2099(true);
									var25 = 0;

									while (true) {
										if (var25 >= 4) {
											break label512;
										}

										class233.playPcmPlayers();

										for (var4 = 0; var4 < 13; ++var4) {
											for (var5 = 0; var5 < 13; ++var5) {
												var28 = instanceChunkTemplates[var25][var4][var5];
												if (var28 != -1) {
													var7 = var28 >> 24 & 3;
													var8 = var28 >> 1 & 3;
													var31 = var28 >> 14 & 1023;
													var10 = var28 >> 3 & 2047;
													var11 = (var31 / 8 << 8) + var10 / 8;

													for (var12 = 0; var12 < UserComparator4.regions.length; ++var12) {
														if (UserComparator4.regions[var12] == var11 && WorldMapDecorationType.regionMapArchives[var12] != null) {
															class25.method337(WorldMapDecorationType.regionMapArchives[var12], var25, var4 * 8, var5 * 8, var7, (var31 & 7) * 8, (var10 & 7) * 8, var8, DevicePcmPlayerProvider.scene, collisionMaps);
															break;
														}
													}
												}
											}
										}

										++var25;
									}
								}

								class233.playPcmPlayers();

								for (var4 = 0; var4 < 13; ++var4) {
									for (var5 = 0; var5 < 13; ++var5) {
										boolean var37 = false;
										var7 = instanceChunkTemplates[var25][var4][var5];
										if (var7 != -1) {
											var8 = var7 >> 24 & 3;
											var31 = var7 >> 1 & 3;
											var10 = var7 >> 14 & 1023;
											var11 = var7 >> 3 & 2047;
											var12 = (var10 / 8 << 8) + var11 / 8;

											for (var13 = 0; var13 < UserComparator4.regions.length; ++var13) {
												if (UserComparator4.regions[var13] == var12 && UrlRequest.regionLandArchives[var13] != null) {
													UserComparator6.method2580(UrlRequest.regionLandArchives[var13], var25, var4 * 8, var5 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var31, collisionMaps);
													var37 = true;
													break;
												}
											}
										}

										if (!var37) {
											var8 = var25;
											var31 = var4 * 8;
											var10 = var5 * 8;

											for (var11 = 0; var11 < 8; ++var11) {
												for (var12 = 0; var12 < 8; ++var12) {
													Tiles.Tiles_heights[var8][var11 + var31][var10 + var12] = 0;
												}
											}

											if (var31 > 0) {
												for (var11 = 1; var11 < 8; ++var11) {
													Tiles.Tiles_heights[var8][var31][var11 + var10] = Tiles.Tiles_heights[var8][var31 - 1][var11 + var10];
												}
											}

											if (var10 > 0) {
												for (var11 = 1; var11 < 8; ++var11) {
													Tiles.Tiles_heights[var8][var11 + var31][var10] = Tiles.Tiles_heights[var8][var11 + var31][var10 - 1];
												}
											}

											if (var31 > 0 && Tiles.Tiles_heights[var8][var31 - 1][var10] != 0) {
												Tiles.Tiles_heights[var8][var31][var10] = Tiles.Tiles_heights[var8][var31 - 1][var10];
											} else if (var10 > 0 && Tiles.Tiles_heights[var8][var31][var10 - 1] != 0) {
												Tiles.Tiles_heights[var8][var31][var10] = Tiles.Tiles_heights[var8][var31][var10 - 1];
											} else if (var31 > 0 && var10 > 0 && Tiles.Tiles_heights[var8][var31 - 1][var10 - 1] != 0) {
												Tiles.Tiles_heights[var8][var31][var10] = Tiles.Tiles_heights[var8][var31 - 1][var10 - 1];
											}
										}
									}
								}

								++var25;
							}
						}

						DynamicObject.method2099(true);
						class233.playPcmPlayers();
						class69.method1225(DevicePcmPlayerProvider.scene, collisionMaps);
						DynamicObject.method2099(true);
						var25 = Tiles.Tiles_minPlane;
						if (var25 > SoundSystem.Client_plane) {
							var25 = SoundSystem.Client_plane;
						}

						if (var25 < SoundSystem.Client_plane - 1) {
							var25 = SoundSystem.Client_plane - 1;
						}

						if (isLowDetail) {
							DevicePcmPlayerProvider.scene.init(Tiles.Tiles_minPlane);
						} else {
							DevicePcmPlayerProvider.scene.init(0);
						}

						for (var4 = 0; var4 < 104; ++var4) {
							for (var5 = 0; var5 < 104; ++var5) {
								class26.updateItemPile(var4, var5);
							}
						}

						class233.playPcmPlayers();
						GraphicsObject.method2014();
						ObjectComposition.ObjectDefinition_cachedModelData.clear();
						PacketBufferNode var36;
						if (class1.client.hasFrame()) {
							var36 = InterfaceParent.getPacketBufferNode(ClientPacket.field2574, packetWriter.isaacCipher);
							var36.packetBuffer.writeInt(1057001181);
							packetWriter.addNode(var36);
						}

						if (!isInInstance) {
							var4 = (class12.field111 - 6) / 8;
							var5 = (class12.field111 + 6) / 8;
							var28 = (RouteStrategy.field1919 - 6) / 8;
							var7 = (RouteStrategy.field1919 + 6) / 8;

							for (var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
								for (var31 = var28 - 1; var31 <= var7 + 1; ++var31) {
									if (var8 < var4 || var8 > var5 || var31 < var28 || var31 > var7) {
										class4.archive7.loadRegionFromName("m" + var8 + "_" + var31);
										class4.archive7.loadRegionFromName("l" + var8 + "_" + var31);
									}
								}
							}
						}

						Projectile.updateGameState(30);
						class233.playPcmPlayers();
						AccessFile.field4098 = null;
						Tiles.field1111 = null;
						class22.field186 = null;
						class16.field132 = null;
						Tiles.field1101 = null;
						class43.field307 = null;
						NPC.field1328 = null;
						class230.Tiles_hue = null;
						Tiles.Tiles_saturation = null;
						AbstractByteArrayCopier.Tiles_lightness = null;
						WorldMapSectionType.Tiles_hueMultiplier = null;
						Tiles.field1095 = null;
						var36 = InterfaceParent.getPacketBufferNode(ClientPacket.field2585, packetWriter.isaacCipher);
						packetWriter.addNode(var36);
						class26.method350();
					}
				}
			}
		} else {
			class21.doCycleTitle(this);
		}

		if (gameState == 30) {
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) {
			this.doCycleLoggedOut();
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "49"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = RouteStrategy.method3252();
		if (var2 && field862 && SoundCache.pcmPlayer0 != null) {
			SoundCache.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field839 && ClientPacket.currentTimeMillis() > field839) {
			WorldMapDecorationType.setWindowedMode(class302.getWindowedMode());
		}

		int var3;
		if (var1) {
			for (var3 = 0; var3 < 100; ++var3) {
				field831[var3] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			NetFileRequest.drawTitle(class309.fontBold12, UserComparator10.fontPlain11, AbstractSocket.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				NetFileRequest.drawTitle(class309.fontBold12, UserComparator10.fontPlain11, AbstractSocket.fontPlain12);
			} else if (gameState == 25) {
				if (field678 == 1) {
					if (field618 > field789) {
						field789 = field618;
					}

					var3 = (field789 * 50 - field618 * 50) / field789;
					class143.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else if (field678 == 2) {
					if (field742 > field677) {
						field677 = field742;
					}

					var3 = (field677 * 50 - field742 * 50) / field677 + 50;
					class143.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else {
					class143.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				class143.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				class143.drawLoadingMessage("Please wait...", false);
			}
		} else {
			NetFileRequest.drawTitle(class309.fontBold12, UserComparator10.fontPlain11, AbstractSocket.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				if (field712[var3]) {
					AbstractWorldMapData.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]);
					field712[var3] = false;
				}
			}
		} else if (gameState > 0) {
			AbstractWorldMapData.rasterProvider.drawFull(0, 0);

			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				field712[var3] = false;
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1785168903"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class20.varcs.hasUnwrittenChanges()) {
			class20.varcs.write();
		}

		if (UrlRequester.mouseRecorder != null) {
			UrlRequester.mouseRecorder.isRunning = false;
		}

		UrlRequester.mouseRecorder = null;
		packetWriter.close();
		if (KeyHandler.KeyHandler_instance != null) {
			synchronized(KeyHandler.KeyHandler_instance) {
				KeyHandler.KeyHandler_instance = null;
			}
		}

		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

		Projectile.mouseWheel = null;
		if (SoundCache.pcmPlayer0 != null) {
			SoundCache.pcmPlayer0.shutdown();
		}

		if (UrlRequester.pcmPlayer1 != null) {
			UrlRequester.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) {
			NetCache.NetCache_socket.close();
		}

		GameObject.method4431();
		if (ArchiveDiskActionHandler.urlRequester != null) {
			ArchiveDiskActionHandler.urlRequester.close();
			ArchiveDiskActionHandler.urlRequester = null;
		}

		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var4 = 0; var4 < class24.idxCount; ++var4) {
				class369.JagexCache_idxFiles[var4].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var7) {
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1888551887"
	)
	protected final void vmethod1278() {
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
							AbstractArchive.clientLanguage = Language.method5269(Integer.parseInt(var2));
							break;
						case 7:
							WorldMapDecoration.field2084 = ReflectionCheck.method1228(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							Messages.field1397 = var2;
							break;
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.stellardawn, StudioGame.game3, StudioGame.game4, StudioGame.runescape, StudioGame.game5, StudioGame.oldscape};
							class182.field2114 = (StudioGame)Clock.findEnumerated(var3, Integer.parseInt(var2));
							if (class182.field2114 == StudioGame.oldscape) {
								LoginScreenAnimation.loginType = LoginType.oldscape;
							} else {
								LoginScreenAnimation.loginType = LoginType.field4089;
							}
							break;
						case 12:
							worldId = Integer.parseInt(var2);
							break;
						case 14:
							class82.field999 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							class162.field1936 = var2;
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				worldHost = this.getCodeBase().getHost();
				String var11 = WorldMapDecoration.field2084.name;
				byte var12 = 0;

				try {
					class24.idxCount = 21;
					ClanChannel.cacheGamebuild = var12;

					try {
						class23.operatingSystemName = System.getProperty("os.name");
					} catch (Exception var20) {
						class23.operatingSystemName = "Unknown";
					}

					GraphicsObject.formattedOperatingSystemName = class23.operatingSystemName.toLowerCase();

					try {
						JagexCache.userHomeDirectory = System.getProperty("user.home");
						if (JagexCache.userHomeDirectory != null) {
							JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
						}
					} catch (Exception var19) {
					}

					try {
						if (GraphicsObject.formattedOperatingSystemName.startsWith("win")) {
							if (JagexCache.userHomeDirectory == null) {
								JagexCache.userHomeDirectory = System.getenv("USERPROFILE");
							}
						} else if (JagexCache.userHomeDirectory == null) {
							JagexCache.userHomeDirectory = System.getenv("HOME");
						}

						if (JagexCache.userHomeDirectory != null) {
							JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
						}
					} catch (Exception var18) {
					}

					if (JagexCache.userHomeDirectory == null) {
						JagexCache.userHomeDirectory = "~/";
					}

					ArchiveLoader.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", JagexCache.userHomeDirectory, "/tmp/", ""};
					JagexCache.cacheSubPaths = new String[]{".jagex_cache_" + ClanChannel.cacheGamebuild, ".file_store_" + ClanChannel.cacheGamebuild};

					int var13;
					label176:
					for (var13 = 0; var13 < 4; ++var13) {
						WorldMapDecoration.cacheDir = Renderable.method4244("oldschool", var11, var13);
						if (!WorldMapDecoration.cacheDir.exists()) {
							WorldMapDecoration.cacheDir.mkdirs();
						}

						File[] var4 = WorldMapDecoration.cacheDir.listFiles();
						if (var4 == null) {
							break;
						}

						File[] var5 = var4;
						int var6 = 0;

						while (true) {
							if (var6 >= var5.length) {
								break label176;
							}

							File var7 = var5[var6];

							boolean var8;
							try {
								RandomAccessFile var9 = new RandomAccessFile(var7, "rw");
								int var10 = var9.read();
								var9.seek(0L);
								var9.write(var10);
								var9.seek(0L);
								var9.close();
								var8 = true;
							} catch (Exception var17) {
								var8 = false;
							}

							if (!var8) {
								break;
							}

							++var6;
						}
					}

					class26.method344(WorldMapDecoration.cacheDir);

					try {
						File var24 = new File(JagexCache.userHomeDirectory, "random.dat");
						int var15;
						if (var24.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var24, "rw", 25L), 24, 0);
						} else {
							label155:
							for (int var14 = 0; var14 < JagexCache.cacheSubPaths.length; ++var14) {
								for (var15 = 0; var15 < ArchiveLoader.cacheParentPaths.length; ++var15) {
									File var16 = new File(ArchiveLoader.cacheParentPaths[var15] + JagexCache.cacheSubPaths[var14] + File.separatorChar + "random.dat");
									if (var16.exists()) {
										JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var16, "rw", 25L), 24, 0);
										break label155;
									}
								}
							}
						}

						if (JagexCache.JagexCache_randomDat == null) {
							RandomAccessFile var25 = new RandomAccessFile(var24, "rw");
							var15 = var25.read();
							var25.seek(0L);
							var25.write(var15);
							var25.seek(0L);
							var25.close();
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var24, "rw", 25L), 24, 0);
						}
					} catch (IOException var21) {
					}

					JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(FloorUnderlayDefinition.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
					JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(FloorUnderlayDefinition.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
					class369.JagexCache_idxFiles = new BufferedFile[class24.idxCount];

					for (var13 = 0; var13 < class24.idxCount; ++var13) {
						class369.JagexCache_idxFiles[var13] = new BufferedFile(new AccessFile(FloorUnderlayDefinition.getFile("main_file_cache.idx" + var13), "rw", 1048576L), 6000, 0);
					}
				} catch (Exception var22) {
					FriendsChatManager.RunException_sendStackTrace((String)null, var22);
				}

				class1.client = this;
				GZipDecompressor.clientType = clientType;
				if (field625 == -1) {
					field625 = 0;
				}

				this.startThread(765, 503, 197);
			}
		} catch (RuntimeException var23) {
			throw Timer.newRunException(var23, "client.init(" + ')');
		}
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "80"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			long var2 = ClientPacket.currentTimeMillis();
			int var4 = (int)(var2 - NetCache.field3604);
			NetCache.field3604 = var2;
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
					label241: {
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
							if (class34.NetCache_currentResponse == null) {
								var7 = 8;
							} else if (NetCache.field3615 == 0) {
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
								if (NetCache.field3618 != 0) {
									for (var9 = 0; var9 < var8; ++var9) {
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field3618;
									}
								}

								var25 = NetCache.NetCache_responseHeaderBuffer;
								var25.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) {
									break;
								}

								if (class34.NetCache_currentResponse == null) {
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var12 = NetCache.NetCache_responseHeaderBuffer.readInt();
									long var13 = (long)(var10 + (var9 << 16));
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13);
									class266.field3222 = true;
									if (var15 == null) {
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13);
										class266.field3222 = false;
									}

									if (var15 == null) {
										throw new IOException();
									}

									int var16 = var11 == 0 ? 5 : 9;
									class34.NetCache_currentResponse = var15;
									class254.NetCache_responseArchiveBuffer = new Buffer(var12 + var16 + class34.NetCache_currentResponse.padding);
									class254.NetCache_responseArchiveBuffer.writeByte(var11);
									class254.NetCache_responseArchiveBuffer.writeInt(var12);
									NetCache.field3615 = 8;
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
								} else if (NetCache.field3615 == 0) {
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
										NetCache.field3615 = 1;
										NetCache.NetCache_responseHeaderBuffer.offset = 0;
									} else {
										class34.NetCache_currentResponse = null;
									}
								}
							} else {
								var8 = class254.NetCache_responseArchiveBuffer.array.length - class34.NetCache_currentResponse.padding;
								var9 = 512 - NetCache.field3615;
								if (var9 > var8 - class254.NetCache_responseArchiveBuffer.offset) {
									var9 = var8 - class254.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) {
									var9 = var18;
								}

								NetCache.NetCache_socket.read(class254.NetCache_responseArchiveBuffer.array, class254.NetCache_responseArchiveBuffer.offset, var9);
								if (NetCache.field3618 != 0) {
									for (var10 = 0; var10 < var9; ++var10) {
										var10000 = class254.NetCache_responseArchiveBuffer.array;
										var10001 = var10 + class254.NetCache_responseArchiveBuffer.offset;
										var10000[var10001] ^= NetCache.field3618;
									}
								}

								var25 = class254.NetCache_responseArchiveBuffer;
								var25.offset += var9;
								NetCache.field3615 += var9;
								if (var8 == class254.NetCache_responseArchiveBuffer.offset) {
									if (16711935L == class34.NetCache_currentResponse.key) {
										UserComparator6.NetCache_reference = class254.NetCache_responseArchiveBuffer;

										for (var10 = 0; var10 < 256; ++var10) {
											Archive var19 = NetCache.NetCache_archives[var10];
											if (var19 != null) {
												UserComparator6.NetCache_reference.offset = var10 * 8 + 5;
												var12 = UserComparator6.NetCache_reference.readInt();
												int var20 = UserComparator6.NetCache_reference.readInt();
												var19.loadIndex(var12, var20);
											}
										}
									} else {
										NetCache.NetCache_crc.reset();
										NetCache.NetCache_crc.update(class254.NetCache_responseArchiveBuffer.array, 0, var8);
										var10 = (int)NetCache.NetCache_crc.getValue();
										if (var10 != class34.NetCache_currentResponse.crc) {
											try {
												NetCache.NetCache_socket.close();
											} catch (Exception var23) {
											}

											++NetCache.NetCache_crcMismatches;
											NetCache.NetCache_socket = null;
											NetCache.field3618 = (byte)((int)(Math.random() * 255.0D + 1.0D));
											var1 = false;
											break label241;
										}

										NetCache.NetCache_crcMismatches = 0;
										NetCache.NetCache_ioExceptions = 0;
										class34.NetCache_currentResponse.archive.write((int)(class34.NetCache_currentResponse.key & 65535L), class254.NetCache_responseArchiveBuffer.array, (class34.NetCache_currentResponse.key & 16711680L) == 16711680L, class266.field3222);
									}

									class34.NetCache_currentResponse.remove();
									if (class266.field3222) {
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount;
									}

									NetCache.field3615 = 0;
									class34.NetCache_currentResponse = null;
									class254.NetCache_responseArchiveBuffer = null;
								} else {
									if (NetCache.field3615 != 512) {
										break;
									}

									NetCache.field3615 = 0;
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

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1568310172"
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

				field800 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}

			if (--field800 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						Buddy.js5SocketTask = GameEngine.taskHandler.newSocketTask(worldHost, UserComparator2.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (Buddy.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (Buddy.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						if (useBufferedSocket) {
							BoundaryObject.js5Socket = PcmPlayer.method897((Socket)Buddy.js5SocketTask.result, 40000, 5000);
						} else {
							BoundaryObject.js5Socket = new NetSocket((Socket)Buddy.js5SocketTask.result, GameEngine.taskHandler, 5000);
						}

						Buffer var1 = new Buffer(5);
						var1.writeByte(15);
						var1.writeInt(197);
						BoundaryObject.js5Socket.write(var1.array, 0, 5);
						++js5ConnectState;
						VarcInt.field1586 = ClientPacket.currentTimeMillis();
					}

					if (js5ConnectState == 3) {
						if (BoundaryObject.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) {
							int var2 = BoundaryObject.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (ClientPacket.currentTimeMillis() - VarcInt.field1586 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						VarbitComposition.method2928(BoundaryObject.js5Socket, gameState > 20);
						Buddy.js5SocketTask = null;
						BoundaryObject.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "435825776"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		Buddy.js5SocketTask = null;
		BoundaryObject.js5Socket = null;
		js5ConnectState = 0;
		if (UserComparator2.currentPort == UserComparator7.worldPort) {
			UserComparator2.currentPort = class96.js5Port;
		} else {
			UserComparator2.currentPort = UserComparator7.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				gameState = 1000;
			} else {
				field800 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			gameState = 1000;
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				gameState = 1000;
			} else {
				field800 = 3000;
			}
		}

	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "26284"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (ClanSettings.secureRandom == null && (secureRandomFuture.isDone() || field811 > 250)) {
					ClanSettings.secureRandom = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (ClanSettings.secureRandom != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					AbstractArchive.socketTask = null;
					field670 = false;
					field811 = 0;
					loginState = 1;
				}
			}

			if (loginState == 1) {
				if (AbstractArchive.socketTask == null) {
					AbstractArchive.socketTask = GameEngine.taskHandler.newSocketTask(worldHost, UserComparator2.currentPort);
				}

				if (AbstractArchive.socketTask.status == 2) {
					throw new IOException();
				}

				if (AbstractArchive.socketTask.status == 1) {
					if (useBufferedSocket) {
						var1 = PcmPlayer.method897((Socket)AbstractArchive.socketTask.result, 40000, 5000);
					} else {
						var1 = new NetSocket((Socket)AbstractArchive.socketTask.result, GameEngine.taskHandler, 5000);
					}

					packetWriter.setSocket((AbstractSocket)var1);
					AbstractArchive.socketTask = null;
					loginState = 2;
				}
			}

			if (loginState == 2) {
				packetWriter.clearBuffer();
				PacketBufferNode var4 = WorldMapData_1.method3583();
				var4.clientPacket = null;
				var4.clientPacketLength = 0;
				var4.packetBuffer = new PacketBuffer(5000);
				var4.packetBuffer.writeByte(LoginPacket.field2806.id);
				packetWriter.addNode(var4);
				packetWriter.flush();
				var2.offset = 0;
				loginState = 3;
			}

			boolean var13;
			int var14;
			if (loginState == 3) {
				if (SoundCache.pcmPlayer0 != null) {
					SoundCache.pcmPlayer0.method844();
				}

				if (UrlRequester.pcmPlayer1 != null) {
					UrlRequester.pcmPlayer1.method844();
				}

				var13 = true;
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) {
					var13 = false;
				}

				if (var13) {
					var14 = ((AbstractSocket)var1).readUnsignedByte();
					if (SoundCache.pcmPlayer0 != null) {
						SoundCache.pcmPlayer0.method844();
					}

					if (UrlRequester.pcmPlayer1 != null) {
						UrlRequester.pcmPlayer1.method844();
					}

					if (var14 != 0) {
						WorldMapDecorationType.getLoginError(var14);
						return;
					}

					var2.offset = 0;
					loginState = 4;
				}
			}

			int var32;
			if (loginState == 4) {
				if (var2.offset < 8) {
					var32 = ((AbstractSocket)var1).available();
					if (var32 > 8 - var2.offset) {
						var32 = 8 - var2.offset;
					}

					if (var32 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset, var32);
						var2.offset += var32;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					class160.field1929 = var2.readLong();
					loginState = 5;
				}
			}

			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var3 = new PacketBuffer(500);
				int[] var24 = new int[]{ClanSettings.secureRandom.nextInt(), ClanSettings.secureRandom.nextInt(), ClanSettings.secureRandom.nextInt(), ClanSettings.secureRandom.nextInt()};
				var3.offset = 0;
				var3.writeByte(1);
				var3.writeInt(var24[0]);
				var3.writeInt(var24[1]);
				var3.writeInt(var24[2]);
				var3.writeInt(var24[3]);
				var3.writeLong(class160.field1929);
				if (gameState == 40) {
					var3.writeInt(SoundCache.field438[0]);
					var3.writeInt(SoundCache.field438[1]);
					var3.writeInt(SoundCache.field438[2]);
					var3.writeInt(SoundCache.field438[3]);
				} else {
					var3.writeByte(field656.rsOrdinal());
					switch(field656.field1476) {
					case 0:
						var3.offset += 4;
						break;
					case 1:
					case 2:
						var3.writeMedium(class0.field2);
						++var3.offset;
						break;
					case 3:
						var3.writeInt((Integer)class4.clientPreferences.parameters.get(class125.method2586(Login.Login_username)));
					}

					var3.writeByte(class387.field4211.rsOrdinal());
					var3.writeStringCp1252NullTerminated(Login.Login_password);
				}

				var3.encryptRsa(class82.field1000, class82.field996);
				SoundCache.field438 = var24;
				PacketBufferNode var6 = WorldMapData_1.method3583();
				var6.clientPacket = null;
				var6.clientPacketLength = 0;
				var6.packetBuffer = new PacketBuffer(5000);
				var6.packetBuffer.offset = 0;
				if (gameState == 40) {
					var6.packetBuffer.writeByte(LoginPacket.field2803.id);
				} else {
					var6.packetBuffer.writeByte(LoginPacket.field2802.id);
				}

				var6.packetBuffer.writeShort(0);
				int var7 = var6.packetBuffer.offset;
				var6.packetBuffer.writeInt(197);
				var6.packetBuffer.writeInt(1);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeByte(field625);
				var6.packetBuffer.writeBytes(var3.array, 0, var3.offset);
				int var8 = var6.packetBuffer.offset;
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var6.packetBuffer.writeShort(AttackOption.canvasWidth);
				var6.packetBuffer.writeShort(class0.canvasHeight);
				PacketBuffer var9 = var6.packetBuffer;
				if (randomDatData != null) {
					var9.writeBytes(randomDatData, 0, randomDatData.length);
				} else {
					byte[] var10 = PlatformInfo.method6115();
					var9.writeBytes(var10, 0, var10.length);
				}

				var6.packetBuffer.writeStringCp1252NullTerminated(Messages.field1397);
				var6.packetBuffer.writeInt(class82.field999);
				Buffer var31 = new Buffer(ClanSettings.platformInfo.size());
				ClanSettings.platformInfo.write(var31);
				var6.packetBuffer.writeBytes(var31.array, 0, var31.array.length);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeInt(0);
				var6.packetBuffer.method6659(KitDefinition.archive4.hash);
				var6.packetBuffer.method6658(Varcs.archive12.hash);
				var6.packetBuffer.writeInt(class4.archive7.hash);
				var6.packetBuffer.method6658(0);
				var6.packetBuffer.writeIntME(class26.field211.hash);
				var6.packetBuffer.method6658(PcmPlayer.archive9.hash);
				var6.packetBuffer.method6658(class160.archive11.hash);
				var6.packetBuffer.writeIntME(class18.archive5.hash);
				var6.packetBuffer.method6659(JagexCache.archive10.hash);
				var6.packetBuffer.writeInt(ClanChannel.archive3.hash);
				var6.packetBuffer.method6658(PacketWriter.archive14.hash);
				var6.packetBuffer.method6659(DynamicObject.archive6.hash);
				var6.packetBuffer.writeInt(SecureRandomFuture.archive2.hash);
				var6.packetBuffer.writeInt(WorldMapEvent.archive19.hash);
				var6.packetBuffer.writeInt(class6.archive18.hash);
				var6.packetBuffer.method6659(class10.archive17.hash);
				var6.packetBuffer.writeIntME(GrandExchangeOfferOwnWorldComparator.archive13.hash);
				var6.packetBuffer.method6658(class16.field134.hash);
				var6.packetBuffer.writeIntME(class306.archive15.hash);
				var6.packetBuffer.writeInt(ModeWhere.archive8.hash);
				var6.packetBuffer.method6659(WorldMapLabel.archive20.hash);
				var6.packetBuffer.xteaEncrypt(var24, var8, var6.packetBuffer.offset);
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var7);
				packetWriter.addNode(var6);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var24);
				int[] var11 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var11[var12] = var24[var12] + 50;
				}

				var2.newIsaacCipher(var11);
				loginState = 6;
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
				var32 = ((AbstractSocket)var1).readUnsignedByte();
				if (var32 == 21 && gameState == 20) {
					loginState = 12;
				} else if (var32 == 2) {
					loginState = 14;
				} else if (var32 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					loginState = 19;
				} else if (var32 == 64) {
					loginState = 10;
				} else if (var32 == 23 && field654 < 1) {
					++field654;
					loginState = 0;
				} else if (var32 == 29) {
					loginState = 17;
				} else {
					if (var32 != 69) {
						WorldMapDecorationType.getLoginError(var32);
						return;
					}

					loginState = 7;
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				ClanChannel.field30 = var2.readUnsignedShort();
				loginState = 8;
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= ClanChannel.field30) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, ClanChannel.field30);
				class34[] var21 = new class34[]{class34.field232};
				class34 var25 = var21[var2.readUnsignedByte()];

				try {
					switch(var25.field233) {
					case 0:
						class28 var5 = new class28();
						this.field661 = new class35(var2, var5);
						loginState = 9;
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var19) {
					WorldMapDecorationType.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field661.method420()) {
				this.field660 = this.field661.method416();
				this.field661.method410();
				this.field661 = null;
				if (this.field660 == null) {
					WorldMapDecorationType.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				PacketBufferNode var22 = ArchiveLoader.method2162();
				var22.packetBuffer.writeByte(LoginPacket.field2804.id);
				var22.packetBuffer.writeShort(this.field660.offset);
				var22.packetBuffer.method6607(this.field660);
				packetWriter.addNode(var22);
				packetWriter.flush();
				this.field660 = null;
				loginState = 6;
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
				WorldMapEvent.field2152 = ((AbstractSocket)var1).readUnsignedByte();
				loginState = 11;
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= WorldMapEvent.field2152) {
				((AbstractSocket)var1).read(var2.array, 0, WorldMapEvent.field2152);
				var2.offset = 0;
				loginState = 6;
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
				field655 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				loginState = 13;
			}

			if (loginState == 13) {
				field811 = 0;
				CollisionMap.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field655 / 60 + " seconds.");
				if (--field655 <= 0) {
					loginState = 0;
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
					WorldMapSection0.field2038 = ((AbstractSocket)var1).readUnsignedByte();
					loginState = 15;
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= WorldMapSection0.field2038) {
					var13 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var33 = false;
					if (var13) {
						var14 = var2.readByteIsaac() << 24;
						var14 |= var2.readByteIsaac() << 16;
						var14 |= var2.readByteIsaac() << 8;
						var14 |= var2.readByteIsaac();
						int var15 = class125.method2586(Login.Login_username);
						if (class4.clientPreferences.parameters.size() >= 10 && !class4.clientPreferences.parameters.containsKey(var15)) {
							Iterator var30 = class4.clientPreferences.parameters.entrySet().iterator();
							var30.next();
							var30.remove();
						}

						class4.clientPreferences.parameters.put(var15, var14);
					}

					if (Login_isUsernameRemembered) {
						class4.clientPreferences.rememberedUsername = Login.Login_username;
					} else {
						class4.clientPreferences.rememberedUsername = null;
					}

					Actor.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field740 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var27 = WorldMapIcon_0.ServerPacket_values();
					int var16 = var2.readSmartByteShortIsaac();
					if (var16 < 0 || var16 >= var27.length) {
						throw new IOException(var16 + " " + var2.offset);
					}

					packetWriter.serverPacket = var27[var16];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						class42.method521(class1.client, "zap");
					} catch (Throwable var18) {
					}

					loginState = 16;
				}

				if (loginState == 16) {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method5676();
						PcmPlayer.method895();
						class7.updatePlayer(var2);
						class12.field111 = -1;
						KeyHandler.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						class4.field38 = var2.readUnsignedShort();
						loginState = 18;
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= class4.field38) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, class4.field38);
						var2.offset = 0;
						String var23 = var2.readStringCp1252NullTerminated();
						String var26 = var2.readStringCp1252NullTerminated();
						String var28 = var2.readStringCp1252NullTerminated();
						CollisionMap.setLoginResponseString(var23, var26, var28);
						Projectile.updateGameState(10);
					}

					if (loginState != 19) {
						++field811;
						if (field811 > 2000) {
							if (field654 < 1) {
								if (UserComparator2.currentPort == UserComparator7.worldPort) {
									UserComparator2.currentPort = class96.js5Port;
								} else {
									UserComparator2.currentPort = UserComparator7.worldPort;
								}

								++field654;
								loginState = 0;
							} else {
								WorldMapDecorationType.getLoginError(-3);
							}
						}
					} else {
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
							var32 = packetWriter.serverPacketLength;
							timer.method5678();
							packetWriter.clearBuffer();
							packetWriter.packetBuffer.offset = 0;
							packetWriter.serverPacket = null;
							packetWriter.field1410 = null;
							packetWriter.field1411 = null;
							packetWriter.field1399 = null;
							packetWriter.serverPacketLength = 0;
							packetWriter.field1408 = 0;
							rebootTimer = 0;
							class34.method407();
							minimapState = 0;
							destinationX = 0;

							for (var14 = 0; var14 < 2048; ++var14) {
								players[var14] = null;
							}

							class262.localPlayer = null;

							for (var14 = 0; var14 < npcs.length; ++var14) {
								NPC var29 = npcs[var14];
								if (var29 != null) {
									var29.targetIndex = -1;
									var29.false0 = false;
								}
							}

							ItemContainer.itemContainers = new NodeHashTable(32);
							Projectile.updateGameState(30);

							for (var14 = 0; var14 < 100; ++var14) {
								field831[var14] = true;
							}

							BufferedSink.method5992();
							class7.updatePlayer(var2);
							if (var32 != var2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var20) {
			if (field654 < 1) {
				if (UserComparator7.worldPort == UserComparator2.currentPort) {
					UserComparator2.currentPort = class96.js5Port;
				} else {
					UserComparator2.currentPort = UserComparator7.worldPort;
				}

				++field654;
				loginState = 0;
			} else {
				WorldMapDecorationType.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1684472042"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (field670) {
			field670 = false;
			ApproximateRouteStrategy.method1268();
		} else {
			if (!isMenuOpen) {
				Script.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1655(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				int var2;
				PacketBufferNode var14;
				while (DynamicObject.method2103()) {
					var14 = InterfaceParent.getPacketBufferNode(ClientPacket.field2601, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					MouseHandler.performReflectionCheck(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				}

				if (timer.field3772) {
					var14 = InterfaceParent.getPacketBufferNode(ClientPacket.field2661, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					timer.write(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
					timer.method5677();
				}

				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				int var9;
				int var10;
				int var11;
				PacketBuffer var10000;
				synchronized(UrlRequester.mouseRecorder.lock) {
					if (!field730) {
						UrlRequester.mouseRecorder.index = 0;
					} else if (MouseHandler.MouseHandler_lastButton != 0 || UrlRequester.mouseRecorder.index >= 40) {
						PacketBufferNode var15 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;

						for (var7 = 0; var7 < UrlRequester.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) {
							var4 = var7;
							var8 = UrlRequester.mouseRecorder.ys[var7];
							if (var8 < -1) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}

							var9 = UrlRequester.mouseRecorder.xs[var7];
							if (var9 < -1) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}

							if (var9 != field843 || var8 != field633) {
								if (var15 == null) {
									var15 = InterfaceParent.getPacketBufferNode(ClientPacket.field2655, packetWriter.isaacCipher);
									var15.packetBuffer.writeByte(0);
									var3 = var15.packetBuffer.offset;
									var10000 = var15.packetBuffer;
									var10000.offset += 2;
									var5 = 0;
									var6 = 0;
								}

								int var12;
								if (-1L != field760) {
									var10 = var9 - field843;
									var11 = var8 - field633;
									var12 = (int)((UrlRequester.mouseRecorder.millis[var7] - field760) / 20L);
									var5 = (int)((long)var5 + (UrlRequester.mouseRecorder.millis[var7] - field760) % 20L);
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}

								field843 = var9;
								field633 = var8;
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
								field760 = UrlRequester.mouseRecorder.millis[var7];
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

						if (var4 >= UrlRequester.mouseRecorder.index) {
							UrlRequester.mouseRecorder.index = 0;
						} else {
							class96 var46 = UrlRequester.mouseRecorder;
							var46.index -= var4;
							System.arraycopy(UrlRequester.mouseRecorder.xs, var4, UrlRequester.mouseRecorder.xs, 0, UrlRequester.mouseRecorder.index);
							System.arraycopy(UrlRequester.mouseRecorder.ys, var4, UrlRequester.mouseRecorder.ys, 0, UrlRequester.mouseRecorder.index);
							System.arraycopy(UrlRequester.mouseRecorder.millis, var4, UrlRequester.mouseRecorder.millis, 0, UrlRequester.mouseRecorder.index);
						}
					}
				}

				PacketBufferNode var18;
				if (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator3.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
					if (var16 > 32767L) {
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
					var3 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 < 0) {
						var3 = 0;
					} else if (var3 > class0.canvasHeight) {
						var3 = class0.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX;
					if (var4 < 0) {
						var4 = 0;
					} else if (var4 > AttackOption.canvasWidth) {
						var4 = AttackOption.canvasWidth;
					}

					var5 = (int)var16;
					var18 = InterfaceParent.getPacketBufferNode(ClientPacket.field2586, packetWriter.isaacCipher);
					var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
					var18.packetBuffer.writeShort(var4);
					var18.packetBuffer.writeShort(var3);
					packetWriter.addNode(var18);
				}

				if (KeyHandler.field271 > 0) {
					var14 = InterfaceParent.getPacketBufferNode(ClientPacket.field2594, packetWriter.isaacCipher);
					var14.packetBuffer.writeShort(0);
					var2 = var14.packetBuffer.offset;
					long var19 = ClientPacket.currentTimeMillis();

					for (var5 = 0; var5 < KeyHandler.field271; ++var5) {
						long var21 = var19 - field850;
						if (var21 > 16777215L) {
							var21 = 16777215L;
						}

						field850 = var19;
						var14.packetBuffer.method6660((int)var21);
						var14.packetBuffer.method6639(KeyHandler.field257[var5]);
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				}

				if (field706 > 0) {
					--field706;
				}

				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
					field707 = true;
				}

				if (field707 && field706 <= 0) {
					field706 = 20;
					field707 = false;
					var14 = InterfaceParent.getPacketBufferNode(ClientPacket.field2609, packetWriter.isaacCipher);
					var14.packetBuffer.writeShort(camAngleY);
					var14.packetBuffer.method6705(camAngleX);
					packetWriter.addNode(var14);
				}

				if (class397.hasFocus && !hadFocus) {
					hadFocus = true;
					var14 = InterfaceParent.getPacketBufferNode(ClientPacket.field2581, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(1);
					packetWriter.addNode(var14);
				}

				if (!class397.hasFocus && hadFocus) {
					hadFocus = false;
					var14 = InterfaceParent.getPacketBufferNode(ClientPacket.field2581, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					packetWriter.addNode(var14);
				}

				if (class80.worldMap != null) {
					class80.worldMap.method6239();
				}

				BuddyRankComparator.method2579();
				if (class170.field2016) {
					CollisionMap.method3244();
					class170.field2016 = false;
				}

				if (field853 != SoundSystem.Client_plane) {
					field853 = SoundSystem.Client_plane;
					var1 = SoundSystem.Client_plane;
					int[] var36 = class69.sceneMinimapSprite.pixels;
					var3 = var36.length;

					for (var4 = 0; var4 < var3; ++var4) {
						var36[var4] = 0;
					}

					for (var4 = 1; var4 < 103; ++var4) {
						var5 = (103 - var4) * 2048 + 24628;

						for (var6 = 1; var6 < 103; ++var6) {
							if ((Tiles.Tiles_renderFlags[var1][var6][var4] & 24) == 0) {
								DevicePcmPlayerProvider.scene.drawTileMinimap(var36, var5, 512, var1, var6, var4);
							}

							if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var6][var4] & 8) != 0) {
								DevicePcmPlayerProvider.scene.drawTileMinimap(var36, var5, 512, var1 + 1, var6, var4);
							}

							var5 += 4;
						}
					}

					var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
					var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
					class69.sceneMinimapSprite.setRaster();

					for (var6 = 1; var6 < 103; ++var6) {
						for (var7 = 1; var7 < 103; ++var7) {
							if ((Tiles.Tiles_renderFlags[var1][var7][var6] & 24) == 0) {
								WorldMapIcon_0.drawObject(var1, var7, var6, var4, var5);
							}

							if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var7][var6] & 8) != 0) {
								WorldMapIcon_0.drawObject(var1 + 1, var7, var6, var4, var5);
							}
						}
					}

					mapIconCount = 0;

					for (var6 = 0; var6 < 104; ++var6) {
						for (var7 = 0; var7 < 104; ++var7) {
							long var23 = DevicePcmPlayerProvider.scene.getFloorDecorationTag(SoundSystem.Client_plane, var6, var7);
							if (0L != var23) {
								var10 = Message.Entity_unpackID(var23);
								var11 = Tiles.getObjectDefinition(var10).mapIconId;
								if (var11 >= 0 && Archive.WorldMapElement_get(var11).field1567) {
									mapIcons[mapIconCount] = Archive.WorldMapElement_get(var11).getSpriteBool(false);
									mapIconXs[mapIconCount] = var6;
									mapIconYs[mapIconCount] = var7;
									++mapIconCount;
								}
							}
						}
					}

					AbstractWorldMapData.rasterProvider.apply();
				}

				if (gameState == 30) {
					class17.method261();

					int var10002;
					for (var1 = 0; var1 < soundEffectCount; ++var1) {
						var10002 = queuedSoundEffectDelays[var1]--;
						if (queuedSoundEffectDelays[var1] >= -10) {
							SoundEffect var37 = soundEffects[var1];
							if (var37 == null) {
								var10000 = null;
								var37 = SoundEffect.readSoundEffect(class26.field211, soundEffectIds[var1], 0);
								if (var37 == null) {
									continue;
								}

								int[] var47 = queuedSoundEffectDelays;
								var47[var1] += var37.calculateDelay();
								soundEffects[var1] = var37;
							}

							if (queuedSoundEffectDelays[var1] < 0) {
								if (soundLocations[var1] != 0) {
									var4 = (soundLocations[var1] & 255) * 128;
									var5 = soundLocations[var1] >> 16 & 255;
									var6 = var5 * 128 + 64 - class262.localPlayer.x;
									if (var6 < 0) {
										var6 = -var6;
									}

									var7 = soundLocations[var1] >> 8 & 255;
									var8 = var7 * 128 + 64 - class262.localPlayer.y;
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

									var3 = (var4 - var9) * class4.clientPreferences.areaSoundEffectsVolume / var4;
								} else {
									var3 = class4.clientPreferences.soundEffectsVolume;
								}

								if (var3 > 0) {
									RawSound var25 = var37.toRawSound().resample(WorldMapAreaData.decimator);
									RawPcmStream var26 = RawPcmStream.createRawPcmStream(var25, 100, var3);
									var26.setNumLoops(queuedSoundEffectLoops[var1] - 1);
									UserComparator7.pcmStreamMixer.addSubStream(var26);
								}

								queuedSoundEffectDelays[var1] = -100;
							}
						} else {
							--soundEffectCount;

							for (var2 = var1; var2 < soundEffectCount; ++var2) {
								soundEffectIds[var2] = soundEffectIds[var2 + 1];
								soundEffects[var2] = soundEffects[var2 + 1];
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1];
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1];
								soundLocations[var2] = soundLocations[var2 + 1];
							}

							--var1;
						}
					}

					if (field862 && !ApproximateRouteStrategy.method1269()) {
						if (class4.clientPreferences.musicVolume != 0 && currentTrackGroupId != -1) {
							class105.method2357(DynamicObject.archive6, currentTrackGroupId, 0, class4.clientPreferences.musicVolume, false);
						}

						field862 = false;
					}

					++packetWriter.field1408;
					if (packetWriter.field1408 > 750) {
						ApproximateRouteStrategy.method1268();
					} else {
						WorldMapLabelSize.method3274();

						for (var1 = 0; var1 < npcCount; ++var1) {
							var2 = npcIndices[var1];
							NPC var27 = npcs[var2];
							if (var27 != null) {
								World.updateActorSequence(var27, var27.definition.size);
							}
						}

						WorldMapManager.method3557();
						++field683;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 20;
							if (mouseCrossState * 400 >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (Login.field1034 != null) {
							++field869;
							if (field869 >= 15) {
								Script.invalidateWidget(Login.field1034);
								Login.field1034 = null;
							}
						}

						Widget var35 = MusicPatchNode.mousedOverWidgetIf1;
						Widget var38 = class5.field42;
						MusicPatchNode.mousedOverWidgetIf1 = null;
						class5.field42 = null;
						draggedOnWidget = null;
						field731 = false;
						field821 = false;
						field847 = 0;

						while (SecureRandomCallable.isKeyDown() && field847 < 128) {
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && SoundCache.field446 == 66) {
								String var41 = "";

								Message var39;
								for (Iterator var43 = Messages.Messages_hashTable.iterator(); var43.hasNext(); var41 = var41 + var39.sender + ':' + var39.text + '\n') {
									var39 = (Message)var43.next();
								}

								class1.client.method599(var41);
							} else if (oculusOrbState != 1 || Timer.field3780 <= 0) {
								field786[field847] = SoundCache.field446;
								field848[field847] = Timer.field3780;
								++field847;
							}
						}

						boolean var32 = staffModLevel >= 2;
						PacketBufferNode var28;
						if (var32 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) {
							var4 = class262.localPlayer.plane - mouseWheelRotation;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}

							if (var4 != class262.localPlayer.plane) {
								var5 = class262.localPlayer.pathX[0] + class15.baseX * 64;
								var6 = class262.localPlayer.pathY[0] + WorldMapSprite.baseY * 64;
								var28 = InterfaceParent.getPacketBufferNode(ClientPacket.field2596, packetWriter.isaacCipher);
								var28.packetBuffer.writeShort(var5);
								var28.packetBuffer.method6659(0);
								var28.packetBuffer.method6640(var4);
								var28.packetBuffer.method6648(var6);
								packetWriter.addNode(var28);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							PacketWriter.updateRootInterface(rootInterface, 0, 0, AttackOption.canvasWidth, class0.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var40;
							ScriptEvent var42;
							Widget var44;
							do {
								var42 = (ScriptEvent)field812.removeLast();
								if (var42 == null) {
									while (true) {
										do {
											var42 = (ScriptEvent)field860.removeLast();
											if (var42 == null) {
												while (true) {
													do {
														var42 = (ScriptEvent)scriptEvents.removeLast();
														if (var42 == null) {
															this.menu();
															class19.method282();
															if (clickedWidget != null) {
																this.method1298();
															}

															if (VerticalAlignment.dragInventoryWidget != null) {
																Script.invalidateWidget(VerticalAlignment.dragInventoryWidget);
																++itemDragDuration;
																if (MouseHandler.MouseHandler_currentButton == 0) {
																	if (field734) {
																		if (VerticalAlignment.dragInventoryWidget == UserComparator2.hoveredItemContainer && dragItemSlotSource != dragItemSlotDestination) {
																			Widget var45 = VerticalAlignment.dragInventoryWidget;
																			byte var33 = 0;
																			if (field891 == 1 && var45.contentType == 206) {
																				var33 = 1;
																			}

																			if (var45.itemIds[dragItemSlotDestination] <= 0) {
																				var33 = 0;
																			}

																			var7 = class22.getWidgetFlags(var45);
																			boolean var34 = (var7 >> 29 & 1) != 0;
																			if (var34) {
																				var8 = dragItemSlotSource;
																				var9 = dragItemSlotDestination;
																				var45.itemIds[var9] = var45.itemIds[var8];
																				var45.itemQuantities[var9] = var45.itemQuantities[var8];
																				var45.itemIds[var8] = -1;
																				var45.itemQuantities[var8] = 0;
																			} else if (var33 == 1) {
																				var8 = dragItemSlotSource;
																				var9 = dragItemSlotDestination;

																				while (var8 != var9) {
																					if (var8 > var9) {
																						var45.swapItems(var8 - 1, var8);
																						--var8;
																					} else if (var8 < var9) {
																						var45.swapItems(var8 + 1, var8);
																						++var8;
																					}
																				}
																			} else {
																				var45.swapItems(dragItemSlotDestination, dragItemSlotSource);
																			}

																			PacketBufferNode var29 = InterfaceParent.getPacketBufferNode(ClientPacket.field2635, packetWriter.isaacCipher);
																			var29.packetBuffer.writeIntME(VerticalAlignment.dragInventoryWidget.id);
																			var29.packetBuffer.writeShort(dragItemSlotDestination);
																			var29.packetBuffer.writeShort(dragItemSlotSource);
																			var29.packetBuffer.method6639(var33);
																			packetWriter.addNode(var29);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX, draggedWidgetY);
																	} else if (menuOptionsCount > 0) {
																		var4 = draggedWidgetX;
																		var5 = draggedWidgetY;
																		TaskHandler.method2625(class29.tempMenuAction, var4, var5);
																		class29.tempMenuAction = null;
																	}

																	field869 = 10;
																	MouseHandler.MouseHandler_lastButton = 0;
																	VerticalAlignment.dragInventoryWidget = null;
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
																	field734 = true;
																}
															}

															if (Scene.shouldSendWalk()) {
																var4 = Scene.Scene_selectedX;
																var5 = Scene.Scene_selectedY;
																var18 = InterfaceParent.getPacketBufferNode(ClientPacket.field2670, packetWriter.isaacCipher);
																var18.packetBuffer.writeByte(5);
																var18.packetBuffer.writeShort(WorldMapSprite.baseY * 64 + var5);
																var18.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
																var18.packetBuffer.method6649(class15.baseX * 64 + var4);
																packetWriter.addNode(var18);
																Scene.method4069();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																mouseCrossColor = 1;
																mouseCrossState = 0;
																destinationX = var4;
																destinationY = var5;
															}

															if (var35 != MusicPatchNode.mousedOverWidgetIf1) {
																if (var35 != null) {
																	Script.invalidateWidget(var35);
																}

																if (MusicPatchNode.mousedOverWidgetIf1 != null) {
																	Script.invalidateWidget(MusicPatchNode.mousedOverWidgetIf1);
																}
															}

															if (var38 != class5.field42 && field693 == field773) {
																if (var38 != null) {
																	Script.invalidateWidget(var38);
																}

																if (class5.field42 != null) {
																	Script.invalidateWidget(class5.field42);
																}
															}

															if (class5.field42 != null) {
																if (field773 < field693) {
																	++field773;
																	if (field773 == field693) {
																		Script.invalidateWidget(class5.field42);
																	}
																}
															} else if (field773 > 0) {
																--field773;
															}

															Varps.method4783();
															if (isCameraLocked) {
																Coord.method4790();
															}

															for (var4 = 0; var4 < 5; ++var4) {
																var10002 = field875[var4]++;
															}

															class20.varcs.tryWrite();
															var4 = ClanSettings.method200();
															var5 = KeyHandler.KeyHandler_idleCycles;
															if (var4 > 15000 && var5 > 15000) {
																logoutTimer = 250;
																MouseHandler.MouseHandler_idleCycles = 14500;
																var28 = InterfaceParent.getPacketBufferNode(ClientPacket.field2644, packetWriter.isaacCipher);
																packetWriter.addNode(var28);
															}

															DevicePcmPlayerProvider.friendSystem.processFriendUpdates();
															++packetWriter.pendingWrites;
															if (packetWriter.pendingWrites > 50) {
																var28 = InterfaceParent.getPacketBufferNode(ClientPacket.field2647, packetWriter.isaacCipher);
																packetWriter.addNode(var28);
															}

															try {
																packetWriter.flush();
															} catch (IOException var30) {
																ApproximateRouteStrategy.method1268();
															}

															return;
														}

														var44 = var42.widget;
														if (var44.childIndex < 0) {
															break;
														}

														var40 = WorldMapData_1.getWidget(var44.parentId);
													} while(var40 == null || var40.children == null || var44.childIndex >= var40.children.length || var44 != var40.children[var44.childIndex]);

													WorldMapSection1.runScriptEvent(var42);
												}
											}

											var44 = var42.widget;
											if (var44.childIndex < 0) {
												break;
											}

											var40 = WorldMapData_1.getWidget(var44.parentId);
										} while(var40 == null || var40.children == null || var44.childIndex >= var40.children.length || var44 != var40.children[var44.childIndex]);

										WorldMapSection1.runScriptEvent(var42);
									}
								}

								var44 = var42.widget;
								if (var44.childIndex < 0) {
									break;
								}

								var40 = WorldMapData_1.getWidget(var44.parentId);
							} while(var40 == null || var40.children == null || var44.childIndex >= var40.children.length || var44 != var40.children[var44.childIndex]);

							WorldMapSection1.runScriptEvent(var42);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1382818150"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = AttackOption.canvasWidth;
		int var2 = class0.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (class4.clientPreferences != null) {
			try {
				Client var3 = class1.client;
				Object[] var4 = new Object[]{class302.getWindowedMode()};
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "110"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			class25.method330(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field831[var1]) {
				field712[var1] = true;
			}

			field833[var1] = field831[var1];
			field831[var1] = false;
		}

		field830 = cycle;
		viewportX = -1;
		viewportY = -1;
		UserComparator2.hoveredItemContainer = null;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			SoundSystem.drawWidgets(rootInterface, 0, 0, AttackOption.canvasWidth, class0.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				NPCComposition.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				NPCComposition.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				class15.method241(viewportX, viewportY);
			}
		} else {
			var1 = StructComposition.menuX;
			int var2 = class143.menuY;
			int var3 = UserComparator3.menuWidth;
			int var4 = PendingSpawn.menuHeight;
			int var5 = 6116423;
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5);
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
			class309.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1);
			int var6 = MouseHandler.MouseHandler_x;
			int var7 = MouseHandler.MouseHandler_y;

			for (int var8 = 0; var8 < menuOptionsCount; ++var8) {
				int var9 = (menuOptionsCount - 1 - var8) * 15 + var2 + 31;
				int var10 = 16777215;
				if (var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) {
					var10 = 16776960;
				}

				class309.fontBold12.draw(class0.method1(var8), var1 + 3, var9, var10, 0);
			}

			ReflectionCheck.method1229(StructComposition.menuX, class143.menuY, UserComparator3.menuWidth, PendingSpawn.menuHeight);
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field833[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field712[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		UrlRequest.method2519(SoundSystem.Client_plane, class262.localPlayer.x, class262.localPlayer.y, field683);
		field683 = 0;
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Ldq;I)Z",
		garbageValue = "-372201617"
	)
	final boolean method1655(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var26;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1412) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1408 = 0;
						var1.field1412 = false;
					}

					var3.offset = 0;
					if (var3.method6569()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1408 = 0;
					}

					var1.field1412 = true;
					ServerPacket[] var4 = WorldMapIcon_0.ServerPacket_values();
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
				var1.field1408 = 0;
				timer.method5690();
				var1.field1399 = var1.field1411;
				var1.field1411 = var1.field1410;
				var1.field1410 = var1.serverPacket;
				if (ServerPacket.field2776 == var1.serverPacket) {
					DevicePcmPlayerProvider.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field817 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2704 == var1.serverPacket) {
					if (rootInterface != -1) {
						class8.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				int var7;
				int var17;
				if (ServerPacket.field2774 == var1.serverPacket) {
					WorldMapID.method3717();
					var17 = var3.method6725();
					var5 = var3.readUnsignedByte();
					var6 = var3.method6642();
					experience[var6] = var17;
					currentLevels[var6] = var5;
					levels[var6] = 1;

					for (var7 = 0; var7 < 98; ++var7) {
						if (var17 >= Skills.Skills_experienceTable[var7]) {
							levels[var6] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var6;
					var1.serverPacket = null;
					return true;
				}

				long var18;
				long var20;
				String var22;
				String var48;
				int var54;
				if (ServerPacket.field2732 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					var18 = (long)var3.readUnsignedShort();
					var20 = (long)var3.readMedium();
					PlayerType var9 = (PlayerType)Clock.findEnumerated(class106.PlayerType_values(), var3.readUnsignedByte());
					long var10 = (var18 << 32) + var20;
					boolean var12 = false;

					for (var54 = 0; var54 < 100; ++var54) {
						if (var10 == crossWorldMessageIds[var54]) {
							var12 = true;
							break;
						}
					}

					if (DevicePcmPlayerProvider.friendSystem.isIgnored(new Username(var48, LoginScreenAnimation.loginType))) {
						var12 = true;
					}

					if (!var12 && field629 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var10;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var22 = AbstractFont.escapeBrackets(GrandExchangeEvents.method5182(WorldMapIcon_1.method3304(var3)));
						byte var56;
						if (var9.isPrivileged) {
							var56 = 7;
						} else {
							var56 = 3;
						}

						if (var9.modIcon != -1) {
							UserComparator10.addGameMessage(var56, MusicPatchPcmStream.method4743(var9.modIcon) + var48, var22);
						} else {
							UserComparator10.addGameMessage(var56, var48, var22);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2718 == var1.serverPacket) {
					UrlRequest.method2511(class226.field2686);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2758 == var1.serverPacket) {
					class10.field74 = new class340(class26.HitSplatDefinition_cachedSprites);
					var1.serverPacket = null;
					return true;
				}

				int var8;
				long var23;
				if (ServerPacket.field2736 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					if (var17 == 65535) {
						var17 = -1;
					}

					var5 = var3.readInt();
					var6 = var3.method6725();
					var7 = var3.method6653();
					if (var7 == 65535) {
						var7 = -1;
					}

					for (var8 = var17; var8 <= var7; ++var8) {
						var23 = ((long)var5 << 32) + (long)var8;
						Node var53 = widgetFlags.get(var23);
						if (var53 != null) {
							var53.remove();
						}

						widgetFlags.put(new IntegerNode(var6), var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2766 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						WorldMapRectangle.method3709(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2724 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readInt();
					var6 = class29.getGcDuration();
					PacketBufferNode var61 = InterfaceParent.getPacketBufferNode(ClientPacket.field2576, packetWriter.isaacCipher);
					var61.packetBuffer.method6641(GameEngine.fps);
					var61.packetBuffer.method6659(var17);
					var61.packetBuffer.method6658(var5);
					var61.packetBuffer.writeByte(var6);
					packetWriter.addNode(var61);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2705 == var1.serverPacket) {
					isCameraLocked = false;

					for (var17 = 0; var17 < 5; ++var17) {
						field871[var17] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var68;
				if (ServerPacket.field2708 == var1.serverPacket) {
					var17 = var3.method6662();
					var68 = WorldMapData_1.getWidget(var17);
					var68.modelType = 3;
					var68.modelId = class262.localPlayer.appearance.getChatHeadId();
					Script.invalidateWidget(var68);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2771 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field871[var17] = true;
					field872[var17] = var5;
					field873[var17] = var6;
					field867[var17] = var7;
					field875[var17] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2765 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					Object[] var72 = new Object[var48.length() + 1];

					for (var6 = var48.length() - 1; var6 >= 0; --var6) {
						if (var48.charAt(var6) == 's') {
							var72[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var72[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var72[0] = new Integer(var3.readInt());
					ScriptEvent var79 = new ScriptEvent();
					var79.args = var72;
					WorldMapSection1.runScriptEvent(var79);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2779 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					var26 = AbstractFont.escapeBrackets(GrandExchangeEvents.method5182(WorldMapIcon_1.method3304(var3)));
					UserComparator10.addGameMessage(6, var48, var26);
					var1.serverPacket = null;
					return true;
				}

				byte var58;
				if (ServerPacket.field2795 == var1.serverPacket) {
					SecureRandomFuture.method2085();
					var58 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var58 >= 0) {
							currentClanSettings[var58] = null;
						} else {
							WorldMapManager.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var58 >= 0) {
						currentClanSettings[var58] = new ClanSettings(var3);
					} else {
						WorldMapManager.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2753 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var17] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var17] = new GrandExchangeOffer(var3, false);
					}

					field827 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2709 == var1.serverPacket) {
					WorldMapID.method3717();
					weight = var3.readShort();
					field823 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2762 == var1.serverPacket) {
					UrlRequest.method2511(class226.field2687);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2722 == var1.serverPacket) {
					class16.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				Widget var59;
				if (ServerPacket.field2799 == var1.serverPacket) {
					var17 = var3.method6653();
					if (var17 == 65535) {
						var17 = -1;
					}

					var5 = var3.method6662();
					var6 = var3.method6725();
					var59 = WorldMapData_1.getWidget(var5);
					ItemComposition var71;
					if (!var59.isIf3) {
						if (var17 == -1) {
							var59.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var71 = class250.ItemDefinition_get(var17);
						var59.modelType = 4;
						var59.modelId = var17;
						var59.modelAngleX = var71.xan2d;
						var59.modelAngleY = var71.yan2d;
						var59.modelZoom = var71.zoom2d * 100 / var6;
						Script.invalidateWidget(var59);
					} else {
						var59.itemId = var17;
						var59.itemQuantity = var6;
						var71 = class250.ItemDefinition_get(var17);
						var59.modelAngleX = var71.xan2d;
						var59.modelAngleY = var71.yan2d;
						var59.modelAngleZ = var71.zan2d;
						var59.modelOffsetX = var71.offsetX2d;
						var59.modelOffsetY = var71.offsetY2d;
						var59.modelZoom = var71.zoom2d;
						if (var71.isStackable == 1) {
							var59.itemQuantityMode = 1;
						} else {
							var59.itemQuantityMode = 2;
						}

						if (var59.field3011 > 0) {
							var59.modelZoom = var59.modelZoom * 32 / var59.field3011;
						} else if (var59.rawWidth > 0) {
							var59.modelZoom = var59.modelZoom * 32 / var59.rawWidth;
						}

						Script.invalidateWidget(var59);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2750 == var1.serverPacket) {
					SecureRandomFuture.method2085();
					var58 = var3.readByte();
					class2 var70 = new class2(var3);
					ClanSettings var78;
					if (var58 >= 0) {
						var78 = currentClanSettings[var58];
					} else {
						var78 = WorldMapManager.guestClanSettings;
					}

					var70.method24(var78);
					var1.serverPacket = null;
					return true;
				}

				boolean var63;
				if (ServerPacket.field2707 == var1.serverPacket) {
					var63 = var3.readUnsignedByte() == 1;
					if (var63) {
						WorldMapEvent.field2150 = ClientPacket.currentTimeMillis() - var3.readLong();
						class267.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						class267.grandExchangeEvents = null;
					}

					field822 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2759 == var1.serverPacket) {
					isCameraLocked = true;
					SoundCache.field448 = var3.readUnsignedByte() * 16384;
					AttackOption.field1351 = var3.readUnsignedByte() * 128;
					field659 = var3.readUnsignedShort();
					Message.field602 = var3.readUnsignedByte();
					FloorUnderlayDefinition.field1707 = var3.readUnsignedByte();
					if (FloorUnderlayDefinition.field1707 >= 100) {
						ObjectSound.cameraX = SoundCache.field448 * 128 + 64;
						Canvas.cameraZ = AttackOption.field1351 * 16384 + 64;
						class160.cameraY = ItemContainer.getTileHeight(ObjectSound.cameraX, Canvas.cameraZ, SoundSystem.Client_plane) - field659;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2706 == var1.serverPacket) {
					UrlRequest.method2511(class226.field2693);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2746 == var1.serverPacket) {
					UrlRequest.method2511(class226.field2689);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2740 == var1.serverPacket) {
					World var50 = new World();
					var50.host = var3.readStringCp1252NullTerminated();
					var50.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var50.properties = var5;
					Projectile.updateGameState(45);
					var2.close();
					var2 = null;
					GrandExchangeOfferAgeComparator.changeWorld(var50);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2792 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.method6757();
					var6 = var3.method6654();
					var59 = WorldMapData_1.getWidget(var17);
					if (var5 != var59.rawX || var6 != var59.rawY || var59.xAlignment != 0 || var59.yAlignment != 0) {
						var59.rawX = var5;
						var59.rawY = var6;
						var59.xAlignment = 0;
						var59.yAlignment = 0;
						Script.invalidateWidget(var59);
						this.alignWidget(var59);
						if (var59.type == 0) {
							WorldMapLabelSize.revalidateWidgetScroll(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var17 >> 16], var59, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2777 == var1.serverPacket) {
					UrlRequest.method2511(class226.field2690);
					var1.serverPacket = null;
					return true;
				}

				int var29;
				int var30;
				if (ServerPacket.field2743 == var1.serverPacket) {
					isCameraLocked = true;
					WorldMapIcon_0.field2029 = var3.readUnsignedByte() * 128;
					class44.field315 = var3.readUnsignedByte() * 16384;
					FriendsChatManager.field3815 = var3.readUnsignedShort();
					GrandExchangeOfferOwnWorldComparator.field607 = var3.readUnsignedByte();
					class20.field166 = var3.readUnsignedByte();
					if (class20.field166 >= 100) {
						var17 = WorldMapIcon_0.field2029 * 16384 + 64;
						var5 = class44.field315 * 128 + 64;
						var6 = ItemContainer.getTileHeight(var17, var5, SoundSystem.Client_plane) - FriendsChatManager.field3815;
						var7 = var17 - ObjectSound.cameraX;
						var8 = var6 - class160.cameraY;
						var29 = var5 - Canvas.cameraZ;
						var30 = (int)Math.sqrt((double)(var7 * var7 + var29 * var29));
						class69.cameraPitch = (int)(Math.atan2((double)var8, (double)var30) * 325.949D) & 2047;
						class32.cameraYaw = (int)(Math.atan2((double)var7, (double)var29) * -325.949D) & 2047;
						if (class69.cameraPitch < 128) {
							class69.cameraPitch = 128;
						}

						if (class69.cameraPitch > 383) {
							class69.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2726 == var1.serverPacket) {
					class126.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2786 == var1.serverPacket) {
					PcmPlayer.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2721 == var1.serverPacket) {
					DevicePcmPlayerProvider.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					World.FriendSystem_invalidateIgnoreds();
					field817 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2703 == var1.serverPacket) {
					var17 = var3.method6651();
					byte var57 = var3.method6682();
					Varps.Varps_temp[var17] = var57;
					if (Varps.Varps_main[var17] != var57) {
						Varps.Varps_main[var17] = var57;
					}

					class6.changeGameOptions(var17);
					changedVarps[++changedVarpCount - 1 & 31] = var17;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2723 == var1.serverPacket) {
					var17 = var3.method6653();
					var5 = var3.method6675();
					Varps.Varps_temp[var17] = var5;
					if (Varps.Varps_main[var17] != var5) {
						Varps.Varps_main[var17] = var5;
					}

					class6.changeGameOptions(var17);
					changedVarps[++changedVarpCount - 1 & 31] = var17;
					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var25;
				if (ServerPacket.field2751 == var1.serverPacket) {
					var17 = var3.method6644();
					var5 = var3.method6725();
					var6 = var3.method6651();
					var25 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var25 != null) {
						InvDefinition.closeInterface(var25, var6 != var25.group);
					}

					FriendSystem.method1867(var5, var6, var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2768 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					ViewportMouse.method4410(var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2757 == var1.serverPacket) {
					KeyHandler.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2791 == var1.serverPacket) {
					var17 = var3.method6662();
					var68 = WorldMapData_1.getWidget(var17);

					for (var6 = 0; var6 < var68.itemIds.length; ++var6) {
						var68.itemIds[var6] = -1;
						var68.itemIds[var6] = 0;
					}

					Script.invalidateWidget(var68);
					var1.serverPacket = null;
					return true;
				}

				Widget var27;
				if (ServerPacket.field2775 == var1.serverPacket) {
					var17 = var3.method6654();
					var5 = var3.method6675();
					var27 = WorldMapData_1.getWidget(var5);
					if (var17 != var27.sequenceId || var17 == -1) {
						var27.sequenceId = var17;
						var27.modelFrame = 0;
						var27.modelFrameCycle = 0;
						Script.invalidateWidget(var27);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2778 == var1.serverPacket) {
					class10.field74 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2748 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					ClanSettings.queueSoundEffect(var17, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2783 == var1.serverPacket) {
					class15.field128 = var3.method6643();
					WorldMapSection0.field2047 = var3.method6642();
					var1.serverPacket = null;
					return true;
				}

				String var74;
				if (ServerPacket.field2710 == var1.serverPacket) {
					var17 = var3.method6643();
					var5 = var3.readUnsignedByte();
					var74 = var3.readStringCp1252NullTerminated();
					if (var5 >= 1 && var5 <= 8) {
						if (var74.equalsIgnoreCase("null")) {
							var74 = null;
						}

						playerMenuActions[var5 - 1] = var74;
						playerOptionsPriorities[var5 - 1] = var17 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2725 == var1.serverPacket) {
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
						hintArrowHeight = var3.readUnsignedByte() * 2;
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2782 == var1.serverPacket) {
					for (var17 = 0; var17 < Varps.Varps_main.length; ++var17) {
						if (Varps.Varps_temp[var17] != Varps.Varps_main[var17]) {
							Varps.Varps_main[var17] = Varps.Varps_temp[var17];
							class6.changeGameOptions(var17);
							changedVarps[++changedVarpCount - 1 & 31] = var17;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var28;
				if (ServerPacket.field2755 == var1.serverPacket) {
					var17 = var3.method6653();
					var5 = var3.method6675();
					var6 = var3.method6652();
					var7 = var3.method6652();
					var28 = WorldMapData_1.getWidget(var5);
					if (var17 != var28.modelAngleX || var6 != var28.modelAngleY || var7 != var28.modelZoom) {
						var28.modelAngleX = var17;
						var28.modelAngleY = var6;
						var28.modelZoom = var7;
						Script.invalidateWidget(var28);
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var51;
				if (ServerPacket.field2737 == var1.serverPacket) {
					var17 = var3.readUShortSmart();
					var51 = var3.readUnsignedByte() == 1;
					var74 = "";
					boolean var52 = false;
					if (var51) {
						var74 = var3.readStringCp1252NullTerminated();
						if (DevicePcmPlayerProvider.friendSystem.isIgnored(new Username(var74, LoginScreenAnimation.loginType))) {
							var52 = true;
						}
					}

					String var66 = var3.readStringCp1252NullTerminated();
					if (!var52) {
						UserComparator10.addGameMessage(var17, var74, var66);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2752 == var1.serverPacket) {
					field820 = cycleCntr;
					var58 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var58 >= 0) {
							currentClanChannels[var58] = null;
						} else {
							AttackOption.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var58 >= 0) {
						currentClanChannels[var58] = new ClanChannel(var3);
					} else {
						AttackOption.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2796 == var1.serverPacket) {
					var17 = var3.method6652();
					var5 = var3.method6725();
					var6 = var3.method6651();
					var59 = WorldMapData_1.getWidget(var5);
					var59.field2981 = var17 + (var6 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2738 == var1.serverPacket) {
					var17 = var3.method6675();
					var5 = var3.method6653();
					var27 = WorldMapData_1.getWidget(var17);
					if (var27.modelType != 1 || var5 != var27.modelId) {
						var27.modelType = 1;
						var27.modelId = var5;
						Script.invalidateWidget(var27);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2773 == var1.serverPacket) {
					WorldMapID.method3717();
					runEnergy = var3.readUnsignedByte();
					field823 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2767 == var1.serverPacket) {
					class16.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2789 == var1.serverPacket) {
					var63 = var3.readBoolean();
					if (var63) {
						if (LoginPacket.field2800 == null) {
							LoginPacket.field2800 = new class286();
						}
					} else {
						LoginPacket.field2800 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2770 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var17 < -70000) {
						var5 += 32768;
					}

					if (var17 >= 0) {
						var27 = WorldMapData_1.getWidget(var17);
					} else {
						var27 = null;
					}

					for (; var3.offset < var1.serverPacketLength; ByteArrayPool.itemContainerSetItem(var5, var7, var8 - 1, var29)) {
						var7 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var29 = 0;
						if (var8 != 0) {
							var29 = var3.readUnsignedByte();
							if (var29 == 255) {
								var29 = var3.readInt();
							}
						}

						if (var27 != null && var7 >= 0 && var7 < var27.itemIds.length) {
							var27.itemIds[var7] = var8;
							var27.itemQuantities[var7] = var29;
						}
					}

					if (var27 != null) {
						Script.invalidateWidget(var27);
					}

					WorldMapID.method3717();
					changedItemContainers[++field711 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2794 == var1.serverPacket) {
					UrlRequest.method2511(class226.field2691);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2745 == var1.serverPacket) {
					var17 = var3.method6662();
					var5 = var3.method6652();
					var27 = WorldMapData_1.getWidget(var17);
					if (var27 != null && var27.type == 0) {
						if (var5 > var27.scrollHeight - var27.height) {
							var5 = var27.scrollHeight - var27.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var27.scrollY) {
							var27.scrollY = var5;
							Script.invalidateWidget(var27);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2760 == var1.serverPacket) {
					DevicePcmPlayerProvider.friendSystem.method1817();
					field817 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2797 == var1.serverPacket) {
					ClanChannel.privateChatMode = class244.method4812(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2763 == var1.serverPacket) {
					var17 = var3.method6652();
					MouseHandler.method750(var17);
					changedItemContainers[++field711 - 1 & 31] = var17 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2728 == var1.serverPacket) {
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

				if (ServerPacket.field2784 == var1.serverPacket) {
					var17 = var3.readInt();
					InterfaceParent var67 = (InterfaceParent)interfaceParents.get((long)var17);
					if (var67 != null) {
						InvDefinition.closeInterface(var67, true);
					}

					if (meslayerContinueWidget != null) {
						Script.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2719 == var1.serverPacket) {
					var17 = var3.method6651();
					var5 = var3.method6662();
					var6 = var17 >> 10 & 31;
					var7 = var17 >> 5 & 31;
					var8 = var17 & 31;
					var29 = (var7 << 11) + (var6 << 19) + (var8 << 3);
					Widget var77 = WorldMapData_1.getWidget(var5);
					if (var29 != var77.color) {
						var77.color = var29;
						Script.invalidateWidget(var77);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2747 == var1.serverPacket) {
					UrlRequest.method2511(class226.field2684);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2731 == var1.serverPacket) {
					if (class289.friendsChatManager != null) {
						class289.friendsChatManager.method5751(var3);
					}

					class248.method4916();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2711 == var1.serverPacket) {
					class15.field128 = var3.method6644();
					WorldMapSection0.field2047 = var3.method6643();

					while (var3.offset < var1.serverPacketLength) {
						var17 = var3.readUnsignedByte();
						class226 var65 = WorldMapData_1.method3582()[var17];
						UrlRequest.method2511(var65);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2790 == var1.serverPacket) {
					var58 = var3.readByte();
					var18 = (long)var3.readUnsignedShort();
					var20 = (long)var3.readMedium();
					var23 = var20 + (var18 << 32);
					boolean var75 = false;
					ClanChannel var33 = var58 >= 0 ? currentClanChannels[var58] : AttackOption.guestClanChannel;
					if (var33 == null) {
						var75 = true;
					} else {
						for (var54 = 0; var54 < 100; ++var54) {
							if (var23 == crossWorldMessageIds[var54]) {
								var75 = true;
								break;
							}
						}
					}

					if (!var75) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var23;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var22 = WorldMapIcon_1.method3304(var3);
						int var55 = var58 >= 0 ? 43 : 46;
						SecureRandomCallable.addChatMessage(var55, "", var22, var33.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2749 == var1.serverPacket) {
					byte[] var49 = new byte[var1.serverPacketLength];
					var3.method6561(var49, 0, var49.length);
					Buffer var64 = new Buffer(var49);
					var74 = var64.readStringCp1252NullTerminated();
					AttackOption.openURL(var74, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2727 == var1.serverPacket) {
					TaskHandler.method2615(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2772 == var1.serverPacket) {
					UrlRequest.method2511(class226.field2683);
					var1.serverPacket = null;
					return true;
				}

				int var15;
				long var34;
				String var36;
				if (ServerPacket.field2793 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					var18 = var3.readLong();
					var20 = (long)var3.readUnsignedShort();
					var23 = (long)var3.readMedium();
					PlayerType var11 = (PlayerType)Clock.findEnumerated(class106.PlayerType_values(), var3.readUnsignedByte());
					var34 = var23 + (var20 << 32);
					boolean var14 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var34) {
							var14 = true;
							break;
						}
					}

					if (var11.isUser && DevicePcmPlayerProvider.friendSystem.isIgnored(new Username(var48, LoginScreenAnimation.loginType))) {
						var14 = true;
					}

					if (!var14 && field629 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var34;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var36 = AbstractFont.escapeBrackets(GrandExchangeEvents.method5182(WorldMapIcon_1.method3304(var3)));
						if (var11.modIcon != -1) {
							SecureRandomCallable.addChatMessage(9, MusicPatchPcmStream.method4743(var11.modIcon) + var48, var36, class80.base37DecodeLong(var18));
						} else {
							SecureRandomCallable.addChatMessage(9, var48, var36, class80.base37DecodeLong(var18));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2712 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2735 == var1.serverPacket) {
					if (class10.field74 == null) {
						class10.field74 = new class340(class26.HitSplatDefinition_cachedSprites);
					}

					class391 var47 = class26.HitSplatDefinition_cachedSprites.method6052(var3);
					class10.field74.field3919.vmethod6398(var47.field4226, var47.field4227);
					field814[++field759 - 1 & 31] = var47.field4226;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2739 == var1.serverPacket) {
					var58 = var3.readByte();
					var26 = var3.readStringCp1252NullTerminated();
					long var37 = (long)var3.readUnsignedShort();
					long var39 = (long)var3.readMedium();
					PlayerType var76 = (PlayerType)Clock.findEnumerated(class106.PlayerType_values(), var3.readUnsignedByte());
					long var41 = (var37 << 32) + var39;
					boolean var13 = false;
					ClanChannel var43 = null;
					var43 = var58 >= 0 ? currentClanChannels[var58] : AttackOption.guestClanChannel;
					if (var43 == null) {
						var13 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var76.isUser && DevicePcmPlayerProvider.friendSystem.isIgnored(new Username(var26, LoginScreenAnimation.loginType))) {
									var13 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var41) {
								var13 = true;
								break;
							}

							++var15;
						}
					}

					if (!var13) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var41;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var36 = AbstractFont.escapeBrackets(WorldMapIcon_1.method3304(var3));
						int var16 = var58 >= 0 ? 41 : 44;
						if (var76.modIcon != -1) {
							SecureRandomCallable.addChatMessage(var16, MusicPatchPcmStream.method4743(var76.modIcon) + var26, var36, var43.name);
						} else {
							SecureRandomCallable.addChatMessage(var16, var26, var36, var43.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2717 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readInt();
					InterfaceParent var73 = (InterfaceParent)interfaceParents.get((long)var5);
					var25 = (InterfaceParent)interfaceParents.get((long)var17);
					if (var25 != null) {
						InvDefinition.closeInterface(var25, var73 == null || var25.group != var73.group);
					}

					if (var73 != null) {
						var73.remove();
						interfaceParents.put(var73, (long)var17);
					}

					var28 = WorldMapData_1.getWidget(var5);
					if (var28 != null) {
						Script.invalidateWidget(var28);
					}

					var28 = WorldMapData_1.getWidget(var17);
					if (var28 != null) {
						Script.invalidateWidget(var28);
						WorldMapLabelSize.revalidateWidgetScroll(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var28.id >>> 16], var28, true);
					}

					if (rootInterface != -1) {
						class8.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2761 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					class2.forceDisconnect(var17);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2781 == var1.serverPacket) {
					UrlRequest.method2511(class226.field2692);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2720 == var1.serverPacket) {
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

				if (ServerPacket.field2733 == var1.serverPacket) {
					field820 = cycleCntr;
					var58 = var3.readByte();
					class19 var62 = new class19(var3);
					ClanChannel var69;
					if (var58 >= 0) {
						var69 = currentClanChannels[var58];
					} else {
						var69 = AttackOption.guestClanChannel;
					}

					var62.method278(var69);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2714 == var1.serverPacket) {
					WorldMapSection0.field2047 = var3.method6643();
					class15.field128 = var3.method6642();

					for (var17 = WorldMapSection0.field2047; var17 < WorldMapSection0.field2047 + 8; ++var17) {
						for (var5 = class15.field128; var5 < class15.field128 + 8; ++var5) {
							if (groundItems[SoundSystem.Client_plane][var17][var5] != null) {
								groundItems[SoundSystem.Client_plane][var17][var5] = null;
								class26.updateItemPile(var17, var5);
							}
						}
					}

					for (PendingSpawn var46 = (PendingSpawn)pendingSpawns.last(); var46 != null; var46 = (PendingSpawn)pendingSpawns.previous()) {
						if (var46.x >= WorldMapSection0.field2047 && var46.x < WorldMapSection0.field2047 + 8 && var46.y >= class15.field128 && var46.y < class15.field128 + 8 && var46.plane == SoundSystem.Client_plane) {
							var46.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2715 == var1.serverPacket) {
					UrlRequest.method2511(class226.field2688);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2713 == var1.serverPacket) {
					if (var1.serverPacketLength == 0) {
						class289.friendsChatManager = null;
					} else {
						if (class289.friendsChatManager == null) {
							class289.friendsChatManager = new FriendsChatManager(LoginScreenAnimation.loginType, class1.client);
						}

						class289.friendsChatManager.readUpdate(var3);
					}

					class248.method4916();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2744 == var1.serverPacket) {
					var17 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						TextureProvider.Widget_resetModelFrames(rootInterface);
						ScriptFrame.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							field831[var7] = true;
						}
					}

					InterfaceParent var31;
					for (; var6-- > 0; var31.field1148 = true) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var29 = var3.readUnsignedByte();
						var31 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var31 != null && var8 != var31.group) {
							InvDefinition.closeInterface(var31, true);
							var31 = null;
						}

						if (var31 == null) {
							var31 = FriendSystem.method1867(var7, var8, var29);
						}
					}

					for (var25 = (InterfaceParent)interfaceParents.first(); var25 != null; var25 = (InterfaceParent)interfaceParents.next()) {
						if (var25.field1148) {
							var25.field1148 = false;
						} else {
							InvDefinition.closeInterface(var25, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var17) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var29 = var3.readUnsignedShort();
						var30 = var3.readInt();

						for (int var32 = var8; var32 <= var29; ++var32) {
							var34 = ((long)var7 << 32) + (long)var32;
							widgetFlags.put(new IntegerNode(var30), var34);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2756 == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShort() * 30;
					field823 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2734 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var17 < -70000) {
						var5 += 32768;
					}

					if (var17 >= 0) {
						var27 = WorldMapData_1.getWidget(var17);
					} else {
						var27 = null;
					}

					if (var27 != null) {
						for (var7 = 0; var7 < var27.itemIds.length; ++var7) {
							var27.itemIds[var7] = 0;
							var27.itemQuantities[var7] = 0;
						}
					}

					class126.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var7; ++var8) {
						var29 = var3.method6642();
						if (var29 == 255) {
							var29 = var3.method6675();
						}

						var30 = var3.method6652();
						if (var27 != null && var8 < var27.itemIds.length) {
							var27.itemIds[var8] = var30;
							var27.itemQuantities[var8] = var29;
						}

						ByteArrayPool.itemContainerSetItem(var5, var8, var30 - 1, var29);
					}

					if (var27 != null) {
						Script.invalidateWidget(var27);
					}

					WorldMapID.method3717();
					changedItemContainers[++field711 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2730 == var1.serverPacket) {
					KeyHandler.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2780 == var1.serverPacket) {
					var17 = var3.method6652();
					if (var17 == 65535) {
						var17 = -1;
					}

					class6.playSong(var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2769 == var1.serverPacket) {
					var17 = var3.method6653();
					if (var17 == 65535) {
						var17 = -1;
					}

					var5 = var3.readMedium();
					ReflectionCheck.method1230(var17, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2764 == var1.serverPacket) {
					UserComparator9.updatePlayers(var3, var1.serverPacketLength);
					EnumComposition.method2827();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2785 == var1.serverPacket) {
					var17 = var3.readInt();
					if (var17 != field704) {
						field704 = var17;
						FriendsChatManager.method5760();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2742 == var1.serverPacket) {
					var17 = var3.method6675();
					var51 = var3.method6643() == 1;
					var27 = WorldMapData_1.getWidget(var17);
					if (var51 != var27.isHidden) {
						var27.isHidden = var51;
						Script.invalidateWidget(var27);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2716 == var1.serverPacket) {
					for (var17 = 0; var17 < SoundSystem.VarpDefinition_fileCount; ++var17) {
						VarpDefinition var60 = class1.VarpDefinition_get(var17);
						if (var60 != null) {
							Varps.Varps_temp[var17] = 0;
							Varps.Varps_main[var17] = 0;
						}
					}

					WorldMapID.method3717();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2798 == var1.serverPacket) {
					var17 = var3.method6662();
					var5 = var3.method6652();
					var27 = WorldMapData_1.getWidget(var17);
					if (var27.modelType != 2 || var5 != var27.modelId) {
						var27.modelType = 2;
						var27.modelId = var5;
						Script.invalidateWidget(var27);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2754 == var1.serverPacket) {
					tradeChatMode = var3.method6644();
					publicChatMode = var3.method6644();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2741 == var1.serverPacket) {
					var17 = var3.method6651();
					rootInterface = var17;
					this.resizeRoot(false);
					TextureProvider.Widget_resetModelFrames(var17);
					ScriptFrame.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field831[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2729 == var1.serverPacket) {
					var17 = var3.method6662();
					var26 = var3.readStringCp1252NullTerminated();
					var27 = WorldMapData_1.getWidget(var17);
					if (!var26.equals(var27.text)) {
						var27.text = var26;
						Script.invalidateWidget(var27);
					}

					var1.serverPacket = null;
					return true;
				}

				FriendsChatManager.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1411 != null ? var1.field1411.id : -1) + "," + (var1.field1399 != null ? var1.field1399.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				PcmPlayer.logOut();
			} catch (IOException var44) {
				ApproximateRouteStrategy.method1268();
			} catch (Exception var45) {
				var26 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1411 != null ? var1.field1411.id : -1) + "," + (var1.field1399 != null ? var1.field1399.id : -1) + "," + var1.serverPacketLength + "," + (class262.localPlayer.pathX[0] + class15.baseX * 64) + "," + (class262.localPlayer.pathY[0] + WorldMapSprite.baseY * 64) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var26 = var26 + var3.array[var6] + ",";
				}

				FriendsChatManager.RunException_sendStackTrace(var26, var45);
				PcmPlayer.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2138631971"
	)
	@Export("menu")
	final void menu() {
		Skeleton.method4034();
		if (VerticalAlignment.dragInventoryWidget == null) {
			if (clickedWidget == null) {
				int var1 = MouseHandler.MouseHandler_lastButton;
				int var2;
				int var3;
				int var4;
				int var5;
				int var8;
				int var10;
				int var14;
				int var18;
				if (isMenuOpen) {
					if (var1 != 1 && (UserComparator3.mouseCam || var1 != 4)) {
						var2 = MouseHandler.MouseHandler_x;
						var3 = MouseHandler.MouseHandler_y;
						if (var2 < StructComposition.menuX - 10 || var2 > StructComposition.menuX + UserComparator3.menuWidth + 10 || var3 < class143.menuY - 10 || var3 > class143.menuY + PendingSpawn.menuHeight + 10) {
							isMenuOpen = false;
							AccessFile.method6437(StructComposition.menuX, class143.menuY, UserComparator3.menuWidth, PendingSpawn.menuHeight);
						}
					}

					if (var1 == 1 || !UserComparator3.mouseCam && var1 == 4) {
						var2 = StructComposition.menuX;
						var3 = class143.menuY;
						var4 = UserComparator3.menuWidth;
						var5 = MouseHandler.MouseHandler_lastPressedX;
						var14 = MouseHandler.MouseHandler_lastPressedY;
						int var17 = -1;

						for (var8 = 0; var8 < menuOptionsCount; ++var8) {
							var18 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31;
							if (var5 > var2 && var5 < var2 + var4 && var14 > var18 - 13 && var14 < var18 + 3) {
								var17 = var8;
							}
						}

						if (var17 != -1 && var17 >= 0) {
							var8 = menuArguments1[var17];
							var18 = menuArguments2[var17];
							var10 = menuOpcodes[var17];
							int var11 = menuIdentifiers[var17];
							String var12 = menuActions[var17];
							String var13 = menuTargets[var17];
							GameObject.menuAction(var8, var18, var10, var11, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}

						isMenuOpen = false;
						AccessFile.method6437(StructComposition.menuX, class143.menuY, UserComparator3.menuWidth, PendingSpawn.menuHeight);
					}
				} else {
					var2 = HealthBarUpdate.method2283();
					if ((var1 == 1 || !UserComparator3.mouseCam && var1 == 4) && var2 >= 0) {
						var3 = menuOpcodes[var2];
						if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) {
							label246: {
								var4 = menuArguments1[var2];
								var5 = menuArguments2[var2];
								Widget var6 = WorldMapData_1.getWidget(var5);
								var8 = class22.getWidgetFlags(var6);
								boolean var7 = (var8 >> 28 & 1) != 0;
								if (!var7) {
									var10 = class22.getWidgetFlags(var6);
									boolean var9 = (var10 >> 29 & 1) != 0;
									if (!var9) {
										break label246;
									}
								}

								if (VerticalAlignment.dragInventoryWidget != null && !field734 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
									var18 = draggedWidgetX;
									var10 = draggedWidgetY;
									TaskHandler.method2625(class29.tempMenuAction, var18, var10);
									class29.tempMenuAction = null;
								}

								field734 = false;
								itemDragDuration = 0;
								if (VerticalAlignment.dragInventoryWidget != null) {
									Script.invalidateWidget(VerticalAlignment.dragInventoryWidget);
								}

								VerticalAlignment.dragInventoryWidget = WorldMapData_1.getWidget(var5);
								dragItemSlotSource = var4;
								draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
								draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
								if (var2 >= 0) {
									WorldMapIcon_1.method3305(var2);
								}

								Script.invalidateWidget(VerticalAlignment.dragInventoryWidget);
								return;
							}
						}
					}

					if ((var1 == 1 || !UserComparator3.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) {
						var1 = 2;
					}

					if ((var1 == 1 || !UserComparator3.mouseCam && var1 == 4) && menuOptionsCount > 0 && var2 >= 0) {
						var3 = menuArguments1[var2];
						var4 = menuArguments2[var2];
						var5 = menuOpcodes[var2];
						var14 = menuIdentifiers[var2];
						String var15 = menuActions[var2];
						String var16 = menuTargets[var2];
						GameObject.menuAction(var3, var4, var5, var14, var15, var16, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}

					if (var1 == 2 && menuOptionsCount > 0) {
						this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
				}

			}
		}
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "87"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = HealthBarUpdate.method2283();
		boolean var2 = leftClickOpensMenu == 1 && menuOptionsCount > 2;
		if (!var2) {
			boolean var3;
			if (var1 < 0) {
				var3 = false;
			} else {
				int var4 = menuOpcodes[var1];
				if (var4 >= 2000) {
					var4 -= 2000;
				}

				if (var4 == 1007) {
					var3 = true;
				} else {
					var3 = false;
				}
			}

			var2 = var3;
		}

		return var2 && !menuShiftClick[var1];
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1519538256"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		GrandExchangeEvent.method5222(var1, var2);
		DevicePcmPlayerProvider.scene.menuOpen(SoundSystem.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "574875607"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		JagexCache.method2637(rootInterface, AttackOption.canvasWidth, class0.canvasHeight, var1);
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)V",
		garbageValue = "1629073496"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : WorldMapData_1.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = AttackOption.canvasWidth;
			var4 = class0.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		FontName.alignWidgetSize(var1, var3, var4, false);
		class43.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1390072147"
	)
	final void method1298() {
		Script.invalidateWidget(clickedWidget);
		++UserComparator7.widgetDragDuration;
		if (field731 && field821) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field801) {
				var1 = field801;
			}

			if (var1 + clickedWidget.width > field801 + clickedWidgetParent.width) {
				var1 = field801 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field802) {
				var2 = field802;
			}

			if (var2 + clickedWidget.height > field802 + clickedWidgetParent.height) {
				var2 = field802 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field804;
			int var4 = var2 - field805;
			int var5 = clickedWidget.dragZoneSize;
			if (UserComparator7.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field801 + clickedWidgetParent.scrollX;
			int var7 = var2 - field802 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				WorldMapSection1.runScriptEvent(var8);
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
						WorldMapSection1.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && PlayerComposition.method4851(clickedWidget) != null) {
						PacketBufferNode var11 = InterfaceParent.getPacketBufferNode(ClientPacket.field2621, packetWriter.isaacCipher);
						var11.packetBuffer.method6659(draggedOnWidget.id);
						var11.packetBuffer.method6648(draggedOnWidget.childIndex);
						var11.packetBuffer.method6705(draggedOnWidget.itemId);
						var11.packetBuffer.method6658(clickedWidget.id);
						var11.packetBuffer.method6649(clickedWidget.itemId);
						var11.packetBuffer.method6705(clickedWidget.childIndex);
						packetWriter.addNode(var11);
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field804 + widgetClickX, field805 + widgetClickY);
				} else if (menuOptionsCount > 0) {
					int var10 = field804 + widgetClickX;
					int var9 = widgetClickY + field805;
					TaskHandler.method2625(class29.tempMenuAction, var10, var9);
					class29.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		} else {
			if (UserComparator7.widgetDragDuration > 1) {
				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(I)Llc;",
		garbageValue = "-1312829614"
	)
	@Export("username")
	public Username username() {
		return class262.localPlayer != null ? class262.localPlayer.username : null;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1708314526"
	)
	public static final boolean method1746(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (DynamicObject.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class366.field4093;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class366.field4092;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Lbl;",
		garbageValue = "-1490732059"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Lbl;",
		garbageValue = "-1820664660"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "920839392"
	)
	static int method1745(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
			var4 = WorldMapData_1.getWidget(var3);
		} else {
			var4 = var2 ? UserComparator5.scriptDotWidget : Nameable.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			ChatChannel.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 3];
			Script.invalidateWidget(var4);
			class1.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				WorldMapLabelSize.revalidateWidgetScroll(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			ChatChannel.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 3];
			Script.invalidateWidget(var4);
			class1.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				WorldMapLabelSize.revalidateWidgetScroll(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				Script.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lbk;",
		garbageValue = "9"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null;
	}
}
