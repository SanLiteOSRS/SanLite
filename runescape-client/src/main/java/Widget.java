import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	public static AbstractArchive field3599;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	static class411 field3604;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	static class411 field3647;
	@ObfuscatedName("bs")
	public static boolean field3606;
	@ObfuscatedName("bt")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1804043799
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -638698121
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 479970211
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -131015735
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1503260607
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 2141779617
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -636292761
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -144846457
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 2068411213
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1886373639
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1481892339
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 2024302637
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1211371415
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1239699697
	)
	@Export("x")
	public int x;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -284178067
	)
	@Export("y")
	public int y;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -941593921
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -682163683
	)
	@Export("height")
	public int height;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 702138389
	)
	public int field3625;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1814935265
	)
	public int field3626;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1460778705
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("cl")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 419720901
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -837540489
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1430707367
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 820585761
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1138585453
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1850878679
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -329141123
	)
	public int field3635;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -326401939
	)
	public int field3636;
	@ObfuscatedName("cm")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	@Export("fillMode")
	public class512 fillMode;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1812217877
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1457269059
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1448679679
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cy")
	public boolean field3642;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -532484915
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -124801535
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cj")
	public String field3645;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1915568143
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("dk")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -1223640245
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -1032461077
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("dd")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("da")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 275998769
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 415616347
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 38211255
	)
	int field3654;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 2136902703
	)
	int field3655;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 408817693
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -656552023
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -1849416263
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -1247547919
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1466125897
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -283586755
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 393311123
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 909628205
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 177694097
	)
	public int field3664;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -702183463
	)
	public int field3665;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public PlayerComposition field3666;
	@ObfuscatedName("dl")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dy")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1337286955
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -651380889
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("dw")
	@Export("text")
	public String text;
	@ObfuscatedName("dm")
	public String field3684;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 1596433809
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = 1202649679
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = -1662299223
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ef")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	class170 field3601;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = 68060697
	)
	int field3678;
	@ObfuscatedName("eh")
	HashMap field3702;
	@ObfuscatedName("el")
	HashMap field3680;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	class325 field3681;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 1394806943
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("ej")
	public boolean field3736;
	@ObfuscatedName("ee")
	public byte[][] field3694;
	@ObfuscatedName("ew")
	public byte[][] field3685;
	@ObfuscatedName("en")
	public int[] field3686;
	@ObfuscatedName("eo")
	public int[] field3687;
	@ObfuscatedName("em")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ea")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = -1772000581
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = 324465891
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("er")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("fj")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("fi")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("fr")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("fq")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ff")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("fa")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("fp")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("fx")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fe")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ft")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("fv")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fw")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fu")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fo")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fc")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fd")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fh")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fm")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fl")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fy")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fk")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fn")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fz")
	public Object[] field3716;
	@ObfuscatedName("fg")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fb")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fs")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("gh")
	public Object[] field3597;
	@ObfuscatedName("gc")
	public Object[] field3721;
	@ObfuscatedName("ge")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("gy")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("gb")
	public Object[] field3611;
	@ObfuscatedName("gq")
	public Object[] field3725;
	@ObfuscatedName("gm")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("gk")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("gr")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gj")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gf")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gl")
	public Object[] field3731;
	@ObfuscatedName("ga")
	public Object[] field3732;
	@ObfuscatedName("gt")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gu")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gx")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = 1944056189
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gv")
	public String field3737;
	@ObfuscatedName("gn")
	public String field3738;
	@ObfuscatedName("gd")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("go")
	public int[] field3740;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 1698227871
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = 1945553437
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = -466013387
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = -27375253
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "[Lmo;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("hh")
	public boolean field3746;
	@ObfuscatedName("hf")
	public boolean field3747;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = 1194031333
	)
	public int field3748;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = 895030757
	)
	public int field3749;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = 314376331
	)
	public int field3727;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = 1402611995
	)
	public int field3751;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = 65592041
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("hc")
	@ObfuscatedGetter(
		intValue = 1833752193
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("hm")
	public int[] field3754;
	@ObfuscatedName("hp")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("hv")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("ht")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 60
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 61
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 62
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 63
		field3604 = new class411(10, class409.field4561); // L: 64
		field3647 = new class411(10, class409.field4561); // L: 65
		field3606 = false; // L: 66
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
		this.field3625 = 1; // L: 85
		this.field3626 = 1; // L: 86
		this.parentId = -1; // L: 87
		this.isHidden = false; // L: 88
		this.scrollX = 0; // L: 89
		this.scrollY = 0; // L: 90
		this.scrollWidth = 0; // L: 91
		this.scrollHeight = 0; // L: 92
		this.color = 0; // L: 93
		this.color2 = 0; // L: 94
		this.field3635 = 0; // L: 95
		this.field3636 = 0; // L: 96
		this.fill = false; // L: 97
		this.fillMode = class512.SOLID; // L: 98
		this.transparencyTop = 0; // L: 99
		this.transparencyBot = 0; // L: 100
		this.lineWid = 1; // L: 101
		this.field3642 = false; // L: 102
		this.spriteId2 = -1; // L: 103
		this.spriteId = -1; // L: 104
		this.spriteAngle = 0; // L: 106
		this.spriteTiling = false; // L: 107
		this.outline = 0; // L: 108
		this.spriteShadow = 0; // L: 109
		this.modelType = 1; // L: 112
		this.modelId = -1; // L: 113
		this.field3654 = 1; // L: 114
		this.field3655 = -1; // L: 115
		this.sequenceId = -1; // L: 116
		this.sequenceId2 = -1; // L: 117
		this.modelOffsetX = 0; // L: 118
		this.modelOffsetY = 0; // L: 119
		this.modelAngleX = 0; // L: 120
		this.modelAngleY = 0; // L: 121
		this.modelAngleZ = 0; // L: 122
		this.modelZoom = 100; // L: 123
		this.field3664 = 0; // L: 124
		this.field3665 = 0; // L: 125
		this.modelOrthog = false; // L: 127
		this.modelTransparency = false; // L: 128
		this.itemQuantityMode = 2; // L: 129
		this.fontId = -1; // L: 130
		this.text = ""; // L: 131
		this.field3684 = ""; // L: 132
		this.textLineHeight = 0; // L: 133
		this.textXAlignment = 0; // L: 134
		this.textYAlignment = 0; // L: 135
		this.textShadowed = false; // L: 136
		this.field3678 = -1; // L: 138
		this.flags = 0; // L: 143
		this.field3736 = false; // L: 144
		this.dataText = ""; // L: 153
		this.parent = null; // L: 155
		this.dragZoneSize = 0; // L: 156
		this.dragThreshold = 0; // L: 157
		this.isScrollBar = false; // L: 158
		this.spellActionName = ""; // L: 159
		this.hasListener = false; // L: 160
		this.mouseOverRedirect = -1; // L: 201
		this.field3737 = ""; // L: 202
		this.field3738 = "Ok"; // L: 203
		this.itemId = -1; // L: 206
		this.itemQuantity = 0; // L: 207
		this.modelFrame = 0; // L: 208
		this.modelFrameCycle = 0; // L: 209
		this.field3746 = false; // L: 211
		this.field3747 = false; // L: 212
		this.field3748 = -1; // L: 213
		this.field3749 = 0; // L: 214
		this.field3727 = 0; // L: 215
		this.field3751 = 0; // L: 216
		this.rootIndex = -1; // L: 217
		this.cycle = -1; // L: 218
		this.noClickThrough = false; // L: 220
		this.noScrollThrough = false; // L: 221
		this.prioritizeMenuEntry = false; // L: 222
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "2126968915"
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
			this.field3684 = var1.readStringCp1252NullTerminated(); // L: 322
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 324
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 325
			this.color2 = var1.readInt(); // L: 326
			this.field3635 = var1.readInt(); // L: 327
			this.field3636 = var1.readInt(); // L: 328
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

			this.field3654 = 1; // L: 338
			this.field3655 = var1.readUnsignedShort(); // L: 339
			if (this.field3655 == 65535) { // L: 340
				this.field3655 = -1;
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
			this.field3737 = var1.readStringCp1252NullTerminated(); // L: 354
			var4 = var1.readUnsignedShort() & 63; // L: 355
			this.flags |= var4 << 11; // L: 356
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 358
			this.field3738 = var1.readStringCp1252NullTerminated(); // L: 359
			if (this.field3738.length() == 0) { // L: 360
				if (this.buttonType == 1) { // L: 361
					this.field3738 = "Ok";
				}

				if (this.buttonType == 4) { // L: 362
					this.field3738 = "Select";
				}

				if (this.buttonType == 5) { // L: 363
					this.field3738 = "Select";
				}

				if (this.buttonType == 6) { // L: 364
					this.field3738 = "Continue";
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "1"
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
				this.field3664 = var1.readUnsignedShort();
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
			this.field3642 = var1.readUnsignedByte() == 1; // L: 445
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)[Ljava/lang/Object;",
		garbageValue = "-31"
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
				if (var5 == 0) { // L: 487
					var3[var4] = new Integer(var1.readInt());
				} else if (var5 == 1) { // L: 488
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 490
			return var3; // L: 491
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)[I",
		garbageValue = "1926203432"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZLel;B)Ltt;",
		garbageValue = "1"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3606 = false; // L: 505
		if (this.field3645 != null) { // L: 506
			SpritePixels var3 = this.method6473(var2); // L: 507
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
			long var4 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var7 + ((long)this.outline << 36) + ((long)this.spriteShadow << 40); // L: 516
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4); // L: 517
			if (var6 != null) { // L: 518
				return var6;
			} else {
				var6 = class302.SpriteBuffer_getSprite(class149.Widget_spritesArchive, var7, 0); // L: 519
				if (var6 == null) { // L: 520
					field3606 = true; // L: 521
					return null; // L: 522
				} else {
					this.method6432(var6); // L: 524
					Widget_cachedSprites.put(var6, var4); // L: 525
					return var6; // L: 526
				}
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)Ltt;",
		garbageValue = "-1858294945"
	)
	SpritePixels method6473(UrlRequester var1) {
		if (!this.method6431()) { // L: 530
			return this.method6430(var1); // L: 531
		} else {
			String var2 = this.field3645 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 533
			SpritePixels var3 = (SpritePixels)field3647.method7684(var2); // L: 534
			if (var3 == null) { // L: 535
				SpritePixels var4 = this.method6430(var1); // L: 536
				if (var4 != null) { // L: 537
					var3 = var4.method9420(); // L: 538
					this.method6432(var3); // L: 539
					field3647.method7686(var2, var3); // L: 540
				}
			}

			return var3; // L: 543
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)Ltt;",
		garbageValue = "1007681358"
	)
	SpritePixels method6430(UrlRequester var1) {
		if (this.field3645 != null && var1 != null) { // L: 547
			class324 var2 = (class324)field3604.method7684(this.field3645); // L: 548
			if (var2 == null) { // L: 549
				var2 = new class324(this.field3645, var1); // L: 550
				field3604.method7686(this.field3645, var2); // L: 551
			}

			return var2.method6098(); // L: 553
		} else {
			return null; // L: 555
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1612137227"
	)
	boolean method6431() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 559
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltt;I)V",
		garbageValue = "1020347038"
	)
	void method6432(SpritePixels var1) {
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

		if (this.outline >= 2) { // L: 567
			var1.outline(16777215);
		}

		if (this.spriteShadow != 0) { // L: 568
			var1.shadow(this.spriteShadow);
		}

	} // L: 569

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lpa;",
		garbageValue = "1888667139"
	)
	@Export("getFont")
	public Font getFont() {
		field3606 = false; // L: 572
		if (this.fontId == -1) { // L: 573
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 574
			if (var1 != null) { // L: 575
				return var1;
			} else {
				AbstractArchive var3 = class149.Widget_spritesArchive; // L: 577
				AbstractArchive var4 = WorldMapData_0.Widget_fontsArchive; // L: 578
				int var5 = this.fontId; // L: 579
				Font var2;
				if (!WorldMapAreaData.method5599(var3, var5, 0)) { // L: 581
					var2 = null; // L: 582
				} else {
					byte[] var7 = var4.takeFile(var5, 0); // L: 586
					Font var6;
					if (var7 == null) { // L: 588
						var6 = null; // L: 589
					} else {
						Font var8 = new Font(var7, class515.SpriteBuffer_xOffsets, class515.SpriteBuffer_yOffsets, SecureRandomCallable.SpriteBuffer_spriteWidths, SecureRandomCallable.SpriteBuffer_spriteHeights, class515.SpriteBuffer_spritePalette, WorldMapDecoration.SpriteBuffer_pixels); // L: 592
						FriendLoginUpdate.method7789(); // L: 593
						var6 = var8; // L: 594
					}

					var2 = var6; // L: 596
				}

				if (var2 != null) { // L: 599
					Widget_cachedFonts.put(var2, (long)this.fontId);
				} else {
					field3606 = true; // L: 600
				}

				return var2; // L: 601
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lhg;IZLmz;Lho;Lht;I)Ljh;",
		garbageValue = "1173498342"
	)
	public Model method6535(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4, NPCComposition var5, class193 var6) {
		field3606 = false; // L: 605
		int var7;
		int var8;
		if (var3) { // L: 608
			var7 = this.field3654; // L: 609
			var8 = this.field3655; // L: 610
		} else {
			var7 = this.modelType; // L: 613
			var8 = this.modelId; // L: 614
		}

		if (var7 == 6) { // L: 616
			if (var5 == null) { // L: 617
				return null;
			}

			var8 = var5.id; // L: 618
		}

		if (var7 == 0) { // L: 620
			return null;
		} else if (var7 == 1 && var8 == -1) { // L: 621
			return null;
		} else {
			if (var6 != null && var6.field2004 && var7 == 6) { // L: 622
				var7 = 3; // L: 623
			}

			long var9 = (long)(var8 + (var7 << 16)); // L: 625
			if (var6 != null) { // L: 626
				var9 |= var6.field2000 << 20;
			}

			Model var11 = (Model)Widget_cachedModels.get(var9); // L: 627
			if (var11 == null) { // L: 628
				ModelData var12 = null; // L: 629
				int var13 = 64; // L: 630
				int var14 = 768; // L: 631
				switch(var7) { // L: 632
				case 1:
					var12 = ModelData.ModelData_get(field3599, var8, 0); // L: 646
					break; // L: 647
				case 2:
					var12 = class407.getNpcDefinition(var8).method3709((class193)null); // L: 640
					break; // L: 641
				case 3:
					var12 = var4 != null ? var4.getModelData() : null; // L: 643
					break; // L: 644
				case 4:
					ItemComposition var15 = class230.ItemComposition_get(var8); // L: 634
					var12 = var15.getModelData(10); // L: 635
					var13 += var15.field2209; // L: 636
					var14 += var15.field2197; // L: 637
				case 5:
				default:
					break;
				case 6:
					var12 = class407.getNpcDefinition(var8).method3709(var6); // L: 649
				}

				if (var12 == null) { // L: 652
					field3606 = true; // L: 653
					return null; // L: 654
				}

				var11 = var12.toModel(var13, var14, -50, -10, -50); // L: 656
				Widget_cachedModels.put(var11, var9); // L: 657
			}

			if (var1 != null) { // L: 659
				var11 = var1.transformWidgetModel(var11, var2); // L: 660
			}

			return var11; // L: 662
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lme;",
		garbageValue = "-84"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 666
			var1 = false;
		}

		int var2 = var1 ? this.spriteId : this.spriteId2; // L: 667
		if (var2 == -1) { // L: 668
			return null;
		} else {
			long var3 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var2 + ((long)this.spriteShadow << 40); // L: 669
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 670
			if (var5 != null) { // L: 671
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, (UrlRequester)null); // L: 672
				if (var6 == null) { // L: 673
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 674
					int[] var8 = new int[var7.subHeight]; // L: 675
					int[] var9 = new int[var7.subHeight]; // L: 676

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 677
						int var11 = 0; // L: 678
						int var12 = var7.subWidth; // L: 679

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 680
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 681
								var11 = var13; // L: 682
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 686
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 687
								var12 = var13 + 1; // L: 688
								break;
							}
						}

						var8[var10] = var11; // L: 692
						var9[var10] = var12 - var11; // L: 693
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 695
					Widget_cachedSpriteMasks.put(var5, var3); // L: 696
					return var5; // L: 697
				}
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-110457894"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 708
			String[] var3 = new String[var1 + 1]; // L: 709
			if (this.actions != null) { // L: 710
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 711
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 713
		}

		this.actions[var1] = var2; // L: 715
	} // L: 716

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-507811525"
	)
	public boolean method6437() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12; // L: 719
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "22"
	)
	public boolean method6438() {
		return this.type == 11 || this.type == 12; // L: 723
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;J)V"
	)
	public void method6436(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && var3 != -1L) { // L: 727
			var1 = var1.replaceAll("%userid%", Long.toString(var3)); // L: 728
			this.field3601 = new class170(); // L: 729
			if (!this.field3601.method3365(var1, var2)) { // L: 730
				this.field3601 = null; // L: 731
			} else {
				if (this.field3702 == null || this.field3680 == null) { // L: 734
					this.method6554(); // L: 735
				}

			}
		}
	} // L: 732 737

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;B)V",
		garbageValue = "38"
	)
	public void method6440(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) { // L: 740
			this.field3601 = new class170(); // L: 741
			this.field3601.method3382(var1, var2); // L: 742
		}
	} // L: 743

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-18693"
	)
	void method6554() {
		this.field3702 = new HashMap(); // L: 746
		this.field3680 = new HashMap(); // L: 747
	} // L: 748

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "67"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		if (this.type == 11) { // L: 751
			if (this.field3702 == null) { // L: 752
				this.method6554();
			}

			this.field3702.put(var1, var2); // L: 753
		}
	} // L: 754

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "1"
	)
	public void method6443(String var1, int var2) {
		if (this.type == 11) { // L: 757
			if (this.field3680 == null) { // L: 758
				this.method6554();
			}

			this.field3680.put(var1, var2); // L: 759
		}
	} // L: 760

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Z",
		garbageValue = "0"
	)
	public boolean method6444(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3601 != null && this.method6445()) { // L: 763
			var1 -= var3; // L: 764
			var2 -= var4; // L: 765
			int var5 = (int)(this.field3601.method3373()[0] * (float)this.width); // L: 766
			int var6 = (int)(this.field3601.method3373()[1] * (float)this.height); // L: 767
			int var7 = var5 + (int)(this.field3601.method3373()[2] * (float)this.width); // L: 768
			int var8 = var6 + (int)(this.field3601.method3373()[3] * (float)this.height); // L: 769
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8; // L: 770
		} else {
			return false;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "58"
	)
	public boolean method6445() {
		return this.field3678 == 2; // L: 774
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "2041370540"
	)
	public int method6452(String var1) {
		return this.type == 11 && this.field3601 != null && this.method6445() ? this.field3601.method3398(var1) : -1; // L: 778 779 781
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "2"
	)
	public String method6570(String var1) {
		return this.type == 11 && this.field3601 != null && this.method6445() ? this.field3601.method3368(var1) : null; // L: 785 786
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1714439461"
	)
	public int method6458() {
		return this.field3680 != null && this.field3680.size() > 0 ? 1 : 0; // L: 790
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-484155659"
	)
	public int method6449() {
		if (this.type == 11 && this.field3601 != null && this.field3680 != null && !this.field3680.isEmpty()) { // L: 794
			String var1 = this.field3601.method3374(); // L: 795
			return var1 != null && this.field3680.containsKey(this.field3601.method3374()) ? (Integer)this.field3680.get(var1) : -1; // L: 796 797 799
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "604505292"
	)
	public String method6450() {
		if (this.type == 11 && this.field3601 != null) { // L: 803
			String var1 = this.field3601.method3374(); // L: 804
			Iterator var2 = this.field3601.method3414().iterator(); // L: 805

			while (var2.hasNext()) {
				class181 var3 = (class181)var2.next(); // L: 806
				String var4 = String.format("%%%S%%", var3.method3510()); // L: 808
				if (var3.vmethod3520() == 0) { // L: 809
					var1.replaceAll(var4, Integer.toString(var3.vmethod3513())); // L: 810
				} else {
					var1.replaceAll(var4, var3.vmethod3523()); // L: 813
				}
			}

			return var1; // L: 817
		} else {
			return null; // L: 816
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "607225278"
	)
	public int[] method6451() {
		if (this.type == 11 && this.field3601 != null) { // L: 821
			int[] var1 = new int[3]; // L: 822
			int var2 = 0; // L: 823
			Iterator var3 = this.field3601.method3414().iterator(); // L: 824

			while (var3.hasNext()) {
				class181 var4 = (class181)var3.next(); // L: 825
				if (!var4.method3510().equals("user_id")) { // L: 827
					if (var4.vmethod3520() != 0) { // L: 828
						return null; // L: 835
					}

					var1[var2++] = var4.vmethod3513(); // L: 829
					if (var2 > 3) { // L: 830
						return null; // L: 831
					}
				}
			}

			return var1; // L: 840
		} else {
			return null;
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)Z",
		garbageValue = "177453197"
	)
	public boolean method6524(UrlRequester var1) {
		if (this.type == 11 && this.field3601 != null) { // L: 844
			this.field3601.method3371(var1); // L: 845
			if (this.field3601.method3427() != this.field3678) { // L: 846
				this.field3678 = this.field3601.method3427(); // L: 847
				if (this.field3678 >= 100) { // L: 848
					return true; // L: 849
				}

				if (this.field3678 == 2) { // L: 851
					this.method6453(); // L: 852
					return true; // L: 853
				}
			}

			return false; // L: 856
		} else {
			return false;
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "18772368"
	)
	void method6453() {
		this.noClickThrough = true; // L: 860
		ArrayList var1 = this.field3601.method3370(); // L: 861
		ArrayList var2 = this.field3601.method3390(); // L: 862
		int var3 = var1.size() + var2.size(); // L: 863
		this.children = new Widget[var3]; // L: 864
		int var4 = 0; // L: 865

		Iterator var5;
		float[] var9;
		Widget var10;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var10) { // L: 866 892
			class176 var6 = (class176)var5.next(); // L: 867
			var9 = var6.field1855; // L: 871
			var10 = new Widget(); // L: 873
			var10.type = 5; // L: 874
			var10.parentId = this.id; // L: 875
			var10.childIndex = var4; // L: 876
			var10.isIf3 = true; // L: 877
			var10.xAlignment = 0; // L: 878
			var10.yAlignment = 0; // L: 879
			var10.widthAlignment = 0; // L: 880
			var10.heightAlignment = 0; // L: 881
			var10.rawX = (int)((float)this.width * var9[0]); // L: 882
			var10.rawY = (int)((float)this.height * var9[1]); // L: 883
			var10.rawWidth = (int)((float)this.width * var9[2]); // L: 884
			var10.rawHeight = (int)(var9[3] * (float)this.height); // L: 885
			var10.field3645 = var6.field1858.method2824(); // L: 889
			class324 var11 = new class324(var6.field1858); // L: 890
			field3604.method7686(var10.field3645, var11); // L: 891
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var10) { // L: 895 922
			class177 var12 = (class177)var5.next(); // L: 896
			var9 = var12.field1863; // L: 900
			var10 = new Widget(); // L: 902
			var10.type = 4; // L: 903
			var10.parentId = this.id; // L: 904
			var10.childIndex = var4; // L: 905
			var10.isIf3 = true; // L: 906
			var10.xAlignment = 0; // L: 907
			var10.yAlignment = 0; // L: 908
			var10.widthAlignment = 0; // L: 909
			var10.heightAlignment = 0; // L: 910
			var10.rawX = (int)((float)this.width * var9[0]); // L: 911
			var10.rawY = (int)(var9[1] * (float)this.height); // L: 912
			var10.rawWidth = (int)((float)this.width * var9[2]); // L: 913
			var10.rawHeight = (int)(var9[3] * (float)this.height); // L: 914
			var10.text = var12.field1859; // L: 918
			var10.fontId = (Integer)this.field3702.get(var12.field1866); // L: 919
			var10.textXAlignment = var12.field1862; // L: 920
			var10.textYAlignment = var12.field1864; // L: 921
		}

	} // L: 925

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1859744626"
	)
	public void method6454() {
		this.field3681 = new class325(); // L: 928

		for (int var1 = 1; var1 <= 12; ++var1) { // L: 929
			this.field3681.field3533.method392(var1, 0); // L: 930
		}

		for (char var2 = 0; var2 < ' '; ++var2) { // L: 932
			this.field3681.field3533.method371(var2, 0); // L: 933
		}

		this.field3681.field3533.method371('\u0080', 0); // L: 935
		this.field3681.field3533.method392(82, 2); // L: 936
		this.field3681.field3533.method392(81, 2); // L: 937
		this.field3681.field3533.method392(86, 2); // L: 938
	} // L: 939

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Lmc;",
		garbageValue = "-550235242"
	)
	public class327 method6544() {
		return this.field3681 != null ? this.field3681.field3538 : null; // L: 942
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)Lmx;",
		garbageValue = "-5"
	)
	public class322 method6456() {
		return this.field3681 != null ? this.field3681.field3535 : null; // L: 946
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Lbw;",
		garbageValue = "224026911"
	)
	public class27 method6457() {
		return this.field3681 != null ? this.field3681.field3533 : null; // L: 950
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Lmg;",
		garbageValue = "-436100306"
	)
	public class325 method6490() {
		return this.field3681; // L: 954
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lmc;S)Z",
		garbageValue = "4702"
	)
	boolean method6459(class327 var1) {
		boolean var2 = false; // L: 958
		if (this.text != null && !this.text.isEmpty()) { // L: 959
			var2 |= var1.method6155(SoundSystem.method838(this.text)); // L: 960
			this.text = ""; // L: 961
		}

		if (this.field3684 != null && !this.field3684.isEmpty()) { // L: 963
			var2 |= var1.method6156(SoundSystem.method838(this.field3684)); // L: 964
			this.field3684 = ""; // L: 965
		}

		return var2; // L: 967
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "250888861"
	)
	public boolean method6460() {
		class327 var1 = this.method6544(); // L: 971
		if (var1 == null) { // L: 972
			return false;
		} else {
			boolean var2 = false; // L: 973
			if (!var1.method6209() && this.fontId != -1) { // L: 974
				int var3 = var1.method6210(); // L: 975
				int var4 = var1.method6178(); // L: 976
				int var5 = var1.method6208(); // L: 977
				int var6 = var1.method6207(); // L: 978
				Font var7 = this.getFont(); // L: 979
				if (var7 != null) { // L: 980
					var2 |= var1.method6329(var7); // L: 981
					var2 |= this.method6459(var1); // L: 982
					var2 |= var1.method6162(var3, var4); // L: 983
					var2 |= var1.method6402(var5, var6); // L: 984
				}
			} else if (var1.method6209()) { // L: 987
				var2 |= this.method6459(var1); // L: 988
			}

			var1.method6383(); // L: 990
			return var2; // L: 991
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILih;Lir;B)V",
		garbageValue = "91"
	)
	static final void method6571(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap var9) {
		ObjectComposition var10 = class59.getObjectDefinition(var4); // L: 999
		int var11 = var7 >= 0 ? var7 : var10.animationId; // L: 1000
		int var12;
		int var13;
		if (var5 != 1 && var5 != 3) { // L: 1003
			var12 = var10.sizeX; // L: 1008
			var13 = var10.sizeY; // L: 1009
		} else {
			var12 = var10.sizeY; // L: 1004
			var13 = var10.sizeX; // L: 1005
		}

		int var14;
		int var15;
		if (var12 + var2 <= 104) { // L: 1015
			var14 = (var12 >> 1) + var2; // L: 1016
			var15 = var2 + (var12 + 1 >> 1); // L: 1017
		} else {
			var14 = var2; // L: 1020
			var15 = var2 + 1; // L: 1021
		}

		int var16;
		int var17;
		if (var3 + var13 <= 104) { // L: 1023
			var16 = var3 + (var13 >> 1); // L: 1024
			var17 = var3 + (var13 + 1 >> 1); // L: 1025
		} else {
			var16 = var3; // L: 1028
			var17 = var3 + 1; // L: 1029
		}

		int[][] var18 = Tiles.Tiles_heights[var1]; // L: 1031
		int var19 = var18[var15][var17] + var18[var14][var17] + var18[var15][var16] + var18[var14][var16] >> 2; // L: 1032
		int var20 = (var2 << 7) + (var12 << 6); // L: 1033
		int var21 = (var3 << 7) + (var13 << 6); // L: 1034
		long var22 = ArchiveLoader.calculateTag(var2, var3, 2, var10.int1 == 0, var4); // L: 1035
		int var24 = (var5 << 6) + var6; // L: 1036
		if (var10.int3 == 1) { // L: 1037
			var24 += 256;
		}

		Object var32;
		if (var6 == 22) { // L: 1038
			if (var11 == -1 && var10.transforms == null) { // L: 1040
				var32 = var10.getModel(22, var5, var18, var20, var19, var21);
			} else {
				var32 = new DynamicObject(var4, 22, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1041
			}

			var8.newGroundObject(var0, var2, var3, var19, (Renderable)var32, var22, var24); // L: 1042
			if (var10.interactType == 1) { // L: 1043
				var9.setBlockedByFloorDec(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) { // L: 1046
			if (var6 >= 12) { // L: 1054
				if (var11 == -1 && var10.transforms == null) { // L: 1056
					var32 = var10.getModel(var6, var5, var18, var20, var19, var21);
				} else {
					var32 = new DynamicObject(var4, var6, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1057
				}

				var8.method4597(var0, var2, var3, var19, 1, 1, (Renderable)var32, 0, var22, var24); // L: 1058
				if (var10.interactType != 0) { // L: 1059
					var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
				}

			} else if (var6 == 0) { // L: 1062
				if (var11 == -1 && var10.transforms == null) { // L: 1064
					var32 = var10.getModel(0, var5, var18, var20, var19, var21);
				} else {
					var32 = new DynamicObject(var4, 0, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1065
				}

				var8.newWallObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1000[var5], 0, var22, var24); // L: 1066
				if (var10.interactType != 0) { // L: 1067
					var9.method4121(var2, var3, var6, var5, var10.boolean1);
				}

			} else if (var6 == 1) { // L: 1070
				if (var11 == -1 && var10.transforms == null) { // L: 1072
					var32 = var10.getModel(1, var5, var18, var20, var19, var21);
				} else {
					var32 = new DynamicObject(var4, 1, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1073
				}

				var8.newWallObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field997[var5], 0, var22, var24); // L: 1074
				if (var10.interactType != 0) { // L: 1075
					var9.method4121(var2, var3, var6, var5, var10.boolean1);
				}

			} else {
				int var25;
				if (var6 == 2) { // L: 1078
					var25 = var5 + 1 & 3; // L: 1079
					Object var27;
					Object var33;
					if (var11 == -1 && var10.transforms == null) { // L: 1082
						var33 = var10.getModel(2, var5 + 4, var18, var20, var19, var21); // L: 1083
						var27 = var10.getModel(2, var25, var18, var20, var19, var21); // L: 1084
					} else {
						var33 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1087
						var27 = new DynamicObject(var4, 2, var25, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1088
					}

					var8.newWallObject(var0, var2, var3, var19, (Renderable)var33, (Renderable)var27, Tiles.field1000[var5], Tiles.field1000[var25], var22, var24); // L: 1090
					if (var10.interactType != 0) { // L: 1091
						var9.method4121(var2, var3, var6, var5, var10.boolean1);
					}

				} else if (var6 == 3) { // L: 1094
					if (var11 == -1 && var10.transforms == null) { // L: 1096
						var32 = var10.getModel(3, var5, var18, var20, var19, var21);
					} else {
						var32 = new DynamicObject(var4, 3, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1097
					}

					var8.newWallObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field997[var5], 0, var22, var24); // L: 1098
					if (var10.interactType != 0) { // L: 1099
						var9.method4121(var2, var3, var6, var5, var10.boolean1);
					}

				} else if (var6 == 9) { // L: 1102
					if (var11 == -1 && var10.transforms == null) { // L: 1104
						var32 = var10.getModel(var6, var5, var18, var20, var19, var21);
					} else {
						var32 = new DynamicObject(var4, var6, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1105
					}

					var8.method4597(var0, var2, var3, var19, 1, 1, (Renderable)var32, 0, var22, var24); // L: 1106
					if (var10.interactType != 0) { // L: 1107
						var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
					}

				} else if (var6 == 4) { // L: 1110
					if (var11 == -1 && var10.transforms == null) { // L: 1112
						var32 = var10.getModel(4, var5, var18, var20, var19, var21);
					} else {
						var32 = new DynamicObject(var4, 4, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1113
					}

					var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1000[var5], 0, 0, 0, var22, var24); // L: 1114
				} else {
					long var26;
					Object var28;
					if (var6 == 5) { // L: 1117
						var25 = 16; // L: 1118
						var26 = var8.getWallObjectTag(var0, var2, var3); // L: 1119
						if (var26 != 0L) { // L: 1120
							var25 = class59.getObjectDefinition(class299.Entity_unpackID(var26)).int2;
						}

						if (var11 == -1 && var10.transforms == null) { // L: 1122
							var28 = var10.getModel(4, var5, var18, var20, var19, var21);
						} else {
							var28 = new DynamicObject(var4, 4, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1123
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var28, (Renderable)null, Tiles.field1000[var5], 0, var25 * Tiles.field1002[var5], var25 * Tiles.field1003[var5], var22, var24); // L: 1124
					} else if (var6 == 6) { // L: 1127
						var25 = 8; // L: 1128
						var26 = var8.getWallObjectTag(var0, var2, var3); // L: 1129
						if (0L != var26) { // L: 1130
							var25 = class59.getObjectDefinition(class299.Entity_unpackID(var26)).int2 / 2;
						}

						if (var11 == -1 && var10.transforms == null) { // L: 1132
							var28 = var10.getModel(4, var5 + 4, var18, var20, var19, var21);
						} else {
							var28 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1133
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var28, (Renderable)null, 256, var5, var25 * Tiles.field1007[var5], var25 * Tiles.field1005[var5], var22, var24); // L: 1134
					} else if (var6 == 7) { // L: 1137
						int var31 = var5 + 2 & 3; // L: 1139
						if (var11 == -1 && var10.transforms == null) { // L: 1140
							var32 = var10.getModel(4, var31 + 4, var18, var20, var19, var21);
						} else {
							var32 = new DynamicObject(var4, 4, var31 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1141
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, 256, var31, 0, 0, var22, var24); // L: 1142
					} else if (var6 == 8) { // L: 1145
						var25 = 8; // L: 1146
						var26 = var8.getWallObjectTag(var0, var2, var3); // L: 1147
						if (var26 != 0L) { // L: 1148
							var25 = class59.getObjectDefinition(class299.Entity_unpackID(var26)).int2 / 2;
						}

						int var30 = var5 + 2 & 3; // L: 1151
						Object var29;
						if (var11 == -1 && var10.transforms == null) { // L: 1152
							var28 = var10.getModel(4, var5 + 4, var18, var20, var19, var21); // L: 1153
							var29 = var10.getModel(4, var30 + 4, var18, var20, var19, var21); // L: 1154
						} else {
							var28 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1157
							var29 = new DynamicObject(var4, 4, var30 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1158
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var28, (Renderable)var29, 256, var5, var25 * Tiles.field1007[var5], var25 * Tiles.field1005[var5], var22, var24); // L: 1160
					}
				}
			}
		} else {
			if (var11 == -1 && var10.transforms == null) { // L: 1048
				var32 = var10.getModel(10, var5, var18, var20, var19, var21);
			} else {
				var32 = new DynamicObject(var4, 10, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1049
			}

			if (var32 != null) { // L: 1050
				var8.method4597(var0, var2, var3, var19, var12, var13, (Renderable)var32, var6 == 11 ? 256 : 0, var22, var24);
			}

			if (var10.interactType != 0) { // L: 1051
				var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
			}

		}
	} // L: 1044 1052 1060 1068 1076 1092 1100 1108 1115 1125 1135 1143 1161 1163

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(III)Lij;",
		garbageValue = "-959518371"
	)
	static RouteStrategy method6467(int var0, int var1) {
		Client.field781.approxDestinationX = var0; // L: 8870
		Client.field781.approxDestinationY = var1; // L: 8871
		Client.field781.approxDestinationSizeX = 1; // L: 8872
		Client.field781.approxDestinationSizeY = 1; // L: 8873
		return Client.field781; // L: 8874
	}
}
