import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lh")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1839842789
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -725951589010215611L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("v")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("c")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lqr;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated(); // L: 111
		this.previousOfferName = var1.readStringCp1252NullTerminated(); // L: 112
		this.world = var1.readUnsignedShort(); // L: 113
		this.age = var1.readLong(); // L: 114
		int var4 = var1.readInt(); // L: 115
		int var5 = var1.readInt(); // L: 116
		this.grandExchangeOffer = new GrandExchangeOffer(); // L: 117
		this.grandExchangeOffer.method5936(2); // L: 118
		this.grandExchangeOffer.method5943(var2); // L: 119
		this.grandExchangeOffer.unitPrice = var4; // L: 120
		this.grandExchangeOffer.totalQuantity = var5; // L: 121
		this.grandExchangeOffer.currentQuantity = 0; // L: 122
		this.grandExchangeOffer.currentPrice = 0; // L: 123
		this.grandExchangeOffer.id = var3; // L: 124
	} // L: 125

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "8"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName; // L: 128
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2011000420"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName; // L: 132
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-1016408380"
	)
	static int method5931(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget; // L: 1141
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1142
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1143
			return 1; // L: 1144
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1146
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1147
			return 1; // L: 1148
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1150
			Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3.text; // L: 1151
			return 1; // L: 1152
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1154
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1155
			return 1; // L: 1156
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1158
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1159
			return 1; // L: 1160
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1162
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1163
			return 1; // L: 1164
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1166
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1167
			return 1; // L: 1168
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1170
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1171
			return 1; // L: 1172
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1174
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1175
			return 1; // L: 1176
		} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1178
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1179
			return 1; // L: 1180
		} else if (var0 == 1610) { // L: 1182
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1183
			return 1; // L: 1184
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1186
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.color; // L: 1187
			return 1; // L: 1188
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1190
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.color2; // L: 1191
			return 1; // L: 1192
		} else if (var0 == 1613) { // L: 1194
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1195
			return 1; // L: 1196
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1198
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1199
			return 1; // L: 1200
		} else if (var0 != 1615 && var0 != 1616) { // L: 1202
			return 2; // L: 1206
		} else {
			++Nameable.Interpreter_intStackSize; // L: 1203
			return 1; // L: 1204
		}
	}
}
