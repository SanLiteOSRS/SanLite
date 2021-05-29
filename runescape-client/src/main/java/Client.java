import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed {
	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "[Ll;"
	)
	static class11[] field734;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = 257317803
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = -1275777925
	)
	static int field849;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		longValue = 6326177537901632971L
	)
	static long field858;
	@ObfuscatedName("ov")
	static boolean[] field719;
	@ObfuscatedName("pc")
	static boolean[] field860;
	@ObfuscatedName("or")
	static boolean[] field780;
	@ObfuscatedName("pb")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("tr")
	@ObfuscatedGetter(
		intValue = -106098945
	)
	public static int field717;
	@ObfuscatedName("qr")
	static boolean field881;
	@ObfuscatedName("pv")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("pz")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = 568772133
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("pl")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("pa")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("tu")
	static int[] field689;
	@ObfuscatedName("tt")
	static int[] field851;
	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	static final ApproximateRouteStrategy field785;
	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = -1714532039
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "[Lju;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = 1810222737
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = 1005623717
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("rg")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("rj")
	@ObfuscatedGetter(
		intValue = -1084759211
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("rb")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("sd")
	@ObfuscatedGetter(
		intValue = 909671199
	)
	static int field908;
	@ObfuscatedName("rt")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("rq")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = 15595769
	)
	static int field752;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "[Laa;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("rx")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("to")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		intValue = -1953954605
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = -771809921
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = 565415243
	)
	static int field872;
	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("sg")
	static short field894;
	@ObfuscatedName("sp")
	static short field895;
	@ObfuscatedName("sa")
	static short field900;
	@ObfuscatedName("su")
	static short field901;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = -1674931291
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = 2076100495
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("sm")
	static short field828;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = 755828989
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("sk")
	static short field909;
	@ObfuscatedName("sc")
	@ObfuscatedGetter(
		intValue = -592780465
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("qu")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("qp")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "[Loh;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = 1806233111
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("st")
	@ObfuscatedGetter(
		intValue = -2020111655
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		intValue = 407581195
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("pe")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		longValue = 1950859972192234267L
	)
	static long field809;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = 2087031963
	)
	static int field806;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = -2103302667
	)
	static int field865;
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = 112640073
	)
	static int field916;
	@ObfuscatedName("rs")
	static boolean[] field693;
	@ObfuscatedName("ph")
	static int[] field868;
	@ObfuscatedName("rd")
	static int[] field891;
	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "[Ly;"
	)
	static class3[] field871;
	@ObfuscatedName("pi")
	static int[] field867;
	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static NodeDeque field652;
	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static NodeDeque field846;
	@ObfuscatedName("rv")
	static int[] field890;
	@ObfuscatedName("si")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("so")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = -639645947
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sb")
	static int[] field893;
	@ObfuscatedName("rh")
	static int[] field892;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = -1863932723
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("py")
	static int[] field877;
	@ObfuscatedName("pp")
	static String field863;
	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lfz;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("an")
	static boolean field889;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1396273817
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1088533541
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 60643507
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bm")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bz")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1731105959
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1523027191
	)
	static int field643;
	@ObfuscatedName("bj")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -888167097
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cs")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1702273423
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		longValue = -8707347461681450731L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1975403091
	)
	static int field651;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 424553417
	)
	static int field812;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		longValue = 8694062253931131003L
	)
	static long field653;
	@ObfuscatedName("cz")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("cb")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -414435005
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1764619255
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1564576307
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1851530429
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -659326571
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 122660467
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 560141220
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -213439381
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 1162159936
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dj")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -1127540073
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 534657201
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -587760519
	)
	static int field670;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = -515874317
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = -1024706269
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 1134111881
	)
	static int field673;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = -2135696499
	)
	static int field845;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -1200580919
	)
	static int field675;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static class125 field676;
	@ObfuscatedName("ei")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fz")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "[Ldb;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -1300723479
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("fe")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		intValue = 1045404765
	)
	static int field685;
	@ObfuscatedName("fo")
	static int[] field686;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static AbstractSocket field688;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = -688107431
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("fi")
	static boolean field746;
	@ObfuscatedName("fy")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lkv;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("fn")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = -1548218417
	)
	static int field694;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = 834526125
	)
	static int field695;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 1282334079
	)
	static int field696;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 1781171757
	)
	static int field697;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = -189422017
	)
	static int field698;
	@ObfuscatedName("gl")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("gk")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("gd")
	static final int[] field702;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = 613265553
	)
	static int field913;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = -119839221
	)
	static int field704;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = 1576725955
	)
	static int field705;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = 1820360451
	)
	static int field706;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = -944863209
	)
	static int field707;
	@ObfuscatedName("hc")
	static boolean field708;
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		intValue = -2035208823
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = -2031705619
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = -574530013
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = -308632201
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = -1928381453
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = -1017968913
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = 1156171963
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = -400479567
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 334319879
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		intValue = -859124845
	)
	static int field718;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = -1624140925
	)
	static int field732;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = 286253175
	)
	static int field720;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = -503425261
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = 918404705
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = -315190483
	)
	static int field723;
	@ObfuscatedName("id")
	static boolean field724;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = -1396591603
	)
	static int field725;
	@ObfuscatedName("im")
	static boolean field726;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 627480141
	)
	static int field727;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = 964514413
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = 1347852179
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("ij")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("iw")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("iv")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("iy")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("ib")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("ji")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("jw")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("jk")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("jd")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -213028925
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = 1057202329
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = -1775322899
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = 2140784851
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = -1518689867
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = -1932536521
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = 993621687
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("jg")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = -1890193251
	)
	static int field747;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = -657236193
	)
	static int field841;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -65004085
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 823942939
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = -732224895
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = -1148388107
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("jj")
	static boolean field848;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = -599181589
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = -267997189
	)
	static int field755;
	@ObfuscatedName("je")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "[Lce;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = 929092845
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -1721569989
	)
	static int field759;
	@ObfuscatedName("ka")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = -1493328845
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 1717996379
	)
	static int field762;
	@ObfuscatedName("kt")
	static int[] field771;
	@ObfuscatedName("kz")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("kd")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("kp")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("kw")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = 845336023
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "[[[Lkx;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("kn")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("ks")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("lr")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 161491329
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("lo")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = 673512273
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("lx")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("ln")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("lj")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("la")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("lv")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("lu")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("ly")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("ls")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("lw")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("le")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("lh")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 1449324429
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = -406218029
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = -1946501383
	)
	static int field792;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = 625904081
	)
	static int field833;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = -438265211
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ml")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = 1683168531
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = 1424616685
	)
	static int field788;
	@ObfuscatedName("mk")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("mn")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = 1338880923
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = -907665653
	)
	static int field803;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = 1274187443
	)
	static int field805;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = -234914901
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = -1287342199
	)
	static int field912;
	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 1008679671
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = -612986977
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -816484905
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -1092871253
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("nc")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = -653830947
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = 1055501491
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("no")
	static boolean field819;
	@ObfuscatedName("nx")
	@ObfuscatedGetter(
		intValue = 1941546241
	)
	static int field740;
	@ObfuscatedName("nw")
	@ObfuscatedGetter(
		intValue = -356014141
	)
	static int field821;
	@ObfuscatedName("np")
	static boolean field822;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = -227792449
	)
	static int field854;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = 662563071
	)
	static int field804;
	@ObfuscatedName("nz")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		intValue = 1675804533
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("nn")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = 1149971569
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("ns")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = 102304557
	)
	static int field830;
	@ObfuscatedName("ne")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 28091927
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("oi")
	static int[] field911;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = 1843609775
	)
	static int field852;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = 1908476521
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = 56143531
	)
	static int field836;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = 1400025619
	)
	static int field844;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -1827987357
	)
	static int field654;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = -31959039
	)
	static int field839;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 77736245
	)
	static int field840;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = -194606347
	)
	static int field748;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = 1047300925
	)
	static int field659;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	Buffer field679;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	class35 field680;

	static {
		field889 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		clientType = -1;
		field643 = -1;
		onMobile = false;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = 1L;
		field651 = -1;
		field812 = -1;
		field653 = -1L;
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
		field670 = 0;
		js5Errors = 0;
		loginState = 0;
		field673 = 0;
		field845 = 0;
		field675 = 0;
		field676 = class125.field1468;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[32768];
		npcCount = 0;
		npcIndices = new int[32768];
		field685 = 0;
		field686 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		field746 = false;
		useBufferedSocket = true;
		timer = new Timer();
		fontsMap = new HashMap();
		field694 = 0;
		field695 = 1;
		field696 = 0;
		field697 = 1;
		field698 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field702 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field913 = 0;
		field704 = 2301979;
		field705 = 5063219;
		field706 = 3353893;
		field707 = 7759444;
		field708 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field718 = 0;
		field732 = 0;
		field720 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field723 = 0;
		field724 = false;
		field725 = 0;
		field726 = false;
		field727 = 0;
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
		field747 = 0;
		field841 = 0;
		dragItemSlotSource = 0;
		draggedWidgetX = 0;
		draggedWidgetY = 0;
		dragItemSlotDestination = 0;
		field848 = false;
		itemDragDuration = 0;
		field755 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field759 = 0;
		renderSelf = true;
		drawPlayerNames = 0;
		field762 = 0;
		field771 = new int[1000];
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
		field792 = 0;
		field833 = 50;
		isItemSelected = 0;
		selectedItemName = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		field788 = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field803 = 0;
		field805 = -1;
		chatEffects = 0;
		field912 = 0;
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
		field819 = false;
		field740 = -1;
		field821 = -1;
		field822 = false;
		field854 = -1;
		field804 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field830 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field911 = new int[32];
		field852 = 0;
		chatCycle = 0;
		field836 = 0;
		field844 = 0;
		field654 = 0;
		field839 = 0;
		field840 = 0;
		field748 = 0;
		field659 = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		field652 = new NodeDeque();
		field846 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field849 = -2;
		field719 = new boolean[100];
		field780 = new boolean[100];
		field860 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field858 = 0L;
		isResizable = true;
		field877 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field863 = "";
		crossWorldMessageIds = new long[100];
		field865 = 0;
		field806 = 0;
		field867 = new int[128];
		field868 = new int[128];
		field809 = -1L;
		field734 = new class11[1];
		field871 = new class3[1];
		field872 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		currentTrackGroupId = -1;
		field881 = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field693 = new boolean[5];
		field890 = new int[5];
		field891 = new int[5];
		field892 = new int[5];
		field893 = new int[5];
		field894 = 256;
		field895 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field909 = 1;
		field828 = 32767;
		field900 = 1;
		field901 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field908 = -1;
		field752 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field717 = -1;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field916 = 0;
		field785 = new ApproximateRouteStrategy();
		field689 = new int[50];
		field851 = new int[50];
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "50"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field858 = ObjectComposition.currentTimeMillis() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-232069568"
	)
	@Export("setUp")
	protected final void setUp() {
		SecureRandomFuture.method1981(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		WorldMapLabelSize.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		GrandExchangeOfferTotalQuantityComparator.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		DesktopPlatformInfoProvider.currentPort = WorldMapLabelSize.worldPort;
		class29.field233 = class245.field2944;
		class15.field137 = class245.field2940;
		UserComparator5.field1442 = class245.field2941;
		VarbitComposition.field1708 = class245.field2942;
		ServerPacket.urlRequester = new UrlRequester();
		this.setUpKeyboard();
		this.setUpMouse();
		MidiPcmStream.mouseWheel = this.mouseWheel();
		class43.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var2 = null;
		ClientPreferences var3 = new ClientPreferences();

		try {
			var2 = class82.getPreferencesFile("", SoundSystem.field461.name, false);
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

		ObjectComposition.clientPreferences = var3;
		this.setUpClipboard();
		String var9 = PacketWriter.null_string;
		class44.applet = this;
		if (var9 != null) {
			class44.field318 = var9;
		}

		if (gameBuild != 0) {
			displayFps = true;
		}

		CollisionMap.setWindowedMode(ObjectComposition.clientPreferences.windowMode);
		NetSocket.friendSystem = new FriendSystem(WorldMapSection0.loginType);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "68"
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
				Interpreter.method1870();
				HealthBarUpdate.playPcmPlayers();
				synchronized(KeyHandler.KeyHandler_instance) {
					++KeyHandler.KeyHandler_idleCycles;
					KeyHandler.field293 = KeyHandler.field295;
					KeyHandler.field292 = 0;
					int var5;
					if (KeyHandler.field288 >= 0) {
						while (KeyHandler.field296 != KeyHandler.field288) {
							var5 = KeyHandler.field287[KeyHandler.field296];
							KeyHandler.field296 = KeyHandler.field296 + 1 & 127;
							if (var5 < 0) {
								KeyHandler.KeyHandler_pressedKeys[~var5] = false;
							} else {
								if (!KeyHandler.KeyHandler_pressedKeys[var5] && KeyHandler.field292 < KeyHandler.field274.length - 1) {
									KeyHandler.field274[++KeyHandler.field292 - 1] = var5;
								}

								KeyHandler.KeyHandler_pressedKeys[var5] = true;
							}
						}
					} else {
						for (var5 = 0; var5 < 112; ++var5) {
							KeyHandler.KeyHandler_pressedKeys[var5] = false;
						}

						KeyHandler.field288 = KeyHandler.field296;
					}

					if (KeyHandler.field292 > 0) {
						KeyHandler.KeyHandler_idleCycles = 0;
					}

					KeyHandler.field295 = KeyHandler.field294;
				}

				Player.method2166();
				int var6;
				if (MidiPcmStream.mouseWheel != null) {
					var6 = MidiPcmStream.mouseWheel.useRotation();
					mouseWheelRotation = var6;
				}

				if (gameState == 0) {
					MilliClock.load();
					GameEngine.clock.mark();

					for (var6 = 0; var6 < 32; ++var6) {
						GameEngine.graphicsTickTimes[var6] = 0L;
					}

					for (var6 = 0; var6 < 32; ++var6) {
						GameEngine.clientTickTimes[var6] = 0L;
					}

					class260.gameCyclesToDo = 0;
				} else if (gameState == 5) {
					WorldMapManager.doCycleTitle(this);
					MilliClock.load();
					GameEngine.clock.mark();

					for (var6 = 0; var6 < 32; ++var6) {
						GameEngine.graphicsTickTimes[var6] = 0L;
					}

					for (var6 = 0; var6 < 32; ++var6) {
						GameEngine.clientTickTimes[var6] = 0L;
					}

					class260.gameCyclesToDo = 0;
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						WorldMapManager.doCycleTitle(this);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						WorldMapAreaData.method3708();
					}
				} else {
					WorldMapManager.doCycleTitle(this);
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "9311"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label168: {
			try {
				if (class232.musicPlayerStatus == 2) {
					if (class2.musicTrack == null) {
						class2.musicTrack = MusicTrack.readTrack(ModelData0.musicTrackArchive, class32.musicTrackGroupId, class18.musicTrackFileId);
						if (class2.musicTrack == null) {
							var2 = false;
							break label168;
						}
					}

					if (Messages.soundCache == null) {
						Messages.soundCache = new SoundCache(WorldMapElement.soundEffectsArchive, class232.musicSamplesArchive);
					}

					if (class124.midiPcmStream.loadMusicTrack(class2.musicTrack, class232.musicPatchesArchive, Messages.soundCache, 22050)) {
						class124.midiPcmStream.clearAll();
						class124.midiPcmStream.setPcmStreamVolume(class232.musicTrackVolume);
						class124.midiPcmStream.setMusicTrack(class2.musicTrack, class232.musicTrackBoolean);
						class232.musicPlayerStatus = 0;
						class2.musicTrack = null;
						Messages.soundCache = null;
						ModelData0.musicTrackArchive = null;
						var2 = true;
						break label168;
					}
				}
			} catch (Exception var6) {
				var6.printStackTrace();
				class124.midiPcmStream.clear();
				class232.musicPlayerStatus = 0;
				class2.musicTrack = null;
				Messages.soundCache = null;
				ModelData0.musicTrackArchive = null;
			}

			var2 = false;
		}

		if (var2 && field881 && DesktopPlatformInfoProvider.pcmPlayer0 != null) {
			DesktopPlatformInfoProvider.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field858 != 0L && ObjectComposition.currentTimeMillis() > field858) {
			CollisionMap.setWindowedMode(SpotAnimationDefinition.getWindowedMode());
		}

		int var4;
		if (var1) {
			for (var4 = 0; var4 < 100; ++var4) {
				field719[var4] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			FriendSystem.drawTitle(Widget.fontBold12, Actor.fontPlain11, UserComparator3.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				FriendSystem.drawTitle(Widget.fontBold12, Actor.fontPlain11, UserComparator3.fontPlain12);
			} else if (gameState == 25) {
				if (field698 == 1) {
					if (field694 > field695) {
						field695 = field694;
					}

					var4 = (field695 * 50 - field694 * 50) / field695;
					DirectByteArrayCopier.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
				} else if (field698 == 2) {
					if (field696 > field697) {
						field697 = field696;
					}

					var4 = (field697 * 50 - field696 * 50) / field697 + 50;
					DirectByteArrayCopier.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
				} else {
					DirectByteArrayCopier.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				DirectByteArrayCopier.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				DirectByteArrayCopier.drawLoadingMessage("Please wait...", false);
			}
		} else {
			FriendSystem.drawTitle(Widget.fontBold12, Actor.fontPlain11, UserComparator3.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				if (field780[var4]) {
					class26.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]);
					field780[var4] = false;
				}
			}
		} else if (gameState > 0) {
			class26.rasterProvider.drawFull(0, 0);

			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				field780[var4] = false;
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "561275520"
	)
	@Export("kill0")
	protected final void kill0() {
		if (GrandExchangeOfferOwnWorldComparator.varcs.hasUnwrittenChanges()) {
			GrandExchangeOfferOwnWorldComparator.varcs.write();
		}

		if (Skills.mouseRecorder != null) {
			Skills.mouseRecorder.isRunning = false;
		}

		Skills.mouseRecorder = null;
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

		MidiPcmStream.mouseWheel = null;
		if (DesktopPlatformInfoProvider.pcmPlayer0 != null) {
			DesktopPlatformInfoProvider.pcmPlayer0.shutdown();
		}

		if (MouseRecorder.pcmPlayer1 != null) {
			MouseRecorder.pcmPlayer1.shutdown();
		}

		VarcInt.method2673();
		Widget.method4759();
		if (ServerPacket.urlRequester != null) {
			ServerPacket.urlRequester.close();
			ServerPacket.urlRequester = null;
		}

		FriendSystem.method1746();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-992375266"
	)
	protected final void vmethod1471() {
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				int var4;
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
							class378.clientLanguage = Language.method5151(Integer.parseInt(var2));
							break;
						case 7:
							var4 = Integer.parseInt(var2);
							GameBuild[] var5 = new GameBuild[]{GameBuild.WIP, GameBuild.LIVE, GameBuild.RC, GameBuild.BUILDLIVE};
							GameBuild[] var6 = var5;
							int var7 = 0;

							GameBuild var20;
							while (true) {
								if (var7 >= var6.length) {
									var20 = null;
									break;
								}

								GameBuild var8 = var6[var7];
								if (var4 == var8.buildId) {
									var20 = var8;
									break;
								}

								++var7;
							}

							FaceNormal.field2365 = var20;
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							class363.field4079 = var2;
							break;
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.runescape, StudioGame.stellardawn, StudioGame.game5, StudioGame.oldscape, StudioGame.game3, StudioGame.game4};
							SoundSystem.field461 = (StudioGame)Messages.findEnumerated(var3, Integer.parseInt(var2));
							if (StudioGame.oldscape == SoundSystem.field461) {
								WorldMapSection0.loginType = LoginType.oldscape;
							} else {
								WorldMapSection0.loginType = LoginType.field4091;
							}
							break;
						case 12:
							worldId = Integer.parseInt(var2);
							break;
						case 14:
							Script.field1094 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							class6.field58 = var2;
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				class80.worldHost = this.getCodeBase().getHost();
				String var9 = FaceNormal.field2365.name;
				byte var10 = 0;

				try {
					SoundCache.idxCount = 21;
					UserComparator10.cacheGamebuild = var10;

					try {
						class35.operatingSystemName = System.getProperty("os.name");
					} catch (Exception var17) {
						class35.operatingSystemName = "Unknown";
					}

					UserComparator5.formattedOperatingSystemName = class35.operatingSystemName.toLowerCase();

					try {
						class22.userHomeDirectory = System.getProperty("user.home");
						if (class22.userHomeDirectory != null) {
							class22.userHomeDirectory = class22.userHomeDirectory + "/";
						}
					} catch (Exception var16) {
					}

					try {
						if (UserComparator5.formattedOperatingSystemName.startsWith("win")) {
							if (class22.userHomeDirectory == null) {
								class22.userHomeDirectory = System.getenv("USERPROFILE");
							}
						} else if (class22.userHomeDirectory == null) {
							class22.userHomeDirectory = System.getenv("HOME");
						}

						if (class22.userHomeDirectory != null) {
							class22.userHomeDirectory = class22.userHomeDirectory + "/";
						}
					} catch (Exception var15) {
					}

					if (class22.userHomeDirectory == null) {
						class22.userHomeDirectory = "~/";
					}

					InterfaceParent.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class22.userHomeDirectory, "/tmp/", ""};
					PlayerType.cacheSubPaths = new String[]{".jagex_cache_" + UserComparator10.cacheGamebuild, ".file_store_" + UserComparator10.cacheGamebuild};

					label137:
					for (int var11 = 0; var11 < 4; ++var11) {
						class12.cacheDir = Canvas.method393("oldschool", var9, var11);
						if (!class12.cacheDir.exists()) {
							class12.cacheDir.mkdirs();
						}

						File[] var12 = class12.cacheDir.listFiles();
						if (var12 == null) {
							break;
						}

						File[] var22 = var12;
						int var13 = 0;

						while (true) {
							if (var13 >= var22.length) {
								break label137;
							}

							File var14 = var22[var13];
							if (!FaceNormal.isWriteable(var14, false)) {
								break;
							}

							++var13;
						}
					}

					File var21 = class12.cacheDir;
					FileSystem.FileSystem_cacheDir = var21;
					if (!FileSystem.FileSystem_cacheDir.exists()) {
						throw new RuntimeException("");
					}

					FileSystem.FileSystem_hasPermissions = true;
					SoundCache.method830();
					JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(ScriptFrame.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
					JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(ScriptFrame.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
					class93.JagexCache_idxFiles = new BufferedFile[SoundCache.idxCount];

					for (var4 = 0; var4 < SoundCache.idxCount; ++var4) {
						class93.JagexCache_idxFiles[var4] = new BufferedFile(new AccessFile(ScriptFrame.getFile("main_file_cache.idx" + var4), "rw", 1048576L), 6000, 0);
					}
				} catch (Exception var18) {
					class266.RunException_sendStackTrace((String)null, var18);
				}

				class23.client = this;
				RunException.clientType = clientType;
				if (field643 == -1) {
					field643 = 0;
				}

				this.startThread(765, 503, 196);
			}
		} catch (RuntimeException var19) {
			throw WorldMapDecoration.newRunException(var19, "client.init(" + ')');
		}
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1243838219"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			long var2 = ObjectComposition.currentTimeMillis();
			int var4 = (int)(var2 - class18.field159);
			class18.field159 = var2;
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
					label238: {
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
							if (BuddyRankComparator.NetCache_currentResponse == null) {
								var7 = 8;
							} else if (NetCache.field3612 == 0) {
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
								if (NetCache.field3607 != 0) {
									for (var9 = 0; var9 < var8; ++var9) {
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field3607;
									}
								}

								var25 = NetCache.NetCache_responseHeaderBuffer;
								var25.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) {
									break;
								}

								if (BuddyRankComparator.NetCache_currentResponse == null) {
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var12 = NetCache.NetCache_responseHeaderBuffer.readInt();
									long var13 = (long)(var10 + (var9 << 16));
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13);
									class8.field75 = true;
									if (var15 == null) {
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13);
										class8.field75 = false;
									}

									if (var15 == null) {
										throw new IOException();
									}

									int var16 = var11 == 0 ? 5 : 9;
									BuddyRankComparator.NetCache_currentResponse = var15;
									SoundSystem.NetCache_responseArchiveBuffer = new Buffer(var16 + var12 + BuddyRankComparator.NetCache_currentResponse.padding);
									SoundSystem.NetCache_responseArchiveBuffer.writeByte(var11);
									SoundSystem.NetCache_responseArchiveBuffer.writeInt(var12);
									NetCache.field3612 = 8;
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
								} else if (NetCache.field3612 == 0) {
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
										NetCache.field3612 = 1;
										NetCache.NetCache_responseHeaderBuffer.offset = 0;
									} else {
										BuddyRankComparator.NetCache_currentResponse = null;
									}
								}
							} else {
								var8 = SoundSystem.NetCache_responseArchiveBuffer.array.length - BuddyRankComparator.NetCache_currentResponse.padding;
								var9 = 512 - NetCache.field3612;
								if (var9 > var8 - SoundSystem.NetCache_responseArchiveBuffer.offset) {
									var9 = var8 - SoundSystem.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) {
									var9 = var18;
								}

								NetCache.NetCache_socket.read(SoundSystem.NetCache_responseArchiveBuffer.array, SoundSystem.NetCache_responseArchiveBuffer.offset, var9);
								if (NetCache.field3607 != 0) {
									for (var10 = 0; var10 < var9; ++var10) {
										var10000 = SoundSystem.NetCache_responseArchiveBuffer.array;
										var10001 = var10 + SoundSystem.NetCache_responseArchiveBuffer.offset;
										var10000[var10001] ^= NetCache.field3607;
									}
								}

								var25 = SoundSystem.NetCache_responseArchiveBuffer;
								var25.offset += var9;
								NetCache.field3612 += var9;
								if (var8 == SoundSystem.NetCache_responseArchiveBuffer.offset) {
									if (BuddyRankComparator.NetCache_currentResponse.key == 16711935L) {
										class125.NetCache_reference = SoundSystem.NetCache_responseArchiveBuffer;

										for (var10 = 0; var10 < 256; ++var10) {
											Archive var19 = NetCache.NetCache_archives[var10];
											if (var19 != null) {
												class125.NetCache_reference.offset = var10 * 8 + 5;
												var12 = class125.NetCache_reference.readInt();
												int var20 = class125.NetCache_reference.readInt();
												var19.loadIndex(var12, var20);
											}
										}
									} else {
										NetCache.NetCache_crc.reset();
										NetCache.NetCache_crc.update(SoundSystem.NetCache_responseArchiveBuffer.array, 0, var8);
										var10 = (int)NetCache.NetCache_crc.getValue();
										if (var10 != BuddyRankComparator.NetCache_currentResponse.crc) {
											try {
												NetCache.NetCache_socket.close();
											} catch (Exception var23) {
											}

											++NetCache.NetCache_crcMismatches;
											NetCache.NetCache_socket = null;
											NetCache.field3607 = (byte)((int)(Math.random() * 255.0D + 1.0D));
											var1 = false;
											break label238;
										}

										NetCache.NetCache_crcMismatches = 0;
										NetCache.NetCache_ioExceptions = 0;
										BuddyRankComparator.NetCache_currentResponse.archive.write((int)(BuddyRankComparator.NetCache_currentResponse.key & 65535L), SoundSystem.NetCache_responseArchiveBuffer.array, (BuddyRankComparator.NetCache_currentResponse.key & 16711680L) == 16711680L, class8.field75);
									}

									BuddyRankComparator.NetCache_currentResponse.remove();
									if (class8.field75) {
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount;
									}

									NetCache.field3612 = 0;
									BuddyRankComparator.NetCache_currentResponse = null;
									SoundSystem.NetCache_responseArchiveBuffer = null;
								} else {
									if (NetCache.field3612 != 512) {
										break;
									}

									NetCache.field3612 = 0;
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

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1090327888"
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

				field670 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}

			if (--field670 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class159.js5SocketTask = GameEngine.taskHandler.newSocketTask(class80.worldHost, DesktopPlatformInfoProvider.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class159.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class159.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						if (useBufferedSocket) {
							Socket var2 = (Socket)class159.js5SocketTask.result;
							BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000);
							WorldMapID.js5Socket = var1;
						} else {
							WorldMapID.js5Socket = new NetSocket((Socket)class159.js5SocketTask.result, GameEngine.taskHandler, 5000);
						}

						Buffer var11 = new Buffer(5);
						var11.writeByte(15);
						var11.writeInt(196);
						WorldMapID.js5Socket.write(var11.array, 0, 5);
						++js5ConnectState;
						ArchiveDiskAction.field3556 = ObjectComposition.currentTimeMillis();
					}

					if (js5ConnectState == 3) {
						if (WorldMapID.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) {
							int var5 = WorldMapID.js5Socket.readUnsignedByte();
							if (var5 != 0) {
								this.js5Error(var5);
								return;
							}

							++js5ConnectState;
						} else if (ObjectComposition.currentTimeMillis() - ArchiveDiskAction.field3556 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						AbstractSocket var12 = WorldMapID.js5Socket;
						boolean var6 = gameState > 20;
						if (NetCache.NetCache_socket != null) {
							try {
								NetCache.NetCache_socket.close();
							} catch (Exception var9) {
							}

							NetCache.NetCache_socket = null;
						}

						NetCache.NetCache_socket = var12;
						StudioGame.method4847(var6);
						NetCache.NetCache_responseHeaderBuffer.offset = 0;
						BuddyRankComparator.NetCache_currentResponse = null;
						SoundSystem.NetCache_responseArchiveBuffer = null;
						NetCache.field3612 = 0;

						while (true) {
							NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
							if (var3 == null) {
								while (true) {
									var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
									if (var3 == null) {
										if (NetCache.field3607 != 0) {
											try {
												Buffer var13 = new Buffer(4);
												var13.writeByte(4);
												var13.writeByte(NetCache.field3607);
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
										class18.field159 = ObjectComposition.currentTimeMillis();
										class159.js5SocketTask = null;
										WorldMapID.js5Socket = null;
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

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1995142761"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class159.js5SocketTask = null;
		WorldMapID.js5Socket = null;
		js5ConnectState = 0;
		if (WorldMapLabelSize.worldPort == DesktopPlatformInfoProvider.currentPort) {
			DesktopPlatformInfoProvider.currentPort = GrandExchangeOfferTotalQuantityComparator.js5Port;
		} else {
			DesktopPlatformInfoProvider.currentPort = WorldMapLabelSize.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				gameState = 1000;
			} else {
				field670 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			gameState = 1000;
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				gameState = 1000;
			} else {
				field670 = 3000;
			}
		}

	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-607645058"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (ClientPreferences.secureRandom == null && (secureRandomFuture.isDone() || field673 > 250)) {
					ClientPreferences.secureRandom = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (ClientPreferences.secureRandom != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					UserComparator9.socketTask = null;
					field746 = false;
					field673 = 0;
					loginState = 1;
				}
			}

			if (loginState == 1) {
				if (UserComparator9.socketTask == null) {
					UserComparator9.socketTask = GameEngine.taskHandler.newSocketTask(class80.worldHost, DesktopPlatformInfoProvider.currentPort);
				}

				if (UserComparator9.socketTask.status == 2) {
					throw new IOException();
				}

				if (UserComparator9.socketTask.status == 1) {
					if (useBufferedSocket) {
						Socket var4 = (Socket)UserComparator9.socketTask.result;
						BufferedNetSocket var3 = new BufferedNetSocket(var4, 40000, 5000);
						var1 = var3;
					} else {
						var1 = new NetSocket((Socket)UserComparator9.socketTask.result, GameEngine.taskHandler, 5000);
					}

					packetWriter.setSocket((AbstractSocket)var1);
					UserComparator9.socketTask = null;
					loginState = 2;
				}
			}

			PacketBufferNode var26;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var26 = class22.method247();
				var26.packetBuffer.writeByte(LoginPacket.field2806.id);
				packetWriter.addNode(var26);
				packetWriter.flush();
				var2.offset = 0;
				loginState = 3;
			}

			boolean var13;
			int var14;
			if (loginState == 3) {
				if (DesktopPlatformInfoProvider.pcmPlayer0 != null) {
					DesktopPlatformInfoProvider.pcmPlayer0.method733();
				}

				if (MouseRecorder.pcmPlayer1 != null) {
					MouseRecorder.pcmPlayer1.method733();
				}

				var13 = true;
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) {
					var13 = false;
				}

				if (var13) {
					var14 = ((AbstractSocket)var1).readUnsignedByte();
					if (DesktopPlatformInfoProvider.pcmPlayer0 != null) {
						DesktopPlatformInfoProvider.pcmPlayer0.method733();
					}

					if (MouseRecorder.pcmPlayer1 != null) {
						MouseRecorder.pcmPlayer1.method733();
					}

					if (var14 != 0) {
						MouseHandler.getLoginError(var14);
						return;
					}

					var2.offset = 0;
					loginState = 4;
				}
			}

			int var41;
			if (loginState == 4) {
				if (var2.offset < 8) {
					var41 = ((AbstractSocket)var1).available();
					if (var41 > 8 - var2.offset) {
						var41 = 8 - var2.offset;
					}

					if (var41 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset, var41);
						var2.offset += var41;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					GrandExchangeOfferAgeComparator.field3634 = var2.readLong();
					loginState = 5;
				}
			}

			int var7;
			int var9;
			int var15;
			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var27 = new PacketBuffer(500);
				int[] var29 = new int[]{ClientPreferences.secureRandom.nextInt(), ClientPreferences.secureRandom.nextInt(), ClientPreferences.secureRandom.nextInt(), ClientPreferences.secureRandom.nextInt()};
				var27.offset = 0;
				var27.writeByte(1);
				var27.writeInt(var29[0]);
				var27.writeInt(var29[1]);
				var27.writeInt(var29[2]);
				var27.writeInt(var29[3]);
				var27.writeLong(GrandExchangeOfferAgeComparator.field3634);
				int var11;
				if (gameState == 40) {
					var27.writeInt(HealthBarDefinition.field1603[0]);
					var27.writeInt(HealthBarDefinition.field1603[1]);
					var27.writeInt(HealthBarDefinition.field1603[2]);
					var27.writeInt(HealthBarDefinition.field1603[3]);
				} else {
					var27.writeByte(field676.rsOrdinal());
					switch(field676.field1472) {
					case 0:
						var27.offset += 4;
						break;
					case 1:
					case 3:
						var27.writeMedium(class5.field53);
						++var27.offset;
						break;
					case 2:
						LinkedHashMap var6 = ObjectComposition.clientPreferences.parameters;
						String var8 = Login.Login_username;
						var9 = var8.length();
						int var10 = 0;

						for (var11 = 0; var11 < var9; ++var11) {
							var10 = (var10 << 5) - var10 + var8.charAt(var11);
						}

						var27.writeInt((Integer)var6.get(var10));
					}

					var27.writeByte(class386.field4210.rsOrdinal());
					var27.writeStringCp1252NullTerminated(Login.Login_password);
				}

				var27.encryptRsa(class82.field1018, class82.field1017);
				HealthBarDefinition.field1603 = var29;
				PacketBufferNode var5 = class22.method247();
				var5.packetBuffer.offset = 0;
				if (gameState == 40) {
					var5.packetBuffer.writeByte(LoginPacket.field2799.id);
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field2802.id);
				}

				var5.packetBuffer.writeShort(0);
				var15 = var5.packetBuffer.offset;
				var5.packetBuffer.writeInt(196);
				var5.packetBuffer.writeInt(1);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeByte(field643);
				var5.packetBuffer.writeBytes(var27.array, 0, var27.offset);
				var7 = var5.packetBuffer.offset;
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var5.packetBuffer.writeShort(class32.canvasWidth);
				var5.packetBuffer.writeShort(ReflectionCheck.canvasHeight);
				PacketBuffer var39 = var5.packetBuffer;
				if (randomDatData != null) {
					var39.writeBytes(randomDatData, 0, randomDatData.length);
				} else {
					byte[] var16 = new byte[24];

					try {
						JagexCache.JagexCache_randomDat.seek(0L);
						JagexCache.JagexCache_randomDat.readFully(var16);

						for (var11 = 0; var11 < 24 && var16[var11] == 0; ++var11) {
						}

						if (var11 >= 24) {
							throw new IOException();
						}
					} catch (Exception var24) {
						for (int var12 = 0; var12 < 24; ++var12) {
							var16[var12] = -1;
						}
					}

					var39.writeBytes(var16, 0, var16.length);
				}

				var5.packetBuffer.writeStringCp1252NullTerminated(class363.field4079);
				var5.packetBuffer.writeInt(Script.field1094);
				Buffer var18 = new Buffer(class10.platformInfo.size());
				class10.platformInfo.write(var18);
				var5.packetBuffer.writeBytes(var18.array, 0, var18.array.length);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeInt(0);
				var5.packetBuffer.writeInt(UrlRequest.archive6.hash);
				var5.packetBuffer.method6612(0);
				var5.packetBuffer.method6612(class8.archive17.hash);
				var5.packetBuffer.writeIntME(class27.archive4.hash);
				var5.packetBuffer.method6612(class3.archive5.hash);
				var5.packetBuffer.writeIntME(class5.archive20.hash);
				var5.packetBuffer.writeInt(class179.archive19.hash);
				var5.packetBuffer.method6611(NetCache.archive3.hash);
				var5.packetBuffer.writeInt(FriendsChatMember.archive15.hash);
				var5.packetBuffer.writeInt(SoundCache.archive10.hash);
				var5.packetBuffer.writeInt(class8.archive2.hash);
				var5.packetBuffer.method6611(WorldMapManager.archive11.hash);
				var5.packetBuffer.writeIntME(class32.field242.hash);
				var5.packetBuffer.writeInt(Decimator.archive13.hash);
				var5.packetBuffer.writeIntME(class125.archive14.hash);
				var5.packetBuffer.method6612(CollisionMap.field1903.hash);
				var5.packetBuffer.method6611(UserComparator5.archive12.hash);
				var5.packetBuffer.writeIntME(FontName.archive18.hash);
				var5.packetBuffer.method6611(class247.archive7.hash);
				var5.packetBuffer.writeInt(Decimator.archive9.hash);
				var5.packetBuffer.writeInt(GrandExchangeOfferAgeComparator.archive8.hash);
				var5.packetBuffer.xteaEncrypt(var29, var7, var5.packetBuffer.offset);
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var15);
				packetWriter.addNode(var5);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var29);
				int[] var43 = new int[4];

				for (var11 = 0; var11 < 4; ++var11) {
					var43[var11] = var29[var11] + 50;
				}

				var2.newIsaacCipher(var43);
				loginState = 6;
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
				var41 = ((AbstractSocket)var1).readUnsignedByte();
				if (var41 == 21 && gameState == 20) {
					loginState = 12;
				} else if (var41 == 2) {
					loginState = 14;
				} else if (var41 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					loginState = 19;
				} else if (var41 == 64) {
					loginState = 10;
				} else if (var41 == 23 && field845 < 1) {
					++field845;
					loginState = 0;
				} else if (var41 == 29) {
					loginState = 17;
				} else {
					if (var41 != 69) {
						MouseHandler.getLoginError(var41);
						return;
					}

					loginState = 7;
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				class27.field231 = var2.readUnsignedShort();
				loginState = 8;
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= class27.field231) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, class27.field231);
				class34[] var28 = new class34[]{class34.field256};
				class34 var30 = var28[var2.readUnsignedByte()];

				try {
					class31 var33 = class374.method6477(var30);
					this.field680 = new class35(var2, var33);
					loginState = 9;
				} catch (Exception var23) {
					MouseHandler.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field680.method342()) {
				this.field679 = this.field680.method331();
				this.field680.method332();
				this.field680 = null;
				if (this.field679 == null) {
					MouseHandler.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var26 = class22.method247();
				var26.packetBuffer.writeByte(LoginPacket.field2803.id);
				var26.packetBuffer.writeShort(this.field679.offset);
				var26.packetBuffer.method6768(this.field679);
				packetWriter.addNode(var26);
				packetWriter.flush();
				this.field679 = null;
				loginState = 6;
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
				ChatChannel.field1110 = ((AbstractSocket)var1).readUnsignedByte();
				loginState = 11;
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= ChatChannel.field1110) {
				((AbstractSocket)var1).read(var2.array, 0, ChatChannel.field1110);
				var2.offset = 0;
				loginState = 6;
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
				field675 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				loginState = 13;
			}

			if (loginState == 13) {
				field673 = 0;
				class260.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field675 / 60 + " seconds.");
				if (--field675 <= 0) {
					loginState = 0;
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
					class20.field184 = ((AbstractSocket)var1).readUnsignedByte();
					loginState = 15;
				}

				boolean var42;
				if (loginState == 15 && ((AbstractSocket)var1).available() >= class20.field184) {
					var13 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					var42 = false;
					if (var13) {
						var14 = var2.readByteIsaac() << 24;
						var14 |= var2.readByteIsaac() << 16;
						var14 |= var2.readByteIsaac() << 8;
						var14 |= var2.readByteIsaac();
						String var38 = Login.Login_username;
						var7 = var38.length();
						int var19 = 0;
						var9 = 0;

						while (true) {
							if (var9 >= var7) {
								if (ObjectComposition.clientPreferences.parameters.size() >= 10 && !ObjectComposition.clientPreferences.parameters.containsKey(var19)) {
									Iterator var40 = ObjectComposition.clientPreferences.parameters.entrySet().iterator();
									var40.next();
									var40.remove();
								}

								ObjectComposition.clientPreferences.parameters.put(var19, var14);
								break;
							}

							var19 = (var19 << 5) - var19 + var38.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) {
						ObjectComposition.clientPreferences.rememberedUsername = Login.Login_username;
					} else {
						ObjectComposition.clientPreferences.rememberedUsername = null;
					}

					TileItem.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field759 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var35 = class24.ServerPacket_values();
					var15 = var2.readSmartByteShortIsaac();
					if (var15 < 0 || var15 >= var35.length) {
						throw new IOException(var15 + " " + var2.offset);
					}

					packetWriter.serverPacket = var35[var15];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						class42.method421(class23.client, "zap");
					} catch (Throwable var22) {
					}

					loginState = 16;
				}

				if (loginState != 16) {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						WorldMapData_1.field2008 = var2.readUnsignedShort();
						loginState = 18;
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= WorldMapData_1.field2008) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, WorldMapData_1.field2008);
						var2.offset = 0;
						String var36 = var2.readStringCp1252NullTerminated();
						String var34 = var2.readStringCp1252NullTerminated();
						String var37 = var2.readStringCp1252NullTerminated();
						class260.setLoginResponseString(var36, var34, var37);
						class12.updateGameState(10);
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
							var41 = packetWriter.serverPacketLength;
							timer.method5594();
							WorldMapSectionType.method3594();
							Coord.updatePlayer(var2);
							if (var41 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field673;
						if (field673 > 2000) {
							if (field845 < 1) {
								if (DesktopPlatformInfoProvider.currentPort == WorldMapLabelSize.worldPort) {
									DesktopPlatformInfoProvider.currentPort = GrandExchangeOfferTotalQuantityComparator.js5Port;
								} else {
									DesktopPlatformInfoProvider.currentPort = WorldMapLabelSize.worldPort;
								}

								++field845;
								loginState = 0;
							} else {
								MouseHandler.getLoginError(-3);
							}
						}
					}
				} else {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method5592();
						mouseLastLastPressedTimeMillis = 1L;
						Skills.mouseRecorder.index = 0;
						WorldMapSection1.hasFocus = true;
						hadFocus = true;
						field809 = -1L;
						SoundCache.method811();
						packetWriter.clearBuffer();
						packetWriter.packetBuffer.offset = 0;
						packetWriter.serverPacket = null;
						packetWriter.field1411 = null;
						packetWriter.field1412 = null;
						packetWriter.field1400 = null;
						packetWriter.serverPacketLength = 0;
						packetWriter.field1409 = 0;
						rebootTimer = 0;
						logoutTimer = 0;
						hintArrowType = 0;
						class1.method11();
						ArchiveDiskActionHandler.method4867(0);
						class43.method437();
						isItemSelected = 0;
						isSpellSelected = false;
						soundEffectCount = 0;
						camAngleY = 0;
						oculusOrbState = 0;
						UserComparator3.field1444 = null;
						minimapState = 0;
						field872 = -1;
						destinationX = 0;
						destinationY = 0;
						playerAttackOption = AttackOption.AttackOption_hidden;
						npcAttackOption = AttackOption.AttackOption_hidden;
						npcCount = 0;
						Player.method2110();

						for (var41 = 0; var41 < 2048; ++var41) {
							players[var41] = null;
						}

						for (var41 = 0; var41 < 32768; ++var41) {
							npcs[var41] = null;
						}

						combatTargetPlayerIndex = -1;
						projectiles.clear();
						graphicsObjects.clear();

						int var20;
						for (var41 = 0; var41 < 4; ++var41) {
							for (var14 = 0; var14 < 104; ++var14) {
								for (var20 = 0; var20 < 104; ++var20) {
									groundItems[var41][var14][var20] = null;
								}
							}
						}

						pendingSpawns = new NodeDeque();
						NetSocket.friendSystem.clear();

						for (var41 = 0; var41 < VarpDefinition.VarpDefinition_fileCount; ++var41) {
							VarpDefinition var32 = class11.VarpDefinition_get(var41);
							if (var32 != null) {
								Varps.Varps_temp[var41] = 0;
								Varps.Varps_main[var41] = 0;
							}
						}

						GrandExchangeOfferOwnWorldComparator.varcs.clearTransient();
						followerIndex = -1;
						if (rootInterface != -1) {
							var41 = rootInterface;
							if (var41 != -1 && Widget.Widget_loadedInterfaces[var41]) {
								HealthBarUpdate.Widget_archive.clearFilesGroup(var41);
								if (Widget.Widget_interfaceComponents[var41] != null) {
									var42 = true;

									for (var20 = 0; var20 < Widget.Widget_interfaceComponents[var41].length; ++var20) {
										if (Widget.Widget_interfaceComponents[var41][var20] != null) {
											if (Widget.Widget_interfaceComponents[var41][var20].type != 2) {
												Widget.Widget_interfaceComponents[var41][var20] = null;
											} else {
												var42 = false;
											}
										}
									}

									if (var42) {
										Widget.Widget_interfaceComponents[var41] = null;
									}

									Widget.Widget_loadedInterfaces[var41] = false;
								}
							}
						}

						for (InterfaceParent var31 = (InterfaceParent)interfaceParents.first(); var31 != null; var31 = (InterfaceParent)interfaceParents.next()) {
							class43.closeInterface(var31, true);
						}

						rootInterface = -1;
						interfaceParents = new NodeHashTable(8);
						meslayerContinueWidget = null;
						class1.method11();
						playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

						for (var41 = 0; var41 < 8; ++var41) {
							playerMenuActions[var41] = null;
							playerOptionsPriorities[var41] = false;
						}

						Skeleton.method3921();
						isLoading = true;

						for (var41 = 0; var41 < 100; ++var41) {
							field719[var41] = true;
						}

						var26 = class21.getPacketBufferNode(ClientPacket.field2662, packetWriter.isaacCipher);
						var26.packetBuffer.writeByte(SpotAnimationDefinition.getWindowedMode());
						var26.packetBuffer.writeShort(class32.canvasWidth);
						var26.packetBuffer.writeShort(ReflectionCheck.canvasHeight);
						packetWriter.addNode(var26);
						WorldMapRegion.clanChat = null;
						NPCComposition.field1633 = null;
						Arrays.fill(field734, (Object)null);
						ApproximateRouteStrategy.field630 = null;
						Arrays.fill(field871, (Object)null);

						for (var41 = 0; var41 < 8; ++var41) {
							grandExchangeOffers[var41] = new GrandExchangeOffer();
						}

						BuddyRankComparator.grandExchangeEvents = null;
						Coord.updatePlayer(var2);
						GrandExchangeOfferOwnWorldComparator.field632 = -1;
						class339.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				}
			}
		} catch (IOException var25) {
			if (field845 < 1) {
				if (DesktopPlatformInfoProvider.currentPort == WorldMapLabelSize.worldPort) {
					DesktopPlatformInfoProvider.currentPort = GrandExchangeOfferTotalQuantityComparator.js5Port;
				} else {
					DesktopPlatformInfoProvider.currentPort = WorldMapLabelSize.worldPort;
				}

				++field845;
				loginState = 0;
			} else {
				MouseHandler.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1496762169"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (field746) {
			field746 = false;
			NetFileRequest.method4912();
		} else {
			if (!isMenuOpen) {
				NetSocket.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1192(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				int var2;
				PacketBufferNode var14;
				while (class20.method231()) {
					var14 = class21.getPacketBufferNode(ClientPacket.field2584, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					UserComparator3.performReflectionCheck(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				}

				if (timer.field3769) {
					var14 = class21.getPacketBufferNode(ClientPacket.field2645, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					timer.write(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
					timer.method5593();
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
				int var12;
				PacketBuffer var10000;
				synchronized(Skills.mouseRecorder.lock) {
					if (!field889) {
						Skills.mouseRecorder.index = 0;
					} else if (MouseHandler.MouseHandler_lastButton != 0 || Skills.mouseRecorder.index >= 40) {
						PacketBufferNode var15 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;

						for (var7 = 0; var7 < Skills.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) {
							var4 = var7;
							var8 = Skills.mouseRecorder.ys[var7];
							if (var8 < -1) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}

							var9 = Skills.mouseRecorder.xs[var7];
							if (var9 < -1) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}

							if (var9 != field651 || var8 != field812) {
								if (var15 == null) {
									var15 = class21.getPacketBufferNode(ClientPacket.field2628, packetWriter.isaacCipher);
									var15.packetBuffer.writeByte(0);
									var3 = var15.packetBuffer.offset;
									var10000 = var15.packetBuffer;
									var10000.offset += 2;
									var5 = 0;
									var6 = 0;
								}

								if (-1L != field653) {
									var10 = var9 - field651;
									var11 = var8 - field812;
									var12 = (int)((Skills.mouseRecorder.millis[var7] - field653) / 20L);
									var5 = (int)((long)var5 + (Skills.mouseRecorder.millis[var7] - field653) % 20L);
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}

								field651 = var9;
								field812 = var8;
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
								field653 = Skills.mouseRecorder.millis[var7];
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

						if (var4 >= Skills.mouseRecorder.index) {
							Skills.mouseRecorder.index = 0;
						} else {
							MouseRecorder var48 = Skills.mouseRecorder;
							var48.index -= var4;
							System.arraycopy(Skills.mouseRecorder.xs, var4, Skills.mouseRecorder.xs, 0, Skills.mouseRecorder.index);
							System.arraycopy(Skills.mouseRecorder.ys, var4, Skills.mouseRecorder.ys, 0, Skills.mouseRecorder.index);
							System.arraycopy(Skills.mouseRecorder.millis, var4, Skills.mouseRecorder.millis, 0, Skills.mouseRecorder.index);
						}
					}
				}

				PacketBufferNode var18;
				if (MouseHandler.MouseHandler_lastButton == 1 || !mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
					if (var16 > 32767L) {
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
					var3 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 < 0) {
						var3 = 0;
					} else if (var3 > ReflectionCheck.canvasHeight) {
						var3 = ReflectionCheck.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX;
					if (var4 < 0) {
						var4 = 0;
					} else if (var4 > class32.canvasWidth) {
						var4 = class32.canvasWidth;
					}

					var5 = (int)var16;
					var18 = class21.getPacketBufferNode(ClientPacket.field2663, packetWriter.isaacCipher);
					var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
					var18.packetBuffer.writeShort(var4);
					var18.packetBuffer.writeShort(var3);
					packetWriter.addNode(var18);
				}

				if (KeyHandler.field292 > 0) {
					var14 = class21.getPacketBufferNode(ClientPacket.field2573, packetWriter.isaacCipher);
					var14.packetBuffer.writeShort(0);
					var2 = var14.packetBuffer.offset;
					long var19 = ObjectComposition.currentTimeMillis();

					for (var5 = 0; var5 < KeyHandler.field292; ++var5) {
						long var21 = var19 - field809;
						if (var21 > 16777215L) {
							var21 = 16777215L;
						}

						field809 = var19;
						var14.packetBuffer.method6594(KeyHandler.field274[var5]);
						var14.packetBuffer.method6758((int)var21);
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				}

				if (field725 > 0) {
					--field725;
				}

				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
					field726 = true;
				}

				if (field726 && field725 <= 0) {
					field725 = 20;
					field726 = false;
					var14 = class21.getPacketBufferNode(ClientPacket.field2630, packetWriter.isaacCipher);
					var14.packetBuffer.method6619(camAngleX);
					var14.packetBuffer.writeShort(camAngleY);
					packetWriter.addNode(var14);
				}

				if (WorldMapSection1.hasFocus && !hadFocus) {
					hadFocus = true;
					var14 = class21.getPacketBufferNode(ClientPacket.field2580, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(1);
					packetWriter.addNode(var14);
				}

				if (!WorldMapSection1.hasFocus && hadFocus) {
					hadFocus = false;
					var14 = class21.getPacketBufferNode(ClientPacket.field2580, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					packetWriter.addNode(var14);
				}

				if (class243.worldMap != null) {
					class243.worldMap.method6100();
				}

				if (MusicPatch.ClanChat_inClanChat) {
					if (WorldMapRegion.clanChat != null) {
						WorldMapRegion.clanChat.sort();
					}

					class9.method85();
					MusicPatch.ClanChat_inClanChat = false;
				}

				VarbitComposition.method2846();
				if (class22.Client_plane != field872) {
					field872 = class22.Client_plane;
					GraphicsObject.createMinimapSprite(class22.Client_plane);
				}

				if (gameState == 30) {
					for (PendingSpawn var32 = (PendingSpawn)pendingSpawns.last(); var32 != null; var32 = (PendingSpawn)pendingSpawns.previous()) {
						if (var32.hitpoints > 0) {
							--var32.hitpoints;
						}

						ObjectComposition var23;
						boolean var30;
						if (var32.hitpoints == 0) {
							if (var32.objectId >= 0) {
								var3 = var32.objectId;
								var4 = var32.field1229;
								var23 = class23.getObjectDefinition(var3);
								if (var4 == 11) {
									var4 = 10;
								}

								if (var4 >= 5 && var4 <= 8) {
									var4 = 4;
								}

								var30 = var23.method2956(var4);
								if (!var30) {
									continue;
								}
							}

							class247.addPendingSpawnToScene(var32.plane, var32.type, var32.x, var32.y, var32.objectId, var32.field1225, var32.field1229);
							var32.remove();
						} else {
							if (var32.delay > 0) {
								--var32.delay;
							}

							if (var32.delay == 0 && var32.x >= 1 && var32.y >= 1 && var32.x <= 102 && var32.y <= 102) {
								if (var32.id >= 0) {
									var3 = var32.id;
									var4 = var32.field1232;
									var23 = class23.getObjectDefinition(var3);
									if (var4 == 11) {
										var4 = 10;
									}

									if (var4 >= 5 && var4 <= 8) {
										var4 = 4;
									}

									var30 = var23.method2956(var4);
									if (!var30) {
										continue;
									}
								}

								class247.addPendingSpawnToScene(var32.plane, var32.type, var32.x, var32.y, var32.id, var32.orientation, var32.field1232);
								var32.delay = -1;
								if (var32.objectId == var32.id && var32.objectId == -1) {
									var32.remove();
								} else if (var32.id == var32.objectId && var32.orientation == var32.field1225 && var32.field1229 == var32.field1232) {
									var32.remove();
								}
							}
						}
					}

					int var10002;
					for (var1 = 0; var1 < soundEffectCount; ++var1) {
						var10002 = queuedSoundEffectDelays[var1]--;
						if (queuedSoundEffectDelays[var1] >= -10) {
							SoundEffect var34 = soundEffects[var1];
							if (var34 == null) {
								var10000 = null;
								var34 = SoundEffect.readSoundEffect(class32.field242, soundEffectIds[var1], 0);
								if (var34 == null) {
									continue;
								}

								int[] var49 = queuedSoundEffectDelays;
								var49[var1] += var34.calculateDelay();
								soundEffects[var1] = var34;
							}

							if (queuedSoundEffectDelays[var1] < 0) {
								if (soundLocations[var1] != 0) {
									var4 = (soundLocations[var1] & 255) * 128;
									var5 = soundLocations[var1] >> 16 & 255;
									var6 = var5 * 128 + 64 - class93.localPlayer.x;
									if (var6 < 0) {
										var6 = -var6;
									}

									var7 = soundLocations[var1] >> 8 & 255;
									var8 = var7 * 128 + 64 - class93.localPlayer.y;
									if (var8 < 0) {
										var8 = -var8;
									}

									var9 = var6 + var8 - 128;
									if (var9 > var4) {
										queuedSoundEffectDelays[var1] = -100;
										continue;
									}

									if (var9 < 0) {
										var9 = 0;
									}

									var3 = (var4 - var9) * ObjectComposition.clientPreferences.areaSoundEffectsVolume / var4;
								} else {
									var3 = ObjectComposition.clientPreferences.soundEffectsVolume;
								}

								if (var3 > 0) {
									RawSound var24 = var34.toRawSound().resample(TileItem.decimator);
									RawPcmStream var38 = RawPcmStream.createRawPcmStream(var24, 100, var3);
									var38.setNumLoops(queuedSoundEffectLoops[var1] - 1);
									class308.pcmStreamMixer.addSubStream(var38);
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

					if (field881) {
						boolean var29;
						if (class232.musicPlayerStatus != 0) {
							var29 = true;
						} else {
							var29 = class124.midiPcmStream.isReady();
						}

						if (!var29) {
							if (ObjectComposition.clientPreferences.musicVolume != 0 && currentTrackGroupId != -1) {
								LoginScreenAnimation.method2219(UrlRequest.archive6, currentTrackGroupId, 0, ObjectComposition.clientPreferences.musicVolume, false);
							}

							field881 = false;
						}
					}

					++packetWriter.field1409;
					if (packetWriter.field1409 > 750) {
						NetFileRequest.method4912();
					} else {
						var1 = Players.Players_count;
						int[] var35 = Players.Players_indices;

						for (var3 = 0; var3 < var1; ++var3) {
							Player var40 = players[var35[var3]];
							if (var40 != null) {
								class7.updateActorSequence(var40, 1);
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) {
							var2 = npcIndices[var1];
							NPC var25 = npcs[var2];
							if (var25 != null) {
								class7.updateActorSequence(var25, var25.definition.size);
							}
						}

						class11.method165();
						++field913;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 20;
							if (mouseCrossState * 400 >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (GrandExchangeEvents.field3626 != null) {
							++field747;
							if (field747 >= 15) {
								WorldMapCacheName.invalidateWidget(GrandExchangeEvents.field3626);
								GrandExchangeEvents.field3626 = null;
							}
						}

						Widget var33 = World.mousedOverWidgetIf1;
						Widget var36 = ReflectionCheck.field609;
						World.mousedOverWidgetIf1 = null;
						ReflectionCheck.field609 = null;
						draggedOnWidget = null;
						field822 = false;
						field819 = false;
						field806 = 0;

						while (class9.isKeyDown() && field806 < 128) {
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && ItemComposition.field1859 == 66) {
								String var42 = "";

								Message var37;
								for (Iterator var39 = Messages.Messages_hashTable.iterator(); var39.hasNext(); var42 = var42 + var37.sender + ':' + var37.text + '\n') {
									var37 = (Message)var39.next();
								}

								class23.client.method566(var42);
							} else if (oculusOrbState != 1 || class249.field3116 <= 0) {
								field868[field806] = ItemComposition.field1859;
								field867[field806] = class249.field3116;
								++field806;
							}
						}

						if (FontName.method6297() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) {
							var3 = class93.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != class93.localPlayer.plane) {
								class4.method50(class93.localPlayer.pathX[0] + VertexNormal.baseX * 64, class93.localPlayer.pathY[0] + SoundSystem.baseY * 64, var3, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							class32.updateRootInterface(rootInterface, 0, 0, class32.canvasWidth, ReflectionCheck.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var41;
							ScriptEvent var43;
							Widget var44;
							do {
								var43 = (ScriptEvent)field652.removeLast();
								if (var43 == null) {
									while (true) {
										do {
											var43 = (ScriptEvent)field846.removeLast();
											if (var43 == null) {
												while (true) {
													do {
														var43 = (ScriptEvent)scriptEvents.removeLast();
														if (var43 == null) {
															this.menu();
															if (class243.worldMap != null) {
																class243.worldMap.method6110(class22.Client_plane, VertexNormal.baseX * 64 + (class93.localPlayer.x >> 7), SoundSystem.baseY * 64 + (class93.localPlayer.y >> 7), false);
																class243.worldMap.loadCache();
															}

															if (clickedWidget != null) {
																this.method1198();
															}

															PacketBufferNode var46;
															if (Script.dragInventoryWidget != null) {
																WorldMapCacheName.invalidateWidget(Script.dragInventoryWidget);
																++itemDragDuration;
																if (MouseHandler.MouseHandler_currentButton == 0) {
																	if (field848) {
																		if (Script.dragInventoryWidget == class18.hoveredItemContainer && dragItemSlotSource != dragItemSlotDestination) {
																			Widget var47 = Script.dragInventoryWidget;
																			byte var31 = 0;
																			if (field912 == 1 && var47.contentType == 206) {
																				var31 = 1;
																			}

																			if (var47.itemIds[dragItemSlotDestination] <= 0) {
																				var31 = 0;
																			}

																			if (Canvas.method394(class21.getWidgetFlags(var47))) {
																				var5 = dragItemSlotSource;
																				var6 = dragItemSlotDestination;
																				var47.itemIds[var6] = var47.itemIds[var5];
																				var47.itemQuantities[var6] = var47.itemQuantities[var5];
																				var47.itemIds[var5] = -1;
																				var47.itemQuantities[var5] = 0;
																			} else if (var31 == 1) {
																				var5 = dragItemSlotSource;
																				var6 = dragItemSlotDestination;

																				while (var5 != var6) {
																					if (var5 > var6) {
																						var47.swapItems(var5 - 1, var5);
																						--var5;
																					} else if (var5 < var6) {
																						var47.swapItems(var5 + 1, var5);
																						++var5;
																					}
																				}
																			} else {
																				var47.swapItems(dragItemSlotDestination, dragItemSlotSource);
																			}

																			var46 = class21.getPacketBufferNode(ClientPacket.field2658, packetWriter.isaacCipher);
																			var46.packetBuffer.method6612(Script.dragInventoryWidget.id);
																			var46.packetBuffer.method6594(var31);
																			var46.packetBuffer.method6602(dragItemSlotSource);
																			var46.packetBuffer.writeShort(dragItemSlotDestination);
																			packetWriter.addNode(var46);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX, draggedWidgetY);
																	} else if (menuOptionsCount > 0) {
																		var3 = draggedWidgetX;
																		var4 = draggedWidgetY;
																		MenuAction var45 = ReflectionCheck.tempMenuAction;
																		Script.menuAction(var45.param0, var45.param1, var45.opcode, var45.identifier, var45.action, var45.action, var3, var4);
																		ReflectionCheck.tempMenuAction = null;
																	}

																	field747 = 10;
																	MouseHandler.MouseHandler_lastButton = 0;
																	Script.dragInventoryWidget = null;
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
																	field848 = true;
																}
															}

															if (Scene.shouldSendWalk()) {
																var3 = Scene.Scene_selectedX;
																var4 = Scene.Scene_selectedY;
																var46 = class21.getPacketBufferNode(ClientPacket.field2642, packetWriter.isaacCipher);
																var46.packetBuffer.writeByte(5);
																var46.packetBuffer.method6584(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
																var46.packetBuffer.writeShort(SoundSystem.baseY * 64 + var4);
																var46.packetBuffer.writeShort(VertexNormal.baseX * 64 + var3);
																packetWriter.addNode(var46);
																Scene.method4047();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																mouseCrossColor = 1;
																mouseCrossState = 0;
																destinationX = var3;
																destinationY = var4;
															}

															if (var33 != World.mousedOverWidgetIf1) {
																if (var33 != null) {
																	WorldMapCacheName.invalidateWidget(var33);
																}

																if (World.mousedOverWidgetIf1 != null) {
																	WorldMapCacheName.invalidateWidget(World.mousedOverWidgetIf1);
																}
															}

															if (var36 != ReflectionCheck.field609 && field833 == field792) {
																if (var36 != null) {
																	WorldMapCacheName.invalidateWidget(var36);
																}

																if (ReflectionCheck.field609 != null) {
																	WorldMapCacheName.invalidateWidget(ReflectionCheck.field609);
																}
															}

															if (ReflectionCheck.field609 != null) {
																if (field792 < field833) {
																	++field792;
																	if (field833 == field792) {
																		WorldMapCacheName.invalidateWidget(ReflectionCheck.field609);
																	}
																}
															} else if (field792 > 0) {
																--field792;
															}

															FloorOverlayDefinition.method3104();
															if (isCameraLocked) {
																var3 = VarpDefinition.field1544 * 128 + 64;
																var4 = Ignored.field3847 * 16384 + 64;
																var5 = class105.getTileHeight(var3, var4, class22.Client_plane) - AbstractByteArrayCopier.field3119;
																if (MouseHandler.cameraX < var3) {
																	MouseHandler.cameraX = (var3 - MouseHandler.cameraX) * class18.field156 / 1000 + MouseHandler.cameraX + class35.field264;
																	if (MouseHandler.cameraX > var3) {
																		MouseHandler.cameraX = var3;
																	}
																}

																if (MouseHandler.cameraX > var3) {
																	MouseHandler.cameraX -= class18.field156 * (MouseHandler.cameraX - var3) / 1000 + class35.field264;
																	if (MouseHandler.cameraX < var3) {
																		MouseHandler.cameraX = var3;
																	}
																}

																if (SecureRandomCallable.cameraY < var5) {
																	SecureRandomCallable.cameraY = (var5 - SecureRandomCallable.cameraY) * class18.field156 / 1000 + SecureRandomCallable.cameraY + class35.field264;
																	if (SecureRandomCallable.cameraY > var5) {
																		SecureRandomCallable.cameraY = var5;
																	}
																}

																if (SecureRandomCallable.cameraY > var5) {
																	SecureRandomCallable.cameraY -= class18.field156 * (SecureRandomCallable.cameraY - var5) / 1000 + class35.field264;
																	if (SecureRandomCallable.cameraY < var5) {
																		SecureRandomCallable.cameraY = var5;
																	}
																}

																if (class105.cameraZ < var4) {
																	class105.cameraZ = (var4 - class105.cameraZ) * class18.field156 / 1000 + class105.cameraZ + class35.field264;
																	if (class105.cameraZ > var4) {
																		class105.cameraZ = var4;
																	}
																}

																if (class105.cameraZ > var4) {
																	class105.cameraZ -= class18.field156 * (class105.cameraZ - var4) / 1000 + class35.field264;
																	if (class105.cameraZ < var4) {
																		class105.cameraZ = var4;
																	}
																}

																var3 = ArchiveDisk.field3886 * 128 + 64;
																var4 = class4.field47 * 16384 + 64;
																var5 = class105.getTileHeight(var3, var4, class22.Client_plane) - class18.field153;
																var6 = var3 - MouseHandler.cameraX;
																var7 = var5 - SecureRandomCallable.cameraY;
																var8 = var4 - class105.cameraZ;
																var9 = (int)Math.sqrt((double)(var6 * var6 + var8 * var8));
																var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.949D) & 2047;
																var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.949D) & 2047;
																if (var10 < 128) {
																	var10 = 128;
																}

																if (var10 > 383) {
																	var10 = 383;
																}

																if (SpotAnimationDefinition.cameraPitch < var10) {
																	SpotAnimationDefinition.cameraPitch = (var10 - SpotAnimationDefinition.cameraPitch) * SoundCache.field468 / 1000 + SpotAnimationDefinition.cameraPitch + FriendsList.field3812;
																	if (SpotAnimationDefinition.cameraPitch > var10) {
																		SpotAnimationDefinition.cameraPitch = var10;
																	}
																}

																if (SpotAnimationDefinition.cameraPitch > var10) {
																	SpotAnimationDefinition.cameraPitch -= SoundCache.field468 * (SpotAnimationDefinition.cameraPitch - var10) / 1000 + FriendsList.field3812;
																	if (SpotAnimationDefinition.cameraPitch < var10) {
																		SpotAnimationDefinition.cameraPitch = var10;
																	}
																}

																var12 = var11 - class376.cameraYaw;
																if (var12 > 1024) {
																	var12 -= 2048;
																}

																if (var12 < -1024) {
																	var12 += 2048;
																}

																if (var12 > 0) {
																	class376.cameraYaw = var12 * SoundCache.field468 / 1000 + class376.cameraYaw + FriendsList.field3812;
																	class376.cameraYaw &= 2047;
																}

																if (var12 < 0) {
																	class376.cameraYaw -= -var12 * SoundCache.field468 / 1000 + FriendsList.field3812;
																	class376.cameraYaw &= 2047;
																}

																int var26 = var11 - class376.cameraYaw;
																if (var26 > 1024) {
																	var26 -= 2048;
																}

																if (var26 < -1024) {
																	var26 += 2048;
																}

																if (var26 < 0 && var12 > 0 || var26 > 0 && var12 < 0) {
																	class376.cameraYaw = var11;
																}
															}

															for (var3 = 0; var3 < 5; ++var3) {
																var10002 = field893[var3]++;
															}

															GrandExchangeOfferOwnWorldComparator.varcs.tryWrite();
															var3 = ++MouseHandler.MouseHandler_idleCycles - 1;
															var5 = WorldMapLabelSize.method3206();
															if (var3 > 15000 && var5 > 15000) {
																logoutTimer = 250;
																ArchiveDiskActionHandler.method4867(14500);
																var18 = class21.getPacketBufferNode(ClientPacket.field2644, packetWriter.isaacCipher);
																packetWriter.addNode(var18);
															}

															NetSocket.friendSystem.processFriendUpdates();
															++packetWriter.pendingWrites;
															if (packetWriter.pendingWrites > 50) {
																var18 = class21.getPacketBufferNode(ClientPacket.field2590, packetWriter.isaacCipher);
																packetWriter.addNode(var18);
															}

															try {
																packetWriter.flush();
															} catch (IOException var27) {
																NetFileRequest.method4912();
															}

															return;
														}

														var44 = var43.widget;
														if (var44.childIndex < 0) {
															break;
														}

														var41 = Frames.getWidget(var44.parentId);
													} while(var41 == null || var41.children == null || var44.childIndex >= var41.children.length || var44 != var41.children[var44.childIndex]);

													PacketWriter.runScriptEvent(var43);
												}
											}

											var44 = var43.widget;
											if (var44.childIndex < 0) {
												break;
											}

											var41 = Frames.getWidget(var44.parentId);
										} while(var41 == null || var41.children == null || var44.childIndex >= var41.children.length || var44 != var41.children[var44.childIndex]);

										PacketWriter.runScriptEvent(var43);
									}
								}

								var44 = var43.widget;
								if (var44.childIndex < 0) {
									break;
								}

								var41 = Frames.getWidget(var44.parentId);
							} while(var41 == null || var41.children == null || var44.childIndex >= var41.children.length || var44 != var41.children[var44.childIndex]);

							PacketWriter.runScriptEvent(var43);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "65280"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class32.canvasWidth;
		int var2 = ReflectionCheck.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (ObjectComposition.clientPreferences != null) {
			try {
				class42.method422(class23.client, "resize", new Object[]{SpotAnimationDefinition.getWindowedMode()});
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1520673658"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) {
			var1 = rootInterface;
			if (Clock.loadInterface(var1)) {
				Canvas.drawModelComponents(Widget.Widget_interfaceComponents[var1], -1);
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field719[var1]) {
				field780[var1] = true;
			}

			field860[var1] = field719[var1];
			field719[var1] = false;
		}

		field849 = cycle;
		viewportX = -1;
		viewportY = -1;
		class18.hoveredItemContainer = null;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			class225.drawWidgets(rootInterface, 0, 0, class32.canvasWidth, ReflectionCheck.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				ArchiveLoader.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				ArchiveLoader.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				FileSystem.method2547(viewportX, viewportY);
			}
		} else {
			var1 = class14.menuX;
			int var2 = class243.menuY;
			int var3 = class29.menuWidth;
			int var4 = class24.menuHeight;
			int var5 = 6116423;
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5);
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
			Widget.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1);
			int var6 = MouseHandler.MouseHandler_x;
			int var7 = MouseHandler.MouseHandler_y;

			for (int var8 = 0; var8 < menuOptionsCount; ++var8) {
				int var9 = var2 + (menuOptionsCount - 1 - var8) * 15 + 31;
				int var10 = 16777215;
				if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
					var10 = 16776960;
				}

				Widget.fontBold12.draw(MouseRecorder.method2098(var8), var1 + 3, var9, var10, 0);
			}

			PcmPlayer.method786(class14.menuX, class243.menuY, class29.menuWidth, class24.menuHeight);
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field860[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field780[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		class169.method3549(class22.Client_plane, class93.localPlayer.x, class93.localPlayer.y, field913);
		field913 = 0;
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Lds;I)Z",
		garbageValue = "-2018950508"
	)
	final boolean method1192(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var18;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1408) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1409 = 0;
						var1.field1408 = false;
					}

					var3.offset = 0;
					if (var3.method6529()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1409 = 0;
					}

					var1.field1408 = true;
					ServerPacket[] var4 = class24.ServerPacket_values();
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
				var1.field1409 = 0;
				timer.method5602();
				var1.field1400 = var1.field1412;
				var1.field1412 = var1.field1411;
				var1.field1411 = var1.serverPacket;
				int var7;
				int var8;
				int var9;
				int var60;
				if (ServerPacket.field2732 == var1.serverPacket) {
					var60 = var3.readUnsignedShort();
					var5 = var3.readInt();
					var6 = var60 >> 10 & 31;
					var7 = var60 >> 5 & 31;
					var8 = var60 & 31;
					var9 = (var7 << 11) + (var6 << 19) + (var8 << 3);
					Widget var55 = Frames.getWidget(var5);
					if (var9 != var55.color) {
						var55.color = var9;
						WorldMapCacheName.invalidateWidget(var55);
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var78;
				if (ServerPacket.field2734 == var1.serverPacket) {
					var78 = var3.readBoolean();
					if (var78) {
						if (UserComparator3.field1444 == null) {
							UserComparator3.field1444 = new class285();
						}
					} else {
						UserComparator3.field1444 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2757 == var1.serverPacket) {
					class69.field596 = var3.readUnsignedByte();
					Occluder.field2387 = var3.readUnsignedByte();

					while (var3.offset < var1.serverPacketLength) {
						var60 = var3.readUnsignedByte();
						class225 var71 = PlayerComposition.method4705()[var60];
						Tile.method3843(var71);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2750 == var1.serverPacket) {
					Tile.method3843(class225.field2687);
					var1.serverPacket = null;
					return true;
				}

				String var46;
				if (ServerPacket.field2781 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					Object[] var70 = new Object[var46.length() + 1];

					for (var6 = var46.length() - 1; var6 >= 0; --var6) {
						if (var46.charAt(var6) == 's') {
							var70[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var70[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var70[0] = new Integer(var3.readInt());
					ScriptEvent var77 = new ScriptEvent();
					var77.args = var70;
					PacketWriter.runScriptEvent(var77);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2759 == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) {
						if (hintArrowType == 2) {
							hintArrowSubX = 64;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 128;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 64;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 64;
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

				if (ServerPacket.field2711 == var1.serverPacket) {
					Tile.method3843(class225.field2683);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2730 == var1.serverPacket) {
					class34.field254 = new class339(ViewportMouse.HitSplatDefinition_cachedSprites);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2777 == var1.serverPacket) {
					var60 = var3.readUnsignedByte();
					class15.forceDisconnect(var60);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2752 == var1.serverPacket) {
					var60 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var60] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var60] = new GrandExchangeOffer(var3, false);
					}

					field840 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2741 == var1.serverPacket) {
					ScriptEvent.privateChatMode = class124.method2498(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2746 == var1.serverPacket) {
					Tile.method3843(class225.field2681);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2704 == var1.serverPacket) {
					var60 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					BufferedSource.queueSoundEffect(var60, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				Widget var67;
				if (ServerPacket.field2717 == var1.serverPacket) {
					var60 = var3.readInt();
					var5 = var3.readUnsignedShort();
					var67 = Frames.getWidget(var60);
					if (var67.modelType != 2 || var5 != var67.modelId) {
						var67.modelType = 2;
						var67.modelId = var5;
						WorldMapCacheName.invalidateWidget(var67);
					}

					var1.serverPacket = null;
					return true;
				}

				int var20;
				if (ServerPacket.field2788 == var1.serverPacket) {
					isCameraLocked = true;
					ArchiveDisk.field3886 = var3.readUnsignedByte() * 16384;
					class4.field47 = var3.readUnsignedByte() * 128;
					class18.field153 = var3.readUnsignedShort();
					FriendsList.field3812 = var3.readUnsignedByte();
					SoundCache.field468 = var3.readUnsignedByte();
					if (SoundCache.field468 >= 100) {
						var60 = ArchiveDisk.field3886 * 128 + 64;
						var5 = class4.field47 * 16384 + 64;
						var6 = class105.getTileHeight(var60, var5, class22.Client_plane) - class18.field153;
						var7 = var60 - MouseHandler.cameraX;
						var8 = var6 - SecureRandomCallable.cameraY;
						var9 = var5 - class105.cameraZ;
						var20 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
						SpotAnimationDefinition.cameraPitch = (int)(Math.atan2((double)var8, (double)var20) * 325.949D) & 2047;
						class376.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047;
						if (SpotAnimationDefinition.cameraPitch < 128) {
							SpotAnimationDefinition.cameraPitch = 128;
						}

						if (SpotAnimationDefinition.cameraPitch > 383) {
							SpotAnimationDefinition.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2776 == var1.serverPacket) {
					var60 = var3.method6613();
					var5 = var3.method6726();
					var67 = Frames.getWidget(var60);
					if (var5 != var67.sequenceId || var5 == -1) {
						var67.sequenceId = var5;
						var67.modelFrame = 0;
						var67.modelFrameCycle = 0;
						WorldMapCacheName.invalidateWidget(var67);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2721 == var1.serverPacket) {
					Tile.method3843(class225.field2689);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2709 == var1.serverPacket) {
					Tile.method3843(class225.field2686);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2714 == var1.serverPacket) {
					var60 = var3.readUnsignedByte();
					class11.method163(var60);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2738 == var1.serverPacket) {
					if (class34.field254 == null) {
						class34.field254 = new class339(ViewportMouse.HitSplatDefinition_cachedSprites);
					}

					class390 var51 = ViewportMouse.HitSplatDefinition_cachedSprites.method6021(var3);
					class34.field254.field3921.vmethod6364(var51.field4219, var51.field4218);
					field911[++field852 - 1 & 31] = var51.field4219;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2735 == var1.serverPacket) {
					NetSocket.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field836 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2701 == var1.serverPacket) {
					isCameraLocked = true;
					VarpDefinition.field1544 = var3.readUnsignedByte() * 16384;
					Ignored.field3847 = var3.readUnsignedByte() * 128;
					AbstractByteArrayCopier.field3119 = var3.readUnsignedShort();
					class35.field264 = var3.readUnsignedByte();
					class18.field156 = var3.readUnsignedByte();
					if (class18.field156 >= 100) {
						MouseHandler.cameraX = VarpDefinition.field1544 * 128 + 64;
						class105.cameraZ = Ignored.field3847 * 16384 + 64;
						SecureRandomCallable.cameraY = class105.getTileHeight(MouseHandler.cameraX, class105.cameraZ, class22.Client_plane) - AbstractByteArrayCopier.field3119;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2767 == var1.serverPacket) {
					SoundSystem.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2772 == var1.serverPacket) {
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

				InterfaceParent var21;
				Widget var74;
				if (ServerPacket.field2743 == var1.serverPacket) {
					var60 = var3.method6614();
					var5 = var3.method6614();
					InterfaceParent var76 = (InterfaceParent)interfaceParents.get((long)var5);
					var21 = (InterfaceParent)interfaceParents.get((long)var60);
					if (var21 != null) {
						class43.closeInterface(var21, var76 == null || var21.group != var76.group);
					}

					if (var76 != null) {
						var76.remove();
						interfaceParents.put(var76, (long)var60);
					}

					var74 = Frames.getWidget(var5);
					if (var74 != null) {
						WorldMapCacheName.invalidateWidget(var74);
					}

					var74 = Frames.getWidget(var60);
					if (var74 != null) {
						WorldMapCacheName.invalidateWidget(var74);
						class313.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var74.id >>> 16], var74, true);
					}

					if (rootInterface != -1) {
						Login.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2729 == var1.serverPacket) {
					FriendLoginUpdate.method5690(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2736 == var1.serverPacket) {
					var60 = var3.readInt();
					InterfaceParent var68 = (InterfaceParent)interfaceParents.get((long)var60);
					if (var68 != null) {
						class43.closeInterface(var68, true);
					}

					if (meslayerContinueWidget != null) {
						WorldMapCacheName.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2722 == var1.serverPacket) {
					if (rootInterface != -1) {
						Login.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				long var12;
				if (ServerPacket.field2775 == var1.serverPacket) {
					var60 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						class21.Widget_resetModelFrames(rootInterface);
						FloorDecoration.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							field719[var7] = true;
						}
					}

					InterfaceParent var53;
					for (; var6-- > 0; var53.field1165 = true) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var53 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var53 != null && var8 != var53.group) {
							class43.closeInterface(var53, true);
							var53 = null;
						}

						if (var53 == null) {
							var53 = class17.method208(var7, var8, var9);
						}
					}

					for (var21 = (InterfaceParent)interfaceParents.first(); var21 != null; var21 = (InterfaceParent)interfaceParents.next()) {
						if (var21.field1165) {
							var21.field1165 = false;
						} else {
							class43.closeInterface(var21, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var60) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var20 = var3.readInt();

						for (int var56 = var8; var56 <= var9; ++var56) {
							var12 = ((long)var7 << 32) + (long)var56;
							widgetFlags.put(new IntegerNode(var20), var12);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2705 == var1.serverPacket) {
					var78 = var3.method6549() == 1;
					var5 = var3.method6598();
					var67 = Frames.getWidget(var5);
					if (var78 != var67.isHidden) {
						var67.isHidden = var78;
						WorldMapCacheName.invalidateWidget(var67);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2751 == var1.serverPacket) {
					class34.field254 = null;
					var1.serverPacket = null;
					return true;
				}

				int var15;
				long var23;
				long var25;
				long var27;
				String var30;
				if (ServerPacket.field2785 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					var23 = var3.readLong();
					var25 = (long)var3.readUnsignedShort();
					var27 = (long)var3.readMedium();
					PlayerType var79 = (PlayerType)Messages.findEnumerated(class372.PlayerType_values(), var3.readUnsignedByte());
					var12 = var27 + (var25 << 32);
					boolean var59 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (var12 == crossWorldMessageIds[var15]) {
							var59 = true;
							break;
						}
					}

					if (var79.isUser && NetSocket.friendSystem.isIgnored(new Username(var46, WorldMapSection0.loginType))) {
						var59 = true;
					}

					if (!var59 && field755 == 0) {
						crossWorldMessageIds[field865] = var12;
						field865 = (field865 + 1) % 100;
						var30 = AbstractFont.escapeBrackets(class43.method433(MusicPatch.method4592(var3)));
						if (var79.modIcon != -1) {
							class5.addChatMessage(9, SecureRandomFuture.method1982(var79.modIcon) + var46, var30, class258.base37DecodeLong(var23));
						} else {
							class5.addChatMessage(9, var46, var30, class258.base37DecodeLong(var23));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2770 == var1.serverPacket) {
					Tile.method3843(class225.field2685);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2779 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					var5 = var3.method6614();
					var67 = Frames.getWidget(var5);
					if (!var46.equals(var67.text)) {
						var67.text = var46;
						WorldMapCacheName.invalidateWidget(var67);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2787 == var1.serverPacket) {
					var60 = var3.method6603();
					var5 = var3.method6598();
					var67 = Frames.getWidget(var5);
					if (var67.modelType != 1 || var60 != var67.modelId) {
						var67.modelType = 1;
						var67.modelId = var60;
						WorldMapCacheName.invalidateWidget(var67);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2706 == var1.serverPacket) {
					var60 = var3.readInt();
					if (var60 != field723) {
						field723 = var60;
						Script.method1999();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2778 == var1.serverPacket) {
					class7.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2737 == var1.serverPacket) {
					World var50 = new World();
					var50.host = var3.readStringCp1252NullTerminated();
					var50.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var50.properties = var5;
					class12.updateGameState(45);
					var2.close();
					var2 = null;
					class0.changeWorld(var50);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2728 == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShort() * 30;
					field659 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				String var72;
				if (ServerPacket.field2765 == var1.serverPacket) {
					byte[] var48 = new byte[var1.serverPacketLength];
					var3.method6521(var48, 0, var48.length);
					Buffer var66 = new Buffer(var48);
					var72 = var66.readStringCp1252NullTerminated();
					Players.openURL(var72, true, false);
					var1.serverPacket = null;
					return true;
				}

				byte var17;
				if (ServerPacket.field2739 == var1.serverPacket) {
					class124.method2496();
					var17 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var17 >= 0) {
							field734[var17] = null;
						} else {
							NPCComposition.field1633 = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var17 >= 0) {
						field734[var17] = new class11(var3);
					} else {
						NPCComposition.field1633 = new class11(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2724 == var1.serverPacket) {
					var60 = var3.method6598();
					var5 = var3.method6603();
					var67 = Frames.getWidget(var60);
					if (var67 != null && var67.type == 0) {
						if (var5 > var67.scrollHeight - var67.height) {
							var5 = var67.scrollHeight - var67.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var67.scrollY) {
							var67.scrollY = var5;
							WorldMapCacheName.invalidateWidget(var67);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2790 == var1.serverPacket) {
					for (var60 = 0; var60 < Varps.Varps_main.length; ++var60) {
						if (Varps.Varps_main[var60] != Varps.Varps_temp[var60]) {
							Varps.Varps_main[var60] = Varps.Varps_temp[var60];
							ApproximateRouteStrategy.changeGameOptions(var60);
							changedVarps[++changedVarpCount - 1 & 31] = var60;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2710 == var1.serverPacket) {
					PlayerComposition.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2792 == var1.serverPacket) {
					var60 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var60 < -70000) {
						var5 += 32768;
					}

					if (var60 >= 0) {
						var67 = Frames.getWidget(var60);
					} else {
						var67 = null;
					}

					for (; var3.offset < var1.serverPacketLength; class4.itemContainerSetItem(var5, var7, var8 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var9 = 0;
						if (var8 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var67 != null && var7 >= 0 && var7 < var67.itemIds.length) {
							var67.itemIds[var7] = var8;
							var67.itemQuantities[var7] = var9;
						}
					}

					if (var67 != null) {
						WorldMapCacheName.invalidateWidget(var67);
					}

					class170.method3554();
					changedItemContainers[++field830 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2780 == var1.serverPacket) {
					class339.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2726 == var1.serverPacket) {
					FriendSystem.updatePlayers(var3, var1.serverPacketLength);
					ObjectSound.method1761();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2769 == var1.serverPacket) {
					Tile.method3843(class225.field2680);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2760 == var1.serverPacket) {
					class170.method3554();
					runEnergy = var3.readUnsignedByte();
					field659 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2718 == var1.serverPacket) {
					var60 = var3.readUnsignedShort();
					if (var60 == 65535) {
						var60 = -1;
					}

					var5 = var3.method6613();
					var6 = var3.method6605();
					if (var6 == 65535) {
						var6 = -1;
					}

					var7 = var3.method6598();

					for (var8 = var60; var8 <= var6; ++var8) {
						var27 = ((long)var7 << 32) + (long)var8;
						Node var29 = widgetFlags.get(var27);
						if (var29 != null) {
							var29.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var27);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2764 == var1.serverPacket) {
					var60 = var3.readInt();
					var5 = var3.readInt();
					var6 = class43.getGcDuration();
					PacketBufferNode var73 = class21.getPacketBufferNode(ClientPacket.field2634, packetWriter.isaacCipher);
					var73.packetBuffer.method6611(var60);
					var73.packetBuffer.writeInt(var5);
					var73.packetBuffer.method6581(GameEngine.fps);
					var73.packetBuffer.method6584(var6);
					packetWriter.addNode(var73);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2786 == var1.serverPacket) {
					class339.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2712 == var1.serverPacket) {
					Tile.method3843(class225.field2682);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2727 == var1.serverPacket) {
					var78 = var3.readUnsignedByte() == 1;
					if (var78) {
						Widget.field3099 = ObjectComposition.currentTimeMillis() - var3.readLong();
						BuddyRankComparator.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						BuddyRankComparator.grandExchangeEvents = null;
					}

					field748 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2789 == var1.serverPacket) {
					isCameraLocked = false;

					for (var60 = 0; var60 < 5; ++var60) {
						field693[var60] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var69;
				if (ServerPacket.field2753 == var1.serverPacket) {
					var60 = var3.method6598();
					var5 = var3.method6614();
					var6 = var3.method6604();
					if (var6 == 65535) {
						var6 = -1;
					}

					var69 = Frames.getWidget(var5);
					ItemComposition var75;
					if (!var69.isIf3) {
						if (var6 == -1) {
							var69.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var75 = class260.ItemDefinition_get(var6);
						var69.modelType = 4;
						var69.modelId = var6;
						var69.modelAngleX = var75.xan2d;
						var69.modelAngleY = var75.yan2d;
						var69.modelZoom = var75.zoom2d * 100 / var60;
						WorldMapCacheName.invalidateWidget(var69);
					} else {
						var69.itemId = var6;
						var69.itemQuantity = var60;
						var75 = class260.ItemDefinition_get(var6);
						var69.modelAngleX = var75.xan2d;
						var69.modelAngleY = var75.yan2d;
						var69.modelAngleZ = var75.zan2d;
						var69.modelOffsetX = var75.offsetX2d;
						var69.modelOffsetY = var75.offsetY2d;
						var69.modelZoom = var75.zoom2d;
						if (var75.isStackable == 1) {
							var69.itemQuantityMode = 1;
						} else {
							var69.itemQuantityMode = 2;
						}

						if (var69.field3013 > 0) {
							var69.modelZoom = var69.modelZoom * 32 / var69.field3013;
						} else if (var69.rawWidth > 0) {
							var69.modelZoom = var69.modelZoom * 32 / var69.rawWidth;
						}

						WorldMapCacheName.invalidateWidget(var69);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2794 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2745 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					var18 = AbstractFont.escapeBrackets(class43.method433(MusicPatch.method4592(var3)));
					World.addGameMessage(6, var46, var18);
					var1.serverPacket = null;
					return true;
				}

				String var32;
				int var57;
				if (ServerPacket.field2719 == var1.serverPacket) {
					var17 = var3.readByte();
					var23 = (long)var3.readUnsignedShort();
					var25 = (long)var3.readMedium();
					var27 = var25 + (var23 << 32);
					boolean var11 = false;
					class3 var31 = var17 >= 0 ? field871[var17] : ApproximateRouteStrategy.field630;
					if (var31 == null) {
						var11 = true;
					} else {
						for (var57 = 0; var57 < 100; ++var57) {
							if (var27 == crossWorldMessageIds[var57]) {
								var11 = true;
								break;
							}
						}
					}

					if (!var11) {
						crossWorldMessageIds[field865] = var27;
						field865 = (field865 + 1) % 100;
						var32 = MusicPatch.method4592(var3);
						int var58 = var17 >= 0 ? 43 : 46;
						class5.addChatMessage(var58, "", var32, var31.field31);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2708 == var1.serverPacket) {
					Occluder.field2387 = var3.method6595();
					class69.field596 = var3.method6549();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2762 == var1.serverPacket) {
					var60 = var3.method6603();
					var5 = var3.method6605();
					var6 = var3.method6604();
					var7 = var3.method6598();
					var74 = Frames.getWidget(var7);
					if (var60 != var74.modelAngleX || var5 != var74.modelAngleY || var6 != var74.modelZoom) {
						var74.modelAngleX = var60;
						var74.modelAngleY = var5;
						var74.modelZoom = var6;
						WorldMapCacheName.invalidateWidget(var74);
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var64;
				if (ServerPacket.field2761 == var1.serverPacket) {
					var60 = var3.method6614();
					var64 = Frames.getWidget(var60);
					var64.modelType = 3;
					var64.modelId = class93.localPlayer.appearance.getChatHeadId();
					WorldMapCacheName.invalidateWidget(var64);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2763 == var1.serverPacket) {
					var60 = var3.readUShortSmart();
					boolean var54 = var3.readUnsignedByte() == 1;
					var72 = "";
					boolean var52 = false;
					if (var54) {
						var72 = var3.readStringCp1252NullTerminated();
						if (NetSocket.friendSystem.isIgnored(new Username(var72, WorldMapSection0.loginType))) {
							var52 = true;
						}
					}

					String var22 = var3.readStringCp1252NullTerminated();
					if (!var52) {
						World.addGameMessage(var60, var72, var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2793 == var1.serverPacket) {
					class170.method3554();
					weight = var3.readShort();
					field659 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2791 == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByte();
					tradeChatMode = var3.method6549();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2784 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						class245.method4714(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2740 == var1.serverPacket) {
					var60 = var3.readUnsignedShort();
					if (var60 == 65535) {
						var60 = -1;
					}

					class27.playSong(var60);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2725 == var1.serverPacket) {
					var60 = var3.method6604();
					if (var60 == 65535) {
						var60 = -1;
					}

					var5 = var3.method6610();
					GrandExchangeOfferNameComparator.method5059(var60, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2754 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					var5 = var3.method6549();
					var6 = var3.method6671();
					if (var5 >= 1 && var5 <= 8) {
						if (var46.equalsIgnoreCase("null")) {
							var46 = null;
						}

						playerMenuActions[var5 - 1] = var46;
						playerOptionsPriorities[var5 - 1] = var6 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2748 == var1.serverPacket) {
					var60 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field693[var60] = true;
					field890[var60] = var5;
					field891[var60] = var6;
					field892[var60] = var7;
					field893[var60] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2783 == var1.serverPacket) {
					class69.field596 = var3.readUnsignedByte();
					Occluder.field2387 = var3.readUnsignedByte();

					for (var60 = Occluder.field2387; var60 < Occluder.field2387 + 8; ++var60) {
						for (var5 = class69.field596; var5 < class69.field596 + 8; ++var5) {
							if (groundItems[class22.Client_plane][var60][var5] != null) {
								groundItems[class22.Client_plane][var60][var5] = null;
								class11.updateItemPile(var60, var5);
							}
						}
					}

					for (PendingSpawn var47 = (PendingSpawn)pendingSpawns.last(); var47 != null; var47 = (PendingSpawn)pendingSpawns.previous()) {
						if (var47.x >= Occluder.field2387 && var47.x < Occluder.field2387 + 8 && var47.y >= class69.field596 && var47.y < class69.field596 + 8 && var47.plane == class22.Client_plane) {
							var47.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2723 == var1.serverPacket) {
					for (var60 = 0; var60 < players.length; ++var60) {
						if (players[var60] != null) {
							players[var60].sequence = -1;
						}
					}

					for (var60 = 0; var60 < npcs.length; ++var60) {
						if (npcs[var60] != null) {
							npcs[var60].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2715 == var1.serverPacket) {
					var60 = var3.method6613();
					var64 = Frames.getWidget(var60);

					for (var6 = 0; var6 < var64.itemIds.length; ++var6) {
						var64.itemIds[var6] = -1;
						var64.itemIds[var6] = 0;
					}

					WorldMapCacheName.invalidateWidget(var64);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2774 == var1.serverPacket) {
					class170.method3554();
					var60 = var3.method6595();
					var5 = var3.method6549();
					var6 = var3.method6614();
					experience[var5] = var6;
					currentLevels[var5] = var60;
					levels[var5] = 1;

					for (var7 = 0; var7 < 98; ++var7) {
						if (var6 >= Skills.Skills_experienceTable[var7]) {
							levels[var5] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2782 == var1.serverPacket) {
					NetSocket.friendSystem.method1698();
					field836 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2747 == var1.serverPacket) {
					var60 = var3.method6614();
					var5 = var3.method6605();
					var6 = var3.method6605();
					var69 = Frames.getWidget(var60);
					var69.field3014 = var6 + (var5 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2731 == var1.serverPacket) {
					var60 = var3.method6614();
					var5 = var3.readUnsignedShort();
					Varps.Varps_temp[var5] = var60;
					if (Varps.Varps_main[var5] != var60) {
						Varps.Varps_main[var5] = var60;
					}

					ApproximateRouteStrategy.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2771 == var1.serverPacket) {
					var60 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var60 < -70000) {
						var5 += 32768;
					}

					if (var60 >= 0) {
						var67 = Frames.getWidget(var60);
					} else {
						var67 = null;
					}

					if (var67 != null) {
						for (var7 = 0; var7 < var67.itemIds.length; ++var7) {
							var67.itemIds[var7] = 0;
							var67.itemQuantities[var7] = 0;
						}
					}

					GrandExchangeOfferOwnWorldComparator.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var3.method6604();
						var20 = var3.method6595();
						if (var20 == 255) {
							var20 = var3.method6613();
						}

						if (var67 != null && var8 < var67.itemIds.length) {
							var67.itemIds[var8] = var9;
							var67.itemQuantities[var8] = var20;
						}

						class4.itemContainerSetItem(var5, var8, var9 - 1, var20);
					}

					if (var67 != null) {
						WorldMapCacheName.invalidateWidget(var67);
					}

					class170.method3554();
					changedItemContainers[++field830 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2756 == var1.serverPacket) {
					var60 = var3.method6604();
					Login.method1941(var60);
					changedItemContainers[++field830 - 1 & 31] = var60 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2720 == var1.serverPacket) {
					if (WorldMapRegion.clanChat != null) {
						WorldMapRegion.clanChat.method5659(var3);
					}

					CollisionMap.method3155();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2755 == var1.serverPacket) {
					for (var60 = 0; var60 < VarpDefinition.VarpDefinition_fileCount; ++var60) {
						VarpDefinition var63 = class11.VarpDefinition_get(var60);
						if (var63 != null) {
							Varps.Varps_temp[var60] = 0;
							Varps.Varps_main[var60] = 0;
						}
					}

					class170.method3554();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2707 == var1.serverPacket) {
					SoundSystem.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2702 == var1.serverPacket) {
					var60 = var3.readUnsignedShort();
					byte var49 = var3.readByte();
					Varps.Varps_temp[var60] = var49;
					if (Varps.Varps_main[var60] != var49) {
						Varps.Varps_main[var60] = var49;
					}

					ApproximateRouteStrategy.changeGameOptions(var60);
					changedVarps[++changedVarpCount - 1 & 31] = var60;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2768 == var1.serverPacket) {
					NetSocket.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					MouseRecorder.FriendSystem_invalidateIgnoreds();
					field836 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2744 == var1.serverPacket) {
					Tile.method3843(class225.field2684);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2713 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					var23 = (long)var3.readUnsignedShort();
					var25 = (long)var3.readMedium();
					PlayerType var33 = (PlayerType)Messages.findEnumerated(class372.PlayerType_values(), var3.readUnsignedByte());
					long var34 = var25 + (var23 << 32);
					boolean var36 = false;

					for (var57 = 0; var57 < 100; ++var57) {
						if (crossWorldMessageIds[var57] == var34) {
							var36 = true;
							break;
						}
					}

					if (NetSocket.friendSystem.isIgnored(new Username(var46, WorldMapSection0.loginType))) {
						var36 = true;
					}

					if (!var36 && field755 == 0) {
						crossWorldMessageIds[field865] = var34;
						field865 = (field865 + 1) % 100;
						var32 = AbstractFont.escapeBrackets(class43.method433(MusicPatch.method4592(var3)));
						byte var14;
						if (var33.isPrivileged) {
							var14 = 7;
						} else {
							var14 = 3;
						}

						if (var33.modIcon != -1) {
							World.addGameMessage(var14, SecureRandomFuture.method1982(var33.modIcon) + var46, var32);
						} else {
							World.addGameMessage(var14, var46, var32);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2742 == var1.serverPacket) {
					var17 = var3.readByte();
					var18 = var3.readStringCp1252NullTerminated();
					long var37 = (long)var3.readUnsignedShort();
					long var39 = (long)var3.readMedium();
					PlayerType var10 = (PlayerType)Messages.findEnumerated(class372.PlayerType_values(), var3.readUnsignedByte());
					long var41 = (var37 << 32) + var39;
					boolean var13 = false;
					class3 var43 = null;
					var43 = var17 >= 0 ? field871[var17] : ApproximateRouteStrategy.field630;
					if (var43 == null) {
						var13 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var10.isUser && NetSocket.friendSystem.isIgnored(new Username(var18, WorldMapSection0.loginType))) {
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
						crossWorldMessageIds[field865] = var41;
						field865 = (field865 + 1) % 100;
						var30 = AbstractFont.escapeBrackets(MusicPatch.method4592(var3));
						int var16 = var17 >= 0 ? 41 : 44;
						if (var10.modIcon != -1) {
							class5.addChatMessage(var16, SecureRandomFuture.method1982(var10.modIcon) + var18, var30, var43.field31);
						} else {
							class5.addChatMessage(var16, var18, var30, var43.field31);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2716 == var1.serverPacket) {
					field839 = cycleCntr;
					var17 = var3.readByte();
					class19 var62 = new class19(var3);
					class3 var65;
					if (var17 >= 0) {
						var65 = field871[var17];
					} else {
						var65 = ApproximateRouteStrategy.field630;
					}

					var62.method218(var65);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2798 == var1.serverPacket) {
					class124.method2496();
					var17 = var3.readByte();
					class2 var61 = new class2(var3);
					class11 var19;
					if (var17 >= 0) {
						var19 = field734[var17];
					} else {
						var19 = NPCComposition.field1633;
					}

					var61.method16(var19);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2703 == var1.serverPacket) {
					var60 = var3.method6661();
					var5 = var3.method6598();
					var6 = var3.method6621();
					var69 = Frames.getWidget(var5);
					if (var6 != var69.rawX || var60 != var69.rawY || var69.xAlignment != 0 || var69.yAlignment != 0) {
						var69.rawX = var6;
						var69.rawY = var60;
						var69.xAlignment = 0;
						var69.yAlignment = 0;
						WorldMapCacheName.invalidateWidget(var69);
						this.alignWidget(var69);
						if (var69.type == 0) {
							class313.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var5 >> 16], var69, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2773 == var1.serverPacket) {
					var60 = var3.readUnsignedByte();
					var5 = var3.method6605();
					var6 = var3.method6613();
					var21 = (InterfaceParent)interfaceParents.get((long)var6);
					if (var21 != null) {
						class43.closeInterface(var21, var5 != var21.group);
					}

					class17.method208(var6, var5, var60);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2700 == var1.serverPacket) {
					var60 = var3.method6603();
					rootInterface = var60;
					this.resizeRoot(false);
					class21.Widget_resetModelFrames(var60);
					FloorDecoration.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field719[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2749 == var1.serverPacket) {
					if (var1.serverPacketLength == 0) {
						WorldMapRegion.clanChat = null;
					} else {
						if (WorldMapRegion.clanChat == null) {
							WorldMapRegion.clanChat = new FriendsChatManager(WorldMapSection0.loginType, class23.client);
						}

						WorldMapRegion.clanChat.readUpdate(var3);
					}

					CollisionMap.method3155();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2795 == var1.serverPacket) {
					Tile.method3843(class225.field2688);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2766 == var1.serverPacket) {
					field839 = cycleCntr;
					var17 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var17 >= 0) {
							field871[var17] = null;
						} else {
							ApproximateRouteStrategy.field630 = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var17 >= 0) {
						field871[var17] = new class3(var3);
					} else {
						ApproximateRouteStrategy.field630 = new class3(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				class266.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1412 != null ? var1.field1412.id : -1) + "," + (var1.field1400 != null ? var1.field1400.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				class7.logOut();
			} catch (IOException var44) {
				NetFileRequest.method4912();
			} catch (Exception var45) {
				var18 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1412 != null ? var1.field1412.id : -1) + "," + (var1.field1400 != null ? var1.field1400.id : -1) + "," + var1.serverPacketLength + "," + (class93.localPlayer.pathX[0] + VertexNormal.baseX * 64) + "," + (class93.localPlayer.pathY[0] + SoundSystem.baseY * 64) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var18 = var18 + var3.array[var6] + ",";
				}

				class266.RunException_sendStackTrace(var18, var45);
				class7.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("menu")
	final void menu() {
		class377.method6509();
		if (Script.dragInventoryWidget == null) {
			if (clickedWidget == null) {
				int var2;
				int var4;
				int var5;
				int var9;
				int var10;
				label272: {
					int var1 = MouseHandler.MouseHandler_lastButton;
					int var3;
					int var8;
					if (isMenuOpen) {
						int var13;
						int var15;
						if (var1 != 1 && (mouseCam || var1 != 4)) {
							var2 = MouseHandler.MouseHandler_x;
							var3 = MouseHandler.MouseHandler_y;
							if (var2 < class14.menuX - 10 || var2 > class14.menuX + class29.menuWidth + 10 || var3 < class243.menuY - 10 || var3 > class243.menuY + class24.menuHeight + 10) {
								isMenuOpen = false;
								var4 = class14.menuX;
								var5 = class243.menuY;
								var13 = class29.menuWidth;
								var15 = class24.menuHeight;

								for (var8 = 0; var8 < rootWidgetCount; ++var8) {
									if (rootWidgetWidths[var8] + rootWidgetXs[var8] > var4 && rootWidgetXs[var8] < var13 + var4 && rootWidgetHeights[var8] + rootWidgetYs[var8] > var5 && rootWidgetYs[var8] < var5 + var15) {
										field719[var8] = true;
									}
								}
							}
						}

						if (var1 == 1 || !mouseCam && var1 == 4) {
							var2 = class14.menuX;
							var3 = class243.menuY;
							var4 = class29.menuWidth;
							var5 = MouseHandler.MouseHandler_lastPressedX;
							var13 = MouseHandler.MouseHandler_lastPressedY;
							var15 = -1;

							for (var8 = 0; var8 < menuOptionsCount; ++var8) {
								var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31;
								if (var5 > var2 && var5 < var2 + var4 && var13 > var9 - 13 && var13 < var9 + 3) {
									var15 = var8;
								}
							}

							if (var15 != -1) {
								Interpreter.method1888(var15);
							}

							isMenuOpen = false;
							var8 = class14.menuX;
							var9 = class243.menuY;
							var10 = class29.menuWidth;
							int var14 = class24.menuHeight;

							for (int var12 = 0; var12 < rootWidgetCount; ++var12) {
								if (rootWidgetXs[var12] + rootWidgetWidths[var12] > var8 && rootWidgetXs[var12] < var10 + var8 && rootWidgetYs[var12] + rootWidgetHeights[var12] > var9 && rootWidgetYs[var12] < var9 + var14) {
									field719[var12] = true;
								}
							}
						}
					} else {
						var2 = MilliClock.method2588();
						if ((var1 == 1 || !mouseCam && var1 == 4) && var2 >= 0) {
							var3 = menuOpcodes[var2];
							if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) {
								var4 = menuArguments1[var2];
								var5 = menuArguments2[var2];
								Widget var6 = Frames.getWidget(var5);
								var8 = class21.getWidgetFlags(var6);
								boolean var7 = (var8 >> 28 & 1) != 0;
								if (var7) {
									break label272;
								}

								Object var10000 = null;
								if (Canvas.method394(class21.getWidgetFlags(var6))) {
									break label272;
								}
							}
						}

						if ((var1 == 1 || !mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) {
							var1 = 2;
						}

						if ((var1 == 1 || !mouseCam && var1 == 4) && menuOptionsCount > 0) {
							Interpreter.method1888(var2);
						}

						if (var1 == 2 && menuOptionsCount > 0) {
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}

					return;
				}

				if (Script.dragInventoryWidget != null && !field848 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
					var9 = draggedWidgetX;
					var10 = draggedWidgetY;
					MenuAction var11 = ReflectionCheck.tempMenuAction;
					Script.menuAction(var11.param0, var11.param1, var11.opcode, var11.identifier, var11.action, var11.action, var9, var10);
					ReflectionCheck.tempMenuAction = null;
				}

				field848 = false;
				itemDragDuration = 0;
				if (Script.dragInventoryWidget != null) {
					WorldMapCacheName.invalidateWidget(Script.dragInventoryWidget);
				}

				Script.dragInventoryWidget = Frames.getWidget(var5);
				dragItemSlotSource = var4;
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
				if (var2 >= 0) {
					ReflectionCheck.tempMenuAction = new MenuAction();
					ReflectionCheck.tempMenuAction.param0 = menuArguments1[var2];
					ReflectionCheck.tempMenuAction.param1 = menuArguments2[var2];
					ReflectionCheck.tempMenuAction.opcode = menuOpcodes[var2];
					ReflectionCheck.tempMenuAction.identifier = menuIdentifiers[var2];
					ReflectionCheck.tempMenuAction.action = menuActions[var2];
				}

				WorldMapCacheName.invalidateWidget(Script.dragInventoryWidget);
			}
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1407075512"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = MilliClock.method2588();
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || class5.method51(var1)) && !menuShiftClick[var1];
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1521465353"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		ReflectionCheck.method1126(var1, var2);
		AbstractSocket.scene.menuOpen(class22.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2038823416"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		PlayerType.method4857(rootInterface, class32.canvasWidth, ReflectionCheck.canvasHeight, var1);
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Lio;I)V",
		garbageValue = "2012935641"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : Frames.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = class32.canvasWidth;
			var4 = ReflectionCheck.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		Clock.alignWidgetSize(var1, var3, var4, false);
		class24.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-72"
	)
	final void method1198() {
		WorldMapCacheName.invalidateWidget(clickedWidget);
		++Actor.widgetDragDuration;
		if (field822 && field819) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field740) {
				var1 = field740;
			}

			if (var1 + clickedWidget.width > field740 + clickedWidgetParent.width) {
				var1 = field740 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field821) {
				var2 = field821;
			}

			if (var2 + clickedWidget.height > field821 + clickedWidgetParent.height) {
				var2 = field821 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field854;
			int var4 = var2 - field804;
			int var5 = clickedWidget.dragZoneSize;
			if (Actor.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field740 + clickedWidgetParent.scrollX;
			int var7 = var2 - field821 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				PacketWriter.runScriptEvent(var8);
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
						PacketWriter.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && StructComposition.method2892(clickedWidget) != null) {
						PacketBufferNode var12 = class21.getPacketBufferNode(ClientPacket.field2586, packetWriter.isaacCipher);
						var12.packetBuffer.method6611(draggedOnWidget.id);
						var12.packetBuffer.method6602(clickedWidget.itemId);
						var12.packetBuffer.writeShort(draggedOnWidget.childIndex);
						var12.packetBuffer.writeInt(clickedWidget.id);
						var12.packetBuffer.writeShort(draggedOnWidget.itemId);
						var12.packetBuffer.method6602(clickedWidget.childIndex);
						packetWriter.addNode(var12);
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field854 + widgetClickX, widgetClickY + field804);
				} else if (menuOptionsCount > 0) {
					int var11 = field854 + widgetClickX;
					int var9 = widgetClickY + field804;
					MenuAction var10 = ReflectionCheck.tempMenuAction;
					Script.menuAction(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.action, var10.action, var11, var9);
					ReflectionCheck.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		} else {
			if (Actor.widgetDragDuration > 1) {
				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(I)Lly;",
		garbageValue = "-1180229355"
	)
	@Export("username")
	public Username username() {
		return class93.localPlayer != null ? class93.localPlayer.username : null;
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2028963456"
	)
	static boolean method1514() {
		return (drawPlayerNames & 4) != 0;
	}
}
