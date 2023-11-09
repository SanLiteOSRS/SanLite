import com.jagex.oldscape.pub.OtlTokenRequester;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi {
	@ObfuscatedName("sh")
	@ObfuscatedSignature(
		descriptor = "[Ler;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("vf")
	@ObfuscatedGetter(
		intValue = -1428536373
	)
	public static int field793;
	@ObfuscatedName("sr")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("ur")
	@ObfuscatedGetter(
		intValue = 2083770115
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		intValue = 1090543081
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("wm")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	static final ApproximateRouteStrategy field790;
	@ObfuscatedName("vr")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wq")
	static int[] field693;
	@ObfuscatedName("wx")
	static int[] field792;
	@ObfuscatedName("vh")
	@ObfuscatedGetter(
		intValue = 1275523615
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("tt")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("ta")
	static boolean field758;
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = 2034935779
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("uq")
	@ObfuscatedGetter(
		intValue = 301417933
	)
	static int field539;
	@ObfuscatedName("tv")
	@ObfuscatedGetter(
		intValue = 1205447809
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("uw")
	static boolean[] field556;
	@ObfuscatedName("tn")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("uu")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("uh")
	@ObfuscatedGetter(
		intValue = 656131205
	)
	static int field543;
	@ObfuscatedName("tz")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("tr")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = 1232216623
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		intValue = 1127045003
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tp")
	@ObfuscatedSignature(
		descriptor = "[Lag;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("th")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		intValue = -1525756261
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("vv")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("rs")
	@ObfuscatedGetter(
		longValue = -7050977520656748003L
	)
	static long field738;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = -420744349
	)
	static int field519;
	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "[Leq;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("uk")
	static short field764;
	@ObfuscatedName("ul")
	static short field649;
	@ObfuscatedName("ua")
	static short field562;
	@ObfuscatedName("uj")
	static short field771;
	@ObfuscatedName("vt")
	@ObfuscatedGetter(
		intValue = 1645580525
	)
	static int field588;
	@ObfuscatedName("un")
	static short field769;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = 227322785
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("ux")
	@ObfuscatedGetter(
		intValue = -1734567293
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("uv")
	static short field601;
	@ObfuscatedName("ss")
	static int[] field691;
	@ObfuscatedName("uz")
	@ObfuscatedGetter(
		intValue = -1010843293
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("sy")
	static int[] field744;
	@ObfuscatedName("su")
	@ObfuscatedSignature(
		descriptor = "[Lri;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("um")
	@ObfuscatedGetter(
		intValue = 355500089
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("ui")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("ud")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = 987699759
	)
	static int field679;
	@ObfuscatedName("rh")
	static int[] field737;
	@ObfuscatedName("ug")
	static int[] field665;
	@ObfuscatedName("ra")
	static int[] field613;
	@ObfuscatedName("us")
	static int[] field760;
	@ObfuscatedName("uo")
	static int[] field762;
	@ObfuscatedName("up")
	static int[] field763;
	@ObfuscatedName("vb")
	@ObfuscatedSignature(
		descriptor = "[Lmi;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("ve")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("vs")
	@ObfuscatedGetter(
		intValue = 391113383
	)
	static int field785;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lgr;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("bx")
	static boolean field517;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -791246561
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 333694475
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1570820869
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bd")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bq")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -243147255
	)
	static int field494;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 210271959
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1360270113
	)
	static int field573;
	@ObfuscatedName("by")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 801669917
	)
	public static int field789;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1954783269
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("df")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 602500049
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		longValue = -1538799473230678833L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -1566615457
	)
	static int field504;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 2092341179
	)
	static int field630;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		longValue = 3869057079940378449L
	)
	static long field501;
	@ObfuscatedName("dx")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -1742148499
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -374191823
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -607279851
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 843945909
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1976921097
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1954664197
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -1402300668
	)
	static int field770;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 702646592
	)
	static int field723;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -1215132224
	)
	static int field541;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 1122595557
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = -1998907249
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = 1606323125
	)
	static int field521;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	static Archive field522;
	@ObfuscatedName("ft")
	@ObfuscatedGetter(
		intValue = -1298436933
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = -745221463
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = 2012270929
	)
	static int field525;
	@ObfuscatedName("fn")
	@ObfuscatedGetter(
		intValue = -2092618953
	)
	static int field526;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = 1576970333
	)
	static int field574;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	static class131 field528;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	static class467 field615;
	@ObfuscatedName("gb")
	static final String field652;
	@ObfuscatedName("gg")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("gi")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "[Lcc;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -1662323069
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("hp")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = 477897293
	)
	static int field550;
	@ObfuscatedName("hh")
	static int[] field551;
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		intValue = -271838389
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("hk")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("hn")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("hb")
	@ObfuscatedGetter(
		intValue = -2039747671
	)
	static int field557;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = -641396427
	)
	static int field488;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = 1492089399
	)
	static int field559;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = 140741579
	)
	static int field560;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = -2018486329
	)
	static int field582;
	@ObfuscatedName("is")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("ig")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("ip")
	static final int[] field565;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = -685292213
	)
	static int field558;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -1790452751
	)
	static int field714;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -539759793
	)
	static int field568;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 324319485
	)
	static int field569;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = 2031311111
	)
	static int field570;
	@ObfuscatedName("jy")
	static boolean field571;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = 572984807
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = -411143469
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = -1553995155
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = 1160779387
	)
	static int field575;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -23045263
	)
	static int field576;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = -669764443
	)
	static int field577;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 1685229137
	)
	static int field743;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = -902763731
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 1391744237
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = -814747039
	)
	static int field581;
	@ObfuscatedName("kf")
	@ObfuscatedGetter(
		intValue = 1837811165
	)
	static int field533;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = 1324205181
	)
	static int field583;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = 1025325869
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = 1073119475
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = -1360791435
	)
	static int field586;
	@ObfuscatedName("ko")
	static boolean field500;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = -2123783523
	)
	static int field779;
	@ObfuscatedName("ke")
	static boolean field589;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = 185612375
	)
	static int field590;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -432166909
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 1206971147
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("kk")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("kq")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("kn")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("kd")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("ky")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("ku")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("kh")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("kw")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("kc")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = 7304427
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = 16204475
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = -1063867163
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = -1568132759
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = -649478397
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = 1980937503
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = -1750345907
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("lr")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = 731352327
	)
	static int field697;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = -1905527007
	)
	static int field745;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = -430386207
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = 1384414151
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = 1815531069
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = 48329695
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("lj")
	static boolean field616;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -1660257367
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = -1045540475
	)
	static int field687;
	@ObfuscatedName("ll")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "[Lco;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = 465084021
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = -870239743
	)
	static int field778;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		longValue = -8829455432363219343L
	)
	static long field489;
	@ObfuscatedName("mi")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = 957209615
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = 1283833171
	)
	static int field626;
	@ObfuscatedName("mh")
	static int[] field627;
	@ObfuscatedName("mp")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("me")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("mt")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("ml")
	static int[] field631;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = -1327337301
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "[[[Lme;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("mm")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("mu")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("mg")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("my")
	static boolean field719;
	@ObfuscatedName("mb")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = 1625323771
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("ns")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("nt")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("nx")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("nv")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("nf")
	static int[] field647;
	@ObfuscatedName("nn")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("nm")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("nr")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("no")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("nh")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("na")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("nw")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = -1911813319
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = -863938089
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("ny")
	@ObfuscatedGetter(
		intValue = -1209442767
	)
	static int field527;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = 1859054271
	)
	static int field786;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = 1673492447
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ni")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 812539759
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = 1922635793
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("of")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("ot")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = -1500579493
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = -2123777915
	)
	static int field668;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = 274292561
	)
	static int field755;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = 502834183
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = 86492395
	)
	static int field671;
	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = 2108411369
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -1965732057
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = 2022414179
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = -1587394821
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("ou")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = 405617839
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = -570239103
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("pc")
	static boolean field684;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = -202807175
	)
	static int field603;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = -447960851
	)
	static int field686;
	@ObfuscatedName("pf")
	static boolean field640;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = 1203164655
	)
	static int field688;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = -1709613317
	)
	static int field689;
	@ObfuscatedName("pu")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = -1926854019
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pt")
	static int[] field788;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = 1048282361
	)
	static int field547;
	@ObfuscatedName("pd")
	static int[] field694;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = -1582541725
	)
	static int field695;
	@ObfuscatedName("pz")
	static int[] field696;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = -123811959
	)
	static int field599;
	@ObfuscatedName("py")
	static int[] field698;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = -1882369861
	)
	static int field699;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = -2092972535
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = 162073353
	)
	static int field701;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = -2015004537
	)
	static int field702;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = 933606785
	)
	static int field703;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = -580604401
	)
	static int field704;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = 393370855
	)
	static int field705;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = 127385867
	)
	static int field706;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = 1445910661
	)
	static int field499;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = 38044803
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	static class480 field709;
	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	static NodeDeque field711;
	@ObfuscatedName("qq")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	static NodeDeque field670;
	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	static NodeDeque field713;
	@ObfuscatedName("qb")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = 2094937951
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = -1183441329
	)
	static int field739;
	@ObfuscatedName("qr")
	static boolean[] field717;
	@ObfuscatedName("qg")
	static boolean[] field718;
	@ObfuscatedName("qm")
	static boolean[] field657;
	@ObfuscatedName("qs")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("qc")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("re")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("rv")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = -129551427
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("rj")
	@ObfuscatedGetter(
		longValue = 9133357520759350651L
	)
	static long field587;
	@ObfuscatedName("rq")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("ro")
	static int[] field727;
	@ObfuscatedName("rc")
	@ObfuscatedGetter(
		intValue = 1632968345
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		intValue = -1247476773
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("rl")
	static String field730;
	@ObfuscatedName("rg")
	static long[] field775;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = 1816562191
	)
	static int field732;
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	public static class199 field733;
	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	static class197 field734;
	@ObfuscatedName("fb")
	String field530;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	class14 field531;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	class19 field532;
	@ObfuscatedName("gl")
	@Export("otlTokenRequester")
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("gu")
	Future field534;
	@ObfuscatedName("ga")
	boolean field692;
	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	class19 field536;
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field537;
	@ObfuscatedName("gt")
	@Export("otlTokenRequest")
	Future otlTokenRequest;
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	Buffer field585;
	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "Ld;"
	)
	class7 field544;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		longValue = 6349706447758031983L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field517 = true; // L: 153
		worldId = 1; // L: 154
		worldProperties = 0; // L: 155
		gameBuild = 0; // L: 157
		isMembersWorld = false; // L: 160
		isLowDetail = false; // L: 161
		field494 = -1; // L: 166
		clientType = -1; // L: 167
		field573 = -1; // L: 168
		onMobile = false; // L: 169
		field789 = 209; // L: 170
		gameState = 0; // L: 182
		isLoading = true; // L: 206
		cycle = 0; // L: 207
		mouseLastLastPressedTimeMillis = -1L; // L: 208
		field504 = -1; // L: 210
		field630 = -1; // L: 211
		field501 = -1L; // L: 212
		hadFocus = true; // L: 213
		rebootTimer = 0; // L: 214
		hintArrowType = 0; // L: 215
		hintArrowNpcIndex = 0; // L: 216
		hintArrowPlayerIndex = 0; // L: 217
		hintArrowX = 0; // L: 218
		hintArrowY = 0; // L: 219
		field770 = 0; // L: 220
		field723 = 0; // L: 221
		field541 = 0; // L: 222
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 224
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 225
		titleLoadingStage = 0; // L: 236
		js5ConnectState = 0; // L: 239
		field521 = 0; // L: 240
		js5Errors = 0; // L: 263
		loginState = 0; // L: 265
		field525 = 0; // L: 266
		field526 = 0; // L: 267
		field574 = 0; // L: 268
		field528 = class131.field1559; // L: 269
		field615 = class467.field4923; // L: 270
		int var1 = "com_jagex_auth_desktop_osrs:public".length(); // L: 295
		byte[] var2 = new byte[var1]; // L: 296

		int var3;
		for (var3 = 0; var3 < var1; ++var3) { // L: 297
			char var10 = "com_jagex_auth_desktop_osrs:public".charAt(var3); // L: 298
			if (var10 > 127) { // L: 299
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var10; // L: 300
			}
		}

		byte[] var0 = var2; // L: 302
		var3 = var2.length; // L: 307
		StringBuilder var4 = new StringBuilder(); // L: 309

		for (int var5 = 0; var5 < var3 + 0; var5 += 3) { // L: 310
			int var6 = var0[var5] & 255; // L: 311
			var4.append(class356.field4298[var6 >>> 2]); // L: 312
			if (var5 < var3 - 1) { // L: 313
				int var7 = var0[var5 + 1] & 255; // L: 314
				var4.append(class356.field4298[(var6 & 3) << 4 | var7 >>> 4]); // L: 315
				if (var5 < var3 - 2) { // L: 316
					int var8 = var0[var5 + 2] & 255; // L: 317
					var4.append(class356.field4298[(var7 & 15) << 2 | var8 >>> 6]).append(class356.field4298[var8 & 63]); // L: 318
				} else {
					var4.append(class356.field4298[(var7 & 15) << 2]).append("="); // L: 320
				}
			} else {
				var4.append(class356.field4298[(var6 & 3) << 4]).append("=="); // L: 322
			}
		}

		String var11 = var4.toString(); // L: 324
		field652 = var11; // L: 328
		Login_isUsernameRemembered = false; // L: 337
		secureRandomFuture = new SecureRandomFuture(); // L: 338
		randomDatData = null; // L: 344
		npcs = new NPC[65536]; // L: 348
		npcCount = 0; // L: 349
		npcIndices = new int[65536]; // L: 350
		field550 = 0; // L: 351
		field551 = new int[250]; // L: 352
		packetWriter = new PacketWriter(); // L: 355
		logoutTimer = 0; // L: 357
		hadNetworkError = false; // L: 358
		timer = new Timer(); // L: 359
		fontsMap = new HashMap(); // L: 365
		field557 = 0; // L: 372
		field488 = 1; // L: 373
		field559 = 0; // L: 374
		field560 = 1; // L: 375
		field582 = 0; // L: 376
		collisionMaps = new CollisionMap[4]; // L: 384
		isInInstance = false; // L: 385
		instanceChunkTemplates = new int[4][13][13]; // L: 386
		field565 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 387
		field558 = 0; // L: 390
		field714 = 2301979; // L: 402
		field568 = 5063219; // L: 403
		field569 = 3353893; // L: 404
		field570 = 7759444; // L: 405
		field571 = false; // L: 406
		alternativeScrollbarWidth = 0; // L: 407
		camAngleX = 128; // L: 415
		camAngleY = 0; // L: 416
		field575 = 0; // L: 417
		field576 = 0; // L: 418
		field577 = 0; // L: 419
		field743 = 0; // L: 420
		oculusOrbState = 0; // L: 421
		camFollowHeight = 50; // L: 422
		field581 = 0; // L: 426
		field533 = 0; // L: 427
		field583 = 0; // L: 428
		oculusOrbNormalSpeed = 12; // L: 430
		oculusOrbSlowedSpeed = 6; // L: 431
		field586 = 0; // L: 432
		field500 = false; // L: 433
		field779 = 0; // L: 434
		field589 = false; // L: 435
		field590 = 0; // L: 436
		overheadTextCount = 0; // L: 437
		overheadTextLimit = 50; // L: 438
		overheadTextXs = new int[overheadTextLimit]; // L: 439
		overheadTextYs = new int[overheadTextLimit]; // L: 440
		overheadTextAscents = new int[overheadTextLimit]; // L: 441
		overheadTextXOffsets = new int[overheadTextLimit]; // L: 442
		overheadTextColors = new int[overheadTextLimit]; // L: 443
		overheadTextEffects = new int[overheadTextLimit]; // L: 444
		overheadTextCyclesRemaining = new int[overheadTextLimit]; // L: 445
		overheadText = new String[overheadTextLimit]; // L: 446
		tileLastDrawnActor = new int[104][104]; // L: 447
		viewportDrawCount = 0; // L: 448
		viewportTempX = -1; // L: 449
		viewportTempY = -1; // L: 450
		mouseCrossX = 0; // L: 451
		mouseCrossY = 0; // L: 452
		mouseCrossState = 0; // L: 453
		mouseCrossColor = 0; // L: 454
		showMouseCross = true; // L: 455
		field697 = 0; // L: 457
		field745 = 0; // L: 458
		dragItemSlotSource = 0; // L: 461
		draggedWidgetX = 0; // L: 462
		draggedWidgetY = 0; // L: 463
		dragItemSlotDestination = 0; // L: 464
		field616 = false; // L: 465
		itemDragDuration = 0; // L: 466
		field687 = 0; // L: 467
		showLoadingMessages = true; // L: 469
		players = new Player[2048]; // L: 471
		localPlayerIndex = -1; // L: 473
		field778 = 0; // L: 474
		field489 = -1L; // L: 475
		renderSelf = true; // L: 477
		drawPlayerNames = 0; // L: 482
		field626 = 0; // L: 483
		field627 = new int[1000]; // L: 484
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 486
		playerMenuActions = new String[8]; // L: 487
		playerOptionsPriorities = new boolean[8]; // L: 488
		field631 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 489
		combatTargetPlayerIndex = -1; // L: 490
		groundItems = new NodeDeque[4][104][104]; // L: 491
		pendingSpawns = new NodeDeque(); // L: 492
		projectiles = new NodeDeque(); // L: 493
		graphicsObjects = new NodeDeque(); // L: 494
		currentLevels = new int[25]; // L: 495
		levels = new int[25]; // L: 496
		experience = new int[25]; // L: 497
		field719 = false; // L: 498
		isMenuOpen = false; // L: 499
		menuOptionsCount = 0; // L: 505
		menuArguments1 = new int[500]; // L: 506
		menuArguments2 = new int[500]; // L: 507
		menuOpcodes = new int[500]; // L: 508
		menuIdentifiers = new int[500]; // L: 509
		field647 = new int[500]; // L: 510
		menuActions = new String[500]; // L: 511
		menuTargets = new String[500]; // L: 512
		menuShiftClick = new boolean[500]; // L: 513
		followerOpsLowPriority = false; // L: 514
		shiftClickDrop = false; // L: 516
		tapToDrop = false; // L: 517
		showMouseOverText = true; // L: 518
		viewportX = -1; // L: 519
		viewportY = -1; // L: 520
		field527 = 0; // L: 524
		field786 = 50; // L: 525
		isItemSelected = 0; // L: 526
		selectedItemName = null; // L: 530
		isSpellSelected = false; // L: 531
		selectedSpellChildIndex = -1; // L: 533
		selectedSpellItemId = -1; // L: 534
		selectedSpellActionName = null; // L: 536
		selectedSpellName = null; // L: 537
		rootInterface = -1; // L: 538
		interfaceParents = new NodeHashTable(8); // L: 539
		field668 = 0; // L: 544
		field755 = -1; // L: 545
		chatEffects = 0; // L: 546
		field671 = 0; // L: 547
		meslayerContinueWidget = null; // L: 548
		runEnergy = 0; // L: 549
		weight = 0; // L: 550
		staffModLevel = 0; // L: 551
		followerIndex = -1; // L: 552
		playerMod = false; // L: 553
		viewportWidget = null; // L: 554
		clickedWidget = null; // L: 555
		clickedWidgetParent = null; // L: 556
		widgetClickX = 0; // L: 557
		widgetClickY = 0; // L: 558
		draggedOnWidget = null; // L: 559
		field684 = false; // L: 560
		field603 = -1; // L: 561
		field686 = -1; // L: 562
		field640 = false; // L: 563
		field688 = -1; // L: 564
		field689 = -1; // L: 565
		isDraggingWidget = false; // L: 566
		cycleCntr = 1; // L: 571
		field788 = new int[32]; // L: 574
		field547 = 0; // L: 575
		field694 = new int[32]; // L: 576
		field695 = 0; // L: 577
		field696 = new int[32]; // L: 578
		field599 = 0; // L: 579
		field698 = new int[32]; // L: 580
		field699 = 0; // L: 581
		chatCycle = 0; // L: 582
		field701 = 0; // L: 583
		field702 = 0; // L: 584
		field703 = 0; // L: 585
		field704 = 0; // L: 586
		field705 = 0; // L: 587
		field706 = 0; // L: 588
		field499 = 0; // L: 589
		mouseWheelRotation = 0; // L: 595
		field709 = new class480(); // L: 596
		scriptEvents = new NodeDeque(); // L: 597
		field711 = new NodeDeque(); // L: 598
		field670 = new NodeDeque(); // L: 599
		field713 = new NodeDeque(); // L: 600
		widgetFlags = new NodeHashTable(512); // L: 601
		rootWidgetCount = 0; // L: 603
		field739 = -2; // L: 604
		field717 = new boolean[100]; // L: 605
		field718 = new boolean[100]; // L: 606
		field657 = new boolean[100]; // L: 607
		rootWidgetXs = new int[100]; // L: 608
		rootWidgetYs = new int[100]; // L: 609
		rootWidgetWidths = new int[100]; // L: 610
		rootWidgetHeights = new int[100]; // L: 611
		gameDrawingMode = 0; // L: 612
		field587 = 0L; // L: 613
		isResizable = true; // L: 614
		field727 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 621
		publicChatMode = 0; // L: 622
		tradeChatMode = 0; // L: 624
		field730 = ""; // L: 625
		field775 = new long[100]; // L: 627
		field732 = 0; // L: 628
		field733 = new class199(); // L: 629
		field734 = new class197(); // L: 630
		field679 = 0; // L: 632
		field613 = new int[128]; // L: 633
		field737 = new int[128]; // L: 634
		field738 = -1L; // L: 635
		currentClanSettings = new ClanSettings[4]; // L: 639
		currentClanChannels = new ClanChannel[4]; // L: 641
		field519 = -1; // L: 643
		mapIconCount = 0; // L: 644
		field691 = new int[1000]; // L: 645
		field744 = new int[1000]; // L: 646
		mapIcons = new SpritePixels[1000]; // L: 647
		destinationX = 0; // L: 648
		destinationY = 0; // L: 649
		minimapState = 0; // L: 656
		currentTrackGroupId = -1; // L: 657
		playingJingle = false; // L: 658
		soundEffectCount = 0; // L: 664
		soundEffectIds = new int[50]; // L: 665
		queuedSoundEffectLoops = new int[50]; // L: 666
		queuedSoundEffectDelays = new int[50]; // L: 667
		soundLocations = new int[50]; // L: 668
		soundEffects = new SoundEffect[50]; // L: 669
		isCameraLocked = false; // L: 671
		field758 = false; // L: 682
		field556 = new boolean[5]; // L: 690
		field760 = new int[5]; // L: 691
		field665 = new int[5]; // L: 692
		field762 = new int[5]; // L: 693
		field763 = new int[5]; // L: 694
		field764 = 256; // L: 695
		field649 = 205; // L: 696
		zoomHeight = 256; // L: 697
		zoomWidth = 320; // L: 698
		field601 = 1; // L: 699
		field769 = 32767; // L: 700
		field562 = 1; // L: 701
		field771 = 32767; // L: 702
		viewportOffsetX = 0; // L: 703
		viewportOffsetY = 0; // L: 704
		viewportWidth = 0; // L: 705
		viewportHeight = 0; // L: 706
		viewportZoom = 0; // L: 707
		playerAppearance = new PlayerComposition(); // L: 709
		field539 = -1; // L: 710
		field543 = -1; // L: 711
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 713
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 715
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 718
		Widget_cachedModels = new EvictingDualNodeHashTable(64); // L: 720
		Widget_cachedFonts = new EvictingDualNodeHashTable(64); // L: 721
		field785 = -1; // L: 724
		field793 = -1; // L: 730
		archiveLoaders = new ArrayList(10); // L: 731
		archiveLoadersDone = 0; // L: 732
		field588 = 0; // L: 733
		field790 = new ApproximateRouteStrategy(); // L: 742
		field693 = new int[50]; // L: 743
		field792 = new int[50]; // L: 744
	}

	public Client() {
		this.field692 = false; // L: 286
		this.accountHash = -1L;
	} // L: 343

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1490185666"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field587 = UserComparator8.method2748() + 500L; // L: 4464
		this.resizeJS(); // L: 4465
		if (rootInterface != -1) { // L: 4466
			this.resizeRoot(true);
		}

	} // L: 4467

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1983760905"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000}; // L: 1048
		int[] var2 = new int[]{1000, 100, 500}; // L: 1049
		if (var1 != null && var2 != null) { // L: 1051
			WallObject.ByteArrayPool_alternativeSizes = var1; // L: 1058
			class239.ByteArrayPool_altSizeArrayCounts = new int[var1.length]; // L: 1059
			class357.ByteArrayPool_arrays = new byte[var1.length][][]; // L: 1060

			for (int var3 = 0; var3 < WallObject.ByteArrayPool_alternativeSizes.length; ++var3) { // L: 1061
				class357.ByteArrayPool_arrays[var3] = new byte[var2[var3]][]; // L: 1062
				ByteArrayPool.field4393.add(var1[var3]); // L: 1063
			}

			Collections.sort(ByteArrayPool.field4393); // L: 1065
		} else {
			WallObject.ByteArrayPool_alternativeSizes = null; // L: 1052
			class239.ByteArrayPool_altSizeArrayCounts = null; // L: 1053
			class357.ByteArrayPool_arrays = null; // L: 1054
			Skills.method6245(); // L: 1055
		}

		class159.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 1067
		class131.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 1068
		class454.currentPort = class159.worldPort; // L: 1069
		TaskHandler.field1780 = class301.field3463; // L: 1070
		class34.field193 = class301.field3465; // L: 1071
		class21.field114 = class301.field3462; // L: 1072
		ArchiveLoader.field1016 = class301.field3464; // L: 1073
		PcmPlayer.urlRequester = new class108(this.field692, 209); // L: 1074
		this.setUpKeyboard(); // L: 1075
		this.method514(); // L: 1076
		class9.mouseWheel = this.mouseWheel(); // L: 1077
		this.method513(field734, 0); // L: 1078
		this.method513(field733, 1); // L: 1079
		GameObject.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1080
		AccessFile var4 = null; // L: 1083
		ClientPreferences var5 = new ClientPreferences(); // L: 1084

		try {
			var4 = class156.getPreferencesFile("", class376.field4411.name, false); // L: 1086
			byte[] var6 = new byte[(int)var4.length()]; // L: 1087

			int var8;
			for (int var7 = 0; var7 < var6.length; var7 += var8) { // L: 1088 1089 1092
				var8 = var4.read(var6, var7, var6.length - var7); // L: 1090
				if (var8 == -1) { // L: 1091
					throw new IOException();
				}
			}

			var5 = new ClientPreferences(new Buffer(var6)); // L: 1094
		} catch (Exception var11) { // L: 1096
		}

		try {
			if (var4 != null) { // L: 1098
				var4.close();
			}
		} catch (Exception var10) { // L: 1100
		}

		BufferedSink.clientPreferences = var5; // L: 1103
		this.setUpClipboard(); // L: 1104
		HealthBarUpdate.method2341(this, AttackOption.field1294); // L: 1105
		class167.setWindowedMode(BufferedSink.clientPreferences.method2401()); // L: 1106
		DecorativeObject.friendSystem = new FriendSystem(ViewportMouse.loginType); // L: 1107
		this.field531 = new class14("tokenRequest", 1, 1); // L: 1108
	} // L: 1109

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1176871177"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 1113
		this.doCycleJs5(); // L: 1114
		WorldMapManager.method4967(); // L: 1115
		KitDefinition.method3476(); // L: 1116
		class355.playPcmPlayers(); // L: 1117
		field733.method3954(); // L: 1118
		this.method603(); // L: 1119
		WorldMapSection0.method5106(); // L: 1120
		if (class9.mouseWheel != null) { // L: 1121
			int var1 = class9.mouseWheel.useRotation(); // L: 1122
			mouseWheelRotation = var1; // L: 1123
		}

		if (gameState == 0) { // L: 1125
			class28.load(); // L: 1126
			class354.method6768(); // L: 1127
		} else if (gameState == 5) { // L: 1129
			FontName.loginScreen(this, Language.fontPlain12); // L: 1130
			class28.load(); // L: 1131
			class354.method6768(); // L: 1132
		} else if (gameState != 10 && gameState != 11) { // L: 1134
			if (gameState == 20) { // L: 1135
				FontName.loginScreen(this, Language.fontPlain12); // L: 1136
				this.doCycleLoggedOut(); // L: 1137
			} else if (gameState == 50) { // L: 1139
				FontName.loginScreen(this, Language.fontPlain12); // L: 1140
				this.doCycleLoggedOut(); // L: 1141
			} else if (gameState == 25) { // L: 1143
				ReflectionCheck.method714();
			}
		} else {
			FontName.loginScreen(this, Language.fontPlain12);
		}

		if (gameState == 30) { // L: 1144
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) { // L: 1145
			this.doCycleLoggedOut();
		}

	} // L: 1146

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1054189604"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label170: {
			try {
				if (class283.musicPlayerStatus == 2) { // L: 1153
					if (class131.musicTrack == null) { // L: 1154
						class131.musicTrack = MusicTrack.readTrack(DevicePcmPlayerProvider.musicTrackArchive, class283.musicTrackGroupId, class283.musicTrackFileId); // L: 1155
						if (class131.musicTrack == null) { // L: 1156
							var2 = false; // L: 1157
							break label170;
						}
					}

					if (class371.soundCache == null) { // L: 1161
						class371.soundCache = new SoundCache(class283.soundEffectsArchive, class283.musicSamplesArchive);
					}

					if (class283.midiPcmStream.loadMusicTrack(class131.musicTrack, class283.musicPatchesArchive, class371.soundCache, 22050)) { // L: 1162
						class283.midiPcmStream.clearAll(); // L: 1163
						class283.midiPcmStream.setPcmStreamVolume(Messages.musicTrackVolume); // L: 1164
						class283.midiPcmStream.setMusicTrack(class131.musicTrack, GrandExchangeEvents.musicTrackBoolean); // L: 1165
						class283.musicPlayerStatus = 0; // L: 1166
						class131.musicTrack = null; // L: 1167
						class371.soundCache = null; // L: 1168
						DevicePcmPlayerProvider.musicTrackArchive = null; // L: 1169
						var2 = true; // L: 1170
						break label170;
					}
				}
			} catch (Exception var6) { // L: 1175
				var6.printStackTrace(); // L: 1176
				class283.midiPcmStream.clear(); // L: 1177
				class283.musicPlayerStatus = 0; // L: 1178
				class131.musicTrack = null; // L: 1179
				class371.soundCache = null; // L: 1180
				DevicePcmPlayerProvider.musicTrackArchive = null; // L: 1181
			}

			var2 = false; // L: 1183
		}

		if (var2 && playingJingle && HealthBar.pcmPlayer0 != null) { // L: 1186 1187
			HealthBar.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field587 && UserComparator8.method2748() > field587) { // L: 1189 1190
			class167.setWindowedMode(class13.getWindowedMode()); // L: 1191
		}

		int var4;
		if (var1) { // L: 1194
			for (var4 = 0; var4 < 100; ++var4) { // L: 1195
				field717[var4] = true;
			}
		}

		if (gameState == 0) { // L: 1197
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1198
			UrlRequest.drawTitle(UserComparator3.fontBold12, ModeWhere.fontPlain11, Language.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1199
			if (gameState == 20) { // L: 1200
				UrlRequest.drawTitle(UserComparator3.fontBold12, ModeWhere.fontPlain11, Language.fontPlain12);
			} else if (gameState == 50) { // L: 1201
				UrlRequest.drawTitle(UserComparator3.fontBold12, ModeWhere.fontPlain11, Language.fontPlain12);
			} else if (gameState == 25) { // L: 1202
				if (field582 == 1) { // L: 1203
					if (field557 > field488) { // L: 1204
						field488 = field557;
					}

					var4 = (field488 * 50 - field557 * 50) / field488; // L: 1205
					class145.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1206
				} else if (field582 == 2) { // L: 1208
					if (field559 > field560) { // L: 1209
						field560 = field559;
					}

					var4 = (field560 * 50 - field559 * 50) / field560 + 50; // L: 1210
					class145.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1211
				} else {
					class145.drawLoadingMessage("Loading - please wait.", false); // L: 1213
				}
			} else if (gameState == 30) { // L: 1215
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1216
				class145.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1217
				class145.drawLoadingMessage("Please wait...", false);
			}
		} else {
			UrlRequest.drawTitle(UserComparator3.fontBold12, ModeWhere.fontPlain11, Language.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1218
			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1219
				if (field718[var4]) { // L: 1220
					class1.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]); // L: 1221
					field718[var4] = false; // L: 1222
				}
			}
		} else if (gameState > 0) { // L: 1226
			class1.rasterProvider.drawFull(0, 0); // L: 1227

			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1228
				field718[var4] = false;
			}
		}

	} // L: 1230

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-5165"
	)
	@Export("kill0")
	protected final void kill0() {
		if (Projectile.varcs.hasUnwrittenChanges()) { // L: 1233
			Projectile.varcs.write();
		}

		if (GrandExchangeOfferOwnWorldComparator.mouseRecorder != null) { // L: 1234
			GrandExchangeOfferOwnWorldComparator.mouseRecorder.isRunning = false;
		}

		GrandExchangeOfferOwnWorldComparator.mouseRecorder = null; // L: 1235
		packetWriter.close(); // L: 1236
		MenuAction.method2021(); // L: 1237
		class9.mouseWheel = null; // L: 1238
		if (HealthBar.pcmPlayer0 != null) { // L: 1239
			HealthBar.pcmPlayer0.shutdown();
		}

		if (class86.pcmPlayer1 != null) { // L: 1240
			class86.pcmPlayer1.shutdown();
		}

		class313.method6246(); // L: 1241
		StructComposition.method3676(); // L: 1242
		if (PcmPlayer.urlRequester != null) { // L: 1243
			PcmPlayer.urlRequester.close(); // L: 1244
			PcmPlayer.urlRequester = null; // L: 1245
		}

		FriendSystem.method1845(); // L: 1247
		this.field531.method173(); // L: 1248
	} // L: 1249

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1478842545"
	)
	protected final void vmethod1485() {
	} // L: 751

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "67"
	)
	boolean method1184() {
		return class298.field3418 != null && !class298.field3418.trim().isEmpty() && SpriteMask.field3386 != null && !SpriteMask.field3386.trim().isEmpty(); // L: 993
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1550081441"
	)
	@Export("isOtlTokenRequesterInitialized")
	boolean isOtlTokenRequesterInitialized() {
		return this.otlTokenRequester != null; // L: 997
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2079292800"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 1001
		var2.put("grant_type", "refresh_token"); // L: 1002
		var2.put("scope", "gamesso.token.create"); // L: 1003
		var2.put("refresh_token", var1); // L: 1004
		URL var3 = new URL(class124.field1482 + "shield/oauth/token" + (new class420(var2)).method7798()); // L: 1005
		HashMap var4 = new HashMap(); // L: 1006
		var4.put("Authorization", "Basic " + field652); // L: 1007
		var4.put("Host", (new URL(class124.field1482)).getHost()); // L: 1008
		var4.put("Accept", class417.field4602.method7779()); // L: 1009
		class9 var5 = class9.field42; // L: 1010
		RefreshAccessTokenRequester var6 = this.field537; // L: 1011
		if (var6 != null) { // L: 1012
			this.otlTokenRequest = var6.request(var5.method70(), var3, var4, ""); // L: 1013
		} else {
			class10 var7 = new class10(var3, var5, this.field692); // L: 1016
			Iterator var8 = var4.entrySet().iterator(); // L: 1017

			while (var8.hasNext()) {
				Entry var9 = (Entry)var8.next(); // L: 1018
				var7.method79((String)var9.getKey(), (String)var9.getValue()); // L: 1020
			}

			this.field536 = this.field531.method174(var7); // L: 1023
		}
	} // L: 1014 1024

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1400074559"
	)
	void method1187(String var1) throws MalformedURLException, IOException {
		URL var2 = new URL(class124.field1482 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 1027
		HashMap var3 = new HashMap(); // L: 1028
		var3.put("Authorization", "Bearer " + var1); // L: 1029
		class9 var4 = class9.field39; // L: 1030
		OtlTokenRequester var5 = this.otlTokenRequester; // L: 1031
		if (var5 != null) { // L: 1032
			this.field534 = var5.request(var4.method70(), var2, var3, ""); // L: 1033
		} else {
			class10 var6 = new class10(var2, var4, this.field692); // L: 1036
			Iterator var7 = var3.entrySet().iterator(); // L: 1037

			while (var7.hasNext()) {
				Entry var8 = (Entry)var7.next(); // L: 1038
				var6.method79((String)var8.getKey(), (String)var8.getValue()); // L: 1040
			}

			this.field532 = this.field531.method174(var6); // L: 1043
		}
	} // L: 1034 1044

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-52"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1301
			long var2 = UserComparator8.method2748(); // L: 1304
			int var4 = (int)(var2 - DirectByteArrayCopier.field3653); // L: 1305
			DirectByteArrayCopier.field3653 = var2; // L: 1306
			if (var4 > 200) { // L: 1307
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4; // L: 1308
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) { // L: 1309
				var1 = true; // L: 1310
			} else if (NetCache.NetCache_socket == null) { // L: 1313
				var1 = false; // L: 1314
			} else {
				try {
					label246: {
						if (NetCache.NetCache_loadTime > 30000) { // L: 1318
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) { // L: 1319
							var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first(); // L: 1320
							var6 = new Buffer(4); // L: 1321
							var6.writeByte(1); // L: 1322
							var6.writeMedium((int)var5.key); // L: 1323
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1324
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key); // L: 1325
							--NetCache.NetCache_pendingPriorityWritesCount; // L: 1326
							++NetCache.NetCache_pendingPriorityResponsesCount; // L: 1327
						}

						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) { // L: 1329
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast(); // L: 1330
							var6 = new Buffer(4); // L: 1331
							var6.writeByte(0); // L: 1332
							var6.writeMedium((int)var5.key); // L: 1333
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1334
							var5.removeDual(); // L: 1335
							NetCache.NetCache_pendingResponses.put(var5, var5.key); // L: 1336
							--NetCache.NetCache_pendingWritesCount; // L: 1337
							++NetCache.NetCache_pendingResponsesCount; // L: 1338
						}

						for (int var17 = 0; var17 < 100; ++var17) { // L: 1340
							int var18 = NetCache.NetCache_socket.available(); // L: 1341
							if (var18 < 0) { // L: 1342
								throw new IOException();
							}

							if (var18 == 0) { // L: 1343
								break;
							}

							NetCache.NetCache_loadTime = 0; // L: 1344
							byte var7 = 0; // L: 1345
							if (UserComparator6.NetCache_currentResponse == null) { // L: 1346
								var7 = 8;
							} else if (NetCache.field4178 == 0) { // L: 1347
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							int var12;
							byte[] var10000;
							int var10001;
							Buffer var25;
							if (var7 > 0) { // L: 1348
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset; // L: 1349
								if (var8 > var18) { // L: 1350
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8); // L: 1351
								if (NetCache.field4180 != 0) { // L: 1352
									for (var9 = 0; var9 < var8; ++var9) { // L: 1353
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field4180;
									}
								}

								var25 = NetCache.NetCache_responseHeaderBuffer; // L: 1355
								var25.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) { // L: 1356
									break;
								}

								if (UserComparator6.NetCache_currentResponse == null) { // L: 1357
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1358
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1359
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 1360
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1361
									var12 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 1362
									long var13 = (long)(var10 + (var9 << 16)); // L: 1363
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13); // L: 1364
									UserComparator10.field1425 = true; // L: 1365
									if (var15 == null) { // L: 1366
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13); // L: 1367
										UserComparator10.field1425 = false; // L: 1368
									}

									if (var15 == null) { // L: 1370
										throw new IOException(); // L: 1371
									}

									int var16 = var11 == 0 ? 5 : 9; // L: 1373
									UserComparator6.NetCache_currentResponse = var15; // L: 1374
									class420.NetCache_responseArchiveBuffer = new Buffer(var12 + var16 + UserComparator6.NetCache_currentResponse.padding); // L: 1375
									class420.NetCache_responseArchiveBuffer.writeByte(var11); // L: 1376
									class420.NetCache_responseArchiveBuffer.writeInt(var12); // L: 1377
									NetCache.field4178 = 8; // L: 1378
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1379
								} else if (NetCache.field4178 == 0) { // L: 1382
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 1383
										NetCache.field4178 = 1; // L: 1384
										NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1385
									} else {
										UserComparator6.NetCache_currentResponse = null; // L: 1389
									}
								}
							} else {
								var8 = class420.NetCache_responseArchiveBuffer.array.length - UserComparator6.NetCache_currentResponse.padding; // L: 1395
								var9 = 512 - NetCache.field4178; // L: 1396
								if (var9 > var8 - class420.NetCache_responseArchiveBuffer.offset) { // L: 1397
									var9 = var8 - class420.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) { // L: 1398
									var9 = var18;
								}

								NetCache.NetCache_socket.read(class420.NetCache_responseArchiveBuffer.array, class420.NetCache_responseArchiveBuffer.offset, var9); // L: 1399
								if (NetCache.field4180 != 0) { // L: 1400
									for (var10 = 0; var10 < var9; ++var10) { // L: 1401
										var10000 = class420.NetCache_responseArchiveBuffer.array;
										var10001 = var10 + class420.NetCache_responseArchiveBuffer.offset;
										var10000[var10001] ^= NetCache.field4180;
									}
								}

								var25 = class420.NetCache_responseArchiveBuffer; // L: 1403
								var25.offset += var9;
								NetCache.field4178 += var9; // L: 1404
								if (var8 == class420.NetCache_responseArchiveBuffer.offset) { // L: 1405
									if (16711935L == UserComparator6.NetCache_currentResponse.key) { // L: 1406
										Messages.field1361 = class420.NetCache_responseArchiveBuffer; // L: 1407

										for (var10 = 0; var10 < 256; ++var10) { // L: 1408
											Archive var19 = NetCache.NetCache_archives[var10]; // L: 1409
											if (var19 != null) { // L: 1410
												Messages.field1361.offset = var10 * 8 + 5; // L: 1412
												if (Messages.field1361.offset >= Messages.field1361.array.length) { // L: 1413
													if (!var19.field4140) { // L: 1414
														throw new RuntimeException(""); // L: 1418
													}

													var19.method6306(); // L: 1415
												} else {
													var12 = Messages.field1361.readInt(); // L: 1420
													int var20 = Messages.field1361.readInt(); // L: 1421
													var19.loadIndex(var12, var20); // L: 1422
												}
											}
										}
									} else {
										NetCache.NetCache_crc.reset(); // L: 1428
										NetCache.NetCache_crc.update(class420.NetCache_responseArchiveBuffer.array, 0, var8); // L: 1429
										var10 = (int)NetCache.NetCache_crc.getValue(); // L: 1430
										if (var10 != UserComparator6.NetCache_currentResponse.crc) { // L: 1431
											try {
												NetCache.NetCache_socket.close(); // L: 1433
											} catch (Exception var23) { // L: 1435
											}

											++NetCache.NetCache_crcMismatches; // L: 1436
											NetCache.NetCache_socket = null; // L: 1437
											NetCache.field4180 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 1438
											var1 = false; // L: 1439
											break label246;
										}

										NetCache.NetCache_crcMismatches = 0; // L: 1442
										NetCache.NetCache_ioExceptions = 0; // L: 1443
										UserComparator6.NetCache_currentResponse.archive.write((int)(UserComparator6.NetCache_currentResponse.key & 65535L), class420.NetCache_responseArchiveBuffer.array, 16711680L == (UserComparator6.NetCache_currentResponse.key & 16711680L), UserComparator10.field1425); // L: 1444
									}

									UserComparator6.NetCache_currentResponse.remove(); // L: 1446
									if (UserComparator10.field1425) { // L: 1447
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount; // L: 1448
									}

									NetCache.field4178 = 0; // L: 1449
									UserComparator6.NetCache_currentResponse = null; // L: 1450
									class420.NetCache_responseArchiveBuffer = null; // L: 1451
								} else {
									if (NetCache.field4178 != 512) { // L: 1453
										break;
									}

									NetCache.field4178 = 0;
								}
							}
						}

						var1 = true; // L: 1457
					}
				} catch (IOException var24) {
					try {
						NetCache.NetCache_socket.close(); // L: 1461
					} catch (Exception var22) { // L: 1463
					}

					++NetCache.NetCache_ioExceptions; // L: 1464
					NetCache.NetCache_socket = null; // L: 1465
					var1 = false; // L: 1466
				}
			}

			if (!var1) { // L: 1470
				this.doCycleJs5Connect();
			}

		}
	} // L: 1471

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "4032"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1474
			this.error("js5crc"); // L: 1475
			class21.method305(1000); // L: 1476
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1479
				if (gameState <= 5) { // L: 1480
					this.error("js5io"); // L: 1481
					class21.method305(1000); // L: 1482
					return; // L: 1483
				}

				field521 = 3000; // L: 1486
				NetCache.NetCache_ioExceptions = 3; // L: 1487
			}

			if (--field521 + 1 <= 0) { // L: 1490
				try {
					if (js5ConnectState == 0) { // L: 1492
						GrandExchangeOffer.js5SocketTask = GameEngine.taskHandler.newSocketTask(class273.worldHost, class454.currentPort); // L: 1493
						++js5ConnectState; // L: 1494
					}

					if (js5ConnectState == 1) { // L: 1496
						if (GrandExchangeOffer.js5SocketTask.status == 2) { // L: 1497
							this.js5Error(-1); // L: 1498
							return; // L: 1499
						}

						if (GrandExchangeOffer.js5SocketTask.status == 1) { // L: 1501
							++js5ConnectState;
						}
					}

					Buffer var3;
					if (js5ConnectState == 2) { // L: 1503
						Socket var2 = (Socket)GrandExchangeOffer.js5SocketTask.result; // L: 1505
						BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000); // L: 1507
						class297.js5Socket = var1; // L: 1509
						var3 = new Buffer(5); // L: 1510
						var3.writeByte(15); // L: 1511
						var3.writeInt(209); // L: 1512
						class297.js5Socket.write(var3.array, 0, 5); // L: 1513
						++js5ConnectState; // L: 1514
						Frames.field2530 = UserComparator8.method2748(); // L: 1515
					}

					if (js5ConnectState == 3) { // L: 1517
						if (class297.js5Socket.available() > 0) { // L: 1518
							int var5 = class297.js5Socket.readUnsignedByte(); // L: 1519
							if (var5 != 0) { // L: 1520
								this.js5Error(var5); // L: 1521
								return; // L: 1522
							}

							++js5ConnectState; // L: 1524
						} else if (UserComparator8.method2748() - Frames.field2530 > 30000L) { // L: 1527
							this.js5Error(-2); // L: 1528
							return; // L: 1529
						}
					}

					if (js5ConnectState == 4) { // L: 1533
						AbstractSocket var11 = class297.js5Socket; // L: 1534
						boolean var6 = gameState > 20; // L: 1535
						if (NetCache.NetCache_socket != null) { // L: 1537
							try {
								NetCache.NetCache_socket.close(); // L: 1539
							} catch (Exception var9) { // L: 1541
							}

							NetCache.NetCache_socket = null; // L: 1542
						}

						NetCache.NetCache_socket = var11; // L: 1544
						MouseHandler.method697(var6); // L: 1545
						NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1546
						UserComparator6.NetCache_currentResponse = null; // L: 1547
						class420.NetCache_responseArchiveBuffer = null; // L: 1548
						NetCache.field4178 = 0; // L: 1549

						while (true) {
							NetFileRequest var12 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 1551
							if (var12 == null) { // L: 1552
								while (true) {
									var12 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 1558
									if (var12 == null) { // L: 1559
										if (NetCache.field4180 != 0) { // L: 1565
											try {
												var3 = new Buffer(4); // L: 1567
												var3.writeByte(4); // L: 1568
												var3.writeByte(NetCache.field4180); // L: 1569
												var3.writeShort(0); // L: 1570
												NetCache.NetCache_socket.write(var3.array, 0, 4); // L: 1571
											} catch (IOException var8) {
												try {
													NetCache.NetCache_socket.close(); // L: 1575
												} catch (Exception var7) { // L: 1577
												}

												++NetCache.NetCache_ioExceptions; // L: 1578
												NetCache.NetCache_socket = null; // L: 1579
											}
										}

										NetCache.NetCache_loadTime = 0; // L: 1582
										DirectByteArrayCopier.field3653 = UserComparator8.method2748(); // L: 1583
										GrandExchangeOffer.js5SocketTask = null; // L: 1585
										class297.js5Socket = null; // L: 1586
										js5ConnectState = 0; // L: 1587
										js5Errors = 0; // L: 1588
										return; // L: 1594
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var12); // L: 1560
									NetCache.NetCache_pendingWrites.put(var12, var12.key); // L: 1561
									++NetCache.NetCache_pendingWritesCount; // L: 1562
									--NetCache.NetCache_pendingResponsesCount; // L: 1563
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var12, var12.key); // L: 1553
							++NetCache.NetCache_pendingPriorityWritesCount; // L: 1554
							--NetCache.NetCache_pendingPriorityResponsesCount; // L: 1555
						}
					}
				} catch (IOException var10) { // L: 1591
					this.js5Error(-3); // L: 1592
				}

			}
		}
	} // L: 1477

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1260239396"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		GrandExchangeOffer.js5SocketTask = null; // L: 1597
		class297.js5Socket = null; // L: 1598
		js5ConnectState = 0; // L: 1599
		if (class159.worldPort == class454.currentPort) { // L: 1600
			class454.currentPort = class131.js5Port;
		} else {
			class454.currentPort = class159.worldPort; // L: 1601
		}

		++js5Errors; // L: 1602
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1603
			if (gameState <= 5) { // L: 1604
				this.error("js5connect_full"); // L: 1605
				class21.method305(1000); // L: 1606
			} else {
				field521 = 3000; // L: 1608
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1610
			this.error("js5connect_outofdate"); // L: 1611
			class21.method305(1000); // L: 1612
		} else if (js5Errors >= 4) { // L: 1614
			if (gameState <= 5) { // L: 1615
				this.error("js5connect"); // L: 1616
				class21.method305(1000); // L: 1617
			} else {
				field521 = 3000; // L: 1619
			}
		}

	} // L: 1621

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2134752646"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 2089
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 2090

		try {
			if (loginState == 0) { // L: 2092
				if (ClanChannel.secureRandom == null && (secureRandomFuture.isDone() || field525 > 250)) { // L: 2093
					ClanChannel.secureRandom = secureRandomFuture.get(); // L: 2094
					secureRandomFuture.shutdown(); // L: 2095
					secureRandomFuture = null; // L: 2096
				}

				if (ClanChannel.secureRandom != null) { // L: 2098
					if (var1 != null) { // L: 2099
						((AbstractSocket)var1).close(); // L: 2100
						var1 = null; // L: 2101
					}

					VertexNormal.socketTask = null; // L: 2103
					hadNetworkError = false; // L: 2104
					field525 = 0; // L: 2105
					if (field615.method8675()) { // L: 2106
						try {
							this.requestOtlToken(SpriteMask.field3386); // L: 2108
							ReflectionCheck.method713(21); // L: 2109
						} catch (Throwable var25) { // L: 2111
							class421.RunException_sendStackTrace((String)null, var25); // L: 2112
							class129.getLoginError(65); // L: 2113
							return; // L: 2114
						}
					} else {
						ReflectionCheck.method713(1); // L: 2118
					}
				}
			}

			class21 var27;
			if (loginState == 21) { // L: 2122
				if (this.otlTokenRequest != null) { // L: 2123
					if (!this.otlTokenRequest.isDone()) { // L: 2124
						return; // L: 2125
					}

					if (this.otlTokenRequest.isCancelled()) { // L: 2127
						class129.getLoginError(65); // L: 2128
						this.otlTokenRequest = null; // L: 2129
						return; // L: 2130
					}

					try {
						OtlTokenResponse var3 = (OtlTokenResponse)this.otlTokenRequest.get(); // L: 2133
						if (!var3.isSuccess()) { // L: 2134
							class129.getLoginError(65); // L: 2135
							this.otlTokenRequest = null; // L: 2136
							return; // L: 2137
						}

						class298.field3418 = var3.getAccessToken(); // L: 2139
						SpriteMask.field3386 = var3.getRefreshToken(); // L: 2140
						this.otlTokenRequest = null; // L: 2141
					} catch (Exception var24) { // L: 2143
						class421.RunException_sendStackTrace((String)null, var24); // L: 2144
						class129.getLoginError(65); // L: 2145
						this.otlTokenRequest = null; // L: 2146
						return; // L: 2147
					}
				} else {
					if (this.field536 == null) { // L: 2150
						class129.getLoginError(65); // L: 2180
						return; // L: 2181
					}

					if (!this.field536.method273()) { // L: 2151
						return; // L: 2152
					}

					if (this.field536.method285()) { // L: 2154
						class421.RunException_sendStackTrace(this.field536.method277(), (Throwable)null); // L: 2155
						class129.getLoginError(65); // L: 2156
						this.field536 = null; // L: 2157
						return; // L: 2158
					}

					var27 = this.field536.method274(); // L: 2160
					if (var27.method295() != 200) { // L: 2161
						class129.getLoginError(65); // L: 2162
						this.field536 = null; // L: 2163
						return; // L: 2164
					}

					field525 = 0; // L: 2166
					class419 var4 = new class419(var27.method296()); // L: 2167

					try {
						class298.field3418 = var4.method7786().getString("access_token"); // L: 2169
						SpriteMask.field3386 = var4.method7786().getString("refresh_token"); // L: 2170
					} catch (Exception var23) { // L: 2172
						class421.RunException_sendStackTrace("Error parsing tokens", var23); // L: 2173
						class129.getLoginError(65); // L: 2174
						this.field536 = null; // L: 2175
						return; // L: 2176
					}
				}

				this.method1187(class298.field3418); // L: 2183
				ReflectionCheck.method713(20); // L: 2184
			}

			if (loginState == 20) { // L: 2186
				if (this.field534 != null) { // L: 2187
					if (!this.field534.isDone()) { // L: 2188
						return; // L: 2189
					}

					if (this.field534.isCancelled()) { // L: 2191
						class129.getLoginError(65); // L: 2192
						this.field534 = null; // L: 2193
						return; // L: 2194
					}

					try {
						com.jagex.oldscape.pub.OtlTokenResponse var28 = (com.jagex.oldscape.pub.OtlTokenResponse)this.field534.get(); // L: 2197
						if (!var28.isSuccess()) { // L: 2198
							class129.getLoginError(65); // L: 2199
							this.field534 = null; // L: 2200
							return; // L: 2201
						}

						this.field530 = var28.getToken(); // L: 2203
						this.field534 = null; // L: 2204
					} catch (Exception var22) { // L: 2206
						class421.RunException_sendStackTrace((String)null, var22); // L: 2207
						class129.getLoginError(65); // L: 2208
						this.field534 = null; // L: 2209
						return; // L: 2210
					}
				} else {
					if (this.field532 == null) { // L: 2213
						class129.getLoginError(65); // L: 2234
						return; // L: 2235
					}

					if (!this.field532.method273()) { // L: 2214
						return; // L: 2215
					}

					if (this.field532.method285()) { // L: 2217
						class421.RunException_sendStackTrace(this.field532.method277(), (Throwable)null); // L: 2218
						class129.getLoginError(65); // L: 2219
						this.field532 = null; // L: 2220
						return; // L: 2221
					}

					var27 = this.field532.method274(); // L: 2223
					if (var27.method295() != 200) { // L: 2224
						class421.RunException_sendStackTrace("Response code: " + var27.method295() + "Response body: " + var27.method296(), (Throwable)null); // L: 2225
						class129.getLoginError(65); // L: 2226
						this.field532 = null; // L: 2227
						return; // L: 2228
					}

					this.field530 = var27.method296(); // L: 2230
					this.field532 = null; // L: 2231
				}

				field525 = 0; // L: 2237
				ReflectionCheck.method713(1); // L: 2238
			}

			if (loginState == 1) { // L: 2240
				if (VertexNormal.socketTask == null) { // L: 2241
					VertexNormal.socketTask = GameEngine.taskHandler.newSocketTask(class273.worldHost, class454.currentPort); // L: 2242
				}

				if (VertexNormal.socketTask.status == 2) { // L: 2244
					throw new IOException();
				}

				if (VertexNormal.socketTask.status == 1) { // L: 2245
					Socket var29 = (Socket)VertexNormal.socketTask.result; // L: 2247
					BufferedNetSocket var30 = new BufferedNetSocket(var29, 40000, 5000); // L: 2249
					var1 = var30; // L: 2251
					packetWriter.setSocket(var30); // L: 2252
					VertexNormal.socketTask = null; // L: 2253
					ReflectionCheck.method713(2); // L: 2254
				}
			}

			PacketBufferNode var31;
			if (loginState == 2) { // L: 2257
				packetWriter.clearBuffer(); // L: 2258
				var31 = class278.method5404(); // L: 2259
				var31.packetBuffer.writeByte(LoginPacket.field3247.id); // L: 2260
				packetWriter.addNode(var31); // L: 2261
				packetWriter.flush(); // L: 2262
				var2.offset = 0; // L: 2263
				ReflectionCheck.method713(3); // L: 2264
			}

			int var12;
			if (loginState == 3) { // L: 2266
				if (HealthBar.pcmPlayer0 != null) { // L: 2267
					HealthBar.pcmPlayer0.method808();
				}

				if (class86.pcmPlayer1 != null) { // L: 2268
					class86.pcmPlayer1.method808();
				}

				if (((AbstractSocket)var1).isAvailable(1)) { // L: 2269
					var12 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2270
					if (HealthBar.pcmPlayer0 != null) { // L: 2271
						HealthBar.pcmPlayer0.method808();
					}

					if (class86.pcmPlayer1 != null) { // L: 2272
						class86.pcmPlayer1.method808();
					}

					if (var12 != 0) { // L: 2273
						class129.getLoginError(var12); // L: 2274
						return; // L: 2275
					}

					var2.offset = 0; // L: 2277
					ReflectionCheck.method713(4); // L: 2278
				}
			}

			if (loginState == 4) { // L: 2281
				if (var2.offset < 8) { // L: 2282
					var12 = ((AbstractSocket)var1).available(); // L: 2283
					if (var12 > 8 - var2.offset) { // L: 2284
						var12 = 8 - var2.offset;
					}

					if (var12 > 0) { // L: 2285
						((AbstractSocket)var1).read(var2.array, var2.offset, var12); // L: 2286
						var2.offset += var12; // L: 2287
					}
				}

				if (var2.offset == 8) { // L: 2290
					var2.offset = 0; // L: 2291
					FileSystem.field1807 = var2.readLong(); // L: 2292
					ReflectionCheck.method713(5); // L: 2293
				}
			}

			int var9;
			int var13;
			int var14;
			if (loginState == 5) { // L: 2296
				packetWriter.packetBuffer.offset = 0; // L: 2297
				packetWriter.clearBuffer(); // L: 2298
				PacketBuffer var33 = new PacketBuffer(500); // L: 2299
				int[] var32 = new int[]{ClanChannel.secureRandom.nextInt(), ClanChannel.secureRandom.nextInt(), ClanChannel.secureRandom.nextInt(), ClanChannel.secureRandom.nextInt()}; // L: 2300 2301 2302 2303 2304
				var33.offset = 0; // L: 2305
				var33.writeByte(1); // L: 2306
				var33.writeInt(var32[0]); // L: 2307
				var33.writeInt(var32[1]); // L: 2308
				var33.writeInt(var32[2]); // L: 2309
				var33.writeInt(var32[3]); // L: 2310
				var33.writeLong(FileSystem.field1807); // L: 2311
				int var11;
				if (gameState == 40) { // L: 2312
					var33.writeInt(class120.field1445[0]); // L: 2313
					var33.writeInt(class120.field1445[1]); // L: 2314
					var33.writeInt(class120.field1445[2]); // L: 2315
					var33.writeInt(class120.field1445[3]); // L: 2316
				} else {
					if (gameState == 50) { // L: 2319
						var33.writeByte(class131.field1562.rsOrdinal()); // L: 2320
						var33.writeInt(HealthBarDefinition.field1923); // L: 2321
					} else {
						var33.writeByte(field528.rsOrdinal()); // L: 2324
						switch(field528.field1563) { // L: 2325
						case 0:
							LinkedHashMap var6 = BufferedSink.clientPreferences.parameters; // L: 2334
							String var8 = Login.Login_username; // L: 2336
							var9 = var8.length(); // L: 2338
							int var10 = 0; // L: 2339

							for (var11 = 0; var11 < var9; ++var11) { // L: 2340
								var10 = (var10 << 5) - var10 + var8.charAt(var11);
							}

							var33.writeInt((Integer)var6.get(var10)); // L: 2343
							break; // L: 2344
						case 1:
						case 3:
							var33.writeMedium(class360.field4308); // L: 2349
							++var33.offset; // L: 2350
						case 2:
						default:
							break;
						case 4:
							var33.offset += 4; // L: 2328
						}
					}

					if (field615.method8675()) { // L: 2355
						var33.writeByte(class467.field4919.rsOrdinal()); // L: 2356
						var33.writeStringCp1252NullTerminated(this.field530); // L: 2357
					} else {
						var33.writeByte(class467.field4923.rsOrdinal()); // L: 2360
						var33.writeStringCp1252NullTerminated(Login.Login_password); // L: 2361
					}
				}

				var33.encryptRsa(class71.field893, class71.field894); // L: 2364
				class120.field1445 = var32; // L: 2365
				PacketBufferNode var5 = class278.method5404(); // L: 2366
				var5.packetBuffer.offset = 0; // L: 2367
				if (gameState == 40) { // L: 2368
					var5.packetBuffer.writeByte(LoginPacket.field3246.id); // L: 2369
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field3251.id); // L: 2372
				}

				var5.packetBuffer.writeShort(0); // L: 2374
				var13 = var5.packetBuffer.offset; // L: 2375
				var5.packetBuffer.writeInt(209); // L: 2376
				var5.packetBuffer.writeInt(1); // L: 2377
				var5.packetBuffer.writeByte(clientType); // L: 2378
				var5.packetBuffer.writeByte(field573); // L: 2379
				byte var7 = 0; // L: 2380
				var5.packetBuffer.writeByte(var7); // L: 2381
				var5.packetBuffer.writeBytes(var33.array, 0, var33.offset); // L: 2382
				var14 = var5.packetBuffer.offset; // L: 2383
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2384
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2385
				var5.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 2386
				var5.packetBuffer.writeShort(class10.canvasHeight); // L: 2387
				MusicPatchNode.method5669(var5.packetBuffer); // L: 2388
				var5.packetBuffer.writeStringCp1252NullTerminated(DynamicObject.field974); // L: 2389
				var5.packetBuffer.writeInt(Canvas.field126); // L: 2390
				Buffer var15 = new Buffer(class202.platformInfo.size()); // L: 2391
				class202.platformInfo.write(var15); // L: 2392
				var5.packetBuffer.writeBytes(var15.array, 0, var15.array.length); // L: 2393
				var5.packetBuffer.writeByte(clientType); // L: 2394
				var5.packetBuffer.writeInt(0); // L: 2395
				var5.packetBuffer.method8437(class143.archive13.hash); // L: 2396
				var5.packetBuffer.writeInt(class157.archive2.hash); // L: 2397
				var5.packetBuffer.method8635(class310.archive19.hash); // L: 2398
				var5.packetBuffer.writeInt(class142.archive8.hash); // L: 2399
				var5.packetBuffer.method8437(SecureRandomFuture.archive9.hash); // L: 2400
				var5.packetBuffer.method8635(0); // L: 2401
				var5.packetBuffer.method8453(MouseHandler.field251.hash); // L: 2402
				var5.packetBuffer.method8635(ClanChannel.archive15.hash); // L: 2403
				var5.packetBuffer.writeInt(WorldMapRegion.archive10.hash); // L: 2404
				var5.packetBuffer.method8437(class150.archive5.hash); // L: 2405
				var5.packetBuffer.method8453(NetCache.archive18.hash); // L: 2406
				var5.packetBuffer.method8437(ReflectionCheck.archive6.hash); // L: 2407
				var5.packetBuffer.method8635(PlayerType.archive7.hash); // L: 2408
				var5.packetBuffer.method8453(class7.field32.hash); // L: 2409
				var5.packetBuffer.method8635(WorldMapSectionType.archive11.hash); // L: 2410
				var5.packetBuffer.writeInt(field522.hash); // L: 2411
				var5.packetBuffer.method8453(ChatChannel.archive14.hash); // L: 2412
				var5.packetBuffer.method8453(class382.archive17.hash); // L: 2413
				var5.packetBuffer.method8635(class139.archive20.hash); // L: 2414
				var5.packetBuffer.writeInt(Canvas.archive4.hash); // L: 2415
				var5.packetBuffer.method8453(class188.archive12.hash); // L: 2416
				var5.packetBuffer.xteaEncrypt(var32, var14, var5.packetBuffer.offset); // L: 2417
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var13); // L: 2418
				packetWriter.addNode(var5); // L: 2419
				packetWriter.flush(); // L: 2420
				packetWriter.isaacCipher = new IsaacCipher(var32); // L: 2421
				int[] var16 = new int[4]; // L: 2422

				for (var11 = 0; var11 < 4; ++var11) { // L: 2423
					var16[var11] = var32[var11] + 50;
				}

				var2.newIsaacCipher(var16); // L: 2424
				ReflectionCheck.method713(6); // L: 2425
			}

			int var17;
			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2427 2428
				var12 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2429
				if (var12 == 61) { // L: 2430
					var17 = ((AbstractSocket)var1).available(); // L: 2431
					ItemContainer.field1020 = var17 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2432
					ReflectionCheck.method713(5); // L: 2433
				}

				if (var12 == 21 && gameState == 20) { // L: 2435
					ReflectionCheck.method713(12); // L: 2436
				} else if (var12 == 2) { // L: 2438
					ReflectionCheck.method713(14); // L: 2439
				} else if (var12 == 15 && gameState == 40) { // L: 2441
					packetWriter.serverPacketLength = -1; // L: 2442
					ReflectionCheck.method713(19); // L: 2443
				} else if (var12 == 64) { // L: 2445
					ReflectionCheck.method713(10); // L: 2446
				} else if (var12 == 23 && field526 < 1) { // L: 2448
					++field526; // L: 2449
					ReflectionCheck.method713(0); // L: 2450
				} else if (var12 == 29) { // L: 2452
					ReflectionCheck.method713(17); // L: 2453
				} else {
					if (var12 != 69) { // L: 2455
						class129.getLoginError(var12); // L: 2459
						return; // L: 2460
					}

					ReflectionCheck.method713(7); // L: 2456
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2464 2465
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2466
				var2.offset = 0; // L: 2467
				GraphicsObject.field867 = var2.readUnsignedShort(); // L: 2468
				ReflectionCheck.method713(8); // L: 2469
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= GraphicsObject.field867) { // L: 2472 2473
				var2.offset = 0; // L: 2474
				((AbstractSocket)var1).read(var2.array, var2.offset, GraphicsObject.field867); // L: 2475
				class6[] var35 = new class6[]{class6.field19}; // L: 2478
				class6 var34 = var35[var2.readUnsignedByte()]; // L: 2480

				try {
					class3 var36 = HitSplatDefinition.method3716(var34); // L: 2482
					this.field544 = new class7(var2, var36); // L: 2483
					ReflectionCheck.method713(9); // L: 2484
				} catch (Exception var21) { // L: 2486
					class129.getLoginError(22); // L: 2487
					return; // L: 2488
				}
			}

			if (loginState == 9 && this.field544.method33()) { // L: 2492 2493
				this.field585 = this.field544.method35(); // L: 2494
				this.field544.method34(); // L: 2495
				this.field544 = null; // L: 2496
				if (this.field585 == null) { // L: 2497
					class129.getLoginError(22); // L: 2498
					return; // L: 2499
				}

				packetWriter.clearBuffer(); // L: 2501
				var31 = class278.method5404(); // L: 2502
				var31.packetBuffer.writeByte(LoginPacket.field3248.id); // L: 2503
				var31.packetBuffer.writeShort(this.field585.offset); // L: 2504
				var31.packetBuffer.method8397(this.field585); // L: 2505
				packetWriter.addNode(var31); // L: 2506
				packetWriter.flush(); // L: 2507
				this.field585 = null; // L: 2508
				ReflectionCheck.method713(6); // L: 2509
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2512 2513
				ObjectComposition.field2132 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2514
				ReflectionCheck.method713(11); // L: 2515
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= ObjectComposition.field2132) { // L: 2518 2519
				((AbstractSocket)var1).read(var2.array, 0, ObjectComposition.field2132); // L: 2520
				var2.offset = 0; // L: 2521
				ReflectionCheck.method713(6); // L: 2522
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2525 2526
				field574 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 2527
				ReflectionCheck.method713(13); // L: 2528
			}

			if (loginState == 13) { // L: 2531
				field525 = 0; // L: 2532
				MusicPatchNode2.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field574 / 60 + " seconds."); // L: 2533
				if (--field574 <= 0) { // L: 2534
					ReflectionCheck.method713(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2537 2538
					GraphicsObject.field860 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2539
					ReflectionCheck.method713(15); // L: 2540
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= GraphicsObject.field860) { // L: 2543 2544
					boolean var46 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2545
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2546
					var2.offset = 0; // L: 2547
					boolean var47 = false; // L: 2548
					if (var46) { // L: 2549
						var17 = var2.readByteIsaac() << 24; // L: 2550
						var17 |= var2.readByteIsaac() << 16; // L: 2551
						var17 |= var2.readByteIsaac() << 8; // L: 2552
						var17 |= var2.readByteIsaac(); // L: 2553
						String var42 = Login.Login_username; // L: 2555
						int var44 = var42.length(); // L: 2557
						var14 = 0; // L: 2558
						var9 = 0; // L: 2559

						while (true) {
							if (var9 >= var44) {
								if (BufferedSink.clientPreferences.parameters.size() >= 10 && !BufferedSink.clientPreferences.parameters.containsKey(var14)) { // L: 2563 2564
									Iterator var45 = BufferedSink.clientPreferences.parameters.entrySet().iterator(); // L: 2565
									var45.next(); // L: 2566
									var45.remove(); // L: 2567
								}

								BufferedSink.clientPreferences.parameters.put(var14, var17); // L: 2570
								break;
							}

							var14 = (var14 << 5) - var14 + var42.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) { // L: 2572
						BufferedSink.clientPreferences.method2385(Login.Login_username); // L: 2573
					} else {
						BufferedSink.clientPreferences.method2385((String)null); // L: 2576
					}

					class149.savePreferences(); // L: 2578
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2579
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2580
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2581
					localPlayerIndex <<= 8; // L: 2582
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2583
					field778 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2584
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2585
					var2.offset = 0; // L: 2586
					this.accountHash = var2.readLong(); // L: 2587
					if (GraphicsObject.field860 >= 29) { // L: 2588
						((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2589
						var2.offset = 0; // L: 2590
						field489 = var2.readLong(); // L: 2591
					}

					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2593
					var2.offset = 0; // L: 2594
					ServerPacket[] var39 = VarcInt.ServerPacket_values(); // L: 2595
					var13 = var2.readSmartByteShortIsaac(); // L: 2596
					if (var13 < 0 || var13 >= var39.length) { // L: 2597
						throw new IOException(var13 + " " + var2.offset);
					}

					packetWriter.serverPacket = var39[var13]; // L: 2598
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2599
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2600
					var2.offset = 0; // L: 2601
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2602

					try {
						class27.method398(ClanChannelMember.client, "zap"); // L: 2604
					} catch (Throwable var20) { // L: 2606
					}

					ReflectionCheck.method713(16); // L: 2607
				}

				if (loginState != 16) { // L: 2610
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2725 2726
						var2.offset = 0; // L: 2727
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2728
						var2.offset = 0; // L: 2729
						class154.field1724 = var2.readUnsignedShort(); // L: 2730
						ReflectionCheck.method713(18); // L: 2731
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= class154.field1724) { // L: 2734 2735
						var2.offset = 0; // L: 2736
						((AbstractSocket)var1).read(var2.array, 0, class154.field1724); // L: 2737
						var2.offset = 0; // L: 2738
						String var43 = var2.readStringCp1252NullTerminated(); // L: 2739
						String var38 = var2.readStringCp1252NullTerminated(); // L: 2740
						String var40 = var2.readStringCp1252NullTerminated(); // L: 2741
						MusicPatchNode2.setLoginResponseString(var43, var38, var40); // L: 2742
						class21.method305(10); // L: 2743
						if (field615.method8675()) { // L: 2744
							GrandExchangeOfferOwnWorldComparator.method1171(9); // L: 2745
						}
					}

					if (loginState == 19) { // L: 2749
						if (packetWriter.serverPacketLength == -1) { // L: 2750
							if (((AbstractSocket)var1).available() < 2) { // L: 2751
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2752
							var2.offset = 0; // L: 2753
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2754
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2756
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2757
							var2.offset = 0; // L: 2758
							var12 = packetWriter.serverPacketLength; // L: 2759
							timer.method7171(); // L: 2760
							WorldMapData_0.method4678(); // L: 2761
							WorldMapCacheName.updatePlayer(var2); // L: 2762
							if (var12 != var2.offset) { // L: 2763
								throw new RuntimeException(); // L: 2764
							}
						}
					} else {
						++field525; // L: 2768
						if (field525 > 2000) { // L: 2769
							if (field526 < 1) { // L: 2770
								if (class159.worldPort == class454.currentPort) { // L: 2771
									class454.currentPort = class131.js5Port;
								} else {
									class454.currentPort = class159.worldPort; // L: 2772
								}

								++field526; // L: 2773
								ReflectionCheck.method713(0); // L: 2774
							} else {
								class129.getLoginError(-3); // L: 2777
							}
						}
					}
				} else {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2611
						var2.offset = 0; // L: 2612
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2613
						timer.method7184(); // L: 2614
						mouseLastLastPressedTimeMillis = -1L; // L: 2617
						GrandExchangeOfferOwnWorldComparator.mouseRecorder.index = 0; // L: 2618
						ChatChannel.hasFocus = true; // L: 2619
						hadFocus = true; // L: 2620
						field738 = -1L; // L: 2621
						class18.method267(); // L: 2622
						packetWriter.clearBuffer(); // L: 2623
						packetWriter.packetBuffer.offset = 0; // L: 2624
						packetWriter.serverPacket = null; // L: 2625
						packetWriter.field1380 = null; // L: 2626
						packetWriter.field1373 = null; // L: 2627
						packetWriter.field1381 = null; // L: 2628
						packetWriter.serverPacketLength = 0; // L: 2629
						packetWriter.field1371 = 0; // L: 2630
						rebootTimer = 0; // L: 2631
						logoutTimer = 0; // L: 2632
						hintArrowType = 0; // L: 2633
						menuOptionsCount = 0; // L: 2635
						isMenuOpen = false; // L: 2636
						MouseHandler.MouseHandler_idleCycles = 0; // L: 2639
						Messages.Messages_channels.clear(); // L: 2642
						Messages.Messages_hashTable.clear(); // L: 2643
						Messages.Messages_queue.clear(); // L: 2644
						Messages.Messages_count = 0; // L: 2645
						isItemSelected = 0; // L: 2647
						isSpellSelected = false; // L: 2648
						soundEffectCount = 0; // L: 2649
						camAngleY = 0; // L: 2650
						oculusOrbState = 0; // L: 2651
						NetFileRequest.field4144 = null; // L: 2652
						minimapState = 0; // L: 2653
						field519 = -1; // L: 2654
						destinationX = 0; // L: 2655
						destinationY = 0; // L: 2656
						playerAttackOption = AttackOption.AttackOption_hidden; // L: 2657
						npcAttackOption = AttackOption.AttackOption_hidden; // L: 2658
						npcCount = 0; // L: 2659
						Players.Players_count = 0; // L: 2661

						for (var12 = 0; var12 < 2048; ++var12) { // L: 2662
							Players.field1315[var12] = null; // L: 2663
							Players.field1314[var12] = class202.field2282; // L: 2664
						}

						for (var12 = 0; var12 < 2048; ++var12) { // L: 2667
							players[var12] = null;
						}

						for (var12 = 0; var12 < 65536; ++var12) { // L: 2668
							npcs[var12] = null;
						}

						combatTargetPlayerIndex = -1; // L: 2669
						projectiles.clear(); // L: 2670
						graphicsObjects.clear(); // L: 2671

						for (var12 = 0; var12 < 4; ++var12) { // L: 2672
							for (var17 = 0; var17 < 104; ++var17) { // L: 2673
								for (int var18 = 0; var18 < 104; ++var18) { // L: 2674
									groundItems[var12][var17][var18] = null; // L: 2675
								}
							}
						}

						pendingSpawns = new NodeDeque(); // L: 2679
						DecorativeObject.friendSystem.clear(); // L: 2680

						for (var12 = 0; var12 < VarpDefinition.field1866; ++var12) { // L: 2681
							VarpDefinition var37 = ClientPacket.VarpDefinition_get(var12); // L: 2682
							if (var37 != null) { // L: 2683
								Varps.Varps_temp[var12] = 0; // L: 2684
								Varps.Varps_main[var12] = 0; // L: 2685
							}
						}

						Projectile.varcs.clearTransient(); // L: 2688
						followerIndex = -1; // L: 2689
						if (rootInterface != -1) { // L: 2690
							WorldMapAreaData.method5265(rootInterface);
						}

						for (InterfaceParent var41 = (InterfaceParent)interfaceParents.first(); var41 != null; var41 = (InterfaceParent)interfaceParents.next()) { // L: 2691
							class7.closeInterface(var41, true); // L: 2692
						}

						rootInterface = -1; // L: 2694
						interfaceParents = new NodeHashTable(8); // L: 2695
						meslayerContinueWidget = null; // L: 2696
						menuOptionsCount = 0; // L: 2698
						isMenuOpen = false; // L: 2699
						playerAppearance.method5731((int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1); // L: 2701

						for (var12 = 0; var12 < 8; ++var12) { // L: 2702
							playerMenuActions[var12] = null; // L: 2703
							playerOptionsPriorities[var12] = false; // L: 2704
						}

						class133.method2975(); // L: 2706
						isLoading = true; // L: 2707

						for (var12 = 0; var12 < 100; ++var12) { // L: 2708
							field717[var12] = true;
						}

						class9.method61(); // L: 2709
						MenuAction.friendsChatManager = null; // L: 2710
						class121.guestClanSettings = null; // L: 2711
						Arrays.fill(currentClanSettings, (Object)null); // L: 2712
						class198.guestClanChannel = null; // L: 2713
						Arrays.fill(currentClanChannels, (Object)null); // L: 2714

						for (var12 = 0; var12 < 8; ++var12) { // L: 2715
							grandExchangeOffers[var12] = new GrandExchangeOffer();
						}

						WorldMapCacheName.grandExchangeEvents = null; // L: 2716
						WorldMapCacheName.updatePlayer(var2); // L: 2718
						class343.field4234 = -1; // L: 2719
						class6.loadRegions(false, var2); // L: 2720
						packetWriter.serverPacket = null; // L: 2721
					}

				}
			}
		} catch (IOException var26) { // L: 2781
			if (field526 < 1) { // L: 2782
				if (class159.worldPort == class454.currentPort) { // L: 2783
					class454.currentPort = class131.js5Port;
				} else {
					class454.currentPort = class159.worldPort; // L: 2784
				}

				++field526; // L: 2785
				ReflectionCheck.method713(0); // L: 2786
			} else {
				class129.getLoginError(-2); // L: 2789
			}
		}
	} // L: 2535 2723 2766 2775 2778 2787 2790 2792

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-431353402"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3076
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3077
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3078
			hadNetworkError = false; // L: 3079
			WorldMapSection0.method5101(); // L: 3080
		} else {
			if (!isMenuOpen) { // L: 3083
				MusicPatchNode.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1202(packetWriter); ++var1) { // L: 3084 3085
			}

			if (gameState == 30) { // L: 3087
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class37.reflectionChecks.last(); // L: 3091
					boolean var29;
					if (var2 == null) { // L: 3092
						var29 = false; // L: 3093
					} else {
						var29 = true; // L: 3096
					}

					int var3;
					PacketBufferNode var30;
					if (!var29) { // L: 3098
						PacketBufferNode var14;
						int var15;
						if (timer.field4399) { // L: 3106
							var14 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3023, packetWriter.isaacCipher); // L: 3108
							var14.packetBuffer.writeByte(0); // L: 3109
							var15 = var14.packetBuffer.offset; // L: 3110
							timer.write(var14.packetBuffer); // L: 3111
							var14.packetBuffer.method8433(var14.packetBuffer.offset - var15); // L: 3112
							packetWriter.addNode(var14); // L: 3113
							timer.method7170(); // L: 3114
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
						synchronized(GrandExchangeOfferOwnWorldComparator.mouseRecorder.lock) { // L: 3117
							if (!field517) { // L: 3118
								GrandExchangeOfferOwnWorldComparator.mouseRecorder.index = 0; // L: 3204
							} else if (MouseHandler.MouseHandler_lastButton != 0 || GrandExchangeOfferOwnWorldComparator.mouseRecorder.index >= 40) { // L: 3119
								var30 = null; // L: 3121
								var3 = 0; // L: 3122
								var4 = 0; // L: 3123
								var5 = 0; // L: 3124
								var6 = 0; // L: 3125

								for (var7 = 0; var7 < GrandExchangeOfferOwnWorldComparator.mouseRecorder.index && (var30 == null || var30.packetBuffer.offset - var3 < 246); ++var7) { // L: 3126 3127
									var4 = var7; // L: 3128
									var8 = GrandExchangeOfferOwnWorldComparator.mouseRecorder.ys[var7]; // L: 3129
									if (var8 < -1) { // L: 3130
										var8 = -1;
									} else if (var8 > 65534) { // L: 3131
										var8 = 65534;
									}

									var9 = GrandExchangeOfferOwnWorldComparator.mouseRecorder.xs[var7]; // L: 3132
									if (var9 < -1) { // L: 3133
										var9 = -1;
									} else if (var9 > 65534) { // L: 3134
										var9 = 65534;
									}

									if (var9 != field504 || var8 != field630) { // L: 3135
										if (var30 == null) { // L: 3138
											var30 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3075, packetWriter.isaacCipher); // L: 3139
											var30.packetBuffer.writeByte(0); // L: 3140
											var3 = var30.packetBuffer.offset; // L: 3141
											var10000 = var30.packetBuffer; // L: 3142
											var10000.offset += 2;
											var5 = 0; // L: 3143
											var6 = 0; // L: 3144
										}

										if (-1L != field501) { // L: 3149
											var10 = var9 - field504; // L: 3150
											var11 = var8 - field630; // L: 3151
											var12 = (int)((GrandExchangeOfferOwnWorldComparator.mouseRecorder.millis[var7] - field501) / 20L); // L: 3152
											var5 = (int)((long)var5 + (GrandExchangeOfferOwnWorldComparator.mouseRecorder.millis[var7] - field501) % 20L); // L: 3153
										} else {
											var10 = var9; // L: 3156
											var11 = var8; // L: 3157
											var12 = Integer.MAX_VALUE; // L: 3158
										}

										field504 = var9; // L: 3160
										field630 = var8; // L: 3161
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3162
											var10 += 32; // L: 3163
											var11 += 32; // L: 3164
											var30.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3165
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3167
											var10 += 128; // L: 3168
											var11 += 128; // L: 3169
											var30.packetBuffer.writeByte(var12 + 128); // L: 3170
											var30.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3171
										} else if (var12 < 32) { // L: 3173
											var30.packetBuffer.writeByte(var12 + 192); // L: 3174
											if (var9 != -1 && var8 != -1) { // L: 3175
												var30.packetBuffer.writeInt(var9 | var8 << 16); // L: 3176
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var30.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3179
											if (var9 != -1 && var8 != -1) { // L: 3180
												var30.packetBuffer.writeInt(var9 | var8 << 16); // L: 3181
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6; // L: 3183
										field501 = GrandExchangeOfferOwnWorldComparator.mouseRecorder.millis[var7]; // L: 3184
									}
								}

								if (var30 != null) { // L: 3186
									var30.packetBuffer.method8433(var30.packetBuffer.offset - var3); // L: 3187
									var7 = var30.packetBuffer.offset; // L: 3188
									var30.packetBuffer.offset = var3; // L: 3189
									var30.packetBuffer.writeByte(var5 / var6); // L: 3190
									var30.packetBuffer.writeByte(var5 % var6); // L: 3191
									var30.packetBuffer.offset = var7; // L: 3192
									packetWriter.addNode(var30); // L: 3193
								}

								if (var4 >= GrandExchangeOfferOwnWorldComparator.mouseRecorder.index) { // L: 3195
									GrandExchangeOfferOwnWorldComparator.mouseRecorder.index = 0;
								} else {
									MouseRecorder var55 = GrandExchangeOfferOwnWorldComparator.mouseRecorder; // L: 3197
									var55.index -= var4;
									System.arraycopy(GrandExchangeOfferOwnWorldComparator.mouseRecorder.xs, var4, GrandExchangeOfferOwnWorldComparator.mouseRecorder.xs, 0, GrandExchangeOfferOwnWorldComparator.mouseRecorder.index); // L: 3198
									System.arraycopy(GrandExchangeOfferOwnWorldComparator.mouseRecorder.ys, var4, GrandExchangeOfferOwnWorldComparator.mouseRecorder.ys, 0, GrandExchangeOfferOwnWorldComparator.mouseRecorder.index); // L: 3199
									System.arraycopy(GrandExchangeOfferOwnWorldComparator.mouseRecorder.millis, var4, GrandExchangeOfferOwnWorldComparator.mouseRecorder.millis, 0, GrandExchangeOfferOwnWorldComparator.mouseRecorder.index); // L: 3200
								}
							}
						}

						if (MouseHandler.MouseHandler_lastButton == 1 || !class82.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3206
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 3207
							if (var16 > 32767L) { // L: 3208
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 3209
							var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3210
							if (var3 < 0) { // L: 3211
								var3 = 0;
							} else if (var3 > class10.canvasHeight) { // L: 3212
								var3 = class10.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3213
							if (var4 < 0) { // L: 3214
								var4 = 0;
							} else if (var4 > GameEngine.canvasWidth) { // L: 3215
								var4 = GameEngine.canvasWidth;
							}

							var5 = (int)var16; // L: 3216
							PacketBufferNode var18 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3051, packetWriter.isaacCipher); // L: 3217
							var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0)); // L: 3218
							var18.packetBuffer.writeShort(var4); // L: 3219
							var18.packetBuffer.writeShort(var3); // L: 3220
							packetWriter.addNode(var18); // L: 3221
						}

						if (field733.field2247 > 0) { // L: 3223
							var14 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3004, packetWriter.isaacCipher); // L: 3224
							var14.packetBuffer.writeShort(0); // L: 3225
							var15 = var14.packetBuffer.offset; // L: 3226
							long var19 = UserComparator8.method2748(); // L: 3227

							for (var5 = 0; var5 < field733.field2247; ++var5) { // L: 3228
								long var21 = var19 - field738; // L: 3229
								if (var21 > 16777215L) { // L: 3230
									var21 = 16777215L;
								}

								field738 = var19; // L: 3231
								var14.packetBuffer.method8449((int)var21); // L: 3232
								var14.packetBuffer.method8434(field733.field2246[var5]); // L: 3233
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15); // L: 3235
							packetWriter.addNode(var14); // L: 3236
						}

						if (field779 > 0) { // L: 3238
							--field779;
						}

						if (field733.method3956(96) || field733.method3956(97) || field733.method3956(98) || field733.method3956(99)) { // L: 3239
							field589 = true; // L: 3240
						}

						if (field589 && field779 <= 0) { // L: 3242
							field779 = 20; // L: 3243
							field589 = false; // L: 3244
							var14 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3034, packetWriter.isaacCipher); // L: 3246
							var14.packetBuffer.writeShort(camAngleX); // L: 3247
							var14.packetBuffer.writeIntME(camAngleY); // L: 3248
							packetWriter.addNode(var14); // L: 3249
						}

						if (ChatChannel.hasFocus && !hadFocus) { // L: 3251
							hadFocus = true; // L: 3252
							var14 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3016, packetWriter.isaacCipher); // L: 3254
							var14.packetBuffer.writeByte(1); // L: 3255
							packetWriter.addNode(var14); // L: 3256
						}

						if (!ChatChannel.hasFocus && hadFocus) { // L: 3258
							hadFocus = false; // L: 3259
							var14 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3016, packetWriter.isaacCipher); // L: 3261
							var14.packetBuffer.writeByte(0); // L: 3262
							packetWriter.addNode(var14); // L: 3263
						}

						if (class7.worldMap != null) { // L: 3266
							class7.worldMap.method7866();
						}

						Decimator.method1109(); // L: 3267
						if (class139.field1616) { // L: 3269
							class31.method465(); // L: 3270
							class139.field1616 = false; // L: 3271
						}

						if (field519 != ApproximateRouteStrategy.Client_plane) { // L: 3275
							field519 = ApproximateRouteStrategy.Client_plane; // L: 3276
							class268.method5364(ApproximateRouteStrategy.Client_plane); // L: 3277
						}

						if (gameState != 30) { // L: 3280
							return;
						}

						for (PendingSpawn var38 = (PendingSpawn)pendingSpawns.last(); var38 != null; var38 = (PendingSpawn)pendingSpawns.previous()) { // L: 3282 3283 3302
							if (var38.hitpoints > 0) { // L: 3284
								--var38.hitpoints;
							}

							if (var38.hitpoints == 0) { // L: 3285
								if (var38.objectId < 0 || SoundSystem.method862(var38.objectId, var38.field1126)) { // L: 3286
									class320.addPendingSpawnToScene(var38.plane, var38.type, var38.x, var38.y, var38.objectId, var38.field1125, var38.field1126); // L: 3287
									var38.remove(); // L: 3288
								}
							} else {
								if (var38.delay > 0) { // L: 3292
									--var38.delay;
								}

								if (var38.delay == 0 && var38.x >= 1 && var38.y >= 1 && var38.x <= 102 && var38.y <= 102 && (var38.field1127 < 0 || SoundSystem.method862(var38.field1127, var38.field1129))) { // L: 3293 3294
									class320.addPendingSpawnToScene(var38.plane, var38.type, var38.x, var38.y, var38.field1127, var38.field1120, var38.field1129); // L: 3295
									var38.delay = -1; // L: 3296
									if (var38.objectId == var38.field1127 && var38.objectId == -1) { // L: 3297
										var38.remove();
									} else if (var38.objectId == var38.field1127 && var38.field1125 == var38.field1120 && var38.field1126 == var38.field1129) { // L: 3298
										var38.remove();
									}
								}
							}
						}

						int var10002;
						for (var1 = 0; var1 < soundEffectCount; ++var1) { // L: 3306
							var10002 = queuedSoundEffectDelays[var1]--; // L: 3307
							if (queuedSoundEffectDelays[var1] >= -10) { // L: 3308
								SoundEffect var31 = soundEffects[var1]; // L: 3320
								if (var31 == null) { // L: 3321
									var10000 = null; // L: 3322
									var31 = SoundEffect.readSoundEffect(Canvas.archive4, soundEffectIds[var1], 0);
									if (var31 == null) { // L: 3323
										continue;
									}

									int[] var56 = queuedSoundEffectDelays; // L: 3324
									var56[var1] += var31.calculateDelay();
									soundEffects[var1] = var31; // L: 3325
								}

								if (queuedSoundEffectDelays[var1] < 0) { // L: 3331
									if (soundLocations[var1] != 0) { // L: 3333
										var4 = (soundLocations[var1] & 255) * 128; // L: 3334
										var5 = soundLocations[var1] >> 16 & 255; // L: 3335
										var6 = var5 * 128 + 64 - class296.localPlayer.x; // L: 3336
										if (var6 < 0) { // L: 3337
											var6 = -var6;
										}

										var7 = soundLocations[var1] >> 8 & 255; // L: 3338
										var8 = var7 * 128 + 64 - class296.localPlayer.y; // L: 3339
										if (var8 < 0) { // L: 3340
											var8 = -var8;
										}

										var9 = var8 + var6 - 128; // L: 3341
										if (var9 > var4) { // L: 3342
											queuedSoundEffectDelays[var1] = -100; // L: 3343
											continue; // L: 3344
										}

										if (var9 < 0) { // L: 3346
											var9 = 0;
										}

										var3 = (var4 - var9) * BufferedSink.clientPreferences.method2411() / var4; // L: 3347
									} else {
										var3 = BufferedSink.clientPreferences.method2427(); // L: 3349
									}

									if (var3 > 0) { // L: 3350
										RawSound var23 = var31.toRawSound().resample(FaceNormal.decimator); // L: 3351
										RawPcmStream var24 = RawPcmStream.createRawPcmStream(var23, 100, var3); // L: 3352
										var24.setNumLoops(queuedSoundEffectLoops[var1] - 1); // L: 3353
										class453.pcmStreamMixer.addSubStream(var24); // L: 3354
									}

									queuedSoundEffectDelays[var1] = -100; // L: 3356
								}
							} else {
								--soundEffectCount; // L: 3309

								for (var15 = var1; var15 < soundEffectCount; ++var15) { // L: 3310
									soundEffectIds[var15] = soundEffectIds[var15 + 1]; // L: 3311
									soundEffects[var15] = soundEffects[var15 + 1]; // L: 3312
									queuedSoundEffectLoops[var15] = queuedSoundEffectLoops[var15 + 1]; // L: 3313
									queuedSoundEffectDelays[var15] = queuedSoundEffectDelays[var15 + 1]; // L: 3314
									soundLocations[var15] = soundLocations[var15 + 1]; // L: 3315
								}

								--var1; // L: 3317
							}
						}

						if (playingJingle) { // L: 3359
							if (class283.musicPlayerStatus != 0) { // L: 3362
								var29 = true; // L: 3363
							} else {
								var29 = class283.midiPcmStream.isReady(); // L: 3366
							}

							if (!var29) { // L: 3368
								if (BufferedSink.clientPreferences.method2391() != 0 && currentTrackGroupId != -1) { // L: 3369
									class18.method266(ReflectionCheck.archive6, currentTrackGroupId, 0, BufferedSink.clientPreferences.method2391(), false);
								}

								playingJingle = false; // L: 3370
							}
						}

						++packetWriter.field1371; // L: 3374
						if (packetWriter.field1371 > 750) { // L: 3375
							WorldMapSection0.method5101(); // L: 3376
							return; // L: 3377
						}

						var1 = Players.Players_count; // L: 3380
						int[] var32 = Players.Players_indices; // L: 3381

						for (var3 = 0; var3 < var1; ++var3) { // L: 3382
							Player var42 = players[var32[var3]]; // L: 3383
							if (var42 != null) { // L: 3384
								class6.updateActorSequence(var42, 1); // L: 3385
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 3390
							var15 = npcIndices[var1]; // L: 3391
							NPC var25 = npcs[var15]; // L: 3392
							if (var25 != null) { // L: 3393
								class6.updateActorSequence(var25, var25.definition.size); // L: 3394
							}
						}

						int[] var39 = Players.Players_indices; // L: 3399

						for (var15 = 0; var15 < Players.Players_count; ++var15) { // L: 3400
							Player var48 = players[var39[var15]]; // L: 3401
							if (var48 != null && var48.overheadTextCyclesRemaining > 0) { // L: 3402
								--var48.overheadTextCyclesRemaining; // L: 3403
								if (var48.overheadTextCyclesRemaining == 0) { // L: 3404
									var48.overheadText = null;
								}
							}
						}

						for (var15 = 0; var15 < npcCount; ++var15) { // L: 3407
							var3 = npcIndices[var15]; // L: 3408
							NPC var43 = npcs[var3]; // L: 3409
							if (var43 != null && var43.overheadTextCyclesRemaining > 0) { // L: 3410
								--var43.overheadTextCyclesRemaining; // L: 3411
								if (var43.overheadTextCyclesRemaining == 0) { // L: 3412
									var43.overheadText = null;
								}
							}
						}

						++field558; // L: 3416
						if (mouseCrossColor != 0) { // L: 3417
							mouseCrossState = mouseCrossState * 400 + 20; // L: 3418
							if (mouseCrossState * 400 >= 400) { // L: 3419
								mouseCrossColor = 0;
							}
						}

						if (class133.field1575 != null) { // L: 3421
							++field697; // L: 3422
							if (field697 >= 15) { // L: 3423
								class143.invalidateWidget(class133.field1575); // L: 3424
								class133.field1575 = null; // L: 3425
							}
						}

						Widget var40 = Occluder.mousedOverWidgetIf1; // L: 3428
						Widget var33 = Occluder.field2556; // L: 3429
						Occluder.mousedOverWidgetIf1 = null; // L: 3430
						Occluder.field2556 = null; // L: 3431
						draggedOnWidget = null; // L: 3432
						field640 = false; // L: 3433
						field684 = false; // L: 3434
						field679 = 0; // L: 3435

						while (field733.method3981() && field679 < 128) { // L: 3436
							if (staffModLevel >= 2 && field733.method3956(82) && field733.field2252 == 66) { // L: 3437
								StringBuilder var44 = new StringBuilder(); // L: 3440

								Message var41;
								for (Iterator var45 = Messages.Messages_hashTable.iterator(); var45.hasNext(); var44.append(var41.text).append('\n')) { // L: 3441 3447
									var41 = (Message)var45.next(); // L: 3442
									if (var41.sender != null && !var41.sender.isEmpty()) { // L: 3444
										var44.append(var41.sender).append(':'); // L: 3445
									}
								}

								String var49 = var44.toString(); // L: 3450
								ClanChannelMember.client.method527(var49); // L: 3453
							} else if (oculusOrbState != 1 || field733.field2256 <= 0) { // L: 3456
								field737[field679] = field733.field2252; // L: 3459
								field613[field679] = field733.field2256; // L: 3460
								++field679; // L: 3461
							}
						}

						if (UserComparator3.method2773() && field733.method3956(82) && field733.method3956(81) && mouseWheelRotation != 0) { // L: 3463
							var3 = class296.localPlayer.plane - mouseWheelRotation; // L: 3464
							if (var3 < 0) { // L: 3465
								var3 = 0;
							} else if (var3 > 3) { // L: 3466
								var3 = 3;
							}

							if (var3 != class296.localPlayer.plane) { // L: 3467
								class143.method3054(class296.localPlayer.pathX[0] + class26.baseX * 64, class296.localPlayer.pathY[0] + class158.baseY * 64, var3, false); // L: 3468
							}

							mouseWheelRotation = 0; // L: 3470
						}

						if (MouseHandler.MouseHandler_lastButton == 1) { // L: 3472
							field734.method3933(); // L: 3473
						}

						if (rootInterface != -1) { // L: 3475
							WorldMapID.updateRootInterface(rootInterface, 0, 0, GameEngine.canvasWidth, class10.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3476

						while (true) {
							Widget var46;
							Widget var47;
							ScriptEvent var51;
							do {
								var51 = (ScriptEvent)field711.removeLast(); // L: 3478
								if (var51 == null) { // L: 3479
									while (true) {
										do {
											var51 = (ScriptEvent)field670.removeLast(); // L: 3490
											if (var51 == null) { // L: 3491
												while (true) {
													do {
														var51 = (ScriptEvent)scriptEvents.removeLast(); // L: 3502
														if (var51 == null) { // L: 3503
															while (true) {
																class198 var53 = (class198)field713.removeLast(); // L: 3514
																if (var53 == null) { // L: 3515
																	this.menu(); // L: 3518
																	WorldMapLabel.method5157(); // L: 3519
																	if (clickedWidget != null) { // L: 3520
																		this.method1208();
																	}

																	PacketBufferNode var26;
																	if (VerticalAlignment.dragInventoryWidget != null) { // L: 3521
																		class143.invalidateWidget(VerticalAlignment.dragInventoryWidget); // L: 3522
																		++itemDragDuration; // L: 3523
																		if (MouseHandler.MouseHandler_currentButton == 0) { // L: 3524
																			if (field616) { // L: 3525
																				if (VerticalAlignment.dragInventoryWidget == class168.hoveredItemContainer && dragItemSlotSource != dragItemSlotDestination) { // L: 3526
																					Widget var54 = VerticalAlignment.dragInventoryWidget; // L: 3527
																					byte var34 = 0; // L: 3528
																					if (field671 == 1 && var54.contentType == 206) { // L: 3529
																						var34 = 1;
																					}

																					if (var54.itemIds[dragItemSlotDestination] <= 0) {
																						var34 = 0; // L: 3530
																					}

																					var6 = class197.getWidgetFlags(var54); // L: 3532
																					boolean var35 = (var6 >> 29 & 1) != 0; // L: 3534
																					if (var35) { // L: 3536
																						var7 = dragItemSlotSource; // L: 3537
																						var8 = dragItemSlotDestination; // L: 3538
																						var54.itemIds[var8] = var54.itemIds[var7]; // L: 3539
																						var54.itemQuantities[var8] = var54.itemQuantities[var7]; // L: 3540
																						var54.itemIds[var7] = -1; // L: 3541
																						var54.itemQuantities[var7] = 0; // L: 3542
																					} else if (var34 == 1) { // L: 3544
																						var7 = dragItemSlotSource; // L: 3545
																						var8 = dragItemSlotDestination; // L: 3546

																						while (var7 != var8) { // L: 3547
																							if (var7 > var8) { // L: 3548
																								var54.swapItems(var7 - 1, var7); // L: 3549
																								--var7; // L: 3550
																							} else if (var7 < var8) { // L: 3552
																								var54.swapItems(var7 + 1, var7); // L: 3553
																								++var7; // L: 3554
																							}
																						}
																					} else {
																						var54.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 3559
																					}

																					var26 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3057, packetWriter.isaacCipher); // L: 3562
																					var26.packetBuffer.method8635(VerticalAlignment.dragInventoryWidget.id); // L: 3563
																					var26.packetBuffer.method8434(var34); // L: 3564
																					var26.packetBuffer.method8443(dragItemSlotSource); // L: 3565
																					var26.packetBuffer.writeShort(dragItemSlotDestination); // L: 3566
																					packetWriter.addNode(var26); // L: 3567
																				}
																			} else if (this.shouldLeftClickOpenMenu()) { // L: 3571
																				this.openMenu(draggedWidgetX, draggedWidgetY); // L: 3572
																			} else if (menuOptionsCount > 0) { // L: 3574
																				var3 = draggedWidgetX; // L: 3575
																				var4 = draggedWidgetY; // L: 3576
																				MenuAction var50 = PendingSpawn.tempMenuAction; // L: 3578
																				if (var50 != null) { // L: 3580
																					PacketBufferNode.method5389(var50.param0, var50.param1, var50.opcode, var50.identifier, var50.field883, var50.field884, var50.action, var3, var4); // L: 3581
																				}

																				PendingSpawn.tempMenuAction = null; // L: 3584
																			}

																			field697 = 10; // L: 3588
																			MouseHandler.MouseHandler_lastButton = 0; // L: 3589
																			VerticalAlignment.dragInventoryWidget = null; // L: 3590
																		} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 3593 3594
																			field616 = true; // L: 3595
																		}
																	}

																	if (Scene.shouldSendWalk()) { // L: 3600
																		var3 = Scene.Scene_selectedX; // L: 3601
																		var4 = Scene.Scene_selectedY; // L: 3602
																		PacketBufferNode var52 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3091, packetWriter.isaacCipher); // L: 3604
																		var52.packetBuffer.writeByte(5); // L: 3605
																		var52.packetBuffer.method8443(class158.baseY * 64 + var4); // L: 3606
																		var52.packetBuffer.method8546(field733.method3956(82) ? (field733.method3956(81) ? 2 : 1) : 0); // L: 3607
																		var52.packetBuffer.method8619(class26.baseX * 64 + var3); // L: 3608
																		packetWriter.addNode(var52); // L: 3609
																		Scene.method4311(); // L: 3610
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3611
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3612
																		mouseCrossColor = 1; // L: 3613
																		mouseCrossState = 0; // L: 3614
																		destinationX = var3; // L: 3615
																		destinationY = var4; // L: 3616
																	}

																	if (var40 != Occluder.mousedOverWidgetIf1) { // L: 3618
																		if (var40 != null) { // L: 3619
																			class143.invalidateWidget(var40);
																		}

																		if (Occluder.mousedOverWidgetIf1 != null) { // L: 3620
																			class143.invalidateWidget(Occluder.mousedOverWidgetIf1);
																		}
																	}

																	if (var33 != Occluder.field2556 && field527 == field786) { // L: 3622
																		if (var33 != null) { // L: 3623
																			class143.invalidateWidget(var33);
																		}

																		if (Occluder.field2556 != null) { // L: 3624
																			class143.invalidateWidget(Occluder.field2556);
																		}
																	}

																	if (Occluder.field2556 != null) { // L: 3626
																		if (field527 < field786) { // L: 3627
																			++field527; // L: 3628
																			if (field786 == field527) { // L: 3629
																				class143.invalidateWidget(Occluder.field2556);
																			}
																		}
																	} else if (field527 > 0) { // L: 3632
																		--field527;
																	}

																	if (oculusOrbState == 0) { // L: 3634
																		var3 = class296.localPlayer.x; // L: 3635
																		var4 = class296.localPlayer.y; // L: 3636
																		if (class31.oculusOrbFocalPointX - var3 < -500 || class31.oculusOrbFocalPointX - var3 > 500 || PendingSpawn.oculusOrbFocalPointY - var4 < -500 || PendingSpawn.oculusOrbFocalPointY - var4 > 500) { // L: 3637
																			class31.oculusOrbFocalPointX = var3; // L: 3638
																			PendingSpawn.oculusOrbFocalPointY = var4; // L: 3639
																		}

																		if (var3 != class31.oculusOrbFocalPointX) { // L: 3641
																			class31.oculusOrbFocalPointX += (var3 - class31.oculusOrbFocalPointX) / 16;
																		}

																		if (var4 != PendingSpawn.oculusOrbFocalPointY) { // L: 3642
																			PendingSpawn.oculusOrbFocalPointY += (var4 - PendingSpawn.oculusOrbFocalPointY) / 16;
																		}

																		var5 = class31.oculusOrbFocalPointX >> 7; // L: 3643
																		var6 = PendingSpawn.oculusOrbFocalPointY >> 7; // L: 3644
																		var7 = class132.getTileHeight(class31.oculusOrbFocalPointX, PendingSpawn.oculusOrbFocalPointY, ApproximateRouteStrategy.Client_plane); // L: 3645
																		var8 = 0; // L: 3646
																		if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) { // L: 3647
																			for (var9 = var5 - 4; var9 <= var5 + 4; ++var9) { // L: 3648
																				for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) { // L: 3649
																					var11 = ApproximateRouteStrategy.Client_plane; // L: 3650
																					if (var11 < 3 && (Tiles.Tiles_renderFlags[1][var9][var10] & 2) == 2) { // L: 3651
																						++var11;
																					}

																					var12 = var7 - Tiles.Tiles_heights[var11][var9][var10]; // L: 3652
																					if (var12 > var8) { // L: 3653
																						var8 = var12;
																					}
																				}
																			}
																		}

																		var9 = var8 * 192; // L: 3657
																		if (var9 > 98048) { // L: 3658
																			var9 = 98048;
																		}

																		if (var9 < 32768) { // L: 3659
																			var9 = 32768;
																		}

																		if (var9 > field590) { // L: 3660
																			field590 += (var9 - field590) / 24;
																		} else if (var9 < field590) { // L: 3661
																			field590 += (var9 - field590) / 80;
																		}

																		VarpDefinition.field1869 = class132.getTileHeight(class296.localPlayer.x, class296.localPlayer.y, ApproximateRouteStrategy.Client_plane) - camFollowHeight; // L: 3662
																	} else if (oculusOrbState == 1) { // L: 3664
																		class126.method2911(); // L: 3665
																		short var37 = -1; // L: 3666
																		if (field733.method3956(33)) { // L: 3667
																			var37 = 0;
																		} else if (field733.method3956(49)) { // L: 3668
																			var37 = 1024;
																		}

																		if (field733.method3956(48)) { // L: 3669
																			if (var37 == 0) { // L: 3670
																				var37 = 1792;
																			} else if (var37 == 1024) { // L: 3671
																				var37 = 1280;
																			} else {
																				var37 = 1536; // L: 3672
																			}
																		} else if (field733.method3956(50)) { // L: 3674
																			if (var37 == 0) { // L: 3675
																				var37 = 256;
																			} else if (var37 == 1024) { // L: 3676
																				var37 = 768;
																			} else {
																				var37 = 512; // L: 3677
																			}
																		}

																		byte var36 = 0; // L: 3679
																		if (field733.method3956(35)) { // L: 3680
																			var36 = -1;
																		} else if (field733.method3956(51)) { // L: 3681
																			var36 = 1;
																		}

																		var5 = 0; // L: 3682
																		if (var37 >= 0 || var36 != 0) { // L: 3683
																			var5 = field733.method3956(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed; // L: 3684
																			var5 *= 16; // L: 3685
																			field533 = var37; // L: 3686
																			field583 = var36; // L: 3687
																		}

																		if (field581 < var5) { // L: 3689
																			field581 += var5 / 8; // L: 3690
																			if (field581 > var5) { // L: 3691
																				field581 = var5;
																			}
																		} else if (field581 > var5) { // L: 3693
																			field581 = field581 * 9 / 10;
																		}

																		if (field581 > 0) { // L: 3694
																			var6 = field581 / 16; // L: 3695
																			if (field533 >= 0) { // L: 3696
																				var3 = field533 - WorldMapSection1.cameraYaw & 2047; // L: 3697
																				var7 = Rasterizer3D.Rasterizer3D_sine[var3]; // L: 3698
																				var8 = Rasterizer3D.Rasterizer3D_cosine[var3]; // L: 3699
																				class31.oculusOrbFocalPointX += var7 * var6 / 65536; // L: 3700
																				PendingSpawn.oculusOrbFocalPointY += var8 * var6 / 65536; // L: 3701
																			}

																			if (field583 != 0) { // L: 3703
																				VarpDefinition.field1869 += var6 * field583; // L: 3704
																				if (VarpDefinition.field1869 > 0) { // L: 3705
																					VarpDefinition.field1869 = 0;
																				}
																			}
																		} else {
																			field533 = -1; // L: 3709
																			field583 = -1; // L: 3710
																		}

																		if (field733.method3956(13)) { // L: 3712
																			class20.method292(); // L: 3713
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && class82.mouseCam) { // L: 3716
																		var3 = MouseHandler.MouseHandler_y - field743; // L: 3717
																		field576 = var3 * 2; // L: 3718
																		field743 = var3 != -1 && var3 != 1 ? (field743 + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y; // L: 3719
																		var4 = field577 - MouseHandler.MouseHandler_x; // L: 3720
																		field575 = var4 * 2; // L: 3721
																		field577 = var4 != -1 && var4 != 1 ? (field577 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x; // L: 3722
																	} else {
																		if (field733.method3956(96)) { // L: 3725
																			field575 += (-24 - field575) / 2;
																		} else if (field733.method3956(97)) { // L: 3726
																			field575 += (24 - field575) / 2;
																		} else {
																			field575 /= 2; // L: 3727
																		}

																		if (field733.method3956(98)) { // L: 3728
																			field576 += (12 - field576) / 2;
																		} else if (field733.method3956(99)) { // L: 3729
																			field576 += (-12 - field576) / 2;
																		} else {
																			field576 /= 2; // L: 3730
																		}

																		field743 = MouseHandler.MouseHandler_y; // L: 3731
																		field577 = MouseHandler.MouseHandler_x; // L: 3732
																	}

																	camAngleY = field575 / 2 + camAngleY & 2047; // L: 3734
																	camAngleX += field576 / 2; // L: 3735
																	if (camAngleX < 128) { // L: 3736
																		camAngleX = 128;
																	}

																	if (camAngleX > 383) { // L: 3737
																		camAngleX = 383;
																	}

																	if (field758) { // L: 3739
																		class96.method2519(SceneTilePaint.field2696, class103.field1344, class295.field3402); // L: 3740
																		UrlRequest.method2717(Widget.field3636, class31.field171); // L: 3741
																		if (SceneTilePaint.field2696 == TextureProvider.cameraX && class31.cameraY == class103.field1344 && class295.field3402 == class313.cameraZ && class408.cameraPitch == Widget.field3636 && WorldMapSection1.cameraYaw == class31.field171) { // L: 3742
																			field758 = false; // L: 3743
																			isCameraLocked = false; // L: 3744
																			class4.field11 = 0; // L: 3745
																			BuddyRankComparator.field1431 = 0; // L: 3746
																			MidiPcmStream.field3326 = 0; // L: 3747
																			MouseHandler.field254 = 0; // L: 3748
																			HealthBarDefinition.field1912 = 0; // L: 3749
																			UrlRequest.field1398 = 0; // L: 3750
																			class323.field4093 = 0; // L: 3751
																			class278.field3264 = 0; // L: 3752
																			class11.field62 = 0; // L: 3753
																			WorldMapData_1.field2829 = 0; // L: 3754
																		}
																	} else if (isCameraLocked) { // L: 3758
																		var3 = class278.field3264 * 16384 + 64; // L: 3759
																		var4 = class11.field62 * 128 + 64; // L: 3760
																		var5 = class132.getTileHeight(var3, var4, ApproximateRouteStrategy.Client_plane) - WorldMapData_1.field2829; // L: 3761
																		class96.method2519(var3, var5, var4); // L: 3762
																		var3 = class4.field11 * 16384 + 64; // L: 3763
																		var4 = BuddyRankComparator.field1431 * 128 + 64; // L: 3764
																		var5 = class132.getTileHeight(var3, var4, ApproximateRouteStrategy.Client_plane) - MidiPcmStream.field3326; // L: 3765
																		var6 = var3 - TextureProvider.cameraX; // L: 3766
																		var7 = var5 - class31.cameraY; // L: 3767
																		var8 = var4 - class313.cameraZ; // L: 3768
																		var9 = (int)Math.sqrt((double)(var6 * var6 + var8 * var8)); // L: 3769
																		var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.9490051269531D) & 2047; // L: 3770
																		var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.9490051269531D) & 2047; // L: 3771
																		UrlRequest.method2717(var10, var11); // L: 3772
																	}

																	for (var3 = 0; var3 < 5; ++var3) { // L: 3774
																		var10002 = field763[var3]++;
																	}

																	Projectile.varcs.tryWrite(); // L: 3775
																	var3 = ++MouseHandler.MouseHandler_idleCycles - 1; // L: 3778
																	var5 = GameEngine.field227.method353(); // L: 3783
																	if (var3 > 15000 && var5 > 15000) { // L: 3786
																		logoutTimer = 250; // L: 3787
																		MouseHandler.MouseHandler_idleCycles = 14500; // L: 3789
																		var26 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3084, packetWriter.isaacCipher); // L: 3792
																		packetWriter.addNode(var26); // L: 3793
																	}

																	DecorativeObject.friendSystem.processFriendUpdates(); // L: 3795
																	++packetWriter.pendingWrites; // L: 3796
																	if (packetWriter.pendingWrites > 50) { // L: 3797
																		var26 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3040, packetWriter.isaacCipher); // L: 3799
																		packetWriter.addNode(var26); // L: 3800
																	}

																	try {
																		packetWriter.flush(); // L: 3803
																	} catch (IOException var27) { // L: 3805
																		WorldMapSection0.method5101(); // L: 3806
																	}

																	return; // L: 3808
																}

																ModeWhere.method6590(var53); // L: 3516
															}
														}

														var46 = var51.widget; // L: 3504
														if (var46.childIndex < 0) { // L: 3505
															break;
														}

														var47 = class281.getWidget(var46.parentId); // L: 3506
													} while(var47 == null || var47.children == null || var46.childIndex >= var47.children.length || var46 != var47.children[var46.childIndex]); // L: 3507

													ServerPacket.runScriptEvent(var51); // L: 3511
												}
											}

											var46 = var51.widget; // L: 3492
											if (var46.childIndex < 0) { // L: 3493
												break;
											}

											var47 = class281.getWidget(var46.parentId); // L: 3494
										} while(var47 == null || var47.children == null || var46.childIndex >= var47.children.length || var46 != var47.children[var46.childIndex]); // L: 3495

										ServerPacket.runScriptEvent(var51); // L: 3499
									}
								}

								var46 = var51.widget; // L: 3480
								if (var46.childIndex < 0) { // L: 3481
									break;
								}

								var47 = class281.getWidget(var46.parentId); // L: 3482
							} while(var47 == null || var47.children == null || var46.childIndex >= var47.children.length || var46 != var47.children[var46.childIndex]); // L: 3483

							ServerPacket.runScriptEvent(var51); // L: 3487
						}
					}

					var30 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3000, packetWriter.isaacCipher); // L: 3099
					var30.packetBuffer.writeByte(0); // L: 3100
					var3 = var30.packetBuffer.offset; // L: 3101
					class86.performReflectionCheck(var30.packetBuffer); // L: 3102
					var30.packetBuffer.method8433(var30.packetBuffer.offset - var3); // L: 3103
					packetWriter.addNode(var30); // L: 3104
				}
			}
		}
	} // L: 3081

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "141269332"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GameEngine.canvasWidth; // L: 4470
		int var2 = class10.canvasHeight; // L: 4471
		if (super.contentWidth < var1) { // L: 4472
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 4473
		}

		if (BufferedSink.clientPreferences != null) { // L: 4474
			try {
				class27.method402(ClanChannelMember.client, "resize", new Object[]{class13.getWindowedMode()}); // L: 4476
			} catch (Throwable var4) { // L: 4478
			}
		}

	} // L: 4480

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "80"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) { // L: 4483
			ByteArrayPool.method7164(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4484
			if (field717[var1]) { // L: 4485
				field718[var1] = true;
			}

			field657[var1] = field717[var1]; // L: 4486
			field717[var1] = false; // L: 4487
		}

		field739 = cycle; // L: 4489
		viewportX = -1; // L: 4490
		viewportY = -1; // L: 4491
		class168.hoveredItemContainer = null; // L: 4492
		if (rootInterface != -1) { // L: 4493
			rootWidgetCount = 0; // L: 4494
			KeyHandler.drawWidgets(rootInterface, 0, 0, GameEngine.canvasWidth, class10.canvasHeight, 0, 0, -1); // L: 4495
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4497
		if (showMouseCross) { // L: 4498
			if (mouseCrossColor == 1) { // L: 4499
				class199.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4500
			}

			if (mouseCrossColor == 2) { // L: 4502
				class199.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4503
			}
		}

		if (!isMenuOpen) { // L: 4506
			if (viewportX != -1) { // L: 4507
				WorldMapData_0.method4667(viewportX, viewportY);
			}
		} else {
			var1 = class103.menuX; // L: 4510
			int var2 = class108.menuY; // L: 4511
			int var3 = class174.menuWidth; // L: 4512
			int var4 = WorldMapScaleHandler.menuHeight; // L: 4513
			int var5 = 6116423; // L: 4514
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5); // L: 4515
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0); // L: 4516
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0); // L: 4517
			UserComparator3.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1); // L: 4518
			int var6 = MouseHandler.MouseHandler_x; // L: 4519
			int var7 = MouseHandler.MouseHandler_y; // L: 4520

			for (int var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 4521
				int var9 = var2 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 4522
				int var10 = 16777215; // L: 4523
				if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) { // L: 4524
					var10 = 16776960;
				}

				UserComparator3.fontBold12.draw(FaceNormal.method4461(var8), var1 + 3, var9, var10, 0); // L: 4525
			}

			UserComparator8.method2749(class103.menuX, class108.menuY, class174.menuWidth, WorldMapScaleHandler.menuHeight); // L: 4527
		}

		if (gameDrawingMode == 3) { // L: 4529
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4530
				if (field657[var1]) { // L: 4531
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4532
				} else if (field718[var1]) { // L: 4534
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4535
				}
			}
		}

		ApproximateRouteStrategy.method1163(ApproximateRouteStrategy.Client_plane, class296.localPlayer.x, class296.localPlayer.y, field558); // L: 4539
		field558 = 0; // L: 4540
	} // L: 4541

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Ldc;IB)Z",
		garbageValue = "16"
	)
	boolean method1200(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 6164
			MenuAction.friendsChatManager = null; // L: 6165
		} else {
			if (MenuAction.friendsChatManager == null) { // L: 6168
				MenuAction.friendsChatManager = new FriendsChatManager(ViewportMouse.loginType, ClanChannelMember.client); // L: 6169
			}

			MenuAction.friendsChatManager.method7267(var1.packetBuffer, var2); // L: 6171
		}

		GrandExchangeOffer.method6524(); // L: 6173
		var1.serverPacket = null; // L: 6174
		return true; // L: 6175
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Ldc;S)Z",
		garbageValue = "-7257"
	)
	boolean method1217(PacketWriter var1) {
		if (MenuAction.friendsChatManager != null) { // L: 6179
			MenuAction.friendsChatManager.method7268(var1.packetBuffer); // L: 6180
		}

		GrandExchangeOffer.method6524(); // L: 6182
		var1.serverPacket = null; // L: 6183
		return true; // L: 6184
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(Ldc;S)Z",
		garbageValue = "1841"
	)
	final boolean method1202(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6189
		PacketBuffer var3 = var1.packetBuffer; // L: 6190
		if (var2 == null) { // L: 6191
			return false;
		} else {
			String var21;
			int var22;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6193
					if (var1.field1368) { // L: 6194
						if (!var2.isAvailable(1)) { // L: 6195
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6196
						var1.field1371 = 0; // L: 6197
						var1.field1368 = false; // L: 6198
					}

					var3.offset = 0; // L: 6200
					if (var3.method8346()) { // L: 6201
						if (!var2.isAvailable(1)) { // L: 6202
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6203
						var1.field1371 = 0; // L: 6204
					}

					var1.field1368 = true; // L: 6206
					ServerPacket[] var4 = VarcInt.ServerPacket_values(); // L: 6207
					var5 = var3.readSmartByteShortIsaac(); // L: 6208
					if (var5 < 0 || var5 >= var4.length) { // L: 6209
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6210
					var1.serverPacketLength = var1.serverPacket.length; // L: 6211
				}

				if (var1.serverPacketLength == -1) { // L: 6213
					if (!var2.isAvailable(1)) { // L: 6214
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6215
					var1.serverPacketLength = var3.array[0] & 255; // L: 6216
				}

				if (var1.serverPacketLength == -2) { // L: 6218
					if (!var2.isAvailable(2)) { // L: 6219
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6220
					var3.offset = 0; // L: 6221
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6222
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6224
					return false;
				}

				var3.offset = 0; // L: 6225
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6226
				var1.field1371 = 0; // L: 6227
				timer.method7167(); // L: 6228
				var1.field1381 = var1.field1373; // L: 6229
				var1.field1373 = var1.field1380; // L: 6230
				var1.field1380 = var1.serverPacket; // L: 6231
				if (ServerPacket.field3136 == var1.serverPacket) { // L: 6232
					class363.method6873(class273.field3109); // L: 6233
					var1.serverPacket = null; // L: 6234
					return true; // L: 6235
				}

				Widget var6;
				int var20;
				if (ServerPacket.field3142 == var1.serverPacket) { // L: 6237
					var20 = var3.method8458(); // L: 6238
					var5 = var3.method8484(); // L: 6239
					var6 = class281.getWidget(var20); // L: 6240
					if (var6.modelType != 1 || var5 != var6.modelId) { // L: 6241
						var6.modelType = 1; // L: 6242
						var6.modelId = var5; // L: 6243
						class143.invalidateWidget(var6); // L: 6244
					}

					var1.serverPacket = null; // L: 6246
					return true; // L: 6247
				}

				String var52;
				if (ServerPacket.field3170 == var1.serverPacket) { // L: 6249
					var20 = var3.method8436(); // L: 6250
					var5 = var3.method8436(); // L: 6251
					var52 = var3.readStringCp1252NullTerminated(); // L: 6252
					if (var5 >= 1 && var5 <= 8) { // L: 6253
						if (var52.equalsIgnoreCase("null")) { // L: 6254
							var52 = null;
						}

						playerMenuActions[var5 - 1] = var52; // L: 6255
						playerOptionsPriorities[var5 - 1] = var20 == 0; // L: 6256
					}

					var1.serverPacket = null; // L: 6258
					return true; // L: 6259
				}

				if (ServerPacket.field3182 == var1.serverPacket) { // L: 6261
					DevicePcmPlayerProvider.field122 = var3.method8436(); // L: 6262
					class11.field64 = var3.method8435(); // L: 6263

					for (var20 = DevicePcmPlayerProvider.field122; var20 < DevicePcmPlayerProvider.field122 + 8; ++var20) { // L: 6264
						for (var5 = class11.field64; var5 < class11.field64 + 8; ++var5) { // L: 6265
							if (groundItems[ApproximateRouteStrategy.Client_plane][var20][var5] != null) { // L: 6266
								groundItems[ApproximateRouteStrategy.Client_plane][var20][var5] = null; // L: 6267
								class162.updateItemPile(var20, var5); // L: 6268
							}
						}
					}

					for (PendingSpawn var51 = (PendingSpawn)pendingSpawns.last(); var51 != null; var51 = (PendingSpawn)pendingSpawns.previous()) { // L: 6272 6273 6275
						if (var51.x >= DevicePcmPlayerProvider.field122 && var51.x < DevicePcmPlayerProvider.field122 + 8 && var51.y >= class11.field64 && var51.y < class11.field64 + 8 && var51.plane == ApproximateRouteStrategy.Client_plane) { // L: 6274
							var51.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 6277
					return true; // L: 6278
				}

				String var47;
				if (ServerPacket.field3210 == var1.serverPacket) { // L: 6280
					var47 = var3.readStringCp1252NullTerminated(); // L: 6281
					Object[] var76 = new Object[var47.length() + 1]; // L: 6282

					for (var22 = var47.length() - 1; var22 >= 0; --var22) { // L: 6283
						if (var47.charAt(var22) == 's') { // L: 6284
							var76[var22 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var76[var22 + 1] = new Integer(var3.readInt()); // L: 6285
						}
					}

					var76[0] = new Integer(var3.readInt()); // L: 6287
					ScriptEvent var61 = new ScriptEvent(); // L: 6288
					var61.args = var76; // L: 6289
					ServerPacket.runScriptEvent(var61); // L: 6290
					var1.serverPacket = null; // L: 6291
					return true; // L: 6292
				}

				if (ServerPacket.field3237 == var1.serverPacket) { // L: 6294
					class363.method6873(class273.field3112); // L: 6295
					var1.serverPacket = null; // L: 6296
					return true; // L: 6297
				}

				GameObject var14;
				int var15;
				int var16;
				String var25;
				byte var68;
				if (ServerPacket.field3192 == var1.serverPacket) { // L: 6299
					var68 = var3.readByte(); // L: 6300
					var21 = var3.readStringCp1252NullTerminated(); // L: 6301
					long var23 = (long)var3.readUnsignedShort(); // L: 6302
					long var8 = (long)var3.readMedium(); // L: 6303
					PlayerType var59 = (PlayerType)DecorativeObject.findEnumerated(class303.PlayerType_values(), var3.readUnsignedByte()); // L: 6304
					long var11 = var8 + (var23 << 32); // L: 6305
					boolean var66 = false; // L: 6306
					var14 = null; // L: 6307
					ClanChannel var67 = var68 >= 0 ? currentClanChannels[var68] : class198.guestClanChannel; // L: 6309
					if (var67 == null) { // L: 6310
						var66 = true; // L: 6311
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var59.isUser && DecorativeObject.friendSystem.isIgnored(new Username(var21, ViewportMouse.loginType))) { // L: 6320 6321
									var66 = true;
								}
								break;
							}

							if (var11 == field775[var15]) { // L: 6315
								var66 = true; // L: 6316
								break; // L: 6317
							}

							++var15; // L: 6314
						}
					}

					if (!var66) { // L: 6324
						field775[field732] = var11; // L: 6325
						field732 = (field732 + 1) % 100; // L: 6326
						var25 = AbstractFont.escapeBrackets(class296.method5721(var3)); // L: 6327
						var16 = var68 >= 0 ? 41 : 44; // L: 6328
						if (var59.modIcon != -1) { // L: 6329
							ItemContainer.addChatMessage(var16, class268.method5367(var59.modIcon) + var21, var25, var67.name);
						} else {
							ItemContainer.addChatMessage(var16, var21, var25, var67.name); // L: 6330
						}
					}

					var1.serverPacket = null; // L: 6332
					return true; // L: 6333
				}

				NPC var7;
				int var26;
				if (ServerPacket.field3141 == var1.serverPacket) { // L: 6335
					var22 = var3.readUnsignedByte(); // L: 6339
					var20 = var3.method8484(); // L: 6340
					var5 = var3.method8446(); // L: 6341
					if (var5 == 65535) { // L: 6342
						var5 = -1; // L: 6343
					}

					var7 = npcs[var20]; // L: 6345
					if (var7 != null) { // L: 6346
						if (var5 == var7.sequence && var5 != -1) { // L: 6347
							var26 = WorldMapElement.SequenceDefinition_get(var5).field2232; // L: 6348
							if (var26 == 1) { // L: 6349
								var7.sequenceFrame = 0; // L: 6350
								var7.sequenceFrameCycle = 0; // L: 6351
								var7.sequenceDelay = var22; // L: 6352
								var7.field1210 = 0; // L: 6353
							} else if (var26 == 2) { // L: 6355
								var7.field1210 = 0; // L: 6356
							}
						} else if (var5 == -1 || var7.sequence == -1 || WorldMapElement.SequenceDefinition_get(var5).field2225 >= WorldMapElement.SequenceDefinition_get(var7.sequence).field2225) { // L: 6359
							var7.sequence = var5; // L: 6360
							var7.sequenceFrame = 0; // L: 6361
							var7.sequenceFrameCycle = 0; // L: 6362
							var7.sequenceDelay = var22; // L: 6363
							var7.field1210 = 0; // L: 6364
							var7.field1211 = var7.pathLength; // L: 6365
						}
					}

					var1.serverPacket = null; // L: 6369
					return true; // L: 6370
				}

				if (ServerPacket.field3199 == var1.serverPacket) { // L: 6372
					class157.field1745 = null; // L: 6373
					var1.serverPacket = null; // L: 6374
					return true; // L: 6375
				}

				if (ServerPacket.field3147 == var1.serverPacket) { // L: 6377
					var20 = var3.readInt(); // L: 6378
					InterfaceParent var75 = (InterfaceParent)interfaceParents.get((long)var20); // L: 6379
					if (var75 != null) { // L: 6380
						class7.closeInterface(var75, true);
					}

					if (meslayerContinueWidget != null) { // L: 6381
						class143.invalidateWidget(meslayerContinueWidget); // L: 6382
						meslayerContinueWidget = null; // L: 6383
					}

					var1.serverPacket = null; // L: 6385
					return true; // L: 6386
				}

				if (ServerPacket.field3222 == var1.serverPacket && isCameraLocked) { // L: 6388 6389
					field758 = true; // L: 6390
					class323.field4093 = var3.readUnsignedByte(); // L: 6391
					UrlRequest.field1398 = var3.readUnsignedByte(); // L: 6392
					MouseHandler.field254 = var3.readUnsignedByte(); // L: 6393
					HealthBarDefinition.field1912 = var3.readUnsignedByte(); // L: 6394

					for (var20 = 0; var20 < 5; ++var20) { // L: 6395
						field556[var20] = false;
					}

					var1.serverPacket = null; // L: 6396
					return true; // L: 6397
				}

				if (ServerPacket.field3220 == var1.serverPacket) { // L: 6400
					rebootTimer = var3.method8484() * 30; // L: 6401
					field499 = cycleCntr; // L: 6402
					var1.serverPacket = null; // L: 6403
					return true; // L: 6404
				}

				if (ServerPacket.field3225 == var1.serverPacket) { // L: 6406
					class363.method6873(class273.field3107); // L: 6407
					var1.serverPacket = null; // L: 6408
					return true; // L: 6409
				}

				boolean var77;
				if (ServerPacket.field3190 == var1.serverPacket) { // L: 6411
					var77 = var3.readUnsignedByte() == 1; // L: 6412
					if (var77) { // L: 6413
						class101.field1307 = UserComparator8.method2748() - var3.readLong(); // L: 6414
						WorldMapCacheName.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 6415
					} else {
						WorldMapCacheName.grandExchangeEvents = null; // L: 6417
					}

					field706 = cycleCntr; // L: 6418
					var1.serverPacket = null; // L: 6419
					return true; // L: 6420
				}

				if (ServerPacket.field3186 == var1.serverPacket) { // L: 6422
					class6.loadRegions(true, var1.packetBuffer); // L: 6423
					var1.serverPacket = null; // L: 6424
					return true; // L: 6425
				}

				if (ServerPacket.field3161 == var1.serverPacket) { // L: 6427
					class363.method6873(class273.field3118); // L: 6428
					var1.serverPacket = null; // L: 6429
					return true; // L: 6430
				}

				if (ServerPacket.field3195 == var1.serverPacket) { // L: 6432
					var20 = var3.readInt(); // L: 6433
					var5 = var3.readInt(); // L: 6434
					var22 = WorldMapLabel.getGcDuration(); // L: 6435
					PacketBufferNode var57 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3070, packetWriter.isaacCipher); // L: 6437
					var57.packetBuffer.writeInt(var20); // L: 6438
					var57.packetBuffer.method8437(var5); // L: 6439
					var57.packetBuffer.method8546(var22); // L: 6440
					var57.packetBuffer.method8434(GameEngine.fps); // L: 6441
					packetWriter.addNode(var57); // L: 6442
					var1.serverPacket = null; // L: 6443
					return true; // L: 6444
				}

				if (ServerPacket.field3232 == var1.serverPacket) { // L: 6446
					var20 = var3.method8457(); // L: 6447
					var5 = var3.method8484(); // L: 6448
					var6 = class281.getWidget(var20); // L: 6449
					if (var6 != null && var6.type == 0) { // L: 6450
						if (var5 > var6.scrollHeight - var6.height) { // L: 6451
							var5 = var6.scrollHeight - var6.height;
						}

						if (var5 < 0) { // L: 6452
							var5 = 0;
						}

						if (var5 != var6.scrollY) { // L: 6453
							var6.scrollY = var5; // L: 6454
							class143.invalidateWidget(var6); // L: 6455
						}
					}

					var1.serverPacket = null; // L: 6458
					return true; // L: 6459
				}

				if (ServerPacket.field3168 == var1.serverPacket) { // L: 6461
					class363.method6873(class273.field3111); // L: 6462
					var1.serverPacket = null; // L: 6463
					return true; // L: 6464
				}

				int var27;
				Widget var28;
				if (ServerPacket.field3137 == var1.serverPacket) { // L: 6466
					var20 = var3.method8484(); // L: 6467
					var5 = var3.method8444(); // L: 6468
					var22 = var3.method8446(); // L: 6469
					var27 = var3.readInt(); // L: 6470
					var28 = class281.getWidget(var27); // L: 6471
					if (var20 != var28.modelAngleX || var5 != var28.modelAngleY || var22 != var28.modelZoom) { // L: 6472
						var28.modelAngleX = var20; // L: 6473
						var28.modelAngleY = var5; // L: 6474
						var28.modelZoom = var22; // L: 6475
						class143.invalidateWidget(var28); // L: 6476
					}

					var1.serverPacket = null; // L: 6478
					return true; // L: 6479
				}

				if (ServerPacket.field3189 == var1.serverPacket) { // L: 6481
					for (var20 = 0; var20 < players.length; ++var20) { // L: 6482
						if (players[var20] != null) { // L: 6483
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) { // L: 6485
						if (npcs[var20] != null) { // L: 6486
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 6488
					return true; // L: 6489
				}

				if (ServerPacket.field3200 == var1.serverPacket) { // L: 6491
					minimapState = var3.readUnsignedByte(); // L: 6492
					var1.serverPacket = null; // L: 6493
					return true; // L: 6494
				}

				Widget var54;
				if (ServerPacket.field3135 == var1.serverPacket) { // L: 6496
					var20 = var3.method8444(); // L: 6497
					var5 = var3.method8444(); // L: 6498
					var22 = var3.method8458(); // L: 6499
					var54 = class281.getWidget(var22); // L: 6500
					var54.field3533 = var5 + (var20 << 16); // L: 6501
					var1.serverPacket = null; // L: 6502
					return true; // L: 6503
				}

				if (ServerPacket.field3218 == var1.serverPacket) { // L: 6505
					class363.method6873(class273.field3113); // L: 6506
					var1.serverPacket = null; // L: 6507
					return true; // L: 6508
				}

				if (ServerPacket.field3228 == var1.serverPacket) { // L: 6510
					var47 = var3.readStringCp1252NullTerminated(); // L: 6511
					var21 = AbstractFont.escapeBrackets(HealthBarDefinition.method3513(class296.method5721(var3))); // L: 6512
					MouseHandler.addGameMessage(6, var47, var21); // L: 6513
					var1.serverPacket = null; // L: 6514
					return true; // L: 6515
				}

				if (ServerPacket.field3151 == var1.serverPacket) { // L: 6517
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) { // L: 6518
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) { // L: 6519
							Varps.Varps_main[var20] = Varps.Varps_temp[var20]; // L: 6520
							ClanChannel.changeGameOptions(var20); // L: 6521
							field788[++field547 - 1 & 31] = var20; // L: 6522
						}
					}

					var1.serverPacket = null; // L: 6525
					return true; // L: 6526
				}

				if (ServerPacket.field3214 == var1.serverPacket) { // L: 6528
					return this.method1200(var1, 1); // L: 6529
				}

				if (ServerPacket.field3166 == var1.serverPacket) { // L: 6531
					class123.method2869(); // L: 6532
					var68 = var3.readByte(); // L: 6533
					class138 var74 = new class138(var3); // L: 6534
					ClanSettings var60;
					if (var68 >= 0) { // L: 6536
						var60 = currentClanSettings[var68];
					} else {
						var60 = class121.guestClanSettings; // L: 6537
					}

					var74.method3003(var60); // L: 6538
					var1.serverPacket = null; // L: 6539
					return true; // L: 6540
				}

				if (ServerPacket.field3145 == var1.serverPacket) { // L: 6542
					class376.logOut(); // L: 6543
					var1.serverPacket = null; // L: 6544
					return false; // L: 6545
				}

				if (ServerPacket.field3206 == var1.serverPacket) { // L: 6547
					var20 = var3.readInt(); // L: 6548
					var5 = var3.method8446(); // L: 6549
					Varps.Varps_temp[var5] = var20; // L: 6550
					if (Varps.Varps_main[var5] != var20) { // L: 6551
						Varps.Varps_main[var5] = var20; // L: 6552
					}

					ClanChannel.changeGameOptions(var5); // L: 6554
					field788[++field547 - 1 & 31] = var5; // L: 6555
					var1.serverPacket = null; // L: 6556
					return true; // L: 6557
				}

				long var9;
				if (ServerPacket.field3242 == var1.serverPacket) { // L: 6559
					var20 = var3.method8444(); // L: 6560
					if (var20 == 65535) { // L: 6561
						var20 = -1;
					}

					var5 = var3.method8444(); // L: 6562
					if (var5 == 65535) { // L: 6563
						var5 = -1;
					}

					var22 = var3.readInt(); // L: 6564
					var27 = var3.readInt(); // L: 6565

					for (var26 = var20; var26 <= var5; ++var26) { // L: 6566
						var9 = ((long)var27 << 32) + (long)var26; // L: 6567
						Node var79 = widgetFlags.get(var9); // L: 6568
						if (var79 != null) { // L: 6569
							var79.remove();
						}

						widgetFlags.put(new IntegerNode(var22), var9); // L: 6570
					}

					var1.serverPacket = null; // L: 6572
					return true; // L: 6573
				}

				if (ServerPacket.field3238 == var1.serverPacket) { // L: 6575
					class363.method6873(class273.field3117); // L: 6576
					var1.serverPacket = null; // L: 6577
					return true; // L: 6578
				}

				if (ServerPacket.field3185 == var1.serverPacket) { // L: 6580
					var20 = var3.readUnsignedByte(); // L: 6581
					class376.forceDisconnect(var20); // L: 6582
					var1.serverPacket = null; // L: 6583
					return false; // L: 6584
				}

				if (ServerPacket.field3183 == var1.serverPacket) { // L: 6586
					class363.method6873(class273.field3110); // L: 6587
					var1.serverPacket = null; // L: 6588
					return true; // L: 6589
				}

				if (ServerPacket.field3162 == var1.serverPacket) { // L: 6591
					var3.offset += 28; // L: 6592
					if (var3.checkCrc()) { // L: 6593
						WorldMapIcon_0.method5075(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 6594
					return true; // L: 6595
				}

				int var30;
				if (ServerPacket.field3153 == var1.serverPacket) { // L: 6597
					var20 = var3.readInt(); // L: 6598
					var5 = var3.readUnsignedShort(); // L: 6599
					if (var20 < -70000) { // L: 6600
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 6602
						var6 = class281.getWidget(var20);
					} else {
						var6 = null; // L: 6603
					}

					for (; var3.offset < var1.serverPacketLength; FaceNormal.itemContainerSetItem(var5, var27, var26 - 1, var30)) { // L: 6604 6618
						var27 = var3.readUShortSmart(); // L: 6605
						var26 = var3.readUnsignedShort(); // L: 6606
						var30 = 0; // L: 6607
						if (var26 != 0) { // L: 6608
							var30 = var3.readUnsignedByte(); // L: 6609
							if (var30 == 255) { // L: 6610
								var30 = var3.readInt();
							}
						}

						if (var6 != null && var27 >= 0 && var27 < var6.itemIds.length) { // L: 6612 6613
							var6.itemIds[var27] = var26; // L: 6614
							var6.itemQuantities[var27] = var30; // L: 6615
						}
					}

					if (var6 != null) { // L: 6620
						class143.invalidateWidget(var6);
					}

					ItemComposition.method3786(); // L: 6621
					field694[++field695 - 1 & 31] = var5 & 32767; // L: 6622
					var1.serverPacket = null; // L: 6623
					return true; // L: 6624
				}

				if (ServerPacket.field3165 == var1.serverPacket) { // L: 6626
					publicChatMode = var3.method8435(); // L: 6627
					tradeChatMode = var3.readUnsignedByte(); // L: 6628
					var1.serverPacket = null; // L: 6629
					return true; // L: 6630
				}

				if (ServerPacket.field3213 == var1.serverPacket) { // L: 6632
					class363.method6873(class273.field3114); // L: 6633
					var1.serverPacket = null; // L: 6634
					return true; // L: 6635
				}

				if (ServerPacket.field3240 == var1.serverPacket) { // L: 6637
					class363.method6873(class273.field3121); // L: 6638
					var1.serverPacket = null; // L: 6639
					return true; // L: 6640
				}

				boolean var63;
				if (ServerPacket.field3216 == var1.serverPacket) { // L: 6642
					var20 = var3.readUShortSmart(); // L: 6643
					var63 = var3.readUnsignedByte() == 1; // L: 6644
					var52 = ""; // L: 6645
					boolean var82 = false; // L: 6646
					if (var63) { // L: 6647
						var52 = var3.readStringCp1252NullTerminated(); // L: 6648
						if (DecorativeObject.friendSystem.isIgnored(new Username(var52, ViewportMouse.loginType))) { // L: 6649
							var82 = true;
						}
					}

					String var80 = var3.readStringCp1252NullTerminated(); // L: 6651
					if (!var82) { // L: 6652
						MouseHandler.addGameMessage(var20, var52, var80);
					}

					var1.serverPacket = null; // L: 6653
					return true; // L: 6654
				}

				Widget var70;
				if (ServerPacket.field3184 == var1.serverPacket) { // L: 6656
					var20 = var3.method8457(); // L: 6657
					var70 = class281.getWidget(var20); // L: 6658
					var70.modelType = 3; // L: 6659
					var70.modelId = class296.localPlayer.appearance.getChatHeadId(); // L: 6660
					class143.invalidateWidget(var70); // L: 6661
					var1.serverPacket = null; // L: 6662
					return true; // L: 6663
				}

				long var12;
				long var31;
				long var33;
				if (ServerPacket.field3194 == var1.serverPacket) { // L: 6665
					var47 = var3.readStringCp1252NullTerminated(); // L: 6666
					var31 = var3.readLong(); // L: 6667
					var33 = (long)var3.readUnsignedShort(); // L: 6668
					var9 = (long)var3.readMedium(); // L: 6669
					PlayerType var29 = (PlayerType)DecorativeObject.findEnumerated(class303.PlayerType_values(), var3.readUnsignedByte()); // L: 6670
					var12 = var9 + (var33 << 32); // L: 6671
					boolean var84 = false; // L: 6672

					for (var15 = 0; var15 < 100; ++var15) { // L: 6673
						if (var12 == field775[var15]) { // L: 6674
							var84 = true; // L: 6675
							break; // L: 6676
						}
					}

					if (var29.isUser && DecorativeObject.friendSystem.isIgnored(new Username(var47, ViewportMouse.loginType))) { // L: 6679 6680
						var84 = true;
					}

					if (!var84 && field687 == 0) { // L: 6682
						field775[field732] = var12; // L: 6683
						field732 = (field732 + 1) % 100; // L: 6684
						var25 = AbstractFont.escapeBrackets(HealthBarDefinition.method3513(class296.method5721(var3))); // L: 6685
						if (var29.modIcon != -1) { // L: 6686
							ItemContainer.addChatMessage(9, class268.method5367(var29.modIcon) + var47, var25, WorldMapEvent.base37DecodeLong(var31));
						} else {
							ItemContainer.addChatMessage(9, var47, var25, WorldMapEvent.base37DecodeLong(var31)); // L: 6687
						}
					}

					var1.serverPacket = null; // L: 6689
					return true; // L: 6690
				}

				if (ServerPacket.field3236 == var1.serverPacket) { // L: 6692
					GameObject.field2733 = true; // L: 6693
					WorldMapSection0.updateNpcs(true, var3); // L: 6694
					var1.serverPacket = null; // L: 6695
					return true; // L: 6696
				}

				if (ServerPacket.field3131 == var1.serverPacket) { // L: 6698
					var20 = var3.readUnsignedByte(); // L: 6699
					PcmPlayer.method841(var20); // L: 6700
					var1.serverPacket = null; // L: 6701
					return true; // L: 6702
				}

				if (ServerPacket.field3160 == var1.serverPacket) { // L: 6704
					class145.readReflectionCheck(var3, var1.serverPacketLength); // L: 6705
					var1.serverPacket = null; // L: 6706
					return true; // L: 6707
				}

				if (ServerPacket.field3144 == var1.serverPacket) { // L: 6709
					class11.field64 = var3.method8623(); // L: 6710
					DevicePcmPlayerProvider.field122 = var3.readUnsignedByte(); // L: 6711

					while (var3.offset < var1.serverPacketLength) { // L: 6712
						var20 = var3.readUnsignedByte(); // L: 6713
						class273 var73 = Tiles.method2169()[var20]; // L: 6714
						class363.method6873(var73); // L: 6715
					}

					var1.serverPacket = null; // L: 6717
					return true; // L: 6718
				}

				if (ServerPacket.field3193 == var1.serverPacket) { // L: 6720
					isCameraLocked = true; // L: 6721
					field758 = false; // L: 6722
					class278.field3264 = var3.readUnsignedByte() * 128; // L: 6723
					class11.field62 = var3.readUnsignedByte() * 16384; // L: 6724
					WorldMapData_1.field2829 = var3.readUnsignedShort(); // L: 6725
					class323.field4093 = var3.readUnsignedByte(); // L: 6726
					UrlRequest.field1398 = var3.readUnsignedByte(); // L: 6727
					if (UrlRequest.field1398 >= 100) { // L: 6728
						TextureProvider.cameraX = class278.field3264 * 16384 + 64; // L: 6729
						class313.cameraZ = class11.field62 * 128 + 64; // L: 6730
						class31.cameraY = class132.getTileHeight(TextureProvider.cameraX, class313.cameraZ, ApproximateRouteStrategy.Client_plane) - WorldMapData_1.field2829; // L: 6731
					}

					var1.serverPacket = null; // L: 6733
					return true; // L: 6734
				}

				if (ServerPacket.field3156 == var1.serverPacket) { // L: 6736
					WorldMapCacheName.updatePlayers(var3, var1.serverPacketLength); // L: 6737
					class377.method7197(); // L: 6738
					var1.serverPacket = null; // L: 6739
					return true; // L: 6740
				}

				if (ServerPacket.field3233 == var1.serverPacket) { // L: 6742
					Script.field972 = true; // L: 6743
					WorldMapCacheName.updatePlayers(var3, var1.serverPacketLength); // L: 6744
					class377.method7197(); // L: 6745
					var1.serverPacket = null; // L: 6746
					return true; // L: 6747
				}

				if (ServerPacket.field3229 == var1.serverPacket) { // L: 6749
					class316.method6251(var3.readStringCp1252NullTerminated()); // L: 6750
					var1.serverPacket = null; // L: 6751
					return true; // L: 6752
				}

				if (ServerPacket.field3143 == var1.serverPacket) { // L: 6754
					var20 = var3.readUnsignedShort(); // L: 6755
					var5 = var3.readUnsignedByte(); // L: 6756
					var22 = var3.readUnsignedShort(); // L: 6757
					class273.queueSoundEffect(var20, var5, var22); // L: 6758
					var1.serverPacket = null; // L: 6759
					return true; // L: 6760
				}

				if (ServerPacket.field3211 == var1.serverPacket) { // L: 6762
					var20 = var3.method8457(); // L: 6763
					var63 = var3.method8623() == 1; // L: 6764
					var6 = class281.getWidget(var20); // L: 6765
					if (var63 != var6.isHidden) { // L: 6766
						var6.isHidden = var63; // L: 6767
						class143.invalidateWidget(var6); // L: 6768
					}

					var1.serverPacket = null; // L: 6770
					return true; // L: 6771
				}

				int var36;
				int var37;
				if (ServerPacket.field3243 == var1.serverPacket) { // L: 6773
					var30 = var3.readUnsignedShort(); // L: 6782
					var36 = var3.readUnsignedByte(); // L: 6783
					var37 = var3.method8444(); // L: 6784
					var22 = var3.method8451(); // L: 6785
					var20 = var22 >> 16; // L: 6786
					var5 = var22 >> 8 & 255; // L: 6787
					var27 = var20 + (var22 >> 4 & 7); // L: 6788
					var26 = var5 + (var22 & 7); // L: 6789
					if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104) { // L: 6790
						var27 = var27 * 128 + 64; // L: 6791
						var26 = var26 * 128 + 64; // L: 6792
						GraphicsObject var86 = new GraphicsObject(var30, ApproximateRouteStrategy.Client_plane, var27, var26, class132.getTileHeight(var27, var26, ApproximateRouteStrategy.Client_plane) - var36, var37, cycle); // L: 6793
						graphicsObjects.addFirst(var86); // L: 6794
					}

					var1.serverPacket = null; // L: 6796
					return true; // L: 6797
				}

				if (ServerPacket.field3207 == var1.serverPacket) { // L: 6799
					field704 = cycleCntr; // L: 6800
					var68 = var3.readByte(); // L: 6801
					class152 var72 = new class152(var3); // L: 6802
					ClanChannel var55;
					if (var68 >= 0) { // L: 6804
						var55 = currentClanChannels[var68];
					} else {
						var55 = class198.guestClanChannel; // L: 6805
					}

					var72.method3182(var55); // L: 6806
					var1.serverPacket = null; // L: 6807
					return true; // L: 6808
				}

				if (ServerPacket.field3158 == var1.serverPacket) { // L: 6810
					DecorativeObject.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 6811
					FontName.FriendSystem_invalidateIgnoreds(); // L: 6812
					field701 = cycleCntr; // L: 6813
					var1.serverPacket = null; // L: 6814
					return true; // L: 6815
				}

				if (ServerPacket.field3155 == var1.serverPacket) { // L: 6817
					ItemComposition.method3786(); // L: 6818
					weight = var3.readShort(); // L: 6819
					field499 = cycleCntr; // L: 6820
					var1.serverPacket = null; // L: 6821
					return true; // L: 6822
				}

				if (ServerPacket.field3197 == var1.serverPacket) { // L: 6824
					var20 = var3.method8457(); // L: 6825
					var5 = var3.readUnsignedShort(); // L: 6826
					var22 = var5 >> 10 & 31; // L: 6827
					var27 = var5 >> 5 & 31; // L: 6828
					var26 = var5 & 31; // L: 6829
					var30 = (var27 << 11) + (var22 << 19) + (var26 << 3); // L: 6830
					Widget var58 = class281.getWidget(var20); // L: 6831
					if (var30 != var58.color) { // L: 6832
						var58.color = var30; // L: 6833
						class143.invalidateWidget(var58); // L: 6834
					}

					var1.serverPacket = null; // L: 6836
					return true; // L: 6837
				}

				if (ServerPacket.field3163 == var1.serverPacket) { // L: 6839
					var20 = var3.method8484(); // L: 6840
					if (var20 == 65535) { // L: 6841
						var20 = -1;
					}

					class37.playSong(var20); // L: 6842
					var1.serverPacket = null; // L: 6843
					return true; // L: 6844
				}

				if (ServerPacket.field3132 == var1.serverPacket) { // L: 6846
					var20 = var3.method8430(); // L: 6847
					var5 = var3.method8444(); // L: 6848
					if (var5 == 65535) { // L: 6849
						var5 = -1;
					}

					GroundObject.method4135(var5, var20); // L: 6850
					var1.serverPacket = null; // L: 6851
					return true; // L: 6852
				}

				int var13;
				int var17;
				int var18;
				Projectile var19;
				int var39;
				byte var81;
				int var83;
				byte var87;
				if (ServerPacket.field3180 == var1.serverPacket) { // L: 6854
					var39 = var3.readUnsignedShort(); // L: 6870
					var81 = var3.method8617(); // L: 6871
					var15 = var3.method8484(); // L: 6872
					var16 = var3.method8484(); // L: 6873
					var13 = var3.readUnsignedByte() * 4; // L: 6874
					var87 = var3.method8617(); // L: 6875
					var18 = var3.readUnsignedByte(); // L: 6876
					var37 = var3.method8465(); // L: 6877
					var17 = var3.method8436(); // L: 6878
					var22 = var3.readMedium(); // L: 6879
					var20 = var22 >> 16; // L: 6880
					var5 = var22 >> 8 & 255; // L: 6881
					var27 = var20 + (var22 >> 4 & 7); // L: 6882
					var26 = var5 + (var22 & 7); // L: 6883
					var83 = var3.method8435() * 4; // L: 6884
					var30 = var81 + var27; // L: 6885
					var36 = var87 + var26; // L: 6886
					if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104 && var30 >= 0 && var36 >= 0 && var30 < 104 && var36 < 104 && var39 != 65535) { // L: 6887
						var27 = var27 * 128 + 64; // L: 6888
						var26 = var26 * 128 + 64; // L: 6889
						var30 = var30 * 128 + 64; // L: 6890
						var36 = var36 * 128 + 64; // L: 6891
						var19 = new Projectile(var39, ApproximateRouteStrategy.Client_plane, var27, var26, class132.getTileHeight(var27, var26, ApproximateRouteStrategy.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var37, var83); // L: 6892
						var19.setDestination(var30, var36, class132.getTileHeight(var30, var36, ApproximateRouteStrategy.Client_plane) - var83, var15 + cycle); // L: 6893
						projectiles.addFirst(var19); // L: 6894
					}

					var1.serverPacket = null; // L: 6896
					return true; // L: 6897
				}

				if (ServerPacket.field3234 == var1.serverPacket) { // L: 6899
					var16 = var3.readUnsignedShort(); // L: 6915
					var15 = var3.method8446(); // L: 6916
					var18 = var3.method8436(); // L: 6917
					var22 = var3.readMedium(); // L: 6918
					var20 = var22 >> 16; // L: 6919
					var5 = var22 >> 8 & 255; // L: 6920
					var27 = var20 + (var22 >> 4 & 7); // L: 6921
					var26 = var5 + (var22 & 7); // L: 6922
					var39 = var3.readUnsignedShort(); // L: 6923
					var37 = var3.method8407(); // L: 6924
					var13 = var3.method8436() * 4; // L: 6925
					var87 = var3.readByte(); // L: 6926
					var83 = var3.method8623() * 4; // L: 6927
					var81 = var3.readByte(); // L: 6928
					var17 = var3.readUnsignedByte(); // L: 6929
					var30 = var81 + var27; // L: 6930
					var36 = var87 + var26; // L: 6931
					if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104 && var30 >= 0 && var36 >= 0 && var30 < 104 && var36 < 104 && var39 != 65535) { // L: 6932
						var27 = var27 * 128 + 64; // L: 6933
						var26 = var26 * 128 + 64; // L: 6934
						var30 = var30 * 128 + 64; // L: 6935
						var36 = var36 * 128 + 64; // L: 6936
						var19 = new Projectile(var39, ApproximateRouteStrategy.Client_plane, var27, var26, class132.getTileHeight(var27, var26, ApproximateRouteStrategy.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var37, var83); // L: 6937
						var19.setDestination(var30, var36, class132.getTileHeight(var30, var36, ApproximateRouteStrategy.Client_plane) - var83, var15 + cycle); // L: 6938
						projectiles.addFirst(var19); // L: 6939
					}

					var1.serverPacket = null; // L: 6941
					return true; // L: 6942
				}

				if (ServerPacket.field3171 == var1.serverPacket) { // L: 6944
					class363.method6873(class273.field3116); // L: 6945
					var1.serverPacket = null; // L: 6946
					return true; // L: 6947
				}

				if (ServerPacket.field3152 == var1.serverPacket) { // L: 6949
					var20 = var3.readInt(); // L: 6950
					var5 = var3.method8457(); // L: 6951
					var22 = var3.readUnsignedShort(); // L: 6952
					if (var22 == 65535) { // L: 6953
						var22 = -1;
					}

					var54 = class281.getWidget(var5); // L: 6954
					ItemComposition var78;
					if (!var54.isIf3) { // L: 6955
						if (var22 == -1) { // L: 6956
							var54.modelType = 0; // L: 6957
							var1.serverPacket = null; // L: 6958
							return true; // L: 6959
						}

						var78 = MidiPcmStream.ItemComposition_get(var22); // L: 6961
						var54.modelType = 4; // L: 6962
						var54.modelId = var22; // L: 6963
						var54.modelAngleX = var78.xan2d; // L: 6964
						var54.modelAngleY = var78.yan2d; // L: 6965
						var54.modelZoom = var78.zoom2d * 100 / var20; // L: 6966
						class143.invalidateWidget(var54); // L: 6967
					} else {
						var54.itemId = var22; // L: 6970
						var54.itemQuantity = var20; // L: 6971
						var78 = MidiPcmStream.ItemComposition_get(var22); // L: 6972
						var54.modelAngleX = var78.xan2d; // L: 6973
						var54.modelAngleY = var78.yan2d; // L: 6974
						var54.modelAngleZ = var78.zan2d; // L: 6975
						var54.modelOffsetX = var78.offsetX2d; // L: 6976
						var54.modelOffsetY = var78.offsetY2d; // L: 6977
						var54.modelZoom = var78.zoom2d; // L: 6978
						if (var78.isStackable == 1) { // L: 6979
							var54.itemQuantityMode = 1;
						} else {
							var54.itemQuantityMode = 2; // L: 6980
						}

						if (var54.field3537 > 0) { // L: 6981
							var54.modelZoom = var54.modelZoom * 32 / var54.field3537;
						} else if (var54.rawWidth > 0) { // L: 6982
							var54.modelZoom = var54.modelZoom * 32 / var54.rawWidth;
						}

						class143.invalidateWidget(var54); // L: 6983
					}

					var1.serverPacket = null; // L: 6985
					return true; // L: 6986
				}

				if (ServerPacket.field3140 == var1.serverPacket) { // L: 6988
					var20 = var3.method8484(); // L: 6989
					rootInterface = var20; // L: 6990
					this.resizeRoot(false); // L: 6991
					Tiles.Widget_resetModelFrames(var20); // L: 6992
					class147.runWidgetOnLoadListener(rootInterface); // L: 6993

					for (var5 = 0; var5 < 100; ++var5) { // L: 6994
						field717[var5] = true;
					}

					var1.serverPacket = null; // L: 6995
					return true; // L: 6996
				}

				if (ServerPacket.field3139 == var1.serverPacket) { // L: 6998
					if (rootInterface != -1) { // L: 6999
						DecorativeObject.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 7000
					return true; // L: 7001
				}

				if (ServerPacket.field3179 == var1.serverPacket) { // L: 7003
					DecorativeObject.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 7004
					field701 = cycleCntr; // L: 7005
					var1.serverPacket = null; // L: 7006
					return true; // L: 7007
				}

				if (ServerPacket.field3204 == var1.serverPacket) { // L: 7009
					if (class157.field1745 == null) { // L: 7010
						class157.field1745 = new class411(class203.Ignored_cached);
					}

					class471 var49 = class203.Ignored_cached.method7747(var3); // L: 7011
					class157.field1745.field4592.vmethod8143(var49.field4932, var49.field4930); // L: 7012
					field698[++field699 - 1 & 31] = var49.field4932; // L: 7013
					var1.serverPacket = null; // L: 7014
					return true; // L: 7015
				}

				if (ServerPacket.field3224 == var1.serverPacket) { // L: 7017
					ItemComposition.method3786(); // L: 7018
					var20 = var3.method8457(); // L: 7019
					var5 = var3.method8436(); // L: 7020
					var22 = var3.method8436(); // L: 7021
					experience[var22] = var20; // L: 7022
					currentLevels[var22] = var5; // L: 7023
					levels[var22] = 1; // L: 7024

					for (var27 = 0; var27 < 98; ++var27) { // L: 7025
						if (var20 >= Skills.Skills_experienceTable[var27]) {
							levels[var22] = var27 + 2;
						}
					}

					field696[++field599 - 1 & 31] = var22; // L: 7026
					var1.serverPacket = null; // L: 7027
					return true; // L: 7028
				}

				if (ServerPacket.field3219 == var1.serverPacket) { // L: 7030
					field704 = cycleCntr; // L: 7031
					var68 = var3.readByte(); // L: 7032
					if (var1.serverPacketLength == 1) { // L: 7033
						if (var68 >= 0) { // L: 7034
							currentClanChannels[var68] = null;
						} else {
							class198.guestClanChannel = null; // L: 7035
						}

						var1.serverPacket = null; // L: 7036
						return true; // L: 7037
					}

					if (var68 >= 0) { // L: 7039
						currentClanChannels[var68] = new ClanChannel(var3); // L: 7040
					} else {
						class198.guestClanChannel = new ClanChannel(var3); // L: 7043
					}

					var1.serverPacket = null; // L: 7045
					return true; // L: 7046
				}

				if (ServerPacket.field3227 == var1.serverPacket) { // L: 7048
					var77 = var3.readBoolean(); // L: 7049
					if (var77) { // L: 7050
						if (NetFileRequest.field4144 == null) { // L: 7051
							NetFileRequest.field4144 = new class340();
						}
					} else {
						NetFileRequest.field4144 = null; // L: 7053
					}

					var1.serverPacket = null; // L: 7054
					return true; // L: 7055
				}

				if (ServerPacket.field3191 == var1.serverPacket) { // L: 7057
					var20 = var3.readInt(); // L: 7058
					var5 = var3.method8484(); // L: 7059
					var6 = class281.getWidget(var20); // L: 7060
					if (var6.modelType != 2 || var5 != var6.modelId) { // L: 7061
						var6.modelType = 2; // L: 7062
						var6.modelId = var5; // L: 7063
						class143.invalidateWidget(var6); // L: 7064
					}

					var1.serverPacket = null; // L: 7066
					return true; // L: 7067
				}

				if (ServerPacket.field3148 == var1.serverPacket) { // L: 7069
					return this.method1200(var1, 2); // L: 7070
				}

				if (ServerPacket.field3231 == var1.serverPacket) { // L: 7072
					var20 = var3.readInt(); // L: 7073
					var5 = var3.readUnsignedShort(); // L: 7074
					if (var20 < -70000) { // L: 7075
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 7077
						var6 = class281.getWidget(var20);
					} else {
						var6 = null; // L: 7078
					}

					if (var6 != null) { // L: 7079
						for (var27 = 0; var27 < var6.itemIds.length; ++var27) { // L: 7080
							var6.itemIds[var27] = 0; // L: 7081
							var6.itemQuantities[var27] = 0; // L: 7082
						}
					}

					AbstractWorldMapData.clearItemContainer(var5); // L: 7085
					var27 = var3.readUnsignedShort(); // L: 7086

					for (var26 = 0; var26 < var27; ++var26) { // L: 7087
						var30 = var3.method8444(); // L: 7088
						var36 = var3.method8623(); // L: 7089
						if (var36 == 255) { // L: 7090
							var36 = var3.method8456();
						}

						if (var6 != null && var26 < var6.itemIds.length) { // L: 7091 7092
							var6.itemIds[var26] = var30; // L: 7093
							var6.itemQuantities[var26] = var36; // L: 7094
						}

						FaceNormal.itemContainerSetItem(var5, var26, var30 - 1, var36); // L: 7097
					}

					if (var6 != null) { // L: 7099
						class143.invalidateWidget(var6);
					}

					ItemComposition.method3786(); // L: 7100
					field694[++field695 - 1 & 31] = var5 & 32767; // L: 7101
					var1.serverPacket = null; // L: 7102
					return true; // L: 7103
				}

				InterfaceParent var53;
				if (ServerPacket.field3178 == var1.serverPacket) { // L: 7105
					var20 = var3.method8623(); // L: 7106
					var5 = var3.method8456(); // L: 7107
					var22 = var3.method8484(); // L: 7108
					var53 = (InterfaceParent)interfaceParents.get((long)var5); // L: 7109
					if (var53 != null) { // L: 7110
						class7.closeInterface(var53, var22 != var53.group);
					}

					class409.method7738(var5, var22, var20); // L: 7111
					var1.serverPacket = null; // L: 7112
					return true; // L: 7113
				}

				if (ServerPacket.field3188 == var1.serverPacket) { // L: 7115
					var20 = var3.readUnsignedByte(); // L: 7116
					if (var3.readUnsignedByte() == 0) { // L: 7117
						grandExchangeOffers[var20] = new GrandExchangeOffer(); // L: 7118
						var3.offset += 18; // L: 7119
					} else {
						--var3.offset; // L: 7122
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false); // L: 7123
					}

					field705 = cycleCntr; // L: 7125
					var1.serverPacket = null; // L: 7126
					return true; // L: 7127
				}

				if (ServerPacket.field3235 == var1.serverPacket) { // L: 7129
					GameObject.field2733 = true; // L: 7130
					WorldMapSection0.updateNpcs(false, var3); // L: 7131
					var1.serverPacket = null; // L: 7132
					return true; // L: 7133
				}

				if (ServerPacket.field3209 == var1.serverPacket) { // L: 7135
					class300.privateChatMode = class359.method6838(var3.readUnsignedByte()); // L: 7136
					var1.serverPacket = null; // L: 7137
					return true; // L: 7138
				}

				if (ServerPacket.field3202 == var1.serverPacket) { // L: 7140
					var20 = var3.readUnsignedByte(); // L: 7141
					var5 = var3.readUnsignedByte(); // L: 7142
					var22 = var3.readUnsignedByte(); // L: 7143
					var27 = var3.readUnsignedByte(); // L: 7144
					field556[var20] = true; // L: 7145
					field760[var20] = var5; // L: 7146
					field665[var20] = var22; // L: 7147
					field762[var20] = var27; // L: 7148
					field763[var20] = 0; // L: 7149
					var1.serverPacket = null; // L: 7150
					return true; // L: 7151
				}

				if (ServerPacket.field3196 == var1.serverPacket) { // L: 7153
					var20 = var3.method8446(); // L: 7158
					Player var56;
					if (var20 == localPlayerIndex) { // L: 7159
						var56 = class296.localPlayer; // L: 7160
					} else {
						var56 = players[var20]; // L: 7163
					}

					var22 = var3.method8456(); // L: 7165
					var5 = var3.method8484(); // L: 7166
					if (var56 != null) { // L: 7167
						var56.spotAnimation = var5; // L: 7168
						var56.field1159 = var22 >> 16; // L: 7169
						var56.field1186 = (var22 & 65535) + cycle; // L: 7170
						var56.spotAnimationFrame = 0; // L: 7171
						var56.field1142 = 0; // L: 7172
						if (var56.field1186 > cycle) { // L: 7173
							var56.spotAnimationFrame = -1; // L: 7174
						}

						if (var56.spotAnimation == 65535) { // L: 7176
							var56.spotAnimation = -1; // L: 7177
						}
					}

					var1.serverPacket = null; // L: 7180
					return true; // L: 7181
				}

				if (ServerPacket.field3176 == var1.serverPacket) { // L: 7183
					var20 = var3.method8446(); // L: 7184
					GraphicsDefaults.method7570(var20); // L: 7185
					field694[++field695 - 1 & 31] = var20 & 32767; // L: 7186
					var1.serverPacket = null; // L: 7187
					return true; // L: 7188
				}

				if (ServerPacket.field3201 == var1.serverPacket) { // L: 7190
					byte[] var48 = new byte[var1.serverPacketLength]; // L: 7191
					var3.method8356(var48, 0, var48.length); // L: 7192
					Buffer var71 = new Buffer(var48); // L: 7193
					var52 = var71.readStringCp1252NullTerminated(); // L: 7194
					UrlRequester.openURL(var52, true, false); // L: 7195
					var1.serverPacket = null; // L: 7196
					return true; // L: 7197
				}

				if (ServerPacket.field3215 == var1.serverPacket) { // L: 7199
					class157.field1745 = new class411(class203.Ignored_cached); // L: 7200
					var1.serverPacket = null; // L: 7201
					return true; // L: 7202
				}

				if (ServerPacket.field3208 == var1.serverPacket) { // L: 7204
					return this.method1217(var1); // L: 7205
				}

				if (ServerPacket.field3169 == var1.serverPacket) { // L: 7207
					var47 = var3.readStringCp1252NullTerminated(); // L: 7208
					var5 = var3.method8458(); // L: 7209
					var6 = class281.getWidget(var5); // L: 7210
					if (!var47.equals(var6.text)) { // L: 7211
						var6.text = var47; // L: 7212
						class143.invalidateWidget(var6); // L: 7213
					}

					var1.serverPacket = null; // L: 7215
					return true; // L: 7216
				}

				if (ServerPacket.field3177 == var1.serverPacket) { // L: 7218
					ItemComposition.method3786(); // L: 7219
					runEnergy = var3.readUnsignedByte(); // L: 7220
					field499 = cycleCntr; // L: 7221
					var1.serverPacket = null; // L: 7222
					return true; // L: 7223
				}

				if (ServerPacket.field3150 == var1.serverPacket) { // L: 7225
					var20 = var3.readInt(); // L: 7226
					if (var20 != field586) { // L: 7227
						field586 = var20; // L: 7228
						method1724(); // L: 7229
					}

					var1.serverPacket = null; // L: 7231
					return true; // L: 7232
				}

				if (ServerPacket.field3223 == var1.serverPacket) { // L: 7234
					WorldMapSection0.updateNpcs(false, var3); // L: 7235
					var1.serverPacket = null; // L: 7236
					return true; // L: 7237
				}

				if (ServerPacket.field3175 == var1.serverPacket) { // L: 7239
					var20 = var3.method8458(); // L: 7240
					var5 = var3.method8456(); // L: 7241
					InterfaceParent var50 = (InterfaceParent)interfaceParents.get((long)var5); // L: 7242
					var53 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7243
					if (var53 != null) { // L: 7244
						class7.closeInterface(var53, var50 == null || var50.group != var53.group);
					}

					if (var50 != null) { // L: 7245
						var50.remove(); // L: 7246
						interfaceParents.put(var50, (long)var20); // L: 7247
					}

					var28 = class281.getWidget(var5); // L: 7249
					if (var28 != null) { // L: 7250
						class143.invalidateWidget(var28);
					}

					var28 = class281.getWidget(var20); // L: 7251
					if (var28 != null) { // L: 7252
						class143.invalidateWidget(var28); // L: 7253
						class16.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var28.id >>> 16], var28, true); // L: 7254
					}

					if (rootInterface != -1) { // L: 7256
						DecorativeObject.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 7257
					return true; // L: 7258
				}

				String var40;
				if (ServerPacket.field3217 == var1.serverPacket) { // L: 7260
					var68 = var3.readByte(); // L: 7261
					var31 = (long)var3.readUnsignedShort(); // L: 7262
					var33 = (long)var3.readMedium(); // L: 7263
					var9 = var33 + (var31 << 32); // L: 7264
					boolean var85 = false; // L: 7265
					ClanChannel var38 = var68 >= 0 ? currentClanChannels[var68] : class198.guestClanChannel; // L: 7266
					if (var38 == null) { // L: 7267
						var85 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 7269
							if (field775[var13] == var9) { // L: 7270
								var85 = true; // L: 7271
								break; // L: 7272
							}
						}
					}

					if (!var85) { // L: 7276
						field775[field732] = var9; // L: 7277
						field732 = (field732 + 1) % 100; // L: 7278
						var40 = class296.method5721(var3); // L: 7279
						var83 = var68 >= 0 ? 43 : 46; // L: 7280
						ItemContainer.addChatMessage(var83, "", var40, var38.name); // L: 7281
					}

					var1.serverPacket = null; // L: 7283
					return true; // L: 7284
				}

				if (ServerPacket.field3203 == var1.serverPacket) { // L: 7286
					WorldMapSection0.updateNpcs(true, var3); // L: 7287
					var1.serverPacket = null; // L: 7288
					return true; // L: 7289
				}

				if (ServerPacket.field3138 == var1.serverPacket) { // L: 7291
					var20 = var3.method8465(); // L: 7292
					var5 = var3.method8456(); // L: 7293
					var6 = class281.getWidget(var5); // L: 7294
					if (var20 != var6.sequenceId || var20 == -1) { // L: 7295
						var6.sequenceId = var20; // L: 7296
						var6.modelFrame = 0; // L: 7297
						var6.modelFrameCycle = 0; // L: 7298
						class143.invalidateWidget(var6); // L: 7299
					}

					var1.serverPacket = null; // L: 7301
					return true; // L: 7302
				}

				if (ServerPacket.field3181 == var1.serverPacket) { // L: 7304
					class363.method6873(class273.field3108); // L: 7305
					var1.serverPacket = null; // L: 7306
					return true; // L: 7307
				}

				if (ServerPacket.field3221 == var1.serverPacket) { // L: 7309
					class6.loadRegions(false, var1.packetBuffer); // L: 7310
					var1.serverPacket = null; // L: 7311
					return true; // L: 7312
				}

				if (ServerPacket.field3187 == var1.serverPacket) { // L: 7314
					var20 = var3.method8458(); // L: 7315
					var70 = class281.getWidget(var20); // L: 7316

					for (var22 = 0; var22 < var70.itemIds.length; ++var22) { // L: 7317
						var70.itemIds[var22] = -1; // L: 7318
						var70.itemIds[var22] = 0; // L: 7319
					}

					class143.invalidateWidget(var70); // L: 7321
					var1.serverPacket = null; // L: 7322
					return true; // L: 7323
				}

				if (ServerPacket.field3159 == var1.serverPacket) { // L: 7325
					var47 = var3.readStringCp1252NullTerminated(); // L: 7326
					var31 = (long)var3.readUnsignedShort(); // L: 7327
					var33 = (long)var3.readMedium(); // L: 7328
					PlayerType var41 = (PlayerType)DecorativeObject.findEnumerated(class303.PlayerType_values(), var3.readUnsignedByte()); // L: 7329
					long var42 = var33 + (var31 << 32); // L: 7330
					boolean var88 = false; // L: 7331

					for (var13 = 0; var13 < 100; ++var13) { // L: 7332
						if (field775[var13] == var42) { // L: 7333
							var88 = true; // L: 7334
							break; // L: 7335
						}
					}

					if (DecorativeObject.friendSystem.isIgnored(new Username(var47, ViewportMouse.loginType))) { // L: 7338
						var88 = true;
					}

					if (!var88 && field687 == 0) { // L: 7339
						field775[field732] = var42; // L: 7340
						field732 = (field732 + 1) % 100; // L: 7341
						var40 = AbstractFont.escapeBrackets(HealthBarDefinition.method3513(class296.method5721(var3))); // L: 7342
						byte var35;
						if (var41.isPrivileged) { // L: 7344
							var35 = 7;
						} else {
							var35 = 3; // L: 7345
						}

						if (var41.modIcon != -1) { // L: 7346
							MouseHandler.addGameMessage(var35, class268.method5367(var41.modIcon) + var47, var40);
						} else {
							MouseHandler.addGameMessage(var35, var47, var40); // L: 7347
						}
					}

					var1.serverPacket = null; // L: 7349
					return true; // L: 7350
				}

				if (ServerPacket.field3205 == var1.serverPacket) { // L: 7352
					hintArrowType = var3.readUnsignedByte(); // L: 7353
					if (hintArrowType == 1) { // L: 7354
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 7355
						if (hintArrowType == 2) { // L: 7356
							field723 = 4096; // L: 7357
							field541 = 4096; // L: 7358
						}

						if (hintArrowType == 3) { // L: 7360
							field723 = 0; // L: 7361
							field541 = 4096; // L: 7362
						}

						if (hintArrowType == 4) { // L: 7364
							field723 = 8192; // L: 7365
							field541 = 4096; // L: 7366
						}

						if (hintArrowType == 5) { // L: 7368
							field723 = 4096; // L: 7369
							field541 = 0; // L: 7370
						}

						if (hintArrowType == 6) { // L: 7372
							field723 = 4096; // L: 7373
							field541 = 8192; // L: 7374
						}

						hintArrowType = 2; // L: 7376
						hintArrowX = var3.readUnsignedShort(); // L: 7377
						hintArrowY = var3.readUnsignedShort(); // L: 7378
						field770 = var3.readUnsignedByte() * 4; // L: 7379
					}

					if (hintArrowType == 10) { // L: 7381
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 7382
					return true; // L: 7383
				}

				if (ServerPacket.field3239 == var1.serverPacket) { // L: 7385
					var20 = var3.readShort(); // L: 7386
					var5 = var3.method8458(); // L: 7387
					var22 = var3.method8465(); // L: 7388
					var54 = class281.getWidget(var5); // L: 7389
					if (var22 != var54.rawX || var20 != var54.rawY || var54.xAlignment != 0 || var54.yAlignment != 0) { // L: 7390
						var54.rawX = var22; // L: 7391
						var54.rawY = var20; // L: 7392
						var54.xAlignment = 0; // L: 7393
						var54.yAlignment = 0; // L: 7394
						class143.invalidateWidget(var54); // L: 7395
						this.alignWidget(var54); // L: 7396
						if (var54.type == 0) { // L: 7397
							class16.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var5 >> 16], var54, false);
						}
					}

					var1.serverPacket = null; // L: 7399
					return true; // L: 7400
				}

				if (ServerPacket.field3212 == var1.serverPacket) { // L: 7402
					isCameraLocked = false; // L: 7403

					for (var20 = 0; var20 < 5; ++var20) { // L: 7404
						field556[var20] = false;
					}

					var1.serverPacket = null; // L: 7405
					return true; // L: 7406
				}

				if (ServerPacket.field3172 == var1.serverPacket) { // L: 7408
					var20 = var3.offset + var1.serverPacketLength; // L: 7409
					var5 = var3.readUnsignedShort(); // L: 7410
					var22 = var3.readUnsignedShort(); // L: 7411
					if (var5 != rootInterface) { // L: 7412
						rootInterface = var5; // L: 7413
						this.resizeRoot(false); // L: 7414
						Tiles.Widget_resetModelFrames(rootInterface); // L: 7415
						class147.runWidgetOnLoadListener(rootInterface); // L: 7416

						for (var27 = 0; var27 < 100; ++var27) { // L: 7417
							field717[var27] = true;
						}
					}

					InterfaceParent var10;
					for (; var22-- > 0; var10.field1037 = true) { // L: 7419 7429
						var27 = var3.readInt(); // L: 7420
						var26 = var3.readUnsignedShort(); // L: 7421
						var30 = var3.readUnsignedByte(); // L: 7422
						var10 = (InterfaceParent)interfaceParents.get((long)var27); // L: 7423
						if (var10 != null && var26 != var10.group) { // L: 7424
							class7.closeInterface(var10, true); // L: 7425
							var10 = null; // L: 7426
						}

						if (var10 == null) { // L: 7428
							var10 = class409.method7738(var27, var26, var30);
						}
					}

					for (var53 = (InterfaceParent)interfaceParents.first(); var53 != null; var53 = (InterfaceParent)interfaceParents.next()) { // L: 7431
						if (var53.field1037) { // L: 7432
							var53.field1037 = false;
						} else {
							class7.closeInterface(var53, true); // L: 7434
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 7437

					while (var3.offset < var20) { // L: 7438
						var27 = var3.readInt(); // L: 7439
						var26 = var3.readUnsignedShort(); // L: 7440
						var30 = var3.readUnsignedShort(); // L: 7441
						var36 = var3.readInt(); // L: 7442

						for (var37 = var26; var37 <= var30; ++var37) { // L: 7443
							var12 = ((long)var27 << 32) + (long)var37; // L: 7444
							widgetFlags.put(new IntegerNode(var36), var12); // L: 7445
						}
					}

					var1.serverPacket = null; // L: 7448
					return true; // L: 7449
				}

				if (ServerPacket.field3226 == var1.serverPacket) { // L: 7451
					class363.method6873(class273.field3106); // L: 7452
					var1.serverPacket = null; // L: 7453
					return true; // L: 7454
				}

				if (ServerPacket.field3146 == var1.serverPacket) { // L: 7456
					var68 = var3.method8440(); // L: 7457
					var5 = var3.method8484(); // L: 7458
					Varps.Varps_temp[var5] = var68; // L: 7459
					if (Varps.Varps_main[var5] != var68) { // L: 7460
						Varps.Varps_main[var5] = var68; // L: 7461
					}

					ClanChannel.changeGameOptions(var5); // L: 7463
					field788[++field547 - 1 & 31] = var5; // L: 7464
					var1.serverPacket = null; // L: 7465
					return true; // L: 7466
				}

				if (ServerPacket.field3134 == var1.serverPacket) { // L: 7468
					class11.field64 = var3.method8435(); // L: 7469
					DevicePcmPlayerProvider.field122 = var3.method8435(); // L: 7470
					var1.serverPacket = null; // L: 7471
					return true; // L: 7472
				}

				if (ServerPacket.field3173 == var1.serverPacket) { // L: 7474
					var20 = var3.method8444(); // L: 7479
					var7 = npcs[var20]; // L: 7480
					var22 = var3.method8444(); // L: 7481
					var5 = var3.method8457(); // L: 7482
					if (var7 != null) { // L: 7483
						var7.spotAnimation = var22; // L: 7484
						var7.field1159 = var5 >> 16; // L: 7485
						var7.field1186 = (var5 & 65535) + cycle; // L: 7486
						var7.spotAnimationFrame = 0; // L: 7487
						var7.field1142 = 0; // L: 7488
						if (var7.field1186 > cycle) { // L: 7489
							var7.spotAnimationFrame = -1; // L: 7490
						}

						if (var7.spotAnimation == 65535) { // L: 7492
							var7.spotAnimation = -1; // L: 7493
						}
					}

					var1.serverPacket = null; // L: 7496
					return true; // L: 7497
				}

				if (ServerPacket.field3174 == var1.serverPacket) { // L: 7499
					class123.method2869(); // L: 7500
					var68 = var3.readByte(); // L: 7501
					if (var1.serverPacketLength == 1) { // L: 7502
						if (var68 >= 0) { // L: 7503
							currentClanSettings[var68] = null;
						} else {
							class121.guestClanSettings = null; // L: 7504
						}

						var1.serverPacket = null; // L: 7505
						return true; // L: 7506
					}

					if (var68 >= 0) { // L: 7508
						currentClanSettings[var68] = new ClanSettings(var3); // L: 7509
					} else {
						class121.guestClanSettings = new ClanSettings(var3); // L: 7512
					}

					var1.serverPacket = null; // L: 7514
					return true; // L: 7515
				}

				if (ServerPacket.field3198 == var1.serverPacket) { // L: 7517
					for (var20 = 0; var20 < VarpDefinition.field1866; ++var20) { // L: 7518
						VarpDefinition var69 = ClientPacket.VarpDefinition_get(var20); // L: 7519
						if (var69 != null) { // L: 7520
							Varps.Varps_temp[var20] = 0; // L: 7521
							Varps.Varps_main[var20] = 0; // L: 7522
						}
					}

					ItemComposition.method3786(); // L: 7525
					field547 += 32; // L: 7526
					var1.serverPacket = null; // L: 7527
					return true; // L: 7528
				}

				if (ServerPacket.field3149 == var1.serverPacket) { // L: 7530
					class363.method6873(class273.field3119); // L: 7531
					var1.serverPacket = null; // L: 7532
					return true; // L: 7533
				}

				if (ServerPacket.field3164 == var1.serverPacket) { // L: 7535
					isCameraLocked = true; // L: 7536
					field758 = false; // L: 7537
					class4.field11 = var3.readUnsignedByte() * 128; // L: 7538
					BuddyRankComparator.field1431 = var3.readUnsignedByte() * 16384; // L: 7539
					MidiPcmStream.field3326 = var3.readUnsignedShort(); // L: 7540
					MouseHandler.field254 = var3.readUnsignedByte(); // L: 7541
					HealthBarDefinition.field1912 = var3.readUnsignedByte(); // L: 7542
					if (HealthBarDefinition.field1912 >= 100) { // L: 7543
						var20 = class4.field11 * 16384 + 64; // L: 7544
						var5 = BuddyRankComparator.field1431 * 128 + 64; // L: 7545
						var22 = class132.getTileHeight(var20, var5, ApproximateRouteStrategy.Client_plane) - MidiPcmStream.field3326; // L: 7546
						var27 = var20 - TextureProvider.cameraX; // L: 7547
						var26 = var22 - class31.cameraY; // L: 7548
						var30 = var5 - class313.cameraZ; // L: 7549
						var36 = (int)Math.sqrt((double)(var27 * var27 + var30 * var30)); // L: 7550
						class408.cameraPitch = (int)(Math.atan2((double)var26, (double)var36) * 325.9490051269531D) & 2047; // L: 7551
						WorldMapSection1.cameraYaw = (int)(Math.atan2((double)var27, (double)var30) * -325.9490051269531D) & 2047; // L: 7552
						if (class408.cameraPitch < 128) { // L: 7553
							class408.cameraPitch = 128;
						}

						if (class408.cameraPitch > 383) { // L: 7554
							class408.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 7556
					return true; // L: 7557
				}

				if (ServerPacket.field3230 == var1.serverPacket) { // L: 7559
					World var46 = new World(); // L: 7560
					var46.host = var3.readStringCp1252NullTerminated(); // L: 7561
					var46.id = var3.readUnsignedShort(); // L: 7562
					var5 = var3.readInt(); // L: 7563
					var46.properties = var5; // L: 7564
					class21.method305(45); // L: 7565
					var2.close(); // L: 7566
					var2 = null; // L: 7567
					changeWorld(var46); // L: 7568
					var1.serverPacket = null; // L: 7569
					return false; // L: 7570
				}

				if (ServerPacket.field3154 == var1.serverPacket) { // L: 7572
					destinationX = var3.readUnsignedByte(); // L: 7573
					if (destinationX == 255) { // L: 7574
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 7575
					if (destinationY == 255) { // L: 7576
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 7577
					return true; // L: 7578
				}

				if (ServerPacket.field3167 == var1.serverPacket) { // L: 7580
					DecorativeObject.friendSystem.method1842(); // L: 7581
					field701 = cycleCntr; // L: 7582
					var1.serverPacket = null; // L: 7583
					return true; // L: 7584
				}

				if (ServerPacket.field3130 == var1.serverPacket) { // L: 7586
					var13 = var3.method8484(); // L: 7597
					var30 = var3.method8435(); // L: 7598
					var36 = var30 >> 2; // L: 7599
					var37 = var30 & 3; // L: 7600
					var39 = field565[var36]; // L: 7601
					var22 = var3.readMedium(); // L: 7602
					var20 = var22 >> 16; // L: 7603
					var5 = var22 >> 8 & 255; // L: 7604
					var27 = var20 + (var22 >> 4 & 7); // L: 7605
					var26 = var5 + (var22 & 7); // L: 7606
					if (var27 >= 0 && var26 >= 0 && var27 < 103 && var26 < 103) { // L: 7607
						if (var39 == 0) { // L: 7608
							WallObject var65 = class139.scene.method4293(ApproximateRouteStrategy.Client_plane, var27, var26); // L: 7609
							if (var65 != null) { // L: 7610
								var15 = AttackOption.Entity_unpackID(var65.tag); // L: 7611
								if (var36 == 2) { // L: 7612
									var65.renderable1 = new DynamicObject(var15, 2, var37 + 4, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var65.renderable1); // L: 7613
									var65.renderable2 = new DynamicObject(var15, 2, var37 + 1 & 3, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var65.renderable2); // L: 7614
								} else {
									var65.renderable1 = new DynamicObject(var15, var36, var37, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var65.renderable1); // L: 7616
								}
							}
						} else if (var39 == 1) { // L: 7619
							DecorativeObject var64 = class139.scene.method4294(ApproximateRouteStrategy.Client_plane, var27, var26); // L: 7620
							if (var64 != null) { // L: 7621
								var15 = AttackOption.Entity_unpackID(var64.tag); // L: 7622
								if (var36 != 4 && var36 != 5) { // L: 7623
									if (var36 == 6) { // L: 7626
										var64.renderable1 = new DynamicObject(var15, 4, var37 + 4, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var64.renderable1); // L: 7627
									} else if (var36 == 7) { // L: 7629
										var64.renderable1 = new DynamicObject(var15, 4, (var37 + 2 & 3) + 4, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var64.renderable1); // L: 7630
									} else if (var36 == 8) { // L: 7632
										var64.renderable1 = new DynamicObject(var15, 4, var37 + 4, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var64.renderable1); // L: 7633
										var64.renderable2 = new DynamicObject(var15, 4, (var37 + 2 & 3) + 4, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var64.renderable2); // L: 7634
									}
								} else {
									var64.renderable1 = new DynamicObject(var15, 4, var37, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var64.renderable1); // L: 7624
								}
							}
						} else if (var39 == 2) { // L: 7638
							var14 = class139.scene.getGameObject(ApproximateRouteStrategy.Client_plane, var27, var26); // L: 7639
							if (var36 == 11) { // L: 7640
								var36 = 10; // L: 7641
							}

							if (var14 != null) { // L: 7643
								var14.renderable = new DynamicObject(AttackOption.Entity_unpackID(var14.tag), var36, var37, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var14.renderable); // L: 7644
							}
						} else if (var39 == 3) { // L: 7647
							GroundObject var62 = class139.scene.getGroundObject(ApproximateRouteStrategy.Client_plane, var27, var26); // L: 7648
							if (var62 != null) { // L: 7649
								var62.renderable = new DynamicObject(AttackOption.Entity_unpackID(var62.tag), 22, var37, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var62.renderable); // L: 7650
							}
						}
					}

					var1.serverPacket = null; // L: 7654
					return true; // L: 7655
				}

				class421.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1373 != null ? var1.field1373.id : -1) + "," + (var1.field1381 != null ? var1.field1381.id : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 7657
				class376.logOut(); // L: 7658
			} catch (IOException var44) { // L: 7660
				WorldMapSection0.method5101(); // L: 7661
			} catch (Exception var45) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1373 != null ? var1.field1373.id : -1) + "," + (var1.field1381 != null ? var1.field1381.id : -1) + "," + var1.serverPacketLength + "," + (class296.localPlayer.pathX[0] + class26.baseX * 64) + "," + (class296.localPlayer.pathY[0] + class158.baseY * 64) + ","; // L: 7664

				for (var22 = 0; var22 < var1.serverPacketLength && var22 < 50; ++var22) { // L: 7665
					var21 = var21 + var3.array[var22] + ",";
				}

				class421.RunException_sendStackTrace(var21, var45); // L: 7666
				class376.logOut(); // L: 7667
			}

			return true; // L: 7669
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-15"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false; // L: 8701

		int var2;
		int var5;
		while (!var1) { // L: 8702
			var1 = true; // L: 8703

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) { // L: 8704
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) { // L: 8705
					String var19 = menuTargets[var2]; // L: 8706
					menuTargets[var2] = menuTargets[var2 + 1]; // L: 8707
					menuTargets[var2 + 1] = var19; // L: 8708
					String var20 = menuActions[var2]; // L: 8709
					menuActions[var2] = menuActions[var2 + 1]; // L: 8710
					menuActions[var2 + 1] = var20; // L: 8711
					var5 = menuOpcodes[var2]; // L: 8712
					menuOpcodes[var2] = menuOpcodes[var2 + 1]; // L: 8713
					menuOpcodes[var2 + 1] = var5; // L: 8714
					var5 = menuArguments1[var2]; // L: 8715
					menuArguments1[var2] = menuArguments1[var2 + 1]; // L: 8716
					menuArguments1[var2 + 1] = var5; // L: 8717
					var5 = menuArguments2[var2]; // L: 8718
					menuArguments2[var2] = menuArguments2[var2 + 1]; // L: 8719
					menuArguments2[var2 + 1] = var5; // L: 8720
					var5 = menuIdentifiers[var2]; // L: 8721
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1]; // L: 8722
					menuIdentifiers[var2 + 1] = var5; // L: 8723
					var5 = field647[var2]; // L: 8724
					field647[var2] = field647[var2 + 1]; // L: 8725
					field647[var2 + 1] = var5; // L: 8726
					boolean var15 = menuShiftClick[var2]; // L: 8727
					menuShiftClick[var2] = menuShiftClick[var2 + 1]; // L: 8728
					menuShiftClick[var2 + 1] = var15; // L: 8729
					var1 = false; // L: 8730
				}
			}
		}

		if (VerticalAlignment.dragInventoryWidget == null) { // L: 8735
			if (clickedWidget == null) { // L: 8736
				int var4;
				int var10;
				int var23;
				label273: {
					int var21 = MouseHandler.MouseHandler_lastButton; // L: 8737
					int var3;
					int var8;
					int var22;
					int var24;
					if (isMenuOpen) { // L: 8738
						if (var21 != 1 && (class82.mouseCam || var21 != 4)) { // L: 8739
							var2 = MouseHandler.MouseHandler_x; // L: 8740
							var3 = MouseHandler.MouseHandler_y; // L: 8741
							if (var2 < class103.menuX - 10 || var2 > class103.menuX + class174.menuWidth + 10 || var3 < class108.menuY - 10 || var3 > WorldMapScaleHandler.menuHeight + class108.menuY + 10) { // L: 8742
								isMenuOpen = false; // L: 8743
								AbstractArchive.method6439(class103.menuX, class108.menuY, class174.menuWidth, WorldMapScaleHandler.menuHeight); // L: 8744
							}
						}

						if (var21 == 1 || !class82.mouseCam && var21 == 4) { // L: 8747
							var2 = class103.menuX; // L: 8748
							var3 = class108.menuY; // L: 8749
							var4 = class174.menuWidth; // L: 8750
							var5 = MouseHandler.MouseHandler_lastPressedX; // L: 8751
							var24 = MouseHandler.MouseHandler_lastPressedY; // L: 8752
							var22 = -1; // L: 8753

							for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 8754
								var23 = (menuOptionsCount - 1 - var8) * 15 + var3 + 31; // L: 8755
								if (var5 > var2 && var5 < var2 + var4 && var24 > var23 - 13 && var24 < var23 + 3) { // L: 8756
									var22 = var8;
								}
							}

							if (var22 != -1 && var22 >= 0) { // L: 8758 8759
								var8 = menuArguments1[var22]; // L: 8760
								var23 = menuArguments2[var22]; // L: 8761
								var10 = menuOpcodes[var22]; // L: 8762
								int var18 = menuIdentifiers[var22]; // L: 8763
								int var12 = field647[var22]; // L: 8764
								String var13 = menuActions[var22]; // L: 8765
								String var14 = menuTargets[var22]; // L: 8766
								PacketBufferNode.method5389(var8, var23, var10, var18, var12, var13, var14, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8767
							}

							isMenuOpen = false; // L: 8769
							AbstractArchive.method6439(class103.menuX, class108.menuY, class174.menuWidth, WorldMapScaleHandler.menuHeight); // L: 8770
						}
					} else {
						var2 = class250.method5167(); // L: 8774
						if ((var21 == 1 || !class82.mouseCam && var21 == 4) && var2 >= 0) { // L: 8775
							var3 = menuOpcodes[var2]; // L: 8776
							if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) { // L: 8777
								var4 = menuArguments1[var2]; // L: 8778
								var5 = menuArguments2[var2]; // L: 8779
								Widget var6 = class281.getWidget(var5); // L: 8780
								var8 = class197.getWidgetFlags(var6); // L: 8782
								boolean var7 = (var8 >> 28 & 1) != 0; // L: 8784
								if (var7) { // L: 8787
									break label273;
								}

								var10 = class197.getWidgetFlags(var6); // L: 8789
								boolean var9 = (var10 >> 29 & 1) != 0; // L: 8791
								if (var9) { // L: 8793
									break label273;
								}
							}
						}

						if ((var21 == 1 || !class82.mouseCam && var21 == 4) && this.shouldLeftClickOpenMenu()) { // L: 8823 8824
							var21 = 2; // L: 8825
						}

						if ((var21 == 1 || !class82.mouseCam && var21 == 4) && menuOptionsCount > 0 && var2 >= 0) { // L: 8828 8830
							var3 = menuArguments1[var2]; // L: 8831
							var4 = menuArguments2[var2]; // L: 8832
							var5 = menuOpcodes[var2]; // L: 8833
							var24 = menuIdentifiers[var2]; // L: 8834
							var22 = field647[var2]; // L: 8835
							String var16 = menuActions[var2]; // L: 8836
							String var17 = menuTargets[var2]; // L: 8837
							PacketBufferNode.method5389(var3, var4, var5, var24, var22, var16, var17, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8838
						}

						if (var21 == 2 && menuOptionsCount > 0) { // L: 8841
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}

					return; // L: 8843
				}

				if (VerticalAlignment.dragInventoryWidget != null && !field616 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 8795 8796
					var23 = draggedWidgetX; // L: 8797
					var10 = draggedWidgetY; // L: 8798
					MenuAction var11 = PendingSpawn.tempMenuAction; // L: 8800
					if (var11 != null) { // L: 8802
						PacketBufferNode.method5389(var11.param0, var11.param1, var11.opcode, var11.identifier, var11.field883, var11.field884, var11.action, var23, var10); // L: 8803
					}

					PendingSpawn.tempMenuAction = null; // L: 8806
				}

				field616 = false; // L: 8810
				itemDragDuration = 0; // L: 8811
				if (VerticalAlignment.dragInventoryWidget != null) { // L: 8812
					class143.invalidateWidget(VerticalAlignment.dragInventoryWidget);
				}

				VerticalAlignment.dragInventoryWidget = class281.getWidget(var5); // L: 8813
				dragItemSlotSource = var4; // L: 8814
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 8815
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 8816
				if (var2 >= 0) { // L: 8817
					class10.method93(var2);
				}

				class143.invalidateWidget(VerticalAlignment.dragInventoryWidget); // L: 8818
			}
		}
	} // L: 8819

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "15"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = class250.method5167(); // L: 8846
		return (field719 && menuOptionsCount > 2 || class37.method710(var1)) && !menuShiftClick[var1]; // L: 8847
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1899380061"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		int var3 = UserComparator3.fontBold12.stringWidth("Choose Option"); // L: 8852

		int var4;
		int var5;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) { // L: 8853
			var5 = UserComparator3.fontBold12.stringWidth(FaceNormal.method4461(var4)); // L: 8854
			if (var5 > var3) { // L: 8855
				var3 = var5;
			}
		}

		var3 += 8; // L: 8857
		var4 = menuOptionsCount * 15 + 22; // L: 8858
		var5 = var1 - var3 / 2; // L: 8859
		if (var5 + var3 > GameEngine.canvasWidth) { // L: 8860
			var5 = GameEngine.canvasWidth - var3;
		}

		if (var5 < 0) { // L: 8861
			var5 = 0;
		}

		int var6 = var2; // L: 8862
		if (var2 + var4 > class10.canvasHeight) { // L: 8863
			var6 = class10.canvasHeight - var4;
		}

		if (var6 < 0) { // L: 8864
			var6 = 0;
		}

		class103.menuX = var5; // L: 8865
		class108.menuY = var6; // L: 8866
		class174.menuWidth = var3; // L: 8867
		WorldMapScaleHandler.menuHeight = menuOptionsCount * 15 + 22; // L: 8868
		var1 -= viewportOffsetX; // L: 8870
		var2 -= viewportOffsetY; // L: 8871
		class139.scene.menuOpen(ApproximateRouteStrategy.Client_plane, var1, var2, false); // L: 8872
		isMenuOpen = true; // L: 8873
	} // L: 8874

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1211256650"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface; // L: 10847
		int var3 = GameEngine.canvasWidth; // L: 10848
		int var4 = class10.canvasHeight; // L: 10849
		if (WorldMapManager.loadInterface(var2)) { // L: 10851
			WorldMapID.resizeInterface(Widget.Widget_interfaceComponents[var2], -1, var3, var4, var1); // L: 10852
		}

	} // L: 10854

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)V",
		garbageValue = "-988086674"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class281.getWidget(var1.parentId); // L: 10857
		int var3;
		int var4;
		if (var2 == null) { // L: 10860
			var3 = GameEngine.canvasWidth; // L: 10861
			var4 = class10.canvasHeight; // L: 10862
		} else {
			var3 = var2.width; // L: 10865
			var4 = var2.height; // L: 10866
		}

		WorldMapRectangle.alignWidgetSize(var1, var3, var4, false); // L: 10868
		GrandExchangeOfferAgeComparator.alignWidgetPosition(var1, var3, var4); // L: 10869
	} // L: 10870

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	final void method1208() {
		class143.invalidateWidget(clickedWidget); // L: 11924
		++Script.widgetDragDuration; // L: 11925
		int var1;
		int var2;
		if (field640 && field684) { // L: 11926
			var1 = MouseHandler.MouseHandler_x; // L: 11945
			var2 = MouseHandler.MouseHandler_y; // L: 11946
			var1 -= widgetClickX; // L: 11947
			var2 -= widgetClickY; // L: 11948
			if (var1 < field603) { // L: 11949
				var1 = field603;
			}

			if (var1 + clickedWidget.width > field603 + clickedWidgetParent.width) { // L: 11950
				var1 = field603 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field686) { // L: 11951
				var2 = field686;
			}

			if (var2 + clickedWidget.height > field686 + clickedWidgetParent.height) { // L: 11952
				var2 = field686 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field688; // L: 11953
			int var4 = var2 - field689; // L: 11954
			int var5 = clickedWidget.dragZoneSize; // L: 11955
			if (Script.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 11956 11957
				isDraggingWidget = true; // L: 11958
			}

			int var6 = var1 - field603 + clickedWidgetParent.scrollX; // L: 11961
			int var7 = var2 - field686 + clickedWidgetParent.scrollY; // L: 11962
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 11963
				var8 = new ScriptEvent(); // L: 11964
				var8.widget = clickedWidget; // L: 11965
				var8.mouseX = var6; // L: 11966
				var8.mouseY = var7; // L: 11967
				var8.args = clickedWidget.onDrag; // L: 11968
				ServerPacket.runScriptEvent(var8); // L: 11969
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 11971
				if (isDraggingWidget) { // L: 11972
					if (clickedWidget.onDragComplete != null) { // L: 11973
						var8 = new ScriptEvent(); // L: 11974
						var8.widget = clickedWidget; // L: 11975
						var8.mouseX = var6; // L: 11976
						var8.mouseY = var7; // L: 11977
						var8.dragTarget = draggedOnWidget; // L: 11978
						var8.args = clickedWidget.onDragComplete; // L: 11979
						ServerPacket.runScriptEvent(var8); // L: 11980
					}

					if (draggedOnWidget != null) { // L: 11982
						Widget var15 = clickedWidget; // L: 11984
						int var11 = class197.getWidgetFlags(var15); // L: 11987
						int var16 = var11 >> 17 & 7; // L: 11989
						int var12 = var16; // L: 11991
						Widget var18;
						if (var16 == 0) { // L: 11992
							var18 = null; // L: 11993
						} else {
							int var13 = 0;

							while (true) {
								if (var13 >= var12) {
									var18 = var15; // L: 12003
									break;
								}

								var15 = class281.getWidget(var15.parentId); // L: 11997
								if (var15 == null) { // L: 11998
									var18 = null; // L: 11999
									break; // L: 12000
								}

								++var13; // L: 11996
							}
						}

						if (var18 != null) { // L: 12005
							PacketBufferNode var19 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3054, packetWriter.isaacCipher); // L: 12007
							var19.packetBuffer.writeInt(clickedWidget.id); // L: 12008
							var19.packetBuffer.writeShort(clickedWidget.itemId); // L: 12009
							var19.packetBuffer.writeShort(clickedWidget.childIndex); // L: 12010
							var19.packetBuffer.writeShort(draggedOnWidget.childIndex); // L: 12011
							var19.packetBuffer.writeInt(draggedOnWidget.id); // L: 12012
							var19.packetBuffer.writeIntME(draggedOnWidget.itemId); // L: 12013
							packetWriter.addNode(var19); // L: 12014
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 12019
					this.openMenu(widgetClickX + field688, widgetClickY + field689); // L: 12020
				} else if (menuOptionsCount > 0) { // L: 12022
					int var14 = widgetClickX + field688; // L: 12023
					int var9 = field689 + widgetClickY; // L: 12024
					MenuAction var10 = PendingSpawn.tempMenuAction; // L: 12026
					if (var10 != null) { // L: 12028
						PacketBufferNode.method5389(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.field883, var10.field884, var10.action, var14, var9); // L: 12029
					}

					PendingSpawn.tempMenuAction = null; // L: 12032
				}

				clickedWidget = null; // L: 12036
			}

		} else {
			if (Script.widgetDragDuration > 1) { // L: 11927
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 11928
					var1 = field688 + widgetClickX; // L: 11929
					var2 = widgetClickY + field689; // L: 11930
					MenuAction var17 = PendingSpawn.tempMenuAction; // L: 11932
					if (var17 != null) { // L: 11934
						PacketBufferNode.method5389(var17.param0, var17.param1, var17.opcode, var17.identifier, var17.field883, var17.field884, var17.action, var1, var2); // L: 11935
					}

					PendingSpawn.tempMenuAction = null; // L: 11938
				}

				clickedWidget = null; // L: 11941
			}

		}
	} // L: 11943 12038

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(I)Lrg;",
		garbageValue = "-2072830771"
	)
	@Export("username")
	public Username username() {
		return class296.localPlayer != null ? class296.localPlayer.username : null; // L: 12729
	}

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 965
			this.otlTokenRequester = var1; // L: 968
			GrandExchangeOfferOwnWorldComparator.method1171(10); // L: 969
		}
	} // L: 966 970

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 975
			this.field537 = var1; // L: 978
		}
	} // L: 976 979

	public long getAccountHash() {
		return this.accountHash; // L: 989
	}

	public final void init() {
		try {
			if (this.checkHost()) { // L: 757
				int var3;
				for (int var1 = 0; var1 <= 28; ++var1) { // L: 758
					String var2 = this.getParameter(Integer.toString(var1)); // L: 759
					if (var2 != null) { // L: 760
						switch(var1) { // L: 761
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 829
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 830
							}
							break;
						case 4:
							if (clientType == -1) { // L: 769
								clientType = Integer.parseInt(var2); // L: 770
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 776
							break; // L: 777
						case 6:
							class103.clientLanguage = Language.method6580(Integer.parseInt(var2)); // L: 842
							break; // L: 843
						case 7:
							class259.field2967 = WorldMapSection2.method4746(Integer.parseInt(var2)); // L: 797
							break; // L: 798
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 781
							}
							break;
						case 9:
							DynamicObject.field974 = var2; // L: 819
							break; // L: 820
						case 10:
							class376.field4411 = (StudioGame)DecorativeObject.findEnumerated(Script.method2127(), Integer.parseInt(var2)); // L: 835
							if (class376.field4411 == StudioGame.oldscape) { // L: 836
								ViewportMouse.loginType = LoginType.oldscape;
							} else {
								ViewportMouse.loginType = LoginType.field4788; // L: 837
							}
							break;
						case 11:
							class124.field1482 = var2; // L: 787
							break; // L: 788
						case 12:
							worldId = Integer.parseInt(var2); // L: 764
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
							Canvas.field126 = Integer.parseInt(var2); // L: 824
							break; // L: 825
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 802
							break; // L: 803
						case 17:
							class127.field1534 = var2; // L: 792
							break; // L: 793
						case 21:
							field494 = Integer.parseInt(var2); // L: 847
							break;
						case 25:
							var3 = var2.indexOf("."); // L: 807
							if (var3 == -1) { // L: 808
								field789 = Integer.parseInt(var2); // L: 809
							} else {
								field789 = Integer.parseInt(var2.substring(0, var3)); // L: 812
								Integer.parseInt(var2.substring(var3 + 1)); // L: 813
							}
						}
					}
				}

				FontName.method8080(); // L: 853
				class273.worldHost = this.getCodeBase().getHost(); // L: 854
				String var8 = class259.field2967.name; // L: 855
				byte var9 = 0; // L: 856

				try {
					JagexCache.idxCount = 22; // L: 859
					JagexCache.cacheGamebuild = var9; // L: 860

					try {
						MouseHandler.operatingSystemName = System.getProperty("os.name"); // L: 862
					} catch (Exception var16) { // L: 864
						MouseHandler.operatingSystemName = "Unknown"; // L: 865
					}

					class17.formattedOperatingSystemName = MouseHandler.operatingSystemName.toLowerCase(); // L: 867

					try {
						class37.userHomeDirectory = System.getProperty("user.home"); // L: 869
						if (class37.userHomeDirectory != null) { // L: 870
							class37.userHomeDirectory = class37.userHomeDirectory + "/";
						}
					} catch (Exception var15) { // L: 872
					}

					try {
						if (class17.formattedOperatingSystemName.startsWith("win")) { // L: 874
							if (class37.userHomeDirectory == null) { // L: 875
								class37.userHomeDirectory = System.getenv("USERPROFILE");
							}
						} else if (class37.userHomeDirectory == null) { // L: 878
							class37.userHomeDirectory = System.getenv("HOME");
						}

						if (class37.userHomeDirectory != null) { // L: 880
							class37.userHomeDirectory = class37.userHomeDirectory + "/";
						}
					} catch (Exception var14) { // L: 882
					}

					if (class37.userHomeDirectory == null) { // L: 883
						class37.userHomeDirectory = "~/";
					}

					GrandExchangeOffer.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class37.userHomeDirectory, "/tmp/", ""}; // L: 884
					AbstractWorldMapIcon.cacheSubPaths = new String[]{".jagex_cache_" + JagexCache.cacheGamebuild, ".file_store_" + JagexCache.cacheGamebuild}; // L: 885

					label172:
					for (var3 = 0; var3 < 4; ++var3) { // L: 886
						class303.cacheDir = class7.method50("oldschool", var8, var3); // L: 887
						if (!class303.cacheDir.exists()) { // L: 888
							class303.cacheDir.mkdirs();
						}

						File[] var4 = class303.cacheDir.listFiles(); // L: 889
						if (var4 == null) { // L: 890
							break;
						}

						File[] var5 = var4; // L: 892
						int var6 = 0;

						while (true) {
							if (var6 >= var5.length) {
								break label172;
							}

							File var7 = var5[var6]; // L: 894
							if (!class31.method464(var7, false)) { // L: 896
								break;
							}

							++var6; // L: 893
						}
					}

					class126.method2917(class303.cacheDir); // L: 903

					try {
						File var10 = new File(class37.userHomeDirectory, "random.dat"); // L: 906
						int var12;
						if (var10.exists()) { // L: 907
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var10, "rw", 25L), 24, 0); // L: 908
						} else {
							label152:
							for (int var11 = 0; var11 < AbstractWorldMapIcon.cacheSubPaths.length; ++var11) { // L: 911
								for (var12 = 0; var12 < GrandExchangeOffer.cacheParentPaths.length; ++var12) { // L: 912
									File var13 = new File(GrandExchangeOffer.cacheParentPaths[var12] + AbstractWorldMapIcon.cacheSubPaths[var11] + File.separatorChar + "random.dat"); // L: 913
									if (var13.exists()) { // L: 914
										JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var13, "rw", 25L), 24, 0); // L: 915
										break label152; // L: 916
									}
								}
							}
						}

						if (JagexCache.JagexCache_randomDat == null) { // L: 921
							RandomAccessFile var20 = new RandomAccessFile(var10, "rw"); // L: 922
							var12 = var20.read(); // L: 923
							var20.seek(0L); // L: 924
							var20.write(var12); // L: 925
							var20.seek(0L); // L: 926
							var20.close(); // L: 927
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var10, "rw", 25L), 24, 0); // L: 928
						}
					} catch (IOException var17) { // L: 931
					}

					JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class124.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 933
					JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class124.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 934
					JagexCache.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount]; // L: 935

					for (var3 = 0; var3 < JagexCache.idxCount; ++var3) { // L: 936
						JagexCache.JagexCache_idxFiles[var3] = new BufferedFile(new AccessFile(class124.getFile("main_file_cache.idx" + var3), "rw", 1048576L), 6000, 0); // L: 937
					}
				} catch (Exception var18) { // L: 941
					class421.RunException_sendStackTrace((String)null, var18); // L: 942
				}

				ClanChannelMember.client = this; // L: 944
				Buffer.clientType = clientType; // L: 945
				if (field573 == -1) { // L: 946
					field573 = 0; // L: 947
				}

				class298.field3418 = System.getenv("JX_ACCESS_TOKEN"); // L: 949
				SpriteMask.field3386 = System.getenv("JX_REFRESH_TOKEN"); // L: 950
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) { // L: 951
					this.field692 = true; // L: 952
				}

				this.startThread(765, 503, 209, 1); // L: 954
			}
		} catch (RuntimeException var19) {
			throw class19.newRunException(var19, "client.init(" + ')');
		}
	} // L: 955

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 984
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;I)V",
		garbageValue = "-1063867163"
	)
	static void method1227(Font var0, Font var1) {
		int var4;
		int var5;
		if (DirectByteArrayCopier.worldSelectBackSprites == null) { // L: 1646
			Archive var3 = class142.archive8; // L: 1648
			var4 = var3.getGroupId("sl_back"); // L: 1650
			var5 = var3.getFileId(var4, ""); // L: 1651
			SpritePixels[] var2 = BufferedSource.method7532(var3, var4, var5); // L: 1652
			DirectByteArrayCopier.worldSelectBackSprites = var2; // L: 1654
		}

		if (CollisionMap.worldSelectFlagSprites == null) { // L: 1656
			CollisionMap.worldSelectFlagSprites = class410.method7741(class142.archive8, "sl_flags", "");
		}

		if (MouseRecorder.worldSelectArrows == null) { // L: 1657
			MouseRecorder.worldSelectArrows = class410.method7741(class142.archive8, "sl_arrows", "");
		}

		if (SpotAnimationDefinition.worldSelectStars == null) { // L: 1658
			SpotAnimationDefinition.worldSelectStars = class410.method7741(class142.archive8, "sl_stars", "");
		}

		if (GameObject.worldSelectLeftSprite == null) { // L: 1659
			GameObject.worldSelectLeftSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(class142.archive8, "leftarrow", "");
		}

		if (DevicePcmPlayerProvider.worldSelectRightSprite == null) { // L: 1660
			DevicePcmPlayerProvider.worldSelectRightSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(class142.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1661
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1662
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1663
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1664
		if (SpotAnimationDefinition.worldSelectStars != null) { // L: 1665
			SpotAnimationDefinition.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1666
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1667
			SpotAnimationDefinition.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1668
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1669
		}

		if (MouseRecorder.worldSelectArrows != null) { // L: 1671
			int var22 = Login.xPadding + 280; // L: 1672
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1673
				MouseRecorder.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				MouseRecorder.worldSelectArrows[0].drawAt(var22, 4); // L: 1674
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1675
				MouseRecorder.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				MouseRecorder.worldSelectArrows[1].drawAt(var22 + 15, 4); // L: 1676
			}

			var0.draw("World", var22 + 32, 17, 16777215, -1); // L: 1677
			int var23 = Login.xPadding + 390; // L: 1678
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1679
				MouseRecorder.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				MouseRecorder.worldSelectArrows[0].drawAt(var23, 4); // L: 1680
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1681
				MouseRecorder.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				MouseRecorder.worldSelectArrows[1].drawAt(var23 + 15, 4); // L: 1682
			}

			var0.draw("Players", var23 + 32, 17, 16777215, -1); // L: 1683
			var4 = Login.xPadding + 500; // L: 1684
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1685
				MouseRecorder.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				MouseRecorder.worldSelectArrows[0].drawAt(var4, 4); // L: 1686
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1687
				MouseRecorder.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				MouseRecorder.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1688
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1); // L: 1689
			var5 = Login.xPadding + 610; // L: 1690
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1691
				MouseRecorder.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				MouseRecorder.worldSelectArrows[0].drawAt(var5, 4); // L: 1692
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1693
				MouseRecorder.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				MouseRecorder.worldSelectArrows[1].drawAt(var5 + 15, 4); // L: 1694
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1); // L: 1695
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1697
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1698
		Login.hoveredWorldIndex = -1; // L: 1699
		if (DirectByteArrayCopier.worldSelectBackSprites != null) { // L: 1700
			byte var26 = 88; // L: 1701
			byte var27 = 19; // L: 1702
			var4 = 765 / (var26 + 1) - 1; // L: 1703
			var5 = 480 / (var27 + 1); // L: 1704

			int var6;
			int var7;
			do {
				var6 = var5; // L: 1706
				var7 = var4; // L: 1707
				if (var5 * (var4 - 1) >= World.World_count) { // L: 1708
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1709
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1710
					--var5;
				}
			} while(var6 != var5 || var4 != var7); // L: 1711

			var6 = (765 - var26 * var4) / (var4 + 1); // L: 1713
			if (var6 > 5) { // L: 1714
				var6 = 5;
			}

			var7 = (480 - var5 * var27) / (var5 + 1); // L: 1715
			if (var7 > 5) { // L: 1716
				var7 = 5;
			}

			int var8 = (765 - var4 * var26 - var6 * (var4 - 1)) / 2; // L: 1717
			int var9 = (480 - var5 * var27 - var7 * (var5 - 1)) / 2; // L: 1718
			int var10 = (var5 + World.World_count - 1) / var5; // L: 1719
			Login.worldSelectPagesCount = var10 - var4; // L: 1720
			if (GameObject.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1721
				GameObject.worldSelectLeftSprite.drawAt(8, class10.canvasHeight / 2 - GameObject.worldSelectLeftSprite.subHeight * -507610800 / 2); // L: 1722
			}

			if (DevicePcmPlayerProvider.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1724
				DevicePcmPlayerProvider.worldSelectRightSprite.drawAt(GameEngine.canvasWidth - DevicePcmPlayerProvider.worldSelectRightSprite.subWidth - 8, class10.canvasHeight / 2 - DevicePcmPlayerProvider.worldSelectRightSprite.subHeight * -507610800 / 2); // L: 1725
			}

			int var11 = var9 + 23; // L: 1727
			int var12 = var8 + Login.xPadding; // L: 1728
			int var13 = 0; // L: 1729
			boolean var14 = false; // L: 1730
			int var15 = Login.worldSelectPage; // L: 1731

			int var16;
			for (var16 = var15 * var5; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) { // L: 1732 1733
				World var17 = class412.World_worlds[var16]; // L: 1736
				boolean var18 = true; // L: 1737
				String var19 = Integer.toString(var17.population); // L: 1738
				if (var17.population == -1) { // L: 1739
					var19 = "OFF"; // L: 1740
					var18 = false; // L: 1741
				} else if (var17.population > 1980) { // L: 1743
					var19 = "FULL"; // L: 1744
					var18 = false; // L: 1745
				}

				int var21 = 0; // L: 1748
				int var20;
				if (var17.isBeta()) { // L: 1749
					if (var17.isMembersOnly()) { // L: 1750
						var20 = class103.field1336.field1343; // L: 1751
					} else {
						var20 = class103.field1348.field1343; // L: 1754
					}
				} else if (var17.isDeadman()) { // L: 1757
					var21 = 16711680; // L: 1758
					if (var17.isMembersOnly()) { // L: 1759
						var20 = class103.field1334.field1343; // L: 1760
					} else {
						var20 = class103.field1333.field1343; // L: 1763
					}
				} else if (var17.method1770()) { // L: 1766
					if (var17.isMembersOnly()) { // L: 1767
						var20 = class103.field1338.field1343; // L: 1768
					} else {
						var20 = class103.field1347.field1343; // L: 1771
					}
				} else if (var17.isPvp()) { // L: 1774
					if (var17.isMembersOnly()) { // L: 1775
						var20 = class103.field1332.field1343; // L: 1776
					} else {
						var20 = class103.field1331.field1343; // L: 1779
					}
				} else if (var17.method1735()) { // L: 1782
					if (var17.isMembersOnly()) { // L: 1783
						var20 = class103.field1342.field1343; // L: 1784
					} else {
						var20 = class103.field1339.field1343; // L: 1787
					}
				} else if (var17.method1759()) { // L: 1790
					if (var17.isMembersOnly()) { // L: 1791
						var20 = class103.field1340.field1343;
					} else {
						var20 = class103.field1341.field1343; // L: 1792
					}
				} else if (var17.isMembersOnly()) { // L: 1795
					var20 = class103.field1330.field1343; // L: 1796
				} else {
					var20 = class103.field1337.field1343; // L: 1799
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var26 + var12 && MouseHandler.MouseHandler_y < var11 + var27 && var18) { // L: 1802
					Login.hoveredWorldIndex = var16; // L: 1803
					DirectByteArrayCopier.worldSelectBackSprites[var20].drawTransOverlayAt(var12, var11, 128, 16777215); // L: 1804
					var14 = true; // L: 1805
				} else {
					DirectByteArrayCopier.worldSelectBackSprites[var20].drawAt(var12, var11); // L: 1807
				}

				if (CollisionMap.worldSelectFlagSprites != null) { // L: 1808
					CollisionMap.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var27 / 2 + var11 + 5, var21, -1); // L: 1809
				var1.drawCentered(var19, var12 + 60, var27 / 2 + var11 + 5, 268435455, -1); // L: 1810
				var11 = var11 + var7 + var27; // L: 1811
				++var13; // L: 1812
				if (var13 >= var5) {
					var11 = var9 + 23; // L: 1813
					var12 = var12 + var6 + var26; // L: 1814
					var13 = 0; // L: 1815
					++var15; // L: 1816
				}
			}

			if (var14) { // L: 1819
				var16 = var1.stringWidth(class412.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1820
				int var24 = var1.ascent + 8; // L: 1821
				int var25 = MouseHandler.MouseHandler_y + 25; // L: 1822
				if (var24 + var25 > 480) { // L: 1823
					var25 = MouseHandler.MouseHandler_y - 25 - var24; // L: 1824
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 16777120); // L: 1826
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 0); // L: 1827
				var1.drawCentered(class412.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1); // L: 1828
			}
		}

		class1.rasterProvider.drawFull(0, 0); // L: 1831
	} // L: 1832

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lbt;B)V",
		garbageValue = "-106"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != isMembersWorld) { // L: 1836
			isMembersWorld = var0.isMembersOnly(); // L: 1837
			class269.method5368(var0.isMembersOnly()); // L: 1838
		}

		if (var0.properties != worldProperties) { // L: 1840
			Archive var1 = class142.archive8; // L: 1841
			int var2 = var0.properties; // L: 1842
			if ((var2 & 536870912) != 0) { // L: 1844
				MouseRecorder.logoSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 1845
			} else if ((var2 & 1073741824) != 0) { // L: 1847
				MouseRecorder.logoSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 1848
			} else if ((var2 & 256) != 0) { // L: 1850
				MouseRecorder.logoSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", ""); // L: 1851
			} else {
				MouseRecorder.logoSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 1854
			}
		}

		class273.worldHost = var0.host; // L: 1858
		worldId = var0.id; // L: 1859
		worldProperties = var0.properties; // L: 1860
		class159.worldPort = gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1861
		class131.js5Port = gameBuild == 0 ? 443 : var0.id + 50000; // L: 1862
		class454.currentPort = class159.worldPort; // L: 1863
	} // L: 1864

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-887659277"
	)
	static int method1243(int var0, Script var1, boolean var2) {
		return 2; // L: 4894
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2146499980"
	)
	static void method1724() {
		if (oculusOrbState == 1) { // L: 12756
			field500 = true; // L: 12757
		}

	} // L: 12759

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "898430797"
	)
	static void method1726() {
		BufferedSink.clientPreferences.method2398(field494); // L: 12805
	} // L: 12806
}
