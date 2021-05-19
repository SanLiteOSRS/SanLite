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
	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "[Lx;"
	)
	static class11[] field678;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = 1788518295
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = -113595795
	)
	static int field824;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		longValue = 5266993254335523925L
	)
	static long field833;
	@ObfuscatedName("qc")
	static boolean field866;
	@ObfuscatedName("oi")
	static boolean[] field825;
	@ObfuscatedName("pb")
	static boolean[] field636;
	@ObfuscatedName("oe")
	static boolean[] field826;
	@ObfuscatedName("pq")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("tm")
	@ObfuscatedGetter(
		intValue = -1549606513
	)
	public static int field687;
	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("pr")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("pf")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = 262990251
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("px")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	static final ApproximateRouteStrategy field894;
	@ObfuscatedName("pj")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = 1483097923
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = -40329921
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = 616687799
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("tt")
	static int[] field828;
	@ObfuscatedName("th")
	static int[] field896;
	@ObfuscatedName("tr")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = 1233962749
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("sx")
	@ObfuscatedGetter(
		intValue = -735836521
	)
	static int field630;
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		intValue = -85732501
	)
	static int field631;
	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "[Lg;"
	)
	static class3[] field847;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = 850098079
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = -236108179
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("rj")
	@ObfuscatedGetter(
		intValue = -1291952621
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("ro")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("rl")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("rh")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "[Lah;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = 789202625
	)
	static int field848;
	@ObfuscatedName("rc")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		longValue = -3798909112925654061L
	)
	static long field799;
	@ObfuscatedName("ri")
	static boolean[] field846;
	@ObfuscatedName("rn")
	static int[] field744;
	@ObfuscatedName("sr")
	static short field820;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = 628214371
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("re")
	static int[] field868;
	@ObfuscatedName("sh")
	static short field872;
	@ObfuscatedName("sf")
	static short field877;
	@ObfuscatedName("rs")
	static int[] field869;
	@ObfuscatedName("ss")
	static short field878;
	@ObfuscatedName("sd")
	static int[] field870;
	@ObfuscatedName("qm")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("sl")
	static short field738;
	@ObfuscatedName("sb")
	@ObfuscatedGetter(
		intValue = -210947507
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("si")
	static short field875;
	@ObfuscatedName("st")
	@ObfuscatedGetter(
		intValue = -1100911913
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("qp")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("tk")
	@ObfuscatedGetter(
		intValue = 1410279679
	)
	static int field893;
	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("ra")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = -924623343
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = 1145926541
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -1876245101
	)
	static int field842;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		intValue = -1350718359
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("su")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("sj")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("rx")
	@ObfuscatedGetter(
		intValue = -155897984
	)
	static int field696;
	@ObfuscatedName("po")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("pv")
	static int[] field844;
	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static NodeDeque field865;
	@ObfuscatedName("pz")
	static int[] field746;
	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static NodeDeque field821;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = 1716898751
	)
	static int field841;
	@ObfuscatedName("sp")
	@ObfuscatedSignature(
		descriptor = "[Ljm;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = -1775028253
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = 2144397203
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("pk")
	static int[] field651;
	@ObfuscatedName("pw")
	static String field843;
	@ObfuscatedName("sk")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lfa;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("an")
	static boolean field767;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -692981731
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1329265657
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 2041787237
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bt")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("by")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1908341387
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -437666989
	)
	static int field621;
	@ObfuscatedName("bi")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 2142578293
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cq")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 991600141
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		longValue = -7684819836719052823L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1325156765
	)
	static int field627;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -72303975
	)
	static int field837;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		longValue = 2473810867611188183L
	)
	static long field629;
	@ObfuscatedName("cp")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("cr")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 1479862317
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -225259253
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1520579627
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 163411299
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1197232959
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 878242253
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1456763518
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 219564971
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1088742720
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 210105277
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 216100051
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 2041285997
	)
	static int field646;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = 1231560959
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = 1387097531
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = -340243899
	)
	static int field649;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = -512490615
	)
	static int field749;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 153516227
	)
	static int field673;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static class125 field652;
	@ObfuscatedName("eb")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lcx;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fa")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "[Lds;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = 1541459935
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("fo")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = 1005735511
	)
	static int field661;
	@ObfuscatedName("fe")
	static int[] field662;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = 1365433979
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("fk")
	static boolean field789;
	@ObfuscatedName("fc")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("fd")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 844995417
	)
	static int field669;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = 242618933
	)
	static int field670;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 914071231
	)
	static int field671;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = -347228261
	)
	static int field672;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = -1685518623
	)
	static int field790;
	@ObfuscatedName("ge")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("gt")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("gi")
	static final int[] field677;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = -1396894627
	)
	static int field768;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = -148347713
	)
	static int field679;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = -2098931785
	)
	static int field680;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = 10479103
	)
	static int field681;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = -1139086205
	)
	static int field658;
	@ObfuscatedName("hg")
	static boolean field683;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -1528783631
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = -1461862337
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("hr")
	@ObfuscatedGetter(
		intValue = 844977603
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = 1815922645
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("he")
	@ObfuscatedGetter(
		intValue = 1379421729
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("hc")
	@ObfuscatedGetter(
		intValue = 2142968919
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = 541743917
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		intValue = -618034625
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = 1408776823
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = 363746617
	)
	static int field693;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = -763624637
	)
	static int field694;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = -1603870419
	)
	static int field695;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = -832411863
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("iv")
	@ObfuscatedGetter(
		intValue = -217353197
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = 102452491
	)
	static int field839;
	@ObfuscatedName("io")
	static boolean field699;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = -941791215
	)
	static int field700;
	@ObfuscatedName("ih")
	static boolean field701;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = 1674344591
	)
	static int field702;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = 1530805403
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = 1202936959
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("iu")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("id")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ig")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("ib")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("iy")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("jk")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("jq")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("jh")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("jr")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = -853391295
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = -1874267305
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = 963772291
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = 41238441
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = 109132029
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 790228439
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -1356198849
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("jg")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 265343843
	)
	static int field817;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 349995619
	)
	static int field633;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = 1346918943
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 1136970621
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = 631327227
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = 1883127447
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("jl")
	static boolean field728;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = 776678463
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = -932914447
	)
	static int field727;
	@ObfuscatedName("jn")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "[Lcg;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = 1354032689
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = -1658998443
	)
	static int field734;
	@ObfuscatedName("kz")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 1751716757
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = -533269303
	)
	static int field737;
	@ObfuscatedName("kc")
	static int[] field614;
	@ObfuscatedName("kh")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("kq")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("kv")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("ks")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = -566095449
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "[[[Lka;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("kf")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("kg")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("lv")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = 1571858545
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("lj")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 505897793
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("lm")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("lr")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("lf")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("lo")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("lq")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ls")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("la")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("lc")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ld")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("ly")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("lw")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = 603205383
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = 601388073
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = 1882009083
	)
	static int field741;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = 1654565793
	)
	static int field811;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -1660999759
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("mi")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = -740413975
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = 1336991211
	)
	static int field773;
	@ObfuscatedName("ml")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("ma")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = -357201731
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -354031881
	)
	static int field778;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = 45793283
	)
	static int field779;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = -517702931
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = 2005264199
	)
	static int field781;
	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = -1243890845
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = 104863933
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = -850293393
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = -597963117
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("nj")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = 667205137
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = -1660810691
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("nh")
	static boolean field794;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = -2004615367
	)
	static int field795;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = -699615005
	)
	static int field785;
	@ObfuscatedName("nz")
	static boolean field797;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = 1453699169
	)
	static int field871;
	@ObfuscatedName("nx")
	@ObfuscatedGetter(
		intValue = 116122765
	)
	static int field798;
	@ObfuscatedName("nn")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("nk")
	@ObfuscatedGetter(
		intValue = 367486059
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("nd")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("nw")
	@ObfuscatedGetter(
		intValue = -1280387963
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("ns")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = -657143437
	)
	static int field805;
	@ObfuscatedName("nf")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = -1210343069
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("op")
	static int[] field808;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = 1273627685
	)
	static int field809;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = -499616417
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = -1349767563
	)
	static int field801;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = 1371918319
	)
	static int field698;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -781333479
	)
	static int field822;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = 151143003
	)
	static int field814;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = -90279163
	)
	static int field815;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = -195161785
	)
	static int field816;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = 690686753
	)
	static int field731;
	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	Buffer field655;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	class35 field656;

	static {
		field767 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		clientType = -1;
		field621 = -1;
		onMobile = false;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field627 = -1;
		field837 = -1;
		field629 = -1L;
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
		field646 = 0;
		js5Errors = 0;
		loginState = 0;
		field649 = 0;
		field749 = 0;
		field673 = 0;
		field652 = class125.field1449;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[32768];
		npcCount = 0;
		npcIndices = new int[32768];
		field661 = 0;
		field662 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		field789 = false;
		useBufferedSocket = true;
		timer = new Timer();
		fontsMap = new HashMap();
		field669 = 0;
		field670 = 1;
		field671 = 0;
		field672 = 1;
		field790 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field677 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field768 = 0;
		field679 = 2301979;
		field680 = 5063219;
		field681 = 3353893;
		field658 = 7759444;
		field683 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field693 = 0;
		field694 = 0;
		field695 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field839 = 0;
		field699 = false;
		field700 = 0;
		field701 = false;
		field702 = 0;
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
		field817 = 0;
		field633 = 0;
		dragItemSlotSource = 0;
		draggedWidgetX = 0;
		draggedWidgetY = 0;
		dragItemSlotDestination = 0;
		field728 = false;
		itemDragDuration = 0;
		field727 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field734 = 0;
		renderSelf = true;
		drawPlayerNames = 0;
		field737 = 0;
		field614 = new int[1000];
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
		field741 = 0;
		field811 = 50;
		isItemSelected = 0;
		selectedItemName = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		field773 = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field778 = 0;
		field779 = -1;
		chatEffects = 0;
		field781 = 0;
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
		field794 = false;
		field795 = -1;
		field785 = -1;
		field797 = false;
		field871 = -1;
		field798 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field805 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field808 = new int[32];
		field809 = 0;
		chatCycle = 0;
		field801 = 0;
		field698 = 0;
		field822 = 0;
		field814 = 0;
		field815 = 0;
		field816 = 0;
		field731 = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		field865 = new NodeDeque();
		field821 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field824 = -2;
		field825 = new boolean[100];
		field826 = new boolean[100];
		field636 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field833 = 0L;
		isResizable = true;
		field651 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field843 = "";
		crossWorldMessageIds = new long[100];
		field841 = 0;
		field842 = 0;
		field746 = new int[128];
		field844 = new int[128];
		field799 = -1L;
		field678 = new class11[1];
		field847 = new class3[1];
		field848 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		currentTrackGroupId = -1;
		field866 = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field846 = new boolean[5];
		field744 = new int[5];
		field868 = new int[5];
		field869 = new int[5];
		field870 = new int[5];
		field820 = 256;
		field872 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field875 = 1;
		field738 = 32767;
		field877 = 1;
		field878 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field630 = -1;
		field631 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field687 = -1;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field893 = 0;
		field894 = new ApproximateRouteStrategy();
		field828 = new int[50];
		field896 = new int[50];
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-997141942"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field833 = Archive.currentTimeMillis() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1254682788"
	)
	@Export("setUp")
	protected final void setUp() {
		Players.method2312(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		class69.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		class24.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		BoundaryObject.currentPort = class69.worldPort;
		PlayerComposition.field2934 = class245.field2949;
		Canvas.field295 = class245.field2948;
		Script.field1064 = class245.field2950;
		PlayerComposition.field2937 = class245.field2951;
		class19.urlRequester = new UrlRequester();
		this.setUpKeyboard();
		this.setUpMouse();
		class2.mouseWheel = this.mouseWheel();
		class1.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var2 = null;
		ClientPreferences var3 = new ClientPreferences();

		try {
			var2 = Buddy.getPreferencesFile("", NetSocket.field1492.name, false);
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

		class12.clientPreferences = var3;
		this.setUpClipboard();
		String var9 = ModeWhere.null_string;
		class44.applet = this;
		if (var9 != null) {
			class44.field305 = var9;
		}

		if (gameBuild != 0) {
			displayFps = true;
		}

		class374.setWindowedMode(class12.clientPreferences.windowMode);
		GrandExchangeOfferUnitPriceComparator.friendSystem = new FriendSystem(ModeWhere.loginType);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "302617031"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();
		class10.method109();
		class371.method6333();
		WorldMapIcon_1.playPcmPlayers();
		Players.method2311();
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

		int var45;
		if (class2.mouseWheel != null) {
			var45 = class2.mouseWheel.useRotation();
			mouseWheelRotation = var45;
		}

		if (gameState == 0) {
			UrlRequest.load();
			WorldMapRectangle.clock.mark();

			for (var45 = 0; var45 < 32; ++var45) {
				GameEngine.graphicsTickTimes[var45] = 0L;
			}

			for (var45 = 0; var45 < 32; ++var45) {
				GameEngine.clientTickTimes[var45] = 0L;
			}

			GameEngine.gameCyclesToDo = 0;
		} else if (gameState == 5) {
			class179.doCycleTitle(this);
			UrlRequest.load();
			WorldMapRectangle.clock.mark();

			for (var45 = 0; var45 < 32; ++var45) {
				GameEngine.graphicsTickTimes[var45] = 0L;
			}

			for (var45 = 0; var45 < 32; ++var45) {
				GameEngine.clientTickTimes[var45] = 0L;
			}

			GameEngine.gameCyclesToDo = 0;
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class179.doCycleTitle(this);
				this.doCycleLoggedOut();
			} else if (gameState == 25) {
				class9.method97(false);
				field669 = 0;
				boolean var77 = true;

				int var46;
				for (var46 = 0; var46 < Messages.regionLandArchives.length; ++var46) {
					if (class264.regionMapArchiveIds[var46] != -1 && Messages.regionLandArchives[var46] == null) {
						Messages.regionLandArchives[var46] = WorldMapSection0.archive7.takeFile(class264.regionMapArchiveIds[var46], 0);
						if (Messages.regionLandArchives[var46] == null) {
							var77 = false;
							++field669;
						}
					}

					if (class15.regionLandArchiveIds[var46] != -1 && class159.regionMapArchives[var46] == null) {
						class159.regionMapArchives[var46] = WorldMapSection0.archive7.takeFileEncrypted(class15.regionLandArchiveIds[var46], 0, FriendsList.xteaKeys[var46]);
						if (class159.regionMapArchives[var46] == null) {
							var77 = false;
							++field669;
						}
					}
				}

				if (!var77) {
					field790 = 1;
				} else {
					field671 = 0;
					var77 = true;

					int var4;
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
					for (var46 = 0; var46 < Messages.regionLandArchives.length; ++var46) {
						byte[] var3 = class159.regionMapArchives[var46];
						if (var3 != null) {
							var4 = (HealthBar.regions[var46] >> 8) * 64 - JagexCache.baseX * 64;
							var5 = (HealthBar.regions[var46] & 255) * 64 - Messages.baseY * 64;
							if (isInInstance) {
								var4 = 10;
								var5 = 10;
							}

							boolean var8 = true;
							var9 = new Buffer(var3);
							var10 = -1;

							label1497:
							while (true) {
								var11 = var9.method6462();
								if (var11 == 0) {
									var77 &= var8;
									break;
								}

								var10 += var11;
								var12 = 0;
								boolean var13 = false;

								while (true) {
									while (!var13) {
										var14 = var9.readUShortSmart();
										if (var14 == 0) {
											continue label1497;
										}

										var12 += var14 - 1;
										var15 = var12 & 63;
										var16 = var12 >> 6 & 63;
										var17 = var9.readUnsignedByte() >> 2;
										var18 = var4 + var16;
										var19 = var5 + var15;
										if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
											ObjectComposition var20 = AttackOption.getObjectDefinition(var10);
											if (var17 != 22 || !isLowDetail || var20.int1 != 0 || var20.interactType == 1 || var20.boolean2) {
												if (!var20.needsModelFiles()) {
													++field671;
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

					if (!var77) {
						field790 = 2;
					} else {
						if (field790 != 0) {
							class7.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
						}

						WorldMapIcon_1.playPcmPlayers();
						class5.scene.clear();

						for (var46 = 0; var46 < 4; ++var46) {
							collisionMaps[var46].clear();
						}

						int var47;
						for (var46 = 0; var46 < 4; ++var46) {
							for (var47 = 0; var47 < 104; ++var47) {
								for (var4 = 0; var4 < 104; ++var4) {
									Tiles.Tiles_renderFlags[var46][var47][var4] = 0;
								}
							}
						}

						WorldMapIcon_1.playPcmPlayers();
						Tiles.Tiles_minPlane = 99;
						Tiles.field1097 = new byte[4][104][104];
						class9.field71 = new byte[4][104][104];
						Tiles.field1088 = new byte[4][104][104];
						Tiles.field1086 = new byte[4][104][104];
						Tiles.field1105 = new int[4][105][105];
						Tiles.field1090 = new byte[4][105][105];
						StructComposition.field1730 = new int[105][105];
						Tiles.Tiles_hue = new int[104];
						class280.Tiles_saturation = new int[104];
						Tiles.Tiles_lightness = new int[104];
						class20.Tiles_hueMultiplier = new int[104];
						AbstractByteArrayCopier.field3115 = new int[104];
						var46 = Messages.regionLandArchives.length;

						for (ObjectSound var66 = (ObjectSound)ObjectSound.objectSounds.last(); var66 != null; var66 = (ObjectSound)ObjectSound.objectSounds.previous()) {
							if (var66.stream1 != null) {
								FloorOverlayDefinition.pcmStreamMixer.removeSubStream(var66.stream1);
								var66.stream1 = null;
							}

							if (var66.stream2 != null) {
								FloorOverlayDefinition.pcmStreamMixer.removeSubStream(var66.stream2);
								var66.stream2 = null;
							}
						}

						ObjectSound.objectSounds.clear();
						class9.method97(true);
						int var6;
						int var7;
						int[] var10000;
						int var21;
						int var22;
						int var53;
						int var69;
						int var71;
						if (!isInInstance) {
							var47 = 0;

							label1429:
							while (true) {
								byte[] var48;
								if (var47 >= var46) {
									for (var47 = 0; var47 < var46; ++var47) {
										var4 = (HealthBar.regions[var47] >> 8) * 64 - JagexCache.baseX * 64;
										var5 = (HealthBar.regions[var47] & 255) * 64 - Messages.baseY * 64;
										var48 = Messages.regionLandArchives[var47];
										if (var48 == null && class11.field112 < 800) {
											WorldMapIcon_1.playPcmPlayers();
											FileSystem.method2542(var4, var5, 64, 64);
										}
									}

									class9.method97(true);
									var47 = 0;

									while (true) {
										if (var47 >= var46) {
											break label1429;
										}

										byte[] var50 = class159.regionMapArchives[var47];
										if (var50 != null) {
											var5 = (HealthBar.regions[var47] >> 8) * 64 - JagexCache.baseX * 64;
											var6 = (HealthBar.regions[var47] & 255) * 64 - Messages.baseY * 64;
											WorldMapIcon_1.playPcmPlayers();
											Scene var51 = class5.scene;
											CollisionMap[] var52 = collisionMaps;
											var9 = new Buffer(var50);
											var10 = -1;

											while (true) {
												var11 = var9.method6462();
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

														FriendsChatManager.method5541(var16, var53, var21, var10, var19, var18, var51, var23);
													}
												}
											}
										}

										++var47;
									}
								}

								var4 = (HealthBar.regions[var47] >> 8) * 64 - JagexCache.baseX * 64;
								var5 = (HealthBar.regions[var47] & 255) * 64 - Messages.baseY * 64;
								var48 = Messages.regionLandArchives[var47];
								if (var48 != null) {
									WorldMapIcon_1.playPcmPlayers();
									var7 = MusicPatchNode2.field2827 * 8 - 48;
									var69 = class11.field112 * 8 - 48;
									CollisionMap[] var70 = collisionMaps;
									var10 = 0;

									label1426:
									while (true) {
										if (var10 >= 4) {
											Buffer var49 = new Buffer(var48);
											var11 = 0;

											while (true) {
												if (var11 >= 4) {
													break label1426;
												}

												for (var12 = 0; var12 < 64; ++var12) {
													for (var71 = 0; var71 < 64; ++var71) {
														AbstractWorldMapData.loadTerrain(var49, var11, var4 + var12, var5 + var71, var7, var69, 0);
													}
												}

												++var11;
											}
										}

										for (var11 = 0; var11 < 64; ++var11) {
											for (var12 = 0; var12 < 64; ++var12) {
												if (var11 + var4 > 0 && var4 + var11 < 103 && var12 + var5 > 0 && var5 + var12 < 103) {
													var10000 = var70[var10].flags[var11 + var4];
													var10000[var5 + var12] &= -16777217;
												}
											}
										}

										++var10;
									}
								}

								++var47;
							}
						}

						int var24;
						int var25;
						int var26;
						int var27;
						int var28;
						int var29;
						int var30;
						int var33;
						int var34;
						int var35;
						int var36;
						int var37;
						int var39;
						int var40;
						int var41;
						int var54;
						int var58;
						if (isInInstance) {
							var47 = 0;

							label1362:
							while (true) {
								if (var47 >= 4) {
									for (var47 = 0; var47 < 13; ++var47) {
										for (var4 = 0; var4 < 13; ++var4) {
											var5 = instanceChunkTemplates[0][var47][var4];
											if (var5 == -1) {
												FileSystem.method2542(var47 * 8, var4 * 8, 8, 8);
											}
										}
									}

									class9.method97(true);
									var47 = 0;

									while (true) {
										if (var47 >= 4) {
											break label1362;
										}

										WorldMapIcon_1.playPcmPlayers();

										for (var4 = 0; var4 < 13; ++var4) {
											label1285:
											for (var5 = 0; var5 < 13; ++var5) {
												var6 = instanceChunkTemplates[var47][var4][var5];
												if (var6 != -1) {
													var7 = var6 >> 24 & 3;
													var69 = var6 >> 1 & 3;
													var54 = var6 >> 14 & 1023;
													var10 = var6 >> 3 & 2047;
													var11 = (var54 / 8 << 8) + var10 / 8;

													for (var12 = 0; var12 < HealthBar.regions.length; ++var12) {
														if (HealthBar.regions[var12] == var11 && class159.regionMapArchives[var12] != null) {
															byte[] var55 = class159.regionMapArchives[var12];
															var14 = var4 * 8;
															var15 = var5 * 8;
															var16 = (var54 & 7) * 8;
															var17 = (var10 & 7) * 8;
															Scene var56 = class5.scene;
															CollisionMap[] var57 = collisionMaps;
															Buffer var72 = new Buffer(var55);
															var21 = -1;

															while (true) {
																var22 = var72.method6462();
																if (var22 == 0) {
																	continue label1285;
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
																	if (var27 == var7 && var26 >= var16 && var26 < var16 + 8 && var25 >= var17 && var25 < var17 + 8) {
																		ObjectComposition var31 = AttackOption.getObjectDefinition(var21);
																		var34 = var26 & 7;
																		var35 = var25 & 7;
																		var37 = var31.sizeX;
																		int var38 = var31.sizeY;
																		if ((var30 & 1) == 1) {
																			var39 = var37;
																			var37 = var38;
																			var38 = var39;
																		}

																		var36 = var69 & 3;
																		if (var36 == 0) {
																			var33 = var34;
																		} else if (var36 == 1) {
																			var33 = var35;
																		} else if (var36 == 2) {
																			var33 = 7 - var34 - (var37 - 1);
																		} else {
																			var33 = 7 - var35 - (var38 - 1);
																		}

																		var39 = var14 + var33;
																		var40 = var15 + GameEngine.method674(var26 & 7, var25 & 7, var69, var31.sizeX, var31.sizeY, var30);
																		if (var39 > 0 && var40 > 0 && var39 < 103 && var40 < 103) {
																			var41 = var47;
																			if ((Tiles.Tiles_renderFlags[1][var39][var40] & 2) == 2) {
																				var41 = var47 - 1;
																			}

																			CollisionMap var42 = null;
																			if (var41 >= 0) {
																				var42 = var57[var41];
																			}

																			FriendsChatManager.method5541(var47, var39, var40, var21, var69 + var30 & 3, var29, var56, var42);
																		}
																	}
																}
															}
														}
													}
												}
											}
										}

										++var47;
									}
								}

								WorldMapIcon_1.playPcmPlayers();

								for (var4 = 0; var4 < 13; ++var4) {
									for (var5 = 0; var5 < 13; ++var5) {
										boolean var68 = false;
										var7 = instanceChunkTemplates[var47][var4][var5];
										if (var7 != -1) {
											var69 = var7 >> 24 & 3;
											var54 = var7 >> 1 & 3;
											var10 = var7 >> 14 & 1023;
											var11 = var7 >> 3 & 2047;
											var12 = (var10 / 8 << 8) + var11 / 8;

											for (var71 = 0; var71 < HealthBar.regions.length; ++var71) {
												if (HealthBar.regions[var71] == var12 && Messages.regionLandArchives[var71] != null) {
													class29.method355(Messages.regionLandArchives[var71], var47, var4 * 8, var5 * 8, var69, (var10 & 7) * 8, (var11 & 7) * 8, var54, collisionMaps);
													var68 = true;
													break;
												}
											}
										}

										if (!var68) {
											var69 = var47;
											var54 = var4 * 8;
											var10 = var5 * 8;

											for (var11 = 0; var11 < 8; ++var11) {
												for (var12 = 0; var12 < 8; ++var12) {
													Tiles.Tiles_heights[var69][var11 + var54][var10 + var12] = 0;
												}
											}

											if (var54 > 0) {
												for (var11 = 1; var11 < 8; ++var11) {
													Tiles.Tiles_heights[var69][var54][var11 + var10] = Tiles.Tiles_heights[var69][var54 - 1][var11 + var10];
												}
											}

											if (var10 > 0) {
												for (var11 = 1; var11 < 8; ++var11) {
													Tiles.Tiles_heights[var69][var11 + var54][var10] = Tiles.Tiles_heights[var69][var54 + var11][var10 - 1];
												}
											}

											if (var54 > 0 && Tiles.Tiles_heights[var69][var54 - 1][var10] != 0) {
												Tiles.Tiles_heights[var69][var54][var10] = Tiles.Tiles_heights[var69][var54 - 1][var10];
											} else if (var10 > 0 && Tiles.Tiles_heights[var69][var54][var10 - 1] != 0) {
												Tiles.Tiles_heights[var69][var54][var10] = Tiles.Tiles_heights[var69][var54][var10 - 1];
											} else if (var54 > 0 && var10 > 0 && Tiles.Tiles_heights[var69][var54 - 1][var10 - 1] != 0) {
												Tiles.Tiles_heights[var69][var54][var10] = Tiles.Tiles_heights[var69][var54 - 1][var10 - 1];
											}
										}
									}
								}

								++var47;
							}
						}

						class9.method97(true);
						WorldMapIcon_1.playPcmPlayers();
						Scene var67 = class5.scene;
						CollisionMap[] var81 = collisionMaps;

						for (var5 = 0; var5 < 4; ++var5) {
							for (var6 = 0; var6 < 104; ++var6) {
								for (var7 = 0; var7 < 104; ++var7) {
									if ((Tiles.Tiles_renderFlags[var5][var6][var7] & 1) == 1) {
										var69 = var5;
										if ((Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) {
											var69 = var5 - 1;
										}

										if (var69 >= 0) {
											var81[var69].setBlockedByFloor(var6, var7);
										}
									}
								}
							}
						}

						Tiles.field1092 += (int)(Math.random() * 5.0D) - 2;
						if (Tiles.field1092 < -8) {
							Tiles.field1092 = -8;
						}

						if (Tiles.field1092 > 8) {
							Tiles.field1092 = 8;
						}

						Tiles.field1101 += (int)(Math.random() * 5.0D) - 2;
						if (Tiles.field1101 < -16) {
							Tiles.field1101 = -16;
						}

						if (Tiles.field1101 > 16) {
							Tiles.field1101 = 16;
						}

						for (var5 = 0; var5 < 4; ++var5) {
							byte[][] var78 = Tiles.field1090[var5];
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
									var58 = (var78[var15][var14 + 1] >> 3) + (var78[var15 - 1][var14] >> 2) + (var78[var15][var14 - 1] >> 2) + (var78[var15 + 1][var14] >> 3) + (var78[var15][var14] >> 1);
									StructComposition.field1730[var15][var14] = var22 - var58;
								}
							}

							for (var14 = 0; var14 < 104; ++var14) {
								Tiles.Tiles_hue[var14] = 0;
								class280.Tiles_saturation[var14] = 0;
								Tiles.Tiles_lightness[var14] = 0;
								class20.Tiles_hueMultiplier[var14] = 0;
								AbstractByteArrayCopier.field3115[var14] = 0;
							}

							for (var14 = -5; var14 < 109; ++var14) {
								for (var15 = 0; var15 < 104; ++var15) {
									var16 = var14 + 5;
									int var10002;
									if (var16 >= 0 && var16 < 104) {
										var17 = Tiles.field1097[var5][var16][var15] & 255;
										if (var17 > 0) {
											var19 = var17 - 1;
											FloorUnderlayDefinition var73 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var19);
											FloorUnderlayDefinition var82;
											if (var73 != null) {
												var82 = var73;
											} else {
												byte[] var59 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var19);
												var73 = new FloorUnderlayDefinition();
												if (var59 != null) {
													var73.decode(new Buffer(var59), var19);
												}

												var73.postDecode();
												FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var73, (long)var19);
												var82 = var73;
											}

											var10000 = Tiles.Tiles_hue;
											var10000[var15] += var82.hue;
											var10000 = class280.Tiles_saturation;
											var10000[var15] += var82.saturation;
											var10000 = Tiles.Tiles_lightness;
											var10000[var15] += var82.lightness;
											var10000 = class20.Tiles_hueMultiplier;
											var10000[var15] += var82.hueMultiplier;
											var10002 = AbstractByteArrayCopier.field3115[var15]++;
										}
									}

									var17 = var14 - 5;
									if (var17 >= 0 && var17 < 104) {
										var18 = Tiles.field1097[var5][var17][var15] & 255;
										if (var18 > 0) {
											var53 = var18 - 1;
											FloorUnderlayDefinition var84 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var53);
											FloorUnderlayDefinition var83;
											if (var84 != null) {
												var83 = var84;
											} else {
												byte[] var60 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var53);
												var84 = new FloorUnderlayDefinition();
												if (var60 != null) {
													var84.decode(new Buffer(var60), var53);
												}

												var84.postDecode();
												FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var84, (long)var53);
												var83 = var84;
											}

											var10000 = Tiles.Tiles_hue;
											var10000[var15] -= var83.hue;
											var10000 = class280.Tiles_saturation;
											var10000[var15] -= var83.saturation;
											var10000 = Tiles.Tiles_lightness;
											var10000[var15] -= var83.lightness;
											var10000 = class20.Tiles_hueMultiplier;
											var10000[var15] -= var83.hueMultiplier;
											var10002 = AbstractByteArrayCopier.field3115[var15]--;
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
											var15 += Tiles.Tiles_hue[var21];
											var16 += class280.Tiles_saturation[var21];
											var17 += Tiles.Tiles_lightness[var21];
											var18 += class20.Tiles_hueMultiplier[var21];
											var19 += AbstractByteArrayCopier.field3115[var21];
										}

										var22 = var53 - 5;
										if (var22 >= 0 && var22 < 104) {
											var15 -= Tiles.Tiles_hue[var22];
											var16 -= class280.Tiles_saturation[var22];
											var17 -= Tiles.Tiles_lightness[var22];
											var18 -= class20.Tiles_hueMultiplier[var22];
											var19 -= AbstractByteArrayCopier.field3115[var22];
										}

										if (var53 >= 1 && var53 < 103 && (!isLowDetail || (Tiles.Tiles_renderFlags[0][var14][var53] & 2) != 0 || (Tiles.Tiles_renderFlags[var5][var14][var53] & 16) == 0)) {
											if (var5 < Tiles.Tiles_minPlane) {
												Tiles.Tiles_minPlane = var5;
											}

											var58 = Tiles.field1097[var5][var14][var53] & 255;
											var24 = class9.field71[var5][var14][var53] & 255;
											if (var58 > 0 || var24 > 0) {
												var25 = Tiles.Tiles_heights[var5][var14][var53];
												var26 = Tiles.Tiles_heights[var5][var14 + 1][var53];
												var27 = Tiles.Tiles_heights[var5][var14 + 1][var53 + 1];
												var28 = Tiles.Tiles_heights[var5][var14][var53 + 1];
												var29 = StructComposition.field1730[var14][var53];
												var30 = StructComposition.field1730[var14 + 1][var53];
												int var61 = StructComposition.field1730[var14 + 1][var53 + 1];
												int var32 = StructComposition.field1730[var14][var53 + 1];
												var33 = -1;
												var34 = -1;
												if (var58 > 0) {
													var35 = var15 * 256 / var18;
													var36 = var16 / var19;
													var37 = var17 / var19;
													var33 = Message.hslToRgb(var35, var36, var37);
													var35 = var35 + Tiles.field1092 & 255;
													var37 += Tiles.field1101;
													if (var37 < 0) {
														var37 = 0;
													} else if (var37 > 255) {
														var37 = 255;
													}

													var34 = Message.hslToRgb(var35, var36, var37);
												}

												if (var5 > 0) {
													boolean var75 = true;
													if (var58 == 0 && Tiles.field1088[var5][var14][var53] != 0) {
														var75 = false;
													}

													if (var24 > 0 && !WorldMapSection0.method3534(var24 - 1).hideUnderlay) {
														var75 = false;
													}

													if (var75 && var26 == var25 && var25 == var27 && var28 == var25) {
														var10000 = Tiles.field1105[var5][var14];
														var10000[var53] |= 2340;
													}
												}

												var35 = 0;
												if (var34 != -1) {
													var35 = Rasterizer3D.Rasterizer3D_colorPalette[GrandExchangeOfferNameComparator.method4986(var34, 96)];
												}

												if (var24 == 0) {
													var67.addTile(var5, var14, var53, 0, 0, -1, var25, var26, var27, var28, GrandExchangeOfferNameComparator.method4986(var33, var29), GrandExchangeOfferNameComparator.method4986(var33, var30), GrandExchangeOfferNameComparator.method4986(var33, var61), GrandExchangeOfferNameComparator.method4986(var33, var32), 0, 0, 0, 0, var35, 0);
												} else {
													var36 = Tiles.field1088[var5][var14][var53] + 1;
													byte var76 = Tiles.field1086[var5][var14][var53];
													FloorOverlayDefinition var62 = WorldMapSection0.method3534(var24 - 1);
													var39 = var62.texture;
													int var43;
													int var63;
													if (var39 >= 0) {
														var41 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var39);
														var40 = -1;
													} else if (var62.primaryRgb == 16711935) {
														var40 = -2;
														var39 = -1;
														var41 = -2;
													} else {
														var40 = Message.hslToRgb(var62.hue, var62.saturation, var62.lightness);
														var63 = var62.hue + Tiles.field1092 & 255;
														var43 = var62.lightness + Tiles.field1101;
														if (var43 < 0) {
															var43 = 0;
														} else if (var43 > 255) {
															var43 = 255;
														}

														var41 = Message.hslToRgb(var63, var62.saturation, var43);
													}

													var63 = 0;
													if (var41 != -2) {
														var63 = Rasterizer3D.Rasterizer3D_colorPalette[class43.method487(var41, 96)];
													}

													if (var62.secondaryRgb != -1) {
														var43 = var62.secondaryHue + Tiles.field1092 & 255;
														int var44 = var62.secondaryLightness + Tiles.field1101;
														if (var44 < 0) {
															var44 = 0;
														} else if (var44 > 255) {
															var44 = 255;
														}

														var41 = Message.hslToRgb(var43, var62.secondarySaturation, var44);
														var63 = Rasterizer3D.Rasterizer3D_colorPalette[class43.method487(var41, 96)];
													}

													var67.addTile(var5, var14, var53, var36, var76, var39, var25, var26, var27, var28, GrandExchangeOfferNameComparator.method4986(var33, var29), GrandExchangeOfferNameComparator.method4986(var33, var30), GrandExchangeOfferNameComparator.method4986(var33, var61), GrandExchangeOfferNameComparator.method4986(var33, var32), class43.method487(var40, var29), class43.method487(var40, var30), class43.method487(var40, var61), class43.method487(var40, var32), var35, var63);
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

									var67.setTileMinPlane(var5, var15, var14, var53);
								}
							}

							Tiles.field1097[var5] = null;
							class9.field71[var5] = null;
							Tiles.field1088[var5] = null;
							Tiles.field1086[var5] = null;
							Tiles.field1090[var5] = null;
						}

						var67.method3932(-50, -10, -50);

						for (var5 = 0; var5 < 104; ++var5) {
							for (var6 = 0; var6 < 104; ++var6) {
								if ((Tiles.Tiles_renderFlags[1][var5][var6] & 2) == 2) {
									var67.setLinkBelow(var5, var6);
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
										short var74;
										if ((Tiles.field1105[var54][var11][var10] & var5) != 0) {
											var12 = var10;
											var71 = var10;
											var14 = var54;

											for (var15 = var54; var12 > 0 && (Tiles.field1105[var54][var11][var12 - 1] & var5) != 0; --var12) {
											}

											while (var71 < 104 && (Tiles.field1105[var54][var11][var71 + 1] & var5) != 0) {
												++var71;
											}

											label1004:
											while (var14 > 0) {
												for (var16 = var12; var16 <= var71; ++var16) {
													if ((Tiles.field1105[var14 - 1][var11][var16] & var5) == 0) {
														break label1004;
													}
												}

												--var14;
											}

											label993:
											while (var15 < var69) {
												for (var16 = var12; var16 <= var71; ++var16) {
													if ((Tiles.field1105[var15 + 1][var11][var16] & var5) == 0) {
														break label993;
													}
												}

												++var15;
											}

											var16 = (var15 + 1 - var14) * (var71 - var12 + 1);
											if (var16 >= 8) {
												var74 = 240;
												var18 = Tiles.Tiles_heights[var15][var11][var12] - var74;
												var19 = Tiles.Tiles_heights[var14][var11][var12];
												Scene.Scene_addOccluder(var69, 1, var11 * 128, var11 * 128, var12 * 128, var71 * 128 + 128, var18, var19);

												for (var53 = var14; var53 <= var15; ++var53) {
													for (var21 = var12; var21 <= var71; ++var21) {
														var10000 = Tiles.field1105[var53][var11];
														var10000[var21] &= ~var5;
													}
												}
											}
										}

										if ((Tiles.field1105[var54][var11][var10] & var6) != 0) {
											var12 = var11;
											var71 = var11;
											var14 = var54;

											for (var15 = var54; var12 > 0 && (Tiles.field1105[var54][var12 - 1][var10] & var6) != 0; --var12) {
											}

											while (var71 < 104 && (Tiles.field1105[var54][var71 + 1][var10] & var6) != 0) {
												++var71;
											}

											label1057:
											while (var14 > 0) {
												for (var16 = var12; var16 <= var71; ++var16) {
													if ((Tiles.field1105[var14 - 1][var16][var10] & var6) == 0) {
														break label1057;
													}
												}

												--var14;
											}

											label1046:
											while (var15 < var69) {
												for (var16 = var12; var16 <= var71; ++var16) {
													if ((Tiles.field1105[var15 + 1][var16][var10] & var6) == 0) {
														break label1046;
													}
												}

												++var15;
											}

											var16 = (var71 - var12 + 1) * (var15 + 1 - var14);
											if (var16 >= 8) {
												var74 = 240;
												var18 = Tiles.Tiles_heights[var15][var12][var10] - var74;
												var19 = Tiles.Tiles_heights[var14][var12][var10];
												Scene.Scene_addOccluder(var69, 2, var12 * 128, var71 * 128 + 128, var10 * 128, var10 * 128, var18, var19);

												for (var53 = var14; var53 <= var15; ++var53) {
													for (var21 = var12; var21 <= var71; ++var21) {
														var10000 = Tiles.field1105[var53][var21];
														var10000[var10] &= ~var6;
													}
												}
											}
										}

										if ((Tiles.field1105[var54][var11][var10] & var7) != 0) {
											var12 = var11;
											var71 = var11;
											var14 = var10;

											for (var15 = var10; var14 > 0 && (Tiles.field1105[var54][var11][var14 - 1] & var7) != 0; --var14) {
											}

											while (var15 < 104 && (Tiles.field1105[var54][var11][var15 + 1] & var7) != 0) {
												++var15;
											}

											label1110:
											while (var12 > 0) {
												for (var16 = var14; var16 <= var15; ++var16) {
													if ((Tiles.field1105[var54][var12 - 1][var16] & var7) == 0) {
														break label1110;
													}
												}

												--var12;
											}

											label1099:
											while (var71 < 104) {
												for (var16 = var14; var16 <= var15; ++var16) {
													if ((Tiles.field1105[var54][var71 + 1][var16] & var7) == 0) {
														break label1099;
													}
												}

												++var71;
											}

											if ((var15 - var14 + 1) * (var71 - var12 + 1) >= 4) {
												var16 = Tiles.Tiles_heights[var54][var12][var14];
												Scene.Scene_addOccluder(var69, 4, var12 * 128, var71 * 128 + 128, var14 * 128, var15 * 128 + 128, var16, var16);

												for (var17 = var12; var17 <= var71; ++var17) {
													for (var18 = var14; var18 <= var15; ++var18) {
														var10000 = Tiles.field1105[var54][var17];
														var10000[var18] &= ~var7;
													}
												}
											}
										}
									}
								}
							}
						}

						class9.method97(true);
						var5 = Tiles.Tiles_minPlane;
						if (var5 > ParamComposition.Client_plane) {
							var5 = ParamComposition.Client_plane;
						}

						if (var5 < ParamComposition.Client_plane - 1) {
							var5 = ParamComposition.Client_plane - 1;
						}

						if (isLowDetail) {
							class5.scene.init(Tiles.Tiles_minPlane);
						} else {
							class5.scene.init(0);
						}

						for (var6 = 0; var6 < 104; ++var6) {
							for (var7 = 0; var7 < 104; ++var7) {
								Varcs.updateItemPile(var6, var7);
							}
						}

						WorldMapIcon_1.playPcmPlayers();

						for (PendingSpawn var79 = (PendingSpawn)pendingSpawns.last(); var79 != null; var79 = (PendingSpawn)pendingSpawns.previous()) {
							if (var79.hitpoints == -1) {
								var79.delay = 0;
								WorldMapData_0.method3145(var79);
							} else {
								var79.remove();
							}
						}

						ObjectComposition.ObjectDefinition_cachedModelData.clear();
						PacketBufferNode var80;
						if (class303.client.hasFrame()) {
							var80 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2637, packetWriter.isaacCipher);
							var80.packetBuffer.writeInt(1057001181);
							packetWriter.addNode(var80);
						}

						if (!isInInstance) {
							var6 = (MusicPatchNode2.field2827 - 6) / 8;
							var7 = (MusicPatchNode2.field2827 + 6) / 8;
							var69 = (class11.field112 - 6) / 8;
							var54 = (class11.field112 + 6) / 8;

							for (var10 = var6 - 1; var10 <= var7 + 1; ++var10) {
								for (var11 = var69 - 1; var11 <= var54 + 1; ++var11) {
									if (var10 < var6 || var10 > var7 || var11 < var69 || var11 > var54) {
										WorldMapSection0.archive7.loadRegionFromName("m" + var10 + "_" + var11);
										WorldMapSection0.archive7.loadRegionFromName("l" + var10 + "_" + var11);
									}
								}
							}
						}

						updateGameState(30);
						WorldMapIcon_1.playPcmPlayers();
						class14.method224();
						var80 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2662, packetWriter.isaacCipher);
						packetWriter.addNode(var80);
						WorldMapRectangle.clock.mark();

						for (var7 = 0; var7 < 32; ++var7) {
							GameEngine.graphicsTickTimes[var7] = 0L;
						}

						for (var7 = 0; var7 < 32; ++var7) {
							GameEngine.clientTickTimes[var7] = 0L;
						}

						GameEngine.gameCyclesToDo = 0;
					}
				}
			}
		} else {
			class179.doCycleTitle(this);
		}

		if (gameState == 30) {
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) {
			this.doCycleLoggedOut();
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1176468254"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = WorldMapID.method3587();
		if (var2 && field866 && WorldMapAreaData.pcmPlayer0 != null) {
			WorldMapAreaData.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field833 != 0L && Archive.currentTimeMillis() > field833) {
			class374.setWindowedMode(HitSplatDefinition.getWindowedMode());
		}

		int var3;
		if (var1) {
			for (var3 = 0; var3 < 100; ++var3) {
				field825[var3] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			class23.drawTitle(WorldMapArea.fontBold12, class11.fontPlain11, Message.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class23.drawTitle(WorldMapArea.fontBold12, class11.fontPlain11, Message.fontPlain12);
			} else if (gameState == 25) {
				if (field790 == 1) {
					if (field669 > field670) {
						field670 = field669;
					}

					var3 = (field670 * 50 - field669 * 50) / field670;
					class7.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else if (field790 == 2) {
					if (field671 > field672) {
						field672 = field671;
					}

					var3 = (field672 * 50 - field671 * 50) / field672 + 50;
					class7.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else {
					class7.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				class7.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				class7.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class23.drawTitle(WorldMapArea.fontBold12, class11.fontPlain11, Message.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				if (field826[var3]) {
					WorldMapDecorationType.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]);
					field826[var3] = false;
				}
			}
		} else if (gameState > 0) {
			WorldMapDecorationType.rasterProvider.drawFull(0, 0);

			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				field826[var3] = false;
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2107475994"
	)
	@Export("kill0")
	protected final void kill0() {
		if (varcs.hasUnwrittenChanges()) {
			varcs.write();
		}

		if (class69.mouseRecorder != null) {
			class69.mouseRecorder.isRunning = false;
		}

		class69.mouseRecorder = null;
		packetWriter.close();
		class29.method354();
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

		class2.mouseWheel = null;
		if (WorldMapAreaData.pcmPlayer0 != null) {
			WorldMapAreaData.pcmPlayer0.shutdown();
		}

		if (class93.pcmPlayer1 != null) {
			class93.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) {
			NetCache.NetCache_socket.close();
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3574 != 0) {
				ArchiveDiskActionHandler.field3574 = 1;

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
				} catch (InterruptedException var5) {
				}
			}
		}

		if (class19.urlRequester != null) {
			class19.urlRequester.close();
			class19.urlRequester = null;
		}

		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var4 = 0; var4 < class124.idxCount; ++var4) {
				class21.JagexCache_idxFiles[var4].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var7) {
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1701648283"
	)
	protected final void vmethod1216() {
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
							int var4 = Integer.parseInt(var2);
							Language var9;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
								var9 = Language.Language_valuesOrdered[var4];
							} else {
								var9 = null;
							}

							class7.clientLanguage = var9;
							break;
						case 7:
							Fonts.field4063 = class181.method3592(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							class253.field3136 = var2;
							break;
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.oldscape, StudioGame.game3, StudioGame.runescape, StudioGame.game5, StudioGame.game4, StudioGame.stellardawn};
							NetSocket.field1492 = (StudioGame)UserComparator4.findEnumerated(var3, Integer.parseInt(var2));
							if (NetSocket.field1492 == StudioGame.oldscape) {
								ModeWhere.loginType = LoginType.oldscape;
							} else {
								ModeWhere.loginType = LoginType.field4101;
							}
							break;
						case 12:
							worldId = Integer.parseInt(var2);
							break;
						case 14:
							class44.field310 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							Canvas.field291 = var2;
						}
					}
				}

				class13.method214();
				class26.worldHost = this.getCodeBase().getHost();
				String var5 = Fonts.field4063.name;
				byte var6 = 0;

				try {
					UserComparator5.findAndLoadCache("oldschool", var5, var6, 21);
				} catch (Exception var7) {
					class27.RunException_sendStackTrace((String)null, var7);
				}

				class303.client = this;
				RunException.clientType = clientType;
				if (field621 == -1) {
					field621 = 0;
				}

				this.startThread(765, 503, 196);
			}
		} catch (RuntimeException var8) {
			throw class20.newRunException(var8, "client.init(" + ')');
		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "35"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = HitSplatDefinition.method2896();
			if (!var1) {
				this.doCycleJs5Connect();
			}

		}
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1917770828"
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

				field646 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}

			if (--field646 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						js5SocketTask = GameEngine.taskHandler.newSocketTask(class26.worldHost, BoundaryObject.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						if (useBufferedSocket) {
							ArchiveDiskAction.js5Socket = Varps.method4585((Socket)js5SocketTask.result, 40000, 5000);
						} else {
							ArchiveDiskAction.js5Socket = new NetSocket((Socket)js5SocketTask.result, GameEngine.taskHandler, 5000);
						}

						Buffer var1 = new Buffer(5);
						var1.writeByte(15);
						var1.writeInt(196);
						ArchiveDiskAction.js5Socket.write(var1.array, 0, 5);
						++js5ConnectState;
						class43.field302 = Archive.currentTimeMillis();
					}

					if (js5ConnectState == 3) {
						if (ArchiveDiskAction.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) {
							int var2 = ArchiveDiskAction.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (Archive.currentTimeMillis() - class43.field302 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						FaceNormal.method4081(ArchiveDiskAction.js5Socket, gameState > 20);
						js5SocketTask = null;
						ArchiveDiskAction.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1439234587"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		js5SocketTask = null;
		ArchiveDiskAction.js5Socket = null;
		js5ConnectState = 0;
		if (BoundaryObject.currentPort == class69.worldPort) {
			BoundaryObject.currentPort = class24.js5Port;
		} else {
			BoundaryObject.currentPort = class69.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				gameState = 1000;
			} else {
				field646 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			gameState = 1000;
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				gameState = 1000;
			} else {
				field646 = 3000;
			}
		}

	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "36948173"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (class1.secureRandom == null && (secureRandomFuture.isDone() || field649 > 250)) {
					class1.secureRandom = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (class1.secureRandom != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					Archive.socketTask = null;
					field789 = false;
					field649 = 0;
					loginState = 1;
				}
			}

			if (loginState == 1) {
				if (Archive.socketTask == null) {
					Archive.socketTask = GameEngine.taskHandler.newSocketTask(class26.worldHost, BoundaryObject.currentPort);
				}

				if (Archive.socketTask.status == 2) {
					throw new IOException();
				}

				if (Archive.socketTask.status == 1) {
					if (useBufferedSocket) {
						var1 = Varps.method4585((Socket)Archive.socketTask.result, 40000, 5000);
					} else {
						var1 = new NetSocket((Socket)Archive.socketTask.result, GameEngine.taskHandler, 5000);
					}

					packetWriter.setSocket((AbstractSocket)var1);
					Archive.socketTask = null;
					loginState = 2;
				}
			}

			PacketBufferNode var4;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var4 = Clock.method2590();
				var4.clientPacket = null;
				var4.clientPacketLength = 0;
				var4.packetBuffer = new PacketBuffer(5000);
				var4.packetBuffer.writeByte(LoginPacket.field2803.id);
				packetWriter.addNode(var4);
				packetWriter.flush();
				var2.offset = 0;
				loginState = 3;
			}

			boolean var13;
			int var14;
			if (loginState == 3) {
				if (WorldMapAreaData.pcmPlayer0 != null) {
					WorldMapAreaData.pcmPlayer0.method794();
				}

				if (class93.pcmPlayer1 != null) {
					class93.pcmPlayer1.method794();
				}

				var13 = true;
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) {
					var13 = false;
				}

				if (var13) {
					var14 = ((AbstractSocket)var1).readUnsignedByte();
					if (WorldMapAreaData.pcmPlayer0 != null) {
						WorldMapAreaData.pcmPlayer0.method794();
					}

					if (class93.pcmPlayer1 != null) {
						class93.pcmPlayer1.method794();
					}

					if (var14 != 0) {
						class22.getLoginError(var14);
						return;
					}

					var2.offset = 0;
					loginState = 4;
				}
			}

			int var36;
			if (loginState == 4) {
				if (var2.offset < 8) {
					var36 = ((AbstractSocket)var1).available();
					if (var36 > 8 - var2.offset) {
						var36 = 8 - var2.offset;
					}

					if (var36 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset, var36);
						var2.offset += var36;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					FileSystem.field1486 = var2.readLong();
					loginState = 5;
				}
			}

			int var7;
			int var9;
			int var15;
			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var3 = new PacketBuffer(500);
				int[] var27 = new int[]{class1.secureRandom.nextInt(), class1.secureRandom.nextInt(), class1.secureRandom.nextInt(), class1.secureRandom.nextInt()};
				var3.offset = 0;
				var3.writeByte(1);
				var3.writeInt(var27[0]);
				var3.writeInt(var27[1]);
				var3.writeInt(var27[2]);
				var3.writeInt(var27[3]);
				var3.writeLong(FileSystem.field1486);
				if (gameState == 40) {
					var3.writeInt(SoundSystem.field432[0]);
					var3.writeInt(SoundSystem.field432[1]);
					var3.writeInt(SoundSystem.field432[2]);
					var3.writeInt(SoundSystem.field432[3]);
				} else {
					var3.writeByte(field652.rsOrdinal());
					switch(field652.field1453) {
					case 0:
						LinkedHashMap var6 = class12.clientPreferences.parameters;
						String var8 = Login.Login_username;
						var9 = var8.length();
						int var10 = 0;

						for (int var11 = 0; var11 < var9; ++var11) {
							var10 = (var10 << 5) - var10 + var8.charAt(var11);
						}

						var3.writeInt((Integer)var6.get(var10));
						break;
					case 1:
					case 2:
						var3.writeMedium(PendingSpawn.field1204);
						++var3.offset;
						break;
					case 3:
						var3.offset += 4;
					}

					var3.writeByte(class386.field4213.rsOrdinal());
					var3.writeStringCp1252NullTerminated(Login.Login_password);
				}

				var3.encryptRsa(class82.field986, class82.field987);
				SoundSystem.field432 = var27;
				PacketBufferNode var33 = Clock.method2590();
				var33.clientPacket = null;
				var33.clientPacketLength = 0;
				var33.packetBuffer = new PacketBuffer(5000);
				var33.packetBuffer.offset = 0;
				if (gameState == 40) {
					var33.packetBuffer.writeByte(LoginPacket.field2799.id);
				} else {
					var33.packetBuffer.writeByte(LoginPacket.field2798.id);
				}

				var33.packetBuffer.writeShort(0);
				var7 = var33.packetBuffer.offset;
				var33.packetBuffer.writeInt(196);
				var33.packetBuffer.writeInt(1);
				var33.packetBuffer.writeByte(clientType);
				var33.packetBuffer.writeByte(field621);
				var33.packetBuffer.writeBytes(var3.array, 0, var3.offset);
				var15 = var33.packetBuffer.offset;
				var33.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var33.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var33.packetBuffer.writeShort(GameEngine.canvasWidth);
				var33.packetBuffer.writeShort(HealthBarDefinition.canvasHeight);
				PacketBuffer var16 = var33.packetBuffer;
				if (randomDatData != null) {
					var16.writeBytes(randomDatData, 0, randomDatData.length);
				} else {
					byte[] var17 = DynamicObject.method2030();
					var16.writeBytes(var17, 0, var17.length);
				}

				var33.packetBuffer.writeStringCp1252NullTerminated(class253.field3136);
				var33.packetBuffer.writeInt(class44.field310);
				Buffer var38 = new Buffer(GameObject.platformInfo.size());
				GameObject.platformInfo.write(var38);
				var33.packetBuffer.writeBytes(var38.array, 0, var38.array.length);
				var33.packetBuffer.writeByte(clientType);
				var33.packetBuffer.writeInt(0);
				var33.packetBuffer.writeInt(class29.archive6.hash);
				var33.packetBuffer.method6445(0);
				var33.packetBuffer.method6445(Actor.archive17.hash);
				var33.packetBuffer.writeIntME(class0.archive4.hash);
				var33.packetBuffer.method6445(EnumComposition.archive5.hash);
				var33.packetBuffer.writeIntME(class9.archive20.hash);
				var33.packetBuffer.writeInt(class232.archive19.hash);
				var33.packetBuffer.method6493(MilliClock.archive3.hash);
				var33.packetBuffer.writeInt(class16.archive15.hash);
				var33.packetBuffer.writeInt(PendingSpawn.archive10.hash);
				var33.packetBuffer.writeInt(KitDefinition.archive2.hash);
				var33.packetBuffer.method6493(KeyHandler.archive11.hash);
				var33.packetBuffer.writeIntME(class14.field129.hash);
				var33.packetBuffer.writeInt(class18.archive13.hash);
				var33.packetBuffer.writeIntME(Huffman.archive14.hash);
				var33.packetBuffer.method6445(GameBuild.field3213.hash);
				var33.packetBuffer.method6493(class22.archive12.hash);
				var33.packetBuffer.writeIntME(WorldMapAreaData.archive18.hash);
				var33.packetBuffer.method6493(WorldMapSection0.archive7.hash);
				var33.packetBuffer.writeInt(class260.archive9.hash);
				var33.packetBuffer.writeInt(class43.archive8.hash);
				var33.packetBuffer.xteaEncrypt(var27, var15, var33.packetBuffer.offset);
				var33.packetBuffer.writeLengthShort(var33.packetBuffer.offset - var7);
				packetWriter.addNode(var33);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var27);
				int[] var18 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var18[var12] = var27[var12] + 50;
				}

				var2.newIsaacCipher(var18);
				loginState = 6;
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
				var36 = ((AbstractSocket)var1).readUnsignedByte();
				if (var36 == 21 && gameState == 20) {
					loginState = 12;
				} else if (var36 == 2) {
					loginState = 14;
				} else if (var36 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					loginState = 19;
				} else if (var36 == 64) {
					loginState = 10;
				} else if (var36 == 23 && field749 < 1) {
					++field749;
					loginState = 0;
				} else if (var36 == 29) {
					loginState = 17;
				} else {
					if (var36 != 69) {
						class22.getLoginError(var36);
						return;
					}

					loginState = 7;
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				Clock.field1522 = var2.readUnsignedShort();
				loginState = 8;
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= Clock.field1522) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, Clock.field1522);
				class34[] var25 = new class34[]{class34.field243};
				class34 var28 = var25[var2.readUnsignedByte()];

				try {
					class31 var5 = MenuAction.method1944(var28);
					this.field656 = new class35(var2, var5);
					loginState = 9;
				} catch (Exception var23) {
					class22.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field656.method409()) {
				this.field655 = this.field656.method408();
				this.field656.method397();
				this.field656 = null;
				if (this.field655 == null) {
					class22.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var4 = Clock.method2590();
				var4.clientPacket = null;
				var4.clientPacketLength = 0;
				var4.packetBuffer = new PacketBuffer(5000);
				var4.packetBuffer.writeByte(LoginPacket.field2800.id);
				var4.packetBuffer.writeShort(this.field655.offset);
				var4.packetBuffer.method6441(this.field655);
				packetWriter.addNode(var4);
				packetWriter.flush();
				this.field655 = null;
				loginState = 6;
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
				class225.field2676 = ((AbstractSocket)var1).readUnsignedByte();
				loginState = 11;
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= class225.field2676) {
				((AbstractSocket)var1).read(var2.array, 0, class225.field2676);
				var2.offset = 0;
				loginState = 6;
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
				field673 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				loginState = 13;
			}

			if (loginState == 13) {
				field649 = 0;
				class44.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field673 / 60 + " seconds.");
				if (--field673 <= 0) {
					loginState = 0;
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
					UserComparator9.field1426 = ((AbstractSocket)var1).readUnsignedByte();
					loginState = 15;
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= UserComparator9.field1426) {
					var13 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var37 = false;
					if (var13) {
						var14 = var2.readByteIsaac() << 24;
						var14 |= var2.readByteIsaac() << 16;
						var14 |= var2.readByteIsaac() << 8;
						var14 |= var2.readByteIsaac();
						String var34 = Login.Login_username;
						var7 = var34.length();
						var15 = 0;
						var9 = 0;

						while (true) {
							if (var9 >= var7) {
								if (class12.clientPreferences.parameters.size() >= 10 && !class12.clientPreferences.parameters.containsKey(var15)) {
									Iterator var35 = class12.clientPreferences.parameters.entrySet().iterator();
									var35.next();
									var35.remove();
								}

								class12.clientPreferences.parameters.put(var15, var14);
								break;
							}

							var15 = (var15 << 5) - var15 + var34.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) {
						class12.clientPreferences.rememberedUsername = Login.Login_username;
					} else {
						class12.clientPreferences.rememberedUsername = null;
					}

					KeyHandler.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field734 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var29 = ModeWhere.ServerPacket_values();
					int var20 = var2.readSmartByteShortIsaac();
					if (var20 < 0 || var20 >= var29.length) {
						throw new IOException(var20 + " " + var2.offset);
					}

					packetWriter.serverPacket = var29[var20];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						Client var21 = class303.client;
						JSObject.getWindow(var21).call("zap", (Object[])null);
					} catch (Throwable var22) {
					}

					loginState = 16;
				}

				if (loginState == 16) {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method5466();
						class25.method321();
						KeyHandler.updatePlayer(var2);
						MusicPatchNode2.field2827 = -1;
						ClientPreferences.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						class15.field133 = var2.readUnsignedShort();
						loginState = 18;
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= class15.field133) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, class15.field133);
						var2.offset = 0;
						String var26 = var2.readStringCp1252NullTerminated();
						String var30 = var2.readStringCp1252NullTerminated();
						String var31 = var2.readStringCp1252NullTerminated();
						class44.setLoginResponseString(var26, var30, var31);
						updateGameState(10);
					}

					if (loginState != 19) {
						++field649;
						if (field649 > 2000) {
							if (field749 < 1) {
								if (BoundaryObject.currentPort == class69.worldPort) {
									BoundaryObject.currentPort = class24.js5Port;
								} else {
									BoundaryObject.currentPort = class69.worldPort;
								}

								++field749;
								loginState = 0;
							} else {
								class22.getLoginError(-3);
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
							var36 = packetWriter.serverPacketLength;
							timer.method5477();
							packetWriter.clearBuffer();
							packetWriter.packetBuffer.offset = 0;
							packetWriter.serverPacket = null;
							packetWriter.field1386 = null;
							packetWriter.field1387 = null;
							packetWriter.field1391 = null;
							packetWriter.serverPacketLength = 0;
							packetWriter.field1384 = 0;
							rebootTimer = 0;
							Occluder.method4090();
							minimapState = 0;
							destinationX = 0;

							for (var14 = 0; var14 < 2048; ++var14) {
								players[var14] = null;
							}

							class35.localPlayer = null;

							for (var14 = 0; var14 < npcs.length; ++var14) {
								NPC var32 = npcs[var14];
								if (var32 != null) {
									var32.targetIndex = -1;
									var32.false0 = false;
								}
							}

							class285.method5055();
							updateGameState(30);

							for (var14 = 0; var14 < 100; ++var14) {
								field825[var14] = true;
							}

							var4 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2655, packetWriter.isaacCipher);
							var4.packetBuffer.writeByte(HitSplatDefinition.getWindowedMode());
							var4.packetBuffer.writeShort(GameEngine.canvasWidth);
							var4.packetBuffer.writeShort(HealthBarDefinition.canvasHeight);
							packetWriter.addNode(var4);
							KeyHandler.updatePlayer(var2);
							if (var36 != var2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var24) {
			if (field749 < 1) {
				if (BoundaryObject.currentPort == class69.worldPort) {
					BoundaryObject.currentPort = class24.js5Port;
				} else {
					BoundaryObject.currentPort = class69.worldPort;
				}

				++field749;
				loginState = 0;
			} else {
				class22.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-784204391"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (field789) {
			field789 = false;
			BuddyRankComparator.method2492();
		} else {
			if (!isMenuOpen) {
				WorldMapEvent.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1230(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				int var2;
				PacketBufferNode var15;
				while (StructComposition.method2846()) {
					var15 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2666, packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(0);
					var2 = var15.packetBuffer.offset;
					class2.performReflectionCheck(var15.packetBuffer);
					var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var2);
					packetWriter.addNode(var15);
				}

				if (timer.field3791) {
					var15 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2638, packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(0);
					var2 = var15.packetBuffer.offset;
					timer.write(var15.packetBuffer);
					var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var2);
					packetWriter.addNode(var15);
					timer.method5467();
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
				synchronized(class69.mouseRecorder.lock) {
					if (!field767) {
						class69.mouseRecorder.index = 0;
					} else if (MouseHandler.MouseHandler_lastButton != 0 || class69.mouseRecorder.index >= 40) {
						PacketBufferNode var16 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;

						for (var7 = 0; var7 < class69.mouseRecorder.index && (var16 == null || var16.packetBuffer.offset - var3 < 246); ++var7) {
							var4 = var7;
							var8 = class69.mouseRecorder.ys[var7];
							if (var8 < -1) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}

							var9 = class69.mouseRecorder.xs[var7];
							if (var9 < -1) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}

							if (var9 != field627 || var8 != field837) {
								if (var16 == null) {
									var16 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2646, packetWriter.isaacCipher);
									var16.packetBuffer.writeByte(0);
									var3 = var16.packetBuffer.offset;
									PacketBuffer var10000 = var16.packetBuffer;
									var10000.offset += 2;
									var5 = 0;
									var6 = 0;
								}

								if (-1L != field629) {
									var10 = var9 - field627;
									var11 = var8 - field837;
									var12 = (int)((class69.mouseRecorder.millis[var7] - field629) / 20L);
									var5 = (int)((long)var5 + (class69.mouseRecorder.millis[var7] - field629) % 20L);
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}

								field627 = var9;
								field837 = var8;
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
									var10 += 32;
									var11 += 32;
									var16.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
									var10 += 128;
									var11 += 128;
									var16.packetBuffer.writeByte(var12 + 128);
									var16.packetBuffer.writeShort(var11 + (var10 << 8));
								} else if (var12 < 32) {
									var16.packetBuffer.writeByte(var12 + 192);
									if (var9 != -1 && var8 != -1) {
										var16.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var16.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var16.packetBuffer.writeShort((var12 & 8191) + 57344);
									if (var9 != -1 && var8 != -1) {
										var16.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var16.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6;
								field629 = class69.mouseRecorder.millis[var7];
							}
						}

						if (var16 != null) {
							var16.packetBuffer.writeLengthByte(var16.packetBuffer.offset - var3);
							var7 = var16.packetBuffer.offset;
							var16.packetBuffer.offset = var3;
							var16.packetBuffer.writeByte(var5 / var6);
							var16.packetBuffer.writeByte(var5 % var6);
							var16.packetBuffer.offset = var7;
							packetWriter.addNode(var16);
						}

						if (var4 >= class69.mouseRecorder.index) {
							class69.mouseRecorder.index = 0;
						} else {
							MouseRecorder var43 = class69.mouseRecorder;
							var43.index -= var4;
							System.arraycopy(class69.mouseRecorder.xs, var4, class69.mouseRecorder.xs, 0, class69.mouseRecorder.index);
							System.arraycopy(class69.mouseRecorder.ys, var4, class69.mouseRecorder.ys, 0, class69.mouseRecorder.index);
							System.arraycopy(class69.mouseRecorder.millis, var4, class69.mouseRecorder.millis, 0, class69.mouseRecorder.index);
						}
					}
				}

				PacketBufferNode var19;
				if (MouseHandler.MouseHandler_lastButton == 1 || !class229.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
					long var17 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
					if (var17 > 32767L) {
						var17 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
					var3 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 < 0) {
						var3 = 0;
					} else if (var3 > HealthBarDefinition.canvasHeight) {
						var3 = HealthBarDefinition.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX;
					if (var4 < 0) {
						var4 = 0;
					} else if (var4 > GameEngine.canvasWidth) {
						var4 = GameEngine.canvasWidth;
					}

					var5 = (int)var17;
					var19 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2578, packetWriter.isaacCipher);
					var19.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
					var19.packetBuffer.writeShort(var4);
					var19.packetBuffer.writeShort(var3);
					packetWriter.addNode(var19);
				}

				if (KeyHandler.field276 > 0) {
					var15 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2566, packetWriter.isaacCipher);
					var15.packetBuffer.writeShort(0);
					var2 = var15.packetBuffer.offset;
					long var20 = Archive.currentTimeMillis();

					for (var5 = 0; var5 < KeyHandler.field276; ++var5) {
						long var22 = var20 - field799;
						if (var22 > 16777215L) {
							var22 = 16777215L;
						}

						field799 = var20;
						var15.packetBuffer.method6475(KeyHandler.field275[var5]);
						var15.packetBuffer.method6491((int)var22);
					}

					var15.packetBuffer.writeLengthShort(var15.packetBuffer.offset - var2);
					packetWriter.addNode(var15);
				}

				if (field700 > 0) {
					--field700;
				}

				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
					field701 = true;
				}

				if (field701 && field700 <= 0) {
					field700 = 20;
					field701 = false;
					var15 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2623, packetWriter.isaacCipher);
					var15.packetBuffer.method6483(camAngleX);
					var15.packetBuffer.writeShort(camAngleY);
					packetWriter.addNode(var15);
				}

				if (class124.hasFocus && !hadFocus) {
					hadFocus = true;
					var15 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2576, packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(1);
					packetWriter.addNode(var15);
				}

				if (!class124.hasFocus && hadFocus) {
					hadFocus = false;
					var15 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2576, packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(0);
					packetWriter.addNode(var15);
				}

				if (NetSocket.worldMap != null) {
					NetSocket.worldMap.method6124();
				}

				if (FloorOverlayDefinition.ClanChat_inClanChat) {
					if (class25.clanChat != null) {
						class25.clanChat.sort();
					}

					for (var1 = 0; var1 < Players.Players_count; ++var1) {
						Player var38 = players[Players.Players_indices[var1]];
						var38.clearIsInClanChat();
					}

					FloorOverlayDefinition.ClanChat_inClanChat = false;
				}

				Buffer.method6602();
				if (field848 != ParamComposition.Client_plane) {
					field848 = ParamComposition.Client_plane;
					KeyHandler.createMinimapSprite(ParamComposition.Client_plane);
				}

				if (gameState == 30) {
					for (PendingSpawn var36 = (PendingSpawn)pendingSpawns.last(); var36 != null; var36 = (PendingSpawn)pendingSpawns.previous()) {
						if (var36.hitpoints > 0) {
							--var36.hitpoints;
						}

						ObjectComposition var24;
						boolean var32;
						if (var36.hitpoints == 0) {
							if (var36.objectId >= 0) {
								var3 = var36.objectId;
								var4 = var36.field1203;
								var24 = AttackOption.getObjectDefinition(var3);
								if (var4 == 11) {
									var4 = 10;
								}

								if (var4 >= 5 && var4 <= 8) {
									var4 = 4;
								}

								var32 = var24.method2916(var4);
								if (!var32) {
									continue;
								}
							}

							Message.addPendingSpawnToScene(var36.plane, var36.type, var36.x, var36.y, var36.objectId, var36.field1199, var36.field1203);
							var36.remove();
						} else {
							if (var36.delay > 0) {
								--var36.delay;
							}

							if (var36.delay == 0 && var36.x >= 1 && var36.y >= 1 && var36.x <= 102 && var36.y <= 102) {
								if (var36.id >= 0) {
									var3 = var36.id;
									var4 = var36.field1196;
									var24 = AttackOption.getObjectDefinition(var3);
									if (var4 == 11) {
										var4 = 10;
									}

									if (var4 >= 5 && var4 <= 8) {
										var4 = 4;
									}

									var32 = var24.method2916(var4);
									if (!var32) {
										continue;
									}
								}

								Message.addPendingSpawnToScene(var36.plane, var36.type, var36.x, var36.y, var36.id, var36.orientation, var36.field1196);
								var36.delay = -1;
								if (var36.id == var36.objectId && var36.objectId == -1) {
									var36.remove();
								} else if (var36.id == var36.objectId && var36.orientation == var36.field1199 && var36.field1196 == var36.field1203) {
									var36.remove();
								}
							}
						}
					}

					class15.method228();
					++packetWriter.field1384;
					if (packetWriter.field1384 > 750) {
						BuddyRankComparator.method2492();
					} else {
						ItemComposition.method3006();
						MouseHandler.method686();
						HorizontalAlignment.method2733();
						++field768;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 20;
							if (mouseCrossState * 400 >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (Projectile.field1039 != null) {
							++field817;
							if (field817 >= 15) {
								VerticalAlignment.invalidateWidget(Projectile.field1039);
								Projectile.field1039 = null;
							}
						}

						Widget var37 = SpriteMask.mousedOverWidgetIf1;
						Widget var39 = class34.field241;
						SpriteMask.mousedOverWidgetIf1 = null;
						class34.field241 = null;
						draggedOnWidget = null;
						field797 = false;
						field794 = false;
						field842 = 0;

						while (class17.isKeyDown() && field842 < 128) {
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && MenuAction.field982 == 66) {
								String var25 = Login.method1986();
								class303.client.method527(var25);
							} else if (oculusOrbState != 1 || class25.field207 <= 0) {
								field844[field842] = MenuAction.field982;
								field746[field842] = class25.field207;
								++field842;
							}
						}

						boolean var33 = staffModLevel >= 2;
						if (var33 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) {
							var4 = class35.localPlayer.plane - mouseWheelRotation;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}

							if (var4 != class35.localPlayer.plane) {
								ClientPreferences.method2239(class35.localPlayer.pathX[0] + JagexCache.baseX * 64, class35.localPlayer.pathY[0] + Messages.baseY * 64, var4, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							Clock.updateRootInterface(rootInterface, 0, 0, GameEngine.canvasWidth, HealthBarDefinition.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							ScriptEvent var26;
							Widget var40;
							Widget var41;
							do {
								var26 = (ScriptEvent)field865.removeLast();
								if (var26 == null) {
									while (true) {
										do {
											var26 = (ScriptEvent)field821.removeLast();
											if (var26 == null) {
												while (true) {
													do {
														var26 = (ScriptEvent)scriptEvents.removeLast();
														if (var26 == null) {
															this.menu();
															if (NetSocket.worldMap != null) {
																NetSocket.worldMap.method5961(ParamComposition.Client_plane, JagexCache.baseX * 64 + (class35.localPlayer.x >> 7), Messages.baseY * 64 + (class35.localPlayer.y >> 7), false);
																NetSocket.worldMap.loadCache();
															}

															if (clickedWidget != null) {
																this.method1236();
															}

															if (class34.dragInventoryWidget != null) {
																VerticalAlignment.invalidateWidget(class34.dragInventoryWidget);
																++itemDragDuration;
																if (MouseHandler.MouseHandler_currentButton == 0) {
																	if (field728) {
																		if (NPCComposition.hoveredItemContainer == class34.dragInventoryWidget && dragItemSlotDestination != dragItemSlotSource) {
																			Widget var42 = class34.dragInventoryWidget;
																			byte var34 = 0;
																			if (field781 == 1 && var42.contentType == 206) {
																				var34 = 1;
																			}

																			if (var42.itemIds[dragItemSlotDestination] <= 0) {
																				var34 = 0;
																			}

																			var7 = class26.getWidgetFlags(var42);
																			boolean var35 = (var7 >> 29 & 1) != 0;
																			if (var35) {
																				var8 = dragItemSlotSource;
																				var9 = dragItemSlotDestination;
																				var42.itemIds[var9] = var42.itemIds[var8];
																				var42.itemQuantities[var9] = var42.itemQuantities[var8];
																				var42.itemIds[var8] = -1;
																				var42.itemQuantities[var8] = 0;
																			} else if (var34 == 1) {
																				var8 = dragItemSlotSource;
																				var9 = dragItemSlotDestination;

																				while (var8 != var9) {
																					if (var8 > var9) {
																						var42.swapItems(var8 - 1, var8);
																						--var8;
																					} else if (var8 < var9) {
																						var42.swapItems(var8 + 1, var8);
																						++var8;
																					}
																				}
																			} else {
																				var42.swapItems(dragItemSlotDestination, dragItemSlotSource);
																			}

																			PacketBufferNode var27 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2628, packetWriter.isaacCipher);
																			var27.packetBuffer.method6445(class34.dragInventoryWidget.id);
																			var27.packetBuffer.method6475(var34);
																			var27.packetBuffer.method6484(dragItemSlotSource);
																			var27.packetBuffer.writeShort(dragItemSlotDestination);
																			packetWriter.addNode(var27);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX, draggedWidgetY);
																	} else if (menuOptionsCount > 0) {
																		ItemLayer.method3715(draggedWidgetX, draggedWidgetY);
																	}

																	field817 = 10;
																	MouseHandler.MouseHandler_lastButton = 0;
																	class34.dragInventoryWidget = null;
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
																	field728 = true;
																}
															}

															if (Scene.shouldSendWalk()) {
																var4 = Scene.Scene_selectedX;
																var5 = Scene.Scene_selectedY;
																var19 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2611, packetWriter.isaacCipher);
																var19.packetBuffer.writeByte(5);
																var19.packetBuffer.method6610(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
																var19.packetBuffer.writeShort(Messages.baseY * 64 + var5);
																var19.packetBuffer.writeShort(JagexCache.baseX * 64 + var4);
																packetWriter.addNode(var19);
																Scene.method3941();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																mouseCrossColor = 1;
																mouseCrossState = 0;
																destinationX = var4;
																destinationY = var5;
															}

															if (var37 != SpriteMask.mousedOverWidgetIf1) {
																if (var37 != null) {
																	VerticalAlignment.invalidateWidget(var37);
																}

																if (SpriteMask.mousedOverWidgetIf1 != null) {
																	VerticalAlignment.invalidateWidget(SpriteMask.mousedOverWidgetIf1);
																}
															}

															if (var39 != class34.field241 && field741 == field811) {
																if (var39 != null) {
																	VerticalAlignment.invalidateWidget(var39);
																}

																if (class34.field241 != null) {
																	VerticalAlignment.invalidateWidget(class34.field241);
																}
															}

															if (class34.field241 != null) {
																if (field741 < field811) {
																	++field741;
																	if (field741 == field811) {
																		VerticalAlignment.invalidateWidget(class34.field241);
																	}
																}
															} else if (field741 > 0) {
																--field741;
															}

															WorldMapManager.method3439();
															if (isCameraLocked) {
																var4 = field696 * 16384 + 64;
																var5 = class18.field157 * 128 + 64;
																var6 = SceneTilePaint.getTileHeight(var4, var5, ParamComposition.Client_plane) - class0.field5;
																if (class20.cameraX < var4) {
																	class20.cameraX = (var4 - class20.cameraX) * SoundSystem.field436 / 1000 + class20.cameraX + UserComparator4.field1403;
																	if (class20.cameraX > var4) {
																		class20.cameraX = var4;
																	}
																}

																if (class20.cameraX > var4) {
																	class20.cameraX -= SoundSystem.field436 * (class20.cameraX - var4) / 1000 + UserComparator4.field1403;
																	if (class20.cameraX < var4) {
																		class20.cameraX = var4;
																	}
																}

																if (Skeleton.cameraY < var6) {
																	Skeleton.cameraY = (var6 - Skeleton.cameraY) * SoundSystem.field436 / 1000 + Skeleton.cameraY + UserComparator4.field1403;
																	if (Skeleton.cameraY > var6) {
																		Skeleton.cameraY = var6;
																	}
																}

																if (Skeleton.cameraY > var6) {
																	Skeleton.cameraY -= SoundSystem.field436 * (Skeleton.cameraY - var6) / 1000 + UserComparator4.field1403;
																	if (Skeleton.cameraY < var6) {
																		Skeleton.cameraY = var6;
																	}
																}

																if (WorldMapDecoration.cameraZ < var5) {
																	WorldMapDecoration.cameraZ = (var5 - WorldMapDecoration.cameraZ) * SoundSystem.field436 / 1000 + WorldMapDecoration.cameraZ + UserComparator4.field1403;
																	if (WorldMapDecoration.cameraZ > var5) {
																		WorldMapDecoration.cameraZ = var5;
																	}
																}

																if (WorldMapDecoration.cameraZ > var5) {
																	WorldMapDecoration.cameraZ -= SoundSystem.field436 * (WorldMapDecoration.cameraZ - var5) / 1000 + UserComparator4.field1403;
																	if (WorldMapDecoration.cameraZ < var5) {
																		WorldMapDecoration.cameraZ = var5;
																	}
																}

																var4 = Language.field3704 * 16384 + 64;
																var5 = Interpreter.field947 * 16384 + 64;
																var6 = SceneTilePaint.getTileHeight(var4, var5, ParamComposition.Client_plane) - KitDefinition.field1592;
																var7 = var4 - class20.cameraX;
																var8 = var6 - Skeleton.cameraY;
																var9 = var5 - WorldMapDecoration.cameraZ;
																var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
																var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.949D) & 2047;
																var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047;
																if (var11 < 128) {
																	var11 = 128;
																}

																if (var11 > 383) {
																	var11 = 383;
																}

																if (class1.cameraPitch < var11) {
																	class1.cameraPitch = (var11 - class1.cameraPitch) * ReflectionCheck.field580 / 1000 + class1.cameraPitch + class2.field18;
																	if (class1.cameraPitch > var11) {
																		class1.cameraPitch = var11;
																	}
																}

																if (class1.cameraPitch > var11) {
																	class1.cameraPitch -= ReflectionCheck.field580 * (class1.cameraPitch - var11) / 1000 + class2.field18;
																	if (class1.cameraPitch < var11) {
																		class1.cameraPitch = var11;
																	}
																}

																int var28 = var12 - HealthBarDefinition.cameraYaw;
																if (var28 > 1024) {
																	var28 -= 2048;
																}

																if (var28 < -1024) {
																	var28 += 2048;
																}

																if (var28 > 0) {
																	HealthBarDefinition.cameraYaw = HealthBarDefinition.cameraYaw + class2.field18 + var28 * ReflectionCheck.field580 / 1000;
																	HealthBarDefinition.cameraYaw &= 2047;
																}

																if (var28 < 0) {
																	HealthBarDefinition.cameraYaw -= -var28 * ReflectionCheck.field580 / 1000 + class2.field18;
																	HealthBarDefinition.cameraYaw &= 2047;
																}

																int var14 = var12 - HealthBarDefinition.cameraYaw;
																if (var14 > 1024) {
																	var14 -= 2048;
																}

																if (var14 < -1024) {
																	var14 += 2048;
																}

																if (var14 < 0 && var28 > 0 || var14 > 0 && var28 < 0) {
																	HealthBarDefinition.cameraYaw = var12;
																}
															}

															for (var4 = 0; var4 < 5; ++var4) {
																int var10002 = field870[var4]++;
															}

															varcs.tryWrite();
															var4 = class301.method5371();
															var5 = KeyHandler.KeyHandler_idleCycles;
															PacketBufferNode var29;
															if (var4 > 15000 && var5 > 15000) {
																logoutTimer = 250;
																MouseHandler.MouseHandler_idleCycles = 14500;
																var29 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2657, packetWriter.isaacCipher);
																packetWriter.addNode(var29);
															}

															GrandExchangeOfferUnitPriceComparator.friendSystem.processFriendUpdates();
															++packetWriter.pendingWrites;
															if (packetWriter.pendingWrites > 50) {
																var29 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2583, packetWriter.isaacCipher);
																packetWriter.addNode(var29);
															}

															try {
																packetWriter.flush();
															} catch (IOException var30) {
																BuddyRankComparator.method2492();
															}

															return;
														}

														var41 = var26.widget;
														if (var41.childIndex < 0) {
															break;
														}

														var40 = DevicePcmPlayerProvider.getWidget(var41.parentId);
													} while(var40 == null || var40.children == null || var41.childIndex >= var40.children.length || var41 != var40.children[var41.childIndex]);

													class259.runScriptEvent(var26);
												}
											}

											var41 = var26.widget;
											if (var41.childIndex < 0) {
												break;
											}

											var40 = DevicePcmPlayerProvider.getWidget(var41.parentId);
										} while(var40 == null || var40.children == null || var41.childIndex >= var40.children.length || var41 != var40.children[var41.childIndex]);

										class259.runScriptEvent(var26);
									}
								}

								var41 = var26.widget;
								if (var41.childIndex < 0) {
									break;
								}

								var40 = DevicePcmPlayerProvider.getWidget(var41.parentId);
							} while(var40 == null || var40.children == null || var41.childIndex >= var40.children.length || var41 != var40.children[var41.childIndex]);

							class259.runScriptEvent(var26);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-252374005"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GameEngine.canvasWidth;
		int var2 = HealthBarDefinition.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (class12.clientPreferences != null) {
			try {
				Client var3 = class303.client;
				Object[] var4 = new Object[]{HitSplatDefinition.getWindowedMode()};
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-638945661"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			Messages.method2357(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field825[var1]) {
				field826[var1] = true;
			}

			field636[var1] = field825[var1];
			field825[var1] = false;
		}

		field824 = cycle;
		viewportX = -1;
		viewportY = -1;
		NPCComposition.hoveredItemContainer = null;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			ModeWhere.drawWidgets(rootInterface, 0, 0, GameEngine.canvasWidth, HealthBarDefinition.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				MouseHandler.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				MouseHandler.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				class0.method0(viewportX, viewportY);
			}
		} else {
			ScriptFrame.method1161();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field636[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field826[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		World.method1728(ParamComposition.Client_plane, class35.localPlayer.x, class35.localPlayer.y, field768);
		field768 = 0;
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(Ldd;I)Z",
		garbageValue = "1161587969"
	)
	final boolean method1230(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var19;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1383) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1384 = 0;
						var1.field1383 = false;
					}

					var3.offset = 0;
					if (var3.method6395()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1384 = 0;
					}

					var1.field1383 = true;
					ServerPacket[] var4 = ModeWhere.ServerPacket_values();
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
				var1.field1384 = 0;
				timer.method5463();
				var1.field1391 = var1.field1387;
				var1.field1387 = var1.field1386;
				var1.field1386 = var1.serverPacket;
				int var7;
				int var8;
				int var9;
				int var17;
				if (ServerPacket.field2772 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					var5 = var3.readInt();
					var6 = var17 >> 10 & 31;
					var7 = var17 >> 5 & 31;
					var8 = var17 & 31;
					var9 = (var7 << 11) + (var6 << 19) + (var8 << 3);
					Widget var53 = DevicePcmPlayerProvider.getWidget(var5);
					if (var9 != var53.color) {
						var53.color = var9;
						VerticalAlignment.invalidateWidget(var53);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2734 == var1.serverPacket) {
					if (var1.serverPacketLength == 0) {
						class25.clanChat = null;
					} else {
						if (class25.clanChat == null) {
							class25.clanChat = new FriendsChatManager(ModeWhere.loginType, class303.client);
						}

						class25.clanChat.readUpdate(var3);
					}

					ItemContainer.method2108();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2777 == var1.serverPacket) {
					FileSystem.logOut();
					var1.serverPacket = null;
					return false;
				}

				Widget var18;
				if (ServerPacket.field2775 == var1.serverPacket) {
					var17 = var3.method6481();
					var5 = var3.method6490();
					var18 = DevicePcmPlayerProvider.getWidget(var17);
					if (var5 != var18.sequenceId || var5 == -1) {
						var18.sequenceId = var5;
						var18.modelFrame = 0;
						var18.modelFrameCycle = 0;
						VerticalAlignment.invalidateWidget(var18);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2754 == var1.serverPacket) {
					for (var17 = 0; var17 < class403.VarpDefinition_fileCount; ++var17) {
						VarpDefinition var73 = MusicPatchNode.VarpDefinition_get(var17);
						if (var73 != null) {
							Varps.Varps_temp[var17] = 0;
							Varps.Varps_main[var17] = 0;
						}
					}

					Script.method2014();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				Widget var20;
				if (ServerPacket.field2711 == var1.serverPacket) {
					var17 = var3.method6489();
					var5 = var3.method6428();
					var6 = var3.method6488();
					var20 = DevicePcmPlayerProvider.getWidget(var5);
					if (var6 != var20.rawX || var17 != var20.rawY || var20.xAlignment != 0 || var20.yAlignment != 0) {
						var20.rawX = var6;
						var20.rawY = var17;
						var20.xAlignment = 0;
						var20.yAlignment = 0;
						VerticalAlignment.invalidateWidget(var20);
						this.alignWidget(var20);
						if (var20.type == 0) {
							ApproximateRouteStrategy.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var5 >> 16], var20, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2720 == var1.serverPacket) {
					class19.method267(class225.field2682);
					var1.serverPacket = null;
					return true;
				}

				String var46;
				if (ServerPacket.field2760 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					Object[] var72 = new Object[var46.length() + 1];

					for (var6 = var46.length() - 1; var6 >= 0; --var6) {
						if (var46.charAt(var6) == 's') {
							var72[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var72[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var72[0] = new Integer(var3.readInt());
					ScriptEvent var77 = new ScriptEvent();
					var77.args = var72;
					class259.runScriptEvent(var77);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2737 == var1.serverPacket) {
					GrandExchangeOfferUnitPriceComparator.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field801 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2784 == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShort() * 30;
					field731 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2767 == var1.serverPacket) {
					class19.method267(class225.field2679);
					var1.serverPacket = null;
					return true;
				}

				Widget var66;
				if (ServerPacket.field2763 == var1.serverPacket) {
					var17 = var3.method6497();
					var66 = DevicePcmPlayerProvider.getWidget(var17);
					var66.modelType = 3;
					var66.modelId = class35.localPlayer.appearance.getChatHeadId();
					VerticalAlignment.invalidateWidget(var66);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2782 == var1.serverPacket) {
					VarpDefinition.field1542 = var3.readUnsignedByte();
					class7.field66 = var3.readUnsignedByte();

					for (var17 = class7.field66; var17 < class7.field66 + 8; ++var17) {
						for (var5 = VarpDefinition.field1542; var5 < VarpDefinition.field1542 + 8; ++var5) {
							if (groundItems[ParamComposition.Client_plane][var17][var5] != null) {
								groundItems[ParamComposition.Client_plane][var17][var5] = null;
								Varcs.updateItemPile(var17, var5);
							}
						}
					}

					for (PendingSpawn var50 = (PendingSpawn)pendingSpawns.last(); var50 != null; var50 = (PendingSpawn)pendingSpawns.previous()) {
						if (var50.x >= class7.field66 && var50.x < class7.field66 + 8 && var50.y >= VarpDefinition.field1542 && var50.y < VarpDefinition.field1542 + 8 && var50.plane == ParamComposition.Client_plane) {
							var50.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2725 == var1.serverPacket) {
					if (rootInterface != -1) {
						LoginType.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2729 == var1.serverPacket) {
					class19.method267(class225.field2675);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2766 == var1.serverPacket) {
					class3.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2774 == var1.serverPacket) {
					ClientPreferences.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2700 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readInt();
					var6 = SpotAnimationDefinition.getGcDuration();
					PacketBufferNode var69 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2649, packetWriter.isaacCipher);
					var69.packetBuffer.method6493(var17);
					var69.packetBuffer.writeInt(var5);
					var69.packetBuffer.method6449(GameEngine.fps);
					var69.packetBuffer.method6610(var6);
					packetWriter.addNode(var69);
					var1.serverPacket = null;
					return true;
				}

				byte var60;
				if (ServerPacket.field2788 == var1.serverPacket) {
					field814 = cycleCntr;
					var60 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var60 >= 0) {
							field847[var60] = null;
						} else {
							Players.field1358 = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var60 >= 0) {
						field847[var60] = new class3(var3);
					} else {
						Players.field1358 = new class3(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2713 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					class9.method95(var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2739 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					if (var17 == 65535) {
						var17 = -1;
					}

					FontName.playSong(var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2724 == var1.serverPacket) {
					var17 = var3.method6486();
					if (var17 == 65535) {
						var17 = -1;
					}

					var5 = var3.method6492();
					class311.method5486(var17, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2768 == var1.serverPacket) {
					class19.method267(class225.field2674);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2749 == var1.serverPacket) {
					class19.method267(class225.field2677);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2699 == var1.serverPacket) {
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

				long var12;
				int var21;
				InterfaceParent var63;
				if (ServerPacket.field2726 == var1.serverPacket) {
					var17 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						ApproximateRouteStrategy.Widget_resetModelFrames(rootInterface);
						HealthBar.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							field825[var7] = true;
						}
					}

					InterfaceParent var52;
					for (; var6-- > 0; var52.field1136 = true) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var52 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var52 != null && var8 != var52.group) {
							class18.closeInterface(var52, true);
							var52 = null;
						}

						if (var52 == null) {
							var52 = GrandExchangeOfferWorldComparator.method5010(var7, var8, var9);
						}
					}

					for (var63 = (InterfaceParent)interfaceParents.first(); var63 != null; var63 = (InterfaceParent)interfaceParents.next()) {
						if (var63.field1136) {
							var63.field1136 = false;
						} else {
							class18.closeInterface(var63, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var17) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var21 = var3.readInt();

						for (int var54 = var8; var54 <= var9; ++var54) {
							var12 = ((long)var7 << 32) + (long)var54;
							widgetFlags.put(new IntegerNode(var21), var12);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2731 == var1.serverPacket) {
					class19.method267(class225.field2673);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2716 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readUnsignedShort();
					var18 = DevicePcmPlayerProvider.getWidget(var17);
					if (var18.modelType != 2 || var5 != var18.modelId) {
						var18.modelType = 2;
						var18.modelId = var5;
						VerticalAlignment.invalidateWidget(var18);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2769 == var1.serverPacket) {
					GameObject.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2757 == var1.serverPacket) {
					class22.method297();
					var60 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var60 >= 0) {
							field678[var60] = null;
						} else {
							class105.field1328 = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var60 >= 0) {
						field678[var60] = new class11(var3);
					} else {
						class105.field1328 = new class11(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var76;
				if (ServerPacket.field2722 == var1.serverPacket) {
					var76 = var3.readBoolean();
					if (var76) {
						if (class18.field154 == null) {
							class18.field154 = new class285();
						}
					} else {
						class18.field154 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2779 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2759 == var1.serverPacket) {
					Script.method2014();
					weight = var3.readShort();
					field731 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2755 == var1.serverPacket) {
					VarpDefinition.field1542 = var3.readUnsignedByte();
					class7.field66 = var3.readUnsignedByte();

					while (var3.offset < var1.serverPacketLength) {
						var17 = var3.readUnsignedByte();
						class225 var70 = class124.method2501()[var17];
						class19.method267(var70);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2742 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field846[var17] = true;
					field744[var17] = var5;
					field868[var17] = var6;
					field869[var17] = var7;
					field870[var17] = 0;
					var1.serverPacket = null;
					return true;
				}

				long var22;
				if (ServerPacket.field2780 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					if (var17 == 65535) {
						var17 = -1;
					}

					var5 = var3.method6481();
					var6 = var3.method6648();
					if (var6 == 65535) {
						var6 = -1;
					}

					var7 = var3.method6428();

					for (var8 = var17; var8 <= var6; ++var8) {
						var22 = (long)var8 + ((long)var7 << 32);
						Node var75 = widgetFlags.get(var22);
						if (var75 != null) {
							var75.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2735 == var1.serverPacket) {
					var17 = var3.method6620();
					rootInterface = var17;
					this.resizeRoot(false);
					ApproximateRouteStrategy.Widget_resetModelFrames(var17);
					HealthBar.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field825[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2758 == var1.serverPacket) {
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
						hintArrowHeight = var3.readUnsignedByte() * 2;
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				String var74;
				if (ServerPacket.field2764 == var1.serverPacket) {
					byte[] var49 = new byte[var1.serverPacketLength];
					var3.method6397(var49, 0, var49.length);
					Buffer var67 = new Buffer(var49);
					var74 = var67.readStringCp1252NullTerminated();
					Interpreter.openURL(var74, true, false);
					var1.serverPacket = null;
					return true;
				}

				long var25;
				long var27;
				String var33;
				int var58;
				if (ServerPacket.field2712 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					var25 = (long)var3.readUnsignedShort();
					var27 = (long)var3.readMedium();
					PlayerType var29 = (PlayerType)UserComparator4.findEnumerated(class249.PlayerType_values(), var3.readUnsignedByte());
					long var30 = (var25 << 32) + var27;
					boolean var32 = false;

					for (var58 = 0; var58 < 100; ++var58) {
						if (crossWorldMessageIds[var58] == var30) {
							var32 = true;
							break;
						}
					}

					if (GrandExchangeOfferUnitPriceComparator.friendSystem.isIgnored(new Username(var46, ModeWhere.loginType))) {
						var32 = true;
					}

					if (!var32 && field727 == 0) {
						crossWorldMessageIds[field841] = var30;
						field841 = (field841 + 1) % 100;
						var33 = AbstractFont.escapeBrackets(Clock.method2592(class22.method299(var3)));
						byte var59;
						if (var29.isPrivileged) {
							var59 = 7;
						} else {
							var59 = 3;
						}

						if (var29.modIcon != -1) {
							WorldMapScaleHandler.addGameMessage(var59, class169.method3495(var29.modIcon) + var46, var33);
						} else {
							WorldMapScaleHandler.addGameMessage(var59, var46, var33);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var34;
				if (ServerPacket.field2761 == var1.serverPacket) {
					var17 = var3.method6620();
					var5 = var3.method6648();
					var6 = var3.method6486();
					var7 = var3.method6428();
					var34 = DevicePcmPlayerProvider.getWidget(var7);
					if (var17 != var34.modelAngleX || var5 != var34.modelAngleY || var6 != var34.modelZoom) {
						var34.modelAngleX = var17;
						var34.modelAngleY = var5;
						var34.modelZoom = var6;
						VerticalAlignment.invalidateWidget(var34);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2771 == var1.serverPacket) {
					HealthBar.updatePlayers(var3, var1.serverPacketLength);
					Clock.method2583();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2728 == var1.serverPacket) {
					class19.method267(class225.field2687);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2738 == var1.serverPacket) {
					var17 = var3.readInt();
					if (var17 != field839) {
						field839 = var17;
						FriendSystem.method1732();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2718 == var1.serverPacket) {
					var17 = var3.readUShortSmart();
					boolean var56 = var3.readUnsignedByte() == 1;
					var74 = "";
					boolean var51 = false;
					if (var56) {
						var74 = var3.readStringCp1252NullTerminated();
						if (GrandExchangeOfferUnitPriceComparator.friendSystem.isIgnored(new Username(var74, ModeWhere.loginType))) {
							var51 = true;
						}
					}

					String var79 = var3.readStringCp1252NullTerminated();
					if (!var51) {
						WorldMapScaleHandler.addGameMessage(var17, var74, var79);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2751 == var1.serverPacket) {
					isCameraLocked = true;
					Language.field3704 = var3.readUnsignedByte() * 128;
					Interpreter.field947 = var3.readUnsignedByte() * 128;
					KitDefinition.field1592 = var3.readUnsignedShort();
					class2.field18 = var3.readUnsignedByte();
					ReflectionCheck.field580 = var3.readUnsignedByte();
					if (ReflectionCheck.field580 >= 100) {
						var17 = Language.field3704 * 16384 + 64;
						var5 = Interpreter.field947 * 16384 + 64;
						var6 = SceneTilePaint.getTileHeight(var17, var5, ParamComposition.Client_plane) - KitDefinition.field1592;
						var7 = var17 - class20.cameraX;
						var8 = var6 - Skeleton.cameraY;
						var9 = var5 - WorldMapDecoration.cameraZ;
						var21 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
						class1.cameraPitch = (int)(Math.atan2((double)var8, (double)var21) * 325.949D) & 2047;
						HealthBarDefinition.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047;
						if (class1.cameraPitch < 128) {
							class1.cameraPitch = 128;
						}

						if (class1.cameraPitch > 383) {
							class1.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2747 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					var5 = var3.method6648();
					var6 = var3.method6481();
					var63 = (InterfaceParent)interfaceParents.get((long)var6);
					if (var63 != null) {
						class18.closeInterface(var63, var5 != var63.group);
					}

					GrandExchangeOfferWorldComparator.method5010(var6, var5, var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2704 == var1.serverPacket) {
					var76 = var3.method6478() == 1;
					var5 = var3.method6428();
					var18 = DevicePcmPlayerProvider.getWidget(var5);
					if (var76 != var18.isHidden) {
						var18.isHidden = var76;
						VerticalAlignment.invalidateWidget(var18);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2778 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					var5 = var3.method6497();
					var18 = DevicePcmPlayerProvider.getWidget(var5);
					if (!var46.equals(var18.text)) {
						var18.text = var46;
						VerticalAlignment.invalidateWidget(var18);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2744 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					byte var55 = var3.readByte();
					Varps.Varps_temp[var17] = var55;
					if (Varps.Varps_main[var17] != var55) {
						Varps.Varps_main[var17] = var55;
					}

					WorldMapData_0.changeGameOptions(var17);
					changedVarps[++changedVarpCount - 1 & 31] = var17;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2786 == var1.serverPacket) {
					class3.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2710 == var1.serverPacket) {
					class19.method267(class225.field2678);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2773 == var1.serverPacket) {
					isCameraLocked = true;
					field696 = var3.readUnsignedByte() * 128;
					class18.field157 = var3.readUnsignedByte() * 16384;
					class0.field5 = var3.readUnsignedShort();
					UserComparator4.field1403 = var3.readUnsignedByte();
					SoundSystem.field436 = var3.readUnsignedByte();
					if (SoundSystem.field436 >= 100) {
						class20.cameraX = field696 * 16384 + 64;
						WorldMapDecoration.cameraZ = class18.field157 * 128 + 64;
						Skeleton.cameraY = SceneTilePaint.getTileHeight(class20.cameraX, WorldMapDecoration.cameraZ, ParamComposition.Client_plane) - class0.field5;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2743 == var1.serverPacket) {
					class19.method267(class225.field2680);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2752 == var1.serverPacket) {
					var17 = var3.method6620();
					var5 = var3.method6428();
					var18 = DevicePcmPlayerProvider.getWidget(var5);
					if (var18.modelType != 1 || var17 != var18.modelId) {
						var18.modelType = 1;
						var18.modelId = var17;
						VerticalAlignment.invalidateWidget(var18);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2750 == var1.serverPacket) {
					ObjectSound.field935 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2783 == var1.serverPacket) {
					var76 = var3.readUnsignedByte() == 1;
					if (var76) {
						ChatChannel.field1081 = Archive.currentTimeMillis() - var3.readLong();
						class29.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						class29.grandExchangeEvents = null;
					}

					field816 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2719 == var1.serverPacket) {
					var17 = var3.method6428();
					var5 = var3.method6497();
					var6 = var3.method6486();
					if (var6 == 65535) {
						var6 = -1;
					}

					var20 = DevicePcmPlayerProvider.getWidget(var5);
					ItemComposition var78;
					if (!var20.isIf3) {
						if (var6 == -1) {
							var20.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var78 = Strings.ItemDefinition_get(var6);
						var20.modelType = 4;
						var20.modelId = var6;
						var20.modelAngleX = var78.xan2d;
						var20.modelAngleY = var78.yan2d;
						var20.modelZoom = var78.zoom2d * 100 / var17;
						VerticalAlignment.invalidateWidget(var20);
					} else {
						var20.itemId = var6;
						var20.itemQuantity = var17;
						var78 = Strings.ItemDefinition_get(var6);
						var20.modelAngleX = var78.xan2d;
						var20.modelAngleY = var78.yan2d;
						var20.modelAngleZ = var78.zan2d;
						var20.modelOffsetX = var78.offsetX2d;
						var20.modelOffsetY = var78.offsetY2d;
						var20.modelZoom = var78.zoom2d;
						if (var78.isStackable == 1) {
							var20.itemQuantityMode = 1;
						} else {
							var20.itemQuantityMode = 2;
						}

						if (var20.field3019 > 0) {
							var20.modelZoom = var20.modelZoom * 32 / var20.field3019;
						} else if (var20.rawWidth > 0) {
							var20.modelZoom = var20.modelZoom * 32 / var20.rawWidth;
						}

						VerticalAlignment.invalidateWidget(var20);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2701 == var1.serverPacket) {
					ObjectSound.field935 = new class339(ModeWhere.HitSplatDefinition_cachedSprites);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2702 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					var19 = AbstractFont.escapeBrackets(Clock.method2592(class22.method299(var3)));
					WorldMapScaleHandler.addGameMessage(6, var46, var19);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2703 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					class69.queueSoundEffect(var17, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2709 == var1.serverPacket) {
					class5.method64(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				int var15;
				String var35;
				if (ServerPacket.field2708 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					var25 = var3.readLong();
					var27 = (long)var3.readUnsignedShort();
					var22 = (long)var3.readMedium();
					PlayerType var24 = (PlayerType)UserComparator4.findEnumerated(class249.PlayerType_values(), var3.readUnsignedByte());
					var12 = (var27 << 32) + var22;
					boolean var57 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var12) {
							var57 = true;
							break;
						}
					}

					if (var24.isUser && GrandExchangeOfferUnitPriceComparator.friendSystem.isIgnored(new Username(var46, ModeWhere.loginType))) {
						var57 = true;
					}

					if (!var57 && field727 == 0) {
						crossWorldMessageIds[field841] = var12;
						field841 = (field841 + 1) % 100;
						var35 = AbstractFont.escapeBrackets(Clock.method2592(class22.method299(var3)));
						if (var24.modIcon != -1) {
							class69.addChatMessage(9, class169.method3495(var24.modIcon) + var46, var35, MilliClock.base37DecodeLong(var25));
						} else {
							class69.addChatMessage(9, var46, var35, MilliClock.base37DecodeLong(var25));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2721 == var1.serverPacket) {
					var17 = var3.method6481();
					var66 = DevicePcmPlayerProvider.getWidget(var17);

					for (var6 = 0; var6 < var66.itemIds.length; ++var6) {
						var66.itemIds[var6] = -1;
						var66.itemIds[var6] = 0;
					}

					VerticalAlignment.invalidateWidget(var66);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2762 == var1.serverPacket) {
					class22.method297();
					var60 = var3.readByte();
					class2 var64 = new class2(var3);
					class11 var71;
					if (var60 >= 0) {
						var71 = field678[var60];
					} else {
						var71 = class105.field1328;
					}

					var64.method25(var71);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2730 == var1.serverPacket) {
					var17 = var3.method6497();
					var5 = var3.readUnsignedShort();
					Varps.Varps_temp[var5] = var17;
					if (Varps.Varps_main[var5] != var17) {
						Varps.Varps_main[var5] = var17;
					}

					WorldMapData_0.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2732 == var1.serverPacket) {
					class19.method267(class225.field2681);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2787 == var1.serverPacket) {
					var60 = var3.readByte();
					var25 = (long)var3.readUnsignedShort();
					var27 = (long)var3.readMedium();
					var22 = (var25 << 32) + var27;
					boolean var11 = false;
					class3 var36 = var60 >= 0 ? field847[var60] : Players.field1358;
					if (var36 == null) {
						var11 = true;
					} else {
						for (var58 = 0; var58 < 100; ++var58) {
							if (crossWorldMessageIds[var58] == var22) {
								var11 = true;
								break;
							}
						}
					}

					if (!var11) {
						crossWorldMessageIds[field841] = var22;
						field841 = (field841 + 1) % 100;
						var33 = class22.method299(var3);
						int var14 = var60 >= 0 ? 43 : 46;
						class69.addChatMessage(var14, "", var33, var36.field38);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2733 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var17] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var17] = new GrandExchangeOffer(var3, false);
					}

					field815 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2785 == var1.serverPacket) {
					ClientPreferences.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2795 == var1.serverPacket) {
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

				if (ServerPacket.field2745 == var1.serverPacket) {
					Script.method2014();
					var17 = var3.method6476();
					var5 = var3.method6478();
					var6 = var3.method6497();
					experience[var5] = var6;
					currentLevels[var5] = var17;
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

				if (ServerPacket.field2781 == var1.serverPacket) {
					var17 = var3.method6497();
					var5 = var3.method6497();
					InterfaceParent var68 = (InterfaceParent)interfaceParents.get((long)var5);
					var63 = (InterfaceParent)interfaceParents.get((long)var17);
					if (var63 != null) {
						class18.closeInterface(var63, var68 == null || var63.group != var68.group);
					}

					if (var68 != null) {
						var68.remove();
						interfaceParents.put(var68, (long)var17);
					}

					var34 = DevicePcmPlayerProvider.getWidget(var5);
					if (var34 != null) {
						VerticalAlignment.invalidateWidget(var34);
					}

					var34 = DevicePcmPlayerProvider.getWidget(var17);
					if (var34 != null) {
						VerticalAlignment.invalidateWidget(var34);
						ApproximateRouteStrategy.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var34.id >>> 16], var34, true);
					}

					if (rootInterface != -1) {
						LoginType.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2746 == var1.serverPacket) {
					var17 = var3.method6497();
					var5 = var3.method6648();
					var6 = var3.method6648();
					var20 = DevicePcmPlayerProvider.getWidget(var17);
					var20.field3020 = var6 + (var5 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2741 == var1.serverPacket) {
					AbstractArchive.privateChatMode = EnumComposition.method2727(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2794 == var1.serverPacket) {
					GrandExchangeOfferUnitPriceComparator.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					class181.FriendSystem_invalidateIgnoreds();
					field801 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2756 == var1.serverPacket) {
					isCameraLocked = false;

					for (var17 = 0; var17 < 5; ++var17) {
						field846[var17] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2714 == var1.serverPacket) {
					Script.method2014();
					runEnergy = var3.readUnsignedByte();
					field731 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2740 == var1.serverPacket) {
					var60 = var3.readByte();
					var19 = var3.readStringCp1252NullTerminated();
					long var37 = (long)var3.readUnsignedShort();
					long var39 = (long)var3.readMedium();
					PlayerType var10 = (PlayerType)UserComparator4.findEnumerated(class249.PlayerType_values(), var3.readUnsignedByte());
					long var41 = (var37 << 32) + var39;
					boolean var13 = false;
					class3 var43 = null;
					var43 = var60 >= 0 ? field847[var60] : Players.field1358;
					if (var43 == null) {
						var13 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var10.isUser && GrandExchangeOfferUnitPriceComparator.friendSystem.isIgnored(new Username(var19, ModeWhere.loginType))) {
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
						crossWorldMessageIds[field841] = var41;
						field841 = (field841 + 1) % 100;
						var35 = AbstractFont.escapeBrackets(class22.method299(var3));
						int var16 = var60 >= 0 ? 41 : 44;
						if (var10.modIcon != -1) {
							class69.addChatMessage(var16, class169.method3495(var10.modIcon) + var19, var35, var43.field38);
						} else {
							class69.addChatMessage(var16, var19, var35, var43.field38);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2727 == var1.serverPacket) {
					var17 = var3.method6486();
					FriendSystem.method1782(var17);
					changedItemContainers[++field805 - 1 & 31] = var17 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2707 == var1.serverPacket) {
					class7.field66 = var3.method6476();
					VarpDefinition.field1542 = var3.method6478();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2715 == var1.serverPacket) {
					field814 = cycleCntr;
					var60 = var3.readByte();
					class19 var62 = new class19(var3);
					class3 var65;
					if (var60 >= 0) {
						var65 = field847[var60];
					} else {
						var65 = Players.field1358;
					}

					var62.method263(var65);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2705 == var1.serverPacket) {
					GrandExchangeOfferUnitPriceComparator.friendSystem.method1734();
					field801 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2792 == var1.serverPacket) {
					if (class25.clanChat != null) {
						class25.clanChat.method5519(var3);
					}

					ItemContainer.method2108();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2789 == var1.serverPacket) {
					for (var17 = 0; var17 < Varps.Varps_main.length; ++var17) {
						if (Varps.Varps_main[var17] != Varps.Varps_temp[var17]) {
							Varps.Varps_main[var17] = Varps.Varps_temp[var17];
							WorldMapData_0.changeGameOptions(var17);
							changedVarps[++changedVarpCount - 1 & 31] = var17;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2748 == var1.serverPacket) {
					if (ObjectSound.field935 == null) {
						ObjectSound.field935 = new class339(ModeWhere.HitSplatDefinition_cachedSprites);
					}

					class390 var48 = ModeWhere.HitSplatDefinition_cachedSprites.method5873(var3);
					ObjectSound.field935.field3930.vmethod6221(var48.field4222, var48.field4221);
					field808[++field809 - 1 & 31] = var48.field4222;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2736 == var1.serverPacket) {
					World var47 = new World();
					var47.host = var3.readStringCp1252NullTerminated();
					var47.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var47.properties = var5;
					updateGameState(45);
					var2.close();
					var2 = null;
					PlatformInfo.changeWorld(var47);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2765 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						RouteStrategy.method3134(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2793 == var1.serverPacket) {
					var17 = var3.readInt();
					InterfaceParent var61 = (InterfaceParent)interfaceParents.get((long)var17);
					if (var61 != null) {
						class18.closeInterface(var61, true);
					}

					if (meslayerContinueWidget != null) {
						VerticalAlignment.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2753 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					var5 = var3.method6478();
					var6 = var3.method6477();
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

				if (ServerPacket.field2791 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var17 < -70000) {
						var5 += 32768;
					}

					if (var17 >= 0) {
						var18 = DevicePcmPlayerProvider.getWidget(var17);
					} else {
						var18 = null;
					}

					for (; var3.offset < var1.serverPacketLength; BufferedNetSocket.itemContainerSetItem(var5, var7, var8 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var9 = 0;
						if (var8 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var18 != null && var7 >= 0 && var7 < var18.itemIds.length) {
							var18.itemIds[var7] = var8;
							var18.itemQuantities[var7] = var9;
						}
					}

					if (var18 != null) {
						VerticalAlignment.invalidateWidget(var18);
					}

					Script.method2014();
					changedItemContainers[++field805 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2776 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					class25.forceDisconnect(var17);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2723 == var1.serverPacket) {
					var17 = var3.method6428();
					var5 = var3.method6620();
					var18 = DevicePcmPlayerProvider.getWidget(var17);
					if (var18 != null && var18.type == 0) {
						if (var5 > var18.scrollHeight - var18.height) {
							var5 = var18.scrollHeight - var18.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var18.scrollY) {
							var18.scrollY = var5;
							VerticalAlignment.invalidateWidget(var18);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2790 == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByte();
					tradeChatMode = var3.method6478();
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
						var18 = DevicePcmPlayerProvider.getWidget(var17);
					} else {
						var18 = null;
					}

					if (var18 != null) {
						for (var7 = 0; var7 < var18.itemIds.length; ++var7) {
							var18.itemIds[var7] = 0;
							var18.itemQuantities[var7] = 0;
						}
					}

					Skills.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var3.method6486();
						var21 = var3.method6476();
						if (var21 == 255) {
							var21 = var3.method6481();
						}

						if (var18 != null && var8 < var18.itemIds.length) {
							var18.itemIds[var8] = var9;
							var18.itemQuantities[var8] = var21;
						}

						BufferedNetSocket.itemContainerSetItem(var5, var8, var9 - 1, var21);
					}

					if (var18 != null) {
						VerticalAlignment.invalidateWidget(var18);
					}

					Script.method2014();
					changedItemContainers[++field805 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				class27.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1387 != null ? var1.field1387.id : -1) + "," + (var1.field1391 != null ? var1.field1391.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				FileSystem.logOut();
			} catch (IOException var44) {
				BuddyRankComparator.method2492();
			} catch (Exception var45) {
				var19 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1387 != null ? var1.field1387.id : -1) + "," + (var1.field1391 != null ? var1.field1391.id : -1) + "," + var1.serverPacketLength + "," + (class35.localPlayer.pathX[0] + JagexCache.baseX * 64) + "," + (class35.localPlayer.pathY[0] + Messages.baseY * 64) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var19 = var19 + var3.array[var6] + ",";
				}

				class27.RunException_sendStackTrace(var19, var45);
				FileSystem.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "104"
	)
	@Export("menu")
	final void menu() {
		ViewportMouse.method4194();
		if (class34.dragInventoryWidget == null) {
			if (clickedWidget == null) {
				int var2;
				int var4;
				int var5;
				label262: {
					int var1 = MouseHandler.MouseHandler_lastButton;
					int var3;
					int var8;
					int var10;
					int var14;
					if (isMenuOpen) {
						if (var1 != 1 && (class229.mouseCam || var1 != 4)) {
							var2 = MouseHandler.MouseHandler_x;
							var3 = MouseHandler.MouseHandler_y;
							if (var2 < AbstractByteArrayCopier.menuX - 10 || var2 > AbstractByteArrayCopier.menuX + SoundCache.menuWidth + 10 || var3 < HitSplatDefinition.menuY - 10 || var3 > GrandExchangeOfferOwnWorldComparator.menuHeight + HitSplatDefinition.menuY + 10) {
								isMenuOpen = false;
								class179.method3586(AbstractByteArrayCopier.menuX, HitSplatDefinition.menuY, SoundCache.menuWidth, GrandExchangeOfferOwnWorldComparator.menuHeight);
							}
						}

						if (var1 == 1 || !class229.mouseCam && var1 == 4) {
							var2 = AbstractByteArrayCopier.menuX;
							var3 = HitSplatDefinition.menuY;
							var4 = SoundCache.menuWidth;
							var5 = MouseHandler.MouseHandler_lastPressedX;
							var14 = MouseHandler.MouseHandler_lastPressedY;
							int var18 = -1;

							int var19;
							for (var8 = 0; var8 < menuOptionsCount; ++var8) {
								var19 = (menuOptionsCount - 1 - var8) * 15 + var3 + 31;
								if (var5 > var2 && var5 < var4 + var2 && var14 > var19 - 13 && var14 < var19 + 3) {
									var18 = var8;
								}
							}

							int var11;
							if (var18 != -1 && var18 >= 0) {
								var8 = menuArguments1[var18];
								var19 = menuArguments2[var18];
								var10 = menuOpcodes[var18];
								var11 = menuIdentifiers[var18];
								String var12 = menuActions[var18];
								String var13 = menuTargets[var18];
								HorizontalAlignment.menuAction(var8, var19, var10, var11, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
							}

							isMenuOpen = false;
							var8 = AbstractByteArrayCopier.menuX;
							var19 = HitSplatDefinition.menuY;
							var10 = SoundCache.menuWidth;
							var11 = GrandExchangeOfferOwnWorldComparator.menuHeight;

							for (int var17 = 0; var17 < rootWidgetCount; ++var17) {
								if (rootWidgetXs[var17] + rootWidgetWidths[var17] > var8 && rootWidgetXs[var17] < var10 + var8 && rootWidgetHeights[var17] + rootWidgetYs[var17] > var19 && rootWidgetYs[var17] < var11 + var19) {
									field825[var17] = true;
								}
							}
						}
					} else {
						var2 = AttackOption.method2285();
						if ((var1 == 1 || !class229.mouseCam && var1 == 4) && var2 >= 0) {
							var3 = menuOpcodes[var2];
							if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) {
								var4 = menuArguments1[var2];
								var5 = menuArguments2[var2];
								Widget var6 = DevicePcmPlayerProvider.getWidget(var5);
								var8 = class26.getWidgetFlags(var6);
								boolean var7 = (var8 >> 28 & 1) != 0;
								if (var7) {
									break label262;
								}

								var10 = class26.getWidgetFlags(var6);
								boolean var9 = (var10 >> 29 & 1) != 0;
								if (var9) {
									break label262;
								}
							}
						}

						if ((var1 == 1 || !class229.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) {
							var1 = 2;
						}

						if ((var1 == 1 || !class229.mouseCam && var1 == 4) && menuOptionsCount > 0 && var2 >= 0) {
							var3 = menuArguments1[var2];
							var4 = menuArguments2[var2];
							var5 = menuOpcodes[var2];
							var14 = menuIdentifiers[var2];
							String var15 = menuActions[var2];
							String var16 = menuTargets[var2];
							HorizontalAlignment.menuAction(var3, var4, var5, var14, var15, var16, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}

						if (var1 == 2 && menuOptionsCount > 0) {
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}

					return;
				}

				if (class34.dragInventoryWidget != null && !field728 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
					ItemLayer.method3715(draggedWidgetX, draggedWidgetY);
				}

				field728 = false;
				itemDragDuration = 0;
				if (class34.dragInventoryWidget != null) {
					VerticalAlignment.invalidateWidget(class34.dragInventoryWidget);
				}

				class34.dragInventoryWidget = DevicePcmPlayerProvider.getWidget(var5);
				dragItemSlotSource = var4;
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
				if (var2 >= 0) {
					GrandExchangeOfferAgeComparator.method4989(var2);
				}

				VerticalAlignment.invalidateWidget(class34.dragInventoryWidget);
			}
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "11"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = AttackOption.method2285();
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || LoginPacket.method4319(var1)) && !menuShiftClick[var1];
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		WorldMapRegion.method3317(var1, var2);
		class5.scene.menuOpen(ParamComposition.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		Strings.method4801(rootInterface, GameEngine.canvasWidth, HealthBarDefinition.canvasHeight, var1);
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)V",
		garbageValue = "724279909"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : DevicePcmPlayerProvider.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = GameEngine.canvasWidth;
			var4 = HealthBarDefinition.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		class17.alignWidgetSize(var1, var3, var4, false);
		UserComparator3.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1158614340"
	)
	final void method1236() {
		VerticalAlignment.invalidateWidget(clickedWidget);
		++class288.widgetDragDuration;
		if (field797 && field794) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field795) {
				var1 = field795;
			}

			if (var1 + clickedWidget.width > field795 + clickedWidgetParent.width) {
				var1 = field795 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field785) {
				var2 = field785;
			}

			if (var2 + clickedWidget.height > field785 + clickedWidgetParent.height) {
				var2 = field785 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field871;
			int var4 = var2 - field798;
			int var5 = clickedWidget.dragZoneSize;
			if (class288.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field795 + clickedWidgetParent.scrollX;
			int var7 = var2 - field785 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				class259.runScriptEvent(var8);
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
						class259.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && HorizontalAlignment.method2731(clickedWidget) != null) {
						PacketBufferNode var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2568, packetWriter.isaacCipher);
						var9.packetBuffer.method6493(draggedOnWidget.id);
						var9.packetBuffer.method6484(clickedWidget.itemId);
						var9.packetBuffer.writeShort(draggedOnWidget.childIndex);
						var9.packetBuffer.writeInt(clickedWidget.id);
						var9.packetBuffer.writeShort(draggedOnWidget.itemId);
						var9.packetBuffer.method6484(clickedWidget.childIndex);
						packetWriter.addNode(var9);
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field871 + widgetClickX, widgetClickY + field798);
				} else if (menuOptionsCount > 0) {
					ItemLayer.method3715(field871 + widgetClickX, widgetClickY + field798);
				}

				clickedWidget = null;
			}

		} else {
			if (class288.widgetDragDuration > 1) {
				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(B)Lla;",
		garbageValue = "98"
	)
	@Export("username")
	public Username username() {
		return class35.localPlayer != null ? class35.localPlayer.username : null;
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-101"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != gameState) {
			if (gameState == 0) {
				class303.client.method548();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) {
				loginState = 0;
				field649 = 0;
				field749 = 0;
				timer.method5465(var0);
				if (var0 != 20) {
					HealthBarUpdate.method2204(false);
				}
			}

			if (var0 != 20 && var0 != 40 && TriBool.field3866 != null) {
				TriBool.field3866.close();
				TriBool.field3866 = null;
			}

			if (gameState == 25) {
				field790 = 0;
				field669 = 0;
				field670 = 1;
				field671 = 0;
				field672 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					class169.method3494(PendingSpawn.archive10, class43.archive8, true, gameState == 11 ? 4 : 0);
				} else if (var0 == 11) {
					class169.method3494(PendingSpawn.archive10, class43.archive8, false, 4);
				} else if (Login.clearLoginScreen) {
					ItemContainer.titleboxSprite = null;
					Login.titlebuttonSprite = null;
					Login.runesSprite = null;
					Canvas.leftTitleSprite = null;
					class12.rightTitleSprite = null;
					FontName.logoSprite = null;
					FontName.title_muteSprite = null;
					GrandExchangeOfferUnitPriceComparator.options_buttons_0Sprite = null;
					GrandExchangeEvent.options_buttons_2Sprite = null;
					Login.worldSelectBackSprites = null;
					UserComparator5.worldSelectFlagSprites = null;
					Login.worldSelectArrows = null;
					AbstractWorldMapIcon.worldSelectStars = null;
					class288.field3691 = null;
					AttackOption.loginScreenRunesAnimation.method2207();
					class390.method6744(2);
					if (NetCache.NetCache_socket != null) {
						try {
							Buffer var1 = new Buffer(4);
							var1.writeByte(2);
							var1.writeMedium(0);
							NetCache.NetCache_socket.write(var1.array, 0, 4);
						} catch (IOException var4) {
							try {
								NetCache.NetCache_socket.close();
							} catch (Exception var3) {
							}

							++NetCache.NetCache_ioExceptions;
							NetCache.NetCache_socket = null;
						}
					}

					Login.clearLoginScreen = false;
				}
			} else {
				class169.method3494(PendingSpawn.archive10, class43.archive8, true, 0);
			}

			gameState = var0;
		}
	}
}
