import java.awt.datatransfer.Clipboard;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class224 implements class29 {
	@ObfuscatedName("ik")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	Widget field2364;
	@ObfuscatedName("al")
	boolean field2360;
	@ObfuscatedName("ak")
	boolean field2362;

	public class224() {
		this.field2364 = null; // L: 14
		this.field2360 = false; // L: 15
		this.field2362 = false; // L: 16
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1448724719"
	)
	public boolean vmethod4264(int var1) {
		if (this.field2364 == null) { // L: 55
			return false;
		} else {
			class27 var2 = this.field2364.method6591(); // L: 56
			if (var2 == null) { // L: 57
				return false;
			} else {
				if (var2.method387(var1)) { // L: 58
					switch(var1) { // L: 59
					case 81:
						this.field2362 = true; // L: 61
						break;
					case 82:
						this.field2360 = true; // L: 64
						break; // L: 65
					default:
						if (this.method4222(var1)) { // L: 67
							ClanChannelMember.invalidateWidget(this.field2364); // L: 68
						}
					}
				}

				return var2.method376(var1); // L: 73
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-974805318"
	)
	public boolean vmethod4251(int var1) {
		switch(var1) { // L: 77
		case 81:
			this.field2362 = false;
			return false;
		case 82:
			this.field2360 = false; // L: 79
			return false; // L: 80
		default:
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "19"
	)
	public boolean vmethod4275(char var1) {
		if (this.field2364 == null) {
			return false;
		} else {
			boolean var2;
			if ((var1 < ' ' || var1 >= 127) && (var1 <= 127 || var1 >= 160) && (var1 <= 160 || var1 > 255)) {
				label89: {
					if (var1 != 0) {
						char[] var3 = class399.cp1252AsciiExtension;

						for (int var4 = 0; var4 < var3.length; ++var4) {
							char var5 = var3[var4];
							if (var5 == var1) {
								var2 = true; // L: 103
								break label89;
							}
						}
					}

					var2 = false;
				}
			} else {
				var2 = true;
			}

			if (!var2) {
				return false;
			} else {
				class344 var7 = this.field2364.method6614();
				if (var7 != null && var7.method6360()) {
					class27 var6 = this.field2364.method6591();
					if (var6 == null) {
						return false;
					} else {
						if (var6.method379(var1) && var7.method6333(var1)) { // L: 118
							ClanChannelMember.invalidateWidget(this.field2364);
						}

						return var6.method377(var1); // L: 122
					}
				} else {
					return false;
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-672025946"
	)
	public boolean vmethod4254(boolean var1) {
		return false; // L: 126
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)V",
		garbageValue = "-782706277"
	)
	public void method4216(Widget var1) {
		this.method4232(); // L: 19
		if (var1 != null) { // L: 20
			this.field2364 = var1; // L: 21
			class342 var2 = var1.method6617(); // L: 22
			if (var2 != null) { // L: 23
				var2.field3606.method6304(true); // L: 24
				if (var2.field3608 != null) { // L: 25
					ScriptEvent var3 = new ScriptEvent(); // L: 26
					var3.method2317(var1); // L: 27
					var3.setArgs(var2.field3608); // L: 28
					class7.method58().addFirst(var3); // L: 29
				}
			}
		}

	} // L: 33

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lnm;",
		garbageValue = "-68"
	)
	public Widget method4217() {
		return this.field2364; // L: 36
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-83"
	)
	public void method4232() {
		if (this.field2364 != null) { // L: 40
			class342 var1 = this.field2364.method6617(); // L: 41
			Widget var2 = this.field2364; // L: 42
			this.field2364 = null; // L: 43
			if (var1 != null) { // L: 44
				var1.field3606.method6304(false); // L: 45
				if (var1.field3608 != null) { // L: 46
					ScriptEvent var3 = new ScriptEvent(); // L: 47
					var3.method2317(var2); // L: 48
					var3.setArgs(var1.field3608); // L: 49
					class7.method58().addFirst(var3); // L: 50
				}

			}
		}
	} // L: 52

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "104826143"
	)
	boolean method4222(int var1) {
		if (this.field2364 == null) { // L: 130
			return false;
		} else {
			class344 var2 = this.field2364.method6614(); // L: 131
			if (var2 != null && var2.method6360()) { // L: 132
				Clipboard var5;
				switch(var1) { // L: 133
				case 13:
					this.method4232(); // L: 255
					return true; // L: 256
				case 48:
					if (this.field2360) { // L: 266
						var2.method6327(); // L: 267
					}

					return true; // L: 269
				case 65:
					if (this.field2360) { // L: 237
						var5 = class159.client.method485(); // L: 241
						var2.method6454(var5); // L: 243
					}

					return true; // L: 245
				case 66:
					if (this.field2360) { // L: 143
						var5 = class159.client.method485(); // L: 147
						var2.method6345(var5); // L: 149
					}

					return true; // L: 151
				case 67:
					if (this.field2360) { // L: 177
						var5 = class159.client.method485(); // L: 181
						var2.method6508(var5); // L: 183
					}

					return true; // L: 185
				case 84:
					if (var2.method6302() == 0) { // L: 219
						var2.method6333(10); // L: 220
					} else if (this.field2362 && var2.method6370()) { // L: 223
						var2.method6333(10); // L: 224
					} else {
						class342 var3 = this.field2364.method6617(); // L: 227
						ScriptEvent var4 = new ScriptEvent(); // L: 228
						var4.method2317(this.field2364); // L: 229
						var4.setArgs(var3.field3610); // L: 230
						class7.method58().addFirst(var4); // L: 231
						this.method4232(); // L: 232
					}

					return true; // L: 235
				case 85:
					if (this.field2360) { // L: 161
						var2.method6479(); // L: 162
					} else {
						var2.method6322(); // L: 165
					}

					return true; // L: 167
				case 96:
					if (this.field2360) { // L: 135
						var2.method6335(this.field2362); // L: 136
					} else {
						var2.method6453(this.field2362); // L: 139
					}

					return true; // L: 141
				case 97:
					if (this.field2360) { // L: 247
						var2.method6336(this.field2362); // L: 248
					} else {
						var2.method6334(this.field2362); // L: 251
					}

					return true; // L: 253
				case 98:
					if (this.field2360) { // L: 187
						var2.method6411(); // L: 188
					} else {
						var2.method6337(this.field2362); // L: 191
					}

					return true; // L: 193
				case 99:
					if (this.field2360) { // L: 169
						var2.method6320(); // L: 170
					} else {
						var2.method6338(this.field2362); // L: 173
					}

					return true; // L: 175
				case 101:
					if (this.field2360) { // L: 195
						var2.method6563(); // L: 196
					} else {
						var2.method6495(); // L: 199
					}

					return true; // L: 201
				case 102:
					if (this.field2360) { // L: 203
						var2.method6331(this.field2362); // L: 204
					} else {
						var2.method6481(this.field2362); // L: 207
					}

					return true; // L: 209
				case 103:
					if (this.field2360) { // L: 211
						var2.method6332(this.field2362); // L: 212
					} else {
						var2.method6330(this.field2362); // L: 215
					}

					return true; // L: 217
				case 104:
					if (this.field2360) { // L: 153
						var2.method6341(this.field2362); // L: 154
					} else {
						var2.method6339(this.field2362); // L: 157
					}

					return true; // L: 159
				case 105:
					if (this.field2360) { // L: 258
						var2.method6342(this.field2362); // L: 259
					} else {
						var2.method6340(this.field2362); // L: 262
					}

					return true; // L: 264
				default:
					return false; // L: 271
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([BI)Lds;",
		garbageValue = "-1039632832"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 81
		Buffer var2 = new Buffer(var0); // L: 82
		var2.offset = var2.array.length - 2; // L: 83
		int var3 = var2.readUnsignedShort(); // L: 84
		int var4 = var2.array.length - 2 - var3 - 12; // L: 85
		var2.offset = var4; // L: 86
		int var5 = var2.readInt(); // L: 87
		var1.localIntCount = var2.readUnsignedShort(); // L: 88
		var1.localStringCount = var2.readUnsignedShort(); // L: 89
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 90
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 91
		int var6 = var2.readUnsignedByte(); // L: 92
		int var7;
		int var8;
		if (var6 > 0) { // L: 93
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 94

			for (var7 = 0; var7 < var6; ++var7) { // L: 95
				var8 = var2.readUnsignedShort(); // L: 96
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? EnumComposition.method3749(var8) : 1); // L: 97
				var1.switches[var7] = var9; // L: 98

				while (var8-- > 0) { // L: 99
					int var10 = var2.readInt(); // L: 100
					int var11 = var2.readInt(); // L: 101
					var9.put(new IntegerNode(var11), (long)var10); // L: 102
				}
			}
		}

		var2.offset = 0; // L: 106
		var1.field1004 = var2.readStringCp1252NullTerminatedOrNull(); // L: 107
		var1.opcodes = new int[var5]; // L: 108
		var1.intOperands = new int[var5]; // L: 109
		var1.stringOperands = new String[var5]; // L: 110

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 111 112 117
			var8 = var2.readUnsignedShort(); // L: 113
			if (var8 == 3) { // L: 114
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 115
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 116
			}
		}

		return var1; // L: 119
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZB)I",
		garbageValue = "120"
	)
	static int method4247(int var0, Script var1, boolean var2) {
		return 2; // L: 5110
	}
}
