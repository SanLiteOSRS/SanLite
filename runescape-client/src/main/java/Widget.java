import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("at")
	public static boolean field3698;
	@ObfuscatedName("bj")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -581424645
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 682881247
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bt")
	String field3702;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -688476977
	)
	@Export("type")
	public int type;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -352524723
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1882858409
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -2135195913
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -785985783
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1298643517
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 542614333
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -856367673
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -2009252243
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -123837809
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1546265191
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1598075411
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 51913453
	)
	@Export("y")
	public int y;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -933572881
	)
	@Export("width")
	public int width;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 243026823
	)
	@Export("height")
	public int height;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 507694829
	)
	public int field3718;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1218173411
	)
	public int field3710;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 438029411
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bs")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 553937681
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 2087071211
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1183616913
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 189697433
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 59242653
	)
	@Export("color")
	public int color;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 494867345
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1040261009
	)
	public int field3778;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 896899793
	)
	public int field3729;
	@ObfuscatedName("cp")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("fillMode")
	public class542 fillMode;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1520489857
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1396436823
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -55530205
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cd")
	public boolean field3735;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -574615749
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1335238307
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cy")
	public String field3728;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -134908819
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("ch")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1418454377
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1806653653
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("cz")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("ck")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -967131161
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -875596785
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -706913575
	)
	int field3747;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1357521321
	)
	int field3812;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -2033889893
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1143616739
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -706355007
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 1557677047
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 889711111
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -539924403
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 981714739
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 885887091
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -597795
	)
	public int field3785;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 1612526275
	)
	public int field3758;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	public PlayerComposition field3759;
	@ObfuscatedName("dr")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("db")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 962335791
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -1606863379
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("dn")
	@Export("text")
	public String text;
	@ObfuscatedName("dp")
	public String field3752;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -984803871
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 742049137
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 829573041
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("do")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	class208 field3770;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 131734723
	)
	int field3783;
	@ObfuscatedName("dq")
	HashMap field3772;
	@ObfuscatedName("ds")
	HashMap field3828;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	class342 field3774;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -344331513
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("el")
	public boolean field3776;
	@ObfuscatedName("et")
	public byte[][] field3775;
	@ObfuscatedName("eo")
	public byte[][] field3796;
	@ObfuscatedName("ec")
	public int[] field3779;
	@ObfuscatedName("en")
	public int[] field3787;
	@ObfuscatedName("em")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ee")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = -312061563
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = -2014946303
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("eh")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("ep")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("eb")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("eu")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("es")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("eq")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("ea")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("ex")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("ei")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("ef")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ez")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ek")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fe")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fx")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("ff")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fv")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fb")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fr")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fi")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fh")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fu")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fs")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fw")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fl")
	public Object[] field3809;
	@ObfuscatedName("fo")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fd")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ft")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fk")
	public Object[] field3813;
	@ObfuscatedName("fm")
	public Object[] field3814;
	@ObfuscatedName("fj")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fc")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fq")
	public Object[] field3817;
	@ObfuscatedName("fg")
	public Object[] field3818;
	@ObfuscatedName("fy")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fa")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fz")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fn")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fp")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gz")
	public Object[] field3824;
	@ObfuscatedName("gn")
	public Object[] field3825;
	@ObfuscatedName("ga")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gu")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gr")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = -569245637
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gl")
	public String field3830;
	@ObfuscatedName("gt")
	public String field3831;
	@ObfuscatedName("go")
	public int[] field3834;
	@ObfuscatedName("gv")
	public int[] field3833;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = -473617411
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = 44818035
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = 1833868437
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 2051793061
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "[Lnn;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gi")
	public boolean field3722;
	@ObfuscatedName("gc")
	public boolean field3840;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 518185877
	)
	public int field3836;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -1567645325
	)
	public int field3842;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 1468300537
	)
	public int field3843;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = -904704263
	)
	public int field3844;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = -883784835
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = -1004063217
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("ge")
	public int[] field3847;
	@ObfuscatedName("gd")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gg")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hw")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3698 = false; // L: 51
	}

	public Widget() {
		this.isIf3 = false; // L: 52
		this.id = -1; // L: 53
		this.childIndex = -1; // L: 54
		this.buttonType = 0; // L: 57
		this.contentType = 0; // L: 58
		this.xAlignment = 0; // L: 59
		this.yAlignment = 0; // L: 60
		this.widthAlignment = 0; // L: 61
		this.heightAlignment = 0; // L: 62
		this.rawX = 0; // L: 63
		this.rawY = 0; // L: 64
		this.rawWidth = 0; // L: 65
		this.rawHeight = 0; // L: 66
		this.x = 0; // L: 67
		this.y = 0; // L: 68
		this.width = 0; // L: 69
		this.height = 0; // L: 70
		this.field3718 = 1; // L: 71
		this.field3710 = 1; // L: 72
		this.parentId = -1; // L: 73
		this.isHidden = false; // L: 74
		this.scrollX = 0; // L: 75
		this.scrollY = 0; // L: 76
		this.scrollWidth = 0; // L: 77
		this.scrollHeight = 0; // L: 78
		this.color = 0; // L: 79
		this.color2 = 0; // L: 80
		this.field3778 = 0; // L: 81
		this.field3729 = 0; // L: 82
		this.fill = false; // L: 83
		this.fillMode = class542.SOLID; // L: 84
		this.transparencyTop = 0; // L: 85
		this.transparencyBot = 0; // L: 86
		this.lineWid = 1; // L: 87
		this.field3735 = false; // L: 88
		this.spriteId2 = -1; // L: 89
		this.spriteId = -1; // L: 90
		this.spriteAngle = 0; // L: 92
		this.spriteTiling = false; // L: 93
		this.outline = 0; // L: 94
		this.spriteShadow = 0; // L: 95
		this.modelType = 1; // L: 98
		this.modelId = -1; // L: 99
		this.field3747 = 1; // L: 100
		this.field3812 = -1; // L: 101
		this.sequenceId = -1; // L: 102
		this.sequenceId2 = -1; // L: 103
		this.modelOffsetX = 0; // L: 104
		this.modelOffsetY = 0; // L: 105
		this.modelAngleX = 0; // L: 106
		this.modelAngleY = 0; // L: 107
		this.modelAngleZ = 0; // L: 108
		this.modelZoom = 100; // L: 109
		this.field3785 = 0; // L: 110
		this.field3758 = 0; // L: 111
		this.modelOrthog = false; // L: 113
		this.modelTransparency = false; // L: 114
		this.itemQuantityMode = 2; // L: 115
		this.fontId = -1; // L: 116
		this.text = ""; // L: 117
		this.field3752 = ""; // L: 118
		this.textLineHeight = 0; // L: 119
		this.textXAlignment = 0; // L: 120
		this.textYAlignment = 0; // L: 121
		this.textShadowed = false; // L: 122
		this.field3783 = -1; // L: 124
		this.flags = 0; // L: 129
		this.field3776 = false; // L: 130
		this.dataText = ""; // L: 139
		this.parent = null; // L: 141
		this.dragZoneSize = 0; // L: 142
		this.dragThreshold = 0; // L: 143
		this.isScrollBar = false; // L: 144
		this.spellActionName = ""; // L: 145
		this.hasListener = false; // L: 146
		this.mouseOverRedirect = -1; // L: 187
		this.field3830 = ""; // L: 188
		this.field3831 = "Ok"; // L: 189
		this.itemId = -1; // L: 192
		this.itemQuantity = 0; // L: 193
		this.modelFrame = 0; // L: 194
		this.modelFrameCycle = 0; // L: 195
		this.field3722 = false; // L: 197
		this.field3840 = false; // L: 198
		this.field3836 = -1; // L: 199
		this.field3842 = 0; // L: 200
		this.field3843 = 0; // L: 201
		this.field3844 = 0; // L: 202
		this.rootIndex = -1; // L: 203
		this.cycle = -1; // L: 204
		this.noClickThrough = false; // L: 206
		this.noScrollThrough = false; // L: 207
		this.prioritizeMenuEntry = false; // L: 208
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-1632762794"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 211
		this.type = var1.readUnsignedByte(); // L: 212
		this.buttonType = var1.readUnsignedByte(); // L: 213
		this.contentType = var1.readUnsignedShort(); // L: 214
		this.rawX = var1.readShort(); // L: 215
		this.rawY = var1.readShort(); // L: 216
		this.rawWidth = var1.readUnsignedShort(); // L: 217
		this.rawHeight = var1.readUnsignedShort(); // L: 218
		this.transparencyTop = var1.readUnsignedByte(); // L: 219
		this.parentId = var1.readUnsignedShort(); // L: 220
		if (this.parentId == 65535) { // L: 221
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 222
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 223
		if (this.mouseOverRedirect == 65535) { // L: 224
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 225
		int var3;
		if (var2 > 0) { // L: 226
			this.cs1Comparisons = new int[var2]; // L: 227
			this.cs1ComparisonValues = new int[var2]; // L: 228

			for (var3 = 0; var3 < var2; ++var3) { // L: 229
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 230
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 231
			}
		}

		var3 = var1.readUnsignedByte(); // L: 234
		int var4;
		if (var3 > 0) { // L: 235
			this.cs1Instructions = new int[var3][]; // L: 236

			for (var4 = 0; var4 < var3; ++var4) { // L: 237
				int var5 = var1.readUnsignedShort(); // L: 238
				this.cs1Instructions[var4] = new int[var5]; // L: 239

				for (int var6 = 0; var6 < var5; ++var6) { // L: 240
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 241
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 242
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 246
			this.scrollHeight = var1.readUnsignedShort(); // L: 247
			this.isHidden = var1.readUnsignedByte() == 1; // L: 248
		}

		if (this.type == 1) { // L: 250
			var1.readUnsignedShort(); // L: 251
			var1.readUnsignedByte(); // L: 252
		}

		if (this.type == 3) { // L: 254
			this.fill = var1.readUnsignedByte() == 1; // L: 255
		}

		if (this.type == 4 || this.type == 1) { // L: 257
			this.textXAlignment = var1.readUnsignedByte(); // L: 258
			this.textYAlignment = var1.readUnsignedByte(); // L: 259
			this.textLineHeight = var1.readUnsignedByte(); // L: 260
			this.fontId = var1.readUnsignedShort(); // L: 261
			if (this.fontId == 65535) { // L: 262
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 263
		}

		if (this.type == 4) { // L: 265
			this.text = var1.readStringCp1252NullTerminated(); // L: 266
			this.field3752 = var1.readStringCp1252NullTerminated(); // L: 267
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 269
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 270
			this.color2 = var1.readInt(); // L: 271
			this.field3778 = var1.readInt(); // L: 272
			this.field3729 = var1.readInt(); // L: 273
		}

		if (this.type == 5) { // L: 275
			this.spriteId2 = var1.readInt(); // L: 276
			this.spriteId = var1.readInt(); // L: 277
		}

		if (this.type == 6) { // L: 279
			this.modelType = 1; // L: 280
			this.modelId = var1.readUnsignedShort(); // L: 281
			if (this.modelId == 65535) { // L: 282
				this.modelId = -1;
			}

			this.field3747 = 1; // L: 283
			this.field3812 = var1.readUnsignedShort(); // L: 284
			if (this.field3812 == 65535) { // L: 285
				this.field3812 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 286
			if (this.sequenceId == 65535) { // L: 287
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 288
			if (this.sequenceId2 == 65535) { // L: 289
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 290
			this.modelAngleX = var1.readUnsignedShort(); // L: 291
			this.modelAngleY = var1.readUnsignedShort(); // L: 292
		}

		if (this.type == 8) { // L: 294
			this.text = var1.readStringCp1252NullTerminated(); // L: 295
		}

		if (this.buttonType == 2) { // L: 297
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 298
			this.field3830 = var1.readStringCp1252NullTerminated(); // L: 299
			var4 = var1.readUnsignedShort() & 63; // L: 300
			this.flags |= var4 << 11; // L: 301
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 303
			this.field3831 = var1.readStringCp1252NullTerminated(); // L: 304
			if (this.field3831.length() == 0) { // L: 305
				if (this.buttonType == 1) { // L: 306
					this.field3831 = "Ok";
				}

				if (this.buttonType == 4) { // L: 307
					this.field3831 = "Select";
				}

				if (this.buttonType == 5) { // L: 308
					this.field3831 = "Select";
				}

				if (this.buttonType == 6) { // L: 309
					this.field3831 = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 312
			this.flags |= 4194304; // L: 313
		}

		if (this.buttonType == 6) { // L: 315
			this.flags |= 1; // L: 316
		}

	} // L: 318

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luk;B)V",
		garbageValue = "45"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 321
		this.isIf3 = true; // L: 322
		this.type = var1.readUnsignedByte(); // L: 323
		this.contentType = var1.readUnsignedShort(); // L: 324
		this.rawX = var1.readShort(); // L: 325
		this.rawY = var1.readShort(); // L: 326
		this.rawWidth = var1.readUnsignedShort(); // L: 327
		if (this.type == 9) { // L: 328
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 329
		}

		this.widthAlignment = var1.readByte(); // L: 330
		this.heightAlignment = var1.readByte(); // L: 331
		this.xAlignment = var1.readByte(); // L: 332
		this.yAlignment = var1.readByte(); // L: 333
		this.parentId = var1.readUnsignedShort(); // L: 334
		if (this.parentId == 65535) { // L: 335
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 336
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 337
		if (this.type == 0) { // L: 338
			this.scrollWidth = var1.readUnsignedShort(); // L: 339
			this.scrollHeight = var1.readUnsignedShort(); // L: 340
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 341
		}

		if (this.type == 5) { // L: 343
			this.spriteId2 = var1.readInt(); // L: 344
			this.spriteAngle = var1.readUnsignedShort(); // L: 345
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 346
			this.transparencyTop = var1.readUnsignedByte(); // L: 347
			this.outline = var1.readUnsignedByte(); // L: 348
			this.spriteShadow = var1.readInt(); // L: 349
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 350
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 351
		}

		if (this.type == 6) { // L: 353
			this.modelType = 1; // L: 354
			this.modelId = var1.readUnsignedShort(); // L: 355
			if (this.modelId == 65535) { // L: 356
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 357
			this.modelOffsetY = var1.readShort(); // L: 358
			this.modelAngleX = var1.readUnsignedShort(); // L: 359
			this.modelAngleY = var1.readUnsignedShort(); // L: 360
			this.modelAngleZ = var1.readUnsignedShort(); // L: 361
			this.modelZoom = var1.readUnsignedShort(); // L: 362
			this.sequenceId = var1.readUnsignedShort(); // L: 363
			if (this.sequenceId == 65535) { // L: 364
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 365
			var1.readUnsignedShort(); // L: 366
			if (this.widthAlignment != 0) { // L: 367
				this.field3785 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 368
				var1.readUnsignedShort(); // L: 369
			}
		}

		if (this.type == 4) { // L: 372
			this.fontId = var1.readUnsignedShort(); // L: 373
			if (this.fontId == 65535) { // L: 374
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 375
			this.textLineHeight = var1.readUnsignedByte(); // L: 376
			this.textXAlignment = var1.readUnsignedByte(); // L: 377
			this.textYAlignment = var1.readUnsignedByte(); // L: 378
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 379
			this.color = var1.readInt(); // L: 380
		}

		if (this.type == 3) { // L: 382
			this.color = var1.readInt(); // L: 383
			this.fill = var1.readUnsignedByte() == 1; // L: 384
			this.transparencyTop = var1.readUnsignedByte(); // L: 385
		}

		if (this.type == 9) { // L: 387
			this.lineWid = var1.readUnsignedByte(); // L: 388
			this.color = var1.readInt(); // L: 389
			this.field3735 = var1.readUnsignedByte() == 1; // L: 390
		}

		this.flags = var1.readMedium(); // L: 392
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 393
		int var2 = var1.readUnsignedByte(); // L: 394
		if (var2 > 0) { // L: 395
			this.actions = new String[var2]; // L: 396

			for (int var3 = 0; var3 < var2; ++var3) { // L: 397
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 399
		this.dragThreshold = var1.readUnsignedByte(); // L: 400
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 401
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 402
		this.onLoad = this.readListener(var1); // L: 403
		this.onMouseOver = this.readListener(var1); // L: 404
		this.onMouseLeave = this.readListener(var1); // L: 405
		this.onTargetLeave = this.readListener(var1); // L: 406
		this.onTargetEnter = this.readListener(var1); // L: 407
		this.onVarTransmit = this.readListener(var1); // L: 408
		this.onInvTransmit = this.readListener(var1); // L: 409
		this.onStatTransmit = this.readListener(var1); // L: 410
		this.onTimer = this.readListener(var1); // L: 411
		this.onOp = this.readListener(var1); // L: 412
		this.onMouseRepeat = this.readListener(var1); // L: 413
		this.onClick = this.readListener(var1); // L: 414
		this.onClickRepeat = this.readListener(var1); // L: 415
		this.onRelease = this.readListener(var1); // L: 416
		this.onHold = this.readListener(var1); // L: 417
		this.onDrag = this.readListener(var1); // L: 418
		this.onDragComplete = this.readListener(var1); // L: 419
		this.onScroll = this.readListener(var1); // L: 420
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 421
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 422
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 423
	} // L: 424

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;B)V",
		garbageValue = "1"
	)
	void method6690(Buffer var1) {
		this.field3702 = var1.readStringCp1252NullTerminated(); // L: 427
	} // L: 428

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)[Ljava/lang/Object;",
		garbageValue = "-990286319"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 431
		if (var2 == 0) { // L: 432
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 433

			for (int var4 = 0; var4 < var2; ++var4) { // L: 434
				int var5 = var1.readUnsignedByte(); // L: 435
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 436
				} else if (var5 == 1) { // L: 437
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 439
			return var3; // L: 440
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)[I",
		garbageValue = "1742666760"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 444
		if (var2 == 0) { // L: 445
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 446

			for (int var4 = 0; var4 < var2; ++var4) { // L: 447
				var3[var4] = var1.readInt(); // L: 448
			}

			return var3; // L: 450
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lnp;ZLeg;I)Luc;",
		garbageValue = "1917347799"
	)
	public SpritePixels method6693(class338 var1, boolean var2, UrlRequester var3) {
		field3698 = false; // L: 454
		if (this.field3728 != null) { // L: 455
			SpritePixels var4 = this.method6694(var1, var3); // L: 456
			if (var4 != null) { // L: 457
				return var4; // L: 458
			}
		}

		int var8;
		if (var2) { // L: 462
			var8 = this.spriteId;
		} else {
			var8 = this.spriteId2; // L: 463
		}

		if (var8 == -1) { // L: 464
			return null;
		} else {
			long var5 = ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var8 + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40); // L: 465
			SpritePixels var7 = (SpritePixels)var1.field3612.get(var5); // L: 466
			if (var7 != null) { // L: 467
				return var7;
			} else {
				var7 = class135.SpriteBuffer_getSprite(var1.field3608, var8, 0); // L: 468
				if (var7 == null) { // L: 469
					field3698 = true; // L: 470
					return null; // L: 471
				} else {
					this.method6697(var7); // L: 473
					var1.field3612.put(var7, var5); // L: 474
					return var7; // L: 475
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnp;Leg;S)Luc;",
		garbageValue = "-5190"
	)
	SpritePixels method6694(class338 var1, UrlRequester var2) {
		if (!this.method6696()) { // L: 479
			return this.method6701(var1, var2); // L: 480
		} else {
			String var3 = this.field3728 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 482
			SpritePixels var4 = (SpritePixels)var1.field3605.method8139(var3); // L: 483
			if (var4 == null) { // L: 484
				SpritePixels var5 = this.method6701(var1, var2); // L: 485
				if (var5 != null) { // L: 486
					var4 = var5.method9909(); // L: 487
					this.method6697(var4); // L: 488
					var1.field3605.method8146(var3, var4); // L: 489
				}
			}

			return var4; // L: 492
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lnp;Leg;I)Luc;",
		garbageValue = "1106730958"
	)
	SpritePixels method6701(class338 var1, UrlRequester var2) {
		if (this.field3728 != null && var2 != null) { // L: 496
			class341 var3 = (class341)var1.field3615.method8139(this.field3728); // L: 497
			if (var3 == null) { // L: 498
				var3 = new class341(this.field3728, var2); // L: 499
				var1.field3615.method8146(this.field3728, var3); // L: 500
			}

			return var3.method6364(); // L: 502
		} else {
			return null; // L: 504
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "106"
	)
	boolean method6696() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 508
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Luc;I)V",
		garbageValue = "920760629"
	)
	void method6697(SpritePixels var1) {
		if (this.spriteFlipV) { // L: 512
			var1.flipVertically();
		}

		if (this.spriteFlipH) { // L: 513
			var1.flipHorizontally();
		}

		if (this.outline > 0) { // L: 514
			var1.pad(this.outline);
		}

		if (this.outline >= 1) { // L: 515
			var1.outline(1);
		}

		if (this.outline >= 2) { // L: 516
			var1.outline(16777215);
		}

		if (this.spriteShadow != 0) { // L: 517
			var1.shadow(this.spriteShadow);
		}

	} // L: 518

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I)Lpv;",
		garbageValue = "-1316022754"
	)
	public Font method6698(class338 var1) {
		field3698 = false; // L: 521
		if (this.fontId == -1) { // L: 522
			return null;
		} else {
			Font var2 = (Font)var1.field3614.get((long)this.fontId); // L: 523
			if (var2 != null) { // L: 524
				return var2;
			} else {
				AbstractArchive var4 = var1.field3608; // L: 526
				AbstractArchive var5 = var1.field3613; // L: 527
				int var6 = this.fontId; // L: 528
				Font var3;
				if (!Varcs.method2829(var4, var6, 0)) { // L: 530
					var3 = null; // L: 531
				} else {
					var3 = class72.method2147(var5.takeFile(var6, 0)); // L: 534
				}

				if (var3 != null) { // L: 537
					var1.field3614.put(var3, (long)this.fontId);
				} else {
					field3698 = true; // L: 538
				}

				return var3; // L: 539
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnp;Lhl;IZLnz;Lho;Lhb;B)Lko;",
		garbageValue = "-51"
	)
	public Model method6699(class338 var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, class187 var7) {
		field3698 = false; // L: 543
		int var8;
		int var9;
		if (var4) { // L: 546
			var8 = this.field3747; // L: 547
			var9 = this.field3812; // L: 548
		} else {
			var8 = this.modelType; // L: 551
			var9 = this.modelId; // L: 552
		}

		if (var8 == 6) { // L: 554
			if (var6 == null) { // L: 555
				return null;
			}

			var9 = var6.id; // L: 556
		}

		if (var8 == 0) { // L: 558
			return null;
		} else if (var8 == 1 && var9 == -1) { // L: 559
			return null;
		} else {
			if (var7 != null && var7.field1942 && var8 == 6) { // L: 560
				var8 = 3; // L: 561
			}

			long var10 = (long)(var9 + (var8 << 16)); // L: 563
			if (var7 != null) { // L: 564
				var10 |= var7.field1943 << 20;
			}

			Model var12 = (Model)var1.field3606.get(var10); // L: 565
			if (var12 == null) { // L: 566
				ModelData var13 = null; // L: 567
				int var14 = 64; // L: 568
				int var15 = 768; // L: 569
				switch(var8) { // L: 570
				case 1:
					var13 = ModelData.ModelData_get(var1.field3607, var9, 0); // L: 584
					break; // L: 585
				case 2:
					var13 = Script.getNpcDefinition(var9).method3720((class187)null); // L: 581
					break; // L: 582
				case 3:
					var13 = var5 != null ? var5.getModelData() : null; // L: 587
					break;
				case 4:
					ItemComposition var16 = class341.ItemComposition_get(var9); // L: 572
					var13 = var16.getModelData(10); // L: 573
					var14 += var16.field2193; // L: 574
					var15 += var16.field2194; // L: 575
				case 5:
				default:
					break;
				case 6:
					var13 = Script.getNpcDefinition(var9).method3720(var7); // L: 578
				}

				if (var13 == null) { // L: 590
					field3698 = true; // L: 591
					return null; // L: 592
				}

				var12 = var13.toModel(var14, var15, -50, -10, -50); // L: 594
				var1.field3606.put(var12, var10); // L: 595
			}

			if (var2 != null) { // L: 597
				var12 = var2.transformWidgetModel(var12, var3); // L: 598
			}

			return var12; // L: 600
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lnp;ZI)Lmq;",
		garbageValue = "-263902179"
	)
	public SpriteMask method6745(class338 var1, boolean var2) {
		if (this.spriteId == -1) { // L: 604
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2; // L: 605
		if (var3 == -1) { // L: 606
			return null;
		} else {
			long var4 = ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var3 + ((long)this.outline << 36) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40); // L: 607
			SpriteMask var6 = (SpriteMask)var1.field3609.get(var4); // L: 608
			if (var6 != null) { // L: 609
				return var6;
			} else {
				SpritePixels var7 = this.method6693(var1, var2, (UrlRequester)null); // L: 610
				if (var7 == null) { // L: 611
					return null;
				} else {
					SpritePixels var8 = var7.copyNormalized(); // L: 612
					int[] var9 = new int[var8.subHeight]; // L: 613
					int[] var10 = new int[var8.subHeight]; // L: 614

					for (int var11 = 0; var11 < var8.subHeight; ++var11) { // L: 615
						int var12 = 0; // L: 616
						int var13 = var8.subWidth; // L: 617

						int var14;
						for (var14 = 0; var14 < var8.subWidth; ++var14) { // L: 618
							if (var8.pixels[var14 + var11 * var8.subWidth] == 0) { // L: 619
								var12 = var14; // L: 620
								break;
							}
						}

						for (var14 = var8.subWidth - 1; var14 >= var12; --var14) { // L: 624
							if (var8.pixels[var14 + var11 * var8.subWidth] == 0) { // L: 625
								var13 = var14 + 1; // L: 626
								break;
							}
						}

						var9[var11] = var12; // L: 630
						var10[var11] = var13 - var12; // L: 631
					}

					var6 = new SpriteMask(var8.subWidth, var8.subHeight, var10, var9, var3); // L: 633
					var1.field3609.put(var6, var4); // L: 634
					return var6; // L: 635
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "943412361"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 639
			String[] var3 = new String[var1 + 1]; // L: 640
			if (this.actions != null) { // L: 641
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 642
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 644
		}

		this.actions[var1] = var2; // L: 646
	} // L: 647

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "31893701"
	)
	public boolean method6702() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12; // L: 650
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1517972429"
	)
	public boolean method6703() {
		return this.type == 11 || this.type == 12; // L: 654
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Leg;J)V"
	)
	public void method6704(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && -1L != var4) { // L: 658
			var1 = var1.replaceAll("%userid%", Long.toString(var4)); // L: 659
			this.field3770 = new class208(); // L: 660
			if (!this.field3770.method4143(var1, var2, var3)) { // L: 661
				this.field3770 = null; // L: 662
			} else {
				if (this.field3772 == null || this.field3828 == null) { // L: 665
					this.method6707(); // L: 666
				}

			}
		}
	} // L: 663 668

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leg;I)V",
		garbageValue = "1917494373"
	)
	public void method6705(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field3770 = new class208(); // L: 671
		if (!this.field3770.method4143(var1, var3, var6)) { // L: 672
			this.field3770 = null; // L: 673
		} else {
			if (this.field3772 == null || this.field3828 == null) { // L: 676
				this.method6707(); // L: 677
			}

			this.field3770.method4144(var2, var4, var5); // L: 679
		}
	} // L: 674 680

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Leg;I)V",
		garbageValue = "455902971"
	)
	public void method6768(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) { // L: 683
			this.field3770 = new class208(); // L: 684
			this.field3770.method4191(var1, var2); // L: 685
		}
	} // L: 686

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1103364209"
	)
	void method6707() {
		this.field3772 = new HashMap(); // L: 689
		this.field3828 = new HashMap(); // L: 690
	} // L: 691

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "28"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		if (this.type == 11) { // L: 694
			if (this.field3772 == null) { // L: 695
				this.method6707();
			}

			this.field3772.put(var1, var2); // L: 696
		}
	} // L: 697

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "-60"
	)
	public void method6709(String var1, int var2) {
		if (this.type == 11) { // L: 700
			if (this.field3828 == null) { // L: 701
				this.method6707();
			}

			this.field3828.put(var1, var2); // L: 702
		}
	} // L: 703

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-446372013"
	)
	public boolean method6824(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3770 != null && this.method6762()) { // L: 706
			var1 -= var3; // L: 707
			var2 -= var4; // L: 708
			int var5 = (int)(this.field3770.method4153()[0] * (float)this.width); // L: 709
			int var6 = (int)(this.field3770.method4153()[1] * (float)this.height); // L: 710
			int var7 = var5 + (int)(this.field3770.method4153()[2] * (float)this.width); // L: 711
			int var8 = var6 + (int)(this.field3770.method4153()[3] * (float)this.height); // L: 712
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8; // L: 713
		} else {
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-62"
	)
	public boolean method6762() {
		return this.field3783 == 2; // L: 717
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-20"
	)
	public int method6712(String var1) {
		return this.type == 11 && this.field3770 != null && this.method6762() ? this.field3770.method4147(var1) : -1; // L: 721 722 724
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1808785293"
	)
	public String method6806(String var1) {
		return this.type == 11 && this.field3770 != null && this.method6762() ? this.field3770.method4184(var1) : null; // L: 728 729
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "779262746"
	)
	public int method6714() {
		return this.field3828 != null && this.field3828.size() > 0 ? 1 : 0; // L: 733
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1304852713"
	)
	public int method6715() {
		if (this.type == 11 && this.field3770 != null && this.field3828 != null && !this.field3828.isEmpty()) { // L: 737
			String var1 = this.field3770.method4141(); // L: 738
			return var1 != null && this.field3828.containsKey(this.field3770.method4141()) ? (Integer)this.field3828.get(var1) : -1; // L: 739 740 742
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "3"
	)
	public String method6688() {
		if (this.type == 11 && this.field3770 != null) { // L: 746
			String var1 = this.field3770.method4141(); // L: 747
			Iterator var2 = this.field3770.method4151().iterator(); // L: 748

			while (var2.hasNext()) {
				class222 var3 = (class222)var2.next(); // L: 749
				String var4 = String.format("%%%S%%", var3.method4376()); // L: 751
				if (var3.vmethod4368() == 0) { // L: 752
					var1.replaceAll(var4, Integer.toString(var3.vmethod4370())); // L: 753
				} else {
					var1.replaceAll(var4, var3.vmethod4369()); // L: 756
				}
			}

			return var1; // L: 760
		} else {
			return null; // L: 759
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "1"
	)
	public int[] method6717() {
		if (this.type == 11 && this.field3770 != null) { // L: 764
			int[] var1 = new int[3]; // L: 765
			int var2 = 0; // L: 766
			Iterator var3 = this.field3770.method4151().iterator(); // L: 767

			while (var3.hasNext()) {
				class222 var4 = (class222)var3.next(); // L: 768
				if (!var4.method4376().equals("user_id")) { // L: 770
					if (var4.vmethod4368() != 0) { // L: 771
						return null; // L: 778
					}

					var1[var2++] = var4.vmethod4370(); // L: 772
					if (var2 > 3) { // L: 773
						return null; // L: 774
					}
				}
			}

			return var1; // L: 783
		} else {
			return null;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Lim;",
		garbageValue = "-1981549192"
	)
	public class208 method6718() {
		return this.field3770; // L: 787
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lnp;Leg;B)Z",
		garbageValue = "-47"
	)
	public boolean method6719(class338 var1, UrlRequester var2) {
		if (this.type == 11 && this.field3770 != null) { // L: 791
			this.field3770.method4145(var2); // L: 792
			if (this.field3770.method4146() != this.field3783) { // L: 793
				this.field3783 = this.field3770.method4146(); // L: 794
				if (this.field3783 >= 3) { // L: 795
					return true; // L: 796
				}

				if (this.field3783 == 2) { // L: 798
					this.method6720(var1); // L: 799
					return true; // L: 800
				}
			}

			return false; // L: 803
		} else {
			return false;
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lnp;B)V",
		garbageValue = "-69"
	)
	void method6720(class338 var1) {
		this.noClickThrough = true; // L: 807
		ArrayList var2 = this.field3770.method4149(); // L: 808
		ArrayList var3 = this.field3770.method4150(); // L: 809
		int var4 = var2.size() + var3.size(); // L: 810
		this.children = new Widget[var4]; // L: 811
		int var5 = 0; // L: 812

		Iterator var6;
		float[] var10;
		Widget var11;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var11) { // L: 813 839
			class209 var7 = (class209)var6.next(); // L: 814
			var10 = var7.field2282; // L: 818
			var11 = new Widget(); // L: 820
			var11.type = 5; // L: 821
			var11.parentId = this.id; // L: 822
			var11.childIndex = var5; // L: 823
			var11.isIf3 = true; // L: 824
			var11.xAlignment = 0; // L: 825
			var11.yAlignment = 0; // L: 826
			var11.widthAlignment = 0; // L: 827
			var11.heightAlignment = 0; // L: 828
			var11.rawX = (int)((float)this.width * var10[0]); // L: 829
			var11.rawY = (int)((float)this.height * var10[1]); // L: 830
			var11.rawWidth = (int)((float)this.width * var10[2]); // L: 831
			var11.rawHeight = (int)((float)this.height * var10[3]); // L: 832
			var11.field3728 = var7.field2284.method2920(); // L: 836
			class341 var12 = new class341(var7.field2284); // L: 837
			var1.field3615.method8146(var11.field3728, var12); // L: 838
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var11) { // L: 842 869
			class220 var13 = (class220)var6.next(); // L: 843
			var10 = var13.field2364; // L: 847
			var11 = new Widget(); // L: 849
			var11.type = 4; // L: 850
			var11.parentId = this.id; // L: 851
			var11.childIndex = var5; // L: 852
			var11.isIf3 = true; // L: 853
			var11.xAlignment = 0; // L: 854
			var11.yAlignment = 0; // L: 855
			var11.widthAlignment = 0; // L: 856
			var11.heightAlignment = 0; // L: 857
			var11.rawX = (int)(var10[0] * (float)this.width); // L: 858
			var11.rawY = (int)(var10[1] * (float)this.height); // L: 859
			var11.rawWidth = (int)((float)this.width * var10[2]); // L: 860
			var11.rawHeight = (int)((float)this.height * var10[3]); // L: 861
			var11.text = var13.field2363; // L: 865
			var11.fontId = (Integer)this.field3772.get(var13.field2368); // L: 866
			var11.textXAlignment = var13.field2369; // L: 867
			var11.textYAlignment = var13.field2366; // L: 868
		}

	} // L: 872

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-5"
	)
	public void method6713() {
		this.field3774 = new class342(); // L: 875

		for (int var1 = 1; var1 <= 12; ++var1) { // L: 876
			this.field3774.field3631.method427(var1, 0); // L: 877
		}

		for (char var2 = 0; var2 < ' '; ++var2) { // L: 879
			this.field3774.field3631.method393(var2, 0); // L: 880
		}

		this.field3774.field3631.method393('\u0080', 0); // L: 882
		this.field3774.field3631.method427(82, 2); // L: 883
		this.field3774.field3631.method427(81, 2); // L: 884
		this.field3774.field3631.method427(86, 2); // L: 885
	} // L: 886

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Lnl;",
		garbageValue = "1036694221"
	)
	public class344 method6700() {
		return this.field3774 != null ? this.field3774.field3635 : null; // L: 889
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Lnr;",
		garbageValue = "-28103544"
	)
	public class339 method6729() {
		return this.field3774 != null ? this.field3774.field3630 : null; // L: 893
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Lbd;",
		garbageValue = "-659193647"
	)
	public class27 method6724() {
		return this.field3774 != null ? this.field3774.field3631 : null; // L: 897
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)Lnm;",
		garbageValue = "1"
	)
	public class342 method6716() {
		return this.field3774; // L: 901
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lnl;B)Z",
		garbageValue = "-1"
	)
	boolean method6723(class344 var1) {
		boolean var2 = false; // L: 905
		if (this.text != null && !this.text.isEmpty()) { // L: 906
			var2 |= var1.method6639(GrandExchangeOfferOwnWorldComparator.method1239(this.text)); // L: 907
			this.text = ""; // L: 908
		}

		if (this.field3752 != null && !this.field3752.isEmpty()) { // L: 910
			var2 |= var1.method6420(GrandExchangeOfferOwnWorldComparator.method1239(this.field3752)); // L: 911
			this.field3752 = ""; // L: 912
		}

		return var2; // L: 914
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I)Z",
		garbageValue = "1901265181"
	)
	public boolean method6727(class338 var1) {
		class344 var2 = this.method6700(); // L: 918
		if (var2 == null) { // L: 919
			return false;
		} else {
			boolean var3 = false; // L: 920
			if (!var2.method6472() && this.fontId != -1) { // L: 921
				int var4 = var2.method6504(); // L: 922
				int var5 = var2.method6474(); // L: 923
				int var6 = var2.method6531(); // L: 924
				int var7 = var2.method6471(); // L: 925
				Font var8 = this.method6698(var1); // L: 926
				if (var8 != null) { // L: 927
					var3 |= var2.method6637(var8); // L: 928
					var3 |= this.method6723(var2); // L: 929
					var3 |= var2.method6426(var4, var5); // L: 930
					var3 |= var2.method6441(var6, var7); // L: 931
				}
			} else if (var2.method6472()) { // L: 934
				var3 |= this.method6723(var2); // L: 935
			}

			var2.method6416(); // L: 937
			return var3; // L: 938
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1027554911"
	)
	public static int method6843(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383; // L: 29
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "323779815"
	)
	static int method6823() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1484
			int var0 = 0; // L: 1485

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1486
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1487
			}

			return var0 * 10000 / Client.field785; // L: 1489
		} else {
			return 10000;
		}
	}
}
