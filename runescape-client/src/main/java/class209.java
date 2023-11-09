import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class209 implements class29 {
	@ObfuscatedName("ur")
	@ObfuscatedGetter(
		intValue = -369722901
	)
	static int field2322;
	@ObfuscatedName("ad")
	public static short[][] field2326;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	Widget field2325;
	@ObfuscatedName("an")
	boolean field2323;
	@ObfuscatedName("av")
	boolean field2324;

	public class209() {
		this.field2325 = null; // L: 14
		this.field2323 = false; // L: 15
		this.field2324 = false; // L: 16
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2106714627"
	)
	public boolean vmethod4127(int var1) {
		if (this.field2325 == null) { // L: 55
			return false;
		} else {
			class27 var2 = this.field2325.method6382(); // L: 56
			if (var2 == null) { // L: 57
				return false;
			} else {
				if (var2.method388(var1)) { // L: 58
					switch(var1) { // L: 59
					case 81:
						this.field2324 = true; // L: 69
						break;
					case 82:
						this.field2323 = true; // L: 66
						break; // L: 67
					default:
						if (this.method4123(var1)) { // L: 61
							Messages.invalidateWidget(this.field2325); // L: 62
						}
					}
				}

				return var2.method386(var1); // L: 73
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "100"
	)
	public boolean vmethod4128(int var1) {
		switch(var1) { // L: 77
		case 81:
			this.field2324 = false; // L: 79
			return false; // L: 80
		case 82:
			this.field2323 = false; // L: 82
			return false; // L: 83
		default:
			return false; // L: 85
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "4"
	)
	public boolean vmethod4145(char var1) {
		if (this.field2325 == null) { // L: 89
			return false;
		} else {
			boolean var2;
			if (var1 >= ' ' && var1 < 127 || var1 > 127 && var1 < 160 || var1 > 160 && var1 <= 255) { // L: 92
				var2 = true; // L: 93
			} else {
				label94: {
					if (var1 != 0) { // L: 96
						char[] var3 = class382.cp1252AsciiExtension; // L: 98

						for (int var4 = 0; var4 < var3.length; ++var4) { // L: 99
							char var5 = var3[var4]; // L: 100
							if (var5 == var1) { // L: 102
								var2 = true; // L: 103
								break label94;
							}
						}
					}

					var2 = false; // L: 110
				}
			}

			if (!var2) { // L: 112
				return false;
			} else {
				class327 var7 = this.field2325.method6380(); // L: 113
				if (var7 != null && var7.method6238()) { // L: 114
					class27 var6 = this.field2325.method6382(); // L: 115
					if (var6 == null) { // L: 116
						return false;
					} else {
						if (var6.method389(var1) && var7.method6254(var1)) { // L: 117 118
							Messages.invalidateWidget(this.field2325); // L: 119
						}

						return var6.method387(var1); // L: 122
					}
				} else {
					return false;
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "839410380"
	)
	public boolean vmethod4131(boolean var1) {
		return false; // L: 126
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lmb;B)V",
		garbageValue = "54"
	)
	public void method4120(Widget var1) {
		this.method4102(); // L: 19
		if (var1 != null) { // L: 20
			this.field2325 = var1; // L: 21
			class325 var2 = var1.method6383(); // L: 22
			if (var2 != null) { // L: 23
				var2.field3529.method6056(true); // L: 24
				if (var2.field3532 != null) { // L: 25
					ScriptEvent var3 = new ScriptEvent(); // L: 26
					var3.method2247(var1); // L: 27
					var3.setArgs(var2.field3532); // L: 28
					Message.method1177().addFirst(var3); // L: 29
				}
			}
		}

	} // L: 33

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lmb;",
		garbageValue = "-1539536755"
	)
	public Widget method4099() {
		return this.field2325; // L: 36
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	public void method4102() {
		if (this.field2325 != null) { // L: 40
			class325 var1 = this.field2325.method6383(); // L: 41
			Widget var2 = this.field2325; // L: 42
			this.field2325 = null; // L: 43
			if (var1 != null) { // L: 44
				var1.field3529.method6056(false); // L: 45
				if (var1.field3532 != null) { // L: 46
					ScriptEvent var3 = new ScriptEvent(); // L: 47
					var3.method2247(var2); // L: 48
					var3.setArgs(var1.field3532); // L: 49
					Message.method1177().addFirst(var3); // L: 50
				}

			}
		}
	} // L: 52

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "27176"
	)
	boolean method4123(int var1) {
		if (this.field2325 == null) { // L: 130
			return false;
		} else {
			class327 var2 = this.field2325.method6380(); // L: 131
			if (var2 != null && var2.method6238()) { // L: 132
				switch(var1) { // L: 133
				case 13:
					this.method4102(); // L: 198
					return true; // L: 199
				case 48:
					if (this.field2323) { // L: 193
						var2.method6079(); // L: 194
					}

					return true; // L: 196
				case 65:
					if (this.field2323) { // L: 151
						var2.method6098(class25.method375()); // L: 152
					}

					return true; // L: 154
				case 66:
					if (this.field2323) { // L: 188
						var2.method6097(class25.method375()); // L: 189
					}

					return true; // L: 191
				case 67:
					if (this.field2323) { // L: 201
						var2.method6184(class25.method375()); // L: 202
					}

					return true; // L: 204
				case 84:
					if (var2.method6118() == 0) { // L: 222
						var2.method6254(10); // L: 223
					} else if (this.field2324 && var2.method6122()) { // L: 226
						var2.method6254(10); // L: 227
					} else {
						class325 var3 = this.field2325.method6383(); // L: 230
						ScriptEvent var4 = new ScriptEvent(); // L: 231
						var4.method2247(this.field2325); // L: 232
						var4.setArgs(var3.field3534); // L: 233
						Message.method1177().addFirst(var4); // L: 234
						this.method4102(); // L: 235
					}

					return true; // L: 238
				case 85:
					if (this.field2323) { // L: 172
						var2.method6076(); // L: 173
					} else {
						var2.method6273(); // L: 176
					}

					return true; // L: 178
				case 96:
					if (this.field2323) { // L: 248
						var2.method6087(this.field2324); // L: 249
					} else {
						var2.method6266(this.field2324); // L: 252
					}

					return true; // L: 254
				case 97:
					if (this.field2323) { // L: 135
						var2.method6095(this.field2324); // L: 136
					} else {
						var2.method6294(this.field2324); // L: 139
					}

					return true; // L: 141
				case 98:
					if (this.field2323) { // L: 164
						var2.method6100(); // L: 165
					} else {
						var2.method6089(this.field2324); // L: 168
					}

					return true; // L: 170
				case 99:
					if (this.field2323) { // L: 143
						var2.method6264(); // L: 144
					} else {
						var2.method6246(this.field2324); // L: 147
					}

					return true; // L: 149
				case 101:
					if (this.field2323) { // L: 240
						var2.method6248(); // L: 241
					} else {
						var2.method6075(); // L: 244
					}

					return true; // L: 246
				case 102:
					if (this.field2323) { // L: 214
						var2.method6083(this.field2324); // L: 215
					} else {
						var2.method6331(this.field2324); // L: 218
					}

					return true; // L: 220
				case 103:
					if (this.field2323) { // L: 206
						var2.method6084(this.field2324); // L: 207
					} else {
						var2.method6216(this.field2324); // L: 210
					}

					return true; // L: 212
				case 104:
					if (this.field2323) { // L: 156
						var2.method6093(this.field2324); // L: 157
					} else {
						var2.method6091(this.field2324); // L: 160
					}

					return true; // L: 162
				case 105:
					if (this.field2323) { // L: 180
						var2.method6241(this.field2324); // L: 181
					} else {
						var2.method6092(this.field2324); // L: 184
					}

					return true; // L: 186
				default:
					return false; // L: 256
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1317822886"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 158
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-112"
	)
	static final void method4117(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 12217
		if (var0 != class10.clientPreferences.method2488()) { // L: 12218
			if (class10.clientPreferences.method2488() == 0 && Client.currentTrackGroupId != -1) { // L: 12219
				class368.method6892(ReflectionCheck.archive6, Client.currentTrackGroupId, 0, var0, false); // L: 12220
				Client.playingJingle = false; // L: 12221
			} else if (var0 == 0) { // L: 12223
				class304.midiPcmStream.clear(); // L: 12225
				class304.musicPlayerStatus = 1; // L: 12226
				UserComparator9.musicTrackArchive = null; // L: 12227
				Client.playingJingle = false; // L: 12229
			} else if (class304.musicPlayerStatus != 0) { // L: 12232
				class304.musicTrackVolume = var0;
			} else {
				class304.midiPcmStream.setPcmStreamVolume(var0); // L: 12233
			}

			class10.clientPreferences.method2519(var0); // L: 12235
		}

	} // L: 12237
}
