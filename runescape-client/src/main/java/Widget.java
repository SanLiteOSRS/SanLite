import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("Widget_cachedModels")
	public static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("Widget_cachedFonts")
	public static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static class391 field3547;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static class391 field3548;
	@ObfuscatedName("ay")
	public static boolean field3579;
	@ObfuscatedName("ac")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -62043185
	)
	@Export("id")
	public int id;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1171460333
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1180161427
	)
	@Export("type")
	public int type;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -990812675
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 175857361
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 64995
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1514062159
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -620602289
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -637700839
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 354048477
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -215139839
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1834754577
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1568476975
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -142785695
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 628751527
	)
	@Export("y")
	public int y;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1115677773
	)
	@Export("width")
	public int width;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 2038548197
	)
	@Export("height")
	public int height;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -41281173
	)
	public int field3659;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -529164185
	)
	public int field3569;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -406687343
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bq")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1373308277
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1772436737
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1727370963
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -2014827871
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1428016323
	)
	@Export("color")
	public int color;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 183396475
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1207136197
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -788803119
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("bs")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	@Export("fillMode")
	public class485 fillMode;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1539126233
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -156318013
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1676714917
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("ba")
	public boolean field3606;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -2041212023
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1473784193
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bv")
	public String field3588;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -144380605
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cr")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -585447419
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -513345907
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("cq")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("cd")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 72486601
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1915514627
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 334797799
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1076912807
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1497433719
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1774221745
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -451847347
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 761940513
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1182255807
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -1874315713
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1808943705
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -2094667345
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1864435997
	)
	public int field3616;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1350892871
	)
	public int field3585;
	@ObfuscatedName("co")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("cg")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1108798901
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 933014707
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cn")
	@Export("text")
	public String text;
	@ObfuscatedName("cw")
	@Export("text2")
	public String text2;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -1009700007
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1809852357
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -1411689819
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("di")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 2097156317
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -1339031143
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("dm")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("dn")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("df")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("dv")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	class166 field3625;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 505457991
	)
	int field3647;
	@ObfuscatedName("dt")
	HashMap field3627;
	@ObfuscatedName("dl")
	HashMap field3571;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	class305 field3629;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1238631003
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("ds")
	public boolean field3631;
	@ObfuscatedName("dc")
	public byte[][] field3632;
	@ObfuscatedName("de")
	public byte[][] field3633;
	@ObfuscatedName("du")
	public int[] field3634;
	@ObfuscatedName("da")
	public int[] field3635;
	@ObfuscatedName("ev")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("en")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = 1863427853
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = -2092863151
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("eq")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("ea")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("es")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("ew")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("ej")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ed")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("eu")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("ex")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("eh")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("ep")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("eo")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ey")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("eg")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("ec")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("ef")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("eb")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("et")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("ee")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("ez")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("em")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("ek")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fn")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fx")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fh")
	public Object[] field3664;
	@ObfuscatedName("fm")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fe")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fl")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fu")
	public Object[] field3604;
	@ObfuscatedName("fi")
	public Object[] field3669;
	@ObfuscatedName("fk")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fd")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fs")
	public Object[] field3672;
	@ObfuscatedName("fg")
	public Object[] field3673;
	@ObfuscatedName("fq")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fj")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fr")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fw")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("ft")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("fv")
	public Object[] field3679;
	@ObfuscatedName("fa")
	public Object[] field3680;
	@ObfuscatedName("fo")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("ff")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("fc")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		intValue = -185658995
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("fy")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("fz")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("fp")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gk")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 1673450875
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 1904309963
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = -2100341611
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = -934012351
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "[Lkz;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gw")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("gj")
	public boolean field3674;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = 1124101761
	)
	public int field3696;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = 358069129
	)
	public int field3697;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = -929627225
	)
	public int field3698;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = -1167515137
	)
	public int field3699;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 1940236813
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -99836391
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("gy")
	public int[] field3594;
	@ObfuscatedName("gn")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gb")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("gp")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 63
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 64
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 65
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 66
		field3547 = new class391(10, class389.field4516); // L: 67
		field3548 = new class391(10, class389.field4516); // L: 68
		field3579 = false; // L: 69
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
		this.field3659 = 1; // L: 88
		this.field3569 = 1; // L: 89
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
		this.fillMode = class485.SOLID; // L: 101
		this.transparencyTop = 0; // L: 102
		this.transparencyBot = 0; // L: 103
		this.lineWid = 1; // L: 104
		this.field3606 = false; // L: 105
		this.spriteId2 = -1; // L: 106
		this.spriteId = -1; // L: 107
		this.spriteAngle = 0; // L: 109
		this.spriteTiling = false; // L: 110
		this.outline = 0; // L: 111
		this.spriteShadow = 0; // L: 112
		this.modelType = 1; // L: 115
		this.modelId = -1; // L: 116
		this.modelType2 = 1; // L: 117
		this.modelId2 = -1; // L: 118
		this.sequenceId = -1; // L: 119
		this.sequenceId2 = -1; // L: 120
		this.modelOffsetX = 0; // L: 121
		this.modelOffsetY = 0; // L: 122
		this.modelAngleX = 0; // L: 123
		this.modelAngleY = 0; // L: 124
		this.modelAngleZ = 0; // L: 125
		this.modelZoom = 100; // L: 126
		this.field3616 = 0; // L: 127
		this.field3585 = 0; // L: 128
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
		this.field3647 = -1; // L: 146
		this.flags = 0; // L: 151
		this.field3631 = false; // L: 152
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
		this.field3674 = false; // L: 220
		this.field3696 = -1; // L: 221
		this.field3697 = 0; // L: 222
		this.field3698 = 0; // L: 223
		this.field3699 = 0; // L: 224
		this.rootIndex = -1; // L: 225
		this.cycle = -1; // L: 226
		this.noClickThrough = false; // L: 228
		this.noScrollThrough = false; // L: 229
		this.prioritizeMenuEntry = false; // L: 230
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "-2036532875"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 274
		this.type = var1.readUnsignedByte(); // L: 275
		this.buttonType = var1.readUnsignedByte(); // L: 276
		this.contentType = var1.readUnsignedShort(); // L: 277
		this.rawX = var1.readShort(); // L: 278
		this.rawY = var1.readShort(); // L: 279
		this.rawWidth = var1.readUnsignedShort(); // L: 280
		this.rawHeight = var1.readUnsignedShort(); // L: 281
		this.transparencyTop = var1.readUnsignedByte(); // L: 282
		this.parentId = var1.readUnsignedShort(); // L: 283
		if (this.parentId == 65535) { // L: 284
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 285
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 286
		if (this.mouseOverRedirect == 65535) { // L: 287
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 288
		int var3;
		if (var2 > 0) { // L: 289
			this.cs1Comparisons = new int[var2]; // L: 290
			this.cs1ComparisonValues = new int[var2]; // L: 291

			for (var3 = 0; var3 < var2; ++var3) { // L: 292
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 293
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 294
			}
		}

		var3 = var1.readUnsignedByte(); // L: 297
		int var4;
		int var5;
		int var6;
		if (var3 > 0) { // L: 298
			this.cs1Instructions = new int[var3][]; // L: 299

			for (var4 = 0; var4 < var3; ++var4) { // L: 300
				var5 = var1.readUnsignedShort(); // L: 301
				this.cs1Instructions[var4] = new int[var5]; // L: 302

				for (var6 = 0; var6 < var5; ++var6) { // L: 303
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 304
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 305
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 309
			this.scrollHeight = var1.readUnsignedShort(); // L: 310
			this.isHidden = var1.readUnsignedByte() == 1; // L: 311
		}

		if (this.type == 1) { // L: 313
			var1.readUnsignedShort(); // L: 314
			var1.readUnsignedByte(); // L: 315
		}

		if (this.type == 2) { // L: 317
			this.itemIds = new int[this.rawWidth * this.rawHeight]; // L: 318
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 319
			var4 = var1.readUnsignedByte(); // L: 320
			if (var4 == 1) { // L: 321
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte(); // L: 322
			if (var5 == 1) { // L: 323
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte(); // L: 324
			if (var6 == 1) { // L: 325
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte(); // L: 326
			if (var7 == 1) { // L: 327
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte(); // L: 328
			this.paddingY = var1.readUnsignedByte(); // L: 329
			this.inventoryXOffsets = new int[20]; // L: 330
			this.inventoryYOffsets = new int[20]; // L: 331
			this.inventorySprites = new int[20]; // L: 332

			int var8;
			for (var8 = 0; var8 < 20; ++var8) { // L: 333
				int var11 = var1.readUnsignedByte(); // L: 334
				if (var11 == 1) { // L: 335
					this.inventoryXOffsets[var8] = var1.readShort(); // L: 336
					this.inventoryYOffsets[var8] = var1.readShort(); // L: 337
					this.inventorySprites[var8] = var1.readInt(); // L: 338
				} else {
					this.inventorySprites[var8] = -1; // L: 340
				}
			}

			this.itemActions = new String[5]; // L: 342

			for (var8 = 0; var8 < 5; ++var8) { // L: 343
				String var9 = var1.readStringCp1252NullTerminated(); // L: 344
				if (var9.length() > 0) { // L: 345
					this.itemActions[var8] = var9; // L: 346
					this.flags |= 1 << var8 + 23; // L: 347
				}
			}
		}

		if (this.type == 3) { // L: 351
			this.fill = var1.readUnsignedByte() == 1; // L: 352
		}

		if (this.type == 4 || this.type == 1) { // L: 354
			this.textXAlignment = var1.readUnsignedByte(); // L: 355
			this.textYAlignment = var1.readUnsignedByte(); // L: 356
			this.textLineHeight = var1.readUnsignedByte(); // L: 357
			this.fontId = var1.readUnsignedShort(); // L: 358
			if (this.fontId == 65535) { // L: 359
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 360
		}

		if (this.type == 4) { // L: 362
			this.text = var1.readStringCp1252NullTerminated(); // L: 363
			this.text2 = var1.readStringCp1252NullTerminated(); // L: 364
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 366
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 367
			this.color2 = var1.readInt(); // L: 368
			this.mouseOverColor = var1.readInt(); // L: 369
			this.mouseOverColor2 = var1.readInt(); // L: 370
		}

		if (this.type == 5) { // L: 372
			this.spriteId2 = var1.readInt(); // L: 373
			this.spriteId = var1.readInt(); // L: 374
		}

		if (this.type == 6) { // L: 376
			this.modelType = 1; // L: 377
			this.modelId = var1.readUnsignedShort(); // L: 378
			if (this.modelId == 65535) { // L: 379
				this.modelId = -1;
			}

			this.modelType2 = 1; // L: 380
			this.modelId2 = var1.readUnsignedShort(); // L: 381
			if (this.modelId2 == 65535) { // L: 382
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 383
			if (this.sequenceId == 65535) { // L: 384
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 385
			if (this.sequenceId2 == 65535) { // L: 386
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 387
			this.modelAngleX = var1.readUnsignedShort(); // L: 388
			this.modelAngleY = var1.readUnsignedShort(); // L: 389
		}

		if (this.type == 7) { // L: 391
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 392
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 393
			this.textXAlignment = var1.readUnsignedByte(); // L: 394
			this.fontId = var1.readUnsignedShort(); // L: 395
			if (this.fontId == 65535) { // L: 396
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 397
			this.color = var1.readInt(); // L: 398
			this.paddingX = var1.readShort(); // L: 399
			this.paddingY = var1.readShort(); // L: 400
			var4 = var1.readUnsignedByte(); // L: 401
			if (var4 == 1) { // L: 402
				this.flags |= 1073741824;
			}

			this.itemActions = new String[5]; // L: 403

			for (var5 = 0; var5 < 5; ++var5) { // L: 404
				String var10 = var1.readStringCp1252NullTerminated(); // L: 405
				if (var10.length() > 0) { // L: 406
					this.itemActions[var5] = var10; // L: 407
					this.flags |= 1 << var5 + 23; // L: 408
				}
			}
		}

		if (this.type == 8) { // L: 412
			this.text = var1.readStringCp1252NullTerminated(); // L: 413
		}

		if (this.buttonType == 2 || this.type == 2) { // L: 415
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 416
			this.spellName = var1.readStringCp1252NullTerminated(); // L: 417
			var4 = var1.readUnsignedShort() & 63; // L: 418
			this.flags |= var4 << 11; // L: 419
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 421
			this.buttonText = var1.readStringCp1252NullTerminated(); // L: 422
			if (this.buttonText.length() == 0) { // L: 423
				if (this.buttonType == 1) { // L: 424
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) { // L: 425
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) { // L: 426
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) { // L: 427
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 430
			this.flags |= 4194304; // L: 431
		}

		if (this.buttonType == 6) { // L: 433
			this.flags |= 1; // L: 434
		}

	} // L: 436

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "194738326"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 439
		this.isIf3 = true; // L: 440
		this.type = var1.readUnsignedByte(); // L: 441
		this.contentType = var1.readUnsignedShort(); // L: 442
		this.rawX = var1.readShort(); // L: 443
		this.rawY = var1.readShort(); // L: 444
		this.rawWidth = var1.readUnsignedShort(); // L: 445
		if (this.type == 9) { // L: 446
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 447
		}

		this.widthAlignment = var1.readByte(); // L: 448
		this.heightAlignment = var1.readByte(); // L: 449
		this.xAlignment = var1.readByte(); // L: 450
		this.yAlignment = var1.readByte(); // L: 451
		this.parentId = var1.readUnsignedShort(); // L: 452
		if (this.parentId == 65535) { // L: 453
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 454
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 455
		if (this.type == 0) { // L: 456
			this.scrollWidth = var1.readUnsignedShort(); // L: 457
			this.scrollHeight = var1.readUnsignedShort(); // L: 458
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 459
		}

		if (this.type == 5) { // L: 461
			this.spriteId2 = var1.readInt(); // L: 462
			this.spriteAngle = var1.readUnsignedShort(); // L: 463
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 464
			this.transparencyTop = var1.readUnsignedByte(); // L: 465
			this.outline = var1.readUnsignedByte(); // L: 466
			this.spriteShadow = var1.readInt(); // L: 467
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 468
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 469
		}

		if (this.type == 6) { // L: 471
			this.modelType = 1; // L: 472
			this.modelId = var1.readUnsignedShort(); // L: 473
			if (this.modelId == 65535) { // L: 474
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 475
			this.modelOffsetY = var1.readShort(); // L: 476
			this.modelAngleX = var1.readUnsignedShort(); // L: 477
			this.modelAngleY = var1.readUnsignedShort(); // L: 478
			this.modelAngleZ = var1.readUnsignedShort(); // L: 479
			this.modelZoom = var1.readUnsignedShort(); // L: 480
			this.sequenceId = var1.readUnsignedShort(); // L: 481
			if (this.sequenceId == 65535) { // L: 482
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 483
			var1.readUnsignedShort(); // L: 484
			if (this.widthAlignment != 0) { // L: 485
				this.field3616 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 486
				var1.readUnsignedShort(); // L: 487
			}
		}

		if (this.type == 4) { // L: 490
			this.fontId = var1.readUnsignedShort(); // L: 491
			if (this.fontId == 65535) { // L: 492
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 493
			this.textLineHeight = var1.readUnsignedByte(); // L: 494
			this.textXAlignment = var1.readUnsignedByte(); // L: 495
			this.textYAlignment = var1.readUnsignedByte(); // L: 496
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 497
			this.color = var1.readInt(); // L: 498
		}

		if (this.type == 3) { // L: 500
			this.color = var1.readInt(); // L: 501
			this.fill = var1.readUnsignedByte() == 1; // L: 502
			this.transparencyTop = var1.readUnsignedByte(); // L: 503
		}

		if (this.type == 9) { // L: 505
			this.lineWid = var1.readUnsignedByte(); // L: 506
			this.color = var1.readInt(); // L: 507
			this.field3606 = var1.readUnsignedByte() == 1; // L: 508
		}

		this.flags = var1.readMedium(); // L: 510
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 511
		int var2 = var1.readUnsignedByte(); // L: 512
		if (var2 > 0) { // L: 513
			this.actions = new String[var2]; // L: 514

			for (int var3 = 0; var3 < var2; ++var3) { // L: 515
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 517
		this.dragThreshold = var1.readUnsignedByte(); // L: 518
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 519
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 520
		this.onLoad = this.readListener(var1); // L: 521
		this.onMouseOver = this.readListener(var1); // L: 522
		this.onMouseLeave = this.readListener(var1); // L: 523
		this.onTargetLeave = this.readListener(var1); // L: 524
		this.onTargetEnter = this.readListener(var1); // L: 525
		this.onVarTransmit = this.readListener(var1); // L: 526
		this.onInvTransmit = this.readListener(var1); // L: 527
		this.onStatTransmit = this.readListener(var1); // L: 528
		this.onTimer = this.readListener(var1); // L: 529
		this.onOp = this.readListener(var1); // L: 530
		this.onMouseRepeat = this.readListener(var1); // L: 531
		this.onClick = this.readListener(var1); // L: 532
		this.onClickRepeat = this.readListener(var1); // L: 533
		this.onRelease = this.readListener(var1); // L: 534
		this.onHold = this.readListener(var1); // L: 535
		this.onDrag = this.readListener(var1); // L: 536
		this.onDragComplete = this.readListener(var1); // L: 537
		this.onScroll = this.readListener(var1); // L: 538
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 539
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 540
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 541
	} // L: 542

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)[Ljava/lang/Object;",
		garbageValue = "-1959052330"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 545
		if (var2 == 0) { // L: 546
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 547

			for (int var4 = 0; var4 < var2; ++var4) { // L: 548
				int var5 = var1.readUnsignedByte(); // L: 549
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 550
				} else if (var5 == 1) { // L: 551
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 553
			return var3; // L: 554
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)[I",
		garbageValue = "1696359001"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 558
		if (var2 == 0) { // L: 559
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 560

			for (int var4 = 0; var4 < var2; ++var4) { // L: 561
				var3[var4] = var1.readInt(); // L: 562
			}

			return var3; // L: 564
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "825349497"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2]; // L: 568
		this.itemIds[var2] = this.itemIds[var1]; // L: 569
		this.itemIds[var1] = var3; // L: 570
		var3 = this.itemQuantities[var2]; // L: 571
		this.itemQuantities[var2] = this.itemQuantities[var1]; // L: 572
		this.itemQuantities[var1] = var3; // L: 573
	} // L: 574

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ZLdi;I)Lrs;",
		garbageValue = "-342617592"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3579 = false; // L: 577
		if (this.field3588 != null) { // L: 578
			SpritePixels var3 = this.method6215(var2); // L: 579
			if (var3 != null) { // L: 580
				return var3; // L: 581
			}
		}

		int var7;
		if (var1) { // L: 585
			var7 = this.spriteId;
		} else {
			var7 = this.spriteId2; // L: 586
		}

		if (var7 == -1) { // L: 587
			return null;
		} else {
			long var4 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var7 + ((long)this.spriteShadow << 40); // L: 588
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4); // L: 589
			if (var6 != null) { // L: 590
				return var6;
			} else {
				var6 = BZip2State.SpriteBuffer_getSprite(World.Widget_spritesArchive, var7, 0); // L: 591
				if (var6 == null) { // L: 592
					field3579 = true; // L: 593
					return null; // L: 594
				} else {
					this.method6261(var6); // L: 596
					Widget_cachedSprites.put(var6, var4); // L: 597
					return var6; // L: 598
				}
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)Lrs;",
		garbageValue = "-1845458469"
	)
	SpritePixels method6215(UrlRequester var1) {
		if (!this.method6300()) { // L: 602
			return this.method6232(var1); // L: 603
		} else {
			String var2 = this.field3588 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 605
			SpritePixels var3 = (SpritePixels)field3548.method7483(var2); // L: 606
			if (var3 == null) { // L: 607
				SpritePixels var4 = this.method6232(var1); // L: 608
				if (var4 != null) { // L: 609
					var3 = var4.method9156(); // L: 610
					this.method6261(var3); // L: 611
					field3548.method7484(var2, var3); // L: 612
				}
			}

			return var3; // L: 615
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)Lrs;",
		garbageValue = "-1086439026"
	)
	SpritePixels method6232(UrlRequester var1) {
		if (this.field3588 != null && var1 != null) { // L: 619
			class304 var2 = (class304)field3547.method7483(this.field3588); // L: 620
			if (var2 == null) { // L: 621
				var2 = new class304(this.field3588, var1); // L: 622
				field3547.method7484(this.field3588, var2); // L: 623
			}

			return var2.method5876(); // L: 625
		} else {
			return null; // L: 627
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "255152987"
	)
	boolean method6300() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 631
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lrs;B)V",
		garbageValue = "2"
	)
	void method6261(SpritePixels var1) {
		if (this.spriteFlipV) { // L: 635
			var1.flipVertically();
		}

		if (this.spriteFlipH) { // L: 636
			var1.flipHorizontally();
		}

		if (this.outline > 0) { // L: 637
			var1.pad(this.outline);
		}

		if (this.outline >= 1) { // L: 638
			var1.outline(1);
		}

		if (this.outline >= 2) { // L: 639
			var1.outline(16777215);
		}

		if (this.spriteShadow != 0) { // L: 640
			var1.shadow(this.spriteShadow);
		}

	} // L: 641

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Lnv;",
		garbageValue = "426572504"
	)
	@Export("getFont")
	public Font getFont() {
		field3579 = false; // L: 644
		if (this.fontId == -1) { // L: 645
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 646
			if (var1 != null) { // L: 647
				return var1;
			} else {
				var1 = class33.method488(World.Widget_spritesArchive, Script.Widget_fontsArchive, this.fontId, 0); // L: 648
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId); // L: 649
				} else {
					field3579 = true; // L: 650
				}

				return var1; // L: 651
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrs;",
		garbageValue = "-60"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3579 = false; // L: 655
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 656
			int var2 = this.inventorySprites[var1]; // L: 657
			if (var2 == -1) { // L: 658
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2); // L: 659
				if (var3 != null) { // L: 660
					return var3;
				} else {
					var3 = BZip2State.SpriteBuffer_getSprite(World.Widget_spritesArchive, var2, 0); // L: 661
					if (var3 != null) { // L: 662
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field3579 = true; // L: 663
					}

					return var3; // L: 664
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lge;IZLka;Lgo;Lgj;I)Lhs;",
		garbageValue = "-2035273042"
	)
	public Model method6206(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4, NPCComposition var5, class189 var6) {
		field3579 = false; // L: 668
		int var7;
		int var8;
		if (var3) { // L: 671
			var7 = this.modelType2; // L: 672
			var8 = this.modelId2; // L: 673
		} else {
			var7 = this.modelType; // L: 676
			var8 = this.modelId; // L: 677
		}

		if (var7 == 6) { // L: 679
			if (var5 == null) { // L: 680
				return null;
			}

			var8 = var5.id; // L: 681
		}

		if (var7 == 0) { // L: 683
			return null;
		} else if (var7 == 1 && var8 == -1) { // L: 684
			return null;
		} else {
			long var9 = (long)(var8 + (var7 << 16)); // L: 685
			if (var6 != null) { // L: 686
				var9 |= var6.field2021 << 20;
			}

			Model var11 = (Model)Widget_cachedModels.get(var9); // L: 687
			if (var11 == null) { // L: 688
				ModelData var12 = null; // L: 689
				int var13 = 64; // L: 690
				int var14 = 768; // L: 691
				switch(var7) { // L: 692
				case 1:
					var12 = ModelData.ModelData_get(class145.Widget_modelsArchive, var8, 0); // L: 706
					break; // L: 707
				case 2:
					var12 = class137.getNpcDefinition(var8).method3750((class189)null); // L: 709
					break;
				case 3:
					var12 = var4 != null ? var4.getModelData() : null; // L: 694
					break;
				case 4:
					ItemComposition var15 = TileItem.ItemComposition_get(var8); // L: 700
					var12 = var15.getModelData(10); // L: 701
					var13 += var15.field2263; // L: 702
					var14 += var15.field2256 * 5; // L: 703
				case 5:
				default:
					break;
				case 6:
					var12 = class137.getNpcDefinition(var8).method3750(var6); // L: 697
				}

				if (var12 == null) { // L: 712
					field3579 = true; // L: 713
					return null; // L: 714
				}

				var11 = var12.toModel(var13, var14, -50, -10, -50); // L: 716
				Widget_cachedModels.put(var11, var9); // L: 717
			}

			if (var1 != null) { // L: 719
				var11 = var1.transformWidgetModel(var11, var2); // L: 720
			}

			return var11; // L: 722
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lkb;",
		garbageValue = "2135833005"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 726
			var1 = false;
		}

		int var2 = var1 ? this.spriteId : this.spriteId2; // L: 727
		if (var2 == -1) { // L: 728
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 729
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 730
			if (var5 != null) { // L: 731
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, (UrlRequester)null); // L: 732
				if (var6 == null) { // L: 733
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 734
					int[] var8 = new int[var7.subHeight]; // L: 735
					int[] var9 = new int[var7.subHeight]; // L: 736

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 737
						int var11 = 0; // L: 738
						int var12 = var7.subWidth; // L: 739

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 740
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 741
								var11 = var13; // L: 742
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 746
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 747
								var12 = var13 + 1; // L: 748
								break;
							}
						}

						var8[var10] = var11; // L: 752
						var9[var10] = var12 - var11; // L: 753
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 755
					Widget_cachedSpriteMasks.put(var5, var3); // L: 756
					return var5; // L: 757
				}
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "954231847"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 761
			String[] var3 = new String[var1 + 1]; // L: 762
			if (this.actions != null) { // L: 763
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 764
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 766
		}

		this.actions[var1] = var2; // L: 768
	} // L: 769

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-525383204"
	)
	public boolean method6209() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12; // L: 772
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "72"
	)
	public boolean method6210() {
		return this.type == 11 || this.type == 12; // L: 776
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ldi;J)V"
	)
	public void method6211(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && -1L != var3) { // L: 780
			var1 = var1.replaceAll("%userid%", Long.toString(var3)); // L: 781
			this.field3625 = new class166(); // L: 782
			if (!this.field3625.method3418(var1, var2)) { // L: 783
				this.field3625 = null; // L: 784
			} else {
				if (this.field3627 == null || this.field3571 == null) { // L: 787
					this.method6324(); // L: 788
				}

			}
		}
	} // L: 785 790

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "775377235"
	)
	void method6324() {
		this.field3627 = new HashMap(); // L: 793
		this.field3571 = new HashMap(); // L: 794
	} // L: 795

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "40495858"
	)
	public void method6213(int var1, int var2) {
		if (this.type == 11) { // L: 798
			if (this.field3627 == null) { // L: 799
				this.method6324();
			}

			this.field3627.put(var1, var2); // L: 800
		}
	} // L: 801

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "2133056673"
	)
	public void method6214(String var1, int var2) {
		if (this.type == 11) { // L: 804
			if (this.field3571 == null) {
				this.method6324(); // L: 805
			}

			this.field3571.put(var1, var2); // L: 806
		}
	} // L: 807

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-12"
	)
	public boolean method6351() {
		return this.field3647 == 2; // L: 810
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1084482893"
	)
	public int method6216(String var1) {
		return this.type == 11 && this.field3625 != null && this.method6351() ? this.field3625.method3433(var1) : -1; // L: 814 815 817
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1171040032"
	)
	public String method6285(String var1) {
		return this.type == 11 && this.field3625 != null && this.method6351() ? this.field3625.method3422(var1) : null; // L: 821 822
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "740473322"
	)
	public int method6218() {
		return this.field3571 != null && this.field3571.size() > 0 ? 1 : 0; // L: 826
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-364384407"
	)
	public int method6335() {
		if (this.type == 11 && this.field3625 != null && this.field3571 != null && !this.field3571.isEmpty()) { // L: 830
			String var1 = this.field3625.method3425(); // L: 831
			return var1 != null && this.field3571.containsKey(this.field3625.method3425()) ? (Integer)this.field3571.get(var1) : -1; // L: 832 833 835
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1316992101"
	)
	public String method6229() {
		if (this.type == 11 && this.field3625 != null) { // L: 839
			String var1 = this.field3625.method3425(); // L: 840
			Iterator var2 = this.field3625.method3448().iterator(); // L: 841

			while (var2.hasNext()) {
				class177 var3 = (class177)var2.next(); // L: 842
				String var4 = String.format("%%%S%%", var3.method3535()); // L: 844
				if (var3.vmethod3537() == 0) { // L: 845
					var1.replaceAll(var4, Integer.toString(var3.vmethod3539())); // L: 846
				} else {
					var1.replaceAll(var4, var3.vmethod3540()); // L: 849
				}
			}

			return var1; // L: 853
		} else {
			return null; // L: 852
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1078145387"
	)
	public int[] method6247() {
		if (this.type == 11 && this.field3625 != null) { // L: 857
			int[] var1 = new int[3]; // L: 858
			int var2 = 0; // L: 859
			Iterator var3 = this.field3625.method3448().iterator(); // L: 860

			while (var3.hasNext()) {
				class177 var4 = (class177)var3.next(); // L: 861
				if (!var4.method3535().equals("user_id")) { // L: 863
					if (var4.vmethod3537() != 0) { // L: 864
						return null; // L: 871
					}

					var1[var2++] = var4.vmethod3539(); // L: 865
					if (var2 > 3) { // L: 866
						return null; // L: 867
					}
				}
			}

			return var1; // L: 876
		} else {
			return null;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)Z",
		garbageValue = "-2033209000"
	)
	public boolean method6222(UrlRequester var1) {
		if (this.type == 11 && this.field3625 != null) { // L: 880
			this.field3625.method3419(var1); // L: 881
			if (this.field3625.method3420() != this.field3647) { // L: 882
				this.field3647 = this.field3625.method3420(); // L: 883
				if (this.field3647 >= 100) { // L: 884
					return true; // L: 885
				}

				if (this.field3647 == 2) { // L: 887
					this.method6223(); // L: 888
					return true; // L: 889
				}
			}

			return false; // L: 892
		} else {
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "7436"
	)
	void method6223() {
		this.noClickThrough = true; // L: 913
		ArrayList var1 = this.field3625.method3459(); // L: 914
		ArrayList var2 = this.field3625.method3424(); // L: 915
		int var3 = var1.size() + var2.size(); // L: 916
		this.children = new Widget[var3]; // L: 917
		int var4 = 0; // L: 918

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 919 926 928
			class172 var6 = (class172)var5.next(); // L: 920
			var7 = ModeWhere.method6784(5, this, var4, 0, 0, 0, 0, var6.field1864); // L: 922
			var7.field3588 = var6.field1870.method2889(); // L: 923
			class304 var8 = new class304(var6.field1870); // L: 924
			field3547.method7484(var7.field3588, var8); // L: 925
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 929 937
			class173 var9 = (class173)var5.next(); // L: 930
			var7 = ModeWhere.method6784(4, this, var4, 0, 0, 0, 0, var9.field1880); // L: 932
			var7.text = var9.field1875; // L: 933
			var7.fontId = (Integer)this.field3627.get(var9.field1879); // L: 934
			var7.textXAlignment = var9.field1876; // L: 935
			var7.textYAlignment = var9.field1878; // L: 936
		}

	} // L: 940

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "4210683"
	)
	public void method6224() {
		this.field3629 = new class305(); // L: 943

		for (int var1 = 1; var1 <= 12; ++var1) { // L: 944
			this.field3629.field3478.method391(var1, 0); // L: 945
		}

		for (char var2 = 0; var2 < ' '; ++var2) { // L: 947
			this.field3629.field3478.method417(var2, 0); // L: 948
		}

		this.field3629.field3478.method417('\u0080', 0); // L: 950
		this.field3629.field3478.method391(82, 2); // L: 951
		this.field3629.field3478.method391(81, 2); // L: 952
		this.field3629.field3478.method391(86, 2); // L: 953
	} // L: 954

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Lkp;",
		garbageValue = "-2119686482"
	)
	public class307 method6235() {
		return this.field3629 != null ? this.field3629.field3476 : null; // L: 957
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lkr;",
		garbageValue = "-10"
	)
	public class302 method6226() {
		return this.field3629 != null ? this.field3629.field3477 : null; // L: 961
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Laa;",
		garbageValue = "-2122308781"
	)
	public class27 method6227() {
		return this.field3629 != null ? this.field3629.field3478 : null; // L: 965
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lkl;",
		garbageValue = "2018701913"
	)
	public class305 method6228() {
		return this.field3629; // L: 969
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lkp;B)Z",
		garbageValue = "19"
	)
	boolean method6301(class307 var1) {
		boolean var2 = false; // L: 973
		String var5;
		String var6;
		StringBuilder var7;
		int var8;
		int var9;
		int var10;
		char var11;
		String var12;
		if (this.text != null && !this.text.isEmpty()) { // L: 974
			var6 = this.text; // L: 978
			var7 = new StringBuilder(var6.length()); // L: 980
			var8 = 0; // L: 981
			var9 = -1; // L: 982

			for (var10 = 0; var10 < var6.length(); ++var10) { // L: 983
				var11 = var6.charAt(var10); // L: 984
				if (var11 == '<') { // L: 985
					var7.append(var6.substring(var8, var10)); // L: 986
					var9 = var10; // L: 987
				} else if (var11 == '>' && var9 != -1) { // L: 990
					var12 = var6.substring(var9 + 1, var10); // L: 991
					var9 = -1; // L: 992
					if (var12.equals("lt")) { // L: 993
						var7.append("<"); // L: 994
					} else if (var12.equals("gt")) { // L: 996
						var7.append(">"); // L: 997
					} else if (var12.equals("br")) { // L: 999
						var7.append("\n"); // L: 1000
					}

					var8 = var10 + 1; // L: 1002
				}
			}

			if (var8 < var6.length()) { // L: 1005
				var7.append(var6.substring(var8, var6.length())); // L: 1006
			}

			var5 = var7.toString(); // L: 1008
			var2 |= var1.method5946(var5); // L: 1010
			this.text = ""; // L: 1011
		}

		if (this.text2 != null && !this.text2.isEmpty()) { // L: 1013
			var6 = this.text2; // L: 1017
			var7 = new StringBuilder(var6.length()); // L: 1019
			var8 = 0; // L: 1020
			var9 = -1; // L: 1021

			for (var10 = 0; var10 < var6.length(); ++var10) { // L: 1022
				var11 = var6.charAt(var10); // L: 1023
				if (var11 == '<') { // L: 1024
					var7.append(var6.substring(var8, var10)); // L: 1025
					var9 = var10; // L: 1026
				} else if (var11 == '>' && var9 != -1) { // L: 1029
					var12 = var6.substring(var9 + 1, var10); // L: 1030
					var9 = -1; // L: 1031
					if (var12.equals("lt")) { // L: 1032
						var7.append("<"); // L: 1033
					} else if (var12.equals("gt")) { // L: 1035
						var7.append(">"); // L: 1036
					} else if (var12.equals("br")) { // L: 1038
						var7.append("\n"); // L: 1039
					}

					var8 = var10 + 1; // L: 1041
				}
			}

			if (var8 < var6.length()) { // L: 1044
				var7.append(var6.substring(var8, var6.length())); // L: 1045
			}

			var5 = var7.toString(); // L: 1047
			var2 |= var1.method5926(var5); // L: 1049
			this.text2 = ""; // L: 1050
		}

		return var2; // L: 1052
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-474027156"
	)
	public boolean method6339() {
		class307 var1 = this.method6235(); // L: 1056
		if (var1 == null) { // L: 1057
			return false;
		} else {
			boolean var2 = false; // L: 1058
			if (!var1.method5979() && this.fontId != -1) { // L: 1059
				int var3 = var1.method5980(); // L: 1060
				int var4 = var1.method6041(); // L: 1061
				int var5 = var1.method5978(); // L: 1062
				int var6 = var1.method6145(); // L: 1063
				Font var7 = this.getFont(); // L: 1064
				if (var7 != null) { // L: 1065
					var2 |= var1.method6033(var7); // L: 1066
					var2 |= this.method6301(var1); // L: 1067
					var2 |= var1.method5932(var3, var4); // L: 1068
					var2 |= var1.method6013(var5, var6); // L: 1069
				}
			} else if (var1.method5979()) { // L: 1072
				var2 |= this.method6301(var1); // L: 1073
			}

			var1.method5922(); // L: 1075
			return var2; // L: 1076
		}
	}
}
