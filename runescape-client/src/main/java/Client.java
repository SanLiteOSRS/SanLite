import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONException;
import org.json.JSONObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class311 {
	@ObfuscatedName("vg")
	@ObfuscatedGetter(
		intValue = -1429754309
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vf")
	@ObfuscatedGetter(
		intValue = 761567857
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("wp")
	@ObfuscatedGetter(
		intValue = 31900859
	)
	public static int field673;
	@ObfuscatedName("xb")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	static final ApproximateRouteStrategy field798;
	@ObfuscatedName("xv")
	static int[] field799;
	@ObfuscatedName("xi")
	static int[] field800;
	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("wn")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wb")
	@ObfuscatedGetter(
		intValue = -2055989087
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("vj")
	@ObfuscatedGetter(
		intValue = -1530969261
	)
	static int field783;
	@ObfuscatedName("vv")
	@ObfuscatedGetter(
		intValue = -1738560437
	)
	static int field784;
	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("vo")
	static boolean[] field764;
	@ObfuscatedName("wu")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("ve")
	static int[] field765;
	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static class475 field780;
	@ObfuscatedName("vu")
	static int[] field766;
	@ObfuscatedName("vz")
	static int[] field767;
	@ObfuscatedName("vc")
	static int[] field768;
	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("archive5")
	static class423 archive5;
	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "[Log;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("va")
	static short field769;
	@ObfuscatedName("vs")
	static short field585;
	@ObfuscatedName("vt")
	static short field775;
	@ObfuscatedName("vr")
	static short field542;
	@ObfuscatedName("vx")
	static short field774;
	@ObfuscatedName("vy")
	@ObfuscatedGetter(
		intValue = 912379377
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vd")
	static short field612;
	@ObfuscatedName("vl")
	@ObfuscatedGetter(
		intValue = 2128161545
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("ww")
	@ObfuscatedGetter(
		intValue = -966150477
	)
	static int field797;
	@ObfuscatedName("vb")
	@ObfuscatedGetter(
		intValue = 1516828617
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vq")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vw")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("wd")
	@ObfuscatedGetter(
		intValue = 92795101
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wq")
	@ObfuscatedGetter(
		intValue = -107924385
	)
	static int field791;
	@ObfuscatedName("wt")
	static List field725;
	@ObfuscatedName("bs")
	static boolean field556;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1918006373
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 327497189
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1484967961
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cm")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("co")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -418818289
	)
	static int field503;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 603263215
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1978824473
	)
	static int field583;
	@ObfuscatedName("cn")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -324361801
	)
	public static int field507;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -974064505
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dp")
	static boolean field509;
	@ObfuscatedName("el")
	static boolean field510;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = 822116987
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		longValue = -1940242485060517469L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = -142983411
	)
	static int field513;
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		intValue = -1457639239
	)
	static int field567;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		longValue = 2576260329691304481L
	)
	static long field561;
	@ObfuscatedName("eu")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = -760191753
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = -1921147809
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 1559253297
	)
	static int field674;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = 93329235
	)
	static int field523;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = 1916219575
	)
	static int field521;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = 811273125
	)
	static int field522;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = -1740013462
	)
	static int field624;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = -545713216
	)
	static int field587;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = 730697152
	)
	static int field731;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("eh")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static class92 field530;
	@ObfuscatedName("fm")
	@ObfuscatedGetter(
		intValue = -2067768775
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = -1804555211
	)
	static int field501;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = -1829432747
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = 1631711209
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = 2039260419
	)
	static int field535;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = 626819821
	)
	static int field531;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = 1621212373
	)
	static int field537;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	static class140 field538;
	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	static class517 field539;
	@ObfuscatedName("hp")
	static final String field729;
	@ObfuscatedName("hk")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("iv")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "[Ldo;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = -491271479
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ia")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = 1321565807
	)
	static int field559;
	@ObfuscatedName("iq")
	static int[] field560;
	@ObfuscatedName("it")
	static String field661;
	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = 1135542461
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("iu")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("ir")
	static HashMap field565;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = -109674331
	)
	static int field566;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = 615832733
	)
	static int field511;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = 1346664711
	)
	static int field568;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = -356408075
	)
	static int field569;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = 134460991
	)
	static int field570;
	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "[Lig;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("jl")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("ji")
	static int[][][] field573;
	@ObfuscatedName("jm")
	static final int[] field713;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = -883082495
	)
	static int field578;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = 1602612009
	)
	static int field576;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = -1396388751
	)
	static int field529;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = 1434839353
	)
	static int field641;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = 855331065
	)
	static int field579;
	@ObfuscatedName("kd")
	static boolean field580;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = 1202955135
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = -947350499
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = 263806833
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = -320999423
	)
	static int field499;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -1107140451
	)
	static int field668;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 586808879
	)
	static int field586;
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = 87122201
	)
	static int field620;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = -1022753123
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = -1567349339
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = -674985477
	)
	static int field590;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = 2084649017
	)
	static int field591;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = -1410915435
	)
	static int field592;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = 922989865
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = -1753269489
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = 257681083
	)
	public static int field595;
	@ObfuscatedName("lw")
	static boolean field596;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = -1652234877
	)
	static int field651;
	@ObfuscatedName("lo")
	static boolean field598;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 2062019933
	)
	static int field599;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = 1807195729
	)
	static int field600;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 1990208311
	)
	static int field526;
	@ObfuscatedName("lv")
	static int[] field593;
	@ObfuscatedName("lx")
	static int[] field547;
	@ObfuscatedName("lj")
	static int[] field604;
	@ObfuscatedName("lp")
	static int[] field633;
	@ObfuscatedName("lk")
	static int[] field520;
	@ObfuscatedName("ml")
	static int[] field549;
	@ObfuscatedName("mc")
	static int[][] field608;
	@ObfuscatedName("mb")
	static int[] field609;
	@ObfuscatedName("mh")
	static String[] field610;
	@ObfuscatedName("mj")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = 631317555
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -1858741955
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = -1868279079
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = -8058393
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = 292977121
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = -2120311191
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 1335749841
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("ms")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = -1934402659
	)
	static int field727;
	@ObfuscatedName("my")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "[Ldh;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = 1658368301
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = 1546967103
	)
	static int field671;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		longValue = 1795023102600310665L
	)
	static long field675;
	@ObfuscatedName("mu")
	static boolean field626;
	@ObfuscatedName("nk")
	@ObfuscatedGetter(
		intValue = -935153251
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = 783527243
	)
	static int field628;
	@ObfuscatedName("nd")
	static int[] field629;
	@ObfuscatedName("nc")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("nn")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("nx")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("nj")
	static int[] field755;
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		intValue = 1271624285
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "[[[Loq;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("nm")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("ni")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("ny")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("ng")
	static boolean field642;
	@ObfuscatedName("nz")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = 1700517493
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("od")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("oz")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("ox")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("og")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("or")
	static int[] field663;
	@ObfuscatedName("oo")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ou")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("oi")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("om")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ow")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("oe")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = -609059843
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = 1052331749
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = 1825844403
	)
	static int field658;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = -1634254079
	)
	static int field659;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = -2075988725
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("oj")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = 1495183089
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = -1042145481
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("ph")
	static String field665;
	@ObfuscatedName("pe")
	static String field666;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = -2099161975
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = 784635413
	)
	static int field669;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = 968382297
	)
	static int field557;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = 1412938237
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = -1704337685
	)
	static int field723;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = -562339561
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = -1641942231
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = 1363205073
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("ps")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -1253855867
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = -2087407567
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("pk")
	static boolean field684;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = -1900047813
	)
	static int field685;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = 725010099
	)
	static int field776;
	@ObfuscatedName("qs")
	static boolean field687;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = -659684997
	)
	static int field688;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = -1067731977
	)
	static int field614;
	@ObfuscatedName("qb")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = 506672061
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qm")
	static int[] field692;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = -774978573
	)
	static int field693;
	@ObfuscatedName("qc")
	static int[] field575;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = -2032015837
	)
	static int field695;
	@ObfuscatedName("qz")
	static int[] field794;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = 615491677
	)
	static int field697;
	@ObfuscatedName("qk")
	static int[] field545;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = 1600920581
	)
	static int field700;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = -1161322213
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = -1153760911
	)
	static int field701;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = 1151983573
	)
	static int field702;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = -1254831701
	)
	static int field617;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = 1988837229
	)
	static int field694;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = 1385873187
	)
	static int field705;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = -1942672887
	)
	static int field706;
	@ObfuscatedName("rw")
	@ObfuscatedGetter(
		intValue = -1876359761
	)
	static int field707;
	@ObfuscatedName("ro")
	@ObfuscatedGetter(
		intValue = -1873790059
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	static class530 field709;
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("rq")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	static NodeDeque field711;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	static NodeDeque field712;
	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	static NodeDeque field584;
	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rb")
	@ObfuscatedGetter(
		intValue = 1632419329
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = -703104953
	)
	static int field603;
	@ObfuscatedName("rx")
	static boolean[] field717;
	@ObfuscatedName("rv")
	static boolean[] field718;
	@ObfuscatedName("ra")
	static boolean[] field719;
	@ObfuscatedName("rj")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("ru")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("rn")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("rt")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = 2107410481
	)
	static int field724;
	@ObfuscatedName("rs")
	@ObfuscatedGetter(
		longValue = 784145948672276399L
	)
	static long field602;
	@ObfuscatedName("rf")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("so")
	static int[] field533;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = -493079317
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		intValue = 974457487
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sb")
	static String field730;
	@ObfuscatedName("sx")
	static long[] field508;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = -1396759783
	)
	static int field732;
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	static class212 field519;
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	static class210 field734;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = -1584205423
	)
	static int field735;
	@ObfuscatedName("sr")
	static int[] field736;
	@ObfuscatedName("sw")
	static int[] field737;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		longValue = -8224158248985110697L
	)
	static long field738;
	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "[Lfn;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "[Lgb;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		intValue = -1833631993
	)
	static int field625;
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = 1047246899
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("tx")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("tj")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("tv")
	@ObfuscatedSignature(
		descriptor = "[Luq;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("ts")
	@ObfuscatedGetter(
		intValue = 2020285203
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = -2078571967
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("to")
	@ObfuscatedGetter(
		intValue = 707155171
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tb")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("tr")
	@ObfuscatedGetter(
		intValue = -1127836015
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("tg")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("tp")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("ta")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("tz")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "[Lbh;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("us")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("uk")
	static boolean field779;
	@ObfuscatedName("uc")
	static boolean field758;
	@ObfuscatedName("ua")
	static boolean field759;
	@ObfuscatedName("ur")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	static class479 field760;
	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	static class478 field761;
	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	static class478 field762;
	@ObfuscatedName("uy")
	static boolean field763;
	@ObfuscatedName("gy")
	String field540;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	class14 field541;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	class18 field770;
	@ObfuscatedName("hd")
	OtlTokenRequester field543;
	@ObfuscatedName("hq")
	Future field606;
	@ObfuscatedName("ho")
	boolean field635;
	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	class18 field546;
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field698;
	@ObfuscatedName("hi")
	Future field548;
	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	Buffer field552;
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	class7 field553;
	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		longValue = 2141317384723278023L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field556 = true; // L: 163
		worldId = 1; // L: 164
		worldProperties = 0; // L: 165
		gameBuild = 0; // L: 167
		isMembersWorld = false; // L: 170
		isLowDetail = false; // L: 171
		field503 = -1; // L: 176
		clientType = -1; // L: 177
		field583 = -1; // L: 178
		onMobile = false; // L: 179
		field507 = 215; // L: 180
		gameState = 0; // L: 192
		field509 = false; // L: 193
		field510 = true; // L: 217
		cycle = 0; // L: 218
		mouseLastLastPressedTimeMillis = 1L; // L: 219
		field513 = -1; // L: 221
		field567 = -1; // L: 222
		field561 = -1L; // L: 223
		hadFocus = true; // L: 224
		rebootTimer = 0; // L: 225
		hintArrowType = 0; // L: 226
		field674 = 0; // L: 227
		field523 = 0; // L: 228
		field521 = 0; // L: 229
		field522 = 0; // L: 230
		field624 = 0; // L: 231
		field587 = 0; // L: 232
		field731 = 0; // L: 233
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 235
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 236
		renderSelf = false; // L: 237
		field530 = class92.field1153; // L: 246
		js5ConnectState = 0; // L: 249
		field501 = 0; // L: 250
		js5Errors = 0; // L: 273
		loginState = 0; // L: 275
		field535 = 0; // L: 276
		field531 = 0; // L: 277
		field537 = 0; // L: 278
		field538 = class140.field1630; // L: 279
		field539 = class517.field5122; // L: 280
		int var1 = "com_jagex_auth_desktop_osrs:public".length(); // L: 307
		byte[] var2 = new byte[var1]; // L: 308

		for (int var3 = 0; var3 < var1; ++var3) { // L: 309
			char var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3); // L: 310
			if (var4 > 127) { // L: 311
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 312
			}
		}

		String var5 = Clock.method3656(var2, 0, var2.length); // L: 318
		field729 = var5; // L: 320
		Login_isUsernameRemembered = false; // L: 335
		secureRandomFuture = new SecureRandomFuture(); // L: 336
		randomDatData = null; // L: 342
		npcs = new NPC[65536]; // L: 346
		npcCount = 0; // L: 347
		npcIndices = new int[65536]; // L: 348
		field559 = 0; // L: 349
		field560 = new int[250]; // L: 350
		packetWriter = new PacketWriter(); // L: 353
		logoutTimer = 0; // L: 355
		hadNetworkError = false; // L: 356
		timer = new Timer(); // L: 357
		field565 = new HashMap(); // L: 363
		field566 = 0; // L: 370
		field511 = 1; // L: 371
		field568 = 0; // L: 372
		field569 = 1; // L: 373
		field570 = 0; // L: 374
		collisionMaps = new CollisionMap[4]; // L: 382
		isInInstance = false; // L: 383
		field573 = new int[4][13][13]; // L: 384
		field713 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 385
		field578 = 0; // L: 388
		field576 = 2301979; // L: 400
		field529 = 5063219; // L: 401
		field641 = 3353893; // L: 402
		field579 = 7759444; // L: 403
		field580 = false; // L: 404
		alternativeScrollbarWidth = 0; // L: 405
		camAngleX = 128; // L: 413
		camAngleY = 0; // L: 414
		field499 = 0; // L: 415
		field668 = 0; // L: 416
		field586 = 0; // L: 417
		field620 = 0; // L: 418
		oculusOrbState = 0; // L: 419
		camFollowHeight = 50; // L: 420
		field590 = 0; // L: 424
		field591 = 0; // L: 425
		field592 = 0; // L: 426
		oculusOrbNormalSpeed = 12; // L: 428
		oculusOrbSlowedSpeed = 6; // L: 429
		field595 = 0; // L: 430
		field596 = false; // L: 431
		field651 = 0; // L: 432
		field598 = false; // L: 433
		field599 = 0; // L: 434
		field600 = 0; // L: 435
		field526 = 50; // L: 436
		field593 = new int[field526]; // L: 437
		field547 = new int[field526]; // L: 438
		field604 = new int[field526]; // L: 439
		field633 = new int[field526]; // L: 440
		field520 = new int[field526]; // L: 441
		field549 = new int[field526]; // L: 442
		field608 = new int[field526][]; // L: 443
		field609 = new int[field526]; // L: 444
		field610 = new String[field526]; // L: 445
		tileLastDrawnActor = new int[104][104]; // L: 446
		viewportDrawCount = 0; // L: 447
		viewportTempX = -1; // L: 448
		viewportTempY = -1; // L: 449
		mouseCrossX = 0; // L: 450
		mouseCrossY = 0; // L: 451
		mouseCrossState = 0; // L: 452
		mouseCrossColor = 0; // L: 453
		showMouseCross = true; // L: 454
		field727 = 0; // L: 455
		showLoadingMessages = true; // L: 457
		players = new Player[2048]; // L: 459
		localPlayerIndex = -1; // L: 461
		field671 = 0; // L: 462
		field675 = -1L; // L: 463
		field626 = true; // L: 465
		drawPlayerNames = 0; // L: 470
		field628 = 0; // L: 471
		field629 = new int[1000]; // L: 472
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 474
		playerMenuActions = new String[8]; // L: 475
		playerOptionsPriorities = new boolean[8]; // L: 476
		field755 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 477
		combatTargetPlayerIndex = -1; // L: 478
		groundItems = new NodeDeque[4][104][104]; // L: 479
		pendingSpawns = new NodeDeque(); // L: 480
		projectiles = new NodeDeque(); // L: 481
		graphicsObjects = new NodeDeque(); // L: 482
		currentLevels = new int[25]; // L: 483
		levels = new int[25]; // L: 484
		experience = new int[25]; // L: 485
		field642 = false; // L: 486
		isMenuOpen = false; // L: 487
		menuOptionsCount = 0; // L: 493
		menuArguments1 = new int[500]; // L: 494
		menuArguments2 = new int[500]; // L: 495
		menuOpcodes = new int[500]; // L: 496
		menuIdentifiers = new int[500]; // L: 497
		field663 = new int[500]; // L: 498
		menuActions = new String[500]; // L: 499
		menuTargets = new String[500]; // L: 500
		menuShiftClick = new boolean[500]; // L: 501
		followerOpsLowPriority = false; // L: 502
		tapToDrop = false; // L: 504
		showMouseOverText = true; // L: 505
		viewportX = -1; // L: 506
		viewportY = -1; // L: 507
		field658 = 0; // L: 511
		field659 = 50; // L: 512
		isItemSelected = 0; // L: 513
		field661 = null; // L: 517
		isSpellSelected = false; // L: 518
		selectedSpellChildIndex = -1; // L: 520
		selectedSpellItemId = -1; // L: 521
		field665 = null; // L: 523
		field666 = null; // L: 524
		rootInterface = -1; // L: 525
		interfaceParents = new NodeHashTable(8); // L: 526
		field669 = 0; // L: 531
		field557 = -1; // L: 532
		chatEffects = 0; // L: 533
		meslayerContinueWidget = null; // L: 534
		field723 = 0; // L: 535
		weight = 0; // L: 536
		staffModLevel = 0; // L: 537
		followerIndex = -1; // L: 538
		playerMod = false; // L: 539
		viewportWidget = null; // L: 540
		clickedWidget = null; // L: 541
		clickedWidgetParent = null; // L: 542
		widgetClickX = 0; // L: 543
		widgetClickY = 0; // L: 544
		draggedOnWidget = null; // L: 545
		field684 = false; // L: 546
		field685 = -1; // L: 547
		field776 = -1; // L: 548
		field687 = false; // L: 549
		field688 = -1; // L: 550
		field614 = -1; // L: 551
		isDraggingWidget = false; // L: 552
		cycleCntr = 1; // L: 557
		field692 = new int[32]; // L: 560
		field693 = 0; // L: 561
		field575 = new int[32]; // L: 562
		field695 = 0; // L: 563
		field794 = new int[32]; // L: 564
		field697 = 0; // L: 565
		field545 = new int[32]; // L: 566
		field700 = 0; // L: 567
		chatCycle = 0; // L: 568
		field701 = 0; // L: 569
		field702 = 0; // L: 570
		field617 = 0; // L: 571
		field694 = 0; // L: 572
		field705 = 0; // L: 573
		field706 = 0; // L: 574
		field707 = 0; // L: 575
		mouseWheelRotation = 0; // L: 581
		field709 = new class530(); // L: 582
		scriptEvents = new NodeDeque(); // L: 583
		field711 = new NodeDeque(); // L: 584
		field712 = new NodeDeque(); // L: 585
		field584 = new NodeDeque(); // L: 586
		widgetFlags = new NodeHashTable(512); // L: 587
		rootWidgetCount = 0; // L: 589
		field603 = -2; // L: 590
		field717 = new boolean[100]; // L: 591
		field718 = new boolean[100]; // L: 592
		field719 = new boolean[100]; // L: 593
		rootWidgetXs = new int[100]; // L: 594
		rootWidgetYs = new int[100]; // L: 595
		rootWidgetWidths = new int[100]; // L: 596
		rootWidgetHeights = new int[100]; // L: 597
		field724 = 0; // L: 598
		field602 = 0L; // L: 599
		isResizable = true; // L: 600
		field533 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 607
		publicChatMode = 0; // L: 608
		tradeChatMode = 0; // L: 610
		field730 = ""; // L: 611
		field508 = new long[100]; // L: 613
		field732 = 0; // L: 614
		field519 = new class212(); // L: 615
		field734 = new class210(); // L: 616
		field735 = 0; // L: 618
		field736 = new int[128]; // L: 619
		field737 = new int[128]; // L: 620
		field738 = -1L; // L: 621
		currentClanSettings = new ClanSettings[4]; // L: 625
		currentClanChannels = new ClanChannel[4]; // L: 627
		field625 = -1; // L: 629
		mapIconCount = 0; // L: 630
		mapIconXs = new int[1000]; // L: 631
		mapIconYs = new int[1000]; // L: 632
		mapIcons = new SpritePixels[1000]; // L: 633
		destinationX = 0; // L: 634
		destinationY = 0; // L: 635
		minimapState = 0; // L: 642
		playingJingle = false; // L: 643
		soundEffectCount = 0; // L: 648
		soundEffectIds = new int[50]; // L: 649
		queuedSoundEffectLoops = new int[50]; // L: 650
		queuedSoundEffectDelays = new int[50]; // L: 651
		soundLocations = new int[50]; // L: 652
		soundEffects = new SoundEffect[50]; // L: 653
		isCameraLocked = false; // L: 655
		field779 = false; // L: 661
		field758 = false; // L: 662
		field759 = false; // L: 663
		field760 = null; // L: 669
		field761 = null; // L: 670
		field762 = null; // L: 671
		field763 = false; // L: 672
		field764 = new boolean[5]; // L: 680
		field765 = new int[5]; // L: 681
		field766 = new int[5]; // L: 682
		field767 = new int[5]; // L: 683
		field768 = new int[5]; // L: 684
		field769 = 256; // L: 685
		field585 = 205; // L: 686
		zoomHeight = 256; // L: 687
		zoomWidth = 320; // L: 688
		field612 = 1; // L: 689
		field774 = 32767; // L: 690
		field775 = 1; // L: 691
		field542 = 32767; // L: 692
		viewportOffsetX = 0; // L: 693
		viewportOffsetY = 0; // L: 694
		viewportWidth = 0; // L: 695
		viewportHeight = 0; // L: 696
		viewportZoom = 0; // L: 697
		playerAppearance = new PlayerComposition(); // L: 699
		field783 = -1; // L: 700
		field784 = -1; // L: 701
		field780 = new DesktopPlatformInfoProvider(); // L: 703
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 705
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 708
		archive5 = new class423(8, class421.field4591); // L: 710
		Widget_cachedModels = new EvictingDualNodeHashTable(64); // L: 712
		Widget_cachedFonts = new EvictingDualNodeHashTable(64); // L: 713
		field791 = -1; // L: 716
		field673 = -1; // L: 722
		field725 = new ArrayList(); // L: 723
		archiveLoaders = new ArrayList(10); // L: 724
		archiveLoadersDone = 0; // L: 725
		field797 = 0; // L: 726
		field798 = new ApproximateRouteStrategy(); // L: 735
		field799 = new int[50]; // L: 736
		field800 = new int[50]; // L: 737
	}

	public Client() {
		this.field635 = false; // L: 298
		this.accountHash = -1L;
	} // L: 341

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "27722679"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field602 = AttackOption.method2714() + 500L; // L: 4603
		this.resizeJS(); // L: 4604
		if (rootInterface != -1) { // L: 4605
			this.resizeRoot(true);
		}

	} // L: 4606

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-29"
	)
	@Export("setUp")
	protected final void setUp() {
		class59.method1176(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}); // L: 1025
		class502.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 1026
		GrandExchangeOfferUnitPriceComparator.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 1027
		class20.currentPort = class502.worldPort; // L: 1028
		class105.field1357 = class330.field3605; // L: 1029
		class339.field3795 = class330.field3604; // L: 1030
		class158.field1755 = class330.field3606; // L: 1031
		class238.field2690 = class330.field3607; // L: 1032
		class327.urlRequester = new class113(this.field635, 215); // L: 1033
		this.setUpKeyboard(); // L: 1034
		this.method633(); // L: 1035
		class210.mouseWheel = this.mouseWheel(); // L: 1036
		this.method573(field734, 0); // L: 1037
		this.method573(field519, 1); // L: 1038
		class419.field4580 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.field1849, 500000); // L: 1039
		AccessFile var2 = null; // L: 1042
		ClientPreferences var3 = new ClientPreferences(); // L: 1043

		try {
			var2 = class106.getPreferencesFile("", class6.field15.name, false); // L: 1045
			byte[] var4 = new byte[(int)var2.length()]; // L: 1046

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) { // L: 1047 1048 1051
				var6 = var2.read(var4, var5, var4.length - var5); // L: 1049
				if (var6 == -1) {
					throw new IOException(); // L: 1050
				}
			}

			var3 = new ClientPreferences(new Buffer(var4)); // L: 1053
		} catch (Exception var9) { // L: 1055
		}

		try {
			if (var2 != null) { // L: 1057
				var2.close(); // L: 1058
			}
		} catch (Exception var8) { // L: 1061
		}

		ScriptFrame.clientPreferences = var3; // L: 1064
		this.setUpClipboard(); // L: 1065
		String var10 = class344.field3852; // L: 1067
		class31.field162 = this; // L: 1069
		if (var10 != null) { // L: 1070
			class31.field165 = var10;
		}

		class168.setWindowedMode(ScriptFrame.clientPreferences.method2523()); // L: 1072
		class162.friendSystem = new FriendSystem(ObjectSound.loginType); // L: 1073
		this.field541 = new class14("tokenRequest", 1, 1); // L: 1074
		if (!class305.field3394.contains(this)) { // L: 1077
			class305.field3394.add(this); // L: 1078
		}

		class218.field2400 = new class216[1]; // L: 1082
		class214 var7 = class214.field2366; // L: 1083
		class218.field2400[0] = new class216(var7.field2372, var7.field2373); // L: 1084
	} // L: 1086

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1045860694"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 1094
		this.doCycleJs5(); // L: 1095
		class200.method3929(); // L: 1096
		int var2 = cycle; // L: 1098
		boolean var3 = false; // L: 1100
		boolean var4 = false; // L: 1101
		if (!class305.field3393.isEmpty()) { // L: 1102
			class406 var5 = (class406)class305.field3393.get(0); // L: 1103
			if (var5 == null) { // L: 1104
				class305.field3393.remove(0); // L: 1105
			} else if (var5.vmethod7648(var2)) { // L: 1107
				if (var5.method7627()) { // L: 1108
					System.out.println("Error in midimanager.service: " + var5.method7629()); // L: 1109
					var3 = true; // L: 1110
				} else {
					if (var5.method7641() != null) { // L: 1113
						class305.field3393.add(1, var5.method7641()); // L: 1114
					}

					var4 = var5.method7628(); // L: 1116
				}

				class305.field3393.remove(0); // L: 1118
			} else {
				var4 = var5.method7628(); // L: 1121
			}
		}

		if (var3) { // L: 1124
			class305.field3393.clear(); // L: 1125
			ArrayList var6 = new ArrayList(); // L: 1128
			Iterator var7 = class305.field3397.iterator(); // L: 1129

			while (var7.hasNext()) {
				class317 var8 = (class317)var7.next(); // L: 1130
				var6.add(var8); // L: 1132
			}

			class305.field3393.add(new class401((class406)null, var6)); // L: 1138
		}

		if (var4 && playingJingle && Timer.pcmPlayer1 != null) { // L: 1143 1144
			Timer.pcmPlayer1.tryDiscard();
		}

		class156.method3359(); // L: 1146
		field519.method4265(); // L: 1147
		this.method513(); // L: 1148
		WorldMapRegion.method5378(); // L: 1149
		if (class210.mouseWheel != null) { // L: 1150
			int var9 = class210.mouseWheel.useRotation(); // L: 1151
			mouseWheelRotation = var9; // L: 1152
		}

		if (gameState == 0) { // L: 1154
			ModeWhere.method7029(); // L: 1155
			LoginPacket.method5767(); // L: 1156
		} else if (gameState == 5) { // L: 1158
			Coord.method6108(this, class149.field1683, StudioGame.fontPlain12); // L: 1159
			ModeWhere.method7029(); // L: 1160
			LoginPacket.method5767(); // L: 1161
		} else if (gameState != 10 && gameState != 11) { // L: 1163
			if (gameState == 20) { // L: 1164
				Coord.method6108(this, class149.field1683, StudioGame.fontPlain12); // L: 1165
				this.doCycleLoggedOut(); // L: 1166
			} else if (gameState == 50) { // L: 1168
				Coord.method6108(this, class149.field1683, StudioGame.fontPlain12); // L: 1169
				this.doCycleLoggedOut(); // L: 1170
			} else if (gameState == 25) { // L: 1172
				Player.method2402();
			}
		} else {
			Coord.method6108(this, class149.field1683, StudioGame.fontPlain12);
		}

		if (gameState == 30) { // L: 1173
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) { // L: 1174
			this.doCycleLoggedOut();
		}

	} // L: 1175

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1812895695"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field602 && AttackOption.method2714() > field602) { // L: 1179 1180
			class168.setWindowedMode(class179.getWindowedMode()); // L: 1181
		}

		int var2;
		if (var1) { // L: 1184
			for (var2 = 0; var2 < 100; ++var2) { // L: 1185
				field717[var2] = true;
			}
		}

		if (gameState == 0) { // L: 1187
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1188
			class4.drawTitle(class290.fontBold12, class149.field1683, StudioGame.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1189
			if (gameState == 20) { // L: 1190
				class4.drawTitle(class290.fontBold12, class149.field1683, StudioGame.fontPlain12);
			} else if (gameState == 50) { // L: 1191
				class4.drawTitle(class290.fontBold12, class149.field1683, StudioGame.fontPlain12);
			} else if (gameState == 25) { // L: 1192
				if (field570 == 1) { // L: 1193
					if (field566 > field511) { // L: 1194
						field511 = field566;
					}

					var2 = (field511 * 50 - field566 * 50) / field511; // L: 1195
					FontName.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false); // L: 1196
				} else if (field570 == 2) { // L: 1198
					if (field568 > field569) { // L: 1199
						field569 = field568;
					}

					var2 = (field569 * 50 - field568 * 50) / field569 + 50; // L: 1200
					FontName.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false); // L: 1201
				} else {
					FontName.drawLoadingMessage("Loading - please wait.", false); // L: 1203
				}
			} else if (gameState == 30) { // L: 1205
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1206
				FontName.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1207
				FontName.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class4.drawTitle(class290.fontBold12, class149.field1683, StudioGame.fontPlain12); // L: 1197
		}

		if (gameState == 30 && field724 == 0 && !var1 && !isResizable) { // L: 1208
			for (var2 = 0; var2 < rootWidgetCount; ++var2) { // L: 1209
				if (field718[var2]) { // L: 1210
					KitDefinition.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]); // L: 1211
					field718[var2] = false; // L: 1212
				}
			}
		} else if (gameState > 0) { // L: 1216
			KitDefinition.rasterProvider.drawFull(0, 0); // L: 1217

			for (var2 = 0; var2 < rootWidgetCount; ++var2) { // L: 1218
				field718[var2] = false;
			}
		}

	} // L: 1220

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1403354910"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class144.varcs.hasUnwrittenChanges()) { // L: 1223
			class144.varcs.write();
		}

		if (class197.mouseRecorder != null) { // L: 1224
			class197.mouseRecorder.isRunning = false;
		}

		class197.mouseRecorder = null; // L: 1225
		packetWriter.close(); // L: 1226
		if (MouseHandler.MouseHandler_instance != null) { // L: 1228
			synchronized(MouseHandler.MouseHandler_instance) { // L: 1229
				MouseHandler.MouseHandler_instance = null; // L: 1230
			} // L: 1231
		}

		class210.mouseWheel = null; // L: 1234
		if (Timer.pcmPlayer1 != null) { // L: 1235
			Timer.pcmPlayer1.shutdown();
		}

		class101.field1332.method6897(); // L: 1236
		synchronized(ArchiveDiskActionHandler.field4240) { // L: 1238
			if (ArchiveDiskActionHandler.field4239 != 0) { // L: 1239
				ArchiveDiskActionHandler.field4239 = 1; // L: 1240
				ArchiveDiskActionHandler.field4236 = true; // L: 1241

				try {
					ArchiveDiskActionHandler.field4240.wait(); // L: 1243
				} catch (InterruptedException var5) { // L: 1245
				}
			}
		}

		if (class327.urlRequester != null) { // L: 1249
			class327.urlRequester.close(); // L: 1250
			class327.urlRequester = null; // L: 1251
		}

		try {
			JagexCache.JagexCache_dat2File.close(); // L: 1255

			for (int var4 = 0; var4 < class160.field1764; ++var4) { // L: 1256
				GrandExchangeOfferOwnWorldComparator.JagexCache_idxFiles[var4].close();
			}

			JagexCache.field1849.close(); // L: 1257
			JagexCache.JagexCache_randomDat.close(); // L: 1258
		} catch (Exception var7) { // L: 1260
		}

		this.field541.method198(); // L: 1262
	} // L: 1263

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-11698175"
	)
	protected final void vmethod1242() {
	} // L: 744

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1304306092"
	)
	boolean method1248() {
		return ModeWhere.field4381 != null && !ModeWhere.field4381.trim().isEmpty() && class47.field333 != null && !class47.field333.trim().isEmpty(); // L: 967
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "111169754"
	)
	boolean method1249() {
		return ClanChannelMember.field1653 != null && !ClanChannelMember.field1653.trim().isEmpty() && class74.field910 != null && !class74.field910.trim().isEmpty(); // L: 971
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "20"
	)
	@Export("isOtlTokenRequesterInitialized")
	boolean isOtlTokenRequesterInitialized() {
		return this.field543 != null; // L: 975
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1062725730"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 979
		var2.put("grant_type", "refresh_token"); // L: 980
		var2.put("scope", "gamesso.token.create"); // L: 981
		var2.put("refresh_token", var1); // L: 982
		URL var3 = new URL(ArchiveDiskActionHandler.field4242 + "shield/oauth/token" + (new class463(var2)).method8371()); // L: 983
		class419 var4 = new class419(); // L: 984
		var4.method7742(field729); // L: 985
		var4.method7765("Host", (new URL(ArchiveDiskActionHandler.field4242)).getHost()); // L: 986
		var4.method7746(class460.field4769); // L: 987
		class9 var5 = class9.field33; // L: 988
		RefreshAccessTokenRequester var6 = this.field698; // L: 989
		if (var6 != null) { // L: 990
			this.field548 = var6.request(var5.method72(), var3, var4.method7738(), ""); // L: 991
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field635); // L: 994
			this.field546 = this.field541.method197(var7); // L: 995
		}
	} // L: 992 996

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-537880796"
	)
	void method1252(String var1) throws IOException {
		URL var2 = new URL(ArchiveDiskActionHandler.field4242 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 999
		class419 var3 = new class419(); // L: 1000
		var3.method7748(var1); // L: 1001
		class9 var4 = class9.field31; // L: 1002
		OtlTokenRequester var5 = this.field543; // L: 1003
		if (var5 != null) { // L: 1004
			this.field606 = var5.request(var4.method72(), var2, var3.method7738(), ""); // L: 1005
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field635); // L: 1008
			this.field770 = this.field541.method197(var6); // L: 1009
		}
	} // L: 1006 1010

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "650480676"
	)
	void method1253(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(ArchiveDiskActionHandler.field4242 + "game-session/v1/tokens"); // L: 1013
		class10 var4 = new class10(var3, class9.field33, this.field635); // L: 1014
		var4.method90().method7748(var1); // L: 1015
		var4.method90().method7746(class460.field4769); // L: 1016
		JSONObject var5 = new JSONObject(); // L: 1017
		var5.put("accountId", var2); // L: 1018
		var4.method97(new class462(var5)); // L: 1019
		this.field770 = this.field541.method197(var4); // L: 1020
	} // L: 1021

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-4"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1425
			boolean var1 = class101.field1332.method6878(); // L: 1426
			if (!var1) { // L: 1427
				this.method1259();
			}

		}
	} // L: 1428

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	void method1259() {
		if (class101.field1332.field4301 >= 4) { // L: 1431
			this.error("js5crc"); // L: 1432
			AttackOption.method2723(1000); // L: 1433
		} else {
			if (class101.field1332.field4299 >= 4) { // L: 1436
				if (gameState <= 5) { // L: 1437
					this.error("js5io"); // L: 1438
					AttackOption.method2723(1000); // L: 1439
					return; // L: 1440
				}

				field501 = 3000; // L: 1443
				class101.field1332.field4299 = 3; // L: 1444
			}

			if (--field501 + 1 <= 0) { // L: 1447
				try {
					if (js5ConnectState == 0) { // L: 1449
						class135.js5SocketTask = GameEngine.taskHandler.newSocketTask(class6.worldHost, class20.currentPort); // L: 1450
						++js5ConnectState; // L: 1451
					}

					if (js5ConnectState == 1) { // L: 1453
						if (class135.js5SocketTask.status == 2) { // L: 1454
							this.js5Error(-1); // L: 1455
							return; // L: 1456
						}

						if (class135.js5SocketTask.status == 1) { // L: 1458
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1460
						Socket var2 = (Socket)class135.js5SocketTask.result; // L: 1462
						BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000); // L: 1464
						class1.js5Socket = var1; // L: 1466
						Buffer var3 = new Buffer(5); // L: 1467
						var3.writeByte(15); // L: 1468
						var3.writeInt(215); // L: 1469
						class1.js5Socket.write(var3.array, 0, 5); // L: 1470
						++js5ConnectState; // L: 1471
						Message.field484 = AttackOption.method2714(); // L: 1472
					}

					if (js5ConnectState == 3) { // L: 1474
						if (class1.js5Socket.available() > 0) { // L: 1475
							int var4 = class1.js5Socket.readUnsignedByte(); // L: 1476
							if (var4 != 0) { // L: 1477
								this.js5Error(var4); // L: 1478
								return; // L: 1479
							}

							++js5ConnectState; // L: 1481
						} else if (AttackOption.method2714() - Message.field484 > 30000L) { // L: 1484
							this.js5Error(-2); // L: 1485
							return; // L: 1486
						}
					}

					if (js5ConnectState == 4) { // L: 1490
						class101.field1332.method6863(class1.js5Socket, gameState > 20); // L: 1491
						class135.js5SocketTask = null; // L: 1492
						class1.js5Socket = null; // L: 1493
						js5ConnectState = 0; // L: 1494
						js5Errors = 0; // L: 1495
					}
				} catch (IOException var5) { // L: 1498
					this.js5Error(-3); // L: 1499
				}

			}
		}
	} // L: 1434 1501

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1955539117"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class135.js5SocketTask = null; // L: 1504
		class1.js5Socket = null; // L: 1505
		js5ConnectState = 0; // L: 1506
		if (class502.worldPort == class20.currentPort) { // L: 1507
			class20.currentPort = GrandExchangeOfferUnitPriceComparator.js5Port;
		} else {
			class20.currentPort = class502.worldPort; // L: 1508
		}

		++js5Errors; // L: 1509
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1510
			if (gameState <= 5) { // L: 1511
				this.error("js5connect_full"); // L: 1512
				AttackOption.method2723(1000); // L: 1513
			} else {
				field501 = 3000; // L: 1515
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1517
			this.error("js5connect_outofdate"); // L: 1518
			AttackOption.method2723(1000); // L: 1519
		} else if (js5Errors >= 4) { // L: 1521
			if (gameState <= 5) { // L: 1522
				this.error("js5connect"); // L: 1523
				AttackOption.method2723(1000); // L: 1524
			} else {
				field501 = 3000; // L: 1526
			}
		}

	} // L: 1528

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-81"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 2015
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 2016

		try {
			if (loginState == 0) { // L: 2018
				if (BuddyRankComparator.secureRandom == null && (secureRandomFuture.isDone() || field535 > 250)) { // L: 2019
					BuddyRankComparator.secureRandom = secureRandomFuture.get(); // L: 2020
					secureRandomFuture.shutdown(); // L: 2021
					secureRandomFuture = null; // L: 2022
				}

				if (BuddyRankComparator.secureRandom != null) { // L: 2024
					if (var1 != null) { // L: 2025
						((AbstractSocket)var1).close(); // L: 2026
						var1 = null; // L: 2027
					}

					class125.socketTask = null; // L: 2029
					hadNetworkError = false; // L: 2030
					field535 = 0; // L: 2031
					if (field539.method9357()) { // L: 2032
						if (this.method1248()) { // L: 2033
							try {
								this.requestOtlToken(class47.field333); // L: 2035
								class126.method3006(21); // L: 2036
							} catch (Throwable var24) { // L: 2038
								MusicPatchNode.RunException_sendStackTrace((String)null, var24); // L: 2039
								UserComparator9.getLoginError(65); // L: 2040
								return; // L: 2041
							}
						} else {
							if (!this.method1249()) { // L: 2044
								UserComparator9.getLoginError(65); // L: 2056
								return; // L: 2057
							}

							try {
								this.method1253(ClanChannelMember.field1653, class74.field910); // L: 2046
								class126.method3006(20); // L: 2047
							} catch (Exception var23) { // L: 2049
								MusicPatchNode.RunException_sendStackTrace((String)null, var23); // L: 2050
								UserComparator9.getLoginError(65); // L: 2051
								return; // L: 2052
							}
						}
					} else {
						class126.method3006(1); // L: 2061
					}
				}
			}

			class20 var26;
			if (loginState == 21) { // L: 2065
				if (this.field548 != null) { // L: 2066
					if (!this.field548.isDone()) { // L: 2067
						return; // L: 2068
					}

					if (this.field548.isCancelled()) { // L: 2070
						UserComparator9.getLoginError(65); // L: 2071
						this.field548 = null; // L: 2072
						return; // L: 2073
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field548.get(); // L: 2076
						if (!var3.isSuccess()) { // L: 2077
							UserComparator9.getLoginError(65); // L: 2078
							this.field548 = null; // L: 2079
							return; // L: 2080
						}

						ModeWhere.field4381 = var3.getAccessToken(); // L: 2082
						class47.field333 = var3.getRefreshToken(); // L: 2083
						this.field548 = null; // L: 2084
					} catch (Exception var22) { // L: 2086
						MusicPatchNode.RunException_sendStackTrace((String)null, var22); // L: 2087
						UserComparator9.getLoginError(65); // L: 2088
						this.field548 = null; // L: 2089
						return; // L: 2090
					}
				} else {
					if (this.field546 == null) { // L: 2093
						UserComparator9.getLoginError(65); // L: 2123
						return; // L: 2124
					}

					if (!this.field546.method292()) { // L: 2094
						return; // L: 2095
					}

					if (this.field546.method291()) { // L: 2097
						MusicPatchNode.RunException_sendStackTrace(this.field546.method290(), (Throwable)null); // L: 2098
						UserComparator9.getLoginError(65); // L: 2099
						this.field546 = null; // L: 2100
						return; // L: 2101
					}

					var26 = this.field546.method293(); // L: 2103
					if (var26.method310() != 200) { // L: 2104
						UserComparator9.getLoginError(65); // L: 2105
						this.field546 = null; // L: 2106
						return; // L: 2107
					}

					field535 = 0; // L: 2109
					class462 var4 = new class462(var26.method312()); // L: 2110

					try {
						ModeWhere.field4381 = var4.method8353().getString("access_token"); // L: 2112
						class47.field333 = var4.method8353().getString("refresh_token"); // L: 2113
					} catch (Exception var21) { // L: 2115
						MusicPatchNode.RunException_sendStackTrace("Error parsing tokens", var21); // L: 2116
						UserComparator9.getLoginError(65); // L: 2117
						this.field546 = null; // L: 2118
						return; // L: 2119
					}
				}

				this.method1252(ModeWhere.field4381); // L: 2126
				class126.method3006(20); // L: 2127
			}

			if (loginState == 20) { // L: 2129
				if (this.field606 != null) { // L: 2130
					if (!this.field606.isDone()) { // L: 2131
						return; // L: 2132
					}

					if (this.field606.isCancelled()) { // L: 2134
						UserComparator9.getLoginError(65); // L: 2135
						this.field606 = null; // L: 2136
						return; // L: 2137
					}

					try {
						OtlTokenResponse var27 = (OtlTokenResponse)this.field606.get(); // L: 2140
						if (!var27.isSuccess()) { // L: 2141
							UserComparator9.getLoginError(65); // L: 2142
							this.field606 = null; // L: 2143
							return; // L: 2144
						}

						this.field540 = var27.getToken(); // L: 2146
						this.field606 = null; // L: 2147
					} catch (Exception var20) { // L: 2149
						MusicPatchNode.RunException_sendStackTrace((String)null, var20); // L: 2150
						UserComparator9.getLoginError(65); // L: 2151
						this.field606 = null; // L: 2152
						return; // L: 2153
					}
				} else {
					if (this.field770 == null) { // L: 2156
						UserComparator9.getLoginError(65); // L: 2192
						return; // L: 2193
					}

					if (!this.field770.method292()) { // L: 2157
						return; // L: 2158
					}

					if (this.field770.method291()) { // L: 2160
						MusicPatchNode.RunException_sendStackTrace(this.field770.method290(), (Throwable)null); // L: 2161
						UserComparator9.getLoginError(65); // L: 2162
						this.field770 = null; // L: 2163
						return; // L: 2164
					}

					var26 = this.field770.method293(); // L: 2166
					if (var26.method310() != 200) { // L: 2167
						MusicPatchNode.RunException_sendStackTrace("Response code: " + var26.method310() + "Response body: " + var26.method312(), (Throwable)null); // L: 2168
						UserComparator9.getLoginError(65); // L: 2169
						this.field770 = null; // L: 2170
						return; // L: 2171
					}

					List var29 = (List)var26.method311().get("Content-Type"); // L: 2173
					if (var29 != null && var29.contains(class460.field4769.method8331())) { // L: 2174
						try {
							JSONObject var5 = new JSONObject(var26.method312()); // L: 2176
							this.field540 = var5.getString("token"); // L: 2177
						} catch (JSONException var19) { // L: 2179
							MusicPatchNode.RunException_sendStackTrace((String)null, var19); // L: 2180
							UserComparator9.getLoginError(65); // L: 2181
							this.field770 = null; // L: 2182
							return; // L: 2183
						}
					} else {
						this.field540 = var26.method312(); // L: 2187
					}

					this.field770 = null; // L: 2189
				}

				field535 = 0; // L: 2195
				class126.method3006(1); // L: 2196
			}

			if (loginState == 1) { // L: 2198
				if (class125.socketTask == null) { // L: 2199
					class125.socketTask = GameEngine.taskHandler.newSocketTask(class6.worldHost, class20.currentPort); // L: 2200
				}

				if (class125.socketTask.status == 2) { // L: 2202
					throw new IOException();
				}

				if (class125.socketTask.status == 1) { // L: 2203
					Socket var31 = (Socket)class125.socketTask.result; // L: 2205
					BufferedNetSocket var28 = new BufferedNetSocket(var31, 40000, 5000); // L: 2207
					var1 = var28; // L: 2209
					packetWriter.setSocket(var28); // L: 2210
					class125.socketTask = null; // L: 2211
					class126.method3006(2); // L: 2212
				}
			}

			PacketBufferNode var30;
			if (loginState == 2) { // L: 2215
				packetWriter.clearBuffer(); // L: 2216
				var30 = class20.method320(); // L: 2217
				var30.packetBuffer.writeByte(LoginPacket.field3360.id); // L: 2218
				packetWriter.addNode(var30); // L: 2219
				packetWriter.flush(); // L: 2220
				var2.offset = 0; // L: 2221
				class126.method3006(3); // L: 2222
			}

			int var13;
			if (loginState == 3) { // L: 2224
				if (Timer.pcmPlayer1 != null) { // L: 2225
					Timer.pcmPlayer1.method781();
				}

				if (((AbstractSocket)var1).isAvailable(1)) { // L: 2226
					var13 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2227
					if (Timer.pcmPlayer1 != null) { // L: 2228
						Timer.pcmPlayer1.method781();
					}

					if (var13 != 0) { // L: 2229
						UserComparator9.getLoginError(var13); // L: 2230
						return; // L: 2231
					}

					var2.offset = 0; // L: 2233
					class126.method3006(4); // L: 2234
				}
			}

			if (loginState == 4) { // L: 2237
				if (var2.offset < 8) { // L: 2238
					var13 = ((AbstractSocket)var1).available(); // L: 2239
					if (var13 > 8 - var2.offset) { // L: 2240
						var13 = 8 - var2.offset;
					}

					if (var13 > 0) { // L: 2241
						((AbstractSocket)var1).read(var2.array, var2.offset, var13); // L: 2242
						var2.offset += var13; // L: 2243
					}
				}

				if (var2.offset == 8) { // L: 2246
					var2.offset = 0; // L: 2247
					class386.field4416 = var2.readLong(); // L: 2248
					class126.method3006(5); // L: 2249
				}
			}

			int var6;
			if (loginState == 5) { // L: 2252
				packetWriter.packetBuffer.offset = 0; // L: 2253
				packetWriter.clearBuffer(); // L: 2254
				PacketBuffer var32 = new PacketBuffer(500); // L: 2255
				int[] var33 = new int[]{BuddyRankComparator.secureRandom.nextInt(), BuddyRankComparator.secureRandom.nextInt(), BuddyRankComparator.secureRandom.nextInt(), BuddyRankComparator.secureRandom.nextInt()}; // L: 2256 2257 2258 2259 2260
				var32.offset = 0; // L: 2261
				var32.writeByte(1); // L: 2262
				var32.writeInt(var33[0]); // L: 2263
				var32.writeInt(var33[1]); // L: 2264
				var32.writeInt(var33[2]); // L: 2265
				var32.writeInt(var33[3]); // L: 2266
				var32.writeLong(class386.field4416); // L: 2267
				if (gameState == 40) { // L: 2268
					var32.writeInt(ItemLayer.field2415[0]); // L: 2269
					var32.writeInt(ItemLayer.field2415[1]); // L: 2270
					var32.writeInt(ItemLayer.field2415[2]); // L: 2271
					var32.writeInt(ItemLayer.field2415[3]); // L: 2272
				} else {
					if (gameState == 50) { // L: 2275
						var32.writeByte(class140.field1632.rsOrdinal()); // L: 2276
						var32.writeInt(WorldMapArea.field2902); // L: 2277
					} else {
						var32.writeByte(field538.rsOrdinal()); // L: 2280
						switch(field538.field1633) { // L: 2281
						case 1:
						case 4:
							var32.writeMedium(Skills.field3830); // L: 2295
							++var32.offset; // L: 2296
							break;
						case 2:
							var32.offset += 4; // L: 2289
							break; // L: 2290
						case 3:
							var32.writeInt(ScriptFrame.clientPreferences.method2529(Login.Login_username)); // L: 2284
						}
					}

					if (field539.method9357()) { // L: 2301
						var32.writeByte(class517.field5118.rsOrdinal()); // L: 2302
						var32.writeStringCp1252NullTerminated(this.field540); // L: 2303
					} else {
						var32.writeByte(class517.field5122.rsOrdinal()); // L: 2306
						var32.writeStringCp1252NullTerminated(Login.Login_password); // L: 2307
					}
				}

				var32.encryptRsa(class74.field912, class74.field913); // L: 2310
				ItemLayer.field2415 = var33; // L: 2311
				PacketBufferNode var34 = class20.method320(); // L: 2312
				var34.packetBuffer.offset = 0; // L: 2313
				if (gameState == 40) { // L: 2314
					var34.packetBuffer.writeByte(LoginPacket.field3355.id); // L: 2315
				} else {
					var34.packetBuffer.writeByte(LoginPacket.field3354.id); // L: 2318
				}

				var34.packetBuffer.writeShort(0); // L: 2320
				var6 = var34.packetBuffer.offset; // L: 2321
				var34.packetBuffer.writeInt(215); // L: 2322
				var34.packetBuffer.writeInt(1); // L: 2323
				var34.packetBuffer.writeByte(clientType); // L: 2324
				var34.packetBuffer.writeByte(field583); // L: 2325
				byte var7 = 0; // L: 2326
				var34.packetBuffer.writeByte(var7); // L: 2327
				var34.packetBuffer.writeBytes(var32.array, 0, var32.offset); // L: 2328
				int var8 = var34.packetBuffer.offset; // L: 2329
				var34.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2330
				var34.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2331
				var34.packetBuffer.writeShort(VarbitComposition.canvasWidth); // L: 2332
				var34.packetBuffer.writeShort(class370.canvasHeight); // L: 2333
				PacketBuffer var9 = var34.packetBuffer; // L: 2334
				if (randomDatData != null) { // L: 2336
					var9.writeBytes(randomDatData, 0, randomDatData.length); // L: 2337
				} else {
					byte[] var10 = class217.method4378(); // L: 2340
					var9.writeBytes(var10, 0, var10.length); // L: 2341
				}

				var34.packetBuffer.writeStringCp1252NullTerminated(class138.field1604); // L: 2343
				var34.packetBuffer.writeInt(class449.field4730); // L: 2344
				if (field507 > 213) { // L: 2345
					var34.packetBuffer.writeByte(0); // L: 2346
				}

				Buffer var46 = new Buffer(FriendSystem.field831.size()); // L: 2348
				FriendSystem.field831.write(var46); // L: 2349
				var34.packetBuffer.writeBytes(var46.array, 0, var46.array.length); // L: 2350
				var34.packetBuffer.writeByte(clientType); // L: 2351
				var34.packetBuffer.writeInt(0); // L: 2352
				var34.packetBuffer.method9109(class342.archive2.hash); // L: 2353
				var34.packetBuffer.method9108(World.field813.hash); // L: 2354
				var34.packetBuffer.method9109(class19.field90.hash); // L: 2355
				var34.packetBuffer.method9108(0); // L: 2356
				var34.packetBuffer.method9109(FontName.archive4.hash); // L: 2357
				var34.packetBuffer.method9110(Messages.field1409.hash); // L: 2358
				var34.packetBuffer.writeInt(class9.field38.hash); // L: 2359
				var34.packetBuffer.method9110(GrandExchangeOfferOwnWorldComparator.archive8.hash); // L: 2360
				var34.packetBuffer.method9108(class359.archive12.hash); // L: 2361
				var34.packetBuffer.method9108(Renderable.archive6.hash); // L: 2362
				var34.packetBuffer.method9109(FontName.archive7.hash); // L: 2363
				var34.packetBuffer.method9109(class260.field2961.hash); // L: 2364
				var34.packetBuffer.method9110(class12.field59.hash); // L: 2365
				var34.packetBuffer.method9108(Nameable.field4637.hash); // L: 2366
				var34.packetBuffer.writeInt(class6.field20.hash); // L: 2367
				var34.packetBuffer.method9110(Canvas.archive13.hash); // L: 2368
				var34.packetBuffer.writeInt(WorldMapArchiveLoader.field4877.hash); // L: 2369
				var34.packetBuffer.method9109(class30.field158.hash); // L: 2370
				var34.packetBuffer.method9110(class148.archive10.hash); // L: 2371
				var34.packetBuffer.method9109(GraphicsObject.archive9.hash); // L: 2372
				var34.packetBuffer.method9110(class329.archive11.hash); // L: 2373
				var34.packetBuffer.xteaEncrypt(var33, var8, var34.packetBuffer.offset); // L: 2374
				var34.packetBuffer.writeLengthShort(var34.packetBuffer.offset - var6); // L: 2375
				packetWriter.addNode(var34); // L: 2376
				packetWriter.flush(); // L: 2377
				packetWriter.isaacCipher = new IsaacCipher(var33); // L: 2378
				int[] var11 = new int[4]; // L: 2379

				for (int var12 = 0; var12 < 4; ++var12) { // L: 2380
					var11[var12] = var33[var12] + 50;
				}

				var2.newIsaacCipher(var11); // L: 2381
				class126.method3006(6); // L: 2382
			}

			int var14;
			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2384 2385
				var13 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2386
				if (var13 == 61) { // L: 2387
					var14 = ((AbstractSocket)var1).available(); // L: 2388
					class496.field5021 = var14 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2389
					class126.method3006(5); // L: 2390
				}

				if (var13 == 21 && gameState == 20) { // L: 2392
					class126.method3006(12); // L: 2393
				} else if (var13 == 2) { // L: 2395
					class126.method3006(14); // L: 2396
				} else if (var13 == 15 && gameState == 40) { // L: 2398
					packetWriter.serverPacketLength = -1; // L: 2399
					class126.method3006(19); // L: 2400
				} else if (var13 == 64) { // L: 2402
					class126.method3006(10); // L: 2403
				} else if (var13 == 23 && field531 < 1) { // L: 2405
					++field531; // L: 2406
					class126.method3006(0); // L: 2407
				} else if (var13 == 29) { // L: 2409
					class126.method3006(17); // L: 2410
				} else {
					if (var13 != 69) { // L: 2412
						UserComparator9.getLoginError(var13); // L: 2416
						return; // L: 2417
					}

					class126.method3006(7); // L: 2413
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2421 2422
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2423
				var2.offset = 0; // L: 2424
				TileItem.field1354 = var2.readUnsignedShort(); // L: 2425
				class126.method3006(8); // L: 2426
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= TileItem.field1354) { // L: 2429 2430
				var2.offset = 0; // L: 2431
				((AbstractSocket)var1).read(var2.array, var2.offset, TileItem.field1354); // L: 2432
				class6[] var35 = new class6[]{class6.field18}; // L: 2435
				class6 var36 = var35[var2.readUnsignedByte()]; // L: 2437

				try {
					class3 var37 = class90.method2341(var36); // L: 2439
					this.field553 = new class7(var2, var37); // L: 2440
					class126.method3006(9); // L: 2441
				} catch (Exception var18) { // L: 2443
					UserComparator9.getLoginError(22); // L: 2444
					return; // L: 2445
				}
			}

			if (loginState == 9 && this.field553.method59()) { // L: 2449 2450
				this.field552 = this.field553.method45(); // L: 2451
				this.field553.method44(); // L: 2452
				this.field553 = null; // L: 2453
				if (this.field552 == null) { // L: 2454
					UserComparator9.getLoginError(22); // L: 2455
					return; // L: 2456
				}

				packetWriter.clearBuffer(); // L: 2458
				var30 = class20.method320(); // L: 2459
				var30.packetBuffer.writeByte(LoginPacket.field3356.id); // L: 2460
				var30.packetBuffer.writeShort(this.field552.offset); // L: 2461
				var30.packetBuffer.method9133(this.field552); // L: 2462
				packetWriter.addNode(var30); // L: 2463
				packetWriter.flush(); // L: 2464
				this.field552 = null; // L: 2465
				class126.method3006(6); // L: 2466
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2469 2470
				class27.field134 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2471
				class126.method3006(11); // L: 2472
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= class27.field134) { // L: 2475 2476
				((AbstractSocket)var1).read(var2.array, 0, class27.field134); // L: 2477
				var2.offset = 0; // L: 2478
				class126.method3006(6); // L: 2479
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2482 2483
				field537 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 2484
				class126.method3006(13); // L: 2485
			}

			if (loginState == 13) { // L: 2488
				field535 = 0; // L: 2489
				class156.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field537 / 60 + " seconds."); // L: 2490
				if (--field537 <= 0) { // L: 2491
					class126.method3006(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2494 2495
					class309.field3464 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2496
					class126.method3006(15); // L: 2497
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= class309.field3464) { // L: 2500 2501
					boolean var48 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2502
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2503
					var2.offset = 0; // L: 2504
					boolean var47 = false; // L: 2505
					if (var48) { // L: 2506
						var14 = var2.readByteIsaac() << 24; // L: 2507
						var14 |= var2.readByteIsaac() << 16; // L: 2508
						var14 |= var2.readByteIsaac() << 8; // L: 2509
						var14 |= var2.readByteIsaac(); // L: 2510
						ScriptFrame.clientPreferences.method2527(Login.Login_username, var14); // L: 2511
					}

					if (Login_isUsernameRemembered) { // L: 2513
						ScriptFrame.clientPreferences.method2521(Login.Login_username); // L: 2514
					} else {
						ScriptFrame.clientPreferences.method2521((String)null); // L: 2517
					}

					class20.savePreferences(); // L: 2519
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2520
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2521
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2522
					localPlayerIndex <<= 8; // L: 2523
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2524
					field671 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2525
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2526
					var2.offset = 0; // L: 2527
					this.accountHash = var2.readLong(); // L: 2528
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2529
					var2.offset = 0; // L: 2530
					field675 = var2.readLong(); // L: 2531
					if (field507 >= 214) { // L: 2532
						((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2533
						var2.offset = 0; // L: 2534
						var2.readLong(); // L: 2535
					}

					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2537
					var2.offset = 0; // L: 2538
					ServerPacket[] var40 = class11.method128(); // L: 2539
					var6 = var2.readSmartByteShortIsaac(); // L: 2540
					if (var6 < 0 || var6 >= var40.length) { // L: 2541
						throw new IOException(var6 + " " + var2.offset);
					}

					packetWriter.serverPacket = var40[var6]; // L: 2542
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2543
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2544
					var2.offset = 0; // L: 2545
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2546

					try {
						class26.method403(class415.client, "zap"); // L: 2548
					} catch (Throwable var17) { // L: 2550
					}

					class126.method3006(16); // L: 2551
				}

				if (loginState == 16) { // L: 2554
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2555
						var2.offset = 0; // L: 2556
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2557
						timer.method7708(); // L: 2558
						mouseLastLastPressedTimeMillis = 1L; // L: 2561
						class197.mouseRecorder.index = 0; // L: 2562
						Messages.hasFocus = true; // L: 2563
						hadFocus = true; // L: 2564
						field738 = -1L; // L: 2565
						class11.method123(); // L: 2566
						packetWriter.clearBuffer(); // L: 2567
						packetWriter.packetBuffer.offset = 0; // L: 2568
						packetWriter.serverPacket = null; // L: 2569
						packetWriter.field1419 = null; // L: 2570
						packetWriter.field1423 = null; // L: 2571
						packetWriter.field1426 = null; // L: 2572
						packetWriter.serverPacketLength = 0; // L: 2573
						packetWriter.field1422 = 0; // L: 2574
						rebootTimer = 0; // L: 2575
						logoutTimer = 0; // L: 2576
						hintArrowType = 0; // L: 2577
						MouseHandler.method661(); // L: 2578
						MouseHandler.MouseHandler_idleCycles = 0; // L: 2580
						Messages.Messages_channels.clear(); // L: 2583
						Messages.Messages_hashTable.clear(); // L: 2584
						Messages.Messages_queue.clear(); // L: 2585
						Messages.Messages_count = 0; // L: 2586
						isItemSelected = 0; // L: 2588
						isSpellSelected = false; // L: 2589
						soundEffectCount = 0; // L: 2590
						camAngleY = 0; // L: 2591
						oculusOrbState = 0; // L: 2592
						class348.field3881 = null; // L: 2593
						minimapState = 0; // L: 2594
						field625 = -1; // L: 2595
						destinationX = 0; // L: 2596
						destinationY = 0; // L: 2597
						playerAttackOption = AttackOption.AttackOption_hidden; // L: 2598
						npcAttackOption = AttackOption.AttackOption_hidden; // L: 2599
						npcCount = 0; // L: 2600
						Players.Players_count = 0; // L: 2602

						for (var13 = 0; var13 < 2048; ++var13) { // L: 2603
							Players.field1364[var13] = null; // L: 2604
							Players.field1363[var13] = class217.field2391; // L: 2605
						}

						for (var13 = 0; var13 < 2048; ++var13) { // L: 2608
							players[var13] = null;
						}

						for (var13 = 0; var13 < 65536; ++var13) { // L: 2609
							npcs[var13] = null;
						}

						combatTargetPlayerIndex = -1; // L: 2610
						projectiles.clear(); // L: 2611
						graphicsObjects.clear(); // L: 2612

						for (var13 = 0; var13 < 4; ++var13) { // L: 2613
							for (var14 = 0; var14 < 104; ++var14) { // L: 2614
								for (int var16 = 0; var16 < 104; ++var16) { // L: 2615
									groundItems[var13][var14][var16] = null; // L: 2616
								}
							}
						}

						pendingSpawns = new NodeDeque(); // L: 2620
						class162.friendSystem.clear(); // L: 2621

						for (var13 = 0; var13 < VarpDefinition.field1913; ++var13) { // L: 2622
							VarpDefinition var43 = FriendSystem.VarpDefinition_get(var13); // L: 2623
							if (var43 != null) { // L: 2624
								Varps.Varps_temp[var13] = 0; // L: 2625
								Varps.Varps_main[var13] = 0; // L: 2626
							}
						}

						class144.varcs.clearTransient(); // L: 2629
						followerIndex = -1; // L: 2630
						if (rootInterface != -1) { // L: 2631
							var13 = rootInterface; // L: 2632
							if (var13 != -1 && class47.Widget_loadedInterfaces[var13]) { // L: 2634 2635
								BuddyRankComparator.Widget_archive.clearFilesGroup(var13); // L: 2636
								if (class179.Widget_interfaceComponents[var13] != null) { // L: 2637
									for (var14 = 0; var14 < class179.Widget_interfaceComponents[var13].length; ++var14) { // L: 2638
										if (class179.Widget_interfaceComponents[var13][var14] != null) { // L: 2639
											class179.Widget_interfaceComponents[var13][var14] = null; // L: 2640
										}
									}

									class179.Widget_interfaceComponents[var13] = null; // L: 2643
									class47.Widget_loadedInterfaces[var13] = false; // L: 2644
								}
							}
						}

						for (InterfaceParent var44 = (InterfaceParent)interfaceParents.first(); var44 != null; var44 = (InterfaceParent)interfaceParents.next()) { // L: 2647
							class260.closeInterface(var44, true); // L: 2648
						}

						rootInterface = -1; // L: 2650
						interfaceParents = new NodeHashTable(8); // L: 2651
						meslayerContinueWidget = null; // L: 2652
						MouseHandler.method661(); // L: 2653
						playerAppearance.method6129((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1); // L: 2654

						for (var13 = 0; var13 < 8; ++var13) { // L: 2655
							playerMenuActions[var13] = null; // L: 2656
							playerOptionsPriorities[var13] = false; // L: 2657
						}

						class179.method3613(); // L: 2659
						field510 = true; // L: 2660

						for (var13 = 0; var13 < 100; ++var13) { // L: 2661
							field717[var13] = true;
						}

						var30 = class217.getPacketBufferNode(ClientPacket.field3134, packetWriter.isaacCipher); // L: 2664
						var30.packetBuffer.writeByte(class179.getWindowedMode()); // L: 2665
						var30.packetBuffer.writeShort(VarbitComposition.canvasWidth); // L: 2666
						var30.packetBuffer.writeShort(class370.canvasHeight); // L: 2667
						packetWriter.addNode(var30); // L: 2668
						ObjectSound.friendsChatManager = null; // L: 2670
						Skeleton.guestClanSettings = null; // L: 2671
						Arrays.fill(currentClanSettings, (Object)null); // L: 2672
						class9.guestClanChannel = null; // L: 2673
						Arrays.fill(currentClanChannels, (Object)null); // L: 2674

						for (var13 = 0; var13 < 8; ++var13) { // L: 2675
							grandExchangeOffers[var13] = new GrandExchangeOffer();
						}

						LoginScreenAnimation.grandExchangeEvents = null; // L: 2676
						field509 = false; // L: 2677
						class143.updatePlayer(var2); // L: 2679
						class396.field4466 = -1; // L: 2680
						JagexCache.loadRegions(false, var2); // L: 2681
						packetWriter.serverPacket = null; // L: 2682
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2686 2687
						var2.offset = 0; // L: 2688
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2689
						var2.offset = 0; // L: 2690
						EnumComposition.field1983 = var2.readUnsignedShort(); // L: 2691
						class126.method3006(18); // L: 2692
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= EnumComposition.field1983) { // L: 2695 2696
						var2.offset = 0; // L: 2697
						((AbstractSocket)var1).read(var2.array, 0, EnumComposition.field1983); // L: 2698
						var2.offset = 0; // L: 2699
						String var39 = var2.readStringCp1252NullTerminated(); // L: 2700
						String var38 = var2.readStringCp1252NullTerminated(); // L: 2701
						String var42 = var2.readStringCp1252NullTerminated(); // L: 2702
						class156.setLoginResponseString(var39, var38, var42); // L: 2703
						AttackOption.method2723(10); // L: 2704
						if (field539.method9357()) { // L: 2705
							ObjectSound.method1926(9); // L: 2706
						}
					}

					if (loginState != 19) { // L: 2710
						++field535; // L: 2765
						if (field535 > 2000) { // L: 2766
							if (field531 < 1) { // L: 2767
								if (class502.worldPort == class20.currentPort) { // L: 2768
									class20.currentPort = GrandExchangeOfferUnitPriceComparator.js5Port;
								} else {
									class20.currentPort = class502.worldPort; // L: 2769
								}

								++field531; // L: 2770
								class126.method3006(0); // L: 2771
							} else {
								UserComparator9.getLoginError(-3); // L: 2774
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) { // L: 2711
							if (((AbstractSocket)var1).available() < 2) { // L: 2712
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2713
							var2.offset = 0; // L: 2714
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2715
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2717
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2718
							var2.offset = 0; // L: 2719
							var13 = packetWriter.serverPacketLength; // L: 2720
							timer.method7726(); // L: 2721
							packetWriter.clearBuffer(); // L: 2723
							packetWriter.packetBuffer.offset = 0; // L: 2724
							packetWriter.serverPacket = null; // L: 2725
							packetWriter.field1419 = null; // L: 2726
							packetWriter.field1423 = null; // L: 2727
							packetWriter.field1426 = null; // L: 2728
							packetWriter.serverPacketLength = 0; // L: 2729
							packetWriter.field1422 = 0; // L: 2730
							rebootTimer = 0; // L: 2731
							menuOptionsCount = 0; // L: 2733
							isMenuOpen = false; // L: 2734
							minimapState = 0; // L: 2736
							destinationX = 0; // L: 2737

							for (var14 = 0; var14 < 2048; ++var14) { // L: 2738
								players[var14] = null;
							}

							class27.localPlayer = null; // L: 2739

							for (var14 = 0; var14 < npcs.length; ++var14) { // L: 2740
								NPC var45 = npcs[var14]; // L: 2741
								if (var45 != null) { // L: 2742
									var45.targetIndex = -1; // L: 2743
									var45.false0 = false; // L: 2744
								}
							}

							class179.method3613(); // L: 2747
							AttackOption.method2723(30); // L: 2748

							for (var14 = 0; var14 < 100; ++var14) { // L: 2749
								field717[var14] = true;
							}

							PacketBufferNode var41 = class217.getPacketBufferNode(ClientPacket.field3134, packetWriter.isaacCipher); // L: 2752
							var41.packetBuffer.writeByte(class179.getWindowedMode()); // L: 2753
							var41.packetBuffer.writeShort(VarbitComposition.canvasWidth); // L: 2754
							var41.packetBuffer.writeShort(class370.canvasHeight); // L: 2755
							packetWriter.addNode(var41); // L: 2756
							class143.updatePlayer(var2); // L: 2759
							if (var13 != var2.offset) { // L: 2760
								throw new RuntimeException(); // L: 2761
							}
						}
					}
				}
			}
		} catch (IOException var25) { // L: 2778
			if (field531 < 1) { // L: 2779
				if (class502.worldPort == class20.currentPort) { // L: 2780
					class20.currentPort = GrandExchangeOfferUnitPriceComparator.js5Port;
				} else {
					class20.currentPort = class502.worldPort; // L: 2781
				}

				++field531; // L: 2782
				class126.method3006(0); // L: 2783
			} else {
				UserComparator9.getLoginError(-2); // L: 2786
			}
		}
	} // L: 2492 2684 2763 2772 2775 2784 2787 2789

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-48"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3056
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3057
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3058
			hadNetworkError = false; // L: 3059
			VerticalAlignment.method3884(); // L: 3060
		} else {
			if (!isMenuOpen) { // L: 3063
				class170.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1268(packetWriter); ++var1) { // L: 3064 3065
			}

			if (gameState == 30) { // L: 3067
				int var2;
				PacketBufferNode var14;
				while (class108.method2773()) { // L: 3068
					var14 = class217.getPacketBufferNode(ClientPacket.field3194, packetWriter.isaacCipher); // L: 3069
					var14.packetBuffer.writeByte(0); // L: 3070
					var2 = var14.packetBuffer.offset; // L: 3071
					class6.performReflectionCheck(var14.packetBuffer); // L: 3072
					var14.packetBuffer.method9054(var14.packetBuffer.offset - var2); // L: 3073
					packetWriter.addNode(var14); // L: 3074
				}

				if (timer.field4550) { // L: 3076
					var14 = class217.getPacketBufferNode(ClientPacket.field3164, packetWriter.isaacCipher); // L: 3078
					var14.packetBuffer.writeByte(0); // L: 3079
					var2 = var14.packetBuffer.offset; // L: 3080
					timer.write(var14.packetBuffer); // L: 3081
					var14.packetBuffer.method9054(var14.packetBuffer.offset - var2); // L: 3082
					packetWriter.addNode(var14); // L: 3083
					timer.method7717(); // L: 3084
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
				synchronized(class197.mouseRecorder.lock) { // L: 3087
					if (!field556) { // L: 3088
						class197.mouseRecorder.index = 0; // L: 3174
					} else if (MouseHandler.MouseHandler_lastButton != 0 || class197.mouseRecorder.index >= 40) { // L: 3089
						PacketBufferNode var15 = null; // L: 3091
						var3 = 0; // L: 3092
						var4 = 0; // L: 3093
						var5 = 0; // L: 3094
						var6 = 0; // L: 3095

						for (var7 = 0; var7 < class197.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) { // L: 3096 3097
							var4 = var7; // L: 3098
							var8 = class197.mouseRecorder.ys[var7]; // L: 3099
							if (var8 < -1) { // L: 3100
								var8 = -1;
							} else if (var8 > 65534) { // L: 3101
								var8 = 65534;
							}

							var9 = class197.mouseRecorder.xs[var7]; // L: 3102
							if (var9 < -1) { // L: 3103
								var9 = -1;
							} else if (var9 > 65534) { // L: 3104
								var9 = 65534;
							}

							if (var9 != field513 || var8 != field567) { // L: 3105
								if (var15 == null) { // L: 3108
									var15 = class217.getPacketBufferNode(ClientPacket.field3127, packetWriter.isaacCipher); // L: 3109
									var15.packetBuffer.writeByte(0); // L: 3110
									var3 = var15.packetBuffer.offset; // L: 3111
									var10000 = var15.packetBuffer; // L: 3112
									var10000.offset += 2;
									var5 = 0; // L: 3113
									var6 = 0; // L: 3114
								}

								if (-1L != field561) { // L: 3119
									var10 = var9 - field513; // L: 3120
									var11 = var8 - field567; // L: 3121
									var12 = (int)((class197.mouseRecorder.millis[var7] - field561) / 20L); // L: 3122
									var5 = (int)((long)var5 + (class197.mouseRecorder.millis[var7] - field561) % 20L); // L: 3123
								} else {
									var10 = var9; // L: 3126
									var11 = var8; // L: 3127
									var12 = Integer.MAX_VALUE; // L: 3128
								}

								field513 = var9; // L: 3130
								field567 = var8; // L: 3131
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3132
									var10 += 32; // L: 3133
									var11 += 32; // L: 3134
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3135
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3137
									var10 += 128; // L: 3138
									var11 += 128; // L: 3139
									var15.packetBuffer.writeByte(var12 + 128); // L: 3140
									var15.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3141
								} else if (var12 < 32) { // L: 3143
									var15.packetBuffer.writeByte(var12 + 192); // L: 3144
									if (var9 != -1 && var8 != -1) { // L: 3145
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3146
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3149
									if (var9 != -1 && var8 != -1) { // L: 3150
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3151
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6; // L: 3153
								field561 = class197.mouseRecorder.millis[var7]; // L: 3154
							}
						}

						if (var15 != null) { // L: 3156
							var15.packetBuffer.method9054(var15.packetBuffer.offset - var3); // L: 3157
							var7 = var15.packetBuffer.offset; // L: 3158
							var15.packetBuffer.offset = var3; // L: 3159
							var15.packetBuffer.writeByte(var5 / var6); // L: 3160
							var15.packetBuffer.writeByte(var5 % var6); // L: 3161
							var15.packetBuffer.offset = var7; // L: 3162
							packetWriter.addNode(var15); // L: 3163
						}

						if (var4 >= class197.mouseRecorder.index) { // L: 3165
							class197.mouseRecorder.index = 0;
						} else {
							MouseRecorder var49 = class197.mouseRecorder; // L: 3167
							var49.index -= var4;
							System.arraycopy(class197.mouseRecorder.xs, var4, class197.mouseRecorder.xs, 0, class197.mouseRecorder.index); // L: 3168
							System.arraycopy(class197.mouseRecorder.ys, var4, class197.mouseRecorder.ys, 0, class197.mouseRecorder.index); // L: 3169
							System.arraycopy(class197.mouseRecorder.millis, var4, class197.mouseRecorder.millis, 0, class197.mouseRecorder.index); // L: 3170
						}
					}
				}

				PacketBufferNode var18;
				if (MouseHandler.MouseHandler_lastButton == 1 || !class412.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3176
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L; // L: 3177
					if (var16 > 32767L) { // L: 3178
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L; // L: 3179
					var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3180
					if (var3 < 0) { // L: 3181
						var3 = 0;
					} else if (var3 > class370.canvasHeight) { // L: 3182
						var3 = class370.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3183
					if (var4 < 0) { // L: 3184
						var4 = 0;
					} else if (var4 > VarbitComposition.canvasWidth) { // L: 3185
						var4 = VarbitComposition.canvasWidth;
					}

					var5 = (int)var16; // L: 3186
					var18 = class217.getPacketBufferNode(ClientPacket.field3123, packetWriter.isaacCipher); // L: 3187
					var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 3188
					var18.packetBuffer.writeShort(var4); // L: 3189
					var18.packetBuffer.writeShort(var3); // L: 3190
					packetWriter.addNode(var18); // L: 3191
				}

				if (mouseWheelRotation != 0) { // L: 3193
					var14 = class217.getPacketBufferNode(ClientPacket.field3202, packetWriter.isaacCipher); // L: 3194
					var14.packetBuffer.writeShort(mouseWheelRotation); // L: 3195
					packetWriter.addNode(var14); // L: 3196
				}

				if (field519.field2336 > 0) { // L: 3198
					var14 = class217.getPacketBufferNode(ClientPacket.field3126, packetWriter.isaacCipher); // L: 3199
					var14.packetBuffer.writeShort(0); // L: 3200
					var2 = var14.packetBuffer.offset; // L: 3201
					long var19 = AttackOption.method2714(); // L: 3202

					for (var5 = 0; var5 < field519.field2336; ++var5) { // L: 3203
						long var21 = var19 - field738; // L: 3204
						if (var21 > 16777215L) { // L: 3205
							var21 = 16777215L;
						}

						field738 = var19; // L: 3206
						var14.packetBuffer.method9104((int)var21); // L: 3207
						var14.packetBuffer.method9087(field519.field2335[var5]); // L: 3208
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2); // L: 3210
					packetWriter.addNode(var14); // L: 3211
				}

				if (field651 > 0) { // L: 3213
					--field651;
				}

				if (field519.method4285(96) || field519.method4285(97) || field519.method4285(98) || field519.method4285(99)) { // L: 3214
					field598 = true; // L: 3215
				}

				if (field598 && field651 <= 0) { // L: 3217
					field651 = 20; // L: 3218
					field598 = false; // L: 3219
					var14 = class217.getPacketBufferNode(ClientPacket.field3198, packetWriter.isaacCipher); // L: 3221
					var14.packetBuffer.writeShort(camAngleY); // L: 3222
					var14.packetBuffer.writeShort(camAngleX); // L: 3223
					packetWriter.addNode(var14); // L: 3224
				}

				if (Messages.hasFocus && !hadFocus) { // L: 3226
					hadFocus = true; // L: 3227
					var14 = class217.getPacketBufferNode(ClientPacket.field3114, packetWriter.isaacCipher); // L: 3229
					var14.packetBuffer.writeByte(1); // L: 3230
					packetWriter.addNode(var14); // L: 3231
				}

				if (!Messages.hasFocus && hadFocus) { // L: 3233
					hadFocus = false; // L: 3234
					var14 = class217.getPacketBufferNode(ClientPacket.field3114, packetWriter.isaacCipher); // L: 3236
					var14.packetBuffer.writeByte(0); // L: 3237
					packetWriter.addNode(var14); // L: 3238
				}

				if (ScriptFrame.worldMap != null) { // L: 3241
					ScriptFrame.worldMap.method8506();
				}

				class216.method4362(); // L: 3242
				if (Messages.field1412) { // L: 3244
					WorldMapSection2.method5174(); // L: 3245
					Messages.field1412 = false; // L: 3246
				}

				InterfaceParent.method2303(); // L: 3249
				if (gameState == 30) { // L: 3250
					for (PendingSpawn var33 = (PendingSpawn)pendingSpawns.last(); var33 != null; var33 = (PendingSpawn)pendingSpawns.previous()) { // L: 3252 3253 3296
						if (var33.hitpoints > 0) { // L: 3254
							--var33.hitpoints;
						}

						ObjectComposition var23;
						boolean var30;
						if (var33.hitpoints == 0) { // L: 3255
							if (var33.objectId >= 0) { // L: 3257
								var3 = var33.objectId; // L: 3259
								var4 = var33.field1162; // L: 3260
								var23 = Language.getObjectDefinition(var3); // L: 3262
								if (var4 == 11) { // L: 3263
									var4 = 10;
								}

								if (var4 >= 5 && var4 <= 8) { // L: 3264
									var4 = 4;
								}

								var30 = var23.method4028(var4); // L: 3265
								if (!var30) { // L: 3267
									continue;
								}
							}

							Messages.method2839(var33.plane, var33.type, var33.x, var33.y, var33.objectId, var33.field1167, var33.field1162, var33.field1174); // L: 3269
							var33.remove(); // L: 3270
						} else {
							if (var33.delay > 0) { // L: 3274
								--var33.delay;
							}

							if (var33.delay == 0 && var33.x >= 1 && var33.y >= 1 && var33.x <= 102 && var33.y <= 102) { // L: 3275
								if (var33.field1168 >= 0) { // L: 3277
									var3 = var33.field1168; // L: 3279
									var4 = var33.field1171; // L: 3280
									var23 = Language.getObjectDefinition(var3); // L: 3282
									if (var4 == 11) { // L: 3283
										var4 = 10;
									}

									if (var4 >= 5 && var4 <= 8) { // L: 3284
										var4 = 4;
									}

									var30 = var23.method4028(var4); // L: 3285
									if (!var30) { // L: 3287
										continue;
									}
								}

								Messages.method2839(var33.plane, var33.type, var33.x, var33.y, var33.field1168, var33.field1170, var33.field1171, var33.field1174); // L: 3289
								var33.delay = -1; // L: 3290
								if (var33.objectId == var33.field1168 && var33.objectId == -1) { // L: 3291
									var33.remove();
								} else if (var33.field1168 == var33.objectId && var33.field1167 == var33.field1170 && var33.field1171 == var33.field1162) { // L: 3292
									var33.remove();
								}
							}
						}
					}

					int var10002;
					for (var1 = 0; var1 < soundEffectCount; ++var1) { // L: 3300
						var10002 = queuedSoundEffectDelays[var1]--; // L: 3301
						if (queuedSoundEffectDelays[var1] >= -10) { // L: 3302
							SoundEffect var34 = soundEffects[var1]; // L: 3314
							if (var34 == null) { // L: 3315
								var10000 = null; // L: 3316
								var34 = SoundEffect.readSoundEffect(GraphicsObject.archive9, soundEffectIds[var1], 0);
								if (var34 == null) { // L: 3317
									continue;
								}

								int[] var50 = queuedSoundEffectDelays; // L: 3318
								var50[var1] += var34.calculateDelay();
								soundEffects[var1] = var34; // L: 3319
							}

							if (queuedSoundEffectDelays[var1] < 0) { // L: 3325
								if (soundLocations[var1] != 0) { // L: 3327
									var4 = (soundLocations[var1] & 255) * 128; // L: 3328
									var5 = soundLocations[var1] >> 16 & 255; // L: 3329
									var6 = var5 * 128 + 64 - class27.localPlayer.x; // L: 3330
									if (var6 < 0) { // L: 3331
										var6 = -var6;
									}

									var7 = soundLocations[var1] >> 8 & 255; // L: 3332
									var8 = var7 * 128 + 64 - class27.localPlayer.y; // L: 3333
									if (var8 < 0) { // L: 3334
										var8 = -var8;
									}

									var9 = var6 + var8 - 128; // L: 3335
									if (var9 > var4) { // L: 3336
										queuedSoundEffectDelays[var1] = -100; // L: 3337
										continue; // L: 3338
									}

									if (var9 < 0) { // L: 3340
										var9 = 0;
									}

									var3 = (var4 - var9) * ScriptFrame.clientPreferences.method2571() / var4; // L: 3341
								} else {
									var3 = ScriptFrame.clientPreferences.method2518(); // L: 3343
								}

								if (var3 > 0) { // L: 3344
									RawSound var24 = var34.toRawSound().resample(JagexCache.decimator); // L: 3345
									RawPcmStream var39 = RawPcmStream.createRawPcmStream(var24, 100, var3); // L: 3346
									var39.setNumLoops(queuedSoundEffectLoops[var1] - 1); // L: 3347
									ApproximateRouteStrategy.pcmStreamMixer.addSubStream(var39); // L: 3348
								}

								queuedSoundEffectDelays[var1] = -100; // L: 3350
							}
						} else {
							--soundEffectCount; // L: 3303

							for (var2 = var1; var2 < soundEffectCount; ++var2) { // L: 3304
								soundEffectIds[var2] = soundEffectIds[var2 + 1]; // L: 3305
								soundEffects[var2] = soundEffects[var2 + 1]; // L: 3306
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1]; // L: 3307
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1]; // L: 3308
								soundLocations[var2] = soundLocations[var2 + 1]; // L: 3309
							}

							--var1; // L: 3311
						}
					}

					if (playingJingle && !MidiPcmStream.method5958()) { // L: 3353
						if (ScriptFrame.clientPreferences.method2516() != 0) { // L: 3354
							boolean var29 = !class305.field3398.isEmpty(); // L: 3357
							if (var29) { // L: 3359
								class147.method3233(class329.archive11, ScriptFrame.clientPreferences.method2516()); // L: 3360
							}
						}

						playingJingle = false; // L: 3363
					}

					++packetWriter.field1422; // L: 3366
					if (packetWriter.field1422 > 750) { // L: 3367
						VerticalAlignment.method3884(); // L: 3368
					} else {
						var1 = Players.Players_count; // L: 3372
						int[] var36 = Players.Players_indices; // L: 3373

						for (var3 = 0; var3 < var1; ++var3) { // L: 3374
							Player var41 = players[var36[var3]]; // L: 3375
							if (var41 != null) { // L: 3376
								GraphicsObject.updateActorSequence(var41, 1); // L: 3377
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 3382
							var2 = npcIndices[var1]; // L: 3383
							NPC var25 = npcs[var2]; // L: 3384
							if (var25 != null) { // L: 3385
								GraphicsObject.updateActorSequence(var25, var25.definition.size); // L: 3386
							}
						}

						class16.method232(); // L: 3390
						++field578; // L: 3391
						if (mouseCrossColor != 0) { // L: 3392
							mouseCrossState = mouseCrossState * 400 + 20; // L: 3393
							if (mouseCrossState * 400 >= 400) { // L: 3394
								mouseCrossColor = 0;
							}
						}

						Widget var35 = class308.mousedOverWidgetIf1; // L: 3396
						Widget var37 = class4.field11; // L: 3397
						class308.mousedOverWidgetIf1 = null; // L: 3398
						class4.field11 = null; // L: 3399
						draggedOnWidget = null; // L: 3400
						field687 = false; // L: 3401
						field684 = false; // L: 3402
						field735 = 0; // L: 3403

						while (field519.method4277() && field735 < 128) { // L: 3404
							if (staffModLevel >= 2 && field519.method4285(82) && field519.field2346 == 66) { // L: 3405
								StringBuilder var43 = new StringBuilder(); // L: 3408

								Message var38;
								for (Iterator var40 = Messages.Messages_hashTable.iterator(); var40.hasNext(); var43.append(var38.text).append('\n')) { // L: 3409 3415
									var38 = (Message)var40.next(); // L: 3410
									if (var38.sender != null && !var38.sender.isEmpty()) { // L: 3412
										var43.append(var38.sender).append(':'); // L: 3413
									}
								}

								String var45 = var43.toString(); // L: 3418
								class415.client.method543(var45); // L: 3421
							} else if (oculusOrbState != 1 || field519.field2345 <= 0) { // L: 3424
								field737[field735] = field519.field2346; // L: 3427
								field736[field735] = field519.field2345; // L: 3428
								++field735; // L: 3429
							}
						}

						if (MouseRecorder.method2320() && field519.method4285(82) && field519.method4285(81) && mouseWheelRotation != 0) { // L: 3431
							var3 = class27.localPlayer.plane - mouseWheelRotation; // L: 3432
							if (var3 < 0) { // L: 3433
								var3 = 0;
							} else if (var3 > 3) { // L: 3434
								var3 = 3;
							}

							if (var3 != class27.localPlayer.plane) { // L: 3435
								var4 = class27.localPlayer.pathX[0] + class166.baseX * 64; // L: 3436
								var5 = class27.localPlayer.pathY[0] + class9.baseY * 64; // L: 3437
								var18 = class217.getPacketBufferNode(ClientPacket.field3132, packetWriter.isaacCipher); // L: 3440
								var18.packetBuffer.method9109(0); // L: 3441
								var18.packetBuffer.writeIntME(var4); // L: 3442
								var18.packetBuffer.method9087(var3); // L: 3443
								var18.packetBuffer.method9097(var5); // L: 3444
								packetWriter.addNode(var18); // L: 3445
							}

							mouseWheelRotation = 0; // L: 3448
						}

						if (MouseHandler.MouseHandler_lastButton == 1) { // L: 3450
							field734.method4226(); // L: 3451
						}

						if (rootInterface != -1) { // L: 3453
							PacketWriter.updateRootInterface(rootInterface, 0, 0, VarbitComposition.canvasWidth, class370.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3454

						while (true) {
							Widget var42;
							Widget var44;
							ScriptEvent var47;
							do {
								var47 = (ScriptEvent)field711.removeLast(); // L: 3456
								if (var47 == null) { // L: 3457
									while (true) {
										do {
											var47 = (ScriptEvent)field712.removeLast(); // L: 3468
											if (var47 == null) { // L: 3469
												while (true) {
													do {
														var47 = (ScriptEvent)scriptEvents.removeLast(); // L: 3480
														if (var47 == null) { // L: 3481
															while (true) {
																class211 var48 = (class211)field584.removeLast(); // L: 3492
																if (var48 == null) { // L: 3493
																	this.menu(); // L: 3496
																	WorldMapRectangle.method5543(); // L: 3497
																	if (clickedWidget != null) { // L: 3498
																		this.method1274();
																	}

																	PacketBufferNode var46;
																	if (Scene.shouldSendWalk()) { // L: 3499
																		var3 = Scene.Scene_selectedX; // L: 3500
																		var4 = Scene.Scene_selectedY; // L: 3501
																		var46 = class217.getPacketBufferNode(ClientPacket.field3200, packetWriter.isaacCipher); // L: 3503
																		var46.packetBuffer.writeByte(5); // L: 3504
																		var46.packetBuffer.writeShort(class166.baseX * 64 + var3); // L: 3505
																		var46.packetBuffer.method9087(field519.method4285(82) ? (field519.method4285(81) ? 2 : 1) : 0); // L: 3506
																		var46.packetBuffer.method9096(class9.baseY * 64 + var4); // L: 3507
																		packetWriter.addNode(var46); // L: 3508
																		Scene.method4687(); // L: 3509
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3510
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3511
																		mouseCrossColor = 1; // L: 3512
																		mouseCrossState = 0; // L: 3513
																		destinationX = var3; // L: 3514
																		destinationY = var4; // L: 3515
																	}

																	if (var35 != class308.mousedOverWidgetIf1) { // L: 3517
																		if (var35 != null) { // L: 3518
																			class303.invalidateWidget(var35);
																		}

																		if (class308.mousedOverWidgetIf1 != null) { // L: 3519
																			class303.invalidateWidget(class308.mousedOverWidgetIf1);
																		}
																	}

																	if (var37 != class4.field11 && field658 == field659) { // L: 3521
																		if (var37 != null) { // L: 3522
																			class303.invalidateWidget(var37);
																		}

																		if (class4.field11 != null) { // L: 3523
																			class303.invalidateWidget(class4.field11);
																		}
																	}

																	if (class4.field11 != null) { // L: 3525
																		if (field658 < field659) { // L: 3526
																			++field658; // L: 3527
																			if (field659 == field658) { // L: 3528
																				class303.invalidateWidget(class4.field11);
																			}
																		}
																	} else if (field658 > 0) { // L: 3531
																		--field658;
																	}

																	if (oculusOrbState == 0) { // L: 3533
																		var3 = class27.localPlayer.x; // L: 3534
																		var4 = class27.localPlayer.y; // L: 3535
																		if (class151.oculusOrbFocalPointX - var3 < -500 || class151.oculusOrbFocalPointX - var3 > 500 || class154.oculusOrbFocalPointY - var4 < -500 || class154.oculusOrbFocalPointY - var4 > 500) { // L: 3536
																			class151.oculusOrbFocalPointX = var3; // L: 3537
																			class154.oculusOrbFocalPointY = var4; // L: 3538
																		}

																		if (var3 != class151.oculusOrbFocalPointX) { // L: 3540
																			class151.oculusOrbFocalPointX += (var3 - class151.oculusOrbFocalPointX) / 16;
																		}

																		if (var4 != class154.oculusOrbFocalPointY) { // L: 3541
																			class154.oculusOrbFocalPointY += (var4 - class154.oculusOrbFocalPointY) / 16;
																		}

																		var5 = class151.oculusOrbFocalPointX >> 7; // L: 3542
																		var6 = class154.oculusOrbFocalPointY >> 7; // L: 3543
																		var7 = class291.getTileHeight(class151.oculusOrbFocalPointX, class154.oculusOrbFocalPointY, BuddyRankComparator.Client_plane); // L: 3544
																		var8 = 0; // L: 3545
																		if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) { // L: 3546
																			for (var9 = var5 - 4; var9 <= var5 + 4; ++var9) { // L: 3547
																				for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) { // L: 3548
																					var11 = BuddyRankComparator.Client_plane; // L: 3549
																					if (var11 < 3 && (Tiles.Tiles_renderFlags[1][var9][var10] & 2) == 2) { // L: 3550
																						++var11;
																					}

																					var12 = var7 - Tiles.Tiles_heights[var11][var9][var10]; // L: 3551
																					if (var12 > var8) { // L: 3552
																						var8 = var12;
																					}
																				}
																			}
																		}

																		var9 = var8 * 192; // L: 3556
																		if (var9 > 98048) { // L: 3557
																			var9 = 98048;
																		}

																		if (var9 < 32768) { // L: 3558
																			var9 = 32768;
																		}

																		if (var9 > field599) { // L: 3559
																			field599 += (var9 - field599) / 24;
																		} else if (var9 < field599) { // L: 3560
																			field599 += (var9 - field599) / 80;
																		}

																		SecureRandomFuture.field981 = class291.getTileHeight(class27.localPlayer.x, class27.localPlayer.y, BuddyRankComparator.Client_plane) - camFollowHeight; // L: 3561
																	} else if (oculusOrbState == 1) { // L: 3563
																		class178.method3612(); // L: 3564
																		short var31 = -1; // L: 3565
																		if (field519.method4285(33)) { // L: 3566
																			var31 = 0;
																		} else if (field519.method4285(49)) { // L: 3567
																			var31 = 1024;
																		}

																		if (field519.method4285(48)) { // L: 3568
																			if (var31 == 0) { // L: 3569
																				var31 = 1792;
																			} else if (var31 == 1024) { // L: 3570
																				var31 = 1280;
																			} else {
																				var31 = 1536; // L: 3571
																			}
																		} else if (field519.method4285(50)) { // L: 3573
																			if (var31 == 0) { // L: 3574
																				var31 = 256;
																			} else if (var31 == 1024) { // L: 3575
																				var31 = 768;
																			} else {
																				var31 = 512; // L: 3576
																			}
																		}

																		byte var32 = 0; // L: 3578
																		if (field519.method4285(35)) { // L: 3579
																			var32 = -1;
																		} else if (field519.method4285(51)) { // L: 3580
																			var32 = 1;
																		}

																		var5 = 0; // L: 3581
																		if (var31 >= 0 || var32 != 0) { // L: 3582
																			var5 = field519.method4285(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed; // L: 3583
																			var5 *= 16; // L: 3584
																			field591 = var31; // L: 3585
																			field592 = var32; // L: 3586
																		}

																		if (field590 < var5) { // L: 3588
																			field590 += var5 / 8; // L: 3589
																			if (field590 > var5) { // L: 3590
																				field590 = var5;
																			}
																		} else if (field590 > var5) { // L: 3592
																			field590 = field590 * 9 / 10;
																		}

																		if (field590 > 0) { // L: 3593
																			var6 = field590 / 16; // L: 3594
																			if (field591 >= 0) { // L: 3595
																				var3 = field591 - class13.cameraYaw & 2047; // L: 3596
																				var7 = Rasterizer3D.Rasterizer3D_sine[var3]; // L: 3597
																				var8 = Rasterizer3D.Rasterizer3D_cosine[var3]; // L: 3598
																				class151.oculusOrbFocalPointX += var7 * var6 / 65536; // L: 3599
																				class154.oculusOrbFocalPointY += var8 * var6 / 65536; // L: 3600
																			}

																			if (field592 != 0) { // L: 3602
																				SecureRandomFuture.field981 += var6 * field592; // L: 3603
																				if (SecureRandomFuture.field981 > 0) { // L: 3604
																					SecureRandomFuture.field981 = 0;
																				}
																			}
																		} else {
																			field591 = -1; // L: 3608
																			field592 = -1; // L: 3609
																		}

																		if (field519.method4285(13)) { // L: 3611
																			ArchiveLoader.method2281(); // L: 3612
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && class412.mouseCam) { // L: 3615
																		var3 = MouseHandler.MouseHandler_y - field620; // L: 3616
																		field668 = var3 * 2; // L: 3617
																		field620 = var3 != -1 && var3 != 1 ? (MouseHandler.MouseHandler_y + field620) / 2 : MouseHandler.MouseHandler_y; // L: 3618
																		var4 = field586 - MouseHandler.MouseHandler_x; // L: 3619
																		field499 = var4 * 2; // L: 3620
																		field586 = var4 != -1 && var4 != 1 ? (field586 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x; // L: 3621
																	} else {
																		if (field519.method4285(96)) { // L: 3624
																			field499 += (-24 - field499) / 2;
																		} else if (field519.method4285(97)) { // L: 3625
																			field499 += (24 - field499) / 2;
																		} else {
																			field499 /= 2; // L: 3626
																		}

																		if (field519.method4285(98)) { // L: 3627
																			field668 += (12 - field668) / 2;
																		} else if (field519.method4285(99)) { // L: 3628
																			field668 += (-12 - field668) / 2;
																		} else {
																			field668 /= 2; // L: 3629
																		}

																		field620 = MouseHandler.MouseHandler_y; // L: 3630
																		field586 = MouseHandler.MouseHandler_x; // L: 3631
																	}

																	camAngleY = field499 / 2 + camAngleY & 2047; // L: 3633
																	camAngleX += field668 / 2; // L: 3634
																	if (camAngleX < 128) { // L: 3635
																		camAngleX = 128;
																	}

																	if (camAngleX > 383) { // L: 3636
																		camAngleX = 383;
																	}

																	if (field763) { // L: 3638
																		class350.method6676(class60.field434, ServerPacket.field3351, class391.field4433); // L: 3639
																		ObjectSound.method1937(InterfaceParent.field1065, AbstractUserComparator.field4639); // L: 3640
																		if (PacketWriter.cameraX == class60.field434 && ServerPacket.field3351 == class309.cameraY && class391.field4433 == World.cameraZ && InterfaceParent.field1065 == ModeWhere.cameraPitch && AbstractUserComparator.field4639 == class13.cameraYaw) { // L: 3641
																			field763 = false; // L: 3642
																			isCameraLocked = false; // L: 3643
																			field779 = false; // L: 3644
																			field758 = false; // L: 3645
																			class238.field2688 = 0; // L: 3646
																			Language.field4367 = 0; // L: 3647
																			class53.field364 = 0; // L: 3648
																			MenuAction.field900 = 0; // L: 3649
																			ClanChannelMember.field1656 = 0; // L: 3650
																			class166.field1794 = 0; // L: 3651
																			UserComparator8.field1451 = 0; // L: 3652
																			class90.field1106 = 0; // L: 3653
																			ClanSettings.field1742 = 0; // L: 3654
																			Buddy.field4655 = 0; // L: 3655
																			field760 = null; // L: 3656
																			field762 = null; // L: 3657
																			field761 = null; // L: 3658
																		}
																	} else if (isCameraLocked) { // L: 3661
																		class53.method1096();
																	}

																	for (var3 = 0; var3 < 5; ++var3) { // L: 3662
																		var10002 = field768[var3]++;
																	}

																	class144.varcs.tryWrite(); // L: 3663
																	var3 = class10.method105(); // L: 3664
																	var4 = Clock.method3649(); // L: 3665
																	if (var3 > 15000 && var4 > 15000) { // L: 3666
																		logoutTimer = 250; // L: 3667
																		MouseHandler.MouseHandler_idleCycles = 14500; // L: 3669
																		var46 = class217.getPacketBufferNode(ClientPacket.field3109, packetWriter.isaacCipher); // L: 3672
																		packetWriter.addNode(var46); // L: 3673
																	}

																	class162.friendSystem.processFriendUpdates(); // L: 3675

																	for (var5 = 0; var5 < field725.size(); ++var5) { // L: 3677
																		var7 = (Integer)field725.get(var5); // L: 3679
																		class138 var26 = class184.method3661(var7); // L: 3681
																		if (var26 == null) { // L: 3682
																			var6 = 2; // L: 3683
																		} else {
																			var6 = var26.method3154() ? 0 : 1; // L: 3686
																		}

																		if (var6 != 2) { // L: 3688
																			field725.remove(var5); // L: 3689
																			--var5; // L: 3690
																		}
																	}

																	++packetWriter.pendingWrites; // L: 3694
																	if (packetWriter.pendingWrites > 50) { // L: 3695
																		var46 = class217.getPacketBufferNode(ClientPacket.field3135, packetWriter.isaacCipher); // L: 3697
																		packetWriter.addNode(var46); // L: 3698
																	}

																	try {
																		packetWriter.flush(); // L: 3701
																	} catch (IOException var27) { // L: 3703
																		VerticalAlignment.method3884(); // L: 3704
																	}

																	return; // L: 3706
																}

																UserComparator3.method2959(var48); // L: 3494
															}
														}

														var44 = var47.widget; // L: 3482
														if (var44.childIndex < 0) { // L: 3483
															break;
														}

														var42 = Interpreter.getWidget(var44.parentId); // L: 3484
													} while(var42 == null || var42.children == null || var44.childIndex >= var42.children.length || var44 != var42.children[var44.childIndex]); // L: 3485

													class170.runScriptEvent(var47); // L: 3489
												}
											}

											var44 = var47.widget; // L: 3470
											if (var44.childIndex < 0) { // L: 3471
												break;
											}

											var42 = Interpreter.getWidget(var44.parentId); // L: 3472
										} while(var42 == null || var42.children == null || var44.childIndex >= var42.children.length || var44 != var42.children[var44.childIndex]); // L: 3473

										class170.runScriptEvent(var47); // L: 3477
									}
								}

								var44 = var47.widget; // L: 3458
								if (var44.childIndex < 0) { // L: 3459
									break;
								}

								var42 = Interpreter.getWidget(var44.parentId); // L: 3460
							} while(var42 == null || var42.children == null || var44.childIndex >= var42.children.length || var44 != var42.children[var44.childIndex]); // L: 3461

							class170.runScriptEvent(var47); // L: 3465
						}
					}
				}
			}
		}
	} // L: 3061 3369

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-505679045"
	)
	public void vmethod6029(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) { // L: 3843
			if (var1 > -1 && ScriptFrame.clientPreferences.method2516() > 0 && !playingJingle) { // L: 3844
				PacketBufferNode var3 = class217.getPacketBufferNode(ClientPacket.field3111, packetWriter.isaacCipher); // L: 3845
				var3.packetBuffer.writeInt(var1); // L: 3846
				packetWriter.addNode(var3); // L: 3847
			}

		}
	} // L: 3849

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2091363785"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = VarbitComposition.canvasWidth; // L: 4609
		int var2 = class370.canvasHeight; // L: 4610
		if (super.contentWidth < var1) { // L: 4611
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 4612
		}

		if (ScriptFrame.clientPreferences != null) { // L: 4613
			try {
				class26.method404(class415.client, "resize", new Object[]{class179.getWindowedMode()}); // L: 4615
			} catch (Throwable var4) { // L: 4617
			}
		}

	} // L: 4619

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1467940014"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) { // L: 4622
			GameBuild.method6659(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4623
			if (field717[var1]) { // L: 4624
				field718[var1] = true;
			}

			field719[var1] = field717[var1]; // L: 4625
			field717[var1] = false; // L: 4626
		}

		field603 = cycle; // L: 4628
		viewportX = -1; // L: 4629
		viewportY = -1; // L: 4630
		if (rootInterface != -1) { // L: 4631
			rootWidgetCount = 0; // L: 4632
			RouteStrategy.drawWidgets(rootInterface, 0, 0, VarbitComposition.canvasWidth, class370.canvasHeight, 0, 0, -1); // L: 4633
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4635
		if (showMouseCross) { // L: 4636
			if (mouseCrossColor == 1) { // L: 4637
				class521.field5130[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4638
			}

			if (mouseCrossColor == 2) { // L: 4640
				class521.field5130[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4641
			}
		}

		if (!isMenuOpen) { // L: 4644
			if (viewportX != -1) { // L: 4645
				WorldMapData_0.method5134(viewportX, viewportY);
			}
		} else {
			class16.method234(); // L: 4647
		}

		if (field724 == 3) { // L: 4648
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4649
				if (field719[var1]) { // L: 4650
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4651
				} else if (field718[var1]) { // L: 4653
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4654
				}
			}
		}

		class395.method7464(BuddyRankComparator.Client_plane, class27.localPlayer.x, class27.localPlayer.y, field578); // L: 4658
		field578 = 0; // L: 4659
	} // L: 4660

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Leu;II)Z",
		garbageValue = "-632913058"
	)
	boolean method1266(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 6318
			ObjectSound.friendsChatManager = null; // L: 6319
		} else {
			if (ObjectSound.friendsChatManager == null) { // L: 6322
				ObjectSound.friendsChatManager = new FriendsChatManager(ObjectSound.loginType, class415.client); // L: 6323
			}

			ObjectSound.friendsChatManager.method7855(var1.packetBuffer, var2); // L: 6325
		}

		class127.method3046(); // L: 6327
		var1.serverPacket = null; // L: 6328
		return true; // L: 6329
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Leu;I)Z",
		garbageValue = "431751385"
	)
	boolean method1737(PacketWriter var1) {
		if (ObjectSound.friendsChatManager != null) { // L: 6333
			ObjectSound.friendsChatManager.method7861(var1.packetBuffer); // L: 6334
		}

		class127.method3046(); // L: 6336
		var1.serverPacket = null; // L: 6337
		return true; // L: 6338
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Leu;I)Z",
		garbageValue = "633831171"
	)
	final boolean method1268(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6343
		PacketBuffer var3 = var1.packetBuffer; // L: 6344
		if (var2 == null) { // L: 6345
			return false;
		} else {
			int var6;
			String var32;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6347
					if (var1.field1415) { // L: 6348
						if (!var2.isAvailable(1)) { // L: 6349
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6350
						var1.field1422 = 0; // L: 6351
						var1.field1415 = false; // L: 6352
					}

					var3.offset = 0; // L: 6354
					if (var3.method9036()) { // L: 6355
						if (!var2.isAvailable(1)) { // L: 6356
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6357
						var1.field1422 = 0; // L: 6358
					}

					var1.field1415 = true; // L: 6360
					ServerPacket[] var4 = class11.method128(); // L: 6361
					var5 = var3.readSmartByteShortIsaac(); // L: 6362
					if (var5 < 0 || var5 >= var4.length) { // L: 6363
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6364
					var1.serverPacketLength = var1.serverPacket.length; // L: 6365
				}

				if (var1.serverPacketLength == -1) { // L: 6367
					if (!var2.isAvailable(1)) { // L: 6368
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6369
					var1.serverPacketLength = var3.array[0] & 255; // L: 6370
				}

				if (var1.serverPacketLength == -2) { // L: 6372
					if (!var2.isAvailable(2)) { // L: 6373
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6374
					var3.offset = 0; // L: 6375
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6376
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6378
					return false;
				}

				var3.offset = 0; // L: 6379
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6380
				var1.field1422 = 0; // L: 6381
				timer.method7705(); // L: 6382
				var1.field1426 = var1.field1423; // L: 6383
				var1.field1423 = var1.field1419; // L: 6384
				var1.field1419 = var1.serverPacket; // L: 6385
				int var8;
				int var20;
				if (ServerPacket.field3289 == var1.serverPacket) { // L: 6386
					var6 = var3.method9226(); // L: 6390
					var20 = var3.method9099(); // L: 6391
					var5 = var3.method9099(); // L: 6392
					if (var5 == 65535) { // L: 6393
						var5 = -1; // L: 6394
					}

					NPC var58 = npcs[var20]; // L: 6396
					if (var58 != null) { // L: 6397
						if (var5 == var58.sequence && var5 != -1) { // L: 6398
							var8 = class140.SequenceDefinition_get(var5).field2301; // L: 6399
							if (var8 == 1) { // L: 6400
								var58.sequenceFrame = 0; // L: 6401
								var58.sequenceFrameCycle = 0; // L: 6402
								var58.sequenceDelay = var6; // L: 6403
								var58.field1226 = 0; // L: 6404
							} else if (var8 == 2) { // L: 6406
								var58.field1226 = 0; // L: 6407
							}
						} else if (var5 == -1 || var58.sequence == -1 || class140.SequenceDefinition_get(var5).field2294 >= class140.SequenceDefinition_get(var58.sequence).field2294) { // L: 6410
							var58.sequence = var5; // L: 6411
							var58.sequenceFrame = 0; // L: 6412
							var58.sequenceFrameCycle = 0; // L: 6413
							var58.sequenceDelay = var6; // L: 6414
							var58.field1226 = 0; // L: 6415
							var58.field1252 = var58.pathLength; // L: 6416
						}
					}

					var1.serverPacket = null; // L: 6420
					return true; // L: 6421
				}

				Widget var21;
				if (ServerPacket.field3280 == var1.serverPacket) { // L: 6423
					var20 = var3.method9111(); // L: 6424
					var5 = var3.readUnsignedShort(); // L: 6425
					var21 = Interpreter.getWidget(var20); // L: 6426
					if (var21 != null && var21.type == 0) { // L: 6427
						if (var5 > var21.scrollHeight - var21.height) { // L: 6428
							var5 = var21.scrollHeight - var21.height;
						}

						if (var5 < 0) { // L: 6429
							var5 = 0;
						}

						if (var5 != var21.scrollY) { // L: 6430
							var21.scrollY = var5; // L: 6431
							class303.invalidateWidget(var21); // L: 6432
						}
					}

					var1.serverPacket = null; // L: 6435
					return true; // L: 6436
				}

				int var9;
				int var10;
				int var22;
				if (ServerPacket.field3309 == var1.serverPacket) { // L: 6438
					isCameraLocked = true; // L: 6439
					field763 = false; // L: 6440
					field779 = true; // L: 6441
					class90.field1106 = var3.readUnsignedByte() * 16384; // L: 6442
					ClanSettings.field1742 = var3.readUnsignedByte() * 128; // L: 6443
					var20 = var3.readUnsignedShort(); // L: 6444
					var5 = var3.readUnsignedShort(); // L: 6445
					field759 = var3.readBoolean(); // L: 6446
					var6 = var3.readUnsignedByte(); // L: 6447
					var22 = class90.field1106 * 128 + 64; // L: 6448
					var8 = ClanSettings.field1742 * 16384 + 64; // L: 6449
					boolean var67 = false; // L: 6450
					boolean var64 = false; // L: 6451
					if (field759) { // L: 6452
						var9 = class309.cameraY; // L: 6453
						var10 = class291.getTileHeight(var22, var8, BuddyRankComparator.Client_plane) - var20; // L: 6454
					} else {
						var9 = class291.getTileHeight(PacketWriter.cameraX, World.cameraZ, BuddyRankComparator.Client_plane) - class309.cameraY; // L: 6457
						var10 = var20; // L: 6458
					}

					field760 = new class477(PacketWriter.cameraX, World.cameraZ, var9, var22, var8, var10, var5, var6); // L: 6460
					var1.serverPacket = null; // L: 6461
					return true; // L: 6462
				}

				if (ServerPacket.field3264 == var1.serverPacket) { // L: 6464
					var20 = var3.method9099(); // L: 6465
					var5 = var3.readInt(); // L: 6466
					var6 = var20 >> 10 & 31; // L: 6467
					var22 = var20 >> 5 & 31; // L: 6468
					var8 = var20 & 31; // L: 6469
					var9 = (var22 << 11) + (var6 << 19) + (var8 << 3); // L: 6470
					Widget var74 = Interpreter.getWidget(var5); // L: 6471
					if (var9 != var74.color) { // L: 6472
						var74.color = var9; // L: 6473
						class303.invalidateWidget(var74); // L: 6474
					}

					var1.serverPacket = null; // L: 6476
					return true; // L: 6477
				}

				if (ServerPacket.field3341 == var1.serverPacket) { // L: 6479
					GrandExchangeOfferNameComparator.method6925(class295.field3211); // L: 6480
					var1.serverPacket = null; // L: 6481
					return true; // L: 6482
				}

				if (ServerPacket.field3242 == var1.serverPacket) { // L: 6484
					GrandExchangeOfferNameComparator.method6925(class295.field3206); // L: 6485
					var1.serverPacket = null; // L: 6486
					return true; // L: 6487
				}

				if (ServerPacket.field3347 == var1.serverPacket) { // L: 6489
					rebootTimer = var3.method9100() * 30; // L: 6490
					field707 = cycleCntr; // L: 6491
					var1.serverPacket = null; // L: 6492
					return true; // L: 6493
				}

				boolean var12;
				int var13;
				long var24;
				long var26;
				String var31;
				String var51;
				if (ServerPacket.field3279 == var1.serverPacket) { // L: 6495
					var51 = var3.readStringCp1252NullTerminated(); // L: 6496
					var24 = (long)var3.readUnsignedShort(); // L: 6497
					var26 = (long)var3.readMedium(); // L: 6498
					PlayerType var79 = (PlayerType)class93.findEnumerated(class218.PlayerType_values(), var3.readUnsignedByte()); // L: 6499
					long var29 = (var24 << 32) + var26; // L: 6500
					var12 = false; // L: 6501

					for (var13 = 0; var13 < 100; ++var13) { // L: 6502
						if (field508[var13] == var29) { // L: 6503
							var12 = true; // L: 6504
							break; // L: 6505
						}
					}

					if (class162.friendSystem.isIgnored(new Username(var51, ObjectSound.loginType))) { // L: 6508
						var12 = true;
					}

					if (!var12 && field727 == 0) { // L: 6509
						field508[field732] = var29; // L: 6510
						field732 = (field732 + 1) % 100; // L: 6511
						var31 = AbstractFont.escapeBrackets(class350.method6677(Friend.method7887(var3))); // L: 6512
						byte var68;
						if (var79.isPrivileged) { // L: 6514
							var68 = 7;
						} else {
							var68 = 3; // L: 6515
						}

						if (var79.modIcon != -1) { // L: 6516
							ReflectionCheck.addGameMessage(var68, class59.method1170(var79.modIcon) + var51, var31);
						} else {
							ReflectionCheck.addGameMessage(var68, var51, var31); // L: 6517
						}
					}

					var1.serverPacket = null; // L: 6519
					return true; // L: 6520
				}

				if (ServerPacket.field3247 == var1.serverPacket) { // L: 6522
					return this.method1737(var1); // L: 6523
				}

				if (ServerPacket.field3235 == var1.serverPacket) { // L: 6525
					var20 = var3.method9101(); // L: 6526
					var5 = var3.method9113(); // L: 6527
					Varps.Varps_temp[var20] = var5; // L: 6528
					if (Varps.Varps_main[var20] != var5) { // L: 6529
						Varps.Varps_main[var20] = var5; // L: 6530
					}

					Varcs.changeGameOptions(var20); // L: 6532
					field692[++field693 - 1 & 31] = var20; // L: 6533
					var1.serverPacket = null; // L: 6534
					return true; // L: 6535
				}

				byte var73;
				if (ServerPacket.field3266 == var1.serverPacket) { // L: 6537
					var73 = var3.method9059(); // L: 6538
					var5 = var3.readUnsignedShort(); // L: 6539
					Varps.Varps_temp[var5] = var73; // L: 6540
					if (Varps.Varps_main[var5] != var73) { // L: 6541
						Varps.Varps_main[var5] = var73; // L: 6542
					}

					Varcs.changeGameOptions(var5); // L: 6544
					field692[++field693 - 1 & 31] = var5; // L: 6545
					var1.serverPacket = null; // L: 6546
					return true; // L: 6547
				}

				if (ServerPacket.field3284 == var1.serverPacket) { // L: 6549
					var20 = var3.readInt(); // L: 6550
					if (var20 != field595) { // L: 6551
						field595 = var20; // L: 6552
						class130.method3094(); // L: 6553
					}

					var1.serverPacket = null; // L: 6555
					return true; // L: 6556
				}

				if (ServerPacket.field3274 == var1.serverPacket) { // L: 6558
					hintArrowType = var3.readUnsignedByte(); // L: 6559
					if (hintArrowType == 1) { // L: 6560
						field674 = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 6561
						if (hintArrowType == 2) { // L: 6562
							field587 = 4096; // L: 6563
							field731 = 4096; // L: 6564
						}

						if (hintArrowType == 3) { // L: 6566
							field587 = 0; // L: 6567
							field731 = 4096; // L: 6568
						}

						if (hintArrowType == 4) { // L: 6570
							field587 = 8192; // L: 6571
							field731 = 4096; // L: 6572
						}

						if (hintArrowType == 5) { // L: 6574
							field587 = 4096; // L: 6575
							field731 = 0; // L: 6576
						}

						if (hintArrowType == 6) { // L: 6578
							field587 = 4096; // L: 6579
							field731 = 8192; // L: 6580
						}

						hintArrowType = 2; // L: 6582
						field521 = var3.readUnsignedShort(); // L: 6583
						field522 = var3.readUnsignedShort(); // L: 6584
						field624 = var3.readUnsignedByte() * 2; // L: 6585
					}

					if (hintArrowType == 10) { // L: 6587
						field523 = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 6588
					return true; // L: 6589
				}

				if (ServerPacket.field3333 == var1.serverPacket) { // L: 6591
					var20 = var3.method9101(); // L: 6592
					if (var20 == 65535) { // L: 6593
						var20 = -1;
					}

					rootInterface = var20; // L: 6594
					this.resizeRoot(false); // L: 6595
					class451.Widget_resetModelFrames(var20); // L: 6596
					class1.runWidgetOnLoadListener(rootInterface); // L: 6597

					for (var5 = 0; var5 < 100; ++var5) { // L: 6598
						field717[var5] = true;
					}

					var1.serverPacket = null; // L: 6599
					return true; // L: 6600
				}

				if (ServerPacket.field3342 == var1.serverPacket) { // L: 6602
					class290.updateNpcs(true, var3); // L: 6603
					var1.serverPacket = null; // L: 6604
					return true; // L: 6605
				}

				if (ServerPacket.field3275 == var1.serverPacket) { // L: 6607
					World var54 = new World(); // L: 6608
					var54.host = var3.readStringCp1252NullTerminated(); // L: 6609
					var54.id = var3.readUnsignedShort(); // L: 6610
					var5 = var3.readInt(); // L: 6611
					var54.properties = var5; // L: 6612
					if (var54.isDeadman()) { // L: 6613
						var54.field815 = "beta"; // L: 6614
					}

					AttackOption.method2723(45); // L: 6616
					var2.close(); // L: 6617
					var2 = null; // L: 6618
					GrandExchangeEvent.changeWorld(var54); // L: 6619
					var1.serverPacket = null; // L: 6620
					return false; // L: 6621
				}

				if (ServerPacket.field3328 == var1.serverPacket) { // L: 6623
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) { // L: 6624
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) { // L: 6625
							Varps.Varps_main[var20] = Varps.Varps_temp[var20]; // L: 6626
							Varcs.changeGameOptions(var20); // L: 6627
							field692[++field693 - 1 & 31] = var20; // L: 6628
						}
					}

					var1.serverPacket = null; // L: 6631
					return true; // L: 6632
				}

				if (ServerPacket.field3324 == var1.serverPacket) { // L: 6634
					class290.updateNpcs(false, var3); // L: 6635
					var1.serverPacket = null; // L: 6636
					return true; // L: 6637
				}

				if (ServerPacket.field3236 == var1.serverPacket) { // L: 6639
					return this.method1266(var1, 2); // L: 6640
				}

				if (ServerPacket.field3320 == var1.serverPacket) { // L: 6642
					class396.readReflectionCheck(var3, var1.serverPacketLength); // L: 6643
					var1.serverPacket = null; // L: 6644
					return true; // L: 6645
				}

				if (ServerPacket.field3292 == var1.serverPacket) { // L: 6647
					var20 = var3.readUnsignedByte(); // L: 6648
					var5 = var3.readUnsignedByte(); // L: 6649
					var6 = var3.readUnsignedByte(); // L: 6650
					var22 = var3.readUnsignedByte(); // L: 6651
					field764[var20] = true; // L: 6652
					field765[var20] = var5; // L: 6653
					field766[var20] = var6; // L: 6654
					field767[var20] = var22; // L: 6655
					field768[var20] = 0; // L: 6656
					var1.serverPacket = null; // L: 6657
					return true; // L: 6658
				}

				if (ServerPacket.field3329 == var1.serverPacket) { // L: 6660
					class403.field4504 = var3.method9258(); // L: 6661
					class108.field1394 = var3.method9130(); // L: 6662

					while (var3.offset < var1.serverPacketLength) { // L: 6663
						var20 = var3.readUnsignedByte(); // L: 6664
						class295 var89 = class162.method3410()[var20]; // L: 6665
						GrandExchangeOfferNameComparator.method6925(var89); // L: 6666
					}

					var1.serverPacket = null; // L: 6668
					return true; // L: 6669
				}

				if (ServerPacket.field3348 == var1.serverPacket) { // L: 6671
					var5 = var3.readUnsignedShort(); // L: 6676
					var22 = var3.readUnsignedShort(); // L: 6677
					var20 = var3.method9099(); // L: 6678
					var6 = var3.method9099(); // L: 6679
					class1.method5(var20, var5, var6, var22); // L: 6680
					var1.serverPacket = null; // L: 6681
					return true; // L: 6682
				}

				if (ServerPacket.field3306 == var1.serverPacket) { // L: 6684
					destinationX = var3.readUnsignedByte(); // L: 6685
					if (destinationX == 255) { // L: 6686
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6687
					if (destinationY == 255) { // L: 6688
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6689
					return true; // L: 6690
				}

				if (ServerPacket.field3228 == var1.serverPacket) { // L: 6692
					if (class72.field895 == null) { // L: 6693
						class72.field895 = new class454(class163.Ignored_cached);
					}

					class521 var53 = class163.Ignored_cached.method8310(var3); // L: 6694
					class72.field895.field4760.vmethod8763(var53.field5128, var53.field5129); // L: 6695
					field545[++field700 - 1 & 31] = var53.field5128; // L: 6696
					var1.serverPacket = null; // L: 6697
					return true; // L: 6698
				}

				if (ServerPacket.field3256 == var1.serverPacket) { // L: 6700
					class162.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 6701
					TextureProvider.FriendSystem_invalidateIgnoreds(); // L: 6702
					field701 = cycleCntr; // L: 6703
					var1.serverPacket = null; // L: 6704
					return true; // L: 6705
				}

				boolean var77;
				if (ServerPacket.field3343 == var1.serverPacket) { // L: 6707
					var77 = var3.method9226() == 1; // L: 6708
					var5 = var3.method9111(); // L: 6709
					var21 = Interpreter.getWidget(var5); // L: 6710
					class145.method3223(var21, class27.localPlayer.appearance, var77); // L: 6711
					class303.invalidateWidget(var21); // L: 6712
					var1.serverPacket = null; // L: 6713
					return true; // L: 6714
				}

				if (ServerPacket.field3291 == var1.serverPacket) { // L: 6716
					isCameraLocked = true; // L: 6717
					field763 = false; // L: 6718
					field758 = false; // L: 6719
					class238.field2688 = var3.readUnsignedByte() * 16384; // L: 6720
					Language.field4367 = var3.readUnsignedByte() * 128; // L: 6721
					class53.field364 = var3.readUnsignedShort(); // L: 6722
					MenuAction.field900 = var3.readUnsignedByte(); // L: 6723
					ClanChannelMember.field1656 = var3.readUnsignedByte(); // L: 6724
					if (ClanChannelMember.field1656 >= 100) { // L: 6725
						var20 = class238.field2688 * 128 + 64; // L: 6726
						var5 = Language.field4367 * 16384 + 64; // L: 6727
						var6 = class291.getTileHeight(var20, var5, BuddyRankComparator.Client_plane) - class53.field364; // L: 6728
						var22 = var20 - PacketWriter.cameraX; // L: 6729
						var8 = var6 - class309.cameraY; // L: 6730
						var9 = var5 - World.cameraZ; // L: 6731
						var10 = (int)Math.sqrt((double)(var9 * var9 + var22 * var22)); // L: 6732
						ModeWhere.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047; // L: 6733
						class13.cameraYaw = (int)(Math.atan2((double)var22, (double)var9) * -325.9490051269531D) & 2047; // L: 6734
						if (ModeWhere.cameraPitch < 128) { // L: 6735
							ModeWhere.cameraPitch = 128;
						}

						if (ModeWhere.cameraPitch > 383) { // L: 6736
							ModeWhere.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 6738
					return true; // L: 6739
				}

				if (ServerPacket.field3271 == var1.serverPacket) { // L: 6741
					var20 = var3.readUnsignedShort(); // L: 6742
					var5 = var3.readUnsignedByte(); // L: 6743
					var6 = var3.readUnsignedShort(); // L: 6744
					class211.queueSoundEffect(var20, var5, var6); // L: 6745
					var1.serverPacket = null; // L: 6746
					return true; // L: 6747
				}

				int var11;
				int var14;
				int var15;
				if (ServerPacket.field3330 == var1.serverPacket) { // L: 6749
					isCameraLocked = true; // L: 6750
					field763 = false; // L: 6751
					field758 = true; // L: 6752
					class238.field2688 = var3.readUnsignedByte() * 16384; // L: 6753
					Language.field4367 = var3.readUnsignedByte() * 128; // L: 6754
					class53.field364 = var3.readUnsignedShort(); // L: 6755
					var20 = var3.readUnsignedShort(); // L: 6756
					var5 = var3.readUnsignedByte(); // L: 6757
					var6 = class238.field2688 * 128 + 64; // L: 6758
					var22 = Language.field4367 * 16384 + 64; // L: 6759
					var8 = class291.getTileHeight(var6, var22, BuddyRankComparator.Client_plane) - class53.field364; // L: 6760
					var9 = var6 - PacketWriter.cameraX; // L: 6761
					var10 = var8 - class309.cameraY; // L: 6762
					var11 = var22 - World.cameraZ; // L: 6763
					double var84 = Math.sqrt((double)(var11 * var11 + var9 * var9)); // L: 6764
					var14 = ByteArrayPool.method7694((int)(Math.atan2((double)var10, var84) * 325.9490051269531D) & 2047); // L: 6765
					var15 = class106.method2747((int)(Math.atan2((double)var9, (double)var11) * -325.9490051269531D) & 2047); // L: 6766
					field762 = new class478(ModeWhere.cameraPitch, var14, var20, var5); // L: 6767
					field761 = new class478(class13.cameraYaw, var15, var20, var5); // L: 6768
					var1.serverPacket = null; // L: 6769
					return true; // L: 6770
				}

				if (ServerPacket.field3257 == var1.serverPacket && isCameraLocked) { // L: 6772 6773
					field763 = true; // L: 6774
					field758 = false; // L: 6775
					field779 = false; // L: 6776

					for (var20 = 0; var20 < 5; ++var20) { // L: 6777
						field764[var20] = false; // L: 6778
					}

					var1.serverPacket = null; // L: 6780
					return true; // L: 6781
				}

				if (ServerPacket.field3300 == var1.serverPacket) { // L: 6784
					var20 = var3.readInt(); // L: 6785
					var5 = var3.readUnsignedShort(); // L: 6786
					if (var20 < -70000) { // L: 6787
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 6789
						var21 = Interpreter.getWidget(var20);
					} else {
						var21 = null; // L: 6790
					}

					for (; var3.offset < var1.serverPacketLength; KitDefinition.itemContainerSetItem(var5, var22, var8 - 1, var9)) { // L: 6791 6805
						var22 = var3.readUShortSmart(); // L: 6792
						var8 = var3.readUnsignedShort(); // L: 6793
						var9 = 0; // L: 6794
						if (var8 != 0) { // L: 6795
							var9 = var3.readUnsignedByte(); // L: 6796
							if (var9 == 255) { // L: 6797
								var9 = var3.readInt();
							}
						}

						if (var21 != null && var22 >= 0 && var22 < var21.itemIds.length) { // L: 6799 6800
							var21.itemIds[var22] = var8; // L: 6801
							var21.field3765[var22] = var9; // L: 6802
						}
					}

					if (var21 != null) { // L: 6807
						class303.invalidateWidget(var21);
					}

					class326.method6120(); // L: 6808
					field575[++field695 - 1 & 31] = var5 & 32767; // L: 6809
					var1.serverPacket = null; // L: 6810
					return true; // L: 6811
				}

				if (ServerPacket.field3302 == var1.serverPacket) { // L: 6813
					class162.friendSystem.method1891(); // L: 6814
					field701 = cycleCntr; // L: 6815
					var1.serverPacket = null; // L: 6816
					return true; // L: 6817
				}

				if (ServerPacket.field3251 == var1.serverPacket) { // L: 6819
					field763 = false; // L: 6820
					isCameraLocked = false; // L: 6821
					field779 = false; // L: 6822
					field758 = false; // L: 6823
					class238.field2688 = 0; // L: 6824
					Language.field4367 = 0; // L: 6825
					class53.field364 = 0; // L: 6826
					field759 = false; // L: 6827
					MenuAction.field900 = 0; // L: 6828
					ClanChannelMember.field1656 = 0; // L: 6829
					class166.field1794 = 0; // L: 6830
					UserComparator8.field1451 = 0; // L: 6831
					class90.field1106 = 0; // L: 6832
					ClanSettings.field1742 = 0; // L: 6833
					Buddy.field4655 = 0; // L: 6834
					field760 = null; // L: 6835
					field762 = null; // L: 6836
					field761 = null; // L: 6837

					for (var20 = 0; var20 < 5; ++var20) { // L: 6838
						field764[var20] = false; // L: 6839
					}

					var1.serverPacket = null; // L: 6841
					return true; // L: 6842
				}

				if (ServerPacket.field3335 == var1.serverPacket) { // L: 6844
					isCameraLocked = true; // L: 6845
					field763 = false; // L: 6846
					field779 = false; // L: 6847
					class90.field1106 = var3.readUnsignedByte() * 16384; // L: 6848
					ClanSettings.field1742 = var3.readUnsignedByte() * 128; // L: 6849
					Buddy.field4655 = var3.readUnsignedShort(); // L: 6850
					UserComparator8.field1451 = var3.readUnsignedByte(); // L: 6851
					class166.field1794 = var3.readUnsignedByte(); // L: 6852
					if (class166.field1794 >= 100) { // L: 6853
						PacketWriter.cameraX = class90.field1106 * 128 + 64; // L: 6854
						World.cameraZ = ClanSettings.field1742 * 16384 + 64; // L: 6855
						class309.cameraY = class291.getTileHeight(PacketWriter.cameraX, World.cameraZ, BuddyRankComparator.Client_plane) - Buddy.field4655; // L: 6856
					}

					var1.serverPacket = null; // L: 6858
					return true; // L: 6859
				}

				if (ServerPacket.field3246 == var1.serverPacket) { // L: 6861
					var51 = var3.readStringCp1252NullTerminated(); // L: 6862
					var32 = AbstractFont.escapeBrackets(class350.method6677(Friend.method7887(var3))); // L: 6863
					ReflectionCheck.addGameMessage(6, var51, var32); // L: 6864
					var1.serverPacket = null; // L: 6865
					return true; // L: 6866
				}

				if (ServerPacket.field3321 == var1.serverPacket) { // L: 6868
					class403.field4504 = var3.readUnsignedByte(); // L: 6869
					class108.field1394 = var3.readUnsignedByte(); // L: 6870

					for (var20 = class108.field1394; var20 < class108.field1394 + 8; ++var20) { // L: 6871
						for (var5 = class403.field4504; var5 < class403.field4504 + 8; ++var5) { // L: 6872
							if (groundItems[BuddyRankComparator.Client_plane][var20][var5] != null) { // L: 6873
								groundItems[BuddyRankComparator.Client_plane][var20][var5] = null; // L: 6874
								class10.updateItemPile(var20, var5); // L: 6875
							}
						}
					}

					for (PendingSpawn var52 = (PendingSpawn)pendingSpawns.last(); var52 != null; var52 = (PendingSpawn)pendingSpawns.previous()) { // L: 6879 6880 6882
						if (var52.x >= class108.field1394 && var52.x < class108.field1394 + 8 && var52.y >= class403.field4504 && var52.y < class403.field4504 + 8 && var52.plane == BuddyRankComparator.Client_plane) { // L: 6881
							var52.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 6884
					return true; // L: 6885
				}

				int var16;
				GameObject var41;
				String var42;
				if (ServerPacket.field3252 == var1.serverPacket) { // L: 6887
					var73 = var3.readByte(); // L: 6888
					var32 = var3.readStringCp1252NullTerminated(); // L: 6889
					long var35 = (long)var3.readUnsignedShort(); // L: 6890
					long var37 = (long)var3.readMedium(); // L: 6891
					PlayerType var72 = (PlayerType)class93.findEnumerated(class218.PlayerType_values(), var3.readUnsignedByte()); // L: 6892
					long var39 = (var35 << 32) + var37; // L: 6893
					boolean var65 = false; // L: 6894
					var41 = null; // L: 6895
					ClanChannel var93 = var73 >= 0 ? currentClanChannels[var73] : class9.guestClanChannel; // L: 6897
					if (var93 == null) { // L: 6898
						var65 = true; // L: 6899
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var72.isUser && class162.friendSystem.isIgnored(new Username(var32, ObjectSound.loginType))) { // L: 6908 6909
									var65 = true;
								}
								break;
							}

							if (var39 == field508[var15]) { // L: 6903
								var65 = true; // L: 6904
								break; // L: 6905
							}

							++var15; // L: 6902
						}
					}

					if (!var65) { // L: 6912
						field508[field732] = var39; // L: 6913
						field732 = (field732 + 1) % 100; // L: 6914
						var42 = AbstractFont.escapeBrackets(Friend.method7887(var3)); // L: 6915
						var16 = var73 >= 0 ? 41 : 44; // L: 6916
						if (var72.modIcon != -1) { // L: 6917
							Projectile.addChatMessage(var16, class59.method1170(var72.modIcon) + var32, var42, var93.name);
						} else {
							Projectile.addChatMessage(var16, var32, var42, var93.name); // L: 6918
						}
					}

					var1.serverPacket = null; // L: 6920
					return true; // L: 6921
				}

				if (ServerPacket.field3265 == var1.serverPacket) { // L: 6923
					var10 = var3.method9130(); // L: 6932
					var6 = var3.method9106(); // L: 6933
					var20 = var6 >> 16; // L: 6934
					var5 = var6 >> 8 & 255; // L: 6935
					var22 = var20 + (var6 >> 4 & 7); // L: 6936
					var8 = var5 + (var6 & 7); // L: 6937
					var9 = var3.readUnsignedShort(); // L: 6938
					var11 = var3.readUnsignedShort(); // L: 6939
					if (var22 >= 0 && var8 >= 0 && var22 < 104 && var8 < 104) { // L: 6940
						var22 = var22 * 128 + 64; // L: 6941
						var8 = var8 * 128 + 64; // L: 6942
						GraphicsObject var94 = new GraphicsObject(var9, BuddyRankComparator.Client_plane, var22, var8, class291.getTileHeight(var22, var8, BuddyRankComparator.Client_plane) - var10, var11, cycle); // L: 6943
						graphicsObjects.addFirst(var94); // L: 6944
					}

					var1.serverPacket = null; // L: 6946
					return true; // L: 6947
				}

				if (ServerPacket.field3229 == var1.serverPacket) { // L: 6949
					var20 = var3.readUnsignedByte(); // L: 6950
					if (var3.readUnsignedByte() == 0) { // L: 6951
						grandExchangeOffers[var20] = new GrandExchangeOffer(); // L: 6952
						var3.offset += 18; // L: 6953
					} else {
						--var3.offset; // L: 6956
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false); // L: 6957
					}

					field705 = cycleCntr; // L: 6959
					var1.serverPacket = null; // L: 6960
					return true; // L: 6961
				}

				if (ServerPacket.field3272 == var1.serverPacket) { // L: 6963
					var20 = var3.method9099(); // L: 6964
					var5 = var3.method9113(); // L: 6965
					var21 = Interpreter.getWidget(var5); // L: 6966
					if (var21.modelType != 2 || var20 != var21.modelId) { // L: 6967
						var21.modelType = 2; // L: 6968
						var21.modelId = var20; // L: 6969
						class303.invalidateWidget(var21); // L: 6970
					}

					var1.serverPacket = null; // L: 6972
					return true; // L: 6973
				}

				int var63;
				if (ServerPacket.field3299 == var1.serverPacket) { // L: 6975
					var9 = var3.method9258(); // L: 6986
					var10 = var9 >> 2; // L: 6987
					var11 = var9 & 3; // L: 6988
					var63 = field713[var10]; // L: 6989
					var13 = var3.readUnsignedShort(); // L: 6990
					var6 = var3.readMedium(); // L: 6991
					var20 = var6 >> 16; // L: 6992
					var5 = var6 >> 8 & 255; // L: 6993
					var22 = var20 + (var6 >> 4 & 7); // L: 6994
					var8 = var5 + (var6 & 7); // L: 6995
					if (var22 >= 0 && var8 >= 0 && var22 < 103 && var8 < 103) { // L: 6996
						if (var63 == 0) { // L: 6997
							WallObject var92 = class173.scene.method4636(BuddyRankComparator.Client_plane, var22, var8); // L: 6998
							if (var92 != null) { // L: 6999
								var15 = class318.Entity_unpackID(var92.tag); // L: 7000
								if (var10 == 2) { // L: 7001
									var92.renderable1 = new DynamicObject(var15, 2, var11 + 4, BuddyRankComparator.Client_plane, var22, var8, var13, false, var92.renderable1); // L: 7002
									var92.renderable2 = new DynamicObject(var15, 2, var11 + 1 & 3, BuddyRankComparator.Client_plane, var22, var8, var13, false, var92.renderable2); // L: 7003
								} else {
									var92.renderable1 = new DynamicObject(var15, var10, var11, BuddyRankComparator.Client_plane, var22, var8, var13, false, var92.renderable1); // L: 7005
								}
							}
						} else if (var63 == 1) { // L: 7008
							DecorativeObject var91 = class173.scene.method4637(BuddyRankComparator.Client_plane, var22, var8); // L: 7009
							if (var91 != null) { // L: 7010
								var15 = class318.Entity_unpackID(var91.tag); // L: 7011
								if (var10 != 4 && var10 != 5) { // L: 7012
									if (var10 == 6) { // L: 7015
										var91.renderable1 = new DynamicObject(var15, 4, var11 + 4, BuddyRankComparator.Client_plane, var22, var8, var13, false, var91.renderable1); // L: 7016
									} else if (var10 == 7) { // L: 7018
										var91.renderable1 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, BuddyRankComparator.Client_plane, var22, var8, var13, false, var91.renderable1); // L: 7019
									} else if (var10 == 8) { // L: 7021
										var91.renderable1 = new DynamicObject(var15, 4, var11 + 4, BuddyRankComparator.Client_plane, var22, var8, var13, false, var91.renderable1); // L: 7022
										var91.renderable2 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, BuddyRankComparator.Client_plane, var22, var8, var13, false, var91.renderable2); // L: 7023
									}
								} else {
									var91.renderable1 = new DynamicObject(var15, 4, var11, BuddyRankComparator.Client_plane, var22, var8, var13, false, var91.renderable1); // L: 7013
								}
							}
						} else if (var63 == 2) { // L: 7027
							var41 = class173.scene.getGameObject(BuddyRankComparator.Client_plane, var22, var8); // L: 7028
							if (var10 == 11) { // L: 7029
								var10 = 10; // L: 7030
							}

							if (var41 != null) { // L: 7032
								var41.renderable = new DynamicObject(class318.Entity_unpackID(var41.tag), var10, var11, BuddyRankComparator.Client_plane, var22, var8, var13, false, var41.renderable); // L: 7033
							}
						} else if (var63 == 3) { // L: 7036
							GroundObject var90 = class173.scene.getGroundObject(BuddyRankComparator.Client_plane, var22, var8); // L: 7037
							if (var90 != null) { // L: 7038
								var90.renderable = new DynamicObject(class318.Entity_unpackID(var90.tag), 22, var11, BuddyRankComparator.Client_plane, var22, var8, var13, false, var90.renderable); // L: 7039
							}
						}
					}

					var1.serverPacket = null; // L: 7043
					return true; // L: 7044
				}

				if (ServerPacket.field3248 == var1.serverPacket) { // L: 7046
					class72.field895 = new class454(class163.Ignored_cached); // L: 7047
					var1.serverPacket = null; // L: 7048
					return true; // L: 7049
				}

				if (ServerPacket.field3323 == var1.serverPacket) { // L: 7051
					class238.method4846(var3.readStringCp1252NullTerminated()); // L: 7052
					var1.serverPacket = null; // L: 7053
					return true; // L: 7054
				}

				if (ServerPacket.field3261 == var1.serverPacket) { // L: 7056
					GrandExchangeOfferNameComparator.method6925(class295.field3212); // L: 7057
					var1.serverPacket = null; // L: 7058
					return true; // L: 7059
				}

				if (ServerPacket.field3239 == var1.serverPacket) { // L: 7061
					isCameraLocked = true; // L: 7062
					field763 = false; // L: 7063
					field758 = true; // L: 7064
					var20 = class106.method2747(var3.readShort() & 2027); // L: 7065
					var5 = ByteArrayPool.method7694(var3.readShort() & 2027); // L: 7066
					var6 = var3.readUnsignedShort(); // L: 7067
					var22 = var3.readUnsignedByte(); // L: 7068
					field762 = new class478(ModeWhere.cameraPitch, var5, var6, var22); // L: 7069
					field761 = new class478(class13.cameraYaw, var20, var6, var22); // L: 7070
					var1.serverPacket = null; // L: 7071
					return true; // L: 7072
				}

				Widget var82;
				if (ServerPacket.field3305 == var1.serverPacket) { // L: 7074
					var20 = var3.readInt(); // L: 7075
					var82 = Interpreter.getWidget(var20); // L: 7076

					for (var6 = 0; var6 < var82.itemIds.length; ++var6) { // L: 7077
						var82.itemIds[var6] = -1; // L: 7078
						var82.itemIds[var6] = 0; // L: 7079
					}

					class303.invalidateWidget(var82); // L: 7081
					var1.serverPacket = null; // L: 7082
					return true; // L: 7083
				}

				if (ServerPacket.field3241 == var1.serverPacket) { // L: 7085
					var20 = var3.method9144(); // L: 7086
					var32 = var3.readStringCp1252NullTerminated(); // L: 7087
					var21 = Interpreter.getWidget(var20); // L: 7088
					if (!var32.equals(var21.text)) { // L: 7089
						var21.text = var32; // L: 7090
						class303.invalidateWidget(var21); // L: 7091
					}

					var1.serverPacket = null; // L: 7093
					return true; // L: 7094
				}

				if (ServerPacket.field3262 == var1.serverPacket) { // L: 7096
					var20 = var3.method9130(); // L: 7097
					var5 = var3.method9100(); // L: 7098
					if (var5 == 65535) { // L: 7099
						var5 = -1; // L: 7100
					}

					SoundCache.performPlayerAnimation(class27.localPlayer, var5, var20); // L: 7102
					var1.serverPacket = null; // L: 7103
					return true; // L: 7104
				}

				if (ServerPacket.field3245 == var1.serverPacket) { // L: 7106
					var20 = var3.method9099(); // L: 7107
					class7.method46(var20); // L: 7108
					field575[++field695 - 1 & 31] = var20 & 32767; // L: 7109
					var1.serverPacket = null; // L: 7110
					return true; // L: 7111
				}

				if (ServerPacket.field3322 == var1.serverPacket) { // L: 7113
					var20 = var3.method9103(); // L: 7114
					var5 = var3.readInt(); // L: 7115
					var21 = Interpreter.getWidget(var5); // L: 7116
					if (var20 != var21.sequenceId || var20 == -1) { // L: 7117
						var21.sequenceId = var20; // L: 7118
						var21.modelFrame = 0; // L: 7119
						var21.modelFrameCycle = 0; // L: 7120
						class303.invalidateWidget(var21); // L: 7121
					}

					var1.serverPacket = null; // L: 7123
					return true; // L: 7124
				}

				if (ServerPacket.field3307 == var1.serverPacket) { // L: 7126
					var20 = var3.readUnsignedShort(); // L: 7127
					if (var20 == 65535) { // L: 7128
						var20 = -1;
					}

					class12.playSong(var20); // L: 7129
					var1.serverPacket = null; // L: 7130
					return true; // L: 7131
				}

				if (ServerPacket.field3319 == var1.serverPacket) { // L: 7133
					var20 = var3.method9105(); // L: 7134
					var5 = var3.method9101(); // L: 7135
					if (var5 == 65535) { // L: 7136
						var5 = -1;
					}

					class406.method7644(var5, var20); // L: 7137
					var1.serverPacket = null; // L: 7138
					return true; // L: 7139
				}

				if (ServerPacket.field3243 == var1.serverPacket) { // L: 7141
					GrandExchangeOfferNameComparator.method6925(class295.field3215); // L: 7142
					var1.serverPacket = null; // L: 7143
					return true; // L: 7144
				}

				long var33;
				long var44;
				if (ServerPacket.field3273 == var1.serverPacket) { // L: 7146
					var51 = var3.readStringCp1252NullTerminated(); // L: 7147
					var24 = var3.readLong(); // L: 7148
					var26 = (long)var3.readUnsignedShort(); // L: 7149
					var44 = (long)var3.readMedium(); // L: 7150
					PlayerType var95 = (PlayerType)class93.findEnumerated(class218.PlayerType_values(), var3.readUnsignedByte()); // L: 7151
					var33 = (var26 << 32) + var44; // L: 7152
					boolean var66 = false; // L: 7153

					for (var15 = 0; var15 < 100; ++var15) { // L: 7154
						if (var33 == field508[var15]) { // L: 7155
							var66 = true; // L: 7156
							break; // L: 7157
						}
					}

					if (var95.isUser && class162.friendSystem.isIgnored(new Username(var51, ObjectSound.loginType))) { // L: 7160 7161
						var66 = true;
					}

					if (!var66 && field727 == 0) { // L: 7163
						field508[field732] = var33; // L: 7164
						field732 = (field732 + 1) % 100; // L: 7165
						var42 = AbstractFont.escapeBrackets(class350.method6677(Friend.method7887(var3))); // L: 7166
						if (var95.modIcon != -1) { // L: 7167
							Projectile.addChatMessage(9, class59.method1170(var95.modIcon) + var51, var42, FriendSystem.base37DecodeLong(var24));
						} else {
							Projectile.addChatMessage(9, var51, var42, FriendSystem.base37DecodeLong(var24)); // L: 7168
						}
					}

					var1.serverPacket = null; // L: 7170
					return true; // L: 7171
				}

				InterfaceParent var56;
				if (ServerPacket.field3286 == var1.serverPacket) { // L: 7173
					var20 = var3.readInt(); // L: 7174
					var5 = var3.readUnsignedByte(); // L: 7175
					var6 = var3.method9101(); // L: 7176
					var56 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7177
					if (var56 != null) { // L: 7178
						class260.closeInterface(var56, var6 != var56.group);
					}

					ReflectionCheck.method703(var20, var6, var5); // L: 7179
					var1.serverPacket = null; // L: 7180
					return true; // L: 7181
				}

				if (ServerPacket.field3259 == var1.serverPacket) { // L: 7183
					class403.field4504 = var3.readUnsignedByte(); // L: 7184
					class108.field1394 = var3.readUnsignedByte(); // L: 7185
					var1.serverPacket = null; // L: 7186
					return true; // L: 7187
				}

				Widget var97;
				if (ServerPacket.field3238 == var1.serverPacket) { // L: 7189
					var20 = var3.method9113(); // L: 7190
					var5 = var3.method9111(); // L: 7191
					InterfaceParent var80 = (InterfaceParent)interfaceParents.get((long)var5); // L: 7192
					var56 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7193
					if (var56 != null) { // L: 7194
						class260.closeInterface(var56, var80 == null || var56.group != var80.group);
					}

					if (var80 != null) { // L: 7195
						var80.remove(); // L: 7196
						interfaceParents.put(var80, (long)var20); // L: 7197
					}

					var97 = Interpreter.getWidget(var5); // L: 7199
					if (var97 != null) { // L: 7200
						class303.invalidateWidget(var97);
					}

					var97 = Interpreter.getWidget(var20); // L: 7201
					if (var97 != null) { // L: 7202
						class303.invalidateWidget(var97); // L: 7203
						class238.revalidateWidgetScroll(class179.Widget_interfaceComponents[var97.id >>> 16], var97, true); // L: 7204
					}

					if (rootInterface != -1) { // L: 7206
						class295.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 7207
					return true; // L: 7208
				}

				if (ServerPacket.field3350 == var1.serverPacket) { // L: 7210
					var8 = var3.method9101(); // L: 7217
					var5 = var3.readUnsignedShort(); // L: 7218
					if (var5 == 65535) { // L: 7219
						var5 = -1; // L: 7220
					}

					var20 = var3.method9100(); // L: 7222
					if (var20 == 65535) { // L: 7223
						var20 = -1; // L: 7224
					}

					var9 = var3.readUnsignedShort(); // L: 7226
					var22 = var3.method9100(); // L: 7227
					var6 = var3.method9101(); // L: 7228
					ArrayList var71 = new ArrayList(); // L: 7229
					var71.add(var20); // L: 7230
					var71.add(var5); // L: 7231
					class1.method7(var71, var6, var22, var8, var9); // L: 7232
					var1.serverPacket = null; // L: 7233
					return true; // L: 7234
				}

				boolean var62;
				if (ServerPacket.field3318 == var1.serverPacket) { // L: 7236
					var73 = var3.readByte(); // L: 7237
					var24 = (long)var3.readUnsignedShort(); // L: 7238
					var26 = (long)var3.readMedium(); // L: 7239
					var44 = (var24 << 32) + var26; // L: 7240
					var62 = false; // L: 7241
					ClanChannel var43 = var73 >= 0 ? currentClanChannels[var73] : class9.guestClanChannel; // L: 7242
					if (var43 == null) { // L: 7243
						var62 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 7245
							if (var44 == field508[var13]) { // L: 7246
								var62 = true; // L: 7247
								break; // L: 7248
							}
						}
					}

					if (!var62) { // L: 7252
						field508[field732] = var44; // L: 7253
						field732 = (field732 + 1) % 100; // L: 7254
						var31 = Friend.method7887(var3); // L: 7255
						var14 = var73 >= 0 ? 43 : 46; // L: 7256
						Projectile.addChatMessage(var14, "", var31, var43.name); // L: 7257
					}

					var1.serverPacket = null; // L: 7259
					return true; // L: 7260
				}

				if (ServerPacket.field3317 == var1.serverPacket) { // L: 7262
					var77 = var3.method9258() == 1; // L: 7263
					var5 = var3.method9111(); // L: 7264
					var21 = Interpreter.getWidget(var5); // L: 7265
					if (var77 != var21.isHidden) { // L: 7266
						var21.isHidden = var77; // L: 7267
						class303.invalidateWidget(var21); // L: 7268
					}

					var1.serverPacket = null; // L: 7270
					return true; // L: 7271
				}

				if (ServerPacket.field3327 == var1.serverPacket) { // L: 7273
					var20 = var3.readUnsignedByte(); // L: 7274
					ChatChannel.forceDisconnect(var20); // L: 7275
					var1.serverPacket = null; // L: 7276
					return false; // L: 7277
				}

				if (ServerPacket.field3344 == var1.serverPacket) { // L: 7279
					return this.method1266(var1, 1); // L: 7280
				}

				if (ServerPacket.field3268 == var1.serverPacket) { // L: 7282
					class326.method6120(); // L: 7283
					weight = var3.readShort(); // L: 7284
					field707 = cycleCntr; // L: 7285
					var1.serverPacket = null; // L: 7286
					return true; // L: 7287
				}

				if (ServerPacket.field3314 == var1.serverPacket) { // L: 7289
					class326.method6120(); // L: 7290
					field723 = var3.readUnsignedShort(); // L: 7291
					field707 = cycleCntr; // L: 7292
					var1.serverPacket = null; // L: 7293
					return true; // L: 7294
				}

				if (ServerPacket.field3346 == var1.serverPacket) { // L: 7296
					var5 = var3.method9101(); // L: 7299
					var20 = var3.method9101(); // L: 7300
					class90.method2339(var20, var5); // L: 7301
					var1.serverPacket = null; // L: 7302
					return true; // L: 7303
				}

				if (ServerPacket.field3326 == var1.serverPacket) { // L: 7305
					JagexCache.loadRegions(false, var1.packetBuffer); // L: 7306
					var1.serverPacket = null; // L: 7307
					return true; // L: 7308
				}

				if (ServerPacket.field3267 == var1.serverPacket) { // L: 7310
					class326.method6120(); // L: 7311
					var20 = var3.method9113(); // L: 7312
					var5 = var3.readUnsignedByte(); // L: 7313
					var6 = var3.method9130(); // L: 7314
					experience[var6] = var20; // L: 7315
					currentLevels[var6] = var5; // L: 7316
					levels[var6] = 1; // L: 7317

					for (var22 = 0; var22 < 98; ++var22) { // L: 7318
						if (var20 >= Skills.Skills_experienceTable[var22]) {
							levels[var6] = var22 + 2;
						}
					}

					field794[++field697 - 1 & 31] = var6; // L: 7319
					var1.serverPacket = null; // L: 7320
					return true; // L: 7321
				}

				if (ServerPacket.field3249 == var1.serverPacket) { // L: 7323
					byte var61 = var3.readByte(); // L: 7339
					int var18 = var3.method9226(); // L: 7340
					int var17 = var3.readUnsignedByte(); // L: 7341
					var14 = var3.readUnsignedByte() * 4; // L: 7342
					byte var59 = var3.method9121(); // L: 7343
					var13 = var3.method9130() * 4; // L: 7344
					var6 = var3.method9106(); // L: 7345
					var20 = var6 >> 16; // L: 7346
					var5 = var6 >> 8 & 255; // L: 7347
					var22 = var20 + (var6 >> 4 & 7); // L: 7348
					var8 = var5 + (var6 & 7); // L: 7349
					var11 = var3.method9166(); // L: 7350
					var63 = var3.method9101(); // L: 7351
					var16 = var3.method9100(); // L: 7352
					var15 = var3.method9101(); // L: 7353
					var9 = var61 + var22; // L: 7354
					var10 = var59 + var8; // L: 7355
					if (var22 >= 0 && var8 >= 0 && var22 < 104 && var8 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var63 != 65535) { // L: 7356
						var22 = var22 * 128 + 64; // L: 7357
						var8 = var8 * 128 + 64; // L: 7358
						var9 = var9 * 128 + 64; // L: 7359
						var10 = var10 * 128 + 64; // L: 7360
						Projectile var19 = new Projectile(var63, BuddyRankComparator.Client_plane, var22, var8, class291.getTileHeight(var22, var8, BuddyRankComparator.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var14); // L: 7361
						var19.setDestination(var9, var10, class291.getTileHeight(var9, var10, BuddyRankComparator.Client_plane) - var14, var15 + cycle); // L: 7362
						projectiles.addFirst(var19); // L: 7363
					}

					var1.serverPacket = null; // L: 7365
					return true; // L: 7366
				}

				if (ServerPacket.field3298 == var1.serverPacket) { // L: 7368
					GrandExchangeOfferNameComparator.method6925(class295.field3210); // L: 7369
					var1.serverPacket = null; // L: 7370
					return true; // L: 7371
				}

				if (ServerPacket.field3254 == var1.serverPacket) { // L: 7373
					var20 = var3.readInt(); // L: 7374
					InterfaceParent var88 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7375
					if (var88 != null) { // L: 7376
						class260.closeInterface(var88, true);
					}

					if (meslayerContinueWidget != null) { // L: 7377
						class303.invalidateWidget(meslayerContinueWidget); // L: 7378
						meslayerContinueWidget = null; // L: 7379
					}

					var1.serverPacket = null; // L: 7381
					return true; // L: 7382
				}

				if (ServerPacket.field3293 == var1.serverPacket) { // L: 7384
					minimapState = var3.readUnsignedByte(); // L: 7385
					var1.serverPacket = null; // L: 7386
					return true; // L: 7387
				}

				if (ServerPacket.field3315 == var1.serverPacket) { // L: 7389
					field694 = cycleCntr; // L: 7390
					var73 = var3.readByte(); // L: 7391
					if (var1.serverPacketLength == 1) { // L: 7392
						if (var73 >= 0) { // L: 7393
							currentClanChannels[var73] = null;
						} else {
							class9.guestClanChannel = null; // L: 7394
						}

						var1.serverPacket = null; // L: 7395
						return true; // L: 7396
					}

					if (var73 >= 0) { // L: 7398
						currentClanChannels[var73] = new ClanChannel(var3); // L: 7399
					} else {
						class9.guestClanChannel = new ClanChannel(var3); // L: 7402
					}

					var1.serverPacket = null; // L: 7404
					return true; // L: 7405
				}

				if (ServerPacket.field3334 == var1.serverPacket) { // L: 7407
					GrandExchangeOfferNameComparator.method6925(class295.field3214); // L: 7408
					var1.serverPacket = null; // L: 7409
					return true; // L: 7410
				}

				if (ServerPacket.field3311 == var1.serverPacket) { // L: 7412
					tradeChatMode = var3.method9226(); // L: 7413
					publicChatMode = var3.method9130(); // L: 7414
					var1.serverPacket = null; // L: 7415
					return true; // L: 7416
				}

				if (ServerPacket.field3258 == var1.serverPacket) { // L: 7418
					GrandExchangeOfferNameComparator.method6925(class295.field3213); // L: 7419
					var1.serverPacket = null; // L: 7420
					return true; // L: 7421
				}

				if (ServerPacket.field3253 == var1.serverPacket) { // L: 7423
					var51 = var3.readStringCp1252NullTerminated(); // L: 7424
					Object[] var87 = new Object[var51.length() + 1]; // L: 7425

					for (var6 = var51.length() - 1; var6 >= 0; --var6) { // L: 7426
						if (var51.charAt(var6) == 's') { // L: 7427
							var87[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var87[var6 + 1] = new Integer(var3.readInt()); // L: 7428
						}
					}

					var87[0] = new Integer(var3.readInt()); // L: 7430
					ScriptEvent var78 = new ScriptEvent(); // L: 7431
					var78.args = var87; // L: 7432
					class170.runScriptEvent(var78); // L: 7433
					var1.serverPacket = null; // L: 7434
					return true; // L: 7435
				}

				if (ServerPacket.field3345 == var1.serverPacket) { // L: 7437
					var20 = var3.method9099(); // L: 7443
					Player var99;
					if (var20 == localPlayerIndex) { // L: 7444
						var99 = class27.localPlayer; // L: 7445
					} else {
						var99 = players[var20]; // L: 7448
					}

					var22 = var3.readUnsignedByte(); // L: 7450
					var5 = var3.method9101(); // L: 7451
					var6 = var3.method9113(); // L: 7452
					if (var99 != null) { // L: 7453
						var99.method2428(var22, var5, var6 >> 16, var6 & 65535); // L: 7454
					}

					var1.serverPacket = null; // L: 7456
					return true; // L: 7457
				}

				Widget var57;
				if (ServerPacket.field3301 == var1.serverPacket) { // L: 7459
					var20 = var3.method9099(); // L: 7460
					if (var20 == 65535) { // L: 7461
						var20 = -1;
					}

					var5 = var3.method9111(); // L: 7462
					var6 = var3.method9111(); // L: 7463
					var57 = Interpreter.getWidget(var5); // L: 7464
					ItemComposition var98;
					if (!var57.isIf3) { // L: 7465
						if (var20 == -1) { // L: 7466
							var57.modelType = 0; // L: 7467
							var1.serverPacket = null; // L: 7468
							return true; // L: 7469
						}

						var98 = class141.ItemComposition_get(var20).getCountObj(var6); // L: 7471
						var57.modelType = 4; // L: 7472
						var57.modelId = var20; // L: 7473
						var57.modelAngleX = var98.xan2d; // L: 7474
						var57.modelAngleY = var98.yan2d; // L: 7475
						var57.modelZoom = var98.zoom2d * 100 / var6; // L: 7476
						class303.invalidateWidget(var57); // L: 7477
					} else {
						var57.itemId = var20; // L: 7480
						var57.itemQuantity = var6; // L: 7481
						var98 = class141.ItemComposition_get(var20).getCountObj(var6); // L: 7482
						var57.modelAngleX = var98.xan2d; // L: 7483
						var57.modelAngleY = var98.yan2d; // L: 7484
						var57.modelAngleZ = var98.zan2d; // L: 7485
						var57.modelOffsetX = var98.offsetX2d; // L: 7486
						var57.modelOffsetY = var98.offsetY2d; // L: 7487
						var57.modelZoom = var98.zoom2d; // L: 7488
						if (var98.isStackable == 1) { // L: 7489
							var57.itemQuantityMode = 1;
						} else {
							var57.itemQuantityMode = 2; // L: 7490
						}

						if (var57.field3700 > 0) { // L: 7491
							var57.modelZoom = var57.modelZoom * 32 / var57.field3700;
						} else if (var57.rawWidth > 0) { // L: 7492
							var57.modelZoom = var57.modelZoom * 32 / var57.rawWidth;
						}

						class303.invalidateWidget(var57); // L: 7493
					}

					var1.serverPacket = null; // L: 7495
					return true; // L: 7496
				}

				if (ServerPacket.field3269 == var1.serverPacket) { // L: 7498
					field694 = cycleCntr; // L: 7499
					var73 = var3.readByte(); // L: 7500
					class161 var86 = new class161(var3); // L: 7501
					ClanChannel var76;
					if (var73 >= 0) { // L: 7503
						var76 = currentClanChannels[var73];
					} else {
						var76 = class9.guestClanChannel; // L: 7504
					}

					var86.method3395(var76); // L: 7505
					var1.serverPacket = null; // L: 7506
					return true; // L: 7507
				}

				if (ServerPacket.field3270 == var1.serverPacket) { // L: 7509
					for (var20 = 0; var20 < players.length; ++var20) { // L: 7510
						if (players[var20] != null) { // L: 7511
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) { // L: 7513
						if (npcs[var20] != null) { // L: 7514
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 7516
					return true; // L: 7517
				}

				if (ServerPacket.field3232 == var1.serverPacket) { // L: 7519
					var20 = var3.method9101(); // L: 7520
					if (var20 == 65535) { // L: 7521
						var20 = -1;
					}

					var5 = var3.method9113(); // L: 7522
					var6 = var3.method9099(); // L: 7523
					if (var6 == 65535) { // L: 7524
						var6 = -1;
					}

					var22 = var3.method9113(); // L: 7525

					for (var8 = var20; var8 <= var6; ++var8) { // L: 7526
						var44 = (long)var8 + ((long)var22 << 32); // L: 7527
						Node var46 = widgetFlags.get(var44); // L: 7528
						if (var46 != null) { // L: 7529
							var46.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var44); // L: 7530
					}

					var1.serverPacket = null; // L: 7532
					return true; // L: 7533
				}

				if (ServerPacket.field3290 == var1.serverPacket) { // L: 7535
					class36.method697(); // L: 7536
					var73 = var3.readByte(); // L: 7537
					if (var1.serverPacketLength == 1) { // L: 7538
						if (var73 >= 0) { // L: 7539
							currentClanSettings[var73] = null;
						} else {
							Skeleton.guestClanSettings = null; // L: 7540
						}

						var1.serverPacket = null; // L: 7541
						return true; // L: 7542
					}

					if (var73 >= 0) { // L: 7544
						currentClanSettings[var73] = new ClanSettings(var3); // L: 7545
					} else {
						Skeleton.guestClanSettings = new ClanSettings(var3); // L: 7548
					}

					var1.serverPacket = null; // L: 7550
					return true; // L: 7551
				}

				if (ServerPacket.field3337 == var1.serverPacket) { // L: 7553
					GrandExchangeOfferNameComparator.method6925(class295.field3217); // L: 7554
					var1.serverPacket = null; // L: 7555
					return true; // L: 7556
				}

				if (ServerPacket.field3281 == var1.serverPacket) { // L: 7558
					JagexCache.loadRegions(true, var1.packetBuffer); // L: 7559
					var1.serverPacket = null; // L: 7560
					return true; // L: 7561
				}

				if (ServerPacket.field3339 == var1.serverPacket) { // L: 7563
					GrandExchangeOfferNameComparator.method6925(class295.field3208); // L: 7564
					var1.serverPacket = null; // L: 7565
					return true; // L: 7566
				}

				if (ServerPacket.field3285 == var1.serverPacket) { // L: 7568
					class36.logOut(); // L: 7569
					var1.serverPacket = null; // L: 7570
					return false; // L: 7571
				}

				if (ServerPacket.field3304 == var1.serverPacket) { // L: 7573
					var20 = var3.readUnsignedByte(); // L: 7574
					ItemComposition.method4140(var20); // L: 7575
					var1.serverPacket = null; // L: 7576
					return true; // L: 7577
				}

				if (ServerPacket.field3294 == var1.serverPacket) { // L: 7579
					class162.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 7580
					field701 = cycleCntr; // L: 7581
					var1.serverPacket = null; // L: 7582
					return true; // L: 7583
				}

				if (ServerPacket.field3316 == var1.serverPacket) { // L: 7585
					WorldMapRectangle.privateChatMode = class33.method500(var3.readUnsignedByte()); // L: 7586
					var1.serverPacket = null; // L: 7587
					return true; // L: 7588
				}

				if (ServerPacket.field3276 == var1.serverPacket) { // L: 7590
					var20 = var3.method9226(); // L: 7591
					var5 = var3.method9258(); // L: 7592
					var6 = var3.method9144(); // L: 7593
					var57 = Interpreter.getWidget(var6); // L: 7594
					WorldMapSectionType.method5510(var57, var5, var20); // L: 7595
					class303.invalidateWidget(var57); // L: 7596
					var1.serverPacket = null; // L: 7597
					return true; // L: 7598
				}

				if (ServerPacket.field3230 == var1.serverPacket) { // L: 7600
					var20 = var3.method9103(); // L: 7601
					var5 = var3.method9113(); // L: 7602
					var6 = var3.method9102(); // L: 7603
					var57 = Interpreter.getWidget(var5); // L: 7604
					if (var20 != var57.rawX || var6 != var57.rawY || var57.xAlignment != 0 || var57.yAlignment != 0) { // L: 7605
						var57.rawX = var20; // L: 7606
						var57.rawY = var6; // L: 7607
						var57.xAlignment = 0; // L: 7608
						var57.yAlignment = 0; // L: 7609
						class303.invalidateWidget(var57); // L: 7610
						this.alignWidget(var57); // L: 7611
						if (var57.type == 0) { // L: 7612
							class238.revalidateWidgetScroll(class179.Widget_interfaceComponents[var5 >> 16], var57, false);
						}
					}

					var1.serverPacket = null; // L: 7614
					return true; // L: 7615
				}

				if (ServerPacket.field3231 == var1.serverPacket) { // L: 7617
					var3.offset += 28; // L: 7618
					if (var3.checkCrc()) { // L: 7619
						class89.method2323(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 7620
					return true; // L: 7621
				}

				String var69;
				if (ServerPacket.field3237 == var1.serverPacket) { // L: 7623
					byte[] var50 = new byte[var1.serverPacketLength]; // L: 7624
					var3.method9032(var50, 0, var50.length); // L: 7625
					Buffer var85 = new Buffer(var50); // L: 7626
					var69 = var85.readStringCp1252NullTerminated(); // L: 7627
					class339.openURL(var69, true, false); // L: 7628
					var1.serverPacket = null; // L: 7629
					return true; // L: 7630
				}

				if (ServerPacket.field3260 == var1.serverPacket) { // L: 7632
					var77 = var3.readBoolean(); // L: 7633
					if (var77) { // L: 7634
						if (class348.field3881 == null) { // L: 7635
							class348.field3881 = new class369();
						}
					} else {
						class348.field3881 = null; // L: 7637
					}

					var1.serverPacket = null; // L: 7638
					return true; // L: 7639
				}

				if (ServerPacket.field3277 == var1.serverPacket) { // L: 7641
					var20 = var3.method9100(); // L: 7642
					var5 = var3.readInt(); // L: 7643
					var6 = var3.method9100(); // L: 7644
					var22 = var3.method9100(); // L: 7645
					var97 = Interpreter.getWidget(var5); // L: 7646
					if (var22 != var97.modelAngleX || var20 != var97.modelAngleY || var6 != var97.modelZoom) { // L: 7647
						var97.modelAngleX = var22; // L: 7648
						var97.modelAngleY = var20; // L: 7649
						var97.modelZoom = var6; // L: 7650
						class303.invalidateWidget(var97); // L: 7651
					}

					var1.serverPacket = null; // L: 7653
					return true; // L: 7654
				}

				if (ServerPacket.field3255 == var1.serverPacket) { // L: 7656
					var77 = var3.readUnsignedByte() == 1; // L: 7657
					if (var77) { // L: 7658
						class168.field1806 = AttackOption.method2714() - var3.readLong(); // L: 7659
						LoginScreenAnimation.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 7660
					} else {
						LoginScreenAnimation.grandExchangeEvents = null; // L: 7662
					}

					field706 = cycleCntr; // L: 7663
					var1.serverPacket = null; // L: 7664
					return true; // L: 7665
				}

				if (ServerPacket.field3312 == var1.serverPacket) { // L: 7667
					var77 = this.username() == null; // L: 7668
					class524.updatePlayers(var3, var1.serverPacketLength); // L: 7669
					class352.method6688(); // L: 7670
					if (var77 && this.username() != null && this.username().method9701().equalsIgnoreCase("nin")) { // L: 7671
						ReflectionCheck.addGameMessage(4, "", "$jmod_luck = true"); // L: 7672
					}

					var1.serverPacket = null; // L: 7674
					return true; // L: 7675
				}

				if (ServerPacket.field3287 == var1.serverPacket) { // L: 7677
					var20 = var3.method9111(); // L: 7678
					var5 = var3.method9100(); // L: 7679
					var21 = Interpreter.getWidget(var20); // L: 7680
					if (var21.modelType != 1 || var5 != var21.modelId) { // L: 7681
						var21.modelType = 1; // L: 7682
						var21.modelId = var5; // L: 7683
						class303.invalidateWidget(var21); // L: 7684
					}

					var1.serverPacket = null; // L: 7686
					return true; // L: 7687
				}

				if (ServerPacket.field3283 == var1.serverPacket) { // L: 7689
					var20 = var3.readUShortSmart(); // L: 7690
					boolean var60 = var3.readUnsignedByte() == 1; // L: 7691
					var69 = ""; // L: 7692
					boolean var75 = false; // L: 7693
					if (var60) { // L: 7694
						var69 = var3.readStringCp1252NullTerminated(); // L: 7695
						if (class162.friendSystem.isIgnored(new Username(var69, ObjectSound.loginType))) { // L: 7696
							var75 = true;
						}
					}

					String var96 = var3.readStringCp1252NullTerminated(); // L: 7698
					if (!var75) { // L: 7699
						ReflectionCheck.addGameMessage(var20, var69, var96);
					}

					var1.serverPacket = null; // L: 7700
					return true; // L: 7701
				}

				if (ServerPacket.field3233 == var1.serverPacket) { // L: 7703
					var22 = var3.method9101(); // L: 7709
					var5 = var3.method9101(); // L: 7710
					var8 = var3.readUnsignedShort(); // L: 7711
					var6 = var3.method9100(); // L: 7712
					var20 = var3.method9100(); // L: 7713
					if (var20 == 65535) { // L: 7714
						var20 = -1; // L: 7715
					}

					ArrayList var28 = new ArrayList(); // L: 7717
					var28.add(var20); // L: 7718
					class1.method7(var28, var5, var6, var22, var8); // L: 7719
					var1.serverPacket = null; // L: 7720
					return true; // L: 7721
				}

				if (ServerPacket.field3297 == var1.serverPacket) { // L: 7723
					class36.method697(); // L: 7724
					var73 = var3.readByte(); // L: 7725
					class147 var83 = new class147(var3); // L: 7726
					ClanSettings var70;
					if (var73 >= 0) { // L: 7728
						var70 = currentClanSettings[var73];
					} else {
						var70 = Skeleton.guestClanSettings; // L: 7729
					}

					var83.method3232(var70); // L: 7730
					var1.serverPacket = null; // L: 7731
					return true; // L: 7732
				}

				NPC var47;
				if (ServerPacket.field3227 == var1.serverPacket) { // L: 7734
					var5 = var3.method9144(); // L: 7740
					var6 = var3.method9100(); // L: 7741
					var20 = var3.method9101(); // L: 7742
					var47 = npcs[var20]; // L: 7743
					var22 = var3.readUnsignedByte(); // L: 7744
					if (var47 != null) { // L: 7745
						var47.method2428(var22, var6, var5 >> 16, var5 & 65535); // L: 7746
					}

					var1.serverPacket = null; // L: 7748
					return true; // L: 7749
				}

				if (ServerPacket.field3338 == var1.serverPacket) { // L: 7751
					var20 = var3.method9113(); // L: 7752
					var82 = Interpreter.getWidget(var20); // L: 7753
					var82.modelType = 3; // L: 7754
					var82.modelId = class27.localPlayer.appearance.getChatHeadId(); // L: 7755
					class303.invalidateWidget(var82); // L: 7756
					var1.serverPacket = null; // L: 7757
					return true; // L: 7758
				}

				if (ServerPacket.field3288 == var1.serverPacket) { // L: 7760
					var20 = var3.method9099(); // L: 7761
					var5 = var3.method9111(); // L: 7762
					var6 = var3.method9099(); // L: 7763
					var57 = Interpreter.getWidget(var5); // L: 7764
					var57.field3684 = var20 + (var6 << 16); // L: 7765
					var1.serverPacket = null; // L: 7766
					return true; // L: 7767
				}

				if (ServerPacket.field3308 == var1.serverPacket) { // L: 7769
					for (var20 = 0; var20 < VarpDefinition.field1913; ++var20) { // L: 7770
						VarpDefinition var81 = FriendSystem.VarpDefinition_get(var20); // L: 7771
						if (var81 != null) { // L: 7772
							Varps.Varps_temp[var20] = 0; // L: 7773
							Varps.Varps_main[var20] = 0; // L: 7774
						}
					}

					class326.method6120(); // L: 7777
					field693 += 32; // L: 7778
					var1.serverPacket = null; // L: 7779
					return true; // L: 7780
				}

				if (ServerPacket.field3336 == var1.serverPacket) { // L: 7782
					var20 = var3.readUnsignedShort(); // L: 7783
					var5 = var3.method9144(); // L: 7784
					var21 = Interpreter.getWidget(var5); // L: 7785
					if (var21.modelType != 6 || var20 != var21.modelId) { // L: 7786
						var21.modelType = 6; // L: 7787
						var21.modelId = var20; // L: 7788
						class303.invalidateWidget(var21); // L: 7789
					}

					var1.serverPacket = null; // L: 7791
					return true; // L: 7792
				}

				if (ServerPacket.field3331 == var1.serverPacket) { // L: 7794
					isCameraLocked = true; // L: 7795
					field763 = false; // L: 7796
					field758 = true; // L: 7797
					var20 = var3.readShort(); // L: 7798
					var5 = var3.readShort(); // L: 7799
					var6 = ByteArrayPool.method7694(var5 + ModeWhere.cameraPitch & 2027); // L: 7800
					var22 = var20 + class13.cameraYaw; // L: 7801
					var8 = var3.readUnsignedShort(); // L: 7802
					var9 = var3.readUnsignedByte(); // L: 7803
					field762 = new class478(ModeWhere.cameraPitch, var6, var8, var9); // L: 7804
					field761 = new class478(class13.cameraYaw, var22, var8, var9); // L: 7805
					var1.serverPacket = null; // L: 7806
					return true; // L: 7807
				}

				if (ServerPacket.field3310 == var1.serverPacket) { // L: 7809
					var20 = var3.readInt(); // L: 7810
					var5 = var3.readUnsignedShort(); // L: 7811
					if (var20 < -70000) { // L: 7812
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 7814
						var21 = Interpreter.getWidget(var20);
					} else {
						var21 = null; // L: 7815
					}

					if (var21 != null) { // L: 7816
						for (var22 = 0; var22 < var21.itemIds.length; ++var22) { // L: 7817
							var21.itemIds[var22] = 0; // L: 7818
							var21.field3765[var22] = 0; // L: 7819
						}
					}

					KeyHandler.clearItemContainer(var5); // L: 7822
					var22 = var3.readUnsignedShort(); // L: 7823

					for (var8 = 0; var8 < var22; ++var8) { // L: 7824
						var9 = var3.method9258(); // L: 7825
						if (var9 == 255) { // L: 7826
							var9 = var3.readInt();
						}

						var10 = var3.method9099(); // L: 7827
						if (var21 != null && var8 < var21.itemIds.length) { // L: 7828 7829
							var21.itemIds[var8] = var10; // L: 7830
							var21.field3765[var8] = var9; // L: 7831
						}

						KitDefinition.itemContainerSetItem(var5, var8, var10 - 1, var9); // L: 7834
					}

					if (var21 != null) { // L: 7836
						class303.invalidateWidget(var21);
					}

					class326.method6120(); // L: 7837
					field575[++field695 - 1 & 31] = var5 & 32767; // L: 7838
					var1.serverPacket = null; // L: 7839
					return true; // L: 7840
				}

				if (ServerPacket.field3295 == var1.serverPacket) { // L: 7842
					if (rootInterface != -1) { // L: 7843
						class295.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 7844
					return true; // L: 7845
				}

				if (ServerPacket.field3234 == var1.serverPacket) { // L: 7847
					var20 = var3.method9130(); // L: 7848
					var5 = var3.method9130(); // L: 7849
					var69 = var3.readStringCp1252NullTerminated(); // L: 7850
					if (var20 >= 1 && var20 <= 8) { // L: 7851
						if (var69.equalsIgnoreCase("null")) { // L: 7852
							var69 = null;
						}

						playerMenuActions[var20 - 1] = var69; // L: 7853
						playerOptionsPriorities[var20 - 1] = var5 == 0; // L: 7854
					}

					var1.serverPacket = null; // L: 7856
					return true; // L: 7857
				}

				if (ServerPacket.field3296 == var1.serverPacket) { // L: 7859
					var20 = var3.method9144(); // L: 7860
					var5 = var3.readInt(); // L: 7861
					var21 = Interpreter.getWidget(var20); // L: 7862
					class168.method3465(var21, var5); // L: 7863
					class303.invalidateWidget(var21); // L: 7864
					var1.serverPacket = null; // L: 7865
					return true; // L: 7866
				}

				if (ServerPacket.field3240 == var1.serverPacket) { // L: 7868
					isCameraLocked = true; // L: 7869
					field763 = false; // L: 7870
					field779 = true; // L: 7871
					class90.field1106 = var3.readUnsignedByte() * 16384; // L: 7872
					ClanSettings.field1742 = var3.readUnsignedByte() * 128; // L: 7873
					var20 = var3.readUnsignedShort(); // L: 7874
					var5 = var3.readUnsignedByte() * 128 + 64; // L: 7875
					var6 = var3.readUnsignedByte() * 128 + 64; // L: 7876
					var22 = var3.readUnsignedShort(); // L: 7877
					field759 = var3.readBoolean(); // L: 7878
					var8 = var3.readUnsignedByte(); // L: 7879
					var9 = class90.field1106 * 128 + 64; // L: 7880
					var10 = ClanSettings.field1742 * 16384 + 64; // L: 7881
					var62 = false; // L: 7882
					var12 = false; // L: 7883
					if (field759) { // L: 7884
						var11 = class309.cameraY; // L: 7885
						var63 = class291.getTileHeight(var9, var10, BuddyRankComparator.Client_plane) - var20; // L: 7886
					} else {
						var11 = class291.getTileHeight(PacketWriter.cameraX, World.cameraZ, BuddyRankComparator.Client_plane) - class309.cameraY; // L: 7889
						var63 = var20; // L: 7890
					}

					field760 = new class476(PacketWriter.cameraX, World.cameraZ, var11, var9, var10, var63, var5, var6, var22, var8); // L: 7892
					var1.serverPacket = null; // L: 7893
					return true; // L: 7894
				}

				if (ServerPacket.field3313 == var1.serverPacket) { // L: 7896
					class72.field895 = null; // L: 7897
					var1.serverPacket = null; // L: 7898
					return true; // L: 7899
				}

				if (ServerPacket.field3325 == var1.serverPacket) { // L: 7901
					var1.serverPacket = null; // L: 7902
					return true; // L: 7903
				}

				if (ServerPacket.field3278 == var1.serverPacket) { // L: 7905
					var20 = var3.method9113(); // L: 7906
					short var55 = (short)var3.method9102(); // L: 7907
					var6 = var3.method9226(); // L: 7908
					var22 = var3.method9099(); // L: 7909
					var47 = npcs[var22]; // L: 7910
					if (var47 != null) { // L: 7911
						var47.method2636(var6, var20, var55); // L: 7912
					}

					var1.serverPacket = null; // L: 7914
					return true; // L: 7915
				}

				if (ServerPacket.field3340 == var1.serverPacket) { // L: 7917
					GrandExchangeOfferNameComparator.method6925(class295.field3218); // L: 7918
					var1.serverPacket = null; // L: 7919
					return true; // L: 7920
				}

				if (ServerPacket.field3244 == var1.serverPacket) { // L: 7922
					var20 = var3.offset + var1.serverPacketLength; // L: 7923
					var5 = var3.readUnsignedShort(); // L: 7924
					if (var5 == 65535) { // L: 7925
						var5 = -1;
					}

					var6 = var3.readUnsignedShort(); // L: 7926
					if (var5 != rootInterface) { // L: 7927
						rootInterface = var5; // L: 7928
						this.resizeRoot(false); // L: 7929
						class451.Widget_resetModelFrames(rootInterface); // L: 7930
						class1.runWidgetOnLoadListener(rootInterface); // L: 7931

						for (var22 = 0; var22 < 100; ++var22) { // L: 7932
							field717[var22] = true;
						}
					}

					InterfaceParent var23;
					for (; var6-- > 0; var23.field1060 = true) { // L: 7934 7944
						var22 = var3.readInt(); // L: 7935
						var8 = var3.readUnsignedShort(); // L: 7936
						var9 = var3.readUnsignedByte(); // L: 7937
						var23 = (InterfaceParent)interfaceParents.get((long)var22); // L: 7938
						if (var23 != null && var8 != var23.group) { // L: 7939
							class260.closeInterface(var23, true); // L: 7940
							var23 = null; // L: 7941
						}

						if (var23 == null) { // L: 7943
							var23 = ReflectionCheck.method703(var22, var8, var9);
						}
					}

					for (var56 = (InterfaceParent)interfaceParents.first(); var56 != null; var56 = (InterfaceParent)interfaceParents.next()) { // L: 7946
						if (var56.field1060) { // L: 7947
							var56.field1060 = false;
						} else {
							class260.closeInterface(var56, true); // L: 7949
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 7952

					while (var3.offset < var20) { // L: 7953
						var22 = var3.readInt(); // L: 7954
						var8 = var3.readUnsignedShort(); // L: 7955
						var9 = var3.readUnsignedShort(); // L: 7956
						var10 = var3.readInt(); // L: 7957

						for (var11 = var8; var11 <= var9; ++var11) { // L: 7958
							var33 = ((long)var22 << 32) + (long)var11; // L: 7959
							widgetFlags.put(new IntegerNode(var10), var33); // L: 7960
						}
					}

					var1.serverPacket = null; // L: 7963
					return true; // L: 7964
				}

				if (ServerPacket.field3250 == var1.serverPacket) { // L: 7966
					var20 = var3.readInt(); // L: 7967
					var5 = var3.readInt(); // L: 7968
					var6 = class170.getGcDuration(); // L: 7969
					PacketBufferNode var7 = class217.getPacketBufferNode(ClientPacket.field3186, packetWriter.isaacCipher); // L: 7971
					var7.packetBuffer.method9088(var6); // L: 7972
					var7.packetBuffer.method9087(GameEngine.fps); // L: 7973
					var7.packetBuffer.method9108(var20); // L: 7974
					var7.packetBuffer.writeInt(var5); // L: 7975
					packetWriter.addNode(var7); // L: 7976
					var1.serverPacket = null; // L: 7977
					return true; // L: 7978
				}

				if (ServerPacket.field3303 == var1.serverPacket) { // L: 7980
					GrandExchangeOfferNameComparator.method6925(class295.field3207); // L: 7981
					var1.serverPacket = null; // L: 7982
					return true; // L: 7983
				}

				if (ServerPacket.field3282 == var1.serverPacket) { // L: 7985
					var20 = var3.readInt(); // L: 7986
					var5 = var3.method9258(); // L: 7987
					var21 = Interpreter.getWidget(var20); // L: 7988
					class159.method3384(var21, class27.localPlayer.appearance.field3563, var5); // L: 7989
					class303.invalidateWidget(var21); // L: 7990
					var1.serverPacket = null; // L: 7991
					return true; // L: 7992
				}

				MusicPatchNode.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1423 != null ? var1.field1423.id : -1) + "," + (var1.field1426 != null ? var1.field1426.id : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 7994
				class36.logOut(); // L: 7995
			} catch (IOException var48) { // L: 7997
				VerticalAlignment.method3884(); // L: 7998
			} catch (Exception var49) {
				var32 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1423 != null ? var1.field1423.id : -1) + "," + (var1.field1426 != null ? var1.field1426.id : -1) + "," + var1.serverPacketLength + "," + (class27.localPlayer.pathX[0] + class166.baseX * 64) + "," + (class27.localPlayer.pathY[0] + class9.baseY * 64) + ","; // L: 8001

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 8002
					var32 = var32 + var3.array[var6] + ",";
				}

				MusicPatchNode.RunException_sendStackTrace(var32, var49); // L: 8003
				class36.logOut(); // L: 8004
			}

			return true; // L: 8006
		}
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2104319965"
	)
	@Export("menu")
	final void menu() {
		MenuAction.method2092(); // L: 9165
		if (clickedWidget == null) { // L: 9166
			int var1 = MouseHandler.MouseHandler_lastButton; // L: 9167
			int var2;
			if (isMenuOpen) { // L: 9168
				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				if (var1 != 1 && (class412.mouseCam || var1 != 4)) { // L: 9169
					var2 = MouseHandler.MouseHandler_x; // L: 9170
					var3 = MouseHandler.MouseHandler_y; // L: 9171
					if (var2 < class36.menuX - 10 || var2 > class36.menuX + class148.menuWidth + 10 || var3 < WorldMapElement.menuY - 10 || var3 > WorldMapElement.menuY + RouteStrategy.menuHeight + 10) { // L: 9172
						isMenuOpen = false; // L: 9173
						var4 = class36.menuX; // L: 9174
						var5 = WorldMapElement.menuY; // L: 9175
						var6 = class148.menuWidth; // L: 9176
						var7 = RouteStrategy.menuHeight; // L: 9177

						for (var8 = 0; var8 < rootWidgetCount; ++var8) { // L: 9179
							if (rootWidgetXs[var8] + rootWidgetWidths[var8] > var4 && rootWidgetXs[var8] < var6 + var4 && rootWidgetHeights[var8] + rootWidgetYs[var8] > var5 && rootWidgetYs[var8] < var5 + var7) { // L: 9180
								field717[var8] = true;
							}
						}
					}
				}

				if (var1 == 1 || !class412.mouseCam && var1 == 4) { // L: 9185
					var2 = class36.menuX; // L: 9186
					var3 = WorldMapElement.menuY; // L: 9187
					var4 = class148.menuWidth; // L: 9188
					var5 = MouseHandler.MouseHandler_lastPressedX; // L: 9189
					var6 = MouseHandler.MouseHandler_lastPressedY; // L: 9190
					var7 = -1; // L: 9191

					int var9;
					for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 9192
						var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 9193
						if (var5 > var2 && var5 < var4 + var2 && var6 > var9 - 13 && var6 < var9 + 3) { // L: 9194
							var7 = var8;
						}
					}

					if (var7 != -1) { // L: 9196
						class16.method235(var7);
					}

					isMenuOpen = false; // L: 9197
					var8 = class36.menuX; // L: 9198
					var9 = WorldMapElement.menuY; // L: 9199
					int var10 = class148.menuWidth; // L: 9200
					int var11 = RouteStrategy.menuHeight; // L: 9201

					for (int var12 = 0; var12 < rootWidgetCount; ++var12) { // L: 9203
						if (rootWidgetWidths[var12] + rootWidgetXs[var12] > var8 && rootWidgetXs[var12] < var10 + var8 && rootWidgetYs[var12] + rootWidgetHeights[var12] > var9 && rootWidgetYs[var12] < var9 + var11) { // L: 9204
							field717[var12] = true;
						}
					}
				}
			} else {
				var2 = menuOptionsCount - 1; // L: 9212
				if ((var1 == 1 || !class412.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) { // L: 9215 9216
					var1 = 2; // L: 9217
				}

				if ((var1 == 1 || !class412.mouseCam && var1 == 4) && menuOptionsCount > 0) { // L: 9220
					class16.method235(var2); // L: 9221
				}

				if (var1 == 2 && menuOptionsCount > 0) { // L: 9223
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	} // L: 9225

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-195385399"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1; // L: 9230
		boolean var3 = field642 && menuOptionsCount > 2; // L: 9233
		if (!var3) { // L: 9234
			boolean var4;
			if (var1 < 0) { // L: 9237
				var4 = false; // L: 9238
			} else {
				int var5 = menuOpcodes[var1]; // L: 9241
				if (var5 >= 2000) { // L: 9242
					var5 -= 2000;
				}

				if (var5 == 1007) { // L: 9243
					var4 = true; // L: 9244
				} else {
					var4 = false; // L: 9247
				}
			}

			var3 = var4; // L: 9249
		}

		return var3 && !menuShiftClick[var1]; // L: 9251
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-167412771"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		class154.method3285(var1, var2); // L: 9255
		var1 -= viewportOffsetX; // L: 9256
		var2 -= viewportOffsetY; // L: 9257
		class173.scene.menuOpen(BuddyRankComparator.Client_plane, var1, var2, false); // L: 9258
		isMenuOpen = true; // L: 9259
	} // L: 9260

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "14"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface; // L: 11025
		int var3 = VarbitComposition.canvasWidth; // L: 11026
		int var4 = class370.canvasHeight; // L: 11027
		if (GrandExchangeEvent.loadInterface(var2)) { // L: 11029
			SecureRandomFuture.resizeInterface(class179.Widget_interfaceComponents[var2], -1, var3, var4, var1); // L: 11030
		}

	} // L: 11032

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Lme;I)V",
		garbageValue = "-1951100285"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : Interpreter.getWidget(var1.parentId); // L: 11035
		int var3;
		int var4;
		if (var2 == null) { // L: 11038
			var3 = VarbitComposition.canvasWidth; // L: 11039
			var4 = class370.canvasHeight; // L: 11040
		} else {
			var3 = var2.width; // L: 11043
			var4 = var2.height; // L: 11044
		}

		UserComparator4.alignWidgetSize(var1, var3, var4, false); // L: 11046
		class211.alignWidgetPosition(var1, var3, var4); // L: 11047
	} // L: 11048

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "26"
	)
	final void method1274() {
		class303.invalidateWidget(clickedWidget); // L: 11954
		++MusicPatchPcmStream.widgetDragDuration; // L: 11955
		int var1;
		int var2;
		if (field687 && field684) { // L: 11956
			var1 = MouseHandler.MouseHandler_x; // L: 11975
			var2 = MouseHandler.MouseHandler_y; // L: 11976
			var1 -= widgetClickX; // L: 11977
			var2 -= widgetClickY; // L: 11978
			if (var1 < field685) { // L: 11979
				var1 = field685;
			}

			if (var1 + clickedWidget.width > field685 + clickedWidgetParent.width) { // L: 11980
				var1 = field685 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field776) { // L: 11981
				var2 = field776;
			}

			if (var2 + clickedWidget.height > field776 + clickedWidgetParent.height) { // L: 11982
				var2 = field776 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field688; // L: 11983
			int var4 = var2 - field614; // L: 11984
			int var5 = clickedWidget.dragZoneSize; // L: 11985
			if (MusicPatchPcmStream.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 11986 11987
				isDraggingWidget = true; // L: 11988
			}

			int var6 = var1 - field685 + clickedWidgetParent.scrollX; // L: 11991
			int var7 = var2 - field776 + clickedWidgetParent.scrollY; // L: 11992
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 11993
				var8 = new ScriptEvent(); // L: 11994
				var8.widget = clickedWidget; // L: 11995
				var8.mouseX = var6; // L: 11996
				var8.mouseY = var7; // L: 11997
				var8.args = clickedWidget.onDrag; // L: 11998
				class170.runScriptEvent(var8); // L: 11999
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 12001
				if (isDraggingWidget) { // L: 12002
					if (clickedWidget.onDragComplete != null) { // L: 12003
						var8 = new ScriptEvent(); // L: 12004
						var8.widget = clickedWidget; // L: 12005
						var8.mouseX = var6; // L: 12006
						var8.mouseY = var7; // L: 12007
						var8.dragTarget = draggedOnWidget; // L: 12008
						var8.args = clickedWidget.onDragComplete; // L: 12009
						class170.runScriptEvent(var8); // L: 12010
					}

					if (draggedOnWidget != null && NPC.method2687(clickedWidget) != null) { // L: 12012
						PacketBufferNode var13 = class217.getPacketBufferNode(ClientPacket.field3195, packetWriter.isaacCipher); // L: 12014
						var13.packetBuffer.writeShort(clickedWidget.itemId); // L: 12015
						var13.packetBuffer.method9096(clickedWidget.childIndex); // L: 12016
						var13.packetBuffer.writeShort(draggedOnWidget.childIndex); // L: 12017
						var13.packetBuffer.writeIntME(draggedOnWidget.itemId); // L: 12018
						var13.packetBuffer.method9108(clickedWidget.id); // L: 12019
						var13.packetBuffer.method9109(draggedOnWidget.id); // L: 12020
						packetWriter.addNode(var13); // L: 12021
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 12025
					this.openMenu(widgetClickX + field688, widgetClickY + field614); // L: 12026
				} else if (menuOptionsCount > 0) { // L: 12028
					int var11 = widgetClickX + field688; // L: 12029
					int var9 = field614 + widgetClickY; // L: 12030
					MenuAction var10 = class302.tempMenuAction; // L: 12032
					if (var10 != null) { // L: 12034
						class157.method3364(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.field904, var10.field905, var10.field906, var11, var9); // L: 12035
					}

					class302.tempMenuAction = null; // L: 12038
				}

				clickedWidget = null; // L: 12042
			}

		} else {
			if (MusicPatchPcmStream.widgetDragDuration > 1) { // L: 11957
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 11958
					var1 = widgetClickX + field688; // L: 11959
					var2 = field614 + widgetClickY; // L: 11960
					MenuAction var12 = class302.tempMenuAction; // L: 11962
					if (var12 != null) { // L: 11964
						class157.method3364(var12.param0, var12.param1, var12.opcode, var12.identifier, var12.field904, var12.field905, var12.field906, var1, var2); // L: 11965
					}

					class302.tempMenuAction = null; // L: 11968
				}

				clickedWidget = null; // L: 11971
			}

		}
	} // L: 11973 12044

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(S)Lur;",
		garbageValue = "-11631"
	)
	@Export("username")
	public Username username() {
		return class27.localPlayer != null ? class27.localPlayer.username : null; // L: 12774
	}

	public final void init() {
		try {
			if (this.checkHost()) { // L: 750
				for (int var1 = 0; var1 <= 28; ++var1) { // L: 751
					String var2 = this.getParameter(Integer.toString(var1)); // L: 752
					if (var2 != null) { // L: 753
						int var4;
						switch(var1) { // L: 754
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 807
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 808
							}
							break;
						case 4:
							if (clientType == -1) { // L: 773
								clientType = Integer.parseInt(var2); // L: 774
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 762
							break; // L: 763
						case 6:
							var4 = Integer.parseInt(var2); // L: 826
							Language var15;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) { // L: 828
								var15 = Language.Language_valuesOrdered[var4]; // L: 832
							} else {
								var15 = null; // L: 829
							}

							WorldMapElement.clientLanguage = var15; // L: 834
							break; // L: 835
						case 7:
							var4 = Integer.parseInt(var2); // L: 840
							GameBuild[] var5 = new GameBuild[]{GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.LIVE, GameBuild.WIP}; // L: 845
							GameBuild[] var6 = var5; // L: 847
							int var7 = 0;

							GameBuild var9;
							while (true) {
								if (var7 >= var6.length) {
									var9 = null; // L: 858
									break;
								}

								GameBuild var8 = var6[var7]; // L: 849
								if (var4 == var8.buildId) { // L: 851
									var9 = var8; // L: 852
									break; // L: 853
								}

								++var7; // L: 848
							}

							class372.field4352 = var9; // L: 860
							break; // L: 861
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 767
							}
							break;
						case 9:
							class138.field1604 = var2; // L: 865
							break; // L: 866
						case 10:
							class6.field15 = (StudioGame)class93.findEnumerated(UserComparator5.method2951(), Integer.parseInt(var2)); // L: 785
							if (StudioGame.oldscape == class6.field15) { // L: 786
								ObjectSound.loginType = LoginType.oldscape;
							} else {
								ObjectSound.loginType = LoginType.field4993; // L: 787
							}
							break;
						case 11:
							ArchiveDiskActionHandler.field4242 = var2; // L: 797
							break; // L: 798
						case 12:
							worldId = Integer.parseInt(var2); // L: 780
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
							class449.field4730 = Integer.parseInt(var2); // L: 802
							break; // L: 803
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 757
							break; // L: 758
						case 17:
							class134.field1589 = var2; // L: 870
							break;
						case 21:
							field503 = Integer.parseInt(var2); // L: 792
							break; // L: 793
						case 25:
							int var3 = var2.indexOf("."); // L: 813
							if (var3 == -1) { // L: 814
								field507 = Integer.parseInt(var2); // L: 815
							} else {
								field507 = Integer.parseInt(var2.substring(0, var3)); // L: 818
								Integer.parseInt(var2.substring(var3 + 1)); // L: 819
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false; // L: 877
				isLowDetail = false; // L: 878
				class6.worldHost = this.getCodeBase().getHost(); // L: 880
				class101.field1332 = new class359(); // L: 881
				String var10 = class372.field4352.name; // L: 882
				byte var11 = 0; // L: 883
				if ((worldProperties & 65536) != 0) { // L: 884
					MouseHandler.field224 = "beta"; // L: 885
				}

				try {
					class197.method3886("oldschool", MouseHandler.field224, var10, var11, 22); // L: 888
				} catch (Exception var13) { // L: 890
					MusicPatchNode.RunException_sendStackTrace((String)null, var13); // L: 891
				}

				class415.client = this; // L: 893
				class158.field1757 = clientType; // L: 894
				ModeWhere.field4381 = System.getenv("JX_ACCESS_TOKEN"); // L: 896
				class47.field333 = System.getenv("JX_REFRESH_TOKEN"); // L: 897
				ClanChannelMember.field1653 = System.getenv("JX_SESSION_ID"); // L: 898
				class74.field910 = System.getenv("JX_CHARACTER_ID"); // L: 899
				String var16 = System.getenv("JX_DISPLAY_NAME"); // L: 900
				String var12;
				if (var16 != null && !var16.isEmpty() && var16.charAt(0) != '#') { // L: 904
					var12 = var16; // L: 908
				} else {
					var12 = ""; // L: 905
				}

				Login.field937 = var12; // L: 910
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) { // L: 913
					this.field635 = true; // L: 914
				}

				if (field583 == -1) { // L: 916
					if (!this.method1248() && !this.method1249()) { // L: 917
						field583 = 0; // L: 921
					} else {
						field583 = 5; // L: 918
					}
				}

				this.startThread(765, 503, 215, 1); // L: 924
			}
		} catch (RuntimeException var14) {
			throw AbstractWorldMapData.newRunException(var14, "client.init(" + ')');
		}
	} // L: 925

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 939
			this.field543 = var1; // L: 942
			ObjectSound.method1926(10); // L: 943
		}
	} // L: 940 944

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 949
			this.field698 = var1; // L: 952
		}
	} // L: 950 953

	public long getAccountHash() {
		return this.accountHash; // L: 963
	}

	protected void finalize() throws Throwable {
		class305.field3394.remove(this); // L: 931
		super.finalize(); // L: 933
	} // L: 934

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 958
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldn;",
		garbageValue = "-1624516348"
	)
	static class89[] method1573() {
		return new class89[]{class89.field1097, class89.field1092, class89.field1094, class89.field1091, class89.field1093}; // L: 16
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-1725389624"
	)
	static Object method1810(int var0) {
		return GrandExchangeOfferUnitPriceComparator.method6979((class502)class93.findEnumerated(class502.method8908(), var0)); // L: 5322
	}
}
