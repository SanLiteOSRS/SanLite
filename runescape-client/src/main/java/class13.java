import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("am")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = 1912425323
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 1514947023
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Las;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 292
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions(); // L: 295
		if (var1 == null) { // L: 296
			var1 = new Hashtable(); // L: 297
		}

		byte[] var2 = this.this$1.val$host.getBytes(); // L: 299
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(); // L: 300
		DataOutputStream var4 = new DataOutputStream(var3); // L: 301
		var4.writeShort(var2.length + 3); // L: 302
		var4.writeByte(0); // L: 303
		var4.writeShort(var2.length); // L: 304
		var4.write(var2); // L: 305
		var4.close(); // L: 306
		var1.put(0, var3.toByteArray()); // L: 307
		return var1; // L: 308
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this); // L: 313
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-1355995104"
	)
	static final int method194(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 13
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZB)I",
		garbageValue = "1"
	)
	static int method186(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 4015
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4016
			Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = class141.ItemComposition_get(var3).name; // L: 4017
			return 1; // L: 4018
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 4020
				Interpreter.Interpreter_intStackSize -= 2; // L: 4021
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4022
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4023
				var5 = class141.ItemComposition_get(var3); // L: 4024
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) { // L: 4025
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4026
				}

				return 1; // L: 4027
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 4029
				Interpreter.Interpreter_intStackSize -= 2; // L: 4030
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4031
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4032
				var5 = class141.ItemComposition_get(var3); // L: 4033
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) { // L: 4034
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4035
				}

				return 1; // L: 4036
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 4038
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4039
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class141.ItemComposition_get(var3).price; // L: 4040
				return 1; // L: 4041
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 4043
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4044
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class141.ItemComposition_get(var3).isStackable == 1 ? 1 : 0; // L: 4045
				return 1; // L: 4046
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 4048
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4049
					var4 = class141.ItemComposition_get(var3); // L: 4050
					if (var4.noteTemplate == -1 && var4.note >= 0) { // L: 4051
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4052
					}

					return 1; // L: 4053
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 4055
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4056
					var4 = class141.ItemComposition_get(var3); // L: 4057
					if (var4.noteTemplate >= 0 && var4.note >= 0) { // L: 4058
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4059
					}

					return 1; // L: 4060
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 4062
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4063
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class141.ItemComposition_get(var3).isMembersOnly ? 1 : 0; // L: 4064
					return 1; // L: 4065
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 4067
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4068
					var4 = class141.ItemComposition_get(var3); // L: 4069
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) { // L: 4070
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4071
					}

					return 1; // L: 4072
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 4074
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4075
					var4 = class141.ItemComposition_get(var3); // L: 4076
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) { // L: 4077
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4078
					}

					return 1; // L: 4079
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 4081
					String var7 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 4082
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4083
					FriendLoginUpdate.findItemDefinitions(var7, var6 == 1); // L: 4084
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class260.foundItemIdCount; // L: 4085
					return 1; // L: 4086
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 4088
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 4093
						Client.foundItemIndex = 0; // L: 4094
						return 1; // L: 4095
					} else if (var0 == 4213) { // L: 4097
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4098
						var6 = class141.ItemComposition_get(var3).getShiftClickIndex(); // L: 4099
						if (var6 == -1) { // L: 4100
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 4101
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6 + 1; // L: 4104
						}

						return 1; // L: 4106
					} else if (var0 == 4214) { // L: 4108
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4109
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class141.ItemComposition_get(var3).maleModel; // L: 4110
						return 1; // L: 4111
					} else if (var0 == 4215) { // L: 4113
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4114
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class141.ItemComposition_get(var3).maleModel1; // L: 4115
						return 1; // L: 4116
					} else if (var0 == 4216) { // L: 4118
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4119
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class141.ItemComposition_get(var3).maleModel2; // L: 4120
						return 1; // L: 4121
					} else if (var0 == 4217) { // L: 4123
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4124
						var4 = class141.ItemComposition_get(var3); // L: 4125
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.field2254; // L: 4126
						return 1; // L: 4127
					} else {
						return 2; // L: 4129
					}
				} else {
					if (class291.foundItemIds != null && Client.foundItemIndex < class260.foundItemIdCount) { // L: 4089
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class291.foundItemIds[++Client.foundItemIndex - 1] & '\uffff'; // L: 4090
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 4091
				}
			}
		}
	}
}
