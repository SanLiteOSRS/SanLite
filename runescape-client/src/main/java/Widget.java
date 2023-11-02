import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("ad")
	public static boolean field3666;
	@ObfuscatedName("bn")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -749799993
	)
	@Export("id")
	public int id;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 125148757
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bd")
	String field3677;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -589491
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -855942973
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1631583577
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1901054741
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -708493471
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 729286437
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 853098841
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 948315027
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1633803279
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1974141571
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 2018155229
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 295009351
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1097686173
	)
	@Export("y")
	public int y;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1523778353
	)
	@Export("width")
	public int width;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -503112387
	)
	@Export("height")
	public int height;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 2022334487
	)
	public int field3693;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 2740941
	)
	public int field3694;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 251773427
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bx")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 2109677875
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -295412975
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -935068743
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -111326055
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -938310141
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -136977253
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -2109140831
	)
	public int field3805;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1895943135
	)
	public int field3704;
	@ObfuscatedName("cg")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	@Export("fillMode")
	public class541 fillMode;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1533541555
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1979520875
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -965280141
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cb")
	public boolean field3700;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1406466773
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -742351705
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cr")
	public String field3713;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1175641149
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cm")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1799979873
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1142466053
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("cj")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("cx")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 687866879
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -846972165
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1748917075
	)
	int field3676;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 132353457
	)
	int field3731;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1633420983
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 505592203
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 1680724949
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -934925205
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 636395645
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 784481261
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 375946711
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -2040513117
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -156104083
	)
	public int field3732;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -317487855
	)
	public int field3733;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	public PlayerComposition field3734;
	@ObfuscatedName("df")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("de")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -708357175
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 401684089
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("do")
	@Export("text")
	public String text;
	@ObfuscatedName("dh")
	public String field3810;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 24069561
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -1001250813
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -2123733515
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("dw")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	class172 field3745;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -718840529
	)
	int field3746;
	@ObfuscatedName("dd")
	HashMap field3747;
	@ObfuscatedName("dy")
	HashMap field3681;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	class342 field3749;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -748969653
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("eo")
	public boolean field3751;
	@ObfuscatedName("em")
	public byte[][] field3752;
	@ObfuscatedName("el")
	public byte[][] field3779;
	@ObfuscatedName("ec")
	public int[] field3770;
	@ObfuscatedName("eg")
	public int[] field3800;
	@ObfuscatedName("ez")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("en")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = -698684357
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = -1681900881
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("et")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("eh")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("eb")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("ev")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("ee")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ea")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("eu")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("ey")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("ep")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("ef")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ew")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ed")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fj")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fh")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fz")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fs")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fl")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fe")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fo")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fd")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fi")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fk")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fy")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fn")
	public Object[] field3785;
	@ObfuscatedName("fb")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("ft")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fa")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fg")
	public Object[] field3789;
	@ObfuscatedName("fm")
	public Object[] field3790;
	@ObfuscatedName("fv")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("ff")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fw")
	public Object[] field3793;
	@ObfuscatedName("fc")
	public Object[] field3794;
	@ObfuscatedName("fr")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fq")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fp")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fu")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fx")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gi")
	public Object[] field3708;
	@ObfuscatedName("ge")
	public Object[] field3801;
	@ObfuscatedName("gj")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gl")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gq")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = 1676725131
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gf")
	public String field3806;
	@ObfuscatedName("gk")
	public String field3807;
	@ObfuscatedName("gm")
	public int[] field3786;
	@ObfuscatedName("gb")
	public int[] field3809;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = 1826603097
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = -1873885271
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = -971535733
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = 1180629761
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "[Lnm;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gn")
	public boolean field3815;
	@ObfuscatedName("gr")
	public boolean field3816;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = 2118198489
	)
	public int field3817;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = -562080991
	)
	public int field3667;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 82226453
	)
	public int field3819;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 404645373
	)
	public int field3820;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = -1530147071
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -1107400277
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("gg")
	public int[] field3689;
	@ObfuscatedName("gu")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("go")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hi")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3666 = false; // L: 50
	}

	public Widget() {
		this.isIf3 = false; // L: 51
		this.id = -1; // L: 52
		this.childIndex = -1; // L: 53
		this.buttonType = 0; // L: 56
		this.contentType = 0; // L: 57
		this.xAlignment = 0; // L: 58
		this.yAlignment = 0; // L: 59
		this.widthAlignment = 0; // L: 60
		this.heightAlignment = 0; // L: 61
		this.rawX = 0; // L: 62
		this.rawY = 0; // L: 63
		this.rawWidth = 0; // L: 64
		this.rawHeight = 0; // L: 65
		this.x = 0; // L: 66
		this.y = 0; // L: 67
		this.width = 0; // L: 68
		this.height = 0; // L: 69
		this.field3693 = 1; // L: 70
		this.field3694 = 1; // L: 71
		this.parentId = -1; // L: 72
		this.isHidden = false; // L: 73
		this.scrollX = 0; // L: 74
		this.scrollY = 0; // L: 75
		this.scrollWidth = 0; // L: 76
		this.scrollHeight = 0; // L: 77
		this.color = 0; // L: 78
		this.color2 = 0; // L: 79
		this.field3805 = 0; // L: 80
		this.field3704 = 0; // L: 81
		this.fill = false; // L: 82
		this.fillMode = class541.SOLID; // L: 83
		this.transparencyTop = 0; // L: 84
		this.transparencyBot = 0; // L: 85
		this.lineWid = 1; // L: 86
		this.field3700 = false; // L: 87
		this.spriteId2 = -1; // L: 88
		this.spriteId = -1; // L: 89
		this.spriteAngle = 0; // L: 91
		this.spriteTiling = false; // L: 92
		this.outline = 0; // L: 93
		this.spriteShadow = 0; // L: 94
		this.modelType = 1; // L: 97
		this.modelId = -1; // L: 98
		this.field3676 = 1; // L: 99
		this.field3731 = -1; // L: 100
		this.sequenceId = -1; // L: 101
		this.sequenceId2 = -1; // L: 102
		this.modelOffsetX = 0; // L: 103
		this.modelOffsetY = 0; // L: 104
		this.modelAngleX = 0; // L: 105
		this.modelAngleY = 0; // L: 106
		this.modelAngleZ = 0; // L: 107
		this.modelZoom = 100; // L: 108
		this.field3732 = 0; // L: 109
		this.field3733 = 0; // L: 110
		this.modelOrthog = false; // L: 112
		this.modelTransparency = false; // L: 113
		this.itemQuantityMode = 2; // L: 114
		this.fontId = -1; // L: 115
		this.text = ""; // L: 116
		this.field3810 = ""; // L: 117
		this.textLineHeight = 0; // L: 118
		this.textXAlignment = 0; // L: 119
		this.textYAlignment = 0; // L: 120
		this.textShadowed = false; // L: 121
		this.field3746 = -1; // L: 123
		this.flags = 0; // L: 128
		this.field3751 = false; // L: 129
		this.dataText = ""; // L: 138
		this.parent = null; // L: 140
		this.dragZoneSize = 0; // L: 141
		this.dragThreshold = 0; // L: 142
		this.isScrollBar = false; // L: 143
		this.spellActionName = ""; // L: 144
		this.hasListener = false; // L: 145
		this.mouseOverRedirect = -1; // L: 186
		this.field3806 = ""; // L: 187
		this.field3807 = "Ok"; // L: 188
		this.itemId = -1; // L: 191
		this.itemQuantity = 0; // L: 192
		this.modelFrame = 0; // L: 193
		this.modelFrameCycle = 0; // L: 194
		this.field3815 = false; // L: 196
		this.field3816 = false; // L: 197
		this.field3817 = -1; // L: 198
		this.field3667 = 0; // L: 199
		this.field3819 = 0; // L: 200
		this.field3820 = 0; // L: 201
		this.rootIndex = -1; // L: 202
		this.cycle = -1; // L: 203
		this.noClickThrough = false; // L: 205
		this.noScrollThrough = false; // L: 206
		this.prioritizeMenuEntry = false; // L: 207
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "256698557"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 210
		this.type = var1.readUnsignedByte(); // L: 211
		this.buttonType = var1.readUnsignedByte(); // L: 212
		this.contentType = var1.readUnsignedShort(); // L: 213
		this.rawX = var1.readShort(); // L: 214
		this.rawY = var1.readShort(); // L: 215
		this.rawWidth = var1.readUnsignedShort(); // L: 216
		this.rawHeight = var1.readUnsignedShort(); // L: 217
		this.transparencyTop = var1.readUnsignedByte(); // L: 218
		this.parentId = var1.readUnsignedShort(); // L: 219
		if (this.parentId == 65535) { // L: 220
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 221
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 222
		if (this.mouseOverRedirect == 65535) { // L: 223
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 224
		int var3;
		if (var2 > 0) { // L: 225
			this.cs1Comparisons = new int[var2]; // L: 226
			this.cs1ComparisonValues = new int[var2]; // L: 227

			for (var3 = 0; var3 < var2; ++var3) { // L: 228
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 229
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 230
			}
		}

		var3 = var1.readUnsignedByte(); // L: 233
		int var4;
		if (var3 > 0) { // L: 234
			this.cs1Instructions = new int[var3][]; // L: 235

			for (var4 = 0; var4 < var3; ++var4) { // L: 236
				int var5 = var1.readUnsignedShort(); // L: 237
				this.cs1Instructions[var4] = new int[var5]; // L: 238

				for (int var6 = 0; var6 < var5; ++var6) { // L: 239
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 240
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 241
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 245
			this.scrollHeight = var1.readUnsignedShort(); // L: 246
			this.isHidden = var1.readUnsignedByte() == 1; // L: 247
		}

		if (this.type == 1) { // L: 249
			var1.readUnsignedShort(); // L: 250
			var1.readUnsignedByte(); // L: 251
		}

		if (this.type == 3) { // L: 253
			this.fill = var1.readUnsignedByte() == 1; // L: 254
		}

		if (this.type == 4 || this.type == 1) { // L: 256
			this.textXAlignment = var1.readUnsignedByte(); // L: 257
			this.textYAlignment = var1.readUnsignedByte(); // L: 258
			this.textLineHeight = var1.readUnsignedByte(); // L: 259
			this.fontId = var1.readUnsignedShort(); // L: 260
			if (this.fontId == 65535) { // L: 261
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 262
		}

		if (this.type == 4) { // L: 264
			this.text = var1.readStringCp1252NullTerminated(); // L: 265
			this.field3810 = var1.readStringCp1252NullTerminated(); // L: 266
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 268
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 269
			this.color2 = var1.readInt(); // L: 270
			this.field3805 = var1.readInt(); // L: 271
			this.field3704 = var1.readInt(); // L: 272
		}

		if (this.type == 5) { // L: 274
			this.spriteId2 = var1.readInt(); // L: 275
			this.spriteId = var1.readInt(); // L: 276
		}

		if (this.type == 6) { // L: 278
			this.modelType = 1; // L: 279
			this.modelId = var1.readUnsignedShort(); // L: 280
			if (this.modelId == 65535) { // L: 281
				this.modelId = -1;
			}

			this.field3676 = 1; // L: 282
			this.field3731 = var1.readUnsignedShort(); // L: 283
			if (this.field3731 == 65535) { // L: 284
				this.field3731 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 285
			if (this.sequenceId == 65535) { // L: 286
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 287
			if (this.sequenceId2 == 65535) { // L: 288
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 289
			this.modelAngleX = var1.readUnsignedShort(); // L: 290
			this.modelAngleY = var1.readUnsignedShort(); // L: 291
		}

		if (this.type == 8) { // L: 293
			this.text = var1.readStringCp1252NullTerminated(); // L: 294
		}

		if (this.buttonType == 2) { // L: 296
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 297
			this.field3806 = var1.readStringCp1252NullTerminated(); // L: 298
			var4 = var1.readUnsignedShort() & 63; // L: 299
			this.flags |= var4 << 11; // L: 300
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 302
			this.field3807 = var1.readStringCp1252NullTerminated(); // L: 303
			if (this.field3807.length() == 0) { // L: 304
				if (this.buttonType == 1) { // L: 305
					this.field3807 = "Ok";
				}

				if (this.buttonType == 4) { // L: 306
					this.field3807 = "Select";
				}

				if (this.buttonType == 5) { // L: 307
					this.field3807 = "Select";
				}

				if (this.buttonType == 6) { // L: 308
					this.field3807 = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 311
			this.flags |= 4194304; // L: 312
		}

		if (this.buttonType == 6) { // L: 314
			this.flags |= 1; // L: 315
		}

	} // L: 317

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "1307379688"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 320
		this.isIf3 = true; // L: 321
		this.type = var1.readUnsignedByte(); // L: 322
		this.contentType = var1.readUnsignedShort(); // L: 323
		this.rawX = var1.readShort(); // L: 324
		this.rawY = var1.readShort(); // L: 325
		this.rawWidth = var1.readUnsignedShort(); // L: 326
		if (this.type == 9) { // L: 327
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 328
		}

		this.widthAlignment = var1.readByte(); // L: 329
		this.heightAlignment = var1.readByte(); // L: 330
		this.xAlignment = var1.readByte(); // L: 331
		this.yAlignment = var1.readByte(); // L: 332
		this.parentId = var1.readUnsignedShort(); // L: 333
		if (this.parentId == 65535) { // L: 334
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 335
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 336
		if (this.type == 0) { // L: 337
			this.scrollWidth = var1.readUnsignedShort(); // L: 338
			this.scrollHeight = var1.readUnsignedShort(); // L: 339
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 340
		}

		if (this.type == 5) { // L: 342
			this.spriteId2 = var1.readInt(); // L: 343
			this.spriteAngle = var1.readUnsignedShort(); // L: 344
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 345
			this.transparencyTop = var1.readUnsignedByte(); // L: 346
			this.outline = var1.readUnsignedByte(); // L: 347
			this.spriteShadow = var1.readInt(); // L: 348
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 349
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 350
		}

		if (this.type == 6) { // L: 352
			this.modelType = 1; // L: 353
			this.modelId = var1.readUnsignedShort(); // L: 354
			if (this.modelId == 65535) { // L: 355
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 356
			this.modelOffsetY = var1.readShort(); // L: 357
			this.modelAngleX = var1.readUnsignedShort(); // L: 358
			this.modelAngleY = var1.readUnsignedShort(); // L: 359
			this.modelAngleZ = var1.readUnsignedShort(); // L: 360
			this.modelZoom = var1.readUnsignedShort(); // L: 361
			this.sequenceId = var1.readUnsignedShort(); // L: 362
			if (this.sequenceId == 65535) { // L: 363
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 364
			var1.readUnsignedShort(); // L: 365
			if (this.widthAlignment != 0) { // L: 366
				this.field3732 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 367
				var1.readUnsignedShort(); // L: 368
			}
		}

		if (this.type == 4) { // L: 371
			this.fontId = var1.readUnsignedShort(); // L: 372
			if (this.fontId == 65535) { // L: 373
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 374
			this.textLineHeight = var1.readUnsignedByte(); // L: 375
			this.textXAlignment = var1.readUnsignedByte(); // L: 376
			this.textYAlignment = var1.readUnsignedByte(); // L: 377
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 378
			this.color = var1.readInt(); // L: 379
		}

		if (this.type == 3) { // L: 381
			this.color = var1.readInt(); // L: 382
			this.fill = var1.readUnsignedByte() == 1; // L: 383
			this.transparencyTop = var1.readUnsignedByte(); // L: 384
		}

		if (this.type == 9) { // L: 386
			this.lineWid = var1.readUnsignedByte(); // L: 387
			this.color = var1.readInt(); // L: 388
			this.field3700 = var1.readUnsignedByte() == 1; // L: 389
		}

		this.flags = var1.readMedium(); // L: 391
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 392
		int var2 = var1.readUnsignedByte(); // L: 393
		if (var2 > 0) { // L: 394
			this.actions = new String[var2]; // L: 395

			for (int var3 = 0; var3 < var2; ++var3) { // L: 396
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 398
		this.dragThreshold = var1.readUnsignedByte(); // L: 399
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 400
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 401
		this.onLoad = this.readListener(var1); // L: 402
		this.onMouseOver = this.readListener(var1); // L: 403
		this.onMouseLeave = this.readListener(var1); // L: 404
		this.onTargetLeave = this.readListener(var1); // L: 405
		this.onTargetEnter = this.readListener(var1); // L: 406
		this.onVarTransmit = this.readListener(var1); // L: 407
		this.onInvTransmit = this.readListener(var1); // L: 408
		this.onStatTransmit = this.readListener(var1); // L: 409
		this.onTimer = this.readListener(var1); // L: 410
		this.onOp = this.readListener(var1); // L: 411
		this.onMouseRepeat = this.readListener(var1); // L: 412
		this.onClick = this.readListener(var1); // L: 413
		this.onClickRepeat = this.readListener(var1); // L: 414
		this.onRelease = this.readListener(var1); // L: 415
		this.onHold = this.readListener(var1); // L: 416
		this.onDrag = this.readListener(var1); // L: 417
		this.onDragComplete = this.readListener(var1); // L: 418
		this.onScroll = this.readListener(var1); // L: 419
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 420
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 421
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 422
	} // L: 423

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-474340220"
	)
	void method6651(Buffer var1) {
		this.field3677 = var1.readStringCp1252NullTerminated(); // L: 426
	} // L: 427

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)[Ljava/lang/Object;",
		garbageValue = "1937096505"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 430
		if (var2 == 0) { // L: 431
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 432

			for (int var4 = 0; var4 < var2; ++var4) { // L: 433
				int var5 = var1.readUnsignedByte(); // L: 434
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 435
				} else if (var5 == 1) { // L: 436
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 438
			return var3; // L: 439
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)[I",
		garbageValue = "-1309902668"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 443
		if (var2 == 0) { // L: 444
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 445

			for (int var4 = 0; var4 < var2; ++var4) { // L: 446
				var3[var4] = var1.readInt(); // L: 447
			}

			return var3; // L: 449
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lnt;ZLen;B)Lud;",
		garbageValue = "-70"
	)
	public SpritePixels method6587(class338 var1, boolean var2, UrlRequester var3) {
		field3666 = false; // L: 453
		if (this.field3713 != null) { // L: 454
			SpritePixels var4 = this.method6655(var1, var3); // L: 455
			if (var4 != null) { // L: 456
				return var4; // L: 457
			}
		}

		int var8;
		if (var2) { // L: 461
			var8 = this.spriteId;
		} else {
			var8 = this.spriteId2; // L: 462
		}

		if (var8 == -1) { // L: 463
			return null;
		} else {
			long var5 = (long)var8 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40); // L: 464
			SpritePixels var7 = (SpritePixels)var1.field3585.get(var5); // L: 465
			if (var7 != null) { // L: 466
				return var7;
			} else {
				var7 = class47.SpriteBuffer_getSprite(var1.field3581, var8, 0); // L: 467
				if (var7 == null) { // L: 468
					field3666 = true; // L: 469
					return null; // L: 470
				} else {
					this.method6647(var7); // L: 472
					var1.field3585.put(var7, var5); // L: 473
					return var7; // L: 474
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Len;I)Lud;",
		garbageValue = "19328064"
	)
	SpritePixels method6655(class338 var1, UrlRequester var2) {
		if (!this.method6697()) { // L: 478
			return this.method6589(var1, var2); // L: 479
		} else {
			String var3 = this.field3713 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 481
			SpritePixels var4 = (SpritePixels)var1.field3590.method7937(var3); // L: 482
			if (var4 == null) { // L: 483
				SpritePixels var5 = this.method6589(var1, var2); // L: 484
				if (var5 != null) { // L: 485
					var4 = var5.method9670(); // L: 486
					this.method6647(var4); // L: 487
					var1.field3590.method7928(var3, var4); // L: 488
				}
			}

			return var4; // L: 491
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Len;S)Lud;",
		garbageValue = "9140"
	)
	SpritePixels method6589(class338 var1, UrlRequester var2) {
		if (this.field3713 != null && var2 != null) { // L: 495
			class341 var3 = (class341)var1.field3578.method7937(this.field3713); // L: 496
			if (var3 == null) { // L: 497
				var3 = new class341(this.field3713, var2); // L: 498
				var1.field3578.method7928(this.field3713, var3); // L: 499
			}

			return var3.method6264(); // L: 501
		} else {
			return null; // L: 503
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1213670035"
	)
	boolean method6697() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 507
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lud;B)V",
		garbageValue = "12"
	)
	void method6647(SpritePixels var1) {
		if (this.spriteFlipV) { // L: 511
			var1.flipVertically();
		}

		if (this.spriteFlipH) { // L: 512
			var1.flipHorizontally();
		}

		if (this.outline > 0) { // L: 513
			var1.pad(this.outline);
		}

		if (this.outline >= 1) { // L: 514
			var1.outline(1);
		}

		if (this.outline >= 2) {
			var1.outline(16777215); // L: 515
		}

		if (this.spriteShadow != 0) { // L: 516
			var1.shadow(this.spriteShadow);
		}

	} // L: 517

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)Lpu;",
		garbageValue = "-729897431"
	)
	public Font method6592(class338 var1) {
		field3666 = false; // L: 520
		if (this.fontId == -1) { // L: 521
			return null;
		} else {
			Font var2 = (Font)var1.field3586.get((long)this.fontId); // L: 522
			if (var2 != null) { // L: 523
				return var2;
			} else {
				AbstractArchive var4 = var1.field3581; // L: 525
				AbstractArchive var5 = var1.field3582; // L: 526
				int var6 = this.fontId; // L: 527
				Font var3;
				if (!class164.method3376(var4, var6, 0)) { // L: 529
					var3 = null; // L: 530
				} else {
					byte[] var8 = var5.takeFile(var6, 0); // L: 534
					Font var7;
					if (var8 == null) { // L: 536
						var7 = null; // L: 537
					} else {
						Font var9 = new Font(var8, class326.SpriteBuffer_xOffsets, ModelData0.SpriteBuffer_yOffsets, class59.SpriteBuffer_spriteWidths, class544.SpriteBuffer_spriteHeights, class372.SpriteBuffer_spritePalette, class414.SpriteBuffer_pixels); // L: 540
						class407.method7453(); // L: 541
						var7 = var9; // L: 542
					}

					var3 = var7; // L: 544
				}

				if (var3 != null) { // L: 547
					var1.field3586.put(var3, (long)this.fontId);
				} else {
					field3666 = true; // L: 548
				}

				return var3; // L: 549
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Lif;IZLni;Lhw;Lhe;B)Ljn;",
		garbageValue = "-104"
	)
	public Model method6626(class338 var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, class204 var7) {
		field3666 = false; // L: 553
		int var8;
		int var9;
		if (var4) { // L: 556
			var8 = this.field3676; // L: 557
			var9 = this.field3731; // L: 558
		} else {
			var8 = this.modelType; // L: 561
			var9 = this.modelId; // L: 562
		}

		if (var8 == 6) { // L: 564
			if (var6 == null) { // L: 565
				return null;
			}

			var9 = var6.id; // L: 566
		}

		if (var8 == 0) { // L: 568
			return null;
		} else if (var8 == 1 && var9 == -1) { // L: 569
			return null;
		} else {
			if (var7 != null && var7.field2038 && var8 == 6) { // L: 570
				var8 = 3; // L: 571
			}

			long var10 = (long)(var9 + (var8 << 16)); // L: 573
			if (var7 != null) { // L: 574
				var10 |= var7.field2040 << 20;
			}

			Model var12 = (Model)var1.field3589.get(var10); // L: 575
			if (var12 == null) { // L: 576
				ModelData var13 = null; // L: 577
				int var14 = 64; // L: 578
				int var15 = 768; // L: 579
				switch(var8) { // L: 580
				case 1:
					var13 = ModelData.ModelData_get(var1.field3580, var9, 0); // L: 588
					break; // L: 589
				case 2:
					var13 = class190.getNpcDefinition(var9).method3784((class204)null); // L: 597
					break;
				case 3:
					var13 = var5 != null ? var5.getModelData() : null; // L: 582
					break;
				case 4:
					ItemComposition var16 = class214.ItemComposition_get(var9); // L: 591
					var13 = var16.getModelData(10); // L: 592
					var14 += var16.field2260; // L: 593
					var15 += var16.field2279; // L: 594
				case 5:
				default:
					break;
				case 6:
					var13 = class190.getNpcDefinition(var9).method3784(var7); // L: 585
				}

				if (var13 == null) { // L: 600
					field3666 = true; // L: 601
					return null; // L: 602
				}

				var12 = var13.toModel(var14, var15, -50, -10, -50); // L: 604
				var1.field3589.put(var12, var10); // L: 605
			}

			if (var2 != null) { // L: 607
				var12 = var2.transformWidgetModel(var12, var3); // L: 608
			}

			return var12; // L: 610
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lnt;ZI)Lmp;",
		garbageValue = "1153974487"
	)
	public SpriteMask method6594(class338 var1, boolean var2) {
		if (this.spriteId == -1) { // L: 614
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2; // L: 615
		if (var3 == -1) { // L: 616
			return null;
		} else {
			long var4 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var3 + ((long)this.outline << 36) + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 617
			SpriteMask var6 = (SpriteMask)var1.field3584.get(var4); // L: 618
			if (var6 != null) { // L: 619
				return var6;
			} else {
				SpritePixels var7 = this.method6587(var1, var2, (UrlRequester)null); // L: 620
				if (var7 == null) { // L: 621
					return null;
				} else {
					SpritePixels var8 = var7.copyNormalized(); // L: 622
					int[] var9 = new int[var8.subHeight]; // L: 623
					int[] var10 = new int[var8.subHeight]; // L: 624

					for (int var11 = 0; var11 < var8.subHeight; ++var11) { // L: 625
						int var12 = 0; // L: 626
						int var13 = var8.subWidth; // L: 627

						int var14;
						for (var14 = 0; var14 < var8.subWidth; ++var14) { // L: 628
							if (var8.pixels[var14 + var11 * var8.subWidth] == 0) { // L: 629
								var12 = var14; // L: 630
								break;
							}
						}

						for (var14 = var8.subWidth - 1; var14 >= var12; --var14) { // L: 634
							if (var8.pixels[var14 + var11 * var8.subWidth] == 0) { // L: 635
								var13 = var14 + 1; // L: 636
								break;
							}
						}

						var9[var11] = var12; // L: 640
						var10[var11] = var13 - var12; // L: 641
					}

					var6 = new SpriteMask(var8.subWidth, var8.subHeight, var10, var9, var3); // L: 643
					var1.field3584.put(var6, var4); // L: 644
					return var6; // L: 645
				}
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1879897053"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 649
			String[] var3 = new String[var1 + 1]; // L: 650
			if (this.actions != null) { // L: 651
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 652
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 654
		}

		this.actions[var1] = var2; // L: 656
	} // L: 657

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1501160732"
	)
	public boolean method6596() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12; // L: 660
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1474529826"
	)
	public boolean method6597() {
		return this.type == 11 || this.type == 12; // L: 664
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Len;J)V"
	)
	public void method6692(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && var3 != -1L) { // L: 668
			var1 = var1.replaceAll("%userid%", Long.toString(var3)); // L: 669
			this.field3745 = new class172(); // L: 670
			if (!this.field3745.method3431(var1, var2)) { // L: 671
				this.field3745 = null; // L: 672
			} else {
				if (this.field3747 == null || this.field3681 == null) { // L: 675
					this.method6600(); // L: 676
				}

			}
		}
	} // L: 673 678

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Len;I)V",
		garbageValue = "2097031968"
	)
	public void method6676(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) { // L: 681
			this.field3745 = new class172(); // L: 682
			this.field3745.method3474(var1, var2); // L: 683
		}
	} // L: 684

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-296601660"
	)
	void method6600() {
		this.field3747 = new HashMap(); // L: 687
		this.field3681 = new HashMap(); // L: 688
	} // L: 689

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-652704759"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		if (this.type == 11) { // L: 692
			if (this.field3747 == null) { // L: 693
				this.method6600();
			}

			this.field3747.put(var1, var2); // L: 694
		}
	} // L: 695

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-304469184"
	)
	public void method6602(String var1, int var2) {
		if (this.type == 11) { // L: 698
			if (this.field3681 == null) { // L: 699
				this.method6600();
			}

			this.field3681.put(var1, var2); // L: 700
		}
	} // L: 701

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-282270797"
	)
	public boolean method6680(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3745 != null && this.method6604()) { // L: 704
			var1 -= var3; // L: 705
			var2 -= var4; // L: 706
			int var5 = (int)(this.field3745.method3468()[0] * (float)this.width); // L: 707
			int var6 = (int)(this.field3745.method3468()[1] * (float)this.height); // L: 708
			int var7 = var5 + (int)(this.field3745.method3468()[2] * (float)this.width); // L: 709
			int var8 = var6 + (int)(this.field3745.method3468()[3] * (float)this.height); // L: 710
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8; // L: 711
		} else {
			return false;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1033886288"
	)
	public boolean method6604() {
		return this.field3746 == 2; // L: 715
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "2104948044"
	)
	public int method6641(String var1) {
		return this.type == 11 && this.field3745 != null && this.method6604() ? this.field3745.method3434(var1) : -1; // L: 719 720 722
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1855282224"
	)
	public String method6606(String var1) {
		return this.type == 11 && this.field3745 != null && this.method6604() ? this.field3745.method3449(var1) : null; // L: 726 727
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1779226653"
	)
	public int method6631() {
		return this.field3681 != null && this.field3681.size() > 0 ? 1 : 0; // L: 731
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method6688() {
		if (this.type == 11 && this.field3745 != null && this.field3681 != null && !this.field3681.isEmpty()) { // L: 735
			String var1 = this.field3745.method3438(); // L: 736
			return var1 != null && this.field3681.containsKey(this.field3745.method3438()) ? (Integer)this.field3681.get(var1) : -1; // L: 737 738 740
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-80"
	)
	public String method6609() {
		if (this.type == 11 && this.field3745 != null) { // L: 744
			String var1 = this.field3745.method3438(); // L: 745
			Iterator var2 = this.field3745.method3440().iterator(); // L: 746

			while (var2.hasNext()) {
				class183 var3 = (class183)var2.next(); // L: 747
				String var4 = String.format("%%%S%%", var3.method3576()); // L: 749
				if (var3.vmethod3575() == 0) { // L: 750
					var1.replaceAll(var4, Integer.toString(var3.vmethod3573())); // L: 751
				} else {
					var1.replaceAll(var4, var3.vmethod3574()); // L: 754
				}
			}

			return var1; // L: 758
		} else {
			return null; // L: 757
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1962423370"
	)
	public int[] method6610() {
		if (this.type == 11 && this.field3745 != null) { // L: 762
			int[] var1 = new int[3]; // L: 763
			int var2 = 0; // L: 764
			Iterator var3 = this.field3745.method3440().iterator(); // L: 765

			while (var3.hasNext()) {
				class183 var4 = (class183)var3.next(); // L: 766
				if (!var4.method3576().equals("user_id")) { // L: 768
					if (var4.vmethod3575() != 0) { // L: 769
						return null; // L: 776
					}

					var1[var2++] = var4.vmethod3573(); // L: 770
					if (var2 > 3) { // L: 771
						return null; // L: 772
					}
				}
			}

			return var1; // L: 781
		} else {
			return null;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Len;I)Z",
		garbageValue = "-1209602899"
	)
	public boolean method6611(class338 var1, UrlRequester var2) {
		if (this.type == 11 && this.field3745 != null) { // L: 785
			this.field3745.method3432(var2); // L: 786
			if (this.field3745.method3465() != this.field3746) { // L: 787
				this.field3746 = this.field3745.method3465(); // L: 788
				if (this.field3746 >= 100) { // L: 789
					return true; // L: 790
				}

				if (this.field3746 == 2) { // L: 792
					this.method6612(var1); // L: 793
					return true; // L: 794
				}
			}

			return false; // L: 797
		} else {
			return false;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "2132169674"
	)
	void method6612(class338 var1) {
		this.noClickThrough = true; // L: 818
		ArrayList var2 = this.field3745.method3436(); // L: 819
		ArrayList var3 = this.field3745.method3437(); // L: 820
		int var4 = var2.size() + var3.size(); // L: 821
		this.children = new Widget[var4]; // L: 822
		int var5 = 0; // L: 823

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) { // L: 824 831
			class178 var7 = (class178)var6.next(); // L: 825
			var8 = ViewportMouse.method5076(5, this, var5, 0, 0, 0, 0, var7.field1855); // L: 827
			var8.field3713 = var7.field1856.method2868(); // L: 828
			class341 var9 = new class341(var7.field1856); // L: 829
			var1.field3578.method7928(var8.field3713, var9); // L: 830
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) { // L: 834 842
			class179 var10 = (class179)var6.next(); // L: 835
			var8 = ViewportMouse.method5076(4, this, var5, 0, 0, 0, 0, var10.field1860); // L: 837
			var8.text = var10.field1858; // L: 838
			var8.fontId = (Integer)this.field3747.get(var10.field1864); // L: 839
			var8.textXAlignment = var10.field1862; // L: 840
			var8.textYAlignment = var10.field1863; // L: 841
		}

	} // L: 845

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "101274851"
	)
	public void method6621() {
		this.field3749 = new class342(); // L: 848

		for (int var1 = 1; var1 <= 12; ++var1) { // L: 849
			this.field3749.field3605.method372(var1, 0); // L: 850
		}

		for (char var2 = 0; var2 < ' '; ++var2) { // L: 852
			this.field3749.field3605.method373(var2, 0); // L: 853
		}

		this.field3749.field3605.method373('\u0080', 0); // L: 855
		this.field3749.field3605.method372(82, 2); // L: 856
		this.field3749.field3605.method372(81, 2); // L: 857
		this.field3749.field3605.method372(86, 2); // L: 858
	} // L: 859

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)Lnz;",
		garbageValue = "5"
	)
	public class344 method6614() {
		return this.field3749 != null ? this.field3749.field3606 : null; // L: 862
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(S)Lnx;",
		garbageValue = "4477"
	)
	public class339 method6615() {
		return this.field3749 != null ? this.field3749.field3604 : null; // L: 866
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Lbk;",
		garbageValue = "-1397060242"
	)
	public class27 method6591() {
		return this.field3749 != null ? this.field3749.field3605 : null; // L: 870
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Lno;",
		garbageValue = "-280848154"
	)
	public class342 method6617() {
		return this.field3749; // L: 874
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lnz;I)Z",
		garbageValue = "2067973032"
	)
	boolean method6618(class344 var1) {
		boolean var2 = false; // L: 878
		String var5;
		String var6;
		StringBuilder var7;
		int var8;
		int var9;
		int var10;
		char var11;
		String var12;
		if (this.text != null && !this.text.isEmpty()) { // L: 879
			var6 = this.text; // L: 883
			var7 = new StringBuilder(var6.length()); // L: 885
			var8 = 0; // L: 886
			var9 = -1; // L: 887

			for (var10 = 0; var10 < var6.length(); ++var10) { // L: 888
				var11 = var6.charAt(var10); // L: 889
				if (var11 == '<') { // L: 890
					var7.append(var6.substring(var8, var10)); // L: 891
					var9 = var10; // L: 892
				} else if (var11 == '>' && var9 != -1) { // L: 895
					var12 = var6.substring(var9 + 1, var10); // L: 896
					var9 = -1; // L: 897
					if (var12.equals("lt")) { // L: 898
						var7.append("<"); // L: 899
					} else if (var12.equals("gt")) { // L: 901
						var7.append(">"); // L: 902
					} else if (var12.equals("br")) { // L: 904
						var7.append("\n"); // L: 905
					}

					var8 = var10 + 1; // L: 907
				}
			}

			if (var8 < var6.length()) { // L: 910
				var7.append(var6.substring(var8, var6.length())); // L: 911
			}

			var5 = var7.toString(); // L: 913
			var2 |= var1.method6306(var5); // L: 915
			this.text = ""; // L: 916
		}

		if (this.field3810 != null && !this.field3810.isEmpty()) { // L: 918
			var6 = this.field3810; // L: 922
			var7 = new StringBuilder(var6.length()); // L: 924
			var8 = 0; // L: 925
			var9 = -1; // L: 926

			for (var10 = 0; var10 < var6.length(); ++var10) { // L: 927
				var11 = var6.charAt(var10); // L: 928
				if (var11 == '<') { // L: 929
					var7.append(var6.substring(var8, var10)); // L: 930
					var9 = var10; // L: 931
				} else if (var11 == '>' && var9 != -1) { // L: 934
					var12 = var6.substring(var9 + 1, var10); // L: 935
					var9 = -1; // L: 936
					if (var12.equals("lt")) { // L: 937
						var7.append("<"); // L: 938
					} else if (var12.equals("gt")) { // L: 940
						var7.append(">"); // L: 941
					} else if (var12.equals("br")) { // L: 943
						var7.append("\n"); // L: 944
					}

					var8 = var10 + 1; // L: 946
				}
			}

			if (var8 < var6.length()) { // L: 949
				var7.append(var6.substring(var8, var6.length())); // L: 950
			}

			var5 = var7.toString(); // L: 952
			var2 |= var1.method6307(var5); // L: 954
			this.field3810 = ""; // L: 955
		}

		return var2; // L: 957
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)Z",
		garbageValue = "-636872431"
	)
	public boolean method6619(class338 var1) {
		class344 var2 = this.method6614(); // L: 961
		if (var2 == null) { // L: 962
			return false;
		} else {
			boolean var3 = false; // L: 963
			if (!var2.method6360() && this.fontId != -1) { // L: 964
				int var4 = var2.method6361(); // L: 965
				int var5 = var2.method6362(); // L: 966
				int var6 = var2.method6359(); // L: 967
				int var7 = var2.method6358(); // L: 968
				Font var8 = this.method6592(var1); // L: 969
				if (var8 != null) { // L: 970
					var3 |= var2.method6308(var8); // L: 971
					var3 |= this.method6618(var2); // L: 972
					var3 |= var2.method6313(var4, var5); // L: 973
					var3 |= var2.method6314(var6, var7); // L: 974
				}
			} else if (var2.method6360()) { // L: 977
				var3 |= this.method6618(var2); // L: 978
			}

			var2.method6397(); // L: 980
			return var3; // L: 981
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Lun;",
		garbageValue = "5"
	)
	static IndexedSprite method6728() {
		IndexedSprite var0 = new IndexedSprite(); // L: 149
		var0.width = class159.SpriteBuffer_spriteWidth; // L: 150
		var0.height = class500.SpriteBuffer_spriteHeight; // L: 151
		var0.xOffset = class326.SpriteBuffer_xOffsets[0]; // L: 152
		var0.yOffset = ModelData0.SpriteBuffer_yOffsets[0]; // L: 153
		var0.subWidth = class59.SpriteBuffer_spriteWidths[0]; // L: 154
		var0.subHeight = class544.SpriteBuffer_spriteHeights[0]; // L: 155
		var0.palette = class372.SpriteBuffer_spritePalette; // L: 156
		var0.pixels = class414.SpriteBuffer_pixels[0]; // L: 157
		class407.method7453(); // L: 158
		return var0; // L: 159
	}
}
