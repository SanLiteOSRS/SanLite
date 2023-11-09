import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("bd")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	static class424 field3765;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	static class424 field3670;
	@ObfuscatedName("bw")
	public static boolean field3754;
	@ObfuscatedName("be")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -232044627
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1116520775
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1878130101
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1915483963
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1430877071
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 2117757955
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 525984847
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 735311051
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1291193731
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -2048644273
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1602574411
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1929789851
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1472443045
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -485946073
	)
	@Export("x")
	public int x;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1816792705
	)
	@Export("y")
	public int y;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1247813383
	)
	@Export("width")
	public int width;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -633207203
	)
	@Export("height")
	public int height;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1403808905
	)
	public int field3672;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -401480271
	)
	public int field3641;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1253984169
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("cw")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 465950841
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1007081007
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 685053883
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1689285839
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1026146983
	)
	@Export("color")
	public int color;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1852743327
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 625559939
	)
	public int field3650;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 427659507
	)
	public int field3651;
	@ObfuscatedName("cd")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("fillMode")
	public class525 fillMode;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 433873471
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1515062185
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1570582305
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("ch")
	public boolean field3725;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 701078763
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1115295013
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cv")
	public String field3660;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -547144445
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("dc")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1589898067
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 1342850943
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("dj")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("dy")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 770390107
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -592869933
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -1385222223
	)
	int field3669;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -85085275
	)
	int field3751;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -893926927
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 1163255789
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 726969051
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -1332644923
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 2072150989
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -861979179
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -2051024365
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -33170067
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1428674931
	)
	public int field3679;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1650813479
	)
	public int field3680;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	public PlayerComposition field3681;
	@ObfuscatedName("da")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dv")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 1099986701
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 497201407
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("db")
	@Export("text")
	public String text;
	@ObfuscatedName("dw")
	public String field3687;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = 1300975293
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = -1809558385
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		intValue = 950763823
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("el")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	class170 field3692;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = 1322658349
	)
	int field3693;
	@ObfuscatedName("eo")
	HashMap field3694;
	@ObfuscatedName("eb")
	HashMap field3695;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	class328 field3696;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -1861263951
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("en")
	public boolean field3698;
	@ObfuscatedName("es")
	public byte[][] field3711;
	@ObfuscatedName("eq")
	public byte[][] field3700;
	@ObfuscatedName("ee")
	public int[] field3657;
	@ObfuscatedName("eg")
	public int[] field3630;
	@ObfuscatedName("ef")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ev")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		intValue = 1073014071
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = 2092646495
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("ep")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("fm")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("fa")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("fg")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("fq")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("fy")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("fw")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("fp")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("fz")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fj")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("fb")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("fl")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fd")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fh")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fc")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fu")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fv")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fr")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fs")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fn")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("ff")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fk")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("ft")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fe")
	public Object[] field3628;
	@ObfuscatedName("fo")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fx")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fi")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("gc")
	public Object[] field3618;
	@ObfuscatedName("gp")
	public Object[] field3635;
	@ObfuscatedName("ga")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("gg")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("gs")
	public Object[] field3739;
	@ObfuscatedName("ge")
	public Object[] field3740;
	@ObfuscatedName("go")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("gh")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("gj")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gm")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gx")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gr")
	public Object[] field3746;
	@ObfuscatedName("gy")
	public Object[] field3747;
	@ObfuscatedName("gt")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gq")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gv")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = -1907982299
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gd")
	public String field3752;
	@ObfuscatedName("gf")
	public String field3753;
	@ObfuscatedName("gk")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gz")
	public int[] field3755;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = 1993931981
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = -2020894495
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = -1430583723
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 517958231
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "[Lmt;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("hf")
	public boolean field3761;
	@ObfuscatedName("hv")
	public boolean field3762;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = -265080089
	)
	public int field3763;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = 898476353
	)
	public int field3748;
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = -1681639235
	)
	public int field3675;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -1983551921
	)
	public int field3766;
	@ObfuscatedName("he")
	@ObfuscatedGetter(
		intValue = 1720579133
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = -218267641
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("ha")
	public int[] field3769;
	@ObfuscatedName("hr")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("hm")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hz")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 60
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 61
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 62
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 63
		field3765 = new class424(10, class422.field4609); // L: 64
		field3670 = new class424(10, class422.field4609); // L: 65
		field3754 = false; // L: 66
	}

	public Widget() {
		this.isIf3 = false; // L: 67
		this.id = -1; // L: 68
		this.childIndex = -1; // L: 69
		this.buttonType = 0; // L: 71
		this.contentType = 0; // L: 72
		this.xAlignment = 0; // L: 73
		this.yAlignment = 0; // L: 74
		this.widthAlignment = 0; // L: 75
		this.heightAlignment = 0; // L: 76
		this.rawX = 0; // L: 77
		this.rawY = 0; // L: 78
		this.rawWidth = 0; // L: 79
		this.rawHeight = 0; // L: 80
		this.x = 0; // L: 81
		this.y = 0; // L: 82
		this.width = 0; // L: 83
		this.height = 0; // L: 84
		this.field3672 = 1; // L: 85
		this.field3641 = 1; // L: 86
		this.parentId = -1; // L: 87
		this.isHidden = false; // L: 88
		this.scrollX = 0; // L: 89
		this.scrollY = 0; // L: 90
		this.scrollWidth = 0; // L: 91
		this.scrollHeight = 0; // L: 92
		this.color = 0; // L: 93
		this.color2 = 0; // L: 94
		this.field3650 = 0; // L: 95
		this.field3651 = 0; // L: 96
		this.fill = false; // L: 97
		this.fillMode = class525.SOLID; // L: 98
		this.transparencyTop = 0; // L: 99
		this.transparencyBot = 0; // L: 100
		this.lineWid = 1; // L: 101
		this.field3725 = false; // L: 102
		this.spriteId2 = -1; // L: 103
		this.spriteId = -1; // L: 104
		this.spriteAngle = 0; // L: 106
		this.spriteTiling = false; // L: 107
		this.outline = 0; // L: 108
		this.spriteShadow = 0; // L: 109
		this.modelType = 1; // L: 112
		this.modelId = -1; // L: 113
		this.field3669 = 1; // L: 114
		this.field3751 = -1; // L: 115
		this.sequenceId = -1; // L: 116
		this.sequenceId2 = -1; // L: 117
		this.modelOffsetX = 0; // L: 118
		this.modelOffsetY = 0; // L: 119
		this.modelAngleX = 0; // L: 120
		this.modelAngleY = 0; // L: 121
		this.modelAngleZ = 0; // L: 122
		this.modelZoom = 100; // L: 123
		this.field3679 = 0; // L: 124
		this.field3680 = 0; // L: 125
		this.modelOrthog = false; // L: 127
		this.modelTransparency = false; // L: 128
		this.itemQuantityMode = 2; // L: 129
		this.fontId = -1; // L: 130
		this.text = ""; // L: 131
		this.field3687 = ""; // L: 132
		this.textLineHeight = 0; // L: 133
		this.textXAlignment = 0; // L: 134
		this.textYAlignment = 0; // L: 135
		this.textShadowed = false; // L: 136
		this.field3693 = -1; // L: 138
		this.flags = 0; // L: 143
		this.field3698 = false; // L: 144
		this.dataText = ""; // L: 153
		this.parent = null; // L: 155
		this.dragZoneSize = 0; // L: 156
		this.dragThreshold = 0; // L: 157
		this.isScrollBar = false; // L: 158
		this.spellActionName = ""; // L: 159
		this.hasListener = false; // L: 160
		this.mouseOverRedirect = -1; // L: 201
		this.field3752 = ""; // L: 202
		this.field3753 = "Ok"; // L: 203
		this.itemId = -1; // L: 206
		this.itemQuantity = 0; // L: 207
		this.modelFrame = 0; // L: 208
		this.modelFrameCycle = 0; // L: 209
		this.field3761 = false; // L: 211
		this.field3762 = false; // L: 212
		this.field3763 = -1; // L: 213
		this.field3748 = 0; // L: 214
		this.field3675 = 0; // L: 215
		this.field3766 = 0; // L: 216
		this.rootIndex = -1; // L: 217
		this.cycle = -1; // L: 218
		this.noClickThrough = false; // L: 220
		this.noScrollThrough = false; // L: 221
		this.prioritizeMenuEntry = false; // L: 222
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "765391590"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 266
		this.type = var1.readUnsignedByte(); // L: 267
		this.buttonType = var1.readUnsignedByte(); // L: 268
		this.contentType = var1.readUnsignedShort(); // L: 269
		this.rawX = var1.readShort(); // L: 270
		this.rawY = var1.readShort(); // L: 271
		this.rawWidth = var1.readUnsignedShort(); // L: 272
		this.rawHeight = var1.readUnsignedShort(); // L: 273
		this.transparencyTop = var1.readUnsignedByte(); // L: 274
		this.parentId = var1.readUnsignedShort(); // L: 275
		if (this.parentId == 65535) { // L: 276
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 277
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 278
		if (this.mouseOverRedirect == 65535) { // L: 279
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 280
		int var3;
		if (var2 > 0) { // L: 281
			this.cs1Comparisons = new int[var2]; // L: 282
			this.cs1ComparisonValues = new int[var2]; // L: 283

			for (var3 = 0; var3 < var2; ++var3) { // L: 284
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 285
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 286
			}
		}

		var3 = var1.readUnsignedByte(); // L: 289
		int var4;
		if (var3 > 0) { // L: 290
			this.cs1Instructions = new int[var3][]; // L: 291

			for (var4 = 0; var4 < var3; ++var4) { // L: 292
				int var5 = var1.readUnsignedShort(); // L: 293
				this.cs1Instructions[var4] = new int[var5]; // L: 294

				for (int var6 = 0; var6 < var5; ++var6) { // L: 295
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 296
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 297
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 301
			this.scrollHeight = var1.readUnsignedShort(); // L: 302
			this.isHidden = var1.readUnsignedByte() == 1; // L: 303
		}

		if (this.type == 1) { // L: 305
			var1.readUnsignedShort(); // L: 306
			var1.readUnsignedByte(); // L: 307
		}

		if (this.type == 3) { // L: 309
			this.fill = var1.readUnsignedByte() == 1; // L: 310
		}

		if (this.type == 4 || this.type == 1) { // L: 312
			this.textXAlignment = var1.readUnsignedByte(); // L: 313
			this.textYAlignment = var1.readUnsignedByte(); // L: 314
			this.textLineHeight = var1.readUnsignedByte(); // L: 315
			this.fontId = var1.readUnsignedShort(); // L: 316
			if (this.fontId == 65535) { // L: 317
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 318
		}

		if (this.type == 4) { // L: 320
			this.text = var1.readStringCp1252NullTerminated(); // L: 321
			this.field3687 = var1.readStringCp1252NullTerminated(); // L: 322
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 324
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 325
			this.color2 = var1.readInt(); // L: 326
			this.field3650 = var1.readInt(); // L: 327
			this.field3651 = var1.readInt(); // L: 328
		}

		if (this.type == 5) { // L: 330
			this.spriteId2 = var1.readInt(); // L: 331
			this.spriteId = var1.readInt(); // L: 332
		}

		if (this.type == 6) { // L: 334
			this.modelType = 1; // L: 335
			this.modelId = var1.readUnsignedShort(); // L: 336
			if (this.modelId == 65535) { // L: 337
				this.modelId = -1;
			}

			this.field3669 = 1; // L: 338
			this.field3751 = var1.readUnsignedShort(); // L: 339
			if (this.field3751 == 65535) { // L: 340
				this.field3751 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 341
			if (this.sequenceId == 65535) { // L: 342
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 343
			if (this.sequenceId2 == 65535) { // L: 344
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 345
			this.modelAngleX = var1.readUnsignedShort(); // L: 346
			this.modelAngleY = var1.readUnsignedShort(); // L: 347
		}

		if (this.type == 8) { // L: 349
			this.text = var1.readStringCp1252NullTerminated(); // L: 350
		}

		if (this.buttonType == 2) { // L: 352
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 353
			this.field3752 = var1.readStringCp1252NullTerminated(); // L: 354
			var4 = var1.readUnsignedShort() & 63; // L: 355
			this.flags |= var4 << 11; // L: 356
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 358
			this.field3753 = var1.readStringCp1252NullTerminated(); // L: 359
			if (this.field3753.length() == 0) { // L: 360
				if (this.buttonType == 1) { // L: 361
					this.field3753 = "Ok";
				}

				if (this.buttonType == 4) { // L: 362
					this.field3753 = "Select";
				}

				if (this.buttonType == 5) { // L: 363
					this.field3753 = "Select";
				}

				if (this.buttonType == 6) { // L: 364
					this.field3753 = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 367
			this.flags |= 4194304; // L: 368
		}

		if (this.buttonType == 6) { // L: 370
			this.flags |= 1; // L: 371
		}

	} // L: 373

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "1963555900"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 376
		this.isIf3 = true; // L: 377
		this.type = var1.readUnsignedByte(); // L: 378
		this.contentType = var1.readUnsignedShort(); // L: 379
		this.rawX = var1.readShort(); // L: 380
		this.rawY = var1.readShort(); // L: 381
		this.rawWidth = var1.readUnsignedShort(); // L: 382
		if (this.type == 9) { // L: 383
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 384
		}

		this.widthAlignment = var1.readByte(); // L: 385
		this.heightAlignment = var1.readByte(); // L: 386
		this.xAlignment = var1.readByte(); // L: 387
		this.yAlignment = var1.readByte(); // L: 388
		this.parentId = var1.readUnsignedShort(); // L: 389
		if (this.parentId == 65535) { // L: 390
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 391
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 392
		if (this.type == 0) { // L: 393
			this.scrollWidth = var1.readUnsignedShort(); // L: 394
			this.scrollHeight = var1.readUnsignedShort(); // L: 395
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 396
		}

		if (this.type == 5) { // L: 398
			this.spriteId2 = var1.readInt(); // L: 399
			this.spriteAngle = var1.readUnsignedShort(); // L: 400
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 401
			this.transparencyTop = var1.readUnsignedByte(); // L: 402
			this.outline = var1.readUnsignedByte(); // L: 403
			this.spriteShadow = var1.readInt(); // L: 404
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 405
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 406
		}

		if (this.type == 6) { // L: 408
			this.modelType = 1; // L: 409
			this.modelId = var1.readUnsignedShort(); // L: 410
			if (this.modelId == 65535) { // L: 411
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 412
			this.modelOffsetY = var1.readShort(); // L: 413
			this.modelAngleX = var1.readUnsignedShort(); // L: 414
			this.modelAngleY = var1.readUnsignedShort(); // L: 415
			this.modelAngleZ = var1.readUnsignedShort(); // L: 416
			this.modelZoom = var1.readUnsignedShort(); // L: 417
			this.sequenceId = var1.readUnsignedShort(); // L: 418
			if (this.sequenceId == 65535) { // L: 419
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 420
			var1.readUnsignedShort(); // L: 421
			if (this.widthAlignment != 0) { // L: 422
				this.field3679 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 423
				var1.readUnsignedShort(); // L: 424
			}
		}

		if (this.type == 4) { // L: 427
			this.fontId = var1.readUnsignedShort(); // L: 428
			if (this.fontId == 65535) { // L: 429
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 430
			this.textLineHeight = var1.readUnsignedByte(); // L: 431
			this.textXAlignment = var1.readUnsignedByte(); // L: 432
			this.textYAlignment = var1.readUnsignedByte(); // L: 433
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 434
			this.color = var1.readInt(); // L: 435
		}

		if (this.type == 3) { // L: 437
			this.color = var1.readInt(); // L: 438
			this.fill = var1.readUnsignedByte() == 1; // L: 439
			this.transparencyTop = var1.readUnsignedByte(); // L: 440
		}

		if (this.type == 9) { // L: 442
			this.lineWid = var1.readUnsignedByte(); // L: 443
			this.color = var1.readInt(); // L: 444
			this.field3725 = var1.readUnsignedByte() == 1; // L: 445
		}

		this.flags = var1.readMedium(); // L: 447
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 448
		int var2 = var1.readUnsignedByte(); // L: 449
		if (var2 > 0) { // L: 450
			this.actions = new String[var2]; // L: 451

			for (int var3 = 0; var3 < var2; ++var3) { // L: 452
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 454
		this.dragThreshold = var1.readUnsignedByte(); // L: 455
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 456
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 457
		this.onLoad = this.readListener(var1); // L: 458
		this.onMouseOver = this.readListener(var1); // L: 459
		this.onMouseLeave = this.readListener(var1); // L: 460
		this.onTargetLeave = this.readListener(var1); // L: 461
		this.onTargetEnter = this.readListener(var1); // L: 462
		this.onVarTransmit = this.readListener(var1); // L: 463
		this.onInvTransmit = this.readListener(var1); // L: 464
		this.onStatTransmit = this.readListener(var1); // L: 465
		this.onTimer = this.readListener(var1); // L: 466
		this.onOp = this.readListener(var1); // L: 467
		this.onMouseRepeat = this.readListener(var1); // L: 468
		this.onClick = this.readListener(var1); // L: 469
		this.onClickRepeat = this.readListener(var1); // L: 470
		this.onRelease = this.readListener(var1); // L: 471
		this.onHold = this.readListener(var1); // L: 472
		this.onDrag = this.readListener(var1); // L: 473
		this.onDragComplete = this.readListener(var1); // L: 474
		this.onScroll = this.readListener(var1); // L: 475
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 476
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 477
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 478
	} // L: 479

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)[Ljava/lang/Object;",
		garbageValue = "122"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 482
		if (var2 == 0) { // L: 483
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 484

			for (int var4 = 0; var4 < var2; ++var4) { // L: 485
				int var5 = var1.readUnsignedByte(); // L: 486
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 487
				} else if (var5 == 1) { // L: 488
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 490
			return var3; // L: 491
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)[I",
		garbageValue = "-2000592706"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 495
		if (var2 == 0) { // L: 496
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 497

			for (int var4 = 0; var4 < var2; ++var4) { // L: 498
				var3[var4] = var1.readInt(); // L: 499
			}

			return var3; // L: 501
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZLej;B)Lud;",
		garbageValue = "-22"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3754 = false; // L: 505
		if (this.field3660 != null) { // L: 506
			SpritePixels var3 = this.method6540(var2); // L: 507
			if (var3 != null) { // L: 508
				return var3; // L: 509
			}
		}

		int var7;
		if (var1) { // L: 513
			var7 = this.spriteId;
		} else {
			var7 = this.spriteId2; // L: 514
		}

		if (var7 == -1) { // L: 515
			return null;
		} else {
			long var4 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var7 + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 516
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4); // L: 517
			if (var6 != null) { // L: 518
				return var6;
			} else {
				var6 = WorldMap.SpriteBuffer_getSprite(UserComparator10.Widget_spritesArchive, var7, 0); // L: 519
				if (var6 == null) { // L: 520
					field3754 = true; // L: 521
					return null; // L: 522
				} else {
					this.method6446(var6); // L: 524
					Widget_cachedSprites.put(var6, var4); // L: 525
					return var6; // L: 526
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)Lud;",
		garbageValue = "871401764"
	)
	SpritePixels method6540(UrlRequester var1) {
		if (!this.method6458()) { // L: 530
			return this.method6444(var1); // L: 531
		} else {
			String var2 = this.field3660 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 533
			SpritePixels var3 = (SpritePixels)field3670.method7829(var2); // L: 534
			if (var3 == null) { // L: 535
				SpritePixels var4 = this.method6444(var1); // L: 536
				if (var4 != null) { // L: 537
					var3 = var4.method9557(); // L: 538
					this.method6446(var3); // L: 539
					field3670.method7830(var2, var3); // L: 540
				}
			}

			return var3; // L: 543
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)Lud;",
		garbageValue = "1775853493"
	)
	SpritePixels method6444(UrlRequester var1) {
		if (this.field3660 != null && var1 != null) { // L: 547
			class327 var2 = (class327)field3765.method7829(this.field3660); // L: 548
			if (var2 == null) { // L: 549
				var2 = new class327(this.field3660, var1); // L: 550
				field3765.method7830(this.field3660, var2); // L: 551
			}

			return var2.method6111(); // L: 553
		} else {
			return null; // L: 555
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-771382672"
	)
	boolean method6458() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 559
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lud;B)V",
		garbageValue = "1"
	)
	void method6446(SpritePixels var1) {
		if (this.spriteFlipV) { // L: 563
			var1.flipVertically();
		}

		if (this.spriteFlipH) { // L: 564
			var1.flipHorizontally();
		}

		if (this.outline > 0) { // L: 565
			var1.pad(this.outline);
		}

		if (this.outline >= 1) { // L: 566
			var1.outline(1);
		}

		if (this.outline >= 2) {
			var1.outline(16777215); // L: 567
		}

		if (this.spriteShadow != 0) { // L: 568
			var1.shadow(this.spriteShadow);
		}

	} // L: 569

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lpc;",
		garbageValue = "-2062099082"
	)
	@Export("getFont")
	public Font getFont() {
		field3754 = false; // L: 572
		if (this.fontId == -1) { // L: 573
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 574
			if (var1 != null) { // L: 575
				return var1;
			} else {
				var1 = class408.method7672(UserComparator10.Widget_spritesArchive, DecorativeObject.Widget_fontsArchive, this.fontId, 0); // L: 576
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId); // L: 577
				} else {
					field3754 = true; // L: 578
				}

				return var1; // L: 579
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lig;IZLmb;Lhi;Lhs;I)Ljo;",
		garbageValue = "-1139082268"
	)
	public Model method6448(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4, NPCComposition var5, class194 var6) {
		field3754 = false; // L: 583
		int var7;
		int var8;
		if (var3) { // L: 586
			var7 = this.field3669; // L: 587
			var8 = this.field3751; // L: 588
		} else {
			var7 = this.modelType; // L: 591
			var8 = this.modelId; // L: 592
		}

		if (var7 == 6) { // L: 594
			if (var5 == null) { // L: 595
				return null;
			}

			var8 = var5.id; // L: 596
		}

		if (var7 == 0) { // L: 598
			return null;
		} else if (var7 == 1 && var8 == -1) { // L: 599
			return null;
		} else {
			if (var6 != null && var6.field1994 && var7 == 6) { // L: 600
				var7 = 3; // L: 601
			}

			long var9 = (long)(var8 + (var7 << 16)); // L: 603
			if (var6 != null) { // L: 604
				var9 |= var6.field1990 << 20;
			}

			Model var11 = (Model)Widget_cachedModels.get(var9); // L: 605
			if (var11 == null) { // L: 606
				ModelData var12 = null; // L: 607
				int var13 = 64; // L: 608
				int var14 = 768; // L: 609
				switch(var7) { // L: 610
				case 1:
					var12 = ModelData.ModelData_get(WallObject.field2818, var8, 0); // L: 615
					break; // L: 616
				case 2:
					var12 = Tile.getNpcDefinition(var8).method3709((class194)null); // L: 621
					break; // L: 622
				case 3:
					var12 = var4 != null ? var4.getModelData() : null; // L: 618
					break; // L: 619
				case 4:
					ItemComposition var15 = class125.ItemComposition_get(var8); // L: 624
					var12 = var15.getModelData(10); // L: 625
					var13 += var15.field2232; // L: 626
					var14 += var15.field2236 * 5; // L: 627
				case 5:
				default:
					break;
				case 6:
					var12 = Tile.getNpcDefinition(var8).method3709(var6); // L: 612
				}

				if (var12 == null) { // L: 630
					field3754 = true; // L: 631
					return null; // L: 632
				}

				var11 = var12.toModel(var13, var14, -50, -10, -50); // L: 634
				Widget_cachedModels.put(var11, var9); // L: 635
			}

			if (var1 != null) { // L: 637
				var11 = var1.transformWidgetModel(var11, var2); // L: 638
			}

			return var11; // L: 640
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lmi;",
		garbageValue = "-1"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 644
			var1 = false;
		}

		int var2 = var1 ? this.spriteId : this.spriteId2; // L: 645
		if (var2 == -1) { // L: 646
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 647
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 648
			if (var5 != null) { // L: 649
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, (UrlRequester)null); // L: 650
				if (var6 == null) { // L: 651
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 652
					int[] var8 = new int[var7.subHeight]; // L: 653
					int[] var9 = new int[var7.subHeight]; // L: 654

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 655
						int var11 = 0; // L: 656
						int var12 = var7.subWidth; // L: 657

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 658
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 659
								var11 = var13; // L: 660
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 664
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 665
								var12 = var13 + 1; // L: 666
								break;
							}
						}

						var8[var10] = var11; // L: 670
						var9[var10] = var12 - var11; // L: 671
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 673
					Widget_cachedSpriteMasks.put(var5, var3); // L: 674
					return var5; // L: 675
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1432445957"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 686
			String[] var3 = new String[var1 + 1]; // L: 687
			if (this.actions != null) { // L: 688
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 689
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 691
		}

		this.actions[var1] = var2; // L: 693
	} // L: 694

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-727475162"
	)
	public boolean method6505() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12; // L: 697
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1196611780"
	)
	public boolean method6452() {
		return this.type == 11 || this.type == 12; // L: 701
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lej;J)V"
	)
	public void method6518(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && var3 != -1L) { // L: 705
			var1 = var1.replaceAll("%userid%", Long.toString(var3)); // L: 706
			this.field3692 = new class170(); // L: 707
			if (!this.field3692.method3431(var1, var2)) { // L: 708
				this.field3692 = null; // L: 709
			} else {
				if (this.field3694 == null || this.field3695 == null) { // L: 712
					this.method6443(); // L: 713
				}

			}
		}
	} // L: 710 715

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lej;I)V",
		garbageValue = "467943476"
	)
	public void method6454(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) { // L: 718
			this.field3692 = new class170(); // L: 719
			this.field3692.method3449(var1, var2); // L: 720
		}
	} // L: 721

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1842615926"
	)
	void method6443() {
		this.field3694 = new HashMap(); // L: 724
		this.field3695 = new HashMap(); // L: 725
	} // L: 726

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1342267996"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		if (this.type == 11) { // L: 729
			if (this.field3694 == null) { // L: 730
				this.method6443();
			}

			this.field3694.put(var1, var2); // L: 731
		}
	} // L: 732

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1414965691"
	)
	public void method6457(String var1, int var2) {
		if (this.type == 11) { // L: 735
			if (this.field3695 == null) {
				this.method6443(); // L: 736
			}

			this.field3695.put(var1, var2); // L: 737
		}
	} // L: 738

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-233873937"
	)
	public boolean method6488(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3692 != null && this.method6459()) { // L: 741
			var1 -= var3; // L: 742
			var2 -= var4; // L: 743
			int var5 = (int)(this.field3692.method3439()[0] * (float)this.width); // L: 744
			int var6 = (int)(this.field3692.method3439()[1] * (float)this.height); // L: 745
			int var7 = var5 + (int)(this.field3692.method3439()[2] * (float)this.width); // L: 746
			int var8 = var6 + (int)(this.field3692.method3439()[3] * (float)this.height); // L: 747
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8; // L: 748
		} else {
			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1058749638"
	)
	public boolean method6459() {
		return this.field3693 == 2; // L: 752
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2113017491"
	)
	public int method6460(String var1) {
		return this.type == 11 && this.field3692 != null && this.method6459() ? this.field3692.method3434(var1) : -1; // L: 756 757 759
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-425629947"
	)
	public String method6461(String var1) {
		return this.type == 11 && this.field3692 != null && this.method6459() ? this.field3692.method3435(var1) : null; // L: 763 764
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "17038195"
	)
	public int method6462() {
		return this.field3695 != null && this.field3695.size() > 0 ? 1 : 0; // L: 768
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-84"
	)
	public int method6437() {
		if (this.type == 11 && this.field3692 != null && this.field3695 != null && !this.field3695.isEmpty()) { // L: 772
			String var1 = this.field3692.method3479(); // L: 773
			return var1 != null && this.field3695.containsKey(this.field3692.method3479()) ? (Integer)this.field3695.get(var1) : -1; // L: 774 775 777
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-887288049"
	)
	public String method6464() {
		if (this.type == 11 && this.field3692 != null) { // L: 781
			String var1 = this.field3692.method3479(); // L: 782
			Iterator var2 = this.field3692.method3487().iterator(); // L: 783

			while (var2.hasNext()) {
				class181 var3 = (class181)var2.next(); // L: 784
				String var4 = String.format("%%%S%%", var3.method3563()); // L: 786
				if (var3.vmethod3558() == 0) { // L: 787
					var1.replaceAll(var4, Integer.toString(var3.vmethod3560())); // L: 788
				} else {
					var1.replaceAll(var4, var3.vmethod3559()); // L: 791
				}
			}

			return var1; // L: 795
		} else {
			return null; // L: 794
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-282480263"
	)
	public int[] method6561() {
		if (this.type == 11 && this.field3692 != null) { // L: 799
			int[] var1 = new int[3]; // L: 800
			int var2 = 0; // L: 801
			Iterator var3 = this.field3692.method3487().iterator(); // L: 802

			while (var3.hasNext()) {
				class181 var4 = (class181)var3.next(); // L: 803
				if (!var4.method3563().equals("user_id")) { // L: 805
					if (var4.vmethod3558() != 0) { // L: 806
						return null; // L: 813
					}

					var1[var2++] = var4.vmethod3560(); // L: 807
					if (var2 > 3) { // L: 808
						return null; // L: 809
					}
				}
			}

			return var1; // L: 818
		} else {
			return null;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)Z",
		garbageValue = "-687125955"
	)
	public boolean method6466(UrlRequester var1) {
		if (this.type == 11 && this.field3692 != null) { // L: 822
			this.field3692.method3472(var1); // L: 823
			if (this.field3692.method3438() != this.field3693) { // L: 824
				this.field3693 = this.field3692.method3438(); // L: 825
				if (this.field3693 >= 100) { // L: 826
					return true; // L: 827
				}

				if (this.field3693 == 2) { // L: 829
					this.method6467(); // L: 830
					return true; // L: 831
				}
			}

			return false; // L: 834
		} else {
			return false;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-228644187"
	)
	void method6467() {
		this.noClickThrough = true; // L: 855
		ArrayList var1 = this.field3692.method3436(); // L: 856
		ArrayList var2 = this.field3692.method3437(); // L: 857
		int var3 = var1.size() + var2.size(); // L: 858
		this.children = new Widget[var3]; // L: 859
		int var4 = 0; // L: 860

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 861 868
			class176 var6 = (class176)var5.next(); // L: 862
			var7 = class239.method4787(5, this, var4, 0, 0, 0, 0, var6.field1849); // L: 864
			var7.field3660 = var6.field1853.method2839(); // L: 865
			class327 var8 = new class327(var6.field1853); // L: 866
			field3765.method7830(var7.field3660, var8); // L: 867
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 871 879
			class177 var9 = (class177)var5.next(); // L: 872
			var7 = class239.method4787(4, this, var4, 0, 0, 0, 0, var9.field1858); // L: 874
			var7.text = var9.field1861; // L: 875
			var7.fontId = (Integer)this.field3694.get(var9.field1855); // L: 876
			var7.textXAlignment = var9.field1859; // L: 877
			var7.textYAlignment = var9.field1860; // L: 878
		}

	} // L: 882

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "638323053"
	)
	public void method6455() {
		this.field3696 = new class328(); // L: 885

		for (int var1 = 1; var1 <= 12; ++var1) { // L: 886
			this.field3696.field3551.method389(var1, 0); // L: 887
		}

		for (char var2 = 0; var2 < ' '; ++var2) { // L: 889
			this.field3696.field3551.method390(var2, 0); // L: 890
		}

		this.field3696.field3551.method390('\u0080', 0); // L: 892
		this.field3696.field3551.method389(82, 2); // L: 893
		this.field3696.field3551.method389(81, 2); // L: 894
		this.field3696.field3551.method389(86, 2); // L: 895
	} // L: 896

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Lmo;",
		garbageValue = "1399447726"
	)
	public class330 method6504() {
		return this.field3696 != null ? this.field3696.field3552 : null; // L: 899
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Lmy;",
		garbageValue = "-1142943567"
	)
	public class325 method6469() {
		return this.field3696 != null ? this.field3696.field3555 : null; // L: 903
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Lbb;",
		garbageValue = "1031459265"
	)
	public class27 method6463() {
		return this.field3696 != null ? this.field3696.field3551 : null; // L: 907
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Lmz;",
		garbageValue = "-1841939772"
	)
	public class328 method6471() {
		return this.field3696; // L: 911
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lmo;I)Z",
		garbageValue = "1511239269"
	)
	boolean method6472(class330 var1) {
		boolean var2 = false; // L: 915
		if (this.text != null && !this.text.isEmpty()) { // L: 916
			var2 |= var1.method6296(class13.method173(this.text)); // L: 917
			this.text = ""; // L: 918
		}

		if (this.field3687 != null && !this.field3687.isEmpty()) { // L: 920
			var2 |= var1.method6163(class13.method173(this.field3687)); // L: 921
			this.field3687 = ""; // L: 922
		}

		return var2; // L: 924
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2118705753"
	)
	public boolean method6473() {
		class330 var1 = this.method6504(); // L: 928
		if (var1 == null) { // L: 929
			return false;
		} else {
			boolean var2 = false; // L: 930
			if (!var1.method6216() && this.fontId != -1) { // L: 931
				int var3 = var1.method6316(); // L: 932
				int var4 = var1.method6218(); // L: 933
				int var5 = var1.method6215(); // L: 934
				int var6 = var1.method6214(); // L: 935
				Font var7 = this.getFont(); // L: 936
				if (var7 != null) { // L: 937
					var2 |= var1.method6244(var7); // L: 938
					var2 |= this.method6472(var1); // L: 939
					var2 |= var1.method6208(var3, var4); // L: 940
					var2 |= var1.method6184(var5, var6); // L: 941
				}
			} else if (var1.method6216()) { // L: 944
				var2 |= this.method6472(var1); // L: 945
			}

			var1.method6162(); // L: 947
			return var2; // L: 948
		}
	}
}
