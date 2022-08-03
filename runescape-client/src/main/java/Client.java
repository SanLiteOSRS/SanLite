import com.jagex.oldscape.pub.OtlTokenRequester;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
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
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "[Lez;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("sw")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("vh")
	@ObfuscatedGetter(
		intValue = 310105341
	)
	public static int field773;
	@ObfuscatedName("uw")
	@ObfuscatedGetter(
		intValue = 1093086377
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		intValue = -32672707
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("vs")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	static final ApproximateRouteStrategy field777;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = 285575435
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = -836761901
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("vg")
	static int[] field778;
	@ObfuscatedName("vw")
	static int[] field779;
	@ObfuscatedName("sa")
	@ObfuscatedGetter(
		intValue = -1930673701
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("vb")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("vn")
	@ObfuscatedGetter(
		intValue = -989946301
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("uf")
	@ObfuscatedGetter(
		intValue = 1080233945
	)
	static int field765;
	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = -1882507051
	)
	static int field627;
	@ObfuscatedName("sd")
	@ObfuscatedGetter(
		intValue = 1897653291
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("sg")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("rq")
	@ObfuscatedSignature(
		descriptor = "[Ley;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("sq")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("rk")
	static long[] field669;
	@ObfuscatedName("sx")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("rh")
	@ObfuscatedGetter(
		intValue = -140035135
	)
	static int field605;
	@ObfuscatedName("sn")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("ty")
	static boolean[] field678;
	@ObfuscatedName("sb")
	@ObfuscatedGetter(
		intValue = -1085635401
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "[Lac;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("so")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("uj")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("ud")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("ra")
	@ObfuscatedGetter(
		intValue = -340081923
	)
	static int field518;
	@ObfuscatedName("ta")
	static short field644;
	@ObfuscatedName("tg")
	static short field695;
	@ObfuscatedName("uy")
	static short field757;
	@ObfuscatedName("ub")
	static short field567;
	@ObfuscatedName("uk")
	static short field756;
	@ObfuscatedName("uu")
	@ObfuscatedGetter(
		intValue = -207740787
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("tb")
	static short field677;
	@ObfuscatedName("uq")
	@ObfuscatedGetter(
		intValue = 1908225021
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = -267205637
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("us")
	@ObfuscatedSignature(
		descriptor = "[Llh;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("rd")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("rx")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("tc")
	static boolean field745;
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		longValue = -3598197458423428557L
	)
	static long field725;
	@ObfuscatedName("rz")
	@ObfuscatedSignature(
		descriptor = "[Lqj;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = 1106565235
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vx")
	@ObfuscatedGetter(
		intValue = 680304633
	)
	static int field630;
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = 1156791999
	)
	static int field722;
	@ObfuscatedName("tk")
	static int[] field654;
	@ObfuscatedName("tv")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("td")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("rp")
	static int[] field724;
	@ObfuscatedName("ro")
	static int[] field626;
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		intValue = 16815395
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = -411679803
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("to")
	static int[] field747;
	@ObfuscatedName("tw")
	static int[] field749;
	@ObfuscatedName("te")
	static int[] field653;
	@ObfuscatedName("rm")
	static String field719;
	@ObfuscatedName("ul")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("up")
	@ObfuscatedGetter(
		intValue = 848328459
	)
	static int field772;
	@ObfuscatedName("rf")
	static int[] field555;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lgr;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("az")
	static boolean field510;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -407247497
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1534154533
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 219384257
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bf")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bu")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1288240551
	)
	static int field504;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -389910515
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 853577439
	)
	static int field489;
	@ObfuscatedName("bx")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -170822283
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cf")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 95361837
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		longValue = 8116000310809479845L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1220062861
	)
	static int field548;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 2140270859
	)
	static int field497;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		longValue = 4071531815298312627L
	)
	static long field723;
	@ObfuscatedName("da")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1803255089
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -1045183031
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 524187045
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -292720363
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -155030709
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -2117523373
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 696020958
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 91830208
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 1085778691
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -1534163991
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = -2136359077
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		intValue = 1272298597
	)
	static int field513;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = -1011736325
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = -589095715
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("fm")
	@ObfuscatedGetter(
		intValue = -1981022037
	)
	static int field516;
	@ObfuscatedName("ft")
	@ObfuscatedGetter(
		intValue = 794782465
	)
	static int field766;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = -352394441
	)
	static int field711;
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	static class124 field645;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	static class447 field741;
	@ObfuscatedName("fc")
	static final String field530;
	@ObfuscatedName("gs")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("gh")
	static int[] field618;
	@ObfuscatedName("gw")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "[Lco;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 474545801
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("gj")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = -1416829447
	)
	static int field541;
	@ObfuscatedName("go")
	static int[] field729;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "Lcx;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = 1467768851
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("hk")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("hs")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		intValue = -1945642975
	)
	static int field613;
	@ObfuscatedName("hw")
	@ObfuscatedGetter(
		intValue = -1806455793
	)
	static int field774;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = 1608610259
	)
	static int field609;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = -1666612595
	)
	static int field551;
	@ObfuscatedName("hc")
	@ObfuscatedGetter(
		intValue = 749368111
	)
	static int field552;
	@ObfuscatedName("ik")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("ic")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("iy")
	static final int[] field556;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 798180175
	)
	static int field744;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = -553978885
	)
	static int field557;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = -1569810719
	)
	static int field559;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = -1876170783
	)
	static int field560;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = -298710163
	)
	static int field561;
	@ObfuscatedName("is")
	static boolean field562;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = -1693889789
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = 1755328015
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 1649127917
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = 1012965049
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 1920648657
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = 1738160867
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = 1943640979
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 415079439
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = 1716463733
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = 779601763
	)
	static int field572;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = -1989360651
	)
	static int field573;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = -2127582263
	)
	static int field574;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 1796939455
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = -28845409
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = -277345349
	)
	public static int field698;
	@ObfuscatedName("kt")
	static boolean field701;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = 2022200065
	)
	static int field748;
	@ObfuscatedName("kk")
	static boolean field481;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = -883679839
	)
	static int field581;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = 600800367
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 1156341529
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("ko")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("kh")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ku")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("kv")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("kg")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("ke")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("kb")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("ki")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("ky")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = -1656822849
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -1136176017
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("kf")
	@ObfuscatedGetter(
		intValue = -1276821173
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = -490986245
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = 1281000605
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = 331250692
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = 1844515145
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("kn")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -2103051577
	)
	static int field601;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 1466281877
	)
	static int field602;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = -864631493
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = 401775147
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = -1637344529
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = -449617919
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("lw")
	static boolean field607;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = 727707903
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = -170867955
	)
	static int field542;
	@ObfuscatedName("lg")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "[Lcz;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -698126847
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = 429923903
	)
	static int field770;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		longValue = 6039396914381301651L
	)
	static long field614;
	@ObfuscatedName("lj")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = 1659264153
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = 1596863855
	)
	static int field617;
	@ObfuscatedName("ly")
	static int[] field636;
	@ObfuscatedName("me")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("mk")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("mw")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("mi")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = 627828331
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "[[[Llt;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("mh")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("mx")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("ma")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("mu")
	static boolean field604;
	@ObfuscatedName("mb")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = 2126838789
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("mr")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("md")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("ms")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("mq")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("mz")
	static int[] field638;
	@ObfuscatedName("nv")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("nc")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("na")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("nw")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("nf")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("nt")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("nd")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = -953960509
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("ns")
	@ObfuscatedGetter(
		intValue = -384320635
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = 65288631
	)
	static int field535;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = 1508890005
	)
	static int field631;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = 310567771
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ng")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(
		intValue = -1475596071
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = 220084033
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("ny")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("no")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = 947439613
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = 822823191
	)
	static int field603;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = -2145540861
	)
	static int field660;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = -1517821033
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = 819784613
	)
	static int field662;
	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = 385904047
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = -619724883
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = 1641091231
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 292886159
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("oq")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = -332678017
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = 1464673091
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("or")
	static boolean field675;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = 900070009
	)
	static int field676;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = -92914957
	)
	static int field751;
	@ObfuscatedName("oh")
	static boolean field549;
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = -1086723837
	)
	static int field679;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = 1433960217
	)
	static int field680;
	@ObfuscatedName("pb")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = -360905729
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pw")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = -990729913
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("pm")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = 1732973057
	)
	static int field686;
	@ObfuscatedName("po")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = 1771249731
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("pt")
	static int[] field689;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = 655105537
	)
	static int field690;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = -1498563941
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -2107057685
	)
	static int field750;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = -991201885
	)
	static int field612;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = -960757625
	)
	static int field694;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = 1065606213
	)
	static int field755;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = -1040139219
	)
	static int field696;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = -1088558955
	)
	static int field697;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = -1128989727
	)
	static int field726;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = 157166571
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	static NodeDeque field758;
	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	static NodeDeque field702;
	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = -2077862919
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = 1217307177
	)
	static int field705;
	@ObfuscatedName("qr")
	static boolean[] field610;
	@ObfuscatedName("qe")
	static boolean[] field691;
	@ObfuscatedName("ql")
	static boolean[] field550;
	@ObfuscatedName("qj")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("qv")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("qg")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("qx")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = -2019619931
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		longValue = -3271561353902982121L
	)
	static long field714;
	@ObfuscatedName("qa")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("fj")
	String field521;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Lp;"
	)
	class14 field522;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	class19 field523;
	@ObfuscatedName("fa")
	@Export("otlTokenRequester")
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("fq")
	Future field525;
	@ObfuscatedName("fx")
	boolean field526;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	class19 field527;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field528;
	@ObfuscatedName("fh")
	@Export("otlTokenRequest")
	Future otlTokenRequest;
	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	Buffer field534;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "Lj;"
	)
	class7 field519;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		longValue = 7558368042315501297L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field510 = true; // L: 148
		worldId = 1; // L: 149
		worldProperties = 0; // L: 150
		gameBuild = 0; // L: 152
		isMembersWorld = false; // L: 155
		isLowDetail = false; // L: 156
		field504 = -1; // L: 161
		clientType = -1; // L: 162
		field489 = -1; // L: 163
		onMobile = false; // L: 164
		gameState = 0; // L: 176
		isLoading = true; // L: 200
		cycle = 0; // L: 201
		mouseLastLastPressedTimeMillis = 1L; // L: 202
		field548 = -1; // L: 204
		field497 = -1; // L: 205
		field723 = -1L; // L: 206
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
		field513 = 0; // L: 228
		js5Errors = 0;
		loginState = 0;
		field516 = 0; // L: 254
		field766 = 0;
		field711 = 0;
		field645 = class124.field1516; // L: 257
		field741 = class447.field4766; // L: 258
		byte[] var1 = MusicPatchPcmStream.method5470("com_jagex_auth_desktop_osrs:public"); // L: 282
		String var0 = Frames.method4310(var1, 0, var1.length); // L: 284
		field530 = var0; // L: 286
		Login_isUsernameRemembered = false; // L: 295
		secureRandomFuture = new SecureRandomFuture(); // L: 296
		randomDatData = null; // L: 302
		npcs = new NPC[32768]; // L: 306
		npcCount = 0; // L: 307
		npcIndices = new int[32768]; // L: 308
		field541 = 0; // L: 309
		field729 = new int[250]; // L: 310
		packetWriter = new PacketWriter(); // L: 313
		logoutTimer = 0; // L: 315
		hadNetworkError = false; // L: 316
		timer = new Timer(); // L: 317
		fontsMap = new HashMap(); // L: 323
		field613 = 0; // L: 330
		field774 = 1; // L: 331
		field609 = 0; // L: 332
		field551 = 1; // L: 333
		field552 = 0; // L: 334
		collisionMaps = new CollisionMap[4]; // L: 342
		isInInstance = false; // L: 343
		instanceChunkTemplates = new int[4][13][13]; // L: 344
		field556 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 345
		field744 = 0; // L: 348
		field557 = 2301979; // L: 360
		field559 = 5063219; // L: 361
		field560 = 3353893; // L: 362
		field561 = 7759444; // L: 363
		field562 = false; // L: 364
		alternativeScrollbarWidth = 0; // L: 365
		camAngleX = 128; // L: 373
		camAngleY = 0; // L: 374
		camAngleDY = 0; // L: 375
		camAngleDX = 0; // L: 376
		mouseCamClickedX = 0; // L: 377
		mouseCamClickedY = 0; // L: 378
		oculusOrbState = 0; // L: 379
		camFollowHeight = 50; // L: 380
		field572 = 0; // L: 384
		field573 = 0; // L: 385
		field574 = 0; // L: 386
		oculusOrbNormalSpeed = 12; // L: 388
		oculusOrbSlowedSpeed = 6; // L: 389
		field698 = 0; // L: 390
		field701 = false; // L: 391
		field748 = 0; // L: 392
		field481 = false; // L: 393
		field581 = 0; // L: 394
		overheadTextCount = 0; // L: 395
		overheadTextLimit = 50; // L: 396
		overheadTextXs = new int[overheadTextLimit]; // L: 397
		overheadTextYs = new int[overheadTextLimit]; // L: 398
		overheadTextAscents = new int[overheadTextLimit]; // L: 399
		overheadTextXOffsets = new int[overheadTextLimit]; // L: 400
		overheadTextColors = new int[overheadTextLimit]; // L: 401
		overheadTextEffects = new int[overheadTextLimit]; // L: 402
		overheadTextCyclesRemaining = new int[overheadTextLimit]; // L: 403
		overheadText = new String[overheadTextLimit]; // L: 404
		tileLastDrawnActor = new int[104][104]; // L: 405
		viewportDrawCount = 0; // L: 406
		viewportTempX = -1; // L: 407
		viewportTempY = -1; // L: 408
		mouseCrossX = 0; // L: 409
		mouseCrossY = 0; // L: 410
		mouseCrossState = 0; // L: 411
		mouseCrossColor = 0; // L: 412
		showMouseCross = true; // L: 413
		field601 = 0; // L: 415
		field602 = 0; // L: 416
		dragItemSlotSource = 0; // L: 419
		draggedWidgetX = 0; // L: 420
		draggedWidgetY = 0; // L: 421
		dragItemSlotDestination = 0; // L: 422
		field607 = false; // L: 423
		itemDragDuration = 0; // L: 424
		field542 = 0; // L: 425
		showLoadingMessages = true; // L: 427
		players = new Player[2048]; // L: 429
		localPlayerIndex = -1; // L: 431
		field770 = 0; // L: 432
		field614 = -1L; // L: 433
		renderSelf = true; // L: 435
		drawPlayerNames = 0; // L: 440
		field617 = 0; // L: 441
		field636 = new int[1000]; // L: 442
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 444
		playerMenuActions = new String[8]; // L: 445
		playerOptionsPriorities = new boolean[8]; // L: 446
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 447
		combatTargetPlayerIndex = -1; // L: 448
		groundItems = new NodeDeque[4][104][104]; // L: 449
		pendingSpawns = new NodeDeque(); // L: 450
		projectiles = new NodeDeque(); // L: 451
		graphicsObjects = new NodeDeque(); // L: 452
		currentLevels = new int[25]; // L: 453
		levels = new int[25]; // L: 454
		experience = new int[25]; // L: 455
		field604 = false; // L: 456
		isMenuOpen = false; // L: 457
		menuOptionsCount = 0; // L: 463
		menuArguments1 = new int[500]; // L: 464
		menuArguments2 = new int[500]; // L: 465
		menuOpcodes = new int[500]; // L: 466
		menuIdentifiers = new int[500]; // L: 467
		field638 = new int[500]; // L: 468
		menuActions = new String[500]; // L: 469
		menuTargets = new String[500]; // L: 470
		menuShiftClick = new boolean[500]; // L: 471
		followerOpsLowPriority = false; // L: 472
		shiftClickDrop = false; // L: 474
		tapToDrop = false; // L: 475
		showMouseOverText = true; // L: 476
		viewportX = -1; // L: 477
		viewportY = -1; // L: 478
		field535 = 0; // L: 482
		field631 = 50; // L: 483
		isItemSelected = 0; // L: 484
		selectedItemName = null; // L: 488
		isSpellSelected = false; // L: 489
		selectedSpellChildIndex = -1; // L: 491
		selectedSpellItemId = -1; // L: 492
		selectedSpellActionName = null; // L: 494
		selectedSpellName = null; // L: 495
		rootInterface = -1; // L: 496
		interfaceParents = new NodeHashTable(8); // L: 497
		field603 = 0; // L: 502
		field660 = -1; // L: 503
		chatEffects = 0; // L: 504
		field662 = 0; // L: 505
		meslayerContinueWidget = null; // L: 506
		runEnergy = 0; // L: 507
		weight = 0; // L: 508
		staffModLevel = 0; // L: 509
		followerIndex = -1; // L: 510
		playerMod = false; // L: 511
		viewportWidget = null; // L: 512
		clickedWidget = null; // L: 513
		clickedWidgetParent = null; // L: 514
		widgetClickX = 0; // L: 515
		widgetClickY = 0; // L: 516
		draggedOnWidget = null; // L: 517
		field675 = false; // L: 518
		field676 = -1; // L: 519
		field751 = -1; // L: 520
		field549 = false; // L: 521
		field679 = -1; // L: 522
		field680 = -1; // L: 523
		isDraggingWidget = false; // L: 524
		cycleCntr = 1; // L: 529
		changedVarps = new int[32]; // L: 532
		changedVarpCount = 0; // L: 533
		changedItemContainers = new int[32]; // L: 534
		field686 = 0; // L: 535
		changedSkills = new int[32]; // L: 536
		changedSkillsCount = 0; // L: 537
		field689 = new int[32]; // L: 538
		field690 = 0; // L: 539
		chatCycle = 0; // L: 540
		field750 = 0; // L: 541
		field612 = 0; // L: 542
		field694 = 0; // L: 543
		field755 = 0; // L: 544
		field696 = 0; // L: 545
		field697 = 0; // L: 546
		field726 = 0; // L: 547
		mouseWheelRotation = 0; // L: 553
		scriptEvents = new NodeDeque(); // L: 554
		field758 = new NodeDeque(); // L: 555
		field702 = new NodeDeque(); // L: 556
		widgetFlags = new NodeHashTable(512); // L: 557
		rootWidgetCount = 0; // L: 559
		field705 = -2; // L: 560
		field610 = new boolean[100]; // L: 561
		field691 = new boolean[100]; // L: 562
		field550 = new boolean[100]; // L: 563
		rootWidgetXs = new int[100]; // L: 564
		rootWidgetYs = new int[100]; // L: 565
		rootWidgetWidths = new int[100]; // L: 566
		rootWidgetHeights = new int[100]; // L: 567
		gameDrawingMode = 0; // L: 568
		field714 = 0L; // L: 569
		isResizable = true; // L: 570
		field555 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 577
		publicChatMode = 0; // L: 578
		tradeChatMode = 0; // L: 580
		field719 = ""; // L: 581
		field669 = new long[100]; // L: 583
		field605 = 0; // L: 584
		field722 = 0; // L: 586
		field626 = new int[128]; // L: 587
		field724 = new int[128]; // L: 588
		field725 = -1L; // L: 589
		currentClanSettings = new ClanSettings[4]; // L: 593
		currentClanChannels = new ClanChannel[4]; // L: 595
		field518 = -1; // L: 597
		mapIconCount = 0; // L: 598
		mapIconXs = new int[1000]; // L: 599
		mapIconYs = new int[1000]; // L: 600
		mapIcons = new SpritePixels[1000]; // L: 601
		destinationX = 0; // L: 602
		destinationY = 0; // L: 603
		minimapState = 0; // L: 610
		currentTrackGroupId = -1; // L: 611
		playingJingle = false; // L: 612
		soundEffectCount = 0; // L: 618
		soundEffectIds = new int[50]; // L: 619
		queuedSoundEffectLoops = new int[50]; // L: 620
		queuedSoundEffectDelays = new int[50]; // L: 621
		soundLocations = new int[50]; // L: 622
		soundEffects = new SoundEffect[50]; // L: 623
		isCameraLocked = false; // L: 625
		field745 = false; // L: 636
		field678 = new boolean[5]; // L: 644
		field747 = new int[5]; // L: 645
		field654 = new int[5]; // L: 646
		field749 = new int[5]; // L: 647
		field653 = new int[5]; // L: 648
		field644 = 256; // L: 649
		field695 = 205; // L: 650
		zoomHeight = 256; // L: 651
		zoomWidth = 320; // L: 652
		field677 = 1; // L: 653
		field756 = 32767; // L: 654
		field757 = 1; // L: 655
		field567 = 32767; // L: 656
		viewportOffsetX = 0; // L: 657
		viewportOffsetY = 0; // L: 658
		viewportWidth = 0; // L: 659
		viewportHeight = 0; // L: 660
		viewportZoom = 0; // L: 661
		playerAppearance = new PlayerComposition(); // L: 663
		field765 = -1; // L: 664
		field627 = -1; // L: 665
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 667
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 669
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 672
		Widget_cachedModels = new EvictingDualNodeHashTable(64); // L: 674
		Widget_cachedFonts = new EvictingDualNodeHashTable(64); // L: 675
		field772 = -1; // L: 678
		field773 = -1; // L: 684
		archiveLoaders = new ArrayList(10); // L: 685
		archiveLoadersDone = 0; // L: 686
		field630 = 0; // L: 687
		field777 = new ApproximateRouteStrategy(); // L: 696
		field778 = new int[50]; // L: 697
		field779 = new int[50]; // L: 698
	}

	public Client() {
		this.field526 = false; // L: 274
		this.accountHash = -1L;
	} // L: 301

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field714 = class131.method2916() + 500L; // L: 4478
		this.resizeJS(); // L: 4479
		if (rootInterface != -1) { // L: 4480
			this.resizeRoot(true);
		}

	} // L: 4481

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-8"
	)
	@Export("setUp")
	protected final void setUp() {
		class120.method2823(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}); // L: 1004
		class18.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 1005
		class438.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 1006
		class117.currentPort = class18.worldPort; // L: 1007
		WorldMapEvent.field2881 = class293.field3345; // L: 1008
		DynamicObject.field986 = class293.field3343; // L: 1009
		AbstractWorldMapIcon.field2859 = class293.field3344; // L: 1010
		PlayerComposition.field3339 = class293.field3346; // L: 1011
		class152.urlRequester = new class101(this.field526, 207); // L: 1012
		this.setUpKeyboard(); // L: 1013
		this.method420(); // L: 1014
		class16.mouseWheel = this.mouseWheel(); // L: 1015
		EnumComposition.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1016
		class260.clientPreferences = class7.method57(); // L: 1017
		this.setUpClipboard(); // L: 1018
		class119.method2814(this, ScriptEvent.field1045); // L: 1019
		class67.setWindowedMode(class260.clientPreferences.method2387()); // L: 1020
		MusicPatchPcmStream.friendSystem = new FriendSystem(class162.loginType); // L: 1021
		this.field522 = new class14("tokenRequest", 1, 1); // L: 1022
	} // L: 1023

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-787882687"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 1027
		this.doCycleJs5(); // L: 1028
		ClientPacket.method5191(); // L: 1029
		CollisionMap.method3888(); // L: 1030
		class12.playPcmPlayers(); // L: 1031
		ModeWhere.method6093(); // L: 1032
		synchronized(MouseHandler.MouseHandler_instance) { // L: 1034
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 1035
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 1036
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 1037
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 1038
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 1039
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 1040
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 1041
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 1042
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 1043
		} // L: 1044

		if (class16.mouseWheel != null) { // L: 1046
			int var3 = class16.mouseWheel.useRotation(); // L: 1047
			mouseWheelRotation = var3; // L: 1048
		}

		if (gameState == 0) { // L: 1050
			HitSplatDefinition.load(); // L: 1051
			FriendSystem.method1769(); // L: 1052
		} else if (gameState == 5) { // L: 1054
			class123.loginScreen(this, class149.fontPlain12); // L: 1055
			HitSplatDefinition.load(); // L: 1056
			FriendSystem.method1769(); // L: 1057
		} else if (gameState != 10 && gameState != 11) { // L: 1059
			if (gameState == 20) { // L: 1060
				class123.loginScreen(this, class149.fontPlain12); // L: 1061
				this.doCycleLoggedOut(); // L: 1062
			} else if (gameState == 50) { // L: 1064
				class123.loginScreen(this, class149.fontPlain12); // L: 1065
				this.doCycleLoggedOut(); // L: 1066
			} else if (gameState == 25) { // L: 1068
				GrandExchangeOffer.method6027();
			}
		} else {
			class123.loginScreen(this, class149.fontPlain12);
		}

		if (gameState == 30) { // L: 1069
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) { // L: 1070
			this.doCycleLoggedOut();
		}

	} // L: 1071

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-66"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label168: {
			try {
				if (class273.musicPlayerStatus == 2) { // L: 1078
					if (InterfaceParent.musicTrack == null) { // L: 1079
						InterfaceParent.musicTrack = MusicTrack.readTrack(class149.musicTrackArchive, class273.musicTrackGroupId, UserComparator6.musicTrackFileId); // L: 1080
						if (InterfaceParent.musicTrack == null) { // L: 1081
							var2 = false; // L: 1082
							break label168;
						}
					}

					if (class358.soundCache == null) { // L: 1086
						class358.soundCache = new SoundCache(class329.soundEffectsArchive, class273.musicSamplesArchive);
					}

					if (class273.midiPcmStream.loadMusicTrack(InterfaceParent.musicTrack, class273.musicPatchesArchive, class358.soundCache, 22050)) { // L: 1087
						class273.midiPcmStream.clearAll(); // L: 1088
						class273.midiPcmStream.setPcmStreamVolume(class273.musicTrackVolume); // L: 1089
						class273.midiPcmStream.setMusicTrack(InterfaceParent.musicTrack, class347.musicTrackBoolean); // L: 1090
						class273.musicPlayerStatus = 0; // L: 1091
						InterfaceParent.musicTrack = null; // L: 1092
						class358.soundCache = null; // L: 1093
						class149.musicTrackArchive = null; // L: 1094
						var2 = true; // L: 1095
						break label168;
					}
				}
			} catch (Exception var6) { // L: 1100
				var6.printStackTrace(); // L: 1101
				class273.midiPcmStream.clear(); // L: 1102
				class273.musicPlayerStatus = 0; // L: 1103
				InterfaceParent.musicTrack = null; // L: 1104
				class358.soundCache = null; // L: 1105
				class149.musicTrackArchive = null; // L: 1106
			}

			var2 = false; // L: 1108
		}

		if (var2 && playingJingle && class192.pcmPlayer0 != null) { // L: 1111 1112
			class192.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field714 && class131.method2916() > field714) { // L: 1114 1115
			class67.setWindowedMode(MouseRecorder.getWindowedMode()); // L: 1116
		}

		int var4;
		if (var1) { // L: 1119
			for (var4 = 0; var4 < 100; ++var4) { // L: 1120
				field610[var4] = true;
			}
		}

		if (gameState == 0) { // L: 1122
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1123
			ServerPacket.drawTitle(class116.fontBold12, class116.fontPlain11, class149.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1124
			if (gameState == 20) { // L: 1125
				ServerPacket.drawTitle(class116.fontBold12, class116.fontPlain11, class149.fontPlain12);
			} else if (gameState == 50) { // L: 1126
				ServerPacket.drawTitle(class116.fontBold12, class116.fontPlain11, class149.fontPlain12);
			} else if (gameState == 25) { // L: 1127
				if (field552 == 1) { // L: 1128
					if (field613 > field774) { // L: 1129
						field774 = field613;
					}

					var4 = (field774 * 50 - field613 * 50) / field774; // L: 1130
					class273.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1131
				} else if (field552 == 2) { // L: 1133
					if (field609 > field551) { // L: 1134
						field551 = field609;
					}

					var4 = (field551 * 50 - field609 * 50) / field551 + 50; // L: 1135
					class273.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1136
				} else {
					class273.drawLoadingMessage("Loading - please wait.", false); // L: 1138
				}
			} else if (gameState == 30) { // L: 1140
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1141
				class273.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1142
				class273.drawLoadingMessage("Please wait...", false);
			}
		} else {
			ServerPacket.drawTitle(class116.fontBold12, class116.fontPlain11, class149.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1143
			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1144
				if (field691[var4]) { // L: 1145
					class268.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]); // L: 1146
					field691[var4] = false; // L: 1147
				}
			}
		} else if (gameState > 0) { // L: 1151
			class268.rasterProvider.drawFull(0, 0); // L: 1152

			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1153
				field691[var4] = false;
			}
		}

	} // L: 1155

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "453908152"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class151.varcs.hasUnwrittenChanges()) { // L: 1158
			class151.varcs.write();
		}

		if (class309.mouseRecorder != null) { // L: 1159
			class309.mouseRecorder.isRunning = false;
		}

		class309.mouseRecorder = null; // L: 1160
		packetWriter.close(); // L: 1161
		class346.method6353(); // L: 1162
		if (MouseHandler.MouseHandler_instance != null) { // L: 1164
			synchronized(MouseHandler.MouseHandler_instance) { // L: 1165
				MouseHandler.MouseHandler_instance = null; // L: 1166
			} // L: 1167
		}

		class16.mouseWheel = null; // L: 1170
		if (class192.pcmPlayer0 != null) { // L: 1171
			class192.pcmPlayer0.shutdown();
		}

		if (SequenceDefinition.pcmPlayer1 != null) { // L: 1172
			SequenceDefinition.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) { // L: 1174
			NetCache.NetCache_socket.close();
		}

		class33.method609(); // L: 1176
		if (class152.urlRequester != null) { // L: 1177
			class152.urlRequester.close(); // L: 1178
			class152.urlRequester = null; // L: 1179
		}

		class268.method5210(); // L: 1181
		this.field522.method184(); // L: 1182
	} // L: 1183

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-395659383"
	)
	protected final void vmethod1109() {
	} // L: 705

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1249169550"
	)
	boolean method1112() {
		return class344.field4179 != null && !class344.field4179.trim().isEmpty(); // L: 949
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-102"
	)
	@Export("isOtlTokenRequesterInitialized")
	boolean isOtlTokenRequesterInitialized() {
		return this.otlTokenRequester != null; // L: 953
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "968949768"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 957
		var2.put("grant_type", "refresh_token"); // L: 958
		var2.put("scope", "gamesso.token.create"); // L: 959
		var2.put("refresh_token", var1); // L: 960
		URL var3 = new URL(class65.field874 + "shield/oauth/token" + (new class401(var2)).method7141()); // L: 961
		HashMap var4 = new HashMap(); // L: 962
		var4.put("Authorization", "Basic " + field530); // L: 963
		var4.put("Host", (new URL(class65.field874)).getHost()); // L: 964
		var4.put("Accept", class398.field4447.method7126()); // L: 965
		class9 var5 = class9.field43; // L: 966
		RefreshAccessTokenRequester var6 = this.field528; // L: 967
		if (var6 != null) { // L: 968
			this.otlTokenRequest = var6.request(var5.method79(), var3, var4, ""); // L: 969
		} else {
			class10 var7 = new class10(var3, var5, this.field526); // L: 972
			Iterator var8 = var4.entrySet().iterator(); // L: 973

			while (var8.hasNext()) {
				Entry var9 = (Entry)var8.next(); // L: 974
				var7.method84((String)var9.getKey(), (String)var9.getValue()); // L: 976
			}

			this.field527 = this.field522.method177(var7); // L: 979
		}
	} // L: 970 980

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-90825894"
	)
	void method1115(String var1) throws MalformedURLException, IOException {
		URL var2 = new URL(class65.field874 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 983
		HashMap var3 = new HashMap(); // L: 984
		var3.put("Authorization", "Bearer " + var1);
		class9 var4 = class9.field41;
		OtlTokenRequester var5 = this.otlTokenRequester;
		if (var5 != null) {
			this.field525 = var5.request(var4.method79(), var2, var3, "");
		} else {
			class10 var6 = new class10(var2, var4, this.field526); // L: 992
			Iterator var7 = var3.entrySet().iterator(); // L: 993

			while (var7.hasNext()) { // L: 998
				Entry var8 = (Entry)var7.next(); // L: 994
				var6.method84((String)var8.getKey(), (String)var8.getValue()); // L: 996
			}

			this.field523 = this.field522.method177(var6); // L: 999
		}
	} // L: 1000

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "693258012"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1256
			long var2 = class131.method2916(); // L: 1259
			int var4 = (int)(var2 - class295.field3526); // L: 1260
			class295.field3526 = var2; // L: 1261
			if (var4 > 200) { // L: 1262
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4; // L: 1263
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) { // L: 1264
				var1 = true; // L: 1265
			} else if (NetCache.NetCache_socket == null) { // L: 1268
				var1 = false; // L: 1269
			} else {
				try {
					label243: {
						if (NetCache.NetCache_loadTime > 30000) { // L: 1273
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) { // L: 1274
							var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first(); // L: 1275
							var6 = new Buffer(4); // L: 1276
							var6.writeByte(1); // L: 1277
							var6.writeMedium((int)var5.key); // L: 1278
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1279
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key); // L: 1280
							--NetCache.NetCache_pendingPriorityWritesCount; // L: 1281
							++NetCache.NetCache_pendingPriorityResponsesCount; // L: 1282
						}

						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) { // L: 1284
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast(); // L: 1285
							var6 = new Buffer(4); // L: 1286
							var6.writeByte(0); // L: 1287
							var6.writeMedium((int)var5.key); // L: 1288
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1289
							var5.removeDual(); // L: 1290
							NetCache.NetCache_pendingResponses.put(var5, var5.key); // L: 1291
							--NetCache.NetCache_pendingWritesCount; // L: 1292
							++NetCache.NetCache_pendingResponsesCount; // L: 1293
						}

						for (int var17 = 0; var17 < 100; ++var17) { // L: 1295
							int var18 = NetCache.NetCache_socket.available(); // L: 1296
							if (var18 < 0) { // L: 1297
								throw new IOException();
							}

							if (var18 == 0) { // L: 1298
								break;
							}

							NetCache.NetCache_loadTime = 0; // L: 1299
							byte var7 = 0; // L: 1300
							if (ClanChannel.NetCache_currentResponse == null) { // L: 1301
								var7 = 8;
							} else if (NetCache.field4045 == 0) { // L: 1302
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							byte[] var10000;
							int var10001;
							Buffer var24;
							if (var7 > 0) { // L: 1303
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset; // L: 1304
								if (var8 > var18) { // L: 1305
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8); // L: 1306
								if (NetCache.field4033 != 0) { // L: 1307
									for (var9 = 0; var9 < var8; ++var9) { // L: 1308
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = NetCache.NetCache_responseHeaderBuffer.offset + var9;
										var10000[var10001] ^= NetCache.field4033;
									}
								}

								var24 = NetCache.NetCache_responseHeaderBuffer; // L: 1310
								var24.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) { // L: 1311
									break;
								}

								if (ClanChannel.NetCache_currentResponse == null) { // L: 1312
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1313
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1314
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 1315
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1316
									int var12 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 1317
									long var13 = (long)(var10 + (var9 << 16)); // L: 1318
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13); // L: 1319
									class342.field4171 = true; // L: 1320
									if (var15 == null) { // L: 1321
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13); // L: 1322
										class342.field4171 = false; // L: 1323
									}

									if (var15 == null) { // L: 1325
										throw new IOException(); // L: 1326
									}

									int var16 = var11 == 0 ? 5 : 9; // L: 1328
									ClanChannel.NetCache_currentResponse = var15; // L: 1329
									WorldMapSection2.NetCache_responseArchiveBuffer = new Buffer(var12 + var16 + ClanChannel.NetCache_currentResponse.padding); // L: 1330
									WorldMapSection2.NetCache_responseArchiveBuffer.writeByte(var11); // L: 1331
									WorldMapSection2.NetCache_responseArchiveBuffer.writeInt(var12); // L: 1332
									NetCache.field4045 = 8; // L: 1333
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1334
								} else if (NetCache.field4045 == 0) { // L: 1337
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 1338
										NetCache.field4045 = 1; // L: 1339
										NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1340
									} else {
										ClanChannel.NetCache_currentResponse = null; // L: 1344
									}
								}
							} else {
								var8 = WorldMapSection2.NetCache_responseArchiveBuffer.array.length - ClanChannel.NetCache_currentResponse.padding; // L: 1350
								var9 = 512 - NetCache.field4045; // L: 1351
								if (var9 > var8 - WorldMapSection2.NetCache_responseArchiveBuffer.offset) { // L: 1352
									var9 = var8 - WorldMapSection2.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) { // L: 1353
									var9 = var18;
								}

								NetCache.NetCache_socket.read(WorldMapSection2.NetCache_responseArchiveBuffer.array, WorldMapSection2.NetCache_responseArchiveBuffer.offset, var9); // L: 1354
								if (NetCache.field4033 != 0) { // L: 1355
									for (var10 = 0; var10 < var9; ++var10) { // L: 1356
										var10000 = WorldMapSection2.NetCache_responseArchiveBuffer.array;
										var10001 = WorldMapSection2.NetCache_responseArchiveBuffer.offset + var10;
										var10000[var10001] ^= NetCache.field4033;
									}
								}

								var24 = WorldMapSection2.NetCache_responseArchiveBuffer; // L: 1358
								var24.offset += var9;
								NetCache.field4045 += var9; // L: 1359
								if (var8 == WorldMapSection2.NetCache_responseArchiveBuffer.offset) { // L: 1360
									if (ClanChannel.NetCache_currentResponse.key == 16711935L) { // L: 1361
										Skills.field3568 = WorldMapSection2.NetCache_responseArchiveBuffer; // L: 1362

										for (var10 = 0; var10 < 256; ++var10) { // L: 1363
											Archive var19 = NetCache.NetCache_archives[var10]; // L: 1364
											if (var19 != null) { // L: 1365
												class9.method81(var19, var10); // L: 1366
											}
										}
									} else {
										NetCache.NetCache_crc.reset(); // L: 1371
										NetCache.NetCache_crc.update(WorldMapSection2.NetCache_responseArchiveBuffer.array, 0, var8); // L: 1372
										var10 = (int)NetCache.NetCache_crc.getValue(); // L: 1373
										if (var10 != ClanChannel.NetCache_currentResponse.crc) { // L: 1374
											try {
												NetCache.NetCache_socket.close(); // L: 1376
											} catch (Exception var22) { // L: 1378
											}

											++NetCache.NetCache_crcMismatches; // L: 1379
											NetCache.NetCache_socket = null; // L: 1380
											NetCache.field4033 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 1381
											var1 = false; // L: 1382
											break label243;
										}

										NetCache.NetCache_crcMismatches = 0; // L: 1385
										NetCache.NetCache_ioExceptions = 0; // L: 1386
										ClanChannel.NetCache_currentResponse.archive.write((int)(ClanChannel.NetCache_currentResponse.key & 65535L), WorldMapSection2.NetCache_responseArchiveBuffer.array, 16711680L == (ClanChannel.NetCache_currentResponse.key & 16711680L), class342.field4171); // L: 1387
									}

									ClanChannel.NetCache_currentResponse.remove(); // L: 1389
									if (class342.field4171) { // L: 1390
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount; // L: 1391
									}

									NetCache.field4045 = 0; // L: 1392
									ClanChannel.NetCache_currentResponse = null; // L: 1393
									WorldMapSection2.NetCache_responseArchiveBuffer = null; // L: 1394
								} else {
									if (NetCache.field4045 != 512) { // L: 1396
										break;
									}

									NetCache.field4045 = 0;
								}
							}
						}

						var1 = true; // L: 1400
					}
				} catch (IOException var23) {
					try {
						NetCache.NetCache_socket.close(); // L: 1404
					} catch (Exception var21) { // L: 1406
					}

					++NetCache.NetCache_ioExceptions; // L: 1407
					NetCache.NetCache_socket = null; // L: 1408
					var1 = false; // L: 1409
				}
			}

			if (!var1) { // L: 1413
				this.doCycleJs5Connect();
			}

		}
	} // L: 1414

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "4334"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1417
			this.error("js5crc"); // L: 1418
			class82.updateGameState(1000); // L: 1419
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1422
				if (gameState <= 5) { // L: 1423
					this.error("js5io"); // L: 1424
					class82.updateGameState(1000); // L: 1425
					return; // L: 1426
				}

				field513 = 3000; // L: 1429
				NetCache.NetCache_ioExceptions = 3; // L: 1430
			}

			if (--field513 + 1 <= 0) { // L: 1433
				try {
					if (js5ConnectState == 0) { // L: 1435
						class1.js5SocketTask = GameEngine.taskHandler.newSocketTask(WorldMapSectionType.worldHost, class117.currentPort); // L: 1436
						++js5ConnectState; // L: 1437
					}

					if (js5ConnectState == 1) { // L: 1439
						if (class1.js5SocketTask.status == 2) { // L: 1440
							this.js5Error(-1); // L: 1441
							return; // L: 1442
						}

						if (class1.js5SocketTask.status == 1) { // L: 1444
							++js5ConnectState;
						}
					}

					Buffer var3;
					if (js5ConnectState == 2) { // L: 1446
						Socket var2 = (Socket)class1.js5SocketTask.result; // L: 1448
						BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000); // L: 1450
						class101.js5Socket = var1; // L: 1452
						var3 = new Buffer(5); // L: 1453
						var3.writeByte(15); // L: 1454
						var3.writeInt(207); // L: 1455
						class101.js5Socket.write(var3.array, 0, 5); // L: 1456
						++js5ConnectState; // L: 1457
						class137.field1602 = class131.method2916(); // L: 1458
					}

					if (js5ConnectState == 3) { // L: 1460
						if (class101.js5Socket.available() > 0) { // L: 1461
							int var5 = class101.js5Socket.readUnsignedByte(); // L: 1462
							if (var5 != 0) { // L: 1463
								this.js5Error(var5); // L: 1464
								return; // L: 1465
							}

							++js5ConnectState; // L: 1467
						} else if (class131.method2916() - class137.field1602 > 30000L) { // L: 1470
							this.js5Error(-2); // L: 1471
							return; // L: 1472
						}
					}

					if (js5ConnectState == 4) { // L: 1476
						AbstractSocket var11 = class101.js5Socket; // L: 1477
						boolean var6 = gameState > 20; // L: 1478
						if (NetCache.NetCache_socket != null) { // L: 1480
							try {
								NetCache.NetCache_socket.close(); // L: 1482
							} catch (Exception var9) { // L: 1484
							}

							NetCache.NetCache_socket = null; // L: 1485
						}

						NetCache.NetCache_socket = var11; // L: 1487
						StructComposition.method3597(var6); // L: 1488
						NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1489
						ClanChannel.NetCache_currentResponse = null; // L: 1490
						WorldMapSection2.NetCache_responseArchiveBuffer = null; // L: 1491
						NetCache.field4045 = 0; // L: 1492

						while (true) {
							NetFileRequest var12 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 1494
							if (var12 == null) { // L: 1495
								while (true) {
									var12 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 1501
									if (var12 == null) { // L: 1502
										if (NetCache.field4033 != 0) { // L: 1508
											try {
												var3 = new Buffer(4); // L: 1510
												var3.writeByte(4); // L: 1511
												var3.writeByte(NetCache.field4033); // L: 1512
												var3.writeShort(0); // L: 1513
												NetCache.NetCache_socket.write(var3.array, 0, 4); // L: 1514
											} catch (IOException var8) {
												try {
													NetCache.NetCache_socket.close(); // L: 1518
												} catch (Exception var7) { // L: 1520
												}

												++NetCache.NetCache_ioExceptions; // L: 1521
												NetCache.NetCache_socket = null; // L: 1522
											}
										}

										NetCache.NetCache_loadTime = 0; // L: 1525
										class295.field3526 = class131.method2916(); // L: 1526
										class1.js5SocketTask = null; // L: 1528
										class101.js5Socket = null; // L: 1529
										js5ConnectState = 0; // L: 1530
										js5Errors = 0; // L: 1531
										return; // L: 1537
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var12); // L: 1503
									NetCache.NetCache_pendingWrites.put(var12, var12.key); // L: 1504
									++NetCache.NetCache_pendingWritesCount; // L: 1505
									--NetCache.NetCache_pendingResponsesCount; // L: 1506
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var12, var12.key); // L: 1496
							++NetCache.NetCache_pendingPriorityWritesCount; // L: 1497
							--NetCache.NetCache_pendingPriorityResponsesCount; // L: 1498
						}
					}
				} catch (IOException var10) { // L: 1534
					this.js5Error(-3); // L: 1535
				}

			}
		}
	} // L: 1420

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1901606866"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class1.js5SocketTask = null; // L: 1540
		class101.js5Socket = null; // L: 1541
		js5ConnectState = 0; // L: 1542
		if (class18.worldPort == class117.currentPort) { // L: 1543
			class117.currentPort = class438.js5Port;
		} else {
			class117.currentPort = class18.worldPort; // L: 1544
		}

		++js5Errors; // L: 1545
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1546
			if (gameState <= 5) { // L: 1547
				this.error("js5connect_full"); // L: 1548
				class82.updateGameState(1000); // L: 1549
			} else {
				field513 = 3000; // L: 1551
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1553
			this.error("js5connect_outofdate"); // L: 1554
			class82.updateGameState(1000); // L: 1555
		} else if (js5Errors >= 4) { // L: 1557
			if (gameState <= 5) { // L: 1558
				this.error("js5connect"); // L: 1559
				class82.updateGameState(1000); // L: 1560
			} else {
				field513 = 3000; // L: 1562
			}
		}

	} // L: 1564

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "68"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 2071
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 2072

		try {
			if (loginState == 0) { // L: 2074
				if (SpriteMask.secureRandom == null && (secureRandomFuture.isDone() || field516 > 250)) { // L: 2075
					SpriteMask.secureRandom = secureRandomFuture.get(); // L: 2076
					secureRandomFuture.shutdown(); // L: 2077
					secureRandomFuture = null; // L: 2078
				}

				if (SpriteMask.secureRandom != null) { // L: 2080
					if (var1 != null) { // L: 2081
						((AbstractSocket)var1).close(); // L: 2082
						var1 = null; // L: 2083
					}

					VarpDefinition.socketTask = null; // L: 2085
					hadNetworkError = false; // L: 2086
					field516 = 0; // L: 2087
					if (field741.method8024()) { // L: 2088
						try {
							this.requestOtlToken(class402.field4461); // L: 2090
							GameBuild.method5758(21); // L: 2091
						} catch (Throwable var29) { // L: 2093
							class359.RunException_sendStackTrace((String)null, var29); // L: 2094
							WorldMapData_1.getLoginError(65); // L: 2095
							return; // L: 2096
						}
					} else {
						GameBuild.method5758(1); // L: 2100
					}
				}
			}

			class21 var32;
			if (loginState == 21) { // L: 2104
				if (this.otlTokenRequest != null) { // L: 2105
					if (!this.otlTokenRequest.isDone()) { // L: 2106
						return; // L: 2107
					}

					if (this.otlTokenRequest.isCancelled()) { // L: 2109
						WorldMapData_1.getLoginError(65); // L: 2110
						this.otlTokenRequest = null; // L: 2111
						return; // L: 2112
					}

					try {
						OtlTokenResponse var3 = (OtlTokenResponse)this.otlTokenRequest.get(); // L: 2115
						if (!var3.isSuccess()) { // L: 2116
							WorldMapData_1.getLoginError(65); // L: 2117
							this.otlTokenRequest = null; // L: 2118
							return; // L: 2119
						}

						class344.field4179 = var3.getAccessToken(); // L: 2121
						class402.field4461 = var3.getRefreshToken(); // L: 2122
						this.otlTokenRequest = null; // L: 2123
					} catch (Exception var28) { // L: 2125
						class359.RunException_sendStackTrace((String)null, var28); // L: 2126
						WorldMapData_1.getLoginError(65); // L: 2127
						this.otlTokenRequest = null; // L: 2128
						return; // L: 2129
					}
				} else {
					if (this.field527 == null) { // L: 2132
						WorldMapData_1.getLoginError(65); // L: 2162
						return; // L: 2163
					}

					if (!this.field527.method278()) { // L: 2133
						return; // L: 2134
					}

					if (this.field527.method277()) { // L: 2136
						class359.RunException_sendStackTrace(this.field527.method280(), (Throwable)null); // L: 2137
						WorldMapData_1.getLoginError(65); // L: 2138
						this.field527 = null; // L: 2139
						return; // L: 2140
					}

					var32 = this.field527.method279(); // L: 2142
					if (var32.method298() != 200) { // L: 2143
						WorldMapData_1.getLoginError(65); // L: 2144
						this.field527 = null; // L: 2145
						return; // L: 2146
					}

					field516 = 0; // L: 2148
					class400 var4 = new class400(var32.method299()); // L: 2149

					try {
						class344.field4179 = var4.method7134().getString("access_token"); // L: 2151
						class402.field4461 = var4.method7134().getString("refresh_token"); // L: 2152
					} catch (Exception var27) { // L: 2154
						class359.RunException_sendStackTrace("Error parsing tokens", var27); // L: 2155
						WorldMapData_1.getLoginError(65); // L: 2156
						this.field527 = null; // L: 2157
						return; // L: 2158
					}
				}

				this.method1115(class344.field4179); // L: 2165
				GameBuild.method5758(20); // L: 2166
			}

			if (loginState == 20) { // L: 2168
				if (this.field525 != null) { // L: 2169
					if (!this.field525.isDone()) { // L: 2170
						return; // L: 2171
					}

					if (this.field525.isCancelled()) { // L: 2173
						WorldMapData_1.getLoginError(65); // L: 2174
						this.field525 = null; // L: 2175
						return; // L: 2176
					}

					try {
						com.jagex.oldscape.pub.OtlTokenResponse var33 = (com.jagex.oldscape.pub.OtlTokenResponse)this.field525.get(); // L: 2179
						if (!var33.isSuccess()) { // L: 2180
							WorldMapData_1.getLoginError(65); // L: 2181
							this.field525 = null; // L: 2182
							return; // L: 2183
						}

						this.field521 = var33.getToken(); // L: 2185
						this.field525 = null; // L: 2186
					} catch (Exception var26) { // L: 2188
						class359.RunException_sendStackTrace((String)null, var26); // L: 2189
						WorldMapData_1.getLoginError(65); // L: 2190
						this.field525 = null; // L: 2191
						return; // L: 2192
					}
				} else {
					if (this.field523 == null) { // L: 2195
						WorldMapData_1.getLoginError(65); // L: 2216
						return; // L: 2217
					}

					if (!this.field523.method278()) { // L: 2196
						return; // L: 2197
					}

					if (this.field523.method277()) { // L: 2199
						class359.RunException_sendStackTrace(this.field523.method280(), (Throwable)null); // L: 2200
						WorldMapData_1.getLoginError(65); // L: 2201
						this.field523 = null; // L: 2202
						return; // L: 2203
					}

					var32 = this.field523.method279(); // L: 2205
					if (var32.method298() != 200) { // L: 2206
						class359.RunException_sendStackTrace("Response code: " + var32.method298() + "Response body: " + var32.method299(), (Throwable)null); // L: 2207
						WorldMapData_1.getLoginError(65); // L: 2208
						this.field523 = null; // L: 2209
						return; // L: 2210
					}

					this.field521 = var32.method299(); // L: 2212
					this.field523 = null; // L: 2213
				}

				field516 = 0; // L: 2219
				GameBuild.method5758(1); // L: 2220
			}

			if (loginState == 1) { // L: 2222
				if (VarpDefinition.socketTask == null) { // L: 2223
					VarpDefinition.socketTask = GameEngine.taskHandler.newSocketTask(WorldMapSectionType.worldHost, class117.currentPort); // L: 2224
				}

				if (VarpDefinition.socketTask.status == 2) { // L: 2226
					throw new IOException();
				}

				if (VarpDefinition.socketTask.status == 1) { // L: 2227
					Socket var34 = (Socket)VarpDefinition.socketTask.result; // L: 2229
					BufferedNetSocket var35 = new BufferedNetSocket(var34, 40000, 5000); // L: 2231
					var1 = var35; // L: 2233
					packetWriter.setSocket(var35); // L: 2234
					VarpDefinition.socketTask = null; // L: 2235
					GameBuild.method5758(2); // L: 2236
				}
			}

			PacketBufferNode var36;
			if (loginState == 2) { // L: 2239
				packetWriter.clearBuffer(); // L: 2240
				var36 = class228.method4876(); // L: 2241
				var36.packetBuffer.writeByte(LoginPacket.field3149.id); // L: 2242
				packetWriter.addNode(var36); // L: 2243
				packetWriter.flush(); // L: 2244
				var2.offset = 0; // L: 2245
				GameBuild.method5758(3); // L: 2246
			}

			int var14;
			if (loginState == 3) { // L: 2248
				if (class192.pcmPlayer0 != null) { // L: 2249
					class192.pcmPlayer0.method698();
				}

				if (SequenceDefinition.pcmPlayer1 != null) { // L: 2250
					SequenceDefinition.pcmPlayer1.method698();
				}

				if (((AbstractSocket)var1).isAvailable(1)) { // L: 2251
					var14 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2252
					if (class192.pcmPlayer0 != null) { // L: 2253
						class192.pcmPlayer0.method698();
					}

					if (SequenceDefinition.pcmPlayer1 != null) { // L: 2254
						SequenceDefinition.pcmPlayer1.method698();
					}

					if (var14 != 0) { // L: 2255
						WorldMapData_1.getLoginError(var14); // L: 2256
						return; // L: 2257
					}

					var2.offset = 0; // L: 2259
					GameBuild.method5758(4); // L: 2260
				}
			}

			if (loginState == 4) { // L: 2263
				if (var2.offset < 8) { // L: 2264
					var14 = ((AbstractSocket)var1).available(); // L: 2265
					if (var14 > 8 - var2.offset) { // L: 2266
						var14 = 8 - var2.offset;
					}

					if (var14 > 0) { // L: 2267
						((AbstractSocket)var1).read(var2.array, var2.offset, var14); // L: 2268
						var2.offset += var14; // L: 2269
					}
				}

				if (var2.offset == 8) { // L: 2272
					var2.offset = 0; // L: 2273
					ArchiveLoader.field1020 = var2.readLong(); // L: 2274
					GameBuild.method5758(5); // L: 2275
				}
			}

			int var9;
			int var15;
			int var16;
			if (loginState == 5) { // L: 2278
				packetWriter.packetBuffer.offset = 0; // L: 2279
				packetWriter.clearBuffer(); // L: 2280
				PacketBuffer var38 = new PacketBuffer(500); // L: 2281
				int[] var37 = new int[]{SpriteMask.secureRandom.nextInt(), SpriteMask.secureRandom.nextInt(), SpriteMask.secureRandom.nextInt(), SpriteMask.secureRandom.nextInt()}; // L: 2282 2283 2284 2285 2286
				var38.offset = 0; // L: 2287
				var38.writeByte(1); // L: 2288
				var38.writeInt(var37[0]); // L: 2289
				var38.writeInt(var37[1]); // L: 2290
				var38.writeInt(var37[2]); // L: 2291
				var38.writeInt(var37[3]); // L: 2292
				var38.writeLong(ArchiveLoader.field1020); // L: 2293
				if (gameState == 40) { // L: 2294
					var38.writeInt(field618[0]); // L: 2295
					var38.writeInt(field618[1]); // L: 2296
					var38.writeInt(field618[2]); // L: 2297
					var38.writeInt(field618[3]); // L: 2298
				} else {
					if (gameState == 50) { // L: 2301
						var38.writeByte(class124.field1519.rsOrdinal()); // L: 2302
						var38.writeInt(Projectile.field950); // L: 2303
					} else {
						var38.writeByte(field645.rsOrdinal()); // L: 2306
						switch(field645.field1520) { // L: 2307
						case 1:
						case 4:
							var38.writeMedium(class260.field2908); // L: 2331
							++var38.offset; // L: 2332
							break;
						case 2:
							var38.offset += 4; // L: 2310
							break; // L: 2311
						case 3:
							LinkedHashMap var6 = class260.clientPreferences.parameters; // L: 2316
							String var8 = Login.Login_username; // L: 2318
							var9 = var8.length(); // L: 2320
							int var10 = 0; // L: 2321

							for (int var11 = 0; var11 < var9; ++var11) { // L: 2322
								var10 = (var10 << 5) - var10 + var8.charAt(var11);
							}

							var38.writeInt((Integer)var6.get(var10)); // L: 2325
						}
					}

					if (field741.method8024()) { // L: 2337
						var38.writeByte(class447.field4761.rsOrdinal()); // L: 2338
						var38.writeStringCp1252NullTerminated(this.field521); // L: 2339
					} else {
						var38.writeByte(class447.field4766.rsOrdinal()); // L: 2342
						var38.writeStringCp1252NullTerminated(Login.Login_password); // L: 2343
					}
				}

				var38.encryptRsa(class67.field889, class67.field888); // L: 2346
				field618 = var37; // L: 2347
				PacketBufferNode var5 = class228.method4876(); // L: 2348
				var5.packetBuffer.offset = 0; // L: 2349
				if (gameState == 40) { // L: 2350
					var5.packetBuffer.writeByte(LoginPacket.field3150.id); // L: 2351
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field3146.id); // L: 2354
				}

				var5.packetBuffer.writeShort(0); // L: 2356
				var15 = var5.packetBuffer.offset; // L: 2357
				var5.packetBuffer.writeInt(207); // L: 2358
				var5.packetBuffer.writeInt(1); // L: 2359
				var5.packetBuffer.writeByte(clientType); // L: 2360
				var5.packetBuffer.writeByte(field489); // L: 2361
				byte var7 = 0; // L: 2362
				var5.packetBuffer.writeByte(var7); // L: 2363
				var5.packetBuffer.writeBytes(var38.array, 0, var38.offset); // L: 2364
				var16 = var5.packetBuffer.offset; // L: 2365
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2366
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2367
				var5.packetBuffer.writeShort(class352.canvasWidth); // L: 2368
				var5.packetBuffer.writeShort(class228.canvasHeight); // L: 2369
				PacketBuffer var17 = var5.packetBuffer; // L: 2370
				int var12;
				if (randomDatData != null) { // L: 2372
					var17.writeBytes(randomDatData, 0, randomDatData.length); // L: 2373
				} else {
					byte[] var18 = new byte[24]; // L: 2378

					try {
						JagexCache.JagexCache_randomDat.seek(0L); // L: 2380
						JagexCache.JagexCache_randomDat.readFully(var18); // L: 2381

						for (var12 = 0; var12 < 24 && var18[var12] == 0; ++var12) { // L: 2382 2383 2384
						}

						if (var12 >= 24) { // L: 2386
							throw new IOException();
						}
					} catch (Exception var30) {
						for (int var13 = 0; var13 < 24; ++var13) { // L: 2389
							var18[var13] = -1;
						}
					}

					var17.writeBytes(var18, 0, var18.length); // L: 2394
				}

				var5.packetBuffer.writeStringCp1252NullTerminated(Script.field975); // L: 2396
				var5.packetBuffer.writeInt(Decimator.field402); // L: 2397
				Buffer var20 = new Buffer(class92.platformInfo.size()); // L: 2398
				class92.platformInfo.write(var20); // L: 2399
				var5.packetBuffer.writeBytes(var20.array, 0, var20.array.length); // L: 2400
				var5.packetBuffer.writeByte(clientType); // L: 2401
				var5.packetBuffer.writeInt(0); // L: 2402
				var5.packetBuffer.method7784(WorldMapRegion.archive15.hash); // L: 2403
				var5.packetBuffer.method7785(Skills.archive7.hash); // L: 2404
				var5.packetBuffer.method7783(class117.archive12.hash); // L: 2405
				var5.packetBuffer.method7785(ClanSettings.archive20.hash); // L: 2406
				var5.packetBuffer.method7784(AbstractWorldMapData.archive8.hash); // L: 2407
				var5.packetBuffer.writeInt(0); // L: 2408
				var5.packetBuffer.method7785(WorldMapArchiveLoader.archive4.hash); // L: 2409
				var5.packetBuffer.method7783(class1.archive13.hash); // L: 2410
				var5.packetBuffer.method7783(Calendar.field3297.hash); // L: 2411
				var5.packetBuffer.method7784(class20.archive2.hash); // L: 2412
				var5.packetBuffer.method7784(TaskHandler.archive11.hash); // L: 2413
				var5.packetBuffer.method7783(MouseHandler.archive6.hash); // L: 2414
				var5.packetBuffer.writeInt(class174.archive18.hash); // L: 2415
				var5.packetBuffer.writeInt(InvDefinition.archive14.hash); // L: 2416
				var5.packetBuffer.method7784(Actor.archive10.hash); // L: 2417
				var5.packetBuffer.method7785(WorldMapRegion.field2708.hash); // L: 2418
				var5.packetBuffer.method7784(class293.field3349.hash); // L: 2419
				var5.packetBuffer.method7785(Calendar.archive5.hash); // L: 2420
				var5.packetBuffer.method7785(class21.archive9.hash); // L: 2421
				var5.packetBuffer.method7783(GrandExchangeOffer.archive19.hash); // L: 2422
				var5.packetBuffer.method7783(class155.archive17.hash); // L: 2423
				var5.packetBuffer.xteaEncrypt(var37, var16, var5.packetBuffer.offset); // L: 2424
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var15); // L: 2425
				packetWriter.addNode(var5); // L: 2426
				packetWriter.flush(); // L: 2427
				packetWriter.isaacCipher = new IsaacCipher(var37); // L: 2428
				int[] var52 = new int[4]; // L: 2429

				for (var12 = 0; var12 < 4; ++var12) { // L: 2430
					var52[var12] = var37[var12] + 50;
				}

				var2.newIsaacCipher(var52); // L: 2431
				GameBuild.method5758(6); // L: 2432
			}

			int var21;
			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2434 2435
				var14 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2436
				if (var14 == 61) { // L: 2437
					var21 = ((AbstractSocket)var1).available(); // L: 2438
					FriendsChatManager.field4305 = var21 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2439
					GameBuild.method5758(5); // L: 2440
				}

				if (var14 == 21 && gameState == 20) { // L: 2442
					GameBuild.method5758(12); // L: 2443
				} else if (var14 == 2) { // L: 2445
					GameBuild.method5758(14); // L: 2446
				} else if (var14 == 15 && gameState == 40) { // L: 2448
					packetWriter.serverPacketLength = -1; // L: 2449
					GameBuild.method5758(19); // L: 2450
				} else if (var14 == 64) { // L: 2452
					GameBuild.method5758(10); // L: 2453
				} else if (var14 == 23 && field766 < 1) { // L: 2455
					++field766; // L: 2456
					GameBuild.method5758(0); // L: 2457
				} else if (var14 == 29) { // L: 2459
					GameBuild.method5758(17); // L: 2460
				} else {
					if (var14 != 69) { // L: 2462
						WorldMapData_1.getLoginError(var14); // L: 2466
						return; // L: 2467
					}

					GameBuild.method5758(7); // L: 2463
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2471 2472
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2473
				var2.offset = 0; // L: 2474
				class135.field1593 = var2.readUnsignedShort(); // L: 2475
				GameBuild.method5758(8); // L: 2476
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= class135.field1593) { // L: 2479 2480
				var2.offset = 0; // L: 2481
				((AbstractSocket)var1).read(var2.array, var2.offset, class135.field1593); // L: 2482
				class6[] var40 = new class6[]{class6.field14}; // L: 2485
				class6 var39 = var40[var2.readUnsignedByte()]; // L: 2487

				try {
					class3 var41 = class293.method5614(var39); // L: 2489
					this.field519 = new class7(var2, var41); // L: 2490
					GameBuild.method5758(9); // L: 2491
				} catch (Exception var25) { // L: 2493
					WorldMapData_1.getLoginError(22); // L: 2494
					return; // L: 2495
				}
			}

			if (loginState == 9 && this.field519.method59()) { // L: 2499 2500
				this.field534 = this.field519.method41(); // L: 2501
				this.field519.method40(); // L: 2502
				this.field519 = null; // L: 2503
				if (this.field534 == null) { // L: 2504
					WorldMapData_1.getLoginError(22); // L: 2505
					return; // L: 2506
				}

				packetWriter.clearBuffer(); // L: 2508
				var36 = class228.method4876(); // L: 2509
				var36.packetBuffer.writeByte(LoginPacket.field3153.id); // L: 2510
				var36.packetBuffer.writeShort(this.field534.offset); // L: 2511
				var36.packetBuffer.method7727(this.field534); // L: 2512
				packetWriter.addNode(var36); // L: 2513
				packetWriter.flush(); // L: 2514
				this.field534 = null; // L: 2515
				GameBuild.method5758(6); // L: 2516
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2519 2520
				class9.field42 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2521
				GameBuild.method5758(11); // L: 2522
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= class9.field42) { // L: 2525 2526
				((AbstractSocket)var1).read(var2.array, 0, class9.field42); // L: 2527
				var2.offset = 0; // L: 2528
				GameBuild.method5758(6); // L: 2529
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2532 2533
				field711 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 2534
				GameBuild.method5758(13); // L: 2535
			}

			if (loginState == 13) { // L: 2538
				field516 = 0; // L: 2539
				HealthBarUpdate.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field711 / 60 + " seconds."); // L: 2540
				if (--field711 <= 0) { // L: 2541
					GameBuild.method5758(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2544 2545
					WorldMapSection2.field2691 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2546
					GameBuild.method5758(15); // L: 2547
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= WorldMapSection2.field2691) { // L: 2550 2551
					boolean var51 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2552
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2553
					var2.offset = 0; // L: 2554
					boolean var53 = false; // L: 2555
					if (var51) { // L: 2556
						var21 = var2.readByteIsaac() << 24; // L: 2557
						var21 |= var2.readByteIsaac() << 16; // L: 2558
						var21 |= var2.readByteIsaac() << 8; // L: 2559
						var21 |= var2.readByteIsaac(); // L: 2560
						String var47 = Login.Login_username; // L: 2562
						int var49 = var47.length(); // L: 2564
						var16 = 0; // L: 2565
						var9 = 0; // L: 2566

						while (true) {
							if (var9 >= var49) {
								if (class260.clientPreferences.parameters.size() >= 10 && !class260.clientPreferences.parameters.containsKey(var16)) { // L: 2570 2571
									Iterator var50 = class260.clientPreferences.parameters.entrySet().iterator(); // L: 2572
									var50.next(); // L: 2573
									var50.remove(); // L: 2574
								}

								class260.clientPreferences.parameters.put(var16, var21); // L: 2577
								break;
							}

							var16 = (var16 << 5) - var16 + var47.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) { // L: 2579
						class260.clientPreferences.method2330(Login.Login_username); // L: 2580
					} else {
						class260.clientPreferences.method2330((String)null); // L: 2583
					}

					class270.savePreferences(); // L: 2585
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2586
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2587
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2588
					localPlayerIndex <<= 8; // L: 2589
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2590
					field770 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2591
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2592
					var2.offset = 0; // L: 2593
					this.accountHash = var2.readLong(); // L: 2594
					if (WorldMapSection2.field2691 >= 29) { // L: 2595
						((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2596
						var2.offset = 0; // L: 2597
						field614 = var2.readLong(); // L: 2598
					}

					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2600
					var2.offset = 0; // L: 2601
					ServerPacket[] var43 = class389.ServerPacket_values(); // L: 2602
					var15 = var2.readSmartByteShortIsaac(); // L: 2603
					if (var15 < 0 || var15 >= var43.length) { // L: 2604
						throw new IOException(var15 + " " + var2.offset);
					}

					packetWriter.serverPacket = var43[var15]; // L: 2605
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2606
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2607
					var2.offset = 0; // L: 2608
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2609

					try {
						class27.method378(class329.client, "zap"); // L: 2611
					} catch (Throwable var24) { // L: 2613
					}

					GameBuild.method5758(16); // L: 2614
				}

				if (loginState == 16) { // L: 2617
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2618
						var2.offset = 0; // L: 2619
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2620
						timer.method6555(); // L: 2621
						HealthBarUpdate.method2274(); // L: 2622
						class134.updatePlayer(var2); // L: 2623
						WorldMapCacheName.field2868 = -1; // L: 2624
						NPC.loadRegions(false, var2); // L: 2625
						packetWriter.serverPacket = null; // L: 2626
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2630 2631
						var2.offset = 0; // L: 2632
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2633
						var2.offset = 0; // L: 2634
						NameableContainer.field4331 = var2.readUnsignedShort(); // L: 2635
						GameBuild.method5758(18); // L: 2636
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= NameableContainer.field4331) { // L: 2639 2640
						var2.offset = 0; // L: 2641
						((AbstractSocket)var1).read(var2.array, 0, NameableContainer.field4331); // L: 2642
						var2.offset = 0; // L: 2643
						String var45 = var2.readStringCp1252NullTerminated(); // L: 2644
						String var42 = var2.readStringCp1252NullTerminated(); // L: 2645
						String var46 = var2.readStringCp1252NullTerminated(); // L: 2646
						HealthBarUpdate.setLoginResponseString(var45, var42, var46); // L: 2647
						class82.updateGameState(10); // L: 2648
						if (field741.method8024()) { // L: 2649
							UserComparator6.method2701(9); // L: 2650
						}
					}

					if (loginState != 19) { // L: 2654
						++field516; // L: 2709
						if (field516 > 2000) { // L: 2710
							if (field766 < 1) { // L: 2711
								if (class117.currentPort == class18.worldPort) { // L: 2712
									class117.currentPort = class438.js5Port;
								} else {
									class117.currentPort = class18.worldPort; // L: 2713
								}

								++field766; // L: 2714
								GameBuild.method5758(0); // L: 2715
							} else {
								WorldMapData_1.getLoginError(-3); // L: 2718
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) { // L: 2655
							if (((AbstractSocket)var1).available() < 2) { // L: 2656
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2657
							var2.offset = 0; // L: 2658
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2659
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2661
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2662
							var2.offset = 0; // L: 2663
							var14 = packetWriter.serverPacketLength; // L: 2664
							timer.method6557(); // L: 2665
							packetWriter.clearBuffer(); // L: 2667
							packetWriter.packetBuffer.offset = 0; // L: 2668
							packetWriter.serverPacket = null; // L: 2669
							packetWriter.field1339 = null; // L: 2670
							packetWriter.field1338 = null; // L: 2671
							packetWriter.field1333 = null; // L: 2672
							packetWriter.serverPacketLength = 0; // L: 2673
							packetWriter.field1332 = 0; // L: 2674
							rebootTimer = 0; // L: 2675
							menuOptionsCount = 0; // L: 2677
							isMenuOpen = false; // L: 2678
							minimapState = 0; // L: 2680
							destinationX = 0; // L: 2681

							for (var21 = 0; var21 < 2048; ++var21) { // L: 2682
								players[var21] = null;
							}

							class28.localPlayer = null; // L: 2683

							for (var21 = 0; var21 < npcs.length; ++var21) { // L: 2684
								NPC var48 = npcs[var21]; // L: 2685
								if (var48 != null) { // L: 2686
									var48.targetIndex = -1; // L: 2687
									var48.false0 = false; // L: 2688
								}
							}

							class127.method2888(); // L: 2691
							class82.updateGameState(30); // L: 2692

							for (var21 = 0; var21 < 100; ++var21) { // L: 2693
								field610[var21] = true;
							}

							PacketBufferNode var44 = class433.getPacketBufferNode(ClientPacket.field2984, packetWriter.isaacCipher); // L: 2696
							var44.packetBuffer.writeByte(MouseRecorder.getWindowedMode()); // L: 2697
							var44.packetBuffer.writeShort(class352.canvasWidth); // L: 2698
							var44.packetBuffer.writeShort(class228.canvasHeight); // L: 2699
							packetWriter.addNode(var44); // L: 2700
							class134.updatePlayer(var2); // L: 2703
							if (var14 != var2.offset) { // L: 2704
								throw new RuntimeException(); // L: 2705
							}
						}
					}
				}
			}
		} catch (IOException var31) { // L: 2722
			if (field766 < 1) { // L: 2723
				if (class117.currentPort == class18.worldPort) { // L: 2724
					class117.currentPort = class438.js5Port;
				} else {
					class117.currentPort = class18.worldPort; // L: 2725
				}

				++field766; // L: 2726
				GameBuild.method5758(0); // L: 2727
			} else {
				WorldMapData_1.getLoginError(-2); // L: 2730
			}
		}
	} // L: 2542 2628 2707 2716 2719 2728 2731 2733

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "88"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3079
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3080
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3081
			hadNetworkError = false; // L: 3082
			UserComparator4.method2654(); // L: 3083
		} else {
			if (!isMenuOpen) { // L: 3086
				UserComparator9.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1386(packetWriter); ++var1) { // L: 3087 3088
			}

			if (gameState == 30) { // L: 3090
				int var2;
				PacketBufferNode var14;
				while (ObjectComposition.method3699()) { // L: 3091
					var14 = class433.getPacketBufferNode(ClientPacket.field2949, packetWriter.isaacCipher); // L: 3092
					var14.packetBuffer.writeByte(0); // L: 3093
					var2 = var14.packetBuffer.offset; // L: 3094
					class259.performReflectionCheck(var14.packetBuffer); // L: 3095
					var14.packetBuffer.method7730(var14.packetBuffer.offset - var2); // L: 3096
					packetWriter.addNode(var14); // L: 3097
				}

				if (timer.field4246) { // L: 3099
					var14 = class433.getPacketBufferNode(ClientPacket.field2928, packetWriter.isaacCipher); // L: 3101
					var14.packetBuffer.writeByte(0); // L: 3102
					var2 = var14.packetBuffer.offset; // L: 3103
					timer.write(var14.packetBuffer); // L: 3104
					var14.packetBuffer.method7730(var14.packetBuffer.offset - var2); // L: 3105
					packetWriter.addNode(var14); // L: 3106
					timer.method6574(); // L: 3107
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
				synchronized(class309.mouseRecorder.lock) { // L: 3110
					if (!field510) { // L: 3111
						class309.mouseRecorder.index = 0; // L: 3197
					} else if (MouseHandler.MouseHandler_lastButton != 0 || class309.mouseRecorder.index >= 40) { // L: 3112
						PacketBufferNode var15 = null; // L: 3114
						var3 = 0; // L: 3115
						var4 = 0; // L: 3116
						var5 = 0; // L: 3117
						var6 = 0; // L: 3118

						for (var7 = 0; var7 < class309.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) { // L: 3119 3120
							var4 = var7; // L: 3121
							var8 = class309.mouseRecorder.ys[var7]; // L: 3122
							if (var8 < -1) { // L: 3123
								var8 = -1;
							} else if (var8 > 65534) { // L: 3124
								var8 = 65534;
							}

							var9 = class309.mouseRecorder.xs[var7]; // L: 3125
							if (var9 < -1) { // L: 3126
								var9 = -1;
							} else if (var9 > 65534) { // L: 3127
								var9 = 65534;
							}

							if (var9 != field548 || var8 != field497) { // L: 3128
								if (var15 == null) { // L: 3131
									var15 = class433.getPacketBufferNode(ClientPacket.field2954, packetWriter.isaacCipher); // L: 3132
									var15.packetBuffer.writeByte(0); // L: 3133
									var3 = var15.packetBuffer.offset; // L: 3134
									PacketBuffer var10000 = var15.packetBuffer; // L: 3135
									var10000.offset += 2;
									var5 = 0; // L: 3136
									var6 = 0; // L: 3137
								}

								if (-1L != field723) { // L: 3142
									var10 = var9 - field548; // L: 3143
									var11 = var8 - field497; // L: 3144
									var12 = (int)((class309.mouseRecorder.millis[var7] - field723) / 20L); // L: 3145
									var5 = (int)((long)var5 + (class309.mouseRecorder.millis[var7] - field723) % 20L); // L: 3146
								} else {
									var10 = var9; // L: 3149
									var11 = var8; // L: 3150
									var12 = Integer.MAX_VALUE; // L: 3151
								}

								field548 = var9; // L: 3153
								field497 = var8; // L: 3154
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3155
									var10 += 32; // L: 3156
									var11 += 32; // L: 3157
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3158
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3160
									var10 += 128; // L: 3161
									var11 += 128; // L: 3162
									var15.packetBuffer.writeByte(var12 + 128); // L: 3163
									var15.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3164
								} else if (var12 < 32) { // L: 3166
									var15.packetBuffer.writeByte(var12 + 192); // L: 3167
									if (var9 != -1 && var8 != -1) { // L: 3168
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3169
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3172
									if (var9 != -1 && var8 != -1) { // L: 3173
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3174
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6; // L: 3176
								field723 = class309.mouseRecorder.millis[var7]; // L: 3177
							}
						}

						if (var15 != null) { // L: 3179
							var15.packetBuffer.method7730(var15.packetBuffer.offset - var3); // L: 3180
							var7 = var15.packetBuffer.offset; // L: 3181
							var15.packetBuffer.offset = var3; // L: 3182
							var15.packetBuffer.writeByte(var5 / var6); // L: 3183
							var15.packetBuffer.writeByte(var5 % var6); // L: 3184
							var15.packetBuffer.offset = var7; // L: 3185
							packetWriter.addNode(var15); // L: 3186
						}

						if (var4 >= class309.mouseRecorder.index) { // L: 3188
							class309.mouseRecorder.index = 0;
						} else {
							MouseRecorder var44 = class309.mouseRecorder; // L: 3190
							var44.index -= var4;
							System.arraycopy(class309.mouseRecorder.xs, var4, class309.mouseRecorder.xs, 0, class309.mouseRecorder.index); // L: 3191
							System.arraycopy(class309.mouseRecorder.ys, var4, class309.mouseRecorder.ys, 0, class309.mouseRecorder.index); // L: 3192
							System.arraycopy(class309.mouseRecorder.millis, var4, class309.mouseRecorder.millis, 0, class309.mouseRecorder.index); // L: 3193
						}
					}
				}

				PacketBufferNode var18;
				if (MouseHandler.MouseHandler_lastButton == 1 || !ObjectSound.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3199
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L; // L: 3200
					if (var16 > 32767L) { // L: 3201
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L; // L: 3202
					var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3203
					if (var3 < 0) { // L: 3204
						var3 = 0;
					} else if (var3 > class228.canvasHeight) { // L: 3205
						var3 = class228.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3206
					if (var4 < 0) { // L: 3207
						var4 = 0;
					} else if (var4 > class352.canvasWidth) { // L: 3208
						var4 = class352.canvasWidth;
					}

					var5 = (int)var16; // L: 3209
					var18 = class433.getPacketBufferNode(ClientPacket.field2950, packetWriter.isaacCipher); // L: 3210
					var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 3211
					var18.packetBuffer.writeShort(var4); // L: 3212
					var18.packetBuffer.writeShort(var3); // L: 3213
					packetWriter.addNode(var18); // L: 3214
				}

				if (KeyHandler.field131 > 0) { // L: 3216
					var14 = class433.getPacketBufferNode(ClientPacket.field2981, packetWriter.isaacCipher); // L: 3217
					var14.packetBuffer.writeShort(0); // L: 3218
					var2 = var14.packetBuffer.offset; // L: 3219
					long var19 = class131.method2916(); // L: 3220

					for (var5 = 0; var5 < KeyHandler.field131; ++var5) { // L: 3221
						long var21 = var19 - field725; // L: 3222
						if (var21 > 16777215L) { // L: 3223
							var21 = 16777215L;
						}

						field725 = var19; // L: 3224
						var14.packetBuffer.method7762(KeyHandler.field146[var5]); // L: 3225
						var14.packetBuffer.method7780((int)var21); // L: 3226
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2); // L: 3228
					packetWriter.addNode(var14); // L: 3229
				}

				if (field748 > 0) { // L: 3231
					--field748;
				}

				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3232
					field481 = true;
				}

				if (field481 && field748 <= 0) { // L: 3233
					field748 = 20; // L: 3234
					field481 = false; // L: 3235
					var14 = class433.getPacketBufferNode(ClientPacket.field2935, packetWriter.isaacCipher); // L: 3237
					var14.packetBuffer.writeShort(camAngleY); // L: 3238
					var14.packetBuffer.method7771(camAngleX); // L: 3239
					packetWriter.addNode(var14); // L: 3240
				}

				if (class125.hasFocus && !hadFocus) { // L: 3242
					hadFocus = true; // L: 3243
					var14 = class433.getPacketBufferNode(ClientPacket.field2932, packetWriter.isaacCipher); // L: 3245
					var14.packetBuffer.writeByte(1); // L: 3246
					packetWriter.addNode(var14); // L: 3247
				}

				if (!class125.hasFocus && hadFocus) { // L: 3249
					hadFocus = false; // L: 3250
					var14 = class433.getPacketBufferNode(ClientPacket.field2932, packetWriter.isaacCipher); // L: 3252
					var14.packetBuffer.writeByte(0); // L: 3253
					packetWriter.addNode(var14); // L: 3254
				}

				if (class344.worldMap != null) { // L: 3257
					class344.worldMap.method7224();
				}

				class142.method3068(); // L: 3258
				if (class122.field1499) { // L: 3260
					for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3262
						Player var35 = players[Players.Players_indices[var1]]; // L: 3263
						var35.method2215(); // L: 3264
					}

					class122.field1499 = false; // L: 3267
				}

				if (field518 != FriendSystem.Client_plane) { // L: 3271
					field518 = FriendSystem.Client_plane; // L: 3272
					var1 = FriendSystem.Client_plane; // L: 3273
					int[] var37 = SceneTilePaint.sceneMinimapSprite.pixels; // L: 3275
					var3 = var37.length; // L: 3276

					for (var4 = 0; var4 < var3; ++var4) { // L: 3277
						var37[var4] = 0;
					}

					for (var4 = 1; var4 < 103; ++var4) { // L: 3278
						var5 = (103 - var4) * 2048 + 24628; // L: 3279

						for (var6 = 1; var6 < 103; ++var6) { // L: 3280
							if ((Tiles.Tiles_renderFlags[var1][var6][var4] & 24) == 0) { // L: 3281
								Decimator.scene.drawTileMinimap(var37, var5, 512, var1, var6, var4);
							}

							if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var6][var4] & 8) != 0) { // L: 3282
								Decimator.scene.drawTileMinimap(var37, var5, 512, var1 + 1, var6, var4);
							}

							var5 += 4; // L: 3283
						}
					}

					var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 3286
					var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 3287
					SceneTilePaint.sceneMinimapSprite.setRaster(); // L: 3288

					for (var6 = 1; var6 < 103; ++var6) { // L: 3289
						for (var7 = 1; var7 < 103; ++var7) { // L: 3290
							if ((Tiles.Tiles_renderFlags[var1][var7][var6] & 24) == 0) { // L: 3291
								AbstractWorldMapData.drawObject(var1, var7, var6, var4, var5);
							}

							if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var7][var6] & 8) != 0) { // L: 3292
								AbstractWorldMapData.drawObject(var1 + 1, var7, var6, var4, var5);
							}
						}
					}

					mapIconCount = 0; // L: 3295

					for (var6 = 0; var6 < 104; ++var6) { // L: 3296
						for (var7 = 0; var7 < 104; ++var7) { // L: 3297
							long var23 = Decimator.scene.getGroundObjectTag(FriendSystem.Client_plane, var6, var7); // L: 3298
							if (var23 != 0L) { // L: 3299
								var10 = class141.Entity_unpackID(var23); // L: 3300
								var11 = WorldMapDecoration.getObjectDefinition(var10).mapIconId; // L: 3301
								if (var11 >= 0 && TileItem.WorldMapElement_get(var11).field1836) { // L: 3302 3303
									mapIcons[mapIconCount] = TileItem.WorldMapElement_get(var11).getSpriteBool(false); // L: 3306
									mapIconXs[mapIconCount] = var6; // L: 3307
									mapIconYs[mapIconCount] = var7; // L: 3308
									++mapIconCount; // L: 3309
								}
							}
						}
					}

					class268.rasterProvider.apply(); // L: 3314
				}

				if (gameState == 30) { // L: 3318
					for (PendingSpawn var33 = (PendingSpawn)pendingSpawns.last(); var33 != null; var33 = (PendingSpawn)pendingSpawns.previous()) { // L: 3320 3321 3340
						if (var33.hitpoints > 0) { // L: 3322
							--var33.hitpoints;
						}

						if (var33.hitpoints == 0) { // L: 3323
							if (var33.objectId < 0 || InvDefinition.method3337(var33.objectId, var33.field1120)) { // L: 3324
								class1.addPendingSpawnToScene(var33.plane, var33.type, var33.x, var33.y, var33.objectId, var33.field1122, var33.field1120); // L: 3325
								var33.remove(); // L: 3326
							}
						} else {
							if (var33.delay > 0) { // L: 3330
								--var33.delay;
							}

							if (var33.delay == 0 && var33.x >= 1 && var33.y >= 1 && var33.x <= 102 && var33.y <= 102 && (var33.id < 0 || InvDefinition.method3337(var33.id, var33.field1123))) { // L: 3331 3332
								class1.addPendingSpawnToScene(var33.plane, var33.type, var33.x, var33.y, var33.id, var33.orientation, var33.field1123); // L: 3333
								var33.delay = -1; // L: 3334
								if (var33.objectId == var33.id && var33.objectId == -1) { // L: 3335
									var33.remove();
								} else if (var33.objectId == var33.id && var33.orientation == var33.field1122 && var33.field1123 == var33.field1120) { // L: 3336
									var33.remove();
								}
							}
						}
					}

					SecureRandomCallable.method2125(); // L: 3343
					++packetWriter.field1332; // L: 3344
					if (packetWriter.field1332 > 750) { // L: 3345
						UserComparator4.method2654(); // L: 3346
					} else {
						InvDefinition.method3336(); // L: 3349

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 3351
							var2 = npcIndices[var1]; // L: 3352
							NPC var25 = npcs[var2]; // L: 3353
							if (var25 != null) { // L: 3354
								AbstractByteArrayCopier.updateActorSequence(var25, var25.definition.size); // L: 3355
							}
						}

						int[] var34 = Players.Players_indices; // L: 3360

						for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 3361
							Player var40 = players[var34[var2]]; // L: 3362
							if (var40 != null && var40.overheadTextCyclesRemaining > 0) { // L: 3363
								--var40.overheadTextCyclesRemaining; // L: 3364
								if (var40.overheadTextCyclesRemaining == 0) { // L: 3365
									var40.overheadText = null;
								}
							}
						}

						for (var2 = 0; var2 < npcCount; ++var2) { // L: 3368
							var3 = npcIndices[var2]; // L: 3369
							NPC var26 = npcs[var3]; // L: 3370
							if (var26 != null && var26.overheadTextCyclesRemaining > 0) { // L: 3371
								--var26.overheadTextCyclesRemaining; // L: 3372
								if (var26.overheadTextCyclesRemaining == 0) { // L: 3373
									var26.overheadText = null;
								}
							}
						}

						++field744; // L: 3377
						if (mouseCrossColor != 0) { // L: 3378
							mouseCrossState = mouseCrossState * 400 + 400; // L: 3379
							if (mouseCrossState * 20 >= 400) { // L: 3380
								mouseCrossColor = 0;
							}
						}

						if (class121.field1488 != null) { // L: 3382
							++field601; // L: 3383
							if (field601 >= 15) { // L: 3384
								class220.invalidateWidget(class121.field1488); // L: 3385
								class121.field1488 = null; // L: 3386
							}
						}

						Widget var36 = FontName.mousedOverWidgetIf1; // L: 3389
						Widget var38 = class10.field59; // L: 3390
						FontName.mousedOverWidgetIf1 = null; // L: 3391
						class10.field59 = null; // L: 3392
						draggedOnWidget = null; // L: 3393
						field549 = false; // L: 3394
						field675 = false; // L: 3395
						field722 = 0; // L: 3396

						while (WorldMapSectionType.isKeyDown() && field722 < 128) { // L: 3397
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && SequenceDefinition.field2176 == 66) { // L: 3398
								String var41 = WorldMapRegion.method4785(); // L: 3399
								class329.client.method418(var41); // L: 3400
							} else if (oculusOrbState != 1 || Clock.field1797 <= 0) { // L: 3403
								field724[field722] = SequenceDefinition.field2176; // L: 3406
								field626[field722] = Clock.field1797; // L: 3407
								++field722; // L: 3408
							}
						}

						boolean var31 = staffModLevel >= 2; // L: 3412
						PacketBufferNode var27;
						if (var31 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) { // L: 3414
							var4 = class28.localPlayer.plane - mouseWheelRotation; // L: 3415
							if (var4 < 0) { // L: 3416
								var4 = 0;
							} else if (var4 > 3) { // L: 3417
								var4 = 3;
							}

							if (var4 != class28.localPlayer.plane) { // L: 3418
								var5 = class28.localPlayer.pathX[0] + class300.baseX * 64; // L: 3419
								var6 = class28.localPlayer.pathY[0] + Message.baseY * 64; // L: 3420
								var27 = class433.getPacketBufferNode(ClientPacket.field3016, packetWriter.isaacCipher); // L: 3423
								var27.packetBuffer.method7762(var4); // L: 3424
								var27.packetBuffer.method7784(0); // L: 3425
								var27.packetBuffer.writeIntME(var6); // L: 3426
								var27.packetBuffer.writeIntME(var5); // L: 3427
								packetWriter.addNode(var27); // L: 3428
							}

							mouseWheelRotation = 0; // L: 3431
						}

						if (rootInterface != -1) { // L: 3433
							MouseHandler.updateRootInterface(rootInterface, 0, 0, class352.canvasWidth, class228.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3434

						while (true) {
							Widget var28;
							Widget var39;
							ScriptEvent var42;
							do {
								var42 = (ScriptEvent)field758.removeLast(); // L: 3436
								if (var42 == null) { // L: 3437
									while (true) {
										do {
											var42 = (ScriptEvent)field702.removeLast(); // L: 3448
											if (var42 == null) { // L: 3449
												while (true) {
													do {
														var42 = (ScriptEvent)scriptEvents.removeLast(); // L: 3460
														if (var42 == null) { // L: 3461
															this.menu(); // L: 3471
															if (class344.worldMap != null) { // L: 3473
																class344.worldMap.method7249(FriendSystem.Client_plane, class300.baseX * 64 + (class28.localPlayer.x >> 7), Message.baseY * 64 + (class28.localPlayer.y >> 7), false); // L: 3474
																class344.worldMap.loadCache(); // L: 3475
															}

															if (clickedWidget != null) { // L: 3478
																this.method1298();
															}

															if (class115.dragInventoryWidget != null) { // L: 3479
																class220.invalidateWidget(class115.dragInventoryWidget); // L: 3480
																++itemDragDuration; // L: 3481
																if (MouseHandler.MouseHandler_currentButton == 0) { // L: 3482
																	if (field607) { // L: 3483
																		if (NetCache.hoveredItemContainer == class115.dragInventoryWidget && dragItemSlotSource != dragItemSlotDestination) { // L: 3484
																			Widget var43 = class115.dragInventoryWidget; // L: 3485
																			byte var32 = 0; // L: 3486
																			if (field662 == 1 && var43.contentType == 206) { // L: 3487
																				var32 = 1;
																			}

																			if (var43.itemIds[dragItemSlotDestination] <= 0) { // L: 3488
																				var32 = 0;
																			}

																			if (class7.method51(class67.getWidgetFlags(var43))) { // L: 3489
																				var6 = dragItemSlotSource; // L: 3490
																				var7 = dragItemSlotDestination; // L: 3491
																				var43.itemIds[var7] = var43.itemIds[var6]; // L: 3492
																				var43.itemQuantities[var7] = var43.itemQuantities[var6]; // L: 3493
																				var43.itemIds[var6] = -1; // L: 3494
																				var43.itemQuantities[var6] = 0; // L: 3495
																			} else if (var32 == 1) { // L: 3497
																				var6 = dragItemSlotSource; // L: 3498
																				var7 = dragItemSlotDestination; // L: 3499

																				while (var6 != var7) { // L: 3500
																					if (var6 > var7) { // L: 3501
																						var43.swapItems(var6 - 1, var6); // L: 3502
																						--var6; // L: 3503
																					} else if (var6 < var7) { // L: 3505
																						var43.swapItems(var6 + 1, var6); // L: 3506
																						++var6; // L: 3507
																					}
																				}
																			} else {
																				var43.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 3512
																			}

																			var18 = class433.getPacketBufferNode(ClientPacket.field2996, packetWriter.isaacCipher); // L: 3515
																			var18.packetBuffer.method7783(class115.dragInventoryWidget.id); // L: 3516
																			var18.packetBuffer.method7969(dragItemSlotDestination); // L: 3517
																			var18.packetBuffer.method7764(var32); // L: 3518
																			var18.packetBuffer.writeShort(dragItemSlotSource); // L: 3519
																			packetWriter.addNode(var18); // L: 3520
																		}
																	} else if (this.shouldLeftClickOpenMenu()) { // L: 3524
																		this.openMenu(draggedWidgetX, draggedWidgetY); // L: 3525
																	} else if (menuOptionsCount > 0) { // L: 3527
																		var4 = draggedWidgetX; // L: 3528
																		var5 = draggedWidgetY; // L: 3529
																		ArchiveDiskAction.method5787(class136.tempMenuAction, var4, var5); // L: 3531
																		class136.tempMenuAction = null; // L: 3532
																	}

																	field601 = 10; // L: 3536
																	MouseHandler.MouseHandler_lastButton = 0; // L: 3537
																	class115.dragInventoryWidget = null; // L: 3538
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 3541 3542
																	field607 = true; // L: 3543
																}
															}

															if (Scene.shouldSendWalk()) { // L: 3548
																var4 = Scene.Scene_selectedX; // L: 3549
																var5 = Scene.Scene_selectedY; // L: 3550
																var18 = class433.getPacketBufferNode(ClientPacket.field2955, packetWriter.isaacCipher); // L: 3552
																var18.packetBuffer.writeByte(5); // L: 3553
																var18.packetBuffer.writeIntME(Message.baseY * 64 + var5); // L: 3554
																var18.packetBuffer.method7764(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3555
																var18.packetBuffer.method7969(class300.baseX * 64 + var4); // L: 3556
																packetWriter.addNode(var18); // L: 3557
																Scene.method4203(); // L: 3558
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3559
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3560
																mouseCrossColor = 1; // L: 3561
																mouseCrossState = 0; // L: 3562
																destinationX = var4; // L: 3563
																destinationY = var5; // L: 3564
															}

															if (var36 != FontName.mousedOverWidgetIf1) { // L: 3566
																if (var36 != null) { // L: 3567
																	class220.invalidateWidget(var36);
																}

																if (FontName.mousedOverWidgetIf1 != null) { // L: 3568
																	class220.invalidateWidget(FontName.mousedOverWidgetIf1);
																}
															}

															if (var38 != class10.field59 && field535 == field631) { // L: 3570
																if (var38 != null) { // L: 3571
																	class220.invalidateWidget(var38);
																}

																if (class10.field59 != null) { // L: 3572
																	class220.invalidateWidget(class10.field59);
																}
															}

															if (class10.field59 != null) { // L: 3574
																if (field535 < field631) { // L: 3575
																	++field535; // L: 3576
																	if (field535 == field631) { // L: 3577
																		class220.invalidateWidget(class10.field59);
																	}
																}
															} else if (field535 > 0) { // L: 3580
																--field535;
															}

															class363.method6621(); // L: 3581
															if (field745) { // L: 3582
																class116.method2763();
															} else if (isCameraLocked) { // L: 3583
																var4 = class457.field4811 * 16384 + 64; // L: 3584
																var5 = NPC.field1261 * 128 + 64; // L: 3585
																var6 = SecureRandomFuture.getTileHeight(var4, var5, FriendSystem.Client_plane) - ScriptEvent.field1052; // L: 3586
																FriendSystem.method1764(var4, var6, var5); // L: 3587
																var4 = WorldMapLabelSize.field2673 * 128 + 64; // L: 3588
																var5 = LoginScreenAnimation.field1233 * 128 + 64; // L: 3589
																var6 = SecureRandomFuture.getTileHeight(var4, var5, FriendSystem.Client_plane) - UrlRequest.field1350; // L: 3590
																var7 = var4 - WorldMapLabelSize.cameraX; // L: 3591
																var8 = var6 - class123.cameraY; // L: 3592
																var9 = var5 - Widget.cameraZ; // L: 3593
																var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9)); // L: 3594
																var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047; // L: 3595
																var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047; // L: 3596
																WorldMapSectionType.method4927(var11, var12); // L: 3597
															}

															for (var4 = 0; var4 < 5; ++var4) { // L: 3599
																int var10002 = field653[var4]++;
															}

															class151.varcs.tryWrite(); // L: 3600
															var4 = class268.method5213(); // L: 3601
															var5 = KeyHandler.KeyHandler_idleCycles; // L: 3604
															if (var4 > 15000 && var5 > 15000) { // L: 3607
																logoutTimer = 250; // L: 3608
																MouseHandler.MouseHandler_idleCycles = 14500; // L: 3610
																var27 = class433.getPacketBufferNode(ClientPacket.field2936, packetWriter.isaacCipher); // L: 3613
																packetWriter.addNode(var27); // L: 3614
															}

															MusicPatchPcmStream.friendSystem.processFriendUpdates(); // L: 3616
															++packetWriter.pendingWrites; // L: 3617
															if (packetWriter.pendingWrites > 50) { // L: 3618
																var27 = class433.getPacketBufferNode(ClientPacket.field3007, packetWriter.isaacCipher); // L: 3620
																packetWriter.addNode(var27); // L: 3621
															}

															try {
																packetWriter.flush(); // L: 3624
															} catch (IOException var29) { // L: 3626
																UserComparator4.method2654(); // L: 3627
															}

															return; // L: 3629
														}

														var28 = var42.widget; // L: 3462
														if (var28.childIndex < 0) { // L: 3463
															break;
														}

														var39 = FloorUnderlayDefinition.getWidget(var28.parentId); // L: 3464
													} while(var39 == null || var39.children == null || var28.childIndex >= var39.children.length || var28 != var39.children[var28.childIndex]); // L: 3465

													class17.runScriptEvent(var42); // L: 3469
												}
											}

											var28 = var42.widget; // L: 3450
											if (var28.childIndex < 0) { // L: 3451
												break;
											}

											var39 = FloorUnderlayDefinition.getWidget(var28.parentId); // L: 3452
										} while(var39 == null || var39.children == null || var28.childIndex >= var39.children.length || var28 != var39.children[var28.childIndex]); // L: 3453

										class17.runScriptEvent(var42); // L: 3457
									}
								}

								var28 = var42.widget; // L: 3438
								if (var28.childIndex < 0) { // L: 3439
									break;
								}

								var39 = FloorUnderlayDefinition.getWidget(var28.parentId); // L: 3440
							} while(var39 == null || var39.children == null || var28.childIndex >= var39.children.length || var28 != var39.children[var28.childIndex]); // L: 3441

							class17.runScriptEvent(var42); // L: 3445
						}
					}
				}
			}
		}
	} // L: 3084 3347

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class352.canvasWidth; // L: 4484
		int var2 = class228.canvasHeight; // L: 4485
		if (super.contentWidth < var1) { // L: 4486
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 4487
		}

		if (class260.clientPreferences != null) { // L: 4488
			try {
				class27.method379(class329.client, "resize", new Object[]{MouseRecorder.getWindowedMode()}); // L: 4490
			} catch (Throwable var4) { // L: 4492
			}
		}

	} // L: 4494

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1043847640"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) { // L: 4497
			ReflectionCheck.method610(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4498
			if (field610[var1]) { // L: 4499
				field691[var1] = true;
			}

			field550[var1] = field610[var1]; // L: 4500
			field610[var1] = false; // L: 4501
		}

		field705 = cycle; // L: 4503
		viewportX = -1; // L: 4504
		viewportY = -1; // L: 4505
		NetCache.hoveredItemContainer = null; // L: 4506
		if (rootInterface != -1) { // L: 4507
			rootWidgetCount = 0; // L: 4508
			WorldMapSection0.drawWidgets(rootInterface, 0, 0, class352.canvasWidth, class228.canvasHeight, 0, 0, -1); // L: 4509
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4511
		if (showMouseCross) { // L: 4512
			if (mouseCrossColor == 1) { // L: 4513
				MouseHandler.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4514
			}

			if (mouseCrossColor == 2) { // L: 4516
				MouseHandler.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4517
			}
		}

		if (!isMenuOpen) { // L: 4520
			if (viewportX != -1) { // L: 4521
				VarbitComposition.method3557(viewportX, viewportY);
			}
		} else {
			ScriptEvent.method2169(); // L: 4523
		}

		if (gameDrawingMode == 3) { // L: 4524
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4525
				if (field550[var1]) { // L: 4526
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4527
				} else if (field691[var1]) { // L: 4529
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4530
				}
			}
		}

		var1 = FriendSystem.Client_plane; // L: 4534
		int var2 = class28.localPlayer.x; // L: 4535
		int var3 = class28.localPlayer.y; // L: 4536
		int var4 = field744; // L: 4537

		for (ObjectSound var5 = (ObjectSound)ObjectSound.objectSounds.last(); var5 != null; var5 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 4539
			if (var5.soundEffectId != -1 || var5.soundEffectIds != null) { // L: 4540
				int var6 = 0; // L: 4541
				if (var2 > var5.maxX * 16384) { // L: 4542
					var6 += var2 - var5.maxX * 16384;
				} else if (var2 < var5.x * 16384) { // L: 4543
					var6 += var5.x * 16384 - var2;
				}

				if (var3 > var5.maxY * 16384) { // L: 4544
					var6 += var3 - var5.maxY * 16384;
				} else if (var3 < var5.y * 16384) { // L: 4545
					var6 += var5.y * 16384 - var3;
				}

				if (var6 - 64 <= var5.field814 && class260.clientPreferences.method2329() != 0 && var1 == var5.plane) { // L: 4546
					var6 -= 64; // L: 4557
					if (var6 < 0) { // L: 4558
						var6 = 0;
					}

					int var7 = (var5.field814 - var6) * class260.clientPreferences.method2329() / var5.field814; // L: 4559
					Object var10000;
					if (var5.stream1 == null) { // L: 4560
						if (var5.soundEffectId >= 0) { // L: 4561
							var10000 = null; // L: 4562
							SoundEffect var8 = SoundEffect.readSoundEffect(WorldMapArchiveLoader.archive4, var5.soundEffectId, 0);
							if (var8 != null) { // L: 4563
								RawSound var9 = var8.toRawSound().resample(Tiles.decimator); // L: 4564
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var7); // L: 4565
								var10.setNumLoops(-1); // L: 4566
								StructComposition.pcmStreamMixer.addSubStream(var10); // L: 4567
								var5.stream1 = var10; // L: 4568
							}
						}
					} else {
						var5.stream1.method798(var7); // L: 4572
					}

					if (var5.stream2 == null) { // L: 4573
						if (var5.soundEffectIds != null && (var5.field818 -= var4) <= 0) { // L: 4574
							int var12 = (int)(Math.random() * (double)var5.soundEffectIds.length); // L: 4575
							var10000 = null; // L: 4576
							SoundEffect var13 = SoundEffect.readSoundEffect(WorldMapArchiveLoader.archive4, var5.soundEffectIds[var12], 0);
							if (var13 != null) { // L: 4577
								RawSound var14 = var13.toRawSound().resample(Tiles.decimator); // L: 4578
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var14, 100, var7); // L: 4579
								var11.setNumLoops(0); // L: 4580
								StructComposition.pcmStreamMixer.addSubStream(var11); // L: 4581
								var5.stream2 = var11; // L: 4582
								var5.field818 = var5.field817 + (int)(Math.random() * (double)(var5.field823 - var5.field817)); // L: 4583
							}
						}
					} else {
						var5.stream2.method798(var7); // L: 4588
						if (!var5.stream2.hasNext()) { // L: 4589
							var5.stream2 = null; // L: 4590
						}
					}
				} else {
					if (var5.stream1 != null) { // L: 4547
						StructComposition.pcmStreamMixer.removeSubStream(var5.stream1); // L: 4548
						var5.stream1 = null; // L: 4549
					}

					if (var5.stream2 != null) { // L: 4551
						StructComposition.pcmStreamMixer.removeSubStream(var5.stream2); // L: 4552
						var5.stream2 = null; // L: 4553
					}
				}
			}
		}

		field744 = 0; // L: 4595
	} // L: 4596

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Lcx;II)Z",
		garbageValue = "-563767291"
	)
	boolean method1128(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 6150
			class13.friendsChatManager = null; // L: 6151
		} else {
			if (class13.friendsChatManager == null) { // L: 6154
				class13.friendsChatManager = new FriendsChatManager(class162.loginType, class329.client); // L: 6155
			}

			class13.friendsChatManager.method6655(var1.packetBuffer, var2); // L: 6157
		}

		field612 = cycleCntr; // L: 6160
		ClanChannelMember.FriendsChatManager_inFriendsChat = true; // L: 6161
		var1.serverPacket = null; // L: 6163
		return true; // L: 6164
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Lcx;I)Z",
		garbageValue = "-852059450"
	)
	boolean method1129(PacketWriter var1) {
		if (class13.friendsChatManager != null) { // L: 6168
			class13.friendsChatManager.method6656(var1.packetBuffer); // L: 6169
		}

		field612 = cycleCntr; // L: 6172
		ClanChannelMember.FriendsChatManager_inFriendsChat = true; // L: 6173
		var1.serverPacket = null; // L: 6175
		return true; // L: 6176
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Lcx;I)Z",
		garbageValue = "1555479176"
	)
	final boolean method1386(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6181
		PacketBuffer var3 = var1.packetBuffer; // L: 6182
		if (var2 == null) { // L: 6183
			return false;
		} else {
			int var6;
			String var21;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6185
					if (var1.field1328) { // L: 6186
						if (!var2.isAvailable(1)) { // L: 6187
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6188
						var1.field1332 = 0; // L: 6189
						var1.field1328 = false; // L: 6190
					}

					var3.offset = 0; // L: 6192
					if (var3.method7695()) { // L: 6193
						if (!var2.isAvailable(1)) { // L: 6194
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6195
						var1.field1332 = 0; // L: 6196
					}

					var1.field1328 = true; // L: 6198
					ServerPacket[] var4 = class389.ServerPacket_values(); // L: 6199
					var5 = var3.readSmartByteShortIsaac(); // L: 6200
					if (var5 < 0 || var5 >= var4.length) { // L: 6201
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6202
					var1.serverPacketLength = var1.serverPacket.length; // L: 6203
				}

				if (var1.serverPacketLength == -1) { // L: 6205
					if (!var2.isAvailable(1)) { // L: 6206
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6207
					var1.serverPacketLength = var3.array[0] & 255; // L: 6208
				}

				if (var1.serverPacketLength == -2) { // L: 6210
					if (!var2.isAvailable(2)) { // L: 6211
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6212
					var3.offset = 0; // L: 6213
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6214
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6216
					return false;
				}

				var3.offset = 0; // L: 6217
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6218
				var1.field1332 = 0; // L: 6219
				timer.method6552(); // L: 6220
				var1.field1333 = var1.field1338; // L: 6221
				var1.field1338 = var1.field1339; // L: 6222
				var1.field1339 = var1.serverPacket; // L: 6223
				if (ServerPacket.field3108 == var1.serverPacket) { // L: 6224
					return this.method1128(var1, 1); // L: 6225
				}

				if (ServerPacket.field3118 == var1.serverPacket) { // L: 6227
					if (rootInterface != -1) { // L: 6228
						class220.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 6229
					return true; // L: 6230
				}

				if (ServerPacket.field3073 == var1.serverPacket) { // L: 6232
					ClanChannelMember.method2908(class263.field3021); // L: 6233
					var1.serverPacket = null; // L: 6234
					return true; // L: 6235
				}

				if (ServerPacket.field3077 == var1.serverPacket) { // L: 6237
					class20.method295(var3.readStringCp1252NullTerminated()); // L: 6238
					var1.serverPacket = null; // L: 6239
					return true; // L: 6240
				}

				int var20;
				if (ServerPacket.field3080 == var1.serverPacket) { // L: 6242
					var20 = var3.readInt(); // L: 6243
					var5 = var3.readInt(); // L: 6244
					var6 = UserComparator6.getGcDuration(); // L: 6245
					PacketBufferNode var60 = class433.getPacketBufferNode(ClientPacket.field2985, packetWriter.isaacCipher); // L: 6247
					var60.packetBuffer.method7832(var6); // L: 6248
					var60.packetBuffer.method7785(var20); // L: 6249
					var60.packetBuffer.method7783(var5); // L: 6250
					var60.packetBuffer.writeByte(GameEngine.fps); // L: 6251
					packetWriter.addNode(var60); // L: 6252
					var1.serverPacket = null; // L: 6253
					return true; // L: 6254
				}

				if (ServerPacket.field3131 == var1.serverPacket) { // L: 6256
					ClanChannelMember.method2908(class263.field3024); // L: 6257
					var1.serverPacket = null; // L: 6258
					return true; // L: 6259
				}

				GameObject var14;
				int var15;
				int var16;
				String var24;
				byte var80;
				if (ServerPacket.field3097 == var1.serverPacket) { // L: 6261
					var80 = var3.readByte(); // L: 6262
					var21 = var3.readStringCp1252NullTerminated(); // L: 6263
					long var22 = (long)var3.readUnsignedShort(); // L: 6264
					long var8 = (long)var3.readMedium(); // L: 6265
					PlayerType var61 = (PlayerType)class271.findEnumerated(PlayerType_values(), var3.readUnsignedByte()); // L: 6266
					long var11 = (var22 << 32) + var8; // L: 6267
					boolean var65 = false; // L: 6268
					var14 = null; // L: 6269
					ClanChannel var67 = var80 >= 0 ? currentClanChannels[var80] : class17.guestClanChannel; // L: 6271
					if (var67 == null) { // L: 6272
						var65 = true; // L: 6273
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var61.isUser && MusicPatchPcmStream.friendSystem.isIgnored(new Username(var21, class162.loginType))) { // L: 6282 6283
									var65 = true;
								}
								break;
							}

							if (var11 == field669[var15]) { // L: 6277
								var65 = true; // L: 6278
								break; // L: 6279
							}

							++var15; // L: 6276
						}
					}

					if (!var65) { // L: 6286
						field669[field605] = var11; // L: 6287
						field605 = (field605 + 1) % 100; // L: 6288
						var24 = AbstractFont.escapeBrackets(CollisionMap.method3870(var3)); // L: 6289
						var16 = var80 >= 0 ? 41 : 44; // L: 6290
						if (var61.modIcon != -1) { // L: 6291
							Interpreter.addChatMessage(var16, UrlRequester.method2619(var61.modIcon) + var21, var24, var67.name);
						} else {
							Interpreter.addChatMessage(var16, var21, var24, var67.name); // L: 6292
						}
					}

					var1.serverPacket = null; // L: 6294
					return true; // L: 6295
				}

				int var9;
				int var25;
				int var26;
				int var27;
				int var28;
				if (ServerPacket.field3051 == var1.serverPacket) { // L: 6297
					var25 = var3.readUnsignedShort(); // L: 6306
					var26 = var3.readUnsignedByte(); // L: 6307
					var6 = var3.readMedium(); // L: 6308
					var20 = var6 >> 16; // L: 6309
					var5 = var6 >> 8 & 255; // L: 6310
					var27 = var20 + (var6 >> 4 & 7); // L: 6311
					var28 = var5 + (var6 & 7); // L: 6312
					var9 = var3.readUnsignedShort(); // L: 6313
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) { // L: 6314
						var27 = var27 * 128 + 64; // L: 6315
						var28 = var28 * 128 + 64; // L: 6316
						GraphicsObject var62 = new GraphicsObject(var9, FriendSystem.Client_plane, var27, var28, SecureRandomFuture.getTileHeight(var27, var28, FriendSystem.Client_plane) - var26, var25, cycle); // L: 6317
						graphicsObjects.addFirst(var62); // L: 6318
					}

					var1.serverPacket = null; // L: 6320
					return true; // L: 6321
				}

				long var29;
				long var31;
				long var33;
				long var36;
				String var50;
				if (ServerPacket.field3040 == var1.serverPacket) { // L: 6323
					var50 = var3.readStringCp1252NullTerminated(); // L: 6324
					var29 = var3.readLong(); // L: 6325
					var31 = (long)var3.readUnsignedShort(); // L: 6326
					var33 = (long)var3.readMedium(); // L: 6327
					PlayerType var81 = (PlayerType)class271.findEnumerated(PlayerType_values(), var3.readUnsignedByte()); // L: 6328
					var36 = (var31 << 32) + var33; // L: 6329
					boolean var84 = false; // L: 6330

					for (var15 = 0; var15 < 100; ++var15) { // L: 6331
						if (var36 == field669[var15]) { // L: 6332
							var84 = true; // L: 6333
							break; // L: 6334
						}
					}

					if (var81.isUser && MusicPatchPcmStream.friendSystem.isIgnored(new Username(var50, class162.loginType))) { // L: 6337 6338
						var84 = true;
					}

					if (!var84 && field542 == 0) { // L: 6340
						field669[field605] = var36; // L: 6341
						field605 = (field605 + 1) % 100; // L: 6342
						var24 = AbstractFont.escapeBrackets(class4.method13(CollisionMap.method3870(var3))); // L: 6343
						if (var81.modIcon != -1) { // L: 6344
							Interpreter.addChatMessage(9, UrlRequester.method2619(var81.modIcon) + var50, var24, Script.base37DecodeLong(var29));
						} else {
							Interpreter.addChatMessage(9, var50, var24, Script.base37DecodeLong(var29)); // L: 6345
						}
					}

					var1.serverPacket = null; // L: 6347
					return true; // L: 6348
				}

				if (ServerPacket.field3141 == var1.serverPacket) { // L: 6350
					var20 = var3.method7787(); // L: 6351
					var5 = var3.readInt(); // L: 6352
					var6 = var3.readUnsignedShort(); // L: 6353
					if (var6 == 65535) { // L: 6354
						var6 = -1;
					}

					var27 = var3.method7774(); // L: 6355
					if (var27 == 65535) { // L: 6356
						var27 = -1;
					}

					for (var28 = var27; var28 <= var6; ++var28) { // L: 6357
						var33 = (long)var28 + ((long)var20 << 32); // L: 6358
						Node var35 = widgetFlags.get(var33); // L: 6359
						if (var35 != null) { // L: 6360
							var35.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var33); // L: 6361
					}

					var1.serverPacket = null; // L: 6363
					return true; // L: 6364
				}

				if (ServerPacket.field3049 == var1.serverPacket) { // L: 6366
					ClanChannelMember.method2908(class263.field3027); // L: 6367
					var1.serverPacket = null; // L: 6368
					return true; // L: 6369
				}

				if (ServerPacket.field3126 == var1.serverPacket) { // L: 6371
					if (SoundCache.field327 == null) { // L: 6372
						SoundCache.field327 = new class392(class6.Ignored_cached);
					}

					class451 var53 = class6.Ignored_cached.method7104(var3); // L: 6373
					SoundCache.field327.field4434.vmethod7481(var53.field4771, var53.field4770); // L: 6374
					field689[++field690 - 1 & 31] = var53.field4771; // L: 6375
					var1.serverPacket = null; // L: 6376
					return true; // L: 6377
				}

				int var13;
				int var39;
				if (ServerPacket.field3103 == var1.serverPacket) { // L: 6379
					var9 = var3.method7767(); // L: 6390
					var26 = var9 >> 2; // L: 6391
					var25 = var9 & 3; // L: 6392
					var39 = field556[var26]; // L: 6393
					var6 = var3.method7781(); // L: 6394
					var20 = var6 >> 16; // L: 6395
					var5 = var6 >> 8 & 255; // L: 6396
					var27 = var20 + (var6 >> 4 & 7); // L: 6397
					var28 = var5 + (var6 & 7); // L: 6398
					var13 = var3.method7774(); // L: 6399
					if (var27 >= 0 && var28 >= 0 && var27 < 103 && var28 < 103) { // L: 6400
						if (var39 == 0) { // L: 6401
							WallObject var66 = Decimator.scene.method4129(FriendSystem.Client_plane, var27, var28); // L: 6402
							if (var66 != null) { // L: 6403
								var15 = class141.Entity_unpackID(var66.tag); // L: 6404
								if (var26 == 2) { // L: 6405
									var66.renderable1 = new DynamicObject(var15, 2, var25 + 4, FriendSystem.Client_plane, var27, var28, var13, false, var66.renderable1); // L: 6406
									var66.renderable2 = new DynamicObject(var15, 2, var25 + 1 & 3, FriendSystem.Client_plane, var27, var28, var13, false, var66.renderable2); // L: 6407
								} else {
									var66.renderable1 = new DynamicObject(var15, var26, var25, FriendSystem.Client_plane, var27, var28, var13, false, var66.renderable1); // L: 6409
								}
							}
						} else if (var39 == 1) { // L: 6412
							DecorativeObject var64 = Decimator.scene.method4130(FriendSystem.Client_plane, var27, var28); // L: 6413
							if (var64 != null) { // L: 6414
								var15 = class141.Entity_unpackID(var64.tag); // L: 6415
								if (var26 != 4 && var26 != 5) { // L: 6416
									if (var26 == 6) { // L: 6419
										var64.renderable1 = new DynamicObject(var15, 4, var25 + 4, FriendSystem.Client_plane, var27, var28, var13, false, var64.renderable1); // L: 6420
									} else if (var26 == 7) { // L: 6422
										var64.renderable1 = new DynamicObject(var15, 4, (var25 + 2 & 3) + 4, FriendSystem.Client_plane, var27, var28, var13, false, var64.renderable1); // L: 6423
									} else if (var26 == 8) { // L: 6425
										var64.renderable1 = new DynamicObject(var15, 4, var25 + 4, FriendSystem.Client_plane, var27, var28, var13, false, var64.renderable1); // L: 6426
										var64.renderable2 = new DynamicObject(var15, 4, (var25 + 2 & 3) + 4, FriendSystem.Client_plane, var27, var28, var13, false, var64.renderable2); // L: 6427
									}
								} else {
									var64.renderable1 = new DynamicObject(var15, 4, var25, FriendSystem.Client_plane, var27, var28, var13, false, var64.renderable1); // L: 6417
								}
							}
						} else if (var39 == 2) { // L: 6431
							var14 = Decimator.scene.getGameObject(FriendSystem.Client_plane, var27, var28); // L: 6432
							if (var26 == 11) { // L: 6433
								var26 = 10; // L: 6434
							}

							if (var14 != null) { // L: 6436
								var14.renderable = new DynamicObject(class141.Entity_unpackID(var14.tag), var26, var25, FriendSystem.Client_plane, var27, var28, var13, false, var14.renderable); // L: 6437
							}
						} else if (var39 == 3) { // L: 6440
							GroundObject var63 = Decimator.scene.getGroundObject(FriendSystem.Client_plane, var27, var28); // L: 6441
							if (var63 != null) { // L: 6442
								var63.renderable = new DynamicObject(class141.Entity_unpackID(var63.tag), 22, var25, FriendSystem.Client_plane, var27, var28, var13, false, var63.renderable); // L: 6443
							}
						}
					}

					var1.serverPacket = null; // L: 6447
					return true; // L: 6448
				}

				if (ServerPacket.field3087 == var1.serverPacket) { // L: 6450
					MusicPatchPcmStream.friendSystem.method1733(); // L: 6451
					field750 = cycleCntr; // L: 6452
					var1.serverPacket = null; // L: 6453
					return true; // L: 6454
				}

				Widget var68;
				if (ServerPacket.field3110 == var1.serverPacket) { // L: 6456
					var20 = var3.method7778(); // L: 6457
					var68 = FloorUnderlayDefinition.getWidget(var20); // L: 6458
					var68.modelType = 3; // L: 6459
					var68.modelId = class28.localPlayer.appearance.getChatHeadId(); // L: 6460
					class220.invalidateWidget(var68); // L: 6461
					var1.serverPacket = null; // L: 6462
					return true; // L: 6463
				}

				Widget var40;
				if (ServerPacket.field3128 == var1.serverPacket) { // L: 6465
					var20 = var3.readInt(); // L: 6466
					var5 = var3.readUnsignedShort(); // L: 6467
					if (var20 < -70000) { // L: 6468
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 6470
						var40 = FloorUnderlayDefinition.getWidget(var20);
					} else {
						var40 = null; // L: 6471
					}

					for (; var3.offset < var1.serverPacketLength; WorldMapSection1.itemContainerSetItem(var5, var27, var28 - 1, var9)) { // L: 6472 6486
						var27 = var3.readUShortSmart(); // L: 6473
						var28 = var3.readUnsignedShort(); // L: 6474
						var9 = 0; // L: 6475
						if (var28 != 0) { // L: 6476
							var9 = var3.readUnsignedByte(); // L: 6477
							if (var9 == 255) { // L: 6478
								var9 = var3.readInt();
							}
						}

						if (var40 != null && var27 >= 0 && var27 < var40.itemIds.length) { // L: 6480 6481
							var40.itemIds[var27] = var28; // L: 6482
							var40.itemQuantities[var27] = var9; // L: 6483
						}
					}

					if (var40 != null) { // L: 6488
						class220.invalidateWidget(var40);
					}

					class424.method7495(); // L: 6489
					changedItemContainers[++field686 - 1 & 31] = var5 & 32767; // L: 6490
					var1.serverPacket = null; // L: 6491
					return true; // L: 6492
				}

				if (ServerPacket.field3062 == var1.serverPacket) { // L: 6494
					var50 = var3.readStringCp1252NullTerminated(); // L: 6495
					Object[] var76 = new Object[var50.length() + 1]; // L: 6496

					for (var6 = var50.length() - 1; var6 >= 0; --var6) { // L: 6497
						if (var50.charAt(var6) == 's') { // L: 6498
							var76[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var76[var6 + 1] = new Integer(var3.readInt()); // L: 6499
						}
					}

					var76[0] = new Integer(var3.readInt()); // L: 6501
					ScriptEvent var91 = new ScriptEvent(); // L: 6502
					var91.args = var76; // L: 6503
					class17.runScriptEvent(var91); // L: 6504
					var1.serverPacket = null; // L: 6505
					return true; // L: 6506
				}

				if (ServerPacket.field3094 == var1.serverPacket) { // L: 6508
					SoundCache.field327 = null; // L: 6509
					var1.serverPacket = null; // L: 6510
					return true; // L: 6511
				}

				int var38;
				String var41;
				if (ServerPacket.field3115 == var1.serverPacket) { // L: 6513
					var80 = var3.readByte(); // L: 6514
					var29 = (long)var3.readUnsignedShort(); // L: 6515
					var31 = (long)var3.readMedium(); // L: 6516
					var33 = (var29 << 32) + var31; // L: 6517
					boolean var77 = false; // L: 6518
					ClanChannel var12 = var80 >= 0 ? currentClanChannels[var80] : class17.guestClanChannel; // L: 6519
					if (var12 == null) { // L: 6520
						var77 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 6522
							if (field669[var13] == var33) { // L: 6523
								var77 = true; // L: 6524
								break; // L: 6525
							}
						}
					}

					if (!var77) { // L: 6529
						field669[field605] = var33; // L: 6530
						field605 = (field605 + 1) % 100; // L: 6531
						var41 = CollisionMap.method3870(var3); // L: 6532
						var38 = var80 >= 0 ? 43 : 46; // L: 6533
						Interpreter.addChatMessage(var38, "", var41, var12.name); // L: 6534
					}

					var1.serverPacket = null; // L: 6536
					return true; // L: 6537
				}

				if (ServerPacket.field3119 == var1.serverPacket) { // L: 6539
					MilliClock.method3292(); // L: 6540
					var80 = var3.readByte(); // L: 6541
					if (var1.serverPacketLength == 1) { // L: 6542
						if (var80 >= 0) { // L: 6543
							currentClanSettings[var80] = null;
						} else {
							SecureRandomCallable.guestClanSettings = null; // L: 6544
						}

						var1.serverPacket = null; // L: 6545
						return true; // L: 6546
					}

					if (var80 >= 0) { // L: 6548
						currentClanSettings[var80] = new ClanSettings(var3); // L: 6549
					} else {
						SecureRandomCallable.guestClanSettings = new ClanSettings(var3); // L: 6552
					}

					var1.serverPacket = null; // L: 6554
					return true; // L: 6555
				}

				if (ServerPacket.field3109 == var1.serverPacket) { // L: 6557
					var20 = var3.readUnsignedByte(); // L: 6558
					class240.method4994(var20); // L: 6559
					var1.serverPacket = null; // L: 6560
					return true; // L: 6561
				}

				if (ServerPacket.field3104 == var1.serverPacket) { // L: 6563
					for (var20 = 0; var20 < VarpDefinition.field1811; ++var20) { // L: 6564
						VarpDefinition var75 = MouseRecorder.VarpDefinition_get(var20); // L: 6565
						if (var75 != null) { // L: 6566
							Varps.Varps_temp[var20] = 0; // L: 6567
							Varps.Varps_main[var20] = 0; // L: 6568
						}
					}

					class424.method7495(); // L: 6571
					changedVarpCount += 32; // L: 6572
					var1.serverPacket = null; // L: 6573
					return true; // L: 6574
				}

				if (ServerPacket.field3117 == var1.serverPacket) { // L: 6576
					isCameraLocked = false; // L: 6577

					for (var20 = 0; var20 < 5; ++var20) { // L: 6578
						field678[var20] = false;
					}

					var1.serverPacket = null; // L: 6579
					return true; // L: 6580
				}

				if (ServerPacket.field3082 == var1.serverPacket) { // L: 6582
					var50 = var3.readStringCp1252NullTerminated(); // L: 6583
					var29 = (long)var3.readUnsignedShort(); // L: 6584
					var31 = (long)var3.readMedium(); // L: 6585
					PlayerType var42 = (PlayerType)class271.findEnumerated(PlayerType_values(), var3.readUnsignedByte()); // L: 6586
					long var43 = (var29 << 32) + var31; // L: 6587
					boolean var83 = false; // L: 6588

					for (var13 = 0; var13 < 100; ++var13) { // L: 6589
						if (var43 == field669[var13]) { // L: 6590
							var83 = true; // L: 6591
							break; // L: 6592
						}
					}

					if (MusicPatchPcmStream.friendSystem.isIgnored(new Username(var50, class162.loginType))) { // L: 6595
						var83 = true;
					}

					if (!var83 && field542 == 0) { // L: 6596
						field669[field605] = var43; // L: 6597
						field605 = (field605 + 1) % 100; // L: 6598
						var41 = AbstractFont.escapeBrackets(class4.method13(CollisionMap.method3870(var3))); // L: 6599
						byte var82;
						if (var42.isPrivileged) { // L: 6601
							var82 = 7;
						} else {
							var82 = 3; // L: 6602
						}

						if (var42.modIcon != -1) { // L: 6603
							FileSystem.addGameMessage(var82, UrlRequester.method2619(var42.modIcon) + var50, var41);
						} else {
							FileSystem.addGameMessage(var82, var50, var41); // L: 6604
						}
					}

					var1.serverPacket = null; // L: 6606
					return true; // L: 6607
				}

				if (ServerPacket.field3056 == var1.serverPacket) { // L: 6609
					int var18 = var3.method7908(); // L: 6625
					var38 = var3.method7908() * 4; // L: 6626
					var25 = var3.method7763(); // L: 6627
					var16 = var3.method7774(); // L: 6628
					var39 = var3.method7741(); // L: 6629
					var13 = var3.readUnsignedByte() * 4; // L: 6630
					byte var78 = var3.method7769(); // L: 6631
					int var17 = var3.method7766(); // L: 6632
					var6 = var3.method7909(); // L: 6633
					var20 = var6 >> 16; // L: 6634
					var5 = var6 >> 8 & 255; // L: 6635
					var27 = var20 + (var6 >> 4 & 7); // L: 6636
					var28 = var5 + (var6 & 7); // L: 6637
					byte var59 = var3.method7743(); // L: 6638
					var15 = var3.method7774(); // L: 6639
					var9 = var59 + var27; // L: 6640
					var26 = var78 + var28; // L: 6641
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && var9 >= 0 && var26 >= 0 && var9 < 104 && var26 < 104 && var39 != 65535) { // L: 6642
						var27 = var27 * 128 + 64; // L: 6643
						var28 = var28 * 128 + 64; // L: 6644
						var9 = var9 * 128 + 64; // L: 6645
						var26 = var26 * 128 + 64; // L: 6646
						Projectile var19 = new Projectile(var39, FriendSystem.Client_plane, var27, var28, SecureRandomFuture.getTileHeight(var27, var28, FriendSystem.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var25, var38); // L: 6647
						var19.setDestination(var9, var26, SecureRandomFuture.getTileHeight(var9, var26, FriendSystem.Client_plane) - var38, var15 + cycle); // L: 6648
						projectiles.addFirst(var19); // L: 6649
					}

					var1.serverPacket = null; // L: 6651
					return true; // L: 6652
				}

				if (ServerPacket.field3043 == var1.serverPacket) { // L: 6654
					field755 = cycleCntr; // L: 6655
					var80 = var3.readByte(); // L: 6656
					if (var1.serverPacketLength == 1) { // L: 6657
						if (var80 >= 0) { // L: 6658
							currentClanChannels[var80] = null;
						} else {
							class17.guestClanChannel = null; // L: 6659
						}

						var1.serverPacket = null; // L: 6660
						return true; // L: 6661
					}

					if (var80 >= 0) { // L: 6663
						currentClanChannels[var80] = new ClanChannel(var3); // L: 6664
					} else {
						class17.guestClanChannel = new ClanChannel(var3); // L: 6667
					}

					var1.serverPacket = null; // L: 6669
					return true; // L: 6670
				}

				if (ServerPacket.field3116 == var1.serverPacket) { // L: 6672
					class433.logOut(); // L: 6673
					var1.serverPacket = null; // L: 6674
					return false; // L: 6675
				}

				if (ServerPacket.field3059 == var1.serverPacket) { // L: 6677
					NPC.loadRegions(true, var1.packetBuffer); // L: 6678
					var1.serverPacket = null; // L: 6679
					return true; // L: 6680
				}

				if (ServerPacket.field3052 == var1.serverPacket) { // L: 6682
					NPC.loadRegions(false, var1.packetBuffer); // L: 6683
					var1.serverPacket = null; // L: 6684
					return true; // L: 6685
				}

				if (ServerPacket.field3096 == var1.serverPacket) { // L: 6687
					ClanChannelMember.method2908(class263.field3028); // L: 6688
					var1.serverPacket = null; // L: 6689
					return true; // L: 6690
				}

				if (ServerPacket.field3081 == var1.serverPacket) { // L: 6692
					SoundCache.field327 = new class392(class6.Ignored_cached); // L: 6693
					var1.serverPacket = null; // L: 6694
					return true; // L: 6695
				}

				if (ServerPacket.field3050 == var1.serverPacket) { // L: 6697
					ScriptFrame.field462 = true; // L: 6698
					class145.updateNpcs(true, var3); // L: 6699
					var1.serverPacket = null; // L: 6700
					return true; // L: 6701
				}

				if (ServerPacket.field3088 == var1.serverPacket) { // L: 6703
					var20 = var3.readInt(); // L: 6704
					if (var20 != field698) { // L: 6705
						field698 = var20; // L: 6706
						class9.method82(); // L: 6707
					}

					var1.serverPacket = null; // L: 6709
					return true; // L: 6710
				}

				boolean var73;
				if (ServerPacket.field3061 == var1.serverPacket) { // L: 6712
					var73 = var3.readUnsignedByte() == 1; // L: 6713
					if (var73) { // L: 6714
						class20.field116 = class131.method2916() - var3.readLong(); // L: 6715
						class302.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 6716
					} else {
						class302.grandExchangeEvents = null; // L: 6718
					}

					field697 = cycleCntr; // L: 6719
					var1.serverPacket = null; // L: 6720
					return true; // L: 6721
				}

				if (ServerPacket.field3075 == var1.serverPacket) { // L: 6723
					HealthBarDefinition.updatePlayers(var3, var1.serverPacketLength); // L: 6724
					Archive.method5847(); // L: 6725
					var1.serverPacket = null; // L: 6726
					return true; // L: 6727
				}

				if (ServerPacket.field3091 == var1.serverPacket) { // L: 6729
					class10.field58 = var3.readUnsignedByte(); // L: 6730
					class326.field4097 = var3.readUnsignedByte(); // L: 6731
					var1.serverPacket = null; // L: 6732
					return true; // L: 6733
				}

				if (ServerPacket.field3114 == var1.serverPacket) { // L: 6735
					return this.method1129(var1); // L: 6736
				}

				if (ServerPacket.field3068 == var1.serverPacket) { // L: 6738
					ItemLayer.privateChatMode = class119.method2819(var3.readUnsignedByte()); // L: 6739
					var1.serverPacket = null; // L: 6740
					return true; // L: 6741
				}

				if (ServerPacket.field3095 == var1.serverPacket) { // L: 6743
					var20 = var3.readUnsignedByte(); // L: 6744
					if (var3.readUnsignedByte() == 0) { // L: 6745
						grandExchangeOffers[var20] = new GrandExchangeOffer(); // L: 6746
						var3.offset += 18; // L: 6747
					} else {
						--var3.offset; // L: 6750
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false); // L: 6751
					}

					field696 = cycleCntr; // L: 6753
					var1.serverPacket = null; // L: 6754
					return true; // L: 6755
				}

				InterfaceParent var56;
				if (ServerPacket.field3044 == var1.serverPacket) { // L: 6757
					var20 = var3.offset + var1.serverPacketLength; // L: 6758
					var5 = var3.readUnsignedShort(); // L: 6759
					var6 = var3.readUnsignedShort(); // L: 6760
					if (var5 != rootInterface) { // L: 6761
						rootInterface = var5; // L: 6762
						this.resizeRoot(false); // L: 6763
						WorldMapIcon_0.Widget_resetModelFrames(rootInterface); // L: 6764
						KeyHandler.runWidgetOnLoadListener(rootInterface); // L: 6765

						for (var27 = 0; var27 < 100; ++var27) { // L: 6766
							field610[var27] = true;
						}
					}

					InterfaceParent var58;
					for (; var6-- > 0; var58.field1035 = true) { // L: 6768 6778
						var27 = var3.readInt(); // L: 6769
						var28 = var3.readUnsignedShort(); // L: 6770
						var9 = var3.readUnsignedByte(); // L: 6771
						var58 = (InterfaceParent)interfaceParents.get((long)var27); // L: 6772
						if (var58 != null && var28 != var58.group) { // L: 6773
							Canvas.closeInterface(var58, true); // L: 6774
							var58 = null; // L: 6775
						}

						if (var58 == null) { // L: 6777
							var58 = class258.method5185(var27, var28, var9);
						}
					}

					for (var56 = (InterfaceParent)interfaceParents.first(); var56 != null; var56 = (InterfaceParent)interfaceParents.next()) { // L: 6780
						if (var56.field1035) { // L: 6781
							var56.field1035 = false;
						} else {
							Canvas.closeInterface(var56, true); // L: 6783
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6786

					while (var3.offset < var20) { // L: 6787
						var27 = var3.readInt(); // L: 6788
						var28 = var3.readUnsignedShort(); // L: 6789
						var9 = var3.readUnsignedShort(); // L: 6790
						var26 = var3.readInt(); // L: 6791

						for (var25 = var28; var25 <= var9; ++var25) { // L: 6792
							var36 = (long)var25 + ((long)var27 << 32); // L: 6793
							widgetFlags.put(new IntegerNode(var26), var36); // L: 6794
						}
					}

					var1.serverPacket = null; // L: 6797
					return true; // L: 6798
				}

				if (ServerPacket.field3106 == var1.serverPacket) { // L: 6800
					MusicPatchPcmStream.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 6801
					field750 = cycleCntr; // L: 6802
					var1.serverPacket = null; // L: 6803
					return true; // L: 6804
				}

				if (ServerPacket.field3121 == var1.serverPacket) { // L: 6806
					var20 = var3.readUnsignedShort(); // L: 6807
					var5 = var3.method7786(); // L: 6808
					var40 = FloorUnderlayDefinition.getWidget(var5); // L: 6809
					if (var40.modelType != 1 || var20 != var40.modelId) { // L: 6810
						var40.modelType = 1; // L: 6811
						var40.modelId = var20; // L: 6812
						class220.invalidateWidget(var40); // L: 6813
					}

					var1.serverPacket = null; // L: 6815
					return true; // L: 6816
				}

				if (ServerPacket.field3089 == var1.serverPacket) { // L: 6818
					var20 = var3.method7786(); // L: 6819
					var5 = var3.readUnsignedShort(); // L: 6820
					var40 = FloorUnderlayDefinition.getWidget(var20); // L: 6821
					if (var40.modelType != 2 || var5 != var40.modelId) { // L: 6822
						var40.modelType = 2; // L: 6823
						var40.modelId = var5; // L: 6824
						class220.invalidateWidget(var40); // L: 6825
					}

					var1.serverPacket = null; // L: 6827
					return true; // L: 6828
				}

				if (ServerPacket.field3112 == var1.serverPacket) { // L: 6830
					isCameraLocked = true; // L: 6831
					field745 = false; // L: 6832
					WorldMapLabelSize.field2673 = var3.readUnsignedByte() * 16384; // L: 6833
					LoginScreenAnimation.field1233 = var3.readUnsignedByte() * 16384; // L: 6834
					UrlRequest.field1350 = var3.readUnsignedShort(); // L: 6835
					class83.field1082 = var3.readUnsignedByte(); // L: 6836
					ScriptFrame.field459 = var3.readUnsignedByte(); // L: 6837
					if (ScriptFrame.field459 >= 100) { // L: 6838
						var20 = WorldMapLabelSize.field2673 * 128 + 64; // L: 6839
						var5 = LoginScreenAnimation.field1233 * 128 + 64; // L: 6840
						var6 = SecureRandomFuture.getTileHeight(var20, var5, FriendSystem.Client_plane) - UrlRequest.field1350; // L: 6841
						var27 = var20 - WorldMapLabelSize.cameraX; // L: 6842
						var28 = var6 - class123.cameraY; // L: 6843
						var9 = var5 - Widget.cameraZ; // L: 6844
						var26 = (int)Math.sqrt((double)(var9 * var9 + var27 * var27)); // L: 6845
						UserComparator9.cameraPitch = (int)(Math.atan2((double)var28, (double)var26) * 325.9490051269531D) & 2047; // L: 6846
						PendingSpawn.cameraYaw = (int)(Math.atan2((double)var27, (double)var9) * -325.9490051269531D) & 2047; // L: 6847
						if (UserComparator9.cameraPitch < 128) { // L: 6848
							UserComparator9.cameraPitch = 128;
						}

						if (UserComparator9.cameraPitch > 383) { // L: 6849
							UserComparator9.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 6851
					return true; // L: 6852
				}

				if (ServerPacket.field3060 == var1.serverPacket) { // L: 6854
					ClanChannelMember.method2908(class263.field3025); // L: 6855
					var1.serverPacket = null; // L: 6856
					return true; // L: 6857
				}

				if (ServerPacket.field3069 == var1.serverPacket) { // L: 6859
					ClanChannelMember.method2908(class263.field3019); // L: 6860
					var1.serverPacket = null; // L: 6861
					return true; // L: 6862
				}

				NPC var55;
				if (ServerPacket.field3136 == var1.serverPacket) { // L: 6864
					var6 = var3.method7767(); // L: 6868
					var5 = var3.method7776(); // L: 6869
					var20 = var3.method7776(); // L: 6870
					if (var5 == 65535) { // L: 6871
						var5 = -1; // L: 6872
					}

					var55 = npcs[var20]; // L: 6874
					if (var55 != null) { // L: 6875
						if (var5 == var55.sequence && var5 != -1) { // L: 6876
							var28 = class14.SequenceDefinition_get(var5).field2175; // L: 6877
							if (var28 == 1) { // L: 6878
								var55.sequenceFrame = 0; // L: 6879
								var55.sequenceFrameCycle = 0; // L: 6880
								var55.sequenceDelay = var6; // L: 6881
								var55.field1174 = 0; // L: 6882
							} else if (var28 == 2) { // L: 6884
								var55.field1174 = 0; // L: 6885
							}
						} else if (var5 == -1 || var55.sequence == -1 || class14.SequenceDefinition_get(var5).field2168 >= class14.SequenceDefinition_get(var55.sequence).field2168) { // L: 6888
							var55.sequence = var5; // L: 6889
							var55.sequenceFrame = 0; // L: 6890
							var55.sequenceFrameCycle = 0; // L: 6891
							var55.sequenceDelay = var6; // L: 6892
							var55.field1174 = 0; // L: 6893
							var55.field1203 = var55.pathLength; // L: 6894
						}
					}

					var1.serverPacket = null; // L: 6898
					return true; // L: 6899
				}

				if (ServerPacket.field3140 == var1.serverPacket) { // L: 6901
					MilliClock.method3292(); // L: 6902
					var80 = var3.readByte(); // L: 6903
					class131 var74 = new class131(var3); // L: 6904
					ClanSettings var88;
					if (var80 >= 0) { // L: 6906
						var88 = currentClanSettings[var80];
					} else {
						var88 = SecureRandomCallable.guestClanSettings; // L: 6907
					}

					var74.method2911(var88); // L: 6908
					var1.serverPacket = null; // L: 6909
					return true; // L: 6910
				}

				if (ServerPacket.field3053 == var1.serverPacket) { // L: 6912
					var20 = var3.readUnsignedShort(); // L: 6913
					var5 = var3.method7778(); // L: 6914
					Varps.Varps_temp[var20] = var5; // L: 6915
					if (Varps.Varps_main[var20] != var5) { // L: 6916
						Varps.Varps_main[var20] = var5; // L: 6917
					}

					class155.changeGameOptions(var20); // L: 6919
					changedVarps[++changedVarpCount - 1 & 31] = var20; // L: 6920
					var1.serverPacket = null; // L: 6921
					return true; // L: 6922
				}

				if (ServerPacket.field3132 == var1.serverPacket) { // L: 6924
					var20 = var3.readUnsignedShort(); // L: 6925
					if (var20 == 65535) { // L: 6926
						var20 = -1;
					}

					class1.playSong(var20); // L: 6927
					var1.serverPacket = null; // L: 6928
					return true; // L: 6929
				}

				if (ServerPacket.field3107 == var1.serverPacket) { // L: 6931
					var20 = var3.readUnsignedShort(); // L: 6932
					if (var20 == 65535) { // L: 6933
						var20 = -1;
					}

					var5 = var3.method7909(); // L: 6934
					MouseRecorder.method2170(var20, var5); // L: 6935
					var1.serverPacket = null; // L: 6936
					return true; // L: 6937
				}

				Widget var45;
				if (ServerPacket.field3083 == var1.serverPacket) { // L: 6939
					var20 = var3.method7786(); // L: 6940
					var5 = var3.method7778(); // L: 6941
					InterfaceParent var87 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6942
					var56 = (InterfaceParent)interfaceParents.get((long)var20); // L: 6943
					if (var56 != null) { // L: 6944
						Canvas.closeInterface(var56, var87 == null || var87.group != var56.group);
					}

					if (var87 != null) { // L: 6945
						var87.remove(); // L: 6946
						interfaceParents.put(var87, (long)var20); // L: 6947
					}

					var45 = FloorUnderlayDefinition.getWidget(var5); // L: 6949
					if (var45 != null) { // L: 6950
						class220.invalidateWidget(var45);
					}

					var45 = FloorUnderlayDefinition.getWidget(var20); // L: 6951
					if (var45 != null) { // L: 6952
						class220.invalidateWidget(var45); // L: 6953
						class439.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var45.id >>> 16], var45, true); // L: 6954
					}

					if (rootInterface != -1) { // L: 6956
						class220.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 6957
					return true; // L: 6958
				}

				if (ServerPacket.field3047 == var1.serverPacket) { // L: 6960
					ClanChannelMember.method2908(class263.field3026); // L: 6961
					var1.serverPacket = null; // L: 6962
					return true; // L: 6963
				}

				if (ServerPacket.field3072 == var1.serverPacket) { // L: 6965
					class424.method7495(); // L: 6966
					var20 = var3.readUnsignedByte(); // L: 6967
					var5 = var3.method7766(); // L: 6968
					var6 = var3.readInt(); // L: 6969
					experience[var5] = var6; // L: 6970
					currentLevels[var5] = var20; // L: 6971
					levels[var5] = 1; // L: 6972

					for (var27 = 0; var27 < 98; ++var27) { // L: 6973
						if (var6 >= Skills.Skills_experienceTable[var27]) {
							levels[var5] = var27 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5; // L: 6974
					var1.serverPacket = null; // L: 6975
					return true; // L: 6976
				}

				if (ServerPacket.field3037 == var1.serverPacket) { // L: 6978
					rebootTimer = var3.method7776() * 30; // L: 6979
					field726 = cycleCntr; // L: 6980
					var1.serverPacket = null; // L: 6981
					return true; // L: 6982
				}

				if (ServerPacket.field3133 == var1.serverPacket) { // L: 6984
					var50 = var3.readStringCp1252NullTerminated(); // L: 6985
					var5 = var3.readInt(); // L: 6986
					var40 = FloorUnderlayDefinition.getWidget(var5); // L: 6987
					if (!var50.equals(var40.text)) { // L: 6988
						var40.text = var50; // L: 6989
						class220.invalidateWidget(var40); // L: 6990
					}

					var1.serverPacket = null; // L: 6992
					return true; // L: 6993
				}

				if (ServerPacket.field3105 == var1.serverPacket) { // L: 6995
					var20 = var3.readUnsignedShort(); // L: 6996
					var5 = var3.readUnsignedByte(); // L: 6997
					var6 = var3.readUnsignedShort(); // L: 6998
					class174.queueSoundEffect(var20, var5, var6); // L: 6999
					var1.serverPacket = null; // L: 7000
					return true; // L: 7001
				}

				if (ServerPacket.field3063 == var1.serverPacket) { // L: 7003
					class424.method7495(); // L: 7004
					weight = var3.readShort(); // L: 7005
					field726 = cycleCntr; // L: 7006
					var1.serverPacket = null; // L: 7007
					return true; // L: 7008
				}

				if (ServerPacket.field3123 == var1.serverPacket) { // L: 7010
					isCameraLocked = true; // L: 7011
					field745 = false; // L: 7012
					class457.field4811 = var3.readUnsignedByte() * 128; // L: 7013
					NPC.field1261 = var3.readUnsignedByte() * 16384; // L: 7014
					ScriptEvent.field1052 = var3.readUnsignedShort(); // L: 7015
					class115.field1419 = var3.readUnsignedByte(); // L: 7016
					SoundCache.field325 = var3.readUnsignedByte(); // L: 7017
					if (SoundCache.field325 >= 100) { // L: 7018
						WorldMapLabelSize.cameraX = class457.field4811 * 16384 + 64; // L: 7019
						Widget.cameraZ = NPC.field1261 * 128 + 64; // L: 7020
						class123.cameraY = SecureRandomFuture.getTileHeight(WorldMapLabelSize.cameraX, Widget.cameraZ, FriendSystem.Client_plane) - ScriptEvent.field1052; // L: 7021
					}

					var1.serverPacket = null; // L: 7023
					return true; // L: 7024
				}

				Widget var54;
				if (ServerPacket.field3074 == var1.serverPacket) { // L: 7026
					var20 = var3.readInt(); // L: 7027
					var5 = var3.readUnsignedShort(); // L: 7028
					if (var5 == 65535) { // L: 7029
						var5 = -1;
					}

					var6 = var3.method7778(); // L: 7030
					var54 = FloorUnderlayDefinition.getWidget(var6); // L: 7031
					ItemComposition var90;
					if (!var54.isIf3) { // L: 7032
						if (var5 == -1) { // L: 7033
							var54.modelType = 0; // L: 7034
							var1.serverPacket = null; // L: 7035
							return true; // L: 7036
						}

						var90 = class258.ItemComposition_get(var5); // L: 7038
						var54.modelType = 4; // L: 7039
						var54.modelId = var5; // L: 7040
						var54.modelAngleX = var90.xan2d; // L: 7041
						var54.modelAngleY = var90.yan2d; // L: 7042
						var54.modelZoom = var90.zoom2d * 100 / var20; // L: 7043
						class220.invalidateWidget(var54); // L: 7044
					} else {
						var54.itemId = var5; // L: 7047
						var54.itemQuantity = var20; // L: 7048
						var90 = class258.ItemComposition_get(var5); // L: 7049
						var54.modelAngleX = var90.xan2d; // L: 7050
						var54.modelAngleY = var90.yan2d; // L: 7051
						var54.modelAngleZ = var90.zan2d; // L: 7052
						var54.modelOffsetX = var90.offsetX2d; // L: 7053
						var54.modelOffsetY = var90.offsetY2d; // L: 7054
						var54.modelZoom = var90.zoom2d; // L: 7055
						if (var90.isStackable == 1) { // L: 7056
							var54.itemQuantityMode = 1;
						} else {
							var54.itemQuantityMode = 2; // L: 7057
						}

						if (var54.field3421 > 0) { // L: 7058
							var54.modelZoom = var54.modelZoom * 32 / var54.field3421;
						} else if (var54.rawWidth > 0) { // L: 7059
							var54.modelZoom = var54.modelZoom * 32 / var54.rawWidth;
						}

						class220.invalidateWidget(var54); // L: 7060
					}

					var1.serverPacket = null; // L: 7062
					return true; // L: 7063
				}

				if (ServerPacket.field3129 == var1.serverPacket) { // L: 7065
					field755 = cycleCntr; // L: 7066
					var80 = var3.readByte(); // L: 7067
					class145 var72 = new class145(var3); // L: 7068
					ClanChannel var86;
					if (var80 >= 0) { // L: 7070
						var86 = currentClanChannels[var80];
					} else {
						var86 = class17.guestClanChannel; // L: 7071
					}

					var72.method3095(var86); // L: 7072
					var1.serverPacket = null; // L: 7073
					return true; // L: 7074
				}

				if (ServerPacket.field3102 == var1.serverPacket) { // L: 7076
					class145.updateNpcs(true, var3); // L: 7077
					var1.serverPacket = null; // L: 7078
					return true; // L: 7079
				}

				if (ServerPacket.field3065 == var1.serverPacket) { // L: 7081
					ClanChannelMember.method2908(class263.field3022); // L: 7082
					var1.serverPacket = null; // L: 7083
					return true; // L: 7084
				}

				if (ServerPacket.field3055 == var1.serverPacket) { // L: 7086
					var73 = var3.method7908() == 1; // L: 7087
					var5 = var3.readInt(); // L: 7088
					var40 = FloorUnderlayDefinition.getWidget(var5); // L: 7089
					if (var73 != var40.isHidden) { // L: 7090
						var40.isHidden = var73; // L: 7091
						class220.invalidateWidget(var40); // L: 7092
					}

					var1.serverPacket = null; // L: 7094
					return true; // L: 7095
				}

				if (ServerPacket.field3100 == var1.serverPacket) { // L: 7097
					class326.field4097 = var3.method7908(); // L: 7098
					class10.field58 = var3.method7908(); // L: 7099

					while (var3.offset < var1.serverPacketLength) { // L: 7100
						var20 = var3.readUnsignedByte(); // L: 7101
						class263 var71 = UserComparator10.method2689()[var20]; // L: 7102
						ClanChannelMember.method2908(var71); // L: 7103
					}

					var1.serverPacket = null; // L: 7105
					return true; // L: 7106
				}

				if (ServerPacket.field3042 == var1.serverPacket) { // L: 7108
					publicChatMode = var3.method7908(); // L: 7109
					tradeChatMode = var3.method7766(); // L: 7110
					var1.serverPacket = null; // L: 7111
					return true; // L: 7112
				}

				if (ServerPacket.field3058 == var1.serverPacket) { // L: 7114
					for (var20 = 0; var20 < players.length; ++var20) { // L: 7115
						if (players[var20] != null) { // L: 7116
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) { // L: 7118
						if (npcs[var20] != null) { // L: 7119
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 7121
					return true; // L: 7122
				}

				if (ServerPacket.field3071 == var1.serverPacket) { // L: 7124
					var20 = var3.readUnsignedShort(); // L: 7125
					var5 = var3.method7766(); // L: 7126
					var6 = var3.readInt(); // L: 7127
					var56 = (InterfaceParent)interfaceParents.get((long)var6); // L: 7128
					if (var56 != null) { // L: 7129
						Canvas.closeInterface(var56, var20 != var56.group);
					}

					class258.method5185(var6, var20, var5); // L: 7130
					var1.serverPacket = null; // L: 7131
					return true; // L: 7132
				}

				if (ServerPacket.field3045 == var1.serverPacket) { // L: 7134
					var20 = var3.method7741(); // L: 7139
					var55 = npcs[var20]; // L: 7140
					var5 = var3.method7786(); // L: 7141
					var6 = var3.method7774(); // L: 7142
					if (var55 != null) { // L: 7143
						var55.spotAnimation = var6; // L: 7144
						var55.field1128 = var5 >> 16; // L: 7145
						var55.field1178 = (var5 & 65535) + cycle; // L: 7146
						var55.spotAnimationFrame = 0; // L: 7147
						var55.field1201 = 0; // L: 7148
						if (var55.field1178 > cycle) { // L: 7149
							var55.spotAnimationFrame = -1; // L: 7150
						}

						if (var55.spotAnimation == 65535) { // L: 7152
							var55.spotAnimation = -1; // L: 7153
						}
					}

					var1.serverPacket = null; // L: 7156
					return true; // L: 7157
				}

				if (ServerPacket.field3101 == var1.serverPacket) { // L: 7159
					var20 = var3.method7778(); // L: 7160
					var5 = var3.readUnsignedShort(); // L: 7161
					var40 = FloorUnderlayDefinition.getWidget(var20); // L: 7162
					if (var40 != null && var40.type == 0) { // L: 7163
						if (var5 > var40.scrollHeight - var40.height) { // L: 7164
							var5 = var40.scrollHeight - var40.height;
						}

						if (var5 < 0) { // L: 7165
							var5 = 0;
						}

						if (var5 != var40.scrollY) { // L: 7166
							var40.scrollY = var5; // L: 7167
							class220.invalidateWidget(var40); // L: 7168
						}
					}

					var1.serverPacket = null; // L: 7171
					return true; // L: 7172
				}

				if (ServerPacket.field3111 == var1.serverPacket) { // L: 7174
					var20 = var3.method7741(); // L: 7175
					class78.method2159(var20); // L: 7176
					changedItemContainers[++field686 - 1 & 31] = var20 & 32767; // L: 7177
					var1.serverPacket = null; // L: 7178
					return true; // L: 7179
				}

				if (ServerPacket.field3127 == var1.serverPacket) { // L: 7181
					var20 = var3.method7778(); // L: 7182
					var5 = var3.method7986(); // L: 7183
					var40 = FloorUnderlayDefinition.getWidget(var20); // L: 7184
					if (var5 != var40.sequenceId || var5 == -1) { // L: 7185
						var40.sequenceId = var5; // L: 7186
						var40.modelFrame = 0; // L: 7187
						var40.modelFrameCycle = 0; // L: 7188
						class220.invalidateWidget(var40); // L: 7189
					}

					var1.serverPacket = null; // L: 7191
					return true; // L: 7192
				}

				if (ServerPacket.field3098 == var1.serverPacket) { // L: 7194
					class326.field4097 = var3.readUnsignedByte(); // L: 7195
					class10.field58 = var3.method7766(); // L: 7196

					for (var20 = class326.field4097; var20 < class326.field4097 + 8; ++var20) { // L: 7197
						for (var5 = class10.field58; var5 < class10.field58 + 8; ++var5) { // L: 7198
							if (groundItems[FriendSystem.Client_plane][var20][var5] != null) { // L: 7199
								groundItems[FriendSystem.Client_plane][var20][var5] = null; // L: 7200
								WorldMapManager.updateItemPile(var20, var5); // L: 7201
							}
						}
					}

					for (PendingSpawn var51 = (PendingSpawn)pendingSpawns.last(); var51 != null; var51 = (PendingSpawn)pendingSpawns.previous()) { // L: 7205 7206 7208
						if (var51.x >= class326.field4097 && var51.x < class326.field4097 + 8 && var51.y >= class10.field58 && var51.y < class10.field58 + 8 && var51.plane == FriendSystem.Client_plane) { // L: 7207
							var51.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 7210
					return true; // L: 7211
				}

				if (ServerPacket.field3038 == var1.serverPacket) { // L: 7213
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) { // L: 7214
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) { // L: 7215
							Varps.Varps_main[var20] = Varps.Varps_temp[var20]; // L: 7216
							class155.changeGameOptions(var20); // L: 7217
							changedVarps[++changedVarpCount - 1 & 31] = var20; // L: 7218
						}
					}

					var1.serverPacket = null; // L: 7221
					return true; // L: 7222
				}

				if (ServerPacket.field3067 == var1.serverPacket) { // L: 7224
					var20 = var3.method7767(); // L: 7225
					var21 = var3.readStringCp1252NullTerminated(); // L: 7226
					var6 = var3.method7766(); // L: 7227
					if (var20 >= 1 && var20 <= 8) { // L: 7228
						if (var21.equalsIgnoreCase("null")) { // L: 7229
							var21 = null;
						}

						playerMenuActions[var20 - 1] = var21; // L: 7230
						playerOptionsPriorities[var20 - 1] = var6 == 0; // L: 7231
					}

					var1.serverPacket = null; // L: 7233
					return true; // L: 7234
				}

				if (ServerPacket.field3084 == var1.serverPacket) { // L: 7236
					var50 = var3.readStringCp1252NullTerminated(); // L: 7237
					var21 = AbstractFont.escapeBrackets(class4.method13(CollisionMap.method3870(var3))); // L: 7238
					FileSystem.addGameMessage(6, var50, var21); // L: 7239
					var1.serverPacket = null; // L: 7240
					return true; // L: 7241
				}

				if (ServerPacket.field3057 == var1.serverPacket) { // L: 7243
					class145.updateNpcs(false, var3); // L: 7244
					var1.serverPacket = null; // L: 7245
					return true; // L: 7246
				}

				if (ServerPacket.field3066 == var1.serverPacket) { // L: 7248
					var20 = var3.method7776(); // L: 7249
					var5 = var3.method7778(); // L: 7250
					var6 = var3.method7776(); // L: 7251
					var54 = FloorUnderlayDefinition.getWidget(var5); // L: 7252
					var54.field3422 = var20 + (var6 << 16); // L: 7253
					var1.serverPacket = null; // L: 7254
					return true; // L: 7255
				}

				String var85;
				if (ServerPacket.field3135 == var1.serverPacket) { // L: 7257
					var20 = var3.readUShortSmart(); // L: 7258
					boolean var57 = var3.readUnsignedByte() == 1; // L: 7259
					var85 = ""; // L: 7260
					boolean var79 = false; // L: 7261
					if (var57) { // L: 7262
						var85 = var3.readStringCp1252NullTerminated(); // L: 7263
						if (MusicPatchPcmStream.friendSystem.isIgnored(new Username(var85, class162.loginType))) { // L: 7264
							var79 = true;
						}
					}

					String var89 = var3.readStringCp1252NullTerminated(); // L: 7266
					if (!var79) { // L: 7267
						FileSystem.addGameMessage(var20, var85, var89);
					}

					var1.serverPacket = null; // L: 7268
					return true; // L: 7269
				}

				if (ServerPacket.field3070 == var1.serverPacket) { // L: 7271
					MusicPatchPcmStream.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 7272
					class16.FriendSystem_invalidateIgnoreds(); // L: 7273
					field750 = cycleCntr; // L: 7274
					var1.serverPacket = null; // L: 7275
					return true; // L: 7276
				}

				if (ServerPacket.field3039 == var1.serverPacket) { // L: 7278
					var73 = var3.readBoolean(); // L: 7279
					if (var73) { // L: 7280
						if (class302.field3596 == null) { // L: 7281
							class302.field3596 = new class326();
						}
					} else {
						class302.field3596 = null; // L: 7283
					}

					var1.serverPacket = null; // L: 7284
					return true; // L: 7285
				}

				if (ServerPacket.field3125 == var1.serverPacket) { // L: 7287
					var20 = var3.readInt(); // L: 7288
					var5 = var3.method7774(); // L: 7289
					var6 = var5 >> 10 & 31; // L: 7290
					var27 = var5 >> 5 & 31; // L: 7291
					var28 = var5 & 31; // L: 7292
					var9 = (var27 << 11) + (var6 << 19) + (var28 << 3); // L: 7293
					Widget var10 = FloorUnderlayDefinition.getWidget(var20); // L: 7294
					if (var9 != var10.color) { // L: 7295
						var10.color = var9; // L: 7296
						class220.invalidateWidget(var10); // L: 7297
					}

					var1.serverPacket = null; // L: 7299
					return true; // L: 7300
				}

				if (ServerPacket.field3046 == var1.serverPacket) { // L: 7302
					ClanChannelMember.method2908(class263.field3023); // L: 7303
					var1.serverPacket = null; // L: 7304
					return true; // L: 7305
				}

				if (ServerPacket.field3138 == var1.serverPacket) { // L: 7307
					byte[] var49 = new byte[var1.serverPacketLength]; // L: 7308
					var3.method7680(var49, 0, var49.length); // L: 7309
					Buffer var70 = new Buffer(var49); // L: 7310
					var85 = var70.readStringCp1252NullTerminated(); // L: 7311
					class238.openURL(var85, true, false); // L: 7312
					var1.serverPacket = null; // L: 7313
					return true; // L: 7314
				}

				if (ServerPacket.field3054 == var1.serverPacket) { // L: 7316
					var20 = var3.readUnsignedByte(); // L: 7317
					var5 = var3.readUnsignedByte(); // L: 7318
					var6 = var3.readUnsignedByte(); // L: 7319
					var27 = var3.readUnsignedByte(); // L: 7320
					field678[var20] = true; // L: 7321
					field747[var20] = var5; // L: 7322
					field654[var20] = var6; // L: 7323
					field749[var20] = var27; // L: 7324
					field653[var20] = 0; // L: 7325
					var1.serverPacket = null; // L: 7326
					return true; // L: 7327
				}

				if (ServerPacket.field3122 == var1.serverPacket) { // L: 7329
					var20 = var3.readInt(); // L: 7330
					var5 = var3.readUnsignedShort(); // L: 7331
					if (var20 < -70000) { // L: 7332
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 7334
						var40 = FloorUnderlayDefinition.getWidget(var20);
					} else {
						var40 = null; // L: 7335
					}

					if (var40 != null) { // L: 7336
						for (var27 = 0; var27 < var40.itemIds.length; ++var27) { // L: 7337
							var40.itemIds[var27] = 0; // L: 7338
							var40.itemQuantities[var27] = 0; // L: 7339
						}
					}

					Canvas.clearItemContainer(var5); // L: 7342
					var27 = var3.readUnsignedShort(); // L: 7343

					for (var28 = 0; var28 < var27; ++var28) { // L: 7344
						var9 = var3.method7776(); // L: 7345
						var26 = var3.method7767(); // L: 7346
						if (var26 == 255) { // L: 7347
							var26 = var3.readInt();
						}

						if (var40 != null && var28 < var40.itemIds.length) { // L: 7348 7349
							var40.itemIds[var28] = var9; // L: 7350
							var40.itemQuantities[var28] = var26; // L: 7351
						}

						WorldMapSection1.itemContainerSetItem(var5, var28, var9 - 1, var26); // L: 7354
					}

					if (var40 != null) { // L: 7356
						class220.invalidateWidget(var40);
					}

					class424.method7495(); // L: 7357
					changedItemContainers[++field686 - 1 & 31] = var5 & 32767; // L: 7358
					var1.serverPacket = null; // L: 7359
					return true; // L: 7360
				}

				if (ServerPacket.field3086 == var1.serverPacket && isCameraLocked) { // L: 7362 7363
					field745 = true; // L: 7364
					class115.field1419 = var3.readUnsignedByte(); // L: 7365
					SoundCache.field325 = var3.readUnsignedByte(); // L: 7366
					class83.field1082 = var3.readUnsignedByte(); // L: 7367
					ScriptFrame.field459 = var3.readUnsignedByte(); // L: 7368

					for (var20 = 0; var20 < 5; ++var20) { // L: 7369
						field678[var20] = false;
					}

					var1.serverPacket = null; // L: 7370
					return true; // L: 7371
				}

				if (ServerPacket.field3099 == var1.serverPacket) { // L: 7374
					ClanChannelMember.method2908(class263.field3020); // L: 7375
					var1.serverPacket = null; // L: 7376
					return true; // L: 7377
				}

				if (ServerPacket.field3093 == var1.serverPacket) { // L: 7379
					var20 = var3.readUnsignedByte(); // L: 7380
					class136.forceDisconnect(var20); // L: 7381
					var1.serverPacket = null; // L: 7382
					return false; // L: 7383
				}

				if (ServerPacket.field3079 == var1.serverPacket) { // L: 7385
					World var48 = new World(); // L: 7386
					var48.host = var3.readStringCp1252NullTerminated(); // L: 7387
					var48.id = var3.readUnsignedShort(); // L: 7388
					var5 = var3.readInt(); // L: 7389
					var48.properties = var5; // L: 7390
					class82.updateGameState(45); // L: 7391
					var2.close(); // L: 7392
					var2 = null; // L: 7393
					FriendSystem.changeWorld(var48); // L: 7394
					var1.serverPacket = null; // L: 7395
					return false; // L: 7396
				}

				if (ServerPacket.field3092 == var1.serverPacket) { // L: 7398
					var20 = var3.method7763(); // L: 7399
					var5 = var3.readShort(); // L: 7400
					var6 = var3.readInt(); // L: 7401
					var54 = FloorUnderlayDefinition.getWidget(var6); // L: 7402
					if (var20 != var54.rawX || var5 != var54.rawY || var54.xAlignment != 0 || var54.yAlignment != 0) { // L: 7403
						var54.rawX = var20; // L: 7404
						var54.rawY = var5; // L: 7405
						var54.xAlignment = 0; // L: 7406
						var54.yAlignment = 0; // L: 7407
						class220.invalidateWidget(var54); // L: 7408
						this.alignWidget(var54); // L: 7409
						if (var54.type == 0) { // L: 7410
							class439.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var6 >> 16], var54, false);
						}
					}

					var1.serverPacket = null; // L: 7412
					return true; // L: 7413
				}

				if (ServerPacket.field3078 == var1.serverPacket) { // L: 7415
					minimapState = var3.readUnsignedByte(); // L: 7416
					var1.serverPacket = null; // L: 7417
					return true; // L: 7418
				}

				if (ServerPacket.field3076 == var1.serverPacket) { // L: 7420
					destinationX = var3.readUnsignedByte(); // L: 7421
					if (destinationX == 255) { // L: 7422
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 7423
					if (destinationY == 255) { // L: 7424
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 7425
					return true; // L: 7426
				}

				if (ServerPacket.field3064 == var1.serverPacket) { // L: 7428
					var20 = var3.method7774(); // L: 7429
					rootInterface = var20; // L: 7430
					this.resizeRoot(false); // L: 7431
					WorldMapIcon_0.Widget_resetModelFrames(var20); // L: 7432
					KeyHandler.runWidgetOnLoadListener(rootInterface); // L: 7433

					for (var5 = 0; var5 < 100; ++var5) { // L: 7434
						field610[var5] = true;
					}

					var1.serverPacket = null; // L: 7435
					return true; // L: 7436
				}

				if (ServerPacket.field3134 == var1.serverPacket) { // L: 7438
					class128.readReflectionCheck(var3, var1.serverPacketLength); // L: 7439
					var1.serverPacket = null; // L: 7440
					return true; // L: 7441
				}

				if (ServerPacket.field3124 == var1.serverPacket) { // L: 7443
					var20 = var3.readUnsignedShort(); // L: 7444
					byte var52 = var3.method7768(); // L: 7445
					Varps.Varps_temp[var20] = var52; // L: 7446
					if (Varps.Varps_main[var20] != var52) { // L: 7447
						Varps.Varps_main[var20] = var52; // L: 7448
					}

					class155.changeGameOptions(var20); // L: 7450
					changedVarps[++changedVarpCount - 1 & 31] = var20; // L: 7451
					var1.serverPacket = null; // L: 7452
					return true; // L: 7453
				}

				if (ServerPacket.field3130 == var1.serverPacket) { // L: 7455
					hintArrowType = var3.readUnsignedByte(); // L: 7456
					if (hintArrowType == 1) { // L: 7457
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 7458
						if (hintArrowType == 2) { // L: 7459
							hintArrowSubX = 4096; // L: 7460
							hintArrowSubY = 64; // L: 7461
						}

						if (hintArrowType == 3) { // L: 7463
							hintArrowSubX = 0; // L: 7464
							hintArrowSubY = 64; // L: 7465
						}

						if (hintArrowType == 4) { // L: 7467
							hintArrowSubX = 8192; // L: 7468
							hintArrowSubY = 64; // L: 7469
						}

						if (hintArrowType == 5) { // L: 7471
							hintArrowSubX = 4096; // L: 7472
							hintArrowSubY = 0; // L: 7473
						}

						if (hintArrowType == 6) { // L: 7475
							hintArrowSubX = 4096; // L: 7476
							hintArrowSubY = 128; // L: 7477
						}

						hintArrowType = 2; // L: 7479
						hintArrowX = var3.readUnsignedShort(); // L: 7480
						hintArrowY = var3.readUnsignedShort(); // L: 7481
						hintArrowHeight = var3.readUnsignedByte() * 2; // L: 7482
					}

					if (hintArrowType == 10) { // L: 7484
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 7485
					return true; // L: 7486
				}

				if (ServerPacket.field3137 == var1.serverPacket) { // L: 7488
					class424.method7495(); // L: 7489
					runEnergy = var3.readUnsignedByte(); // L: 7490
					field726 = cycleCntr; // L: 7491
					var1.serverPacket = null; // L: 7492
					return true; // L: 7493
				}

				if (ServerPacket.field3041 == var1.serverPacket) { // L: 7495
					return this.method1128(var1, 2); // L: 7496
				}

				if (ServerPacket.field3139 == var1.serverPacket) { // L: 7498
					ScriptFrame.field462 = true; // L: 7499
					class145.updateNpcs(false, var3); // L: 7500
					var1.serverPacket = null; // L: 7501
					return true; // L: 7502
				}

				if (ServerPacket.field3120 == var1.serverPacket) { // L: 7504
					var20 = var3.readInt(); // L: 7505
					InterfaceParent var69 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7506
					if (var69 != null) { // L: 7507
						Canvas.closeInterface(var69, true);
					}

					if (meslayerContinueWidget != null) { // L: 7508
						class220.invalidateWidget(meslayerContinueWidget); // L: 7509
						meslayerContinueWidget = null; // L: 7510
					}

					var1.serverPacket = null; // L: 7512
					return true; // L: 7513
				}

				if (ServerPacket.field3113 == var1.serverPacket) { // L: 7515
					var20 = var3.method7787(); // L: 7516
					var68 = FloorUnderlayDefinition.getWidget(var20); // L: 7517

					for (var6 = 0; var6 < var68.itemIds.length; ++var6) { // L: 7518
						var68.itemIds[var6] = -1; // L: 7519
						var68.itemIds[var6] = 0; // L: 7520
					}

					class220.invalidateWidget(var68); // L: 7522
					var1.serverPacket = null; // L: 7523
					return true; // L: 7524
				}

				if (ServerPacket.field3085 == var1.serverPacket) { // L: 7526
					var6 = var3.method7787(); // L: 7531
					var5 = var3.readUnsignedShort(); // L: 7532
					var20 = var3.method7741(); // L: 7533
					Player var7;
					if (var20 == localPlayerIndex) { // L: 7534
						var7 = class28.localPlayer; // L: 7535
					} else {
						var7 = players[var20]; // L: 7538
					}

					if (var7 != null) { // L: 7540
						var7.spotAnimation = var5; // L: 7541
						var7.field1128 = var6 >> 16; // L: 7542
						var7.field1178 = (var6 & 65535) + cycle; // L: 7543
						var7.spotAnimationFrame = 0; // L: 7544
						var7.field1201 = 0; // L: 7545
						if (var7.field1178 > cycle) { // L: 7546
							var7.spotAnimationFrame = -1; // L: 7547
						}

						if (var7.spotAnimation == 65535) { // L: 7549
							var7.spotAnimation = -1; // L: 7550
						}
					}

					var1.serverPacket = null; // L: 7553
					return true; // L: 7554
				}

				if (ServerPacket.field3048 == var1.serverPacket) { // L: 7556
					var20 = var3.readUnsignedShort(); // L: 7557
					var5 = var3.readUnsignedShort(); // L: 7558
					var6 = var3.readInt(); // L: 7559
					var27 = var3.readUnsignedShort(); // L: 7560
					var45 = FloorUnderlayDefinition.getWidget(var6); // L: 7561
					if (var20 != var45.modelAngleX || var5 != var45.modelAngleY || var27 != var45.modelZoom) { // L: 7562
						var45.modelAngleX = var20; // L: 7563
						var45.modelAngleY = var5; // L: 7564
						var45.modelZoom = var27; // L: 7565
						class220.invalidateWidget(var45); // L: 7566
					}

					var1.serverPacket = null; // L: 7568
					return true; // L: 7569
				}

				if (ServerPacket.field3143 == var1.serverPacket) { // L: 7571
					var3.offset += 28; // L: 7572
					if (var3.checkCrc()) { // L: 7573
						NPCComposition.method3470(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 7574
					return true; // L: 7575
				}

				class359.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1338 != null ? var1.field1338.id : -1) + "," + (var1.field1333 != null ? var1.field1333.id : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 7577
				class433.logOut(); // L: 7578
			} catch (IOException var46) { // L: 7580
				UserComparator4.method2654(); // L: 7581
			} catch (Exception var47) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1338 != null ? var1.field1338.id : -1) + "," + (var1.field1333 != null ? var1.field1333.id : -1) + "," + var1.serverPacketLength + "," + (class28.localPlayer.pathX[0] + class300.baseX * 64) + "," + (class28.localPlayer.pathY[0] + Message.baseY * 64) + ","; // L: 7584

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 7585
					var21 = var21 + var3.array[var6] + ",";
				}

				class359.RunException_sendStackTrace(var21, var47); // L: 7586
				class433.logOut(); // L: 7587
			}

			return true; // L: 7589
		}
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-9"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false; // L: 8381

		int var2;
		int var5;
		while (!var1) { // L: 8382
			var1 = true; // L: 8383

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) { // L: 8384
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) { // L: 8385
					String var14 = menuTargets[var2]; // L: 8386
					menuTargets[var2] = menuTargets[var2 + 1]; // L: 8387
					menuTargets[var2 + 1] = var14; // L: 8388
					String var15 = menuActions[var2]; // L: 8389
					menuActions[var2] = menuActions[var2 + 1]; // L: 8390
					menuActions[var2 + 1] = var15; // L: 8391
					var5 = menuOpcodes[var2]; // L: 8392
					menuOpcodes[var2] = menuOpcodes[var2 + 1]; // L: 8393
					menuOpcodes[var2 + 1] = var5; // L: 8394
					var5 = menuArguments1[var2]; // L: 8395
					menuArguments1[var2] = menuArguments1[var2 + 1]; // L: 8396
					menuArguments1[var2 + 1] = var5; // L: 8397
					var5 = menuArguments2[var2]; // L: 8398
					menuArguments2[var2] = menuArguments2[var2 + 1]; // L: 8399
					menuArguments2[var2 + 1] = var5; // L: 8400
					var5 = menuIdentifiers[var2]; // L: 8401
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1]; // L: 8402
					menuIdentifiers[var2 + 1] = var5; // L: 8403
					var5 = field638[var2]; // L: 8404
					field638[var2] = field638[var2 + 1]; // L: 8405
					field638[var2 + 1] = var5; // L: 8406
					boolean var11 = menuShiftClick[var2]; // L: 8407
					menuShiftClick[var2] = menuShiftClick[var2 + 1]; // L: 8408
					menuShiftClick[var2 + 1] = var11; // L: 8409
					var1 = false; // L: 8410
				}
			}
		}

		if (class115.dragInventoryWidget == null) { // L: 8415
			if (clickedWidget == null) { // L: 8416
				int var4;
				int var10;
				int var18;
				label262: {
					int var16 = MouseHandler.MouseHandler_lastButton; // L: 8417
					int var3;
					int var8;
					int var17;
					int var19;
					if (isMenuOpen) { // L: 8418
						if (var16 != 1 && (ObjectSound.mouseCam || var16 != 4)) { // L: 8419
							var2 = MouseHandler.MouseHandler_x; // L: 8420
							var3 = MouseHandler.MouseHandler_y; // L: 8421
							if (var2 < Language.menuX - 10 || var2 > Language.menuX + class402.menuWidth + 10 || var3 < UrlRequest.menuY - 10 || var3 > UrlRequest.menuY + class321.menuHeight + 10) { // L: 8422
								isMenuOpen = false; // L: 8423
								class16.method214(Language.menuX, UrlRequest.menuY, class402.menuWidth, class321.menuHeight); // L: 8424
							}
						}

						if (var16 == 1 || !ObjectSound.mouseCam && var16 == 4) { // L: 8427
							var2 = Language.menuX; // L: 8428
							var3 = UrlRequest.menuY; // L: 8429
							var4 = class402.menuWidth; // L: 8430
							var5 = MouseHandler.MouseHandler_lastPressedX; // L: 8431
							var19 = MouseHandler.MouseHandler_lastPressedY; // L: 8432
							var17 = -1; // L: 8433

							for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 8434
								var18 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 8435
								if (var5 > var2 && var5 < var4 + var2 && var19 > var18 - 13 && var19 < var18 + 3) { // L: 8436
									var17 = var8;
								}
							}

							if (var17 != -1) { // L: 8438
								FloorUnderlayDefinition.method3543(var17);
							}

							isMenuOpen = false; // L: 8439
							class16.method214(Language.menuX, UrlRequest.menuY, class402.menuWidth, class321.menuHeight); // L: 8440
						}
					} else {
						var2 = Player.method2211(); // L: 8444
						if ((var16 == 1 || !ObjectSound.mouseCam && var16 == 4) && var2 >= 0) { // L: 8445
							var3 = menuOpcodes[var2]; // L: 8446
							if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) { // L: 8447
								var4 = menuArguments1[var2]; // L: 8448
								var5 = menuArguments2[var2]; // L: 8449
								Widget var6 = FloorUnderlayDefinition.getWidget(var5); // L: 8450
								var8 = class67.getWidgetFlags(var6); // L: 8452
								boolean var7 = (var8 >> 28 & 1) != 0; // L: 8454
								if (var7) { // L: 8457
									break label262;
								}

								var10 = class67.getWidgetFlags(var6); // L: 8459
								boolean var9 = (var10 >> 29 & 1) != 0; // L: 8461
								if (var9) { // L: 8463
									break label262;
								}
							}
						}

						if ((var16 == 1 || !ObjectSound.mouseCam && var16 == 4) && this.shouldLeftClickOpenMenu()) { // L: 8488 8489
							var16 = 2; // L: 8490
						}

						if ((var16 == 1 || !ObjectSound.mouseCam && var16 == 4) && menuOptionsCount > 0 && var2 >= 0) { // L: 8493 8495
							var3 = menuArguments1[var2]; // L: 8496
							var4 = menuArguments2[var2]; // L: 8497
							var5 = menuOpcodes[var2]; // L: 8498
							var19 = menuIdentifiers[var2]; // L: 8499
							var17 = field638[var2]; // L: 8500
							String var12 = menuActions[var2]; // L: 8501
							String var13 = menuTargets[var2]; // L: 8502
							class9.method78(var3, var4, var5, var19, var17, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8503
						}

						if (var16 == 2 && menuOptionsCount > 0) { // L: 8506
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}

					return; // L: 8508
				}

				if (class115.dragInventoryWidget != null && !field607 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 8465 8466
					var18 = draggedWidgetX; // L: 8467
					var10 = draggedWidgetY; // L: 8468
					ArchiveDiskAction.method5787(class136.tempMenuAction, var18, var10); // L: 8470
					class136.tempMenuAction = null; // L: 8471
				}

				field607 = false; // L: 8475
				itemDragDuration = 0; // L: 8476
				if (class115.dragInventoryWidget != null) { // L: 8477
					class220.invalidateWidget(class115.dragInventoryWidget);
				}

				class115.dragInventoryWidget = FloorUnderlayDefinition.getWidget(var5); // L: 8478
				dragItemSlotSource = var4; // L: 8479
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 8480
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 8481
				if (var2 >= 0) { // L: 8482
					class113.method2713(var2);
				}

				class220.invalidateWidget(class115.dragInventoryWidget); // L: 8483
			}
		}
	} // L: 8484

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "268498014"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = Player.method2211(); // L: 8511
		boolean var2 = field604 && menuOptionsCount > 2; // L: 8512
		if (!var2) { // L: 8513
			boolean var3;
			if (var1 < 0) { // L: 8516
				var3 = false; // L: 8517
			} else {
				int var4 = menuOpcodes[var1]; // L: 8520
				if (var4 >= 2000) { // L: 8521
					var4 -= 2000;
				}

				if (var4 == 1007) { // L: 8522
					var3 = true; // L: 8523
				} else {
					var3 = false; // L: 8526
				}
			}

			var2 = var3; // L: 8528
		}

		return var2 && !menuShiftClick[var1]; // L: 8530
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "8"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		int var3 = class116.fontBold12.stringWidth("Choose Option"); // L: 8535

		int var4;
		int var5;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) { // L: 8536
			var5 = class116.fontBold12.stringWidth(ClanChannelMember.method2906(var4)); // L: 8537
			if (var5 > var3) { // L: 8538
				var3 = var5;
			}
		}

		var3 += 8; // L: 8540
		var4 = menuOptionsCount * 15 + 22; // L: 8541
		var5 = var1 - var3 / 2; // L: 8542
		if (var5 + var3 > class352.canvasWidth) { // L: 8543
			var5 = class352.canvasWidth - var3;
		}

		if (var5 < 0) { // L: 8544
			var5 = 0;
		}

		int var6 = var2; // L: 8545
		if (var4 + var2 > class228.canvasHeight) { // L: 8546
			var6 = class228.canvasHeight - var4;
		}

		if (var6 < 0) { // L: 8547
			var6 = 0;
		}

		Language.menuX = var5; // L: 8548
		UrlRequest.menuY = var6; // L: 8549
		class402.menuWidth = var3; // L: 8550
		class321.menuHeight = menuOptionsCount * 15 + 22; // L: 8551
		var1 -= viewportOffsetX; // L: 8553
		var2 -= viewportOffsetY; // L: 8554
		Decimator.scene.menuOpen(FriendSystem.Client_plane, var1, var2, false); // L: 8555
		isMenuOpen = true; // L: 8556
	} // L: 8557

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1199540139"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface; // L: 10488
		int var3 = class352.canvasWidth; // L: 10489
		int var4 = class228.canvasHeight; // L: 10490
		if (ReflectionCheck.loadInterface(var2)) { // L: 10492
			NetCache.resizeInterface(Widget.Widget_interfaceComponents[var2], -1, var3, var4, var1); // L: 10493
		}

	} // L: 10495

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)V",
		garbageValue = "-1915332217"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : FloorUnderlayDefinition.getWidget(var1.parentId); // L: 10498
		int var3;
		int var4;
		if (var2 == null) { // L: 10501
			var3 = class352.canvasWidth; // L: 10502
			var4 = class228.canvasHeight; // L: 10503
		} else {
			var3 = var2.width; // L: 10506
			var4 = var2.height; // L: 10507
		}

		class356.alignWidgetSize(var1, var3, var4, false); // L: 10509
		VertexNormal.alignWidgetPosition(var1, var3, var4); // L: 10510
	} // L: 10511

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "429748026"
	)
	final void method1298() {
		class220.invalidateWidget(clickedWidget); // L: 11585
		++LoginScreenAnimation.widgetDragDuration; // L: 11586
		int var1;
		int var2;
		if (field549 && field675) { // L: 11587
			var1 = MouseHandler.MouseHandler_x; // L: 11601
			var2 = MouseHandler.MouseHandler_y; // L: 11602
			var1 -= widgetClickX; // L: 11603
			var2 -= widgetClickY; // L: 11604
			if (var1 < field676) { // L: 11605
				var1 = field676;
			}

			if (var1 + clickedWidget.width > field676 + clickedWidgetParent.width) { // L: 11606
				var1 = field676 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field751) { // L: 11607
				var2 = field751;
			}

			if (var2 + clickedWidget.height > field751 + clickedWidgetParent.height) { // L: 11608
				var2 = field751 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field679; // L: 11609
			int var4 = var2 - field680; // L: 11610
			int var5 = clickedWidget.dragZoneSize; // L: 11611
			if (LoginScreenAnimation.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 11612 11613
				isDraggingWidget = true; // L: 11614
			}

			int var6 = var1 - field676 + clickedWidgetParent.scrollX; // L: 11617
			int var7 = var2 - field751 + clickedWidgetParent.scrollY; // L: 11618
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 11619
				var8 = new ScriptEvent(); // L: 11620
				var8.widget = clickedWidget; // L: 11621
				var8.mouseX = var6; // L: 11622
				var8.mouseY = var7; // L: 11623
				var8.args = clickedWidget.onDrag; // L: 11624
				class17.runScriptEvent(var8); // L: 11625
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 11627
				if (isDraggingWidget) { // L: 11628
					if (clickedWidget.onDragComplete != null) { // L: 11629
						var8 = new ScriptEvent(); // L: 11630
						var8.widget = clickedWidget; // L: 11631
						var8.mouseX = var6; // L: 11632
						var8.mouseY = var7; // L: 11633
						var8.dragTarget = draggedOnWidget; // L: 11634
						var8.args = clickedWidget.onDragComplete; // L: 11635
						class17.runScriptEvent(var8); // L: 11636
					}

					if (draggedOnWidget != null) { // L: 11638
						Widget var15 = clickedWidget; // L: 11640
						int var11 = class67.getWidgetFlags(var15); // L: 11643
						int var10 = var11 >> 17 & 7; // L: 11645
						int var12 = var10; // L: 11647
						Widget var17;
						if (var10 == 0) { // L: 11648
							var17 = null; // L: 11649
						} else {
							int var13 = 0;

							while (true) {
								if (var13 >= var12) {
									var17 = var15; // L: 11659
									break;
								}

								var15 = FloorUnderlayDefinition.getWidget(var15.parentId); // L: 11653
								if (var15 == null) { // L: 11654
									var17 = null; // L: 11655
									break; // L: 11656
								}

								++var13; // L: 11652
							}
						}

						if (var17 != null) { // L: 11661
							PacketBufferNode var16 = class433.getPacketBufferNode(ClientPacket.field3005, packetWriter.isaacCipher); // L: 11663
							var16.packetBuffer.method7785(clickedWidget.id); // L: 11664
							var16.packetBuffer.writeIntME(clickedWidget.childIndex); // L: 11665
							var16.packetBuffer.method7783(draggedOnWidget.id); // L: 11666
							var16.packetBuffer.writeIntME(clickedWidget.itemId); // L: 11667
							var16.packetBuffer.method7771(draggedOnWidget.childIndex); // L: 11668
							var16.packetBuffer.method7969(draggedOnWidget.itemId); // L: 11669
							packetWriter.addNode(var16); // L: 11670
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 11675
					this.openMenu(widgetClickX + field679, widgetClickY + field680); // L: 11676
				} else if (menuOptionsCount > 0) { // L: 11678
					int var14 = widgetClickX + field679; // L: 11679
					int var9 = widgetClickY + field680; // L: 11680
					ArchiveDiskAction.method5787(class136.tempMenuAction, var14, var9); // L: 11682
					class136.tempMenuAction = null; // L: 11683
				}

				clickedWidget = null; // L: 11687
			}

		} else {
			if (LoginScreenAnimation.widgetDragDuration > 1) { // L: 11588
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 11589
					var1 = widgetClickX + field679; // L: 11590
					var2 = field680 + widgetClickY; // L: 11591
					ArchiveDiskAction.method5787(class136.tempMenuAction, var1, var2); // L: 11593
					class136.tempMenuAction = null; // L: 11594
				}

				clickedWidget = null; // L: 11597
			}

		}
	} // L: 11599 11689

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(B)Lqi;",
		garbageValue = "37"
	)
	@Export("username")
	public Username username() {
		return class28.localPlayer != null ? class28.localPlayer.username : null; // L: 12384
	}

	public final void init() {
		try {
			if (this.checkHost()) { // L: 711
				int var3;
				for (int var1 = 0; var1 <= 28; ++var1) { // L: 712
					String var2 = this.getParameter(Integer.toString(var1)); // L: 713
					if (var2 != null) { // L: 714
						switch(var1) { // L: 715
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 743
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 744
							}
							break;
						case 4:
							if (clientType == -1) { // L: 759
								clientType = Integer.parseInt(var2); // L: 760
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 733
							break; // L: 734
						case 6:
							class21.clientLanguage = Language.method6080(Integer.parseInt(var2)); // L: 794
							break; // L: 795
						case 7:
							HealthBarUpdate.field1207 = class19.method290(Integer.parseInt(var2)); // L: 749
							break; // L: 750
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 771
							}
							break;
						case 9:
							Script.field975 = var2; // L: 738
							break; // L: 739
						case 10:
							StudioGame[] var8 = new StudioGame[]{StudioGame.oldscape, StudioGame.runescape, StudioGame.stellardawn, StudioGame.game3, StudioGame.game4, StudioGame.game5}; // L: 801
							AbstractByteArrayCopier.field3293 = (StudioGame)class271.findEnumerated(var8, Integer.parseInt(var2)); // L: 803
							if (AbstractByteArrayCopier.field3293 == StudioGame.oldscape) { // L: 804
								class162.loginType = LoginType.oldscape;
							} else {
								class162.loginType = LoginType.field4631; // L: 805
							}
							break;
						case 11:
							class65.field874 = var2; // L: 718
							break; // L: 719
						case 12:
							worldId = Integer.parseInt(var2); // L: 723
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
							Decimator.field402 = Integer.parseInt(var2); // L: 766
							break; // L: 767
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 754
							break; // L: 755
						case 17:
							GrandExchangeOfferOwnWorldComparator.field479 = var2; // L: 777
							break; // L: 778
						case 21:
							field504 = Integer.parseInt(var2); // L: 728
							break; // L: 729
						case 25:
							var3 = var2.indexOf("."); // L: 782
							if (var3 == -1) { // L: 783
								Integer.parseInt(var2); // L: 784
							} else {
								Integer.parseInt(var2.substring(0, var3)); // L: 787
								Integer.parseInt(var2.substring(var3 + 1)); // L: 788
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false; // L: 812
				isLowDetail = false; // L: 813
				WorldMapSectionType.worldHost = this.getCodeBase().getHost(); // L: 815
				String var9 = HealthBarUpdate.field1207.name; // L: 816
				byte var10 = 0; // L: 817

				try {
					JagexCache.idxCount = 22; // L: 820
					KeyHandler.cacheGamebuild = var10; // L: 821

					try {
						MusicPatchPcmStream.operatingSystemName = System.getProperty("os.name"); // L: 823
					} catch (Exception var16) { // L: 825
						MusicPatchPcmStream.operatingSystemName = "Unknown"; // L: 826
					}

					class7.formattedOperatingSystemName = MusicPatchPcmStream.operatingSystemName.toLowerCase(); // L: 828

					try {
						JagexCache.userHomeDirectory = System.getProperty("user.home"); // L: 830
						if (JagexCache.userHomeDirectory != null) { // L: 831
							JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
						}
					} catch (Exception var15) { // L: 833
					}

					try {
						if (class7.formattedOperatingSystemName.startsWith("win")) { // L: 835
							if (JagexCache.userHomeDirectory == null) { // L: 836
								JagexCache.userHomeDirectory = System.getenv("USERPROFILE");
							}
						} else if (JagexCache.userHomeDirectory == null) { // L: 839
							JagexCache.userHomeDirectory = System.getenv("HOME");
						}

						if (JagexCache.userHomeDirectory != null) { // L: 841
							JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
						}
					} catch (Exception var14) { // L: 843
					}

					if (JagexCache.userHomeDirectory == null) { // L: 844
						JagexCache.userHomeDirectory = "~/";
					}

					class329.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", JagexCache.userHomeDirectory, "/tmp/", ""}; // L: 845
					class14.cacheSubPaths = new String[]{".jagex_cache_" + KeyHandler.cacheGamebuild, ".file_store_" + KeyHandler.cacheGamebuild}; // L: 846

					label172:
					for (var3 = 0; var3 < 4; ++var3) { // L: 847
						UserComparator10.cacheDir = class1.method9("oldschool", var9, var3); // L: 848
						if (!UserComparator10.cacheDir.exists()) { // L: 849
							UserComparator10.cacheDir.mkdirs();
						}

						File[] var4 = UserComparator10.cacheDir.listFiles(); // L: 850
						if (var4 == null) { // L: 851
							break;
						}

						File[] var5 = var4; // L: 853
						int var6 = 0;

						while (true) {
							if (var6 >= var5.length) {
								break label172;
							}

							File var7 = var5[var6]; // L: 855
							if (!ClanSettings.method3006(var7, false)) { // L: 857
								break;
							}

							++var6; // L: 854
						}
					}

					class132.method2918(UserComparator10.cacheDir); // L: 864

					try {
						File var21 = new File(JagexCache.userHomeDirectory, "random.dat"); // L: 867
						int var12;
						if (var21.exists()) { // L: 868
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var21, "rw", 25L), 24, 0); // L: 869
						} else {
							label152:
							for (int var11 = 0; var11 < class14.cacheSubPaths.length; ++var11) { // L: 872
								for (var12 = 0; var12 < class329.cacheParentPaths.length; ++var12) { // L: 873
									File var13 = new File(class329.cacheParentPaths[var12] + class14.cacheSubPaths[var11] + File.separatorChar + "random.dat"); // L: 874
									if (var13.exists()) { // L: 875
										JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var13, "rw", 25L), 24, 0); // L: 876
										break label152; // L: 877
									}
								}
							}
						}

						if (JagexCache.JagexCache_randomDat == null) { // L: 882
							RandomAccessFile var20 = new RandomAccessFile(var21, "rw"); // L: 883
							var12 = var20.read(); // L: 884
							var20.seek(0L); // L: 885
							var20.write(var12); // L: 886
							var20.seek(0L); // L: 887
							var20.close(); // L: 888
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var21, "rw", 25L), 24, 0); // L: 889
						}
					} catch (IOException var17) { // L: 892
					}

					JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(NetFileRequest.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 894
					JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(NetFileRequest.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 895
					class346.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount]; // L: 896

					for (var3 = 0; var3 < JagexCache.idxCount; ++var3) { // L: 897
						class346.JagexCache_idxFiles[var3] = new BufferedFile(new AccessFile(NetFileRequest.getFile("main_file_cache.idx" + var3), "rw", 1048576L), 6000, 0); // L: 898
					}
				} catch (Exception var18) { // L: 902
					class359.RunException_sendStackTrace((String)null, var18); // L: 903
				}

				class329.client = this; // L: 905
				class133.clientType = clientType; // L: 906
				if (field489 == -1) { // L: 907
					field489 = 0; // L: 908
				}

				class344.field4179 = System.getenv("JX_ACCESS_TOKEN"); // L: 910
				class402.field4461 = System.getenv("JX_REFRESH_TOKEN"); // L: 911
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) { // L: 912
					this.field526 = true; // L: 913
				}

				this.startThread(765, 503, 207, 1); // L: 915
			}
		} catch (RuntimeException var19) {
			throw class134.newRunException(var19, "client.init(" + ')');
		}
	} // L: 916

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 921
			this.otlTokenRequester = var1; // L: 924
			UserComparator6.method2701(10); // L: 925
		}
	} // L: 922 926

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 940
	}

	public long getAccountHash() {
		return this.accountHash; // L: 945
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 931
			this.field528 = var1; // L: 934
		}
	} // L: 932 935

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llc;I)V",
		garbageValue = "-387846567"
	)
	public static void method1321(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Lbc;",
		garbageValue = "-2001490507"
	)
	static Script method1636(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16)); // L: 52
		if (var2 != null) { // L: 53
			return var2; // L: 54
		} else {
			String var3 = String.valueOf(var0); // L: 56
			int var4 = class117.archive12.getGroupId(var3); // L: 57
			if (var4 == -1) { // L: 58
				return null; // L: 59
			} else {
				byte[] var5 = class117.archive12.takeFileFlat(var4); // L: 61
				if (var5 != null) { // L: 62
					if (var5.length <= 1) { // L: 63
						return null; // L: 64
					}

					var2 = class282.newScript(var5); // L: 66
					if (var2 != null) { // L: 67
						Script.Script_cached.put(var2, (long)(var0 << 16)); // L: 68
						return var2; // L: 69
					}
				}

				return null; // L: 72
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)[Lkl;",
		garbageValue = "109"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field3969, PlayerType.field3973, PlayerType.PlayerType_ultimateIronman, PlayerType.field3972, PlayerType.PlayerType_normal, PlayerType.field3963, PlayerType.field3979, PlayerType.field3970, PlayerType.field3975, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_jagexModerator, PlayerType.field3977, PlayerType.field3976, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_ironman, PlayerType.field3971}; // L: 29
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1730632976"
	)
	static void method1639() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 250
			if (class260.clientPreferences.method2331() != null) { // L: 251
				Login.Login_username = class260.clientPreferences.method2331(); // L: 252
				Login_isUsernameRemembered = true; // L: 253
			} else {
				Login_isUsernameRemembered = false; // L: 255
			}

		}
	} // L: 256

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-73"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 985
			var1 /= 2;
		}

		if (var2 > 192) { // L: 986
			var1 /= 2;
		}

		if (var2 > 217) { // L: 987
			var1 /= 2;
		}

		if (var2 > 243) { // L: 988
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 989
		return var3; // L: 990
	}
}
