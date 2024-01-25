import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class325 {
	@ObfuscatedName("wm")
	@ObfuscatedGetter(
		intValue = 615763991
	)
	public static int field758;
	@ObfuscatedName("vf")
	@ObfuscatedGetter(
		intValue = 1430293525
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vo")
	@ObfuscatedGetter(
		intValue = -354190159
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("xa")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	static final class232 field691;
	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "[Lob;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("xb")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final ApproximateRouteStrategy field801;
	@ObfuscatedName("xi")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("xr")
	@ObfuscatedGetter(
		intValue = -411648017
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("xu")
	static int[] field802;
	@ObfuscatedName("xl")
	static int[] field803;
	@ObfuscatedName("vw")
	static int[] field769;
	@ObfuscatedName("vk")
	static int[] field788;
	@ObfuscatedName("vi")
	static int[] field775;
	@ObfuscatedName("wa")
	@ObfuscatedGetter(
		intValue = 717023111
	)
	static int field736;
	@ObfuscatedName("wz")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("wj")
	@ObfuscatedGetter(
		intValue = -1662251693
	)
	static int field787;
	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	static class491 field529;
	@ObfuscatedName("xy")
	@ObfuscatedGetter(
		intValue = -318963277
	)
	static int field785;
	@ObfuscatedName("vz")
	static short field772;
	@ObfuscatedName("vb")
	static short field773;
	@ObfuscatedName("vc")
	static short field778;
	@ObfuscatedName("vx")
	static short field779;
	@ObfuscatedName("vm")
	static short field596;
	@ObfuscatedName("wv")
	@ObfuscatedGetter(
		intValue = 167824091
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vh")
	static short field776;
	@ObfuscatedName("vt")
	@ObfuscatedGetter(
		intValue = -719449221
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("va")
	@ObfuscatedGetter(
		intValue = -1013697845
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vu")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vj")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static class439 field791;
	@ObfuscatedName("wr")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wb")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("wl")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("wt")
	@ObfuscatedGetter(
		intValue = -1158671041
	)
	static int field730;
	@ObfuscatedName("xx")
	static List field786;
	@ObfuscatedName("bz")
	static boolean field764;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 372409427
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1830395405
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1962887721
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cp")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cq")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 693198435
	)
	static int field503;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -819398511
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1877012345
	)
	static int field667;
	@ObfuscatedName("cn")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -2113245209
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dc")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "[Lut;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("el")
	static boolean field690;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -2135818467
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		longValue = 4023857630691881787L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = 223961985
	)
	static int field512;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = 761694021
	)
	static int field783;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		longValue = 672644838026227771L
	)
	static long field514;
	@ObfuscatedName("ed")
	static boolean field515;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = -773022657
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 1268819849
	)
	static int field513;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = 2037771437
	)
	static int field508;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = -178600353
	)
	static int field519;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = -1082225157
	)
	static int field525;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = -541975243
	)
	static int field613;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -412826730
	)
	static int field522;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = 1826949415
	)
	static int field523;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 748001435
	)
	static int field524;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ex")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static class92 field528;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = 463373345
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = 2126569125
	)
	static int field530;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = -1547201225
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = 693058951
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 1610372549
	)
	static int field533;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = 1778658497
	)
	static int field534;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = -1955617867
	)
	static int field745;
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	static class124 field575;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	static class535 field626;
	@ObfuscatedName("hh")
	static final String field771;
	@ObfuscatedName("hq")
	static final String field505;
	@ObfuscatedName("ha")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("io")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "[Lds;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = 1556887453
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ik")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = -563841167
	)
	static int field549;
	@ObfuscatedName("it")
	static String field664;
	@ObfuscatedName("iu")
	static int[] field603;
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = -1924766771
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ir")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("jc")
	static HashMap field565;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = 553048541
	)
	static int field566;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = -1282086821
	)
	static int field567;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 1976910813
	)
	static int field555;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = -758003773
	)
	static int field569;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -1346067087
	)
	static int field568;
	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "[Lii;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("jk")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jd")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("kv")
	static final int[] field574;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = 808638425
	)
	static int field652;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = 270515271
	)
	static int field576;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -1743627567
	)
	static int field577;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = -683561757
	)
	static int field578;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = -414578351
	)
	static int field541;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = 788252263
	)
	static int field580;
	@ObfuscatedName("kc")
	static boolean field581;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = -1653121723
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = 173824795
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = -174233219
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = -1689698371
	)
	static int field585;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = 2132674567
	)
	static int field698;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = -1781040041
	)
	static int field587;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = 2059001215
	)
	static int field588;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = -118125651
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 1655731525
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = -1846858683
	)
	static int field623;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = -904393347
	)
	static int field510;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 292730893
	)
	static int field593;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = -2058705
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -192349719
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = 1521745677
	)
	public static int field800;
	@ObfuscatedName("lc")
	static boolean field597;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = -1281453811
	)
	static int field598;
	@ObfuscatedName("lz")
	static boolean field599;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = -1422011957
	)
	static int field600;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = 1434760849
	)
	static int field601;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = 987149163
	)
	static int field602;
	@ObfuscatedName("mt")
	static int[] field710;
	@ObfuscatedName("md")
	static int[] field604;
	@ObfuscatedName("mi")
	static int[] field605;
	@ObfuscatedName("mo")
	static int[] field606;
	@ObfuscatedName("mg")
	static int[] field795;
	@ObfuscatedName("mx")
	static int[] field752;
	@ObfuscatedName("mw")
	static int[][] field609;
	@ObfuscatedName("mk")
	static int[] field610;
	@ObfuscatedName("my")
	static String[] field611;
	@ObfuscatedName("ms")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = -959235535
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = -1706098039
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = 1999386603
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = 1731351673
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = 1256174471
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 705035700
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = 820801341
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("mf")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = -1771740829
	)
	static int field621;
	@ObfuscatedName("mz")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "[Ldn;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -2056560221
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = -1501725293
	)
	static int field518;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(
		longValue = -377412463607773213L
	)
	static long field509;
	@ObfuscatedName("nh")
	@ObfuscatedGetter(
		longValue = -6790769406651105171L
	)
	static long field627;
	@ObfuscatedName("nm")
	static boolean field628;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = 424329739
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = -1351300135
	)
	static int field708;
	@ObfuscatedName("nq")
	static int[] field625;
	@ObfuscatedName("nv")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("nc")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("ne")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("ng")
	static int[] field635;
	@ObfuscatedName("nx")
	@ObfuscatedGetter(
		intValue = -201620211
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "[[[Lpu;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("nk")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nb")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nd")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nw")
	static int[] field644;
	@ObfuscatedName("og")
	static boolean field645;
	@ObfuscatedName("ox")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = -795846725
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("oz")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("oi")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("ow")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("or")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("on")
	static int[] field687;
	@ObfuscatedName("ou")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("op")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("oa")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("oe")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("oo")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("ob")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -141293425
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = 234718099
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = 1905280739
	)
	static int field750;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = -909628163
	)
	static int field662;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = 673527131
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("pu")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = 1726574561
	)
	static int field666;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = -647715427
	)
	static int field554;
	@ObfuscatedName("pm")
	static String field668;
	@ObfuscatedName("pk")
	static String field669;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = 315943785
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = 424545795
	)
	static int field798;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 623268979
	)
	static int field673;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = 1659563493
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = -1085151731
	)
	static int field671;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = 1399247769
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = 63160595
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = 2142557975
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("po")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = 413522021
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = 1581367107
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("qt")
	static boolean field739;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = 110966287
	)
	static int field688;
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = 1277419091
	)
	static int field689;
	@ObfuscatedName("qk")
	static boolean field714;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = -684237471
	)
	static int field719;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = -739406419
	)
	static int field692;
	@ObfuscatedName("qh")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = 258337423
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qp")
	static int[] field497;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = -155823437
	)
	static int field696;
	@ObfuscatedName("qu")
	static int[] field697;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = 590203651
	)
	static int field777;
	@ObfuscatedName("qj")
	static int[] field551;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = -2032240533
	)
	static int field665;
	@ObfuscatedName("qb")
	static int[] field701;
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = 1362152973
	)
	static int field702;
	@ObfuscatedName("rs")
	@ObfuscatedGetter(
		intValue = 1338771405
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = 1912580257
	)
	static int field704;
	@ObfuscatedName("rm")
	@ObfuscatedGetter(
		intValue = -160625697
	)
	static int field705;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = -1878590793
	)
	static int field706;
	@ObfuscatedName("rx")
	@ObfuscatedGetter(
		intValue = -1678846283
	)
	static int field707;
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		intValue = -1055410881
	)
	static int field590;
	@ObfuscatedName("rd")
	@ObfuscatedGetter(
		intValue = -1697646961
	)
	static int field709;
	@ObfuscatedName("rw")
	@ObfuscatedGetter(
		intValue = -850571213
	)
	static int field592;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = 1445594441
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("rf")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	static class548 field712;
	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static NodeDeque field631;
	@ObfuscatedName("rk")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static NodeDeque field715;
	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static NodeDeque field716;
	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rc")
	@ObfuscatedGetter(
		intValue = -1565262513
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("ro")
	@ObfuscatedGetter(
		intValue = -2012854991
	)
	static int field607;
	@ObfuscatedName("rh")
	static boolean[] field720;
	@ObfuscatedName("rg")
	static boolean[] field663;
	@ObfuscatedName("si")
	static boolean[] field729;
	@ObfuscatedName("su")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("ss")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("sn")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("sr")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = 1432497677
	)
	static int field727;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		longValue = 7129987891726135011L
	)
	static long field728;
	@ObfuscatedName("sw")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("sx")
	static int[] field656;
	@ObfuscatedName("sv")
	@ObfuscatedGetter(
		intValue = 557195145
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = -1768412463
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("st")
	static String field733;
	@ObfuscatedName("se")
	static long[] field734;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = 2040478791
	)
	static int field735;
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	static class226 field661;
	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	static class224 field608;
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = -409423185
	)
	static int field738;
	@ObfuscatedName("tn")
	static int[] field617;
	@ObfuscatedName("tp")
	static int[] field559;
	@ObfuscatedName("tf")
	@ObfuscatedGetter(
		longValue = 3802643986184578083L
	)
	static long field741;
	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "[Lfn;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("tj")
	@ObfuscatedSignature(
		descriptor = "[Lgt;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("ts")
	@ObfuscatedGetter(
		intValue = -894415587
	)
	static int field732;
	@ObfuscatedName("tk")
	@ObfuscatedGetter(
		intValue = 1932594645
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("ty")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("ta")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("th")
	@ObfuscatedSignature(
		descriptor = "[Luc;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tz")
	@ObfuscatedGetter(
		intValue = -1702495937
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = -1962001337
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tv")
	@ObfuscatedGetter(
		intValue = -1915554767
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tq")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("uh")
	@ObfuscatedGetter(
		intValue = 1143136131
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("uy")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("ub")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("ul")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("um")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("ux")
	@ObfuscatedSignature(
		descriptor = "[Lbv;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("uk")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("up")
	static boolean field760;
	@ObfuscatedName("uw")
	static boolean field761;
	@ObfuscatedName("us")
	static boolean field762;
	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	static class495 field763;
	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	static class494 field500;
	@ObfuscatedName("vg")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	static class494 field765;
	@ObfuscatedName("vd")
	static boolean field766;
	@ObfuscatedName("vr")
	static boolean[] field767;
	@ObfuscatedName("vp")
	static int[] field722;
	@ObfuscatedName("hw")
	String field538;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	class14 field653;
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	class18 field540;
	@ObfuscatedName("hr")
	OtlTokenRequester field756;
	@ObfuscatedName("hn")
	Future field542;
	@ObfuscatedName("hb")
	boolean field539;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = 1463900463
	)
	int field561;
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	class18 field726;
	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field546;
	@ObfuscatedName("hv")
	Future field547;
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	Buffer field552;
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	class7 field695;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		longValue = 8285185216542760149L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field764 = true; // L: 165
		worldId = 1; // L: 166
		worldProperties = 0; // L: 167
		gameBuild = 0; // L: 169
		isMembersWorld = false; // L: 172
		isLowDetail = false; // L: 173
		field503 = -1; // L: 178
		clientType = -1; // L: 179
		field667 = -1; // L: 180
		onMobile = false; // L: 181
		gameState = 0; // L: 193
		isLoading = false; // L: 194
		field690 = true; // L: 219
		cycle = 0; // L: 220
		mouseLastLastPressedTimeMillis = -1L; // L: 221
		field512 = -1; // L: 223
		field783 = -1; // L: 224
		field514 = -1L; // L: 225
		field515 = true; // L: 226
		rebootTimer = 0; // L: 227
		field513 = 0; // L: 228
		field508 = 0; // L: 229
		field519 = 0; // L: 230
		field525 = 0; // L: 231
		field613 = 0; // L: 232
		field522 = 0; // L: 233
		field523 = 0; // L: 234
		field524 = 0; // L: 235
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 237
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 238
		renderSelf = false; // L: 240
		field528 = class92.field1139; // L: 249
		js5ConnectState = 0; // L: 252
		field530 = 0; // L: 253
		js5Errors = 0; // L: 277
		loginState = 0; // L: 279
		field533 = 0; // L: 280
		field534 = 0; // L: 281
		field745 = 0; // L: 282
		field575 = class124.field1471; // L: 283
		field626 = class535.field5235; // L: 284
		byte[] var1 = class332.method6309("com_jagex_auth_desktop_osrs:public"); // L: 311
		String var0 = ItemComposition.method4053(var1, 0, var1.length); // L: 313
		field771 = var0; // L: 315
		var1 = class332.method6309("com_jagex_auth_desktop_runelite:public"); // L: 322
		var0 = ItemComposition.method4053(var1, 0, var1.length); // L: 324
		field505 = var0; // L: 326
		Login_isUsernameRemembered = false; // L: 342
		secureRandomFuture = new SecureRandomFuture(); // L: 343
		randomDatData = null; // L: 349
		npcs = new NPC[65536]; // L: 353
		npcCount = 0; // L: 354
		npcIndices = new int[65536]; // L: 355
		field549 = 0; // L: 356
		field603 = new int[250]; // L: 357
		packetWriter = new PacketWriter(); // L: 360
		logoutTimer = 0; // L: 362
		hadNetworkError = false; // L: 363
		timer = new Timer(); // L: 364
		field565 = new HashMap(); // L: 370
		field566 = 0; // L: 377
		field567 = 1; // L: 378
		field555 = 0; // L: 379
		field569 = 1; // L: 380
		field568 = 0; // L: 381
		collisionMaps = new CollisionMap[4]; // L: 389
		isInInstance = false; // L: 390
		instanceChunkTemplates = new int[4][13][13]; // L: 391
		field574 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 392
		field652 = -1; // L: 395
		field576 = 0; // L: 396
		field577 = 2301979; // L: 408
		field578 = 5063219; // L: 409
		field541 = 3353893; // L: 410
		field580 = 7759444; // L: 411
		field581 = false; // L: 412
		alternativeScrollbarWidth = 0; // L: 413
		camAngleX = 128; // L: 421
		camAngleY = 0; // L: 422
		field585 = 0; // L: 423
		field698 = 0; // L: 424
		field587 = 0; // L: 425
		field588 = 0; // L: 426
		oculusOrbState = 0; // L: 427
		camFollowHeight = 50; // L: 428
		field623 = 0; // L: 432
		field510 = 0; // L: 433
		field593 = 0; // L: 434
		oculusOrbNormalSpeed = 12; // L: 436
		oculusOrbSlowedSpeed = 6; // L: 437
		field800 = 0; // L: 438
		field597 = false; // L: 439
		field598 = 0; // L: 440
		field599 = false; // L: 441
		field600 = 0; // L: 442
		field601 = 0; // L: 443
		field602 = 50; // L: 444
		field710 = new int[field602]; // L: 445
		field604 = new int[field602]; // L: 446
		field605 = new int[field602]; // L: 447
		field606 = new int[field602]; // L: 448
		field795 = new int[field602]; // L: 449
		field752 = new int[field602]; // L: 450
		field609 = new int[field602][]; // L: 451
		field610 = new int[field602]; // L: 452
		field611 = new String[field602]; // L: 453
		tileLastDrawnActor = new int[104][104]; // L: 454
		viewportDrawCount = 0; // L: 455
		viewportTempX = -1; // L: 456
		viewportTempY = -1; // L: 457
		mouseCrossX = 0; // L: 458
		mouseCrossY = 0; // L: 459
		mouseCrossState = 0; // L: 460
		mouseCrossColor = 0; // L: 461
		showMouseCross = true; // L: 462
		field621 = 0; // L: 463
		showLoadingMessages = true; // L: 465
		players = new Player[2048]; // L: 467
		localPlayerIndex = -1; // L: 469
		field518 = 0; // L: 470
		field509 = -1L; // L: 471
		field627 = -1L; // L: 472
		field628 = true; // L: 474
		drawPlayerNames = 0; // L: 479
		field708 = 0; // L: 480
		field625 = new int[1000]; // L: 481
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 483
		playerMenuActions = new String[8]; // L: 484
		playerOptionsPriorities = new boolean[8]; // L: 485
		field635 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 486
		combatTargetPlayerIndex = -1; // L: 487
		groundItems = new NodeDeque[4][104][104]; // L: 488
		pendingSpawns = new NodeDeque(); // L: 489
		projectiles = new NodeDeque(); // L: 490
		graphicsObjects = new NodeDeque(); // L: 491
		currentLevels = new int[25]; // L: 492
		levels = new int[25]; // L: 493
		experience = new int[25]; // L: 494
		field644 = new int[25]; // L: 495
		field645 = false; // L: 496
		isMenuOpen = false; // L: 497
		menuOptionsCount = 0; // L: 503
		menuArguments1 = new int[500]; // L: 504
		menuArguments2 = new int[500]; // L: 505
		menuOpcodes = new int[500]; // L: 506
		menuIdentifiers = new int[500]; // L: 507
		field687 = new int[500]; // L: 508
		menuActions = new String[500]; // L: 509
		menuTargets = new String[500]; // L: 510
		menuShiftClick = new boolean[500]; // L: 511
		followerOpsLowPriority = false; // L: 512
		tapToDrop = false; // L: 514
		showMouseOverText = true; // L: 515
		viewportX = -1; // L: 516
		viewportY = -1; // L: 517
		field750 = 0; // L: 521
		field662 = 50; // L: 522
		isItemSelected = 0; // L: 523
		field664 = null; // L: 527
		isSpellSelected = false; // L: 528
		field666 = -1; // L: 530
		field554 = -1; // L: 531
		field668 = null; // L: 533
		field669 = null; // L: 534
		rootInterface = -1; // L: 535
		interfaceParents = new NodeHashTable(8); // L: 536
		field798 = 0; // L: 541
		field673 = -1; // L: 542
		chatEffects = 0; // L: 543
		meslayerContinueWidget = null; // L: 544
		field671 = 0; // L: 545
		weight = 0; // L: 546
		staffModLevel = 0; // L: 547
		followerIndex = -1; // L: 548
		playerMod = false; // L: 549
		viewportWidget = null; // L: 550
		clickedWidget = null; // L: 551
		clickedWidgetParent = null; // L: 552
		widgetClickX = 0; // L: 553
		widgetClickY = 0; // L: 554
		draggedOnWidget = null; // L: 555
		field739 = false; // L: 556
		field688 = -1; // L: 557
		field689 = -1; // L: 558
		field714 = false; // L: 559
		field719 = -1; // L: 560
		field692 = -1; // L: 561
		isDraggingWidget = false; // L: 562
		cycleCntr = 1; // L: 567
		field497 = new int[32]; // L: 570
		field696 = 0; // L: 571
		field697 = new int[32]; // L: 572
		field777 = 0; // L: 573
		field551 = new int[32]; // L: 574
		field665 = 0; // L: 575
		field701 = new int[32]; // L: 576
		field702 = 0; // L: 577
		chatCycle = 0; // L: 578
		field704 = 0; // L: 579
		field705 = 0; // L: 580
		field706 = 0; // L: 581
		field707 = 0; // L: 582
		field590 = 0; // L: 583
		field709 = 0; // L: 584
		field592 = 0; // L: 585
		mouseWheelRotation = 0; // L: 591
		field712 = new class548(); // L: 592
		scriptEvents = new NodeDeque(); // L: 593
		field631 = new NodeDeque(); // L: 594
		field715 = new NodeDeque(); // L: 595
		field716 = new NodeDeque(); // L: 596
		widgetFlags = new NodeHashTable(512); // L: 597
		rootWidgetCount = 0; // L: 599
		field607 = -2; // L: 600
		field720 = new boolean[100]; // L: 601
		field663 = new boolean[100]; // L: 602
		field729 = new boolean[100]; // L: 603
		rootWidgetXs = new int[100]; // L: 604
		rootWidgetYs = new int[100]; // L: 605
		rootWidgetWidths = new int[100]; // L: 606
		rootWidgetHeights = new int[100]; // L: 607
		field727 = 0; // L: 608
		field728 = 0L; // L: 609
		isResizable = true; // L: 610
		field656 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 617
		publicChatMode = 0; // L: 618
		tradeChatMode = 0; // L: 620
		field733 = ""; // L: 621
		field734 = new long[100]; // L: 623
		field735 = 0; // L: 624
		field661 = new class226(); // L: 625
		field608 = new class224(); // L: 626
		field738 = 0; // L: 628
		field617 = new int[128]; // L: 629
		field559 = new int[128]; // L: 630
		field741 = -1L; // L: 631
		currentClanSettings = new ClanSettings[4]; // L: 635
		currentClanChannels = new ClanChannel[4]; // L: 637
		field732 = -1; // L: 639
		mapIconCount = 0; // L: 640
		mapIconXs = new int[1000]; // L: 641
		mapIconYs = new int[1000]; // L: 642
		mapIcons = new SpritePixels[1000]; // L: 643
		destinationX = 0; // L: 644
		destinationY = 0; // L: 645
		minimapState = 0; // L: 652
		playingJingle = false; // L: 653
		soundEffectCount = 0; // L: 658
		soundEffectIds = new int[50]; // L: 659
		queuedSoundEffectLoops = new int[50]; // L: 660
		queuedSoundEffectDelays = new int[50]; // L: 661
		soundLocations = new int[50]; // L: 662
		soundEffects = new SoundEffect[50]; // L: 663
		isCameraLocked = false; // L: 665
		field760 = false; // L: 671
		field761 = false; // L: 672
		field762 = false; // L: 673
		field763 = null; // L: 679
		field500 = null; // L: 680
		field765 = null; // L: 681
		field766 = false; // L: 682
		field767 = new boolean[5]; // L: 690
		field722 = new int[5]; // L: 691
		field769 = new int[5]; // L: 692
		field788 = new int[5]; // L: 693
		field775 = new int[5]; // L: 694
		field772 = 256; // L: 695
		field773 = 205; // L: 696
		zoomHeight = 256; // L: 697
		zoomWidth = 320; // L: 698
		field776 = 1; // L: 699
		field596 = 32767; // L: 700
		field778 = 1; // L: 701
		field779 = 32767; // L: 702
		viewportOffsetX = 0; // L: 703
		viewportOffsetY = 0; // L: 704
		viewportWidth = 0; // L: 705
		viewportHeight = 0; // L: 706
		viewportZoom = 0; // L: 707
		playerAppearance = new PlayerComposition(); // L: 709
		field736 = -1; // L: 710
		field787 = -1; // L: 711
		field529 = new DesktopPlatformInfoProvider(); // L: 713
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 715
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 718
		field791 = new class439(8, class437.field4677); // L: 720
		Widget_cachedModels = new EvictingDualNodeHashTable(64); // L: 722
		Widget_cachedFonts = new EvictingDualNodeHashTable(64); // L: 723
		field730 = -1; // L: 726
		field758 = -1; // L: 732
		field786 = new ArrayList(); // L: 733
		field691 = new class232(); // L: 734
		archiveLoaders = new ArrayList(10); // L: 735
		archiveLoadersDone = 0; // L: 736
		field785 = 0; // L: 737
		field801 = new ApproximateRouteStrategy(); // L: 746
		field802 = new int[50]; // L: 747
		field803 = new int[50]; // L: 748
	}

	public Client() {
		this.field539 = false; // L: 302
		this.field561 = 0; // L: 303
		this.accountHash = -1L; // L: 348
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "35"
	)
	protected final void vmethod1681() {
		field728 = UserComparator9.method2973() + 500L; // L: 4608
		this.resizeJS(); // L: 4609
		if (rootInterface != -1) { // L: 4610
			this.method1280(true);
		}

	} // L: 4611

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1581898600"
	)
	@Export("setUp")
	protected final void setUp() {
		UserComparator10.method2989(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}); // L: 1054
		SecureRandomCallable.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 1055
		class14.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 1056
		GrandExchangeOfferOwnWorldComparator.currentPort = SecureRandomCallable.worldPort; // L: 1057
		class539.field5245 = class345.field3685; // L: 1058
		PlayerComposition.field3646 = class345.field3684; // L: 1059
		PlayerComposition.field3648 = class345.field3686; // L: 1060
		DevicePcmPlayerProvider.field113 = class345.field3683; // L: 1061
		class113.urlRequester = new class113(this.field539, 219); // L: 1062
		this.setUpKeyboard(); // L: 1064
		this.method606(); // L: 1065
		class168.mouseWheel = this.mouseWheel(); // L: 1066
		this.method632(field608, 0); // L: 1067
		this.method632(field661, 1); // L: 1068
		this.setUpClipboard(); // L: 1069
		class357.field3922 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1071
		AccessFile var2 = null; // L: 1074
		ClientPreferences var3 = new ClientPreferences(); // L: 1075

		try {
			var2 = Huffman.getPreferencesFile("", class1.field3.name, false); // L: 1077
			byte[] var4 = new byte[(int)var2.length()]; // L: 1078

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) { // L: 1079 1080 1083
				var6 = var2.read(var4, var5, var4.length - var5); // L: 1081
				if (var6 == -1) { // L: 1082
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4)); // L: 1085
		} catch (Exception var8) { // L: 1087
		}

		try {
			if (var2 != null) { // L: 1089
				var2.close(); // L: 1090
			}
		} catch (Exception var7) { // L: 1093
		}

		class93.clientPreferences = var3; // L: 1096
		String var9 = Canvas.field120; // L: 1098
		class31.field163 = this; // L: 1100
		if (var9 != null) { // L: 1101
			class31.field161 = var9;
		}

		ClanSettings.setWindowedMode(class93.clientPreferences.method2552()); // L: 1103
		class332.friendSystem = new FriendSystem(UserComparator10.loginType); // L: 1104
		this.field653 = new class14("tokenRequest", 1, 1); // L: 1105
		Players.method2786(this); // L: 1106
		field691.method4561(); // L: 1107
	} // L: 1108

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 1116
		this.doCycleJs5(); // L: 1117
		Timer.method8056(); // L: 1118
		boolean var2 = false; // L: 1121
		boolean var3 = false; // L: 1122
		if (!class319.field3462.isEmpty()) { // L: 1123
			class422 var4 = (class422)class319.field3462.get(0); // L: 1124
			if (var4 == null) { // L: 1125
				class319.field3462.remove(0); // L: 1126
			} else if (var4.vmethod7975()) { // L: 1128
				if (var4.method7949()) { // L: 1129
					System.out.println("Error in midimanager.service: " + var4.method7952()); // L: 1130
					var2 = true; // L: 1131
				} else {
					if (var4.method7953() != null) { // L: 1134
						class319.field3462.add(1, var4.method7953()); // L: 1135
					}

					var3 = var4.method7963(); // L: 1137
				}

				class319.field3462.remove(0); // L: 1139
			} else {
				var3 = var4.method7963(); // L: 1142
			}
		}

		if (var2) { // L: 1145
			class319.field3462.clear(); // L: 1146
			class150.method3304(); // L: 1147
		}

		if (var3 && playingJingle && WorldMap.pcmPlayer1 != null) { // L: 1152 1153
			WorldMap.pcmPlayer1.tryDiscard();
		}

		WorldMapRectangle.method5020(); // L: 1155
		field661.method4423(); // L: 1156
		this.method504(); // L: 1157
		class208.method4205(); // L: 1158
		if (class168.mouseWheel != null) { // L: 1159
			int var5 = class168.mouseWheel.useRotation(); // L: 1160
			mouseWheelRotation = var5; // L: 1161
		}

		if (gameState == 0) { // L: 1163
			class102.method2736(); // L: 1164
			WorldMapLabelSize.method4610(); // L: 1165
		} else if (gameState == 5) { // L: 1167
			HealthBarDefinition.method3669(this, UserComparator5.field1453, class339.fontPlain12); // L: 1168
			class102.method2736(); // L: 1169
			WorldMapLabelSize.method4610(); // L: 1170
		} else if (gameState != 10 && gameState != 11) { // L: 1172
			if (gameState == 20) { // L: 1173
				HealthBarDefinition.method3669(this, UserComparator5.field1453, class339.fontPlain12); // L: 1174
				this.doCycleLoggedOut(); // L: 1175
			} else if (gameState == 50) { // L: 1177
				HealthBarDefinition.method3669(this, UserComparator5.field1453, class339.fontPlain12); // L: 1178
				this.doCycleLoggedOut(); // L: 1179
			} else if (gameState == 25) { // L: 1181
				class466.method8613();
			}
		} else {
			HealthBarDefinition.method3669(this, UserComparator5.field1453, class339.fontPlain12);
		}

		if (gameState == 30) { // L: 1182
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) { // L: 1183
			this.doCycleLoggedOut();
		}

	} // L: 1184

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "65536"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field728 && UserComparator9.method2973() > field728) { // L: 1188 1189
			ClanSettings.setWindowedMode(ClanChannelMember.getWindowedMode()); // L: 1190
		}

		int var2;
		if (var1) { // L: 1193
			for (var2 = 0; var2 < 100; ++var2) { // L: 1194
				field720[var2] = true;
			}
		}

		if (gameState == 0) { // L: 1196
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1197
			class207.drawTitle(class90.fontBold12, UserComparator5.field1453, class339.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1198
			if (gameState == 20) { // L: 1199
				class207.drawTitle(class90.fontBold12, UserComparator5.field1453, class339.fontPlain12);
			} else if (gameState == 50) { // L: 1200
				class207.drawTitle(class90.fontBold12, UserComparator5.field1453, class339.fontPlain12);
			} else if (gameState == 25) { // L: 1201
				if (field568 == 1) { // L: 1202
					if (field566 > field567) { // L: 1203
						field567 = field566;
					}

					var2 = (field567 * 50 - field566 * 50) / field567; // L: 1204
					StructComposition.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false); // L: 1205
				} else if (field568 == 2) { // L: 1207
					if (field555 > field569) { // L: 1208
						field569 = field555;
					}

					var2 = (field569 * 50 - field555 * 50) / field569 + 50; // L: 1209
					StructComposition.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false); // L: 1210
				} else {
					StructComposition.drawLoadingMessage("Loading - please wait.", false); // L: 1212
				}
			} else if (gameState == 30) { // L: 1214
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1215
				StructComposition.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1216
				StructComposition.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class207.drawTitle(class90.fontBold12, UserComparator5.field1453, class339.fontPlain12); // L: 1206
		}

		if (gameState == 30 && field727 == 0 && !var1 && !isResizable) { // L: 1217
			for (var2 = 0; var2 < rootWidgetCount; ++var2) { // L: 1218
				if (field663[var2]) { // L: 1219
					WorldMapData_1.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]); // L: 1220
					field663[var2] = false; // L: 1221
				}
			}
		} else if (gameState > 0) { // L: 1225
			WorldMapData_1.rasterProvider.drawFull(0, 0); // L: 1226

			for (var2 = 0; var2 < rootWidgetCount; ++var2) { // L: 1227
				field663[var2] = false;
			}
		}

	} // L: 1229

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1847953596"
	)
	@Export("kill0")
	protected final void kill0() {
		if (ClientPreferences.varcs.hasUnwrittenChanges()) { // L: 1232
			ClientPreferences.varcs.write();
		}

		if (Canvas.mouseRecorder != null) { // L: 1233
			Canvas.mouseRecorder.isRunning = false;
		}

		Canvas.mouseRecorder = null; // L: 1234
		packetWriter.close(); // L: 1235
		if (MouseHandler.MouseHandler_instance != null) { // L: 1237
			synchronized(MouseHandler.MouseHandler_instance) { // L: 1238
				MouseHandler.MouseHandler_instance = null; // L: 1239
			} // L: 1240
		}

		class168.mouseWheel = null; // L: 1243
		if (WorldMap.pcmPlayer1 != null) { // L: 1244
			WorldMap.pcmPlayer1.shutdown();
		}

		UrlRequester.field1418.method7134(); // L: 1245
		Skeleton.method5380(); // L: 1246
		if (class113.urlRequester != null) { // L: 1247
			class113.urlRequester.close(); // L: 1248
			class113.urlRequester = null; // L: 1249
		}

		class106.method2774(); // L: 1251
		this.field653.method181(); // L: 1252
	} // L: 1253

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "164188662"
	)
	protected final void vmethod1251() {
	} // L: 759

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "27475"
	)
	boolean method1253() {
		return this.field561 == 1; // L: 951
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "463011586"
	)
	boolean method1791() {
		return class10.field37 != null && !class10.field37.trim().isEmpty() && class4.field4 != null && !class4.field4.trim().isEmpty(); // L: 991
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1185257720"
	)
	boolean method1257() {
		return ClanChannel.field1765 != null && !ClanChannel.field1765.trim().isEmpty() && class60.field437 != null && !class60.field437.trim().isEmpty(); // L: 995
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1362910256"
	)
	@Export("isOtlTokenRequesterInitialized")
	boolean isOtlTokenRequesterInitialized() {
		return this.field756 != null; // L: 999
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1792751076"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 1003
		var2.put("grant_type", "refresh_token"); // L: 1004
		var2.put("scope", "gamesso.token.create"); // L: 1005
		var2.put("refresh_token", var1); // L: 1006
		URL var3 = new URL(class424.field4605 + "shield/oauth/token" + (new class479(var2)).method8716()); // L: 1007
		class435 var4 = new class435(); // L: 1008
		if (this.method1253()) { // L: 1009
			var4.method8076(field505); // L: 1010
		} else {
			var4.method8076(field771); // L: 1013
		}

		var4.method8073("Host", (new URL(class424.field4605)).getHost()); // L: 1015
		var4.method8080(class476.field4847); // L: 1016
		class9 var5 = class9.field21; // L: 1017
		RefreshAccessTokenRequester var6 = this.field546; // L: 1018
		if (var6 != null) { // L: 1019
			this.field547 = var6.request(var5.method65(), var3, var4.method8072(), ""); // L: 1020
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field539); // L: 1023
			this.field726 = this.field653.method180(var7); // L: 1024
		}
	} // L: 1021 1025

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-28241"
	)
	void method1522(String var1) throws IOException {
		URL var2 = new URL(class424.field4605 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 1028
		class435 var3 = new class435(); // L: 1029
		var3.method8079(var1); // L: 1030
		class9 var4 = class9.field19; // L: 1031
		OtlTokenRequester var5 = this.field756; // L: 1032
		if (var5 != null) { // L: 1033
			this.field542 = var5.request(var4.method65(), var2, var3.method8072(), ""); // L: 1034
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field539); // L: 1037
			this.field540 = this.field653.method180(var6); // L: 1038
		}
	} // L: 1035 1039

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "7"
	)
	void method1273(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class148.field1665 + "game-session/v1/tokens"); // L: 1042
		class10 var4 = new class10(var3, class9.field21, this.field539); // L: 1043
		var4.method88().method8079(var1); // L: 1044
		var4.method88().method8080(class476.field4847); // L: 1045
		JSONObject var5 = new JSONObject(); // L: 1046
		var5.put("accountId", var2); // L: 1047
		var4.method82(new class478(var5)); // L: 1048
		this.field540 = this.field653.method180(var4); // L: 1049
	} // L: 1050

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1367
			boolean var1 = UrlRequester.field1418.method7139(); // L: 1368
			if (!var1) { // L: 1369
				this.method1569();
			}

		}
	} // L: 1370

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1702065078"
	)
	void method1569() {
		if (UrlRequester.field1418.field4377 >= 4) { // L: 1373
			this.error("js5crc"); // L: 1374
			class131.method3087(1000); // L: 1375
		} else {
			if (UrlRequester.field1418.field4398 >= 4) { // L: 1378
				if (gameState <= 5) { // L: 1379
					this.error("js5io"); // L: 1380
					class131.method3087(1000); // L: 1381
					return; // L: 1382
				}

				field530 = 3000; // L: 1385
				UrlRequester.field1418.field4398 = 3; // L: 1386
			}

			if (--field530 + 1 <= 0) { // L: 1389
				try {
					if (js5ConnectState == 0) { // L: 1391
						Bounds.js5SocketTask = GameEngine.taskHandler.newSocketTask(InvDefinition.worldHost, GrandExchangeOfferOwnWorldComparator.currentPort); // L: 1392
						++js5ConnectState; // L: 1393
					}

					if (js5ConnectState == 1) { // L: 1395
						if (Bounds.js5SocketTask.status == 2) { // L: 1396
							this.js5Error(-1); // L: 1397
							return; // L: 1398
						}

						if (Bounds.js5SocketTask.status == 1) { // L: 1400
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1402
						FriendsChatMember.js5Socket = WorldMapManager.method4879((Socket)Bounds.js5SocketTask.result, 40000, 5000); // L: 1403
						Buffer var1 = new Buffer(5); // L: 1404
						var1.writeByte(15); // L: 1405
						var1.method9373(219); // L: 1406
						FriendsChatMember.js5Socket.write(var1.array, 0, 5); // L: 1407
						++js5ConnectState; // L: 1408
						class18.field83 = UserComparator9.method2973(); // L: 1409
					}

					if (js5ConnectState == 3) { // L: 1411
						if (FriendsChatMember.js5Socket.available() > 0) { // L: 1412
							int var2 = FriendsChatMember.js5Socket.readUnsignedByte(); // L: 1413
							if (var2 != 0) { // L: 1414
								this.js5Error(var2); // L: 1415
								return; // L: 1416
							}

							++js5ConnectState; // L: 1418
						} else if (UserComparator9.method2973() - class18.field83 > 30000L) { // L: 1421
							this.js5Error(-2); // L: 1422
							return; // L: 1423
						}
					}

					if (js5ConnectState == 4) { // L: 1427
						UrlRequester.field1418.method7127(FriendsChatMember.js5Socket, gameState > 20); // L: 1428
						Bounds.js5SocketTask = null; // L: 1429
						FriendsChatMember.js5Socket = null; // L: 1430
						js5ConnectState = 0; // L: 1431
						js5Errors = 0; // L: 1432
					}
				} catch (IOException var3) { // L: 1435
					this.js5Error(-3); // L: 1436
				}

			}
		}
	} // L: 1376 1438

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1719019352"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		Bounds.js5SocketTask = null; // L: 1441
		FriendsChatMember.js5Socket = null; // L: 1442
		js5ConnectState = 0; // L: 1443
		if (GrandExchangeOfferOwnWorldComparator.currentPort == SecureRandomCallable.worldPort) { // L: 1444
			GrandExchangeOfferOwnWorldComparator.currentPort = class14.js5Port;
		} else {
			GrandExchangeOfferOwnWorldComparator.currentPort = SecureRandomCallable.worldPort; // L: 1445
		}

		++js5Errors; // L: 1446
		if (js5Errors < 2 || var1 != 7 && var1 != 9) { // L: 1447
			if (js5Errors >= 2 && var1 == 6) { // L: 1454
				this.error("js5connect_outofdate"); // L: 1455
				class131.method3087(1000); // L: 1456
			} else if (js5Errors >= 4) { // L: 1458
				if (gameState <= 5) { // L: 1459
					this.error("js5connect"); // L: 1460
					class131.method3087(1000); // L: 1461
				} else {
					field530 = 3000; // L: 1463
				}
			}
		} else if (gameState <= 5) { // L: 1448
			this.error("js5connect_full"); // L: 1449
			class131.method3087(1000); // L: 1450
		} else {
			field530 = 3000; // L: 1452
		}

	} // L: 1465

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "534530571"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket(); // L: 1988
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 1989

		try {
			if (loginState == 0) { // L: 1991
				if (class161.secureRandom == null && (secureRandomFuture.isDone() || field533 > 250)) { // L: 1992
					class161.secureRandom = secureRandomFuture.get(); // L: 1993
					secureRandomFuture.shutdown(); // L: 1994
					secureRandomFuture = null; // L: 1995
				}

				if (class161.secureRandom != null) { // L: 1997
					if (var1 != null) { // L: 1998
						var1.close(); // L: 1999
						var1 = null; // L: 2000
					}

					class132.socketTask = null; // L: 2002
					hadNetworkError = false; // L: 2003
					field533 = 0; // L: 2004
					if (field626.method9672()) { // L: 2005
						if (this.method1791()) { // L: 2006
							try {
								this.requestOtlToken(class4.field4); // L: 2008
								UrlRequest.method2930(21); // L: 2009
							} catch (Throwable var22) { // L: 2011
								class368.RunException_sendStackTrace((String)null, var22); // L: 2012
								HealthBar.getLoginError(65); // L: 2013
								return; // L: 2014
							}
						} else {
							if (!this.method1257()) { // L: 2017
								HealthBar.getLoginError(65); // L: 2029
								return; // L: 2030
							}

							try {
								this.method1273(ClanChannel.field1765, class60.field437); // L: 2019
								UrlRequest.method2930(20); // L: 2020
							} catch (Exception var21) { // L: 2022
								class368.RunException_sendStackTrace((String)null, var21); // L: 2023
								HealthBar.getLoginError(65); // L: 2024
								return; // L: 2025
							}
						}
					} else {
						UrlRequest.method2930(1); // L: 2034
					}
				}
			}

			class20 var24;
			if (loginState == 21) { // L: 2038
				if (this.field547 != null) { // L: 2039
					if (!this.field547.isDone()) { // L: 2040
						return; // L: 2041
					}

					if (this.field547.isCancelled()) { // L: 2043
						HealthBar.getLoginError(65); // L: 2044
						this.field547 = null; // L: 2045
						return; // L: 2046
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field547.get(); // L: 2049
						if (!var3.isSuccess()) { // L: 2050
							HealthBar.getLoginError(65); // L: 2051
							this.field547 = null; // L: 2052
							return; // L: 2053
						}

						class10.field37 = var3.getAccessToken(); // L: 2055
						class4.field4 = var3.getRefreshToken(); // L: 2056
						this.field547 = null; // L: 2057
					} catch (Exception var20) { // L: 2059
						class368.RunException_sendStackTrace((String)null, var20); // L: 2060
						HealthBar.getLoginError(65); // L: 2061
						this.field547 = null; // L: 2062
						return; // L: 2063
					}
				} else {
					if (this.field726 == null) { // L: 2066
						HealthBar.getLoginError(65); // L: 2096
						return; // L: 2097
					}

					if (!this.field726.method277()) { // L: 2067
						return; // L: 2068
					}

					if (this.field726.method276()) { // L: 2070
						class368.RunException_sendStackTrace(this.field726.method278(), (Throwable)null); // L: 2071
						HealthBar.getLoginError(65); // L: 2072
						this.field726 = null; // L: 2073
						return; // L: 2074
					}

					var24 = this.field726.method288(); // L: 2076
					if (var24.method302() != 200) { // L: 2077
						HealthBar.getLoginError(65); // L: 2078
						this.field726 = null; // L: 2079
						return; // L: 2080
					}

					field533 = 0; // L: 2082
					class478 var4 = new class478(var24.method304()); // L: 2083

					try {
						class10.field37 = var4.method8694().getString("access_token"); // L: 2085
						class4.field4 = var4.method8694().getString("refresh_token"); // L: 2086
					} catch (Exception var19) { // L: 2088
						class368.RunException_sendStackTrace("Error parsing tokens", var19); // L: 2089
						HealthBar.getLoginError(65); // L: 2090
						this.field726 = null; // L: 2091
						return; // L: 2092
					}
				}

				this.method1522(class10.field37); // L: 2099
				UrlRequest.method2930(20); // L: 2100
			}

			if (loginState == 20) { // L: 2102
				if (this.field542 != null) { // L: 2103
					if (!this.field542.isDone()) { // L: 2104
						return; // L: 2105
					}

					if (this.field542.isCancelled()) { // L: 2107
						HealthBar.getLoginError(65); // L: 2108
						this.field542 = null; // L: 2109
						return; // L: 2110
					}

					try {
						OtlTokenResponse var25 = (OtlTokenResponse)this.field542.get(); // L: 2113
						if (!var25.isSuccess()) { // L: 2114
							HealthBar.getLoginError(65); // L: 2115
							this.field542 = null; // L: 2116
							return; // L: 2117
						}

						this.field538 = var25.getToken(); // L: 2119
						this.field542 = null; // L: 2120
					} catch (Exception var18) { // L: 2122
						class368.RunException_sendStackTrace((String)null, var18); // L: 2123
						HealthBar.getLoginError(65); // L: 2124
						this.field542 = null; // L: 2125
						return; // L: 2126
					}
				} else {
					if (this.field540 == null) { // L: 2129
						HealthBar.getLoginError(65); // L: 2165
						return; // L: 2166
					}

					if (!this.field540.method277()) { // L: 2130
						return; // L: 2131
					}

					if (this.field540.method276()) { // L: 2133
						class368.RunException_sendStackTrace(this.field540.method278(), (Throwable)null); // L: 2134
						HealthBar.getLoginError(65); // L: 2135
						this.field540 = null; // L: 2136
						return; // L: 2137
					}

					var24 = this.field540.method288(); // L: 2139
					if (var24.method302() != 200) { // L: 2140
						class368.RunException_sendStackTrace("Response code: " + var24.method302() + "Response body: " + var24.method304(), (Throwable)null); // L: 2141
						HealthBar.getLoginError(65); // L: 2142
						this.field540 = null; // L: 2143
						return; // L: 2144
					}

					List var26 = (List)var24.method300().get("Content-Type"); // L: 2146
					if (var26 != null && var26.contains(class476.field4847.method8682())) { // L: 2147
						try {
							JSONObject var5 = new JSONObject(var24.method304()); // L: 2149
							this.field538 = var5.getString("token"); // L: 2150
						} catch (JSONException var17) { // L: 2152
							class368.RunException_sendStackTrace((String)null, var17); // L: 2153
							HealthBar.getLoginError(65); // L: 2154
							this.field540 = null; // L: 2155
							return; // L: 2156
						}
					} else {
						this.field538 = var24.method304(); // L: 2160
					}

					this.field540 = null; // L: 2162
				}

				field533 = 0; // L: 2168
				UrlRequest.method2930(1); // L: 2169
			}

			if (loginState == 1) { // L: 2171
				if (class132.socketTask == null) { // L: 2172
					class132.socketTask = GameEngine.taskHandler.newSocketTask(InvDefinition.worldHost, GrandExchangeOfferOwnWorldComparator.currentPort); // L: 2173
				}

				if (class132.socketTask.status == 2) { // L: 2175
					throw new IOException();
				}

				if (class132.socketTask.status == 1) { // L: 2176
					var1 = WorldMapManager.method4879((Socket)class132.socketTask.result, 40000, 5000); // L: 2177
					packetWriter.setSocket(var1); // L: 2178
					class132.socketTask = null; // L: 2179
					UrlRequest.method2930(2); // L: 2180
				}
			}

			PacketBufferNode var28;
			if (loginState == 2) { // L: 2183
				packetWriter.clearBuffer(); // L: 2184
				var28 = SecureRandomFuture.method2234(); // L: 2187
				var28.clientPacket = null; // L: 2188
				var28.clientPacketLength = 0; // L: 2189
				var28.packetBuffer = new PacketBuffer(5000); // L: 2190
				var28.packetBuffer.writeByte(LoginPacket.field3421.id); // L: 2194
				packetWriter.addNode(var28); // L: 2195
				packetWriter.flush(); // L: 2196
				var2.offset = 0; // L: 2197
				UrlRequest.method2930(3); // L: 2198
			}

			int var13;
			if (loginState == 3) { // L: 2200
				if (WorldMap.pcmPlayer1 != null) { // L: 2201
					WorldMap.pcmPlayer1.method845();
				}

				if (var1.isAvailable(1)) { // L: 2202
					var13 = var1.readUnsignedByte(); // L: 2203
					if (WorldMap.pcmPlayer1 != null) { // L: 2204
						WorldMap.pcmPlayer1.method845();
					}

					if (var13 != 0) { // L: 2205
						HealthBar.getLoginError(var13); // L: 2206
						return; // L: 2207
					}

					var2.offset = 0; // L: 2209
					UrlRequest.method2930(4); // L: 2210
				}
			}

			if (loginState == 4) { // L: 2213
				if (var2.offset < 8) { // L: 2214
					var13 = var1.available(); // L: 2215
					if (var13 > 8 - var2.offset) { // L: 2216
						var13 = 8 - var2.offset;
					}

					if (var13 > 0) { // L: 2217
						var1.read(var2.array, var2.offset, var13); // L: 2218
						var2.offset += var13; // L: 2219
					}
				}

				if (var2.offset == 8) { // L: 2222
					var2.offset = 0; // L: 2223
					class137.field1594 = var2.readLong(); // L: 2224
					UrlRequest.method2930(5); // L: 2225
				}
			}

			if (loginState == 5) { // L: 2228
				packetWriter.packetBuffer.offset = 0; // L: 2229
				packetWriter.clearBuffer(); // L: 2230
				PacketBuffer var27 = new PacketBuffer(500); // L: 2231
				int[] var30 = new int[]{class161.secureRandom.nextInt(), class161.secureRandom.nextInt(), class161.secureRandom.nextInt(), class161.secureRandom.nextInt()}; // L: 2232 2233 2234 2235 2236
				var27.offset = 0; // L: 2237
				var27.writeByte(1); // L: 2238
				var27.method9373(var30[0]); // L: 2239
				var27.method9373(var30[1]); // L: 2240
				var27.method9373(var30[2]); // L: 2241
				var27.method9373(var30[3]); // L: 2242
				var27.writeLong(class137.field1594); // L: 2243
				if (gameState == 40) { // L: 2244
					var27.method9373(class17.field75[0]); // L: 2245
					var27.method9373(class17.field75[1]); // L: 2246
					var27.method9373(class17.field75[2]); // L: 2247
					var27.method9373(class17.field75[3]); // L: 2248
				} else {
					if (gameState == 50) { // L: 2251
						var27.writeByte(class124.field1473.rsOrdinal()); // L: 2252
						var27.method9373(class105.field1340); // L: 2253
					} else {
						var27.writeByte(field575.rsOrdinal()); // L: 2256
						switch(field575.field1475) { // L: 2257
						case 0:
						case 4:
							var27.writeMedium(class130.field1525); // L: 2266
							++var27.offset; // L: 2267
							break; // L: 2268
						case 1:
							var27.method9373(class93.clientPreferences.method2560(Login.Login_username)); // L: 2260
						case 2:
						default:
							break;
						case 3:
							var27.offset += 4; // L: 2272
						}
					}

					if (field626.method9672()) { // L: 2277
						var27.writeByte(class535.field5233.rsOrdinal()); // L: 2278
						var27.writeStringCp1252NullTerminated(this.field538); // L: 2279
					} else {
						var27.writeByte(class535.field5235.rsOrdinal()); // L: 2282
						var27.writeStringCp1252NullTerminated(Login.Login_password); // L: 2283
					}
				}

				var27.encryptRsa(class74.field898, class74.field902); // L: 2286
				class17.field75 = var30; // L: 2287
				PacketBufferNode var6 = SecureRandomFuture.method2234(); // L: 2290
				var6.clientPacket = null; // L: 2291
				var6.clientPacketLength = 0; // L: 2292
				var6.packetBuffer = new PacketBuffer(5000); // L: 2293
				var6.packetBuffer.offset = 0; // L: 2297
				if (gameState == 40) { // L: 2298
					var6.packetBuffer.writeByte(LoginPacket.field3415.id); // L: 2299
				} else {
					var6.packetBuffer.writeByte(LoginPacket.field3416.id); // L: 2302
				}

				var6.packetBuffer.writeShort(0); // L: 2304
				int var7 = var6.packetBuffer.offset; // L: 2305
				var6.packetBuffer.method9373(219); // L: 2306
				var6.packetBuffer.method9373(1); // L: 2307
				var6.packetBuffer.writeByte(clientType); // L: 2308
				var6.packetBuffer.writeByte(field667); // L: 2309
				byte var8 = 0; // L: 2310
				var6.packetBuffer.writeByte(var8); // L: 2311
				var6.packetBuffer.writeBytes(var27.array, 0, var27.offset); // L: 2312
				int var9 = var6.packetBuffer.offset; // L: 2313
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2314
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2315
				var6.packetBuffer.writeShort(class524.canvasWidth); // L: 2316
				var6.packetBuffer.writeShort(GameEngine.canvasHeight); // L: 2317
				class12.method170(var6.packetBuffer); // L: 2318
				var6.packetBuffer.writeStringCp1252NullTerminated(class426.field4608); // L: 2319
				var6.packetBuffer.method9373(WorldMapData_0.field2467); // L: 2320
				var6.packetBuffer.writeByte(0); // L: 2321
				Buffer var10 = new Buffer(FriendSystem.field823.size()); // L: 2322
				FriendSystem.field823.write(var10); // L: 2323
				var6.packetBuffer.writeBytes(var10.array, 0, var10.array.length); // L: 2324
				var6.packetBuffer.writeByte(clientType); // L: 2325
				var6.packetBuffer.method9373(0); // L: 2326
				var6.packetBuffer.method9494(class142.field1632.hash); // L: 2327
				var6.packetBuffer.method9494(DynamicObject.field994.hash); // L: 2328
				var6.packetBuffer.method9439(class19.field94.hash); // L: 2329
				var6.packetBuffer.method9437(class127.field1489.hash); // L: 2330
				var6.packetBuffer.method9439(WorldMapDecorationType.archive12.hash); // L: 2331
				var6.packetBuffer.method9437(class476.archive4.hash); // L: 2332
				var6.packetBuffer.method9494(WorldMapDecoration.field2627.hash); // L: 2333
				var6.packetBuffer.method9439(class314.field3428.hash); // L: 2334
				var6.packetBuffer.method9373(class30.archive9.hash); // L: 2335
				var6.packetBuffer.method9439(0); // L: 2336
				var6.packetBuffer.method9373(MusicPatchNode.field3548.hash); // L: 2337
				var6.packetBuffer.method9437(HitSplatDefinition.archive13.hash); // L: 2338
				var6.packetBuffer.method9494(class189.field1995.hash); // L: 2339
				var6.packetBuffer.method9494(class130.field1521.hash); // L: 2340
				var6.packetBuffer.method9494(WorldMapSection0.field2587.hash); // L: 2341
				var6.packetBuffer.method9437(PacketBufferNode.field3284.hash); // L: 2342
				var6.packetBuffer.method9439(class274.field2907.hash); // L: 2343
				var6.packetBuffer.method9437(class36.archive2.hash); // L: 2344
				var6.packetBuffer.method9437(class189.field1999.hash); // L: 2345
				var6.packetBuffer.method9439(DirectByteArrayCopier.field3862.hash); // L: 2346
				var6.packetBuffer.method9439(class173.field1820.hash); // L: 2347
				var6.packetBuffer.xteaEncrypt(var30, var9, var6.packetBuffer.offset); // L: 2348
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var7); // L: 2349
				packetWriter.addNode(var6); // L: 2350
				packetWriter.flush(); // L: 2351
				packetWriter.isaacCipher = new IsaacCipher(var30); // L: 2352
				int[] var11 = new int[4]; // L: 2353

				for (int var12 = 0; var12 < 4; ++var12) { // L: 2354
					var11[var12] = var30[var12] + 50;
				}

				var2.newIsaacCipher(var11); // L: 2355
				UrlRequest.method2930(6); // L: 2356
			}

			int var14;
			if (loginState == 6 && var1.available() > 0) { // L: 2358 2359
				var13 = var1.readUnsignedByte(); // L: 2360
				if (var13 == 61) { // L: 2361
					var14 = var1.available(); // L: 2362
					class373.field4355 = var14 == 1 && var1.readUnsignedByte() == 1; // L: 2363
					UrlRequest.method2930(5); // L: 2364
				}

				if (var13 == 21 && gameState == 20) { // L: 2366
					UrlRequest.method2930(12); // L: 2367
				} else if (var13 == 2) { // L: 2369
					UrlRequest.method2930(14); // L: 2370
				} else if (var13 == 15 && gameState == 40) { // L: 2372
					packetWriter.serverPacketLength = -1; // L: 2373
					UrlRequest.method2930(19); // L: 2374
				} else if (var13 == 64) { // L: 2376
					UrlRequest.method2930(10); // L: 2377
				} else if (var13 == 23 && field534 < 1) { // L: 2379
					++field534; // L: 2380
					UrlRequest.method2930(0); // L: 2381
				} else if (var13 == 29) { // L: 2383
					UrlRequest.method2930(17); // L: 2384
				} else {
					if (var13 != 69) { // L: 2386
						HealthBar.getLoginError(var13); // L: 2390
						return; // L: 2391
					}

					UrlRequest.method2930(7); // L: 2387
				}
			}

			if (loginState == 7 && var1.available() >= 2) { // L: 2395 2396
				var1.read(var2.array, 0, 2); // L: 2397
				var2.offset = 0; // L: 2398
				MusicPatch.field3532 = var2.readUnsignedShort(); // L: 2399
				UrlRequest.method2930(8); // L: 2400
			}

			if (loginState == 8 && var1.available() >= MusicPatch.field3532) { // L: 2403 2404
				var2.offset = 0; // L: 2405
				var1.read(var2.array, var2.offset, MusicPatch.field3532); // L: 2406
				class6 var29 = class31.method467()[var2.readUnsignedByte()]; // L: 2407

				try {
					switch(var29.field9) { // L: 2411
					case 0:
						class0 var32 = new class0(); // L: 2414
						this.field695 = new class7(var2, var32); // L: 2424
						UrlRequest.method2930(9); // L: 2425
						break;
					default:
						throw new IllegalArgumentException(); // L: 2419
					}
				} catch (Exception var16) { // L: 2427
					HealthBar.getLoginError(22); // L: 2428
					return; // L: 2429
				}
			}

			if (loginState == 9 && this.field695.method44()) { // L: 2433 2434
				this.field552 = this.field695.method46(); // L: 2435
				this.field695.method45(); // L: 2436
				this.field695 = null; // L: 2437
				if (this.field552 == null) { // L: 2438
					HealthBar.getLoginError(22); // L: 2439
					return; // L: 2440
				}

				packetWriter.clearBuffer(); // L: 2442
				var28 = SecureRandomFuture.method2234(); // L: 2445
				var28.clientPacket = null; // L: 2446
				var28.clientPacketLength = 0; // L: 2447
				var28.packetBuffer = new PacketBuffer(5000); // L: 2448
				var28.packetBuffer.writeByte(LoginPacket.field3414.id); // L: 2452
				var28.packetBuffer.writeShort(this.field552.offset); // L: 2453
				var28.packetBuffer.method9460(this.field552); // L: 2454
				packetWriter.addNode(var28); // L: 2455
				packetWriter.flush(); // L: 2456
				this.field552 = null; // L: 2457
				UrlRequest.method2930(6); // L: 2458
			}

			if (loginState == 10 && var1.available() > 0) { // L: 2461 2462
				class351.field3864 = var1.readUnsignedByte(); // L: 2463
				UrlRequest.method2930(11); // L: 2464
			}

			if (loginState == 11 && var1.available() >= class351.field3864) { // L: 2467 2468
				var1.read(var2.array, 0, class351.field3864); // L: 2469
				var2.offset = 0; // L: 2470
				UrlRequest.method2930(6); // L: 2471
			}

			if (loginState == 12 && var1.available() > 0) { // L: 2474 2475
				field745 = (var1.readUnsignedByte() + 3) * 60; // L: 2476
				UrlRequest.method2930(13); // L: 2477
			}

			if (loginState == 13) { // L: 2480
				field533 = 0; // L: 2481
				class142.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field745 / 60 + " seconds."); // L: 2482
				if (--field745 <= 0) { // L: 2483
					UrlRequest.method2930(0);
				}

			} else {
				if (loginState == 14 && var1.available() >= 1) { // L: 2486 2487
					class53.field369 = var1.readUnsignedByte(); // L: 2488
					UrlRequest.method2930(15); // L: 2489
				}

				if (loginState == 15 && var1.available() >= class53.field369) { // L: 2492 2493
					boolean var38 = var1.readUnsignedByte() == 1; // L: 2494
					var1.read(var2.array, 0, 4); // L: 2495
					var2.offset = 0; // L: 2496
					boolean var37 = false; // L: 2497
					if (var38) { // L: 2498
						var14 = var2.readByteIsaac() << 24; // L: 2499
						var14 |= var2.readByteIsaac() << 16; // L: 2500
						var14 |= var2.readByteIsaac() << 8; // L: 2501
						var14 |= var2.readByteIsaac(); // L: 2502
						class93.clientPreferences.method2558(Login.Login_username, var14); // L: 2503
					}

					if (Login_isUsernameRemembered) { // L: 2505
						class93.clientPreferences.method2604(Login.Login_username); // L: 2506
					} else {
						class93.clientPreferences.method2604((String)null); // L: 2509
					}

					class408.savePreferences(); // L: 2511
					staffModLevel = var1.readUnsignedByte(); // L: 2512
					playerMod = var1.readUnsignedByte() == 1; // L: 2513
					localPlayerIndex = var1.readUnsignedByte(); // L: 2514
					localPlayerIndex <<= 8; // L: 2515
					localPlayerIndex += var1.readUnsignedByte(); // L: 2516
					field518 = var1.readUnsignedByte(); // L: 2517
					var1.read(var2.array, 0, 8); // L: 2518
					var2.offset = 0; // L: 2519
					this.accountHash = var2.readLong(); // L: 2520
					var1.read(var2.array, 0, 8); // L: 2521
					var2.offset = 0; // L: 2522
					field509 = var2.readLong(); // L: 2523
					var1.read(var2.array, 0, 8); // L: 2524
					var2.offset = 0; // L: 2525
					field627 = var2.readLong(); // L: 2526
					KitDefinition.method3664().method4281(); // L: 2527
					UrlRequest.method2930(22); // L: 2528
				}

				if (loginState == 22 && var1.available() >= packetWriter.serverPacketLength) { // L: 2531 2532
					var1.read(var2.array, 0, 1); // L: 2533
					var2.offset = 0; // L: 2534
					if (var2.method9326()) { // L: 2535
						var1.read(var2.array, 1, 1); // L: 2536
						var2.offset = 0; // L: 2537
					}

					ServerPacket[] var31 = class143.method3234(); // L: 2539
					var14 = var2.readSmartByteShortIsaac(); // L: 2540
					if (var14 < 0 || var14 >= var31.length) { // L: 2541
						throw new IOException("Invalid ServerProt: " + var14 + " at " + var2.offset); // L: 2542
					}

					packetWriter.serverPacket = var31[var14]; // L: 2544
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2545
					var1.read(var2.array, 0, 2); // L: 2546
					var2.offset = 0; // L: 2547
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2548

					try {
						Client var33 = VertexNormal.client; // L: 2550
						JSObject.getWindow(var33).call("zap", (Object[])null); // L: 2553
					} catch (Throwable var15) { // L: 2556
					}

					UrlRequest.method2930(16); // L: 2557
				}

				if (loginState == 16) { // L: 2560
					if (var1.available() >= packetWriter.serverPacketLength) { // L: 2561
						var2.offset = 0; // L: 2562
						var1.read(var2.array, 0, packetWriter.serverPacketLength); // L: 2563
						timer.method8042(); // L: 2564
						WorldMapElement.method3627(); // L: 2565
						ClientPacket.updatePlayer(var2); // L: 2566
						class25.field134 = -1; // L: 2567
						class467.loadRegions(false, var2); // L: 2568
						packetWriter.serverPacket = null; // L: 2569
					}

				} else {
					if (loginState == 17 && var1.available() >= 2) { // L: 2573 2574
						var2.offset = 0; // L: 2575
						var1.read(var2.array, 0, 2); // L: 2576
						var2.offset = 0; // L: 2577
						RouteStrategy.field2446 = var2.readUnsignedShort(); // L: 2578
						UrlRequest.method2930(18); // L: 2579
					}

					if (loginState == 18 && var1.available() >= RouteStrategy.field2446) { // L: 2582 2583
						var2.offset = 0; // L: 2584
						var1.read(var2.array, 0, RouteStrategy.field2446); // L: 2585
						var2.offset = 0; // L: 2586
						String var34 = var2.readStringCp1252NullTerminated(); // L: 2587
						String var36 = var2.readStringCp1252NullTerminated(); // L: 2588
						String var35 = var2.readStringCp1252NullTerminated(); // L: 2589
						class142.setLoginResponseString(var34, var36, var35); // L: 2590
						class131.method3087(10); // L: 2591
						if (field626.method9672()) { // L: 2592
							Actor.method2489(9); // L: 2593
						}
					}

					if (loginState == 19) { // L: 2597
						if (packetWriter.serverPacketLength == -1) { // L: 2598
							if (var1.available() < 2) { // L: 2599
								return;
							}

							var1.read(var2.array, 0, 2); // L: 2600
							var2.offset = 0; // L: 2601
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2602
						}

						if (var1.available() >= packetWriter.serverPacketLength) { // L: 2604
							var1.read(var2.array, 0, packetWriter.serverPacketLength); // L: 2605
							var2.offset = 0; // L: 2606
							var13 = packetWriter.serverPacketLength; // L: 2607
							timer.method8038(); // L: 2608
							MouseHandler.method716(); // L: 2609
							ClientPacket.updatePlayer(var2); // L: 2610
							if (var13 != var2.offset) { // L: 2611
								throw new RuntimeException(); // L: 2612
							}
						}
					} else {
						++field533; // L: 2616
						if (field533 > 2000) { // L: 2617
							if (field534 < 1) { // L: 2618
								if (GrandExchangeOfferOwnWorldComparator.currentPort == SecureRandomCallable.worldPort) { // L: 2619
									GrandExchangeOfferOwnWorldComparator.currentPort = class14.js5Port;
								} else {
									GrandExchangeOfferOwnWorldComparator.currentPort = SecureRandomCallable.worldPort; // L: 2620
								}

								++field534; // L: 2621
								UrlRequest.method2930(0); // L: 2622
							} else {
								HealthBar.getLoginError(-3); // L: 2625
							}
						}
					}
				}
			}
		} catch (IOException var23) { // L: 2629
			if (field534 < 1) { // L: 2630
				if (GrandExchangeOfferOwnWorldComparator.currentPort == SecureRandomCallable.worldPort) { // L: 2631
					GrandExchangeOfferOwnWorldComparator.currentPort = class14.js5Port;
				} else {
					GrandExchangeOfferOwnWorldComparator.currentPort = SecureRandomCallable.worldPort; // L: 2632
				}

				++field534; // L: 2633
				UrlRequest.method2930(0); // L: 2634
			} else {
				HealthBar.getLoginError(-2); // L: 2637
			}
		}
	} // L: 2484 2571 2614 2623 2626 2635 2638 2640

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1682282602"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3070
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3071
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3072
			hadNetworkError = false; // L: 3073
			Messages.method2849(); // L: 3074
		} else {
			if (!isMenuOpen) { // L: 3077
				class365.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1276(packetWriter); ++var1) { // L: 3078 3079
			}

			if (gameState == 30) { // L: 3081
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 3085
					boolean var29;
					if (var2 == null) { // L: 3086
						var29 = false; // L: 3087
					} else {
						var29 = true; // L: 3090
					}

					int var3;
					PacketBufferNode var30;
					if (!var29) { // L: 3092
						PacketBufferNode var14;
						int var15;
						if (timer.field4633) { // L: 3100
							var14 = class482.getPacketBufferNode(ClientPacket.field3182, packetWriter.isaacCipher); // L: 3102
							var14.packetBuffer.writeByte(0); // L: 3103
							var15 = var14.packetBuffer.offset; // L: 3104
							timer.write(var14.packetBuffer); // L: 3105
							var14.packetBuffer.method9384(var14.packetBuffer.offset - var15); // L: 3106
							packetWriter.addNode(var14); // L: 3107
							timer.method8043(); // L: 3108
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
						synchronized(Canvas.mouseRecorder.lock) { // L: 3111
							if (!field764) { // L: 3112
								Canvas.mouseRecorder.index = 0; // L: 3198
							} else if (MouseHandler.MouseHandler_lastButton != 0 || Canvas.mouseRecorder.index >= 40) { // L: 3113
								var30 = null; // L: 3115
								var3 = 0; // L: 3116
								var4 = 0; // L: 3117
								var5 = 0; // L: 3118
								var6 = 0; // L: 3119

								for (var7 = 0; var7 < Canvas.mouseRecorder.index && (var30 == null || var30.packetBuffer.offset - var3 < 246); ++var7) { // L: 3120 3121
									var4 = var7; // L: 3122
									var8 = Canvas.mouseRecorder.ys[var7]; // L: 3123
									if (var8 < -1) { // L: 3124
										var8 = -1;
									} else if (var8 > 65534) { // L: 3125
										var8 = 65534;
									}

									var9 = Canvas.mouseRecorder.xs[var7]; // L: 3126
									if (var9 < -1) { // L: 3127
										var9 = -1;
									} else if (var9 > 65534) { // L: 3128
										var9 = 65534;
									}

									if (var9 != field512 || var8 != field783) { // L: 3129
										if (var30 == null) { // L: 3132
											var30 = class482.getPacketBufferNode(ClientPacket.field3166, packetWriter.isaacCipher); // L: 3133
											var30.packetBuffer.writeByte(0); // L: 3134
											var3 = var30.packetBuffer.offset; // L: 3135
											PacketBuffer var10000 = var30.packetBuffer; // L: 3136
											var10000.offset += 2;
											var5 = 0; // L: 3137
											var6 = 0; // L: 3138
										}

										if (-1L != field514) { // L: 3143
											var10 = var9 - field512; // L: 3144
											var11 = var8 - field783; // L: 3145
											var12 = (int)((Canvas.mouseRecorder.millis[var7] - field514) / 20L); // L: 3146
											var5 = (int)((long)var5 + (Canvas.mouseRecorder.millis[var7] - field514) % 20L); // L: 3147
										} else {
											var10 = var9; // L: 3150
											var11 = var8; // L: 3151
											var12 = Integer.MAX_VALUE; // L: 3152
										}

										field512 = var9; // L: 3154
										field783 = var8; // L: 3155
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3156
											var10 += 32; // L: 3157
											var11 += 32; // L: 3158
											var30.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3159
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3161
											var10 += 128; // L: 3162
											var11 += 128; // L: 3163
											var30.packetBuffer.writeByte(var12 + 128); // L: 3164
											var30.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3165
										} else if (var12 < 32) { // L: 3167
											var30.packetBuffer.writeByte(var12 + 192); // L: 3168
											if (var9 != -1 && var8 != -1) { // L: 3169
												var30.packetBuffer.method9373(var9 | var8 << 16); // L: 3170
											} else {
												var30.packetBuffer.method9373(Integer.MIN_VALUE);
											}
										} else {
											var30.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3173
											if (var9 != -1 && var8 != -1) { // L: 3174
												var30.packetBuffer.method9373(var9 | var8 << 16); // L: 3175
											} else {
												var30.packetBuffer.method9373(Integer.MIN_VALUE);
											}
										}

										++var6; // L: 3177
										field514 = Canvas.mouseRecorder.millis[var7]; // L: 3178
									}
								}

								if (var30 != null) { // L: 3180
									var30.packetBuffer.method9384(var30.packetBuffer.offset - var3); // L: 3181
									var7 = var30.packetBuffer.offset; // L: 3182
									var30.packetBuffer.offset = var3; // L: 3183
									var30.packetBuffer.writeByte(var5 / var6); // L: 3184
									var30.packetBuffer.writeByte(var5 % var6); // L: 3185
									var30.packetBuffer.offset = var7; // L: 3186
									packetWriter.addNode(var30); // L: 3187
								}

								if (var4 >= Canvas.mouseRecorder.index) { // L: 3189
									Canvas.mouseRecorder.index = 0;
								} else {
									MouseRecorder var51 = Canvas.mouseRecorder; // L: 3191
									var51.index -= var4;
									System.arraycopy(Canvas.mouseRecorder.xs, var4, Canvas.mouseRecorder.xs, 0, Canvas.mouseRecorder.index); // L: 3192
									System.arraycopy(Canvas.mouseRecorder.ys, var4, Canvas.mouseRecorder.ys, 0, Canvas.mouseRecorder.index); // L: 3193
									System.arraycopy(Canvas.mouseRecorder.millis, var4, Canvas.mouseRecorder.millis, 0, Canvas.mouseRecorder.index); // L: 3194
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !SoundCache.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3200
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 3201
							if (var16 > 32767L) { // L: 3202
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 3203
							var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3204
							if (var3 < 0) { // L: 3205
								var3 = 0;
							} else if (var3 > GameEngine.canvasHeight) { // L: 3206
								var3 = GameEngine.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3207
							if (var4 < 0) { // L: 3208
								var4 = 0;
							} else if (var4 > class524.canvasWidth) { // L: 3209
								var4 = class524.canvasWidth;
							}

							var5 = (int)var16; // L: 3210
							var18 = class482.getPacketBufferNode(ClientPacket.field3255, packetWriter.isaacCipher); // L: 3211
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 3212
							var18.packetBuffer.writeShort(var4); // L: 3213
							var18.packetBuffer.writeShort(var3); // L: 3214
							packetWriter.addNode(var18); // L: 3215
						}

						if (mouseWheelRotation != 0) { // L: 3217
							var14 = class482.getPacketBufferNode(ClientPacket.field3258, packetWriter.isaacCipher); // L: 3218
							var14.packetBuffer.writeShort(mouseWheelRotation); // L: 3219
							packetWriter.addNode(var14); // L: 3220
						}

						if (field661.field2398 > 0) { // L: 3222
							var14 = class482.getPacketBufferNode(ClientPacket.field3216, packetWriter.isaacCipher); // L: 3223
							var14.packetBuffer.writeShort(0); // L: 3224
							var15 = var14.packetBuffer.offset; // L: 3225
							long var19 = UserComparator9.method2973(); // L: 3226

							for (var5 = 0; var5 < field661.field2398; ++var5) { // L: 3227
								long var21 = var19 - field741; // L: 3228
								if (var21 > 16777215L) { // L: 3229
									var21 = 16777215L;
								}

								field741 = var19; // L: 3230
								var14.packetBuffer.method9483(field661.field2395[var5]); // L: 3231
								var14.packetBuffer.method9433((int)var21); // L: 3232
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15); // L: 3234
							packetWriter.addNode(var14); // L: 3235
						}

						if (field598 > 0) { // L: 3237
							--field598;
						}

						if (field661.method4426(96) || field661.method4426(97) || field661.method4426(98) || field661.method4426(99)) { // L: 3238
							field599 = true; // L: 3239
						}

						if (field599 && field598 <= 0) { // L: 3241
							field598 = 20; // L: 3242
							field599 = false; // L: 3243
							var14 = class482.getPacketBufferNode(ClientPacket.field3259, packetWriter.isaacCipher); // L: 3245
							var14.packetBuffer.method9557(camAngleX); // L: 3246
							var14.packetBuffer.method9427(camAngleY); // L: 3247
							packetWriter.addNode(var14); // L: 3248
						}

						if (class31.field160 && !field515) { // L: 3250
							field515 = true; // L: 3251
							var14 = class482.getPacketBufferNode(ClientPacket.field3222, packetWriter.isaacCipher); // L: 3253
							var14.packetBuffer.writeByte(1); // L: 3254
							packetWriter.addNode(var14); // L: 3255
						}

						if (!class31.field160 && field515) { // L: 3257
							field515 = false; // L: 3258
							var14 = class482.getPacketBufferNode(ClientPacket.field3222, packetWriter.isaacCipher); // L: 3260
							var14.packetBuffer.writeByte(0); // L: 3261
							packetWriter.addNode(var14); // L: 3262
						}

						if (GrandExchangeOfferUnitPriceComparator.worldMap != null) { // L: 3265
							GrandExchangeOfferUnitPriceComparator.worldMap.method8852();
						}

						Player var31;
						if (VarpDefinition.FriendsChatManager_inFriendsChat) { // L: 3267
							if (ClientPreferences.friendsChatManager != null) { // L: 3268
								ClientPreferences.friendsChatManager.sort(); // L: 3269
							}

							for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3272
								var31 = players[Players.Players_indices[var1]]; // L: 3273
								var31.method2392(); // L: 3274
							}

							VarpDefinition.FriendsChatManager_inFriendsChat = false; // L: 3277
						}

						if (VarpDefinition.field1832) { // L: 3281
							for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3283
								var31 = players[Players.Players_indices[var1]]; // L: 3284
								var31.method2395(); // L: 3285
							}

							VarpDefinition.field1832 = false; // L: 3288
						}

						class9.method79(); // L: 3291
						if (gameState != 30) { // L: 3292
							return;
						}

						for (PendingSpawn var37 = (PendingSpawn)pendingSpawns.last(); var37 != null; var37 = (PendingSpawn)pendingSpawns.previous()) { // L: 3294 3295 3314
							if (var37.hitpoints > 0) { // L: 3296
								--var37.hitpoints;
							}

							if (var37.hitpoints == 0) { // L: 3297
								if (var37.objectId < 0 || BufferedSink.method8461(var37.objectId, var37.field1163)) { // L: 3298
									class133.method3139(var37.plane, var37.type, var37.x, var37.y, var37.objectId, var37.field1162, var37.field1163, var37.field1167); // L: 3299
									var37.remove(); // L: 3300
								}
							} else {
								if (var37.delay > 0) { // L: 3304
									--var37.delay;
								}

								if (var37.delay == 0 && var37.x >= 1 && var37.y >= 1 && var37.x <= 102 && var37.y <= 102 && (var37.field1164 < 0 || BufferedSink.method8461(var37.field1164, var37.field1166))) { // L: 3305 3306
									class133.method3139(var37.plane, var37.type, var37.x, var37.y, var37.field1164, var37.field1157, var37.field1166, var37.field1167); // L: 3307
									var37.delay = -1; // L: 3308
									if (var37.field1164 == var37.objectId && var37.objectId == -1) { // L: 3309
										var37.remove();
									} else if (var37.objectId == var37.field1164 && var37.field1157 == var37.field1162 && var37.field1166 == var37.field1163) { // L: 3310
										var37.remove();
									}
								}
							}
						}

						class317.method6035(); // L: 3317
						++packetWriter.field1399; // L: 3318
						if (packetWriter.field1399 > 750) { // L: 3319
							Messages.method2849(); // L: 3320
							return; // L: 3321
						}

						var1 = Players.Players_count; // L: 3324
						int[] var32 = Players.Players_indices; // L: 3325

						for (var3 = 0; var3 < var1; ++var3) { // L: 3326
							Player var23 = players[var32[var3]]; // L: 3327
							if (var23 != null) { // L: 3328
								ParamComposition.updateActorSequence(var23, 1); // L: 3329
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 3334
							var15 = npcIndices[var1]; // L: 3335
							NPC var24 = npcs[var15]; // L: 3336
							if (var24 != null) { // L: 3337
								ParamComposition.updateActorSequence(var24, var24.definition.size); // L: 3338
							}
						}

						int[] var38 = Players.Players_indices; // L: 3343

						for (var15 = 0; var15 < Players.Players_count; ++var15) { // L: 3344
							Player var44 = players[var38[var15]]; // L: 3345
							if (var44 != null && var44.field1212 > 0) { // L: 3346
								--var44.field1212; // L: 3347
								if (var44.field1212 == 0) { // L: 3348
									var44.field1195 = null;
								}
							}
						}

						for (var15 = 0; var15 < npcCount; ++var15) { // L: 3351
							var3 = npcIndices[var15]; // L: 3352
							NPC var41 = npcs[var3]; // L: 3353
							if (var41 != null && var41.field1212 > 0) { // L: 3354
								--var41.field1212; // L: 3355
								if (var41.field1212 == 0) { // L: 3356
									var41.field1195 = null;
								}
							}
						}

						++field576; // L: 3360
						if (mouseCrossColor != 0) { // L: 3361
							mouseCrossState = mouseCrossState * 400 + 400; // L: 3362
							if (mouseCrossState * 20 >= 400) { // L: 3363
								mouseCrossColor = 0;
							}
						}

						Widget var39 = class433.mousedOverWidgetIf1; // L: 3365
						Widget var33 = class209.field2287; // L: 3366
						class433.mousedOverWidgetIf1 = null; // L: 3367
						class209.field2287 = null; // L: 3368
						draggedOnWidget = null; // L: 3369
						field714 = false; // L: 3370
						field739 = false; // L: 3371
						field738 = 0; // L: 3372

						while (field661.method4424() && field738 < 128) { // L: 3373
							if (staffModLevel >= 2 && field661.method4426(82) && field661.field2393 == 66) { // L: 3374
								StringBuilder var42 = new StringBuilder(); // L: 3377

								Message var40;
								for (Iterator var25 = Messages.Messages_hashTable.iterator(); var25.hasNext(); var42.append(var40.text).append('\n')) { // L: 3378 3384
									var40 = (Message)var25.next(); // L: 3379
									if (var40.sender != null && !var40.sender.isEmpty()) { // L: 3381
										var42.append(var40.sender).append(':'); // L: 3382
									}
								}

								String var45 = var42.toString(); // L: 3387
								VertexNormal.client.method619(var45); // L: 3390
							} else if (oculusOrbState != 1 || field661.field2402 <= 0) { // L: 3393
								field559[field738] = field661.field2393; // L: 3396
								field617[field738] = field661.field2402; // L: 3397
								++field738; // L: 3398
							}
						}

						if (class36.method733() && field661.method4426(82) && field661.method4426(81) && mouseWheelRotation != 0) { // L: 3400
							var3 = class25.localPlayer.plane - mouseWheelRotation; // L: 3401
							if (var3 < 0) { // L: 3402
								var3 = 0;
							} else if (var3 > 3) { // L: 3403
								var3 = 3;
							}

							if (var3 != class25.localPlayer.plane) { // L: 3404
								class4.method17(class25.localPlayer.pathX[0] + HealthBarDefinition.baseX * 64, class25.localPlayer.pathY[0] + WorldMapScaleHandler.baseY * 64, var3, false); // L: 3405
							}

							mouseWheelRotation = 0; // L: 3407
						}

						if (rootInterface != -1) { // L: 3409
							KeyHandler.addPendingSpawnToScene(rootInterface, 0, 0, class524.canvasWidth, GameEngine.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3410

						while (true) {
							Widget var43;
							ScriptEvent var46;
							Widget var48;
							do {
								var46 = (ScriptEvent)field631.removeLast(); // L: 3412
								if (var46 == null) { // L: 3413
									while (true) {
										do {
											var46 = (ScriptEvent)field715.removeLast(); // L: 3424
											if (var46 == null) { // L: 3425
												while (true) {
													do {
														var46 = (ScriptEvent)scriptEvents.removeLast(); // L: 3436
														if (var46 == null) { // L: 3437
															boolean var35 = false; // L: 3447

															while (true) {
																class225 var47 = (class225)field716.removeLast(); // L: 3449
																if (var47 == null) { // L: 3450
																	if (!var35 && MouseHandler.MouseHandler_lastButton == 1) { // L: 3502
																		field608.method4407(); // L: 3503
																	}

																	this.menu(); // L: 3505
																	if (GrandExchangeOfferUnitPriceComparator.worldMap != null) { // L: 3507
																		GrandExchangeOfferUnitPriceComparator.worldMap.method9017(class113.Client_plane, HealthBarDefinition.baseX * 64 + (class25.localPlayer.x >> 7), WorldMapScaleHandler.baseY * 64 + (class25.localPlayer.y >> 7), false); // L: 3508
																		GrandExchangeOfferUnitPriceComparator.worldMap.loadCache(); // L: 3509
																	}

																	if (clickedWidget != null) { // L: 3512
																		this.method1282();
																	}

																	if (Scene.shouldSendWalk()) { // L: 3513
																		var4 = Scene.Scene_selectedX; // L: 3514
																		var5 = Scene.Scene_selectedY; // L: 3515
																		var18 = class482.getPacketBufferNode(ClientPacket.field3256, packetWriter.isaacCipher); // L: 3517
																		var18.packetBuffer.writeByte(5); // L: 3518
																		var18.packetBuffer.writeIntME(HealthBarDefinition.baseX * 64 + var4); // L: 3519
																		var18.packetBuffer.method9427(WorldMapScaleHandler.baseY * 64 + var5); // L: 3520
																		var18.packetBuffer.method9385(field661.method4426(82) ? (field661.method4426(81) ? 2 : 1) : 0); // L: 3521
																		packetWriter.addNode(var18); // L: 3522
																		Scene.method5384(); // L: 3523
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3524
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3525
																		mouseCrossColor = 1; // L: 3526
																		mouseCrossState = 0; // L: 3527
																		destinationX = var4; // L: 3528
																		destinationY = var5; // L: 3529
																	}

																	if (var39 != class433.mousedOverWidgetIf1) { // L: 3531
																		if (var39 != null) { // L: 3532
																			FaceNormal.invalidateWidget(var39);
																		}

																		if (class433.mousedOverWidgetIf1 != null) { // L: 3533
																			FaceNormal.invalidateWidget(class433.mousedOverWidgetIf1);
																		}
																	}

																	if (var33 != class209.field2287 && field662 == field750) { // L: 3535
																		if (var33 != null) { // L: 3536
																			FaceNormal.invalidateWidget(var33);
																		}

																		if (class209.field2287 != null) { // L: 3537
																			FaceNormal.invalidateWidget(class209.field2287);
																		}
																	}

																	if (class209.field2287 != null) { // L: 3539
																		if (field750 < field662) { // L: 3540
																			++field750; // L: 3541
																			if (field750 == field662) { // L: 3542
																				FaceNormal.invalidateWidget(class209.field2287);
																			}
																		}
																	} else if (field750 > 0) { // L: 3545
																		--field750;
																	}

																	if (oculusOrbState == 0) { // L: 3547
																		var4 = class25.localPlayer.x; // L: 3548
																		var5 = class25.localPlayer.y; // L: 3549
																		if (class367.oculusOrbFocalPointX - var4 < -500 || class367.oculusOrbFocalPointX - var4 > 500 || WorldMapCacheName.oculusOrbFocalPointY - var5 < -500 || WorldMapCacheName.oculusOrbFocalPointY - var5 > 500) { // L: 3550
																			class367.oculusOrbFocalPointX = var4; // L: 3551
																			WorldMapCacheName.oculusOrbFocalPointY = var5; // L: 3552
																		}

																		if (var4 != class367.oculusOrbFocalPointX) { // L: 3554
																			class367.oculusOrbFocalPointX += (var4 - class367.oculusOrbFocalPointX) / 16;
																		}

																		if (var5 != WorldMapCacheName.oculusOrbFocalPointY) { // L: 3555
																			WorldMapCacheName.oculusOrbFocalPointY += (var5 - WorldMapCacheName.oculusOrbFocalPointY) / 16;
																		}

																		var6 = class367.oculusOrbFocalPointX >> 7; // L: 3556
																		var7 = WorldMapCacheName.oculusOrbFocalPointY >> 7; // L: 3557
																		var8 = class19.getTileHeight(class367.oculusOrbFocalPointX, WorldMapCacheName.oculusOrbFocalPointY, class113.Client_plane); // L: 3558
																		var9 = 0; // L: 3559
																		if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) { // L: 3560
																			for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) { // L: 3561
																				for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) { // L: 3562
																					var12 = class113.Client_plane; // L: 3563
																					if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) { // L: 3564
																						++var12;
																					}

																					int var26 = var8 - Tiles.Tiles_heights[var12][var10][var11]; // L: 3565
																					if (var26 > var9) { // L: 3566
																						var9 = var26;
																					}
																				}
																			}
																		}

																		var10 = var9 * 192; // L: 3570
																		if (var10 > 98048) { // L: 3571
																			var10 = 98048;
																		}

																		if (var10 < 32768) { // L: 3572
																			var10 = 32768;
																		}

																		if (var10 > field600) { // L: 3573
																			field600 += (var10 - field600) / 24;
																		} else if (var10 < field600) { // L: 3574
																			field600 += (var10 - field600) / 80;
																		}

																		WorldMapArea.field2516 = class19.getTileHeight(class25.localPlayer.x, class25.localPlayer.y, class113.Client_plane) - camFollowHeight; // L: 3575
																	} else if (oculusOrbState == 1) { // L: 3577
																		World.method1898(); // L: 3578
																		short var34 = -1; // L: 3579
																		if (field661.method4426(33)) { // L: 3580
																			var34 = 0;
																		} else if (field661.method4426(49)) { // L: 3581
																			var34 = 1024;
																		}

																		if (field661.method4426(48)) { // L: 3582
																			if (var34 == 0) { // L: 3583
																				var34 = 1792;
																			} else if (var34 == 1024) { // L: 3584
																				var34 = 1280;
																			} else {
																				var34 = 1536; // L: 3585
																			}
																		} else if (field661.method4426(50)) { // L: 3587
																			if (var34 == 0) { // L: 3588
																				var34 = 256;
																			} else if (var34 == 1024) { // L: 3589
																				var34 = 768;
																			} else {
																				var34 = 512; // L: 3590
																			}
																		}

																		byte var36 = 0; // L: 3592
																		if (field661.method4426(35)) { // L: 3593
																			var36 = -1;
																		} else if (field661.method4426(51)) { // L: 3594
																			var36 = 1;
																		}

																		var6 = 0; // L: 3595
																		if (var34 >= 0 || var36 != 0) { // L: 3596
																			var6 = field661.method4426(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed; // L: 3597
																			var6 *= 16; // L: 3598
																			field510 = var34; // L: 3599
																			field593 = var36; // L: 3600
																		}

																		if (field623 < var6) { // L: 3602
																			field623 += var6 / 8; // L: 3603
																			if (field623 > var6) { // L: 3604
																				field623 = var6;
																			}
																		} else if (field623 > var6) { // L: 3606
																			field623 = field623 * 9 / 10;
																		}

																		if (field623 > 0) { // L: 3607
																			var7 = field623 / 16; // L: 3608
																			if (field510 >= 0) { // L: 3609
																				var4 = field510 - HealthBarUpdate.cameraYaw & 2047; // L: 3610
																				var8 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 3611
																				var9 = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 3612
																				class367.oculusOrbFocalPointX += var8 * var7 / 65536; // L: 3613
																				WorldMapCacheName.oculusOrbFocalPointY += var7 * var9 / 65536; // L: 3614
																			}

																			if (field593 != 0) { // L: 3616
																				WorldMapArea.field2516 += var7 * field593; // L: 3617
																				if (WorldMapArea.field2516 > 0) { // L: 3618
																					WorldMapArea.field2516 = 0;
																				}
																			}
																		} else {
																			field510 = -1; // L: 3622
																			field593 = -1; // L: 3623
																		}

																		if (field661.method4426(13)) { // L: 3625
																			UserComparator5.method2963(); // L: 3626
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && SoundCache.mouseCam) { // L: 3629
																		var4 = MouseHandler.MouseHandler_y - field588; // L: 3630
																		field698 = var4 * 2; // L: 3631
																		field588 = var4 != -1 && var4 != 1 ? (MouseHandler.MouseHandler_y + field588) / 2 : MouseHandler.MouseHandler_y; // L: 3632
																		var5 = field587 - MouseHandler.MouseHandler_x; // L: 3633
																		field585 = var5 * 2; // L: 3634
																		field587 = var5 != -1 && var5 != 1 ? (field587 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x; // L: 3635
																	} else {
																		if (field661.method4426(96)) { // L: 3638
																			field585 += (-24 - field585) / 2;
																		} else if (field661.method4426(97)) { // L: 3639
																			field585 += (24 - field585) / 2;
																		} else {
																			field585 /= 2; // L: 3640
																		}

																		if (field661.method4426(98)) { // L: 3641
																			field698 += (12 - field698) / 2;
																		} else if (field661.method4426(99)) { // L: 3642
																			field698 += (-12 - field698) / 2;
																		} else {
																			field698 /= 2; // L: 3643
																		}

																		field588 = MouseHandler.MouseHandler_y; // L: 3644
																		field587 = MouseHandler.MouseHandler_x; // L: 3645
																	}

																	camAngleY = field585 / 2 + camAngleY & 2047; // L: 3647
																	camAngleX += field698 / 2; // L: 3648
																	if (camAngleX < 128) { // L: 3649
																		camAngleX = 128;
																	}

																	if (camAngleX > 383) { // L: 3650
																		camAngleX = 383;
																	}

																	if (field766) { // L: 3652
																		GameObject.method5901(class518.field5105, Huffman.field3870, class53.field367); // L: 3653
																		class401.method7504(SecureRandomCallable.field1027, WorldMapLabelSize.field2487); // L: 3654
																		if (GameEngine.cameraX == class518.field5105 && Huffman.field3870 == KeyHandler.cameraY && GrandExchangeOfferTotalQuantityComparator.cameraZ == class53.field367 && SecureRandomCallable.field1027 == UserComparator3.cameraPitch && HealthBarUpdate.cameraYaw == WorldMapLabelSize.field2487) { // L: 3655
																			field766 = false; // L: 3656
																			isCameraLocked = false; // L: 3657
																			field760 = false; // L: 3658
																			field761 = false; // L: 3659
																			SoundSystem.field314 = 0; // L: 3660
																			ArchiveDiskActionHandler.field4334 = 0; // L: 3661
																			ClanChannel.field1766 = 0; // L: 3662
																			class195.field2045 = 0; // L: 3663
																			class439.field4690 = 0; // L: 3664
																			class380.field4416 = 0; // L: 3665
																			HealthBarDefinition.field1890 = 0; // L: 3666
																			class9.field29 = 0; // L: 3667
																			class172.field1817 = 0; // L: 3668
																			HealthBar.field1296 = 0; // L: 3669
																			field763 = null; // L: 3670
																			field765 = null; // L: 3671
																			field500 = null; // L: 3672
																		}
																	} else if (isCameraLocked) { // L: 3675
																		class412.method7749();
																	}

																	for (var4 = 0; var4 < 5; ++var4) { // L: 3676
																		int var10002 = field775[var4]++;
																	}

																	ClientPreferences.varcs.tryWrite(); // L: 3677
																	var4 = ParamComposition.method3877(); // L: 3678
																	var5 = class171.method3569(); // L: 3679
																	if (var4 > 15000 && var5 > 15000) { // L: 3680
																		logoutTimer = 250; // L: 3681
																		MouseHandler.MouseHandler_idleCycles = 14500; // L: 3683
																		var18 = class482.getPacketBufferNode(ClientPacket.field3192, packetWriter.isaacCipher); // L: 3686
																		packetWriter.addNode(var18); // L: 3687
																	}

																	class332.friendSystem.processFriendUpdates(); // L: 3689

																	for (var6 = 0; var6 < field786.size(); ++var6) { // L: 3691
																		if (RouteStrategy.method4508((Integer)field786.get(var6)) != 2) { // L: 3692
																			field786.remove(var6); // L: 3693
																			--var6; // L: 3694
																		}
																	}

																	++packetWriter.pendingWrites; // L: 3698
																	if (packetWriter.pendingWrites > 50) { // L: 3699
																		var18 = class482.getPacketBufferNode(ClientPacket.field3206, packetWriter.isaacCipher); // L: 3701
																		packetWriter.addNode(var18); // L: 3702
																	}

																	try {
																		packetWriter.flush(); // L: 3705
																	} catch (IOException var27) { // L: 3707
																		Messages.method2849(); // L: 3708
																	}

																	KitDefinition.method3664().method4286(); // L: 3710
																	return; // L: 3711
																}

																if (var47.field2391.type == 12) { // L: 3451
																	var35 = true;
																}

																if (var47 != null && var47.field2391 != null) { // L: 3453
																	if (var47.field2391.childIndex >= 0) { // L: 3454
																		var48 = class380.field4414.method6348(var47.field2391.parentId); // L: 3455
																		if (var48 == null || var48.children == null || var48.children.length == 0 || var47.field2391.childIndex >= var48.children.length || var47.field2391 != var48.children[var47.field2391.childIndex]) { // L: 3456
																			continue;
																		}
																	}

																	if (var47.field2391.type == 11 && var47.field2388 == 0) { // L: 3460
																		if (var47.field2391.method6824(var47.field2389, var47.field2390, 0, 0)) { // L: 3461
																			var47.field2391.method6718().method4142().method4280(1, var47.field2391.method6718().method4154()); // L: 3462
																			switch(var47.field2391.method6714()) { // L: 3463
																			case 0:
																				class217.openURL(var47.field2391.method6688(), true, false); // L: 3465
																				break; // L: 3466
																			case 1:
																				if (ModeWhere.method7296(class405.getWidgetFlags(var47.field2391))) { // L: 3468
																					int[] var50 = var47.field2391.method6717(); // L: 3469
																					if (var50 != null) { // L: 3470
																						var18 = class482.getPacketBufferNode(ClientPacket.field3167, packetWriter.isaacCipher); // L: 3471
																						var18.packetBuffer.method9439(var47.field2391.id); // L: 3472
																						var18.packetBuffer.method9494(var50[1]); // L: 3473
																						var18.packetBuffer.method9439(var47.field2391.method6715()); // L: 3474
																						var18.packetBuffer.method9494(var50[2]); // L: 3475
																						var18.packetBuffer.method9427(var47.field2391.childIndex); // L: 3476
																						var18.packetBuffer.method9373(var50[0]); // L: 3477
																						packetWriter.addNode(var18); // L: 3478
																					}
																				}
																			}
																		}
																	} else if (var47.field2391.type == 12) { // L: 3485
																		class344 var49 = var47.field2391.method6700(); // L: 3486
																		if (var49 != null && var49.method6672()) { // L: 3487
																			switch(var47.field2388) { // L: 3488
																			case 0:
																				field608.method4391(var47.field2391); // L: 3493
																				var49.method6475(true); // L: 3494
																				var49.method6465(var47.field2389, var47.field2390, field661.method4426(82), field661.method4426(81)); // L: 3495
																				break;
																			case 1:
																				var49.method6518(var47.field2389, var47.field2390); // L: 3490
																			}
																		}
																	}
																}
															}
														}

														var43 = var46.widget; // L: 3438
														if (var43.childIndex < 0) { // L: 3439
															break;
														}

														var48 = class380.field4414.method6348(var43.parentId); // L: 3440
													} while(var48 == null || var48.children == null || var43.childIndex >= var48.children.length || var43 != var48.children[var43.childIndex]); // L: 3441

													WorldMapSectionType.runScriptEvent(var46); // L: 3445
												}
											}

											var43 = var46.widget; // L: 3426
											if (var43.childIndex < 0) { // L: 3427
												break;
											}

											var48 = class380.field4414.method6348(var43.parentId); // L: 3428
										} while(var48 == null || var48.children == null || var43.childIndex >= var48.children.length || var43 != var48.children[var43.childIndex]); // L: 3429

										WorldMapSectionType.runScriptEvent(var46); // L: 3433
									}
								}

								var43 = var46.widget; // L: 3414
								if (var43.childIndex < 0) { // L: 3415
									break;
								}

								var48 = class380.field4414.method6348(var43.parentId); // L: 3416
							} while(var48 == null || var48.children == null || var43.childIndex >= var48.children.length || var43 != var48.children[var43.childIndex]); // L: 3417

							WorldMapSectionType.runScriptEvent(var46); // L: 3421
						}
					}

					var30 = class482.getPacketBufferNode(ClientPacket.field3221, packetWriter.isaacCipher); // L: 3093
					var30.packetBuffer.writeByte(0); // L: 3094
					var3 = var30.packetBuffer.offset; // L: 3095
					MusicPatchNode.performReflectionCheck(var30.packetBuffer); // L: 3096
					var30.packetBuffer.method9384(var30.packetBuffer.offset - var3); // L: 3097
					packetWriter.addNode(var30); // L: 3098
				}
			}
		}
	} // L: 3075

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "25935"
	)
	public void vmethod6254(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) { // L: 3932
			if (var1 > -1 && class93.clientPreferences.method2597() > 0 && !playingJingle) { // L: 3933
				PacketBufferNode var3 = class482.getPacketBufferNode(ClientPacket.field3252, packetWriter.isaacCipher); // L: 3934
				var3.packetBuffer.method9373(var1); // L: 3935
				packetWriter.addNode(var3); // L: 3936
			}

		}
	} // L: 3938

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-10443562"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class524.canvasWidth; // L: 4614
		int var2 = GameEngine.canvasHeight; // L: 4615
		if (super.contentWidth < var1) { // L: 4616
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) { // L: 4617
			var2 = super.contentHeight;
		}

		if (class93.clientPreferences != null) { // L: 4618
			try {
				Client var3 = VertexNormal.client; // L: 4620
				Object[] var4 = new Object[]{ClanChannelMember.getWindowedMode()}; // L: 4621
				JSObject.getWindow(var3).call("resize", var4); // L: 4624
			} catch (Throwable var5) { // L: 4627
			}
		}

	} // L: 4629

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "124"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) { // L: 4632
			class401.method7505(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4633
			if (field720[var1]) { // L: 4634
				field663[var1] = true;
			}

			field729[var1] = field720[var1]; // L: 4635
			field720[var1] = false; // L: 4636
		}

		field607 = cycle; // L: 4638
		viewportX = -1; // L: 4639
		viewportY = -1; // L: 4640
		if (rootInterface != -1) { // L: 4641
			rootWidgetCount = 0; // L: 4642
			TextureProvider.method5591(rootInterface, 0, 0, class524.canvasWidth, GameEngine.canvasHeight, 0, 0, -1); // L: 4643
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4645
		if (showMouseCross) { // L: 4646
			if (mouseCrossColor == 1) { // L: 4647
				Players.field1346[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4648
			}

			if (mouseCrossColor == 2) { // L: 4650
				Players.field1346[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4651
			}
		}

		if (!isMenuOpen) { // L: 4654
			if (viewportX != -1) { // L: 4655
				class149.method3291(viewportX, viewportY);
			}
		} else {
			var1 = class209.menuX; // L: 4658
			int var2 = MouseRecorder.menuY; // L: 4659
			int var3 = MusicPatchPcmStream.menuWidth; // L: 4660
			int var4 = class60.menuHeight; // L: 4661
			int var5 = 6116423; // L: 4662
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5); // L: 4663
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0); // L: 4664
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0); // L: 4665
			class90.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1); // L: 4666
			int var6 = MouseHandler.MouseHandler_x; // L: 4667
			int var7 = MouseHandler.MouseHandler_y; // L: 4668

			for (int var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 4669
				int var9 = var2 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 4670
				int var10 = 16777215; // L: 4671
				if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) { // L: 4672
					var10 = 16776960;
				}

				Font var11 = class90.fontBold12; // L: 4673
				String var12;
				if (var8 < 0) { // L: 4676
					var12 = ""; // L: 4677
				} else if (menuTargets[var8].length() > 0) { // L: 4680
					var12 = menuActions[var8] + " " + menuTargets[var8];
				} else {
					var12 = menuActions[var8]; // L: 4681
				}

				var11.draw(var12, var1 + 3, var9, var10, 0); // L: 4683
			}

			AbstractWorldMapIcon.method5085(class209.menuX, MouseRecorder.menuY, MusicPatchPcmStream.menuWidth, class60.menuHeight); // L: 4685
		}

		if (field727 == 3) { // L: 4687
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4688
				if (field729[var1]) { // L: 4689
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4690
				} else if (field663[var1]) { // L: 4692
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4693
				}
			}
		}

		KitDefinition.method3668(class113.Client_plane, class25.localPlayer.x, class25.localPlayer.y, field576); // L: 4697
		field576 = 0; // L: 4698
	} // L: 4699

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Led;IB)Z",
		garbageValue = "16"
	)
	boolean method1608(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 6354
			ClientPreferences.friendsChatManager = null; // L: 6355
		} else {
			if (ClientPreferences.friendsChatManager == null) { // L: 6358
				ClientPreferences.friendsChatManager = new FriendsChatManager(UserComparator10.loginType, VertexNormal.client); // L: 6359
			}

			ClientPreferences.friendsChatManager.method8193(var1.packetBuffer, var2); // L: 6361
		}

		field705 = cycleCntr; // L: 6364
		VarpDefinition.FriendsChatManager_inFriendsChat = true; // L: 6365
		var1.serverPacket = null; // L: 6367
		return true; // L: 6368
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Led;I)Z",
		garbageValue = "-1706548822"
	)
	boolean method1779(PacketWriter var1) {
		if (ClientPreferences.friendsChatManager != null) { // L: 6372
			ClientPreferences.friendsChatManager.method8194(var1.packetBuffer); // L: 6373
		}

		field705 = cycleCntr; // L: 6376
		VarpDefinition.FriendsChatManager_inFriendsChat = true; // L: 6377
		var1.serverPacket = null; // L: 6379
		return true; // L: 6380
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(Led;I)Z",
		garbageValue = "1739108326"
	)
	final boolean method1276(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6385
		PacketBuffer var3 = var1.packetBuffer; // L: 6386
		if (var2 == null) { // L: 6387
			return false;
		} else {
			int var6;
			String var21;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6389
					if (var1.field1408) { // L: 6390
						if (!var2.isAvailable(1)) { // L: 6391
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6392
						var1.field1399 = 0; // L: 6393
						var1.field1408 = false; // L: 6394
					}

					var3.offset = 0; // L: 6396
					if (var3.method9326()) { // L: 6397
						if (!var2.isAvailable(1)) { // L: 6398
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6399
						var1.field1399 = 0; // L: 6400
					}

					var1.field1408 = true; // L: 6402
					ServerPacket[] var4 = class143.method3234(); // L: 6403
					var5 = var3.readSmartByteShortIsaac(); // L: 6404
					if (var5 < 0 || var5 >= var4.length) { // L: 6405
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6406
					var1.serverPacketLength = var1.serverPacket.length; // L: 6407
				}

				if (var1.serverPacketLength == -1) { // L: 6409
					if (!var2.isAvailable(1)) { // L: 6410
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6411
					var1.serverPacketLength = var3.array[0] & 255; // L: 6412
				}

				if (var1.serverPacketLength == -2) { // L: 6414
					if (!var2.isAvailable(2)) { // L: 6415
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6416
					var3.offset = 0; // L: 6417
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6418
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6420
					return false;
				}

				var3.offset = 0; // L: 6421
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6422
				var1.field1399 = 0; // L: 6423
				timer.method8044(); // L: 6424
				var1.field1407 = var1.field1411; // L: 6425
				var1.field1411 = var1.field1402; // L: 6426
				var1.field1402 = var1.serverPacket; // L: 6427
				int var7;
				Widget var8;
				int var20;
				if (ServerPacket.field3361 == var1.serverPacket) { // L: 6428
					var20 = var3.method9398(); // L: 6429
					var5 = var3.readInt(); // L: 6430
					var6 = var3.readUnsignedShort(); // L: 6431
					var7 = var3.method9430(); // L: 6432
					var8 = class380.field4414.method6348(var5); // L: 6433
					if (var6 != var8.modelAngleX || var7 != var8.modelAngleY || var20 != var8.modelZoom) { // L: 6434
						var8.modelAngleX = var6; // L: 6435
						var8.modelAngleY = var7; // L: 6436
						var8.modelZoom = var20; // L: 6437
						FaceNormal.invalidateWidget(var8); // L: 6438
					}

					var1.serverPacket = null; // L: 6440
					return true; // L: 6441
				}

				if (ServerPacket.field3322 == var1.serverPacket) { // L: 6443
					var7 = var3.method9419(); // L: 6449
					var20 = var3.method9538(); // L: 6450
					Player var58;
					if (var20 == localPlayerIndex) { // L: 6451
						var58 = class25.localPlayer; // L: 6452
					} else {
						var58 = players[var20]; // L: 6455
					}

					var5 = var3.method9430(); // L: 6457
					var6 = var3.method9442(); // L: 6458
					if (var58 != null) { // L: 6459
						var58.method2469(var7, var5, var6 >> 16, var6 & 65535); // L: 6460
					}

					var1.serverPacket = null; // L: 6462
					return true; // L: 6463
				}

				if (ServerPacket.field3368 == var1.serverPacket) { // L: 6465
					var20 = var3.readUnsignedByte(); // L: 6466
					if (var3.readUnsignedByte() == 0) { // L: 6467
						grandExchangeOffers[var20] = new GrandExchangeOffer(); // L: 6468
						var3.offset += 18; // L: 6469
					} else {
						--var3.offset; // L: 6472
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false); // L: 6473
					}

					field590 = cycleCntr; // L: 6475
					var1.serverPacket = null; // L: 6476
					return true; // L: 6477
				}

				if (ServerPacket.field3298 == var1.serverPacket) { // L: 6479
					class235.field2478 = var3.readUnsignedByte(); // L: 6480
					class187.field1944 = var3.method9419(); // L: 6481
					var1.serverPacket = null; // L: 6482
					return true; // L: 6483
				}

				if (ServerPacket.field3305 == var1.serverPacket) { // L: 6485
					var20 = var3.method9430(); // L: 6486
					class72.method2149(var20); // L: 6487
					field697[++field777 - 1 & 31] = var20 & 32767; // L: 6488
					var1.serverPacket = null; // L: 6489
					return true; // L: 6490
				}

				String var77;
				if (ServerPacket.field3329 == var1.serverPacket) { // L: 6492
					byte[] var54 = new byte[var1.serverPacketLength]; // L: 6493
					var3.method9357(var54, 0, var54.length); // L: 6494
					Buffer var87 = new Buffer(var54); // L: 6495
					var77 = var87.readStringCp1252NullTerminated(); // L: 6496
					class217.openURL(var77, true, false); // L: 6497
					var1.serverPacket = null; // L: 6498
					return true; // L: 6499
				}

				if (ServerPacket.field3409 == var1.serverPacket) { // L: 6501
					var20 = var3.readUnsignedByte(); // L: 6502
					var5 = var3.readUnsignedByte(); // L: 6503
					var6 = var3.readUnsignedByte(); // L: 6504
					var7 = var3.readUnsignedByte(); // L: 6505
					field767[var20] = true; // L: 6506
					field722[var20] = var5; // L: 6507
					field769[var20] = var6; // L: 6508
					field788[var20] = var7; // L: 6509
					field775[var20] = 0; // L: 6510
					var1.serverPacket = null; // L: 6511
					return true; // L: 6512
				}

				Widget var73;
				if (ServerPacket.field3289 == var1.serverPacket) { // L: 6514
					var20 = var3.method9442(); // L: 6515
					var5 = var3.readInt(); // L: 6516
					var73 = class380.field4414.method6348(var20); // L: 6517
					PendingSpawn.method2448(var73, var5); // L: 6518
					FaceNormal.invalidateWidget(var73); // L: 6519
					var1.serverPacket = null; // L: 6520
					return true; // L: 6521
				}

				int var9;
				int var10;
				int var11;
				int var23;
				if (ServerPacket.field3336 == var1.serverPacket) { // L: 6523
					var6 = var3.method9434(); // L: 6532
					var20 = var6 >> 16; // L: 6533
					var5 = var6 >> 8 & 255; // L: 6534
					var7 = var20 + (var6 >> 4 & 7); // L: 6535
					var23 = var5 + (var6 & 7); // L: 6536
					var11 = var3.method9398(); // L: 6537
					var10 = var3.method9526(); // L: 6538
					var9 = var3.readUnsignedShort(); // L: 6539
					if (var7 >= 0 && var23 >= 0 && var7 < 104 && var23 < 104) { // L: 6540
						var7 = var7 * 128 + 64; // L: 6541
						var23 = var23 * 128 + 64; // L: 6542
						GraphicsObject var62 = new GraphicsObject(var9, class113.Client_plane, var7, var23, class19.getTileHeight(var7, var23, class113.Client_plane) - var10, var11, cycle); // L: 6543
						graphicsObjects.addFirst(var62); // L: 6544
					}

					var1.serverPacket = null; // L: 6546
					return true; // L: 6547
				}

				if (ServerPacket.field3372 == var1.serverPacket) { // L: 6549
					class467.loadRegions(false, var1.packetBuffer); // L: 6550
					var1.serverPacket = null; // L: 6551
					return true; // L: 6552
				}

				if (ServerPacket.field3393 == var1.serverPacket) { // L: 6554
					var20 = var3.readUnsignedByte(); // L: 6555
					World.forceDisconnect(var20); // L: 6556
					var1.serverPacket = null; // L: 6557
					return false; // L: 6558
				}

				if (ServerPacket.field3309 == var1.serverPacket) { // L: 6560
					isCameraLocked = true; // L: 6561
					field766 = false; // L: 6562
					field761 = true; // L: 6563
					var20 = var3.readShort(); // L: 6564
					var5 = var3.readShort(); // L: 6565
					var6 = class518.method9254(var5 + UserComparator3.cameraPitch & 2027); // L: 6566
					var7 = var20 + HealthBarUpdate.cameraYaw; // L: 6567
					var23 = var3.readUnsignedShort(); // L: 6568
					var9 = var3.readUnsignedByte(); // L: 6569
					field765 = new class494(UserComparator3.cameraPitch, var6, var23, var9); // L: 6570
					field500 = new class494(HealthBarUpdate.cameraYaw, var7, var23, var9); // L: 6571
					var1.serverPacket = null; // L: 6572
					return true; // L: 6573
				}

				if (ServerPacket.field3399 == var1.serverPacket) { // L: 6575
					ClientPacket.method5980(); // L: 6576
					var20 = var3.method9419(); // L: 6577
					var5 = var3.readUnsignedByte(); // L: 6578
					var6 = var3.method9420(); // L: 6579
					var7 = var3.method9441(); // L: 6580
					experience[var5] = var7; // L: 6581
					currentLevels[var5] = var20; // L: 6582
					levels[var5] = 1; // L: 6583
					field644[var5] = var6; // L: 6584

					for (var23 = 0; var23 < 98; ++var23) { // L: 6585
						if (var7 >= Skills.Skills_experienceTable[var23]) {
							levels[var5] = var23 + 2;
						}
					}

					field551[++field665 - 1 & 31] = var5; // L: 6586
					var1.serverPacket = null; // L: 6587
					return true; // L: 6588
				}

				byte var90;
				if (ServerPacket.field3335 == var1.serverPacket) { // L: 6590
					field707 = cycleCntr; // L: 6591
					var90 = var3.readByte(); // L: 6592
					class160 var85 = new class160(var3); // L: 6593
					ClanChannel var89;
					if (var90 >= 0) { // L: 6595
						var89 = currentClanChannels[var90];
					} else {
						var89 = UserComparator4.guestClanChannel; // L: 6596
					}

					if (var89 == null) { // L: 6597
						this.method1284(var90); // L: 6598
						var1.serverPacket = null; // L: 6599
						return true; // L: 6600
					}

					if (var85.field1744 > var89.field1764) { // L: 6602
						this.method1284(var90); // L: 6603
						var1.serverPacket = null; // L: 6604
						return true; // L: 6605
					}

					if (var85.field1744 < var89.field1764) { // L: 6607
						var1.serverPacket = null; // L: 6608
						return true; // L: 6609
					}

					var85.method3465(var89); // L: 6611
					var1.serverPacket = null; // L: 6612
					return true; // L: 6613
				}

				if (ServerPacket.field3313 == var1.serverPacket) { // L: 6615
					var20 = var3.readInt(); // L: 6616
					InterfaceParent var84 = (InterfaceParent)interfaceParents.get((long)var20); // L: 6617
					if (var84 != null) { // L: 6618
						class363.closeInterface(var84, true);
					}

					if (meslayerContinueWidget != null) { // L: 6619
						FaceNormal.invalidateWidget(meslayerContinueWidget); // L: 6620
						meslayerContinueWidget = null; // L: 6621
					}

					var1.serverPacket = null; // L: 6623
					return true; // L: 6624
				}

				if (ServerPacket.field3380 == var1.serverPacket) { // L: 6626
					field707 = cycleCntr; // L: 6627
					var90 = var3.readByte(); // L: 6628
					if (var1.serverPacketLength == 1) { // L: 6629
						if (var90 >= 0) { // L: 6630
							currentClanChannels[var90] = null;
						} else {
							UserComparator4.guestClanChannel = null; // L: 6631
						}

						var1.serverPacket = null; // L: 6632
						return true; // L: 6633
					}

					if (var90 >= 0) { // L: 6635
						currentClanChannels[var90] = new ClanChannel(var3); // L: 6636
					} else {
						UserComparator4.guestClanChannel = new ClanChannel(var3); // L: 6639
					}

					var1.serverPacket = null; // L: 6641
					return true; // L: 6642
				}

				if (ServerPacket.field3343 == var1.serverPacket) { // L: 6644
					isCameraLocked = true; // L: 6645
					field766 = false; // L: 6646
					field760 = true; // L: 6647
					class9.field29 = var3.readUnsignedByte() * 128; // L: 6648
					class172.field1817 = var3.readUnsignedByte() * 16384; // L: 6649
					var20 = var3.readUnsignedShort(); // L: 6650
					var5 = var3.readUnsignedShort(); // L: 6651
					field762 = var3.readBoolean(); // L: 6652
					var6 = var3.readUnsignedByte(); // L: 6653
					var7 = class9.field29 * 16384 + 64; // L: 6654
					var23 = class172.field1817 * 128 + 64; // L: 6655
					boolean var70 = false; // L: 6656
					boolean var65 = false; // L: 6657
					if (field762) { // L: 6658
						var9 = KeyHandler.cameraY; // L: 6659
						var10 = class19.getTileHeight(var7, var23, class113.Client_plane) - var20; // L: 6660
					} else {
						var9 = class19.getTileHeight(GameEngine.cameraX, GrandExchangeOfferTotalQuantityComparator.cameraZ, class113.Client_plane) - KeyHandler.cameraY; // L: 6663
						var10 = var20; // L: 6664
					}

					field763 = new class493(GameEngine.cameraX, GrandExchangeOfferTotalQuantityComparator.cameraZ, var9, var7, var23, var10, var5, var6); // L: 6666
					var1.serverPacket = null; // L: 6667
					return true; // L: 6668
				}

				Widget var86;
				if (ServerPacket.field3285 == var1.serverPacket) { // L: 6670
					var20 = var3.method9441(); // L: 6671
					var5 = var3.method9538(); // L: 6672
					var6 = var3.readUnsignedShort(); // L: 6673
					var86 = class380.field4414.method6348(var20); // L: 6674
					var86.field3758 = var5 + (var6 << 16); // L: 6675
					var1.serverPacket = null; // L: 6676
					return true; // L: 6677
				}

				if (ServerPacket.field3405 == var1.serverPacket) { // L: 6679
					var20 = var3.method9442(); // L: 6680
					var5 = var3.readUnsignedShort(); // L: 6681
					var73 = class380.field4414.method6348(var20); // L: 6682
					if (var73.modelType != 2 || var5 != var73.modelId) { // L: 6683
						var73.modelType = 2; // L: 6684
						var73.modelId = var5; // L: 6685
						FaceNormal.invalidateWidget(var73); // L: 6686
					}

					var1.serverPacket = null; // L: 6688
					return true; // L: 6689
				}

				if (ServerPacket.field3288 == var1.serverPacket) { // L: 6691
					var20 = var3.method9430(); // L: 6692
					byte var78 = var3.method9446(); // L: 6693
					Varps.Varps_temp[var20] = var78; // L: 6694
					if (Varps.Varps_main[var20] != var78) { // L: 6695
						Varps.Varps_main[var20] = var78; // L: 6696
					}

					class136.changeGameOptions(var20); // L: 6698
					field497[++field696 - 1 & 31] = var20; // L: 6699
					var1.serverPacket = null; // L: 6700
					return true; // L: 6701
				}

				if (ServerPacket.field3300 == var1.serverPacket) { // L: 6703
					field766 = false; // L: 6704
					isCameraLocked = false; // L: 6705
					field760 = false; // L: 6706
					field761 = false; // L: 6707
					SoundSystem.field314 = 0; // L: 6708
					ArchiveDiskActionHandler.field4334 = 0; // L: 6709
					ClanChannel.field1766 = 0; // L: 6710
					field762 = false; // L: 6711
					class195.field2045 = 0; // L: 6712
					class439.field4690 = 0; // L: 6713
					class380.field4416 = 0; // L: 6714
					HealthBarDefinition.field1890 = 0; // L: 6715
					class9.field29 = 0; // L: 6716
					class172.field1817 = 0; // L: 6717
					HealthBar.field1296 = 0; // L: 6718
					field763 = null; // L: 6719
					field765 = null; // L: 6720
					field500 = null; // L: 6721

					for (var20 = 0; var20 < 5; ++var20) { // L: 6722
						field767[var20] = false; // L: 6723
					}

					var1.serverPacket = null; // L: 6725
					return true; // L: 6726
				}

				if (ServerPacket.field3356 == var1.serverPacket) { // L: 6728
					class407.field4517 = new class470(class176.Widget_cachedFonts); // L: 6729
					var1.serverPacket = null; // L: 6730
					return true; // L: 6731
				}

				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				Projectile var19;
				int var25;
				byte var59;
				byte var60;
				if (ServerPacket.field3364 == var1.serverPacket) { // L: 6733
					var14 = var3.method9420() * 4; // L: 6749
					var60 = var3.method9446(); // L: 6750
					var13 = var3.method9419() * 4; // L: 6751
					var6 = var3.method9434(); // L: 6752
					var20 = var6 >> 16; // L: 6753
					var5 = var6 >> 8 & 255; // L: 6754
					var7 = var20 + (var6 >> 4 & 7); // L: 6755
					var23 = var5 + (var6 & 7); // L: 6756
					var15 = var3.method9398(); // L: 6757
					var25 = var3.method9538(); // L: 6758
					var17 = var3.method9420(); // L: 6759
					var18 = var3.readUnsignedByte(); // L: 6760
					var59 = var3.method9423(); // L: 6761
					var11 = var3.method9435(); // L: 6762
					var16 = var3.readUnsignedShort(); // L: 6763
					var9 = var60 + var7; // L: 6764
					var10 = var59 + var23; // L: 6765
					if (var7 >= 0 && var23 >= 0 && var7 < 104 && var23 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var25 != 65535) { // L: 6766
						var7 = var7 * 128 + 64; // L: 6767
						var23 = var23 * 128 + 64; // L: 6768
						var9 = var9 * 128 + 64; // L: 6769
						var10 = var10 * 128 + 64; // L: 6770
						var19 = new Projectile(var25, class113.Client_plane, var7, var23, class19.getTileHeight(var7, var23, class113.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var14); // L: 6771
						var19.setDestination(var9, var10, class19.getTileHeight(var9, var10, class113.Client_plane) - var14, var15 + cycle); // L: 6772
						projectiles.addFirst(var19); // L: 6773
					}

					var1.serverPacket = null; // L: 6775
					return true; // L: 6776
				}

				if (ServerPacket.field3365 == var1.serverPacket) { // L: 6778
					Messages.method2850(); // L: 6779
					var90 = var3.readByte(); // L: 6780
					class146 var82 = new class146(var3); // L: 6781
					ClanSettings var88;
					if (var90 >= 0) { // L: 6783
						var88 = currentClanSettings[var90];
					} else {
						var88 = class113.guestClanSettings; // L: 6784
					}

					if (var88 == null) { // L: 6785
						this.method1285(var90); // L: 6786
						var1.serverPacket = null; // L: 6787
						return true; // L: 6788
					}

					if (var82.field1645 > var88.field1716) { // L: 6790
						this.method1285(var90); // L: 6791
						var1.serverPacket = null; // L: 6792
						return true; // L: 6793
					}

					if (var82.field1645 < var88.field1716) { // L: 6795
						var1.serverPacket = null; // L: 6796
						return true; // L: 6797
					}

					var82.method3253(var88); // L: 6799
					var1.serverPacket = null; // L: 6800
					return true; // L: 6801
				}

				if (ServerPacket.field3366 == var1.serverPacket) { // L: 6803
					var6 = var3.method9434(); // L: 6814
					var20 = var6 >> 16; // L: 6815
					var5 = var6 >> 8 & 255; // L: 6816
					var7 = var20 + (var6 >> 4 & 7); // L: 6817
					var23 = var5 + (var6 & 7); // L: 6818
					var9 = var3.readUnsignedByte(); // L: 6819
					var10 = var9 >> 2; // L: 6820
					var11 = var9 & 3; // L: 6821
					var25 = field574[var10]; // L: 6822
					var13 = var3.method9398(); // L: 6823
					if (var7 >= 0 && var23 >= 0 && var7 < 103 && var23 < 103) { // L: 6824
						class167.method3538(class113.Client_plane, var7, var23, var10, var11, var25, var13); // L: 6825
					}

					var1.serverPacket = null; // L: 6827
					return true; // L: 6828
				}

				if (ServerPacket.field3376 == var1.serverPacket) { // L: 6830
					var20 = var3.readInt(); // L: 6831
					var5 = var3.readUnsignedShort(); // L: 6832
					if (var20 < -70000) { // L: 6833
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 6835
						var73 = class380.field4414.method6348(var20);
					} else {
						var73 = null; // L: 6836
					}

					for (; var3.offset < var1.serverPacketLength; class281.itemContainerSetItem(var5, var7, var23 - 1, var9)) { // L: 6837 6851
						var7 = var3.readUShortSmart(); // L: 6838
						var23 = var3.readUnsignedShort(); // L: 6839
						var9 = 0; // L: 6840
						if (var23 != 0) { // L: 6841
							var9 = var3.readUnsignedByte(); // L: 6842
							if (var9 == 255) { // L: 6843
								var9 = var3.readInt();
							}
						}

						if (var73 != null && var7 >= 0 && var7 < var73.field3834.length) { // L: 6845 6846
							var73.field3834[var7] = var23; // L: 6847
							var73.field3833[var7] = var9; // L: 6848
						}
					}

					if (var73 != null) { // L: 6853
						FaceNormal.invalidateWidget(var73);
					}

					ClientPacket.method5980(); // L: 6854
					field697[++field777 - 1 & 31] = var5 & 32767; // L: 6855
					var1.serverPacket = null; // L: 6856
					return true; // L: 6857
				}

				if (ServerPacket.field3331 == var1.serverPacket) { // L: 6859
					var20 = var3.method9429(); // L: 6860
					var5 = var3.readUnsignedShort(); // L: 6861
					var73 = class380.field4414.method6348(var20); // L: 6862
					if (var73.modelType != 6 || var5 != var73.modelId) { // L: 6863
						var73.modelType = 6; // L: 6864
						var73.modelId = var5; // L: 6865
						FaceNormal.invalidateWidget(var73); // L: 6866
					}

					var1.serverPacket = null; // L: 6868
					return true; // L: 6869
				}

				class309 var80;
				if (ServerPacket.field3294 == var1.serverPacket) { // L: 6871
					class235.field2478 = var3.method9419(); // L: 6872
					class187.field1944 = var3.method9420(); // L: 6873

					while (var3.offset < var1.serverPacketLength) { // L: 6874
						var20 = var3.readUnsignedByte(); // L: 6875
						var80 = ArchiveDisk.method8476()[var20]; // L: 6876
						WallObject.method5888(var80); // L: 6877
					}

					var1.serverPacket = null; // L: 6879
					return true; // L: 6880
				}

				long var26;
				long var28;
				long var30;
				String var32;
				boolean var63;
				if (ServerPacket.field3383 == var1.serverPacket) { // L: 6882
					var90 = var3.readByte(); // L: 6883
					var26 = (long)var3.readUnsignedShort(); // L: 6884
					var28 = (long)var3.readMedium(); // L: 6885
					var30 = var28 + (var26 << 32); // L: 6886
					var63 = false; // L: 6887
					ClanChannel var12 = var90 >= 0 ? currentClanChannels[var90] : UserComparator4.guestClanChannel; // L: 6888
					if (var12 == null) { // L: 6889
						var63 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 6891
							if (var30 == field734[var13]) { // L: 6892
								var63 = true; // L: 6893
								break; // L: 6894
							}
						}
					}

					if (!var63) { // L: 6898
						field734[field735] = var30; // L: 6899
						field735 = (field735 + 1) % 100; // L: 6900
						var32 = Huffman.method6899(var3); // L: 6901
						var14 = var90 >= 0 ? 43 : 46; // L: 6902
						ItemContainer.addChatMessage(var14, "", var32, var12.name); // L: 6903
					}

					var1.serverPacket = null; // L: 6905
					return true; // L: 6906
				}

				if (ServerPacket.field3317 == var1.serverPacket) { // L: 6908
					ClientPacket.method5980(); // L: 6909
					var20 = var3.method9526(); // L: 6910
					var5 = var3.readInt(); // L: 6911
					var6 = var3.method9526(); // L: 6912
					experience[var6] = var5; // L: 6913
					currentLevels[var6] = var20; // L: 6914
					levels[var6] = 1; // L: 6915
					field644[var6] = var20; // L: 6916

					for (var7 = 0; var7 < 98; ++var7) { // L: 6917
						if (var5 >= Skills.Skills_experienceTable[var7]) {
							levels[var6] = var7 + 2;
						}
					}

					field551[++field665 - 1 & 31] = var6; // L: 6918
					var1.serverPacket = null; // L: 6919
					return true; // L: 6920
				}

				if (ServerPacket.field3403 == var1.serverPacket) { // L: 6922
					class401.privateChatMode = GrandExchangeOfferAgeComparator.method7184(var3.readUnsignedByte()); // L: 6923
					var1.serverPacket = null; // L: 6924
					return true; // L: 6925
				}

				if (ServerPacket.field3341 == var1.serverPacket) { // L: 6927
					WallObject.method5888(class309.field3268); // L: 6928
					var1.serverPacket = null; // L: 6929
					return true; // L: 6930
				}

				if (ServerPacket.field3355 == var1.serverPacket) { // L: 6932
					var20 = var3.method9442(); // L: 6933
					var5 = var3.readUnsignedShort(); // L: 6934
					var6 = var5 >> 10 & 31; // L: 6935
					var7 = var5 >> 5 & 31; // L: 6936
					var23 = var5 & 31; // L: 6937
					var9 = (var7 << 11) + (var6 << 19) + (var23 << 3); // L: 6938
					Widget var93 = class380.field4414.method6348(var20); // L: 6939
					if (var9 != var93.color) { // L: 6940
						var93.color = var9; // L: 6941
						FaceNormal.invalidateWidget(var93); // L: 6942
					}

					var1.serverPacket = null; // L: 6944
					return true; // L: 6945
				}

				if (ServerPacket.field3295 == var1.serverPacket) { // L: 6947
					class235.field2478 = var3.method9419(); // L: 6948
					field652 = var3.readUnsignedByte(); // L: 6949
					class187.field1944 = var3.method9420(); // L: 6950

					while (var3.offset < var1.serverPacketLength) { // L: 6951
						var20 = var3.readUnsignedByte(); // L: 6952
						var80 = ArchiveDisk.method8476()[var20]; // L: 6953
						WallObject.method5888(var80); // L: 6954
					}

					var1.serverPacket = null; // L: 6956
					return true; // L: 6957
				}

				if (ServerPacket.field3287 == var1.serverPacket) { // L: 6959
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) { // L: 6960
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) { // L: 6961
							Varps.Varps_main[var20] = Varps.Varps_temp[var20]; // L: 6962
							class136.changeGameOptions(var20); // L: 6963
							field497[++field696 - 1 & 31] = var20; // L: 6964
						}
					}

					var1.serverPacket = null; // L: 6967
					return true; // L: 6968
				}

				if (ServerPacket.field3327 == var1.serverPacket) { // L: 6970
					return this.method1608(var1, 1); // L: 6971
				}

				if (ServerPacket.field3406 == var1.serverPacket) { // L: 6973
					publicChatMode = var3.readUnsignedByte(); // L: 6974
					tradeChatMode = var3.method9526(); // L: 6975
					var1.serverPacket = null; // L: 6976
					return true; // L: 6977
				}

				boolean var71;
				if (ServerPacket.field3318 == var1.serverPacket) { // L: 6979
					var71 = var3.method9419() == 1; // L: 6980
					var5 = var3.readInt(); // L: 6981
					var73 = class380.field4414.method6348(var5); // L: 6982
					NPC.method2717(var73, class25.localPlayer.appearance, var71); // L: 6983
					FaceNormal.invalidateWidget(var73); // L: 6984
					var1.serverPacket = null; // L: 6985
					return true; // L: 6986
				}

				String var41;
				if (ServerPacket.field3346 == var1.serverPacket) { // L: 6988
					var90 = var3.readByte(); // L: 6989
					var21 = var3.readStringCp1252NullTerminated(); // L: 6990
					long var34 = (long)var3.readUnsignedShort(); // L: 6991
					long var36 = (long)var3.readMedium(); // L: 6992
					PlayerType var92 = (PlayerType)GrandExchangeEvents.findEnumerated(class184.PlayerType_values(), var3.readUnsignedByte()); // L: 6993
					long var38 = var36 + (var34 << 32); // L: 6994
					boolean var66 = false; // L: 6995
					ClanChannel var40 = null; // L: 6996
					var40 = var90 >= 0 ? currentClanChannels[var90] : UserComparator4.guestClanChannel; // L: 6998
					if (var40 == null) { // L: 6999
						var66 = true; // L: 7000
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var92.isUser && class332.friendSystem.isIgnored(new Username(var21, UserComparator10.loginType))) { // L: 7009 7010
									var66 = true;
								}
								break;
							}

							if (field734[var15] == var38) { // L: 7004
								var66 = true; // L: 7005
								break; // L: 7006
							}

							++var15; // L: 7003
						}
					}

					if (!var66) { // L: 7013
						field734[field735] = var38; // L: 7014
						field735 = (field735 + 1) % 100; // L: 7015
						var41 = AbstractFont.escapeBrackets(Huffman.method6899(var3)); // L: 7016
						var16 = var90 >= 0 ? 41 : 44; // L: 7017
						if (var92.modIcon != -1) { // L: 7018
							ItemContainer.addChatMessage(var16, class228.method4503(var92.modIcon) + var21, var41, var40.name);
						} else {
							ItemContainer.addChatMessage(var16, var21, var41, var40.name); // L: 7019
						}
					}

					var1.serverPacket = null; // L: 7021
					return true; // L: 7022
				}

				if (ServerPacket.field3304 == var1.serverPacket) { // L: 7024
					WallObject.method5888(class309.field3267); // L: 7025
					var1.serverPacket = null; // L: 7026
					return true; // L: 7027
				}

				String var50;
				if (ServerPacket.field3354 == var1.serverPacket) { // L: 7029
					var50 = var3.readStringCp1252NullTerminated(); // L: 7030
					var5 = var3.readInt(); // L: 7031
					var73 = class380.field4414.method6348(var5); // L: 7032
					if (!var50.equals(var73.text)) { // L: 7033
						var73.text = var50; // L: 7034
						FaceNormal.invalidateWidget(var73); // L: 7035
					}

					var1.serverPacket = null; // L: 7037
					return true; // L: 7038
				}

				if (ServerPacket.field3413 == var1.serverPacket) { // L: 7040
					var20 = var3.method9398(); // L: 7041
					var5 = var3.method9429(); // L: 7042
					var73 = class380.field4414.method6348(var5); // L: 7043
					if (var73.modelType != 1 || var20 != var73.modelId) { // L: 7044
						var73.modelType = 1; // L: 7045
						var73.modelId = var20; // L: 7046
						FaceNormal.invalidateWidget(var73); // L: 7047
					}

					var1.serverPacket = null; // L: 7049
					return true; // L: 7050
				}

				if (ServerPacket.field3369 == var1.serverPacket) { // L: 7052
					var50 = var3.readStringCp1252NullTerminated(); // L: 7053
					var21 = AbstractFont.escapeBrackets(class167.method3535(Huffman.method6899(var3))); // L: 7054
					GrandExchangeEvents.addGameMessage(6, var50, var21); // L: 7055
					var1.serverPacket = null; // L: 7056
					return true; // L: 7057
				}

				if (ServerPacket.field3338 == var1.serverPacket) { // L: 7059
					var20 = var3.readUnsignedByte(); // L: 7060
					RouteStrategy.method4506(var20); // L: 7061
					var1.serverPacket = null; // L: 7062
					return true; // L: 7063
				}

				boolean var83;
				if (ServerPacket.field3293 == var1.serverPacket) { // L: 7065
					var50 = var3.readStringCp1252NullTerminated(); // L: 7066
					var26 = (long)var3.readUnsignedShort(); // L: 7067
					var28 = (long)var3.readMedium(); // L: 7068
					PlayerType var94 = (PlayerType)GrandExchangeEvents.findEnumerated(class184.PlayerType_values(), var3.readUnsignedByte()); // L: 7069
					long var43 = var28 + (var26 << 32); // L: 7070
					var83 = false; // L: 7071

					for (var13 = 0; var13 < 100; ++var13) { // L: 7072
						if (field734[var13] == var43) { // L: 7073
							var83 = true; // L: 7074
							break; // L: 7075
						}
					}

					if (class332.friendSystem.isIgnored(new Username(var50, UserComparator10.loginType))) { // L: 7078
						var83 = true;
					}

					if (!var83 && field621 == 0) { // L: 7079
						field734[field735] = var43; // L: 7080
						field735 = (field735 + 1) % 100; // L: 7081
						var32 = AbstractFont.escapeBrackets(class167.method3535(Huffman.method6899(var3))); // L: 7082
						byte var68;
						if (var94.isPrivileged) { // L: 7084
							var68 = 7;
						} else {
							var68 = 3; // L: 7085
						}

						if (var94.modIcon != -1) { // L: 7086
							GrandExchangeEvents.addGameMessage(var68, class228.method4503(var94.modIcon) + var50, var32);
						} else {
							GrandExchangeEvents.addGameMessage(var68, var50, var32); // L: 7087
						}
					}

					var1.serverPacket = null; // L: 7089
					return true; // L: 7090
				}

				if (ServerPacket.field3330 == var1.serverPacket) { // L: 7092
					var20 = var3.readShort(); // L: 7093
					var5 = var3.method9442(); // L: 7094
					var6 = var3.method9432(); // L: 7095
					var86 = class380.field4414.method6348(var5); // L: 7096
					if (var6 != var86.rawX || var20 != var86.rawY || var86.xAlignment != 0 || var86.yAlignment != 0) { // L: 7097
						var86.rawX = var6; // L: 7098
						var86.rawY = var20; // L: 7099
						var86.xAlignment = 0; // L: 7100
						var86.yAlignment = 0; // L: 7101
						FaceNormal.invalidateWidget(var86); // L: 7102
						this.alignWidget(var86); // L: 7103
						if (var86.type == 0) { // L: 7104
							class16.revalidateWidgetScroll(class380.field4414.field3610[var5 >> 16], var86, false);
						}
					}

					var1.serverPacket = null; // L: 7106
					return true; // L: 7107
				}

				if (ServerPacket.field3326 == var1.serverPacket) { // L: 7109
					var20 = var3.readUnsignedShort(); // L: 7110
					var5 = var3.readUnsignedByte(); // L: 7111
					var6 = var3.readUnsignedShort(); // L: 7112
					class365.queueSoundEffect(var20, var5, var6); // L: 7113
					var1.serverPacket = null; // L: 7114
					return true; // L: 7115
				}

				if (ServerPacket.field3292 == var1.serverPacket) { // L: 7117
					var20 = var3.readUnsignedShort(); // L: 7118
					if (var20 == 65535) { // L: 7119
						var20 = -1;
					}

					Coord.playSong(var20); // L: 7120
					var1.serverPacket = null; // L: 7121
					return true; // L: 7122
				}

				if (ServerPacket.field3371 == var1.serverPacket) { // L: 7124
					var20 = var3.readUnsignedShort(); // L: 7125
					if (var20 == 65535) { // L: 7126
						var20 = -1;
					}

					var5 = var3.method9434(); // L: 7127
					class405.method7552(var20, var5); // L: 7128
					var1.serverPacket = null; // L: 7129
					return true; // L: 7130
				}

				if (ServerPacket.field3377 == var1.serverPacket && isCameraLocked) { // L: 7132 7133
					field766 = true; // L: 7134
					field761 = false; // L: 7135
					field760 = false; // L: 7136

					for (var20 = 0; var20 < 5; ++var20) { // L: 7137
						field767[var20] = false; // L: 7138
					}

					var1.serverPacket = null; // L: 7140
					return true; // L: 7141
				}

				if (ServerPacket.field3398 == var1.serverPacket) { // L: 7144
					field513 = var3.readUnsignedByte(); // L: 7145
					if (field513 == 1) { // L: 7146
						field508 = var3.readUnsignedShort();
					}

					if (field513 >= 2 && field513 <= 6) { // L: 7147
						if (field513 == 2) { // L: 7148
							field523 = 64; // L: 7149
							field524 = 64; // L: 7150
						}

						if (field513 == 3) { // L: 7152
							field523 = 0; // L: 7153
							field524 = 64; // L: 7154
						}

						if (field513 == 4) { // L: 7156
							field523 = 128; // L: 7157
							field524 = 64; // L: 7158
						}

						if (field513 == 5) { // L: 7160
							field523 = 64; // L: 7161
							field524 = 0; // L: 7162
						}

						if (field513 == 6) { // L: 7164
							field523 = 64; // L: 7165
							field524 = 128; // L: 7166
						}

						field513 = 2; // L: 7168
						field525 = var3.readUnsignedShort(); // L: 7169
						field613 = var3.readUnsignedShort(); // L: 7170
						field522 = var3.readUnsignedByte() * 2; // L: 7171
					}

					if (field513 == 10) { // L: 7173
						field519 = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 7174
					return true; // L: 7175
				}

				if (ServerPacket.field3410 == var1.serverPacket) { // L: 7177
					destinationX = var3.readUnsignedByte(); // L: 7178
					if (destinationX == 255) { // L: 7179
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 7180
					if (destinationY == 255) { // L: 7181
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 7182
					return true; // L: 7183
				}

				if (ServerPacket.field3345 == var1.serverPacket) { // L: 7185
					var20 = var3.method9420(); // L: 7186
					var5 = var3.method9526(); // L: 7187
					var6 = var3.method9441(); // L: 7188
					var86 = class380.field4414.method6348(var6); // L: 7189
					class128.method3070(var86, var5, var20); // L: 7190
					FaceNormal.invalidateWidget(var86); // L: 7191
					var1.serverPacket = null; // L: 7192
					return true; // L: 7193
				}

				if (ServerPacket.field3286 == var1.serverPacket) { // L: 7195
					class332.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 7196
					field704 = cycleCntr; // L: 7197
					var1.serverPacket = null; // L: 7198
					return true; // L: 7199
				}

				if (ServerPacket.field3325 == var1.serverPacket) { // L: 7201
					var3.offset += 28; // L: 7202
					if (var3.checkCrc()) { // L: 7203
						Varcs.method2826(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 7204
					return true; // L: 7205
				}

				NPC var57;
				if (ServerPacket.field3391 == var1.serverPacket) { // L: 7207
					var5 = var3.readInt(); // L: 7213
					var20 = var3.method9398(); // L: 7214
					var57 = npcs[var20]; // L: 7215
					var6 = var3.method9430(); // L: 7216
					var7 = var3.readUnsignedByte(); // L: 7217
					if (var57 != null) { // L: 7218
						var57.method2469(var7, var6, var5 >> 16, var5 & 65535); // L: 7219
					}

					var1.serverPacket = null; // L: 7221
					return true; // L: 7222
				}

				if (ServerPacket.field3310 == var1.serverPacket) { // L: 7224
					WallObject.method5888(class309.field3274); // L: 7225
					var1.serverPacket = null; // L: 7226
					return true; // L: 7227
				}

				if (ServerPacket.field3301 == var1.serverPacket) { // L: 7229
					isCameraLocked = true; // L: 7230
					field766 = false; // L: 7231
					field761 = false; // L: 7232
					SoundSystem.field314 = var3.readUnsignedByte() * 16384; // L: 7233
					ArchiveDiskActionHandler.field4334 = var3.readUnsignedByte() * 16384; // L: 7234
					ClanChannel.field1766 = var3.readUnsignedShort(); // L: 7235
					class195.field2045 = var3.readUnsignedByte(); // L: 7236
					class439.field4690 = var3.readUnsignedByte(); // L: 7237
					if (class439.field4690 >= 100) { // L: 7238
						var20 = SoundSystem.field314 * 128 + 64; // L: 7239
						var5 = ArchiveDiskActionHandler.field4334 * 128 + 64; // L: 7240
						var6 = class19.getTileHeight(var20, var5, class113.Client_plane) - ClanChannel.field1766; // L: 7241
						var7 = var20 - GameEngine.cameraX; // L: 7242
						var23 = var6 - KeyHandler.cameraY; // L: 7243
						var9 = var5 - GrandExchangeOfferTotalQuantityComparator.cameraZ; // L: 7244
						var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9)); // L: 7245
						UserComparator3.cameraPitch = (int)(Math.atan2((double)var23, (double)var10) * 325.9490051269531D) & 2047; // L: 7246
						HealthBarUpdate.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047; // L: 7247
						if (UserComparator3.cameraPitch < 128) { // L: 7248
							UserComparator3.cameraPitch = 128;
						}

						if (UserComparator3.cameraPitch > 383) { // L: 7249
							UserComparator3.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 7251
					return true; // L: 7252
				}

				if (ServerPacket.field3402 == var1.serverPacket) { // L: 7254
					WallObject.method5888(class309.field3270); // L: 7255
					var1.serverPacket = null; // L: 7256
					return true; // L: 7257
				}

				if (ServerPacket.field3319 == var1.serverPacket) { // L: 7259
					ClientPacket.method5980(); // L: 7260
					field671 = var3.readUnsignedShort(); // L: 7261
					field592 = cycleCntr; // L: 7262
					var1.serverPacket = null; // L: 7263
					return true; // L: 7264
				}

				if (ServerPacket.field3321 == var1.serverPacket) { // L: 7266
					var20 = var3.method9430(); // L: 7267
					var5 = var3.method9420(); // L: 7268
					if (var20 == 65535) { // L: 7269
						var20 = -1; // L: 7270
					}

					class358.performPlayerAnimation(class25.localPlayer, var20, var5); // L: 7272
					var1.serverPacket = null; // L: 7273
					return true; // L: 7274
				}

				if (ServerPacket.field3299 == var1.serverPacket) { // L: 7276
					return this.method1779(var1); // L: 7277
				}

				if (ServerPacket.field3316 == var1.serverPacket) { // L: 7279
					Coord.method6339(var3.readStringCp1252NullTerminated()); // L: 7280
					var1.serverPacket = null; // L: 7281
					return true; // L: 7282
				}

				if (ServerPacket.field3307 == var1.serverPacket) { // L: 7284
					class189.method3780(); // L: 7285
					var1.serverPacket = null; // L: 7286
					return false; // L: 7287
				}

				if (ServerPacket.field3334 == var1.serverPacket) { // L: 7289
					WallObject.method5888(class309.field3266); // L: 7290
					var1.serverPacket = null; // L: 7291
					return true; // L: 7292
				}

				long var46;
				if (ServerPacket.field3400 == var1.serverPacket) { // L: 7294
					var50 = var3.readStringCp1252NullTerminated(); // L: 7295
					var26 = var3.readLong(); // L: 7296
					var28 = (long)var3.readUnsignedShort(); // L: 7297
					var30 = (long)var3.readMedium(); // L: 7298
					PlayerType var95 = (PlayerType)GrandExchangeEvents.findEnumerated(class184.PlayerType_values(), var3.readUnsignedByte()); // L: 7299
					var46 = var30 + (var28 << 32); // L: 7300
					boolean var67 = false; // L: 7301

					for (var15 = 0; var15 < 100; ++var15) { // L: 7302
						if (field734[var15] == var46) { // L: 7303
							var67 = true; // L: 7304
							break; // L: 7305
						}
					}

					if (var95.isUser && class332.friendSystem.isIgnored(new Username(var50, UserComparator10.loginType))) { // L: 7308 7309
						var67 = true;
					}

					if (!var67 && field621 == 0) { // L: 7311
						field734[field735] = var46; // L: 7312
						field735 = (field735 + 1) % 100; // L: 7313
						var41 = AbstractFont.escapeBrackets(class167.method3535(Huffman.method6899(var3))); // L: 7314
						if (var95.modIcon != -1) { // L: 7315
							ItemContainer.addChatMessage(9, class228.method4503(var95.modIcon) + var50, var41, class19.base37DecodeLong(var26));
						} else {
							ItemContainer.addChatMessage(9, var50, var41, class19.base37DecodeLong(var26)); // L: 7316
						}
					}

					var1.serverPacket = null; // L: 7318
					return true; // L: 7319
				}

				if (ServerPacket.field3348 == var1.serverPacket) { // L: 7321
					WallObject.method5888(class309.field3264); // L: 7322
					var1.serverPacket = null; // L: 7323
					return true; // L: 7324
				}

				if (ServerPacket.field3396 == var1.serverPacket) { // L: 7326
					var5 = var3.method9538(); // L: 7333
					if (var5 == 65535) { // L: 7334
						var5 = -1; // L: 7335
					}

					var6 = var3.method9538(); // L: 7337
					var9 = var3.method9398(); // L: 7338
					var23 = var3.method9430(); // L: 7339
					var7 = var3.method9538(); // L: 7340
					var20 = var3.method9538(); // L: 7341
					if (var20 == 65535) { // L: 7342
						var20 = -1; // L: 7343
					}

					ArrayList var91 = new ArrayList(); // L: 7345
					var91.add(var20); // L: 7346
					var91.add(var5); // L: 7347
					Skills.method6928(var91, var6, var7, var23, var9); // L: 7348
					var1.serverPacket = null; // L: 7349
					return true; // L: 7350
				}

				if (ServerPacket.field3375 == var1.serverPacket) { // L: 7352
					isCameraLocked = true; // L: 7353
					field766 = false; // L: 7354
					field761 = true; // L: 7355
					var20 = class36.method729(var3.readShort() & 2027); // L: 7356
					var5 = class518.method9254(var3.readShort() & 2027); // L: 7357
					var6 = var3.readUnsignedShort(); // L: 7358
					var7 = var3.readUnsignedByte(); // L: 7359
					field765 = new class494(UserComparator3.cameraPitch, var5, var6, var7); // L: 7360
					field500 = new class494(HealthBarUpdate.cameraYaw, var20, var6, var7); // L: 7361
					var1.serverPacket = null; // L: 7362
					return true; // L: 7363
				}

				if (ServerPacket.field3303 == var1.serverPacket) { // L: 7365
					var7 = var3.method9398(); // L: 7370
					var5 = var3.method9430(); // L: 7371
					var20 = var3.method9430(); // L: 7372
					var6 = var3.readUnsignedShort(); // L: 7373
					FriendSystem.method1927(var20, var5, var6, var7); // L: 7374
					var1.serverPacket = null; // L: 7375
					return true; // L: 7376
				}

				if (ServerPacket.field3349 == var1.serverPacket) { // L: 7378
					class353.updateNpcs(true, var3); // L: 7379
					var1.serverPacket = null; // L: 7380
					return true; // L: 7381
				}

				if (ServerPacket.field3323 == var1.serverPacket) { // L: 7383
					var20 = var3.method9538(); // L: 7384
					short var69 = (short)var3.readShort(); // L: 7385
					var6 = var3.method9526(); // L: 7386
					var7 = var3.readInt(); // L: 7387
					var57 = npcs[var20]; // L: 7388
					if (var57 != null) { // L: 7389
						var57.method2692(var6, var7, var69); // L: 7390
					}

					var1.serverPacket = null; // L: 7392
					return true; // L: 7393
				}

				if (ServerPacket.field3362 == var1.serverPacket) { // L: 7395
					class195.readReflectionCheck(var3, var1.serverPacketLength); // L: 7396
					var1.serverPacket = null; // L: 7397
					return true; // L: 7398
				}

				if (ServerPacket.field3344 == var1.serverPacket) { // L: 7400
					class407.field4517 = null; // L: 7401
					var1.serverPacket = null; // L: 7402
					return true; // L: 7403
				}

				if (ServerPacket.field3314 == var1.serverPacket) { // L: 7405
					var20 = var3.method9442(); // L: 7406
					var5 = var3.method9538(); // L: 7407
					Varps.Varps_temp[var5] = var20; // L: 7408
					if (Varps.Varps_main[var5] != var20) { // L: 7409
						Varps.Varps_main[var5] = var20; // L: 7410
					}

					class136.changeGameOptions(var5); // L: 7412
					field497[++field696 - 1 & 31] = var5; // L: 7413
					var1.serverPacket = null; // L: 7414
					return true; // L: 7415
				}

				Widget var74;
				if (ServerPacket.field3324 == var1.serverPacket) { // L: 7417
					var20 = var3.readInt(); // L: 7418
					var74 = class380.field4414.method6348(var20); // L: 7419

					for (var6 = 0; var6 < var74.field3834.length; ++var6) { // L: 7420
						var74.field3834[var6] = -1; // L: 7421
						var74.field3834[var6] = 0; // L: 7422
					}

					FaceNormal.invalidateWidget(var74); // L: 7424
					var1.serverPacket = null; // L: 7425
					return true; // L: 7426
				}

				if (ServerPacket.field3363 == var1.serverPacket) { // L: 7428
					var20 = var3.method9526(); // L: 7429
					var5 = var3.method9429(); // L: 7430
					var73 = class380.field4414.method6348(var5); // L: 7431
					MidiPcmStream.method6132(var73, class25.localPlayer.appearance.field3640, var20); // L: 7432
					FaceNormal.invalidateWidget(var73); // L: 7433
					var1.serverPacket = null; // L: 7434
					return true; // L: 7435
				}

				if (ServerPacket.field3381 == var1.serverPacket) { // L: 7437
					WallObject.method5888(class309.field3271); // L: 7438
					var1.serverPacket = null; // L: 7439
					return true; // L: 7440
				}

				if (ServerPacket.field3394 == var1.serverPacket) { // L: 7442
					isCameraLocked = true; // L: 7443
					field766 = false; // L: 7444
					field760 = true; // L: 7445
					class9.field29 = var3.readUnsignedByte() * 128; // L: 7446
					class172.field1817 = var3.readUnsignedByte() * 16384; // L: 7447
					var20 = var3.readUnsignedShort(); // L: 7448
					var5 = var3.readUnsignedByte() * 128 + 64; // L: 7449
					var6 = var3.readUnsignedByte() * 128 + 64; // L: 7450
					var7 = var3.readUnsignedShort(); // L: 7451
					field762 = var3.readBoolean(); // L: 7452
					var23 = var3.readUnsignedByte(); // L: 7453
					var9 = class9.field29 * 16384 + 64; // L: 7454
					var10 = class172.field1817 * 128 + 64; // L: 7455
					var63 = false; // L: 7456
					var83 = false; // L: 7457
					if (field762) { // L: 7458
						var11 = KeyHandler.cameraY; // L: 7459
						var25 = class19.getTileHeight(var9, var10, class113.Client_plane) - var20; // L: 7460
					} else {
						var11 = class19.getTileHeight(GameEngine.cameraX, GrandExchangeOfferTotalQuantityComparator.cameraZ, class113.Client_plane) - KeyHandler.cameraY; // L: 7463
						var25 = var20; // L: 7464
					}

					field763 = new class492(GameEngine.cameraX, GrandExchangeOfferTotalQuantityComparator.cameraZ, var11, var9, var10, var25, var5, var6, var7, var23); // L: 7466
					var1.serverPacket = null; // L: 7467
					return true; // L: 7468
				}

				if (ServerPacket.field3411 == var1.serverPacket) { // L: 7470
					isCameraLocked = true; // L: 7471
					field766 = false; // L: 7472
					field761 = true; // L: 7473
					SoundSystem.field314 = var3.readUnsignedByte() * 16384; // L: 7474
					ArchiveDiskActionHandler.field4334 = var3.readUnsignedByte() * 16384; // L: 7475
					ClanChannel.field1766 = var3.readUnsignedShort(); // L: 7476
					var20 = var3.readUnsignedShort(); // L: 7477
					var5 = var3.readUnsignedByte(); // L: 7478
					var6 = SoundSystem.field314 * 128 + 64; // L: 7479
					var7 = ArchiveDiskActionHandler.field4334 * 128 + 64; // L: 7480
					var23 = class19.getTileHeight(var6, var7, class113.Client_plane) - ClanChannel.field1766; // L: 7481
					var9 = var6 - GameEngine.cameraX; // L: 7482
					var10 = var23 - KeyHandler.cameraY; // L: 7483
					var11 = var7 - GrandExchangeOfferTotalQuantityComparator.cameraZ; // L: 7484
					double var96 = Math.sqrt((double)(var9 * var9 + var11 * var11)); // L: 7485
					var14 = class518.method9254((int)(Math.atan2((double)var10, var96) * 325.9490051269531D) & 2047); // L: 7486
					var15 = class36.method729((int)(Math.atan2((double)var9, (double)var11) * -325.9490051269531D) & 2047); // L: 7487
					field765 = new class494(UserComparator3.cameraPitch, var14, var20, var5); // L: 7488
					field500 = new class494(HealthBarUpdate.cameraYaw, var15, var20, var5); // L: 7489
					var1.serverPacket = null; // L: 7490
					return true; // L: 7491
				}

				if (ServerPacket.field3352 == var1.serverPacket) { // L: 7493
					var71 = var3.readUnsignedByte() == 1; // L: 7494
					var5 = var3.method9429(); // L: 7495
					var73 = class380.field4414.method6348(var5); // L: 7496
					if (var71 != var73.isHidden) { // L: 7497
						var73.isHidden = var71; // L: 7498
						FaceNormal.invalidateWidget(var73); // L: 7499
					}

					var1.serverPacket = null; // L: 7501
					return true; // L: 7502
				}

				if (ServerPacket.field3397 == var1.serverPacket) { // L: 7504
					Messages.method2850(); // L: 7505
					var90 = var3.readByte(); // L: 7506
					if (var1.serverPacketLength == 1) { // L: 7507
						if (var90 >= 0) { // L: 7508
							currentClanSettings[var90] = null;
						} else {
							class113.guestClanSettings = null; // L: 7509
						}

						var1.serverPacket = null; // L: 7510
						return true; // L: 7511
					}

					if (var90 >= 0) { // L: 7513
						currentClanSettings[var90] = new ClanSettings(var3); // L: 7514
					} else {
						class113.guestClanSettings = new ClanSettings(var3); // L: 7517
					}

					var1.serverPacket = null; // L: 7519
					return true; // L: 7520
				}

				if (ServerPacket.field3401 == var1.serverPacket) { // L: 7522
					var20 = var3.method9430(); // L: 7523
					var5 = var3.method9442(); // L: 7524
					var73 = class380.field4414.method6348(var5); // L: 7525
					if (var73 != null && var73.type == 0) { // L: 7526
						if (var20 > var73.scrollHeight - var73.height) { // L: 7527
							var20 = var73.scrollHeight - var73.height;
						}

						if (var20 < 0) { // L: 7528
							var20 = 0;
						}

						if (var20 != var73.scrollY) { // L: 7529
							var73.scrollY = var20; // L: 7530
							FaceNormal.invalidateWidget(var73); // L: 7531
						}
					}

					var1.serverPacket = null; // L: 7534
					return true; // L: 7535
				}

				if (ServerPacket.field3370 == var1.serverPacket) { // L: 7537
					var20 = var3.readShort(); // L: 7538
					var5 = var3.readInt(); // L: 7539
					var73 = class380.field4414.method6348(var5); // L: 7540
					if (var20 != var73.sequenceId || var20 == -1) { // L: 7541
						var73.sequenceId = var20; // L: 7542
						var73.modelFrame = 0; // L: 7543
						var73.modelFrameCycle = 0; // L: 7544
						FaceNormal.invalidateWidget(var73); // L: 7545
					}

					var1.serverPacket = null; // L: 7547
					return true; // L: 7548
				}

				if (ServerPacket.field3379 == var1.serverPacket) { // L: 7550
					var20 = var3.readUShortSmart(); // L: 7551
					boolean var64 = var3.readUnsignedByte() == 1; // L: 7552
					var77 = ""; // L: 7553
					boolean var61 = false; // L: 7554
					if (var64) { // L: 7555
						var77 = var3.readStringCp1252NullTerminated(); // L: 7556
						if (class332.friendSystem.isIgnored(new Username(var77, UserComparator10.loginType))) { // L: 7557
							var61 = true;
						}
					}

					String var56 = var3.readStringCp1252NullTerminated(); // L: 7559
					if (!var61) { // L: 7560
						GrandExchangeEvents.addGameMessage(var20, var77, var56);
					}

					var1.serverPacket = null; // L: 7561
					return true; // L: 7562
				}

				PendingSpawn var52;
				if (ServerPacket.field3296 == var1.serverPacket) { // L: 7564
					class187.field1944 = var3.method9419(); // L: 7565
					class235.field2478 = var3.method9419(); // L: 7566

					for (var20 = class187.field1944; var20 < class187.field1944 + 8; ++var20) { // L: 7567
						for (var5 = class235.field2478; var5 < class235.field2478 + 8; ++var5) { // L: 7568
							if (groundItems[class113.Client_plane][var20][var5] != null) { // L: 7569
								groundItems[class113.Client_plane][var20][var5] = null; // L: 7570
								class134.method3141(class113.Client_plane, var20, var5); // L: 7571
							}
						}
					}

					for (var52 = (PendingSpawn)pendingSpawns.last(); var52 != null; var52 = (PendingSpawn)pendingSpawns.previous()) { // L: 7575 7576 7578
						if (var52.x >= class187.field1944 && var52.x < class187.field1944 + 8 && var52.y >= class235.field2478 && var52.y < class235.field2478 + 8 && var52.plane == class113.Client_plane) { // L: 7577
							var52.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 7580
					return true; // L: 7581
				}

				if (ServerPacket.field3358 == var1.serverPacket) { // L: 7583
					class388.updatePlayers(var3, var1.serverPacketLength); // L: 7584
					SceneTilePaint.method5786(); // L: 7585
					var1.serverPacket = null; // L: 7586
					return true; // L: 7587
				}

				if (ServerPacket.field3385 == var1.serverPacket) { // L: 7589
					for (var20 = 0; var20 < players.length; ++var20) { // L: 7590
						if (players[var20] != null) { // L: 7591
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) { // L: 7593
						if (npcs[var20] != null) { // L: 7594
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 7596
					return true; // L: 7597
				}

				if (ServerPacket.field3357 == var1.serverPacket) { // L: 7599
					var20 = var3.method9430(); // L: 7602
					var5 = var3.readUnsignedShort(); // L: 7603
					Actor.method2488(var20, var5); // L: 7604
					var1.serverPacket = null; // L: 7605
					return true; // L: 7606
				}

				if (ServerPacket.field3387 == var1.serverPacket) { // L: 7608
					WallObject.method5888(class309.field3269); // L: 7609
					var1.serverPacket = null; // L: 7610
					return true; // L: 7611
				}

				if (ServerPacket.field3367 == var1.serverPacket) { // L: 7613
					if (class407.field4517 == null) { // L: 7614
						class407.field4517 = new class470(class176.Widget_cachedFonts);
					}

					class539 var53 = class176.Widget_cachedFonts.method8659(var3); // L: 7615
					class407.field4517.field4835.vmethod9116(var53.field5246, var53.field5244); // L: 7616
					field701[++field702 - 1 & 31] = var53.field5246; // L: 7617
					var1.serverPacket = null; // L: 7618
					return true; // L: 7619
				}

				if (ServerPacket.field3297 == var1.serverPacket) { // L: 7621
					var20 = var3.method9538(); // L: 7622
					if (var20 == 65535) { // L: 7623
						var20 = -1;
					}

					var5 = var3.method9442(); // L: 7624
					var6 = var3.method9429(); // L: 7625
					var7 = var3.readUnsignedShort(); // L: 7626
					if (var7 == 65535) { // L: 7627
						var7 = -1;
					}

					for (var23 = var7; var23 <= var20; ++var23) { // L: 7628
						var30 = ((long)var5 << 32) + (long)var23; // L: 7629
						Node var45 = widgetFlags.get(var30); // L: 7630
						if (var45 != null) { // L: 7631
							var45.remove();
						}

						widgetFlags.put(new IntegerNode(var6), var30); // L: 7632
					}

					var1.serverPacket = null; // L: 7634
					return true; // L: 7635
				}

				if (ServerPacket.field3302 == var1.serverPacket) { // L: 7637
					field652 = var3.method9419(); // L: 7638
					class187.field1944 = var3.method9419(); // L: 7639
					class235.field2478 = var3.method9526(); // L: 7640
					var1.serverPacket = null; // L: 7641
					return true; // L: 7642
				}

				if (ServerPacket.field3320 == var1.serverPacket) { // L: 7644
					minimapState = var3.readUnsignedByte(); // L: 7645
					var1.serverPacket = null; // L: 7646
					return true; // L: 7647
				}

				if (ServerPacket.field3395 == var1.serverPacket) { // L: 7649
					var20 = var3.method9441(); // L: 7650
					var5 = var3.method9429(); // L: 7651
					var6 = var3.readUnsignedShort(); // L: 7652
					if (var6 == 65535) { // L: 7653
						var6 = -1;
					}

					var86 = class380.field4414.method6348(var20); // L: 7654
					ItemComposition var55;
					if (!var86.isIf3) { // L: 7655
						if (var6 == -1) { // L: 7656
							var86.modelType = 0; // L: 7657
							var1.serverPacket = null; // L: 7658
							return true; // L: 7659
						}

						var55 = class341.ItemComposition_get(var6).getCountObj(var5); // L: 7661
						var86.modelType = 4; // L: 7662
						var86.modelId = var6; // L: 7663
						var86.modelAngleX = var55.xan2d; // L: 7664
						var86.modelAngleY = var55.yan2d; // L: 7665
						var86.modelZoom = var55.zoom2d * 100 / var5; // L: 7666
						FaceNormal.invalidateWidget(var86); // L: 7667
					} else {
						var86.itemId = var6; // L: 7670
						var86.itemQuantity = var5; // L: 7671
						var55 = class341.ItemComposition_get(var6).getCountObj(var5); // L: 7672
						var86.modelAngleX = var55.xan2d; // L: 7673
						var86.modelAngleY = var55.yan2d; // L: 7674
						var86.modelAngleZ = var55.zan2d; // L: 7675
						var86.modelOffsetX = var55.offsetX2d; // L: 7676
						var86.modelOffsetY = var55.offsetY2d; // L: 7677
						var86.modelZoom = var55.zoom2d; // L: 7678
						if (var55.isStackable == 1) { // L: 7679
							var86.itemQuantityMode = 1;
						} else {
							var86.itemQuantityMode = 2; // L: 7680
						}

						if (var86.field3785 > 0) { // L: 7681
							var86.modelZoom = var86.modelZoom * 32 / var86.field3785;
						} else if (var86.rawWidth > 0) { // L: 7682
							var86.modelZoom = var86.modelZoom * 32 / var86.rawWidth;
						}

						FaceNormal.invalidateWidget(var86); // L: 7683
					}

					var1.serverPacket = null; // L: 7685
					return true; // L: 7686
				}

				if (ServerPacket.field3339 == var1.serverPacket) { // L: 7688
					var20 = var3.method9430(); // L: 7689
					if (var20 == 65535) { // L: 7690
						var20 = -1;
					}

					rootInterface = var20; // L: 7691
					this.method1280(false); // L: 7692
					BufferedSink.method8450(var20); // L: 7693
					class195.method3835(rootInterface); // L: 7694

					for (var5 = 0; var5 < 100; ++var5) { // L: 7695
						field720[var5] = true;
					}

					var1.serverPacket = null; // L: 7696
					return true; // L: 7697
				}

				InterfaceParent var81;
				if (ServerPacket.field3342 == var1.serverPacket) { // L: 7699
					var20 = var3.method9538(); // L: 7700
					var5 = var3.method9420(); // L: 7701
					var6 = var3.method9442(); // L: 7702
					var81 = (InterfaceParent)interfaceParents.get((long)var6); // L: 7703
					if (var81 != null) { // L: 7704
						class363.closeInterface(var81, var20 != var81.group);
					}

					class155.method3421(var6, var20, var5); // L: 7705
					var1.serverPacket = null; // L: 7706
					return true; // L: 7707
				}

				if (ServerPacket.field3386 == var1.serverPacket) { // L: 7709
					for (var20 = 0; var20 < AbstractByteArrayCopier.field3856; ++var20) { // L: 7710
						VarpDefinition var75 = class128.VarpDefinition_get(var20); // L: 7711
						if (var75 != null) { // L: 7712
							Varps.Varps_temp[var20] = 0; // L: 7713
							Varps.Varps_main[var20] = 0; // L: 7714
						}
					}

					ClientPacket.method5980(); // L: 7717
					field696 += 32; // L: 7718
					var1.serverPacket = null; // L: 7719
					return true; // L: 7720
				}

				if (ServerPacket.field3311 == var1.serverPacket) { // L: 7722
					isCameraLocked = true; // L: 7723
					field766 = false; // L: 7724
					field760 = false; // L: 7725
					class9.field29 = var3.readUnsignedByte() * 128; // L: 7726
					class172.field1817 = var3.readUnsignedByte() * 16384; // L: 7727
					HealthBar.field1296 = var3.readUnsignedShort(); // L: 7728
					HealthBarDefinition.field1890 = var3.readUnsignedByte(); // L: 7729
					class380.field4416 = var3.readUnsignedByte(); // L: 7730
					if (class380.field4416 >= 100) { // L: 7731
						GameEngine.cameraX = class9.field29 * 16384 + 64; // L: 7732
						GrandExchangeOfferTotalQuantityComparator.cameraZ = class172.field1817 * 128 + 64; // L: 7733
						KeyHandler.cameraY = class19.getTileHeight(GameEngine.cameraX, GrandExchangeOfferTotalQuantityComparator.cameraZ, class113.Client_plane) - HealthBar.field1296; // L: 7734
					}

					var1.serverPacket = null; // L: 7736
					return true; // L: 7737
				}

				if (ServerPacket.field3392 == var1.serverPacket) { // L: 7739
					ClientPacket.method5980(); // L: 7740
					weight = var3.readShort(); // L: 7741
					field592 = cycleCntr; // L: 7742
					var1.serverPacket = null; // L: 7743
					return true; // L: 7744
				}

				if (ServerPacket.field3390 == var1.serverPacket) { // L: 7746
					var1.serverPacket = null; // L: 7747
					return true; // L: 7748
				}

				if (ServerPacket.field3312 == var1.serverPacket) { // L: 7750
					var6 = var3.readMedium(); // L: 7766
					var20 = var6 >> 16; // L: 7767
					var5 = var6 >> 8 & 255; // L: 7768
					var7 = var20 + (var6 >> 4 & 7); // L: 7769
					var23 = var5 + (var6 & 7); // L: 7770
					var18 = var3.method9538(); // L: 7771
					var11 = var3.method9435(); // L: 7772
					var59 = var3.method9423(); // L: 7773
					var15 = var3.method9538(); // L: 7774
					var14 = var3.method9420() * 4; // L: 7775
					var25 = var3.readUnsignedShort(); // L: 7776
					var17 = var3.method9420(); // L: 7777
					var60 = var3.method9422(); // L: 7778
					var16 = var3.readUnsignedShort(); // L: 7779
					var13 = var3.method9526() * 4; // L: 7780
					var9 = var60 + var7; // L: 7781
					var10 = var59 + var23; // L: 7782
					if (var7 >= 0 && var23 >= 0 && var7 < 104 && var23 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var25 != 65535) { // L: 7783
						var7 = var7 * 128 + 64; // L: 7784
						var23 = var23 * 128 + 64; // L: 7785
						var9 = var9 * 128 + 64; // L: 7786
						var10 = var10 * 128 + 64; // L: 7787
						var19 = new Projectile(var25, class113.Client_plane, var7, var23, class19.getTileHeight(var7, var23, class113.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var14); // L: 7788
						var19.setDestination(var9, var10, class19.getTileHeight(var9, var10, class113.Client_plane) - var14, var15 + cycle); // L: 7789
						projectiles.addFirst(var19); // L: 7790
					}

					var1.serverPacket = null; // L: 7792
					return true; // L: 7793
				}

				if (ServerPacket.field3404 == var1.serverPacket) { // L: 7795
					var20 = var3.readInt(); // L: 7796
					if (var20 != field800) { // L: 7797
						field800 = var20; // L: 7798
						AbstractSocket.method8405(); // L: 7799
					}

					var1.serverPacket = null; // L: 7801
					return true; // L: 7802
				}

				if (ServerPacket.field3382 == var1.serverPacket) { // L: 7804
					var20 = var3.offset + var1.serverPacketLength; // L: 7805
					var5 = var3.readUnsignedShort(); // L: 7806
					if (var5 == 65535) { // L: 7807
						var5 = -1;
					}

					var6 = var3.readUnsignedShort(); // L: 7808
					if (var5 != rootInterface) { // L: 7809
						rootInterface = var5; // L: 7810
						this.method1280(false); // L: 7811
						BufferedSink.method8450(rootInterface); // L: 7812
						class195.method3835(rootInterface); // L: 7813

						for (var7 = 0; var7 < 100; ++var7) { // L: 7814
							field720[var7] = true;
						}
					}

					InterfaceParent var33;
					for (; var6-- > 0; var33.field1053 = true) { // L: 7816 7826
						var7 = var3.readInt(); // L: 7817
						var23 = var3.readUnsignedShort(); // L: 7818
						var9 = var3.readUnsignedByte(); // L: 7819
						var33 = (InterfaceParent)interfaceParents.get((long)var7); // L: 7820
						if (var33 != null && var23 != var33.group) { // L: 7821
							class363.closeInterface(var33, true); // L: 7822
							var33 = null; // L: 7823
						}

						if (var33 == null) { // L: 7825
							var33 = class155.method3421(var7, var23, var9);
						}
					}

					for (var81 = (InterfaceParent)interfaceParents.first(); var81 != null; var81 = (InterfaceParent)interfaceParents.next()) { // L: 7828
						if (var81.field1053) { // L: 7829
							var81.field1053 = false;
						} else {
							class363.closeInterface(var81, true); // L: 7831
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 7834

					while (var3.offset < var20) { // L: 7835
						var7 = var3.readInt(); // L: 7836
						var23 = var3.readUnsignedShort(); // L: 7837
						var9 = var3.readUnsignedShort(); // L: 7838
						var10 = var3.readInt(); // L: 7839

						for (var11 = var23; var11 <= var9; ++var11) { // L: 7840
							var46 = ((long)var7 << 32) + (long)var11; // L: 7841
							widgetFlags.put(new IntegerNode(var10), var46); // L: 7842
						}
					}

					var1.serverPacket = null; // L: 7845
					return true; // L: 7846
				}

				if (ServerPacket.field3315 == var1.serverPacket) { // L: 7848
					var20 = var3.method9429(); // L: 7849
					var74 = class380.field4414.method6348(var20); // L: 7850
					var74.modelType = 3; // L: 7851
					var74.modelId = class25.localPlayer.appearance.getChatHeadId(); // L: 7852
					FaceNormal.invalidateWidget(var74); // L: 7853
					var1.serverPacket = null; // L: 7854
					return true; // L: 7855
				}

				if (ServerPacket.field3332 == var1.serverPacket) { // L: 7857
					return this.method1608(var1, 2); // L: 7858
				}

				if (ServerPacket.field3359 == var1.serverPacket) { // L: 7860
					var20 = var3.method9442(); // L: 7861
					var5 = var3.method9429(); // L: 7862
					InterfaceParent var76 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7863
					var81 = (InterfaceParent)interfaceParents.get((long)var5); // L: 7864
					if (var81 != null) { // L: 7865
						class363.closeInterface(var81, var76 == null || var81.group != var76.group);
					}

					if (var76 != null) { // L: 7866
						var76.remove(); // L: 7867
						interfaceParents.put(var76, (long)var5); // L: 7868
					}

					var8 = class380.field4414.method6348(var20); // L: 7870
					if (var8 != null) { // L: 7871
						FaceNormal.invalidateWidget(var8);
					}

					var8 = class380.field4414.method6348(var5); // L: 7872
					if (var8 != null) { // L: 7873
						FaceNormal.invalidateWidget(var8); // L: 7874
						class16.revalidateWidgetScroll(class380.field4414.field3610[var8.id >>> 16], var8, true); // L: 7875
					}

					if (rootInterface != -1) { // L: 7877
						WorldMapScaleHandler.method5149(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 7878
					return true; // L: 7879
				}

				if (ServerPacket.field3350 == var1.serverPacket) { // L: 7881
					rebootTimer = var3.method9430() * 30; // L: 7882
					field592 = cycleCntr; // L: 7883
					var1.serverPacket = null; // L: 7884
					return true; // L: 7885
				}

				if (ServerPacket.field3347 == var1.serverPacket) { // L: 7887
					var71 = var3.readUnsignedByte() == 1; // L: 7888
					if (var71) { // L: 7889
						class17.field74 = UserComparator9.method2973() - var3.readLong(); // L: 7890
						class380.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 7891
					} else {
						class380.grandExchangeEvents = null; // L: 7893
					}

					field709 = cycleCntr; // L: 7894
					var1.serverPacket = null; // L: 7895
					return true; // L: 7896
				}

				if (ServerPacket.field3384 == var1.serverPacket) { // L: 7898
					var20 = var3.method9526(); // L: 7899
					var21 = var3.readStringCp1252NullTerminated(); // L: 7900
					var6 = var3.readUnsignedByte(); // L: 7901
					if (var6 >= 1 && var6 <= 8) { // L: 7902
						if (var21.equalsIgnoreCase("null")) { // L: 7903
							var21 = null;
						}

						playerMenuActions[var6 - 1] = var21; // L: 7904
						playerOptionsPriorities[var6 - 1] = var20 == 0; // L: 7905
					}

					var1.serverPacket = null; // L: 7907
					return true; // L: 7908
				}

				if (ServerPacket.field3337 == var1.serverPacket) { // L: 7910
					class235.field2478 = var3.method9420(); // L: 7911
					field652 = var3.readUnsignedByte(); // L: 7912
					class187.field1944 = var3.method9526(); // L: 7913

					for (var20 = class187.field1944; var20 < class187.field1944 + 8; ++var20) { // L: 7914
						for (var5 = class235.field2478; var5 < class235.field2478 + 8; ++var5) { // L: 7915
							if (groundItems[field652][var20][var5] != null) { // L: 7916
								groundItems[field652][var20][var5] = null; // L: 7917
								class134.method3141(field652, var20, var5); // L: 7918
							}
						}
					}

					for (var52 = (PendingSpawn)pendingSpawns.last(); var52 != null; var52 = (PendingSpawn)pendingSpawns.previous()) { // L: 7922 7923 7925
						if (var52.x >= class187.field1944 && var52.x < class187.field1944 + 8 && var52.y >= class235.field2478 && var52.y < class235.field2478 + 8 && var52.plane == field652) { // L: 7924
							var52.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 7927
					return true; // L: 7928
				}

				if (ServerPacket.field3389 == var1.serverPacket) { // L: 7930
					var23 = var3.method9538(); // L: 7936
					var6 = var3.method9430(); // L: 7937
					var7 = var3.method9430(); // L: 7938
					var5 = var3.method9430(); // L: 7939
					var20 = var3.method9538(); // L: 7940
					if (var20 == 65535) { // L: 7941
						var20 = -1; // L: 7942
					}

					ArrayList var42 = new ArrayList(); // L: 7944
					var42.add(var20); // L: 7945
					Skills.method6928(var42, var5, var6, var7, var23); // L: 7946
					var1.serverPacket = null; // L: 7947
					return true; // L: 7948
				}

				if (ServerPacket.field3412 == var1.serverPacket) { // L: 7950
					World var51 = new World(); // L: 7951
					var51.host = var3.readStringCp1252NullTerminated(); // L: 7952
					var51.id = var3.readUnsignedShort(); // L: 7953
					var5 = var3.readInt(); // L: 7954
					var51.properties = var5; // L: 7955
					if (var51.isDeadman()) { // L: 7956
						var51.field821 = "beta"; // L: 7957
					}

					class131.method3087(45); // L: 7959
					var2.close(); // L: 7960
					var2 = null; // L: 7961
					class465.changeWorld(var51); // L: 7962
					var1.serverPacket = null; // L: 7963
					return false; // L: 7964
				}

				if (ServerPacket.field3290 == var1.serverPacket) { // L: 7966
					var20 = var3.readInt(); // L: 7967
					var5 = var3.readUnsignedShort(); // L: 7968
					if (var20 < -70000) { // L: 7969
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 7971
						var73 = class380.field4414.method6348(var20);
					} else {
						var73 = null; // L: 7972
					}

					if (var73 != null) { // L: 7973
						for (var7 = 0; var7 < var73.field3834.length; ++var7) { // L: 7974
							var73.field3834[var7] = 0; // L: 7975
							var73.field3833[var7] = 0; // L: 7976
						}
					}

					class127.clearItemContainer(var5); // L: 7979
					var7 = var3.readUnsignedShort(); // L: 7980

					for (var23 = 0; var23 < var7; ++var23) { // L: 7981
						var9 = var3.method9419(); // L: 7982
						if (var9 == 255) { // L: 7983
							var9 = var3.method9429();
						}

						var10 = var3.method9398(); // L: 7984
						if (var73 != null && var23 < var73.field3834.length) { // L: 7985 7986
							var73.field3834[var23] = var10; // L: 7987
							var73.field3833[var23] = var9; // L: 7988
						}

						class281.itemContainerSetItem(var5, var23, var10 - 1, var9); // L: 7991
					}

					if (var73 != null) { // L: 7993
						FaceNormal.invalidateWidget(var73);
					}

					ClientPacket.method5980(); // L: 7994
					field697[++field777 - 1 & 31] = var5 & 32767; // L: 7995
					var1.serverPacket = null; // L: 7996
					return true; // L: 7997
				}

				if (ServerPacket.field3328 == var1.serverPacket) { // L: 7999
					class332.friendSystem.method1901(); // L: 8000
					field704 = cycleCntr; // L: 8001
					var1.serverPacket = null; // L: 8002
					return true; // L: 8003
				}

				if (ServerPacket.field3388 == var1.serverPacket) { // L: 8005
					class353.updateNpcs(false, var3); // L: 8006
					var1.serverPacket = null; // L: 8007
					return true; // L: 8008
				}

				if (ServerPacket.field3340 == var1.serverPacket) { // L: 8010
					WallObject.method5888(class309.field3273); // L: 8011
					var1.serverPacket = null; // L: 8012
					return true; // L: 8013
				}

				if (ServerPacket.field3308 == var1.serverPacket) { // L: 8015
					var71 = var3.readBoolean(); // L: 8016
					if (var71) { // L: 8017
						if (Varps.field3599 == null) { // L: 8018
							Varps.field3599 = new class385();
						}
					} else {
						Varps.field3599 = null; // L: 8020
					}

					var1.serverPacket = null; // L: 8021
					return true; // L: 8022
				}

				if (ServerPacket.field3360 == var1.serverPacket) { // L: 8024
					if (rootInterface != -1) { // L: 8025
						WorldMapScaleHandler.method5149(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 8026
					return true; // L: 8027
				}

				if (ServerPacket.field3407 == var1.serverPacket) { // L: 8029
					class467.loadRegions(true, var1.packetBuffer); // L: 8030
					var1.serverPacket = null; // L: 8031
					return true; // L: 8032
				}

				if (ServerPacket.field3408 == var1.serverPacket) { // L: 8034
					class332.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 8035
					Varps.FriendSystem_invalidateIgnoreds(); // L: 8036
					field704 = cycleCntr; // L: 8037
					var1.serverPacket = null; // L: 8038
					return true; // L: 8039
				}

				if (ServerPacket.field3291 == var1.serverPacket) { // L: 8041
					WallObject.method5888(class309.field3263); // L: 8042
					var1.serverPacket = null; // L: 8043
					return true; // L: 8044
				}

				if (ServerPacket.field3353 == var1.serverPacket) { // L: 8046
					var20 = var3.readInt(); // L: 8047
					var5 = var3.readInt(); // L: 8048
					var6 = KitDefinition.getGcDuration(); // L: 8049
					PacketBufferNode var79 = class482.getPacketBufferNode(ClientPacket.field3186, packetWriter.isaacCipher); // L: 8051
					var79.packetBuffer.method9483(GameEngine.fps); // L: 8052
					var79.packetBuffer.method9483(var6); // L: 8053
					var79.packetBuffer.method9439(var20); // L: 8054
					var79.packetBuffer.method9437(var5); // L: 8055
					packetWriter.addNode(var79); // L: 8056
					var1.serverPacket = null; // L: 8057
					return true; // L: 8058
				}

				if (ServerPacket.field3378 == var1.serverPacket) { // L: 8060
					var50 = var3.readStringCp1252NullTerminated(); // L: 8061
					Object[] var72 = new Object[var50.length() + 1]; // L: 8062

					for (var6 = var50.length() - 1; var6 >= 0; --var6) { // L: 8063
						if (var50.charAt(var6) == 's') { // L: 8064
							var72[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var72[var6 + 1] = new Integer(var3.readInt()); // L: 8065
						}
					}

					var72[0] = new Integer(var3.readInt()); // L: 8067
					ScriptEvent var22 = new ScriptEvent(); // L: 8068
					var22.args = var72; // L: 8069
					WorldMapSectionType.runScriptEvent(var22); // L: 8070
					var1.serverPacket = null; // L: 8071
					return true; // L: 8072
				}

				if (ServerPacket.field3306 == var1.serverPacket) { // L: 8074
					var6 = var3.method9419(); // L: 8078
					var5 = var3.method9430(); // L: 8079
					var20 = var3.method9398(); // L: 8080
					if (var5 == 65535) { // L: 8081
						var5 = -1; // L: 8082
					}

					NPC var24 = npcs[var20]; // L: 8084
					if (var24 != null) { // L: 8085
						if (var5 == var24.sequence && var5 != -1) { // L: 8086
							var23 = class9.SequenceDefinition_get(var5).field2246; // L: 8087
							if (var23 == 1) { // L: 8088
								var24.sequenceFrame = 0; // L: 8089
								var24.sequenceFrameCycle = 0; // L: 8090
								var24.sequenceDelay = var6; // L: 8091
								var24.field1220 = 0; // L: 8092
							} else if (var23 == 2) { // L: 8094
								var24.field1220 = 0; // L: 8095
							}
						} else if (var5 == -1 || var24.sequence == -1 || class9.SequenceDefinition_get(var5).field2220 >= class9.SequenceDefinition_get(var24.sequence).field2220) { // L: 8098
							var24.sequence = var5; // L: 8099
							var24.sequenceFrame = 0; // L: 8100
							var24.sequenceFrameCycle = 0; // L: 8101
							var24.sequenceDelay = var6; // L: 8102
							var24.field1220 = 0; // L: 8103
							var24.field1215 = var24.pathLength; // L: 8104
						}
					}

					var1.serverPacket = null; // L: 8108
					return true; // L: 8109
				}

				if (ServerPacket.field3374 == var1.serverPacket) { // L: 8111
					WallObject.method5888(class309.field3265); // L: 8112
					var1.serverPacket = null; // L: 8113
					return true; // L: 8114
				}

				class368.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1411 != null ? var1.field1411.id : -1) + "," + (var1.field1407 != null ? var1.field1407.id : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 8116
				class189.method3780(); // L: 8117
			} catch (IOException var48) { // L: 8119
				Messages.method2849(); // L: 8120
			} catch (Exception var49) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1411 != null ? var1.field1411.id : -1) + "," + (var1.field1407 != null ? var1.field1407.id : -1) + "," + var1.serverPacketLength + "," + (class25.localPlayer.pathX[0] + HealthBarDefinition.baseX * 64) + "," + (class25.localPlayer.pathY[0] + WorldMapScaleHandler.baseY * 64) + ","; // L: 8123

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 8124
					var21 = var21 + var3.array[var6] + ",";
				}

				class368.RunException_sendStackTrace(var21, var49); // L: 8125
				class189.method3780(); // L: 8126
			}

			return true; // L: 8128
		}
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "325531729"
	)
	@Export("menu")
	final void menu() {
		class131.method3113(); // L: 9155
		if (clickedWidget == null) { // L: 9156
			int var1 = MouseHandler.MouseHandler_lastButton; // L: 9157
			int var2;
			if (isMenuOpen) { // L: 9158
				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				if (var1 != 1 && (SoundCache.mouseCam || var1 != 4)) { // L: 9159
					var2 = MouseHandler.MouseHandler_x; // L: 9160
					var3 = MouseHandler.MouseHandler_y; // L: 9161
					if (var2 < class209.menuX - 10 || var2 > class209.menuX + MusicPatchPcmStream.menuWidth + 10 || var3 < MouseRecorder.menuY - 10 || var3 > class60.menuHeight + MouseRecorder.menuY + 10) { // L: 9162
						isMenuOpen = false; // L: 9163
						var4 = class209.menuX; // L: 9164
						var5 = MouseRecorder.menuY; // L: 9165
						var6 = MusicPatchPcmStream.menuWidth; // L: 9166
						var7 = class60.menuHeight; // L: 9167

						for (var8 = 0; var8 < rootWidgetCount; ++var8) { // L: 9169
							if (rootWidgetXs[var8] + rootWidgetWidths[var8] > var4 && rootWidgetXs[var8] < var4 + var6 && rootWidgetHeights[var8] + rootWidgetYs[var8] > var5 && rootWidgetYs[var8] < var7 + var5) { // L: 9170
								field720[var8] = true;
							}
						}
					}
				}

				if (var1 == 1 || !SoundCache.mouseCam && var1 == 4) { // L: 9175
					var2 = class209.menuX; // L: 9176
					var3 = MouseRecorder.menuY; // L: 9177
					var4 = MusicPatchPcmStream.menuWidth; // L: 9178
					var5 = MouseHandler.MouseHandler_lastPressedX; // L: 9179
					var6 = MouseHandler.MouseHandler_lastPressedY; // L: 9180
					var7 = -1; // L: 9181

					int var9;
					for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 9182
						var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 9183
						if (var5 > var2 && var5 < var2 + var4 && var6 > var9 - 13 && var6 < var9 + 3) { // L: 9184
							var7 = var8;
						}
					}

					if (var7 != -1) { // L: 9186
						NPCComposition.method3719(var7);
					}

					isMenuOpen = false; // L: 9187
					var8 = class209.menuX; // L: 9188
					var9 = MouseRecorder.menuY; // L: 9189
					int var10 = MusicPatchPcmStream.menuWidth; // L: 9190
					int var11 = class60.menuHeight; // L: 9191

					for (int var12 = 0; var12 < rootWidgetCount; ++var12) { // L: 9193
						if (rootWidgetXs[var12] + rootWidgetWidths[var12] > var8 && rootWidgetXs[var12] < var8 + var10 && rootWidgetHeights[var12] + rootWidgetYs[var12] > var9 && rootWidgetYs[var12] < var11 + var9) { // L: 9194
							field720[var12] = true;
						}
					}
				}
			} else {
				var2 = menuOptionsCount - 1; // L: 9202
				if ((var1 == 1 || !SoundCache.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) { // L: 9205 9206
					var1 = 2; // L: 9207
				}

				if ((var1 == 1 || !SoundCache.mouseCam && var1 == 4) && menuOptionsCount > 0) { // L: 9210
					NPCComposition.method3719(var2); // L: 9211
				}

				if (var1 == 2 && menuOptionsCount > 0) { // L: 9213
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	} // L: 9215

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1123266317"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1; // L: 9220
		boolean var3 = field645 && menuOptionsCount > 2; // L: 9223
		if (!var3) { // L: 9224
			boolean var4;
			if (var1 < 0) { // L: 9227
				var4 = false; // L: 9228
			} else {
				int var5 = menuOpcodes[var1]; // L: 9231
				if (var5 >= 2000) { // L: 9232
					var5 -= 2000;
				}

				if (var5 == 1007) { // L: 9233
					var4 = true; // L: 9234
				} else {
					var4 = false; // L: 9237
				}
			}

			var3 = var4; // L: 9239
		}

		return var3 && !menuShiftClick[var1]; // L: 9241
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		int var3 = class90.fontBold12.stringWidth("Choose Option"); // L: 9246

		int var4;
		int var5;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) { // L: 9247
			var5 = class90.fontBold12.stringWidth(class195.method3836(var4)); // L: 9248
			if (var5 > var3) { // L: 9249
				var3 = var5;
			}
		}

		var3 += 8; // L: 9251
		var4 = menuOptionsCount * 15 + 22; // L: 9252
		var5 = var1 - var3 / 2; // L: 9253
		if (var3 + var5 > class524.canvasWidth) { // L: 9254
			var5 = class524.canvasWidth - var3;
		}

		if (var5 < 0) { // L: 9255
			var5 = 0;
		}

		int var6 = var2; // L: 9256
		if (var2 + var4 > GameEngine.canvasHeight) { // L: 9257
			var6 = GameEngine.canvasHeight - var4;
		}

		if (var6 < 0) { // L: 9258
			var6 = 0;
		}

		class209.menuX = var5; // L: 9259
		MouseRecorder.menuY = var6; // L: 9260
		MusicPatchPcmStream.menuWidth = var3; // L: 9261
		class60.menuHeight = menuOptionsCount * 15 + 22; // L: 9262
		var1 -= viewportOffsetX; // L: 9264
		var2 -= viewportOffsetY; // L: 9265
		GrandExchangeOfferOwnWorldComparator.scene.menuOpen(class113.Client_plane, var1, var2, false); // L: 9266
		isMenuOpen = true; // L: 9267
	} // L: 9268

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-402233070"
	)
	final void method1280(boolean var1) {
		int var2 = rootInterface; // L: 10975
		int var3 = class524.canvasWidth; // L: 10976
		int var4 = GameEngine.canvasHeight; // L: 10977
		if (class380.field4414.method6357(var2)) { // L: 10979
			class428.resizeInterface(class380.field4414.field3610[var2], -1, var3, var4, var1); // L: 10980
		}

	} // L: 10982

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(Lnn;B)V",
		garbageValue = "7"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class380.field4414.method6348(var1.parentId); // L: 10985
		int var3;
		int var4;
		if (var2 == null) { // L: 10988
			var3 = class524.canvasWidth; // L: 10989
			var4 = GameEngine.canvasHeight; // L: 10990
		} else {
			var3 = var2.width; // L: 10993
			var4 = var2.height; // L: 10994
		}

		class418.alignWidgetSize(var1, var3, var4, false); // L: 10996
		WorldMapID.alignWidgetPosition(var1, var3, var4); // L: 10997
	} // L: 10998

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	final void method1282() {
		FaceNormal.invalidateWidget(clickedWidget); // L: 11888
		++class10.widgetDragDuration; // L: 11889
		int var1;
		int var2;
		if (field714 && field739) { // L: 11890
			var1 = MouseHandler.MouseHandler_x; // L: 11909
			var2 = MouseHandler.MouseHandler_y; // L: 11910
			var1 -= widgetClickX; // L: 11911
			var2 -= widgetClickY; // L: 11912
			if (var1 < field688) { // L: 11913
				var1 = field688;
			}

			if (var1 + clickedWidget.width > field688 + clickedWidgetParent.width) { // L: 11914
				var1 = field688 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field689) { // L: 11915
				var2 = field689;
			}

			if (var2 + clickedWidget.height > field689 + clickedWidgetParent.height) { // L: 11916
				var2 = field689 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field719; // L: 11917
			int var4 = var2 - field692; // L: 11918
			int var5 = clickedWidget.dragZoneSize; // L: 11919
			if (class10.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 11920 11921
				isDraggingWidget = true; // L: 11922
			}

			int var6 = var1 - field688 + clickedWidgetParent.scrollX; // L: 11925
			int var7 = var2 - field689 + clickedWidgetParent.scrollY; // L: 11926
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 11927
				var8 = new ScriptEvent(); // L: 11928
				var8.widget = clickedWidget; // L: 11929
				var8.mouseX = var6; // L: 11930
				var8.mouseY = var7; // L: 11931
				var8.args = clickedWidget.onDrag; // L: 11932
				WorldMapSectionType.runScriptEvent(var8); // L: 11933
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 11935
				if (isDraggingWidget) { // L: 11936
					if (clickedWidget.onDragComplete != null) { // L: 11937
						var8 = new ScriptEvent(); // L: 11938
						var8.widget = clickedWidget; // L: 11939
						var8.mouseX = var6; // L: 11940
						var8.mouseY = var7; // L: 11941
						var8.dragTarget = draggedOnWidget; // L: 11942
						var8.args = clickedWidget.onDragComplete; // L: 11943
						WorldMapSectionType.runScriptEvent(var8); // L: 11944
					}

					if (draggedOnWidget != null && class482.method8733(clickedWidget) != null) { // L: 11946
						PacketBufferNode var13 = class482.getPacketBufferNode(ClientPacket.field3250, packetWriter.isaacCipher); // L: 11948
						var13.packetBuffer.method9437(draggedOnWidget.id); // L: 11949
						var13.packetBuffer.method9427(clickedWidget.itemId); // L: 11950
						var13.packetBuffer.writeShort(draggedOnWidget.childIndex); // L: 11951
						var13.packetBuffer.method9373(clickedWidget.id); // L: 11952
						var13.packetBuffer.method9427(draggedOnWidget.itemId); // L: 11953
						var13.packetBuffer.method9427(clickedWidget.childIndex); // L: 11954
						packetWriter.addNode(var13); // L: 11955
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 11959
					this.openMenu(widgetClickX + field719, widgetClickY + field692); // L: 11960
				} else if (menuOptionsCount > 0) { // L: 11962
					int var11 = widgetClickX + field719; // L: 11963
					int var9 = field692 + widgetClickY; // L: 11964
					MenuAction var10 = class74.tempMenuAction; // L: 11966
					if (var10 != null) { // L: 11968
						class31.method461(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.field886, var10.field890, var10.field891, var11, var9); // L: 11969
					}

					class74.tempMenuAction = null; // L: 11972
				}

				clickedWidget = null; // L: 11976
			}

		} else {
			if (class10.widgetDragDuration > 1) { // L: 11891
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 11892
					var1 = field719 + widgetClickX; // L: 11893
					var2 = widgetClickY + field692; // L: 11894
					MenuAction var12 = class74.tempMenuAction; // L: 11896
					if (var12 != null) { // L: 11898
						class31.method461(var12.param0, var12.param1, var12.opcode, var12.identifier, var12.field886, var12.field890, var12.field891, var1, var2); // L: 11899
					}

					class74.tempMenuAction = null; // L: 11902
				}

				clickedWidget = null; // L: 11905
			}

		}
	} // L: 11907 11978

	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "(I)Lvs;",
		garbageValue = "-227041458"
	)
	@Export("username")
	public Username username() {
		return class25.localPlayer != null ? class25.localPlayer.username : null; // L: 12673
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1742661162"
	)
	void method1284(int var1) {
		PacketBufferNode var2 = class482.getPacketBufferNode(ClientPacket.field3215, packetWriter.isaacCipher); // L: 12801
		var2.packetBuffer.writeByte(var1); // L: 12802
		packetWriter.addNode(var2); // L: 12803
	} // L: 12804

	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1090419053"
	)
	void method1285(int var1) {
		PacketBufferNode var2 = class482.getPacketBufferNode(ClientPacket.field3260, packetWriter.isaacCipher); // L: 12807
		var2.packetBuffer.writeByte(var1); // L: 12808
		packetWriter.addNode(var2); // L: 12809
	} // L: 12810

	public final void init() {
		try {
			if (this.checkHost()) { // L: 765
				for (int var1 = 0; var1 <= 28; ++var1) { // L: 766
					String var2 = this.getParameter(Integer.toString(var1)); // L: 767
					if (var2 != null) { // L: 768
						int var4;
						switch(var1) { // L: 769
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 846
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 847
							}
							break;
						case 4:
							if (clientType == -1) { // L: 787
								clientType = Integer.parseInt(var2); // L: 788
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 859
							break; // L: 860
						case 6:
							var4 = Integer.parseInt(var2); // L: 812
							Language var14;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) { // L: 814
								var14 = Language.Language_valuesOrdered[var4]; // L: 818
							} else {
								var14 = null; // L: 815
							}

							class92.clientLanguage = var14; // L: 820
							break; // L: 821
						case 7:
							var4 = Integer.parseInt(var2); // L: 870
							GameBuild[] var5 = new GameBuild[]{GameBuild.BUILDLIVE, GameBuild.WIP, GameBuild.RC, GameBuild.LIVE}; // L: 875
							GameBuild[] var6 = var5; // L: 877
							int var7 = 0;

							GameBuild var9;
							while (true) {
								if (var7 >= var6.length) {
									var9 = null; // L: 888
									break;
								}

								GameBuild var8 = var6[var7]; // L: 879
								if (var4 == var8.buildId) { // L: 881
									var9 = var8; // L: 882
									break; // L: 883
								}

								++var7; // L: 878
							}

							KeyHandler.field153 = var9; // L: 890
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 825
							}
							break;
						case 9:
							class426.field4608 = var2; // L: 806
							break; // L: 807
						case 10:
							class1.field3 = (StudioGame)GrandExchangeEvents.findEnumerated(Projectile.method2222(), Integer.parseInt(var2)); // L: 852
							if (StudioGame.oldscape == class1.field3) { // L: 853
								UserComparator10.loginType = LoginType.oldscape;
							} else {
								UserComparator10.loginType = LoginType.field5070; // L: 854
							}
							break;
						case 11:
							class424.field4605 = var2; // L: 777
							break; // L: 778
						case 12:
							worldId = Integer.parseInt(var2); // L: 864
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						case 23:
						case 24:
						default:
							break;
						case 14:
							WorldMapData_0.field2467 = Integer.parseInt(var2); // L: 831
							break; // L: 832
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 836
							break; // L: 837
						case 17:
							PacketWriter.field1412 = var2; // L: 772
							break; // L: 773
						case 21:
							field503 = Integer.parseInt(var2); // L: 782
							break; // L: 783
						case 22:
							class148.field1665 = var2; // L: 841
							break; // L: 842
						case 25:
							int var3 = var2.indexOf("."); // L: 794
							if (var3 == -1) { // L: 795
								Integer.parseInt(var2); // L: 796
							} else {
								Integer.parseInt(var2.substring(0, var3)); // L: 799
								Integer.parseInt(var2.substring(var3 + 1)); // L: 800
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false; // L: 897
				isLowDetail = false; // L: 898
				InvDefinition.worldHost = this.getCodeBase().getHost(); // L: 900
				UrlRequester.field1418 = new class375(); // L: 901
				String var10 = KeyHandler.field153.name; // L: 902
				byte var11 = 0; // L: 903
				if ((worldProperties & class526.field5160.rsOrdinal()) != 0) { // L: 904
					WorldMapCacheName.field2676 = "beta"; // L: 905
				}

				try {
					HealthBarUpdate.method2495("oldschool", WorldMapCacheName.field2676, var10, var11, 23); // L: 908
				} catch (Exception var12) { // L: 910
					class368.RunException_sendStackTrace((String)null, var12); // L: 911
				}

				VertexNormal.client = this; // L: 913
				class317.field3442 = clientType; // L: 914
				class33.method489(); // L: 915
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) { // L: 916
					this.field539 = true; // L: 917
				}

				if (field667 == -1) { // L: 919
					if (!this.method1791() && !this.method1257()) { // L: 920
						field667 = 0; // L: 924
					} else {
						field667 = 5; // L: 921
					}
				}

				this.startThread(765, 503, 219, 1); // L: 927
			}
		} catch (RuntimeException var13) {
			throw UserComparator5.newRunException(var13, "client.init(" + ')');
		}
	} // L: 928

	protected void finalize() throws Throwable {
		class319.field3463.remove(this); // L: 934
		super.finalize(); // L: 936
	} // L: 937

	public void setClient(int var1) {
		this.field561 = var1; // L: 957
	} // L: 958

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 963
			this.field756 = var1; // L: 966
			Actor.method2489(10); // L: 967
		}
	} // L: 964 968

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 982
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 973
			this.field546 = var1; // L: 976
		}
	} // L: 974 977

	public long getAccountHash() {
		return this.accountHash; // L: 987
	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "17"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class482.getPacketBufferNode(ClientPacket.field3217, packetWriter.isaacCipher); // L: 12494
		var0.packetBuffer.writeByte(0); // L: 12495
		packetWriter.addNode(var0); // L: 12496
	} // L: 12497
}
