import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
public final class Client extends GameEngine implements Usernamed, OAuthApi, class312 {
	@ObfuscatedName("vq")
	@ObfuscatedGetter(
		intValue = 47452049
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vu")
	@ObfuscatedGetter(
		intValue = 868756145
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("wj")
	@ObfuscatedGetter(
		intValue = 1865655403
	)
	public static int field792;
	@ObfuscatedName("xm")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	static final ApproximateRouteStrategy field815;
	@ObfuscatedName("xk")
	static int[] field795;
	@ObfuscatedName("xz")
	static int[] field737;
	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("vz")
	@ObfuscatedGetter(
		intValue = -1671944719
	)
	static int field720;
	@ObfuscatedName("wl")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("vt")
	@ObfuscatedGetter(
		intValue = -1401999309
	)
	static int field802;
	@ObfuscatedName("wv")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("archive5")
	static class424 archive5;
	@ObfuscatedName("wz")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("vf")
	static boolean[] field618;
	@ObfuscatedName("wb")
	@ObfuscatedGetter(
		intValue = -1226376575
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("vy")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	static class476 field803;
	@ObfuscatedName("vm")
	static short field787;
	@ObfuscatedName("vv")
	static short field777;
	@ObfuscatedName("vk")
	static short field759;
	@ObfuscatedName("vr")
	static short field794;
	@ObfuscatedName("va")
	static short field592;
	@ObfuscatedName("vg")
	@ObfuscatedGetter(
		intValue = 1857793079
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vb")
	static short field791;
	@ObfuscatedName("vw")
	@ObfuscatedGetter(
		intValue = 847600333
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("wy")
	@ObfuscatedGetter(
		intValue = -1411646229
	)
	static int field814;
	@ObfuscatedName("vh")
	@ObfuscatedGetter(
		intValue = -687459409
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vl")
	static int[] field784;
	@ObfuscatedName("vc")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vo")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("vn")
	static int[] field783;
	@ObfuscatedName("vs")
	static int[] field785;
	@ObfuscatedName("vj")
	static int[] field771;
	@ObfuscatedName("wu")
	@ObfuscatedSignature(
		descriptor = "[Loc;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wh")
	static List field654;
	@ObfuscatedName("ws")
	@ObfuscatedGetter(
		intValue = -836129535
	)
	static int field619;
	@ObfuscatedName("bg")
	static boolean field631;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -2119372723
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 158752487
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1783227915
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cj")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cn")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1615345771
	)
	static int field521;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -499824195
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1342177981
	)
	static int field657;
	@ObfuscatedName("cu")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -991874195
	)
	public static int field525;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1417535651
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dg")
	static boolean field527;
	@ObfuscatedName("et")
	static boolean field682;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 1238765663
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		longValue = -1980140754930076583L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 640777775
	)
	static int field743;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = -1271286263
	)
	static int field532;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		longValue = 604056039982651979L
	)
	static long field533;
	@ObfuscatedName("eb")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 896449927
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 312102811
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = 347271717
	)
	static int field696;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = -1673903927
	)
	static int field538;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = -712016263
	)
	static int field539;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = -1813183945
	)
	static int field607;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = -1842357918
	)
	static int field541;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = 254718739
	)
	static int field542;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = 132594496
	)
	static int field543;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ef")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static class92 field547;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -2110612925
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = 248022457
	)
	static int field549;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 1717377099
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = 616343285
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -843456021
	)
	static int field552;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = 765842399
	)
	static int field796;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 759402093
	)
	static int field554;
	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static class139 field555;
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	static class518 field556;
	@ObfuscatedName("hx")
	static final String field566;
	@ObfuscatedName("hq")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("ig")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "[Ldh;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = 300173975
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ir")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = -714277577
	)
	static int field801;
	@ObfuscatedName("iq")
	static int[] field587;
	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = -809919791
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ic")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("if")
	static HashMap field582;
	@ObfuscatedName("it")
	static String field557;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = 1278223397
	)
	static int field730;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -839774411
	)
	static int field584;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = -598151613
	)
	static int field679;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = 162637255
	)
	static int field586;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = 1128441289
	)
	static int field537;
	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "[Lij;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("jz")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jj")
	static int[][][] field590;
	@ObfuscatedName("jg")
	static final int[] field591;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = -1194079031
	)
	static int field702;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = -1227054453
	)
	static int field593;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = 2010514991
	)
	static int field594;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = 857433743
	)
	static int field595;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 1907854713
	)
	static int field772;
	@ObfuscatedName("ky")
	static boolean field816;
	@ObfuscatedName("kv")
	@ObfuscatedGetter(
		intValue = 1735736549
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = -1244201607
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = -1601768337
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = 437288283
	)
	static int field774;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = 204992847
	)
	static int field602;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = 1652689909
	)
	static int field603;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 1752284847
	)
	static int field817;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 2077927661
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = -1541112681
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = -1706009913
	)
	static int field583;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = 381616147
	)
	static int field608;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = 1120345741
	)
	static int field609;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 1667775323
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -427705151
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = 463380451
	)
	public static int field624;
	@ObfuscatedName("lt")
	static boolean field613;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = 2002218613
	)
	static int field614;
	@ObfuscatedName("lf")
	static boolean field707;
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = -1799504205
	)
	static int field616;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 917474073
	)
	static int field531;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = 1233279609
	)
	static int field615;
	@ObfuscatedName("lc")
	static int[] field751;
	@ObfuscatedName("lb")
	static int[] field646;
	@ObfuscatedName("lg")
	static int[] field621;
	@ObfuscatedName("ll")
	static int[] field722;
	@ObfuscatedName("lm")
	static int[] field623;
	@ObfuscatedName("mn")
	static int[] field683;
	@ObfuscatedName("mf")
	static int[][] field638;
	@ObfuscatedName("mm")
	static int[] field579;
	@ObfuscatedName("mp")
	static String[] field627;
	@ObfuscatedName("mw")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = 834803823
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = -200797859
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = 917486313
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = 1250951581
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = 647703879
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = 1981733727
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 1218159829
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("mv")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = -2098245115
	)
	static int field637;
	@ObfuscatedName("mc")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "[Ldf;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -1017365099
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = 997423737
	)
	static int field641;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		longValue = 4451498081408470985L
	)
	static long field642;
	@ObfuscatedName("ml")
	static boolean field766;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = -987204071
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = -907081017
	)
	static int field645;
	@ObfuscatedName("nh")
	static int[] field601;
	@ObfuscatedName("na")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ns")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("nc")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("ni")
	static int[] field704;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = 2138013585
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "[[[Lod;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("nr")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nw")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nn")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nl")
	static boolean field659;
	@ObfuscatedName("ny")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = -537932205
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("ou")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("ow")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("ok")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("ol")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("oc")
	static int[] field666;
	@ObfuscatedName("ov")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("oq")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("oe")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("os")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ot")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("ox")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = 54684725
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = -636826009
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = -2038600311
	)
	static int field675;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = 1562297711
	)
	static int field676;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = 1575582685
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("oy")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = 1130173745
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = -365573201
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("pl")
	static String field636;
	@ObfuscatedName("pa")
	static String field734;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = 1534184267
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = 293764065
	)
	static int field617;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = 689715031
	)
	static int field687;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 1236800007
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = 393003301
	)
	static int field690;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = -1955172741
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = -2002469019
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 482282341
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pb")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = 2089718555
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = -1739795111
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("pv")
	static boolean field761;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = -1063021957
	)
	static int field648;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = 29449565
	)
	static int field703;
	@ObfuscatedName("qx")
	static boolean field809;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = -1603358381
	)
	static int field705;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = 1790853701
	)
	static int field706;
	@ObfuscatedName("qc")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = 1286236293
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qv")
	static int[] field709;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = 585742461
	)
	static int field710;
	@ObfuscatedName("qk")
	static int[] field807;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = -677272579
	)
	static int field686;
	@ObfuscatedName("qt")
	static int[] field713;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = -637428081
	)
	static int field711;
	@ObfuscatedName("qe")
	static int[] field715;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = -1379550179
	)
	static int field793;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = 1427942765
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = 1636769603
	)
	static int field763;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = 1788096061
	)
	static int field719;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = 83672307
	)
	static int field553;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = -1330146549
	)
	static int field622;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = -1854935939
	)
	static int field721;
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = 1153122609
	)
	static int field723;
	@ObfuscatedName("rh")
	@ObfuscatedGetter(
		intValue = -1871498489
	)
	static int field724;
	@ObfuscatedName("ra")
	@ObfuscatedGetter(
		intValue = 472886801
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	static class531 field726;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("rm")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	static NodeDeque field728;
	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	static NodeDeque field729;
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	static NodeDeque field810;
	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = 1703169969
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("rl")
	@ObfuscatedGetter(
		intValue = -258246903
	)
	static int field528;
	@ObfuscatedName("rc")
	static boolean[] field718;
	@ObfuscatedName("ro")
	static boolean[] field735;
	@ObfuscatedName("rw")
	static boolean[] field736;
	@ObfuscatedName("rs")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("rq")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("re")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("rx")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = -1389452585
	)
	static int field672;
	@ObfuscatedName("rd")
	@ObfuscatedGetter(
		longValue = 5728657505068008691L
	)
	static long field742;
	@ObfuscatedName("rz")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("su")
	static int[] field744;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = 1265363081
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sc")
	@ObfuscatedGetter(
		intValue = -1913638653
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sd")
	static String field747;
	@ObfuscatedName("sl")
	static long[] field748;
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = -1532136743
	)
	static int field640;
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	static class213 field750;
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static class211 field612;
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = -765429031
	)
	static int field752;
	@ObfuscatedName("sf")
	static int[] field753;
	@ObfuscatedName("sw")
	static int[] field754;
	@ObfuscatedName("sa")
	@ObfuscatedGetter(
		longValue = 2460032034323984283L
	)
	static long field650;
	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "[Lfx;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("ta")
	@ObfuscatedSignature(
		descriptor = "[Lgh;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("ts")
	@ObfuscatedGetter(
		intValue = 128103147
	)
	static int field758;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = 1590700353
	)
	static int field620;
	@ObfuscatedName("tp")
	static int[] field760;
	@ObfuscatedName("td")
	static int[] field576;
	@ObfuscatedName("te")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	static SpritePixels[] field762;
	@ObfuscatedName("tv")
	@ObfuscatedGetter(
		intValue = 805422353
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = -1408328319
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		intValue = -1469304083
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("th")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = -620552217
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("tj")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("tl")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("tf")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("tz")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "[Lbc;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("uh")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("uu")
	@ObfuscatedGetter(
		intValue = 2061927751
	)
	static int field755;
	@ObfuscatedName("uv")
	static boolean field775;
	@ObfuscatedName("uz")
	static boolean field797;
	@ObfuscatedName("uy")
	static boolean field782;
	@ObfuscatedName("ub")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static class480 field778;
	@ObfuscatedName("ui")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	static class479 field779;
	@ObfuscatedName("up")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	static class479 field643;
	@ObfuscatedName("uo")
	static boolean field781;
	@ObfuscatedName("gu")
	String field697;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	class14 field558;
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	class18 field634;
	@ObfuscatedName("hv")
	OtlTokenRequester field560;
	@ObfuscatedName("hp")
	Future field561;
	@ObfuscatedName("hh")
	boolean field562;
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	class18 field563;
	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field564;
	@ObfuscatedName("he")
	Future field565;
	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	Buffer field569;
	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	class7 field570;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		longValue = 4165547584203049963L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field631 = true; // L: 163
		worldId = 1; // L: 164
		worldProperties = 0; // L: 165
		gameBuild = 0; // L: 167
		isMembersWorld = false; // L: 170
		isLowDetail = false; // L: 171
		field521 = -1; // L: 176
		clientType = -1; // L: 177
		field657 = -1; // L: 178
		onMobile = false; // L: 179
		field525 = 215; // L: 180
		gameState = 0; // L: 192
		field527 = false; // L: 193
		field682 = true; // L: 217
		cycle = 0; // L: 218
		mouseLastLastPressedTimeMillis = 1L; // L: 219
		field743 = -1; // L: 221
		field532 = -1; // L: 222
		field533 = -1L; // L: 223
		hadFocus = true; // L: 224
		rebootTimer = 0; // L: 225
		hintArrowType = 0; // L: 226
		field696 = 0; // L: 227
		field538 = 0; // L: 228
		field539 = 0; // L: 229
		field607 = 0; // L: 230
		field541 = 0; // L: 231
		field542 = 0; // L: 232
		field543 = 0; // L: 233
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 235
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 236
		renderSelf = false; // L: 237
		field547 = class92.field1144; // L: 246
		js5ConnectState = 0; // L: 249
		field549 = 0; // L: 250
		js5Errors = 0; // L: 273
		loginState = 0; // L: 275
		field552 = 0; // L: 276
		field796 = 0; // L: 277
		field554 = 0; // L: 278
		field555 = class139.field1629; // L: 279
		field556 = class518.field5129; // L: 280
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

		field566 = class345.method6646(var2); // L: 316
		Login_isUsernameRemembered = false; // L: 331
		secureRandomFuture = new SecureRandomFuture(); // L: 332
		randomDatData = null; // L: 338
		npcs = new NPC[65536]; // L: 342
		npcCount = 0; // L: 343
		npcIndices = new int[65536]; // L: 344
		field801 = 0; // L: 345
		field587 = new int[250]; // L: 346
		packetWriter = new PacketWriter(); // L: 349
		logoutTimer = 0; // L: 351
		hadNetworkError = false; // L: 352
		timer = new Timer(); // L: 353
		field582 = new HashMap(); // L: 359
		field730 = 0; // L: 366
		field584 = 1; // L: 367
		field679 = 0; // L: 368
		field586 = 1; // L: 369
		field537 = 0; // L: 370
		collisionMaps = new CollisionMap[4]; // L: 378
		isInInstance = false; // L: 379
		field590 = new int[4][13][13]; // L: 380
		field591 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 381
		field702 = 0; // L: 384
		field593 = 2301979; // L: 396
		field594 = 5063219; // L: 397
		field595 = 3353893; // L: 398
		field772 = 7759444; // L: 399
		field816 = false; // L: 400
		alternativeScrollbarWidth = 0; // L: 401
		camAngleX = 128; // L: 409
		camAngleY = 0; // L: 410
		field774 = 0; // L: 411
		field602 = 0; // L: 412
		field603 = 0; // L: 413
		field817 = 0; // L: 414
		oculusOrbState = 0; // L: 415
		camFollowHeight = 50; // L: 416
		field583 = 0; // L: 420
		field608 = 0; // L: 421
		field609 = 0; // L: 422
		oculusOrbNormalSpeed = 12; // L: 424
		oculusOrbSlowedSpeed = 6; // L: 425
		field624 = 0; // L: 426
		field613 = false; // L: 427
		field614 = 0; // L: 428
		field707 = false; // L: 429
		field616 = 0; // L: 430
		field531 = 0; // L: 431
		field615 = 50; // L: 432
		field751 = new int[field615]; // L: 433
		field646 = new int[field615]; // L: 434
		field621 = new int[field615]; // L: 435
		field722 = new int[field615]; // L: 436
		field623 = new int[field615]; // L: 437
		field683 = new int[field615]; // L: 438
		field638 = new int[field615][]; // L: 439
		field579 = new int[field615]; // L: 440
		field627 = new String[field615]; // L: 441
		tileLastDrawnActor = new int[104][104]; // L: 442
		viewportDrawCount = 0; // L: 443
		viewportTempX = -1; // L: 444
		viewportTempY = -1; // L: 445
		mouseCrossX = 0; // L: 446
		mouseCrossY = 0; // L: 447
		mouseCrossState = 0; // L: 448
		mouseCrossColor = 0; // L: 449
		showMouseCross = true; // L: 450
		field637 = 0; // L: 451
		showLoadingMessages = true; // L: 453
		players = new Player[2048]; // L: 455
		localPlayerIndex = -1; // L: 457
		field641 = 0; // L: 458
		field642 = -1L; // L: 459
		field766 = true; // L: 461
		drawPlayerNames = 0; // L: 466
		field645 = 0; // L: 467
		field601 = new int[1000]; // L: 468
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 470
		playerMenuActions = new String[8]; // L: 471
		playerOptionsPriorities = new boolean[8]; // L: 472
		field704 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 473
		combatTargetPlayerIndex = -1; // L: 474
		groundItems = new NodeDeque[4][104][104]; // L: 475
		pendingSpawns = new NodeDeque(); // L: 476
		projectiles = new NodeDeque(); // L: 477
		graphicsObjects = new NodeDeque(); // L: 478
		currentLevels = new int[25]; // L: 479
		levels = new int[25]; // L: 480
		experience = new int[25]; // L: 481
		field659 = false; // L: 482
		isMenuOpen = false; // L: 483
		menuOptionsCount = 0; // L: 489
		menuArguments1 = new int[500]; // L: 490
		menuArguments2 = new int[500]; // L: 491
		menuOpcodes = new int[500]; // L: 492
		menuIdentifiers = new int[500]; // L: 493
		field666 = new int[500]; // L: 494
		menuActions = new String[500]; // L: 495
		menuTargets = new String[500]; // L: 496
		menuShiftClick = new boolean[500]; // L: 497
		followerOpsLowPriority = false; // L: 498
		tapToDrop = false; // L: 500
		showMouseOverText = true; // L: 501
		viewportX = -1; // L: 502
		viewportY = -1; // L: 503
		field675 = 0; // L: 507
		field676 = 50; // L: 508
		isItemSelected = 0; // L: 509
		field557 = null; // L: 513
		isSpellSelected = false; // L: 514
		selectedSpellChildIndex = -1; // L: 516
		selectedSpellItemId = -1; // L: 517
		field636 = null; // L: 519
		field734 = null; // L: 520
		rootInterface = -1; // L: 521
		interfaceParents = new NodeHashTable(8); // L: 522
		field617 = 0; // L: 527
		field687 = -1; // L: 528
		chatEffects = 0; // L: 529
		meslayerContinueWidget = null; // L: 530
		field690 = 0; // L: 531
		weight = 0; // L: 532
		staffModLevel = 0; // L: 533
		followerIndex = -1; // L: 534
		playerMod = false; // L: 535
		viewportWidget = null; // L: 536
		clickedWidget = null; // L: 537
		clickedWidgetParent = null; // L: 538
		widgetClickX = 0; // L: 539
		widgetClickY = 0; // L: 540
		draggedOnWidget = null; // L: 541
		field761 = false; // L: 542
		field648 = -1; // L: 543
		field703 = -1; // L: 544
		field809 = false; // L: 545
		field705 = -1; // L: 546
		field706 = -1; // L: 547
		isDraggingWidget = false; // L: 548
		cycleCntr = 1; // L: 553
		field709 = new int[32]; // L: 556
		field710 = 0; // L: 557
		field807 = new int[32]; // L: 558
		field686 = 0; // L: 559
		field713 = new int[32]; // L: 560
		field711 = 0; // L: 561
		field715 = new int[32]; // L: 562
		field793 = 0; // L: 563
		chatCycle = 0; // L: 564
		field763 = 0; // L: 565
		field719 = 0; // L: 566
		field553 = 0; // L: 567
		field622 = 0; // L: 568
		field721 = 0; // L: 569
		field723 = 0; // L: 570
		field724 = 0; // L: 571
		mouseWheelRotation = 0; // L: 577
		field726 = new class531(); // L: 578
		scriptEvents = new NodeDeque(); // L: 579
		field728 = new NodeDeque(); // L: 580
		field729 = new NodeDeque(); // L: 581
		field810 = new NodeDeque(); // L: 582
		widgetFlags = new NodeHashTable(512); // L: 583
		rootWidgetCount = 0; // L: 585
		field528 = -2; // L: 586
		field718 = new boolean[100]; // L: 587
		field735 = new boolean[100]; // L: 588
		field736 = new boolean[100]; // L: 589
		rootWidgetXs = new int[100]; // L: 590
		rootWidgetYs = new int[100]; // L: 591
		rootWidgetWidths = new int[100]; // L: 592
		rootWidgetHeights = new int[100]; // L: 593
		field672 = 0; // L: 594
		field742 = 0L; // L: 595
		isResizable = true; // L: 596
		field744 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 603
		publicChatMode = 0; // L: 604
		tradeChatMode = 0; // L: 606
		field747 = ""; // L: 607
		field748 = new long[100]; // L: 609
		field640 = 0; // L: 610
		field750 = new class213(); // L: 611
		field612 = new class211(); // L: 612
		field752 = 0; // L: 614
		field753 = new int[128]; // L: 615
		field754 = new int[128]; // L: 616
		field650 = -1L; // L: 617
		currentClanSettings = new ClanSettings[4]; // L: 621
		currentClanChannels = new ClanChannel[4]; // L: 623
		field758 = -1; // L: 625
		field620 = 0; // L: 626
		field760 = new int[1000]; // L: 627
		field576 = new int[1000]; // L: 628
		field762 = new SpritePixels[1000]; // L: 629
		destinationX = 0; // L: 630
		destinationY = 0; // L: 631
		minimapState = 0; // L: 638
		playingJingle = false; // L: 639
		soundEffectCount = 0; // L: 644
		soundEffectIds = new int[50]; // L: 645
		queuedSoundEffectLoops = new int[50]; // L: 646
		queuedSoundEffectDelays = new int[50]; // L: 647
		soundLocations = new int[50]; // L: 648
		soundEffects = new SoundEffect[50]; // L: 649
		isCameraLocked = false; // L: 651
		field775 = false; // L: 657
		field797 = false; // L: 658
		field782 = false; // L: 659
		field778 = null; // L: 665
		field779 = null; // L: 666
		field643 = null; // L: 667
		field781 = false; // L: 668
		field618 = new boolean[5]; // L: 676
		field783 = new int[5]; // L: 677
		field784 = new int[5]; // L: 678
		field785 = new int[5]; // L: 679
		field771 = new int[5]; // L: 680
		field787 = 256; // L: 681
		field777 = 205; // L: 682
		zoomHeight = 256; // L: 683
		zoomWidth = 320; // L: 684
		field791 = 1; // L: 685
		field592 = 32767; // L: 686
		field759 = 1; // L: 687
		field794 = 32767; // L: 688
		viewportOffsetX = 0; // L: 689
		viewportOffsetY = 0; // L: 690
		viewportWidth = 0; // L: 691
		viewportHeight = 0; // L: 692
		viewportZoom = 0; // L: 693
		playerAppearance = new PlayerComposition(); // L: 695
		field720 = -1; // L: 696
		field802 = -1; // L: 697
		field803 = new DesktopPlatformInfoProvider(); // L: 699
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 701
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 704
		archive5 = new class424(8, class422.field4609); // L: 706
		Widget_cachedModels = new EvictingDualNodeHashTable(64); // L: 708
		Widget_cachedFonts = new EvictingDualNodeHashTable(64); // L: 709
		field619 = -1; // L: 712
		field792 = -1; // L: 718
		field654 = new ArrayList(); // L: 719
		archiveLoaders = new ArrayList(10); // L: 720
		archiveLoadersDone = 0; // L: 721
		field814 = 0; // L: 722
		field815 = new ApproximateRouteStrategy(); // L: 731
		field795 = new int[50]; // L: 732
		field737 = new int[50]; // L: 733
	}

	public Client() {
		this.field562 = false; // L: 298
		this.accountHash = -1L;
	} // L: 337

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field742 = class113.method2835() + 500L; // L: 4587
		this.resizeJS(); // L: 4588
		if (rootInterface != -1) { // L: 4589
			this.resizeRoot(true);
		}

	} // L: 4590

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "72"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000}; // L: 1029
		int[] var2 = new int[]{1000, 100, 500}; // L: 1030
		if (var1 != null && var2 != null) { // L: 1032
			ByteArrayPool.ByteArrayPool_alternativeSizes = var1; // L: 1045
			class125.ByteArrayPool_altSizeArrayCounts = new int[var1.length]; // L: 1046
			class152.ByteArrayPool_arrays = new byte[var1.length][][]; // L: 1047

			for (int var3 = 0; var3 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var3) { // L: 1048
				class152.ByteArrayPool_arrays[var3] = new byte[var2[var3]][]; // L: 1049
				ByteArrayPool.field4557.add(var1[var3]); // L: 1050
			}

			Collections.sort(ByteArrayPool.field4557); // L: 1052
		} else {
			ByteArrayPool.ByteArrayPool_alternativeSizes = null; // L: 1033
			class125.ByteArrayPool_altSizeArrayCounts = null; // L: 1034
			class152.ByteArrayPool_arrays = null; // L: 1035
			ByteArrayPool.field4557.clear(); // L: 1037
			ByteArrayPool.field4557.add(100); // L: 1038
			ByteArrayPool.field4557.add(5000); // L: 1039
			ByteArrayPool.field4557.add(10000); // L: 1040
			ByteArrayPool.field4557.add(30000); // L: 1041
		}

		Login.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 1054
		class11.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 1055
		Varps.currentPort = Login.worldPort; // L: 1056
		class33.field196 = class331.field3605; // L: 1057
		ClanChannel.field1776 = class331.field3604; // L: 1058
		ViewportMouse.field2762 = class331.field3602; // L: 1059
		WorldMapSectionType.field2980 = class331.field3603; // L: 1060
		WorldMapLabel.urlRequester = new class113(this.field562, 215); // L: 1061
		this.setUpKeyboard(); // L: 1062
		this.method485(); // L: 1063
		MidiPcmStream.mouseWheel = this.mouseWheel(); // L: 1064
		this.method481(field612, 0); // L: 1065
		this.method481(field750, 1); // L: 1066
		class158.field1749 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.field1836, 500000); // L: 1067
		class150.clientPreferences = class126.method2941(); // L: 1068
		this.setUpClipboard(); // L: 1069
		WorldMapSectionType.method5461(this, class326.field3544); // L: 1070
		RouteStrategy.setWindowedMode(class150.clientPreferences.method2487()); // L: 1071
		class177.friendSystem = new FriendSystem(class457.loginType); // L: 1072
		this.field558 = new class14("tokenRequest", 1, 1); // L: 1073
		class102.method2657(this); // L: 1074
		class219.field2388 = new class217[1]; // L: 1076
		class215 var4 = class215.field2349; // L: 1077
		class219.field2388[0] = new class217(var4.field2357, var4.field2358); // L: 1078
	} // L: 1080

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "443189499"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 1088
		this.doCycleJs5(); // L: 1089
		BufferedSink.method8158(); // L: 1090
		boolean var1 = InterfaceParent.method2276(cycle); // L: 1091
		if (var1 && playingJingle && VerticalAlignment.pcmPlayer1 != null) { // L: 1092 1093
			VerticalAlignment.pcmPlayer1.tryDiscard();
		}

		class105.method2684(); // L: 1095
		field750.method4171(); // L: 1096
		this.method480(); // L: 1097
		synchronized(MouseHandler.KeyHandler_instance) { // L: 1099
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 1100
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 1101
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 1102
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 1103
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 1104
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 1105
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 1106
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 1107
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 1108
		} // L: 1109

		if (MidiPcmStream.mouseWheel != null) { // L: 1111
			int var4 = MidiPcmStream.mouseWheel.useRotation(); // L: 1112
			mouseWheelRotation = var4; // L: 1113
		}

		if (gameState == 0) { // L: 1115
			Skeleton.method4557(); // L: 1116
			HealthBarDefinition.method3672(); // L: 1117
		} else if (gameState == 5) { // L: 1119
			FileSystem.method3539(this, ItemComposition.field2225, class113.fontPlain12); // L: 1120
			Skeleton.method4557(); // L: 1121
			HealthBarDefinition.method3672(); // L: 1122
		} else if (gameState != 10 && gameState != 11) { // L: 1124
			if (gameState == 20) { // L: 1125
				FileSystem.method3539(this, ItemComposition.field2225, class113.fontPlain12); // L: 1126
				this.doCycleLoggedOut(); // L: 1127
			} else if (gameState == 50) { // L: 1129
				FileSystem.method3539(this, ItemComposition.field2225, class113.fontPlain12); // L: 1130
				this.doCycleLoggedOut(); // L: 1131
			} else if (gameState == 25) { // L: 1133
				class126.method2939();
			}
		} else {
			FileSystem.method3539(this, ItemComposition.field2225, class113.fontPlain12);
		}

		if (gameState == 30) { // L: 1134
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) { // L: 1135
			this.doCycleLoggedOut();
		}

	} // L: 1136

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-23"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field742 && class113.method2835() > field742) { // L: 1140 1141
			RouteStrategy.setWindowedMode(Huffman.getWindowedMode()); // L: 1142
		}

		int var2;
		if (var1) { // L: 1145
			for (var2 = 0; var2 < 100; ++var2) { // L: 1146
				field718[var2] = true;
			}
		}

		if (gameState == 0) { // L: 1148
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1149
			class395.drawTitle(Calendar.fontBold12, ItemComposition.field2225, class113.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1150
			if (gameState == 20) { // L: 1151
				class395.drawTitle(Calendar.fontBold12, ItemComposition.field2225, class113.fontPlain12);
			} else if (gameState == 50) { // L: 1152
				class395.drawTitle(Calendar.fontBold12, ItemComposition.field2225, class113.fontPlain12);
			} else if (gameState == 25) { // L: 1153
				if (field537 == 1) { // L: 1154
					if (field730 > field584) { // L: 1155
						field584 = field730;
					}

					var2 = (field584 * 50 - field730 * 50) / field584; // L: 1156
					Actor.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false); // L: 1157
				} else if (field537 == 2) { // L: 1159
					if (field679 > field586) { // L: 1160
						field586 = field679;
					}

					var2 = (field586 * 50 - field679 * 50) / field586 + 50; // L: 1161
					Actor.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false); // L: 1162
				} else {
					Actor.drawLoadingMessage("Loading - please wait.", false); // L: 1164
				}
			} else if (gameState == 30) { // L: 1166
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1167
				Actor.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1168
				Actor.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class395.drawTitle(Calendar.fontBold12, ItemComposition.field2225, class113.fontPlain12); // L: 1158
		}

		if (gameState == 30 && field672 == 0 && !var1 && !isResizable) { // L: 1169
			for (var2 = 0; var2 < rootWidgetCount; ++var2) { // L: 1170
				if (field735[var2]) { // L: 1171
					class156.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]); // L: 1172
					field735[var2] = false; // L: 1173
				}
			}
		} else if (gameState > 0) { // L: 1177
			class156.rasterProvider.drawFull(0, 0); // L: 1178

			for (var2 = 0; var2 < rootWidgetCount; ++var2) { // L: 1179
				field735[var2] = false;
			}
		}

	} // L: 1181

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "73"
	)
	@Export("kill0")
	protected final void kill0() {
		if (PendingSpawn.varcs.hasUnwrittenChanges()) { // L: 1184
			PendingSpawn.varcs.write();
		}

		if (class497.mouseRecorder != null) { // L: 1185
			class497.mouseRecorder.isRunning = false;
		}

		class497.mouseRecorder = null; // L: 1186
		packetWriter.close(); // L: 1187
		if (MouseHandler.KeyHandler_instance != null) { // L: 1189
			synchronized(MouseHandler.KeyHandler_instance) { // L: 1190
				MouseHandler.KeyHandler_instance = null; // L: 1191
			} // L: 1192
		}

		MidiPcmStream.mouseWheel = null; // L: 1195
		if (VerticalAlignment.pcmPlayer1 != null) { // L: 1196
			VerticalAlignment.pcmPlayer1.shutdown();
		}

		class153.field1700.method6853(); // L: 1197
		ArchiveDiskAction.method6681(); // L: 1198
		if (WorldMapLabel.urlRequester != null) { // L: 1199
			WorldMapLabel.urlRequester.close(); // L: 1200
			WorldMapLabel.urlRequester = null; // L: 1201
		}

		try {
			JagexCache.JagexCache_dat2File.close(); // L: 1205

			for (int var3 = 0; var3 < JagexCache.field1840; ++var3) { // L: 1206
				class302.JagexCache_idxFiles[var3].close();
			}

			JagexCache.field1836.close(); // L: 1207
			JagexCache.JagexCache_randomDat.close(); // L: 1208
		} catch (Exception var5) { // L: 1210
		}

		this.field558.method184(); // L: 1212
	} // L: 1213

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2050335898"
	)
	protected final void vmethod1262() {
	} // L: 740

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-57"
	)
	boolean method1267() {
		return class20.field114 != null && !class20.field114.trim().isEmpty() && Script.field1003 != null && !Script.field1003.trim().isEmpty(); // L: 971
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "7"
	)
	boolean method1472() {
		return class11.field65 != null && !class11.field65.trim().isEmpty() && Login.field960 != null && !Login.field960.trim().isEmpty(); // L: 975
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1435710939"
	)
	@Export("isOtlTokenRequesterInitialized")
	boolean isOtlTokenRequesterInitialized() {
		return this.field560 != null; // L: 979
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1913894736"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 983
		var2.put("grant_type", "refresh_token"); // L: 984
		var2.put("scope", "gamesso.token.create"); // L: 985
		var2.put("refresh_token", var1); // L: 986
		URL var3 = new URL(BuddyRankComparator.field1477 + "shield/oauth/token" + (new class464(var2)).method8413()); // L: 987
		class420 var4 = new class420(); // L: 988
		var4.method7764(field566); // L: 989
		var4.method7761("Host", (new URL(BuddyRankComparator.field1477)).getHost()); // L: 990
		var4.method7768(class461.field4777); // L: 991
		class9 var5 = class9.field43; // L: 992
		RefreshAccessTokenRequester var6 = this.field564; // L: 993
		if (var6 != null) { // L: 994
			this.field565 = var6.request(var5.method73(), var3, var4.method7778(), ""); // L: 995
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field562); // L: 998
			this.field563 = this.field558.method182(var7); // L: 999
		}
	} // L: 996 1000

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "828576760"
	)
	void method1271(String var1) throws IOException {
		URL var2 = new URL(BuddyRankComparator.field1477 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 1003
		class420 var3 = new class420(); // L: 1004
		var3.method7765(var1); // L: 1005
		class9 var4 = class9.field37; // L: 1006
		OtlTokenRequester var5 = this.field560; // L: 1007
		if (var5 != null) { // L: 1008
			this.field561 = var5.request(var4.method73(), var2, var3.method7778(), ""); // L: 1009
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field562); // L: 1012
			this.field634 = this.field558.method182(var6); // L: 1013
		}
	} // L: 1010 1014

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-176461860"
	)
	void method1272(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(BuddyRankComparator.field1477 + "game-session/v1/tokens"); // L: 1017
		class10 var4 = new class10(var3, class9.field43, this.field562); // L: 1018
		var4.method85().method7765(var1); // L: 1019
		var4.method85().method7768(class461.field4777); // L: 1020
		JSONObject var5 = new JSONObject(); // L: 1021
		var5.put("accountId", var2); // L: 1022
		var4.method86(new class463(var5)); // L: 1023
		this.field634 = this.field558.method182(var4); // L: 1024
	} // L: 1025

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1086320458"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1346
			boolean var1 = class153.field1700.method6858(); // L: 1347
			if (!var1) { // L: 1348
				this.method1278();
			}

		}
	} // L: 1349

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1146125856"
	)
	void method1278() {
		if (class153.field1700.field4318 >= 4) { // L: 1352
			this.error("js5crc"); // L: 1353
			class129.method2989(1000); // L: 1354
		} else {
			if (class153.field1700.field4298 >= 4) { // L: 1357
				if (gameState <= 5) { // L: 1358
					this.error("js5io"); // L: 1359
					class129.method2989(1000); // L: 1360
					return; // L: 1361
				}

				field549 = 3000; // L: 1364
				class153.field1700.field4298 = 3; // L: 1365
			}

			if (--field549 + 1 <= 0) { // L: 1368
				try {
					if (js5ConnectState == 0) { // L: 1370
						class303.js5SocketTask = GameEngine.taskHandler.newSocketTask(VarbitComposition.worldHost, Varps.currentPort); // L: 1371
						++js5ConnectState; // L: 1372
					}

					if (js5ConnectState == 1) { // L: 1374
						if (class303.js5SocketTask.status == 2) { // L: 1375
							this.js5Error(-1); // L: 1376
							return; // L: 1377
						}

						if (class303.js5SocketTask.status == 1) { // L: 1379
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1381
						class147.js5Socket = class310.method6008((Socket)class303.js5SocketTask.result, 40000, 5000); // L: 1382
						Buffer var1 = new Buffer(5); // L: 1383
						var1.writeByte(15); // L: 1384
						var1.writeInt(215); // L: 1385
						class147.js5Socket.write(var1.array, 0, 5); // L: 1386
						++js5ConnectState; // L: 1387
						class197.field2059 = class113.method2835(); // L: 1388
					}

					if (js5ConnectState == 3) { // L: 1390
						if (class147.js5Socket.available() > 0) { // L: 1391
							int var2 = class147.js5Socket.readUnsignedByte(); // L: 1392
							if (var2 != 0) { // L: 1393
								this.js5Error(var2); // L: 1394
								return; // L: 1395
							}

							++js5ConnectState; // L: 1397
						} else if (class113.method2835() - class197.field2059 > 30000L) { // L: 1400
							this.js5Error(-2); // L: 1401
							return; // L: 1402
						}
					}

					if (js5ConnectState == 4) { // L: 1406
						class153.field1700.method6846(class147.js5Socket, gameState > 20); // L: 1407
						class303.js5SocketTask = null; // L: 1408
						class147.js5Socket = null; // L: 1409
						js5ConnectState = 0; // L: 1410
						js5Errors = 0; // L: 1411
					}
				} catch (IOException var3) { // L: 1414
					this.js5Error(-3); // L: 1415
				}

			}
		}
	} // L: 1355 1417

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2025858335"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class303.js5SocketTask = null; // L: 1420
		class147.js5Socket = null; // L: 1421
		js5ConnectState = 0; // L: 1422
		if (Varps.currentPort == Login.worldPort) { // L: 1423
			Varps.currentPort = class11.js5Port;
		} else {
			Varps.currentPort = Login.worldPort; // L: 1424
		}

		++js5Errors; // L: 1425
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1426
			if (gameState <= 5) { // L: 1427
				this.error("js5connect_full"); // L: 1428
				class129.method2989(1000); // L: 1429
			} else {
				field549 = 3000; // L: 1431
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1433
			this.error("js5connect_outofdate"); // L: 1434
			class129.method2989(1000); // L: 1435
		} else if (js5Errors >= 4) { // L: 1437
			if (gameState <= 5) { // L: 1438
				this.error("js5connect"); // L: 1439
				class129.method2989(1000); // L: 1440
			} else {
				field549 = 3000; // L: 1442
			}
		}

	} // L: 1444

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-10"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket(); // L: 2086
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 2087

		try {
			if (loginState == 0) { // L: 2089
				if (class183.secureRandom == null && (secureRandomFuture.isDone() || field552 > 250)) { // L: 2090
					class183.secureRandom = secureRandomFuture.get(); // L: 2091
					secureRandomFuture.shutdown(); // L: 2092
					secureRandomFuture = null; // L: 2093
				}

				if (class183.secureRandom != null) { // L: 2095
					if (var1 != null) { // L: 2096
						var1.close(); // L: 2097
						var1 = null; // L: 2098
					}

					class457.socketTask = null; // L: 2100
					hadNetworkError = false; // L: 2101
					field552 = 0; // L: 2102
					if (field556.method9394()) { // L: 2103
						if (this.method1267()) { // L: 2104
							try {
								this.requestOtlToken(Script.field1003); // L: 2106
								BuddyRankComparator.method2912(21); // L: 2107
							} catch (Throwable var25) { // L: 2109
								class317.RunException_sendStackTrace((String)null, var25); // L: 2110
								GrandExchangeOfferTotalQuantityComparator.getLoginError(65); // L: 2111
								return; // L: 2112
							}
						} else {
							if (!this.method1472()) { // L: 2115
								GrandExchangeOfferTotalQuantityComparator.getLoginError(65); // L: 2127
								return; // L: 2128
							}

							try {
								this.method1272(class11.field65, Login.field960); // L: 2117
								BuddyRankComparator.method2912(20); // L: 2118
							} catch (Exception var24) { // L: 2120
								class317.RunException_sendStackTrace((String)null, var24); // L: 2121
								GrandExchangeOfferTotalQuantityComparator.getLoginError(65); // L: 2122
								return; // L: 2123
							}
						}
					} else {
						BuddyRankComparator.method2912(1); // L: 2132
					}
				}
			}

			class20 var27;
			if (loginState == 21) { // L: 2136
				if (this.field565 != null) { // L: 2137
					if (!this.field565.isDone()) { // L: 2138
						return; // L: 2139
					}

					if (this.field565.isCancelled()) { // L: 2141
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65); // L: 2142
						this.field565 = null; // L: 2143
						return; // L: 2144
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field565.get(); // L: 2147
						if (!var3.isSuccess()) { // L: 2148
							GrandExchangeOfferTotalQuantityComparator.getLoginError(65); // L: 2149
							this.field565 = null; // L: 2150
							return; // L: 2151
						}

						class20.field114 = var3.getAccessToken(); // L: 2153
						Script.field1003 = var3.getRefreshToken(); // L: 2154
						this.field565 = null; // L: 2155
					} catch (Exception var23) { // L: 2157
						class317.RunException_sendStackTrace((String)null, var23); // L: 2158
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65); // L: 2159
						this.field565 = null; // L: 2160
						return; // L: 2161
					}
				} else {
					if (this.field563 == null) { // L: 2164
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65); // L: 2194
						return; // L: 2195
					}

					if (!this.field563.method260()) { // L: 2165
						return; // L: 2166
					}

					if (this.field563.method263()) { // L: 2168
						class317.RunException_sendStackTrace(this.field563.method262(), (Throwable)null); // L: 2169
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65); // L: 2170
						this.field563 = null; // L: 2171
						return; // L: 2172
					}

					var27 = this.field563.method265(); // L: 2174
					if (var27.method284() != 200) { // L: 2175
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65); // L: 2176
						this.field563 = null; // L: 2177
						return; // L: 2178
					}

					field552 = 0; // L: 2180
					class463 var4 = new class463(var27.method286()); // L: 2181

					try {
						class20.field114 = var4.method8398().getString("access_token"); // L: 2183
						Script.field1003 = var4.method8398().getString("refresh_token"); // L: 2184
					} catch (Exception var22) { // L: 2186
						class317.RunException_sendStackTrace("Error parsing tokens", var22); // L: 2187
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65); // L: 2188
						this.field563 = null; // L: 2189
						return; // L: 2190
					}
				}

				this.method1271(class20.field114); // L: 2197
				BuddyRankComparator.method2912(20); // L: 2198
			}

			if (loginState == 20) { // L: 2200
				if (this.field561 != null) { // L: 2201
					if (!this.field561.isDone()) { // L: 2202
						return; // L: 2203
					}

					if (this.field561.isCancelled()) { // L: 2205
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65); // L: 2206
						this.field561 = null; // L: 2207
						return; // L: 2208
					}

					try {
						OtlTokenResponse var28 = (OtlTokenResponse)this.field561.get(); // L: 2211
						if (!var28.isSuccess()) { // L: 2212
							GrandExchangeOfferTotalQuantityComparator.getLoginError(65); // L: 2213
							this.field561 = null; // L: 2214
							return; // L: 2215
						}

						this.field697 = var28.getToken(); // L: 2217
						this.field561 = null; // L: 2218
					} catch (Exception var21) { // L: 2220
						class317.RunException_sendStackTrace((String)null, var21); // L: 2221
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65); // L: 2222
						this.field561 = null; // L: 2223
						return; // L: 2224
					}
				} else {
					if (this.field634 == null) { // L: 2227
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65); // L: 2263
						return; // L: 2264
					}

					if (!this.field634.method260()) { // L: 2228
						return; // L: 2229
					}

					if (this.field634.method263()) { // L: 2231
						class317.RunException_sendStackTrace(this.field634.method262(), (Throwable)null); // L: 2232
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65); // L: 2233
						this.field634 = null; // L: 2234
						return; // L: 2235
					}

					var27 = this.field634.method265(); // L: 2237
					if (var27.method284() != 200) { // L: 2238
						class317.RunException_sendStackTrace("Response code: " + var27.method284() + "Response body: " + var27.method286(), (Throwable)null); // L: 2239
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65); // L: 2240
						this.field634 = null; // L: 2241
						return; // L: 2242
					}

					List var29 = (List)var27.method285().get("Content-Type"); // L: 2244
					if (var29 != null && var29.contains(class461.field4777.method8386())) { // L: 2245
						try {
							JSONObject var5 = new JSONObject(var27.method286()); // L: 2247
							this.field697 = var5.getString("token"); // L: 2248
						} catch (JSONException var20) { // L: 2250
							class317.RunException_sendStackTrace((String)null, var20); // L: 2251
							GrandExchangeOfferTotalQuantityComparator.getLoginError(65); // L: 2252
							this.field634 = null; // L: 2253
							return; // L: 2254
						}
					} else {
						this.field697 = var27.method286(); // L: 2258
					}

					this.field634 = null; // L: 2260
				}

				field552 = 0; // L: 2266
				BuddyRankComparator.method2912(1); // L: 2267
			}

			if (loginState == 1) { // L: 2269
				if (class457.socketTask == null) { // L: 2270
					class457.socketTask = GameEngine.taskHandler.newSocketTask(VarbitComposition.worldHost, Varps.currentPort); // L: 2271
				}

				if (class457.socketTask.status == 2) { // L: 2273
					throw new IOException();
				}

				if (class457.socketTask.status == 1) { // L: 2274
					var1 = class310.method6008((Socket)class457.socketTask.result, 40000, 5000); // L: 2275
					packetWriter.setSocket(var1); // L: 2276
					class457.socketTask = null; // L: 2277
					BuddyRankComparator.method2912(2); // L: 2278
				}
			}

			PacketBufferNode var31;
			if (loginState == 2) { // L: 2281
				packetWriter.clearBuffer(); // L: 2282
				var31 = class130.method3005(); // L: 2285
				var31.clientPacket = null; // L: 2286
				var31.clientPacketLength = 0; // L: 2287
				var31.packetBuffer = new PacketBuffer(5000); // L: 2288
				var31.packetBuffer.writeByte(LoginPacket.field3341.id); // L: 2292
				packetWriter.addNode(var31); // L: 2293
				packetWriter.flush(); // L: 2294
				var2.offset = 0; // L: 2295
				BuddyRankComparator.method2912(3); // L: 2296
			}

			int var13;
			if (loginState == 3) { // L: 2298
				if (VerticalAlignment.pcmPlayer1 != null) { // L: 2299
					VerticalAlignment.pcmPlayer1.method783();
				}

				if (var1.isAvailable(1)) { // L: 2300
					var13 = var1.readUnsignedByte(); // L: 2301
					if (VerticalAlignment.pcmPlayer1 != null) { // L: 2302
						VerticalAlignment.pcmPlayer1.method783();
					}

					if (var13 != 0) { // L: 2303
						GrandExchangeOfferTotalQuantityComparator.getLoginError(var13); // L: 2304
						return; // L: 2305
					}

					var2.offset = 0; // L: 2307
					BuddyRankComparator.method2912(4); // L: 2308
				}
			}

			if (loginState == 4) { // L: 2311
				if (var2.offset < 8) { // L: 2312
					var13 = var1.available(); // L: 2313
					if (var13 > 8 - var2.offset) { // L: 2314
						var13 = 8 - var2.offset;
					}

					if (var13 > 0) { // L: 2315
						var1.read(var2.array, var2.offset, var13); // L: 2316
						var2.offset += var13; // L: 2317
					}
				}

				if (var2.offset == 8) { // L: 2320
					var2.offset = 0; // L: 2321
					class313.field3479 = var2.readLong(); // L: 2322
					BuddyRankComparator.method2912(5); // L: 2323
				}
			}

			if (loginState == 5) { // L: 2326
				packetWriter.packetBuffer.offset = 0; // L: 2327
				packetWriter.clearBuffer(); // L: 2328
				PacketBuffer var30 = new PacketBuffer(500); // L: 2329
				int[] var33 = new int[]{class183.secureRandom.nextInt(), class183.secureRandom.nextInt(), class183.secureRandom.nextInt(), class183.secureRandom.nextInt()}; // L: 2330 2331 2332 2333 2334
				var30.offset = 0; // L: 2335
				var30.writeByte(1); // L: 2336
				var30.writeInt(var33[0]); // L: 2337
				var30.writeInt(var33[1]); // L: 2338
				var30.writeInt(var33[2]); // L: 2339
				var30.writeInt(var33[3]); // L: 2340
				var30.writeLong(class313.field3479); // L: 2341
				if (gameState == 40) { // L: 2342
					var30.writeInt(GrandExchangeOfferWorldComparator.field4340[0]); // L: 2343
					var30.writeInt(GrandExchangeOfferWorldComparator.field4340[1]); // L: 2344
					var30.writeInt(GrandExchangeOfferWorldComparator.field4340[2]); // L: 2345
					var30.writeInt(GrandExchangeOfferWorldComparator.field4340[3]); // L: 2346
				} else {
					if (gameState == 50) { // L: 2349
						var30.writeByte(class139.field1631.rsOrdinal()); // L: 2350
						var30.writeInt(World.field835); // L: 2351
					} else {
						var30.writeByte(field555.rsOrdinal()); // L: 2354
						switch(field555.field1632) { // L: 2355
						case 1:
						case 4:
							var30.writeMedium(class424.field4622); // L: 2369
							++var30.offset; // L: 2370
							break;
						case 2:
							var30.offset += 4; // L: 2358
							break; // L: 2359
						case 3:
							var30.writeInt(class150.clientPreferences.method2490(Login.Login_username)); // L: 2363
						}
					}

					if (field556.method9394()) { // L: 2375
						var30.writeByte(class518.field5122.rsOrdinal()); // L: 2376
						var30.writeStringCp1252NullTerminated(this.field697); // L: 2377
					} else {
						var30.writeByte(class518.field5129.rsOrdinal()); // L: 2380
						var30.writeStringCp1252NullTerminated(Login.Login_password); // L: 2381
					}
				}

				var30.encryptRsa(class74.field918, class74.field915); // L: 2384
				GrandExchangeOfferWorldComparator.field4340 = var33; // L: 2385
				PacketBufferNode var6 = class130.method3005(); // L: 2388
				var6.clientPacket = null; // L: 2389
				var6.clientPacketLength = 0; // L: 2390
				var6.packetBuffer = new PacketBuffer(5000); // L: 2391
				var6.packetBuffer.offset = 0; // L: 2395
				if (gameState == 40) { // L: 2396
					var6.packetBuffer.writeByte(LoginPacket.field3343.id); // L: 2397
				} else {
					var6.packetBuffer.writeByte(LoginPacket.field3342.id); // L: 2400
				}

				var6.packetBuffer.writeShort(0); // L: 2402
				int var7 = var6.packetBuffer.offset; // L: 2403
				var6.packetBuffer.writeInt(215); // L: 2404
				var6.packetBuffer.writeInt(1); // L: 2405
				var6.packetBuffer.writeByte(clientType); // L: 2406
				var6.packetBuffer.writeByte(field657); // L: 2407
				byte var8 = 0; // L: 2408
				var6.packetBuffer.writeByte(var8); // L: 2409
				var6.packetBuffer.writeBytes(var30.array, 0, var30.offset); // L: 2410
				int var9 = var6.packetBuffer.offset; // L: 2411
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2412
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2413
				var6.packetBuffer.writeShort(GrandExchangeOfferTotalQuantityComparator.canvasWidth); // L: 2414
				var6.packetBuffer.writeShort(WorldMapArchiveLoader.canvasHeight); // L: 2415
				VertexNormal.method4951(var6.packetBuffer); // L: 2416
				var6.packetBuffer.writeStringCp1252NullTerminated(class36.field263); // L: 2417
				var6.packetBuffer.writeInt(PcmPlayer.field299); // L: 2418
				if (field525 > 213) { // L: 2419
					var6.packetBuffer.writeByte(0); // L: 2420
				}

				Buffer var10 = new Buffer(NPCComposition.field2042.size()); // L: 2422
				NPCComposition.field2042.write(var10); // L: 2423
				var6.packetBuffer.writeBytes(var10.array, 0, var10.array.length); // L: 2424
				var6.packetBuffer.writeByte(clientType); // L: 2425
				var6.packetBuffer.writeInt(0); // L: 2426
				var6.packetBuffer.method9138(class197.archive2.hash); // L: 2427
				var6.packetBuffer.method9137(Interpreter.field885.hash); // L: 2428
				var6.packetBuffer.method9138(class151.field1694.hash); // L: 2429
				var6.packetBuffer.method9137(0); // L: 2430
				var6.packetBuffer.method9138(class253.archive4.hash); // L: 2431
				var6.packetBuffer.method9139(World.field829.hash); // L: 2432
				var6.packetBuffer.writeInt(class131.field1565.hash); // L: 2433
				var6.packetBuffer.method9139(class7.archive8.hash); // L: 2434
				var6.packetBuffer.method9137(class126.archive12.hash); // L: 2435
				var6.packetBuffer.method9137(Canvas.archive6.hash); // L: 2436
				var6.packetBuffer.method9138(TileItem.archive7.hash); // L: 2437
				var6.packetBuffer.method9138(class191.field1970.hash); // L: 2438
				var6.packetBuffer.method9139(Varcs.field1402.hash); // L: 2439
				var6.packetBuffer.method9137(class386.field4436.hash); // L: 2440
				var6.packetBuffer.writeInt(GrandExchangeOfferOwnWorldComparator.field511.hash); // L: 2441
				var6.packetBuffer.method9139(FontName.archive13.hash); // L: 2442
				var6.packetBuffer.writeInt(class106.field1358.hash); // L: 2443
				var6.packetBuffer.method9138(ReflectionCheck.field273.hash); // L: 2444
				var6.packetBuffer.method9139(class148.archive10.hash); // L: 2445
				var6.packetBuffer.method9138(class149.archive9.hash); // L: 2446
				var6.packetBuffer.method9139(class13.archive11.hash); // L: 2447
				var6.packetBuffer.xteaEncrypt(var33, var9, var6.packetBuffer.offset); // L: 2448
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var7); // L: 2449
				packetWriter.addNode(var6); // L: 2450
				packetWriter.flush(); // L: 2451
				packetWriter.isaacCipher = new IsaacCipher(var33); // L: 2452
				int[] var11 = new int[4]; // L: 2453

				for (int var12 = 0; var12 < 4; ++var12) { // L: 2454
					var11[var12] = var33[var12] + 50;
				}

				var2.newIsaacCipher(var11); // L: 2455
				BuddyRankComparator.method2912(6); // L: 2456
			}

			int var14;
			if (loginState == 6 && var1.available() > 0) { // L: 2458 2459
				var13 = var1.readUnsignedByte(); // L: 2460
				if (var13 == 61) { // L: 2461
					var14 = var1.available(); // L: 2462
					Message.field506 = var14 == 1 && var1.readUnsignedByte() == 1; // L: 2463
					BuddyRankComparator.method2912(5); // L: 2464
				}

				if (var13 == 21 && gameState == 20) { // L: 2466
					BuddyRankComparator.method2912(12); // L: 2467
				} else if (var13 == 2) { // L: 2469
					BuddyRankComparator.method2912(14); // L: 2470
				} else if (var13 == 15 && gameState == 40) { // L: 2472
					packetWriter.serverPacketLength = -1; // L: 2473
					BuddyRankComparator.method2912(19); // L: 2474
				} else if (var13 == 64) { // L: 2476
					BuddyRankComparator.method2912(10); // L: 2477
				} else if (var13 == 23 && field796 < 1) { // L: 2479
					++field796; // L: 2480
					BuddyRankComparator.method2912(0); // L: 2481
				} else if (var13 == 29) { // L: 2483
					BuddyRankComparator.method2912(17); // L: 2484
				} else {
					if (var13 != 69) { // L: 2486
						GrandExchangeOfferTotalQuantityComparator.getLoginError(var13); // L: 2490
						return; // L: 2491
					}

					BuddyRankComparator.method2912(7); // L: 2487
				}
			}

			if (loginState == 7 && var1.available() >= 2) { // L: 2495 2496
				var1.read(var2.array, 0, 2); // L: 2497
				var2.offset = 0; // L: 2498
				class386.field4434 = var2.readUnsignedShort(); // L: 2499
				BuddyRankComparator.method2912(8); // L: 2500
			}

			if (loginState == 8 && var1.available() >= class386.field4434) { // L: 2503 2504
				var2.offset = 0; // L: 2505
				var1.read(var2.array, var2.offset, class386.field4434); // L: 2506
				class6 var32 = class304.method5780()[var2.readUnsignedByte()]; // L: 2507

				try {
					class3 var35 = Interpreter.method2069(var32); // L: 2509
					this.field570 = new class7(var2, var35); // L: 2510
					BuddyRankComparator.method2912(9); // L: 2511
				} catch (Exception var19) { // L: 2513
					GrandExchangeOfferTotalQuantityComparator.getLoginError(22); // L: 2514
					return; // L: 2515
				}
			}

			if (loginState == 9 && this.field570.method54()) { // L: 2519 2520
				this.field569 = this.field570.method48(); // L: 2521
				this.field570.method47(); // L: 2522
				this.field570 = null; // L: 2523
				if (this.field569 == null) { // L: 2524
					GrandExchangeOfferTotalQuantityComparator.getLoginError(22); // L: 2525
					return; // L: 2526
				}

				packetWriter.clearBuffer(); // L: 2528
				var31 = class130.method3005(); // L: 2531
				var31.clientPacket = null; // L: 2532
				var31.clientPacketLength = 0; // L: 2533
				var31.packetBuffer = new PacketBuffer(5000); // L: 2534
				var31.packetBuffer.writeByte(LoginPacket.field3345.id); // L: 2538
				var31.packetBuffer.writeShort(this.field569.offset); // L: 2539
				var31.packetBuffer.method9080(this.field569); // L: 2540
				packetWriter.addNode(var31); // L: 2541
				packetWriter.flush(); // L: 2542
				this.field569 = null; // L: 2543
				BuddyRankComparator.method2912(6); // L: 2544
			}

			if (loginState == 10 && var1.available() > 0) { // L: 2547 2548
				class293.field3091 = var1.readUnsignedByte(); // L: 2549
				BuddyRankComparator.method2912(11); // L: 2550
			}

			if (loginState == 11 && var1.available() >= class293.field3091) { // L: 2553 2554
				var1.read(var2.array, 0, class293.field3091); // L: 2555
				var2.offset = 0; // L: 2556
				BuddyRankComparator.method2912(6); // L: 2557
			}

			if (loginState == 12 && var1.available() > 0) { // L: 2560 2561
				field554 = (var1.readUnsignedByte() + 3) * 60; // L: 2562
				BuddyRankComparator.method2912(13); // L: 2563
			}

			if (loginState == 13) { // L: 2566
				field552 = 0; // L: 2567
				Actor.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field554 / 60 + " seconds."); // L: 2568
				if (--field554 <= 0) { // L: 2569
					BuddyRankComparator.method2912(0);
				}

			} else {
				if (loginState == 14 && var1.available() >= 1) { // L: 2572 2573
					KeyHandler.field162 = var1.readUnsignedByte(); // L: 2574
					BuddyRankComparator.method2912(15); // L: 2575
				}

				if (loginState == 15 && var1.available() >= KeyHandler.field162) { // L: 2578 2579
					boolean var43 = var1.readUnsignedByte() == 1; // L: 2580
					var1.read(var2.array, 0, 4); // L: 2581
					var2.offset = 0; // L: 2582
					boolean var42 = false; // L: 2583
					if (var43) { // L: 2584
						var14 = var2.readByteIsaac() << 24; // L: 2585
						var14 |= var2.readByteIsaac() << 16; // L: 2586
						var14 |= var2.readByteIsaac() << 8; // L: 2587
						var14 |= var2.readByteIsaac(); // L: 2588
						class150.clientPreferences.method2488(Login.Login_username, var14); // L: 2589
					}

					if (Login_isUsernameRemembered) { // L: 2591
						class150.clientPreferences.method2482(Login.Login_username); // L: 2592
					} else {
						class150.clientPreferences.method2482((String)null); // L: 2595
					}

					GrandExchangeEvents.savePreferences(); // L: 2597
					staffModLevel = var1.readUnsignedByte(); // L: 2598
					playerMod = var1.readUnsignedByte() == 1; // L: 2599
					localPlayerIndex = var1.readUnsignedByte(); // L: 2600
					localPlayerIndex <<= 8; // L: 2601
					localPlayerIndex += var1.readUnsignedByte(); // L: 2602
					field641 = var1.readUnsignedByte(); // L: 2603
					var1.read(var2.array, 0, 8); // L: 2604
					var2.offset = 0; // L: 2605
					this.accountHash = var2.readLong(); // L: 2606
					var1.read(var2.array, 0, 8); // L: 2607
					var2.offset = 0; // L: 2608
					field642 = var2.readLong(); // L: 2609
					if (field525 >= 214) { // L: 2610
						var1.read(var2.array, 0, 8); // L: 2611
						var2.offset = 0; // L: 2612
						var2.readLong(); // L: 2613
					}

					var1.read(var2.array, 0, 1); // L: 2615
					var2.offset = 0; // L: 2616
					ServerPacket[] var36 = Messages.method2777(); // L: 2617
					int var15 = var2.readSmartByteShortIsaac(); // L: 2618
					if (var15 < 0 || var15 >= var36.length) { // L: 2619
						throw new IOException(var15 + " " + var2.offset);
					}

					packetWriter.serverPacket = var36[var15]; // L: 2620
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2621
					var1.read(var2.array, 0, 2); // L: 2622
					var2.offset = 0; // L: 2623
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2624

					try {
						Client var16 = TileItem.client; // L: 2626
						JSObject.getWindow(var16).call("zap", (Object[])null); // L: 2629
					} catch (Throwable var18) { // L: 2632
					}

					BuddyRankComparator.method2912(16); // L: 2633
				}

				if (loginState == 16) { // L: 2636
					if (var1.available() >= packetWriter.serverPacketLength) { // L: 2637
						var2.offset = 0; // L: 2638
						var1.read(var2.array, 0, packetWriter.serverPacketLength); // L: 2639
						timer.method7726(); // L: 2640
						mouseLastLastPressedTimeMillis = 1L; // L: 2643
						class497.mouseRecorder.index = 0; // L: 2644
						class326.hasFocus = true; // L: 2645
						hadFocus = true; // L: 2646
						field650 = -1L; // L: 2647
						class19.method280(); // L: 2648
						packetWriter.clearBuffer(); // L: 2649
						packetWriter.packetBuffer.offset = 0; // L: 2650
						packetWriter.serverPacket = null; // L: 2651
						packetWriter.field1416 = null; // L: 2652
						packetWriter.field1421 = null; // L: 2653
						packetWriter.field1422 = null; // L: 2654
						packetWriter.serverPacketLength = 0; // L: 2655
						packetWriter.field1423 = 0; // L: 2656
						rebootTimer = 0; // L: 2657
						logoutTimer = 0; // L: 2658
						hintArrowType = 0; // L: 2659
						menuOptionsCount = 0; // L: 2661
						isMenuOpen = false; // L: 2662
						ApproximateRouteStrategy.method1244(0); // L: 2664
						SoundCache.method857(); // L: 2665
						isItemSelected = 0; // L: 2666
						isSpellSelected = false; // L: 2667
						soundEffectCount = 0; // L: 2668
						camAngleY = 0; // L: 2669
						oculusOrbState = 0; // L: 2670
						UserComparator7.field1455 = null; // L: 2671
						minimapState = 0; // L: 2672
						field758 = -1; // L: 2673
						destinationX = 0; // L: 2674
						destinationY = 0; // L: 2675
						playerAttackOption = AttackOption.AttackOption_hidden; // L: 2676
						npcAttackOption = AttackOption.AttackOption_hidden; // L: 2677
						npcCount = 0; // L: 2678
						CollisionMap.method4208(); // L: 2679

						for (var13 = 0; var13 < 2048; ++var13) { // L: 2680
							players[var13] = null;
						}

						for (var13 = 0; var13 < 65536; ++var13) { // L: 2681
							npcs[var13] = null;
						}

						combatTargetPlayerIndex = -1; // L: 2682
						projectiles.clear(); // L: 2683
						graphicsObjects.clear(); // L: 2684

						for (var13 = 0; var13 < 4; ++var13) { // L: 2685
							for (var14 = 0; var14 < 104; ++var14) { // L: 2686
								for (int var17 = 0; var17 < 104; ++var17) { // L: 2687
									groundItems[var13][var14][var17] = null; // L: 2688
								}
							}
						}

						pendingSpawns = new NodeDeque(); // L: 2692
						class177.friendSystem.clear(); // L: 2693

						for (var13 = 0; var13 < VarpDefinition.field1904; ++var13) { // L: 2694
							VarpDefinition var41 = class158.VarpDefinition_get(var13); // L: 2695
							if (var41 != null) { // L: 2696
								Varps.Varps_temp[var13] = 0; // L: 2697
								Varps.Varps_main[var13] = 0; // L: 2698
							}
						}

						PendingSpawn.varcs.clearTransient(); // L: 2701
						followerIndex = -1; // L: 2702
						if (rootInterface != -1) { // L: 2703
							var13 = rootInterface; // L: 2704
							if (var13 != -1 && Widget.Widget_loadedInterfaces[var13]) { // L: 2706 2707
								ArchiveLoader.Widget_archive.clearFilesGroup(var13); // L: 2708
								if (ArchiveLoader.Widget_interfaceComponents[var13] != null) { // L: 2709
									for (var14 = 0; var14 < ArchiveLoader.Widget_interfaceComponents[var13].length; ++var14) { // L: 2710
										if (ArchiveLoader.Widget_interfaceComponents[var13][var14] != null) { // L: 2711
											ArchiveLoader.Widget_interfaceComponents[var13][var14] = null; // L: 2712
										}
									}

									ArchiveLoader.Widget_interfaceComponents[var13] = null; // L: 2715
									Widget.Widget_loadedInterfaces[var13] = false; // L: 2716
								}
							}
						}

						for (InterfaceParent var37 = (InterfaceParent)interfaceParents.first(); var37 != null; var37 = (InterfaceParent)interfaceParents.next()) { // L: 2719
							Actor.closeInterface(var37, true); // L: 2720
						}

						rootInterface = -1; // L: 2722
						interfaceParents = new NodeHashTable(8); // L: 2723
						meslayerContinueWidget = null; // L: 2724
						menuOptionsCount = 0; // L: 2726
						isMenuOpen = false; // L: 2727
						playerAppearance.method6119((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1); // L: 2729

						for (var13 = 0; var13 < 8; ++var13) { // L: 2730
							playerMenuActions[var13] = null; // L: 2731
							playerOptionsPriorities[var13] = false; // L: 2732
						}

						ItemContainer.itemContainers = new NodeHashTable(32); // L: 2735
						field682 = true; // L: 2737

						for (var13 = 0; var13 < 100; ++var13) { // L: 2738
							field718[var13] = true;
						}

						class409.method7680(); // L: 2739
						Canvas.friendsChatManager = null; // L: 2740
						class11.guestClanSettings = null; // L: 2741
						Arrays.fill(currentClanSettings, (Object)null); // L: 2742
						WorldMapLabelSize.guestClanChannel = null; // L: 2743
						Arrays.fill(currentClanChannels, (Object)null); // L: 2744

						for (var13 = 0; var13 < 8; ++var13) { // L: 2745
							grandExchangeOffers[var13] = new GrandExchangeOffer();
						}

						KeyHandler.grandExchangeEvents = null; // L: 2746
						field527 = false; // L: 2747
						class164.updatePlayer(var2); // L: 2749
						class309.field3456 = -1; // L: 2750
						class303.loadRegions(false, var2); // L: 2751
						packetWriter.serverPacket = null; // L: 2752
					}

				} else {
					if (loginState == 17 && var1.available() >= 2) { // L: 2756 2757
						var2.offset = 0; // L: 2758
						var1.read(var2.array, 0, 2); // L: 2759
						var2.offset = 0; // L: 2760
						WorldMapSectionType.field2979 = var2.readUnsignedShort(); // L: 2761
						BuddyRankComparator.method2912(18); // L: 2762
					}

					if (loginState == 18 && var1.available() >= WorldMapSectionType.field2979) { // L: 2765 2766
						var2.offset = 0; // L: 2767
						var1.read(var2.array, 0, WorldMapSectionType.field2979); // L: 2768
						var2.offset = 0; // L: 2769
						String var34 = var2.readStringCp1252NullTerminated(); // L: 2770
						String var39 = var2.readStringCp1252NullTerminated(); // L: 2771
						String var38 = var2.readStringCp1252NullTerminated(); // L: 2772
						Actor.setLoginResponseString(var34, var39, var38); // L: 2773
						class129.method2989(10); // L: 2774
						if (field556.method9394()) { // L: 2775
							class328.method6115(9); // L: 2776
						}
					}

					if (loginState != 19) { // L: 2780
						++field552; // L: 2830
						if (field552 > 2000) { // L: 2831
							if (field796 < 1) { // L: 2832
								if (Login.worldPort == Varps.currentPort) { // L: 2833
									Varps.currentPort = class11.js5Port;
								} else {
									Varps.currentPort = Login.worldPort; // L: 2834
								}

								++field796; // L: 2835
								BuddyRankComparator.method2912(0); // L: 2836
							} else {
								GrandExchangeOfferTotalQuantityComparator.getLoginError(-3); // L: 2839
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) { // L: 2781
							if (var1.available() < 2) { // L: 2782
								return;
							}

							var1.read(var2.array, 0, 2); // L: 2783
							var2.offset = 0; // L: 2784
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2785
						}

						if (var1.available() >= packetWriter.serverPacketLength) { // L: 2787
							var1.read(var2.array, 0, packetWriter.serverPacketLength); // L: 2788
							var2.offset = 0; // L: 2789
							var13 = packetWriter.serverPacketLength; // L: 2790
							timer.method7728(); // L: 2791
							packetWriter.clearBuffer(); // L: 2793
							packetWriter.packetBuffer.offset = 0; // L: 2794
							packetWriter.serverPacket = null; // L: 2795
							packetWriter.field1416 = null; // L: 2796
							packetWriter.field1421 = null; // L: 2797
							packetWriter.field1422 = null; // L: 2798
							packetWriter.serverPacketLength = 0; // L: 2799
							packetWriter.field1423 = 0; // L: 2800
							rebootTimer = 0; // L: 2801
							menuOptionsCount = 0; // L: 2803
							isMenuOpen = false; // L: 2804
							minimapState = 0; // L: 2806
							destinationX = 0; // L: 2807

							for (var14 = 0; var14 < 2048; ++var14) { // L: 2808
								players[var14] = null;
							}

							class136.localPlayer = null; // L: 2809

							for (var14 = 0; var14 < npcs.length; ++var14) { // L: 2810
								NPC var40 = npcs[var14]; // L: 2811
								if (var40 != null) { // L: 2812
									var40.targetIndex = -1; // L: 2813
									var40.false0 = false; // L: 2814
								}
							}

							ItemContainer.itemContainers = new NodeHashTable(32); // L: 2818
							class129.method2989(30); // L: 2820

							for (var14 = 0; var14 < 100; ++var14) { // L: 2821
								field718[var14] = true;
							}

							class409.method7680(); // L: 2822
							class164.updatePlayer(var2); // L: 2824
							if (var13 != var2.offset) { // L: 2825
								throw new RuntimeException(); // L: 2826
							}
						}
					}
				}
			}
		} catch (IOException var26) { // L: 2843
			if (field796 < 1) { // L: 2844
				if (Login.worldPort == Varps.currentPort) { // L: 2845
					Varps.currentPort = class11.js5Port;
				} else {
					Varps.currentPort = Login.worldPort; // L: 2846
				}

				++field796; // L: 2847
				BuddyRankComparator.method2912(0); // L: 2848
			} else {
				GrandExchangeOfferTotalQuantityComparator.getLoginError(-2); // L: 2851
			}
		}
	} // L: 2570 2754 2828 2837 2840 2849 2852 2854

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2055696363"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3113
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3114
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3115
			hadNetworkError = false; // L: 3116
			class93.method2369(); // L: 3117
		} else {
			if (!isMenuOpen) { // L: 3120
				class89.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1288(packetWriter); ++var1) { // L: 3121 3122
			}

			if (gameState == 30) { // L: 3124
				int var2;
				PacketBufferNode var14;
				while (GraphicsObject.method2081()) { // L: 3125
					var14 = class503.getPacketBufferNode(ClientPacket.field3170, packetWriter.isaacCipher); // L: 3126
					var14.packetBuffer.writeByte(0); // L: 3127
					var2 = var14.packetBuffer.offset; // L: 3128
					ArchiveDiskAction.performReflectionCheck(var14.packetBuffer); // L: 3129
					var14.packetBuffer.method9083(var14.packetBuffer.offset - var2); // L: 3130
					packetWriter.addNode(var14); // L: 3131
				}

				if (timer.field4562) { // L: 3133
					var14 = class503.getPacketBufferNode(ClientPacket.field3105, packetWriter.isaacCipher); // L: 3135
					var14.packetBuffer.writeByte(0); // L: 3136
					var2 = var14.packetBuffer.offset; // L: 3137
					timer.write(var14.packetBuffer); // L: 3138
					var14.packetBuffer.method9083(var14.packetBuffer.offset - var2); // L: 3139
					packetWriter.addNode(var14); // L: 3140
					timer.method7727(); // L: 3141
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
				synchronized(class497.mouseRecorder.lock) { // L: 3144
					if (!field631) { // L: 3145
						class497.mouseRecorder.index = 0; // L: 3231
					} else if (MouseHandler.MouseHandler_lastButton != 0 || class497.mouseRecorder.index >= 40) { // L: 3146
						PacketBufferNode var15 = null; // L: 3148
						var3 = 0; // L: 3149
						var4 = 0; // L: 3150
						var5 = 0; // L: 3151
						var6 = 0; // L: 3152

						for (var7 = 0; var7 < class497.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) { // L: 3153 3154
							var4 = var7; // L: 3155
							var8 = class497.mouseRecorder.ys[var7]; // L: 3156
							if (var8 < -1) { // L: 3157
								var8 = -1;
							} else if (var8 > 65534) { // L: 3158
								var8 = 65534;
							}

							var9 = class497.mouseRecorder.xs[var7]; // L: 3159
							if (var9 < -1) { // L: 3160
								var9 = -1;
							} else if (var9 > 65534) { // L: 3161
								var9 = 65534;
							}

							if (var9 != field743 || var8 != field532) { // L: 3162
								if (var15 == null) { // L: 3165
									var15 = class503.getPacketBufferNode(ClientPacket.field3115, packetWriter.isaacCipher); // L: 3166
									var15.packetBuffer.writeByte(0); // L: 3167
									var3 = var15.packetBuffer.offset; // L: 3168
									var10000 = var15.packetBuffer; // L: 3169
									var10000.offset += 2;
									var5 = 0; // L: 3170
									var6 = 0; // L: 3171
								}

								if (-1L != field533) { // L: 3176
									var10 = var9 - field743; // L: 3177
									var11 = var8 - field532; // L: 3178
									var12 = (int)((class497.mouseRecorder.millis[var7] - field533) / 20L); // L: 3179
									var5 = (int)((long)var5 + (class497.mouseRecorder.millis[var7] - field533) % 20L); // L: 3180
								} else {
									var10 = var9; // L: 3183
									var11 = var8; // L: 3184
									var12 = Integer.MAX_VALUE; // L: 3185
								}

								field743 = var9; // L: 3187
								field532 = var8; // L: 3188
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3189
									var10 += 32; // L: 3190
									var11 += 32; // L: 3191
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3192
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3194
									var10 += 128; // L: 3195
									var11 += 128; // L: 3196
									var15.packetBuffer.writeByte(var12 + 128); // L: 3197
									var15.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3198
								} else if (var12 < 32) { // L: 3200
									var15.packetBuffer.writeByte(var12 + 192); // L: 3201
									if (var9 != -1 && var8 != -1) { // L: 3202
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3203
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3206
									if (var9 != -1 && var8 != -1) { // L: 3207
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3208
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6; // L: 3210
								field533 = class497.mouseRecorder.millis[var7]; // L: 3211
							}
						}

						if (var15 != null) { // L: 3213
							var15.packetBuffer.method9083(var15.packetBuffer.offset - var3); // L: 3214
							var7 = var15.packetBuffer.offset; // L: 3215
							var15.packetBuffer.offset = var3; // L: 3216
							var15.packetBuffer.writeByte(var5 / var6); // L: 3217
							var15.packetBuffer.writeByte(var5 % var6); // L: 3218
							var15.packetBuffer.offset = var7; // L: 3219
							packetWriter.addNode(var15); // L: 3220
						}

						if (var4 >= class497.mouseRecorder.index) { // L: 3222
							class497.mouseRecorder.index = 0;
						} else {
							MouseRecorder var50 = class497.mouseRecorder; // L: 3224
							var50.index -= var4;
							System.arraycopy(class497.mouseRecorder.xs, var4, class497.mouseRecorder.xs, 0, class497.mouseRecorder.index); // L: 3225
							System.arraycopy(class497.mouseRecorder.ys, var4, class497.mouseRecorder.ys, 0, class497.mouseRecorder.index); // L: 3226
							System.arraycopy(class497.mouseRecorder.millis, var4, class497.mouseRecorder.millis, 0, class497.mouseRecorder.index); // L: 3227
						}
					}
				}

				PacketBufferNode var18;
				if (MouseHandler.MouseHandler_lastButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3233
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L; // L: 3234
					if (var16 > 32767L) { // L: 3235
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L; // L: 3236
					var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3237
					if (var3 < 0) { // L: 3238
						var3 = 0;
					} else if (var3 > WorldMapArchiveLoader.canvasHeight) { // L: 3239
						var3 = WorldMapArchiveLoader.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3240
					if (var4 < 0) { // L: 3241
						var4 = 0;
					} else if (var4 > GrandExchangeOfferTotalQuantityComparator.canvasWidth) { // L: 3242
						var4 = GrandExchangeOfferTotalQuantityComparator.canvasWidth;
					}

					var5 = (int)var16; // L: 3243
					var18 = class503.getPacketBufferNode(ClientPacket.field3137, packetWriter.isaacCipher); // L: 3244
					var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0)); // L: 3245
					var18.packetBuffer.writeShort(var4); // L: 3246
					var18.packetBuffer.writeShort(var3); // L: 3247
					packetWriter.addNode(var18); // L: 3248
				}

				if (mouseWheelRotation != 0) { // L: 3250
					var14 = class503.getPacketBufferNode(ClientPacket.field3190, packetWriter.isaacCipher); // L: 3251
					var14.packetBuffer.writeShort(mouseWheelRotation); // L: 3252
					packetWriter.addNode(var14); // L: 3253
				}

				if (field750.field2331 > 0) { // L: 3255
					var14 = class503.getPacketBufferNode(ClientPacket.field3161, packetWriter.isaacCipher); // L: 3256
					var14.packetBuffer.writeShort(0); // L: 3257
					var2 = var14.packetBuffer.offset; // L: 3258
					long var19 = class113.method2835(); // L: 3259

					for (var5 = 0; var5 < field750.field2331; ++var5) { // L: 3260
						long var21 = var19 - field650; // L: 3261
						if (var21 > 16777215L) { // L: 3262
							var21 = 16777215L;
						}

						field650 = var19; // L: 3263
						var14.packetBuffer.method9278((int)var21); // L: 3264
						var14.packetBuffer.method9188(field750.field2319[var5]); // L: 3265
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2); // L: 3267
					packetWriter.addNode(var14); // L: 3268
				}

				if (field614 > 0) { // L: 3270
					--field614;
				}

				if (field750.method4151(96) || field750.method4151(97) || field750.method4151(98) || field750.method4151(99)) { // L: 3271
					field707 = true; // L: 3272
				}

				if (field707 && field614 <= 0) { // L: 3274
					field614 = 20; // L: 3275
					field707 = false; // L: 3276
					var14 = class503.getPacketBufferNode(ClientPacket.field3101, packetWriter.isaacCipher); // L: 3278
					var14.packetBuffer.writeShort(camAngleY); // L: 3279
					var14.packetBuffer.writeShort(camAngleX); // L: 3280
					packetWriter.addNode(var14); // L: 3281
				}

				if (class326.hasFocus && !hadFocus) { // L: 3283
					hadFocus = true; // L: 3284
					var14 = class503.getPacketBufferNode(ClientPacket.field3144, packetWriter.isaacCipher); // L: 3286
					var14.packetBuffer.writeByte(1); // L: 3287
					packetWriter.addNode(var14); // L: 3288
				}

				if (!class326.hasFocus && hadFocus) { // L: 3290
					hadFocus = false; // L: 3291
					var14 = class503.getPacketBufferNode(ClientPacket.field3144, packetWriter.isaacCipher); // L: 3293
					var14.packetBuffer.writeByte(0); // L: 3294
					packetWriter.addNode(var14); // L: 3295
				}

				if (class127.worldMap != null) { // L: 3298
					class127.worldMap.method8531();
				}

				Player var31;
				if (DynamicObject.FriendsChatManager_inFriendsChat) { // L: 3300
					if (Canvas.friendsChatManager != null) { // L: 3301
						Canvas.friendsChatManager.sort(); // L: 3302
					}

					for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3305
						var31 = players[Players.Players_indices[var1]]; // L: 3306
						var31.method2325(); // L: 3307
					}

					DynamicObject.FriendsChatManager_inFriendsChat = false; // L: 3310
				}

				if (class458.field4775) { // L: 3314
					for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3316
						var31 = players[Players.Players_indices[var1]]; // L: 3317
						var31.method2345(); // L: 3318
					}

					class458.field4775 = false; // L: 3321
				}

				if (class36.Client_plane != field758) { // L: 3325
					field758 = class36.Client_plane; // L: 3326
					class12.method172(class36.Client_plane); // L: 3327
				}

				if (gameState == 30) { // L: 3330
					for (PendingSpawn var30 = (PendingSpawn)pendingSpawns.last(); var30 != null; var30 = (PendingSpawn)pendingSpawns.previous()) { // L: 3332 3333 3352
						if (var30.hitpoints > 0) { // L: 3334
							--var30.hitpoints;
						}

						if (var30.hitpoints == 0) { // L: 3335
							if (var30.objectId < 0 || DevicePcmPlayerProvider.method311(var30.objectId, var30.field1169)) { // L: 3336
								class183.method3576(var30.plane, var30.type, var30.x, var30.y, var30.objectId, var30.field1168, var30.field1169, var30.field1172); // L: 3337
								var30.remove(); // L: 3338
							}
						} else {
							if (var30.delay > 0) { // L: 3342
								--var30.delay;
							}

							if (var30.delay == 0 && var30.x >= 1 && var30.y >= 1 && var30.x <= 102 && var30.y <= 102 && (var30.field1173 < 0 || DevicePcmPlayerProvider.method311(var30.field1173, var30.field1170))) { // L: 3343 3344
								class183.method3576(var30.plane, var30.type, var30.x, var30.y, var30.field1173, var30.field1171, var30.field1170, var30.field1172); // L: 3345
								var30.delay = -1; // L: 3346
								if (var30.objectId == var30.field1173 && var30.objectId == -1) { // L: 3347
									var30.remove();
								} else if (var30.objectId == var30.field1173 && var30.field1168 == var30.field1171 && var30.field1170 == var30.field1169) { // L: 3348
									var30.remove();
								}
							}
						}
					}

					int var10002;
					for (var1 = 0; var1 < soundEffectCount; ++var1) { // L: 3356
						var10002 = queuedSoundEffectDelays[var1]--; // L: 3357
						if (queuedSoundEffectDelays[var1] >= -10) { // L: 3358
							SoundEffect var34 = soundEffects[var1]; // L: 3370
							if (var34 == null) { // L: 3371
								var10000 = null; // L: 3372
								var34 = SoundEffect.readSoundEffect(class149.archive9, soundEffectIds[var1], 0);
								if (var34 == null) { // L: 3373
									continue;
								}

								int[] var51 = queuedSoundEffectDelays; // L: 3374
								var51[var1] += var34.calculateDelay();
								soundEffects[var1] = var34; // L: 3375
							}

							if (queuedSoundEffectDelays[var1] < 0) { // L: 3381
								if (soundLocations[var1] != 0) { // L: 3383
									var4 = (soundLocations[var1] & 255) * 128; // L: 3384
									var5 = soundLocations[var1] >> 16 & 255; // L: 3385
									var6 = var5 * 128 + 64 - class136.localPlayer.x; // L: 3386
									if (var6 < 0) { // L: 3387
										var6 = -var6;
									}

									var7 = soundLocations[var1] >> 8 & 255; // L: 3388
									var8 = var7 * 128 + 64 - class136.localPlayer.y; // L: 3389
									if (var8 < 0) { // L: 3390
										var8 = -var8;
									}

									var9 = var8 + var6 - 128; // L: 3391
									if (var9 > var4) { // L: 3392
										queuedSoundEffectDelays[var1] = -100; // L: 3393
										continue; // L: 3394
									}

									if (var9 < 0) { // L: 3396
										var9 = 0;
									}

									var3 = (var4 - var9) * class150.clientPreferences.method2481() / var4; // L: 3397
								} else {
									var3 = class150.clientPreferences.method2480(); // L: 3399
								}

								if (var3 > 0) { // L: 3400
									RawSound var23 = var34.toRawSound().resample(SoundCache.decimator); // L: 3401
									RawPcmStream var24 = RawPcmStream.createRawPcmStream(var23, 100, var3); // L: 3402
									var24.setNumLoops(queuedSoundEffectLoops[var1] - 1); // L: 3403
									SecureRandomCallable.pcmStreamMixer.addSubStream(var24); // L: 3404
								}

								queuedSoundEffectDelays[var1] = -100; // L: 3406
							}
						} else {
							--soundEffectCount; // L: 3359

							for (var2 = var1; var2 < soundEffectCount; ++var2) { // L: 3360
								soundEffectIds[var2] = soundEffectIds[var2 + 1]; // L: 3361
								soundEffects[var2] = soundEffects[var2 + 1]; // L: 3362
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1]; // L: 3363
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1]; // L: 3364
								soundLocations[var2] = soundLocations[var2 + 1]; // L: 3365
							}

							--var1; // L: 3367
						}
					}

					if (playingJingle && !ItemContainer.method2273()) { // L: 3409
						if (class150.clientPreferences.method2478() != 0 && HorizontalAlignment.method3701()) { // L: 3410
							Archive var32 = class13.archive11; // L: 3411
							var2 = class150.clientPreferences.method2478(); // L: 3412
							if (!class306.field3398.isEmpty()) { // L: 3414
								ArrayList var25 = new ArrayList(); // L: 3417
								Iterator var38 = class306.field3398.iterator(); // L: 3418

								while (var38.hasNext()) {
									class318 var41 = (class318)var38.next(); // L: 3419
									var41.field3508 = false; // L: 3421
									var41.field3513 = false; // L: 3422
									var41.field3515 = false; // L: 3423
									var41.field3514 = var32; // L: 3424
									var41.field3510 = var2; // L: 3425
									var41.field3511 = 0.0F; // L: 3426
									var25.add(var41); // L: 3427
								}

								UserComparator4.method2858(var25, class306.field3392, class306.field3402, class306.field3403, class306.field3407, false); // L: 3430
							}
						}

						playingJingle = false; // L: 3433
					}

					++packetWriter.field1423; // L: 3436
					if (packetWriter.field1423 > 750) { // L: 3437
						class93.method2369(); // L: 3438
					} else {
						class27.method421(); // L: 3441
						class132.method3039(); // L: 3442
						int[] var33 = Players.Players_indices; // L: 3444

						for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 3445
							Player var45 = players[var33[var2]]; // L: 3446
							if (var45 != null && var45.field1182 > 0) { // L: 3447
								--var45.field1182; // L: 3448
								if (var45.field1182 == 0) { // L: 3449
									var45.field1213 = null;
								}
							}
						}

						for (var2 = 0; var2 < npcCount; ++var2) { // L: 3452
							var3 = npcIndices[var2]; // L: 3453
							NPC var39 = npcs[var3]; // L: 3454
							if (var39 != null && var39.field1182 > 0) { // L: 3455
								--var39.field1182; // L: 3456
								if (var39.field1182 == 0) { // L: 3457
									var39.field1213 = null;
								}
							}
						}

						++field702; // L: 3461
						if (mouseCrossColor != 0) { // L: 3462
							mouseCrossState = mouseCrossState * 400 + 20; // L: 3463
							if (mouseCrossState * 400 >= 400) { // L: 3464
								mouseCrossColor = 0;
							}
						}

						Widget var35 = WorldMapScaleHandler.mousedOverWidgetIf1; // L: 3466
						Widget var37 = class403.field4519; // L: 3467
						WorldMapScaleHandler.mousedOverWidgetIf1 = null; // L: 3468
						class403.field4519 = null; // L: 3469
						draggedOnWidget = null; // L: 3470
						field809 = false; // L: 3471
						field761 = false; // L: 3472
						field752 = 0; // L: 3473

						while (field750.method4162() && field752 < 128) { // L: 3474
							if (staffModLevel >= 2 && field750.method4151(82) && field750.field2330 == 66) { // L: 3475
								StringBuilder var40 = new StringBuilder(); // L: 3478

								Message var36;
								for (Iterator var43 = Messages.Messages_hashTable.iterator(); var43.hasNext(); var40.append(var36.text).append('\n')) { // L: 3479 3485
									var36 = (Message)var43.next(); // L: 3480
									if (var36.sender != null && !var36.sender.isEmpty()) { // L: 3482
										var40.append(var36.sender).append(':'); // L: 3483
									}
								}

								String var46 = var40.toString(); // L: 3488
								TileItem.client.method620(var46); // L: 3491
							} else if (oculusOrbState != 1 || field750.field2329 <= 0) { // L: 3494
								field754[field752] = field750.field2330; // L: 3497
								field753[field752] = field750.field2329; // L: 3498
								++field752; // L: 3499
							}
						}

						if (class158.method3322() && field750.method4151(82) && field750.method4151(81) && mouseWheelRotation != 0) { // L: 3501
							var3 = class136.localPlayer.plane - mouseWheelRotation; // L: 3502
							if (var3 < 0) { // L: 3503
								var3 = 0;
							} else if (var3 > 3) { // L: 3504
								var3 = 3;
							}

							if (var3 != class136.localPlayer.plane) { // L: 3505
								var4 = class136.localPlayer.pathX[0] + AbstractArchive.baseX * 64; // L: 3506
								var5 = class136.localPlayer.pathY[0] + class148.baseY * 64; // L: 3507
								var18 = class503.getPacketBufferNode(ClientPacket.field3165, packetWriter.isaacCipher); // L: 3510
								var18.packetBuffer.method9138(0); // L: 3511
								var18.packetBuffer.writeIntME(var4); // L: 3512
								var18.packetBuffer.method9188(var3); // L: 3513
								var18.packetBuffer.method9126(var5); // L: 3514
								packetWriter.addNode(var18); // L: 3515
							}

							mouseWheelRotation = 0; // L: 3518
						}

						if (MouseHandler.MouseHandler_lastButton == 1) { // L: 3520
							field612.method4119(); // L: 3521
						}

						if (rootInterface != -1) { // L: 3523
							class10.updateRootInterface(rootInterface, 0, 0, GrandExchangeOfferTotalQuantityComparator.canvasWidth, WorldMapArchiveLoader.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3524

						while (true) {
							Widget var42;
							Widget var44;
							ScriptEvent var47;
							do {
								var47 = (ScriptEvent)field728.removeLast(); // L: 3526
								if (var47 == null) { // L: 3527
									while (true) {
										do {
											var47 = (ScriptEvent)field729.removeLast(); // L: 3538
											if (var47 == null) { // L: 3539
												while (true) {
													do {
														var47 = (ScriptEvent)scriptEvents.removeLast(); // L: 3550
														if (var47 == null) { // L: 3551
															while (true) {
																class212 var49 = (class212)field810.removeLast(); // L: 3562
																if (var49 == null) { // L: 3563
																	this.menu(); // L: 3566
																	if (class127.worldMap != null) { // L: 3568
																		class127.worldMap.method8541(class36.Client_plane, AbstractArchive.baseX * 64 + (class136.localPlayer.x >> 7), class148.baseY * 64 + (class136.localPlayer.y >> 7), false); // L: 3569
																		class127.worldMap.loadCache(); // L: 3570
																	}

																	if (clickedWidget != null) { // L: 3573
																		this.method1294();
																	}

																	if (Scene.shouldSendWalk()) { // L: 3574
																		var3 = Scene.Scene_selectedX; // L: 3575
																		var4 = Scene.Scene_selectedY; // L: 3576
																		PacketBufferNode var48 = class503.getPacketBufferNode(ClientPacket.field3188, packetWriter.isaacCipher); // L: 3578
																		var48.packetBuffer.writeByte(5); // L: 3579
																		var48.packetBuffer.writeShort(AbstractArchive.baseX * 64 + var3); // L: 3580
																		var48.packetBuffer.method9188(field750.method4151(82) ? (field750.method4151(81) ? 2 : 1) : 0); // L: 3581
																		var48.packetBuffer.method9143(class148.baseY * 64 + var4); // L: 3582
																		packetWriter.addNode(var48); // L: 3583
																		Scene.method4601(); // L: 3584
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3585
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3586
																		mouseCrossColor = 1; // L: 3587
																		mouseCrossState = 0; // L: 3588
																		destinationX = var3; // L: 3589
																		destinationY = var4; // L: 3590
																	}

																	if (var35 != WorldMapScaleHandler.mousedOverWidgetIf1) { // L: 3592
																		if (var35 != null) { // L: 3593
																			class200.invalidateWidget(var35);
																		}

																		if (WorldMapScaleHandler.mousedOverWidgetIf1 != null) { // L: 3594
																			class200.invalidateWidget(WorldMapScaleHandler.mousedOverWidgetIf1);
																		}
																	}

																	if (var37 != class403.field4519 && field676 == field675) { // L: 3596
																		if (var37 != null) { // L: 3597
																			class200.invalidateWidget(var37);
																		}

																		if (class403.field4519 != null) { // L: 3598
																			class200.invalidateWidget(class403.field4519);
																		}
																	}

																	if (class403.field4519 != null) { // L: 3600
																		if (field675 < field676) { // L: 3601
																			++field675; // L: 3602
																			if (field676 == field675) { // L: 3603
																				class200.invalidateWidget(class403.field4519);
																			}
																		}
																	} else if (field675 > 0) { // L: 3606
																		--field675;
																	}

																	if (oculusOrbState == 0) { // L: 3608
																		var3 = class136.localPlayer.x; // L: 3609
																		var4 = class136.localPlayer.y; // L: 3610
																		if (class467.oculusOrbFocalPointX - var3 < -500 || class467.oculusOrbFocalPointX - var3 > 500 || class36.oculusOrbFocalPointY - var4 < -500 || class36.oculusOrbFocalPointY - var4 > 500) { // L: 3611
																			class467.oculusOrbFocalPointX = var3; // L: 3612
																			class36.oculusOrbFocalPointY = var4; // L: 3613
																		}

																		if (var3 != class467.oculusOrbFocalPointX) { // L: 3615
																			class467.oculusOrbFocalPointX += (var3 - class467.oculusOrbFocalPointX) / 16;
																		}

																		if (var4 != class36.oculusOrbFocalPointY) { // L: 3616
																			class36.oculusOrbFocalPointY += (var4 - class36.oculusOrbFocalPointY) / 16;
																		}

																		var5 = class467.oculusOrbFocalPointX >> 7; // L: 3617
																		var6 = class36.oculusOrbFocalPointY >> 7; // L: 3618
																		var7 = class306.getTileHeight(class467.oculusOrbFocalPointX, class36.oculusOrbFocalPointY, class36.Client_plane); // L: 3619
																		var8 = 0; // L: 3620
																		if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) { // L: 3621
																			for (var9 = var5 - 4; var9 <= var5 + 4; ++var9) { // L: 3622
																				for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) { // L: 3623
																					var11 = class36.Client_plane; // L: 3624
																					if (var11 < 3 && (Tiles.Tiles_renderFlags[1][var9][var10] & 2) == 2) { // L: 3625
																						++var11;
																					}

																					var12 = var7 - Tiles.Tiles_heights[var11][var9][var10]; // L: 3626
																					if (var12 > var8) { // L: 3627
																						var8 = var12;
																					}
																				}
																			}
																		}

																		var9 = var8 * 192; // L: 3631
																		if (var9 > 98048) { // L: 3632
																			var9 = 98048;
																		}

																		if (var9 < 32768) { // L: 3633
																			var9 = 32768;
																		}

																		if (var9 > field616) { // L: 3634
																			field616 += (var9 - field616) / 24;
																		} else if (var9 < field616) { // L: 3635
																			field616 += (var9 - field616) / 80;
																		}

																		class90.field1108 = class306.getTileHeight(class136.localPlayer.x, class136.localPlayer.y, class36.Client_plane) - camFollowHeight; // L: 3636
																	} else if (oculusOrbState == 1) { // L: 3638
																		Bounds.method8206(); // L: 3639
																		short var29 = -1; // L: 3640
																		if (field750.method4151(33)) { // L: 3641
																			var29 = 0;
																		} else if (field750.method4151(49)) { // L: 3642
																			var29 = 1024;
																		}

																		if (field750.method4151(48)) { // L: 3643
																			if (var29 == 0) { // L: 3644
																				var29 = 1792;
																			} else if (var29 == 1024) { // L: 3645
																				var29 = 1280;
																			} else {
																				var29 = 1536; // L: 3646
																			}
																		} else if (field750.method4151(50)) { // L: 3648
																			if (var29 == 0) { // L: 3649
																				var29 = 256;
																			} else if (var29 == 1024) { // L: 3650
																				var29 = 768;
																			} else {
																				var29 = 512; // L: 3651
																			}
																		}

																		byte var28 = 0; // L: 3653
																		if (field750.method4151(35)) { // L: 3654
																			var28 = -1;
																		} else if (field750.method4151(51)) { // L: 3655
																			var28 = 1;
																		}

																		var5 = 0; // L: 3656
																		if (var29 >= 0 || var28 != 0) { // L: 3657
																			var5 = field750.method4151(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed; // L: 3658
																			var5 *= 16; // L: 3659
																			field608 = var29; // L: 3660
																			field609 = var28; // L: 3661
																		}

																		if (field583 < var5) { // L: 3663
																			field583 += var5 / 8; // L: 3664
																			if (field583 > var5) { // L: 3665
																				field583 = var5;
																			}
																		} else if (field583 > var5) { // L: 3667
																			field583 = field583 * 9 / 10;
																		}

																		if (field583 > 0) { // L: 3668
																			var6 = field583 / 16; // L: 3669
																			if (field608 >= 0) { // L: 3670
																				var3 = field608 - class456.cameraYaw & 2047; // L: 3671
																				var7 = Rasterizer3D.Rasterizer3D_sine[var3]; // L: 3672
																				var8 = Rasterizer3D.Rasterizer3D_cosine[var3]; // L: 3673
																				class467.oculusOrbFocalPointX += var6 * var7 / 65536; // L: 3674
																				class36.oculusOrbFocalPointY += var8 * var6 / 65536; // L: 3675
																			}

																			if (field609 != 0) { // L: 3677
																				class90.field1108 += var6 * field609; // L: 3678
																				if (class90.field1108 > 0) { // L: 3679
																					class90.field1108 = 0;
																				}
																			}
																		} else {
																			field608 = -1; // L: 3683
																			field609 = -1; // L: 3684
																		}

																		if (field750.method4151(13)) { // L: 3686
																			packetWriter.addNode(class503.getPacketBufferNode(ClientPacket.field3099, packetWriter.isaacCipher)); // L: 3688
																			oculusOrbState = 0; // L: 3689
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && KeyHandler.mouseCam) { // L: 3693
																		var3 = MouseHandler.MouseHandler_y - field817; // L: 3694
																		field602 = var3 * 2; // L: 3695
																		field817 = var3 != -1 && var3 != 1 ? (field817 + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y; // L: 3696
																		var4 = field603 - MouseHandler.MouseHandler_x; // L: 3697
																		field774 = var4 * 2; // L: 3698
																		field603 = var4 != -1 && var4 != 1 ? (field603 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x; // L: 3699
																	} else {
																		if (field750.method4151(96)) { // L: 3702
																			field774 += (-24 - field774) / 2;
																		} else if (field750.method4151(97)) { // L: 3703
																			field774 += (24 - field774) / 2;
																		} else {
																			field774 /= 2; // L: 3704
																		}

																		if (field750.method4151(98)) { // L: 3705
																			field602 += (12 - field602) / 2;
																		} else if (field750.method4151(99)) { // L: 3706
																			field602 += (-12 - field602) / 2;
																		} else {
																			field602 /= 2; // L: 3707
																		}

																		field817 = MouseHandler.MouseHandler_y; // L: 3708
																		field603 = MouseHandler.MouseHandler_x; // L: 3709
																	}

																	camAngleY = field774 / 2 + camAngleY & 2047; // L: 3711
																	camAngleX += field602 / 2; // L: 3712
																	if (camAngleX < 128) { // L: 3713
																		camAngleX = 128;
																	}

																	if (camAngleX > 383) { // L: 3714
																		camAngleX = 383;
																	}

																	if (field781) { // L: 3716
																		class89.method2306(class422.field4606, class406.field4522, ModeWhere.field4410); // L: 3717
																		class184.method3581(class165.field1791, class4.field11); // L: 3718
																		if (class157.cameraX == class422.field4606 && class406.field4522 == class384.cameraY && ModeWhere.field4410 == SoundSystem.cameraZ && class165.field1791 == class19.cameraPitch && class456.cameraYaw == class4.field11) { // L: 3719
																			field781 = false; // L: 3720
																			isCameraLocked = false; // L: 3721
																			field775 = false; // L: 3722
																			field797 = false; // L: 3723
																			Canvas.field124 = 0; // L: 3724
																			class183.field1890 = 0; // L: 3725
																			FontName.field4949 = 0; // L: 3726
																			class18.field95 = 0; // L: 3727
																			class157.field1743 = 0; // L: 3728
																			SecureRandomFuture.field990 = 0; // L: 3729
																			field755 = 0; // L: 3730
																			WorldMapIcon_1.field2870 = 0; // L: 3731
																			class132.field1574 = 0; // L: 3732
																			ModeWhere.field4408 = 0; // L: 3733
																			field778 = null; // L: 3734
																			field643 = null; // L: 3735
																			field779 = null; // L: 3736
																		}
																	} else if (isCameraLocked) { // L: 3739
																		if (!field775) { // L: 3740
																			var3 = WorldMapIcon_1.field2870 * 16384 + 64; // L: 3741
																			var4 = class132.field1574 * 16384 + 64; // L: 3742
																			var5 = class306.getTileHeight(var3, var4, class36.Client_plane) - ModeWhere.field4408; // L: 3743
																			class89.method2306(var3, var5, var4); // L: 3744
																		} else if (field778 != null) { // L: 3746
																			class157.cameraX = field778.vmethod8499(); // L: 3747
																			SoundSystem.cameraZ = field778.vmethod8496(); // L: 3748
																			if (field782) { // L: 3749
																				class384.cameraY = field778.vmethod8497(); // L: 3750
																			} else {
																				class384.cameraY = class306.getTileHeight(class157.cameraX, SoundSystem.cameraZ, class36.Client_plane) - field778.vmethod8497(); // L: 3753
																			}

																			field778.method8506(); // L: 3755
																		}

																		if (!field797) { // L: 3757
																			var3 = Canvas.field124 * 128 + 64; // L: 3758
																			var4 = class183.field1890 * 128 + 64; // L: 3759
																			var5 = class306.getTileHeight(var3, var4, class36.Client_plane) - FontName.field4949; // L: 3760
																			var6 = var3 - class157.cameraX; // L: 3761
																			var7 = var5 - class384.cameraY; // L: 3762
																			var8 = var4 - SoundSystem.cameraZ; // L: 3763
																			var9 = (int)Math.sqrt((double)(var8 * var8 + var6 * var6)); // L: 3764
																			var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.9490051269531D) & 2047; // L: 3765
																			var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.9490051269531D) & 2047; // L: 3766
																			class184.method3581(var10, var11); // L: 3767
																		} else {
																			if (field643 != null) { // L: 3770
																				class19.cameraPitch = field643.method8493(); // L: 3771
																				class19.cameraPitch = Math.min(Math.max(class19.cameraPitch, 128), 383); // L: 3772
																				field643.method8506(); // L: 3773
																			}

																			if (field779 != null) { // L: 3775
																				class456.cameraYaw = field779.method8493() & 2047; // L: 3776
																				field779.method8506(); // L: 3777
																			}
																		}
																	}

																	for (var3 = 0; var3 < 5; ++var3) { // L: 3781
																		var10002 = field771[var3]++;
																	}

																	PendingSpawn.varcs.tryWrite(); // L: 3782
																	var3 = ++MouseHandler.MouseHandler_idleCycles - 1; // L: 3785
																	var5 = class1.method11(); // L: 3788
																	if (var3 > 15000 && var5 > 15000) { // L: 3789
																		logoutTimer = 250; // L: 3790
																		ApproximateRouteStrategy.method1244(14500); // L: 3791
																		var18 = class503.getPacketBufferNode(ClientPacket.field3097, packetWriter.isaacCipher); // L: 3793
																		packetWriter.addNode(var18); // L: 3794
																	}

																	class177.friendSystem.processFriendUpdates(); // L: 3796
																	class146.method3154(); // L: 3797
																	++packetWriter.pendingWrites; // L: 3798
																	if (packetWriter.pendingWrites > 50) { // L: 3799
																		var18 = class503.getPacketBufferNode(ClientPacket.field3123, packetWriter.isaacCipher); // L: 3801
																		packetWriter.addNode(var18); // L: 3802
																	}

																	try {
																		packetWriter.flush(); // L: 3805
																	} catch (IOException var26) { // L: 3807
																		class93.method2369(); // L: 3808
																	}

																	return; // L: 3810
																}

																PacketWriter.method2802(var49); // L: 3564
															}
														}

														var42 = var47.widget; // L: 3552
														if (var42.childIndex < 0) { // L: 3553
															break;
														}

														var44 = VarbitComposition.getWidget(var42.parentId); // L: 3554
													} while(var44 == null || var44.children == null || var42.childIndex >= var44.children.length || var42 != var44.children[var42.childIndex]); // L: 3555

													GrandExchangeOfferOwnWorldComparator.runScriptEvent(var47); // L: 3559
												}
											}

											var42 = var47.widget; // L: 3540
											if (var42.childIndex < 0) { // L: 3541
												break;
											}

											var44 = VarbitComposition.getWidget(var42.parentId); // L: 3542
										} while(var44 == null || var44.children == null || var42.childIndex >= var44.children.length || var42 != var44.children[var42.childIndex]); // L: 3543

										GrandExchangeOfferOwnWorldComparator.runScriptEvent(var47); // L: 3547
									}
								}

								var42 = var47.widget; // L: 3528
								if (var42.childIndex < 0) { // L: 3529
									break;
								}

								var44 = VarbitComposition.getWidget(var42.parentId); // L: 3530
							} while(var44 == null || var44.children == null || var42.childIndex >= var44.children.length || var42 != var44.children[var42.childIndex]); // L: 3531

							GrandExchangeOfferOwnWorldComparator.runScriptEvent(var47); // L: 3535
						}
					}
				}
			}
		}
	} // L: 3118 3439

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "57"
	)
	public void vmethod6017(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) { // L: 3937
			if (var1 > -1 && class150.clientPreferences.method2478() > 0 && !playingJingle) { // L: 3938
				PacketBufferNode var3 = class503.getPacketBufferNode(ClientPacket.field3182, packetWriter.isaacCipher); // L: 3939
				var3.packetBuffer.writeInt(var1); // L: 3940
				packetWriter.addNode(var3); // L: 3941
			}

		}
	} // L: 3943

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2120321682"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GrandExchangeOfferTotalQuantityComparator.canvasWidth; // L: 4593
		int var2 = WorldMapArchiveLoader.canvasHeight; // L: 4594
		if (super.contentWidth < var1) { // L: 4595
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 4596
		}

		if (class150.clientPreferences != null) { // L: 4597
			try {
				class26.method383(TileItem.client, "resize", new Object[]{Huffman.getWindowedMode()}); // L: 4599
			} catch (Throwable var4) { // L: 4601
			}
		}

	} // L: 4603

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1641979157"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) { // L: 4606
			var1 = rootInterface; // L: 4607
			if (Login.loadInterface(var1)) { // L: 4609
				class142.drawModelComponents(ArchiveLoader.Widget_interfaceComponents[var1], -1); // L: 4610
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4613
			if (field718[var1]) { // L: 4614
				field735[var1] = true;
			}

			field736[var1] = field718[var1]; // L: 4615
			field718[var1] = false; // L: 4616
		}

		field528 = cycle; // L: 4618
		viewportX = -1; // L: 4619
		viewportY = -1; // L: 4620
		if (rootInterface != -1) { // L: 4621
			rootWidgetCount = 0; // L: 4622
			class7.drawWidgets(rootInterface, 0, 0, GrandExchangeOfferTotalQuantityComparator.canvasWidth, WorldMapArchiveLoader.canvasHeight, 0, 0, -1); // L: 4623
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4625
		if (showMouseCross) { // L: 4626
			if (mouseCrossColor == 1) { // L: 4627
				class211.field2304[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4628
			}

			if (mouseCrossColor == 2) { // L: 4630
				class211.field2304[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4631
			}
		}

		if (!isMenuOpen) { // L: 4634
			if (viewportX != -1) { // L: 4635
				class335.method6605(viewportX, viewportY);
			}
		} else {
			var1 = Canvas.menuX; // L: 4638
			int var2 = UserComparator6.menuY; // L: 4639
			int var3 = UserComparator5.menuWidth; // L: 4640
			int var4 = ModeWhere.menuHeight; // L: 4641
			int var5 = 6116423; // L: 4642
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5); // L: 4643
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0); // L: 4644
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0); // L: 4645
			Calendar.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1); // L: 4646
			int var6 = MouseHandler.MouseHandler_x; // L: 4647
			int var7 = MouseHandler.MouseHandler_y; // L: 4648

			int var8;
			int var9;
			int var10;
			for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 4649
				var9 = (menuOptionsCount - 1 - var8) * 15 + var2 + 31; // L: 4650
				var10 = 16777215; // L: 4651
				if (var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) { // L: 4652
					var10 = 16776960;
				}

				Font var13 = Calendar.fontBold12; // L: 4653
				String var14;
				if (var8 < 0) { // L: 4656
					var14 = ""; // L: 4657
				} else if (menuTargets[var8].length() > 0) { // L: 4660
					var14 = menuActions[var8] + " " + menuTargets[var8];
				} else {
					var14 = menuActions[var8]; // L: 4661
				}

				var13.draw(var14, var1 + 3, var9, var10, 0); // L: 4663
			}

			var8 = Canvas.menuX; // L: 4665
			var9 = UserComparator6.menuY; // L: 4666
			var10 = UserComparator5.menuWidth; // L: 4667
			int var11 = ModeWhere.menuHeight; // L: 4668

			for (int var12 = 0; var12 < rootWidgetCount; ++var12) { // L: 4670
				if (rootWidgetWidths[var12] + rootWidgetXs[var12] > var8 && rootWidgetXs[var12] < var8 + var10 && rootWidgetYs[var12] + rootWidgetHeights[var12] > var9 && rootWidgetYs[var12] < var11 + var9) { // L: 4671
					field735[var12] = true;
				}
			}
		}

		if (field672 == 3) { // L: 4675
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4676
				if (field736[var1]) { // L: 4677
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4678
				} else if (field735[var1]) { // L: 4680
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4681
				}
			}
		}

		class456.method8366(class36.Client_plane, class136.localPlayer.x, class136.localPlayer.y, field702); // L: 4685
		field702 = 0; // L: 4686
	} // L: 4687

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Leb;IB)Z",
		garbageValue = "84"
	)
	boolean method1523(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 6403
			Canvas.friendsChatManager = null; // L: 6404
		} else {
			if (Canvas.friendsChatManager == null) { // L: 6407
				Canvas.friendsChatManager = new FriendsChatManager(class457.loginType, TileItem.client); // L: 6408
			}

			Canvas.friendsChatManager.method7893(var1.packetBuffer, var2); // L: 6410
		}

		field719 = cycleCntr; // L: 6413
		DynamicObject.FriendsChatManager_inFriendsChat = true; // L: 6414
		var1.serverPacket = null; // L: 6416
		return true; // L: 6417
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Leb;B)Z",
		garbageValue = "46"
	)
	boolean method1287(PacketWriter var1) {
		if (Canvas.friendsChatManager != null) { // L: 6421
			Canvas.friendsChatManager.method7903(var1.packetBuffer); // L: 6422
		}

		field719 = cycleCntr; // L: 6425
		DynamicObject.FriendsChatManager_inFriendsChat = true; // L: 6426
		var1.serverPacket = null; // L: 6428
		return true; // L: 6429
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Leb;I)Z",
		garbageValue = "1827422343"
	)
	final boolean method1288(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6434
		PacketBuffer var3 = var1.packetBuffer; // L: 6435
		if (var2 == null) { // L: 6436
			return false;
		} else {
			String var21;
			int var22;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6438
					if (var1.field1417) { // L: 6439
						if (!var2.isAvailable(1)) { // L: 6440
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6441
						var1.field1423 = 0; // L: 6442
						var1.field1417 = false; // L: 6443
					}

					var3.offset = 0; // L: 6445
					if (var3.method9034()) { // L: 6446
						if (!var2.isAvailable(1)) { // L: 6447
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6448
						var1.field1423 = 0; // L: 6449
					}

					var1.field1417 = true; // L: 6451
					ServerPacket[] var4 = Messages.method2777(); // L: 6452
					var5 = var3.readSmartByteShortIsaac(); // L: 6453
					if (var5 < 0 || var5 >= var4.length) { // L: 6454
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6455
					var1.serverPacketLength = var1.serverPacket.length; // L: 6456
				}

				if (var1.serverPacketLength == -1) { // L: 6458
					if (!var2.isAvailable(1)) { // L: 6459
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6460
					var1.serverPacketLength = var3.array[0] & 255; // L: 6461
				}

				if (var1.serverPacketLength == -2) { // L: 6463
					if (!var2.isAvailable(2)) { // L: 6464
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6465
					var3.offset = 0; // L: 6466
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6467
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6469
					return false;
				}

				var3.offset = 0; // L: 6470
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6471
				var1.field1423 = 0; // L: 6472
				timer.method7737(); // L: 6473
				var1.field1422 = var1.field1421; // L: 6474
				var1.field1421 = var1.field1416; // L: 6475
				var1.field1416 = var1.serverPacket; // L: 6476
				Widget var6;
				int var20;
				if (ServerPacket.field3229 == var1.serverPacket) { // L: 6477
					var20 = var3.method9200(); // L: 6478
					var21 = var3.readStringCp1252NullTerminated(); // L: 6479
					var6 = VarbitComposition.getWidget(var20); // L: 6480
					if (!var21.equals(var6.text)) { // L: 6481
						var6.text = var21; // L: 6482
						class200.invalidateWidget(var6); // L: 6483
					}

					var1.serverPacket = null; // L: 6485
					return true; // L: 6486
				}

				int var7;
				int var8;
				int var11;
				int var57;
				int var59;
				if (ServerPacket.field3253 == var1.serverPacket) { // L: 6488
					var59 = var3.method9120(); // L: 6497
					var22 = var3.method9290(); // L: 6498
					var20 = var22 >> 16; // L: 6499
					var5 = var22 >> 8 & 255; // L: 6500
					var7 = var20 + (var22 >> 4 & 7); // L: 6501
					var8 = var5 + (var22 & 7); // L: 6502
					var57 = var3.readUnsignedShort(); // L: 6503
					var11 = var3.readUnsignedShort(); // L: 6504
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 6505
						var7 = var7 * 128 + 64; // L: 6506
						var8 = var8 * 128 + 64; // L: 6507
						GraphicsObject var61 = new GraphicsObject(var57, class36.Client_plane, var7, var8, class306.getTileHeight(var7, var8, class36.Client_plane) - var59, var11, cycle); // L: 6508
						graphicsObjects.addFirst(var61); // L: 6509
					}

					var1.serverPacket = null; // L: 6511
					return true; // L: 6512
				}

				boolean var23;
				boolean var62;
				int var79;
				if (ServerPacket.field3228 == var1.serverPacket) { // L: 6514
					isCameraLocked = true; // L: 6515
					field781 = false; // L: 6516
					field775 = true; // L: 6517
					WorldMapIcon_1.field2870 = var3.readUnsignedByte() * 128; // L: 6518
					class132.field1574 = var3.readUnsignedByte() * 128; // L: 6519
					var20 = var3.readUnsignedShort(); // L: 6520
					var5 = var3.readUnsignedByte() * 128 + 64; // L: 6521
					var22 = var3.readUnsignedByte() * 128 + 64; // L: 6522
					var7 = var3.readUnsignedShort(); // L: 6523
					field782 = var3.readBoolean(); // L: 6524
					var8 = var3.readUnsignedByte(); // L: 6525
					var57 = WorldMapIcon_1.field2870 * 16384 + 64; // L: 6526
					var59 = class132.field1574 * 16384 + 64; // L: 6527
					var62 = false; // L: 6528
					var23 = false; // L: 6529
					if (field782) { // L: 6530
						var11 = class384.cameraY; // L: 6531
						var79 = class306.getTileHeight(var57, var59, class36.Client_plane) - var20; // L: 6532
					} else {
						var11 = class306.getTileHeight(class157.cameraX, SoundSystem.cameraZ, class36.Client_plane) - class384.cameraY; // L: 6535
						var79 = var20; // L: 6536
					}

					field778 = new class477(class157.cameraX, SoundSystem.cameraZ, var11, var57, var59, var79, var5, var22, var7, var8); // L: 6538
					var1.serverPacket = null; // L: 6539
					return true; // L: 6540
				}

				if (ServerPacket.field3333 == var1.serverPacket) { // L: 6542
					var22 = var3.method9119(); // L: 6546
					var20 = var3.method9087(); // L: 6547
					var5 = var3.method9087(); // L: 6548
					if (var5 == 65535) { // L: 6549
						var5 = -1; // L: 6550
					}

					NPC var86 = npcs[var20]; // L: 6552
					if (var86 != null) { // L: 6553
						if (var5 == var86.sequence && var5 != -1) { // L: 6554
							var8 = class135.SequenceDefinition_get(var5).field2274; // L: 6555
							if (var8 == 1) { // L: 6556
								var86.sequenceFrame = 0; // L: 6557
								var86.sequenceFrameCycle = 0; // L: 6558
								var86.sequenceDelay = var22; // L: 6559
								var86.field1199 = 0; // L: 6560
							} else if (var8 == 2) { // L: 6562
								var86.field1199 = 0; // L: 6563
							}
						} else if (var5 == -1 || var86.sequence == -1 || class135.SequenceDefinition_get(var5).field2258 >= class135.SequenceDefinition_get(var86.sequence).field2258) { // L: 6566
							var86.sequence = var5; // L: 6567
							var86.sequenceFrame = 0; // L: 6568
							var86.sequenceFrameCycle = 0; // L: 6569
							var86.sequenceDelay = var22; // L: 6570
							var86.field1199 = 0; // L: 6571
							var86.field1257 = var86.pathLength; // L: 6572
						}
					}

					var1.serverPacket = null; // L: 6576
					return true; // L: 6577
				}

				if (ServerPacket.field3243 == var1.serverPacket) { // L: 6579
					class508.method9006(); // L: 6580
					var20 = var3.method9142(); // L: 6581
					var5 = var3.readUnsignedByte(); // L: 6582
					var22 = var3.method9120(); // L: 6583
					experience[var22] = var20; // L: 6584
					currentLevels[var22] = var5; // L: 6585
					levels[var22] = 1; // L: 6586

					for (var7 = 0; var7 < 98; ++var7) { // L: 6587
						if (var20 >= Skills.Skills_experienceTable[var7]) {
							levels[var22] = var7 + 2;
						}
					}

					field713[++field711 - 1 & 31] = var22; // L: 6588
					var1.serverPacket = null; // L: 6589
					return true; // L: 6590
				}

				if (ServerPacket.field3258 == var1.serverPacket) { // L: 6592
					for (var20 = 0; var20 < players.length; ++var20) { // L: 6593
						if (players[var20] != null) { // L: 6594
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) { // L: 6596
						if (npcs[var20] != null) { // L: 6597
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 6599
					return true; // L: 6600
				}

				if (ServerPacket.field3315 == var1.serverPacket) { // L: 6602
					var20 = var3.readUnsignedByte(); // L: 6603
					GrandExchangeEvents.forceDisconnect(var20); // L: 6604
					var1.serverPacket = null; // L: 6605
					return false; // L: 6606
				}

				String var64;
				if (ServerPacket.field3225 == var1.serverPacket) { // L: 6608
					byte[] var54 = new byte[var1.serverPacketLength]; // L: 6609
					var3.method9060(var54, 0, var54.length); // L: 6610
					Buffer var83 = new Buffer(var54); // L: 6611
					var64 = var83.readStringCp1252NullTerminated(); // L: 6612
					NPC.openURL(var64, true, false); // L: 6613
					var1.serverPacket = null; // L: 6614
					return true; // L: 6615
				}

				Widget var78;
				if (ServerPacket.field3326 == var1.serverPacket) { // L: 6617
					var20 = var3.method9142(); // L: 6618
					var78 = VarbitComposition.getWidget(var20); // L: 6619
					var78.modelType = 3; // L: 6620
					var78.modelId = class136.localPlayer.appearance.getChatHeadId(); // L: 6621
					class200.invalidateWidget(var78); // L: 6622
					var1.serverPacket = null; // L: 6623
					return true; // L: 6624
				}

				if (ServerPacket.field3231 == var1.serverPacket) { // L: 6626
					class27.method408(class296.field3201); // L: 6627
					var1.serverPacket = null; // L: 6628
					return true; // L: 6629
				}

				if (ServerPacket.field3220 == var1.serverPacket) { // L: 6631
					var7 = var3.method9130(); // L: 6637
					var5 = var3.method9130(); // L: 6638
					var8 = var3.readUnsignedShort(); // L: 6639
					var22 = var3.method9116(); // L: 6640
					var20 = var3.method9116(); // L: 6641
					if (var20 == 65535) { // L: 6642
						var20 = -1; // L: 6643
					}

					ArrayList var84 = new ArrayList(); // L: 6645
					var84.add(var20); // L: 6646
					ObjectComposition.method3963(var84, var5, var22, var7, var8); // L: 6647
					var1.serverPacket = null; // L: 6648
					return true; // L: 6649
				}

				int var15;
				int var69;
				if (ServerPacket.field3318 == var1.serverPacket) { // L: 6651
					isCameraLocked = true; // L: 6652
					field781 = false; // L: 6653
					field797 = true; // L: 6654
					Canvas.field124 = var3.readUnsignedByte() * 16384; // L: 6655
					class183.field1890 = var3.readUnsignedByte() * 16384; // L: 6656
					FontName.field4949 = var3.readUnsignedShort(); // L: 6657
					var20 = var3.readUnsignedShort(); // L: 6658
					var5 = var3.readUnsignedByte(); // L: 6659
					var22 = Canvas.field124 * 128 + 64; // L: 6660
					var7 = class183.field1890 * 128 + 64; // L: 6661
					var8 = class306.getTileHeight(var22, var7, class36.Client_plane) - FontName.field4949; // L: 6662
					var57 = var22 - class157.cameraX; // L: 6663
					var59 = var8 - class384.cameraY; // L: 6664
					var11 = var7 - SoundSystem.cameraZ; // L: 6665
					double var85 = Math.sqrt((double)(var11 * var11 + var57 * var57)); // L: 6666
					var69 = class74.method2088((int)(Math.atan2((double)var59, var85) * 325.9490051269531D) & 2047); // L: 6667
					var15 = class4.method18((int)(Math.atan2((double)var57, (double)var11) * -325.9490051269531D) & 2047); // L: 6668
					field643 = new class479(class19.cameraPitch, var69, var20, var5); // L: 6669
					field779 = new class479(class456.cameraYaw, var15, var20, var5); // L: 6670
					var1.serverPacket = null; // L: 6671
					return true; // L: 6672
				}

				if (ServerPacket.field3313 == var1.serverPacket) { // L: 6674
					var1.serverPacket = null; // L: 6675
					return true; // L: 6676
				}

				if (ServerPacket.field3319 == var1.serverPacket) { // L: 6678
					isCameraLocked = true; // L: 6679
					field781 = false; // L: 6680
					field797 = true; // L: 6681
					var20 = var3.readShort(); // L: 6682
					var5 = var3.readShort(); // L: 6683
					var22 = class74.method2088(var5 + class19.cameraPitch & 2027); // L: 6684
					var7 = var20 + class456.cameraYaw; // L: 6685
					var8 = var3.readUnsignedShort(); // L: 6686
					var57 = var3.readUnsignedByte(); // L: 6687
					field643 = new class479(class19.cameraPitch, var22, var8, var57); // L: 6688
					field779 = new class479(class456.cameraYaw, var7, var8, var57); // L: 6689
					var1.serverPacket = null; // L: 6690
					return true; // L: 6691
				}

				if (ServerPacket.field3279 == var1.serverPacket) { // L: 6693
					isCameraLocked = true; // L: 6694
					field781 = false; // L: 6695
					field797 = false; // L: 6696
					Canvas.field124 = var3.readUnsignedByte() * 16384; // L: 6697
					class183.field1890 = var3.readUnsignedByte() * 16384; // L: 6698
					FontName.field4949 = var3.readUnsignedShort(); // L: 6699
					class18.field95 = var3.readUnsignedByte(); // L: 6700
					class157.field1743 = var3.readUnsignedByte(); // L: 6701
					if (class157.field1743 >= 100) { // L: 6702
						var20 = Canvas.field124 * 128 + 64; // L: 6703
						var5 = class183.field1890 * 128 + 64; // L: 6704
						var22 = class306.getTileHeight(var20, var5, class36.Client_plane) - FontName.field4949; // L: 6705
						var7 = var20 - class157.cameraX; // L: 6706
						var8 = var22 - class384.cameraY; // L: 6707
						var57 = var5 - SoundSystem.cameraZ; // L: 6708
						var59 = (int)Math.sqrt((double)(var7 * var7 + var57 * var57)); // L: 6709
						class19.cameraPitch = (int)(Math.atan2((double)var8, (double)var59) * 325.9490051269531D) & 2047; // L: 6710
						class456.cameraYaw = (int)(Math.atan2((double)var7, (double)var57) * -325.9490051269531D) & 2047; // L: 6711
						if (class19.cameraPitch < 128) { // L: 6712
							class19.cameraPitch = 128;
						}

						if (class19.cameraPitch > 383) { // L: 6713
							class19.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 6715
					return true; // L: 6716
				}

				if (ServerPacket.field3307 == var1.serverPacket) { // L: 6718
					var20 = var3.method9087(); // L: 6719
					var5 = var3.readInt(); // L: 6720
					var22 = var20 >> 10 & 31; // L: 6721
					var7 = var20 >> 5 & 31; // L: 6722
					var8 = var20 & 31; // L: 6723
					var57 = (var7 << 11) + (var22 << 19) + (var8 << 3); // L: 6724
					Widget var90 = VarbitComposition.getWidget(var5); // L: 6725
					if (var57 != var90.color) { // L: 6726
						var90.color = var57; // L: 6727
						class200.invalidateWidget(var90); // L: 6728
					}

					var1.serverPacket = null; // L: 6730
					return true; // L: 6731
				}

				if (ServerPacket.field3219 == var1.serverPacket) { // L: 6733
					class508.method9006(); // L: 6734
					weight = var3.readShort(); // L: 6735
					field724 = cycleCntr; // L: 6736
					var1.serverPacket = null; // L: 6737
					return true; // L: 6738
				}

				boolean var87;
				if (ServerPacket.field3252 == var1.serverPacket) { // L: 6740
					var87 = var3.readUnsignedByte() == 1; // L: 6741
					if (var87) { // L: 6742
						VerticalAlignment.field2049 = class113.method2835() - var3.readLong(); // L: 6743
						KeyHandler.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 6744
					} else {
						KeyHandler.grandExchangeEvents = null; // L: 6746
					}

					field723 = cycleCntr; // L: 6747
					var1.serverPacket = null; // L: 6748
					return true; // L: 6749
				}

				if (ServerPacket.field3270 == var1.serverPacket) { // L: 6751
					return this.method1523(var1, 1); // L: 6752
				}

				if (ServerPacket.field3223 == var1.serverPacket) { // L: 6754
					var20 = var3.readInt(); // L: 6755
					if (var20 != field624) { // L: 6756
						field624 = var20; // L: 6757
						UserComparator7.method2871(); // L: 6758
					}

					var1.serverPacket = null; // L: 6760
					return true; // L: 6761
				}

				if (ServerPacket.field3221 == var1.serverPacket && isCameraLocked) { // L: 6763 6764
					field781 = true; // L: 6765
					field797 = false; // L: 6766
					field775 = false; // L: 6767

					for (var20 = 0; var20 < 5; ++var20) { // L: 6768
						field618[var20] = false; // L: 6769
					}

					var1.serverPacket = null; // L: 6771
					return true; // L: 6772
				}

				if (ServerPacket.field3273 == var1.serverPacket) { // L: 6775
					var20 = var3.method9148(); // L: 6776
					var5 = var3.readInt(); // L: 6777
					var6 = VarbitComposition.getWidget(var5); // L: 6778
					if (var20 != var6.sequenceId || var20 == -1) { // L: 6779
						var6.sequenceId = var20; // L: 6780
						var6.modelFrame = 0; // L: 6781
						var6.modelFrameCycle = 0; // L: 6782
						class200.invalidateWidget(var6); // L: 6783
					}

					var1.serverPacket = null; // L: 6785
					return true; // L: 6786
				}

				long var26;
				long var29;
				long var31;
				long var33;
				String var36;
				String var52;
				if (ServerPacket.field3292 == var1.serverPacket) { // L: 6788
					var52 = var3.readStringCp1252NullTerminated(); // L: 6789
					var29 = var3.readLong(); // L: 6790
					var31 = (long)var3.readUnsignedShort(); // L: 6791
					var33 = (long)var3.readMedium(); // L: 6792
					PlayerType var91 = (PlayerType)ClientPreferences.findEnumerated(PendingSpawn.PlayerType_values(), var3.readUnsignedByte()); // L: 6793
					var26 = (var31 << 32) + var33; // L: 6794
					boolean var70 = false; // L: 6795

					for (var15 = 0; var15 < 100; ++var15) { // L: 6796
						if (field748[var15] == var26) { // L: 6797
							var70 = true; // L: 6798
							break; // L: 6799
						}
					}

					if (var91.isUser && class177.friendSystem.isIgnored(new Username(var52, class457.loginType))) { // L: 6802 6803
						var70 = true;
					}

					if (!var70 && field637 == 0) { // L: 6805
						field748[field640] = var26; // L: 6806
						field640 = (field640 + 1) % 100; // L: 6807
						var36 = AbstractFont.escapeBrackets(class153.method3218(class292.method5720(var3))); // L: 6808
						if (var91.modIcon != -1) { // L: 6809
							class213.addChatMessage(9, SecureRandomCallable.method2253(var91.modIcon) + var52, var36, class170.base37DecodeLong(var29));
						} else {
							class213.addChatMessage(9, var52, var36, class170.base37DecodeLong(var29)); // L: 6810
						}
					}

					var1.serverPacket = null; // L: 6812
					return true; // L: 6813
				}

				if (ServerPacket.field3334 == var1.serverPacket) { // L: 6815
					var5 = var3.method9130(); // L: 6818
					var20 = var3.method9130(); // L: 6819
					RouteStrategy.method4227(var20, var5); // L: 6820
					var1.serverPacket = null; // L: 6821
					return true; // L: 6822
				}

				if (ServerPacket.field3316 == var1.serverPacket) { // L: 6824
					WorldMapScaleHandler.logOut(); // L: 6825
					var1.serverPacket = null; // L: 6826
					return false; // L: 6827
				}

				if (ServerPacket.field3271 == var1.serverPacket) { // L: 6829
					var20 = var3.readUShortSmart(); // L: 6830
					boolean var81 = var3.readUnsignedByte() == 1; // L: 6831
					var64 = ""; // L: 6832
					boolean var67 = false; // L: 6833
					if (var81) { // L: 6834
						var64 = var3.readStringCp1252NullTerminated(); // L: 6835
						if (class177.friendSystem.isIgnored(new Username(var64, class457.loginType))) { // L: 6836
							var67 = true;
						}
					}

					String var97 = var3.readStringCp1252NullTerminated(); // L: 6838
					if (!var67) { // L: 6839
						class415.addGameMessage(var20, var64, var97);
					}

					var1.serverPacket = null; // L: 6840
					return true; // L: 6841
				}

				if (ServerPacket.field3268 == var1.serverPacket) { // L: 6843
					var20 = var3.method9336(); // L: 6844
					var5 = var3.readUnsignedShort(); // L: 6845
					var6 = VarbitComposition.getWidget(var20); // L: 6846
					if (var6 != null && var6.type == 0) { // L: 6847
						if (var5 > var6.scrollHeight - var6.height) { // L: 6848
							var5 = var6.scrollHeight - var6.height;
						}

						if (var5 < 0) { // L: 6849
							var5 = 0;
						}

						if (var5 != var6.scrollY) { // L: 6850
							var6.scrollY = var5; // L: 6851
							class200.invalidateWidget(var6); // L: 6852
						}
					}

					var1.serverPacket = null; // L: 6855
					return true; // L: 6856
				}

				if (ServerPacket.field3295 == var1.serverPacket) { // L: 6858
					field781 = false; // L: 6859
					isCameraLocked = false; // L: 6860
					field775 = false; // L: 6861
					field797 = false; // L: 6862
					Canvas.field124 = 0; // L: 6863
					class183.field1890 = 0; // L: 6864
					FontName.field4949 = 0; // L: 6865
					field782 = false; // L: 6866
					class18.field95 = 0; // L: 6867
					class157.field1743 = 0; // L: 6868
					SecureRandomFuture.field990 = 0; // L: 6869
					field755 = 0; // L: 6870
					WorldMapIcon_1.field2870 = 0; // L: 6871
					class132.field1574 = 0; // L: 6872
					ModeWhere.field4408 = 0; // L: 6873
					field778 = null; // L: 6874
					field643 = null; // L: 6875
					field779 = null; // L: 6876

					for (var20 = 0; var20 < 5; ++var20) { // L: 6877
						field618[var20] = false; // L: 6878
					}

					var1.serverPacket = null; // L: 6880
					return true; // L: 6881
				}

				if (ServerPacket.field3224 == var1.serverPacket) { // L: 6883
					class27.method408(class296.field3198); // L: 6884
					var1.serverPacket = null; // L: 6885
					return true; // L: 6886
				}

				if (ServerPacket.field3322 == var1.serverPacket) { // L: 6888
					class27.method408(class296.field3199); // L: 6889
					var1.serverPacket = null; // L: 6890
					return true; // L: 6891
				}

				int var13;
				String var38;
				byte var72;
				if (ServerPacket.field3306 == var1.serverPacket) { // L: 6893
					var72 = var3.readByte(); // L: 6894
					var29 = (long)var3.readUnsignedShort(); // L: 6895
					var31 = (long)var3.readMedium(); // L: 6896
					var33 = var31 + (var29 << 32); // L: 6897
					var62 = false; // L: 6898
					ClanChannel var12 = var72 >= 0 ? currentClanChannels[var72] : WorldMapLabelSize.guestClanChannel; // L: 6899
					if (var12 == null) { // L: 6900
						var62 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 6902
							if (var33 == field748[var13]) { // L: 6903
								var62 = true; // L: 6904
								break; // L: 6905
							}
						}
					}

					if (!var62) { // L: 6909
						field748[field640] = var33; // L: 6910
						field640 = (field640 + 1) % 100; // L: 6911
						var38 = class292.method5720(var3); // L: 6912
						var69 = var72 >= 0 ? 43 : 46; // L: 6913
						class213.addChatMessage(var69, "", var38, var12.name); // L: 6914
					}

					var1.serverPacket = null; // L: 6916
					return true; // L: 6917
				}

				int var16;
				if (ServerPacket.field3237 == var1.serverPacket) { // L: 6919
					byte var68 = var3.readByte(); // L: 6935
					int var18 = var3.method9119(); // L: 6936
					int var17 = var3.readUnsignedByte(); // L: 6937
					var69 = var3.readUnsignedByte() * 4; // L: 6938
					byte var63 = var3.method9122(); // L: 6939
					var13 = var3.method9120() * 4; // L: 6940
					var22 = var3.method9290(); // L: 6941
					var20 = var22 >> 16; // L: 6942
					var5 = var22 >> 8 & 255; // L: 6943
					var7 = var20 + (var22 >> 4 & 7); // L: 6944
					var8 = var5 + (var22 & 7); // L: 6945
					var11 = var3.method9170(); // L: 6946
					var79 = var3.method9130(); // L: 6947
					var16 = var3.method9116(); // L: 6948
					var15 = var3.method9130(); // L: 6949
					var57 = var68 + var7; // L: 6950
					var59 = var63 + var8; // L: 6951
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var57 >= 0 && var59 >= 0 && var57 < 104 && var59 < 104 && var79 != 65535) { // L: 6952
						var7 = var7 * 128 + 64; // L: 6953
						var8 = var8 * 128 + 64; // L: 6954
						var57 = var57 * 128 + 64; // L: 6955
						var59 = var59 * 128 + 64; // L: 6956
						Projectile var19 = new Projectile(var79, class36.Client_plane, var7, var8, class306.getTileHeight(var7, var8, class36.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var69); // L: 6957
						var19.setDestination(var57, var59, class306.getTileHeight(var57, var59, class36.Client_plane) - var69, var15 + cycle); // L: 6958
						projectiles.addFirst(var19); // L: 6959
					}

					var1.serverPacket = null; // L: 6961
					return true; // L: 6962
				}

				InterfaceParent var82;
				if (ServerPacket.field3217 == var1.serverPacket) { // L: 6964
					var20 = var3.offset + var1.serverPacketLength; // L: 6965
					var5 = var3.readUnsignedShort(); // L: 6966
					if (var5 == 65535) { // L: 6967
						var5 = -1;
					}

					var22 = var3.readUnsignedShort(); // L: 6968
					if (var5 != rootInterface) { // L: 6969
						rootInterface = var5; // L: 6970
						this.resizeRoot(false); // L: 6971
						class92.Widget_resetModelFrames(rootInterface); // L: 6972
						ScriptFrame.runWidgetOnLoadListener(rootInterface); // L: 6973

						for (var7 = 0; var7 < 100; ++var7) { // L: 6974
							field718[var7] = true;
						}
					}

					InterfaceParent var89;
					for (; var22-- > 0; var89.field1065 = true) { // L: 6976 6986
						var7 = var3.readInt(); // L: 6977
						var8 = var3.readUnsignedShort(); // L: 6978
						var57 = var3.readUnsignedByte(); // L: 6979
						var89 = (InterfaceParent)interfaceParents.get((long)var7); // L: 6980
						if (var89 != null && var8 != var89.group) { // L: 6981
							Actor.closeInterface(var89, true); // L: 6982
							var89 = null; // L: 6983
						}

						if (var89 == null) { // L: 6985
							var89 = WorldMapLabelSize.method5085(var7, var8, var57);
						}
					}

					for (var82 = (InterfaceParent)interfaceParents.first(); var82 != null; var82 = (InterfaceParent)interfaceParents.next()) { // L: 6988
						if (var82.field1065) { // L: 6989
							var82.field1065 = false;
						} else {
							Actor.closeInterface(var82, true); // L: 6991
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6994

					while (var3.offset < var20) { // L: 6995
						var7 = var3.readInt(); // L: 6996
						var8 = var3.readUnsignedShort(); // L: 6997
						var57 = var3.readUnsignedShort(); // L: 6998
						var59 = var3.readInt(); // L: 6999

						for (var11 = var8; var11 <= var57; ++var11) { // L: 7000
							var26 = ((long)var7 << 32) + (long)var11; // L: 7001
							widgetFlags.put(new IntegerNode(var59), var26); // L: 7002
						}
					}

					var1.serverPacket = null; // L: 7005
					return true; // L: 7006
				}

				if (ServerPacket.field3303 == var1.serverPacket) { // L: 7008
					return this.method1523(var1, 2); // L: 7009
				}

				if (ServerPacket.field3310 == var1.serverPacket) { // L: 7011
					var20 = var3.readInt(); // L: 7012
					var78 = VarbitComposition.getWidget(var20); // L: 7013

					for (var22 = 0; var22 < var78.itemIds.length; ++var22) { // L: 7014
						var78.itemIds[var22] = -1; // L: 7015
						var78.itemIds[var22] = 0; // L: 7016
					}

					class200.invalidateWidget(var78); // L: 7018
					var1.serverPacket = null; // L: 7019
					return true; // L: 7020
				}

				if (ServerPacket.field3324 == var1.serverPacket) { // L: 7022
					class450.method8229(var3.readStringCp1252NullTerminated()); // L: 7023
					var1.serverPacket = null; // L: 7024
					return true; // L: 7025
				}

				if (ServerPacket.field3285 == var1.serverPacket) { // L: 7027
					var20 = var3.method9087(); // L: 7033
					Player var94;
					if (var20 == localPlayerIndex) { // L: 7034
						var94 = class136.localPlayer; // L: 7035
					} else {
						var94 = players[var20]; // L: 7038
					}

					var7 = var3.readUnsignedByte(); // L: 7040
					var5 = var3.method9130(); // L: 7041
					var22 = var3.method9142(); // L: 7042
					if (var94 != null) { // L: 7043
						var94.method2399(var7, var5, var22 >> 16, var22 & 65535); // L: 7044
					}

					var1.serverPacket = null; // L: 7046
					return true; // L: 7047
				}

				if (ServerPacket.field3276 == var1.serverPacket) { // L: 7049
					var3.offset += 28; // L: 7050
					if (var3.checkCrc()) { // L: 7051
						class403.method7630(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 7052
					return true; // L: 7053
				}

				if (ServerPacket.field3320 == var1.serverPacket) { // L: 7055
					var52 = var3.readStringCp1252NullTerminated(); // L: 7056
					Object[] var77 = new Object[var52.length() + 1]; // L: 7057

					for (var22 = var52.length() - 1; var22 >= 0; --var22) { // L: 7058
						if (var52.charAt(var22) == 's') { // L: 7059
							var77[var22 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var77[var22 + 1] = new Integer(var3.readInt()); // L: 7060
						}
					}

					var77[0] = new Integer(var3.readInt()); // L: 7062
					ScriptEvent var66 = new ScriptEvent(); // L: 7063
					var66.args = var77; // L: 7064
					GrandExchangeOfferOwnWorldComparator.runScriptEvent(var66); // L: 7065
					var1.serverPacket = null; // L: 7066
					return true; // L: 7067
				}

				if (ServerPacket.field3248 == var1.serverPacket) { // L: 7069
					var87 = var3.readBoolean(); // L: 7070
					if (var87) { // L: 7071
						if (UserComparator7.field1455 == null) { // L: 7072
							UserComparator7.field1455 = new class370();
						}
					} else {
						UserComparator7.field1455 = null; // L: 7074
					}

					var1.serverPacket = null; // L: 7075
					return true; // L: 7076
				}

				if (ServerPacket.field3283 == var1.serverPacket) { // L: 7078
					if (rootInterface != -1) { // L: 7079
						ChatChannel.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 7080
					return true; // L: 7081
				}

				Widget var80;
				if (ServerPacket.field3244 == var1.serverPacket) { // L: 7083
					var20 = var3.method9087(); // L: 7084
					if (var20 == 65535) { // L: 7085
						var20 = -1;
					}

					var5 = var3.method9336(); // L: 7086
					var22 = var3.method9336(); // L: 7087
					var80 = VarbitComposition.getWidget(var5); // L: 7088
					ItemComposition var93;
					if (!var80.isIf3) { // L: 7089
						if (var20 == -1) { // L: 7090
							var80.modelType = 0; // L: 7091
							var1.serverPacket = null; // L: 7092
							return true; // L: 7093
						}

						var93 = class125.ItemComposition_get(var20).getCountObj(var22); // L: 7095
						var80.modelType = 4; // L: 7096
						var80.modelId = var20; // L: 7097
						var80.modelAngleX = var93.xan2d; // L: 7098
						var80.modelAngleY = var93.yan2d; // L: 7099
						var80.modelZoom = var93.zoom2d * 100 / var22; // L: 7100
						class200.invalidateWidget(var80); // L: 7101
					} else {
						var80.itemId = var20; // L: 7104
						var80.itemQuantity = var22; // L: 7105
						var93 = class125.ItemComposition_get(var20).getCountObj(var22); // L: 7106
						var80.modelAngleX = var93.xan2d; // L: 7107
						var80.modelAngleY = var93.yan2d; // L: 7108
						var80.modelAngleZ = var93.zan2d; // L: 7109
						var80.modelOffsetX = var93.offsetX2d; // L: 7110
						var80.modelOffsetY = var93.offsetY2d; // L: 7111
						var80.modelZoom = var93.zoom2d; // L: 7112
						if (var93.isStackable == 1) { // L: 7113
							var80.itemQuantityMode = 1;
						} else {
							var80.itemQuantityMode = 2; // L: 7114
						}

						if (var80.field3679 > 0) { // L: 7115
							var80.modelZoom = var80.modelZoom * 32 / var80.field3679;
						} else if (var80.rawWidth > 0) { // L: 7116
							var80.modelZoom = var80.modelZoom * 32 / var80.rawWidth;
						}

						class200.invalidateWidget(var80); // L: 7117
					}

					var1.serverPacket = null; // L: 7119
					return true; // L: 7120
				}

				if (ServerPacket.field3277 == var1.serverPacket) { // L: 7122
					var20 = var3.method9087(); // L: 7123
					var5 = var3.method9336(); // L: 7124
					var22 = var3.method9087(); // L: 7125
					var80 = VarbitComposition.getWidget(var5); // L: 7126
					var80.field3680 = var20 + (var22 << 16); // L: 7127
					var1.serverPacket = null; // L: 7128
					return true; // L: 7129
				}

				if (ServerPacket.field3288 == var1.serverPacket) { // L: 7131
					hintArrowType = var3.readUnsignedByte(); // L: 7132
					if (hintArrowType == 1) { // L: 7133
						field696 = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 7134
						if (hintArrowType == 2) { // L: 7135
							field542 = 64; // L: 7136
							field543 = 4096; // L: 7137
						}

						if (hintArrowType == 3) { // L: 7139
							field542 = 0; // L: 7140
							field543 = 4096; // L: 7141
						}

						if (hintArrowType == 4) { // L: 7143
							field542 = 128; // L: 7144
							field543 = 4096; // L: 7145
						}

						if (hintArrowType == 5) { // L: 7147
							field542 = 64; // L: 7148
							field543 = 0; // L: 7149
						}

						if (hintArrowType == 6) { // L: 7151
							field542 = 64; // L: 7152
							field543 = 8192; // L: 7153
						}

						hintArrowType = 2; // L: 7155
						field539 = var3.readUnsignedShort(); // L: 7156
						field607 = var3.readUnsignedShort(); // L: 7157
						field541 = var3.readUnsignedByte() * 2; // L: 7158
					}

					if (hintArrowType == 10) { // L: 7160
						field538 = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 7161
					return true; // L: 7162
				}

				if (ServerPacket.field3242 == var1.serverPacket) { // L: 7164
					var20 = var3.readInt(); // L: 7165
					InterfaceParent var76 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7166
					if (var76 != null) { // L: 7167
						Actor.closeInterface(var76, true);
					}

					if (meslayerContinueWidget != null) { // L: 7168
						class200.invalidateWidget(meslayerContinueWidget); // L: 7169
						meslayerContinueWidget = null; // L: 7170
					}

					var1.serverPacket = null; // L: 7172
					return true; // L: 7173
				}

				if (ServerPacket.field3314 == var1.serverPacket) { // L: 7175
					class135.field1600 = new class455(class344.Ignored_cached); // L: 7176
					var1.serverPacket = null; // L: 7177
					return true; // L: 7178
				}

				if (ServerPacket.field3257 == var1.serverPacket) { // L: 7180
					class387.field4440 = var3.readUnsignedByte(); // L: 7181
					WorldMapSectionType.field2978 = var3.readUnsignedByte(); // L: 7182
					var1.serverPacket = null; // L: 7183
					return true; // L: 7184
				}

				if (ServerPacket.field3235 == var1.serverPacket) { // L: 7186
					isCameraLocked = true; // L: 7187
					field781 = false; // L: 7188
					field797 = true; // L: 7189
					var20 = class4.method18(var3.readShort() & 2027); // L: 7190
					var5 = class74.method2088(var3.readShort() & 2027); // L: 7191
					var22 = var3.readUnsignedShort(); // L: 7192
					var7 = var3.readUnsignedByte(); // L: 7193
					field643 = new class479(class19.cameraPitch, var5, var22, var7); // L: 7194
					field779 = new class479(class456.cameraYaw, var20, var22, var7); // L: 7195
					var1.serverPacket = null; // L: 7196
					return true; // L: 7197
				}

				if (ServerPacket.field3298 == var1.serverPacket) { // L: 7199
					if (class135.field1600 == null) { // L: 7200
						class135.field1600 = new class455(class344.Ignored_cached);
					}

					class522 var53 = class344.Ignored_cached.method8355(var3); // L: 7201
					class135.field1600.field4768.vmethod8804(var53.field5135, var53.field5134); // L: 7202
					field715[++field793 - 1 & 31] = var53.field5135; // L: 7203
					var1.serverPacket = null; // L: 7204
					return true; // L: 7205
				}

				if (ServerPacket.field3215 == var1.serverPacket) { // L: 7207
					var57 = var3.method9089(); // L: 7218
					var59 = var57 >> 2; // L: 7219
					var11 = var57 & 3; // L: 7220
					var79 = field591[var59]; // L: 7221
					var13 = var3.readUnsignedShort(); // L: 7222
					var22 = var3.readMedium(); // L: 7223
					var20 = var22 >> 16; // L: 7224
					var5 = var22 >> 8 & 255; // L: 7225
					var7 = var20 + (var22 >> 4 & 7); // L: 7226
					var8 = var5 + (var22 & 7); // L: 7227
					if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) { // L: 7228
						if (var79 == 0) { // L: 7229
							WallObject var99 = UserComparator5.scene.method4581(class36.Client_plane, var7, var8); // L: 7230
							if (var99 != null) { // L: 7231
								var15 = class458.Entity_unpackID(var99.tag); // L: 7232
								if (var59 == 2) { // L: 7233
									var99.renderable1 = new DynamicObject(var15, 2, var11 + 4, class36.Client_plane, var7, var8, var13, false, var99.renderable1); // L: 7234
									var99.renderable2 = new DynamicObject(var15, 2, var11 + 1 & 3, class36.Client_plane, var7, var8, var13, false, var99.renderable2); // L: 7235
								} else {
									var99.renderable1 = new DynamicObject(var15, var59, var11, class36.Client_plane, var7, var8, var13, false, var99.renderable1); // L: 7237
								}
							}
						} else if (var79 == 1) { // L: 7240
							DecorativeObject var98 = UserComparator5.scene.method4616(class36.Client_plane, var7, var8); // L: 7241
							if (var98 != null) { // L: 7242
								var15 = class458.Entity_unpackID(var98.tag); // L: 7243
								if (var59 != 4 && var59 != 5) { // L: 7244
									if (var59 == 6) { // L: 7247
										var98.renderable1 = new DynamicObject(var15, 4, var11 + 4, class36.Client_plane, var7, var8, var13, false, var98.renderable1); // L: 7248
									} else if (var59 == 7) { // L: 7250
										var98.renderable1 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, class36.Client_plane, var7, var8, var13, false, var98.renderable1); // L: 7251
									} else if (var59 == 8) { // L: 7253
										var98.renderable1 = new DynamicObject(var15, 4, var11 + 4, class36.Client_plane, var7, var8, var13, false, var98.renderable1); // L: 7254
										var98.renderable2 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, class36.Client_plane, var7, var8, var13, false, var98.renderable2); // L: 7255
									}
								} else {
									var98.renderable1 = new DynamicObject(var15, 4, var11, class36.Client_plane, var7, var8, var13, false, var98.renderable1); // L: 7245
								}
							}
						} else if (var79 == 2) { // L: 7259
							GameObject var95 = UserComparator5.scene.getGameObject(class36.Client_plane, var7, var8); // L: 7260
							if (var59 == 11) { // L: 7261
								var59 = 10; // L: 7262
							}

							if (var95 != null) { // L: 7264
								var95.renderable = new DynamicObject(class458.Entity_unpackID(var95.tag), var59, var11, class36.Client_plane, var7, var8, var13, false, var95.renderable); // L: 7265
							}
						} else if (var79 == 3) { // L: 7268
							GroundObject var96 = UserComparator5.scene.getGroundObject(class36.Client_plane, var7, var8); // L: 7269
							if (var96 != null) { // L: 7270
								var96.renderable = new DynamicObject(class458.Entity_unpackID(var96.tag), 22, var11, class36.Client_plane, var7, var8, var13, false, var96.renderable); // L: 7271
							}
						}
					}

					var1.serverPacket = null; // L: 7275
					return true; // L: 7276
				}

				if (ServerPacket.field3336 == var1.serverPacket) { // L: 7278
					var5 = var3.readUnsignedShort(); // L: 7283
					var7 = var3.readUnsignedShort(); // L: 7284
					var20 = var3.method9087(); // L: 7285
					var22 = var3.method9087(); // L: 7286
					class452.method8324(var20, var5, var22, var7); // L: 7287
					var1.serverPacket = null; // L: 7288
					return true; // L: 7289
				}

				if (ServerPacket.field3222 == var1.serverPacket) { // L: 7291
					var20 = var3.method9120(); // L: 7292
					var5 = var3.method9120(); // L: 7293
					var64 = var3.readStringCp1252NullTerminated(); // L: 7294
					if (var20 >= 1 && var20 <= 8) { // L: 7295
						if (var64.equalsIgnoreCase("null")) { // L: 7296
							var64 = null;
						}

						playerMenuActions[var20 - 1] = var64; // L: 7297
						playerOptionsPriorities[var20 - 1] = var5 == 0; // L: 7298
					}

					var1.serverPacket = null; // L: 7300
					return true; // L: 7301
				}

				if (ServerPacket.field3335 == var1.serverPacket) { // L: 7303
					var20 = var3.method9120(); // L: 7304
					var5 = var3.method9116(); // L: 7305
					if (var5 == 65535) { // L: 7306
						var5 = -1; // L: 7307
					}

					WorldMapSectionType.performPlayerAnimation(class136.localPlayer, var5, var20); // L: 7309
					var1.serverPacket = null; // L: 7310
					return true; // L: 7311
				}

				if (ServerPacket.field3251 == var1.serverPacket) { // L: 7313
					class27.method408(class296.field3194); // L: 7314
					var1.serverPacket = null; // L: 7315
					return true; // L: 7316
				}

				if (ServerPacket.field3329 == var1.serverPacket) { // L: 7318
					var20 = var3.readUnsignedShort(); // L: 7319
					var5 = var3.method9200(); // L: 7320
					var6 = VarbitComposition.getWidget(var5); // L: 7321
					if (var6.modelType != 6 || var20 != var6.modelId) { // L: 7322
						var6.modelType = 6; // L: 7323
						var6.modelId = var20; // L: 7324
						class200.invalidateWidget(var6); // L: 7325
					}

					var1.serverPacket = null; // L: 7327
					return true; // L: 7328
				}

				if (ServerPacket.field3304 == var1.serverPacket) { // L: 7330
					destinationX = var3.readUnsignedByte(); // L: 7331
					if (destinationX == 255) { // L: 7332
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 7333
					if (destinationY == 255) { // L: 7334
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 7335
					return true; // L: 7336
				}

				if (ServerPacket.field3311 == var1.serverPacket) { // L: 7338
					field622 = cycleCntr; // L: 7339
					var72 = var3.readByte(); // L: 7340
					class160 var75 = new class160(var3); // L: 7341
					ClanChannel var60;
					if (var72 >= 0) { // L: 7343
						var60 = currentClanChannels[var72];
					} else {
						var60 = WorldMapLabelSize.guestClanChannel; // L: 7344
					}

					var75.method3339(var60); // L: 7345
					var1.serverPacket = null; // L: 7346
					return true; // L: 7347
				}

				if (ServerPacket.field3301 == var1.serverPacket) { // L: 7349
					var8 = var3.method9130(); // L: 7356
					var5 = var3.readUnsignedShort(); // L: 7357
					if (var5 == 65535) { // L: 7358
						var5 = -1; // L: 7359
					}

					var20 = var3.method9116(); // L: 7361
					if (var20 == 65535) { // L: 7362
						var20 = -1; // L: 7363
					}

					var57 = var3.readUnsignedShort(); // L: 7365
					var7 = var3.method9116(); // L: 7366
					var22 = var3.method9130(); // L: 7367
					ArrayList var88 = new ArrayList(); // L: 7368
					var88.add(var20); // L: 7369
					var88.add(var5); // L: 7370
					ObjectComposition.method3963(var88, var22, var7, var8, var57); // L: 7371
					var1.serverPacket = null; // L: 7372
					return true; // L: 7373
				}

				if (ServerPacket.field3272 == var1.serverPacket) { // L: 7375
					var20 = var3.readInt(); // L: 7376
					var5 = var3.readUnsignedShort(); // L: 7377
					if (var20 < -70000) { // L: 7378
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 7380
						var6 = VarbitComposition.getWidget(var20);
					} else {
						var6 = null; // L: 7381
					}

					if (var6 != null) { // L: 7382
						for (var7 = 0; var7 < var6.itemIds.length; ++var7) { // L: 7383
							var6.itemIds[var7] = 0; // L: 7384
							var6.field3755[var7] = 0; // L: 7385
						}
					}

					GrandExchangeOfferNameComparator.clearItemContainer(var5); // L: 7388
					var7 = var3.readUnsignedShort(); // L: 7389

					for (var8 = 0; var8 < var7; ++var8) { // L: 7390
						var57 = var3.method9089(); // L: 7391
						if (var57 == 255) { // L: 7392
							var57 = var3.readInt();
						}

						var59 = var3.method9087(); // L: 7393
						if (var6 != null && var8 < var6.itemIds.length) { // L: 7394 7395
							var6.itemIds[var8] = var59; // L: 7396
							var6.field3755[var8] = var57; // L: 7397
						}

						ObjectComposition.itemContainerSetItem(var5, var8, var59 - 1, var57); // L: 7400
					}

					if (var6 != null) { // L: 7402
						class200.invalidateWidget(var6);
					}

					class508.method9006(); // L: 7403
					field807[++field686 - 1 & 31] = var5 & 32767; // L: 7404
					var1.serverPacket = null; // L: 7405
					return true; // L: 7406
				}

				if (ServerPacket.field3294 == var1.serverPacket) { // L: 7408
					var87 = this.username() == null; // L: 7409
					class85.updatePlayers(var3, var1.serverPacketLength); // L: 7410
					WorldMapSectionType.method5467(); // L: 7411
					if (var87 && this.username() != null && this.username().method9741().equalsIgnoreCase("nin")) { // L: 7412
						class415.addGameMessage(4, "", "$jmod_luck = true"); // L: 7413
					}

					var1.serverPacket = null; // L: 7415
					return true; // L: 7416
				}

				if (ServerPacket.field3331 == var1.serverPacket) { // L: 7418
					var72 = var3.readByte(); // L: 7419
					var21 = var3.readStringCp1252NullTerminated(); // L: 7420
					long var40 = (long)var3.readUnsignedShort(); // L: 7421
					long var42 = (long)var3.readMedium(); // L: 7422
					PlayerType var28 = (PlayerType)ClientPreferences.findEnumerated(PendingSpawn.PlayerType_values(), var3.readUnsignedByte()); // L: 7423
					long var44 = var42 + (var40 << 32); // L: 7424
					boolean var65 = false; // L: 7425
					ClanChannel var39 = null; // L: 7426
					var39 = var72 >= 0 ? currentClanChannels[var72] : WorldMapLabelSize.guestClanChannel; // L: 7428
					if (var39 == null) { // L: 7429
						var65 = true; // L: 7430
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var28.isUser && class177.friendSystem.isIgnored(new Username(var21, class457.loginType))) { // L: 7439 7440
									var65 = true;
								}
								break;
							}

							if (var44 == field748[var15]) { // L: 7434
								var65 = true; // L: 7435
								break; // L: 7436
							}

							++var15; // L: 7433
						}
					}

					if (!var65) { // L: 7443
						field748[field640] = var44; // L: 7444
						field640 = (field640 + 1) % 100; // L: 7445
						var36 = AbstractFont.escapeBrackets(class292.method5720(var3)); // L: 7446
						var16 = var72 >= 0 ? 41 : 44; // L: 7447
						if (var28.modIcon != -1) { // L: 7448
							class213.addChatMessage(var16, SecureRandomCallable.method2253(var28.modIcon) + var21, var36, var39.name);
						} else {
							class213.addChatMessage(var16, var21, var36, var39.name); // L: 7449
						}
					}

					var1.serverPacket = null; // L: 7451
					return true; // L: 7452
				}

				if (ServerPacket.field3305 == var1.serverPacket) { // L: 7454
					var20 = var3.method9130(); // L: 7455
					if (var20 == 65535) { // L: 7456
						var20 = -1;
					}

					var5 = var3.method9142(); // L: 7457
					var22 = var3.method9087(); // L: 7458
					if (var22 == 65535) { // L: 7459
						var22 = -1;
					}

					var7 = var3.method9142(); // L: 7460

					for (var8 = var20; var8 <= var22; ++var8) { // L: 7461
						var33 = (long)var8 + ((long)var7 << 32); // L: 7462
						Node var35 = widgetFlags.get(var33); // L: 7463
						if (var35 != null) { // L: 7464
							var35.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var33); // L: 7465
					}

					var1.serverPacket = null; // L: 7467
					return true; // L: 7468
				}

				if (ServerPacket.field3284 == var1.serverPacket) { // L: 7470
					var20 = var3.method9200(); // L: 7471
					var5 = var3.readInt(); // L: 7472
					var6 = VarbitComposition.getWidget(var20); // L: 7473
					UserComparator9.method2889(var6, var5); // L: 7474
					class200.invalidateWidget(var6); // L: 7475
					var1.serverPacket = null; // L: 7476
					return true; // L: 7477
				}

				if (ServerPacket.field3275 == var1.serverPacket) { // L: 7479
					var20 = var3.method9336(); // L: 7480
					var5 = var3.method9116(); // L: 7481
					var6 = VarbitComposition.getWidget(var20); // L: 7482
					if (var6.modelType != 1 || var5 != var6.modelId) { // L: 7483
						var6.modelType = 1; // L: 7484
						var6.modelId = var5; // L: 7485
						class200.invalidateWidget(var6); // L: 7486
					}

					var1.serverPacket = null; // L: 7488
					return true; // L: 7489
				}

				if (ServerPacket.field3256 == var1.serverPacket) { // L: 7491
					class177.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 7492
					field763 = cycleCntr; // L: 7493
					var1.serverPacket = null; // L: 7494
					return true; // L: 7495
				}

				if (ServerPacket.field3274 == var1.serverPacket) { // L: 7497
					var20 = var3.readInt(); // L: 7498
					var5 = var3.readUnsignedByte(); // L: 7499
					var22 = var3.method9130(); // L: 7500
					var82 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7501
					if (var82 != null) { // L: 7502
						Actor.closeInterface(var82, var22 != var82.group);
					}

					WorldMapLabelSize.method5085(var20, var22, var5); // L: 7503
					var1.serverPacket = null; // L: 7504
					return true; // L: 7505
				}

				if (ServerPacket.field3255 == var1.serverPacket) { // L: 7507
					tradeChatMode = var3.method9119(); // L: 7508
					publicChatMode = var3.method9120(); // L: 7509
					var1.serverPacket = null; // L: 7510
					return true; // L: 7511
				}

				if (ServerPacket.field3289 == var1.serverPacket) { // L: 7513
					for (var20 = 0; var20 < VarpDefinition.field1904; ++var20) { // L: 7514
						VarpDefinition var74 = class158.VarpDefinition_get(var20); // L: 7515
						if (var74 != null) { // L: 7516
							Varps.Varps_temp[var20] = 0; // L: 7517
							Varps.Varps_main[var20] = 0; // L: 7518
						}
					}

					class508.method9006(); // L: 7521
					field710 += 32; // L: 7522
					var1.serverPacket = null; // L: 7523
					return true; // L: 7524
				}

				if (ServerPacket.field3332 == var1.serverPacket) { // L: 7526
					var87 = var3.method9119() == 1; // L: 7527
					var5 = var3.method9336(); // L: 7528
					var6 = VarbitComposition.getWidget(var5); // L: 7529
					WorldMapManager.method5373(var6, class136.localPlayer.appearance, var87); // L: 7530
					class200.invalidateWidget(var6); // L: 7531
					var1.serverPacket = null; // L: 7532
					return true; // L: 7533
				}

				if (ServerPacket.field3246 == var1.serverPacket) { // L: 7535
					var20 = var3.method9119(); // L: 7536
					var5 = var3.method9089(); // L: 7537
					var22 = var3.method9200(); // L: 7538
					var80 = VarbitComposition.getWidget(var22); // L: 7539
					class310.method6007(var80, var5, var20); // L: 7540
					class200.invalidateWidget(var80); // L: 7541
					var1.serverPacket = null; // L: 7542
					return true; // L: 7543
				}

				if (ServerPacket.field3232 == var1.serverPacket) { // L: 7545
					var20 = var3.readInt(); // L: 7546
					var5 = var3.method9089(); // L: 7547
					var6 = VarbitComposition.getWidget(var20); // L: 7548
					TaskHandler.method3518(var6, class136.localPlayer.appearance.field3563, var5); // L: 7549
					class200.invalidateWidget(var6); // L: 7550
					var1.serverPacket = null; // L: 7551
					return true; // L: 7552
				}

				if (ServerPacket.field3267 == var1.serverPacket) { // L: 7554
					var20 = var3.readUnsignedShort(); // L: 7555
					if (var20 == 65535) { // L: 7556
						var20 = -1;
					}

					WorldMapSectionType.playSong(var20); // L: 7557
					var1.serverPacket = null; // L: 7558
					return true; // L: 7559
				}

				if (ServerPacket.field3260 == var1.serverPacket) { // L: 7561
					var20 = var3.method9134(); // L: 7562
					var5 = var3.method9130(); // L: 7563
					if (var5 == 65535) { // L: 7564
						var5 = -1;
					}

					Interpreter.method1995(var5, var20); // L: 7565
					var1.serverPacket = null; // L: 7566
					return true; // L: 7567
				}

				if (ServerPacket.field3238 == var1.serverPacket) { // L: 7569
					class14.privateChatMode = class228.method4513(var3.readUnsignedByte()); // L: 7570
					var1.serverPacket = null; // L: 7571
					return true; // L: 7572
				}

				if (ServerPacket.field3299 == var1.serverPacket) { // L: 7574
					field622 = cycleCntr; // L: 7575
					var72 = var3.readByte(); // L: 7576
					if (var1.serverPacketLength == 1) { // L: 7577
						if (var72 >= 0) { // L: 7578
							currentClanChannels[var72] = null;
						} else {
							WorldMapLabelSize.guestClanChannel = null; // L: 7579
						}

						var1.serverPacket = null; // L: 7580
						return true; // L: 7581
					}

					if (var72 >= 0) { // L: 7583
						currentClanChannels[var72] = new ClanChannel(var3); // L: 7584
					} else {
						WorldMapLabelSize.guestClanChannel = new ClanChannel(var3); // L: 7587
					}

					var1.serverPacket = null; // L: 7589
					return true; // L: 7590
				}

				if (ServerPacket.field3278 == var1.serverPacket) { // L: 7592
					var20 = var3.readUnsignedByte(); // L: 7593
					if (var3.readUnsignedByte() == 0) { // L: 7594
						grandExchangeOffers[var20] = new GrandExchangeOffer(); // L: 7595
						var3.offset += 18; // L: 7596
					} else {
						--var3.offset; // L: 7599
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false); // L: 7600
					}

					field721 = cycleCntr; // L: 7602
					var1.serverPacket = null; // L: 7603
					return true; // L: 7604
				}

				if (ServerPacket.field3249 == var1.serverPacket) { // L: 7606
					class27.method408(class296.field3200); // L: 7607
					var1.serverPacket = null; // L: 7608
					return true; // L: 7609
				}

				if (ServerPacket.field3327 == var1.serverPacket) { // L: 7611
					class27.method408(class296.field3193); // L: 7612
					var1.serverPacket = null; // L: 7613
					return true; // L: 7614
				}

				if (ServerPacket.field3308 == var1.serverPacket) { // L: 7616
					Tile.method4401(); // L: 7617
					var72 = var3.readByte(); // L: 7618
					class146 var73 = new class146(var3); // L: 7619
					ClanSettings var56;
					if (var72 >= 0) { // L: 7621
						var56 = currentClanSettings[var72];
					} else {
						var56 = class11.guestClanSettings; // L: 7622
					}

					var73.method3159(var56); // L: 7623
					var1.serverPacket = null; // L: 7624
					return true; // L: 7625
				}

				if (ServerPacket.field3245 == var1.serverPacket) { // L: 7627
					var87 = var3.method9089() == 1; // L: 7628
					var5 = var3.method9336(); // L: 7629
					var6 = VarbitComposition.getWidget(var5); // L: 7630
					if (var87 != var6.isHidden) { // L: 7631
						var6.isHidden = var87; // L: 7632
						class200.invalidateWidget(var6); // L: 7633
					}

					var1.serverPacket = null; // L: 7635
					return true; // L: 7636
				}

				Widget var37;
				if (ServerPacket.field3226 == var1.serverPacket) { // L: 7638
					var20 = var3.method9142(); // L: 7639
					var5 = var3.method9336(); // L: 7640
					InterfaceParent var55 = (InterfaceParent)interfaceParents.get((long)var5); // L: 7641
					var82 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7642
					if (var82 != null) { // L: 7643
						Actor.closeInterface(var82, var55 == null || var82.group != var55.group);
					}

					if (var55 != null) { // L: 7644
						var55.remove(); // L: 7645
						interfaceParents.put(var55, (long)var20); // L: 7646
					}

					var37 = VarbitComposition.getWidget(var5); // L: 7648
					if (var37 != null) { // L: 7649
						class200.invalidateWidget(var37);
					}

					var37 = VarbitComposition.getWidget(var20); // L: 7650
					if (var37 != null) { // L: 7651
						class200.invalidateWidget(var37); // L: 7652
						SoundCache.revalidateWidgetScroll(ArchiveLoader.Widget_interfaceComponents[var37.id >>> 16], var37, true); // L: 7653
					}

					if (rootInterface != -1) { // L: 7655
						ChatChannel.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 7656
					return true; // L: 7657
				}

				if (ServerPacket.field3287 == var1.serverPacket) { // L: 7659
					var20 = var3.method9148(); // L: 7660
					var5 = var3.method9142(); // L: 7661
					var22 = var3.method9131(); // L: 7662
					var80 = VarbitComposition.getWidget(var5); // L: 7663
					if (var20 != var80.rawX || var22 != var80.rawY || var80.xAlignment != 0 || var80.yAlignment != 0) { // L: 7664
						var80.rawX = var20; // L: 7665
						var80.rawY = var22; // L: 7666
						var80.xAlignment = 0; // L: 7667
						var80.yAlignment = 0; // L: 7668
						class200.invalidateWidget(var80); // L: 7669
						this.alignWidget(var80); // L: 7670
						if (var80.type == 0) { // L: 7671
							SoundCache.revalidateWidgetScroll(ArchiveLoader.Widget_interfaceComponents[var5 >> 16], var80, false);
						}
					}

					var1.serverPacket = null; // L: 7673
					return true; // L: 7674
				}

				if (ServerPacket.field3264 == var1.serverPacket) { // L: 7676
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) { // L: 7677
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) { // L: 7678
							Varps.Varps_main[var20] = Varps.Varps_temp[var20]; // L: 7679
							MenuAction.changeGameOptions(var20); // L: 7680
							field709[++field710 - 1 & 31] = var20; // L: 7681
						}
					}

					var1.serverPacket = null; // L: 7684
					return true; // L: 7685
				}

				if (ServerPacket.field3280 == var1.serverPacket) { // L: 7687
					class135.field1600 = null; // L: 7688
					var1.serverPacket = null; // L: 7689
					return true; // L: 7690
				}

				if (ServerPacket.field3259 == var1.serverPacket) { // L: 7692
					var20 = var3.readUnsignedShort(); // L: 7693
					var5 = var3.readUnsignedByte(); // L: 7694
					var22 = var3.readUnsignedShort(); // L: 7695
					class17.queueSoundEffect(var20, var5, var22); // L: 7696
					var1.serverPacket = null; // L: 7697
					return true; // L: 7698
				}

				if (ServerPacket.field3330 == var1.serverPacket) { // L: 7700
					class358.updateNpcs(true, var3); // L: 7701
					var1.serverPacket = null; // L: 7702
					return true; // L: 7703
				}

				if (ServerPacket.field3302 == var1.serverPacket) { // L: 7705
					var20 = var3.readUnsignedByte(); // L: 7706
					FriendsChatManager.method7908(var20); // L: 7707
					var1.serverPacket = null; // L: 7708
					return true; // L: 7709
				}

				NPC var92;
				if (ServerPacket.field3240 == var1.serverPacket) { // L: 7711
					var5 = var3.method9200(); // L: 7717
					var22 = var3.method9116(); // L: 7718
					var20 = var3.method9130(); // L: 7719
					var92 = npcs[var20]; // L: 7720
					var7 = var3.readUnsignedByte(); // L: 7721
					if (var92 != null) { // L: 7722
						var92.method2399(var7, var22, var5 >> 16, var5 & 65535); // L: 7723
					}

					var1.serverPacket = null; // L: 7725
					return true; // L: 7726
				}

				if (ServerPacket.field3216 == var1.serverPacket) { // L: 7728
					class27.method408(class296.field3195); // L: 7729
					var1.serverPacket = null; // L: 7730
					return true; // L: 7731
				}

				if (ServerPacket.field3281 == var1.serverPacket) { // L: 7733
					minimapState = var3.readUnsignedByte(); // L: 7734
					var1.serverPacket = null; // L: 7735
					return true; // L: 7736
				}

				if (ServerPacket.field3230 == var1.serverPacket) { // L: 7738
					return this.method1287(var1); // L: 7739
				}

				if (ServerPacket.field3234 == var1.serverPacket) { // L: 7741
					var52 = var3.readStringCp1252NullTerminated(); // L: 7742
					var21 = AbstractFont.escapeBrackets(class153.method3218(class292.method5720(var3))); // L: 7743
					class415.addGameMessage(6, var52, var21); // L: 7744
					var1.serverPacket = null; // L: 7745
					return true; // L: 7746
				}

				if (ServerPacket.field3218 == var1.serverPacket) { // L: 7748
					var20 = var3.readInt(); // L: 7749
					var5 = var3.readInt(); // L: 7750
					var22 = class27.getGcDuration(); // L: 7751
					PacketBufferNode var24 = class503.getPacketBufferNode(ClientPacket.field3128, packetWriter.isaacCipher); // L: 7753
					var24.packetBuffer.method9244(var22); // L: 7754
					var24.packetBuffer.method9188(GameEngine.fps); // L: 7755
					var24.packetBuffer.method9137(var20); // L: 7756
					var24.packetBuffer.writeInt(var5); // L: 7757
					packetWriter.addNode(var24); // L: 7758
					var1.serverPacket = null; // L: 7759
					return true; // L: 7760
				}

				if (ServerPacket.field3291 == var1.serverPacket) { // L: 7762
					Tile.method4401(); // L: 7763
					var72 = var3.readByte(); // L: 7764
					if (var1.serverPacketLength == 1) { // L: 7765
						if (var72 >= 0) { // L: 7766
							currentClanSettings[var72] = null;
						} else {
							class11.guestClanSettings = null; // L: 7767
						}

						var1.serverPacket = null; // L: 7768
						return true; // L: 7769
					}

					if (var72 >= 0) { // L: 7771
						currentClanSettings[var72] = new ClanSettings(var3); // L: 7772
					} else {
						class11.guestClanSettings = new ClanSettings(var3); // L: 7775
					}

					var1.serverPacket = null; // L: 7777
					return true; // L: 7778
				}

				if (ServerPacket.field3300 == var1.serverPacket) { // L: 7780
					class232.readReflectionCheck(var3, var1.serverPacketLength); // L: 7781
					var1.serverPacket = null; // L: 7782
					return true; // L: 7783
				}

				if (ServerPacket.field3293 == var1.serverPacket) { // L: 7785
					class303.loadRegions(false, var1.packetBuffer); // L: 7786
					var1.serverPacket = null; // L: 7787
					return true; // L: 7788
				}

				if (ServerPacket.field3269 == var1.serverPacket) { // L: 7790
					class303.loadRegions(true, var1.packetBuffer); // L: 7791
					var1.serverPacket = null; // L: 7792
					return true; // L: 7793
				}

				if (ServerPacket.field3262 == var1.serverPacket) { // L: 7795
					var52 = var3.readStringCp1252NullTerminated(); // L: 7796
					var29 = (long)var3.readUnsignedShort(); // L: 7797
					var31 = (long)var3.readMedium(); // L: 7798
					PlayerType var25 = (PlayerType)ClientPreferences.findEnumerated(PendingSpawn.PlayerType_values(), var3.readUnsignedByte()); // L: 7799
					long var46 = (var29 << 32) + var31; // L: 7800
					var23 = false; // L: 7801

					for (var13 = 0; var13 < 100; ++var13) { // L: 7802
						if (var46 == field748[var13]) { // L: 7803
							var23 = true; // L: 7804
							break; // L: 7805
						}
					}

					if (class177.friendSystem.isIgnored(new Username(var52, class457.loginType))) { // L: 7808
						var23 = true;
					}

					if (!var23 && field637 == 0) { // L: 7809
						field748[field640] = var46; // L: 7810
						field640 = (field640 + 1) % 100; // L: 7811
						var38 = AbstractFont.escapeBrackets(class153.method3218(class292.method5720(var3))); // L: 7812
						byte var14;
						if (var25.isPrivileged) { // L: 7814
							var14 = 7;
						} else {
							var14 = 3; // L: 7815
						}

						if (var25.modIcon != -1) { // L: 7816
							class415.addGameMessage(var14, SecureRandomCallable.method2253(var25.modIcon) + var52, var38);
						} else {
							class415.addGameMessage(var14, var52, var38); // L: 7817
						}
					}

					var1.serverPacket = null; // L: 7819
					return true; // L: 7820
				}

				if (ServerPacket.field3309 == var1.serverPacket) { // L: 7822
					World var51 = new World(); // L: 7823
					var51.host = var3.readStringCp1252NullTerminated(); // L: 7824
					var51.id = var3.readUnsignedShort(); // L: 7825
					var5 = var3.readInt(); // L: 7826
					var51.properties = var5; // L: 7827
					if (var51.isDeadman()) { // L: 7828
						var51.field823 = "beta"; // L: 7829
					}

					class129.method2989(45); // L: 7831
					var2.close(); // L: 7832
					var2 = null; // L: 7833
					class137.changeWorld(var51); // L: 7834
					var1.serverPacket = null; // L: 7835
					return false; // L: 7836
				}

				if (ServerPacket.field3312 == var1.serverPacket) { // L: 7838
					class508.method9006(); // L: 7839
					field690 = var3.readUnsignedShort(); // L: 7840
					field724 = cycleCntr; // L: 7841
					var1.serverPacket = null; // L: 7842
					return true; // L: 7843
				}

				if (ServerPacket.field3296 == var1.serverPacket) { // L: 7845
					var20 = var3.method9142(); // L: 7846
					short var58 = (short)var3.method9131(); // L: 7847
					var22 = var3.method9119(); // L: 7848
					var7 = var3.method9087(); // L: 7849
					var92 = npcs[var7]; // L: 7850
					if (var92 != null) { // L: 7851
						var92.method2597(var22, var20, var58); // L: 7852
					}

					var1.serverPacket = null; // L: 7854
					return true; // L: 7855
				}

				if (ServerPacket.field3321 == var1.serverPacket) { // L: 7857
					var20 = var3.method9130(); // L: 7858
					if (var20 == 65535) { // L: 7859
						var20 = -1;
					}

					rootInterface = var20; // L: 7860
					this.resizeRoot(false); // L: 7861
					class92.Widget_resetModelFrames(var20); // L: 7862
					ScriptFrame.runWidgetOnLoadListener(rootInterface); // L: 7863

					for (var5 = 0; var5 < 100; ++var5) { // L: 7864
						field718[var5] = true;
					}

					var1.serverPacket = null; // L: 7865
					return true; // L: 7866
				}

				if (ServerPacket.field3233 == var1.serverPacket) { // L: 7868
					var20 = var3.method9087(); // L: 7869
					class59.method1175(var20); // L: 7870
					field807[++field686 - 1 & 31] = var20 & 32767; // L: 7871
					var1.serverPacket = null; // L: 7872
					return true; // L: 7873
				}

				if (ServerPacket.field3290 == var1.serverPacket) { // L: 7875
					class177.friendSystem.method1865(); // L: 7876
					field763 = cycleCntr; // L: 7877
					var1.serverPacket = null; // L: 7878
					return true; // L: 7879
				}

				if (ServerPacket.field3286 == var1.serverPacket) { // L: 7881
					class27.method408(class296.field3197); // L: 7882
					var1.serverPacket = null; // L: 7883
					return true; // L: 7884
				}

				if (ServerPacket.field3250 == var1.serverPacket) { // L: 7886
					class27.method408(class296.field3202); // L: 7887
					var1.serverPacket = null; // L: 7888
					return true; // L: 7889
				}

				if (ServerPacket.field3328 == var1.serverPacket) { // L: 7891
					class27.method408(class296.field3196); // L: 7892
					var1.serverPacket = null; // L: 7893
					return true; // L: 7894
				}

				if (ServerPacket.field3317 == var1.serverPacket) { // L: 7896
					class387.field4440 = var3.method9089(); // L: 7897
					WorldMapSectionType.field2978 = var3.method9120(); // L: 7898

					while (var3.offset < var1.serverPacketLength) { // L: 7899
						var20 = var3.readUnsignedByte(); // L: 7900
						class296 var71 = ViewportMouse.method4947()[var20]; // L: 7901
						class27.method408(var71); // L: 7902
					}

					var1.serverPacket = null; // L: 7904
					return true; // L: 7905
				}

				if (ServerPacket.field3263 == var1.serverPacket) { // L: 7907
					class177.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 7908
					GameBuild.FriendSystem_invalidateIgnoreds(); // L: 7909
					field763 = cycleCntr; // L: 7910
					var1.serverPacket = null; // L: 7911
					return true; // L: 7912
				}

				if (ServerPacket.field3261 == var1.serverPacket) { // L: 7914
					rebootTimer = var3.method9116() * 30; // L: 7915
					field724 = cycleCntr; // L: 7916
					var1.serverPacket = null; // L: 7917
					return true; // L: 7918
				}

				if (ServerPacket.field3265 == var1.serverPacket) { // L: 7920
					var20 = var3.method9116(); // L: 7921
					var5 = var3.readInt(); // L: 7922
					var22 = var3.method9116(); // L: 7923
					var7 = var3.method9116(); // L: 7924
					var37 = VarbitComposition.getWidget(var5); // L: 7925
					if (var7 != var37.modelAngleX || var20 != var37.modelAngleY || var22 != var37.modelZoom) { // L: 7926
						var37.modelAngleX = var7; // L: 7927
						var37.modelAngleY = var20; // L: 7928
						var37.modelZoom = var22; // L: 7929
						class200.invalidateWidget(var37); // L: 7930
					}

					var1.serverPacket = null; // L: 7932
					return true; // L: 7933
				}

				if (ServerPacket.field3282 == var1.serverPacket) { // L: 7935
					var20 = var3.readInt(); // L: 7936
					var5 = var3.readUnsignedShort(); // L: 7937
					if (var20 < -70000) { // L: 7938
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 7940
						var6 = VarbitComposition.getWidget(var20);
					} else {
						var6 = null; // L: 7941
					}

					for (; var3.offset < var1.serverPacketLength; ObjectComposition.itemContainerSetItem(var5, var7, var8 - 1, var57)) { // L: 7942 7956
						var7 = var3.readUShortSmart(); // L: 7943
						var8 = var3.readUnsignedShort(); // L: 7944
						var57 = 0; // L: 7945
						if (var8 != 0) { // L: 7946
							var57 = var3.readUnsignedByte(); // L: 7947
							if (var57 == 255) { // L: 7948
								var57 = var3.readInt();
							}
						}

						if (var6 != null && var7 >= 0 && var7 < var6.itemIds.length) { // L: 7950 7951
							var6.itemIds[var7] = var8; // L: 7952
							var6.field3755[var7] = var57; // L: 7953
						}
					}

					if (var6 != null) { // L: 7958
						class200.invalidateWidget(var6);
					}

					class508.method9006(); // L: 7959
					field807[++field686 - 1 & 31] = var5 & 32767; // L: 7960
					var1.serverPacket = null; // L: 7961
					return true; // L: 7962
				}

				if (ServerPacket.field3254 == var1.serverPacket) { // L: 7964
					var72 = var3.method9124(); // L: 7965
					var5 = var3.readUnsignedShort(); // L: 7966
					Varps.Varps_temp[var5] = var72; // L: 7967
					if (Varps.Varps_main[var5] != var72) { // L: 7968
						Varps.Varps_main[var5] = var72; // L: 7969
					}

					MenuAction.changeGameOptions(var5); // L: 7971
					field709[++field710 - 1 & 31] = var5; // L: 7972
					var1.serverPacket = null; // L: 7973
					return true; // L: 7974
				}

				if (ServerPacket.field3325 == var1.serverPacket) { // L: 7976
					class27.method408(class296.field3203); // L: 7977
					var1.serverPacket = null; // L: 7978
					return true; // L: 7979
				}

				if (ServerPacket.field3266 == var1.serverPacket) { // L: 7981
					class387.field4440 = var3.readUnsignedByte(); // L: 7982
					WorldMapSectionType.field2978 = var3.readUnsignedByte(); // L: 7983

					for (var20 = WorldMapSectionType.field2978; var20 < WorldMapSectionType.field2978 + 8; ++var20) { // L: 7984
						for (var5 = class387.field4440; var5 < class387.field4440 + 8; ++var5) { // L: 7985
							if (groundItems[class36.Client_plane][var20][var5] != null) { // L: 7986
								groundItems[class36.Client_plane][var20][var5] = null; // L: 7987
								class344.updateItemPile(var20, var5); // L: 7988
							}
						}
					}

					for (PendingSpawn var50 = (PendingSpawn)pendingSpawns.last(); var50 != null; var50 = (PendingSpawn)pendingSpawns.previous()) { // L: 7992 7993 7995
						if (var50.x >= WorldMapSectionType.field2978 && var50.x < WorldMapSectionType.field2978 + 8 && var50.y >= class387.field4440 && var50.y < class387.field4440 + 8 && var50.plane == class36.Client_plane) { // L: 7994
							var50.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 7997
					return true; // L: 7998
				}

				if (ServerPacket.field3241 == var1.serverPacket) { // L: 8000
					var20 = var3.method9087(); // L: 8001
					var5 = var3.method9142(); // L: 8002
					var6 = VarbitComposition.getWidget(var5); // L: 8003
					if (var6.modelType != 2 || var20 != var6.modelId) { // L: 8004
						var6.modelType = 2; // L: 8005
						var6.modelId = var20; // L: 8006
						class200.invalidateWidget(var6); // L: 8007
					}

					var1.serverPacket = null; // L: 8009
					return true; // L: 8010
				}

				if (ServerPacket.field3239 == var1.serverPacket) { // L: 8012
					var20 = var3.readUnsignedByte(); // L: 8013
					var5 = var3.readUnsignedByte(); // L: 8014
					var22 = var3.readUnsignedByte(); // L: 8015
					var7 = var3.readUnsignedByte(); // L: 8016
					field618[var20] = true; // L: 8017
					field783[var20] = var5; // L: 8018
					field784[var20] = var22; // L: 8019
					field785[var20] = var7; // L: 8020
					field771[var20] = 0; // L: 8021
					var1.serverPacket = null; // L: 8022
					return true; // L: 8023
				}

				if (ServerPacket.field3227 == var1.serverPacket) { // L: 8025
					class358.updateNpcs(false, var3); // L: 8026
					var1.serverPacket = null; // L: 8027
					return true; // L: 8028
				}

				if (ServerPacket.field3323 == var1.serverPacket) { // L: 8030
					isCameraLocked = true; // L: 8031
					field781 = false; // L: 8032
					field775 = false; // L: 8033
					WorldMapIcon_1.field2870 = var3.readUnsignedByte() * 128; // L: 8034
					class132.field1574 = var3.readUnsignedByte() * 128; // L: 8035
					ModeWhere.field4408 = var3.readUnsignedShort(); // L: 8036
					field755 = var3.readUnsignedByte(); // L: 8037
					SecureRandomFuture.field990 = var3.readUnsignedByte(); // L: 8038
					if (SecureRandomFuture.field990 >= 100) { // L: 8039
						class157.cameraX = WorldMapIcon_1.field2870 * 16384 + 64; // L: 8040
						SoundSystem.cameraZ = class132.field1574 * 16384 + 64; // L: 8041
						class384.cameraY = class306.getTileHeight(class157.cameraX, SoundSystem.cameraZ, class36.Client_plane) - ModeWhere.field4408; // L: 8042
					}

					var1.serverPacket = null; // L: 8044
					return true; // L: 8045
				}

				if (ServerPacket.field3236 == var1.serverPacket) { // L: 8047
					var20 = var3.method9130(); // L: 8048
					var5 = var3.method9142(); // L: 8049
					Varps.Varps_temp[var20] = var5; // L: 8050
					if (Varps.Varps_main[var20] != var5) { // L: 8051
						Varps.Varps_main[var20] = var5; // L: 8052
					}

					MenuAction.changeGameOptions(var20); // L: 8054
					field709[++field710 - 1 & 31] = var20; // L: 8055
					var1.serverPacket = null; // L: 8056
					return true; // L: 8057
				}

				if (ServerPacket.field3297 == var1.serverPacket) { // L: 8059
					isCameraLocked = true; // L: 8060
					field781 = false; // L: 8061
					field775 = true; // L: 8062
					WorldMapIcon_1.field2870 = var3.readUnsignedByte() * 128; // L: 8063
					class132.field1574 = var3.readUnsignedByte() * 128; // L: 8064
					var20 = var3.readUnsignedShort(); // L: 8065
					var5 = var3.readUnsignedShort(); // L: 8066
					field782 = var3.readBoolean(); // L: 8067
					var22 = var3.readUnsignedByte(); // L: 8068
					var7 = WorldMapIcon_1.field2870 * 16384 + 64; // L: 8069
					var8 = class132.field1574 * 16384 + 64; // L: 8070
					boolean var9 = false; // L: 8071
					boolean var10 = false; // L: 8072
					if (field782) { // L: 8073
						var57 = class384.cameraY; // L: 8074
						var59 = class306.getTileHeight(var7, var8, class36.Client_plane) - var20; // L: 8075
					} else {
						var57 = class306.getTileHeight(class157.cameraX, SoundSystem.cameraZ, class36.Client_plane) - class384.cameraY; // L: 8078
						var59 = var20; // L: 8079
					}

					field778 = new class478(class157.cameraX, SoundSystem.cameraZ, var57, var7, var8, var59, var5, var22); // L: 8081
					var1.serverPacket = null; // L: 8082
					return true; // L: 8083
				}

				class317.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1421 != null ? var1.field1421.id : -1) + "," + (var1.field1422 != null ? var1.field1422.id : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 8085
				WorldMapScaleHandler.logOut(); // L: 8086
			} catch (IOException var48) { // L: 8088
				class93.method2369(); // L: 8089
			} catch (Exception var49) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1421 != null ? var1.field1421.id : -1) + "," + (var1.field1422 != null ? var1.field1422.id : -1) + "," + var1.serverPacketLength + "," + (class136.localPlayer.pathX[0] + AbstractArchive.baseX * 64) + "," + (class136.localPlayer.pathY[0] + class148.baseY * 64) + ","; // L: 8092

				for (var22 = 0; var22 < var1.serverPacketLength && var22 < 50; ++var22) { // L: 8093
					var21 = var21 + var3.array[var22] + ",";
				}

				class317.RunException_sendStackTrace(var21, var49); // L: 8094
				WorldMapScaleHandler.logOut(); // L: 8095
			}

			return true; // L: 8097
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1663377203"
	)
	@Export("menu")
	final void menu() {
		class143.method3139(); // L: 9247
		if (clickedWidget == null) { // L: 9248
			int var1 = MouseHandler.MouseHandler_lastButton; // L: 9249
			int var2;
			if (isMenuOpen) { // L: 9250
				int var3;
				if (var1 != 1 && (KeyHandler.mouseCam || var1 != 4)) { // L: 9251
					var2 = MouseHandler.MouseHandler_x; // L: 9252
					var3 = MouseHandler.MouseHandler_y; // L: 9253
					if (var2 < Canvas.menuX - 10 || var2 > Canvas.menuX + UserComparator5.menuWidth + 10 || var3 < UserComparator6.menuY - 10 || var3 > UserComparator6.menuY + ModeWhere.menuHeight + 10) { // L: 9254
						isMenuOpen = false; // L: 9255
						Skeleton.method4553(Canvas.menuX, UserComparator6.menuY, UserComparator5.menuWidth, ModeWhere.menuHeight); // L: 9256
					}
				}

				if (var1 == 1 || !KeyHandler.mouseCam && var1 == 4) { // L: 9259
					var2 = Canvas.menuX; // L: 9260
					var3 = UserComparator6.menuY; // L: 9261
					int var4 = UserComparator5.menuWidth; // L: 9262
					int var5 = MouseHandler.MouseHandler_lastPressedX; // L: 9263
					int var6 = MouseHandler.MouseHandler_lastPressedY; // L: 9264
					int var7 = -1; // L: 9265

					for (int var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 9266
						int var9 = (menuOptionsCount - 1 - var8) * 15 + var3 + 31; // L: 9267
						if (var5 > var2 && var5 < var2 + var4 && var6 > var9 - 13 && var6 < var9 + 3) { // L: 9268
							var7 = var8;
						}
					}

					if (var7 != -1) { // L: 9270
						SoundCache.method859(var7);
					}

					isMenuOpen = false; // L: 9271
					Skeleton.method4553(Canvas.menuX, UserComparator6.menuY, UserComparator5.menuWidth, ModeWhere.menuHeight); // L: 9272
				}
			} else {
				var2 = class59.method1178(); // L: 9276
				if ((var1 == 1 || !KeyHandler.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) { // L: 9277 9278
					var1 = 2; // L: 9279
				}

				if ((var1 == 1 || !KeyHandler.mouseCam && var1 == 4) && menuOptionsCount > 0) { // L: 9282
					SoundCache.method859(var2); // L: 9283
				}

				if (var1 == 2 && menuOptionsCount > 0) { // L: 9285
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	} // L: 9287

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1989304759"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = class59.method1178(); // L: 9290
		return (field659 && menuOptionsCount > 2 || class127.method2959(var1)) && !menuShiftClick[var1]; // L: 9291
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "14"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		ClanSettings.method3291(var1, var2); // L: 9295
		var1 -= viewportOffsetX; // L: 9296
		var2 -= viewportOffsetY; // L: 9297
		UserComparator5.scene.menuOpen(class36.Client_plane, var1, var2, false); // L: 9298
		isMenuOpen = true; // L: 9299
	} // L: 9300

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-657989898"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface; // L: 11112
		int var3 = GrandExchangeOfferTotalQuantityComparator.canvasWidth; // L: 11113
		int var4 = WorldMapArchiveLoader.canvasHeight; // L: 11114
		if (Login.loadInterface(var2)) { // L: 11116
			class36.resizeInterface(ArchiveLoader.Widget_interfaceComponents[var2], -1, var3, var4, var1); // L: 11117
		}

	} // L: 11119

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Lmt;I)V",
		garbageValue = "1861901325"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : VarbitComposition.getWidget(var1.parentId); // L: 11122
		int var3;
		int var4;
		if (var2 == null) { // L: 11125
			var3 = GrandExchangeOfferTotalQuantityComparator.canvasWidth; // L: 11126
			var4 = WorldMapArchiveLoader.canvasHeight; // L: 11127
		} else {
			var3 = var2.width; // L: 11130
			var4 = var2.height; // L: 11131
		}

		FriendSystem.alignWidgetSize(var1, var3, var4, false); // L: 11133
		class17.alignWidgetPosition(var1, var3, var4); // L: 11134
	} // L: 11135

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-36"
	)
	final void method1294() {
		class200.invalidateWidget(clickedWidget); // L: 12020
		++class130.widgetDragDuration; // L: 12021
		int var1;
		int var2;
		if (field809 && field761) { // L: 12022
			var1 = MouseHandler.MouseHandler_x; // L: 12041
			var2 = MouseHandler.MouseHandler_y; // L: 12042
			var1 -= widgetClickX; // L: 12043
			var2 -= widgetClickY; // L: 12044
			if (var1 < field648) { // L: 12045
				var1 = field648;
			}

			if (var1 + clickedWidget.width > field648 + clickedWidgetParent.width) { // L: 12046
				var1 = field648 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field703) { // L: 12047
				var2 = field703;
			}

			if (var2 + clickedWidget.height > field703 + clickedWidgetParent.height) { // L: 12048
				var2 = field703 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field705; // L: 12049
			int var4 = var2 - field706; // L: 12050
			int var5 = clickedWidget.dragZoneSize; // L: 12051
			if (class130.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 12052 12053
				isDraggingWidget = true; // L: 12054
			}

			int var6 = var1 - field648 + clickedWidgetParent.scrollX; // L: 12057
			int var7 = var2 - field703 + clickedWidgetParent.scrollY; // L: 12058
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 12059
				var8 = new ScriptEvent(); // L: 12060
				var8.widget = clickedWidget; // L: 12061
				var8.mouseX = var6; // L: 12062
				var8.mouseY = var7; // L: 12063
				var8.args = clickedWidget.onDrag; // L: 12064
				GrandExchangeOfferOwnWorldComparator.runScriptEvent(var8); // L: 12065
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 12067
				if (isDraggingWidget) { // L: 12068
					if (clickedWidget.onDragComplete != null) { // L: 12069
						var8 = new ScriptEvent(); // L: 12070
						var8.widget = clickedWidget; // L: 12071
						var8.mouseX = var6; // L: 12072
						var8.mouseY = var7; // L: 12073
						var8.dragTarget = draggedOnWidget; // L: 12074
						var8.args = clickedWidget.onDragComplete; // L: 12075
						GrandExchangeOfferOwnWorldComparator.runScriptEvent(var8); // L: 12076
					}

					if (draggedOnWidget != null && WorldMapEvent.method5647(clickedWidget) != null) { // L: 12078
						PacketBufferNode var13 = class503.getPacketBufferNode(ClientPacket.field3183, packetWriter.isaacCipher); // L: 12080
						var13.packetBuffer.writeShort(clickedWidget.itemId); // L: 12081
						var13.packetBuffer.method9143(clickedWidget.childIndex); // L: 12082
						var13.packetBuffer.writeShort(draggedOnWidget.childIndex); // L: 12083
						var13.packetBuffer.writeIntME(draggedOnWidget.itemId); // L: 12084
						var13.packetBuffer.method9137(clickedWidget.id); // L: 12085
						var13.packetBuffer.method9138(draggedOnWidget.id); // L: 12086
						packetWriter.addNode(var13); // L: 12087
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 12091
					this.openMenu(widgetClickX + field705, widgetClickY + field706); // L: 12092
				} else if (menuOptionsCount > 0) { // L: 12094
					int var11 = widgetClickX + field705; // L: 12095
					int var9 = widgetClickY + field706; // L: 12096
					MenuAction var10 = WorldMapRegion.tempMenuAction; // L: 12098
					if (var10 != null) { // L: 12100
						class60.method1193(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.field912, var10.field913, var10.field911, var11, var9); // L: 12101
					}

					WorldMapRegion.tempMenuAction = null; // L: 12104
				}

				clickedWidget = null; // L: 12108
			}

		} else {
			if (class130.widgetDragDuration > 1) { // L: 12023
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 12024
					var1 = widgetClickX + field705; // L: 12025
					var2 = field706 + widgetClickY; // L: 12026
					MenuAction var12 = WorldMapRegion.tempMenuAction; // L: 12028
					if (var12 != null) { // L: 12030
						class60.method1193(var12.param0, var12.param1, var12.opcode, var12.identifier, var12.field912, var12.field913, var12.field911, var1, var2); // L: 12031
					}

					WorldMapRegion.tempMenuAction = null; // L: 12034
				}

				clickedWidget = null; // L: 12037
			}

		}
	} // L: 12039 12110

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(I)Lui;",
		garbageValue = "466420447"
	)
	@Export("username")
	public Username username() {
		return class136.localPlayer != null ? class136.localPlayer.username : null; // L: 12838
	}

	protected void finalize() throws Throwable {
		class306.field3400.remove(this); // L: 911
		super.finalize(); // L: 913
	} // L: 914

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 943
			this.field560 = var1; // L: 946
			class328.method6115(10); // L: 947
		}
	} // L: 944 948

	public long getAccountHash() {
		return this.accountHash; // L: 967
	}

	public final void init() {
		try {
			if (this.checkHost()) { // L: 746
				for (int var1 = 0; var1 <= 28; ++var1) { // L: 747
					String var2 = this.getParameter(Integer.toString(var1)); // L: 748
					if (var2 != null) { // L: 749
						int var4;
						switch(var1) { // L: 750
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 784
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 785
							}
							break;
						case 4:
							if (clientType == -1) { // L: 837
								clientType = Integer.parseInt(var2); // L: 838
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 806
							break; // L: 807
						case 6:
							var4 = Integer.parseInt(var2); // L: 771
							Language var15;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) { // L: 773
								var15 = Language.Language_valuesOrdered[var4]; // L: 777
							} else {
								var15 = null; // L: 774
							}

							Interpreter.clientLanguage = var15; // L: 779
							break; // L: 780
						case 7:
							var4 = Integer.parseInt(var2); // L: 850
							GameBuild[] var5 = new GameBuild[]{GameBuild.WIP, GameBuild.RC, GameBuild.LIVE, GameBuild.BUILDLIVE}; // L: 855
							GameBuild[] var6 = var5; // L: 857
							int var7 = 0;

							GameBuild var14;
							while (true) {
								if (var7 >= var6.length) {
									var14 = null; // L: 868
									break;
								}

								GameBuild var8 = var6[var7]; // L: 859
								if (var4 == var8.buildId) { // L: 861
									var14 = var8; // L: 862
									break; // L: 863
								}

								++var7; // L: 858
							}

							ArchiveLoader.field1044 = var14; // L: 870
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 795
							}
							break;
						case 9:
							class36.field263 = var2; // L: 844
							break; // L: 845
						case 10:
							StudioGame[] var9 = new StudioGame[]{StudioGame.game5, StudioGame.oldscape, StudioGame.stellardawn, StudioGame.game4, StudioGame.runescape, StudioGame.game3}; // L: 813
							class25.field138 = (StudioGame)ClientPreferences.findEnumerated(var9, Integer.parseInt(var2)); // L: 815
							if (StudioGame.oldscape == class25.field138) { // L: 816
								class457.loginType = LoginType.oldscape;
							} else {
								class457.loginType = LoginType.field4989; // L: 817
							}
							break;
						case 11:
							BuddyRankComparator.field1477 = var2; // L: 832
							break; // L: 833
						case 12:
							worldId = Integer.parseInt(var2); // L: 753
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
							PcmPlayer.field299 = Integer.parseInt(var2); // L: 827
							break; // L: 828
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 822
							break; // L: 823
						case 17:
							class292.field3084 = var2; // L: 801
							break; // L: 802
						case 21:
							field521 = Integer.parseInt(var2); // L: 790
							break; // L: 791
						case 25:
							int var3 = var2.indexOf("."); // L: 758
							if (var3 == -1) { // L: 759
								field525 = Integer.parseInt(var2); // L: 760
							} else {
								field525 = Integer.parseInt(var2.substring(0, var3)); // L: 763
								Integer.parseInt(var2.substring(var3 + 1)); // L: 764
							}
						}
					}
				}

				class92.method2368(); // L: 876
				VarbitComposition.worldHost = this.getCodeBase().getHost(); // L: 877
				class153.field1700 = new class360(); // L: 878
				String var10 = ArchiveLoader.field1044.name; // L: 879
				byte var11 = 0; // L: 880
				if ((worldProperties & 65536) != 0) { // L: 881
					VarpDefinition.field1910 = "beta"; // L: 882
				}

				try {
					class183.method3575("oldschool", VarpDefinition.field1910, var10, var11, 22); // L: 885
				} catch (Exception var12) { // L: 887
					class317.RunException_sendStackTrace((String)null, var12); // L: 888
				}

				TileItem.client = this; // L: 890
				RunException.field5236 = clientType; // L: 891
				Actor.method2418(); // L: 892
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) { // L: 893
					this.field562 = true; // L: 894
				}

				if (field657 == -1) { // L: 896
					if (!this.method1267() && !this.method1472()) { // L: 897
						field657 = 0; // L: 901
					} else {
						field657 = 5; // L: 898
					}
				}

				this.startThread(765, 503, 215, 1); // L: 904
			}
		} catch (RuntimeException var13) {
			throw class300.newRunException(var13, "client.init(" + ')');
		}
	} // L: 905

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 962
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 953
			this.field564 = var1; // L: 956
		}
	} // L: 954 957

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)J",
		garbageValue = "-71"
	)
	public static long method1805(int var0) {
		if (var0 > 63) { // L: 113
			throw new class390("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0}); // L: 114
		} else {
			return (long)Math.pow(2.0D, (double)var0) - 1L; // L: 116
		}
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Ldh;B)V",
		garbageValue = "2"
	)
	static void method1623(NPC var0) {
		var0.field1223 = var0.definition.size; // L: 9154
		var0.field1251 = var0.definition.rotation; // L: 9155
		var0.walkSequence = var0.definition.walkSequence; // L: 9156
		var0.walkBackSequence = var0.definition.walkBackSequence; // L: 9157
		var0.walkLeftSequence = var0.definition.walkLeftSequence; // L: 9158
		var0.walkRightSequence = var0.definition.walkRightSequence; // L: 9159
		var0.idleSequence = var0.definition.idleSequence; // L: 9160
		var0.field1237 = var0.definition.turnLeftSequence; // L: 9161
		var0.field1190 = var0.definition.turnRightSequence; // L: 9162
		var0.runSequence = var0.definition.field1996; // L: 9163
		var0.field1194 = var0.definition.field2013; // L: 9164
		var0.field1197 = var0.definition.field1998; // L: 9165
		var0.field1198 = var0.definition.field2015; // L: 9166
		var0.field1211 = var0.definition.field2016; // L: 9167
		var0.field1200 = var0.definition.field2017; // L: 9168
		var0.field1201 = var0.definition.field2018; // L: 9169
		var0.field1202 = var0.definition.field2024; // L: 9170
	} // L: 9171

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2022659709"
	)
	static final void method1806(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? currentClanChannels[var0] : WorldMapLabelSize.guestClanChannel; // L: 12667
		if (var2 != null && var1 >= 0 && var1 < var2.method3383()) { // L: 12668
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 12669
			if (var3.rank == -1) {
				String var4 = var3.username.getName(); // L: 12671
				PacketBufferNode var5 = class503.getPacketBufferNode(ClientPacket.field3106, packetWriter.isaacCipher); // L: 12672
				var5.packetBuffer.writeByte(3 + class501.stringCp1252NullTerminatedByteSize(var4)); // L: 12673
				var5.packetBuffer.writeByte(var0); // L: 12674
				var5.packetBuffer.writeShort(var1); // L: 12675
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 12676
				packetWriter.addNode(var5); // L: 12677
			}
		}
	} // L: 12670 12678
}
