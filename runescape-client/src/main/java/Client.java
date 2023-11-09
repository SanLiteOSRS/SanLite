import com.jagex.oldscape.pub.OtlTokenRequester;
import java.io.IOException;
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
import netscape.javascript.JSObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi {
	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "[Leh;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = -593125505
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("sf")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("uf")
	@ObfuscatedGetter(
		intValue = -2039263295
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("vk")
	@ObfuscatedGetter(
		intValue = -1492353427
	)
	public static int field765;
	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "[Llo;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("ve")
	static int[] field547;
	@ObfuscatedName("vb")
	static int[] field771;
	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	static final ApproximateRouteStrategy field691;
	@ObfuscatedName("sn")
	@ObfuscatedGetter(
		intValue = -958997991
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		intValue = 482189695
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tj")
	static boolean[] field738;
	@ObfuscatedName("tm")
	static int[] field739;
	@ObfuscatedName("tr")
	static int[] field740;
	@ObfuscatedName("tg")
	static int[] field758;
	@ObfuscatedName("ts")
	static int[] field615;
	@ObfuscatedName("sl")
	@ObfuscatedGetter(
		intValue = 1972973853
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("vt")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("sd")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("vy")
	@ObfuscatedGetter(
		intValue = 1863409291
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = 1544790939
	)
	static int field757;
	@ObfuscatedName("tx")
	static boolean field518;
	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("uu")
	@ObfuscatedGetter(
		intValue = 1173329533
	)
	static int field715;
	@ObfuscatedName("rk")
	static long[] field712;
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = 2065268297
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("ur")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ui")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = 291067947
	)
	static int field720;
	@ObfuscatedName("rt")
	@ObfuscatedSignature(
		descriptor = "[Lec;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		longValue = 8219782229917045847L
	)
	static long field717;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = 1564846879
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("se")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = 554597375
	)
	static int field713;
	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "[Lay;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("sv")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("sx")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("ro")
	@ObfuscatedGetter(
		intValue = 1613045361
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("su")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("rb")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("rc")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("te")
	static short field561;
	@ObfuscatedName("tz")
	static short field744;
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("ue")
	static short field749;
	@ObfuscatedName("uz")
	static short field724;
	@ObfuscatedName("uq")
	static short field748;
	@ObfuscatedName("vu")
	@ObfuscatedGetter(
		intValue = -214321317
	)
	static int field509;
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		intValue = 46467081
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("tu")
	static short field747;
	@ObfuscatedName("uy")
	@ObfuscatedGetter(
		intValue = 452330879
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		intValue = 1745202273
	)
	static int field714;
	@ObfuscatedName("uh")
	@ObfuscatedGetter(
		intValue = -1231054653
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("rz")
	static int[] field716;
	@ObfuscatedName("tw")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("rw")
	static int[] field577;
	@ObfuscatedName("th")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = -771162051
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("ra")
	@ObfuscatedGetter(
		intValue = 1318868639
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("rh")
	static String field711;
	@ObfuscatedName("ux")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = 1934216883
	)
	static int field764;
	@ObfuscatedName("rj")
	static int[] field768;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lgl;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("ac")
	static boolean field550;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1074720787
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1848339051
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1552911039
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bt")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bw")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 424143225
	)
	static int field480;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1286683717
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1874858369
	)
	static int field482;
	@ObfuscatedName("bh")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 433143709
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("ck")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 2009455757
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		longValue = 8828570225088360675L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 321140693
	)
	static int field553;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 1282655961
	)
	static int field688;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		longValue = 1182064244456354351L
	)
	static long field571;
	@ObfuscatedName("dz")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -2057589813
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 674077049
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1946576145
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1315231485
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 95298825
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 229288235
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 206269602
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 1997312448
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1190303936
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 834377035
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = 295549637
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -1135294709
	)
	static int field505;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 1703762385
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = 456325949
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = -1824307397
	)
	static int field549;
	@ObfuscatedName("fd")
	@ObfuscatedGetter(
		intValue = -2090675435
	)
	static int field668;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = -1527138939
	)
	static int field510;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	static class124 field511;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	static class447 field512;
	@ObfuscatedName("fm")
	static final String field522;
	@ObfuscatedName("gj")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("gr")
	static int[] field525;
	@ObfuscatedName("gp")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "[Lct;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = -140634995
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("gd")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = -972469695
	)
	static int field533;
	@ObfuscatedName("gy")
	static int[] field534;
	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = 1272475123
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("hf")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("hr")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = -802024477
	)
	static int field670;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = -1244346177
	)
	static int field541;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = 1010394869
	)
	static int field644;
	@ObfuscatedName("hw")
	@ObfuscatedGetter(
		intValue = -1345658257
	)
	static int field731;
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		intValue = 1284791171
	)
	static int field539;
	@ObfuscatedName("if")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("ii")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("iw")
	static final int[] field548;
	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		intValue = 828269441
	)
	static int field599;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = 1298457529
	)
	static int field667;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = 1605755819
	)
	static int field624;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = -892944389
	)
	static int field552;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = 642170495
	)
	static int field537;
	@ObfuscatedName("io")
	static boolean field554;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = -2127398199
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = -951416237
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = -531646697
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -1201299809
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = 38032319
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = -639686785
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 324817593
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = 33319765
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = 1381521277
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -1535333199
	)
	static int field564;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = 1576389825
	)
	static int field565;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = -563608413
	)
	static int field566;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = 243534847
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -1909647629
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = 1421382053
	)
	static int field621;
	@ObfuscatedName("kf")
	static boolean field484;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -1956770457
	)
	static int field632;
	@ObfuscatedName("ka")
	static boolean field655;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = 1613713643
	)
	static int field658;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = -443603057
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = -1635512001
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("kk")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("ke")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("kn")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("kj")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("ki")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("kz")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("kw")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("kr")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("kv")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = 420951309
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = -1559516189
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = -414199115
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 432455617
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = -50026519
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 696892515
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = -1625831177
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("kg")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = -46221467
	)
	static int field593;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = -618647139
	)
	static int field594;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = 71474969
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 88534285
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = 118021705
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = -70745545
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("ll")
	static boolean field702;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = 608944511
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = 1879944717
	)
	static int field601;
	@ObfuscatedName("lc")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "[Lcq;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = 729075111
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = -824541387
	)
	static int field592;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		longValue = 5788297570415622891L
	)
	static long field606;
	@ObfuscatedName("lv")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = 141826713
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = 1220043583
	)
	static int field495;
	@ObfuscatedName("ly")
	static int[] field584;
	@ObfuscatedName("ms")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("mu")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("me")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("mr")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = 1162319531
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "[[[Llm;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("mj")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("mg")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("mq")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("ml")
	static boolean field623;
	@ObfuscatedName("my")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = -2113868255
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("mp")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("mc")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("mk")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("mv")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("mi")
	static int[] field630;
	@ObfuscatedName("nd")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ne")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("no")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("nn")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ns")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("np")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("nb")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = 132731607
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(
		intValue = -901423051
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = -789163149
	)
	static int field640;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = -1067407571
	)
	static int field686;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = -1697567139
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("nk")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = 884413697
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("nh")
	@ObfuscatedGetter(
		intValue = 165369349
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("nw")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("ni")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("ny")
	@ObfuscatedGetter(
		intValue = 1440668979
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = 2057258407
	)
	static int field741;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = 320756823
	)
	static int field652;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = 1250087879
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = 1897641313
	)
	static int field635;
	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 169360043
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = 1767446111
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = -1044925517
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = 138246387
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("ov")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("of")
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
	public static Widget clickedWidget;
	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = -475930109
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = -911848757
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("on")
	static boolean field569;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = -831591047
	)
	static int field760;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = -1335704265
	)
	static int field669;
	@ObfuscatedName("ok")
	static boolean field494;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = -1602930227
	)
	static int field671;
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = -447849091
	)
	static int field672;
	@ObfuscatedName("pj")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -942748957
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pt")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = -1387781231
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("pf")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = -819269115
	)
	static int field678;
	@ObfuscatedName("pp")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = -475427615
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("pq")
	static int[] field681;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = 545251803
	)
	static int field682;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -2116556541
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = 425359743
	)
	static int field710;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = -1900225421
	)
	static int field685;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = -797360999
	)
	static int field477;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = 67403443
	)
	static int field687;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = -624392093
	)
	static int field684;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = -374284899
	)
	static int field689;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 1432300223
	)
	static int field690;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = 440973023
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qk")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	static NodeDeque field693;
	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	static NodeDeque field528;
	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = -1456709211
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = -1360612847
	)
	static int field697;
	@ObfuscatedName("qs")
	static boolean[] field643;
	@ObfuscatedName("ql")
	static boolean[] field753;
	@ObfuscatedName("qe")
	static boolean[] field700;
	@ObfuscatedName("qn")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("qt")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("qv")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("qb")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = 1937594901
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		longValue = 8212156720453968763L
	)
	static long field706;
	@ObfuscatedName("qo")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("fv")
	String field513;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Ll;"
	)
	class14 field582;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Le;"
	)
	class19 field662;
	@ObfuscatedName("fn")
	@Export("otlTokenRequester")
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("fo")
	Future field517;
	@ObfuscatedName("fj")
	boolean field488;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Le;"
	)
	class19 field519;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field491;
	@ObfuscatedName("fs")
	@Export("otlTokenRequest")
	Future otlTokenRequest;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	Buffer field526;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	class7 field527;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		longValue = 3747538815892914753L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field550 = true; // L: 148
		worldId = 1; // L: 149
		worldProperties = 0; // L: 150
		gameBuild = 0; // L: 152
		isMembersWorld = false; // L: 155
		isLowDetail = false; // L: 156
		field480 = -1; // L: 161
		clientType = -1; // L: 162
		field482 = -1; // L: 163
		onMobile = false; // L: 164
		gameState = 0; // L: 176
		isLoading = true; // L: 200
		cycle = 0; // L: 201
		mouseLastLastPressedTimeMillis = 1L; // L: 202
		field553 = -1; // L: 204
		field688 = -1; // L: 205
		field571 = -1L; // L: 206
		hadFocus = true; // L: 207
		rebootTimer = 0; // L: 208
		hintArrowType = 0; // L: 209
		hintArrowNpcIndex = 0; // L: 210
		hintArrowPlayerIndex = 0; // L: 211
		hintArrowX = 0; // L: 212
		hintArrowY = 0; // L: 213
		hintArrowHeight = 0; // L: 214
		hintArrowSubX = 0; // L: 215
		hintArrowSubY = 0; // L: 216
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 218
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 219
		titleLoadingStage = 0; // L: 224
		js5ConnectState = 0; // L: 227
		field505 = 0; // L: 228
		js5Errors = 0; // L: 251
		loginState = 0; // L: 253
		field549 = 0; // L: 254
		field668 = 0; // L: 255
		field510 = 0; // L: 256
		field511 = class124.field1521; // L: 257
		field512 = class447.field4756; // L: 258
		int var1 = "com_jagex_auth_desktop_osrs:public".length(); // L: 283
		byte[] var2 = new byte[var1]; // L: 284

		for (int var3 = 0; var3 < var1; ++var3) { // L: 285
			char var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3); // L: 286
			if (var4 > 127) { // L: 287
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 288
			}
		}

		String var5 = class326.method5963(var2, 0, var2.length); // L: 294
		field522 = var5; // L: 296
		Login_isUsernameRemembered = false; // L: 305
		secureRandomFuture = new SecureRandomFuture(); // L: 306
		randomDatData = null; // L: 312
		npcs = new NPC[32768]; // L: 316
		npcCount = 0; // L: 317
		npcIndices = new int[32768]; // L: 318
		field533 = 0; // L: 319
		field534 = new int[250]; // L: 320
		packetWriter = new PacketWriter(); // L: 323
		logoutTimer = 0; // L: 325
		hadNetworkError = false; // L: 326
		timer = new Timer(); // L: 327
		fontsMap = new HashMap(); // L: 333
		field670 = 0; // L: 340
		field541 = 1; // L: 341
		field644 = 0; // L: 342
		field731 = 1; // L: 343
		field539 = 0; // L: 344
		collisionMaps = new CollisionMap[4]; // L: 352
		isInInstance = false; // L: 353
		instanceChunkTemplates = new int[4][13][13]; // L: 354
		field548 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 355
		field599 = 0; // L: 358
		field667 = 2301979; // L: 370
		field624 = 5063219; // L: 371
		field552 = 3353893; // L: 372
		field537 = 7759444; // L: 373
		field554 = false; // L: 374
		alternativeScrollbarWidth = 0; // L: 375
		camAngleX = 128; // L: 383
		camAngleY = 0; // L: 384
		camAngleDY = 0; // L: 385
		camAngleDX = 0; // L: 386
		mouseCamClickedX = 0; // L: 387
		mouseCamClickedY = 0; // L: 388
		oculusOrbState = 0; // L: 389
		camFollowHeight = 50; // L: 390
		field564 = 0; // L: 394
		field565 = 0; // L: 395
		field566 = 0; // L: 396
		oculusOrbNormalSpeed = 12; // L: 398
		oculusOrbSlowedSpeed = 6; // L: 399
		field621 = 0; // L: 400
		field484 = false; // L: 401
		field632 = 0; // L: 402
		field655 = false; // L: 403
		field658 = 0; // L: 404
		overheadTextCount = 0; // L: 405
		overheadTextLimit = 50; // L: 406
		overheadTextXs = new int[overheadTextLimit]; // L: 407
		overheadTextYs = new int[overheadTextLimit]; // L: 408
		overheadTextAscents = new int[overheadTextLimit]; // L: 409
		overheadTextXOffsets = new int[overheadTextLimit]; // L: 410
		overheadTextColors = new int[overheadTextLimit]; // L: 411
		overheadTextEffects = new int[overheadTextLimit]; // L: 412
		overheadTextCyclesRemaining = new int[overheadTextLimit]; // L: 413
		overheadText = new String[overheadTextLimit]; // L: 414
		tileLastDrawnActor = new int[104][104]; // L: 415
		viewportDrawCount = 0; // L: 416
		viewportTempX = -1; // L: 417
		viewportTempY = -1; // L: 418
		mouseCrossX = 0; // L: 419
		mouseCrossY = 0; // L: 420
		mouseCrossState = 0; // L: 421
		mouseCrossColor = 0; // L: 422
		showMouseCross = true; // L: 423
		field593 = 0; // L: 425
		field594 = 0; // L: 426
		dragItemSlotSource = 0; // L: 429
		draggedWidgetX = 0; // L: 430
		draggedWidgetY = 0; // L: 431
		dragItemSlotDestination = 0; // L: 432
		field702 = false; // L: 433
		itemDragDuration = 0; // L: 434
		field601 = 0; // L: 435
		showLoadingMessages = true; // L: 437
		players = new Player[2048]; // L: 439
		localPlayerIndex = -1; // L: 441
		field592 = 0; // L: 442
		field606 = -1L; // L: 443
		renderSelf = true; // L: 445
		drawPlayerNames = 0; // L: 450
		field495 = 0; // L: 451
		field584 = new int[1000]; // L: 452
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 454
		playerMenuActions = new String[8]; // L: 455
		playerOptionsPriorities = new boolean[8]; // L: 456
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 457
		combatTargetPlayerIndex = -1; // L: 458
		groundItems = new NodeDeque[4][104][104]; // L: 459
		pendingSpawns = new NodeDeque(); // L: 460
		projectiles = new NodeDeque(); // L: 461
		graphicsObjects = new NodeDeque(); // L: 462
		currentLevels = new int[25]; // L: 463
		levels = new int[25]; // L: 464
		experience = new int[25]; // L: 465
		field623 = false; // L: 466
		isMenuOpen = false; // L: 467
		menuOptionsCount = 0; // L: 473
		menuArguments1 = new int[500]; // L: 474
		menuArguments2 = new int[500]; // L: 475
		menuOpcodes = new int[500]; // L: 476
		menuIdentifiers = new int[500]; // L: 477
		field630 = new int[500]; // L: 478
		menuActions = new String[500]; // L: 479
		menuTargets = new String[500]; // L: 480
		menuShiftClick = new boolean[500]; // L: 481
		followerOpsLowPriority = false; // L: 482
		shiftClickDrop = false; // L: 484
		tapToDrop = false; // L: 485
		showMouseOverText = true; // L: 486
		viewportX = -1; // L: 487
		viewportY = -1; // L: 488
		field640 = 0; // L: 492
		field686 = 50; // L: 493
		isItemSelected = 0; // L: 494
		selectedItemName = null; // L: 498
		isSpellSelected = false; // L: 499
		selectedSpellChildIndex = -1; // L: 501
		selectedSpellItemId = -1; // L: 502
		selectedSpellActionName = null; // L: 504
		selectedSpellName = null; // L: 505
		rootInterface = -1; // L: 506
		interfaceParents = new NodeHashTable(8); // L: 507
		field741 = 0; // L: 512
		field652 = -1; // L: 513
		chatEffects = 0; // L: 514
		field635 = 0; // L: 515
		meslayerContinueWidget = null; // L: 516
		runEnergy = 0; // L: 517
		weight = 0; // L: 518
		staffModLevel = 0; // L: 519
		followerIndex = -1; // L: 520
		playerMod = false; // L: 521
		viewportWidget = null; // L: 522
		clickedWidget = null; // L: 523
		clickedWidgetParent = null; // L: 524
		widgetClickX = 0; // L: 525
		widgetClickY = 0; // L: 526
		draggedOnWidget = null; // L: 527
		field569 = false; // L: 528
		field760 = -1; // L: 529
		field669 = -1; // L: 530
		field494 = false; // L: 531
		field671 = -1; // L: 532
		field672 = -1; // L: 533
		isDraggingWidget = false; // L: 534
		cycleCntr = 1; // L: 539
		changedVarps = new int[32]; // L: 542
		changedVarpCount = 0; // L: 543
		changedItemContainers = new int[32]; // L: 544
		field678 = 0; // L: 545
		changedSkills = new int[32]; // L: 546
		changedSkillsCount = 0; // L: 547
		field681 = new int[32]; // L: 548
		field682 = 0; // L: 549
		chatCycle = 0; // L: 550
		field710 = 0; // L: 551
		field685 = 0; // L: 552
		field477 = 0; // L: 553
		field687 = 0; // L: 554
		field684 = 0; // L: 555
		field689 = 0; // L: 556
		field690 = 0; // L: 557
		mouseWheelRotation = 0; // L: 563
		scriptEvents = new NodeDeque(); // L: 564
		field693 = new NodeDeque(); // L: 565
		field528 = new NodeDeque(); // L: 566
		widgetFlags = new NodeHashTable(512); // L: 567
		rootWidgetCount = 0; // L: 569
		field697 = -2; // L: 570
		field643 = new boolean[100]; // L: 571
		field753 = new boolean[100]; // L: 572
		field700 = new boolean[100]; // L: 573
		rootWidgetXs = new int[100]; // L: 574
		rootWidgetYs = new int[100]; // L: 575
		rootWidgetWidths = new int[100]; // L: 576
		rootWidgetHeights = new int[100]; // L: 577
		gameDrawingMode = 0; // L: 578
		field706 = 0L; // L: 579
		isResizable = true; // L: 580
		field768 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 587
		publicChatMode = 0; // L: 588
		tradeChatMode = 0; // L: 590
		field711 = ""; // L: 591
		field712 = new long[100]; // L: 593
		field713 = 0; // L: 594
		field714 = 0; // L: 596
		field577 = new int[128]; // L: 597
		field716 = new int[128]; // L: 598
		field717 = -1L; // L: 599
		currentClanSettings = new ClanSettings[4]; // L: 603
		currentClanChannels = new ClanChannel[4]; // L: 605
		field720 = -1; // L: 607
		mapIconCount = 0; // L: 608
		mapIconXs = new int[1000]; // L: 609
		mapIconYs = new int[1000]; // L: 610
		mapIcons = new SpritePixels[1000]; // L: 611
		destinationX = 0; // L: 612
		destinationY = 0; // L: 613
		minimapState = 0; // L: 620
		currentTrackGroupId = -1; // L: 621
		playingJingle = false; // L: 622
		soundEffectCount = 0; // L: 628
		soundEffectIds = new int[50]; // L: 629
		queuedSoundEffectLoops = new int[50]; // L: 630
		queuedSoundEffectDelays = new int[50]; // L: 631
		soundLocations = new int[50]; // L: 632
		soundEffects = new SoundEffect[50]; // L: 633
		isCameraLocked = false; // L: 635
		field518 = false; // L: 646
		field738 = new boolean[5]; // L: 654
		field739 = new int[5]; // L: 655
		field740 = new int[5]; // L: 656
		field758 = new int[5]; // L: 657
		field615 = new int[5]; // L: 658
		field561 = 256; // L: 659
		field744 = 205; // L: 660
		zoomHeight = 256; // L: 661
		zoomWidth = 320; // L: 662
		field747 = 1; // L: 663
		field748 = 32767; // L: 664
		field749 = 1; // L: 665
		field724 = 32767; // L: 666
		viewportOffsetX = 0; // L: 667
		viewportOffsetY = 0; // L: 668
		viewportWidth = 0; // L: 669
		viewportHeight = 0; // L: 670
		viewportZoom = 0; // L: 671
		playerAppearance = new PlayerComposition(); // L: 673
		field757 = -1; // L: 674
		field715 = -1; // L: 675
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 677
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 679
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 682
		Widget_cachedModels = new EvictingDualNodeHashTable(64); // L: 684
		Widget_cachedFonts = new EvictingDualNodeHashTable(64); // L: 685
		field764 = -1; // L: 688
		field765 = -1; // L: 694
		archiveLoaders = new ArrayList(10); // L: 695
		archiveLoadersDone = 0; // L: 696
		field509 = 0; // L: 697
		field691 = new ApproximateRouteStrategy(); // L: 706
		field547 = new int[50]; // L: 707
		field771 = new int[50]; // L: 708
	}

	public Client() {
		this.field488 = false; // L: 274
		this.accountHash = -1L;
	} // L: 311

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field706 = class181.method3483() + 500L; // L: 4349
		this.resizeJS(); // L: 4350
		if (rootInterface != -1) { // L: 4351
			this.resizeRoot(true);
		}

	} // L: 4352

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1873118726"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000}; // L: 938
		int[] var2 = new int[]{1000, 100, 500}; // L: 939
		if (var1 != null && var2 != null) { // L: 941
			UserComparator4.ByteArrayPool_alternativeSizes = var1; // L: 948
			ByteArrayPool.ByteArrayPool_altSizeArrayCounts = new int[var1.length]; // L: 949
			AbstractByteArrayCopier.ByteArrayPool_arrays = new byte[var1.length][][]; // L: 950

			for (int var3 = 0; var3 < UserComparator4.ByteArrayPool_alternativeSizes.length; ++var3) { // L: 951
				AbstractByteArrayCopier.ByteArrayPool_arrays[var3] = new byte[var2[var3]][]; // L: 952
				ByteArrayPool.field4218.add(var1[var3]); // L: 953
			}

			Collections.sort(ByteArrayPool.field4218); // L: 955
		} else {
			UserComparator4.ByteArrayPool_alternativeSizes = null; // L: 942
			ByteArrayPool.ByteArrayPool_altSizeArrayCounts = null; // L: 943
			AbstractByteArrayCopier.ByteArrayPool_arrays = null; // L: 944
			class327.method5978(); // L: 945
		}

		GroundObject.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 957
		FileSystem.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 958
		WorldMapLabelSize.currentPort = GroundObject.worldPort; // L: 959
		PlayerComposition.field3333 = class293.field3338; // L: 960
		GroundObject.field2275 = class293.field3339; // L: 961
		class220.field2674 = class293.field3342; // L: 962
		PlayerComposition.field3331 = class293.field3341; // L: 963
		MilliClock.urlRequester = new class101(this.field488, 207); // L: 964
		this.setUpKeyboard(); // L: 965
		this.method523(); // L: 966
		class119.mouseWheel = this.mouseWheel(); // L: 967
		class11.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 968
		AccessFile var4 = null; // L: 971
		ClientPreferences var5 = new ClientPreferences(); // L: 972

		try {
			var4 = class433.getPreferencesFile("", class20.field111.name, false); // L: 974
			byte[] var6 = new byte[(int)var4.length()]; // L: 975

			int var8;
			for (int var7 = 0; var7 < var6.length; var7 += var8) { // L: 976 977 980
				var8 = var4.read(var6, var7, var6.length - var7); // L: 978
				if (var8 == -1) { // L: 979
					throw new IOException();
				}
			}

			var5 = new ClientPreferences(new Buffer(var6)); // L: 982
		} catch (Exception var11) { // L: 984
		}

		try {
			if (var4 != null) { // L: 986
				var4.close();
			}
		} catch (Exception var10) { // L: 988
		}

		FriendsChatMember.clientPreferences = var5; // L: 991
		this.setUpClipboard(); // L: 992
		String var12 = WorldMapSection2.field2693; // L: 994
		class29.field174 = this; // L: 996
		if (var12 != null) { // L: 997
			class29.field167 = var12;
		}

		ClanSettings.setWindowedMode(FriendsChatMember.clientPreferences.method2231()); // L: 999
		class321.friendSystem = new FriendSystem(StructComposition.loginType); // L: 1000
		this.field582 = new class14("tokenRequest", 1, 1); // L: 1001
	} // L: 1002

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1259435317"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 1006
		this.doCycleJs5(); // L: 1007

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 1011
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 1012
			} // L: 1013

			if (var1 == null) { // L: 1014
				WorldMapEvent.method5064(); // L: 1018
				class83.playPcmPlayers(); // L: 1019
				class427.method7443(); // L: 1020
				synchronized(MouseHandler.MouseHandler_instance) { // L: 1022
					MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 1023
					MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 1024
					MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 1025
					MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 1026
					MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 1027
					MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 1028
					MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 1029
					MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 1030
					MouseHandler.MouseHandler_lastButtonVolatile = 0;
				}

				if (class119.mouseWheel != null) {
					int var5 = class119.mouseWheel.useRotation();
					mouseWheelRotation = var5; // L: 1036
				}

				if (gameState == 0) {
					FileSystem.load(); // L: 1039
					class82.method2078(); // L: 1040
				} else if (gameState == 5) { // L: 1042
					class174.loginScreen(this, ReflectionCheck.fontPlain12); // L: 1043
					FileSystem.load(); // L: 1044
					class82.method2078(); // L: 1045
				} else if (gameState != 10 && gameState != 11) { // L: 1047
					if (gameState == 20) { // L: 1048
						class174.loginScreen(this, ReflectionCheck.fontPlain12); // L: 1049
						this.doCycleLoggedOut(); // L: 1050
					} else if (gameState == 50) { // L: 1052
						class174.loginScreen(this, ReflectionCheck.fontPlain12); // L: 1053
						this.doCycleLoggedOut(); // L: 1054
					} else if (gameState == 25) { // L: 1056
						class150.method3071();
					}
				} else {
					class174.loginScreen(this, ReflectionCheck.fontPlain12);
				}

				if (gameState == 30) { // L: 1057
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) { // L: 1058
					this.doCycleLoggedOut();
				}

				return;
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false); // L: 1015
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-413320809"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label170: {
			try {
				if (class273.musicPlayerStatus == 2) { // L: 1066
					if (Username.musicTrack == null) { // L: 1067
						Username.musicTrack = MusicTrack.readTrack(NetFileRequest.musicTrackArchive, UrlRequester.musicTrackGroupId, SceneTilePaint.musicTrackFileId); // L: 1068
						if (Username.musicTrack == null) { // L: 1069
							var2 = false; // L: 1070
							break label170;
						}
					}

					if (Script.soundCache == null) { // L: 1074
						Script.soundCache = new SoundCache(class273.soundEffectsArchive, class273.musicSamplesArchive);
					}

					if (ItemContainer.midiPcmStream.loadMusicTrack(Username.musicTrack, class273.musicPatchesArchive, Script.soundCache, 22050)) { // L: 1075
						ItemContainer.midiPcmStream.clearAll(); // L: 1076
						ItemContainer.midiPcmStream.setPcmStreamVolume(class28.musicTrackVolume); // L: 1077
						ItemContainer.midiPcmStream.setMusicTrack(Username.musicTrack, class273.musicTrackBoolean); // L: 1078
						class273.musicPlayerStatus = 0; // L: 1079
						Username.musicTrack = null; // L: 1080
						Script.soundCache = null; // L: 1081
						NetFileRequest.musicTrackArchive = null; // L: 1082
						var2 = true; // L: 1083
						break label170;
					}
				}
			} catch (Exception var6) { // L: 1088
				var6.printStackTrace(); // L: 1089
				ItemContainer.midiPcmStream.clear(); // L: 1090
				class273.musicPlayerStatus = 0; // L: 1091
				Username.musicTrack = null; // L: 1092
				Script.soundCache = null; // L: 1093
				NetFileRequest.musicTrackArchive = null; // L: 1094
			}

			var2 = false; // L: 1096
		}

		if (var2 && playingJingle && class78.pcmPlayer0 != null) { // L: 1099 1100
			class78.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field706 && class181.method3483() > field706) { // L: 1102 1103
			ClanSettings.setWindowedMode(Canvas.getWindowedMode()); // L: 1104
		}

		int var4;
		if (var1) { // L: 1107
			for (var4 = 0; var4 < 100; ++var4) { // L: 1108
				field643[var4] = true;
			}
		}

		if (gameState == 0) { // L: 1110
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1111
			class291.drawTitle(WorldMapSection2.fontBold12, class306.fontPlain11, ReflectionCheck.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1112
			if (gameState == 20) { // L: 1113
				class291.drawTitle(WorldMapSection2.fontBold12, class306.fontPlain11, ReflectionCheck.fontPlain12);
			} else if (gameState == 50) { // L: 1114
				class291.drawTitle(WorldMapSection2.fontBold12, class306.fontPlain11, ReflectionCheck.fontPlain12);
			} else if (gameState == 25) { // L: 1115
				if (field539 == 1) { // L: 1116
					if (field670 > field541) { // L: 1117
						field541 = field670;
					}

					var4 = (field541 * 50 - field670 * 50) / field541; // L: 1118
					class20.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1119
				} else if (field539 == 2) { // L: 1121
					if (field644 > field731) { // L: 1122
						field731 = field644;
					}

					var4 = (field731 * 50 - field644 * 50) / field731 + 50; // L: 1123
					class20.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1124
				} else {
					class20.drawLoadingMessage("Loading - please wait.", false); // L: 1126
				}
			} else if (gameState == 30) { // L: 1128
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1129
				class20.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1130
				class20.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class291.drawTitle(WorldMapSection2.fontBold12, class306.fontPlain11, ReflectionCheck.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1131
			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1132
				if (field753[var4]) { // L: 1133
					class119.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]); // L: 1134
					field753[var4] = false; // L: 1135
				}
			}
		} else if (gameState > 0) { // L: 1139
			class119.rasterProvider.drawFull(0, 0); // L: 1140

			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1141
				field753[var4] = false;
			}
		}

	} // L: 1143

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1917361583"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class341.varcs.hasUnwrittenChanges()) { // L: 1146
			class341.varcs.write();
		}

		if (GrandExchangeEvents.mouseRecorder != null) { // L: 1147
			GrandExchangeEvents.mouseRecorder.isRunning = false;
		}

		GrandExchangeEvents.mouseRecorder = null; // L: 1148
		packetWriter.close(); // L: 1149
		if (KeyHandler.KeyHandler_instance != null) { // L: 1151
			synchronized(KeyHandler.KeyHandler_instance) { // L: 1152
				KeyHandler.KeyHandler_instance = null; // L: 1153
			} // L: 1154
		}

		class193.method3820(); // L: 1157
		class119.mouseWheel = null; // L: 1158
		if (class78.pcmPlayer0 != null) { // L: 1159
			class78.pcmPlayer0.shutdown();
		}

		if (MouseRecorder.pcmPlayer1 != null) { // L: 1160
			MouseRecorder.pcmPlayer1.shutdown();
		}

		class1.method7(); // L: 1161
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 1163
			if (ArchiveDiskActionHandler.field3970 != 0) { // L: 1164
				ArchiveDiskActionHandler.field3970 = 1; // L: 1165

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 1167
				} catch (InterruptedException var5) { // L: 1169
				}
			}
		}

		if (MilliClock.urlRequester != null) { // L: 1173
			MilliClock.urlRequester.close(); // L: 1174
			MilliClock.urlRequester = null; // L: 1175
		}

		try {
			JagexCache.JagexCache_dat2File.close(); // L: 1179

			for (int var4 = 0; var4 < class439.idxCount; ++var4) { // L: 1180
				class115.JagexCache_idxFiles[var4].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 1181
			JagexCache.JagexCache_randomDat.close(); // L: 1182
		} catch (Exception var7) { // L: 1184
		}

		this.field582.method169(); // L: 1186
	} // L: 1187

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1773732375"
	)
	protected final void vmethod1142() {
	} // L: 715

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "20548"
	)
	boolean method1086() {
		return DevicePcmPlayerProvider.field156 != null && !DevicePcmPlayerProvider.field156.trim().isEmpty(); // L: 883
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1250484803"
	)
	@Export("isOtlTokenRequesterInitialized")
	boolean isOtlTokenRequesterInitialized() {
		return this.otlTokenRequester != null; // L: 887
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "778701875"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 891
		var2.put("grant_type", "refresh_token"); // L: 892
		var2.put("scope", "gamesso.token.create"); // L: 893
		var2.put("refresh_token", var1); // L: 894
		URL var3 = new URL(UserComparator8.field1371 + "shield/oauth/token" + (new class401(var2)).method7058()); // L: 895
		HashMap var4 = new HashMap(); // L: 896
		var4.put("Authorization", "Basic " + field522); // L: 897
		var4.put("Host", (new URL(UserComparator8.field1371)).getHost()); // L: 898
		var4.put("Accept", class398.field4438.method7043()); // L: 899
		class9 var5 = class9.field46; // L: 900
		RefreshAccessTokenRequester var6 = this.field491; // L: 901
		if (var6 != null) { // L: 902
			this.otlTokenRequest = var6.request(var5.method76(), var3, var4, ""); // L: 903
		} else {
			class10 var7 = new class10(var3, var5, this.field488); // L: 906
			Iterator var8 = var4.entrySet().iterator(); // L: 907

			while (var8.hasNext()) {
				Entry var9 = (Entry)var8.next(); // L: 908
				var7.method82((String)var9.getKey(), (String)var9.getValue()); // L: 910
			}

			this.field519 = this.field582.method168(var7); // L: 913
		}
	} // L: 904 914

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "576836843"
	)
	void method1089(String var1) throws MalformedURLException, IOException {
		URL var2 = new URL(UserComparator8.field1371 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 917
		HashMap var3 = new HashMap(); // L: 918
		var3.put("Authorization", "Bearer " + var1); // L: 919
		class9 var4 = class9.field36; // L: 920
		OtlTokenRequester var5 = this.otlTokenRequester; // L: 921
		if (var5 != null) { // L: 922
			this.field517 = var5.request(var4.method76(), var2, var3, ""); // L: 923
		} else {
			class10 var6 = new class10(var2, var4, this.field488); // L: 926
			Iterator var7 = var3.entrySet().iterator(); // L: 927

			while (var7.hasNext()) {
				Entry var8 = (Entry)var7.next(); // L: 928
				var6.method82((String)var8.getKey(), (String)var8.getValue()); // L: 930
			}

			this.field662 = this.field582.method168(var6); // L: 933
		}
	} // L: 924 934

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2129853684"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1280
			boolean var1 = ScriptFrame.method1036(); // L: 1281
			if (!var1) {
				this.doCycleJs5Connect(); // L: 1282
			}

		}
	} // L: 1283

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "78"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1286
			this.error("js5crc"); // L: 1287
			class4.updateGameState(1000); // L: 1288
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1291
				if (gameState <= 5) { // L: 1292
					this.error("js5io"); // L: 1293
					class4.updateGameState(1000); // L: 1294
					return; // L: 1295
				}

				field505 = 3000; // L: 1298
				NetCache.NetCache_ioExceptions = 3; // L: 1299
			}

			if (--field505 + 1 <= 0) { // L: 1302
				try {
					if (js5ConnectState == 0) { // L: 1304
						WorldMapElement.js5SocketTask = GameEngine.taskHandler.newSocketTask(class12.worldHost, WorldMapLabelSize.currentPort); // L: 1305
						++js5ConnectState; // L: 1306
					}

					if (js5ConnectState == 1) { // L: 1308
						if (WorldMapElement.js5SocketTask.status == 2) { // L: 1309
							this.js5Error(-1); // L: 1310
							return; // L: 1311
						}

						if (WorldMapElement.js5SocketTask.status == 1) { // L: 1313
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1315
						ClientPreferences.js5Socket = UserComparator5.method2571((Socket)WorldMapElement.js5SocketTask.result, 40000, 5000); // L: 1316
						Buffer var1 = new Buffer(5); // L: 1317
						var1.writeByte(15); // L: 1318
						var1.writeInt(207); // L: 1319
						ClientPreferences.js5Socket.write(var1.array, 0, 5); // L: 1320
						++js5ConnectState; // L: 1321
						class228.field2765 = class181.method3483(); // L: 1322
					}

					if (js5ConnectState == 3) { // L: 1324
						if (ClientPreferences.js5Socket.available() > 0) { // L: 1325
							int var5 = ClientPreferences.js5Socket.readUnsignedByte(); // L: 1326
							if (var5 != 0) { // L: 1327
								this.js5Error(var5); // L: 1328
								return; // L: 1329
							}

							++js5ConnectState; // L: 1331
						} else if (class181.method3483() - class228.field2765 > 30000L) { // L: 1334
							this.js5Error(-2); // L: 1335
							return; // L: 1336
						}
					}

					if (js5ConnectState == 4) { // L: 1340
						AbstractSocket var12 = ClientPreferences.js5Socket; // L: 1341
						boolean var2 = gameState > 20; // L: 1342
						if (NetCache.NetCache_socket != null) { // L: 1344
							try {
								NetCache.NetCache_socket.close(); // L: 1346
							} catch (Exception var10) { // L: 1348
							}

							NetCache.NetCache_socket = null; // L: 1349
						}

						NetCache.NetCache_socket = var12; // L: 1351
						Buffer var3;
						if (NetCache.NetCache_socket != null) { // L: 1353
							try {
								var3 = new Buffer(4); // L: 1355
								var3.writeByte(var2 ? 2 : 3); // L: 1356
								var3.writeMedium(0); // L: 1357
								NetCache.NetCache_socket.write(var3.array, 0, 4); // L: 1358
							} catch (IOException var9) {
								try {
									NetCache.NetCache_socket.close(); // L: 1362
								} catch (Exception var8) { // L: 1364
								}

								++NetCache.NetCache_ioExceptions; // L: 1365
								NetCache.NetCache_socket = null; // L: 1366
							}
						}

						NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1369
						MenuAction.NetCache_currentResponse = null; // L: 1370
						ClientPreferences.NetCache_responseArchiveBuffer = null; // L: 1371
						NetCache.field4028 = 0; // L: 1372

						while (true) {
							NetFileRequest var13 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 1374
							if (var13 == null) { // L: 1375
								while (true) {
									var13 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 1381
									if (var13 == null) { // L: 1382
										if (NetCache.field4029 != 0) { // L: 1388
											try {
												var3 = new Buffer(4); // L: 1390
												var3.writeByte(4); // L: 1391
												var3.writeByte(NetCache.field4029); // L: 1392
												var3.writeShort(0); // L: 1393
												NetCache.NetCache_socket.write(var3.array, 0, 4); // L: 1394
											} catch (IOException var7) {
												try {
													NetCache.NetCache_socket.close(); // L: 1398
												} catch (Exception var6) { // L: 1400
												}

												++NetCache.NetCache_ioExceptions; // L: 1401
												NetCache.NetCache_socket = null; // L: 1402
											}
										}

										NetCache.NetCache_loadTime = 0; // L: 1405
										NetCache.field4017 = class181.method3483(); // L: 1406
										WorldMapElement.js5SocketTask = null; // L: 1408
										ClientPreferences.js5Socket = null; // L: 1409
										js5ConnectState = 0; // L: 1410
										js5Errors = 0; // L: 1411
										return; // L: 1417
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var13); // L: 1383
									NetCache.NetCache_pendingWrites.put(var13, var13.key); // L: 1384
									++NetCache.NetCache_pendingWritesCount; // L: 1385
									--NetCache.NetCache_pendingResponsesCount; // L: 1386
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var13, var13.key); // L: 1376
							++NetCache.NetCache_pendingPriorityWritesCount; // L: 1377
							--NetCache.NetCache_pendingPriorityResponsesCount; // L: 1378
						}
					}
				} catch (IOException var11) { // L: 1414
					this.js5Error(-3); // L: 1415
				}

			}
		}
	} // L: 1289

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "35"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		WorldMapElement.js5SocketTask = null; // L: 1420
		ClientPreferences.js5Socket = null; // L: 1421
		js5ConnectState = 0; // L: 1422
		if (WorldMapLabelSize.currentPort == GroundObject.worldPort) { // L: 1423
			WorldMapLabelSize.currentPort = FileSystem.js5Port;
		} else {
			WorldMapLabelSize.currentPort = GroundObject.worldPort; // L: 1424
		}

		++js5Errors; // L: 1425
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1426
			if (gameState <= 5) { // L: 1427
				this.error("js5connect_full"); // L: 1428
				class4.updateGameState(1000); // L: 1429
			} else {
				field505 = 3000; // L: 1431
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1433
			this.error("js5connect_outofdate"); // L: 1434
			class4.updateGameState(1000); // L: 1435
		} else if (js5Errors >= 4) { // L: 1437
			if (gameState <= 5) { // L: 1438
				this.error("js5connect"); // L: 1439
				class4.updateGameState(1000); // L: 1440
			} else {
				field505 = 3000; // L: 1442
			}
		}

	} // L: 1444

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "14059"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket(); // L: 1890
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 1891

		try {
			if (loginState == 0) { // L: 1893
				if (GrandExchangeOfferOwnWorldComparator.secureRandom == null && (secureRandomFuture.isDone() || field549 > 250)) { // L: 1894
					GrandExchangeOfferOwnWorldComparator.secureRandom = secureRandomFuture.get(); // L: 1895
					secureRandomFuture.shutdown(); // L: 1896
					secureRandomFuture = null; // L: 1897
				}

				if (GrandExchangeOfferOwnWorldComparator.secureRandom != null) { // L: 1899
					if (var1 != null) { // L: 1900
						var1.close(); // L: 1901
						var1 = null; // L: 1902
					}

					class118.socketTask = null; // L: 1904
					hadNetworkError = false; // L: 1905
					field549 = 0; // L: 1906
					if (field512.method7914()) { // L: 1907
						try {
							this.requestOtlToken(class344.field4150); // L: 1909
							ApproximateRouteStrategy.method1069(21); // L: 1910
						} catch (Throwable var26) { // L: 1912
							class33.RunException_sendStackTrace((String)null, var26); // L: 1913
							class12.getLoginError(65); // L: 1914
							return; // L: 1915
						}
					} else {
						ApproximateRouteStrategy.method1069(1); // L: 1919
					}
				}
			}

			class21 var28;
			if (loginState == 21) { // L: 1923
				if (this.otlTokenRequest != null) { // L: 1924
					if (!this.otlTokenRequest.isDone()) { // L: 1925
						return; // L: 1926
					}

					if (this.otlTokenRequest.isCancelled()) { // L: 1928
						class12.getLoginError(65); // L: 1929
						this.otlTokenRequest = null; // L: 1930
						return; // L: 1931
					}

					try {
						OtlTokenResponse var3 = (OtlTokenResponse)this.otlTokenRequest.get(); // L: 1934
						if (!var3.isSuccess()) { // L: 1935
							class12.getLoginError(65); // L: 1936
							this.otlTokenRequest = null; // L: 1937
							return; // L: 1938
						}

						DevicePcmPlayerProvider.field156 = var3.getAccessToken(); // L: 1940
						class344.field4150 = var3.getRefreshToken(); // L: 1941
						this.otlTokenRequest = null; // L: 1942
					} catch (Exception var25) { // L: 1944
						class33.RunException_sendStackTrace((String)null, var25); // L: 1945
						class12.getLoginError(65); // L: 1946
						this.otlTokenRequest = null; // L: 1947
						return; // L: 1948
					}
				} else {
					if (this.field519 == null) { // L: 1951
						class12.getLoginError(65); // L: 1981
						return; // L: 1982
					}

					if (!this.field519.method269()) { // L: 1952
						return; // L: 1953
					}

					if (this.field519.method268()) { // L: 1955
						class33.RunException_sendStackTrace(this.field519.method283(), (Throwable)null); // L: 1956
						class12.getLoginError(65); // L: 1957
						this.field519 = null; // L: 1958
						return; // L: 1959
					}

					var28 = this.field519.method270(); // L: 1961
					if (var28.method295() != 200) { // L: 1962
						class12.getLoginError(65); // L: 1963
						this.field519 = null; // L: 1964
						return; // L: 1965
					}

					field549 = 0; // L: 1967
					class400 var4 = new class400(var28.method292()); // L: 1968

					try {
						DevicePcmPlayerProvider.field156 = var4.method7049().getString("access_token"); // L: 1970
						class344.field4150 = var4.method7049().getString("refresh_token"); // L: 1971
					} catch (Exception var24) { // L: 1973
						class33.RunException_sendStackTrace("Error parsing tokens", var24); // L: 1974
						class12.getLoginError(65); // L: 1975
						this.field519 = null; // L: 1976
						return; // L: 1977
					}
				}

				this.method1089(DevicePcmPlayerProvider.field156); // L: 1984
				ApproximateRouteStrategy.method1069(20); // L: 1985
			}

			if (loginState == 20) { // L: 1987
				if (this.field517 != null) { // L: 1988
					if (!this.field517.isDone()) { // L: 1989
						return; // L: 1990
					}

					if (this.field517.isCancelled()) { // L: 1992
						class12.getLoginError(65); // L: 1993
						this.field517 = null; // L: 1994
						return; // L: 1995
					}

					try {
						com.jagex.oldscape.pub.OtlTokenResponse var29 = (com.jagex.oldscape.pub.OtlTokenResponse)this.field517.get(); // L: 1998
						if (!var29.isSuccess()) { // L: 1999
							class12.getLoginError(65); // L: 2000
							this.field517 = null; // L: 2001
							return; // L: 2002
						}

						this.field513 = var29.getToken(); // L: 2004
						this.field517 = null; // L: 2005
					} catch (Exception var23) { // L: 2007
						class33.RunException_sendStackTrace((String)null, var23); // L: 2008
						class12.getLoginError(65); // L: 2009
						this.field517 = null; // L: 2010
						return; // L: 2011
					}
				} else {
					if (this.field662 == null) { // L: 2014
						class12.getLoginError(65); // L: 2035
						return; // L: 2036
					}

					if (!this.field662.method269()) { // L: 2015
						return; // L: 2016
					}

					if (this.field662.method268()) { // L: 2018
						class33.RunException_sendStackTrace(this.field662.method283(), (Throwable)null); // L: 2019
						class12.getLoginError(65); // L: 2020
						this.field662 = null; // L: 2021
						return; // L: 2022
					}

					var28 = this.field662.method270(); // L: 2024
					if (var28.method295() != 200) { // L: 2025
						class33.RunException_sendStackTrace("Response code: " + var28.method295() + "Response body: " + var28.method292(), (Throwable)null); // L: 2026
						class12.getLoginError(65); // L: 2027
						this.field662 = null; // L: 2028
						return; // L: 2029
					}

					this.field513 = var28.method292(); // L: 2031
					this.field662 = null; // L: 2032
				}

				field549 = 0; // L: 2038
				ApproximateRouteStrategy.method1069(1); // L: 2039
			}

			if (loginState == 1) { // L: 2041
				if (class118.socketTask == null) { // L: 2042
					class118.socketTask = GameEngine.taskHandler.newSocketTask(class12.worldHost, WorldMapLabelSize.currentPort); // L: 2043
				}

				if (class118.socketTask.status == 2) { // L: 2045
					throw new IOException();
				}

				if (class118.socketTask.status == 1) { // L: 2046
					var1 = UserComparator5.method2571((Socket)class118.socketTask.result, 40000, 5000); // L: 2047
					packetWriter.setSocket(var1); // L: 2048
					class118.socketTask = null; // L: 2049
					ApproximateRouteStrategy.method1069(2); // L: 2050
				}
			}

			PacketBufferNode var30;
			if (loginState == 2) { // L: 2053
				packetWriter.clearBuffer(); // L: 2054
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 2059
					var30 = new PacketBufferNode(); // L: 2060
				} else {
					var30 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 2063
				}

				var30.clientPacket = null; // L: 2066
				var30.clientPacketLength = 0; // L: 2067
				var30.packetBuffer = new PacketBuffer(5000); // L: 2068
				var30.packetBuffer.writeByte(LoginPacket.field3162.id); // L: 2072
				packetWriter.addNode(var30); // L: 2073
				packetWriter.flush(); // L: 2074
				var2.offset = 0; // L: 2075
				ApproximateRouteStrategy.method1069(3); // L: 2076
			}

			int var13;
			if (loginState == 3) { // L: 2078
				if (class78.pcmPlayer0 != null) { // L: 2079
					class78.pcmPlayer0.method669();
				}

				if (MouseRecorder.pcmPlayer1 != null) { // L: 2080
					MouseRecorder.pcmPlayer1.method669();
				}

				if (var1.isAvailable(1)) { // L: 2081
					var13 = var1.readUnsignedByte(); // L: 2082
					if (class78.pcmPlayer0 != null) { // L: 2083
						class78.pcmPlayer0.method669();
					}

					if (MouseRecorder.pcmPlayer1 != null) { // L: 2084
						MouseRecorder.pcmPlayer1.method669();
					}

					if (var13 != 0) { // L: 2085
						class12.getLoginError(var13); // L: 2086
						return; // L: 2087
					}

					var2.offset = 0; // L: 2089
					ApproximateRouteStrategy.method1069(4); // L: 2090
				}
			}

			if (loginState == 4) { // L: 2093
				if (var2.offset < 8) { // L: 2094
					var13 = var1.available(); // L: 2095
					if (var13 > 8 - var2.offset) { // L: 2096
						var13 = 8 - var2.offset;
					}

					if (var13 > 0) { // L: 2097
						var1.read(var2.array, var2.offset, var13); // L: 2098
						var2.offset += var13; // L: 2099
					}
				}

				if (var2.offset == 8) { // L: 2102
					var2.offset = 0; // L: 2103
					GrandExchangeOfferTotalQuantityComparator.field4050 = var2.readLong(); // L: 2104
					ApproximateRouteStrategy.method1069(5); // L: 2105
				}
			}

			int var7;
			int var9;
			if (loginState == 5) { // L: 2108
				packetWriter.packetBuffer.offset = 0; // L: 2109
				packetWriter.clearBuffer(); // L: 2110
				PacketBuffer var31 = new PacketBuffer(500); // L: 2111
				int[] var34 = new int[]{GrandExchangeOfferOwnWorldComparator.secureRandom.nextInt(), GrandExchangeOfferOwnWorldComparator.secureRandom.nextInt(), GrandExchangeOfferOwnWorldComparator.secureRandom.nextInt(), GrandExchangeOfferOwnWorldComparator.secureRandom.nextInt()}; // L: 2112 2113 2114 2115 2116
				var31.offset = 0; // L: 2117
				var31.writeByte(1); // L: 2118
				var31.writeInt(var34[0]); // L: 2119
				var31.writeInt(var34[1]); // L: 2120
				var31.writeInt(var34[2]); // L: 2121
				var31.writeInt(var34[3]); // L: 2122
				var31.writeLong(GrandExchangeOfferTotalQuantityComparator.field4050); // L: 2123
				if (gameState == 40) { // L: 2124
					var31.writeInt(field525[0]); // L: 2125
					var31.writeInt(field525[1]); // L: 2126
					var31.writeInt(field525[2]); // L: 2127
					var31.writeInt(field525[3]); // L: 2128
				} else {
					if (gameState == 50) { // L: 2131
						var31.writeByte(class124.field1523.rsOrdinal()); // L: 2132
						var31.writeInt(Bounds.field4379); // L: 2133
					} else {
						var31.writeByte(field511.rsOrdinal()); // L: 2136
						switch(field511.field1524) { // L: 2137
						case 0:
						case 4:
							var31.writeMedium(class19.field100); // L: 2161
							++var31.offset; // L: 2162
							break;
						case 1:
							var31.offset += 4; // L: 2140
						case 2:
						default:
							break;
						case 3:
							LinkedHashMap var6 = FriendsChatMember.clientPreferences.parameters; // L: 2146
							String var8 = Login.Login_username; // L: 2148
							var9 = var8.length(); // L: 2150
							int var10 = 0; // L: 2151

							for (int var11 = 0; var11 < var9; ++var11) { // L: 2152
								var10 = (var10 << 5) - var10 + var8.charAt(var11);
							}

							var31.writeInt((Integer)var6.get(var10)); // L: 2155
						}
					}

					if (field512.method7914()) { // L: 2167
						var31.writeByte(class447.field4757.rsOrdinal()); // L: 2168
						var31.writeStringCp1252NullTerminated(this.field513); // L: 2169
					} else {
						var31.writeByte(class447.field4756.rsOrdinal()); // L: 2172
						var31.writeStringCp1252NullTerminated(Login.Login_password); // L: 2173
					}
				}

				var31.encryptRsa(class67.field865, class67.field863); // L: 2176
				field525 = var34; // L: 2177
				PacketBufferNode var39;
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 2182
					var39 = new PacketBufferNode(); // L: 2183
				} else {
					var39 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 2186
				}

				var39.clientPacket = null; // L: 2189
				var39.clientPacketLength = 0; // L: 2190
				var39.packetBuffer = new PacketBuffer(5000); // L: 2191
				var39.packetBuffer.offset = 0; // L: 2195
				if (gameState == 40) { // L: 2196
					var39.packetBuffer.writeByte(LoginPacket.field3156.id); // L: 2197
				} else {
					var39.packetBuffer.writeByte(LoginPacket.field3158.id); // L: 2200
				}

				var39.packetBuffer.writeShort(0); // L: 2202
				var7 = var39.packetBuffer.offset; // L: 2203
				var39.packetBuffer.writeInt(207); // L: 2204
				var39.packetBuffer.writeInt(1); // L: 2205
				var39.packetBuffer.writeByte(clientType); // L: 2206
				var39.packetBuffer.writeByte(field482); // L: 2207
				byte var15 = 0; // L: 2208
				var39.packetBuffer.writeByte(var15); // L: 2209
				var39.packetBuffer.writeBytes(var31.array, 0, var31.offset); // L: 2210
				var9 = var39.packetBuffer.offset; // L: 2211
				var39.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2212
				var39.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2213
				var39.packetBuffer.writeShort(class7.canvasWidth); // L: 2214
				var39.packetBuffer.writeShort(DecorativeObject.canvasHeight); // L: 2215
				ModeWhere.method6004(var39.packetBuffer); // L: 2216
				var39.packetBuffer.writeStringCp1252NullTerminated(HitSplatDefinition.field2012); // L: 2217
				var39.packetBuffer.writeInt(UserComparator1.field4765); // L: 2218
				Buffer var16 = new Buffer(class393.platformInfo.size()); // L: 2219
				class393.platformInfo.write(var16); // L: 2220
				var39.packetBuffer.writeBytes(var16.array, 0, var16.array.length); // L: 2221
				var39.packetBuffer.writeByte(clientType); // L: 2222
				var39.packetBuffer.writeInt(0); // L: 2223
				var39.packetBuffer.method7687(class268.archive15.hash); // L: 2224
				var39.packetBuffer.method7673(class306.archive7.hash); // L: 2225
				var39.packetBuffer.method7686(SequenceDefinition.archive12.hash); // L: 2226
				var39.packetBuffer.method7673(Friend.archive20.hash); // L: 2227
				var39.packetBuffer.method7687(class299.archive8.hash); // L: 2228
				var39.packetBuffer.writeInt(0); // L: 2229
				var39.packetBuffer.method7673(class271.archive4.hash); // L: 2230
				var39.packetBuffer.method7686(MouseRecorder.archive13.hash); // L: 2231
				var39.packetBuffer.method7686(Decimator.field403.hash); // L: 2232
				var39.packetBuffer.method7687(Renderable.archive2.hash); // L: 2233
				var39.packetBuffer.method7687(FloorUnderlayDefinition.archive11.hash); // L: 2234
				var39.packetBuffer.method7686(PacketBuffer.archive6.hash); // L: 2235
				var39.packetBuffer.writeInt(class340.archive18.hash); // L: 2236
				var39.packetBuffer.writeInt(Varcs.archive14.hash); // L: 2237
				var39.packetBuffer.method7687(KitDefinition.archive10.hash); // L: 2238
				var39.packetBuffer.method7673(class17.field89.hash); // L: 2239
				var39.packetBuffer.method7687(class201.field2366.hash); // L: 2240
				var39.packetBuffer.method7673(ClanChannelMember.archive5.hash); // L: 2241
				var39.packetBuffer.method7673(class120.archive9.hash); // L: 2242
				var39.packetBuffer.method7686(Tile.archive19.hash); // L: 2243
				var39.packetBuffer.method7686(MouseHandler.archive17.hash); // L: 2244
				var39.packetBuffer.xteaEncrypt(var34, var9, var39.packetBuffer.offset); // L: 2245
				var39.packetBuffer.writeLengthShort(var39.packetBuffer.offset - var7); // L: 2246
				packetWriter.addNode(var39); // L: 2247
				packetWriter.flush(); // L: 2248
				packetWriter.isaacCipher = new IsaacCipher(var34); // L: 2249
				int[] var17 = new int[4]; // L: 2250

				for (int var12 = 0; var12 < 4; ++var12) { // L: 2251
					var17[var12] = var34[var12] + 50;
				}

				var2.newIsaacCipher(var17); // L: 2252
				ApproximateRouteStrategy.method1069(6); // L: 2253
			}

			int var18;
			if (loginState == 6 && var1.available() > 0) { // L: 2255 2256
				var13 = var1.readUnsignedByte(); // L: 2257
				if (var13 == 61) { // L: 2258
					var18 = var1.available(); // L: 2259
					class82.field1066 = var18 == 1 && var1.readUnsignedByte() == 1; // L: 2260
					ApproximateRouteStrategy.method1069(5); // L: 2261
				}

				if (var13 == 21 && gameState == 20) { // L: 2263
					ApproximateRouteStrategy.method1069(12); // L: 2264
				} else if (var13 == 2) { // L: 2266
					ApproximateRouteStrategy.method1069(14); // L: 2267
				} else if (var13 == 15 && gameState == 40) { // L: 2269
					packetWriter.serverPacketLength = -1; // L: 2270
					ApproximateRouteStrategy.method1069(19); // L: 2271
				} else if (var13 == 64) { // L: 2273
					ApproximateRouteStrategy.method1069(10); // L: 2274
				} else if (var13 == 23 && field668 < 1) { // L: 2276
					++field668; // L: 2277
					ApproximateRouteStrategy.method1069(0); // L: 2278
				} else if (var13 == 29) { // L: 2280
					ApproximateRouteStrategy.method1069(17); // L: 2281
				} else {
					if (var13 != 69) { // L: 2283
						class12.getLoginError(var13); // L: 2287
						return; // L: 2288
					}

					ApproximateRouteStrategy.method1069(7); // L: 2284
				}
			}

			if (loginState == 7 && var1.available() >= 2) { // L: 2292 2293
				var1.read(var2.array, 0, 2); // L: 2294
				var2.offset = 0; // L: 2295
				MouseHandler.field231 = var2.readUnsignedShort(); // L: 2296
				ApproximateRouteStrategy.method1069(8); // L: 2297
			}

			if (loginState == 8 && var1.available() >= MouseHandler.field231) { // L: 2300 2301
				var2.offset = 0; // L: 2302
				var1.read(var2.array, var2.offset, MouseHandler.field231); // L: 2303
				class6 var32 = UserComparator3.method2583()[var2.readUnsignedByte()]; // L: 2304

				try {
					class3 var36 = class119.method2732(var32); // L: 2306
					this.field527 = new class7(var2, var36); // L: 2307
					ApproximateRouteStrategy.method1069(9); // L: 2308
				} catch (Exception var22) { // L: 2310
					class12.getLoginError(22); // L: 2311
					return; // L: 2312
				}
			}

			if (loginState == 9 && this.field527.method56()) { // L: 2316 2317
				this.field526 = this.field527.method48(); // L: 2318
				this.field527.method49(); // L: 2319
				this.field527 = null; // L: 2320
				if (this.field526 == null) { // L: 2321
					class12.getLoginError(22); // L: 2322
					return; // L: 2323
				}

				packetWriter.clearBuffer(); // L: 2325
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 2330
					var30 = new PacketBufferNode(); // L: 2331
				} else {
					var30 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 2334
				}

				var30.clientPacket = null; // L: 2337
				var30.clientPacketLength = 0; // L: 2338
				var30.packetBuffer = new PacketBuffer(5000); // L: 2339
				var30.packetBuffer.writeByte(LoginPacket.field3157.id); // L: 2343
				var30.packetBuffer.writeShort(this.field526.offset); // L: 2344
				var30.packetBuffer.method7631(this.field526); // L: 2345
				packetWriter.addNode(var30); // L: 2346
				packetWriter.flush(); // L: 2347
				this.field526 = null; // L: 2348
				ApproximateRouteStrategy.method1069(6); // L: 2349
			}

			if (loginState == 10 && var1.available() > 0) { // L: 2352 2353
				class17.field91 = var1.readUnsignedByte(); // L: 2354
				ApproximateRouteStrategy.method1069(11); // L: 2355
			}

			if (loginState == 11 && var1.available() >= class17.field91) { // L: 2358 2359
				var1.read(var2.array, 0, class17.field91); // L: 2360
				var2.offset = 0; // L: 2361
				ApproximateRouteStrategy.method1069(6); // L: 2362
			}

			if (loginState == 12 && var1.available() > 0) { // L: 2365 2366
				field510 = (var1.readUnsignedByte() + 3) * 60; // L: 2367
				ApproximateRouteStrategy.method1069(13); // L: 2368
			}

			if (loginState == 13) { // L: 2371
				field549 = 0; // L: 2372
				ItemComposition.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field510 / 60 + " seconds."); // L: 2373
				if (--field510 <= 0) { // L: 2374
					ApproximateRouteStrategy.method1069(0);
				}

			} else {
				if (loginState == 14 && var1.available() >= 1) { // L: 2377 2378
					JagexCache.field1728 = var1.readUnsignedByte(); // L: 2379
					ApproximateRouteStrategy.method1069(15); // L: 2380
				}

				boolean var46;
				if (loginState == 15 && var1.available() >= JagexCache.field1728) { // L: 2383 2384
					boolean var44 = var1.readUnsignedByte() == 1; // L: 2385
					var1.read(var2.array, 0, 4); // L: 2386
					var2.offset = 0; // L: 2387
					var46 = false; // L: 2388
					if (var44) { // L: 2389
						var18 = var2.readByteIsaac() << 24; // L: 2390
						var18 |= var2.readByteIsaac() << 16; // L: 2391
						var18 |= var2.readByteIsaac() << 8; // L: 2392
						var18 |= var2.readByteIsaac(); // L: 2393
						String var41 = Login.Login_username; // L: 2395
						var7 = var41.length(); // L: 2397
						int var45 = 0; // L: 2398
						var9 = 0; // L: 2399

						while (true) {
							if (var9 >= var7) {
								if (FriendsChatMember.clientPreferences.parameters.size() >= 10 && !FriendsChatMember.clientPreferences.parameters.containsKey(var45)) { // L: 2403 2404
									Iterator var43 = FriendsChatMember.clientPreferences.parameters.entrySet().iterator(); // L: 2405
									var43.next(); // L: 2406
									var43.remove(); // L: 2407
								}

								FriendsChatMember.clientPreferences.parameters.put(var45, var18); // L: 2410
								break;
							}

							var45 = (var45 << 5) - var45 + var41.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) { // L: 2412
						FriendsChatMember.clientPreferences.method2268(Login.Login_username); // L: 2413
					} else {
						FriendsChatMember.clientPreferences.method2268((String)null); // L: 2416
					}

					class83.savePreferences(); // L: 2418
					staffModLevel = var1.readUnsignedByte(); // L: 2419
					playerMod = var1.readUnsignedByte() == 1; // L: 2420
					localPlayerIndex = var1.readUnsignedByte(); // L: 2421
					localPlayerIndex <<= 8; // L: 2422
					localPlayerIndex += var1.readUnsignedByte(); // L: 2423
					field592 = var1.readUnsignedByte(); // L: 2424
					var1.read(var2.array, 0, 8); // L: 2425
					var2.offset = 0; // L: 2426
					this.accountHash = var2.readLong(); // L: 2427
					if (JagexCache.field1728 >= 29) { // L: 2428
						var1.read(var2.array, 0, 8); // L: 2429
						var2.offset = 0; // L: 2430
						field606 = var2.readLong(); // L: 2431
					}

					var1.read(var2.array, 0, 1); // L: 2433
					var2.offset = 0; // L: 2434
					ServerPacket[] var5 = ScriptEvent.ServerPacket_values(); // L: 2435
					int var20 = var2.readSmartByteShortIsaac(); // L: 2436
					if (var20 < 0 || var20 >= var5.length) { // L: 2437
						throw new IOException(var20 + " " + var2.offset);
					}

					packetWriter.serverPacket = var5[var20]; // L: 2438
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2439
					var1.read(var2.array, 0, 2); // L: 2440
					var2.offset = 0; // L: 2441
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2442

					try {
						class27.method384(AbstractByteArrayCopier.client, "zap"); // L: 2444
					} catch (Throwable var21) { // L: 2446
					}

					ApproximateRouteStrategy.method1069(16); // L: 2447
				}

				if (loginState != 16) { // L: 2450
					if (loginState == 17 && var1.available() >= 2) { // L: 2587 2588
						var2.offset = 0; // L: 2589
						var1.read(var2.array, 0, 2); // L: 2590
						var2.offset = 0; // L: 2591
						class160.field1751 = var2.readUnsignedShort(); // L: 2592
						ApproximateRouteStrategy.method1069(18); // L: 2593
					}

					if (loginState == 18 && var1.available() >= class160.field1751) { // L: 2596 2597
						var2.offset = 0; // L: 2598
						var1.read(var2.array, 0, class160.field1751); // L: 2599
						var2.offset = 0; // L: 2600
						String var38 = var2.readStringCp1252NullTerminated(); // L: 2601
						String var42 = var2.readStringCp1252NullTerminated(); // L: 2602
						String var35 = var2.readStringCp1252NullTerminated(); // L: 2603
						ItemComposition.setLoginResponseString(var38, var42, var35); // L: 2604
						class4.updateGameState(10); // L: 2605
						if (field512.method7914()) { // L: 2606
							class116.method2683(9); // L: 2607
						}
					}

					if (loginState == 19) { // L: 2611
						if (packetWriter.serverPacketLength == -1) { // L: 2612
							if (var1.available() < 2) { // L: 2613
								return;
							}

							var1.read(var2.array, 0, 2); // L: 2614
							var2.offset = 0; // L: 2615
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2616
						}

						if (var1.available() >= packetWriter.serverPacketLength) { // L: 2618
							var1.read(var2.array, 0, packetWriter.serverPacketLength); // L: 2619
							var2.offset = 0; // L: 2620
							var13 = packetWriter.serverPacketLength; // L: 2621
							timer.method6478(); // L: 2622
							SceneTilePaint.method4417(); // L: 2623
							TileItem.updatePlayer(var2); // L: 2624
							if (var13 != var2.offset) { // L: 2625
								throw new RuntimeException(); // L: 2626
							}
						}
					} else {
						++field549; // L: 2630
						if (field549 > 2000) { // L: 2631
							if (field668 < 1) { // L: 2632
								if (WorldMapLabelSize.currentPort == GroundObject.worldPort) { // L: 2633
									WorldMapLabelSize.currentPort = FileSystem.js5Port;
								} else {
									WorldMapLabelSize.currentPort = GroundObject.worldPort; // L: 2634
								}

								++field668; // L: 2635
								ApproximateRouteStrategy.method1069(0); // L: 2636
							} else {
								class12.getLoginError(-3); // L: 2639
							}
						}
					}
				} else {
					if (var1.available() >= packetWriter.serverPacketLength) { // L: 2451
						var2.offset = 0; // L: 2452
						var1.read(var2.array, 0, packetWriter.serverPacketLength); // L: 2453
						timer.method6459(); // L: 2454
						mouseLastLastPressedTimeMillis = 1L; // L: 2457
						GrandExchangeEvents.mouseRecorder.index = 0; // L: 2458
						class391.hasFocus = true; // L: 2459
						hadFocus = true; // L: 2460
						field717 = -1L; // L: 2461
						class33.reflectionChecks = new IterableNodeDeque(); // L: 2463
						packetWriter.clearBuffer(); // L: 2465
						packetWriter.packetBuffer.offset = 0; // L: 2466
						packetWriter.serverPacket = null; // L: 2467
						packetWriter.field1337 = null; // L: 2468
						packetWriter.field1339 = null; // L: 2469
						packetWriter.field1330 = null; // L: 2470
						packetWriter.serverPacketLength = 0; // L: 2471
						packetWriter.field1336 = 0; // L: 2472
						rebootTimer = 0; // L: 2473
						logoutTimer = 0; // L: 2474
						hintArrowType = 0; // L: 2475
						menuOptionsCount = 0; // L: 2477
						isMenuOpen = false; // L: 2478
						MouseHandler.MouseHandler_idleCycles = 0; // L: 2481
						Messages.Messages_channels.clear(); // L: 2484
						Messages.Messages_hashTable.clear(); // L: 2485
						Messages.Messages_queue.clear(); // L: 2486
						Messages.Messages_count = 0; // L: 2487
						isItemSelected = 0; // L: 2489
						isSpellSelected = false; // L: 2490
						soundEffectCount = 0; // L: 2491
						camAngleY = 0; // L: 2492
						oculusOrbState = 0; // L: 2493
						class347.field4164 = null; // L: 2494
						minimapState = 0; // L: 2495
						field720 = -1; // L: 2496
						destinationX = 0; // L: 2497
						destinationY = 0; // L: 2498
						playerAttackOption = AttackOption.AttackOption_hidden; // L: 2499
						npcAttackOption = AttackOption.AttackOption_hidden; // L: 2500
						npcCount = 0; // L: 2501
						AbstractArchive.method5863(); // L: 2502

						for (var13 = 0; var13 < 2048; ++var13) { // L: 2503
							players[var13] = null;
						}

						for (var13 = 0; var13 < 32768; ++var13) { // L: 2504
							npcs[var13] = null;
						}

						combatTargetPlayerIndex = -1; // L: 2505
						projectiles.clear(); // L: 2506
						graphicsObjects.clear(); // L: 2507

						int var19;
						for (var13 = 0; var13 < 4; ++var13) { // L: 2508
							for (var18 = 0; var18 < 104; ++var18) { // L: 2509
								for (var19 = 0; var19 < 104; ++var19) { // L: 2510
									groundItems[var13][var18][var19] = null; // L: 2511
								}
							}
						}

						pendingSpawns = new NodeDeque(); // L: 2515
						class321.friendSystem.clear(); // L: 2516

						for (var13 = 0; var13 < VarpDefinition.field1809; ++var13) { // L: 2517
							VarpDefinition var40 = class78.VarpDefinition_get(var13); // L: 2518
							if (var40 != null) { // L: 2519
								Varps.Varps_temp[var13] = 0; // L: 2520
								Varps.Varps_main[var13] = 0; // L: 2521
							}
						}

						class341.varcs.clearTransient(); // L: 2524
						followerIndex = -1; // L: 2525
						if (rootInterface != -1) { // L: 2526
							var13 = rootInterface; // L: 2527
							if (var13 != -1 && Widget.Widget_loadedInterfaces[var13]) { // L: 2529 2530
								class438.Widget_archive.clearFilesGroup(var13); // L: 2531
								if (class358.Widget_interfaceComponents[var13] != null) { // L: 2532
									var46 = true; // L: 2533

									for (var19 = 0; var19 < class358.Widget_interfaceComponents[var13].length; ++var19) { // L: 2534
										if (class358.Widget_interfaceComponents[var13][var19] != null) { // L: 2535
											if (class358.Widget_interfaceComponents[var13][var19].type != 2) { // L: 2536
												class358.Widget_interfaceComponents[var13][var19] = null;
											} else {
												var46 = false; // L: 2537
											}
										}
									}

									if (var46) { // L: 2540
										class358.Widget_interfaceComponents[var13] = null;
									}

									Widget.Widget_loadedInterfaces[var13] = false; // L: 2541
								}
							}
						}

						for (InterfaceParent var33 = (InterfaceParent)interfaceParents.first(); var33 != null; var33 = (InterfaceParent)interfaceParents.next()) { // L: 2544
							class29.closeInterface(var33, true); // L: 2545
						}

						rootInterface = -1; // L: 2547
						interfaceParents = new NodeHashTable(8); // L: 2548
						meslayerContinueWidget = null; // L: 2549
						menuOptionsCount = 0; // L: 2551
						isMenuOpen = false; // L: 2552
						playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1); // L: 2554

						for (var13 = 0; var13 < 8; ++var13) { // L: 2555
							playerMenuActions[var13] = null; // L: 2556
							playerOptionsPriorities[var13] = false; // L: 2557
						}

						ItemContainer.itemContainers = new NodeHashTable(32); // L: 2560
						isLoading = true; // L: 2562

						for (var13 = 0; var13 < 100; ++var13) { // L: 2563
							field643[var13] = true;
						}

						PacketBufferNode var37 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2990, packetWriter.isaacCipher); // L: 2566
						var37.packetBuffer.writeByte(Canvas.getWindowedMode()); // L: 2567
						var37.packetBuffer.writeShort(class7.canvasWidth); // L: 2568
						var37.packetBuffer.writeShort(DecorativeObject.canvasHeight); // L: 2569
						packetWriter.addNode(var37); // L: 2570
						class19.friendsChatManager = null; // L: 2572
						FontName.guestClanSettings = null; // L: 2573
						Arrays.fill(currentClanSettings, (Object)null); // L: 2574
						NetCache.guestClanChannel = null; // L: 2575
						Arrays.fill(currentClanChannels, (Object)null); // L: 2576

						for (var13 = 0; var13 < 8; ++var13) { // L: 2577
							grandExchangeOffers[var13] = new GrandExchangeOffer();
						}

						UserComparator3.grandExchangeEvents = null; // L: 2578
						TileItem.updatePlayer(var2); // L: 2580
						class352.field4196 = -1; // L: 2581
						class181.loadRegions(false, var2); // L: 2582
						packetWriter.serverPacket = null; // L: 2583
					}

				}
			}
		} catch (IOException var27) { // L: 2643
			if (field668 < 1) { // L: 2644
				if (WorldMapLabelSize.currentPort == GroundObject.worldPort) { // L: 2645
					WorldMapLabelSize.currentPort = FileSystem.js5Port;
				} else {
					WorldMapLabelSize.currentPort = GroundObject.worldPort; // L: 2646
				}

				++field668; // L: 2647
				ApproximateRouteStrategy.method1069(0); // L: 2648
			} else {
				class12.getLoginError(-2); // L: 2651
			}
		}
	} // L: 2375 2585 2628 2637 2640 2649 2652 2654

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2116872810"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 2955
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 2956
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 2957
			hadNetworkError = false; // L: 2958
			Clock.method3264(); // L: 2959
		} else {
			if (!isMenuOpen) { // L: 2962
				Ignored.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1104(packetWriter); ++var1) { // L: 2963 2964
			}

			if (gameState == 30) { // L: 2966
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class33.reflectionChecks.last(); // L: 2970
					boolean var31;
					if (var2 == null) { // L: 2971
						var31 = false; // L: 2972
					} else {
						var31 = true; // L: 2975
					}

					int var3;
					PacketBufferNode var32;
					if (!var31) { // L: 2977
						PacketBufferNode var14;
						int var15;
						if (timer.field4223) { // L: 2985
							var14 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2924, packetWriter.isaacCipher); // L: 2987
							var14.packetBuffer.writeByte(0); // L: 2988
							var15 = var14.packetBuffer.offset; // L: 2989
							timer.write(var14.packetBuffer); // L: 2990
							var14.packetBuffer.method7761(var14.packetBuffer.offset - var15); // L: 2991
							packetWriter.addNode(var14); // L: 2992
							timer.method6461(); // L: 2993
						}

						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						synchronized(GrandExchangeEvents.mouseRecorder.lock) { // L: 2996
							if (!field550) { // L: 2997
								GrandExchangeEvents.mouseRecorder.index = 0; // L: 3083
							} else if (MouseHandler.MouseHandler_lastButton != 0 || GrandExchangeEvents.mouseRecorder.index >= 40) { // L: 2998
								var32 = null; // L: 3000
								var3 = 0; // L: 3001
								var4 = 0; // L: 3002
								var5 = 0; // L: 3003
								var6 = 0; // L: 3004

								for (var7 = 0; var7 < GrandExchangeEvents.mouseRecorder.index && (var32 == null || var32.packetBuffer.offset - var3 < 246); ++var7) { // L: 3005 3006
									var4 = var7; // L: 3007
									var8 = GrandExchangeEvents.mouseRecorder.ys[var7]; // L: 3008
									if (var8 < -1) { // L: 3009
										var8 = -1;
									} else if (var8 > 65534) { // L: 3010
										var8 = 65534;
									}

									var9 = GrandExchangeEvents.mouseRecorder.xs[var7]; // L: 3011
									if (var9 < -1) { // L: 3012
										var9 = -1;
									} else if (var9 > 65534) { // L: 3013
										var9 = 65534;
									}

									if (var9 != field553 || var8 != field688) { // L: 3014
										if (var32 == null) { // L: 3017
											var32 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2960, packetWriter.isaacCipher); // L: 3018
											var32.packetBuffer.writeByte(0); // L: 3019
											var3 = var32.packetBuffer.offset; // L: 3020
											PacketBuffer var10000 = var32.packetBuffer; // L: 3021
											var10000.offset += 2;
											var5 = 0; // L: 3022
											var6 = 0; // L: 3023
										}

										int var12;
										if (field571 != -1L) { // L: 3028
											var10 = var9 - field553; // L: 3029
											var11 = var8 - field688; // L: 3030
											var12 = (int)((GrandExchangeEvents.mouseRecorder.millis[var7] - field571) / 20L); // L: 3031
											var5 = (int)((long)var5 + (GrandExchangeEvents.mouseRecorder.millis[var7] - field571) % 20L); // L: 3032
										} else {
											var10 = var9; // L: 3035
											var11 = var8; // L: 3036
											var12 = Integer.MAX_VALUE; // L: 3037
										}

										field553 = var9; // L: 3039
										field688 = var8; // L: 3040
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3041
											var10 += 32; // L: 3042
											var11 += 32; // L: 3043
											var32.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3044
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3046
											var10 += 128; // L: 3047
											var11 += 128; // L: 3048
											var32.packetBuffer.writeByte(var12 + 128); // L: 3049
											var32.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3050
										} else if (var12 < 32) { // L: 3052
											var32.packetBuffer.writeByte(var12 + 192); // L: 3053
											if (var9 != -1 && var8 != -1) { // L: 3054
												var32.packetBuffer.writeInt(var9 | var8 << 16); // L: 3055
											} else {
												var32.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var32.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3058
											if (var9 != -1 && var8 != -1) { // L: 3059
												var32.packetBuffer.writeInt(var9 | var8 << 16); // L: 3060
											} else {
												var32.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6; // L: 3062
										field571 = GrandExchangeEvents.mouseRecorder.millis[var7]; // L: 3063
									}
								}

								if (var32 != null) { // L: 3065
									var32.packetBuffer.method7761(var32.packetBuffer.offset - var3); // L: 3066
									var7 = var32.packetBuffer.offset; // L: 3067
									var32.packetBuffer.offset = var3; // L: 3068
									var32.packetBuffer.writeByte(var5 / var6); // L: 3069
									var32.packetBuffer.writeByte(var5 % var6); // L: 3070
									var32.packetBuffer.offset = var7; // L: 3071
									packetWriter.addNode(var32); // L: 3072
								}

								if (var4 >= GrandExchangeEvents.mouseRecorder.index) { // L: 3074
									GrandExchangeEvents.mouseRecorder.index = 0;
								} else {
									MouseRecorder var47 = GrandExchangeEvents.mouseRecorder; // L: 3076
									var47.index -= var4;
									System.arraycopy(GrandExchangeEvents.mouseRecorder.xs, var4, GrandExchangeEvents.mouseRecorder.xs, 0, GrandExchangeEvents.mouseRecorder.index); // L: 3077
									System.arraycopy(GrandExchangeEvents.mouseRecorder.ys, var4, GrandExchangeEvents.mouseRecorder.ys, 0, GrandExchangeEvents.mouseRecorder.index); // L: 3078
									System.arraycopy(GrandExchangeEvents.mouseRecorder.millis, var4, GrandExchangeEvents.mouseRecorder.millis, 0, GrandExchangeEvents.mouseRecorder.index); // L: 3079
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3085
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L; // L: 3086
							if (var16 > 32767L) { // L: 3087
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L; // L: 3088
							var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3089
							if (var3 < 0) { // L: 3090
								var3 = 0;
							} else if (var3 > DecorativeObject.canvasHeight) { // L: 3091
								var3 = DecorativeObject.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3092
							if (var4 < 0) { // L: 3093
								var4 = 0;
							} else if (var4 > class7.canvasWidth) { // L: 3094
								var4 = class7.canvasWidth;
							}

							var5 = (int)var16; // L: 3095
							var18 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3010, packetWriter.isaacCipher); // L: 3096
							var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0)); // L: 3097
							var18.packetBuffer.writeShort(var4); // L: 3098
							var18.packetBuffer.writeShort(var3); // L: 3099
							packetWriter.addNode(var18); // L: 3100
						}

						if (KeyHandler.field136 > 0) { // L: 3102
							var14 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2997, packetWriter.isaacCipher); // L: 3103
							var14.packetBuffer.writeShort(0); // L: 3104
							var15 = var14.packetBuffer.offset; // L: 3105
							long var19 = class181.method3483(); // L: 3106

							for (var5 = 0; var5 < KeyHandler.field136; ++var5) { // L: 3107
								long var21 = var19 - field717; // L: 3108
								if (var21 > 16777215L) { // L: 3109
									var21 = 16777215L;
								}

								field717 = var19; // L: 3110
								var14.packetBuffer.method7878(KeyHandler.field135[var5]); // L: 3111
								var14.packetBuffer.method7683((int)var21); // L: 3112
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15); // L: 3114
							packetWriter.addNode(var14); // L: 3115
						}

						if (field632 > 0) { // L: 3117
							--field632;
						}

						if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3118
							field655 = true;
						}

						if (field655 && field632 <= 0) { // L: 3119
							field632 = 20; // L: 3120
							field655 = false; // L: 3121
							var14 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2930, packetWriter.isaacCipher); // L: 3123
							var14.packetBuffer.writeShort(camAngleY); // L: 3124
							var14.packetBuffer.method7675(camAngleX); // L: 3125
							packetWriter.addNode(var14); // L: 3126
						}

						if (class391.hasFocus && !hadFocus) { // L: 3128
							hadFocus = true; // L: 3129
							var14 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2994, packetWriter.isaacCipher); // L: 3131
							var14.packetBuffer.writeByte(1); // L: 3132
							packetWriter.addNode(var14); // L: 3133
						}

						if (!class391.hasFocus && hadFocus) { // L: 3135
							hadFocus = false; // L: 3136
							var14 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2994, packetWriter.isaacCipher); // L: 3138
							var14.packetBuffer.writeByte(0); // L: 3139
							packetWriter.addNode(var14); // L: 3140
						}

						if (ClientPacket.worldMap != null) { // L: 3143
							ClientPacket.worldMap.method7218();
						}

						class83.method2089(); // L: 3144
						HorizontalAlignment.method3399(); // L: 3145
						if (field720 != class268.Client_plane) { // L: 3147
							field720 = class268.Client_plane; // L: 3148
							var1 = class268.Client_plane; // L: 3149
							int[] var33 = class1.sceneMinimapSprite.pixels; // L: 3151
							var3 = var33.length; // L: 3152

							for (var4 = 0; var4 < var3; ++var4) { // L: 3153
								var33[var4] = 0;
							}

							for (var4 = 1; var4 < 103; ++var4) { // L: 3154
								var5 = (103 - var4) * 2048 + 24628; // L: 3155

								for (var6 = 1; var6 < 103; ++var6) { // L: 3156
									if ((Tiles.Tiles_renderFlags[var1][var6][var4] & 24) == 0) { // L: 3157
										class12.scene.drawTileMinimap(var33, var5, 512, var1, var6, var4);
									}

									if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var6][var4] & 8) != 0) { // L: 3158
										class12.scene.drawTileMinimap(var33, var5, 512, var1 + 1, var6, var4);
									}

									var5 += 4; // L: 3159
								}
							}

							var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 3162
							var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 3163
							class1.sceneMinimapSprite.setRaster(); // L: 3164

							for (var6 = 1; var6 < 103; ++var6) { // L: 3165
								for (var7 = 1; var7 < 103; ++var7) { // L: 3166
									if ((Tiles.Tiles_renderFlags[var1][var7][var6] & 24) == 0) { // L: 3167
										class119.drawObject(var1, var7, var6, var4, var5);
									}

									if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var7][var6] & 8) != 0) { // L: 3168
										class119.drawObject(var1 + 1, var7, var6, var4, var5);
									}
								}
							}

							mapIconCount = 0; // L: 3171

							for (var6 = 0; var6 < 104; ++var6) { // L: 3172
								for (var7 = 0; var7 < 104; ++var7) { // L: 3173
									long var23 = class12.scene.getGroundObjectTag(class268.Client_plane, var6, var7); // L: 3174
									if (var23 != 0L) { // L: 3175
										var10 = WorldMapSection2.Entity_unpackID(var23); // L: 3176
										var11 = FileSystem.getObjectDefinition(var10).mapIconId; // L: 3177
										if (var11 >= 0 && EnumComposition.WorldMapElement_get(var11).field1829) { // L: 3178 3179
											mapIcons[mapIconCount] = EnumComposition.WorldMapElement_get(var11).getSpriteBool(false); // L: 3182
											mapIconXs[mapIconCount] = var6; // L: 3183
											mapIconYs[mapIconCount] = var7; // L: 3184
											++mapIconCount; // L: 3185
										}
									}
								}
							}

							class119.rasterProvider.apply(); // L: 3190
						}

						if (gameState != 30) { // L: 3194
							return;
						}

						class270.method5161(); // L: 3195
						SpriteMask.method5457(); // L: 3196
						++packetWriter.field1336; // L: 3197
						if (packetWriter.field1336 > 750) { // L: 3198
							Clock.method3264(); // L: 3199
							return; // L: 3200
						}

						MouseHandler.method558(); // L: 3202
						GrandExchangeOfferUnitPriceComparator.method5960(); // L: 3203
						int[] var37 = Players.Players_indices; // L: 3205

						for (var15 = 0; var15 < Players.Players_count; ++var15) { // L: 3206
							Player var25 = players[var37[var15]]; // L: 3207
							if (var25 != null && var25.overheadTextCyclesRemaining > 0) { // L: 3208
								--var25.overheadTextCyclesRemaining; // L: 3209
								if (var25.overheadTextCyclesRemaining == 0) { // L: 3210
									var25.overheadText = null;
								}
							}
						}

						for (var15 = 0; var15 < npcCount; ++var15) { // L: 3213
							var3 = npcIndices[var15]; // L: 3214
							NPC var26 = npcs[var3]; // L: 3215
							if (var26 != null && var26.overheadTextCyclesRemaining > 0) { // L: 3216
								--var26.overheadTextCyclesRemaining; // L: 3217
								if (var26.overheadTextCyclesRemaining == 0) { // L: 3218
									var26.overheadText = null;
								}
							}
						}

						++field599; // L: 3222
						if (mouseCrossColor != 0) { // L: 3223
							mouseCrossState = mouseCrossState * 400 + 20; // L: 3224
							if (mouseCrossState * 400 >= 400) { // L: 3225
								mouseCrossColor = 0;
							}
						}

						if (WallObject.field2634 != null) { // L: 3227
							++field593; // L: 3228
							if (field593 >= 15) { // L: 3229
								class125.invalidateWidget(WallObject.field2634); // L: 3230
								WallObject.field2634 = null; // L: 3231
							}
						}

						Widget var38 = class113.mousedOverWidgetIf1; // L: 3234
						Widget var34 = EnumComposition.field1890; // L: 3235
						class113.mousedOverWidgetIf1 = null; // L: 3236
						EnumComposition.field1890 = null; // L: 3237
						draggedOnWidget = null; // L: 3238
						field494 = false; // L: 3239
						field569 = false; // L: 3240
						field714 = 0; // L: 3241

						while (ParamComposition.isKeyDown() && field714 < 128) { // L: 3242
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && class145.field1653 == 66) { // L: 3243
								StringBuilder var42 = new StringBuilder(); // L: 3246

								Message var39;
								for (Iterator var27 = Messages.Messages_hashTable.iterator(); var27.hasNext(); var42.append(var39.text).append('\n')) { // L: 3247 3253
									var39 = (Message)var27.next(); // L: 3248
									if (var39.sender != null && !var39.sender.isEmpty()) { // L: 3250
										var42.append(var39.sender).append(':'); // L: 3251
									}
								}

								String var40 = var42.toString(); // L: 3256
								AbstractByteArrayCopier.client.method417(var40); // L: 3259
							} else if (oculusOrbState != 1 || WallObject.field2636 <= 0) { // L: 3262
								field716[field714] = class145.field1653; // L: 3265
								field577[field714] = WallObject.field2636; // L: 3266
								++field714; // L: 3267
							}
						}

						if (UrlRequest.method2525() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) { // L: 3269
							var3 = ScriptFrame.localPlayer.plane - mouseWheelRotation; // L: 3270
							if (var3 < 0) { // L: 3271
								var3 = 0;
							} else if (var3 > 3) { // L: 3272
								var3 = 3;
							}

							if (var3 != ScriptFrame.localPlayer.plane) { // L: 3273
								class9.method79(ScriptFrame.localPlayer.pathX[0] + Decimator.baseX * 64, ScriptFrame.localPlayer.pathY[0] + class7.baseY * 64, var3, false); // L: 3274
							}

							mouseWheelRotation = 0; // L: 3276
						}

						if (rootInterface != -1) { // L: 3278
							GraphicsObject.updateRootInterface(rootInterface, 0, 0, class7.canvasWidth, DecorativeObject.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3279

						while (true) {
							ScriptEvent var41;
							Widget var43;
							Widget var45;
							do {
								var41 = (ScriptEvent)field693.removeLast(); // L: 3281
								if (var41 == null) { // L: 3282
									while (true) {
										do {
											var41 = (ScriptEvent)field528.removeLast(); // L: 3293
											if (var41 == null) { // L: 3294
												while (true) {
													do {
														var41 = (ScriptEvent)scriptEvents.removeLast(); // L: 3305
														if (var41 == null) { // L: 3306
															this.menu(); // L: 3316
															class7.method60(); // L: 3317
															if (clickedWidget != null) { // L: 3318
																this.method1284();
															}

															if (class16.dragInventoryWidget != null) { // L: 3319
																class125.invalidateWidget(class16.dragInventoryWidget); // L: 3320
																++itemDragDuration; // L: 3321
																if (MouseHandler.MouseHandler_currentButton == 0) { // L: 3322
																	if (field702) { // L: 3323
																		if (class133.hoveredItemContainer == class16.dragInventoryWidget && dragItemSlotSource != dragItemSlotDestination) { // L: 3324
																			Widget var44 = class16.dragInventoryWidget; // L: 3325
																			byte var35 = 0; // L: 3326
																			if (field635 == 1 && var44.contentType == 206) { // L: 3327
																				var35 = 1;
																			}

																			if (var44.itemIds[dragItemSlotDestination] <= 0) { // L: 3328
																				var35 = 0;
																			}

																			var6 = class193.getWidgetFlags(var44); // L: 3330
																			boolean var36 = (var6 >> 29 & 1) != 0; // L: 3332
																			if (var36) { // L: 3334
																				var7 = dragItemSlotSource; // L: 3335
																				var8 = dragItemSlotDestination; // L: 3336
																				var44.itemIds[var8] = var44.itemIds[var7]; // L: 3337
																				var44.itemQuantities[var8] = var44.itemQuantities[var7]; // L: 3338
																				var44.itemIds[var7] = -1; // L: 3339
																				var44.itemQuantities[var7] = 0; // L: 3340
																			} else if (var35 == 1) { // L: 3342
																				var7 = dragItemSlotSource; // L: 3343
																				var8 = dragItemSlotDestination; // L: 3344

																				while (var7 != var8) { // L: 3345
																					if (var7 > var8) { // L: 3346
																						var44.swapItems(var7 - 1, var7); // L: 3347
																						--var7; // L: 3348
																					} else if (var7 < var8) { // L: 3350
																						var44.swapItems(var7 + 1, var7); // L: 3351
																						++var7; // L: 3352
																					}
																				}
																			} else {
																				var44.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 3357
																			}

																			PacketBufferNode var28 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3002, packetWriter.isaacCipher); // L: 3360
																			var28.packetBuffer.method7686(class16.dragInventoryWidget.id); // L: 3361
																			var28.packetBuffer.method7647(dragItemSlotDestination); // L: 3362
																			var28.packetBuffer.method7667(var35); // L: 3363
																			var28.packetBuffer.writeShort(dragItemSlotSource); // L: 3364
																			packetWriter.addNode(var28); // L: 3365
																		}
																	} else if (this.shouldLeftClickOpenMenu()) { // L: 3369
																		this.openMenu(draggedWidgetX, draggedWidgetY); // L: 3370
																	} else if (menuOptionsCount > 0) { // L: 3372
																		class352.method6438(draggedWidgetX, draggedWidgetY); // L: 3373
																	}

																	field593 = 10; // L: 3376
																	MouseHandler.MouseHandler_lastButton = 0; // L: 3377
																	class16.dragInventoryWidget = null; // L: 3378
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 3381 3382
																	field702 = true; // L: 3383
																}
															}

															if (Scene.shouldSendWalk()) { // L: 3388
																var3 = Scene.Scene_selectedX; // L: 3389
																var4 = Scene.Scene_selectedY; // L: 3390
																PacketBufferNode var46 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3024, packetWriter.isaacCipher); // L: 3392
																var46.packetBuffer.writeByte(5); // L: 3393
																var46.packetBuffer.writeIntME(class7.baseY * 64 + var4); // L: 3394
																var46.packetBuffer.method7667(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3395
																var46.packetBuffer.method7647(Decimator.baseX * 64 + var3); // L: 3396
																packetWriter.addNode(var46); // L: 3397
																Scene.method4090(); // L: 3398
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3399
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3400
																mouseCrossColor = 1; // L: 3401
																mouseCrossState = 0; // L: 3402
																destinationX = var3; // L: 3403
																destinationY = var4; // L: 3404
															}

															if (var38 != class113.mousedOverWidgetIf1) { // L: 3406
																if (var38 != null) { // L: 3407
																	class125.invalidateWidget(var38);
																}

																if (class113.mousedOverWidgetIf1 != null) { // L: 3408
																	class125.invalidateWidget(class113.mousedOverWidgetIf1);
																}
															}

															if (var34 != EnumComposition.field1890 && field640 == field686) { // L: 3410
																if (var34 != null) { // L: 3411
																	class125.invalidateWidget(var34);
																}

																if (EnumComposition.field1890 != null) { // L: 3412
																	class125.invalidateWidget(EnumComposition.field1890);
																}
															}

															if (EnumComposition.field1890 != null) { // L: 3414
																if (field640 < field686) { // L: 3415
																	++field640; // L: 3416
																	if (field686 == field640) { // L: 3417
																		class125.invalidateWidget(EnumComposition.field1890);
																	}
																}
															} else if (field640 > 0) { // L: 3420
																--field640;
															}

															class10.method101(); // L: 3421
															if (field518) { // L: 3422
																class260.method5127(SoundCache.field323, class402.field4448, NetCache.field4039); // L: 3423
																class229.method4818(ItemContainer.field1003, class291.field3324); // L: 3424
																if (SoundCache.field323 == class16.cameraX && class402.field4448 == WorldMapLabel.cameraY && NetCache.field4039 == class269.cameraZ && ItemContainer.field1003 == class82.cameraPitch && ClientPreferences.cameraYaw == class291.field3324) { // L: 3425
																	field518 = false; // L: 3426
																	isCameraLocked = false; // L: 3427
																	class307.field3613 = 0; // L: 3428
																	class29.field172 = 0; // L: 3429
																	VarpDefinition.field1805 = 0; // L: 3430
																	class21.field113 = 0; // L: 3431
																	class18.field96 = 0; // L: 3432
																	WorldMapData_1.field2759 = 0; // L: 3433
																	class271.field3186 = 0; // L: 3434
																	ClanChannel.field1664 = 0; // L: 3435
																	RouteStrategy.field2198 = 0; // L: 3436
																	Tile.field2309 = 0; // L: 3437
																}
															} else if (isCameraLocked) { // L: 3441
																var3 = ClanChannel.field1664 * 128 + 64; // L: 3442
																var4 = RouteStrategy.field2198 * 16384 + 64; // L: 3443
																var5 = ObjectComposition.getTileHeight(var3, var4, class268.Client_plane) - Tile.field2309; // L: 3444
																class260.method5127(var3, var5, var4); // L: 3445
																var3 = class307.field3613 * 16384 + 64; // L: 3446
																var4 = class29.field172 * 128 + 64; // L: 3447
																var5 = ObjectComposition.getTileHeight(var3, var4, class268.Client_plane) - VarpDefinition.field1805; // L: 3448
																var6 = var3 - class16.cameraX; // L: 3449
																var7 = var5 - WorldMapLabel.cameraY; // L: 3450
																var8 = var4 - class269.cameraZ; // L: 3451
																var9 = (int)Math.sqrt((double)(var6 * var6 + var8 * var8)); // L: 3452
																var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.9490051269531D) & 2047; // L: 3453
																var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.9490051269531D) & 2047; // L: 3454
																class229.method4818(var10, var11); // L: 3455
															}

															for (var3 = 0; var3 < 5; ++var3) { // L: 3457
																int var10002 = field615[var3]++;
															}

															class341.varcs.tryWrite(); // L: 3458
															var3 = class273.method5188(); // L: 3459
															var4 = KeyHandler.KeyHandler_idleCycles; // L: 3462
															if (var3 > 15000 && var4 > 15000) { // L: 3465
																logoutTimer = 250; // L: 3466
																MouseHandler.MouseHandler_idleCycles = 14500; // L: 3468
																var18 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2921, packetWriter.isaacCipher); // L: 3471
																packetWriter.addNode(var18); // L: 3472
															}

															class321.friendSystem.processFriendUpdates(); // L: 3474
															++packetWriter.pendingWrites; // L: 3475
															if (packetWriter.pendingWrites > 50) { // L: 3476
																var18 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2966, packetWriter.isaacCipher); // L: 3478
																packetWriter.addNode(var18); // L: 3479
															}

															try {
																packetWriter.flush(); // L: 3482
															} catch (IOException var29) { // L: 3484
																Clock.method3264(); // L: 3485
															}

															return; // L: 3487
														}

														var43 = var41.widget; // L: 3307
														if (var43.childIndex < 0) { // L: 3308
															break;
														}

														var45 = HitSplatDefinition.getWidget(var43.parentId); // L: 3309
													} while(var45 == null || var45.children == null || var43.childIndex >= var45.children.length || var43 != var45.children[var43.childIndex]); // L: 3310

													SceneTilePaint.runScriptEvent(var41); // L: 3314
												}
											}

											var43 = var41.widget; // L: 3295
											if (var43.childIndex < 0) { // L: 3296
												break;
											}

											var45 = HitSplatDefinition.getWidget(var43.parentId); // L: 3297
										} while(var45 == null || var45.children == null || var43.childIndex >= var45.children.length || var43 != var45.children[var43.childIndex]); // L: 3298

										SceneTilePaint.runScriptEvent(var41); // L: 3302
									}
								}

								var43 = var41.widget; // L: 3283
								if (var43.childIndex < 0) { // L: 3284
									break;
								}

								var45 = HitSplatDefinition.getWidget(var43.parentId); // L: 3285
							} while(var45 == null || var45.children == null || var43.childIndex >= var45.children.length || var43 != var45.children[var43.childIndex]); // L: 3286

							SceneTilePaint.runScriptEvent(var41); // L: 3290
						}
					}

					var32 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2927, packetWriter.isaacCipher); // L: 2978
					var32.packetBuffer.writeByte(0); // L: 2979
					var3 = var32.packetBuffer.offset; // L: 2980
					UrlRequester.performReflectionCheck(var32.packetBuffer); // L: 2981
					var32.packetBuffer.method7761(var32.packetBuffer.offset - var3); // L: 2982
					packetWriter.addNode(var32); // L: 2983
				}
			}
		}
	} // L: 2960

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1715092702"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class7.canvasWidth; // L: 4355
		int var2 = DecorativeObject.canvasHeight; // L: 4356
		if (super.contentWidth < var1) { // L: 4357
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) { // L: 4358
			var2 = super.contentHeight;
		}

		if (FriendsChatMember.clientPreferences != null) { // L: 4359
			try {
				Client var3 = AbstractByteArrayCopier.client; // L: 4361
				Object[] var4 = new Object[]{Canvas.getWindowedMode()}; // L: 4362
				JSObject.getWindow(var3).call("resize", var4); // L: 4365
			} catch (Throwable var5) { // L: 4368
			}
		}

	} // L: 4370

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "384905156"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) { // L: 4373
			var1 = rootInterface; // L: 4374
			if (ParamComposition.loadInterface(var1)) { // L: 4376
				class282.drawModelComponents(class358.Widget_interfaceComponents[var1], -1); // L: 4377
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4380
			if (field643[var1]) { // L: 4381
				field753[var1] = true;
			}

			field700[var1] = field643[var1]; // L: 4382
			field643[var1] = false; // L: 4383
		}

		field697 = cycle; // L: 4385
		viewportX = -1; // L: 4386
		viewportY = -1; // L: 4387
		class133.hoveredItemContainer = null; // L: 4388
		if (rootInterface != -1) { // L: 4389
			rootWidgetCount = 0; // L: 4390
			Message.drawWidgets(rootInterface, 0, 0, class7.canvasWidth, DecorativeObject.canvasHeight, 0, 0, -1); // L: 4391
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4393
		if (showMouseCross) { // L: 4394
			if (mouseCrossColor == 1) { // L: 4395
				Canvas.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4396
			}

			if (mouseCrossColor == 2) { // L: 4398
				Canvas.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4399
			}
		}

		if (!isMenuOpen) { // L: 4402
			if (viewportX != -1) { // L: 4403
				DevicePcmPlayerProvider.method352(viewportX, viewportY);
			}
		} else {
			var1 = MilliClock.menuX; // L: 4406
			int var2 = class1.menuY; // L: 4407
			int var3 = class132.menuWidth; // L: 4408
			int var4 = WorldMapData_0.menuHeight; // L: 4409
			int var5 = 6116423; // L: 4410
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5); // L: 4411
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0); // L: 4412
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0); // L: 4413
			WorldMapSection2.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1); // L: 4414
			int var6 = MouseHandler.MouseHandler_x; // L: 4415
			int var7 = MouseHandler.MouseHandler_y; // L: 4416

			int var8;
			int var9;
			int var10;
			for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 4417
				var9 = (menuOptionsCount - 1 - var8) * 15 + var2 + 31; // L: 4418
				var10 = 16777215; // L: 4419
				if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) { // L: 4420
					var10 = 16776960;
				}

				WorldMapSection2.fontBold12.draw(ScriptFrame.method1034(var8), var1 + 3, var9, var10, 0); // L: 4421
			}

			var8 = MilliClock.menuX; // L: 4423
			var9 = class1.menuY; // L: 4424
			var10 = class132.menuWidth; // L: 4425
			int var11 = WorldMapData_0.menuHeight; // L: 4426

			for (int var12 = 0; var12 < rootWidgetCount; ++var12) { // L: 4428
				if (rootWidgetWidths[var12] + rootWidgetXs[var12] > var8 && rootWidgetXs[var12] < var8 + var10 && rootWidgetHeights[var12] + rootWidgetYs[var12] > var9 && rootWidgetYs[var12] < var9 + var11) { // L: 4429
					field753[var12] = true;
				}
			}
		}

		if (gameDrawingMode == 3) { // L: 4433
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4434
				if (field700[var1]) { // L: 4435
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4436
				} else if (field753[var1]) { // L: 4438
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4439
				}
			}
		}

		class6.method42(class268.Client_plane, ScriptFrame.localPlayer.x, ScriptFrame.localPlayer.y, field599); // L: 4443
		field599 = 0; // L: 4444
	} // L: 4445

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(Lcz;II)Z",
		garbageValue = "-1746903983"
	)
	boolean method1102(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 5996
			class19.friendsChatManager = null; // L: 5997
		} else {
			if (class19.friendsChatManager == null) { // L: 6000
				class19.friendsChatManager = new FriendsChatManager(StructComposition.loginType, AbstractByteArrayCopier.client); // L: 6001
			}

			class19.friendsChatManager.method6553(var1.packetBuffer, var2); // L: 6003
		}

		field685 = cycleCntr; // L: 6006
		DirectByteArrayCopier.FriendsChatManager_inFriendsChat = true; // L: 6007
		var1.serverPacket = null; // L: 6009
		return true; // L: 6010
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Lcz;I)Z",
		garbageValue = "-168458680"
	)
	boolean method1464(PacketWriter var1) {
		if (class19.friendsChatManager != null) { // L: 6014
			class19.friendsChatManager.method6556(var1.packetBuffer); // L: 6015
		}

		Actor.method2163(); // L: 6017
		var1.serverPacket = null; // L: 6018
		return true; // L: 6019
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Lcz;S)Z",
		garbageValue = "23645"
	)
	final boolean method1104(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6024
		PacketBuffer var3 = var1.packetBuffer; // L: 6025
		if (var2 == null) { // L: 6026
			return false;
		} else {
			int var6;
			String var23;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6028
					if (var1.field1335) { // L: 6029
						if (!var2.isAvailable(1)) { // L: 6030
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6031
						var1.field1336 = 0; // L: 6032
						var1.field1335 = false; // L: 6033
					}

					var3.offset = 0; // L: 6035
					if (var3.method7580()) { // L: 6036
						if (!var2.isAvailable(1)) { // L: 6037
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6038
						var1.field1336 = 0; // L: 6039
					}

					var1.field1335 = true; // L: 6041
					ServerPacket[] var4 = ScriptEvent.ServerPacket_values(); // L: 6042
					var5 = var3.readSmartByteShortIsaac(); // L: 6043
					if (var5 < 0 || var5 >= var4.length) { // L: 6044
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6045
					var1.serverPacketLength = var1.serverPacket.length; // L: 6046
				}

				if (var1.serverPacketLength == -1) { // L: 6048
					if (!var2.isAvailable(1)) { // L: 6049
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6050
					var1.serverPacketLength = var3.array[0] & 255; // L: 6051
				}

				if (var1.serverPacketLength == -2) { // L: 6053
					if (!var2.isAvailable(2)) { // L: 6054
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6055
					var3.offset = 0; // L: 6056
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6057
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6059
					return false;
				}

				var3.offset = 0; // L: 6060
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6061
				var1.field1336 = 0; // L: 6062
				timer.method6457(); // L: 6063
				var1.field1330 = var1.field1339; // L: 6064
				var1.field1339 = var1.field1337; // L: 6065
				var1.field1337 = var1.serverPacket; // L: 6066
				int var20;
				if (ServerPacket.field3060 == var1.serverPacket) { // L: 6067
					var20 = var3.readUnsignedByte(); // L: 6068
					if (var3.readUnsignedByte() == 0) { // L: 6069
						grandExchangeOffers[var20] = new GrandExchangeOffer(); // L: 6070
						var3.offset += 18; // L: 6071
					} else {
						--var3.offset; // L: 6074
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false); // L: 6075
					}

					field684 = cycleCntr; // L: 6077
					var1.serverPacket = null; // L: 6078
					return true; // L: 6079
				}

				if (ServerPacket.field3104 == var1.serverPacket) { // L: 6081
					class321.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 6082
					field710 = cycleCntr; // L: 6083
					var1.serverPacket = null; // L: 6084
					return true; // L: 6085
				}

				if (ServerPacket.field3103 == var1.serverPacket) { // L: 6087
					class126.updateNpcs(false, var3); // L: 6088
					var1.serverPacket = null; // L: 6089
					return true; // L: 6090
				}

				int var8;
				NPC var57;
				if (ServerPacket.field3145 == var1.serverPacket) { // L: 6092
					var6 = var3.method7670(); // L: 6096
					var5 = var3.method7654(); // L: 6097
					var20 = var3.method7654(); // L: 6098
					if (var5 == 65535) { // L: 6099
						var5 = -1; // L: 6100
					}

					var57 = npcs[var20]; // L: 6102
					if (var57 != null) { // L: 6103
						if (var5 == var57.sequence && var5 != -1) { // L: 6104
							var8 = ByteArrayPool.SequenceDefinition_get(var5).field2181; // L: 6105
							if (var8 == 1) { // L: 6106
								var57.sequenceFrame = 0; // L: 6107
								var57.sequenceFrameCycle = 0; // L: 6108
								var57.sequenceDelay = var6; // L: 6109
								var57.field1172 = 0; // L: 6110
							} else if (var8 == 2) { // L: 6112
								var57.field1172 = 0; // L: 6113
							}
						} else if (var5 == -1 || var57.sequence == -1 || ByteArrayPool.SequenceDefinition_get(var5).field2157 >= ByteArrayPool.SequenceDefinition_get(var57.sequence).field2157) { // L: 6116
							var57.sequence = var5; // L: 6117
							var57.sequenceFrame = 0; // L: 6118
							var57.sequenceFrameCycle = 0; // L: 6119
							var57.sequenceDelay = var6; // L: 6120
							var57.field1172 = 0; // L: 6121
							var57.field1201 = var57.pathLength; // L: 6122
						}
					}

					var1.serverPacket = null; // L: 6126
					return true; // L: 6127
				}

				int var21;
				if (ServerPacket.field3055 == var1.serverPacket) { // L: 6129
					var20 = var3.readUnsignedByte(); // L: 6130
					var5 = var3.readUnsignedByte(); // L: 6131
					var6 = var3.readUnsignedByte(); // L: 6132
					var21 = var3.readUnsignedByte(); // L: 6133
					field738[var20] = true; // L: 6134
					field739[var20] = var5; // L: 6135
					field740[var20] = var6; // L: 6136
					field758[var20] = var21; // L: 6137
					field615[var20] = 0; // L: 6138
					var1.serverPacket = null; // L: 6139
					return true; // L: 6140
				}

				Widget var22;
				if (ServerPacket.field3087 == var1.serverPacket) { // L: 6142
					var20 = var3.method7691(); // L: 6143
					var5 = var3.method7847(); // L: 6144
					var22 = HitSplatDefinition.getWidget(var20); // L: 6145
					if (var5 != var22.sequenceId || var5 == -1) { // L: 6146
						var22.sequenceId = var5; // L: 6147
						var22.modelFrame = 0; // L: 6148
						var22.modelFrameCycle = 0; // L: 6149
						class125.invalidateWidget(var22); // L: 6150
					}

					var1.serverPacket = null; // L: 6152
					return true; // L: 6153
				}

				Widget var69;
				if (ServerPacket.field3102 == var1.serverPacket) { // L: 6155
					var20 = var3.method7690(); // L: 6156
					var69 = HitSplatDefinition.getWidget(var20); // L: 6157

					for (var6 = 0; var6 < var69.itemIds.length; ++var6) { // L: 6158
						var69.itemIds[var6] = -1; // L: 6159
						var69.itemIds[var6] = 0; // L: 6160
					}

					class125.invalidateWidget(var69); // L: 6162
					var1.serverPacket = null; // L: 6163
					return true; // L: 6164
				}

				int var13;
				long var24;
				long var26;
				String var28;
				String var50;
				if (ServerPacket.field3091 == var1.serverPacket) { // L: 6166
					var50 = var3.readStringCp1252NullTerminated(); // L: 6167
					var24 = (long)var3.readUnsignedShort(); // L: 6168
					var26 = (long)var3.readMedium(); // L: 6169
					PlayerType var9 = (PlayerType)GameEngine.findEnumerated(class220.PlayerType_values(), var3.readUnsignedByte()); // L: 6170
					long var10 = (var24 << 32) + var26; // L: 6171
					boolean var61 = false; // L: 6172

					for (var13 = 0; var13 < 100; ++var13) { // L: 6173
						if (var10 == field712[var13]) { // L: 6174
							var61 = true; // L: 6175
							break; // L: 6176
						}
					}

					if (class321.friendSystem.isIgnored(new Username(var50, StructComposition.loginType))) { // L: 6179
						var61 = true;
					}

					if (!var61 && field601 == 0) { // L: 6180
						field712[field713] = var10; // L: 6181
						field713 = (field713 + 1) % 100; // L: 6182
						var28 = AbstractFont.escapeBrackets(AbstractWorldMapData.method4895(class229.method4813(var3))); // L: 6183
						byte var64;
						if (var9.isPrivileged) { // L: 6185
							var64 = 7;
						} else {
							var64 = 3; // L: 6186
						}

						if (var9.modIcon != -1) { // L: 6187
							VarcInt.addGameMessage(var64, SoundSystem.method740(var9.modIcon) + var50, var28);
						} else {
							VarcInt.addGameMessage(var64, var50, var28); // L: 6188
						}
					}

					var1.serverPacket = null; // L: 6190
					return true; // L: 6191
				}

				int var29;
				int var30;
				if (ServerPacket.field3131 == var1.serverPacket) { // L: 6193
					var20 = var3.readInt(); // L: 6194
					var5 = var3.readUnsignedShort(); // L: 6195
					if (var20 < -70000) { // L: 6196
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 6198
						var22 = HitSplatDefinition.getWidget(var20);
					} else {
						var22 = null; // L: 6199
					}

					if (var22 != null) { // L: 6200
						for (var21 = 0; var21 < var22.itemIds.length; ++var21) { // L: 6201
							var22.itemIds[var21] = 0; // L: 6202
							var22.itemQuantities[var21] = 0; // L: 6203
						}
					}

					Message.clearItemContainer(var5); // L: 6206
					var21 = var3.readUnsignedShort(); // L: 6207

					for (var8 = 0; var8 < var21; ++var8) { // L: 6208
						var29 = var3.method7654(); // L: 6209
						var30 = var3.method7670(); // L: 6210
						if (var30 == 255) { // L: 6211
							var30 = var3.readInt();
						}

						if (var22 != null && var8 < var22.itemIds.length) { // L: 6212 6213
							var22.itemIds[var8] = var29; // L: 6214
							var22.itemQuantities[var8] = var30; // L: 6215
						}

						class137.itemContainerSetItem(var5, var8, var29 - 1, var30); // L: 6218
					}

					if (var22 != null) { // L: 6220
						class125.invalidateWidget(var22);
					}

					class327.method5979(); // L: 6221
					changedItemContainers[++field678 - 1 & 31] = var5 & 32767; // L: 6222
					var1.serverPacket = null; // L: 6223
					return true; // L: 6224
				}

				if (ServerPacket.field3079 == var1.serverPacket) { // L: 6226
					class321.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 6227
					ParamComposition.FriendSystem_invalidateIgnoreds(); // L: 6228
					field710 = cycleCntr; // L: 6229
					var1.serverPacket = null; // L: 6230
					return true; // L: 6231
				}

				if (ServerPacket.field3138 == var1.serverPacket) { // L: 6233
					var20 = var3.readUnsignedShort(); // L: 6234
					var5 = var3.method7691(); // L: 6235
					Varps.Varps_temp[var20] = var5; // L: 6236
					if (Varps.Varps_main[var20] != var5) { // L: 6237
						Varps.Varps_main[var20] = var5; // L: 6238
					}

					class300.changeGameOptions(var20); // L: 6240
					changedVarps[++changedVarpCount - 1 & 31] = var20; // L: 6241
					var1.serverPacket = null; // L: 6242
					return true; // L: 6243
				}

				int var11;
				if (ServerPacket.field3106 == var1.serverPacket) { // L: 6245
					var11 = var3.readUnsignedShort(); // L: 6254
					var30 = var3.readUnsignedByte(); // L: 6255
					var6 = var3.readMedium(); // L: 6256
					var20 = var6 >> 16; // L: 6257
					var5 = var6 >> 8 & 255; // L: 6258
					var21 = var20 + (var6 >> 4 & 7); // L: 6259
					var8 = var5 + (var6 & 7); // L: 6260
					var29 = var3.readUnsignedShort(); // L: 6261
					if (var21 >= 0 && var8 >= 0 && var21 < 104 && var8 < 104) { // L: 6262
						var21 = var21 * 128 + 64; // L: 6263
						var8 = var8 * 128 + 64; // L: 6264
						GraphicsObject var81 = new GraphicsObject(var29, class268.Client_plane, var21, var8, ObjectComposition.getTileHeight(var21, var8, class268.Client_plane) - var30, var11, cycle); // L: 6265
						graphicsObjects.addFirst(var81); // L: 6266
					}

					var1.serverPacket = null; // L: 6268
					return true; // L: 6269
				}

				if (ServerPacket.field3094 == var1.serverPacket) { // L: 6271
					class126.updateNpcs(true, var3); // L: 6272
					var1.serverPacket = null; // L: 6273
					return true; // L: 6274
				}

				if (ServerPacket.field3120 == var1.serverPacket) { // L: 6276
					var20 = var3.method7640(); // L: 6277
					class29.method391(var20); // L: 6278
					changedItemContainers[++field678 - 1 & 31] = var20 & 32767; // L: 6279
					var1.serverPacket = null; // L: 6280
					return true; // L: 6281
				}

				if (ServerPacket.field3126 == var1.serverPacket) { // L: 6283
					isCameraLocked = false; // L: 6284

					for (var20 = 0; var20 < 5; ++var20) { // L: 6285
						field738[var20] = false;
					}

					var1.serverPacket = null; // L: 6286
					return true; // L: 6287
				}

				int var15;
				int var16;
				GameObject var39;
				String var40;
				byte var67;
				if (ServerPacket.field3052 == var1.serverPacket) { // L: 6289
					var67 = var3.readByte(); // L: 6290
					var23 = var3.readStringCp1252NullTerminated(); // L: 6291
					long var32 = (long)var3.readUnsignedShort(); // L: 6292
					long var34 = (long)var3.readMedium(); // L: 6293
					PlayerType var85 = (PlayerType)GameEngine.findEnumerated(class220.PlayerType_values(), var3.readUnsignedByte()); // L: 6294
					long var37 = (var32 << 32) + var34; // L: 6295
					boolean var62 = false; // L: 6296
					var39 = null; // L: 6297
					ClanChannel var89 = var67 >= 0 ? currentClanChannels[var67] : NetCache.guestClanChannel; // L: 6299
					if (var89 == null) { // L: 6300
						var62 = true; // L: 6301
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var85.isUser && class321.friendSystem.isIgnored(new Username(var23, StructComposition.loginType))) { // L: 6310 6311
									var62 = true;
								}
								break;
							}

							if (var37 == field712[var15]) { // L: 6305
								var62 = true; // L: 6306
								break; // L: 6307
							}

							++var15; // L: 6304
						}
					}

					if (!var62) { // L: 6314
						field712[field713] = var37; // L: 6315
						field713 = (field713 + 1) % 100; // L: 6316
						var40 = AbstractFont.escapeBrackets(class229.method4813(var3)); // L: 6317
						var16 = var67 >= 0 ? 41 : 44; // L: 6318
						if (var85.modIcon != -1) { // L: 6319
							class161.addChatMessage(var16, SoundSystem.method740(var85.modIcon) + var23, var40, var89.name);
						} else {
							class161.addChatMessage(var16, var23, var40, var89.name); // L: 6320
						}
					}

					var1.serverPacket = null; // L: 6322
					return true; // L: 6323
				}

				if (ServerPacket.field3125 == var1.serverPacket && isCameraLocked) { // L: 6325 6326
					field518 = true; // L: 6327
					class271.field3186 = var3.readUnsignedByte(); // L: 6328
					WorldMapData_1.field2759 = var3.readUnsignedByte(); // L: 6329
					class21.field113 = var3.readUnsignedByte(); // L: 6330
					class18.field96 = var3.readUnsignedByte(); // L: 6331

					for (var20 = 0; var20 < 5; ++var20) { // L: 6332
						field738[var20] = false;
					}

					var1.serverPacket = null; // L: 6333
					return true; // L: 6334
				}

				if (ServerPacket.field3071 == var1.serverPacket) { // L: 6337
					return this.method1102(var1, 2); // L: 6338
				}

				if (ServerPacket.field3105 == var1.serverPacket) { // L: 6340
					var20 = var3.method7713(); // L: 6341
					var5 = var3.readUnsignedShort(); // L: 6342
					var22 = HitSplatDefinition.getWidget(var20); // L: 6343
					if (var22.modelType != 2 || var5 != var22.modelId) { // L: 6344
						var22.modelType = 2; // L: 6345
						var22.modelId = var5; // L: 6346
						class125.invalidateWidget(var22); // L: 6347
					}

					var1.serverPacket = null; // L: 6349
					return true; // L: 6350
				}

				String var74;
				if (ServerPacket.field3147 == var1.serverPacket) { // L: 6352
					byte[] var54 = new byte[var1.serverPacketLength]; // L: 6353
					var3.method7582(var54, 0, var54.length); // L: 6354
					Buffer var79 = new Buffer(var54); // L: 6355
					var74 = var79.readStringCp1252NullTerminated(); // L: 6356
					class400.openURL(var74, true, false); // L: 6357
					var1.serverPacket = null; // L: 6358
					return true; // L: 6359
				}

				if (ServerPacket.field3050 == var1.serverPacket) { // L: 6361
					var20 = var3.readInt(); // L: 6362
					var5 = var3.readInt(); // L: 6363
					var6 = DevicePcmPlayerProvider.getGcDuration(); // L: 6364
					PacketBufferNode var58 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2991, packetWriter.isaacCipher); // L: 6366
					var58.packetBuffer.method7656(var6); // L: 6367
					var58.packetBuffer.method7673(var20); // L: 6368
					var58.packetBuffer.method7686(var5); // L: 6369
					var58.packetBuffer.writeByte(GameEngine.fps); // L: 6370
					packetWriter.addNode(var58); // L: 6371
					var1.serverPacket = null; // L: 6372
					return true; // L: 6373
				}

				if (ServerPacket.field3101 == var1.serverPacket) { // L: 6375
					isCameraLocked = true; // L: 6376
					field518 = false; // L: 6377
					class307.field3613 = var3.readUnsignedByte() * 128; // L: 6378
					class29.field172 = var3.readUnsignedByte() * 16384; // L: 6379
					VarpDefinition.field1805 = var3.readUnsignedShort(); // L: 6380
					class21.field113 = var3.readUnsignedByte(); // L: 6381
					class18.field96 = var3.readUnsignedByte(); // L: 6382
					if (class18.field96 >= 100) { // L: 6383
						var20 = class307.field3613 * 16384 + 64; // L: 6384
						var5 = class29.field172 * 128 + 64; // L: 6385
						var6 = ObjectComposition.getTileHeight(var20, var5, class268.Client_plane) - VarpDefinition.field1805; // L: 6386
						var21 = var20 - class16.cameraX; // L: 6387
						var8 = var6 - WorldMapLabel.cameraY; // L: 6388
						var29 = var5 - class269.cameraZ; // L: 6389
						var30 = (int)Math.sqrt((double)(var29 * var29 + var21 * var21)); // L: 6390
						class82.cameraPitch = (int)(Math.atan2((double)var8, (double)var30) * 325.9490051269531D) & 2047; // L: 6391
						ClientPreferences.cameraYaw = (int)(Math.atan2((double)var21, (double)var29) * -325.9490051269531D) & 2047; // L: 6392
						if (class82.cameraPitch < 128) { // L: 6393
							class82.cameraPitch = 128;
						}

						if (class82.cameraPitch > 383) { // L: 6394
							class82.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 6396
					return true; // L: 6397
				}

				if (ServerPacket.field3113 == var1.serverPacket) { // L: 6399
					for (var20 = 0; var20 < VarpDefinition.field1809; ++var20) { // L: 6400
						VarpDefinition var78 = class78.VarpDefinition_get(var20); // L: 6401
						if (var78 != null) { // L: 6402
							Varps.Varps_temp[var20] = 0; // L: 6403
							Varps.Varps_main[var20] = 0; // L: 6404
						}
					}

					class327.method5979(); // L: 6407
					changedVarpCount += 32; // L: 6408
					var1.serverPacket = null; // L: 6409
					return true; // L: 6410
				}

				int var12;
				int var63;
				if (ServerPacket.field3090 == var1.serverPacket) { // L: 6412
					int var18 = var3.method7786(); // L: 6428
					var63 = var3.method7786() * 4; // L: 6429
					var11 = var3.method7711(); // L: 6430
					var16 = var3.method7677(); // L: 6431
					var12 = var3.method7640(); // L: 6432
					var13 = var3.readUnsignedByte() * 4; // L: 6433
					byte var82 = var3.method7672(); // L: 6434
					int var17 = var3.method7708(); // L: 6435
					var6 = var3.method7685(); // L: 6436
					var20 = var6 >> 16; // L: 6437
					var5 = var6 >> 8 & 255; // L: 6438
					var21 = var20 + (var6 >> 4 & 7); // L: 6439
					var8 = var5 + (var6 & 7); // L: 6440
					byte var83 = var3.method7658(); // L: 6441
					var15 = var3.method7677(); // L: 6442
					var29 = var83 + var21; // L: 6443
					var30 = var82 + var8; // L: 6444
					if (var21 >= 0 && var8 >= 0 && var21 < 104 && var8 < 104 && var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104 && var12 != 65535) { // L: 6445
						var21 = var21 * 128 + 64; // L: 6446
						var8 = var8 * 128 + 64; // L: 6447
						var29 = var29 * 128 + 64; // L: 6448
						var30 = var30 * 128 + 64; // L: 6449
						Projectile var19 = new Projectile(var12, class268.Client_plane, var21, var8, ObjectComposition.getTileHeight(var21, var8, class268.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var63); // L: 6450
						var19.setDestination(var29, var30, ObjectComposition.getTileHeight(var29, var30, class268.Client_plane) - var63, var15 + cycle); // L: 6451
						projectiles.addFirst(var19); // L: 6452
					}

					var1.serverPacket = null; // L: 6454
					return true; // L: 6455
				}

				if (ServerPacket.field3084 == var1.serverPacket) { // L: 6457
					Login.updatePlayers(var3, var1.serverPacketLength); // L: 6458
					AbstractWorldMapData.method4911(); // L: 6459
					var1.serverPacket = null; // L: 6460
					return true; // L: 6461
				}

				Widget var56;
				if (ServerPacket.field3075 == var1.serverPacket) { // L: 6463
					var20 = var3.method7654(); // L: 6464
					var5 = var3.method7691(); // L: 6465
					var6 = var3.method7654(); // L: 6466
					var56 = HitSplatDefinition.getWidget(var5); // L: 6467
					var56.field3414 = var20 + (var6 << 16); // L: 6468
					var1.serverPacket = null; // L: 6469
					return true; // L: 6470
				}

				if (ServerPacket.field3134 == var1.serverPacket) { // L: 6472
					var20 = var3.readInt(); // L: 6473
					var5 = var3.method7677(); // L: 6474
					var6 = var5 >> 10 & 31; // L: 6475
					var21 = var5 >> 5 & 31; // L: 6476
					var8 = var5 & 31; // L: 6477
					var29 = (var21 << 11) + (var6 << 19) + (var8 << 3); // L: 6478
					Widget var84 = HitSplatDefinition.getWidget(var20); // L: 6479
					if (var29 != var84.color) { // L: 6480
						var84.color = var29; // L: 6481
						class125.invalidateWidget(var84); // L: 6482
					}

					var1.serverPacket = null; // L: 6484
					return true; // L: 6485
				}

				long var41;
				if (ServerPacket.field3061 == var1.serverPacket) { // L: 6487
					var67 = var3.readByte(); // L: 6488
					var24 = (long)var3.readUnsignedShort(); // L: 6489
					var26 = (long)var3.readMedium(); // L: 6490
					var41 = var26 + (var24 << 32); // L: 6491
					boolean var60 = false; // L: 6492
					ClanChannel var31 = var67 >= 0 ? currentClanChannels[var67] : NetCache.guestClanChannel; // L: 6493
					if (var31 == null) { // L: 6494
						var60 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 6496
							if (var41 == field712[var13]) { // L: 6497
								var60 = true; // L: 6498
								break; // L: 6499
							}
						}
					}

					if (!var60) { // L: 6503
						field712[field713] = var41; // L: 6504
						field713 = (field713 + 1) % 100; // L: 6505
						var28 = class229.method4813(var3); // L: 6506
						var63 = var67 >= 0 ? 43 : 46; // L: 6507
						class161.addChatMessage(var63, "", var28, var31.name); // L: 6508
					}

					var1.serverPacket = null; // L: 6510
					return true; // L: 6511
				}

				if (ServerPacket.field3117 == var1.serverPacket) { // L: 6513
					return this.method1102(var1, 1); // L: 6514
				}

				if (ServerPacket.field3107 == var1.serverPacket) { // L: 6516
					field687 = cycleCntr; // L: 6517
					var67 = var3.readByte(); // L: 6518
					class145 var77 = new class145(var3); // L: 6519
					ClanChannel var80;
					if (var67 >= 0) { // L: 6521
						var80 = currentClanChannels[var67];
					} else {
						var80 = NetCache.guestClanChannel; // L: 6522
					}

					var77.method3016(var80); // L: 6523
					var1.serverPacket = null; // L: 6524
					return true; // L: 6525
				}

				if (ServerPacket.field3114 == var1.serverPacket) { // L: 6527
					CollisionMap.field2196 = var3.readUnsignedByte(); // L: 6528
					class137.field1593 = var3.method7708(); // L: 6529

					for (var20 = CollisionMap.field2196; var20 < CollisionMap.field2196 + 8; ++var20) { // L: 6530
						for (var5 = class137.field1593; var5 < class137.field1593 + 8; ++var5) { // L: 6531
							if (groundItems[class268.Client_plane][var20][var5] != null) { // L: 6532
								groundItems[class268.Client_plane][var20][var5] = null; // L: 6533
								class360.updateItemPile(var20, var5); // L: 6534
							}
						}
					}

					for (PendingSpawn var52 = (PendingSpawn)pendingSpawns.last(); var52 != null; var52 = (PendingSpawn)pendingSpawns.previous()) { // L: 6538 6539 6541
						if (var52.x >= CollisionMap.field2196 && var52.x < CollisionMap.field2196 + 8 && var52.y >= class137.field1593 && var52.y < class137.field1593 + 8 && var52.plane == class268.Client_plane) { // L: 6540
							var52.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 6543
					return true; // L: 6544
				}

				if (ServerPacket.field3146 == var1.serverPacket) { // L: 6546
					class327.method5979(); // L: 6547
					runEnergy = var3.readUnsignedByte(); // L: 6548
					field690 = cycleCntr; // L: 6549
					var1.serverPacket = null; // L: 6550
					return true; // L: 6551
				}

				if (ServerPacket.field3080 == var1.serverPacket) { // L: 6553
					Coord.field3318 = null; // L: 6554
					var1.serverPacket = null; // L: 6555
					return true; // L: 6556
				}

				if (ServerPacket.field3046 == var1.serverPacket) { // L: 6558
					class309.field3942 = true; // L: 6559
					class126.updateNpcs(false, var3); // L: 6560
					var1.serverPacket = null; // L: 6561
					return true; // L: 6562
				}

				if (ServerPacket.field3132 == var1.serverPacket) { // L: 6564
					VertexNormal.method4415(); // L: 6565
					var67 = var3.readByte(); // L: 6566
					if (var1.serverPacketLength == 1) { // L: 6567
						if (var67 >= 0) { // L: 6568
							currentClanSettings[var67] = null;
						} else {
							FontName.guestClanSettings = null; // L: 6569
						}

						var1.serverPacket = null; // L: 6570
						return true; // L: 6571
					}

					if (var67 >= 0) { // L: 6573
						currentClanSettings[var67] = new ClanSettings(var3); // L: 6574
					} else {
						FontName.guestClanSettings = new ClanSettings(var3); // L: 6577
					}

					var1.serverPacket = null; // L: 6579
					return true; // L: 6580
				}

				if (ServerPacket.field3136 == var1.serverPacket) { // L: 6582
					if (rootInterface != -1) { // L: 6583
						ModelData0.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 6584
					return true; // L: 6585
				}

				if (ServerPacket.field3123 == var1.serverPacket) { // L: 6587
					minimapState = var3.readUnsignedByte(); // L: 6588
					var1.serverPacket = null; // L: 6589
					return true; // L: 6590
				}

				if (ServerPacket.field3118 == var1.serverPacket) { // L: 6592
					var20 = var3.readUnsignedByte(); // L: 6593
					NPC.method2320(var20); // L: 6594
					var1.serverPacket = null; // L: 6595
					return true; // L: 6596
				}

				if (ServerPacket.field3064 == var1.serverPacket) { // L: 6598
					Skills.method5659(class263.field3029); // L: 6599
					var1.serverPacket = null; // L: 6600
					return true; // L: 6601
				}

				if (ServerPacket.field3108 == var1.serverPacket) { // L: 6603
					Skills.method5659(class263.field3026); // L: 6604
					var1.serverPacket = null; // L: 6605
					return true; // L: 6606
				}

				if (ServerPacket.field3110 == var1.serverPacket) { // L: 6608
					var20 = var3.method7691(); // L: 6609
					var5 = var3.readUnsignedShort(); // L: 6610
					var22 = HitSplatDefinition.getWidget(var20); // L: 6611
					if (var22 != null && var22.type == 0) { // L: 6612
						if (var5 > var22.scrollHeight - var22.height) { // L: 6613
							var5 = var22.scrollHeight - var22.height;
						}

						if (var5 < 0) { // L: 6614
							var5 = 0;
						}

						if (var5 != var22.scrollY) { // L: 6615
							var22.scrollY = var5; // L: 6616
							class125.invalidateWidget(var22); // L: 6617
						}
					}

					var1.serverPacket = null; // L: 6620
					return true; // L: 6621
				}

				if (ServerPacket.field3073 == var1.serverPacket) { // L: 6623
					var20 = var3.method7677(); // L: 6624
					rootInterface = var20; // L: 6625
					this.resizeRoot(false); // L: 6626
					PacketWriter.Widget_resetModelFrames(var20); // L: 6627
					class282.runWidgetOnLoadListener(rootInterface); // L: 6628

					for (var5 = 0; var5 < 100; ++var5) { // L: 6629
						field643[var5] = true;
					}

					var1.serverPacket = null; // L: 6630
					return true; // L: 6631
				}

				if (ServerPacket.field3056 == var1.serverPacket) { // L: 6633
					Skills.method5659(class263.field3033); // L: 6634
					var1.serverPacket = null; // L: 6635
					return true; // L: 6636
				}

				boolean var70;
				if (ServerPacket.field3149 == var1.serverPacket) { // L: 6638
					var70 = var3.readBoolean(); // L: 6639
					if (var70) { // L: 6640
						if (class347.field4164 == null) { // L: 6641
							class347.field4164 = new class326();
						}
					} else {
						class347.field4164 = null; // L: 6643
					}

					var1.serverPacket = null; // L: 6644
					return true; // L: 6645
				}

				if (ServerPacket.field3127 == var1.serverPacket) { // L: 6647
					Skills.method5659(class263.field3028); // L: 6648
					var1.serverPacket = null; // L: 6649
					return true; // L: 6650
				}

				if (ServerPacket.field3086 == var1.serverPacket) { // L: 6652
					Skills.method5659(class263.field3031); // L: 6653
					var1.serverPacket = null; // L: 6654
					return true; // L: 6655
				}

				if (ServerPacket.field3085 == var1.serverPacket) { // L: 6657
					rebootTimer = var3.method7654() * 30; // L: 6658
					field690 = cycleCntr; // L: 6659
					var1.serverPacket = null; // L: 6660
					return true; // L: 6661
				}

				if (ServerPacket.field3129 == var1.serverPacket) { // L: 6663
					var20 = var3.readInt(); // L: 6664
					InterfaceParent var76 = (InterfaceParent)interfaceParents.get((long)var20); // L: 6665
					if (var76 != null) { // L: 6666
						class29.closeInterface(var76, true);
					}

					if (meslayerContinueWidget != null) { // L: 6667
						class125.invalidateWidget(meslayerContinueWidget); // L: 6668
						meslayerContinueWidget = null; // L: 6669
					}

					var1.serverPacket = null; // L: 6671
					return true; // L: 6672
				}

				if (ServerPacket.field3122 == var1.serverPacket) { // L: 6674
					for (var20 = 0; var20 < players.length; ++var20) { // L: 6675
						if (players[var20] != null) { // L: 6676
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) { // L: 6678
						if (npcs[var20] != null) { // L: 6679
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 6681
					return true; // L: 6682
				}

				if (ServerPacket.field3058 == var1.serverPacket) { // L: 6684
					Skills.method5659(class263.field3034); // L: 6685
					var1.serverPacket = null; // L: 6686
					return true; // L: 6687
				}

				long var43;
				InterfaceParent var55;
				if (ServerPacket.field3053 == var1.serverPacket) { // L: 6689
					var20 = var3.offset + var1.serverPacketLength; // L: 6690
					var5 = var3.readUnsignedShort(); // L: 6691
					var6 = var3.readUnsignedShort(); // L: 6692
					if (var5 != rootInterface) { // L: 6693
						rootInterface = var5; // L: 6694
						this.resizeRoot(false); // L: 6695
						PacketWriter.Widget_resetModelFrames(rootInterface); // L: 6696
						class282.runWidgetOnLoadListener(rootInterface); // L: 6697

						for (var21 = 0; var21 < 100; ++var21) { // L: 6698
							field643[var21] = true;
						}
					}

					InterfaceParent var36;
					for (; var6-- > 0; var36.field1022 = true) { // L: 6700 6710
						var21 = var3.readInt(); // L: 6701
						var8 = var3.readUnsignedShort(); // L: 6702
						var29 = var3.readUnsignedByte(); // L: 6703
						var36 = (InterfaceParent)interfaceParents.get((long)var21); // L: 6704
						if (var36 != null && var8 != var36.group) { // L: 6705
							class29.closeInterface(var36, true); // L: 6706
							var36 = null; // L: 6707
						}

						if (var36 == null) { // L: 6709
							var36 = Decimator.method1001(var21, var8, var29);
						}
					}

					for (var55 = (InterfaceParent)interfaceParents.first(); var55 != null; var55 = (InterfaceParent)interfaceParents.next()) { // L: 6712
						if (var55.field1022) { // L: 6713
							var55.field1022 = false;
						} else {
							class29.closeInterface(var55, true); // L: 6715
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6718

					while (var3.offset < var20) { // L: 6719
						var21 = var3.readInt(); // L: 6720
						var8 = var3.readUnsignedShort(); // L: 6721
						var29 = var3.readUnsignedShort(); // L: 6722
						var30 = var3.readInt(); // L: 6723

						for (var11 = var8; var11 <= var29; ++var11) { // L: 6724
							var43 = (long)var11 + ((long)var21 << 32); // L: 6725
							widgetFlags.put(new IntegerNode(var30), var43); // L: 6726
						}
					}

					var1.serverPacket = null; // L: 6729
					return true; // L: 6730
				}

				if (ServerPacket.field3144 == var1.serverPacket) { // L: 6732
					var20 = var3.readUnsignedShort(); // L: 6733
					var5 = var3.method7708(); // L: 6734
					var6 = var3.readInt(); // L: 6735
					var55 = (InterfaceParent)interfaceParents.get((long)var6); // L: 6736
					if (var55 != null) { // L: 6737
						class29.closeInterface(var55, var20 != var55.group);
					}

					Decimator.method1001(var6, var20, var5); // L: 6738
					var1.serverPacket = null; // L: 6739
					return true; // L: 6740
				}

				if (ServerPacket.field3135 == var1.serverPacket) { // L: 6742
					if (Coord.field3318 == null) { // L: 6743
						Coord.field3318 = new class392(Bounds.Ignored_cached);
					}

					class451 var51 = Bounds.Ignored_cached.method7012(var3); // L: 6744
					Coord.field3318.field4429.vmethod7377(var51.field4769, var51.field4768); // L: 6745
					field681[++field682 - 1 & 31] = var51.field4769; // L: 6746
					var1.serverPacket = null; // L: 6747
					return true; // L: 6748
				}

				if (ServerPacket.field3072 == var1.serverPacket) { // L: 6750
					var3.offset += 28; // L: 6751
					if (var3.checkCrc()) { // L: 6752
						class132.method2828(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 6753
					return true; // L: 6754
				}

				if (ServerPacket.field3137 == var1.serverPacket) { // L: 6756
					var20 = var3.readInt(); // L: 6757
					var5 = var3.readUnsignedShort(); // L: 6758
					if (var20 < -70000) { // L: 6759
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 6761
						var22 = HitSplatDefinition.getWidget(var20);
					} else {
						var22 = null; // L: 6762
					}

					for (; var3.offset < var1.serverPacketLength; class137.itemContainerSetItem(var5, var21, var8 - 1, var29)) { // L: 6763 6777
						var21 = var3.readUShortSmart(); // L: 6764
						var8 = var3.readUnsignedShort(); // L: 6765
						var29 = 0; // L: 6766
						if (var8 != 0) { // L: 6767
							var29 = var3.readUnsignedByte(); // L: 6768
							if (var29 == 255) { // L: 6769
								var29 = var3.readInt();
							}
						}

						if (var22 != null && var21 >= 0 && var21 < var22.itemIds.length) { // L: 6771 6772
							var22.itemIds[var21] = var8; // L: 6773
							var22.itemQuantities[var21] = var29; // L: 6774
						}
					}

					if (var22 != null) { // L: 6779
						class125.invalidateWidget(var22);
					}

					class327.method5979(); // L: 6780
					changedItemContainers[++field678 - 1 & 31] = var5 & 32767; // L: 6781
					var1.serverPacket = null; // L: 6782
					return true; // L: 6783
				}

				if (ServerPacket.field3119 == var1.serverPacket) { // L: 6785
					UserComparator8.logOut(); // L: 6786
					var1.serverPacket = null; // L: 6787
					return false; // L: 6788
				}

				if (ServerPacket.field3070 == var1.serverPacket) { // L: 6790
					var20 = var3.readUShortSmart(); // L: 6791
					boolean var59 = var3.readUnsignedByte() == 1; // L: 6792
					var74 = ""; // L: 6793
					boolean var68 = false; // L: 6794
					if (var59) { // L: 6795
						var74 = var3.readStringCp1252NullTerminated(); // L: 6796
						if (class321.friendSystem.isIgnored(new Username(var74, StructComposition.loginType))) { // L: 6797
							var68 = true;
						}
					}

					String var92 = var3.readStringCp1252NullTerminated(); // L: 6799
					if (!var68) { // L: 6800
						VarcInt.addGameMessage(var20, var74, var92);
					}

					var1.serverPacket = null; // L: 6801
					return true; // L: 6802
				}

				if (ServerPacket.field3116 == var1.serverPacket) { // L: 6804
					destinationX = var3.readUnsignedByte(); // L: 6805
					if (destinationX == 255) { // L: 6806
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6807
					if (destinationY == 255) { // L: 6808
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6809
					return true; // L: 6810
				}

				if (ServerPacket.field3047 == var1.serverPacket) { // L: 6812
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) { // L: 6813
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) { // L: 6814
							Varps.Varps_main[var20] = Varps.Varps_temp[var20]; // L: 6815
							class300.changeGameOptions(var20); // L: 6816
							changedVarps[++changedVarpCount - 1 & 31] = var20; // L: 6817
						}
					}

					var1.serverPacket = null; // L: 6820
					return true; // L: 6821
				}

				if (ServerPacket.field3097 == var1.serverPacket) { // L: 6823
					var20 = var3.readInt(); // L: 6824
					if (var20 != field621) { // L: 6825
						field621 = var20; // L: 6826
						Messages.method2451(); // L: 6827
					}

					var1.serverPacket = null; // L: 6829
					return true; // L: 6830
				}

				if (ServerPacket.field3140 == var1.serverPacket) { // L: 6832
					return this.method1464(var1); // L: 6833
				}

				if (ServerPacket.field3148 == var1.serverPacket) { // L: 6835
					var50 = var3.readStringCp1252NullTerminated(); // L: 6836
					var24 = var3.readLong(); // L: 6837
					var26 = (long)var3.readUnsignedShort(); // L: 6838
					var41 = (long)var3.readMedium(); // L: 6839
					PlayerType var91 = (PlayerType)GameEngine.findEnumerated(class220.PlayerType_values(), var3.readUnsignedByte()); // L: 6840
					var43 = var41 + (var26 << 32); // L: 6841
					boolean var14 = false; // L: 6842

					for (var15 = 0; var15 < 100; ++var15) { // L: 6843
						if (var43 == field712[var15]) { // L: 6844
							var14 = true; // L: 6845
							break; // L: 6846
						}
					}

					if (var91.isUser && class321.friendSystem.isIgnored(new Username(var50, StructComposition.loginType))) { // L: 6849 6850
						var14 = true;
					}

					if (!var14 && field601 == 0) { // L: 6852
						field712[field713] = var43; // L: 6853
						field713 = (field713 + 1) % 100; // L: 6854
						var40 = AbstractFont.escapeBrackets(AbstractWorldMapData.method4895(class229.method4813(var3))); // L: 6855
						if (var91.modIcon != -1) { // L: 6856
							class161.addChatMessage(9, SoundSystem.method740(var91.modIcon) + var50, var40, Huffman.base37DecodeLong(var24));
						} else {
							class161.addChatMessage(9, var50, var40, Huffman.base37DecodeLong(var24)); // L: 6857
						}
					}

					var1.serverPacket = null; // L: 6859
					return true; // L: 6860
				}

				if (ServerPacket.field3143 == var1.serverPacket) { // L: 6862
					class267.readReflectionCheck(var3, var1.serverPacketLength); // L: 6863
					var1.serverPacket = null; // L: 6864
					return true; // L: 6865
				}

				if (ServerPacket.field3095 == var1.serverPacket) { // L: 6867
					var50 = var3.readStringCp1252NullTerminated(); // L: 6868
					Object[] var75 = new Object[var50.length() + 1]; // L: 6869

					for (var6 = var50.length() - 1; var6 >= 0; --var6) { // L: 6870
						if (var50.charAt(var6) == 's') { // L: 6871
							var75[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var75[var6 + 1] = new Integer(var3.readInt()); // L: 6872
						}
					}

					var75[0] = new Integer(var3.readInt()); // L: 6874
					ScriptEvent var72 = new ScriptEvent(); // L: 6875
					var72.args = var75; // L: 6876
					SceneTilePaint.runScriptEvent(var72); // L: 6877
					var1.serverPacket = null; // L: 6878
					return true; // L: 6879
				}

				if (ServerPacket.field3099 == var1.serverPacket) { // L: 6881
					Skills.method5659(class263.field3036); // L: 6882
					var1.serverPacket = null; // L: 6883
					return true; // L: 6884
				}

				if (ServerPacket.field3130 == var1.serverPacket) { // L: 6886
					Player.privateChatMode = class299.method5660(var3.readUnsignedByte()); // L: 6887
					var1.serverPacket = null; // L: 6888
					return true; // L: 6889
				}

				if (ServerPacket.field3100 == var1.serverPacket) { // L: 6891
					class137.field1593 = var3.readUnsignedByte(); // L: 6892
					CollisionMap.field2196 = var3.readUnsignedByte(); // L: 6893
					var1.serverPacket = null; // L: 6894
					return true; // L: 6895
				}

				if (ServerPacket.field3142 == var1.serverPacket) { // L: 6897
					class181.loadRegions(false, var1.packetBuffer); // L: 6898
					var1.serverPacket = null; // L: 6899
					return true; // L: 6900
				}

				if (ServerPacket.field3076 == var1.serverPacket) { // L: 6902
					var20 = var3.method7670(); // L: 6903
					var23 = var3.readStringCp1252NullTerminated(); // L: 6904
					var6 = var3.method7708(); // L: 6905
					if (var20 >= 1 && var20 <= 8) { // L: 6906
						if (var23.equalsIgnoreCase("null")) { // L: 6907
							var23 = null;
						}

						playerMenuActions[var20 - 1] = var23; // L: 6908
						playerOptionsPriorities[var20 - 1] = var6 == 0; // L: 6909
					}

					var1.serverPacket = null; // L: 6911
					return true; // L: 6912
				}

				if (ServerPacket.field3067 == var1.serverPacket) { // L: 6914
					Skills.method5659(class263.field3032); // L: 6915
					var1.serverPacket = null; // L: 6916
					return true; // L: 6917
				}

				if (ServerPacket.field3092 == var1.serverPacket) { // L: 6919
					class327.method5979(); // L: 6920
					weight = var3.readShort(); // L: 6921
					field690 = cycleCntr; // L: 6922
					var1.serverPacket = null; // L: 6923
					return true; // L: 6924
				}

				if (ServerPacket.field3150 == var1.serverPacket) { // L: 6926
					var20 = var3.method7690(); // L: 6927
					var5 = var3.readInt(); // L: 6928
					var6 = var3.readUnsignedShort(); // L: 6929
					if (var6 == 65535) { // L: 6930
						var6 = -1;
					}

					var21 = var3.method7677(); // L: 6931
					if (var21 == 65535) { // L: 6932
						var21 = -1;
					}

					for (var8 = var21; var8 <= var6; ++var8) { // L: 6933
						var41 = ((long)var20 << 32) + (long)var8; // L: 6934
						Node var46 = widgetFlags.get(var41); // L: 6935
						if (var46 != null) { // L: 6936
							var46.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var41); // L: 6937
					}

					var1.serverPacket = null; // L: 6939
					return true; // L: 6940
				}

				if (ServerPacket.field3093 == var1.serverPacket) { // L: 6942
					var50 = var3.readStringCp1252NullTerminated(); // L: 6943
					var23 = AbstractFont.escapeBrackets(AbstractWorldMapData.method4895(class229.method4813(var3))); // L: 6944
					VarcInt.addGameMessage(6, var50, var23); // L: 6945
					var1.serverPacket = null; // L: 6946
					return true; // L: 6947
				}

				if (ServerPacket.field3062 == var1.serverPacket) { // L: 6949
					var20 = var3.method7640(); // L: 6954
					var57 = npcs[var20]; // L: 6955
					var5 = var3.method7713(); // L: 6956
					var6 = var3.method7677(); // L: 6957
					if (var57 != null) { // L: 6958
						var57.spotAnimation = var6; // L: 6959
						var57.field1195 = var5 >> 16; // L: 6960
						var57.field1176 = (var5 & 65535) + cycle; // L: 6961
						var57.spotAnimationFrame = 0; // L: 6962
						var57.field1175 = 0; // L: 6963
						if (var57.field1176 > cycle) { // L: 6964
							var57.spotAnimationFrame = -1; // L: 6965
						}

						if (var57.spotAnimation == 65535) { // L: 6967
							var57.spotAnimation = -1; // L: 6968
						}
					}

					var1.serverPacket = null; // L: 6971
					return true; // L: 6972
				}

				if (ServerPacket.field3112 == var1.serverPacket) { // L: 6974
					var29 = var3.method7670(); // L: 6985
					var30 = var29 >> 2; // L: 6986
					var11 = var29 & 3; // L: 6987
					var12 = field548[var30]; // L: 6988
					var6 = var3.method7684(); // L: 6989
					var20 = var6 >> 16; // L: 6990
					var5 = var6 >> 8 & 255; // L: 6991
					var21 = var20 + (var6 >> 4 & 7); // L: 6992
					var8 = var5 + (var6 & 7); // L: 6993
					var13 = var3.method7677(); // L: 6994
					if (var21 >= 0 && var8 >= 0 && var21 < 103 && var8 < 103) { // L: 6995
						if (var12 == 0) { // L: 6996
							WallObject var88 = class12.scene.method4073(class268.Client_plane, var21, var8); // L: 6997
							if (var88 != null) { // L: 6998
								var15 = WorldMapSection2.Entity_unpackID(var88.tag); // L: 6999
								if (var30 == 2) { // L: 7000
									var88.renderable1 = new DynamicObject(var15, 2, var11 + 4, class268.Client_plane, var21, var8, var13, false, var88.renderable1); // L: 7001
									var88.renderable2 = new DynamicObject(var15, 2, var11 + 1 & 3, class268.Client_plane, var21, var8, var13, false, var88.renderable2); // L: 7002
								} else {
									var88.renderable1 = new DynamicObject(var15, var30, var11, class268.Client_plane, var21, var8, var13, false, var88.renderable1); // L: 7004
								}
							}
						} else if (var12 == 1) { // L: 7007
							DecorativeObject var87 = class12.scene.method4113(class268.Client_plane, var21, var8); // L: 7008
							if (var87 != null) { // L: 7009
								var15 = WorldMapSection2.Entity_unpackID(var87.tag); // L: 7010
								if (var30 != 4 && var30 != 5) { // L: 7011
									if (var30 == 6) { // L: 7014
										var87.renderable1 = new DynamicObject(var15, 4, var11 + 4, class268.Client_plane, var21, var8, var13, false, var87.renderable1); // L: 7015
									} else if (var30 == 7) { // L: 7017
										var87.renderable1 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, class268.Client_plane, var21, var8, var13, false, var87.renderable1); // L: 7018
									} else if (var30 == 8) { // L: 7020
										var87.renderable1 = new DynamicObject(var15, 4, var11 + 4, class268.Client_plane, var21, var8, var13, false, var87.renderable1); // L: 7021
										var87.renderable2 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, class268.Client_plane, var21, var8, var13, false, var87.renderable2); // L: 7022
									}
								} else {
									var87.renderable1 = new DynamicObject(var15, 4, var11, class268.Client_plane, var21, var8, var13, false, var87.renderable1); // L: 7012
								}
							}
						} else if (var12 == 2) { // L: 7026
							var39 = class12.scene.getGameObject(class268.Client_plane, var21, var8); // L: 7027
							if (var30 == 11) { // L: 7028
								var30 = 10; // L: 7029
							}

							if (var39 != null) { // L: 7031
								var39.renderable = new DynamicObject(WorldMapSection2.Entity_unpackID(var39.tag), var30, var11, class268.Client_plane, var21, var8, var13, false, var39.renderable); // L: 7032
							}
						} else if (var12 == 3) { // L: 7035
							GroundObject var86 = class12.scene.getGroundObject(class268.Client_plane, var21, var8); // L: 7036
							if (var86 != null) { // L: 7037
								var86.renderable = new DynamicObject(WorldMapSection2.Entity_unpackID(var86.tag), 22, var11, class268.Client_plane, var21, var8, var13, false, var86.renderable); // L: 7038
							}
						}
					}

					var1.serverPacket = null; // L: 7042
					return true; // L: 7043
				}

				if (ServerPacket.field3048 == var1.serverPacket) { // L: 7045
					var70 = var3.readUnsignedByte() == 1; // L: 7046
					if (var70) { // L: 7047
						FontName.field4587 = class181.method3483() - var3.readLong(); // L: 7048
						UserComparator3.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 7049
					} else {
						UserComparator3.grandExchangeEvents = null; // L: 7051
					}

					field689 = cycleCntr; // L: 7052
					var1.serverPacket = null; // L: 7053
					return true; // L: 7054
				}

				if (ServerPacket.field3141 == var1.serverPacket) { // L: 7056
					var20 = var3.readUnsignedShort(); // L: 7057
					if (var20 == 65535) { // L: 7058
						var20 = -1;
					}

					InvDefinition.playSong(var20); // L: 7059
					var1.serverPacket = null; // L: 7060
					return true; // L: 7061
				}

				if (ServerPacket.field3089 == var1.serverPacket) { // L: 7063
					var20 = var3.readUnsignedShort(); // L: 7064
					if (var20 == 65535) { // L: 7065
						var20 = -1;
					}

					var5 = var3.method7685(); // L: 7066
					JagexCache.method3206(var20, var5); // L: 7067
					var1.serverPacket = null; // L: 7068
					return true; // L: 7069
				}

				if (ServerPacket.field3115 == var1.serverPacket) { // L: 7071
					var50 = var3.readStringCp1252NullTerminated(); // L: 7072
					var5 = var3.readInt(); // L: 7073
					var22 = HitSplatDefinition.getWidget(var5); // L: 7074
					if (!var50.equals(var22.text)) { // L: 7075
						var22.text = var50; // L: 7076
						class125.invalidateWidget(var22); // L: 7077
					}

					var1.serverPacket = null; // L: 7079
					return true; // L: 7080
				}

				if (ServerPacket.field3065 == var1.serverPacket) { // L: 7082
					Skills.method5659(class263.field3030); // L: 7083
					var1.serverPacket = null; // L: 7084
					return true; // L: 7085
				}

				if (ServerPacket.field3081 == var1.serverPacket) { // L: 7087
					class327.method5979(); // L: 7088
					var20 = var3.readUnsignedByte(); // L: 7089
					var5 = var3.method7708(); // L: 7090
					var6 = var3.readInt(); // L: 7091
					experience[var5] = var6; // L: 7092
					currentLevels[var5] = var20; // L: 7093
					levels[var5] = 1; // L: 7094

					for (var21 = 0; var21 < 98; ++var21) { // L: 7095
						if (var6 >= Skills.Skills_experienceTable[var21]) {
							levels[var5] = var21 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5; // L: 7096
					var1.serverPacket = null; // L: 7097
					return true; // L: 7098
				}

				if (ServerPacket.field3124 == var1.serverPacket) { // L: 7100
					isCameraLocked = true; // L: 7101
					field518 = false; // L: 7102
					ClanChannel.field1664 = var3.readUnsignedByte() * 16384; // L: 7103
					RouteStrategy.field2198 = var3.readUnsignedByte() * 128; // L: 7104
					Tile.field2309 = var3.readUnsignedShort(); // L: 7105
					class271.field3186 = var3.readUnsignedByte(); // L: 7106
					WorldMapData_1.field2759 = var3.readUnsignedByte(); // L: 7107
					if (WorldMapData_1.field2759 >= 100) { // L: 7108
						class16.cameraX = ClanChannel.field1664 * 128 + 64; // L: 7109
						class269.cameraZ = RouteStrategy.field2198 * 16384 + 64; // L: 7110
						WorldMapLabel.cameraY = ObjectComposition.getTileHeight(class16.cameraX, class269.cameraZ, class268.Client_plane) - Tile.field2309; // L: 7111
					}

					var1.serverPacket = null; // L: 7113
					return true; // L: 7114
				}

				if (ServerPacket.field3068 == var1.serverPacket) { // L: 7116
					class181.loadRegions(true, var1.packetBuffer); // L: 7117
					var1.serverPacket = null; // L: 7118
					return true; // L: 7119
				}

				if (ServerPacket.field3111 == var1.serverPacket) { // L: 7121
					CollisionMap.field2196 = var3.method7786(); // L: 7122
					class137.field1593 = var3.method7786(); // L: 7123

					while (var3.offset < var1.serverPacketLength) { // L: 7124
						var20 = var3.readUnsignedByte(); // L: 7125
						class263 var73 = class67.method1861()[var20]; // L: 7126
						Skills.method5659(var73); // L: 7127
					}

					var1.serverPacket = null; // L: 7129
					return true; // L: 7130
				}

				if (ServerPacket.field3082 == var1.serverPacket) { // L: 7132
					var70 = var3.method7786() == 1; // L: 7133
					var5 = var3.readInt(); // L: 7134
					var22 = HitSplatDefinition.getWidget(var5); // L: 7135
					if (var70 != var22.isHidden) { // L: 7136
						var22.isHidden = var70; // L: 7137
						class125.invalidateWidget(var22); // L: 7138
					}

					var1.serverPacket = null; // L: 7140
					return true; // L: 7141
				}

				if (ServerPacket.field3066 == var1.serverPacket) { // L: 7143
					var20 = var3.readUnsignedByte(); // L: 7144
					class33.forceDisconnect(var20); // L: 7145
					var1.serverPacket = null; // L: 7146
					return false; // L: 7147
				}

				if (ServerPacket.field3139 == var1.serverPacket) { // L: 7149
					VertexNormal.method4415(); // L: 7150
					var67 = var3.readByte(); // L: 7151
					class131 var71 = new class131(var3); // L: 7152
					ClanSettings var66;
					if (var67 >= 0) { // L: 7154
						var66 = currentClanSettings[var67];
					} else {
						var66 = FontName.guestClanSettings; // L: 7155
					}

					var71.method2822(var66); // L: 7156
					var1.serverPacket = null; // L: 7157
					return true; // L: 7158
				}

				if (ServerPacket.field3057 == var1.serverPacket) { // L: 7160
					field687 = cycleCntr; // L: 7161
					var67 = var3.readByte(); // L: 7162
					if (var1.serverPacketLength == 1) { // L: 7163
						if (var67 >= 0) { // L: 7164
							currentClanChannels[var67] = null;
						} else {
							NetCache.guestClanChannel = null; // L: 7165
						}

						var1.serverPacket = null; // L: 7166
						return true; // L: 7167
					}

					if (var67 >= 0) { // L: 7169
						currentClanChannels[var67] = new ClanChannel(var3); // L: 7170
					} else {
						NetCache.guestClanChannel = new ClanChannel(var3); // L: 7173
					}

					var1.serverPacket = null; // L: 7175
					return true; // L: 7176
				}

				if (ServerPacket.field3059 == var1.serverPacket) { // L: 7178
					hintArrowType = var3.readUnsignedByte(); // L: 7179
					if (hintArrowType == 1) { // L: 7180
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 7181
						if (hintArrowType == 2) { // L: 7182
							hintArrowSubX = 4096; // L: 7183
							hintArrowSubY = 4096; // L: 7184
						}

						if (hintArrowType == 3) { // L: 7186
							hintArrowSubX = 0; // L: 7187
							hintArrowSubY = 4096; // L: 7188
						}

						if (hintArrowType == 4) { // L: 7190
							hintArrowSubX = 8192; // L: 7191
							hintArrowSubY = 4096; // L: 7192
						}

						if (hintArrowType == 5) { // L: 7194
							hintArrowSubX = 4096; // L: 7195
							hintArrowSubY = 0; // L: 7196
						}

						if (hintArrowType == 6) { // L: 7198
							hintArrowSubX = 4096; // L: 7199
							hintArrowSubY = 8192; // L: 7200
						}

						hintArrowType = 2; // L: 7202
						hintArrowX = var3.readUnsignedShort(); // L: 7203
						hintArrowY = var3.readUnsignedShort(); // L: 7204
						hintArrowHeight = var3.readUnsignedByte() * 2; // L: 7205
					}

					if (hintArrowType == 10) { // L: 7207
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 7208
					return true; // L: 7209
				}

				if (ServerPacket.field3063 == var1.serverPacket) { // L: 7211
					class309.field3942 = true; // L: 7212
					class126.updateNpcs(true, var3); // L: 7213
					var1.serverPacket = null; // L: 7214
					return true; // L: 7215
				}

				if (ServerPacket.field3074 == var1.serverPacket) { // L: 7217
					var20 = var3.method7711(); // L: 7218
					var5 = var3.readShort(); // L: 7219
					var6 = var3.readInt(); // L: 7220
					var56 = HitSplatDefinition.getWidget(var6); // L: 7221
					if (var20 != var56.rawX || var5 != var56.rawY || var56.xAlignment != 0 || var56.yAlignment != 0) { // L: 7222
						var56.rawX = var20; // L: 7223
						var56.rawY = var5; // L: 7224
						var56.xAlignment = 0; // L: 7225
						var56.yAlignment = 0; // L: 7226
						class125.invalidateWidget(var56); // L: 7227
						this.alignWidget(var56); // L: 7228
						if (var56.type == 0) { // L: 7229
							class181.revalidateWidgetScroll(class358.Widget_interfaceComponents[var6 >> 16], var56, false);
						}
					}

					var1.serverPacket = null; // L: 7231
					return true; // L: 7232
				}

				if (ServerPacket.field3096 == var1.serverPacket) { // L: 7234
					Coord.field3318 = new class392(Bounds.Ignored_cached); // L: 7235
					var1.serverPacket = null; // L: 7236
					return true; // L: 7237
				}

				if (ServerPacket.field3088 == var1.serverPacket) { // L: 7239
					World var49 = new World(); // L: 7240
					var49.host = var3.readStringCp1252NullTerminated(); // L: 7241
					var49.id = var3.readUnsignedShort(); // L: 7242
					var5 = var3.readInt(); // L: 7243
					var49.properties = var5; // L: 7244
					class4.updateGameState(45); // L: 7245
					var2.close(); // L: 7246
					var2 = null; // L: 7247
					WorldMapID.changeWorld(var49); // L: 7248
					var1.serverPacket = null; // L: 7249
					return false; // L: 7250
				}

				if (ServerPacket.field3049 == var1.serverPacket) { // L: 7252
					Skills.method5659(class263.field3027); // L: 7253
					var1.serverPacket = null; // L: 7254
					return true; // L: 7255
				}

				if (ServerPacket.field3151 == var1.serverPacket) { // L: 7257
					var20 = var3.readUnsignedShort(); // L: 7258
					var5 = var3.readUnsignedByte(); // L: 7259
					var6 = var3.readUnsignedShort(); // L: 7260
					class147.queueSoundEffect(var20, var5, var6); // L: 7261
					var1.serverPacket = null; // L: 7262
					return true; // L: 7263
				}

				if (ServerPacket.field3077 == var1.serverPacket) { // L: 7265
					var20 = var3.readInt(); // L: 7266
					var5 = var3.readUnsignedShort(); // L: 7267
					if (var5 == 65535) { // L: 7268
						var5 = -1;
					}

					var6 = var3.method7691(); // L: 7269
					var56 = HitSplatDefinition.getWidget(var6); // L: 7270
					ItemComposition var90;
					if (!var56.isIf3) { // L: 7271
						if (var5 == -1) { // L: 7272
							var56.modelType = 0; // L: 7273
							var1.serverPacket = null; // L: 7274
							return true; // L: 7275
						}

						var90 = AttackOption.ItemComposition_get(var5); // L: 7277
						var56.modelType = 4; // L: 7278
						var56.modelId = var5; // L: 7279
						var56.modelAngleX = var90.xan2d; // L: 7280
						var56.modelAngleY = var90.yan2d; // L: 7281
						var56.modelZoom = var90.zoom2d * 100 / var20; // L: 7282
						class125.invalidateWidget(var56); // L: 7283
					} else {
						var56.itemId = var5; // L: 7286
						var56.itemQuantity = var20; // L: 7287
						var90 = AttackOption.ItemComposition_get(var5); // L: 7288
						var56.modelAngleX = var90.xan2d; // L: 7289
						var56.modelAngleY = var90.yan2d; // L: 7290
						var56.modelAngleZ = var90.zan2d; // L: 7291
						var56.modelOffsetX = var90.offsetX2d; // L: 7292
						var56.modelOffsetY = var90.offsetY2d; // L: 7293
						var56.modelZoom = var90.zoom2d; // L: 7294
						if (var90.isStackable == 1) { // L: 7295
							var56.itemQuantityMode = 1;
						} else {
							var56.itemQuantityMode = 2; // L: 7296
						}

						if (var56.field3413 > 0) { // L: 7297
							var56.modelZoom = var56.modelZoom * 32 / var56.field3413;
						} else if (var56.rawWidth > 0) { // L: 7298
							var56.modelZoom = var56.modelZoom * 32 / var56.rawWidth;
						}

						class125.invalidateWidget(var56); // L: 7299
					}

					var1.serverPacket = null; // L: 7301
					return true; // L: 7302
				}

				if (ServerPacket.field3109 == var1.serverPacket) { // L: 7304
					class321.friendSystem.method1702(); // L: 7305
					field710 = cycleCntr; // L: 7306
					var1.serverPacket = null; // L: 7307
					return true; // L: 7308
				}

				Widget var45;
				if (ServerPacket.field3128 == var1.serverPacket) { // L: 7310
					var20 = var3.method7713(); // L: 7311
					var5 = var3.method7691(); // L: 7312
					InterfaceParent var65 = (InterfaceParent)interfaceParents.get((long)var5); // L: 7313
					var55 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7314
					if (var55 != null) { // L: 7315
						class29.closeInterface(var55, var65 == null || var65.group != var55.group);
					}

					if (var65 != null) { // L: 7316
						var65.remove(); // L: 7317
						interfaceParents.put(var65, (long)var20); // L: 7318
					}

					var45 = HitSplatDefinition.getWidget(var5); // L: 7320
					if (var45 != null) { // L: 7321
						class125.invalidateWidget(var45);
					}

					var45 = HitSplatDefinition.getWidget(var20); // L: 7322
					if (var45 != null) { // L: 7323
						class125.invalidateWidget(var45); // L: 7324
						class181.revalidateWidgetScroll(class358.Widget_interfaceComponents[var45.id >>> 16], var45, true); // L: 7325
					}

					if (rootInterface != -1) { // L: 7327
						ModelData0.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 7328
					return true; // L: 7329
				}

				if (ServerPacket.field3133 == var1.serverPacket) { // L: 7331
					var20 = var3.readUnsignedShort(); // L: 7332
					byte var53 = var3.method7671(); // L: 7333
					Varps.Varps_temp[var20] = var53; // L: 7334
					if (Varps.Varps_main[var20] != var53) { // L: 7335
						Varps.Varps_main[var20] = var53; // L: 7336
					}

					class300.changeGameOptions(var20); // L: 7338
					changedVarps[++changedVarpCount - 1 & 31] = var20; // L: 7339
					var1.serverPacket = null; // L: 7340
					return true; // L: 7341
				}

				if (ServerPacket.field3051 == var1.serverPacket) { // L: 7343
					var20 = var3.readUnsignedShort(); // L: 7344
					var5 = var3.readUnsignedShort(); // L: 7345
					var6 = var3.readInt(); // L: 7346
					var21 = var3.readUnsignedShort(); // L: 7347
					var45 = HitSplatDefinition.getWidget(var6); // L: 7348
					if (var20 != var45.modelAngleX || var5 != var45.modelAngleY || var21 != var45.modelZoom) { // L: 7349
						var45.modelAngleX = var20; // L: 7350
						var45.modelAngleY = var5; // L: 7351
						var45.modelZoom = var21; // L: 7352
						class125.invalidateWidget(var45); // L: 7353
					}

					var1.serverPacket = null; // L: 7355
					return true; // L: 7356
				}

				if (ServerPacket.field3069 == var1.serverPacket) { // L: 7358
					var20 = var3.readUnsignedShort(); // L: 7359
					var5 = var3.method7713(); // L: 7360
					var22 = HitSplatDefinition.getWidget(var5); // L: 7361
					if (var22.modelType != 1 || var20 != var22.modelId) { // L: 7362
						var22.modelType = 1; // L: 7363
						var22.modelId = var20; // L: 7364
						class125.invalidateWidget(var22); // L: 7365
					}

					var1.serverPacket = null; // L: 7367
					return true; // L: 7368
				}

				if (ServerPacket.field3098 == var1.serverPacket) { // L: 7370
					WorldMapElement.method3317(var3.readStringCp1252NullTerminated()); // L: 7371
					var1.serverPacket = null; // L: 7372
					return true; // L: 7373
				}

				if (ServerPacket.field3152 == var1.serverPacket) { // L: 7375
					publicChatMode = var3.method7786(); // L: 7376
					tradeChatMode = var3.method7708(); // L: 7377
					var1.serverPacket = null; // L: 7378
					return true; // L: 7379
				}

				if (ServerPacket.field3054 == var1.serverPacket) { // L: 7381
					var20 = var3.method7691(); // L: 7382
					var69 = HitSplatDefinition.getWidget(var20); // L: 7383
					var69.modelType = 3; // L: 7384
					var69.modelId = ScriptFrame.localPlayer.appearance.getChatHeadId(); // L: 7385
					class125.invalidateWidget(var69); // L: 7386
					var1.serverPacket = null; // L: 7387
					return true; // L: 7388
				}

				if (ServerPacket.field3083 == var1.serverPacket) { // L: 7390
					var6 = var3.method7690(); // L: 7395
					var5 = var3.readUnsignedShort(); // L: 7396
					var20 = var3.method7640(); // L: 7397
					Player var7;
					if (var20 == localPlayerIndex) { // L: 7398
						var7 = ScriptFrame.localPlayer; // L: 7399
					} else {
						var7 = players[var20]; // L: 7402
					}

					if (var7 != null) { // L: 7404
						var7.spotAnimation = var5; // L: 7405
						var7.field1195 = var6 >> 16; // L: 7406
						var7.field1176 = (var6 & 65535) + cycle; // L: 7407
						var7.spotAnimationFrame = 0; // L: 7408
						var7.field1175 = 0; // L: 7409
						if (var7.field1176 > cycle) { // L: 7410
							var7.spotAnimationFrame = -1; // L: 7411
						}

						if (var7.spotAnimation == 65535) { // L: 7413
							var7.spotAnimation = -1; // L: 7414
						}
					}

					var1.serverPacket = null; // L: 7417
					return true; // L: 7418
				}

				class33.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1339 != null ? var1.field1339.id : -1) + "," + (var1.field1330 != null ? var1.field1330.id : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 7420
				UserComparator8.logOut(); // L: 7421
			} catch (IOException var47) { // L: 7423
				Clock.method3264(); // L: 7424
			} catch (Exception var48) {
				var23 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1339 != null ? var1.field1339.id : -1) + "," + (var1.field1330 != null ? var1.field1330.id : -1) + "," + var1.serverPacketLength + "," + (ScriptFrame.localPlayer.pathX[0] + Decimator.baseX * 64) + "," + (ScriptFrame.localPlayer.pathY[0] + class7.baseY * 64) + ","; // L: 7427

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 7428
					var23 = var23 + var3.array[var6] + ",";
				}

				class33.RunException_sendStackTrace(var23, var48); // L: 7429
				UserComparator8.logOut(); // L: 7430
			}

			return true; // L: 7432
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "339746917"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false; // L: 8230

		int var2;
		int var5;
		while (!var1) { // L: 8231
			var1 = true; // L: 8232

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) { // L: 8233
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) { // L: 8234
					String var11 = menuTargets[var2]; // L: 8235
					menuTargets[var2] = menuTargets[var2 + 1]; // L: 8236
					menuTargets[var2 + 1] = var11; // L: 8237
					String var12 = menuActions[var2]; // L: 8238
					menuActions[var2] = menuActions[var2 + 1]; // L: 8239
					menuActions[var2 + 1] = var12; // L: 8240
					var5 = menuOpcodes[var2]; // L: 8241
					menuOpcodes[var2] = menuOpcodes[var2 + 1]; // L: 8242
					menuOpcodes[var2 + 1] = var5; // L: 8243
					var5 = menuArguments1[var2]; // L: 8244
					menuArguments1[var2] = menuArguments1[var2 + 1]; // L: 8245
					menuArguments1[var2 + 1] = var5; // L: 8246
					var5 = menuArguments2[var2]; // L: 8247
					menuArguments2[var2] = menuArguments2[var2 + 1]; // L: 8248
					menuArguments2[var2 + 1] = var5; // L: 8249
					var5 = menuIdentifiers[var2]; // L: 8250
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1]; // L: 8251
					menuIdentifiers[var2 + 1] = var5; // L: 8252
					var5 = field630[var2]; // L: 8253
					field630[var2] = field630[var2 + 1]; // L: 8254
					field630[var2 + 1] = var5; // L: 8255
					boolean var6 = menuShiftClick[var2]; // L: 8256
					menuShiftClick[var2] = menuShiftClick[var2 + 1]; // L: 8257
					menuShiftClick[var2 + 1] = var6; // L: 8258
					var1 = false; // L: 8259
				}
			}
		}

		if (class16.dragInventoryWidget == null) { // L: 8264
			if (clickedWidget == null) { // L: 8265
				int var14;
				label246: {
					int var13 = MouseHandler.MouseHandler_lastButton; // L: 8266
					int var4;
					int var9;
					if (isMenuOpen) { // L: 8267
						int var3;
						if (var13 != 1 && (Bounds.mouseCam || var13 != 4)) { // L: 8268
							var2 = MouseHandler.MouseHandler_x; // L: 8269
							var3 = MouseHandler.MouseHandler_y; // L: 8270
							if (var2 < MilliClock.menuX - 10 || var2 > MilliClock.menuX + class132.menuWidth + 10 || var3 < class1.menuY - 10 || var3 > WorldMapData_0.menuHeight + class1.menuY + 10) { // L: 8271
								isMenuOpen = false; // L: 8272
								class4.method19(MilliClock.menuX, class1.menuY, class132.menuWidth, WorldMapData_0.menuHeight); // L: 8273
							}
						}

						if (var13 == 1 || !Bounds.mouseCam && var13 == 4) { // L: 8276
							var2 = MilliClock.menuX; // L: 8277
							var3 = class1.menuY; // L: 8278
							var4 = class132.menuWidth; // L: 8279
							var5 = MouseHandler.MouseHandler_lastPressedX; // L: 8280
							var14 = MouseHandler.MouseHandler_lastPressedY; // L: 8281
							int var10 = -1; // L: 8282

							for (int var15 = 0; var15 < menuOptionsCount; ++var15) { // L: 8283
								var9 = var3 + (menuOptionsCount - 1 - var15) * 15 + 31; // L: 8284
								if (var5 > var2 && var5 < var4 + var2 && var14 > var9 - 13 && var14 < var9 + 3) { // L: 8285
									var10 = var15;
								}
							}

							if (var10 != -1) { // L: 8287
								ApproximateRouteStrategy.method1065(var10);
							}

							isMenuOpen = false; // L: 8288
							class4.method19(MilliClock.menuX, class1.menuY, class132.menuWidth, WorldMapData_0.menuHeight); // L: 8289
						}
					} else {
						var2 = menuOptionsCount - 1; // L: 8295
						if ((var13 == 1 || !Bounds.mouseCam && var13 == 4) && var2 >= 0) { // L: 8298
							var4 = menuOpcodes[var2]; // L: 8299
							if (var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) { // L: 8300
								var5 = menuArguments1[var2]; // L: 8301
								var14 = menuArguments2[var2]; // L: 8302
								Widget var7 = HitSplatDefinition.getWidget(var14); // L: 8303
								if (class282.method5436(class193.getWidgetFlags(var7))) { // L: 8305
									break label246;
								}

								var9 = class193.getWidgetFlags(var7); // L: 8307
								boolean var8 = (var9 >> 29 & 1) != 0; // L: 8309
								if (var8) { // L: 8311
									break label246;
								}
							}
						}

						if ((var13 == 1 || !Bounds.mouseCam && var13 == 4) && this.shouldLeftClickOpenMenu()) { // L: 8331 8332
							var13 = 2; // L: 8333
						}

						if ((var13 == 1 || !Bounds.mouseCam && var13 == 4) && menuOptionsCount > 0) { // L: 8336
							ApproximateRouteStrategy.method1065(var2); // L: 8337
						}

						if (var13 == 2 && menuOptionsCount > 0) { // L: 8339
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}

					return; // L: 8341
				}

				if (class16.dragInventoryWidget != null && !field702 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 8313 8314
					class352.method6438(draggedWidgetX, draggedWidgetY); // L: 8315
				}

				field702 = false; // L: 8318
				itemDragDuration = 0; // L: 8319
				if (class16.dragInventoryWidget != null) { // L: 8320
					class125.invalidateWidget(class16.dragInventoryWidget);
				}

				class16.dragInventoryWidget = HitSplatDefinition.getWidget(var14); // L: 8321
				dragItemSlotSource = var5; // L: 8322
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 8323
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 8324
				if (var2 >= 0) { // L: 8325
					class142.method2983(var2);
				}

				class125.invalidateWidget(class16.dragInventoryWidget); // L: 8326
			}
		}
	} // L: 8327

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "14"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1; // L: 8346
		return (field623 && menuOptionsCount > 2 || class19.method265(var1)) && !menuShiftClick[var1]; // L: 8349
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1324409229"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		class101.method2515(var1, var2); // L: 8353
		var1 -= viewportOffsetX; // L: 8354
		var2 -= viewportOffsetY; // L: 8355
		class12.scene.menuOpen(class268.Client_plane, var1, var2, false); // L: 8356
		isMenuOpen = true; // L: 8357
	} // L: 8358

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1046679453"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface; // L: 10329
		int var3 = class7.canvasWidth; // L: 10330
		int var4 = DecorativeObject.canvasHeight; // L: 10331
		if (ParamComposition.loadInterface(var2)) { // L: 10333
			Canvas.resizeInterface(class358.Widget_interfaceComponents[var2], -1, var3, var4, var1); // L: 10334
		}

	} // L: 10336

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)V",
		garbageValue = "1453629739"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : HitSplatDefinition.getWidget(var1.parentId); // L: 10339
		int var3;
		int var4;
		if (var2 == null) { // L: 10342
			var3 = class7.canvasWidth; // L: 10343
			var4 = DecorativeObject.canvasHeight; // L: 10344
		} else {
			var3 = var2.width; // L: 10347
			var4 = var2.height; // L: 10348
		}

		Message.alignWidgetSize(var1, var3, var4, false); // L: 10350
		UserComparator7.alignWidgetPosition(var1, var3, var4); // L: 10351
	} // L: 10352

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1140819134"
	)
	final void method1284() {
		class125.invalidateWidget(clickedWidget); // L: 11361
		++NPCComposition.widgetDragDuration; // L: 11362
		if (field494 && field569) { // L: 11363
			int var1 = MouseHandler.MouseHandler_x; // L: 11372
			int var2 = MouseHandler.MouseHandler_y; // L: 11373
			var1 -= widgetClickX; // L: 11374
			var2 -= widgetClickY; // L: 11375
			if (var1 < field760) { // L: 11376
				var1 = field760;
			}

			if (var1 + clickedWidget.width > field760 + clickedWidgetParent.width) { // L: 11377
				var1 = field760 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field669) { // L: 11378
				var2 = field669;
			}

			if (var2 + clickedWidget.height > field669 + clickedWidgetParent.height) { // L: 11379
				var2 = field669 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field671; // L: 11380
			int var4 = var2 - field672; // L: 11381
			int var5 = clickedWidget.dragZoneSize; // L: 11382
			if (NPCComposition.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 11383 11384
				isDraggingWidget = true; // L: 11385
			}

			int var6 = var1 - field760 + clickedWidgetParent.scrollX; // L: 11388
			int var7 = var2 - field669 + clickedWidgetParent.scrollY; // L: 11389
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 11390
				var8 = new ScriptEvent(); // L: 11391
				var8.widget = clickedWidget; // L: 11392
				var8.mouseX = var6; // L: 11393
				var8.mouseY = var7; // L: 11394
				var8.args = clickedWidget.onDrag; // L: 11395
				SceneTilePaint.runScriptEvent(var8); // L: 11396
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 11398
				if (isDraggingWidget) { // L: 11399
					if (clickedWidget.onDragComplete != null) { // L: 11400
						var8 = new ScriptEvent(); // L: 11401
						var8.widget = clickedWidget; // L: 11402
						var8.mouseX = var6; // L: 11403
						var8.mouseY = var7; // L: 11404
						var8.dragTarget = draggedOnWidget; // L: 11405
						var8.args = clickedWidget.onDragComplete; // L: 11406
						SceneTilePaint.runScriptEvent(var8); // L: 11407
					}

					if (draggedOnWidget != null) { // L: 11409
						Widget var9 = clickedWidget; // L: 11411
						int var10 = class134.method2860(class193.getWidgetFlags(var9)); // L: 11413
						Widget var13;
						if (var10 == 0) { // L: 11414
							var13 = null; // L: 11415
						} else {
							int var11 = 0;

							while (true) {
								if (var11 >= var10) {
									var13 = var9; // L: 11425
									break;
								}

								var9 = HitSplatDefinition.getWidget(var9.parentId); // L: 11419
								if (var9 == null) { // L: 11420
									var13 = null; // L: 11421
									break; // L: 11422
								}

								++var11; // L: 11418
							}
						}

						if (var13 != null) { // L: 11427
							PacketBufferNode var12 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3011, packetWriter.isaacCipher); // L: 11429
							var12.packetBuffer.method7673(clickedWidget.id); // L: 11430
							var12.packetBuffer.writeIntME(clickedWidget.childIndex); // L: 11431
							var12.packetBuffer.method7686(draggedOnWidget.id); // L: 11432
							var12.packetBuffer.writeIntME(clickedWidget.itemId); // L: 11433
							var12.packetBuffer.method7675(draggedOnWidget.childIndex); // L: 11434
							var12.packetBuffer.method7647(draggedOnWidget.itemId); // L: 11435
							packetWriter.addNode(var12); // L: 11436
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 11441
					this.openMenu(widgetClickX + field671, field672 + widgetClickY); // L: 11442
				} else if (menuOptionsCount > 0) { // L: 11444
					class352.method6438(widgetClickX + field671, field672 + widgetClickY); // L: 11445
				}

				clickedWidget = null; // L: 11448
			}

		} else {
			if (NPCComposition.widgetDragDuration > 1) { // L: 11364
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 11365
					class352.method6438(field671 + widgetClickX, widgetClickY + field672); // L: 11366
				}

				clickedWidget = null; // L: 11368
			}

		}
	} // L: 11370 11450

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(I)Lqy;",
		garbageValue = "-655340942"
	)
	@Export("username")
	public Username username() {
		return ScriptFrame.localPlayer != null ? ScriptFrame.localPlayer.username : null; // L: 12207
	}

	public final void init() {
		try {
			if (this.checkHost()) { // L: 721
				for (int var1 = 0; var1 <= 28; ++var1) { // L: 722
					String var2 = this.getParameter(Integer.toString(var1)); // L: 723
					if (var2 != null) { // L: 724
						switch(var1) { // L: 725
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 759
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 760
							}
							break;
						case 4:
							if (clientType == -1) { // L: 813
								clientType = Integer.parseInt(var2); // L: 814
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 744
							break; // L: 745
						case 6:
							int var4 = Integer.parseInt(var2); // L: 773
							Language var3;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) { // L: 775
								var3 = Language.Language_valuesOrdered[var4]; // L: 779
							} else {
								var3 = null; // L: 776
							}

							MilliClock.clientLanguage = var3; // L: 781
							break; // L: 782
						case 7:
							Interpreter.field834 = LoginPacket.method5145(Integer.parseInt(var2)); // L: 754
							break; // L: 755
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 738
							}
							break;
						case 9:
							HitSplatDefinition.field2012 = var2; // L: 798
							break; // L: 799
						case 10:
							class20.field111 = (StudioGame)GameEngine.findEnumerated(ClientPacket.method5129(), Integer.parseInt(var2)); // L: 765
							if (class20.field111 == StudioGame.oldscape) { // L: 766
								StructComposition.loginType = LoginType.oldscape;
							} else {
								StructComposition.loginType = LoginType.field4615; // L: 767
							}
							break;
						case 11:
							UserComparator8.field1371 = var2; // L: 808
							break; // L: 809
						case 12:
							worldId = Integer.parseInt(var2); // L: 749
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
							UserComparator1.field4765 = Integer.parseInt(var2); // L: 728
							break; // L: 729
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 820
							break;
						case 17:
							Huffman.field3291 = var2; // L: 733
							break; // L: 734
						case 21:
							field480 = Integer.parseInt(var2); // L: 803
							break; // L: 804
						case 25:
							int var5 = var2.indexOf("."); // L: 786
							if (var5 == -1) { // L: 787
								Integer.parseInt(var2); // L: 788
							} else {
								Integer.parseInt(var2.substring(0, var5)); // L: 791
								Integer.parseInt(var2.substring(var5 + 1)); // L: 792
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false; // L: 827
				isLowDetail = false; // L: 828
				class12.worldHost = this.getCodeBase().getHost(); // L: 830
				String var6 = Interpreter.field834.name; // L: 831
				byte var7 = 0; // L: 832

				try {
					MouseRecorder.method2068("oldschool", var6, var7, 22); // L: 834
				} catch (Exception var8) { // L: 836
					class33.RunException_sendStackTrace((String)null, var8); // L: 837
				}

				AbstractByteArrayCopier.client = this; // L: 839
				RunException.clientType = clientType; // L: 840
				if (field482 == -1) { // L: 841
					field482 = 0; // L: 842
				}

				DevicePcmPlayerProvider.field156 = System.getenv("JX_ACCESS_TOKEN"); // L: 844
				class344.field4150 = System.getenv("JX_REFRESH_TOKEN"); // L: 845
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) { // L: 846
					this.field488 = true; // L: 847
				}

				this.startThread(765, 503, 207, 1); // L: 849
			}
		} catch (RuntimeException var9) {
			throw ItemLayer.newRunException(var9, "client.init(" + ')');
		}
	} // L: 850

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 855
			this.otlTokenRequester = var1; // L: 858
			class116.method2683(10); // L: 859
		}
	} // L: 856 860

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 865
			this.field491 = var1; // L: 868
		}
	} // L: 866 869

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 874
	}

	public long getAccountHash() {
		return this.accountHash; // L: 879
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkn;II)V",
		garbageValue = "2118163112"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3349 == null) { // L: 1031
			throw new RuntimeException(); // L: 1032
		} else {
			if (var0.field3506 == null) { // L: 1034
				var0.field3506 = new int[var0.field3349.length]; // L: 1035
			}

			var0.field3506[var1] = Integer.MAX_VALUE; // L: 1037
		}
	} // L: 1038

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2077923885"
	)
	static final boolean method1576(int var0, int var1) {
		ObjectComposition var2 = FileSystem.getObjectDefinition(var0); // L: 1059
		if (var1 == 11) { // L: 1060
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4; // L: 1061
		}

		return var2.method3580(var1); // L: 1062
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "2"
	)
	static long method1127() {
		return field606; // L: 2858
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "789297529"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2967, packetWriter.isaacCipher); // L: 9282
		var2.packetBuffer.writeIntME(var1); // L: 9283
		var2.packetBuffer.writeInt(var0); // L: 9284
		packetWriter.addNode(var2); // L: 9285
	} // L: 9286
}
