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
public final class Client extends GameEngine implements Usernamed, OAuthApi, class327 {
	@ObfuscatedName("wm")
	@ObfuscatedGetter(
		intValue = 1239902349
	)
	public static int field808;
	@ObfuscatedName("wl")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	static final class234 field629;
	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final ApproximateRouteStrategy field814;
	@ObfuscatedName("wo")
	static int[] field815;
	@ObfuscatedName("wx")
	static int[] field655;
	@ObfuscatedName("wy")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("ww")
	@ObfuscatedGetter(
		intValue = 305828621
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("wp")
	@ObfuscatedGetter(
		intValue = 719195901
	)
	static int field773;
	@ObfuscatedName("va")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("wn")
	static List field533;
	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	static class443 field597;
	@ObfuscatedName("vh")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("vf")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("vt")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("wc")
	@ObfuscatedGetter(
		intValue = -1907131929
	)
	static int field807;
	@ObfuscatedName("bv")
	static boolean field803;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 667514601
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -260383041
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -716065063
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cl")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cw")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -455589887
	)
	static int field513;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1924556571
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 85657971
	)
	static int field794;
	@ObfuscatedName("cp")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 466501763
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dn")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("dl")
	static boolean field788;
	@ObfuscatedName("da")
	static boolean field521;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 538624397
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		longValue = -6590002606368687705L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 770080737
	)
	static int field795;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 1850835207
	)
	static int field525;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		longValue = -1242148376214615293L
	)
	static long field526;
	@ObfuscatedName("dg")
	static boolean field527;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -1030172277
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 1757984615
	)
	static int field529;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1656156545
	)
	static int field530;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -1035355627
	)
	static int field531;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1115799069
	)
	static int field532;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -873808003
	)
	static int field620;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1223335210
	)
	static int field534;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 378876736
	)
	static int field535;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1697678400
	)
	static int field712;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ej")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static class93 field540;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 1348713939
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = 815633175
	)
	static int field542;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = 1697406739
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = -1212804763
	)
	static int field544;
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = -1987747205
	)
	static int field667;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = -2004100679
	)
	static int field546;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	static class140 field547;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	static class539 field810;
	@ObfuscatedName("gy")
	static final String field781;
	@ObfuscatedName("gd")
	static final String field559;
	@ObfuscatedName("hv")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static SecureRandomFuture field563;
	@ObfuscatedName("ho")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "[Ldk;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = -1651864319
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("hu")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		intValue = -319244401
	)
	static int field571;
	@ObfuscatedName("he")
	static int[] field742;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = 501404749
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ib")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("ij")
	static HashMap field623;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = 781532859
	)
	static int field578;
	@ObfuscatedName("it")
	static String field676;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = 1605228497
	)
	static int field579;
	@ObfuscatedName("iv")
	@ObfuscatedGetter(
		intValue = -466590955
	)
	static int field727;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = -1035714311
	)
	static int field581;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = -1693460413
	)
	static int field582;
	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "[Lix;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("jf")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jk")
	static int[][][] field585;
	@ObfuscatedName("jb")
	static final int[] field586;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -347129783
	)
	static int field587;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = -1417865199
	)
	static int field545;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 1852559161
	)
	static int field560;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = 1412852269
	)
	static int field590;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 1638558953
	)
	static int field624;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = -1246816987
	)
	static int field592;
	@ObfuscatedName("ko")
	static boolean field601;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = 1953249277
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = 2121411655
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = -1007554421
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = 1479747429
	)
	static int field752;
	@ObfuscatedName("kf")
	@ObfuscatedGetter(
		intValue = 1507685453
	)
	static int field703;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = 1595536669
	)
	static int field599;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = -1293676985
	)
	static int field600;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = 1994415445
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = 1778250469
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = -1672423485
	)
	static int field709;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = 797124179
	)
	static int field580;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = 513530031
	)
	static int field605;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = -976694797
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = -1458097173
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = 1629336117
	)
	static int field608;
	@ObfuscatedName("lb")
	static boolean field609;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = -998840009
	)
	static int field610;
	@ObfuscatedName("lm")
	static boolean field640;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = -371524041
	)
	static int field612;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = -625616649
	)
	static int field613;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = -1628681735
	)
	static int field614;
	@ObfuscatedName("ln")
	static int[] field615;
	@ObfuscatedName("lq")
	static int[] field616;
	@ObfuscatedName("la")
	static int[] field775;
	@ObfuscatedName("ld")
	static int[] field604;
	@ObfuscatedName("lr")
	static int[] field619;
	@ObfuscatedName("lc")
	static int[] field793;
	@ObfuscatedName("ls")
	static int[][] field779;
	@ObfuscatedName("li")
	static int[] field636;
	@ObfuscatedName("ly")
	static String[] field751;
	@ObfuscatedName("lx")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = -2035946903
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = -797919909
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = 1954584333
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = 1973291607
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = -350322505
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -1879688637
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = -1597326181
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("lw")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = -1923012897
	)
	static int field750;
	@ObfuscatedName("mi")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "[Ldi;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = 513998151
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = 117631011
	)
	static int field783;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		longValue = 1568259725910291393L
	)
	static long field638;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		longValue = 823820592882865525L
	)
	static long field639;
	@ObfuscatedName("mx")
	static boolean field598;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = 1238176185
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = -2108726621
	)
	static int field637;
	@ObfuscatedName("ms")
	static int[] field643;
	@ObfuscatedName("me")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("mw")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("ml")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("mk")
	static int[] field647;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = -318971713
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "[[[Lps;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("nm")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("na")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("no")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nj")
	static int[] field656;
	@ObfuscatedName("nr")
	static boolean field809;
	@ObfuscatedName("ny")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("nk")
	@ObfuscatedGetter(
		intValue = 1393357457
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("nl")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("ni")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("ns")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("nb")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("nv")
	static int[] field602;
	@ObfuscatedName("nh")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("nd")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("ng")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("nx")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("np")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("nu")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = -326620835
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = 104209035
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = -151568775
	)
	static int field673;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = -213845595
	)
	static int field622;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = 1884054561
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("of")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = 375242793
	)
	static int field678;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = 393054261
	)
	static int field688;
	@ObfuscatedName("oc")
	static String field557;
	@ObfuscatedName("ow")
	static String field801;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = -1830863367
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = 505783049
	)
	static int field684;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = 1873470081
	)
	static int field685;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = -171298679
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = 1117430523
	)
	static int field633;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = -1474026165
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = 1268471839
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = -1713173713
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pm")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -510641151
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = -1499508753
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("po")
	static boolean field699;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = 2101611289
	)
	static int field700;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 1332326869
	)
	static int field701;
	@ObfuscatedName("pd")
	static boolean field702;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = -1301134505
	)
	static int field570;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = -508397453
	)
	static int field704;
	@ObfuscatedName("ph")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = 186152535
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pf")
	static int[] field707;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = -1863139113
	)
	static int field708;
	@ObfuscatedName("qu")
	static int[] field572;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = 1747756183
	)
	static int field710;
	@ObfuscatedName("qe")
	static int[] field711;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = -267819995
	)
	static int field658;
	@ObfuscatedName("qp")
	static int[] field631;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = 690667561
	)
	static int field714;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = -1248244123
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = 1035217401
	)
	static int field716;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = -1135055711
	)
	static int field717;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = 1448568019
	)
	static int field681;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = -815242923
	)
	static int field719;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = 1475690985
	)
	static int field720;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = 376064475
	)
	static int field721;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = 283544713
	)
	static int field722;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = -196122999
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	static class552 field724;
	@ObfuscatedName("qg")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	static NodeDeque field593;
	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	static NodeDeque field520;
	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	static NodeDeque field726;
	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = -1439005657
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = 175721625
	)
	static int field731;
	@ObfuscatedName("rd")
	static boolean[] field732;
	@ObfuscatedName("ri")
	static boolean[] field816;
	@ObfuscatedName("rx")
	static boolean[] field734;
	@ObfuscatedName("rh")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("rf")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("ry")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("rr")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		intValue = -1698294165
	)
	static int field739;
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		longValue = -5593846966809055143L
	)
	static long field740;
	@ObfuscatedName("rn")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("ra")
	static int[] field738;
	@ObfuscatedName("rc")
	@ObfuscatedGetter(
		intValue = -2083220223
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = 999936741
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("re")
	static String field745;
	@ObfuscatedName("se")
	static long[] field746;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = -1721427473
	)
	static int field747;
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	static class228 field748;
	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	static class226 field749;
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = -2088147641
	)
	static int field611;
	@ObfuscatedName("so")
	static int[] field512;
	@ObfuscatedName("sz")
	static int[] field767;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		longValue = -2562681905139049269L
	)
	static long field753;
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "[Lfp;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "[Lgi;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = -2057565107
	)
	static int field756;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		intValue = -135296505
	)
	static int field627;
	@ObfuscatedName("sa")
	static int[] field758;
	@ObfuscatedName("sn")
	static int[] field759;
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	static SpritePixels[] field760;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = -1140692337
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = -2139653513
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("th")
	@ObfuscatedGetter(
		intValue = 2073268087
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("ts")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("tg")
	@ObfuscatedGetter(
		intValue = -1120697751
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("ty")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("td")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("tn")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("to")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("tv")
	static int[] field770;
	@ObfuscatedName("tu")
	@ObfuscatedSignature(
		descriptor = "[Lbu;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("tx")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("tc")
	static boolean field603;
	@ObfuscatedName("tt")
	static boolean field774;
	@ObfuscatedName("tk")
	static boolean field514;
	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	static class499 field776;
	@ObfuscatedName("uh")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	static class498 field777;
	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	static class498 field778;
	@ObfuscatedName("uu")
	static boolean field626;
	@ObfuscatedName("uq")
	static boolean[] field780;
	@ObfuscatedName("ux")
	static int[] field744;
	@ObfuscatedName("ug")
	static int[] field782;
	@ObfuscatedName("uf")
	static int[] field548;
	@ObfuscatedName("us")
	static int[] field784;
	@ObfuscatedName("uc")
	static short field785;
	@ObfuscatedName("ue")
	static short field786;
	@ObfuscatedName("uz")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("ui")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("um")
	static short field789;
	@ObfuscatedName("vj")
	static short field728;
	@ObfuscatedName("vl")
	static short field791;
	@ObfuscatedName("vg")
	static short field792;
	@ObfuscatedName("vq")
	@ObfuscatedGetter(
		intValue = 1240360395
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vi")
	@ObfuscatedGetter(
		intValue = -95363373
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("vb")
	@ObfuscatedGetter(
		intValue = 320464101
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vv")
	@ObfuscatedGetter(
		intValue = -1387919075
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vc")
	@ObfuscatedGetter(
		intValue = 1263846625
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vd")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("vp")
	@ObfuscatedGetter(
		intValue = -317981919
	)
	static int field799;
	@ObfuscatedName("vx")
	@ObfuscatedGetter(
		intValue = 458385547
	)
	static int field800;
	@ObfuscatedName("vk")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	static class495 field621;
	@ObfuscatedName("gj")
	String field549;
	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	class14 field618;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	class18 field551;
	@ObfuscatedName("gc")
	OtlTokenRequester field806;
	@ObfuscatedName("gk")
	Future field553;
	@ObfuscatedName("gf")
	boolean field790;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 1420283109
	)
	int field517;
	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	class18 field654;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field524;
	@ObfuscatedName("gh")
	Future field558;
	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	Buffer field564;
	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	class7 field565;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		longValue = -8932366639438060943L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field803 = true; // L: 168
		worldId = 1; // L: 169
		worldProperties = 0; // L: 170
		gameBuild = 0; // L: 172
		isMembersWorld = false; // L: 175
		isLowDetail = false; // L: 176
		field513 = -1; // L: 181
		clientType = -1; // L: 182
		field794 = -1; // L: 183
		onMobile = false; // L: 184
		gameState = 0; // L: 196
		isLoading = false; // L: 197
		field788 = false; // L: 198
		field521 = true; // L: 201
		cycle = 0; // L: 202
		mouseLastLastPressedTimeMillis = -1L; // L: 203
		field795 = -1; // L: 205
		field525 = -1; // L: 206
		field526 = -1L; // L: 207
		field527 = true; // L: 208
		rebootTimer = 0; // L: 209
		field529 = 0; // L: 210
		field530 = 0; // L: 211
		field531 = 0; // L: 212
		field532 = 0; // L: 213
		field620 = 0; // L: 214
		field534 = 0; // L: 215
		field535 = 0; // L: 216
		field712 = 0; // L: 217
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 219
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 220
		renderSelf = false; // L: 222
		field540 = class93.field1152; // L: 231
		js5ConnectState = 0; // L: 234
		field542 = 0; // L: 235
		js5Errors = 0; // L: 259
		field544 = 0; // L: 263
		field667 = 0; // L: 264
		field546 = 0; // L: 265
		field547 = class140.field1656; // L: 266
		field810 = class539.field5290; // L: 267
		field781 = class130.method3012(class27.method401("com_jagex_auth_desktop_osrs:public")); // L: 290
		field559 = class130.method3012(class27.method401("com_jagex_auth_desktop_runelite:public")); // L: 291
		Login_isUsernameRemembered = false; // L: 305
		field563 = new SecureRandomFuture(); // L: 306
		randomDatData = null; // L: 312
		npcs = new NPC[65536]; // L: 316
		npcCount = 0; // L: 317
		npcIndices = new int[65536]; // L: 318
		field571 = 0; // L: 319
		field742 = new int[250]; // L: 320
		packetWriter = new PacketWriter(); // L: 323
		logoutTimer = 0; // L: 325
		hadNetworkError = false; // L: 326
		timer = new Timer(); // L: 327
		field623 = new HashMap(); // L: 333
		field578 = 0; // L: 340
		field579 = 1; // L: 341
		field727 = 0; // L: 342
		field581 = 1; // L: 343
		field582 = 0; // L: 344
		collisionMaps = new CollisionMap[4]; // L: 352
		isInInstance = false; // L: 353
		field585 = new int[4][13][13]; // L: 354
		field586 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 355
		field587 = -1; // L: 358
		field545 = 0; // L: 359
		field560 = 2301979; // L: 371
		field590 = 5063219; // L: 372
		field624 = 3353893; // L: 373
		field592 = 7759444; // L: 374
		field601 = false; // L: 375
		alternativeScrollbarWidth = 0; // L: 376
		camAngleX = 128; // L: 384
		camAngleY = 0; // L: 385
		field752 = 0; // L: 386
		field703 = 0; // L: 387
		field599 = 0; // L: 388
		field600 = 0; // L: 389
		oculusOrbState = 0; // L: 390
		camFollowHeight = 50; // L: 391
		field709 = 0; // L: 395
		field580 = 0; // L: 396
		field605 = 0; // L: 397
		oculusOrbNormalSpeed = 12; // L: 399
		oculusOrbSlowedSpeed = 6; // L: 400
		field608 = 0; // L: 401
		field609 = false; // L: 402
		field610 = 0; // L: 403
		field640 = false; // L: 404
		field612 = 0; // L: 405
		field613 = 0; // L: 406
		field614 = 50; // L: 407
		field615 = new int[field614]; // L: 408
		field616 = new int[field614]; // L: 409
		field775 = new int[field614]; // L: 410
		field604 = new int[field614]; // L: 411
		field619 = new int[field614]; // L: 412
		field793 = new int[field614]; // L: 413
		field779 = new int[field614][]; // L: 414
		field636 = new int[field614]; // L: 415
		field751 = new String[field614]; // L: 416
		tileLastDrawnActor = new int[104][104]; // L: 417
		viewportDrawCount = 0; // L: 418
		viewportTempX = -1; // L: 419
		viewportTempY = -1; // L: 420
		mouseCrossX = 0; // L: 421
		mouseCrossY = 0; // L: 422
		mouseCrossState = 0; // L: 423
		mouseCrossColor = 0; // L: 424
		showMouseCross = true; // L: 425
		field750 = 0; // L: 426
		showLoadingMessages = true; // L: 428
		players = new Player[2048]; // L: 430
		localPlayerIndex = -1; // L: 432
		field783 = 0; // L: 433
		field638 = -1L; // L: 434
		field639 = -1L; // L: 435
		field598 = true; // L: 437
		drawPlayerNames = 0; // L: 442
		field637 = 0; // L: 443
		field643 = new int[1000]; // L: 444
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 446
		playerMenuActions = new String[8]; // L: 447
		playerOptionsPriorities = new boolean[8]; // L: 448
		field647 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 449
		combatTargetPlayerIndex = -1; // L: 450
		groundItems = new NodeDeque[4][104][104]; // L: 451
		pendingSpawns = new NodeDeque(); // L: 452
		projectiles = new NodeDeque(); // L: 453
		graphicsObjects = new NodeDeque(); // L: 454
		currentLevels = new int[25]; // L: 455
		levels = new int[25]; // L: 456
		experience = new int[25]; // L: 457
		field656 = new int[25]; // L: 458
		field809 = false; // L: 459
		isMenuOpen = false; // L: 460
		menuOptionsCount = 0; // L: 466
		menuArguments1 = new int[500]; // L: 467
		menuArguments2 = new int[500]; // L: 468
		menuOpcodes = new int[500]; // L: 469
		menuIdentifiers = new int[500]; // L: 470
		field602 = new int[500]; // L: 471
		menuActions = new String[500]; // L: 472
		menuTargets = new String[500]; // L: 473
		menuShiftClick = new boolean[500]; // L: 474
		followerOpsLowPriority = false; // L: 475
		tapToDrop = false; // L: 477
		showMouseOverText = true; // L: 478
		viewportX = -1; // L: 479
		viewportY = -1; // L: 480
		field673 = 0; // L: 484
		field622 = 50; // L: 485
		isItemSelected = 0; // L: 486
		field676 = null; // L: 490
		isSpellSelected = false; // L: 491
		field678 = -1; // L: 493
		field688 = -1; // L: 494
		field557 = null; // L: 496
		field801 = null; // L: 497
		rootInterface = -1; // L: 498
		interfaceParents = new NodeHashTable(8); // L: 499
		field684 = 0; // L: 504
		field685 = -1; // L: 505
		chatEffects = 0; // L: 506
		meslayerContinueWidget = null; // L: 507
		field633 = 0; // L: 508
		weight = 0; // L: 509
		staffModLevel = 0; // L: 510
		followerIndex = -1; // L: 511
		playerMod = false; // L: 512
		viewportWidget = null; // L: 513
		clickedWidget = null; // L: 514
		clickedWidgetParent = null; // L: 515
		widgetClickX = 0; // L: 516
		widgetClickY = 0; // L: 517
		draggedOnWidget = null; // L: 518
		field699 = false; // L: 519
		field700 = -1; // L: 520
		field701 = -1; // L: 521
		field702 = false; // L: 522
		field570 = -1; // L: 523
		field704 = -1; // L: 524
		isDraggingWidget = false; // L: 525
		cycleCntr = 1; // L: 530
		field707 = new int[32]; // L: 533
		field708 = 0; // L: 534
		field572 = new int[32]; // L: 535
		field710 = 0; // L: 536
		field711 = new int[32]; // L: 537
		field658 = 0; // L: 538
		field631 = new int[32]; // L: 539
		field714 = 0; // L: 540
		chatCycle = 0; // L: 541
		field716 = 0; // L: 542
		field717 = 0; // L: 543
		field681 = 0; // L: 544
		field719 = 0; // L: 545
		field720 = 0; // L: 546
		field721 = 0; // L: 547
		field722 = 0; // L: 548
		mouseWheelRotation = 0; // L: 554
		field724 = new class552(); // L: 555
		scriptEvents = new NodeDeque(); // L: 556
		field593 = new NodeDeque(); // L: 557
		field520 = new NodeDeque(); // L: 558
		field726 = new NodeDeque(); // L: 559
		widgetFlags = new NodeHashTable(512); // L: 560
		rootWidgetCount = 0; // L: 562
		field731 = -2; // L: 563
		field732 = new boolean[100]; // L: 564
		field816 = new boolean[100]; // L: 565
		field734 = new boolean[100]; // L: 566
		rootWidgetXs = new int[100]; // L: 567
		rootWidgetYs = new int[100]; // L: 568
		rootWidgetWidths = new int[100]; // L: 569
		rootWidgetHeights = new int[100]; // L: 570
		field739 = 0; // L: 571
		field740 = 0L; // L: 572
		isResizable = true; // L: 573
		field738 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 580
		publicChatMode = 0; // L: 581
		tradeChatMode = 0; // L: 583
		field745 = ""; // L: 584
		field746 = new long[100]; // L: 586
		field747 = 0; // L: 587
		field748 = new class228(); // L: 588
		field749 = new class226(); // L: 589
		field611 = 0; // L: 591
		field512 = new int[128]; // L: 592
		field767 = new int[128]; // L: 593
		field753 = -1L; // L: 594
		currentClanSettings = new ClanSettings[4]; // L: 598
		currentClanChannels = new ClanChannel[4]; // L: 600
		field756 = -1; // L: 602
		field627 = 0; // L: 603
		field758 = new int[1000]; // L: 604
		field759 = new int[1000]; // L: 605
		field760 = new SpritePixels[1000]; // L: 606
		destinationX = 0; // L: 607
		destinationY = 0; // L: 608
		minimapState = 0; // L: 615
		playingJingle = false; // L: 616
		soundEffectCount = 0; // L: 621
		soundEffectIds = new int[50]; // L: 622
		queuedSoundEffectLoops = new int[50]; // L: 623
		queuedSoundEffectDelays = new int[50]; // L: 624
		soundLocations = new int[50]; // L: 625
		field770 = new int[50]; // L: 626
		soundEffects = new SoundEffect[50]; // L: 627
		isCameraLocked = false; // L: 629
		field603 = false; // L: 635
		field774 = false; // L: 636
		field514 = false; // L: 637
		field776 = null; // L: 643
		field777 = null; // L: 644
		field778 = null; // L: 645
		field626 = false; // L: 646
		field780 = new boolean[5]; // L: 654
		field744 = new int[5]; // L: 655
		field782 = new int[5]; // L: 656
		field548 = new int[5]; // L: 657
		field784 = new int[5]; // L: 658
		field785 = 256; // L: 659
		field786 = 205; // L: 660
		zoomHeight = 256; // L: 661
		zoomWidth = 320; // L: 662
		field789 = 1; // L: 663
		field728 = 32767; // L: 664
		field791 = 1; // L: 665
		field792 = 32767; // L: 666
		viewportOffsetX = 0; // L: 667
		viewportOffsetY = 0; // L: 668
		viewportWidth = 0; // L: 669
		viewportHeight = 0; // L: 670
		viewportZoom = 0; // L: 671
		playerAppearance = new PlayerComposition(); // L: 673
		field799 = -1; // L: 674
		field800 = -1; // L: 675
		field621 = new DesktopPlatformInfoProvider(); // L: 677
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 679
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 682
		field597 = new class443(8, class441.field4748); // L: 684
		Widget_cachedModels = new EvictingDualNodeHashTable(64); // L: 686
		Widget_cachedFonts = new EvictingDualNodeHashTable(64); // L: 687
		field807 = -1; // L: 690
		field808 = -1; // L: 696
		field533 = new ArrayList(); // L: 697
		field629 = new class234(); // L: 698
		archiveLoaders = new ArrayList(10); // L: 699
		archiveLoadersDone = 0; // L: 700
		field773 = 0; // L: 701
		field814 = new ApproximateRouteStrategy(); // L: 710
		field815 = new int[50]; // L: 711
		field655 = new int[50]; // L: 712
	}

	public Client() {
		this.field790 = false; // L: 285
		this.field517 = 0; // L: 286
		this.accountHash = -1L; // L: 311
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "93"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field740 = VerticalAlignment.method3924() + 500L; // L: 4619
		this.resizeJS(); // L: 4620
		if (rootInterface != -1) { // L: 4621
			this.resizeRoot(true);
		}

	} // L: 4622

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2131760919"
	)
	@Export("setUp")
	protected final void setUp() {
		class195.method3737(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}); // L: 1001
		int var2 = worldProperties; // L: 1003
		class530 var3 = class530.field5203; // L: 1004
		boolean var1 = (var2 & var3.rsOrdinal()) != 0; // L: 1006
		ScriptFrame.field460 = var1; // L: 1008
		class10.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 1009
		SoundCache.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 1010
		DesktopPlatformInfoProvider.currentPort = class10.worldPort; // L: 1011
		class172.field1858 = class348.field3729; // L: 1012
		UrlRequester.field1454 = class348.field3728; // L: 1013
		PlayerComposition.field3682 = class348.field3727; // L: 1014
		class1.field6 = class348.field3726; // L: 1015
		class94.urlRequester = new class114(this.field790, 221); // L: 1016
		this.setUpKeyboard(); // L: 1018
		this.method613(); // L: 1019
		HealthBar.field1324 = this.mouseWheel(); // L: 1020
		this.method466(field749, 0); // L: 1021
		this.method466(field748, 1); // L: 1022
		this.setUpClipboard(); // L: 1023
		Decimator.field392 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1025
		NPC.clientPreferences = Projectile.method2178(); // L: 1026
		String var5 = class311.field3313; // L: 1028
		class31.field153 = this; // L: 1030
		if (var5 != null) { // L: 1031
			class31.field150 = var5;
		}

		MouseRecorder.setWindowedMode(NPC.clientPreferences.method2560()); // L: 1033
		class334.friendSystem = new FriendSystem(class127.loginType); // L: 1034
		this.field618 = new class14("tokenRequest", 1, 1); // L: 1035
		if (!class321.field3499.contains(this)) { // L: 1038
			class321.field3499.add(this); // L: 1039
		}

		field629.method4441(); // L: 1042
	} // L: 1043

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1556625952"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 1051
		this.doCycleJs5(); // L: 1052

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 1056
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 1057
			} // L: 1058

			if (var1 == null) { // L: 1059
				boolean var11 = false; // L: 1065
				boolean var12 = false; // L: 1066
				if (!class321.field3498.isEmpty()) { // L: 1067
					class426 var4 = (class426)class321.field3498.get(0); // L: 1068
					if (var4 == null) { // L: 1069
						class321.field3498.remove(0); // L: 1070
					} else if (var4.vmethod7854()) { // L: 1072
						if (var4.method7826()) { // L: 1073
							System.out.println("Error in midimanager.service: " + var4.method7842()); // L: 1074
							var11 = true; // L: 1075
						} else {
							if (var4.method7827() != null) { // L: 1078
								class321.field3498.add(1, var4.method7827()); // L: 1079
							}

							var12 = var4.method7829(); // L: 1081
						}

						class321.field3498.remove(0); // L: 1083
					} else {
						var12 = var4.method7829(); // L: 1086
					}
				}

				if (var11) { // L: 1089
					class321.field3498.clear(); // L: 1090
					Iterator var16 = class321.field3495.iterator(); // L: 1092

					label135:
					while (true) {
						class333 var5;
						do {
							if (!var16.hasNext()) {
								class321.field3495.clear(); // L: 1114
								break label135;
							}

							var5 = (class333)var16.next(); // L: 1093
						} while(var5 == null); // L: 1095

						var5.field3613.clear(); // L: 1098
						var5.field3613.method6004(); // L: 1099
						var5.field3613.setPcmStreamVolume(0); // L: 1100
						var5.field3613.field3534 = 0; // L: 1101
						int var6 = var5.field3605; // L: 1102
						int var7 = var5.field3606; // L: 1103
						Iterator var8 = class321.field3499.iterator(); // L: 1105

						while (var8.hasNext()) {
							class327 var9 = (class327)var8.next(); // L: 1106
							var9.vmethod6187(var6, var7); // L: 1108
						}
					}
				}

				if (var12 && playingJingle && class144.pcmPlayer1 != null) { // L: 1120 1121
					class144.pcmPlayer1.tryDiscard();
				}

				class167.method3417(); // L: 1123
				field748.method4327(); // L: 1124
				this.method530(); // L: 1125
				synchronized(MouseHandler.MouseHandler_instance) { // L: 1127
					MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 1128
					MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 1129
					MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 1130
					MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 1131
					MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 1132
					MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 1133
					MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 1134
					MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 1135
					MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 1136
				} // L: 1137

				if (HealthBar.field1324 != null) { // L: 1139
					int var17 = HealthBar.field1324.useRotation(); // L: 1140
					mouseWheelRotation = var17; // L: 1141
				}

				if (gameState == 0) { // L: 1143
					KitDefinition.method3775(); // L: 1144
					class11.method103(); // L: 1145
				} else if (gameState == 5) { // L: 1147
					Huffman.method6808(this, DevicePcmPlayerProvider.field96, class316.fontPlain12); // L: 1148
					KitDefinition.method3775(); // L: 1149
					class11.method103(); // L: 1150
				} else if (gameState != 10 && gameState != 11) { // L: 1152
					if (gameState == 20) { // L: 1155
						Huffman.method6808(this, DevicePcmPlayerProvider.field96, class316.fontPlain12); // L: 1156
						this.doCycleLoggedOut(); // L: 1157
					} else if (gameState == 50) { // L: 1159
						Huffman.method6808(this, DevicePcmPlayerProvider.field96, class316.fontPlain12); // L: 1160
						this.doCycleLoggedOut(); // L: 1161
					} else if (gameState == 25) { // L: 1163
						class444.method8026(); // L: 1164
					}
				} else {
					Huffman.method6808(this, DevicePcmPlayerProvider.field96, class316.fontPlain12); // L: 1153
				}

				if (gameState == 30) { // L: 1166
					this.doCycleLoggedIn(); // L: 1167
				} else if (gameState == 40 || gameState == 45) { // L: 1169
					this.doCycleLoggedOut(); // L: 1170
				}

				return; // L: 1172
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false); // L: 1060
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "17"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field740 && VerticalAlignment.method3924() > field740) { // L: 1176 1177
			MouseRecorder.setWindowedMode(class36.getWindowedMode()); // L: 1178
		}

		int var2;
		if (var1) { // L: 1181
			for (var2 = 0; var2 < 100; ++var2) { // L: 1182
				field732[var2] = true;
			}
		}

		if (gameState == 0) { // L: 1184
			this.method574(Login.Login_loadingPercent, Login.Login_loadingText, var1, class276.field3052); // L: 1185
		} else if (gameState == 5) { // L: 1187
			GrandExchangeEvent.drawTitle(DevicePcmPlayerProvider.fontBold12, DevicePcmPlayerProvider.field96, class316.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1188
			if (gameState == 20) { // L: 1189
				GrandExchangeEvent.drawTitle(DevicePcmPlayerProvider.fontBold12, DevicePcmPlayerProvider.field96, class316.fontPlain12);
			} else if (gameState == 50) { // L: 1190
				GrandExchangeEvent.drawTitle(DevicePcmPlayerProvider.fontBold12, DevicePcmPlayerProvider.field96, class316.fontPlain12);
			} else if (gameState == 25) { // L: 1191
				if (field582 == 1) { // L: 1192
					if (field578 > field579) { // L: 1193
						field579 = field578;
					}

					var2 = (field579 * 50 - field578 * 50) / field579; // L: 1194
					WorldMapSectionType.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false); // L: 1195
				} else if (field582 == 2) { // L: 1197
					if (field727 > field581) { // L: 1198
						field581 = field727;
					}

					var2 = (field581 * 50 - field727 * 50) / field581 + 50; // L: 1199
					WorldMapSectionType.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false); // L: 1200
				} else {
					WorldMapSectionType.drawLoadingMessage("Loading - please wait.", false); // L: 1202
				}
			} else if (gameState == 30) { // L: 1204
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1205
				WorldMapSectionType.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1206
				WorldMapSectionType.drawLoadingMessage("Please wait...", false);
			}
		} else {
			GrandExchangeEvent.drawTitle(DevicePcmPlayerProvider.fontBold12, DevicePcmPlayerProvider.field96, class316.fontPlain12); // L: 1196
		}

		if (gameState == 30 && field739 == 0 && !var1 && !isResizable) { // L: 1207
			for (var2 = 0; var2 < rootWidgetCount; ++var2) { // L: 1208
				if (field816[var2]) { // L: 1209
					UserComparator9.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]); // L: 1210
					field816[var2] = false; // L: 1211
				}
			}
		} else if (gameState > 0) { // L: 1215
			UserComparator9.rasterProvider.drawFull(0, 0); // L: 1216

			for (var2 = 0; var2 < rootWidgetCount; ++var2) { // L: 1217
				field816[var2] = false;
			}
		}

	} // L: 1219

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-283961032"
	)
	@Export("kill0")
	protected final void kill0() {
		// $FF: Couldn't be decompiled
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "740257686"
	)
	protected final void vmethod1203() {
	} // L: 723

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1417553926"
	)
	boolean method1206() {
		return this.field517 == 1; // L: 898
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "569638281"
	)
	boolean method1531() {
		return class308.field3199 != null && !class308.field3199.trim().isEmpty() && class103.field1350 != null && !class103.field1350.trim().isEmpty(); // L: 938
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2073819898"
	)
	boolean method1211() {
		return class134.field1618 != null && !class134.field1618.trim().isEmpty() && class363.field3973 != null && !class363.field3973.trim().isEmpty(); // L: 942
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-92"
	)
	@Export("isOtlTokenRequesterInitialized")
	boolean isOtlTokenRequesterInitialized() {
		return this.field806 != null; // L: 946
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1043645398"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 950
		var2.put("grant_type", "refresh_token"); // L: 951
		var2.put("scope", "gamesso.token.create"); // L: 952
		var2.put("refresh_token", var1); // L: 953
		URL var3 = new URL(ArchiveLoader.field1054 + "shield/oauth/token" + (new class483(var2)).method8562()); // L: 954
		class439 var4 = new class439(); // L: 955
		if (this.method1206()) { // L: 956
			var4.method7942(field559); // L: 957
		} else {
			var4.method7942(field781); // L: 960
		}

		var4.method7957("Host", (new URL(ArchiveLoader.field1054)).getHost()); // L: 962
		var4.method7946(class480.field4905); // L: 963
		class9 var5 = class9.field30; // L: 964
		RefreshAccessTokenRequester var6 = this.field524; // L: 965
		if (var6 != null) { // L: 966
			this.field558 = var6.request(var5.method69(), var3, var4.method7939(), ""); // L: 967
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field790); // L: 970
			this.field654 = this.field618.method174(var7); // L: 971
		}
	} // L: 968 972

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1704443459"
	)
	void method1214(String var1) throws IOException {
		URL var2 = new URL(ArchiveLoader.field1054 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 975
		class439 var3 = new class439(); // L: 976
		var3.method7961(var1); // L: 977
		class9 var4 = class9.field28; // L: 978
		OtlTokenRequester var5 = this.field806; // L: 979
		if (var5 != null) { // L: 980
			this.field553 = var5.request(var4.method69(), var2, var3.method7939(), ""); // L: 981
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field790); // L: 984
			this.field551 = this.field618.method174(var6); // L: 985
		}
	} // L: 982 986

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "13"
	)
	void method1215(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class31.field154 + "game-session/v1/tokens"); // L: 989
		class10 var4 = new class10(var3, class9.field30, this.field790); // L: 990
		var4.method84().method7961(var1); // L: 991
		var4.method84().method7946(class480.field4905); // L: 992
		JSONObject var5 = new JSONObject(); // L: 993
		var5.put("accountId", var2); // L: 994
		var4.method87(new class482(var5)); // L: 995
		this.field551 = this.field618.method174(var4); // L: 996
	} // L: 997

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "295726016"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1375
			boolean var1 = ChatChannel.field1023.method7050(); // L: 1376
			if (!var1) { // L: 1377
				this.method1373();
			}

		}
	} // L: 1378

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1480366802"
	)
	void method1373() {
		if (ChatChannel.field1023.field4456 >= 4) { // L: 1381
			this.error("js5crc"); // L: 1382
			FaceNormal.method4886(1000); // L: 1383
		} else {
			if (ChatChannel.field1023.field4457 >= 4) { // L: 1386
				if (gameState <= 5) { // L: 1387
					this.error("js5io"); // L: 1388
					FaceNormal.method4886(1000); // L: 1389
					return; // L: 1390
				}

				field542 = 3000; // L: 1393
				ChatChannel.field1023.field4457 = 3; // L: 1394
			}

			if (--field542 + 1 <= 0) { // L: 1397
				try {
					if (js5ConnectState == 0) { // L: 1399
						class411.js5SocketTask = class350.taskHandler.method3499(class166.worldHost, DesktopPlatformInfoProvider.currentPort); // L: 1400
						++js5ConnectState; // L: 1401
					}

					if (js5ConnectState == 1) { // L: 1403
						if (class411.js5SocketTask.status == 2) { // L: 1404
							this.js5Error(-1); // L: 1405
							return; // L: 1406
						}

						if (class411.js5SocketTask.status == 1) { // L: 1408
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1410
						Socket var2 = (Socket)class411.js5SocketTask.result; // L: 1412
						BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000); // L: 1414
						ViewportMouse.js5Socket = var1; // L: 1416
						Buffer var3 = new Buffer(5); // L: 1417
						var3.writeByte(class314.field3448.field3456); // L: 1418
						var3.writeIntME(221); // L: 1419
						ViewportMouse.js5Socket.write(var3.array, 0, 5); // L: 1420
						++js5ConnectState; // L: 1421
						class167.field1823 = VerticalAlignment.method3924(); // L: 1422
					}

					if (js5ConnectState == 3) { // L: 1424
						if (ViewportMouse.js5Socket.vmethod8271() > 0) { // L: 1425
							int var4 = ViewportMouse.js5Socket.vmethod8273(); // L: 1426
							if (var4 != 0) { // L: 1427
								this.js5Error(var4); // L: 1428
								return; // L: 1429
							}

							++js5ConnectState; // L: 1431
						} else if (VerticalAlignment.method3924() - class167.field1823 > 30000L) { // L: 1434
							this.js5Error(-2); // L: 1435
							return; // L: 1436
						}
					}

					if (js5ConnectState == 4) { // L: 1440
						ChatChannel.field1023.method7053(ViewportMouse.js5Socket, gameState > 20); // L: 1441
						class411.js5SocketTask = null; // L: 1442
						ViewportMouse.js5Socket = null; // L: 1443
						js5ConnectState = 0; // L: 1444
						js5Errors = 0; // L: 1445
					}
				} catch (IOException var5) { // L: 1448
					this.js5Error(-3); // L: 1449
				}

			}
		}
	} // L: 1384 1451

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1926825051"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class411.js5SocketTask = null; // L: 1454
		ViewportMouse.js5Socket = null; // L: 1455
		js5ConnectState = 0; // L: 1456
		if (DesktopPlatformInfoProvider.currentPort == class10.worldPort) { // L: 1457
			DesktopPlatformInfoProvider.currentPort = SoundCache.js5Port;
		} else {
			DesktopPlatformInfoProvider.currentPort = class10.worldPort; // L: 1458
		}

		++js5Errors; // L: 1459
		if (js5Errors < 2 || var1 != 7 && var1 != 9) { // L: 1460
			if (js5Errors >= 2 && var1 == 6) { // L: 1467
				this.error("js5connect_outofdate"); // L: 1468
				FaceNormal.method4886(1000); // L: 1469
			} else if (js5Errors >= 4) { // L: 1471
				if (gameState <= 5) { // L: 1472
					this.error("js5connect"); // L: 1473
					FaceNormal.method4886(1000); // L: 1474
				} else {
					field542 = 3000; // L: 1476
				}
			}
		} else if (gameState <= 5) { // L: 1461
			this.error("js5connect_full"); // L: 1462
			FaceNormal.method4886(1000); // L: 1463
		} else {
			field542 = 3000; // L: 1465
		}

	} // L: 1478

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1121672504"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 1963
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 1964

		try {
			if (GraphicsObject.field894 == class67.field488) { // L: 1966
				if (ClanSettings.field1757 == null && (field563.isDone() || field544 > 250)) { // L: 1967
					ClanSettings.field1757 = field563.get(); // L: 1968
					field563.shutdown(); // L: 1969
					field563 = null; // L: 1970
				}

				if (ClanSettings.field1757 != null) { // L: 1972
					if (var1 != null) { // L: 1973
						((AbstractSocket)var1).close(); // L: 1974
						var1 = null; // L: 1975
					}

					class317.field3469 = null; // L: 1977
					hadNetworkError = false; // L: 1978
					field544 = 0; // L: 1979
					if (field810.method9558()) { // L: 1980
						if (this.method1531()) { // L: 1981
							try {
								this.requestOtlToken(class103.field1350); // L: 1983
								class102.method2651(class67.field503); // L: 1984
							} catch (Throwable var22) { // L: 1986
								class180.RunException_sendStackTrace((String)null, var22); // L: 1987
								KeyHandler.getLoginError(65); // L: 1988
								return; // L: 1989
							}
						} else {
							if (!this.method1211()) { // L: 1992
								KeyHandler.getLoginError(65); // L: 2004
								return; // L: 2005
							}

							try {
								this.method1215(class134.field1618, class363.field3973); // L: 1994
								class102.method2651(class67.field505); // L: 1995
							} catch (Exception var21) { // L: 1997
								class180.RunException_sendStackTrace((String)null, var21); // L: 1998
								KeyHandler.getLoginError(65); // L: 1999
								return; // L: 2000
							}
						}
					} else {
						class102.method2651(class67.field482); // L: 2009
					}
				}
			}

			class20 var24;
			if (GraphicsObject.field894 == class67.field503) { // L: 2013
				if (this.field558 != null) { // L: 2014
					if (!this.field558.isDone()) { // L: 2015
						return; // L: 2016
					}

					if (this.field558.isCancelled()) { // L: 2018
						KeyHandler.getLoginError(65); // L: 2019
						this.field558 = null; // L: 2020
						return; // L: 2021
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field558.get(); // L: 2024
						if (!var3.isSuccess()) { // L: 2025
							KeyHandler.getLoginError(65); // L: 2026
							this.field558 = null; // L: 2027
							return; // L: 2028
						}

						class308.field3199 = var3.getAccessToken(); // L: 2030
						class103.field1350 = var3.getRefreshToken(); // L: 2031
						this.field558 = null; // L: 2032
					} catch (Exception var20) { // L: 2034
						class180.RunException_sendStackTrace((String)null, var20); // L: 2035
						KeyHandler.getLoginError(65); // L: 2036
						this.field558 = null; // L: 2037
						return; // L: 2038
					}
				} else {
					if (this.field654 == null) { // L: 2041
						KeyHandler.getLoginError(65); // L: 2071
						return; // L: 2072
					}

					if (!this.field654.method258()) { // L: 2042
						return; // L: 2043
					}

					if (this.field654.method256()) { // L: 2045
						class180.RunException_sendStackTrace(this.field654.method257(), (Throwable)null); // L: 2046
						KeyHandler.getLoginError(65); // L: 2047
						this.field654 = null; // L: 2048
						return; // L: 2049
					}

					var24 = this.field654.method259(); // L: 2051
					if (var24.method272() != 200) { // L: 2052
						KeyHandler.getLoginError(65); // L: 2053
						this.field654 = null; // L: 2054
						return; // L: 2055
					}

					field544 = 0; // L: 2057
					class482 var4 = new class482(var24.method274()); // L: 2058

					try {
						class308.field3199 = var4.method8552().getString("access_token"); // L: 2060
						class103.field1350 = var4.method8552().getString("refresh_token"); // L: 2061
					} catch (Exception var19) { // L: 2063
						class180.RunException_sendStackTrace("Error parsing tokens", var19); // L: 2064
						KeyHandler.getLoginError(65); // L: 2065
						this.field654 = null; // L: 2066
						return; // L: 2067
					}
				}

				this.method1214(class308.field3199); // L: 2074
				class102.method2651(class67.field505); // L: 2075
			}

			if (GraphicsObject.field894 == class67.field505) { // L: 2077
				if (this.field553 != null) { // L: 2078
					if (!this.field553.isDone()) { // L: 2079
						return; // L: 2080
					}

					if (this.field553.isCancelled()) { // L: 2082
						KeyHandler.getLoginError(65); // L: 2083
						this.field553 = null; // L: 2084
						return; // L: 2085
					}

					try {
						OtlTokenResponse var25 = (OtlTokenResponse)this.field553.get(); // L: 2088
						if (!var25.isSuccess()) { // L: 2089
							KeyHandler.getLoginError(65); // L: 2090
							this.field553 = null; // L: 2091
							return; // L: 2092
						}

						this.field549 = var25.getToken(); // L: 2094
						this.field553 = null; // L: 2095
					} catch (Exception var18) { // L: 2097
						class180.RunException_sendStackTrace((String)null, var18); // L: 2098
						KeyHandler.getLoginError(65); // L: 2099
						this.field553 = null; // L: 2100
						return; // L: 2101
					}
				} else {
					if (this.field551 == null) { // L: 2104
						KeyHandler.getLoginError(65); // L: 2140
						return; // L: 2141
					}

					if (!this.field551.method258()) { // L: 2105
						return; // L: 2106
					}

					if (this.field551.method256()) { // L: 2108
						class180.RunException_sendStackTrace(this.field551.method257(), (Throwable)null); // L: 2109
						KeyHandler.getLoginError(65); // L: 2110
						this.field551 = null; // L: 2111
						return; // L: 2112
					}

					var24 = this.field551.method259(); // L: 2114
					if (var24.method272() != 200) { // L: 2115
						class180.RunException_sendStackTrace("Response code: " + var24.method272() + "Response body: " + var24.method274(), (Throwable)null); // L: 2116
						KeyHandler.getLoginError(65); // L: 2117
						this.field551 = null; // L: 2118
						return; // L: 2119
					}

					List var27 = (List)var24.method278().get("Content-Type"); // L: 2121
					if (var27 != null && var27.contains(class480.field4905.method8532())) { // L: 2122
						try {
							JSONObject var5 = new JSONObject(var24.method274()); // L: 2124
							this.field549 = var5.getString("token"); // L: 2125
						} catch (JSONException var17) { // L: 2127
							class180.RunException_sendStackTrace((String)null, var17); // L: 2128
							KeyHandler.getLoginError(65); // L: 2129
							this.field551 = null; // L: 2130
							return; // L: 2131
						}
					} else {
						this.field549 = var24.method274(); // L: 2135
					}

					this.field551 = null; // L: 2137
				}

				field544 = 0; // L: 2143
				class102.method2651(class67.field482); // L: 2144
			}

			if (class67.field482 == GraphicsObject.field894) { // L: 2146
				if (class317.field3469 == null) { // L: 2147
					class317.field3469 = class350.taskHandler.method3499(class166.worldHost, DesktopPlatformInfoProvider.currentPort); // L: 2148
				}

				if (class317.field3469.status == 2) { // L: 2150
					throw new IOException();
				}

				if (class317.field3469.status == 1) { // L: 2151
					Socket var29 = (Socket)class317.field3469.result; // L: 2153
					BufferedNetSocket var26 = new BufferedNetSocket(var29, 40000, 5000); // L: 2155
					var1 = var26; // L: 2157
					packetWriter.setSocket(var26); // L: 2158
					class317.field3469 = null; // L: 2159
					class102.method2651(class67.field506); // L: 2160
				}
			}

			PacketBufferNode var28;
			if (GraphicsObject.field894 == class67.field506) { // L: 2163
				packetWriter.clearBuffer(); // L: 2164
				var28 = class171.method3447(); // L: 2165
				var28.packetBuffer.writeByte(class314.field3454.field3456); // L: 2166
				packetWriter.addNode(var28); // L: 2167
				packetWriter.flush(); // L: 2168
				var2.offset = 0; // L: 2169
				class102.method2651(class67.field484); // L: 2170
			}

			int var13;
			if (GraphicsObject.field894 == class67.field484) { // L: 2172
				if (class144.pcmPlayer1 != null) { // L: 2173
					class144.pcmPlayer1.method763();
				}

				if (((AbstractSocket)var1).isAvailable(1)) { // L: 2174
					var13 = ((AbstractSocket)var1).vmethod8273(); // L: 2175
					if (class144.pcmPlayer1 != null) { // L: 2176
						class144.pcmPlayer1.method763();
					}

					if (var13 != 0) { // L: 2177
						KeyHandler.getLoginError(var13); // L: 2178
						return; // L: 2179
					}

					var2.offset = 0; // L: 2181
					class102.method2651(class67.field485); // L: 2182
				}
			}

			if (GraphicsObject.field894 == class67.field485) { // L: 2185
				if (var2.offset < 8) { // L: 2186
					var13 = ((AbstractSocket)var1).vmethod8271(); // L: 2187
					if (var13 > 8 - var2.offset) { // L: 2188
						var13 = 8 - var2.offset;
					}

					if (var13 > 0) { // L: 2189
						((AbstractSocket)var1).read(var2.array, var2.offset, var13); // L: 2190
						var2.offset += var13; // L: 2191
					}
				}

				if (var2.offset == 8) { // L: 2194
					var2.offset = 0; // L: 2195
					Buffer.field5233 = var2.readLong(); // L: 2196
					class102.method2651(class67.field481); // L: 2197
				}
			}

			if (class67.field481 == GraphicsObject.field894) { // L: 2200
				packetWriter.packetBuffer.offset = 0; // L: 2201
				packetWriter.clearBuffer(); // L: 2202
				PacketBuffer var30 = new PacketBuffer(500); // L: 2203
				int[] var31 = new int[]{ClanSettings.field1757.nextInt(), ClanSettings.field1757.nextInt(), ClanSettings.field1757.nextInt(), ClanSettings.field1757.nextInt()}; // L: 2204 2205 2206 2207 2208
				var30.offset = 0; // L: 2209
				var30.writeByte(1); // L: 2210
				var30.writeIntME(var31[0]); // L: 2211
				var30.writeIntME(var31[1]); // L: 2212
				var30.writeIntME(var31[2]); // L: 2213
				var30.writeIntME(var31[3]); // L: 2214
				var30.writeLong(Buffer.field5233); // L: 2215
				if (gameState == 40) { // L: 2216
					var30.writeIntME(Login.field965[0]); // L: 2217
					var30.writeIntME(Login.field965[1]); // L: 2218
					var30.writeIntME(Login.field965[2]); // L: 2219
					var30.writeIntME(Login.field965[3]); // L: 2220
				} else {
					if (gameState == 50) { // L: 2223
						var30.writeByte(class140.field1660.rsOrdinal()); // L: 2224
						var30.writeIntME(class332.field3603); // L: 2225
					} else {
						var30.writeByte(field547.rsOrdinal()); // L: 2228
						switch(field547.field1662) { // L: 2229
						case 0:
						case 2:
							var30.writeMedium(SpriteMask.field3628); // L: 2233
							++var30.offset; // L: 2234
							break; // L: 2235
						case 1:
							var30.offset += 4; // L: 2244
						case 3:
						default:
							break;
						case 4:
							var30.writeIntME(NPC.clientPreferences.method2484(Login.Login_username)); // L: 2239
						}
					}

					if (field810.method9558()) { // L: 2249
						var30.writeByte(class539.field5285.rsOrdinal()); // L: 2250
						var30.writeStringCp1252NullTerminated(this.field549); // L: 2251
					} else {
						var30.writeByte(class539.field5290.rsOrdinal()); // L: 2254
						var30.writeStringCp1252NullTerminated(Login.Login_password); // L: 2255
					}
				}

				var30.encryptRsa(class75.field923, class75.field921); // L: 2258
				Login.field965 = var31; // L: 2259
				PacketBufferNode var32 = class171.method3447(); // L: 2260
				var32.packetBuffer.offset = 0; // L: 2261
				if (gameState == 40) { // L: 2262
					var32.packetBuffer.writeByte(class314.field3451.field3456); // L: 2263
				} else {
					var32.packetBuffer.writeByte(class314.field3450.field3456); // L: 2266
				}

				var32.packetBuffer.writeShort(0); // L: 2268
				int var6 = var32.packetBuffer.offset; // L: 2269
				var32.packetBuffer.writeIntME(221); // L: 2270
				var32.packetBuffer.writeIntME(1); // L: 2271
				var32.packetBuffer.writeByte(clientType); // L: 2272
				var32.packetBuffer.writeByte(field794); // L: 2273
				byte var7 = 0; // L: 2274
				var32.packetBuffer.writeByte(var7); // L: 2275
				var32.packetBuffer.writeBytes(var30.array, 0, var30.offset); // L: 2276
				int var8 = var32.packetBuffer.offset; // L: 2277
				var32.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2278
				var32.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2279
				var32.packetBuffer.writeShort(class148.canvasWidth); // L: 2280
				var32.packetBuffer.writeShort(class342.canvasHeight); // L: 2281
				PacketBuffer var9 = var32.packetBuffer; // L: 2282
				if (randomDatData != null) { // L: 2284
					var9.writeBytes(randomDatData, 0, randomDatData.length); // L: 2285
				} else {
					byte[] var10 = Player.method2330(); // L: 2288
					var9.writeBytes(var10, 0, var10.length); // L: 2289
				}

				var32.packetBuffer.writeStringCp1252NullTerminated(ViewportMouse.field2868); // L: 2291
				var32.packetBuffer.writeIntME(class276.field3045); // L: 2292
				var32.packetBuffer.writeByte(0); // L: 2293
				Buffer var43 = new Buffer(class166.field1810.size()); // L: 2294
				class166.field1810.write(var43); // L: 2295
				var32.packetBuffer.writeBytes(var43.array, 0, var43.array.length); // L: 2296
				var32.packetBuffer.writeByte(clientType); // L: 2297
				var32.packetBuffer.writeIntME(0); // L: 2298
				if (ScriptFrame.field460) { // L: 2299
					var32.packetBuffer.method9250(class141.archive4.hash); // L: 2301
					var32.packetBuffer.method9407(UserComparator6.field1508.hash); // L: 2302
					var32.packetBuffer.method9250(class93.field1170.hash); // L: 2303
					var32.packetBuffer.method9315(GraphicsObject.field883.hash); // L: 2304
					var32.packetBuffer.method9315(GameEngine.field201.hash); // L: 2305
					var32.packetBuffer.method9315(SpriteMask.field3623.hash); // L: 2306
					var32.packetBuffer.method9250(class67.archive13.hash); // L: 2307
				} else {
					var32.packetBuffer.method9250(UrlRequester.field1452.hash); // L: 2312
					var32.packetBuffer.method9315(class141.archive4.hash); // L: 2313
					var32.packetBuffer.method9315(GraphicsObject.field883.hash); // L: 2314
					var32.packetBuffer.method9250(SceneTilePaint.field2883.hash); // L: 2315
					var32.packetBuffer.method9407(class67.archive13.hash); // L: 2316
					var32.packetBuffer.method9250(0); // L: 2317
					var32.packetBuffer.method9250(class17.field75.hash); // L: 2318
					var32.packetBuffer.writeIntME(SpriteMask.field3623.hash); // L: 2319
					var32.packetBuffer.method9407(class107.field1377.hash); // L: 2320
					var32.packetBuffer.writeIntME(class470.field4874.hash); // L: 2321
					var32.packetBuffer.method9407(GameEngine.field201.hash); // L: 2322
					var32.packetBuffer.method9250(UserComparator6.field1508.hash); // L: 2323
					var32.packetBuffer.method9315(class153.field1726.hash); // L: 2324
					var32.packetBuffer.method9315(SoundCache.field308.hash); // L: 2325
					var32.packetBuffer.writeIntME(class93.field1170.hash); // L: 2326
					var32.packetBuffer.writeIntME(GrandExchangeOfferOwnWorldComparator.archive12.hash); // L: 2327
					var32.packetBuffer.method9407(class73.field909.hash); // L: 2328
					var32.packetBuffer.method9315(GrandExchangeOfferOwnWorldComparator.field479.hash); // L: 2329
					var32.packetBuffer.method9315(WorldMapScaleHandler.field3167.hash); // L: 2330
					var32.packetBuffer.method9315(UserComparator9.archive2.hash); // L: 2331
					var32.packetBuffer.method9315(PlayerType.field4332.hash); // L: 2332
				}

				var32.packetBuffer.xteaEncrypt(var31, var8, var32.packetBuffer.offset); // L: 2335
				var32.packetBuffer.writeLengthShort(var32.packetBuffer.offset - var6); // L: 2336
				packetWriter.addNode(var32); // L: 2337
				packetWriter.flush(); // L: 2338
				packetWriter.isaacCipher = new IsaacCipher(var31); // L: 2339
				int[] var11 = new int[4]; // L: 2340

				for (int var12 = 0; var12 < 4; ++var12) { // L: 2341
					var11[var12] = var31[var12] + 50;
				}

				var2.newIsaacCipher(var11); // L: 2342
				class102.method2651(class67.field487); // L: 2343
			}

			int var14;
			if (GraphicsObject.field894 == class67.field487 && ((AbstractSocket)var1).vmethod8271() > 0) { // L: 2345 2346
				var13 = ((AbstractSocket)var1).vmethod8273(); // L: 2347
				if (var13 == 61) { // L: 2348
					var14 = ((AbstractSocket)var1).vmethod8271(); // L: 2349
					WorldMapRectangle.field3108 = var14 == 1 && ((AbstractSocket)var1).vmethod8273() == 1; // L: 2350
					class102.method2651(class67.field481); // L: 2351
				}

				if (var13 == 21 && gameState == 20) { // L: 2353
					class102.method2651(class67.field486); // L: 2354
				} else if (var13 == 2) { // L: 2356
					if (ScriptFrame.field460) { // L: 2357
						class102.method2651(class67.field493); // L: 2358
					} else {
						class102.method2651(class67.field495); // L: 2361
					}
				} else if (var13 == 15 && gameState == 40) { // L: 2364
					packetWriter.serverPacketLength = -1; // L: 2365
					class102.method2651(class67.field501); // L: 2366
				} else if (var13 == 64) { // L: 2368
					class102.method2651(class67.field491); // L: 2369
				} else if (var13 == 23 && field667 < 1) { // L: 2371
					++field667; // L: 2372
					class102.method2651(class67.field488); // L: 2373
				} else if (var13 == 29) { // L: 2375
					class102.method2651(class67.field499); // L: 2376
				} else {
					if (var13 != 69) { // L: 2378
						KeyHandler.getLoginError(var13); // L: 2382
						return; // L: 2383
					}

					class102.method2651(class67.field502); // L: 2379
				}
			}

			if (class67.field493 == GraphicsObject.field894) { // L: 2387
				class276.field3052 = true; // L: 2388
				class427.method7851(class93.field1156); // L: 2389
				FaceNormal.method4886(0); // L: 2390
			}

			if (GraphicsObject.field894 == class67.field502 && ((AbstractSocket)var1).vmethod8271() >= 2) { // L: 2392 2393
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2394
				var2.offset = 0; // L: 2395
				class127.field1520 = var2.readUnsignedShort(); // L: 2396
				class102.method2651(class67.field489); // L: 2397
			}

			if (class67.field489 == GraphicsObject.field894 && ((AbstractSocket)var1).vmethod8271() >= class127.field1520) { // L: 2400 2401
				var2.offset = 0; // L: 2402
				((AbstractSocket)var1).read(var2.array, var2.offset, class127.field1520); // L: 2403
				class6[] var33 = new class6[]{class6.field12}; // L: 2406
				class6 var34 = var33[var2.readUnsignedByte()]; // L: 2408

				try {
					class3 var35 = FileSystem.method3536(var34); // L: 2410
					this.field565 = new class7(var2, var35); // L: 2411
					class102.method2651(class67.field490); // L: 2412
				} catch (Exception var16) { // L: 2414
					KeyHandler.getLoginError(22); // L: 2415
					return; // L: 2416
				}
			}

			if (GraphicsObject.field894 == class67.field490 && this.field565.method46()) { // L: 2420 2421
				this.field564 = this.field565.method58(); // L: 2422
				this.field565.method59(); // L: 2423
				this.field565 = null; // L: 2424
				if (this.field564 == null) { // L: 2425
					KeyHandler.getLoginError(22); // L: 2426
					return; // L: 2427
				}

				packetWriter.clearBuffer(); // L: 2429
				var28 = class171.method3447(); // L: 2430
				var28.packetBuffer.writeByte(class314.field3457.field3456); // L: 2431
				var28.packetBuffer.writeShort(this.field564.offset); // L: 2432
				var28.packetBuffer.method9259(this.field564); // L: 2433
				packetWriter.addNode(var28); // L: 2434
				packetWriter.flush(); // L: 2435
				this.field564 = null; // L: 2436
				class102.method2651(class67.field487); // L: 2437
			}

			if (GraphicsObject.field894 == class67.field491 && ((AbstractSocket)var1).vmethod8271() > 0) { // L: 2440 2441
				class234.field2490 = ((AbstractSocket)var1).vmethod8273(); // L: 2442
				class102.method2651(class67.field492); // L: 2443
			}

			if (GraphicsObject.field894 == class67.field492 && ((AbstractSocket)var1).vmethod8271() >= class234.field2490) { // L: 2446 2447
				((AbstractSocket)var1).read(var2.array, 0, class234.field2490); // L: 2448
				var2.offset = 0; // L: 2449
				class102.method2651(class67.field487); // L: 2450
			}

			if (GraphicsObject.field894 == class67.field486 && ((AbstractSocket)var1).vmethod8271() > 0) { // L: 2453 2454
				field546 = (((AbstractSocket)var1).vmethod8273() + 3) * 60; // L: 2455
				class102.method2651(class67.field494); // L: 2456
			}

			if (class67.field494 == GraphicsObject.field894) { // L: 2459
				field544 = 0; // L: 2460
				class59.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field546 / 60 + " seconds."); // L: 2461
				if (--field546 <= 0) { // L: 2462
					class102.method2651(class67.field488);
				}

			} else if (GraphicsObject.field894 == class67.field483) { // L: 2465
				var28 = class171.method3447(); // L: 2466
				var28.packetBuffer.writeByte(class314.field3453.field3456); // L: 2467
				var28.packetBuffer.writeShort(class314.field3453.field3452); // L: 2468
				var28.packetBuffer.writeIntME(SceneTilePaint.field2883.hash); // L: 2470
				var28.packetBuffer.method9315(UserComparator9.archive2.hash); // L: 2471
				var28.packetBuffer.writeIntME(WorldMapScaleHandler.field3167.hash); // L: 2472
				var28.packetBuffer.writeIntME(class107.field1377.hash); // L: 2473
				var28.packetBuffer.writeIntME(UrlRequester.field1452.hash); // L: 2474
				var28.packetBuffer.method9250(SoundCache.field308.hash); // L: 2475
				var28.packetBuffer.method9315(class470.field4874.hash); // L: 2476
				var28.packetBuffer.method9315(class17.field75.hash); // L: 2477
				var28.packetBuffer.method9315(GrandExchangeOfferOwnWorldComparator.archive12.hash); // L: 2478
				var28.packetBuffer.method9407(PlayerType.field4332.hash); // L: 2479
				var28.packetBuffer.method9407(GrandExchangeOfferOwnWorldComparator.field479.hash); // L: 2480
				var28.packetBuffer.method9250(class153.field1726.hash); // L: 2481
				var28.packetBuffer.method9407(class73.field909.hash); // L: 2482
				var28.packetBuffer.method9250(0); // L: 2483
				packetWriter.addNode(var28); // L: 2485
				packetWriter.flush(); // L: 2486
				class102.method2651(class67.field495); // L: 2487
			} else {
				if (class67.field495 == GraphicsObject.field894 && ((AbstractSocket)var1).vmethod8271() >= 1) { // L: 2490 2491
					UrlRequester.field1453 = ((AbstractSocket)var1).vmethod8273(); // L: 2492
					if (UrlRequester.field1453 != class314.field3449.field3452) { // L: 2493
						KeyHandler.getLoginError(UrlRequester.field1453); // L: 2494
						return; // L: 2495
					}

					class102.method2651(class67.field496); // L: 2497
				}

				if (GraphicsObject.field894 == class67.field496 && ((AbstractSocket)var1).vmethod8271() >= UrlRequester.field1453) { // L: 2500 2501
					boolean var45 = ((AbstractSocket)var1).vmethod8273() == 1; // L: 2502
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2503
					var2.offset = 0; // L: 2504
					boolean var44 = false; // L: 2505
					if (var45) { // L: 2506
						var14 = var2.readByteIsaac() << 24; // L: 2507
						var14 |= var2.readByteIsaac() << 16; // L: 2508
						var14 |= var2.readByteIsaac() << 8; // L: 2509
						var14 |= var2.readByteIsaac(); // L: 2510
						NPC.clientPreferences.method2519(Login.Login_username, var14); // L: 2511
					}

					if (Login_isUsernameRemembered) { // L: 2513
						NPC.clientPreferences.method2476(Login.Login_username); // L: 2514
					} else {
						NPC.clientPreferences.method2476((String)null); // L: 2517
					}

					class486.savePreferences(); // L: 2519
					staffModLevel = ((AbstractSocket)var1).vmethod8273(); // L: 2520
					playerMod = ((AbstractSocket)var1).vmethod8273() == 1; // L: 2521
					localPlayerIndex = ((AbstractSocket)var1).vmethod8273(); // L: 2522
					localPlayerIndex <<= 8; // L: 2523
					localPlayerIndex += ((AbstractSocket)var1).vmethod8273(); // L: 2524
					field783 = ((AbstractSocket)var1).vmethod8273(); // L: 2525
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2526
					var2.offset = 0; // L: 2527
					this.accountHash = var2.readLong(); // L: 2528
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2529
					var2.offset = 0; // L: 2530
					field638 = var2.readLong(); // L: 2531
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2532
					var2.offset = 0; // L: 2533
					field639 = var2.readLong(); // L: 2534
					AttackOption.method2678().method3589(this.field790); // L: 2535
					class102.method2651(class67.field497); // L: 2536
				}

				if (GraphicsObject.field894 == class67.field497 && ((AbstractSocket)var1).vmethod8271() >= packetWriter.serverPacketLength) { // L: 2539 2540
					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2541
					var2.offset = 0; // L: 2542
					if (var2.method9213()) { // L: 2543
						((AbstractSocket)var1).read(var2.array, 1, 1); // L: 2544
						var2.offset = 0; // L: 2545
					}

					ServerPacket[] var37 = class247.method4877(); // L: 2547
					var14 = var2.readSmartByteShortIsaac(); // L: 2548
					if (var14 < 0 || var14 >= var37.length) { // L: 2549
						throw new IOException("Invalid ServerProt: " + var14 + " at " + var2.offset); // L: 2550
					}

					packetWriter.serverPacket = var37[var14]; // L: 2552
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2553
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2554
					var2.offset = 0; // L: 2555
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2556

					try {
						Client var38 = UrlRequest.client; // L: 2558
						JSObject.getWindow(var38).call("zap", (Object[])null); // L: 2561
					} catch (Throwable var15) { // L: 2564
					}

					class102.method2651(class67.field498); // L: 2565
				}

				if (GraphicsObject.field894 == class67.field498) { // L: 2568
					if (((AbstractSocket)var1).vmethod8271() >= packetWriter.serverPacketLength) { // L: 2569
						var2.offset = 0; // L: 2570
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2571
						timer.method7915(); // L: 2572
						class16.method204(); // L: 2573
						InterfaceParent.updatePlayer(var2); // L: 2574
						class19.field85 = -1; // L: 2575
						class149.loadRegions(false, var2); // L: 2576
						packetWriter.serverPacket = null; // L: 2577
						isLoading = false; // L: 2578
					}

				} else {
					if (GraphicsObject.field894 == class67.field499 && ((AbstractSocket)var1).vmethod8271() >= 2) { // L: 2582 2583
						var2.offset = 0; // L: 2584
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2585
						var2.offset = 0; // L: 2586
						class13.field60 = var2.readUnsignedShort(); // L: 2587
						class102.method2651(class67.field500); // L: 2588
					}

					if (class67.field500 == GraphicsObject.field894 && ((AbstractSocket)var1).vmethod8271() >= class13.field60) { // L: 2591 2592
						var2.offset = 0; // L: 2593
						((AbstractSocket)var1).read(var2.array, 0, class13.field60); // L: 2594
						var2.offset = 0; // L: 2595
						String var40 = var2.readStringCp1252NullTerminated(); // L: 2596
						String var36 = var2.readStringCp1252NullTerminated(); // L: 2597
						String var41 = var2.readStringCp1252NullTerminated(); // L: 2598
						class59.setLoginResponseString(var40, var36, var41); // L: 2599
						FaceNormal.method4886(10); // L: 2600
						if (field810.method9558()) { // L: 2601
							class210.method3930(9); // L: 2602
						}
					}

					if (GraphicsObject.field894 != class67.field501) { // L: 2606
						++field544; // L: 2662
						if (field544 > 2000) { // L: 2663
							if (field667 < 1) { // L: 2664
								if (class10.worldPort == DesktopPlatformInfoProvider.currentPort) { // L: 2665
									DesktopPlatformInfoProvider.currentPort = SoundCache.js5Port;
								} else {
									DesktopPlatformInfoProvider.currentPort = class10.worldPort; // L: 2666
								}

								++field667; // L: 2667
								class102.method2651(class67.field488); // L: 2668
							} else {
								KeyHandler.getLoginError(-3); // L: 2671
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) { // L: 2607
							if (((AbstractSocket)var1).vmethod8271() < 2) { // L: 2608
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2609
							var2.offset = 0; // L: 2610
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2611
						}

						if (((AbstractSocket)var1).vmethod8271() >= packetWriter.serverPacketLength) { // L: 2613
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2614
							var2.offset = 0; // L: 2615
							var13 = packetWriter.serverPacketLength; // L: 2616
							timer.method7917(); // L: 2617
							packetWriter.clearBuffer(); // L: 2619
							packetWriter.packetBuffer.offset = 0; // L: 2620
							packetWriter.serverPacket = null; // L: 2621
							packetWriter.field1444 = null; // L: 2622
							packetWriter.field1446 = null; // L: 2623
							packetWriter.field1447 = null; // L: 2624
							packetWriter.serverPacketLength = 0; // L: 2625
							packetWriter.field1442 = 0; // L: 2626
							rebootTimer = 0; // L: 2627
							menuOptionsCount = 0; // L: 2629
							isMenuOpen = false; // L: 2630
							minimapState = 0; // L: 2632
							destinationX = 0; // L: 2633

							for (var14 = 0; var14 < 2048; ++var14) { // L: 2634
								players[var14] = null;
							}

							class133.localPlayer = null; // L: 2635

							for (var14 = 0; var14 < npcs.length; ++var14) { // L: 2636
								NPC var42 = npcs[var14]; // L: 2637
								if (var42 != null) { // L: 2638
									var42.targetIndex = -1; // L: 2639
									var42.field1227 = false; // L: 2640
								}
							}

							class159.method3344(); // L: 2643
							FaceNormal.method4886(30); // L: 2644

							for (var14 = 0; var14 < 100; ++var14) { // L: 2645
								field732[var14] = true;
							}

							if (packetWriter != null && packetWriter.isaacCipher != null) { // L: 2647
								PacketBufferNode var39 = class425.getPacketBufferNode(ClientPacket.field3278, packetWriter.isaacCipher); // L: 2649
								var39.packetBuffer.writeByte(class36.getWindowedMode()); // L: 2650
								var39.packetBuffer.writeShort(class148.canvasWidth); // L: 2651
								var39.packetBuffer.writeShort(class342.canvasHeight); // L: 2652
								packetWriter.addNode(var39); // L: 2653
							}

							InterfaceParent.updatePlayer(var2); // L: 2656
							if (var13 != var2.offset) { // L: 2657
								throw new RuntimeException(); // L: 2658
							}
						}
					}
				}
			}
		} catch (IOException var23) { // L: 2675
			if (field667 < 1) { // L: 2676
				if (DesktopPlatformInfoProvider.currentPort == class10.worldPort) { // L: 2677
					DesktopPlatformInfoProvider.currentPort = SoundCache.js5Port;
				} else {
					DesktopPlatformInfoProvider.currentPort = class10.worldPort; // L: 2678
				}

				++field667; // L: 2679
				class102.method2651(class67.field488); // L: 2680
			} else {
				KeyHandler.getLoginError(-2); // L: 2683
			}
		}
	} // L: 2463 2488 2580 2660 2669 2672 2681 2684 2686

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "26"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3116
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3117
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3118
			hadNetworkError = false; // L: 3119
			class190.method3709(); // L: 3120
		} else {
			if (!isMenuOpen) { // L: 3123
				class344.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1231(packetWriter); ++var1) { // L: 3124 3125
			}

			if (gameState == 30) { // L: 3127
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 3131
					boolean var32;
					if (var2 == null) { // L: 3132
						var32 = false; // L: 3133
					} else {
						var32 = true; // L: 3136
					}

					int var3;
					PacketBufferNode var33;
					if (!var32) { // L: 3138
						PacketBufferNode var14;
						int var15;
						if (timer.field4696) { // L: 3146
							var14 = class425.getPacketBufferNode(ClientPacket.field3215, packetWriter.isaacCipher); // L: 3148
							var14.packetBuffer.writeByte(0); // L: 3149
							var15 = var14.packetBuffer.offset; // L: 3150
							timer.write(var14.packetBuffer); // L: 3151
							var14.packetBuffer.method9262(var14.packetBuffer.offset - var15); // L: 3152
							packetWriter.addNode(var14); // L: 3153
							timer.method7916(); // L: 3154
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
						synchronized(Tiles.mouseRecorder.lock) { // L: 3157
							if (!field803) { // L: 3158
								Tiles.mouseRecorder.index = 0; // L: 3244
							} else if (MouseHandler.MouseHandler_lastButton != 0 || Tiles.mouseRecorder.index >= 40) { // L: 3159
								var33 = null; // L: 3161
								var3 = 0; // L: 3162
								var4 = 0; // L: 3163
								var5 = 0; // L: 3164
								var6 = 0; // L: 3165

								for (var7 = 0; var7 < Tiles.mouseRecorder.index && (var33 == null || var33.packetBuffer.offset - var3 < 246); ++var7) { // L: 3166 3167
									var4 = var7; // L: 3168
									var8 = Tiles.mouseRecorder.ys[var7]; // L: 3169
									if (var8 < -1) { // L: 3170
										var8 = -1;
									} else if (var8 > 65534) { // L: 3171
										var8 = 65534;
									}

									var9 = Tiles.mouseRecorder.xs[var7]; // L: 3172
									if (var9 < -1) { // L: 3173
										var9 = -1;
									} else if (var9 > 65534) { // L: 3174
										var9 = 65534;
									}

									if (var9 != field795 || var8 != field525) { // L: 3175
										if (var33 == null) { // L: 3178
											var33 = class425.getPacketBufferNode(ClientPacket.field3283, packetWriter.isaacCipher); // L: 3179
											var33.packetBuffer.writeByte(0); // L: 3180
											var3 = var33.packetBuffer.offset; // L: 3181
											PacketBuffer var10000 = var33.packetBuffer; // L: 3182
											var10000.offset += 2;
											var5 = 0; // L: 3183
											var6 = 0; // L: 3184
										}

										if (field526 != -1L) { // L: 3189
											var10 = var9 - field795; // L: 3190
											var11 = var8 - field525; // L: 3191
											var12 = (int)((Tiles.mouseRecorder.millis[var7] - field526) / 20L); // L: 3192
											var5 = (int)((long)var5 + (Tiles.mouseRecorder.millis[var7] - field526) % 20L); // L: 3193
										} else {
											var10 = var9; // L: 3196
											var11 = var8; // L: 3197
											var12 = Integer.MAX_VALUE; // L: 3198
										}

										field795 = var9; // L: 3200
										field525 = var8; // L: 3201
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3202
											var10 += 32; // L: 3203
											var11 += 32; // L: 3204
											var33.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3205
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3207
											var10 += 128; // L: 3208
											var11 += 128; // L: 3209
											var33.packetBuffer.writeByte(var12 + 128); // L: 3210
											var33.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3211
										} else if (var12 < 32) { // L: 3213
											var33.packetBuffer.writeByte(var12 + 192); // L: 3214
											if (var9 != -1 && var8 != -1) { // L: 3215
												var33.packetBuffer.writeIntME(var9 | var8 << 16); // L: 3216
											} else {
												var33.packetBuffer.writeIntME(Integer.MIN_VALUE);
											}
										} else {
											var33.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3219
											if (var9 != -1 && var8 != -1) { // L: 3220
												var33.packetBuffer.writeIntME(var9 | var8 << 16); // L: 3221
											} else {
												var33.packetBuffer.writeIntME(Integer.MIN_VALUE);
											}
										}

										++var6; // L: 3223
										field526 = Tiles.mouseRecorder.millis[var7]; // L: 3224
									}
								}

								if (var33 != null) { // L: 3226
									var33.packetBuffer.method9262(var33.packetBuffer.offset - var3); // L: 3227
									var7 = var33.packetBuffer.offset; // L: 3228
									var33.packetBuffer.offset = var3; // L: 3229
									var33.packetBuffer.writeByte(var5 / var6); // L: 3230
									var33.packetBuffer.writeByte(var5 % var6); // L: 3231
									var33.packetBuffer.offset = var7; // L: 3232
									packetWriter.addNode(var33); // L: 3233
								}

								if (var4 >= Tiles.mouseRecorder.index) { // L: 3235
									Tiles.mouseRecorder.index = 0;
								} else {
									MouseRecorder var48 = Tiles.mouseRecorder; // L: 3237
									var48.index -= var4;
									System.arraycopy(Tiles.mouseRecorder.xs, var4, Tiles.mouseRecorder.xs, 0, Tiles.mouseRecorder.index); // L: 3238
									System.arraycopy(Tiles.mouseRecorder.ys, var4, Tiles.mouseRecorder.ys, 0, Tiles.mouseRecorder.index); // L: 3239
									System.arraycopy(Tiles.mouseRecorder.millis, var4, Tiles.mouseRecorder.millis, 0, Tiles.mouseRecorder.index); // L: 3240
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !class412.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3246
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 3247
							if (var16 > 32767L) { // L: 3248
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 3249
							var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3250
							if (var3 < 0) { // L: 3251
								var3 = 0;
							} else if (var3 > class342.canvasHeight) { // L: 3252
								var3 = class342.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3253
							if (var4 < 0) { // L: 3254
								var4 = 0;
							} else if (var4 > class148.canvasWidth) { // L: 3255
								var4 = class148.canvasWidth;
							}

							var5 = (int)var16; // L: 3256
							var18 = class425.getPacketBufferNode(ClientPacket.field3234, packetWriter.isaacCipher); // L: 3257
							var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0)); // L: 3258
							var18.packetBuffer.writeShort(var4); // L: 3259
							var18.packetBuffer.writeShort(var3); // L: 3260
							packetWriter.addNode(var18); // L: 3261
						}

						if (mouseWheelRotation != 0) { // L: 3263
							var14 = class425.getPacketBufferNode(ClientPacket.field3297, packetWriter.isaacCipher); // L: 3264
							var14.packetBuffer.writeShort(mouseWheelRotation); // L: 3265
							packetWriter.addNode(var14); // L: 3266
						}

						if (field748.field2431 > 0) { // L: 3268
							var14 = class425.getPacketBufferNode(ClientPacket.field3261, packetWriter.isaacCipher); // L: 3269
							var14.packetBuffer.writeShort(0); // L: 3270
							var15 = var14.packetBuffer.offset; // L: 3271
							long var19 = VerticalAlignment.method3924(); // L: 3272

							for (var5 = 0; var5 < field748.field2431; ++var5) { // L: 3273
								long var21 = var19 - field753; // L: 3274
								if (var21 > 16777215L) { // L: 3275
									var21 = 16777215L;
								}

								field753 = var19; // L: 3276
								var14.packetBuffer.writeMedium((int)var21); // L: 3277
								var14.packetBuffer.method9297(field748.field2432[var5]); // L: 3278
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15); // L: 3280
							packetWriter.addNode(var14); // L: 3281
						}

						if (field610 > 0) { // L: 3283
							--field610;
						}

						if (field748.method4318(96) || field748.method4318(97) || field748.method4318(98) || field748.method4318(99)) { // L: 3284
							field640 = true; // L: 3285
						}

						if (field640 && field610 <= 0) { // L: 3287
							field610 = 20; // L: 3288
							field640 = false; // L: 3289
							var14 = class425.getPacketBufferNode(ClientPacket.field3243, packetWriter.isaacCipher); // L: 3291
							var14.packetBuffer.method9398(camAngleX); // L: 3292
							var14.packetBuffer.method9398(camAngleY); // L: 3293
							packetWriter.addNode(var14); // L: 3294
						}

						if (WorldMapManager.hasFocus && !field527) { // L: 3296
							field527 = true; // L: 3297
							var14 = class425.getPacketBufferNode(ClientPacket.field3254, packetWriter.isaacCipher); // L: 3299
							var14.packetBuffer.writeByte(1); // L: 3300
							packetWriter.addNode(var14); // L: 3301
						}

						if (!WorldMapManager.hasFocus && field527) { // L: 3303
							field527 = false; // L: 3304
							var14 = class425.getPacketBufferNode(ClientPacket.field3254, packetWriter.isaacCipher); // L: 3306
							var14.packetBuffer.writeByte(0); // L: 3307
							packetWriter.addNode(var14); // L: 3308
						}

						if (ModeWhere.worldMap != null) { // L: 3311
							ModeWhere.worldMap.method8913();
						}

						Player var34;
						if (Player.FriendsChatManager_inFriendsChat) { // L: 3313
							if (class143.friendsChatManager != null) { // L: 3314
								class143.friendsChatManager.sort(); // L: 3315
							}

							for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3318
								var34 = players[Players.Players_indices[var1]]; // L: 3319
								var34.method2335(); // L: 3320
							}

							Player.FriendsChatManager_inFriendsChat = false; // L: 3323
						}

						if (GraphicsObject.field893) { // L: 3327
							for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3329
								var34 = players[Players.Players_indices[var1]]; // L: 3330
								var34.method2338(); // L: 3331
							}

							GraphicsObject.field893 = false; // L: 3334
						}

						int[] var35;
						if (class172.Client_plane != field756) { // L: 3338
							field756 = class172.Client_plane; // L: 3339
							var1 = class172.Client_plane; // L: 3340
							var35 = Interpreter.field877.pixels; // L: 3342
							var3 = var35.length; // L: 3343

							for (var4 = 0; var4 < var3; ++var4) { // L: 3344
								var35[var4] = 0;
							}

							for (var4 = 1; var4 < 103; ++var4) { // L: 3345
								var5 = (103 - var4) * 2048 + 24628; // L: 3346

								for (var6 = 1; var6 < 103; ++var6) { // L: 3347
									if ((Tiles.Tiles_renderFlags[var1][var6][var4] & 24) == 0) { // L: 3348
										LoginType.scene.drawTileMinimap(var35, var5, 512, var1, var6, var4);
									}

									if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var6][var4] & 8) != 0) { // L: 3349
										LoginType.scene.drawTileMinimap(var35, var5, 512, var1 + 1, var6, var4);
									}

									var5 += 4; // L: 3350
								}
							}

							var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 3353
							var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 3354
							Interpreter.field877.setRaster(); // L: 3355

							for (var6 = 1; var6 < 103; ++var6) { // L: 3356
								for (var7 = 1; var7 < 103; ++var7) { // L: 3357
									if ((Tiles.Tiles_renderFlags[var1][var7][var6] & 24) == 0) { // L: 3358
										GrandExchangeOfferOwnWorldComparator.drawObject(var1, var7, var6, var4, var5);
									}

									if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var7][var6] & 8) != 0) { // L: 3359
										GrandExchangeOfferOwnWorldComparator.drawObject(var1 + 1, var7, var6, var4, var5);
									}
								}
							}

							field627 = 0; // L: 3362

							for (var6 = 0; var6 < 104; ++var6) { // L: 3363
								for (var7 = 0; var7 < 104; ++var7) { // L: 3364
									long var23 = LoginType.scene.getGroundObjectTag(class172.Client_plane, var6, var7); // L: 3365
									if (0L != var23) { // L: 3366
										var10 = class206.Entity_unpackID(var23); // L: 3367
										var11 = MouseRecorder.getObjectDefinition(var10).mapIconId; // L: 3368
										if (var11 >= 0 && class340.WorldMapElement_get(var11).field2012) { // L: 3369 3370
											field760[field627] = class340.WorldMapElement_get(var11).getSpriteBool(false); // L: 3373
											field758[field627] = var6; // L: 3374
											field759[field627] = var7; // L: 3375
											++field627; // L: 3376
										}
									}
								}
							}

							UserComparator9.rasterProvider.apply(); // L: 3382
						}

						if (gameState != 30) { // L: 3387
							return;
						}

						class192.method3720(); // L: 3388
						ReflectionCheck.method670(); // L: 3389
						++packetWriter.field1442; // L: 3390
						if (packetWriter.field1442 > 750) { // L: 3391
							class190.method3709(); // L: 3392
							return; // L: 3393
						}

						var1 = Players.Players_count; // L: 3396
						var35 = Players.Players_indices; // L: 3397

						for (var3 = 0; var3 < var1; ++var3) { // L: 3398
							Player var25 = players[var35[var3]]; // L: 3399
							if (var25 != null) { // L: 3400
								ModeWhere.updateActorSequence(var25, 1); // L: 3401
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 3406
							var15 = npcIndices[var1]; // L: 3407
							NPC var26 = npcs[var15]; // L: 3408
							if (var26 != null) { // L: 3409
								ModeWhere.updateActorSequence(var26, var26.definition.size); // L: 3410
							}
						}

						class307.method5910(); // L: 3414
						++field545; // L: 3415
						if (mouseCrossColor != 0) { // L: 3416
							mouseCrossState = mouseCrossState * 400 + 20; // L: 3417
							if (mouseCrossState * 400 >= 400) { // L: 3418
								mouseCrossColor = 0;
							}
						}

						Widget var40 = ModelData0.mousedOverWidgetIf1; // L: 3420
						Widget var36 = class288.field3137; // L: 3421
						ModelData0.mousedOverWidgetIf1 = null; // L: 3422
						class288.field3137 = null; // L: 3423
						draggedOnWidget = null; // L: 3424
						field702 = false; // L: 3425
						field699 = false; // L: 3426
						field611 = 0; // L: 3427

						while (field748.method4337() && field611 < 128) { // L: 3428
							if (staffModLevel >= 2 && field748.method4318(82) && field748.field2440 == 66) { // L: 3429
								StringBuilder var42 = new StringBuilder(); // L: 3432

								Message var41;
								for (Iterator var27 = Messages.Messages_hashTable.iterator(); var27.hasNext(); var42.append(var41.text).append('\n')) { // L: 3433 3439
									var41 = (Message)var27.next(); // L: 3434
									if (var41.sender != null && !var41.sender.isEmpty()) { // L: 3436
										var42.append(var41.sender).append(':'); // L: 3437
									}
								}

								String var44 = var42.toString(); // L: 3442
								UrlRequest.client.method463(var44); // L: 3445
							} else if (oculusOrbState != 1 || field748.field2428 <= 0) { // L: 3448
								field767[field611] = field748.field2440; // L: 3451
								field512[field611] = field748.field2428; // L: 3452
								++field611; // L: 3453
							}
						}

						if (class347.method6641() && field748.method4318(82) && field748.method4318(81) && mouseWheelRotation != 0) { // L: 3455
							var3 = class133.localPlayer.plane - mouseWheelRotation; // L: 3456
							if (var3 < 0) { // L: 3457
								var3 = 0;
							} else if (var3 > 3) { // L: 3458
								var3 = 3;
							}

							if (var3 != class133.localPlayer.plane) { // L: 3459
								HealthBarDefinition.method3818(class133.localPlayer.pathX[0] + GrandExchangeOfferOwnWorldComparator.baseX * 64, class133.localPlayer.pathY[0] + DevicePcmPlayerProvider.baseY * 64, var3, false); // L: 3460
							}

							mouseWheelRotation = 0; // L: 3462
						}

						if (rootInterface != -1) { // L: 3464
							class31.method435(rootInterface, 0, 0, class148.canvasWidth, class342.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3465

						while (true) {
							Widget var43;
							ScriptEvent var45;
							Widget var47;
							do {
								var45 = (ScriptEvent)field593.removeLast(); // L: 3467
								if (var45 == null) { // L: 3468
									while (true) {
										do {
											var45 = (ScriptEvent)field520.removeLast(); // L: 3479
											if (var45 == null) { // L: 3480
												while (true) {
													do {
														var45 = (ScriptEvent)scriptEvents.removeLast(); // L: 3491
														if (var45 == null) { // L: 3492
															boolean var37 = false; // L: 3502

															while (true) {
																class227 var46 = (class227)field726.removeLast(); // L: 3504
																if (var46 == null) { // L: 3505
																	if (!var37 && MouseHandler.MouseHandler_lastButton == 1) { // L: 3509
																		field749.method4282(); // L: 3510
																	}

																	this.menu(); // L: 3512
																	SoundCache.method821(); // L: 3513
																	if (clickedWidget != null) { // L: 3514
																		this.method1237();
																	}

																	if (Scene.shouldSendWalk()) { // L: 3515
																		var4 = Scene.Scene_selectedX; // L: 3516
																		var5 = Scene.Scene_selectedY; // L: 3517
																		var18 = class425.getPacketBufferNode(ClientPacket.field3284, packetWriter.isaacCipher); // L: 3519
																		var18.packetBuffer.writeByte(5); // L: 3520
																		var18.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var4); // L: 3521
																		var18.packetBuffer.writeByte(field748.method4318(82) ? (field748.method4318(81) ? 2 : 1) : 0); // L: 3522
																		var18.packetBuffer.method9398(DevicePcmPlayerProvider.baseY * 64 + var5); // L: 3523
																		packetWriter.addNode(var18); // L: 3524
																		Scene.method4748(); // L: 3525
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3526
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3527
																		mouseCrossColor = 1; // L: 3528
																		mouseCrossState = 0; // L: 3529
																		destinationX = var4; // L: 3530
																		destinationY = var5; // L: 3531
																	}

																	if (var40 != ModelData0.mousedOverWidgetIf1) { // L: 3533
																		if (var40 != null) { // L: 3534
																			WorldMapData_0.invalidateWidget(var40);
																		}

																		if (ModelData0.mousedOverWidgetIf1 != null) { // L: 3535
																			WorldMapData_0.invalidateWidget(ModelData0.mousedOverWidgetIf1);
																		}
																	}

																	if (var36 != class288.field3137 && field622 == field673) { // L: 3537
																		if (var36 != null) { // L: 3538
																			WorldMapData_0.invalidateWidget(var36);
																		}

																		if (class288.field3137 != null) { // L: 3539
																			WorldMapData_0.invalidateWidget(class288.field3137);
																		}
																	}

																	if (class288.field3137 != null) { // L: 3541
																		if (field673 < field622) { // L: 3542
																			++field673; // L: 3543
																			if (field622 == field673) { // L: 3544
																				WorldMapData_0.invalidateWidget(class288.field3137);
																			}
																		}
																	} else if (field673 > 0) { // L: 3547
																		--field673;
																	}

																	if (oculusOrbState == 0) { // L: 3549
																		var4 = class133.localPlayer.x; // L: 3550
																		var5 = class133.localPlayer.y; // L: 3551
																		if (class185.oculusOrbFocalPointX - var4 < -500 || class185.oculusOrbFocalPointX - var4 > 500 || Skeleton.oculusOrbFocalPointY - var5 < -500 || Skeleton.oculusOrbFocalPointY - var5 > 500) { // L: 3552
																			class185.oculusOrbFocalPointX = var4; // L: 3553
																			Skeleton.oculusOrbFocalPointY = var5; // L: 3554
																		}

																		if (var4 != class185.oculusOrbFocalPointX) { // L: 3556
																			class185.oculusOrbFocalPointX += (var4 - class185.oculusOrbFocalPointX) / 16;
																		}

																		if (var5 != Skeleton.oculusOrbFocalPointY) { // L: 3557
																			Skeleton.oculusOrbFocalPointY += (var5 - Skeleton.oculusOrbFocalPointY) / 16;
																		}

																		var6 = class185.oculusOrbFocalPointX >> 7; // L: 3558
																		var7 = Skeleton.oculusOrbFocalPointY >> 7; // L: 3559
																		var8 = Canvas.getTileHeight(class185.oculusOrbFocalPointX, Skeleton.oculusOrbFocalPointY, class172.Client_plane); // L: 3560
																		var9 = 0; // L: 3561
																		if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) { // L: 3562
																			for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) { // L: 3563
																				for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) { // L: 3564
																					var12 = class172.Client_plane; // L: 3565
																					if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) { // L: 3566
																						++var12;
																					}

																					int var28 = var8 - Tiles.Tiles_heights[var12][var10][var11]; // L: 3567
																					if (var28 > var9) { // L: 3568
																						var9 = var28;
																					}
																				}
																			}
																		}

																		var10 = var9 * 192; // L: 3572
																		if (var10 > 98048) { // L: 3573
																			var10 = 98048;
																		}

																		if (var10 < 32768) { // L: 3574
																			var10 = 32768;
																		}

																		if (var10 > field612) { // L: 3575
																			field612 += (var10 - field612) / 24;
																		} else if (var10 < field612) { // L: 3576
																			field612 += (var10 - field612) / 80;
																		}

																		FloorUnderlayDefinition.field2198 = Canvas.getTileHeight(class133.localPlayer.x, class133.localPlayer.y, class172.Client_plane) - camFollowHeight; // L: 3577
																	} else if (oculusOrbState == 1) { // L: 3579
																		class152.method3221(); // L: 3580
																		short var38 = -1; // L: 3581
																		if (field748.method4318(33)) { // L: 3582
																			var38 = 0;
																		} else if (field748.method4318(49)) { // L: 3583
																			var38 = 1024;
																		}

																		if (field748.method4318(48)) { // L: 3584
																			if (var38 == 0) { // L: 3585
																				var38 = 1792;
																			} else if (var38 == 1024) { // L: 3586
																				var38 = 1280;
																			} else {
																				var38 = 1536; // L: 3587
																			}
																		} else if (field748.method4318(50)) { // L: 3589
																			if (var38 == 0) { // L: 3590
																				var38 = 256;
																			} else if (var38 == 1024) { // L: 3591
																				var38 = 768;
																			} else {
																				var38 = 512; // L: 3592
																			}
																		}

																		byte var39 = 0; // L: 3594
																		if (field748.method4318(35)) { // L: 3595
																			var39 = -1;
																		} else if (field748.method4318(51)) { // L: 3596
																			var39 = 1;
																		}

																		var6 = 0; // L: 3597
																		if (var38 >= 0 || var39 != 0) { // L: 3598
																			var6 = field748.method4318(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed; // L: 3599
																			var6 *= 16; // L: 3600
																			field580 = var38; // L: 3601
																			field605 = var39; // L: 3602
																		}

																		if (field709 < var6) { // L: 3604
																			field709 += var6 / 8; // L: 3605
																			if (field709 > var6) { // L: 3606
																				field709 = var6;
																			}
																		} else if (field709 > var6) { // L: 3608
																			field709 = field709 * 9 / 10;
																		}

																		if (field709 > 0) { // L: 3609
																			var7 = field709 / 16; // L: 3610
																			if (field580 >= 0) { // L: 3611
																				var4 = field580 - class17.cameraYaw & 2047; // L: 3612
																				var8 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 3613
																				var9 = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 3614
																				class185.oculusOrbFocalPointX += var7 * var8 / 65536; // L: 3615
																				Skeleton.oculusOrbFocalPointY += var7 * var9 / 65536; // L: 3616
																			}

																			if (field605 != 0) { // L: 3618
																				FloorUnderlayDefinition.field2198 += var7 * field605; // L: 3619
																				if (FloorUnderlayDefinition.field2198 > 0) { // L: 3620
																					FloorUnderlayDefinition.field2198 = 0;
																				}
																			}
																		} else {
																			field580 = -1; // L: 3624
																			field605 = -1; // L: 3625
																		}

																		if (field748.method4318(13)) { // L: 3627
																			class210.method3929(); // L: 3628
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && class412.mouseCam) { // L: 3631
																		var4 = MouseHandler.MouseHandler_y - field600; // L: 3632
																		field703 = var4 * 2; // L: 3633
																		field600 = var4 != -1 && var4 != 1 ? (field600 + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y; // L: 3634
																		var5 = field599 - MouseHandler.MouseHandler_x; // L: 3635
																		field752 = var5 * 2; // L: 3636
																		field599 = var5 != -1 && var5 != 1 ? (field599 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x; // L: 3637
																	} else {
																		if (field748.method4318(96)) { // L: 3640
																			field752 += (-24 - field752) / 2;
																		} else if (field748.method4318(97)) { // L: 3641
																			field752 += (24 - field752) / 2;
																		} else {
																			field752 /= 2; // L: 3642
																		}

																		if (field748.method4318(98)) { // L: 3643
																			field703 += (12 - field703) / 2;
																		} else if (field748.method4318(99)) { // L: 3644
																			field703 += (-12 - field703) / 2;
																		} else {
																			field703 /= 2; // L: 3645
																		}

																		field600 = MouseHandler.MouseHandler_y; // L: 3646
																		field599 = MouseHandler.MouseHandler_x; // L: 3647
																	}

																	camAngleY = field752 / 2 + camAngleY & 2047; // L: 3649
																	camAngleX += field703 / 2; // L: 3650
																	if (camAngleX < 128) { // L: 3651
																		camAngleX = 128;
																	}

																	if (camAngleX > 383) { // L: 3652
																		camAngleX = 383;
																	}

																	if (field626) { // L: 3654
																		class277.method5591();
																	} else if (isCameraLocked) { // L: 3655
																		if (!field603) { // L: 3656
																			var4 = class315.field3463 * 128 + 64; // L: 3657
																			var5 = class150.field1714 * 16384 + 64; // L: 3658
																			var6 = Canvas.getTileHeight(var4, var5, class172.Client_plane) - Actor.field1276; // L: 3659
																			class1.method7(var4, var6, var5); // L: 3660
																		} else if (field776 != null) { // L: 3662
																			WorldMapLabelSize.cameraX = field776.vmethod8668(); // L: 3663
																			class193.cameraZ = field776.vmethod8669(); // L: 3664
																			if (field514) { // L: 3665
																				MouseHandler.cameraY = field776.vmethod8674(); // L: 3666
																			} else {
																				MouseHandler.cameraY = Canvas.getTileHeight(WorldMapLabelSize.cameraX, class193.cameraZ, class172.Client_plane) - field776.vmethod8674(); // L: 3669
																			}

																			field776.method8685(); // L: 3671
																		}

																		if (!field774) { // L: 3673
																			var4 = Skeleton.field2633 * 128 + 64; // L: 3674
																			var5 = class91.field1119 * 16384 + 64; // L: 3675
																			var6 = Canvas.getTileHeight(var4, var5, class172.Client_plane) - class9.field38; // L: 3676
																			var7 = var4 - WorldMapLabelSize.cameraX; // L: 3677
																			var8 = var6 - MouseHandler.cameraY; // L: 3678
																			var9 = var5 - class193.cameraZ; // L: 3679
																			var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9)); // L: 3680
																			var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047; // L: 3681
																			var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047; // L: 3682
																			class180.method3594(var11, var12); // L: 3683
																		} else {
																			if (field778 != null) { // L: 3686
																				UserComparator10.cameraPitch = field778.method8666(); // L: 3687
																				UserComparator10.cameraPitch = Math.min(Math.max(UserComparator10.cameraPitch, 128), 383); // L: 3688
																				field778.method8685(); // L: 3689
																			}

																			if (field777 != null) { // L: 3691
																				class17.cameraYaw = field777.method8666() & 2047; // L: 3692
																				field777.method8685(); // L: 3693
																			}
																		}
																	}

																	for (var4 = 0; var4 < 5; ++var4) { // L: 3697
																		int var10002 = field784[var4]++;
																	}

																	class130.varcs.tryWrite(); // L: 3698
																	var4 = class522.method9108(); // L: 3699
																	var5 = GameEngine.field198.method352(); // L: 3702
																	PacketBufferNode var29;
																	if (var4 > 15000 && var5 > 15000) { // L: 3705
																		logoutTimer = 250; // L: 3706
																		UserComparator4.method2861(14500); // L: 3707
																		var29 = class425.getPacketBufferNode(ClientPacket.field3219, packetWriter.isaacCipher); // L: 3709
																		packetWriter.addNode(var29); // L: 3710
																	}

																	class334.friendSystem.processFriendUpdates(); // L: 3712
																	class268.method5236(); // L: 3713
																	++packetWriter.pendingWrites; // L: 3714
																	if (packetWriter.pendingWrites > 50) { // L: 3715
																		var29 = class425.getPacketBufferNode(ClientPacket.field3203, packetWriter.isaacCipher); // L: 3717
																		packetWriter.addNode(var29); // L: 3718
																	}

																	try {
																		packetWriter.flush(); // L: 3721
																	} catch (IOException var30) { // L: 3723
																		class190.method3709(); // L: 3724
																	}

																	AttackOption.method2678().method3563(); // L: 3726
																	return; // L: 3727
																}

																if (var46.field2426.type == 12) { // L: 3506
																	var37 = true;
																}

																class200.method3820(var46); // L: 3507
															}
														}

														var43 = var45.widget; // L: 3493
														if (var43.childIndex < 0) { // L: 3494
															break;
														}

														var47 = class243.field2620.method6281(var43.parentId); // L: 3495
													} while(var47 == null || var47.children == null || var43.childIndex >= var47.children.length || var43 != var47.children[var43.childIndex]); // L: 3496

													AbstractWorldMapData.runScriptEvent(var45); // L: 3500
												}
											}

											var43 = var45.widget; // L: 3481
											if (var43.childIndex < 0) { // L: 3482
												break;
											}

											var47 = class243.field2620.method6281(var43.parentId); // L: 3483
										} while(var47 == null || var47.children == null || var43.childIndex >= var47.children.length || var43 != var47.children[var43.childIndex]); // L: 3484

										AbstractWorldMapData.runScriptEvent(var45); // L: 3488
									}
								}

								var43 = var45.widget; // L: 3469
								if (var43.childIndex < 0) { // L: 3470
									break;
								}

								var47 = class243.field2620.method6281(var43.parentId); // L: 3471
							} while(var47 == null || var47.children == null || var43.childIndex >= var47.children.length || var43 != var47.children[var43.childIndex]); // L: 3472

							AbstractWorldMapData.runScriptEvent(var45); // L: 3476
						}
					}

					var33 = class425.getPacketBufferNode(ClientPacket.field3276, packetWriter.isaacCipher); // L: 3139
					var33.packetBuffer.writeByte(0); // L: 3140
					var3 = var33.packetBuffer.offset; // L: 3141
					class297.performReflectionCheck(var33.packetBuffer); // L: 3142
					var33.packetBuffer.method9262(var33.packetBuffer.offset - var3); // L: 3143
					packetWriter.addNode(var33); // L: 3144
				}
			}
		}
	} // L: 3121

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1692602581"
	)
	public void vmethod6187(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) { // L: 3941
			if (var1 > -1 && NPC.clientPreferences.method2503() > 0 && !playingJingle) { // L: 3942
				PacketBufferNode var3 = class425.getPacketBufferNode(ClientPacket.field3228, packetWriter.isaacCipher); // L: 3943
				var3.packetBuffer.writeIntME(var1); // L: 3944
				packetWriter.addNode(var3); // L: 3945
			}

		}
	} // L: 3947

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1162041825"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class148.canvasWidth; // L: 4625
		int var2 = class342.canvasHeight; // L: 4626
		if (super.contentWidth < var1) { // L: 4627
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 4628
		}

		if (NPC.clientPreferences != null) { // L: 4629
			try {
				Client var3 = UrlRequest.client; // L: 4631
				Object[] var4 = new Object[]{class36.getWindowedMode()}; // L: 4632
				JSObject.getWindow(var3).call("resize", var4); // L: 4635
			} catch (Throwable var5) { // L: 4638
			}
		}

	} // L: 4640

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1791765689"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) { // L: 4643
			var1 = rootInterface; // L: 4644
			if (class243.field2620.method6285(var1)) { // L: 4646
				class143.drawModelComponents(class243.field2620.field3645[var1], -1); // L: 4647
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4650
			if (field732[var1]) { // L: 4651
				field816[var1] = true;
			}

			field734[var1] = field732[var1]; // L: 4652
			field732[var1] = false; // L: 4653
		}

		field731 = cycle; // L: 4655
		viewportX = -1; // L: 4656
		viewportY = -1; // L: 4657
		if (rootInterface != -1) { // L: 4658
			rootWidgetCount = 0; // L: 4659
			Messages.method2769(rootInterface, 0, 0, class148.canvasWidth, class342.canvasHeight, 0, 0, -1); // L: 4660
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4662
		if (showMouseCross) { // L: 4663
			if (mouseCrossColor == 1) { // L: 4664
				class286.field3130[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4665
			}

			if (mouseCrossColor == 2) { // L: 4667
				class286.field3130[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4668
			}
		}

		int var2;
		int var3;
		if (!isMenuOpen) { // L: 4671
			if (viewportX != -1) { // L: 4672
				var1 = viewportX; // L: 4673
				var2 = viewportY; // L: 4674
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) { // L: 4676 4677
					var3 = menuOptionsCount - 1; // L: 4680
					String var5;
					if (isItemSelected == 1 && menuOptionsCount < 2) { // L: 4684
						var5 = "Use" + " " + field676 + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) { // L: 4685
						var5 = field557 + " " + field801 + " " + "->";
					} else {
						var5 = class225.method4275(var3); // L: 4686
					}

					if (menuOptionsCount > 2) { // L: 4687
						var5 = var5 + Decimator.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					DevicePcmPlayerProvider.fontBold12.drawRandomAlphaAndSpacing(var5, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000); // L: 4688
				}
			}
		} else {
			Language.method7194(); // L: 4692
		}

		if (field739 == 3) { // L: 4693
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4694
				if (field734[var1]) { // L: 4695
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4696
				} else if (field816[var1]) { // L: 4698
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4699
				}
			}
		}

		var1 = class172.Client_plane; // L: 4703
		var2 = class133.localPlayer.x; // L: 4704
		var3 = class133.localPlayer.y; // L: 4705
		int var4 = field545; // L: 4706

		for (ObjectSound var14 = (ObjectSound)ObjectSound.objectSounds.last(); var14 != null; var14 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 4708
			if (var14.soundEffectId != -1 || var14.field852 != null) { // L: 4709
				int var6 = 0; // L: 4710
				if (var2 > var14.maxX * 16384) { // L: 4711
					var6 += var2 - var14.maxX * 16384;
				} else if (var2 < var14.x * 16384) { // L: 4712
					var6 += var14.x * 16384 - var2;
				}

				if (var3 > var14.maxY * 16384) { // L: 4713
					var6 += var3 - var14.maxY * 16384;
				} else if (var3 < var14.y * 16384) { // L: 4714
					var6 += var14.y * 16384 - var3;
				}

				var6 = Math.max(var6 - 64, 0); // L: 4715
				if (var6 < var14.field846 && NPC.clientPreferences.method2475() != 0 && var1 == var14.plane) { // L: 4716
					float var7 = var14.field847 < var14.field846 ? Math.min(Math.max((float)(var14.field846 - var6) / (float)(var14.field846 - var14.field847), 0.0F), 1.0F) : 1.0F; // L: 4727
					int var8 = (int)(var7 * (float)NPC.clientPreferences.method2475()); // L: 4728
					Object var10000;
					if (var14.stream1 == null) { // L: 4729
						if (var14.soundEffectId >= 0) { // L: 4730
							var10000 = null; // L: 4731
							SoundEffect var9 = SoundEffect.readSoundEffect(class141.archive4, var14.soundEffectId, 0);
							if (var9 != null) { // L: 4732
								RawSound var10 = var9.toRawSound().resample(class86.decimator); // L: 4733
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var10, 100, var8); // L: 4734
								var11.setNumLoops(-1); // L: 4735
								HealthBarUpdate.pcmStreamMixer.addSubStream(var11); // L: 4736
								var14.stream1 = var11; // L: 4737
							}
						}
					} else {
						var14.stream1.method859(var8); // L: 4741
					}

					if (var14.stream2 == null) { // L: 4742
						if (var14.field852 != null && (var14.field843 -= var4) <= 0) { // L: 4743
							int var13 = (int)(Math.random() * (double)var14.field852.length); // L: 4744
							var10000 = null; // L: 4745
							SoundEffect var15 = SoundEffect.readSoundEffect(class141.archive4, var14.field852[var13], 0);
							if (var15 != null) { // L: 4746
								RawSound var16 = var15.toRawSound().resample(class86.decimator); // L: 4747
								RawPcmStream var12 = RawPcmStream.createRawPcmStream(var16, 100, var8); // L: 4748
								var12.setNumLoops(0); // L: 4749
								HealthBarUpdate.pcmStreamMixer.addSubStream(var12); // L: 4750
								var14.stream2 = var12; // L: 4751
								var14.field843 = var14.field841 + (int)(Math.random() * (double)(var14.field854 - var14.field841)); // L: 4752
							}
						}
					} else {
						var14.stream2.method859(var8); // L: 4757
						if (!var14.stream2.hasNext()) { // L: 4758
							var14.stream2 = null; // L: 4759
						}
					}
				} else {
					if (var14.stream1 != null) { // L: 4717
						HealthBarUpdate.pcmStreamMixer.removeSubStream(var14.stream1); // L: 4718
						var14.stream1 = null; // L: 4719
					}

					if (var14.stream2 != null) { // L: 4721
						HealthBarUpdate.pcmStreamMixer.removeSubStream(var14.stream2); // L: 4722
						var14.stream2 = null; // L: 4723
					}
				}
			}
		}

		field545 = 0; // L: 4764
	} // L: 4765

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Ley;II)Z",
		garbageValue = "364472148"
	)
	boolean method1394(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 6434
			class143.friendsChatManager = null; // L: 6435
		} else {
			if (class143.friendsChatManager == null) { // L: 6438
				class143.friendsChatManager = new FriendsChatManager(class127.loginType, UrlRequest.client); // L: 6439
			}

			class143.friendsChatManager.method8063(var1.packetBuffer, var2); // L: 6441
		}

		field717 = cycleCntr; // L: 6444
		Player.FriendsChatManager_inFriendsChat = true; // L: 6445
		var1.serverPacket = null; // L: 6447
		return true; // L: 6448
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)Z",
		garbageValue = "-1053683250"
	)
	boolean method1232(PacketWriter var1) {
		if (class143.friendsChatManager != null) { // L: 6452
			class143.friendsChatManager.method8064(var1.packetBuffer); // L: 6453
		}

		field717 = cycleCntr; // L: 6456
		Player.FriendsChatManager_inFriendsChat = true; // L: 6457
		var1.serverPacket = null; // L: 6459
		return true; // L: 6460
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)Z",
		garbageValue = "1169358276"
	)
	final boolean method1231(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6465
		PacketBuffer var3 = var1.packetBuffer; // L: 6466
		if (var2 == null) { // L: 6467
			return false;
		} else {
			int var6;
			String var25;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6469
					if (var1.field1434) { // L: 6470
						if (!var2.isAvailable(1)) { // L: 6471
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6472
						var1.field1442 = 0; // L: 6473
						var1.field1434 = false; // L: 6474
					}

					var3.offset = 0; // L: 6476
					if (var3.method9213()) { // L: 6477
						if (!var2.isAvailable(1)) { // L: 6478
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6479
						var1.field1442 = 0; // L: 6480
					}

					var1.field1434 = true; // L: 6482
					ServerPacket[] var4 = class247.method4877(); // L: 6483
					var5 = var3.readSmartByteShortIsaac(); // L: 6484
					if (var5 < 0 || var5 >= var4.length) { // L: 6485
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6486
					var1.serverPacketLength = var1.serverPacket.length; // L: 6487
				}

				if (var1.serverPacketLength == -1) { // L: 6489
					if (!var2.isAvailable(1)) { // L: 6490
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6491
					var1.serverPacketLength = var3.array[0] & 255; // L: 6492
				}

				if (var1.serverPacketLength == -2) { // L: 6494
					if (!var2.isAvailable(2)) { // L: 6495
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6496
					var3.offset = 0; // L: 6497
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6498
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6500
					return false;
				}

				var3.offset = 0; // L: 6501
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6502
				var1.field1442 = 0; // L: 6503
				timer.method7912(); // L: 6504
				var1.field1447 = var1.field1446; // L: 6505
				var1.field1446 = var1.field1444; // L: 6506
				var1.field1444 = var1.serverPacket; // L: 6507
				int var20;
				if (ServerPacket.field3346 == var1.serverPacket) { // L: 6508
					var20 = var3.method9321(); // L: 6509
					var5 = var3.method9317(); // L: 6510
					Varps.Varps_temp[var20] = var5; // L: 6511
					if (Varps.Varps_main[var20] != var5) { // L: 6512
						Varps.Varps_main[var20] = var5; // L: 6513
					}

					class11.changeGameOptions(var20); // L: 6515
					field707[++field708 - 1 & 31] = var20; // L: 6516
					var1.serverPacket = null; // L: 6517
					return true; // L: 6518
				}

				int var7;
				NPC var60;
				if (ServerPacket.field3372 == var1.serverPacket) { // L: 6520
					var20 = var3.method9462(); // L: 6521
					var5 = var3.method9514(); // L: 6522
					short var70 = (short)var3.method9309(); // L: 6523
					var7 = var3.readUnsignedShort(); // L: 6524
					var60 = npcs[var7]; // L: 6525
					if (var60 != null) { // L: 6526
						var60.method2595(var20, var5, var70); // L: 6527
					}

					var1.serverPacket = null; // L: 6529
					return true; // L: 6530
				}

				if (ServerPacket.field3412 == var1.serverPacket) { // L: 6532
					var20 = var3.readUnsignedByte(); // L: 6533
					var5 = var3.readUnsignedByte(); // L: 6534
					var6 = var3.readUnsignedByte(); // L: 6535
					var7 = var3.readUnsignedByte(); // L: 6536
					field780[var20] = true; // L: 6537
					field744[var20] = var5; // L: 6538
					field782[var20] = var6; // L: 6539
					field548[var20] = var7; // L: 6540
					field784[var20] = 0; // L: 6541
					var1.serverPacket = null; // L: 6542
					return true; // L: 6543
				}

				if (ServerPacket.field3391 == var1.serverPacket) { // L: 6545
					var20 = var3.method9321(); // L: 6546
					byte var90 = var3.method9316(); // L: 6547
					Varps.Varps_temp[var20] = var90; // L: 6548
					if (Varps.Varps_main[var20] != var90) { // L: 6549
						Varps.Varps_main[var20] = var90; // L: 6550
					}

					class11.changeGameOptions(var20); // L: 6552
					field707[++field708 - 1 & 31] = var20; // L: 6553
					var1.serverPacket = null; // L: 6554
					return true; // L: 6555
				}

				Widget var21;
				if (ServerPacket.field3428 == var1.serverPacket) { // L: 6557
					var20 = var3.readUnsignedShort(); // L: 6558
					var5 = var3.readInt(); // L: 6559
					var21 = class243.field2620.method6281(var5); // L: 6560
					if (var21.modelType != 6 || var20 != var21.modelId) { // L: 6561
						var21.modelType = 6; // L: 6562
						var21.modelId = var20; // L: 6563
						WorldMapData_0.invalidateWidget(var21); // L: 6564
					}

					var1.serverPacket = null; // L: 6566
					return true; // L: 6567
				}

				if (ServerPacket.field3365 == var1.serverPacket && isCameraLocked) { // L: 6569 6570
					field626 = true; // L: 6571
					field774 = false; // L: 6572
					field603 = false; // L: 6573

					for (var20 = 0; var20 < 5; ++var20) { // L: 6574
						field780[var20] = false; // L: 6575
					}

					var1.serverPacket = null; // L: 6577
					return true; // L: 6578
				}

				if (ServerPacket.field3357 == var1.serverPacket) { // L: 6581
					TextureProvider.updatePlayers(var3, var1.serverPacketLength); // L: 6582
					GrandExchangeOfferOwnWorldComparator.method1199(); // L: 6583
					var1.serverPacket = null; // L: 6584
					return true; // L: 6585
				}

				byte var79;
				if (ServerPacket.field3445 == var1.serverPacket) { // L: 6587
					TileItem.method2679(); // L: 6588
					var79 = var3.readByte(); // L: 6589
					if (var1.serverPacketLength == 1) { // L: 6590
						if (var79 >= 0) { // L: 6591
							currentClanSettings[var79] = null;
						} else {
							class511.guestClanSettings = null; // L: 6592
						}

						var1.serverPacket = null; // L: 6593
						return true; // L: 6594
					}

					if (var79 >= 0) { // L: 6596
						currentClanSettings[var79] = new ClanSettings(var3); // L: 6597
					} else {
						class511.guestClanSettings = new ClanSettings(var3); // L: 6600
					}

					var1.serverPacket = null; // L: 6602
					return true; // L: 6603
				}

				int var9;
				int var10;
				int var13;
				int var22;
				int var62;
				int var65;
				if (ServerPacket.field3376 == var1.serverPacket) { // L: 6605
					var13 = var3.method9318(); // L: 6616
					var9 = var3.method9298(); // L: 6617
					var10 = var9 >> 2; // L: 6618
					var62 = var9 & 3; // L: 6619
					var65 = field586[var10]; // L: 6620
					var6 = var3.method9458(); // L: 6621
					var20 = var6 >> 16; // L: 6622
					var5 = var6 >> 8 & 255; // L: 6623
					var7 = var20 + (var6 >> 4 & 7); // L: 6624
					var22 = var5 + (var6 & 7); // L: 6625
					if (var7 >= 0 && var22 >= 0 && var7 < 103 && var22 < 103) { // L: 6626
						HorizontalAlignment.method3853(class172.Client_plane, var7, var22, var10, var62, var65, var13); // L: 6627
					}

					var1.serverPacket = null; // L: 6629
					return true; // L: 6630
				}

				int var15;
				int var16;
				int var17;
				int var18;
				Projectile var19;
				byte var61;
				byte var64;
				int var69;
				if (ServerPacket.field3377 == var1.serverPacket) { // L: 6632
					var18 = var3.readUnsignedByte(); // L: 6648
					var65 = var3.method9321(); // L: 6649
					var17 = var3.readUnsignedByte(); // L: 6650
					var13 = var3.method9298() * 4; // L: 6651
					var62 = var3.method9270(); // L: 6652
					var64 = var3.method9316(); // L: 6653
					var69 = var3.readUnsignedByte() * 4; // L: 6654
					var6 = var3.readMedium(); // L: 6655
					var20 = var6 >> 16; // L: 6656
					var5 = var6 >> 8 & 255; // L: 6657
					var7 = var20 + (var6 >> 4 & 7); // L: 6658
					var22 = var5 + (var6 & 7); // L: 6659
					var61 = var3.method9316(); // L: 6660
					var16 = var3.method9321(); // L: 6661
					var15 = var3.method9318(); // L: 6662
					var9 = var64 + var7; // L: 6663
					var10 = var61 + var22; // L: 6664
					if (var7 >= 0 && var22 >= 0 && var7 < 104 && var22 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var65 != 65535) { // L: 6665
						var7 = var7 * 128 + 64; // L: 6666
						var22 = var22 * 128 + 64; // L: 6667
						var9 = var9 * 128 + 64; // L: 6668
						var10 = var10 * 128 + 64; // L: 6669
						var19 = new Projectile(var65, class172.Client_plane, var7, var22, Canvas.getTileHeight(var7, var22, class172.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var62, var69); // L: 6670
						var19.setDestination(var9, var10, Canvas.getTileHeight(var9, var10, class172.Client_plane) - var69, var15 + cycle); // L: 6671
						projectiles.addFirst(var19); // L: 6672
					}

					var1.serverPacket = null; // L: 6674
					return true; // L: 6675
				}

				if (ServerPacket.field3364 == var1.serverPacket) { // L: 6677
					var20 = var3.method9321(); // L: 6684
					if (var20 == 65535) { // L: 6685
						var20 = -1; // L: 6686
					}

					var9 = var3.method9380(); // L: 6688
					var5 = var3.readUnsignedShort(); // L: 6689
					if (var5 == 65535) { // L: 6690
						var5 = -1; // L: 6691
					}

					var22 = var3.readUnsignedShort(); // L: 6693
					var7 = var3.method9318(); // L: 6694
					var6 = var3.method9380(); // L: 6695
					ArrayList var78 = new ArrayList(); // L: 6696
					var78.add(var20); // L: 6697
					var78.add(var5); // L: 6698
					FriendSystem.method1892(var78, var6, var7, var22, var9); // L: 6699
					var1.serverPacket = null; // L: 6700
					return true; // L: 6701
				}

				if (ServerPacket.field3430 == var1.serverPacket) { // L: 6703
					field529 = var3.readUnsignedByte(); // L: 6704
					if (field529 == 1) { // L: 6705
						field530 = var3.readUnsignedShort();
					}

					if (field529 >= 2 && field529 <= 6) { // L: 6706
						if (field529 == 2) { // L: 6707
							field535 = 4096; // L: 6708
							field712 = 4096; // L: 6709
						}

						if (field529 == 3) { // L: 6711
							field535 = 0; // L: 6712
							field712 = 4096; // L: 6713
						}

						if (field529 == 4) { // L: 6715
							field535 = 8192; // L: 6716
							field712 = 4096; // L: 6717
						}

						if (field529 == 5) { // L: 6719
							field535 = 4096; // L: 6720
							field712 = 0; // L: 6721
						}

						if (field529 == 6) { // L: 6723
							field535 = 4096; // L: 6724
							field712 = 8192; // L: 6725
						}

						field529 = 2; // L: 6727
						field532 = var3.readUnsignedShort(); // L: 6728
						field620 = var3.readUnsignedShort(); // L: 6729
						field534 = var3.readUnsignedByte() * 2; // L: 6730
					}

					if (field529 == 10) { // L: 6732
						field531 = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 6733
					return true; // L: 6734
				}

				if (ServerPacket.field3369 == var1.serverPacket) { // L: 6736
					Language.updateNpcs(false, var3); // L: 6737
					var1.serverPacket = null; // L: 6738
					return true; // L: 6739
				}

				if (ServerPacket.field3427 == var1.serverPacket) { // L: 6741
					var20 = var3.readUnsignedShort(); // L: 6745
					var5 = var3.method9321(); // L: 6746
					var6 = var3.method9298(); // L: 6747
					if (var5 == 65535) { // L: 6748
						var5 = -1; // L: 6749
					}

					NPC var85 = npcs[var20]; // L: 6751
					if (var85 != null) { // L: 6752
						if (var5 == var85.sequence && var5 != -1) { // L: 6753
							var22 = DevicePcmPlayerProvider.SequenceDefinition_get(var5).field2396; // L: 6754
							if (var22 == 1) { // L: 6755
								var85.sequenceFrame = 0; // L: 6756
								var85.sequenceFrameCycle = 0; // L: 6757
								var85.sequenceDelay = var6; // L: 6758
								var85.field1248 = 0; // L: 6759
							} else if (var22 == 2) { // L: 6761
								var85.field1248 = 0; // L: 6762
							}
						} else if (var5 == -1 || var85.sequence == -1 || DevicePcmPlayerProvider.SequenceDefinition_get(var5).field2393 >= DevicePcmPlayerProvider.SequenceDefinition_get(var85.sequence).field2393) { // L: 6765
							var85.sequence = var5; // L: 6766
							var85.sequenceFrame = 0; // L: 6767
							var85.sequenceFrameCycle = 0; // L: 6768
							var85.sequenceDelay = var6; // L: 6769
							var85.field1248 = 0; // L: 6770
							var85.field1274 = var85.pathLength; // L: 6771
						}
					}

					var1.serverPacket = null; // L: 6775
					return true; // L: 6776
				}

				if (ServerPacket.field3349 == var1.serverPacket) { // L: 6778
					field719 = cycleCntr; // L: 6779
					var79 = var3.readByte(); // L: 6780
					if (var1.serverPacketLength == 1) { // L: 6781
						if (var79 >= 0) { // L: 6782
							currentClanChannels[var79] = null;
						} else {
							class19.guestClanChannel = null; // L: 6783
						}

						var1.serverPacket = null; // L: 6784
						return true; // L: 6785
					}

					if (var79 >= 0) { // L: 6787
						currentClanChannels[var79] = new ClanChannel(var3); // L: 6788
					} else {
						class19.guestClanChannel = new ClanChannel(var3); // L: 6791
					}

					var1.serverPacket = null; // L: 6793
					return true; // L: 6794
				}

				if (ServerPacket.field3344 == var1.serverPacket) { // L: 6796
					var20 = var3.readUnsignedByte(); // L: 6797
					TextureProvider.method4928(var20); // L: 6798
					var1.serverPacket = null; // L: 6799
					return true; // L: 6800
				}

				Widget var93;
				if (ServerPacket.field3399 == var1.serverPacket) { // L: 6802
					var20 = var3.method9514(); // L: 6803
					var93 = class243.field2620.method6281(var20); // L: 6804
					var93.modelType = 3; // L: 6805
					var93.modelId = class133.localPlayer.appearance.getChatHeadId(); // L: 6806
					WorldMapData_0.invalidateWidget(var93); // L: 6807
					var1.serverPacket = null; // L: 6808
					return true; // L: 6809
				}

				if (ServerPacket.field3375 == var1.serverPacket) { // L: 6811
					var7 = var3.method9298(); // L: 6817
					var6 = var3.readUnsignedShort(); // L: 6818
					var20 = var3.method9318(); // L: 6819
					var60 = npcs[var20]; // L: 6820
					var5 = var3.readInt(); // L: 6821
					if (var60 != null) { // L: 6822
						var60.method2414(var7, var6, var5 >> 16, var5 & 65535); // L: 6823
					}

					var1.serverPacket = null; // L: 6825
					return true; // L: 6826
				}

				if (ServerPacket.field3367 == var1.serverPacket) { // L: 6828
					destinationX = var3.readUnsignedByte(); // L: 6829
					if (destinationX == 255) { // L: 6830
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6831
					if (destinationY == 255) { // L: 6832
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6833
					return true; // L: 6834
				}

				if (ServerPacket.field3393 == var1.serverPacket) { // L: 6836
					class232.method4433(class311.field3306); // L: 6837
					var1.serverPacket = null; // L: 6838
					return true; // L: 6839
				}

				if (ServerPacket.field3401 == var1.serverPacket) { // L: 6841
					ModelData0.field2905 = var3.method9300(); // L: 6842
					class332.field3602 = var3.readUnsignedByte(); // L: 6843
					field587 = var3.method9300(); // L: 6844
					var1.serverPacket = null; // L: 6845
					return true; // L: 6846
				}

				boolean var71;
				if (ServerPacket.field3408 == var1.serverPacket) { // L: 6848
					var71 = var3.readBoolean(); // L: 6849
					if (var71) { // L: 6850
						if (class135.field1621 == null) { // L: 6851
							class135.field1621 = new class389();
						}
					} else {
						class135.field1621 = null; // L: 6853
					}

					var1.serverPacket = null; // L: 6854
					return true; // L: 6855
				}

				if (ServerPacket.field3433 == var1.serverPacket) { // L: 6857
					var20 = var3.method9321(); // L: 6858
					var5 = var3.method9335(); // L: 6859
					var21 = class243.field2620.method6281(var5); // L: 6860
					if (var21 != null && var21.type == 0) { // L: 6861
						if (var20 > var21.scrollHeight - var21.height) { // L: 6862
							var20 = var21.scrollHeight - var21.height;
						}

						if (var20 < 0) { // L: 6863
							var20 = 0;
						}

						if (var20 != var21.scrollY) { // L: 6864
							var21.scrollY = var20; // L: 6865
							WorldMapData_0.invalidateWidget(var21); // L: 6866
						}
					}

					var1.serverPacket = null; // L: 6869
					return true; // L: 6870
				}

				if (ServerPacket.field3431 == var1.serverPacket) { // L: 6872
					for (var20 = 0; var20 < players.length; ++var20) { // L: 6873
						if (players[var20] != null) { // L: 6874
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) { // L: 6876
						if (npcs[var20] != null) { // L: 6877
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 6879
					return true; // L: 6880
				}

				String var51;
				if (ServerPacket.field3337 == var1.serverPacket) { // L: 6882
					var51 = var3.readStringCp1252NullTerminated(); // L: 6883
					var25 = AbstractFont.escapeBrackets(VertexNormal.method5102(class342.method6308(var3))); // L: 6884
					SecureRandomCallable.addGameMessage(6, var51, var25); // L: 6885
					var1.serverPacket = null; // L: 6886
					return true; // L: 6887
				}

				if (ServerPacket.field3374 == var1.serverPacket) { // L: 6889
					rebootTimer = var3.method9380() * 30; // L: 6890
					field722 = cycleCntr; // L: 6891
					var1.serverPacket = null; // L: 6892
					return true; // L: 6893
				}

				if (ServerPacket.field3405 == var1.serverPacket) { // L: 6895
					var20 = var3.method9317(); // L: 6896
					var93 = class243.field2620.method6281(var20); // L: 6897

					for (var6 = 0; var6 < var93.field3874.length; ++var6) { // L: 6898
						var93.field3874[var6] = -1; // L: 6899
						var93.field3874[var6] = 0; // L: 6900
					}

					WorldMapData_0.invalidateWidget(var93); // L: 6902
					var1.serverPacket = null; // L: 6903
					return true; // L: 6904
				}

				if (ServerPacket.field3378 == var1.serverPacket) { // L: 6906
					var20 = var3.readInt(); // L: 6907
					InterfaceParent var92 = (InterfaceParent)interfaceParents.get((long)var20); // L: 6908
					if (var92 != null) { // L: 6909
						FloorUnderlayDefinition.closeInterface(var92, true);
					}

					if (meslayerContinueWidget != null) { // L: 6910
						WorldMapData_0.invalidateWidget(meslayerContinueWidget); // L: 6911
						meslayerContinueWidget = null; // L: 6912
					}

					var1.serverPacket = null; // L: 6914
					return true; // L: 6915
				}

				if (ServerPacket.field3384 == var1.serverPacket) { // L: 6917
					isCameraLocked = true; // L: 6918
					field626 = false; // L: 6919
					field774 = false; // L: 6920
					Skeleton.field2633 = var3.readUnsignedByte() * 16384; // L: 6921
					class91.field1119 = var3.readUnsignedByte() * 128; // L: 6922
					class9.field38 = var3.readUnsignedShort(); // L: 6923
					class440.field4745 = var3.readUnsignedByte(); // L: 6924
					CollisionMap.field2445 = var3.readUnsignedByte(); // L: 6925
					if (CollisionMap.field2445 >= 100) { // L: 6926
						var20 = Skeleton.field2633 * 128 + 64; // L: 6927
						var5 = class91.field1119 * 16384 + 64; // L: 6928
						var6 = Canvas.getTileHeight(var20, var5, class172.Client_plane) - class9.field38; // L: 6929
						var7 = var20 - WorldMapLabelSize.cameraX; // L: 6930
						var22 = var6 - MouseHandler.cameraY; // L: 6931
						var9 = var5 - class193.cameraZ; // L: 6932
						var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9)); // L: 6933
						UserComparator10.cameraPitch = (int)(Math.atan2((double)var22, (double)var10) * 325.9490051269531D) & 2047; // L: 6934
						class17.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047; // L: 6935
						if (UserComparator10.cameraPitch < 128) { // L: 6936
							UserComparator10.cameraPitch = 128;
						}

						if (UserComparator10.cameraPitch > 383) { // L: 6937
							UserComparator10.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 6939
					return true; // L: 6940
				}

				if (ServerPacket.field3339 == var1.serverPacket) { // L: 6942
					minimapState = var3.readUnsignedByte(); // L: 6943
					var1.serverPacket = null; // L: 6944
					return true; // L: 6945
				}

				Widget var24;
				if (ServerPacket.field3388 == var1.serverPacket) { // L: 6947
					var20 = var3.readShort(); // L: 6948
					var5 = var3.readInt(); // L: 6949
					var6 = var3.method9307(); // L: 6950
					var24 = class243.field2620.method6281(var5); // L: 6951
					if (var6 != var24.rawX || var20 != var24.rawY || var24.xAlignment != 0 || var24.yAlignment != 0) { // L: 6952
						var24.rawX = var6; // L: 6953
						var24.rawY = var20; // L: 6954
						var24.xAlignment = 0; // L: 6955
						var24.yAlignment = 0; // L: 6956
						WorldMapData_0.invalidateWidget(var24); // L: 6957
						this.alignWidget(var24); // L: 6958
						if (var24.type == 0) { // L: 6959
							IsaacCipher.revalidateWidgetScroll(class243.field2620.field3645[var5 >> 16], var24, false);
						}
					}

					var1.serverPacket = null; // L: 6961
					return true; // L: 6962
				}

				if (ServerPacket.field3381 == var1.serverPacket) { // L: 6964
					var20 = var3.readUnsignedByte(); // L: 6965
					class106.forceDisconnect(var20); // L: 6966
					var1.serverPacket = null; // L: 6967
					return false; // L: 6968
				}

				if (ServerPacket.field3331 == var1.serverPacket) { // L: 6970
					ModelData0.field2905 = var3.readUnsignedByte(); // L: 6971
					class332.field3602 = var3.method9462(); // L: 6972
					field587 = var3.method9300(); // L: 6973

					while (var3.offset < var1.serverPacketLength) { // L: 6974
						var20 = var3.readUnsignedByte(); // L: 6975
						class311 var91 = GrandExchangeOffer.method7148()[var20]; // L: 6976
						class232.method4433(var91); // L: 6977
					}

					var1.serverPacket = null; // L: 6979
					return true; // L: 6980
				}

				if (ServerPacket.field3322 == var1.serverPacket) { // L: 6982
					Language.updateNpcs(true, var3); // L: 6983
					var1.serverPacket = null; // L: 6984
					return true; // L: 6985
				}

				if (ServerPacket.field3438 == var1.serverPacket) { // L: 6987
					var6 = var3.method9335(); // L: 6993
					var7 = var3.method9300(); // L: 6994
					var20 = var3.method9318(); // L: 6995
					Player var58;
					if (var20 == localPlayerIndex) { // L: 6996
						var58 = class133.localPlayer; // L: 6997
					} else {
						var58 = players[var20]; // L: 7000
					}

					var5 = var3.method9380(); // L: 7002
					if (var58 != null) { // L: 7003
						var58.method2414(var7, var5, var6 >> 16, var6 & 65535); // L: 7004
					}

					var1.serverPacket = null; // L: 7006
					return true; // L: 7007
				}

				if (ServerPacket.field3437 == var1.serverPacket) { // L: 7009
					var20 = var3.readUnsignedShort(); // L: 7010
					var5 = var3.readUnsignedByte(); // L: 7011
					var6 = var3.readUnsignedShort(); // L: 7012
					class151.queueSoundEffect(var20, var5, var6); // L: 7013
					var1.serverPacket = null; // L: 7014
					return true; // L: 7015
				}

				if (ServerPacket.field3336 == var1.serverPacket) { // L: 7017
					class232.method4433(class311.field3304); // L: 7018
					var1.serverPacket = null; // L: 7019
					return true; // L: 7020
				}

				if (ServerPacket.field3335 == var1.serverPacket) { // L: 7022
					var3.offset += 28; // L: 7023
					if (var3.checkCrc()) { // L: 7024
						class141.method3130(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 7025
					return true; // L: 7026
				}

				if (ServerPacket.field3323 == var1.serverPacket) { // L: 7028
					isCameraLocked = true; // L: 7029
					field626 = false; // L: 7030
					field603 = true; // L: 7031
					class315.field3463 = var3.readUnsignedByte() * 16384; // L: 7032
					class150.field1714 = var3.readUnsignedByte() * 128; // L: 7033
					var20 = var3.readUnsignedShort(); // L: 7034
					var5 = var3.readUnsignedShort(); // L: 7035
					field514 = var3.readBoolean(); // L: 7036
					var6 = var3.readUnsignedByte(); // L: 7037
					var7 = class315.field3463 * 128 + 64; // L: 7038
					var22 = class150.field1714 * 16384 + 64; // L: 7039
					boolean var67 = false; // L: 7040
					boolean var63 = false; // L: 7041
					if (field514) { // L: 7042
						var9 = MouseHandler.cameraY; // L: 7043
						var10 = Canvas.getTileHeight(var7, var22, class172.Client_plane) - var20; // L: 7044
					} else {
						var9 = Canvas.getTileHeight(WorldMapLabelSize.cameraX, class193.cameraZ, class172.Client_plane) - MouseHandler.cameraY; // L: 7047
						var10 = var20; // L: 7048
					}

					field776 = new class497(WorldMapLabelSize.cameraX, class193.cameraZ, var9, var7, var22, var10, var5, var6); // L: 7050
					var1.serverPacket = null; // L: 7051
					return true; // L: 7052
				}

				if (ServerPacket.field3426 == var1.serverPacket) { // L: 7054
					publicChatMode = var3.readUnsignedByte(); // L: 7055
					tradeChatMode = var3.method9298(); // L: 7056
					var1.serverPacket = null; // L: 7057
					return true; // L: 7058
				}

				if (ServerPacket.field3386 == var1.serverPacket) { // L: 7060
					var20 = var3.method9514(); // L: 7061
					var5 = var3.method9321(); // L: 7062
					var21 = class243.field2620.method6281(var20); // L: 7063
					if (var21.modelType != 1 || var5 != var21.modelId) { // L: 7064
						var21.modelType = 1; // L: 7065
						var21.modelId = var5; // L: 7066
						WorldMapData_0.invalidateWidget(var21); // L: 7067
					}

					var1.serverPacket = null; // L: 7069
					return true; // L: 7070
				}

				if (ServerPacket.field3356 == var1.serverPacket) { // L: 7072
					isCameraLocked = true; // L: 7073
					field626 = false; // L: 7074
					field774 = true; // L: 7075
					Skeleton.field2633 = var3.readUnsignedByte() * 16384; // L: 7076
					class91.field1119 = var3.readUnsignedByte() * 128; // L: 7077
					class9.field38 = var3.readUnsignedShort(); // L: 7078
					var20 = var3.readUnsignedShort(); // L: 7079
					var5 = var3.readUnsignedByte(); // L: 7080
					var6 = Skeleton.field2633 * 128 + 64; // L: 7081
					var7 = class91.field1119 * 16384 + 64; // L: 7082
					var22 = Canvas.getTileHeight(var6, var7, class172.Client_plane) - class9.field38; // L: 7083
					var9 = var6 - WorldMapLabelSize.cameraX; // L: 7084
					var10 = var22 - MouseHandler.cameraY; // L: 7085
					var62 = var7 - class193.cameraZ; // L: 7086
					double var83 = Math.sqrt((double)(var62 * var62 + var9 * var9)); // L: 7087
					var69 = class328.method6193((int)(Math.atan2((double)var10, var83) * 325.9490051269531D) & 2047); // L: 7088
					var15 = class179.method3554((int)(Math.atan2((double)var9, (double)var62) * -325.9490051269531D) & 2047); // L: 7089
					field778 = new class498(UserComparator10.cameraPitch, var69, var20, var5); // L: 7090
					field777 = new class498(class17.cameraYaw, var15, var20, var5); // L: 7091
					var1.serverPacket = null; // L: 7092
					return true; // L: 7093
				}

				String var35;
				if (ServerPacket.field3415 == var1.serverPacket) { // L: 7095
					var79 = var3.readByte(); // L: 7096
					var25 = var3.readStringCp1252NullTerminated(); // L: 7097
					long var28 = (long)var3.readUnsignedShort(); // L: 7098
					long var30 = (long)var3.readMedium(); // L: 7099
					PlayerType var76 = (PlayerType)KitDefinition.findEnumerated(Huffman.PlayerType_values(), var3.readUnsignedByte()); // L: 7100
					long var32 = (var28 << 32) + var30; // L: 7101
					boolean var66 = false; // L: 7102
					ClanChannel var34 = null; // L: 7103
					var34 = var79 >= 0 ? currentClanChannels[var79] : class19.guestClanChannel; // L: 7105
					if (var34 == null) { // L: 7106
						var66 = true; // L: 7107
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var76.isUser && class334.friendSystem.isIgnored(new Username(var25, class127.loginType))) { // L: 7116 7117
									var66 = true;
								}
								break;
							}

							if (field746[var15] == var32) { // L: 7111
								var66 = true; // L: 7112
								break; // L: 7113
							}

							++var15; // L: 7110
						}
					}

					if (!var66) { // L: 7120
						field746[field747] = var32; // L: 7121
						field747 = (field747 + 1) % 100; // L: 7122
						var35 = AbstractFont.escapeBrackets(class342.method6308(var3)); // L: 7123
						var16 = var79 >= 0 ? 41 : 44; // L: 7124
						if (var76.modIcon != -1) { // L: 7125
							class193.addChatMessage(var16, AbstractByteArrayCopier.method6833(var76.modIcon) + var25, var35, var34.name);
						} else {
							class193.addChatMessage(var16, var25, var35, var34.name); // L: 7126
						}
					}

					var1.serverPacket = null; // L: 7128
					return true; // L: 7129
				}

				if (ServerPacket.field3404 == var1.serverPacket) { // L: 7131
					class418.privateChatMode = class550.method9855(var3.readUnsignedByte()); // L: 7132
					var1.serverPacket = null; // L: 7133
					return true; // L: 7134
				}

				if (ServerPacket.field3343 == var1.serverPacket) { // L: 7136
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) { // L: 7137
						if (Varps.Varps_main[var20] != Varps.Varps_temp[var20]) { // L: 7138
							Varps.Varps_main[var20] = Varps.Varps_temp[var20]; // L: 7139
							class11.changeGameOptions(var20); // L: 7140
							field707[++field708 - 1 & 31] = var20; // L: 7141
						}
					}

					var1.serverPacket = null; // L: 7144
					return true; // L: 7145
				}

				if (ServerPacket.field3442 == var1.serverPacket) { // L: 7147
					class334.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 7148
					ClientPacket.FriendSystem_invalidateIgnoreds(); // L: 7149
					field716 = cycleCntr; // L: 7150
					var1.serverPacket = null; // L: 7151
					return true; // L: 7152
				}

				if (ServerPacket.field3423 == var1.serverPacket) { // L: 7154
					class334.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 7155
					field716 = cycleCntr; // L: 7156
					var1.serverPacket = null; // L: 7157
					return true; // L: 7158
				}

				String var73;
				if (ServerPacket.field3398 == var1.serverPacket) { // L: 7160
					byte[] var54 = new byte[var1.serverPacketLength]; // L: 7161
					var3.method9242(var54, 0, var54.length); // L: 7162
					Buffer var88 = new Buffer(var54); // L: 7163
					var73 = var88.readStringCp1252NullTerminated(); // L: 7164
					class129.openURL(var73, true, false); // L: 7165
					var1.serverPacket = null; // L: 7166
					return true; // L: 7167
				}

				if (ServerPacket.field3435 == var1.serverPacket) { // L: 7169
					var20 = var3.readInt(); // L: 7170
					var5 = var3.readUnsignedShort(); // L: 7171
					if (var20 < -70000) { // L: 7172
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 7174
						var21 = class243.field2620.method6281(var20);
					} else {
						var21 = null; // L: 7175
					}

					if (var21 != null) { // L: 7176
						for (var7 = 0; var7 < var21.field3874.length; ++var7) { // L: 7177
							var21.field3874[var7] = 0; // L: 7178
							var21.field3875[var7] = 0; // L: 7179
						}
					}

					class277.clearItemContainer(var5); // L: 7182
					var7 = var3.readUnsignedShort(); // L: 7183

					for (var22 = 0; var22 < var7; ++var22) { // L: 7184
						var9 = var3.method9298(); // L: 7185
						if (var9 == 255) { // L: 7186
							var9 = var3.method9514();
						}

						var10 = var3.method9318(); // L: 7187
						if (var21 != null && var22 < var21.field3874.length) { // L: 7188 7189
							var21.field3874[var22] = var10; // L: 7190
							var21.field3875[var22] = var9; // L: 7191
						}

						SecureRandomCallable.itemContainerSetItem(var5, var22, var10 - 1, var9); // L: 7194
					}

					if (var21 != null) { // L: 7196
						WorldMapData_0.invalidateWidget(var21);
					}

					class170.method3431(); // L: 7197
					field572[++field710 - 1 & 31] = var5 & 32767; // L: 7198
					var1.serverPacket = null; // L: 7199
					return true; // L: 7200
				}

				if (ServerPacket.field3326 == var1.serverPacket) { // L: 7202
					var71 = var3.readUnsignedByte() == 1; // L: 7203
					if (var71) { // L: 7204
						class170.field1839 = VerticalAlignment.method3924() - var3.readLong(); // L: 7205
						class233.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 7206
					} else {
						class233.grandExchangeEvents = null; // L: 7208
					}

					field721 = cycleCntr; // L: 7209
					var1.serverPacket = null; // L: 7210
					return true; // L: 7211
				}

				if (ServerPacket.field3324 == var1.serverPacket) { // L: 7213
					TileItem.method2679(); // L: 7214
					var79 = var3.readByte(); // L: 7215
					class147 var86 = new class147(var3); // L: 7216
					ClanSettings var89;
					if (var79 >= 0) { // L: 7218
						var89 = currentClanSettings[var79];
					} else {
						var89 = class511.guestClanSettings; // L: 7219
					}

					if (var89 == null) { // L: 7220
						this.method1240(var79); // L: 7221
						var1.serverPacket = null; // L: 7222
						return true; // L: 7223
					}

					if (var86.field1696 > var89.field1744) { // L: 7225
						this.method1240(var79); // L: 7226
						var1.serverPacket = null; // L: 7227
						return true; // L: 7228
					}

					if (var86.field1696 < var89.field1744) { // L: 7230
						var1.serverPacket = null; // L: 7231
						return true; // L: 7232
					}

					var86.method3174(var89); // L: 7234
					var1.serverPacket = null; // L: 7235
					return true; // L: 7236
				}

				InterfaceParent var77;
				if (ServerPacket.field3348 == var1.serverPacket) { // L: 7238
					var20 = var3.method9300(); // L: 7239
					var5 = var3.readUnsignedShort(); // L: 7240
					var6 = var3.method9317(); // L: 7241
					var77 = (InterfaceParent)interfaceParents.get((long)var6); // L: 7242
					if (var77 != null) { // L: 7243
						FloorUnderlayDefinition.closeInterface(var77, var5 != var77.group);
					}

					UrlRequester.method2832(var6, var5, var20); // L: 7244
					var1.serverPacket = null; // L: 7245
					return true; // L: 7246
				}

				if (ServerPacket.field3328 == var1.serverPacket) { // L: 7248
					var1.serverPacket = null; // L: 7249
					return true; // L: 7250
				}

				if (ServerPacket.field3341 == var1.serverPacket) { // L: 7252
					class170.method3431(); // L: 7253
					var20 = var3.readUnsignedByte(); // L: 7254
					var5 = var3.method9317(); // L: 7255
					var6 = var3.method9462(); // L: 7256
					experience[var20] = var5; // L: 7257
					currentLevels[var20] = var6; // L: 7258
					levels[var20] = 1; // L: 7259
					field656[var20] = var6; // L: 7260

					for (var7 = 0; var7 < 98; ++var7) { // L: 7261
						if (var5 >= Skills.Skills_experienceTable[var7]) {
							levels[var20] = var7 + 2;
						}
					}

					field711[++field658 - 1 & 31] = var20; // L: 7262
					var1.serverPacket = null; // L: 7263
					return true; // L: 7264
				}

				if (ServerPacket.field3390 == var1.serverPacket) { // L: 7266
					class149.loadRegions(false, var1.packetBuffer); // L: 7267
					var1.serverPacket = null; // L: 7268
					return true; // L: 7269
				}

				if (ServerPacket.field3353 == var1.serverPacket) { // L: 7271
					var17 = var3.method9298(); // L: 7287
					var61 = var3.readByte(); // L: 7288
					var69 = var3.readUnsignedByte() * 4; // L: 7289
					var15 = var3.readUnsignedShort(); // L: 7290
					var13 = var3.method9300() * 4; // L: 7291
					var6 = var3.method9311(); // L: 7292
					var20 = var6 >> 16; // L: 7293
					var5 = var6 >> 8 & 255; // L: 7294
					var7 = var20 + (var6 >> 4 & 7); // L: 7295
					var22 = var5 + (var6 & 7); // L: 7296
					var64 = var3.method9316(); // L: 7297
					var18 = var3.method9318(); // L: 7298
					var16 = var3.readUnsignedShort(); // L: 7299
					var62 = var3.method9312(); // L: 7300
					var65 = var3.method9318(); // L: 7301
					var9 = var64 + var7; // L: 7302
					var10 = var61 + var22; // L: 7303
					if (var7 >= 0 && var22 >= 0 && var7 < 104 && var22 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var65 != 65535) { // L: 7304
						var7 = var7 * 128 + 64; // L: 7305
						var22 = var22 * 128 + 64; // L: 7306
						var9 = var9 * 128 + 64; // L: 7307
						var10 = var10 * 128 + 64; // L: 7308
						var19 = new Projectile(var65, class172.Client_plane, var7, var22, Canvas.getTileHeight(var7, var22, class172.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var62, var69); // L: 7309
						var19.setDestination(var9, var10, Canvas.getTileHeight(var9, var10, class172.Client_plane) - var69, var15 + cycle); // L: 7310
						projectiles.addFirst(var19); // L: 7311
					}

					var1.serverPacket = null; // L: 7313
					return true; // L: 7314
				}

				if (ServerPacket.field3434 == var1.serverPacket) { // L: 7316
					class232.method4433(class311.field3310); // L: 7317
					var1.serverPacket = null; // L: 7318
					return true; // L: 7319
				}

				if (ServerPacket.field3402 == var1.serverPacket) { // L: 7321
					class232.method4433(class311.field3302); // L: 7322
					var1.serverPacket = null; // L: 7323
					return true; // L: 7324
				}

				if (ServerPacket.field3418 == var1.serverPacket) { // L: 7326
					var5 = var3.method9380(); // L: 7332
					var6 = var3.method9318(); // L: 7333
					var20 = var3.method9321(); // L: 7334
					var7 = var3.method9380(); // L: 7335
					var22 = var3.method9380(); // L: 7336
					if (var20 == 65535) { // L: 7337
						var20 = -1; // L: 7338
					}

					ArrayList var94 = new ArrayList(); // L: 7340
					var94.add(var20); // L: 7341
					FriendSystem.method1892(var94, var5, var6, var7, var22); // L: 7342
					var1.serverPacket = null; // L: 7343
					return true; // L: 7344
				}

				if (ServerPacket.field3406 == var1.serverPacket) { // L: 7346
					World var53 = new World(); // L: 7347
					var53.host = var3.readStringCp1252NullTerminated(); // L: 7348
					var53.id = var3.readUnsignedShort(); // L: 7349
					var5 = var3.readInt(); // L: 7350
					var53.properties = var5; // L: 7351
					if (var53.isDeadman()) { // L: 7352
						var53.field831 = "beta"; // L: 7353
						ScriptFrame.field460 = true; // L: 7354
					} else {
						ScriptFrame.field460 = false; // L: 7357
					}

					FaceNormal.method4886(45); // L: 7359
					var2.close(); // L: 7360
					var2 = null; // L: 7361
					class30.changeWorld(var53); // L: 7362
					var1.serverPacket = null; // L: 7363
					return false; // L: 7364
				}

				if (ServerPacket.field3334 == var1.serverPacket) { // L: 7366
					var51 = var3.readStringCp1252NullTerminated(); // L: 7367
					Object[] var84 = new Object[var51.length() + 1]; // L: 7368

					for (var6 = var51.length() - 1; var6 >= 0; --var6) { // L: 7369
						if (var51.charAt(var6) == 's') { // L: 7370
							var84[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var84[var6 + 1] = new Integer(var3.readInt()); // L: 7371
						}
					}

					var84[0] = new Integer(var3.readInt()); // L: 7373
					ScriptEvent var87 = new ScriptEvent(); // L: 7374
					var87.args = var84; // L: 7375
					AbstractWorldMapData.runScriptEvent(var87); // L: 7376
					var1.serverPacket = null; // L: 7377
					return true; // L: 7378
				}

				if (ServerPacket.field3362 == var1.serverPacket) { // L: 7380
					PendingSpawn.field1189 = new class474(Tiles.field1043); // L: 7381
					var1.serverPacket = null; // L: 7382
					return true; // L: 7383
				}

				if (ServerPacket.field3379 == var1.serverPacket) { // L: 7385
					var20 = var3.method9321(); // L: 7386
					if (var20 == 65535) { // L: 7387
						var20 = -1;
					}

					var5 = var3.readInt(); // L: 7388
					var6 = var3.method9335(); // L: 7389
					var24 = class243.field2620.method6281(var5); // L: 7390
					ItemComposition var57;
					if (!var24.isIf3) { // L: 7391
						if (var20 == -1) { // L: 7392
							var24.modelType = 0; // L: 7393
							var1.serverPacket = null; // L: 7394
							return true; // L: 7395
						}

						var57 = class10.ItemComposition_get(var20).getCountObj(var6); // L: 7397
						var24.modelType = 4; // L: 7398
						var24.modelId = var20; // L: 7399
						var24.modelAngleX = var57.xan2d; // L: 7400
						var24.modelAngleY = var57.yan2d; // L: 7401
						var24.modelZoom = var57.zoom2d * 100 / var6; // L: 7402
						WorldMapData_0.invalidateWidget(var24); // L: 7403
					} else {
						var24.itemId = var20; // L: 7406
						var24.itemQuantity = var6; // L: 7407
						var57 = class10.ItemComposition_get(var20).getCountObj(var6); // L: 7408
						var24.modelAngleX = var57.xan2d; // L: 7409
						var24.modelAngleY = var57.yan2d; // L: 7410
						var24.modelAngleZ = var57.zan2d; // L: 7411
						var24.modelOffsetX = var57.offsetX2d; // L: 7412
						var24.modelOffsetY = var57.offsetY2d; // L: 7413
						var24.modelZoom = var57.zoom2d; // L: 7414
						if (var57.isStackable == 1) { // L: 7415
							var24.itemQuantityMode = 1;
						} else {
							var24.itemQuantityMode = 2; // L: 7416
						}

						if (var24.field3799 > 0) { // L: 7417
							var24.modelZoom = var24.modelZoom * 32 / var24.field3799;
						} else if (var24.rawWidth > 0) { // L: 7418
							var24.modelZoom = var24.modelZoom * 32 / var24.rawWidth;
						}

						WorldMapData_0.invalidateWidget(var24); // L: 7419
					}

					var1.serverPacket = null; // L: 7421
					return true; // L: 7422
				}

				if (ServerPacket.field3414 == var1.serverPacket) { // L: 7424
					for (var20 = 0; var20 < class183.field1945; ++var20) { // L: 7425
						VarpDefinition var82 = UserComparator8.VarpDefinition_get(var20); // L: 7426
						if (var82 != null) { // L: 7427
							Varps.Varps_temp[var20] = 0; // L: 7428
							Varps.Varps_main[var20] = 0; // L: 7429
						}
					}

					class170.method3431(); // L: 7432
					field708 += 32; // L: 7433
					var1.serverPacket = null; // L: 7434
					return true; // L: 7435
				}

				if (ServerPacket.field3411 == var1.serverPacket) { // L: 7437
					PendingSpawn.field1189 = null; // L: 7438
					var1.serverPacket = null; // L: 7439
					return true; // L: 7440
				}

				if (ServerPacket.field3403 == var1.serverPacket) { // L: 7442
					isCameraLocked = true; // L: 7443
					field626 = false; // L: 7444
					field774 = true; // L: 7445
					var20 = class179.method3554(var3.readShort() & 2027); // L: 7446
					var5 = class328.method6193(var3.readShort() & 2027); // L: 7447
					var6 = var3.readUnsignedShort(); // L: 7448
					var7 = var3.readUnsignedByte(); // L: 7449
					field778 = new class498(UserComparator10.cameraPitch, var5, var6, var7); // L: 7450
					field777 = new class498(class17.cameraYaw, var20, var6, var7); // L: 7451
					var1.serverPacket = null; // L: 7452
					return true; // L: 7453
				}

				if (ServerPacket.field3439 == var1.serverPacket) { // L: 7455
					var20 = var3.method9380(); // L: 7456
					if (var20 == 65535) { // L: 7457
						var20 = -1;
					}

					class4.playSong(var20); // L: 7458
					var1.serverPacket = null; // L: 7459
					return true; // L: 7460
				}

				if (ServerPacket.field3443 == var1.serverPacket) { // L: 7462
					var20 = var3.readMedium(); // L: 7463
					var5 = var3.method9380(); // L: 7464
					if (var5 == 65535) { // L: 7465
						var5 = -1;
					}

					class137.method3080(var5, var20); // L: 7466
					var1.serverPacket = null; // L: 7467
					return true; // L: 7468
				}

				if (ServerPacket.field3352 == var1.serverPacket) { // L: 7470
					var9 = var3.method9318(); // L: 7479
					var6 = var3.method9311(); // L: 7480
					var20 = var6 >> 16; // L: 7481
					var5 = var6 >> 8 & 255; // L: 7482
					var7 = var20 + (var6 >> 4 & 7); // L: 7483
					var22 = var5 + (var6 & 7); // L: 7484
					var10 = var3.method9300(); // L: 7485
					var62 = var3.method9318(); // L: 7486
					if (var7 >= 0 && var22 >= 0 && var7 < 104 && var22 < 104) { // L: 7487
						var7 = var7 * 128 + 64; // L: 7488
						var22 = var22 * 128 + 64; // L: 7489
						GraphicsObject var95 = new GraphicsObject(var9, class172.Client_plane, var7, var22, Canvas.getTileHeight(var7, var22, class172.Client_plane) - var10, var62, cycle); // L: 7490
						graphicsObjects.addFirst(var95); // L: 7491
					}

					var1.serverPacket = null; // L: 7493
					return true; // L: 7494
				}

				boolean var11;
				long var38;
				long var40;
				long var42;
				String var44;
				if (ServerPacket.field3342 == var1.serverPacket) { // L: 7496
					var79 = var3.readByte(); // L: 7497
					var38 = (long)var3.readUnsignedShort(); // L: 7498
					var40 = (long)var3.readMedium(); // L: 7499
					var42 = (var38 << 32) + var40; // L: 7500
					var11 = false; // L: 7501
					ClanChannel var37 = var79 >= 0 ? currentClanChannels[var79] : class19.guestClanChannel; // L: 7502
					if (var37 == null) { // L: 7503
						var11 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 7505
							if (var42 == field746[var13]) { // L: 7506
								var11 = true; // L: 7507
								break; // L: 7508
							}
						}
					}

					if (!var11) { // L: 7512
						field746[field747] = var42; // L: 7513
						field747 = (field747 + 1) % 100; // L: 7514
						var44 = class342.method6308(var3); // L: 7515
						var69 = var79 >= 0 ? 43 : 46; // L: 7516
						class193.addChatMessage(var69, "", var44, var37.name); // L: 7517
					}

					var1.serverPacket = null; // L: 7519
					return true; // L: 7520
				}

				if (ServerPacket.field3345 == var1.serverPacket) { // L: 7522
					field626 = false; // L: 7523
					isCameraLocked = false; // L: 7524
					field603 = false; // L: 7525
					field774 = false; // L: 7526
					Skeleton.field2633 = 0; // L: 7527
					class91.field1119 = 0; // L: 7528
					class9.field38 = 0; // L: 7529
					field514 = false; // L: 7530
					class440.field4745 = 0; // L: 7531
					CollisionMap.field2445 = 0; // L: 7532
					class20.field91 = 0; // L: 7533
					Renderable.field2716 = 0; // L: 7534
					class315.field3463 = 0; // L: 7535
					class150.field1714 = 0; // L: 7536
					Actor.field1276 = 0; // L: 7537
					field776 = null; // L: 7538
					field778 = null; // L: 7539
					field777 = null; // L: 7540

					for (var20 = 0; var20 < 5; ++var20) { // L: 7541
						field780[var20] = false; // L: 7542
					}

					var1.serverPacket = null; // L: 7544
					return true; // L: 7545
				}

				long var26;
				if (ServerPacket.field3366 == var1.serverPacket) { // L: 7547
					var20 = var3.offset + var1.serverPacketLength; // L: 7548
					var5 = var3.readUnsignedShort(); // L: 7549
					if (var5 == 65535) { // L: 7550
						var5 = -1;
					}

					var6 = var3.readUnsignedShort(); // L: 7551
					if (var5 != rootInterface) { // L: 7552
						rootInterface = var5; // L: 7553
						this.resizeRoot(false); // L: 7554
						ApproximateRouteStrategy.method1186(rootInterface); // L: 7555
						class25.method338(rootInterface); // L: 7556

						for (var7 = 0; var7 < 100; ++var7) { // L: 7557
							field732[var7] = true;
						}
					}

					InterfaceParent var72;
					for (; var6-- > 0; var72.field1076 = true) { // L: 7559 7569
						var7 = var3.readInt(); // L: 7560
						var22 = var3.readUnsignedShort(); // L: 7561
						var9 = var3.readUnsignedByte(); // L: 7562
						var72 = (InterfaceParent)interfaceParents.get((long)var7); // L: 7563
						if (var72 != null && var22 != var72.group) { // L: 7564
							FloorUnderlayDefinition.closeInterface(var72, true); // L: 7565
							var72 = null; // L: 7566
						}

						if (var72 == null) { // L: 7568
							var72 = UrlRequester.method2832(var7, var22, var9);
						}
					}

					for (var77 = (InterfaceParent)interfaceParents.first(); var77 != null; var77 = (InterfaceParent)interfaceParents.next()) { // L: 7571
						if (var77.field1076) { // L: 7572
							var77.field1076 = false;
						} else {
							FloorUnderlayDefinition.closeInterface(var77, true); // L: 7574
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 7577

					while (var3.offset < var20) { // L: 7578
						var7 = var3.readInt(); // L: 7579
						var22 = var3.readUnsignedShort(); // L: 7580
						var9 = var3.readUnsignedShort(); // L: 7581
						var10 = var3.readInt(); // L: 7582

						for (var62 = var22; var62 <= var9; ++var62) { // L: 7583
							var26 = (long)var62 + ((long)var7 << 32); // L: 7584
							widgetFlags.put(new IntegerNode(var10), var26); // L: 7585
						}
					}

					var1.serverPacket = null; // L: 7588
					return true; // L: 7589
				}

				if (ServerPacket.field3363 == var1.serverPacket) { // L: 7591
					class170.method3431(); // L: 7592
					weight = var3.readShort(); // L: 7593
					field722 = cycleCntr; // L: 7594
					var1.serverPacket = null; // L: 7595
					return true; // L: 7596
				}

				if (ServerPacket.field3370 == var1.serverPacket) { // L: 7598
					isCameraLocked = true; // L: 7599
					field626 = false; // L: 7600
					field603 = false; // L: 7601
					class315.field3463 = var3.readUnsignedByte() * 16384; // L: 7602
					class150.field1714 = var3.readUnsignedByte() * 128; // L: 7603
					Actor.field1276 = var3.readUnsignedShort(); // L: 7604
					Renderable.field2716 = var3.readUnsignedByte(); // L: 7605
					class20.field91 = var3.readUnsignedByte(); // L: 7606
					if (class20.field91 >= 100) { // L: 7607
						WorldMapLabelSize.cameraX = class315.field3463 * 128 + 64; // L: 7608
						class193.cameraZ = class150.field1714 * 16384 + 64; // L: 7609
						MouseHandler.cameraY = Canvas.getTileHeight(WorldMapLabelSize.cameraX, class193.cameraZ, class172.Client_plane) - Actor.field1276; // L: 7610
					}

					var1.serverPacket = null; // L: 7612
					return true; // L: 7613
				}

				if (ServerPacket.field3351 == var1.serverPacket) { // L: 7615
					var20 = var3.method9317(); // L: 7616
					var25 = var3.readStringCp1252NullTerminated(); // L: 7617
					var21 = class243.field2620.method6281(var20); // L: 7618
					if (!var25.equals(var21.text)) { // L: 7619
						var21.text = var25; // L: 7620
						WorldMapData_0.invalidateWidget(var21); // L: 7621
					}

					var1.serverPacket = null; // L: 7623
					return true; // L: 7624
				}

				if (ServerPacket.field3325 == var1.serverPacket) { // L: 7626
					var7 = var3.readUnsignedShort(); // L: 7631
					var20 = var3.method9321(); // L: 7632
					var6 = var3.method9318(); // L: 7633
					var5 = var3.method9318(); // L: 7634
					WorldMapElement.method3742(var20, var5, var6, var7); // L: 7635
					var1.serverPacket = null; // L: 7636
					return true; // L: 7637
				}

				if (ServerPacket.field3436 == var1.serverPacket) { // L: 7639
					var20 = var3.method9318(); // L: 7640
					Fonts.method8920(var20); // L: 7641
					field572[++field710 - 1 & 31] = var20 & 32767; // L: 7642
					var1.serverPacket = null; // L: 7643
					return true; // L: 7644
				}

				if (ServerPacket.field3373 == var1.serverPacket) { // L: 7646
					var20 = var3.method9300(); // L: 7647
					var5 = var3.method9514(); // L: 7648
					var21 = class243.field2620.method6281(var5); // L: 7649
					PacketBufferNode.method5921(var21, class133.localPlayer.appearance.field3686, var20); // L: 7650
					WorldMapData_0.invalidateWidget(var21); // L: 7651
					var1.serverPacket = null; // L: 7652
					return true; // L: 7653
				}

				if (ServerPacket.field3424 == var1.serverPacket) { // L: 7655
					var51 = var3.readStringCp1252NullTerminated(); // L: 7656
					var5 = var3.readUnsignedByte(); // L: 7657
					var6 = var3.method9298(); // L: 7658
					if (var6 >= 1 && var6 <= 8) { // L: 7659
						if (var51.equalsIgnoreCase("null")) { // L: 7660
							var51 = null;
						}

						playerMenuActions[var6 - 1] = var51; // L: 7661
						playerOptionsPriorities[var6 - 1] = var5 == 0; // L: 7662
					}

					var1.serverPacket = null; // L: 7664
					return true; // L: 7665
				}

				boolean var12;
				if (ServerPacket.field3350 == var1.serverPacket) { // L: 7667
					isCameraLocked = true; // L: 7668
					field626 = false; // L: 7669
					field603 = true; // L: 7670
					class315.field3463 = var3.readUnsignedByte() * 16384; // L: 7671
					class150.field1714 = var3.readUnsignedByte() * 128; // L: 7672
					var20 = var3.readUnsignedShort(); // L: 7673
					var5 = var3.readUnsignedByte() * 128 + 64; // L: 7674
					var6 = var3.readUnsignedByte() * 128 + 64; // L: 7675
					var7 = var3.readUnsignedShort(); // L: 7676
					field514 = var3.readBoolean(); // L: 7677
					var22 = var3.readUnsignedByte(); // L: 7678
					var9 = class315.field3463 * 128 + 64; // L: 7679
					var10 = class150.field1714 * 16384 + 64; // L: 7680
					var11 = false; // L: 7681
					var12 = false; // L: 7682
					if (field514) { // L: 7683
						var62 = MouseHandler.cameraY; // L: 7684
						var65 = Canvas.getTileHeight(var9, var10, class172.Client_plane) - var20; // L: 7685
					} else {
						var62 = Canvas.getTileHeight(WorldMapLabelSize.cameraX, class193.cameraZ, class172.Client_plane) - MouseHandler.cameraY; // L: 7688
						var65 = var20; // L: 7689
					}

					field776 = new class496(WorldMapLabelSize.cameraX, class193.cameraZ, var62, var9, var10, var65, var5, var6, var7, var22); // L: 7691
					var1.serverPacket = null; // L: 7692
					return true; // L: 7693
				}

				if (ServerPacket.field3440 == var1.serverPacket) { // L: 7695
					class170.method3431(); // L: 7696
					var20 = var3.method9298(); // L: 7697
					var5 = var3.method9298(); // L: 7698
					var6 = var3.method9300(); // L: 7699
					var7 = var3.method9317(); // L: 7700
					experience[var20] = var7; // L: 7701
					currentLevels[var20] = var5; // L: 7702
					levels[var20] = 1; // L: 7703
					field656[var20] = var6; // L: 7704

					for (var22 = 0; var22 < 98; ++var22) { // L: 7705
						if (var7 >= Skills.Skills_experienceTable[var22]) {
							levels[var20] = var22 + 2;
						}
					}

					field711[++field658 - 1 & 31] = var20; // L: 7706
					var1.serverPacket = null; // L: 7707
					return true; // L: 7708
				}

				if (ServerPacket.field3329 == var1.serverPacket) { // L: 7710
					return this.method1232(var1); // L: 7711
				}

				Widget var56;
				if (ServerPacket.field3395 == var1.serverPacket) { // L: 7713
					var20 = var3.method9514(); // L: 7714
					var5 = var3.method9514(); // L: 7715
					InterfaceParent var81 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7716
					var77 = (InterfaceParent)interfaceParents.get((long)var5); // L: 7717
					if (var77 != null) { // L: 7718
						FloorUnderlayDefinition.closeInterface(var77, var81 == null || var77.group != var81.group);
					}

					if (var81 != null) { // L: 7719
						var81.remove(); // L: 7720
						interfaceParents.put(var81, (long)var5); // L: 7721
					}

					var56 = class243.field2620.method6281(var20); // L: 7723
					if (var56 != null) { // L: 7724
						WorldMapData_0.invalidateWidget(var56);
					}

					var56 = class243.field2620.method6281(var5); // L: 7725
					if (var56 != null) { // L: 7726
						WorldMapData_0.invalidateWidget(var56); // L: 7727
						IsaacCipher.revalidateWidgetScroll(class243.field2620.field3645[var56.id >>> 16], var56, true); // L: 7728
					}

					if (rootInterface != -1) { // L: 7730
						Login.method2161(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 7731
					return true; // L: 7732
				}

				if (ServerPacket.field3330 == var1.serverPacket) { // L: 7734
					var20 = var3.readUnsignedShort(); // L: 7735
					if (var20 == 65535) { // L: 7736
						var20 = -1;
					}

					var5 = var3.method9318(); // L: 7737
					if (var5 == 65535) { // L: 7738
						var5 = -1;
					}

					var6 = var3.method9335(); // L: 7739
					var7 = var3.method9514(); // L: 7740

					for (var22 = var5; var22 <= var20; ++var22) { // L: 7741
						var42 = ((long)var6 << 32) + (long)var22; // L: 7742
						Node var96 = widgetFlags.get(var42); // L: 7743
						if (var96 != null) { // L: 7744
							var96.remove();
						}

						widgetFlags.put(new IntegerNode(var7), var42); // L: 7745
					}

					var1.serverPacket = null; // L: 7747
					return true; // L: 7748
				}

				if (ServerPacket.field3387 == var1.serverPacket) { // L: 7750
					var20 = var3.readUnsignedByte(); // L: 7751
					if (var3.readUnsignedByte() == 0) { // L: 7752
						grandExchangeOffers[var20] = new GrandExchangeOffer(); // L: 7753
						var3.offset += 18; // L: 7754
					} else {
						--var3.offset; // L: 7757
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false); // L: 7758
					}

					field720 = cycleCntr; // L: 7760
					var1.serverPacket = null; // L: 7761
					return true; // L: 7762
				}

				if (ServerPacket.field3425 == var1.serverPacket) { // L: 7764
					class232.method4433(class311.field3314); // L: 7765
					var1.serverPacket = null; // L: 7766
					return true; // L: 7767
				}

				if (ServerPacket.field3333 == var1.serverPacket) { // L: 7769
					var20 = var3.readInt(); // L: 7770
					var5 = var3.readInt(); // L: 7771
					var6 = class130.getGcDuration(); // L: 7772
					PacketBufferNode var74 = class425.getPacketBufferNode(ClientPacket.field3213, packetWriter.isaacCipher); // L: 7774
					var74.packetBuffer.method9297(GameEngine.fps); // L: 7775
					var74.packetBuffer.method9297(var6); // L: 7776
					var74.packetBuffer.writeIntME(var20); // L: 7777
					var74.packetBuffer.method9407(var5); // L: 7778
					packetWriter.addNode(var74); // L: 7779
					var1.serverPacket = null; // L: 7780
					return true; // L: 7781
				}

				if (ServerPacket.field3392 == var1.serverPacket) { // L: 7783
					var20 = var3.method9321(); // L: 7784
					var5 = var3.method9380(); // L: 7785
					var6 = var3.readUnsignedShort(); // L: 7786
					var7 = var3.readInt(); // L: 7787
					var56 = class243.field2620.method6281(var7); // L: 7788
					if (var20 != var56.modelAngleX || var6 != var56.modelAngleY || var5 != var56.modelZoom) { // L: 7789
						var56.modelAngleX = var20; // L: 7790
						var56.modelAngleY = var6; // L: 7791
						var56.modelZoom = var5; // L: 7792
						WorldMapData_0.invalidateWidget(var56); // L: 7793
					}

					var1.serverPacket = null; // L: 7795
					return true; // L: 7796
				}

				if (ServerPacket.field3383 == var1.serverPacket) { // L: 7798
					var20 = var3.method9321(); // L: 7799
					var5 = var3.readInt(); // L: 7800
					var21 = class243.field2620.method6281(var5); // L: 7801
					if (var21.modelType != 2 || var20 != var21.modelId) { // L: 7802
						var21.modelType = 2; // L: 7803
						var21.modelId = var20; // L: 7804
						WorldMapData_0.invalidateWidget(var21); // L: 7805
					}

					var1.serverPacket = null; // L: 7807
					return true; // L: 7808
				}

				if (ServerPacket.field3444 == var1.serverPacket) { // L: 7810
					if (PendingSpawn.field1189 == null) { // L: 7811
						PendingSpawn.field1189 = new class474(Tiles.field1043);
					}

					class543 var52 = Tiles.field1043.method8501(var3); // L: 7812
					PendingSpawn.field1189.field4900.vmethod8990(var52.field5299, var52.field5300); // L: 7813
					field631[++field714 - 1 & 31] = var52.field5299; // L: 7814
					var1.serverPacket = null; // L: 7815
					return true; // L: 7816
				}

				if (ServerPacket.field3409 == var1.serverPacket) { // L: 7818
					var51 = var3.readStringCp1252NullTerminated(); // L: 7819
					var38 = (long)var3.readUnsignedShort(); // L: 7820
					var40 = (long)var3.readMedium(); // L: 7821
					PlayerType var36 = (PlayerType)KitDefinition.findEnumerated(Huffman.PlayerType_values(), var3.readUnsignedByte()); // L: 7822
					long var46 = (var38 << 32) + var40; // L: 7823
					var12 = false; // L: 7824

					for (var13 = 0; var13 < 100; ++var13) { // L: 7825
						if (var46 == field746[var13]) { // L: 7826
							var12 = true; // L: 7827
							break; // L: 7828
						}
					}

					if (class334.friendSystem.isIgnored(new Username(var51, class127.loginType))) { // L: 7831
						var12 = true;
					}

					if (!var12 && field750 == 0) { // L: 7832
						field746[field747] = var46; // L: 7833
						field747 = (field747 + 1) % 100; // L: 7834
						var44 = AbstractFont.escapeBrackets(VertexNormal.method5102(class342.method6308(var3))); // L: 7835
						byte var68;
						if (var36.isPrivileged) { // L: 7837
							var68 = 7;
						} else {
							var68 = 3; // L: 7838
						}

						if (var36.modIcon != -1) { // L: 7839
							SecureRandomCallable.addGameMessage(var68, AbstractByteArrayCopier.method6833(var36.modIcon) + var51, var44);
						} else {
							SecureRandomCallable.addGameMessage(var68, var51, var44); // L: 7840
						}
					}

					var1.serverPacket = null; // L: 7842
					return true; // L: 7843
				}

				if (ServerPacket.field3338 == var1.serverPacket) { // L: 7845
					var51 = var3.readStringCp1252NullTerminated(); // L: 7846
					var38 = var3.readLong(); // L: 7847
					var40 = (long)var3.readUnsignedShort(); // L: 7848
					var42 = (long)var3.readMedium(); // L: 7849
					PlayerType var45 = (PlayerType)KitDefinition.findEnumerated(Huffman.PlayerType_values(), var3.readUnsignedByte()); // L: 7850
					var26 = var42 + (var40 << 32); // L: 7851
					boolean var14 = false; // L: 7852

					for (var15 = 0; var15 < 100; ++var15) { // L: 7853
						if (field746[var15] == var26) { // L: 7854
							var14 = true; // L: 7855
							break; // L: 7856
						}
					}

					if (var45.isUser && class334.friendSystem.isIgnored(new Username(var51, class127.loginType))) { // L: 7859 7860
						var14 = true;
					}

					if (!var14 && field750 == 0) { // L: 7862
						field746[field747] = var26; // L: 7863
						field747 = (field747 + 1) % 100; // L: 7864
						var35 = AbstractFont.escapeBrackets(VertexNormal.method5102(class342.method6308(var3))); // L: 7865
						if (var45.modIcon != -1) { // L: 7866
							class193.addChatMessage(9, AbstractByteArrayCopier.method6833(var45.modIcon) + var51, var35, ModelData0.base37DecodeLong(var38));
						} else {
							class193.addChatMessage(9, var51, var35, ModelData0.base37DecodeLong(var38)); // L: 7867
						}
					}

					var1.serverPacket = null; // L: 7869
					return true; // L: 7870
				}

				if (ServerPacket.field3354 == var1.serverPacket) { // L: 7872
					var20 = var3.method9317(); // L: 7873
					var5 = var3.readUnsignedShort(); // L: 7874
					var6 = var5 >> 10 & 31; // L: 7875
					var7 = var5 >> 5 & 31; // L: 7876
					var22 = var5 & 31; // L: 7877
					var9 = (var7 << 11) + (var6 << 19) + (var22 << 3); // L: 7878
					Widget var23 = class243.field2620.method6281(var20); // L: 7879
					if (var9 != var23.color) { // L: 7880
						var23.color = var9; // L: 7881
						WorldMapData_0.invalidateWidget(var23); // L: 7882
					}

					var1.serverPacket = null; // L: 7884
					return true; // L: 7885
				}

				if (ServerPacket.field3368 == var1.serverPacket) { // L: 7887
					var20 = var3.method9321(); // L: 7890
					var5 = var3.method9321(); // L: 7891
					class11.method108(var20, var5); // L: 7892
					var1.serverPacket = null; // L: 7893
					return true; // L: 7894
				}

				if (ServerPacket.field3396 == var1.serverPacket) { // L: 7896
					class232.method4433(class311.field3307); // L: 7897
					var1.serverPacket = null; // L: 7898
					return true; // L: 7899
				}

				if (ServerPacket.field3419 == var1.serverPacket) { // L: 7901
					field719 = cycleCntr; // L: 7902
					var79 = var3.readByte(); // L: 7903
					class161 var80 = new class161(var3); // L: 7904
					ClanChannel var75;
					if (var79 >= 0) { // L: 7906
						var75 = currentClanChannels[var79];
					} else {
						var75 = class19.guestClanChannel; // L: 7907
					}

					if (var75 == null) { // L: 7908
						this.method1239(var79); // L: 7909
						var1.serverPacket = null; // L: 7910
						return true; // L: 7911
					}

					if (var80.field1781 > var75.field1795) { // L: 7913
						this.method1239(var79); // L: 7914
						var1.serverPacket = null; // L: 7915
						return true; // L: 7916
					}

					if (var80.field1781 < var75.field1795) { // L: 7918
						var1.serverPacket = null; // L: 7919
						return true; // L: 7920
					}

					var80.method3357(var75); // L: 7922
					var1.serverPacket = null; // L: 7923
					return true; // L: 7924
				}

				if (ServerPacket.field3394 == var1.serverPacket) { // L: 7926
					if (rootInterface != -1) { // L: 7927
						Login.method2161(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 7928
					return true; // L: 7929
				}

				if (ServerPacket.field3382 == var1.serverPacket) { // L: 7931
					return this.method1394(var1, 1); // L: 7932
				}

				if (ServerPacket.field3360 == var1.serverPacket) { // L: 7934
					var20 = var3.readInt(); // L: 7935
					if (var20 != field608) { // L: 7936
						field608 = var20; // L: 7937
						class12.method169(); // L: 7938
					}

					var1.serverPacket = null; // L: 7940
					return true; // L: 7941
				}

				if (ServerPacket.field3327 == var1.serverPacket) { // L: 7943
					PendingSpawn.readReflectionCheck(var3, var1.serverPacketLength); // L: 7944
					var1.serverPacket = null; // L: 7945
					return true; // L: 7946
				}

				if (ServerPacket.field3332 == var1.serverPacket) { // L: 7948
					class232.method4433(class311.field3309); // L: 7949
					var1.serverPacket = null; // L: 7950
					return true; // L: 7951
				}

				if (ServerPacket.field3417 == var1.serverPacket) { // L: 7953
					class334.friendSystem.method1849(); // L: 7954
					field716 = cycleCntr; // L: 7955
					var1.serverPacket = null; // L: 7956
					return true; // L: 7957
				}

				if (ServerPacket.field3397 == var1.serverPacket) { // L: 7959
					class170.method3431(); // L: 7960
					field633 = var3.readUnsignedShort(); // L: 7961
					field722 = cycleCntr; // L: 7962
					var1.serverPacket = null; // L: 7963
					return true; // L: 7964
				}

				if (ServerPacket.field3385 == var1.serverPacket) { // L: 7966
					class232.method4433(class311.field3305); // L: 7967
					var1.serverPacket = null; // L: 7968
					return true; // L: 7969
				}

				if (ServerPacket.field3340 == var1.serverPacket) { // L: 7971
					class332.field3602 = var3.readUnsignedByte(); // L: 7972
					field587 = var3.readUnsignedByte(); // L: 7973
					ModelData0.field2905 = var3.method9298(); // L: 7974

					for (var20 = ModelData0.field2905; var20 < ModelData0.field2905 + 8; ++var20) { // L: 7975
						for (var5 = class332.field3602; var5 < class332.field3602 + 8; ++var5) { // L: 7976
							if (groundItems[field587][var20][var5] != null) { // L: 7977
								groundItems[field587][var20][var5] = null; // L: 7978
								class477.method8529(field587, var20, var5); // L: 7979
							}
						}
					}

					for (PendingSpawn var50 = (PendingSpawn)pendingSpawns.last(); var50 != null; var50 = (PendingSpawn)pendingSpawns.previous()) { // L: 7983 7984 7986
						if (var50.x >= ModelData0.field2905 && var50.x < ModelData0.field2905 + 8 && var50.y >= class332.field3602 && var50.y < class332.field3602 + 8 && var50.plane == field587) { // L: 7985
							var50.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 7988
					return true; // L: 7989
				}

				if (ServerPacket.field3413 == var1.serverPacket) { // L: 7991
					var20 = var3.readInt(); // L: 7992
					var5 = var3.method9462(); // L: 7993
					var6 = var3.method9462(); // L: 7994
					var24 = class243.field2620.method6281(var20); // L: 7995
					HorizontalAlignment.method3854(var24, var6, var5); // L: 7996
					WorldMapData_0.invalidateWidget(var24); // L: 7997
					var1.serverPacket = null; // L: 7998
					return true; // L: 7999
				}

				boolean var59;
				if (ServerPacket.field3441 == var1.serverPacket) { // L: 8001
					var20 = var3.method9317(); // L: 8002
					var59 = var3.readUnsignedByte() == 1; // L: 8003
					var21 = class243.field2620.method6281(var20); // L: 8004
					if (var59 != var21.isHidden) { // L: 8005
						var21.isHidden = var59; // L: 8006
						WorldMapData_0.invalidateWidget(var21); // L: 8007
					}

					var1.serverPacket = null; // L: 8009
					return true; // L: 8010
				}

				if (ServerPacket.field3420 == var1.serverPacket) { // L: 8012
					var20 = var3.readUShortSmart(); // L: 8013
					var59 = var3.readUnsignedByte() == 1; // L: 8014
					var73 = ""; // L: 8015
					boolean var55 = false; // L: 8016
					if (var59) { // L: 8017
						var73 = var3.readStringCp1252NullTerminated(); // L: 8018
						if (class334.friendSystem.isIgnored(new Username(var73, class127.loginType))) { // L: 8019
							var55 = true;
						}
					}

					String var8 = var3.readStringCp1252NullTerminated(); // L: 8021
					if (!var55) { // L: 8022
						SecureRandomCallable.addGameMessage(var20, var73, var8);
					}

					var1.serverPacket = null; // L: 8023
					return true; // L: 8024
				}

				if (ServerPacket.field3389 == var1.serverPacket) { // L: 8026
					var20 = var3.method9514(); // L: 8027
					var5 = var3.method9335(); // L: 8028
					var21 = class243.field2620.method6281(var20); // L: 8029
					Actor.method2413(var21, var5); // L: 8030
					WorldMapData_0.invalidateWidget(var21); // L: 8031
					var1.serverPacket = null; // L: 8032
					return true; // L: 8033
				}

				if (ServerPacket.field3410 == var1.serverPacket) { // L: 8035
					class232.method4433(class311.field3312); // L: 8036
					var1.serverPacket = null; // L: 8037
					return true; // L: 8038
				}

				if (ServerPacket.field3429 == var1.serverPacket) { // L: 8040
					var71 = var3.readUnsignedByte() == 1; // L: 8041
					var5 = var3.method9335(); // L: 8042
					var21 = class243.field2620.method6281(var5); // L: 8043
					ChatChannel.method2212(var21, class133.localPlayer.appearance, var71); // L: 8044
					WorldMapData_0.invalidateWidget(var21); // L: 8045
					var1.serverPacket = null; // L: 8046
					return true; // L: 8047
				}

				if (ServerPacket.field3347 == var1.serverPacket) { // L: 8049
					var20 = var3.method9462(); // L: 8050
					var5 = var3.method9380(); // L: 8051
					if (var5 == 65535) { // L: 8052
						var5 = -1; // L: 8053
					}

					class182.performPlayerAnimation(class133.localPlayer, var5, var20); // L: 8055
					var1.serverPacket = null; // L: 8056
					return true; // L: 8057
				}

				if (ServerPacket.field3416 == var1.serverPacket) { // L: 8059
					WorldMapArchiveLoader.method8706(var3.readStringCp1252NullTerminated()); // L: 8060
					var1.serverPacket = null; // L: 8061
					return true; // L: 8062
				}

				if (ServerPacket.field3407 == var1.serverPacket) { // L: 8064
					var20 = var3.readInt(); // L: 8065
					var5 = var3.readUnsignedShort(); // L: 8066
					if (var20 < -70000) { // L: 8067
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 8069
						var21 = class243.field2620.method6281(var20);
					} else {
						var21 = null; // L: 8070
					}

					for (; var3.offset < var1.serverPacketLength; SecureRandomCallable.itemContainerSetItem(var5, var7, var22 - 1, var9)) { // L: 8071 8085
						var7 = var3.readUShortSmart(); // L: 8072
						var22 = var3.readUnsignedShort(); // L: 8073
						var9 = 0; // L: 8074
						if (var22 != 0) { // L: 8075
							var9 = var3.readUnsignedByte(); // L: 8076
							if (var9 == 255) { // L: 8077
								var9 = var3.readInt();
							}
						}

						if (var21 != null && var7 >= 0 && var7 < var21.field3874.length) { // L: 8079 8080
							var21.field3874[var7] = var22; // L: 8081
							var21.field3875[var7] = var9; // L: 8082
						}
					}

					if (var21 != null) { // L: 8087
						WorldMapData_0.invalidateWidget(var21);
					}

					class170.method3431(); // L: 8088
					field572[++field710 - 1 & 31] = var5 & 32767; // L: 8089
					var1.serverPacket = null; // L: 8090
					return true; // L: 8091
				}

				if (ServerPacket.field3400 == var1.serverPacket) { // L: 8093
					var20 = var3.readUnsignedShort(); // L: 8094
					if (var20 == 65535) { // L: 8095
						var20 = -1;
					}

					rootInterface = var20; // L: 8096
					this.resizeRoot(false); // L: 8097
					ApproximateRouteStrategy.method1186(var20); // L: 8098
					class25.method338(rootInterface); // L: 8099

					for (var5 = 0; var5 < 100; ++var5) { // L: 8100
						field732[var5] = true;
					}

					var1.serverPacket = null; // L: 8101
					return true; // L: 8102
				}

				if (ServerPacket.field3361 == var1.serverPacket) { // L: 8104
					class149.loadRegions(true, var1.packetBuffer); // L: 8105
					var1.serverPacket = null; // L: 8106
					return true; // L: 8107
				}

				if (ServerPacket.field3371 == var1.serverPacket) { // L: 8109
					class232.method4433(class311.field3308); // L: 8110
					var1.serverPacket = null; // L: 8111
					return true; // L: 8112
				}

				if (ServerPacket.field3421 == var1.serverPacket) { // L: 8114
					PacketBufferNode.method5930(); // L: 8115
					var1.serverPacket = null; // L: 8116
					return false; // L: 8117
				}

				if (ServerPacket.field3422 == var1.serverPacket) { // L: 8119
					var20 = var3.method9380(); // L: 8120
					var5 = var3.readUnsignedShort(); // L: 8121
					var6 = var3.method9335(); // L: 8122
					var24 = class243.field2620.method6281(var6); // L: 8123
					var24.field3737 = var20 + (var5 << 16); // L: 8124
					var1.serverPacket = null; // L: 8125
					return true; // L: 8126
				}

				if (ServerPacket.field3355 == var1.serverPacket) { // L: 8128
					isCameraLocked = true; // L: 8129
					field626 = false; // L: 8130
					field774 = true; // L: 8131
					var20 = var3.readShort(); // L: 8132
					var5 = var3.readShort(); // L: 8133
					var6 = class328.method6193(var5 + UserComparator10.cameraPitch & 2027); // L: 8134
					var7 = var20 + class17.cameraYaw; // L: 8135
					var22 = var3.readUnsignedShort(); // L: 8136
					var9 = var3.readUnsignedByte(); // L: 8137
					field778 = new class498(UserComparator10.cameraPitch, var6, var22, var9); // L: 8138
					field777 = new class498(class17.cameraYaw, var7, var22, var9); // L: 8139
					var1.serverPacket = null; // L: 8140
					return true; // L: 8141
				}

				if (ServerPacket.field3359 == var1.serverPacket) { // L: 8143
					var20 = var3.method9307(); // L: 8144
					var5 = var3.method9317(); // L: 8145
					var21 = class243.field2620.method6281(var5); // L: 8146
					if (var20 != var21.sequenceId || var20 == -1) { // L: 8147
						var21.sequenceId = var20; // L: 8148
						var21.modelFrame = 0; // L: 8149
						var21.modelFrameCycle = 0; // L: 8150
						WorldMapData_0.invalidateWidget(var21); // L: 8151
					}

					var1.serverPacket = null; // L: 8153
					return true; // L: 8154
				}

				if (ServerPacket.field3380 == var1.serverPacket) { // L: 8156
					return this.method1394(var1, 2); // L: 8157
				}

				class180.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1446 != null ? var1.field1446.id : -1) + "," + (var1.field1447 != null ? var1.field1447.id : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 8159
				PacketBufferNode.method5930(); // L: 8160
			} catch (IOException var48) { // L: 8162
				class190.method3709(); // L: 8163
			} catch (Exception var49) {
				var25 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1446 != null ? var1.field1446.id : -1) + "," + (var1.field1447 != null ? var1.field1447.id : -1) + "," + var1.serverPacketLength + "," + (class133.localPlayer.pathX[0] + GrandExchangeOfferOwnWorldComparator.baseX * 64) + "," + (class133.localPlayer.pathY[0] + DevicePcmPlayerProvider.baseY * 64) + ","; // L: 8166

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 8167
					var25 = var25 + var3.array[var6] + ",";
				}

				class180.RunException_sendStackTrace(var25, var49); // L: 8168
				PacketBufferNode.method5930(); // L: 8169
			}

			return true; // L: 8171
		}
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-949677981"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false; // L: 9292

		int var2;
		int var5;
		while (!var1) { // L: 9293
			var1 = true; // L: 9294

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) { // L: 9295
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) { // L: 9296
					String var10 = menuTargets[var2]; // L: 9297
					menuTargets[var2] = menuTargets[var2 + 1]; // L: 9298
					menuTargets[var2 + 1] = var10; // L: 9299
					String var11 = menuActions[var2]; // L: 9300
					menuActions[var2] = menuActions[var2 + 1]; // L: 9301
					menuActions[var2 + 1] = var11; // L: 9302
					var5 = menuOpcodes[var2]; // L: 9303
					menuOpcodes[var2] = menuOpcodes[var2 + 1]; // L: 9304
					menuOpcodes[var2 + 1] = var5; // L: 9305
					var5 = menuArguments1[var2]; // L: 9306
					menuArguments1[var2] = menuArguments1[var2 + 1]; // L: 9307
					menuArguments1[var2 + 1] = var5; // L: 9308
					var5 = menuArguments2[var2]; // L: 9309
					menuArguments2[var2] = menuArguments2[var2 + 1]; // L: 9310
					menuArguments2[var2 + 1] = var5; // L: 9311
					var5 = menuIdentifiers[var2]; // L: 9312
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1]; // L: 9313
					menuIdentifiers[var2 + 1] = var5; // L: 9314
					var5 = field602[var2]; // L: 9315
					field602[var2] = field602[var2 + 1]; // L: 9316
					field602[var2 + 1] = var5; // L: 9317
					boolean var6 = menuShiftClick[var2]; // L: 9318
					menuShiftClick[var2] = menuShiftClick[var2 + 1]; // L: 9319
					menuShiftClick[var2 + 1] = var6; // L: 9320
					var1 = false; // L: 9321
				}
			}
		}

		if (clickedWidget == null) { // L: 9326
			int var12 = MouseHandler.MouseHandler_lastButton; // L: 9327
			if (isMenuOpen) { // L: 9328
				int var3;
				if (var12 != 1 && (class412.mouseCam || var12 != 4)) { // L: 9329
					var2 = MouseHandler.MouseHandler_x; // L: 9330
					var3 = MouseHandler.MouseHandler_y; // L: 9331
					if (var2 < class16.menuX - 10 || var2 > class16.menuX + HealthBarDefinition.menuWidth + 10 || var3 < LoginScreenAnimation.menuY - 10 || var3 > LoginScreenAnimation.menuY + class1.menuHeight + 10) { // L: 9332
						isMenuOpen = false; // L: 9333
						GrandExchangeOfferWorldComparator.method7116(class16.menuX, LoginScreenAnimation.menuY, HealthBarDefinition.menuWidth, class1.menuHeight); // L: 9334
					}
				}

				if (var12 == 1 || !class412.mouseCam && var12 == 4) { // L: 9337
					var2 = class16.menuX; // L: 9338
					var3 = LoginScreenAnimation.menuY; // L: 9339
					int var4 = HealthBarDefinition.menuWidth; // L: 9340
					var5 = MouseHandler.MouseHandler_lastPressedX; // L: 9341
					int var13 = MouseHandler.MouseHandler_lastPressedY; // L: 9342
					int var7 = -1; // L: 9343

					for (int var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 9344
						int var9 = (menuOptionsCount - 1 - var8) * 15 + var3 + 31; // L: 9345
						if (var5 > var2 && var5 < var4 + var2 && var13 > var9 - 13 && var13 < var9 + 3) { // L: 9346
							var7 = var8;
						}
					}

					if (var7 != -1) { // L: 9348
						class203.method3843(var7);
					}

					isMenuOpen = false; // L: 9349
					GrandExchangeOfferWorldComparator.method7116(class16.menuX, LoginScreenAnimation.menuY, HealthBarDefinition.menuWidth, class1.menuHeight); // L: 9350
				}
			} else {
				var2 = menuOptionsCount - 1; // L: 9356
				if ((var12 == 1 || !class412.mouseCam && var12 == 4) && this.shouldLeftClickOpenMenu()) { // L: 9359 9360
					var12 = 2; // L: 9361
				}

				if ((var12 == 1 || !class412.mouseCam && var12 == 4) && menuOptionsCount > 0) { // L: 9364
					class203.method3843(var2); // L: 9365
				}

				if (var12 == 2 && menuOptionsCount > 0) { // L: 9367
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	} // L: 9369

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1549526241"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1; // L: 9374
		boolean var3 = field809 && menuOptionsCount > 2; // L: 9377
		if (!var3) { // L: 9378
			boolean var4;
			if (var1 < 0) { // L: 9381
				var4 = false; // L: 9382
			} else {
				int var5 = menuOpcodes[var1]; // L: 9385
				if (var5 >= 2000) { // L: 9386
					var5 -= 2000;
				}

				if (var5 == 1007) { // L: 9387
					var4 = true; // L: 9388
				} else {
					var4 = false; // L: 9391
				}
			}

			var3 = var4; // L: 9393
		}

		return var3 && !menuShiftClick[var1]; // L: 9395
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "511559743"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		int var3 = DevicePcmPlayerProvider.fontBold12.stringWidth("Choose Option"); // L: 9400

		int var4;
		int var5;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) { // L: 9401
			var5 = DevicePcmPlayerProvider.fontBold12.stringWidth(class225.method4275(var4)); // L: 9402
			if (var5 > var3) { // L: 9403
				var3 = var5;
			}
		}

		var3 += 8; // L: 9405
		var4 = menuOptionsCount * 15 + 22; // L: 9406
		var5 = var1 - var3 / 2; // L: 9407
		if (var5 + var3 > class148.canvasWidth) { // L: 9408
			var5 = class148.canvasWidth - var3;
		}

		if (var5 < 0) { // L: 9409
			var5 = 0;
		}

		int var6 = var2; // L: 9410
		if (var4 + var2 > class342.canvasHeight) { // L: 9411
			var6 = class342.canvasHeight - var4;
		}

		if (var6 < 0) { // L: 9412
			var6 = 0;
		}

		class16.menuX = var5; // L: 9413
		LoginScreenAnimation.menuY = var6; // L: 9414
		HealthBarDefinition.menuWidth = var3; // L: 9415
		class1.menuHeight = menuOptionsCount * 15 + 22; // L: 9416
		var1 -= viewportOffsetX; // L: 9418
		var2 -= viewportOffsetY; // L: 9419
		LoginType.scene.menuOpen(class172.Client_plane, var1, var2, false); // L: 9420
		isMenuOpen = true; // L: 9421
	} // L: 9422

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "19136824"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		class93.method2383(rootInterface, class148.canvasWidth, class342.canvasHeight, var1); // L: 11168
	} // L: 11169

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)V",
		garbageValue = "4"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class243.field2620.method6281(var1.parentId); // L: 11172
		int var3;
		int var4;
		if (var2 == null) { // L: 11175
			var3 = class148.canvasWidth; // L: 11176
			var4 = class342.canvasHeight; // L: 11177
		} else {
			var3 = var2.width; // L: 11180
			var4 = var2.height; // L: 11181
		}

		class94.alignWidgetSize(var1, var3, var4, false); // L: 11183
		WorldMapData_0.alignWidgetPosition(var1, var3, var4); // L: 11184
	} // L: 11185

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1541524736"
	)
	final void method1237() {
		WorldMapData_0.invalidateWidget(clickedWidget); // L: 12125
		++class179.widgetDragDuration; // L: 12126
		int var1;
		int var2;
		if (field702 && field699) { // L: 12127
			var1 = MouseHandler.MouseHandler_x; // L: 12146
			var2 = MouseHandler.MouseHandler_y; // L: 12147
			var1 -= widgetClickX; // L: 12148
			var2 -= widgetClickY; // L: 12149
			if (var1 < field700) { // L: 12150
				var1 = field700;
			}

			if (var1 + clickedWidget.width > field700 + clickedWidgetParent.width) { // L: 12151
				var1 = field700 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field701) { // L: 12152
				var2 = field701;
			}

			if (var2 + clickedWidget.height > field701 + clickedWidgetParent.height) { // L: 12153
				var2 = field701 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field570; // L: 12154
			int var4 = var2 - field704; // L: 12155
			int var5 = clickedWidget.dragZoneSize; // L: 12156
			if (class179.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 12157 12158
				isDraggingWidget = true; // L: 12159
			}

			int var6 = var1 - field700 + clickedWidgetParent.scrollX; // L: 12162
			int var7 = var2 - field701 + clickedWidgetParent.scrollY; // L: 12163
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 12164
				var8 = new ScriptEvent(); // L: 12165
				var8.widget = clickedWidget; // L: 12166
				var8.mouseX = var6; // L: 12167
				var8.mouseY = var7; // L: 12168
				var8.args = clickedWidget.onDrag; // L: 12169
				AbstractWorldMapData.runScriptEvent(var8); // L: 12170
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 12172
				if (isDraggingWidget) { // L: 12173
					if (clickedWidget.onDragComplete != null) { // L: 12174
						var8 = new ScriptEvent(); // L: 12175
						var8.widget = clickedWidget; // L: 12176
						var8.mouseX = var6; // L: 12177
						var8.mouseY = var7; // L: 12178
						var8.dragTarget = draggedOnWidget; // L: 12179
						var8.args = clickedWidget.onDragComplete; // L: 12180
						AbstractWorldMapData.runScriptEvent(var8); // L: 12181
					}

					if (draggedOnWidget != null) { // L: 12183
						Widget var9 = clickedWidget; // L: 12185
						int var10 = class206.method3858(class33.getWidgetFlags(var9)); // L: 12187
						Widget var14;
						if (var10 == 0) { // L: 12188
							var14 = null; // L: 12189
						} else {
							int var11 = 0;

							while (true) {
								if (var11 >= var10) {
									var14 = var9; // L: 12199
									break;
								}

								var9 = class243.field2620.method6281(var9.parentId); // L: 12193
								if (var9 == null) { // L: 12194
									var14 = null; // L: 12195
									break; // L: 12196
								}

								++var11; // L: 12192
							}
						}

						if (var14 != null) { // L: 12201
							PacketBufferNode var12 = class425.getPacketBufferNode(ClientPacket.field3271, packetWriter.isaacCipher); // L: 12203
							var12.packetBuffer.writeShort(clickedWidget.childIndex); // L: 12204
							var12.packetBuffer.method9304(draggedOnWidget.childIndex); // L: 12205
							var12.packetBuffer.method9407(clickedWidget.id); // L: 12206
							var12.packetBuffer.method9407(draggedOnWidget.id); // L: 12207
							var12.packetBuffer.method9398(clickedWidget.itemId); // L: 12208
							var12.packetBuffer.method9246(draggedOnWidget.itemId); // L: 12209
							packetWriter.addNode(var12); // L: 12210
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 12215
					this.openMenu(field570 + widgetClickX, widgetClickY + field704); // L: 12216
				} else if (menuOptionsCount > 0) { // L: 12218
					class344.method6318(field570 + widgetClickX, field704 + widgetClickY); // L: 12219
				}

				clickedWidget = null; // L: 12222
			}

		} else {
			if (class179.widgetDragDuration > 1) { // L: 12128
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 12129
					var1 = widgetClickX + field570; // L: 12130
					var2 = widgetClickY + field704; // L: 12131
					MenuAction var13 = Message.tempMenuAction; // L: 12133
					if (var13 != null) { // L: 12135
						CollisionMap.method4359(var13.param0, var13.param1, var13.opcode, var13.identifier, var13.field916, var13.field913, var13.field918, var1, var2); // L: 12136
					}

					Message.tempMenuAction = null; // L: 12139
				}

				clickedWidget = null; // L: 12142
			}

		}
	} // L: 12144 12224

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(I)Lvx;",
		garbageValue = "617300231"
	)
	@Export("username")
	public Username username() {
		return class133.localPlayer != null ? class133.localPlayer.username : null; // L: 12898
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-102"
	)
	void method1239(int var1) {
		PacketBufferNode var2 = class425.getPacketBufferNode(ClientPacket.field3205, packetWriter.isaacCipher); // L: 13027
		var2.packetBuffer.writeByte(var1); // L: 13028
		packetWriter.addNode(var2); // L: 13029
	} // L: 13030

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1774536406"
	)
	void method1240(int var1) {
		PacketBufferNode var2 = class425.getPacketBufferNode(ClientPacket.field3274, packetWriter.isaacCipher); // L: 13033
		var2.packetBuffer.writeByte(var1); // L: 13034
		packetWriter.addNode(var2); // L: 13035
	} // L: 13036

	@Export("kill0")
	@ObfuscatedName("init")
	public final void kill0() {
		// $FF: Couldn't be decompiled
	}

	public void setClient(int var1) {
		this.field517 = var1; // L: 904
	} // L: 905

	public long getAccountHash() {
		return this.accountHash; // L: 934
	}

	protected void finalize() throws Throwable {
		class321.field3499.remove(this); // L: 881
		super.finalize(); // L: 883
	} // L: 884

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 920
			this.field524 = var1; // L: 923
		}
	} // L: 921 924

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 910
			this.field806 = var1; // L: 913
			class210.method3930(10); // L: 914
		}
	} // L: 911 915

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 929
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "732674071"
	)
	static final void method1791(String var0) {
		class6.method40("Please remove " + var0 + " from your ignore list first"); // L: 130
	} // L: 131

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(IIIILvg;Lmu;I)V",
		garbageValue = "-1174769079"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 12696
		if (var6 > 4225 && var6 < 90000) { // L: 12697
			int var7 = camAngleY & 2047; // L: 12698
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 12699
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 12700
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12701
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12702
			double var12 = Math.atan2((double)var10, (double)var11); // L: 12703
			int var14 = var5.width / 2 - 25; // L: 12704
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 12705
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 12706
			byte var17 = 20; // L: 12707
			class315.redHintArrowSprite.method9733(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 12708
		} else {
			class277.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 12710
		}

	} // L: 12711

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1492428952"
	)
	static final void method1565(int var0, int var1, boolean var2) {
		if (currentClanChannels[var0] != null) { // L: 12790
			if (var1 >= 0 && var1 < currentClanChannels[var0].method3394()) { // L: 12791
				ClanChannelMember var3 = (ClanChannelMember)currentClanChannels[var0].members.get(var1); // L: 12792
				PacketBufferNode var4 = class425.getPacketBufferNode(ClientPacket.field3288, packetWriter.isaacCipher); // L: 12793
				var4.packetBuffer.writeByte(4 + SequenceDefinition.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 12794
				var4.packetBuffer.writeByte(var0); // L: 12795
				var4.packetBuffer.writeShort(var1); // L: 12796
				var4.packetBuffer.writeBoolean(var2); // L: 12797
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 12798
				packetWriter.addNode(var4); // L: 12799
			}
		}
	} // L: 12800
}
