import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	static AbstractArchive field3531;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("Widget_spritesArchive")
	static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static class384 field3537;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static class384 field3538;
	@ObfuscatedName("ag")
	public static boolean field3539;
	@ObfuscatedName("az")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1023837327
	)
	@Export("id")
	public int id;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -915599827
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1540152617
	)
	@Export("type")
	public int type;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -822804071
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1064789039
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 867935181
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1053685537
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 783027001
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 774250311
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1569341613
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1295682743
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 930045125
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -622646443
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 2086303241
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1365086685
	)
	@Export("y")
	public int y;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1832001725
	)
	@Export("width")
	public int width;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 882604251
	)
	@Export("height")
	public int height;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1405484187
	)
	public int field3661;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -289010725
	)
	public int field3559;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 8537723
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bl")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -2078533729
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 163430389
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1494857505
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -319102043
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1891121533
	)
	@Export("color")
	public int color;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -437343193
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -441956647
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 592749823
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("ba")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lrv;"
	)
	@Export("fillMode")
	public class478 fillMode;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1450406977
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1316132639
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1717395815
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bb")
	public boolean field3575;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 659533181
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1847696179
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bd")
	public String field3578;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 416928349
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cl")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1300355189
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1319117017
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("cw")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("cx")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -824466597
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1902209067
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -1452200045
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1448865917
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 167495965
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1094018507
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1865914977
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -538253409
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 413961515
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1558449129
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -2125848423
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1310127279
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1976334363
	)
	public int field3659;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1603764683
	)
	public int field3598;
	@ObfuscatedName("cv")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("cz")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 459312063
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1520551125
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("ck")
	@Export("text")
	public String text;
	@ObfuscatedName("ci")
	@Export("text2")
	public String text2;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 428775753
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 1127336945
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 2127389397
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("de")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 1603100581
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 1637251583
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("dm")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("dv")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("ds")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("dc")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	class163 field3615;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1290763787
	)
	int field3597;
	@ObfuscatedName("dy")
	HashMap field3617;
	@ObfuscatedName("dx")
	HashMap field3618;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	class301 field3619;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -149949271
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("dq")
	public boolean field3621;
	@ObfuscatedName("db")
	public byte[][] field3622;
	@ObfuscatedName("dt")
	public byte[][] field3623;
	@ObfuscatedName("dp")
	public int[] field3630;
	@ObfuscatedName("du")
	public int[] field3625;
	@ObfuscatedName("ew")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ey")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 82868583
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = 1267822615
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("eh")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("ev")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("eq")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("ee")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("em")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ea")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("ex")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("er")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("ec")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("eb")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ek")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ej")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("ep")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("en")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("eg")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("ez")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("ef")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("ei")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("ed")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("eu")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("el")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fn")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fb")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fa")
	public Object[] field3654;
	@ObfuscatedName("fo")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fc")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fd")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fr")
	public Object[] field3658;
	@ObfuscatedName("fk")
	public Object[] field3653;
	@ObfuscatedName("fp")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fg")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("ff")
	public Object[] field3553;
	@ObfuscatedName("ft")
	public Object[] field3663;
	@ObfuscatedName("fs")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fh")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fu")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fy")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fl")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("fv")
	public Object[] field3567;
	@ObfuscatedName("fz")
	public Object[] field3670;
	@ObfuscatedName("fx")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("fq")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("fi")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("fm")
	@ObfuscatedGetter(
		intValue = 1476120207
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("fe")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("fj")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("fw")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gf")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = 1983678461
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = 390571909
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = -606599493
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = -736025567
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "[Lkd;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gq")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("gh")
	public boolean field3610;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = 1448377925
	)
	public int field3572;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 1149656689
	)
	public int field3645;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 1463799561
	)
	public int field3668;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = 43126131
	)
	public int field3637;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = -1373070299
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = -1786479895
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("gr")
	public int[] field3692;
	@ObfuscatedName("gk")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("ga")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("gb")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 63
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 64
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 65
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 66
		field3537 = new class384(10, class382.field4481); // L: 67
		field3538 = new class384(10, class382.field4481); // L: 68
		field3539 = false; // L: 69
	}

	public Widget() {
		this.isIf3 = false; // L: 70
		this.id = -1; // L: 71
		this.childIndex = -1; // L: 72
		this.buttonType = 0; // L: 74
		this.contentType = 0; // L: 75
		this.xAlignment = 0; // L: 76
		this.yAlignment = 0; // L: 77
		this.widthAlignment = 0; // L: 78
		this.heightAlignment = 0; // L: 79
		this.rawX = 0; // L: 80
		this.rawY = 0; // L: 81
		this.rawWidth = 0; // L: 82
		this.rawHeight = 0; // L: 83
		this.x = 0; // L: 84
		this.y = 0; // L: 85
		this.width = 0; // L: 86
		this.height = 0; // L: 87
		this.field3661 = 1; // L: 88
		this.field3559 = 1; // L: 89
		this.parentId = -1; // L: 90
		this.isHidden = false; // L: 91
		this.scrollX = 0; // L: 92
		this.scrollY = 0; // L: 93
		this.scrollWidth = 0; // L: 94
		this.scrollHeight = 0; // L: 95
		this.color = 0; // L: 96
		this.color2 = 0; // L: 97
		this.mouseOverColor = 0; // L: 98
		this.mouseOverColor2 = 0; // L: 99
		this.fill = false; // L: 100
		this.fillMode = class478.SOLID; // L: 101
		this.transparencyTop = 0; // L: 102
		this.transparencyBot = 0; // L: 103
		this.lineWid = 1; // L: 104
		this.field3575 = false; // L: 105
		this.spriteId2 = -1; // L: 106
		this.spriteId = -1; // L: 107
		this.spriteAngle = 0; // L: 109
		this.spriteTiling = false; // L: 110
		this.outline = 0;
		this.spriteShadow = 0;
		this.modelType = 1;
		this.modelId = -1;
		this.modelType2 = 1;
		this.modelId2 = -1; // L: 118
		this.sequenceId = -1;
		this.sequenceId2 = -1;
		this.modelOffsetX = 0;
		this.modelOffsetY = 0;
		this.modelAngleX = 0;
		this.modelAngleY = 0;
		this.modelAngleZ = 0;
		this.modelZoom = 100;
		this.field3659 = 0; // L: 127
		this.field3598 = 0;
		this.modelOrthog = false; // L: 129
		this.modelTransparency = false; // L: 130
		this.itemQuantityMode = 2; // L: 131
		this.fontId = -1; // L: 132
		this.text = ""; // L: 133
		this.text2 = ""; // L: 134
		this.textLineHeight = 0; // L: 135
		this.textXAlignment = 0; // L: 136
		this.textYAlignment = 0; // L: 137
		this.textShadowed = false; // L: 138
		this.paddingX = 0; // L: 139
		this.paddingY = 0; // L: 140
		this.field3597 = -1; // L: 146
		this.flags = 0; // L: 151
		this.field3621 = false; // L: 152
		this.dataText = ""; // L: 161
		this.parent = null; // L: 163
		this.dragZoneSize = 0; // L: 164
		this.dragThreshold = 0; // L: 165
		this.isScrollBar = false; // L: 166
		this.spellActionName = ""; // L: 167
		this.hasListener = false; // L: 168
		this.mouseOverRedirect = -1; // L: 209
		this.spellName = ""; // L: 210
		this.buttonText = "Ok"; // L: 211
		this.itemId = -1; // L: 214
		this.itemQuantity = 0; // L: 215
		this.modelFrame = 0; // L: 216
		this.modelFrameCycle = 0; // L: 217
		this.containsMouse = false; // L: 219
		this.field3610 = false; // L: 220
		this.field3572 = -1; // L: 221
		this.field3645 = 0; // L: 222
		this.field3668 = 0; // L: 223
		this.field3637 = 0; // L: 224
		this.rootIndex = -1; // L: 225
		this.cycle = -1; // L: 226
		this.noClickThrough = false; // L: 228
		this.noScrollThrough = false; // L: 229
		this.prioritizeMenuEntry = false; // L: 230
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "1229740727"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 299
		this.type = var1.readUnsignedByte(); // L: 300
		this.buttonType = var1.readUnsignedByte(); // L: 301
		this.contentType = var1.readUnsignedShort(); // L: 302
		this.rawX = var1.readShort(); // L: 303
		this.rawY = var1.readShort(); // L: 304
		this.rawWidth = var1.readUnsignedShort(); // L: 305
		this.rawHeight = var1.readUnsignedShort(); // L: 306
		this.transparencyTop = var1.readUnsignedByte(); // L: 307
		this.parentId = var1.readUnsignedShort(); // L: 308
		if (this.parentId == 65535) { // L: 309
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 310
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 311
		if (this.mouseOverRedirect == 65535) { // L: 312
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 313
		int var3;
		if (var2 > 0) { // L: 314
			this.cs1Comparisons = new int[var2]; // L: 315
			this.cs1ComparisonValues = new int[var2]; // L: 316

			for (var3 = 0; var3 < var2; ++var3) { // L: 317
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 318
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 319
			}
		}

		var3 = var1.readUnsignedByte(); // L: 322
		int var4;
		int var5;
		int var6;
		if (var3 > 0) { // L: 323
			this.cs1Instructions = new int[var3][]; // L: 324

			for (var4 = 0; var4 < var3; ++var4) { // L: 325
				var5 = var1.readUnsignedShort(); // L: 326
				this.cs1Instructions[var4] = new int[var5]; // L: 327

				for (var6 = 0; var6 < var5; ++var6) { // L: 328
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 329
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 330
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 334
			this.scrollHeight = var1.readUnsignedShort(); // L: 335
			this.isHidden = var1.readUnsignedByte() == 1; // L: 336
		}

		if (this.type == 1) { // L: 338
			var1.readUnsignedShort(); // L: 339
			var1.readUnsignedByte(); // L: 340
		}

		if (this.type == 2) { // L: 342
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 343
			this.itemQuantities = new int[this.rawWidth * this.rawHeight]; // L: 344
			var4 = var1.readUnsignedByte(); // L: 345
			if (var4 == 1) { // L: 346
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte(); // L: 347
			if (var5 == 1) { // L: 348
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte(); // L: 349
			if (var6 == 1) { // L: 350
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte(); // L: 351
			if (var7 == 1) { // L: 352
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte(); // L: 353
			this.paddingY = var1.readUnsignedByte(); // L: 354
			this.inventoryXOffsets = new int[20]; // L: 355
			this.inventoryYOffsets = new int[20]; // L: 356
			this.inventorySprites = new int[20]; // L: 357

			int var8;
			for (var8 = 0; var8 < 20; ++var8) { // L: 358
				int var11 = var1.readUnsignedByte(); // L: 359
				if (var11 == 1) { // L: 360
					this.inventoryXOffsets[var8] = var1.readShort(); // L: 361
					this.inventoryYOffsets[var8] = var1.readShort(); // L: 362
					this.inventorySprites[var8] = var1.readInt(); // L: 363
				} else {
					this.inventorySprites[var8] = -1; // L: 365
				}
			}

			this.itemActions = new String[5]; // L: 367

			for (var8 = 0; var8 < 5; ++var8) { // L: 368
				String var9 = var1.readStringCp1252NullTerminated(); // L: 369
				if (var9.length() > 0) { // L: 370
					this.itemActions[var8] = var9; // L: 371
					this.flags |= 1 << var8 + 23; // L: 372
				}
			}
		}

		if (this.type == 3) { // L: 376
			this.fill = var1.readUnsignedByte() == 1; // L: 377
		}

		if (this.type == 4 || this.type == 1) { // L: 379
			this.textXAlignment = var1.readUnsignedByte(); // L: 380
			this.textYAlignment = var1.readUnsignedByte(); // L: 381
			this.textLineHeight = var1.readUnsignedByte(); // L: 382
			this.fontId = var1.readUnsignedShort(); // L: 383
			if (this.fontId == 65535) { // L: 384
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 385
		}

		if (this.type == 4) { // L: 387
			this.text = var1.readStringCp1252NullTerminated(); // L: 388
			this.text2 = var1.readStringCp1252NullTerminated(); // L: 389
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 391
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 392
			this.color2 = var1.readInt(); // L: 393
			this.mouseOverColor = var1.readInt(); // L: 394
			this.mouseOverColor2 = var1.readInt(); // L: 395
		}

		if (this.type == 5) { // L: 397
			this.spriteId2 = var1.readInt(); // L: 398
			this.spriteId = var1.readInt(); // L: 399
		}

		if (this.type == 6) { // L: 401
			this.modelType = 1; // L: 402
			this.modelId = var1.readUnsignedShort(); // L: 403
			if (this.modelId == 65535) { // L: 404
				this.modelId = -1;
			}

			this.modelType2 = 1; // L: 405
			this.modelId2 = var1.readUnsignedShort(); // L: 406
			if (this.modelId2 == 65535) { // L: 407
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 408
			if (this.sequenceId == 65535) { // L: 409
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 410
			if (this.sequenceId2 == 65535) { // L: 411
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 412
			this.modelAngleX = var1.readUnsignedShort(); // L: 413
			this.modelAngleY = var1.readUnsignedShort(); // L: 414
		}

		if (this.type == 7) { // L: 416
			this.itemIds = new int[this.rawWidth * this.rawHeight]; // L: 417
			this.itemQuantities = new int[this.rawWidth * this.rawHeight]; // L: 418
			this.textXAlignment = var1.readUnsignedByte(); // L: 419
			this.fontId = var1.readUnsignedShort(); // L: 420
			if (this.fontId == 65535) { // L: 421
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 422
			this.color = var1.readInt(); // L: 423
			this.paddingX = var1.readShort(); // L: 424
			this.paddingY = var1.readShort(); // L: 425
			var4 = var1.readUnsignedByte(); // L: 426
			if (var4 == 1) {
				this.flags |= 1073741824; // L: 427
			}

			this.itemActions = new String[5]; // L: 428

			for (var5 = 0; var5 < 5; ++var5) { // L: 429
				String var10 = var1.readStringCp1252NullTerminated(); // L: 430
				if (var10.length() > 0) { // L: 431
					this.itemActions[var5] = var10; // L: 432
					this.flags |= 1 << var5 + 23; // L: 433
				}
			}
		}

		if (this.type == 8) { // L: 437
			this.text = var1.readStringCp1252NullTerminated(); // L: 438
		}

		if (this.buttonType == 2 || this.type == 2) { // L: 440
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 441
			this.spellName = var1.readStringCp1252NullTerminated(); // L: 442
			var4 = var1.readUnsignedShort() & 63; // L: 443
			this.flags |= var4 << 11; // L: 444
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 446
			this.buttonText = var1.readStringCp1252NullTerminated(); // L: 447
			if (this.buttonText.length() == 0) { // L: 448
				if (this.buttonType == 1) { // L: 449
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) { // L: 450
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) { // L: 451
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) { // L: 452
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 455
			this.flags |= 4194304; // L: 456
		}

		if (this.buttonType == 6) { // L: 458
			this.flags |= 1; // L: 459
		}

	} // L: 461

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "1277260307"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 464
		this.isIf3 = true; // L: 465
		this.type = var1.readUnsignedByte(); // L: 466
		this.contentType = var1.readUnsignedShort(); // L: 467
		this.rawX = var1.readShort(); // L: 468
		this.rawY = var1.readShort(); // L: 469
		this.rawWidth = var1.readUnsignedShort(); // L: 470
		if (this.type == 9) { // L: 471
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 472
		}

		this.widthAlignment = var1.readByte(); // L: 473
		this.heightAlignment = var1.readByte(); // L: 474
		this.xAlignment = var1.readByte(); // L: 475
		this.yAlignment = var1.readByte(); // L: 476
		this.parentId = var1.readUnsignedShort(); // L: 477
		if (this.parentId == 65535) { // L: 478
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 479
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 480
		if (this.type == 0) { // L: 481
			this.scrollWidth = var1.readUnsignedShort(); // L: 482
			this.scrollHeight = var1.readUnsignedShort(); // L: 483
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 484
		}

		if (this.type == 5) { // L: 486
			this.spriteId2 = var1.readInt(); // L: 487
			this.spriteAngle = var1.readUnsignedShort(); // L: 488
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 489
			this.transparencyTop = var1.readUnsignedByte(); // L: 490
			this.outline = var1.readUnsignedByte(); // L: 491
			this.spriteShadow = var1.readInt(); // L: 492
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 493
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 494
		}

		if (this.type == 6) { // L: 496
			this.modelType = 1; // L: 497
			this.modelId = var1.readUnsignedShort(); // L: 498
			if (this.modelId == 65535) { // L: 499
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 500
			this.modelOffsetY = var1.readShort(); // L: 501
			this.modelAngleX = var1.readUnsignedShort(); // L: 502
			this.modelAngleY = var1.readUnsignedShort(); // L: 503
			this.modelAngleZ = var1.readUnsignedShort(); // L: 504
			this.modelZoom = var1.readUnsignedShort(); // L: 505
			this.sequenceId = var1.readUnsignedShort(); // L: 506
			if (this.sequenceId == 65535) { // L: 507
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 508
			var1.readUnsignedShort(); // L: 509
			if (this.widthAlignment != 0) { // L: 510
				this.field3659 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 511
				var1.readUnsignedShort(); // L: 512
			}
		}

		if (this.type == 4) { // L: 515
			this.fontId = var1.readUnsignedShort(); // L: 516
			if (this.fontId == 65535) { // L: 517
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 518
			this.textLineHeight = var1.readUnsignedByte(); // L: 519
			this.textXAlignment = var1.readUnsignedByte(); // L: 520
			this.textYAlignment = var1.readUnsignedByte(); // L: 521
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 522
			this.color = var1.readInt(); // L: 523
		}

		if (this.type == 3) { // L: 525
			this.color = var1.readInt(); // L: 526
			this.fill = var1.readUnsignedByte() == 1; // L: 527
			this.transparencyTop = var1.readUnsignedByte(); // L: 528
		}

		if (this.type == 9) { // L: 530
			this.lineWid = var1.readUnsignedByte(); // L: 531
			this.color = var1.readInt(); // L: 532
			this.field3575 = var1.readUnsignedByte() == 1; // L: 533
		}

		this.flags = var1.readMedium(); // L: 535
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 536
		int var2 = var1.readUnsignedByte(); // L: 537
		if (var2 > 0) { // L: 538
			this.actions = new String[var2]; // L: 539

			for (int var3 = 0; var3 < var2; ++var3) { // L: 540
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 542
		this.dragThreshold = var1.readUnsignedByte(); // L: 543
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 544
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 545
		this.onLoad = this.readListener(var1); // L: 546
		this.onMouseOver = this.readListener(var1); // L: 547
		this.onMouseLeave = this.readListener(var1); // L: 548
		this.onTargetLeave = this.readListener(var1); // L: 549
		this.onTargetEnter = this.readListener(var1); // L: 550
		this.onVarTransmit = this.readListener(var1); // L: 551
		this.onInvTransmit = this.readListener(var1); // L: 552
		this.onStatTransmit = this.readListener(var1); // L: 553
		this.onTimer = this.readListener(var1); // L: 554
		this.onOp = this.readListener(var1); // L: 555
		this.onMouseRepeat = this.readListener(var1); // L: 556
		this.onClick = this.readListener(var1); // L: 557
		this.onClickRepeat = this.readListener(var1); // L: 558
		this.onRelease = this.readListener(var1); // L: 559
		this.onHold = this.readListener(var1); // L: 560
		this.onDrag = this.readListener(var1); // L: 561
		this.onDragComplete = this.readListener(var1); // L: 562
		this.onScroll = this.readListener(var1); // L: 563
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 564
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 565
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 566
	} // L: 567

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)[Ljava/lang/Object;",
		garbageValue = "818571215"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 570
		if (var2 == 0) { // L: 571
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 572

			for (int var4 = 0; var4 < var2; ++var4) { // L: 573
				int var5 = var1.readUnsignedByte(); // L: 574
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 575
				} else if (var5 == 1) { // L: 576
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 578
			return var3; // L: 579
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)[I",
		garbageValue = "-2028965752"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 583
		if (var2 == 0) { // L: 584
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 585

			for (int var4 = 0; var4 < var2; ++var4) { // L: 586
				var3[var4] = var1.readInt(); // L: 587
			}

			return var3; // L: 589
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-108"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2]; // L: 593
		this.itemIds[var2] = this.itemIds[var1]; // L: 594
		this.itemIds[var1] = var3; // L: 595
		var3 = this.itemQuantities[var2]; // L: 596
		this.itemQuantities[var2] = this.itemQuantities[var1]; // L: 597
		this.itemQuantities[var1] = var3; // L: 598
	} // L: 599

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZLdl;I)Lrx;",
		garbageValue = "1816388084"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3539 = false; // L: 602
		if (this.field3578 != null) { // L: 603
			SpritePixels var3 = this.method6158(var2); // L: 604
			if (var3 != null) { // L: 605
				return var3; // L: 606
			}
		}

		int var7;
		if (var1) { // L: 610
			var7 = this.spriteId;
		} else {
			var7 = this.spriteId2; // L: 611
		}

		if (var7 == -1) { // L: 612
			return null;
		} else {
			long var4 = ((long)this.outline << 36) + (long)var7 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40); // L: 613
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4); // L: 614
			if (var6 != null) { // L: 615
				return var6;
			} else {
				var6 = class125.SpriteBuffer_getSprite(Widget_spritesArchive, var7, 0); // L: 616
				if (var6 == null) { // L: 617
					field3539 = true; // L: 618
					return null; // L: 619
				} else {
					this.method6154(var6); // L: 621
					Widget_cachedSprites.put(var6, var4); // L: 622
					return var6; // L: 623
				}
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ldl;I)Lrx;",
		garbageValue = "-740634830"
	)
	SpritePixels method6158(UrlRequester var1) {
		if (!this.method6160()) { // L: 627
			return this.method6186(var1); // L: 628
		} else {
			String var2 = this.field3578 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 630
			SpritePixels var3 = (SpritePixels)field3538.method7386(var2); // L: 631
			if (var3 == null) { // L: 632
				SpritePixels var4 = this.method6186(var1); // L: 633
				if (var4 != null) { // L: 634
					var3 = var4.method9002(); // L: 635
					this.method6154(var3); // L: 636
					field3538.method7374(var2, var3); // L: 637
				}
			}

			return var3; // L: 640
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ldl;I)Lrx;",
		garbageValue = "-2105744514"
	)
	SpritePixels method6186(UrlRequester var1) {
		if (this.field3578 != null && var1 != null) { // L: 644
			class300 var2 = (class300)field3537.method7386(this.field3578); // L: 645
			if (var2 == null) { // L: 646
				var2 = new class300(this.field3578, var1); // L: 647
				field3537.method7374(this.field3578, var2); // L: 648
			}

			return var2.method5840(); // L: 650
		} else {
			return null; // L: 652
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1265431805"
	)
	boolean method6160() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 656
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lrx;I)V",
		garbageValue = "-1471654768"
	)
	void method6154(SpritePixels var1) {
		if (this.spriteFlipV) { // L: 660
			var1.flipVertically();
		}

		if (this.spriteFlipH) { // L: 661
			var1.flipHorizontally();
		}

		if (this.outline > 0) { // L: 662
			var1.pad(this.outline);
		}

		if (this.outline >= 1) { // L: 663
			var1.outline(1);
		}

		if (this.outline >= 2) { // L: 664
			var1.outline(16777215);
		}

		if (this.spriteShadow != 0) { // L: 665
			var1.shadow(this.spriteShadow);
		}

	} // L: 666

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Lnv;",
		garbageValue = "1347355979"
	)
	@Export("getFont")
	public Font getFont() {
		field3539 = false; // L: 669
		if (this.fontId == -1) { // L: 670
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 671
			if (var1 != null) { // L: 672
				return var1;
			} else {
				var1 = Timer.method7358(Widget_spritesArchive, PacketBufferNode.Widget_fontsArchive, this.fontId, 0); // L: 673
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId); // L: 674
				} else {
					field3539 = true; // L: 675
				}

				return var1; // L: 676
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Lrx;",
		garbageValue = "-1594333003"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3539 = false; // L: 680
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 681
			int var2 = this.inventorySprites[var1]; // L: 682
			if (var2 == -1) { // L: 683
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2); // L: 684
				if (var3 != null) { // L: 685
					return var3;
				} else {
					var3 = class125.SpriteBuffer_getSprite(Widget_spritesArchive, var2, 0); // L: 686
					if (var3 != null) { // L: 687
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field3539 = true; // L: 688
					}

					return var3; // L: 689
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lga;IZLko;Lgz;Lgp;I)Lhh;",
		garbageValue = "-1671121568"
	)
	public Model method6228(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4, NPCComposition var5, class185 var6) {
		field3539 = false; // L: 693
		int var7;
		int var8;
		if (var3) { // L: 696
			var7 = this.modelType2; // L: 697
			var8 = this.modelId2; // L: 698
		} else {
			var7 = this.modelType; // L: 701
			var8 = this.modelId; // L: 702
		}

		if (var7 == 6) { // L: 704
			if (var5 == null) { // L: 705
				return null;
			}

			var8 = var5.id; // L: 706
		}

		if (var7 == 0) { // L: 708
			return null;
		} else if (var7 == 1 && var8 == -1) { // L: 709
			return null;
		} else {
			long var9 = (long)(var8 + (var7 << 16)); // L: 710
			if (var6 != null) { // L: 711
				var9 |= var6.field2018 << 20;
			}

			Model var11 = (Model)Widget_cachedModels.get(var9); // L: 712
			if (var11 == null) { // L: 713
				ModelData var12 = null; // L: 714
				int var13 = 64; // L: 715
				int var14 = 768; // L: 716
				switch(var7) { // L: 717
				case 1:
					var12 = ModelData.ModelData_get(field3531, var8, 0); // L: 734
					break;
				case 2:
					var12 = class129.getNpcDefinition(var8).method3666((class185)null); // L: 725
					break; // L: 726
				case 3:
					var12 = var4 != null ? var4.getModelData() : null; // L: 731
					break; // L: 732
				case 4:
					ItemComposition var15 = NPCComposition.ItemComposition_get(var8); // L: 719
					var12 = var15.getModelData(10); // L: 720
					var13 += var15.field2209; // L: 721
					var14 += var15.field2222; // L: 722
				case 5:
				default:
					break;
				case 6:
					var12 = class129.getNpcDefinition(var8).method3666(var6); // L: 728
				}

				if (var12 == null) { // L: 737
					field3539 = true; // L: 738
					return null; // L: 739
				}

				var11 = var12.toModel(var13, var14, -50, -10, -50); // L: 741
				Widget_cachedModels.put(var11, var9); // L: 742
			}

			if (var1 != null) { // L: 744
				var11 = var1.transformWidgetModel(var11, var2); // L: 745
			}

			return var11; // L: 747
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lkv;",
		garbageValue = "211480"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 751
			var1 = false;
		}

		int var2 = var1 ? this.spriteId : this.spriteId2; // L: 752
		if (var2 == -1) { // L: 753
			return null;
		} else {
			long var3 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var2 + ((long)this.spriteShadow << 40); // L: 754
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 755
			if (var5 != null) { // L: 756
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, (UrlRequester)null); // L: 757
				if (var6 == null) { // L: 758
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 759
					int[] var8 = new int[var7.subHeight]; // L: 760
					int[] var9 = new int[var7.subHeight]; // L: 761

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 762
						int var11 = 0; // L: 763
						int var12 = var7.subWidth; // L: 764

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 765
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 766
								var11 = var13; // L: 767
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 771
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 772
								var12 = var13 + 1; // L: 773
								break;
							}
						}

						var8[var10] = var11; // L: 777
						var9[var10] = var12 - var11; // L: 778
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 780
					Widget_cachedSpriteMasks.put(var5, var3); // L: 781
					return var5; // L: 782
				}
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)V",
		garbageValue = "-14056"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 793
			String[] var3 = new String[var1 + 1]; // L: 794
			if (this.actions != null) { // L: 795
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 796
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 798
		}

		this.actions[var1] = var2; // L: 800
	} // L: 801

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-74"
	)
	public boolean method6298() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12; // L: 804
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "366635379"
	)
	public boolean method6225() {
		return this.type == 11 || this.type == 12; // L: 808
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ldl;J)V"
	)
	public void method6285(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && -1L != var3) { // L: 812
			var1 = var1.replaceAll("%userid%", Long.toString(var3)); // L: 813
			this.field3615 = new class163(); // L: 814
			if (!this.field3615.method3370(var1, var2)) { // L: 815
				this.field3615 = null; // L: 816
			} else {
				if (this.field3617 == null || this.field3618 == null) { // L: 819
					this.method6221(); // L: 820
				}

			}
		}
	} // L: 817 822

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "296640153"
	)
	void method6221() {
		this.field3617 = new HashMap(); // L: 825
		this.field3618 = new HashMap(); // L: 826
	} // L: 827

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-839153934"
	)
	public void method6170(int var1, int var2) {
		if (this.type == 11) { // L: 830
			if (this.field3617 == null) { // L: 831
				this.method6221();
			}

			this.field3617.put(var1, var2); // L: 832
		}
	} // L: 833

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-705655664"
	)
	public void method6162(String var1, int var2) {
		if (this.type == 11) { // L: 836
			if (this.field3618 == null) { // L: 837
				this.method6221();
			}

			this.field3618.put(var1, var2); // L: 838
		}
	} // L: 839

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-688445848"
	)
	public boolean method6172() {
		return this.field3597 == 2; // L: 842
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "113"
	)
	public int method6173(String var1) {
		return this.type == 11 && this.field3615 != null && this.method6172() ? this.field3615.method3373(var1) : -1; // L: 846 847 849
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "89"
	)
	public String method6171(String var1) {
		return this.type == 11 && this.field3615 != null && this.method6172() ? this.field3615.method3374(var1) : null; // L: 853 854
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	public int method6174() {
		return this.field3618 != null && this.field3618.size() > 0 ? 1 : 0; // L: 858
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-116"
	)
	public int method6176() {
		if (this.type == 11 && this.field3615 != null && this.field3618 != null && !this.field3618.isEmpty()) { // L: 862
			String var1 = this.field3615.method3377(); // L: 863
			return var1 != null && this.field3618.containsKey(this.field3615.method3377()) ? (Integer)this.field3618.get(var1) : -1; // L: 864 865 867
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "5"
	)
	public String method6177() {
		if (this.type == 11 && this.field3615 != null) { // L: 871
			String var1 = this.field3615.method3377(); // L: 872
			Iterator var2 = this.field3615.method3378().iterator(); // L: 873

			while (var2.hasNext()) {
				class173 var3 = (class173)var2.next(); // L: 874
				String var4 = String.format("%%%S%%", var3.method3503()); // L: 876
				if (var3.vmethod3504() == 0) { // L: 877
					var1.replaceAll(var4, Integer.toString(var3.vmethod3511())); // L: 878
				} else {
					var1.replaceAll(var4, var3.vmethod3505()); // L: 881
				}
			}

			return var1; // L: 885
		} else {
			return null; // L: 884
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-14"
	)
	public int[] method6178() {
		if (this.type == 11 && this.field3615 != null) { // L: 889
			int[] var1 = new int[3]; // L: 890
			int var2 = 0; // L: 891
			Iterator var3 = this.field3615.method3378().iterator(); // L: 892

			while (var3.hasNext()) {
				class173 var4 = (class173)var3.next(); // L: 893
				if (!var4.method3503().equals("user_id")) { // L: 895
					if (var4.vmethod3504() != 0) { // L: 896
						return null; // L: 903
					}

					var1[var2++] = var4.vmethod3511(); // L: 897
					if (var2 > 3) { // L: 898
						return null; // L: 899
					}
				}
			}

			return var1; // L: 908
		} else {
			return null;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ldl;B)Z",
		garbageValue = "71"
	)
	public boolean method6281(UrlRequester var1) {
		if (this.type == 11 && this.field3615 != null) { // L: 912
			this.field3615.method3371(var1); // L: 913
			if (this.field3615.method3372() != this.field3597) { // L: 914
				this.field3597 = this.field3615.method3372(); // L: 915
				if (this.field3597 >= 100) { // L: 916
					return true; // L: 917
				}

				if (this.field3597 == 2) { // L: 919
					this.method6180(); // L: 920
					return true; // L: 921
				}
			}

			return false; // L: 924
		} else {
			return false;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1620784087"
	)
	void method6180() {
		this.noClickThrough = true; // L: 945
		ArrayList var1 = this.field3615.method3383(); // L: 946
		ArrayList var2 = this.field3615.method3376(); // L: 947
		int var3 = var1.size() + var2.size(); // L: 948
		this.children = new Widget[var3]; // L: 949
		int var4 = 0; // L: 950

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 951 958
			class168 var6 = (class168)var5.next(); // L: 952
			var7 = DynamicObject.method2137(5, this, var4, 0, 0, 0, 0, var6.field1868); // L: 954
			var7.field3578 = var6.field1867.method2788(); // L: 955
			class300 var8 = new class300(var6.field1867); // L: 956
			field3537.method7374(var7.field3578, var8); // L: 957
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 961 969
			class169 var9 = (class169)var5.next(); // L: 962
			var7 = DynamicObject.method2137(4, this, var4, 0, 0, 0, 0, var9.field1873); // L: 964
			var7.text = var9.field1872; // L: 965
			var7.fontId = (Integer)this.field3617.get(var9.field1875); // L: 966
			var7.textXAlignment = var9.field1876; // L: 967
			var7.textYAlignment = var9.field1877; // L: 968
		}

	} // L: 972

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "849668334"
	)
	public void method6261() {
		this.field3619 = new class301(); // L: 975

		for (int var1 = 1; var1 <= 12; ++var1) { // L: 976
			this.field3619.field3463.method400(var1, 0); // L: 977
		}

		for (char var2 = 0; var2 < ' '; ++var2) { // L: 979
			this.field3619.field3463.method394(var2, 0); // L: 980
		}

		this.field3619.field3463.method394('\u0080', 0); // L: 982
		this.field3619.field3463.method400(82, 2); // L: 983
		this.field3619.field3463.method400(81, 2); // L: 984
		this.field3619.field3463.method400(86, 2); // L: 985
	} // L: 986

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lki;",
		garbageValue = "1153387619"
	)
	public class303 method6167() {
		return this.field3619 != null ? this.field3619.field3466 : null; // L: 989
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lkb;",
		garbageValue = "65"
	)
	public class298 method6293() {
		return this.field3619 != null ? this.field3619.field3464 : null; // L: 993
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lao;",
		garbageValue = "406803698"
	)
	public class28 method6187() {
		return this.field3619 != null ? this.field3619.field3463 : null; // L: 997
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lkt;",
		garbageValue = "-1759903354"
	)
	public class301 method6185() {
		return this.field3619; // L: 1001
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lki;I)Z",
		garbageValue = "381752900"
	)
	boolean method6291(class303 var1) {
		boolean var2 = false; // L: 1005
		if (this.text != null && !this.text.isEmpty()) { // L: 1006
			var2 |= var1.method5882(class109.method2782(this.text)); // L: 1007
			this.text = ""; // L: 1008
		}

		if (this.text2 != null && !this.text2.isEmpty()) { // L: 1010
			var2 |= var1.method6124(class109.method2782(this.text2)); // L: 1011
			this.text2 = ""; // L: 1012
		}

		return var2; // L: 1014
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1849924136"
	)
	public boolean method6242() {
		class303 var1 = this.method6167(); // L: 1018
		if (var1 == null) { // L: 1019
			return false;
		} else {
			boolean var2 = false; // L: 1020
			if (!var1.method6062() && this.fontId != -1) { // L: 1021
				int var3 = var1.method5937(); // L: 1022
				int var4 = var1.method5938(); // L: 1023
				int var5 = var1.method5913(); // L: 1024
				int var6 = var1.method5934(); // L: 1025
				Font var7 = this.getFont(); // L: 1026
				if (var7 != null) { // L: 1027
					var2 |= var1.method5884(var7); // L: 1028
					var2 |= this.method6291(var1); // L: 1029
					var2 |= var1.method5889(var3, var4); // L: 1030
					var2 |= var1.method5904(var5, var6); // L: 1031
				}
			} else if (var1.method6062()) { // L: 1034
				var2 |= this.method6291(var1); // L: 1035
			}

			var1.method5879(); // L: 1037
			return var2; // L: 1038
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIZB)Ljava/lang/String;",
		garbageValue = "32"
	)
	static String method6300(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 111
			if (var2 && var0 >= 0) { // L: 112
				int var3 = 2; // L: 113

				for (int var4 = var0 / var1; var4 != 0; ++var3) { // L: 114 115 117
					var4 /= var1; // L: 116
				}

				char[] var5 = new char[var3]; // L: 119
				var5[0] = '+'; // L: 120

				for (int var6 = var3 - 1; var6 > 0; --var6) { // L: 121
					int var7 = var0; // L: 122
					var0 /= var1; // L: 123
					int var8 = var7 - var0 * var1; // L: 124
					if (var8 >= 10) { // L: 125
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48); // L: 126
					}
				}

				return new String(var5); // L: 128
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1630385377"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 9851
			Widget var0 = AttackOption.getWidgetChild(class358.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 9852
			if (var0 != null && var0.onTargetLeave != null) { // L: 9853
				ScriptEvent var1 = new ScriptEvent(); // L: 9854
				var1.widget = var0; // L: 9855
				var1.args = var0.onTargetLeave; // L: 9856
				WorldMapElement.runScriptEvent(var1); // L: 9857
			}

			Client.selectedSpellItemId = -1; // L: 9859
			Client.isSpellSelected = false; // L: 9860
			class69.invalidateWidget(var0); // L: 9861
		}
	} // L: 9862
}
