import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
public class class206 implements class29 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	Widget field2278;
	@ObfuscatedName("al")
	boolean field2279;
	@ObfuscatedName("ac")
	boolean field2280;

	public class206() {
		this.field2278 = null; // L: 14
		this.field2279 = false; // L: 15
		this.field2280 = false; // L: 16
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1308084386"
	)
	public boolean vmethod4075(int var1) {
		if (this.field2278 == null) { // L: 55
			return false;
		} else {
			class27 var2 = this.field2278.method6120(); // L: 56
			if (var2 == null) { // L: 57
				return false;
			} else {
				if (var2.method390(var1)) { // L: 58
					switch(var1) { // L: 59
					case 81:
						this.field2280 = true; // L: 61
						break;
					case 82:
						this.field2279 = true; // L: 69
						break;
					default:
						if (this.method4056(var1)) { // L: 64
							class69.invalidateWidget(this.field2278); // L: 65
						}
					}
				}

				return var2.method388(var1); // L: 73
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1404887619"
	)
	public boolean vmethod4086(int var1) {
		switch(var1) { // L: 77
		case 81:
			this.field2280 = false; // L: 82
			return false; // L: 83
		case 82:
			this.field2279 = false;
			return false; // L: 80
		default:
			return false; // L: 85
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-870523457"
	)
	public boolean vmethod4077(char var1) {
		if (this.field2278 == null) { // L: 89
			return false;
		} else if (!ReflectionCheck.method680(var1)) { // L: 90
			return false;
		} else {
			class310 var2 = this.field2278.method6118(); // L: 91
			if (var2 != null && var2.method5873()) { // L: 92
				class27 var3 = this.field2278.method6120(); // L: 93
				if (var3 == null) {
					return false; // L: 94
				} else {
					if (var3.method391(var1) && var2.method5834(var1)) { // L: 95 96
						class69.invalidateWidget(this.field2278); // L: 97
					}

					return var3.method389(var1); // L: 100
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "104"
	)
	public boolean vmethod4100(boolean var1) {
		return false; // L: 104
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lmy;I)V",
		garbageValue = "1854257051"
	)
	public void method4049(Widget var1) {
		this.method4070(); // L: 19
		if (var1 != null) { // L: 20
			this.field2278 = var1; // L: 21
			class308 var2 = var1.method6163(); // L: 22
			if (var2 != null) { // L: 23
				var2.field3458.method5891(true); // L: 24
				if (var2.field3454 != null) { // L: 25
					ScriptEvent var3 = new ScriptEvent(); // L: 26
					var3.method2260(var1); // L: 27
					var3.setArgs(var2.field3454); // L: 28
					class144.method3139().addFirst(var3); // L: 29
				}
			}
		}

	} // L: 33

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lmy;",
		garbageValue = "2048848843"
	)
	public Widget method4050() {
		return this.field2278; // L: 36
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-64"
	)
	public void method4070() {
		if (this.field2278 != null) {
			class308 var1 = this.field2278.method6163(); // L: 41
			Widget var2 = this.field2278; // L: 42
			this.field2278 = null; // L: 43
			if (var1 != null) { // L: 44
				var1.field3458.method5891(false); // L: 45
				if (var1.field3454 != null) { // L: 46
					ScriptEvent var3 = new ScriptEvent(); // L: 47
					var3.method2260(var2); // L: 48
					var3.setArgs(var1.field3454); // L: 49
					class144.method3139().addFirst(var3); // L: 50
				}

			}
		}
	} // L: 52

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1710398450"
	)
	boolean method4056(int var1) {
		if (this.field2278 == null) { // L: 108
			return false;
		} else {
			class310 var2 = this.field2278.method6118(); // L: 109
			if (var2 != null && var2.method5873()) { // L: 110
				Clipboard var5;
				switch(var1) { // L: 111
				case 13:
					this.method4070(); // L: 246
					return true; // L: 247
				case 48:
					if (this.field2279) { // L: 165
						var2.method5840(); // L: 166
					}

					return true; // L: 168
				case 65:
					if (this.field2279) { // L: 188
						var5 = class392.client.method482(); // L: 192
						var2.method6056(var5); // L: 194
					}

					return true; // L: 196
				case 66:
					if (this.field2279) { // L: 170
						var5 = class392.client.method482(); // L: 174
						var2.method5858(var5); // L: 176
					}

					return true; // L: 178
				case 67:
					if (this.field2279) { // L: 155
						var5 = class392.client.method482(); // L: 159
						var2.method5860(var5); // L: 161
					}

					return true; // L: 163
				case 84:
					if (var2.method5879() == 0) { // L: 113
						var2.method5834(10); // L: 114
					} else if (this.field2280 && var2.method5893()) { // L: 117
						var2.method5834(10); // L: 118
					} else {
						class308 var3 = this.field2278.method6163(); // L: 121
						ScriptEvent var4 = new ScriptEvent(); // L: 122
						var4.method2260(this.field2278); // L: 123
						var4.setArgs(var3.field3453); // L: 124
						class144.method3139().addFirst(var4); // L: 125
						this.method4070(); // L: 126
					}

					return true; // L: 129
				case 85:
					if (this.field2279) { // L: 206
						var2.method5837(); // L: 207
					} else {
						var2.method5835(); // L: 210
					}

					return true; // L: 212
				case 96:
					if (this.field2279) { // L: 131
						var2.method5848(this.field2280); // L: 132
					} else {
						var2.method5846(this.field2280); // L: 135
					}

					return true; // L: 137
				case 97:
					if (this.field2279) { // L: 230
						var2.method5948(this.field2280); // L: 231
					} else {
						var2.method5847(this.field2280); // L: 234
					}

					return true; // L: 236
				case 98:
					if (this.field2279) { // L: 180
						var2.method5861(); // L: 181
					} else {
						var2.method5823(this.field2280); // L: 184
					}

					return true; // L: 186
				case 99:
					if (this.field2279) { // L: 147
						var2.method5859(); // L: 148
					} else {
						var2.method5954(this.field2280); // L: 151
					}

					return true; // L: 153
				case 101:
					if (this.field2279) { // L: 198
						var2.method5869(); // L: 199
					} else {
						var2.method5836(); // L: 202
					}

					return true; // L: 204
				case 102:
					if (this.field2279) { // L: 214
						var2.method5897(this.field2280); // L: 215
					} else {
						var2.method5978(this.field2280); // L: 218
					}

					return true; // L: 220
				case 103:
					if (this.field2279) { // L: 238
						var2.method5845(this.field2280); // L: 239
					} else {
						var2.method6047(this.field2280); // L: 242
					}

					return true; // L: 244
				case 104:
					if (this.field2279) { // L: 222
						var2.method6012(this.field2280); // L: 223
					} else {
						var2.method5877(this.field2280); // L: 226
					}

					return true; // L: 228
				case 105:
					if (this.field2279) { // L: 139
						var2.method5855(this.field2280); // L: 140
					} else {
						var2.method5914(this.field2280); // L: 143
					}

					return true; // L: 145
				default:
					return false; // L: 249
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "2"
	)
	public static int method4069(int var0) {
		return class291.field3311[var0]; // L: 40
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-687831939"
	)
	static void method4067() {
		ItemContainer.itemContainers = new NodeHashTable(32); // L: 78
	} // L: 79
}
