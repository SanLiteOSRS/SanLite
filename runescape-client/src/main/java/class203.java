import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class203 implements class29 {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 950994657
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	Widget field2314;
	@ObfuscatedName("w")
	boolean field2311;
	@ObfuscatedName("v")
	boolean field2312;

	public class203() {
		this.field2314 = null; // L: 14
		this.field2311 = false; // L: 15
		this.field2312 = false; // L: 16
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "110"
	)
	public boolean vmethod4135(int var1) {
		if (this.field2314 == null) { // L: 55
			return false;
		} else {
			class27 var2 = this.field2314.method6227(); // L: 56
			if (var2 == null) { // L: 57
				return false;
			} else {
				if (var2.method411(var1)) { // L: 58
					switch(var1) { // L: 59
					case 81:
						this.field2312 = true; // L: 66
						break;
					case 82:
						this.field2311 = true; // L: 69
						break;
					default:
						if (this.method4102(var1)) { // L: 61
							LoginScreenAnimation.invalidateWidget(this.field2314); // L: 62
						}
					}
				}

				return var2.method416(var1); // L: 73
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "11"
	)
	public boolean vmethod4136(int var1) {
		switch(var1) { // L: 77
		case 81:
			this.field2312 = false; // L: 79
			return false; // L: 80
		case 82:
			this.field2311 = false; // L: 82
			return false; // L: 83
		default:
			return false; // L: 85
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "783044550"
	)
	public boolean vmethod4179(char var1) {
		if (this.field2314 == null) { // L: 89
			return false;
		} else if (!MusicPatch.method5789(var1)) { // L: 90
			return false;
		} else {
			class307 var2 = this.field2314.method6235(); // L: 91
			if (var2 != null && var2.method5979()) { // L: 92
				class27 var3 = this.field2314.method6227(); // L: 93
				if (var3 == null) { // L: 94
					return false;
				} else {
					if (var3.method398(var1) && var2.method5940(var1)) { // L: 95 96
						LoginScreenAnimation.invalidateWidget(this.field2314); // L: 97
					}

					return var3.method396(var1); // L: 100
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "653857297"
	)
	public boolean vmethod4139(boolean var1) {
		return false; // L: 104
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkz;B)V",
		garbageValue = "15"
	)
	public void method4096(Widget var1) {
		this.method4097(); // L: 19
		if (var1 != null) { // L: 20
			this.field2314 = var1; // L: 21
			class305 var2 = var1.method6228(); // L: 22
			if (var2 != null) { // L: 23
				var2.field3476.method6057(true); // L: 24
				if (var2.field3480 != null) { // L: 25
					ScriptEvent var3 = new ScriptEvent(); // L: 26
					var3.method2313(var1); // L: 27
					var3.setArgs(var2.field3480); // L: 28
					class12.method171().addFirst(var3); // L: 29
				}
			}
		}

	} // L: 33

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(S)Lkz;",
		garbageValue = "-11104"
	)
	public Widget method4109() {
		return this.field2314; // L: 36
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1261439160"
	)
	public void method4097() {
		if (this.field2314 != null) { // L: 40
			class305 var1 = this.field2314.method6228(); // L: 41
			Widget var2 = this.field2314; // L: 42
			this.field2314 = null; // L: 43
			if (var1 != null) { // L: 44
				var1.field3476.method6057(false); // L: 45
				if (var1.field3480 != null) { // L: 46
					ScriptEvent var3 = new ScriptEvent(); // L: 47
					var3.method2313(var2); // L: 48
					var3.setArgs(var1.field3480); // L: 49
					class12.method171().addFirst(var3); // L: 50
				}

			}
		}
	} // L: 52

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "577677539"
	)
	boolean method4102(int var1) {
		if (this.field2314 == null) { // L: 108
			return false;
		} else {
			class307 var2 = this.field2314.method6235(); // L: 109
			if (var2 != null && var2.method5979()) { // L: 110
				switch(var1) { // L: 111
				case 13:
					this.method4097(); // L: 184
					return true; // L: 185
				case 48:
					if (this.field2311) { // L: 155
						var2.method5991(); // L: 156
					}

					return true; // L: 158
				case 65:
					if (this.field2311) { // L: 205
						var2.method5965(class12.method170()); // L: 206
					}

					return true; // L: 208
				case 66:
					if (this.field2311) { // L: 150
						var2.method5964(class12.method170()); // L: 151
					}

					return true; // L: 153
				case 67:
					if (this.field2311) { // L: 121
						var2.method6043(class12.method170()); // L: 122
					}

					return true; // L: 124
				case 84:
					if (var2.method5948() == 0) { // L: 187
						var2.method5940(10); // L: 188
					} else if (this.field2312 && var2.method5988()) { // L: 191
						var2.method5940(10); // L: 192
					} else {
						class305 var3 = this.field2314.method6228(); // L: 195
						ScriptEvent var4 = new ScriptEvent(); // L: 196
						var4.method2313(this.field2314); // L: 197
						var4.setArgs(var3.field3482); // L: 198
						class12.method171().addFirst(var4); // L: 199
						this.method4097(); // L: 200
					}

					return true; // L: 203
				case 85:
					if (this.field2311) { // L: 113
						var2.method5943(); // L: 114
					} else {
						var2.method5941(); // L: 117
					}

					return true; // L: 119
				case 96:
					if (this.field2311) { // L: 142
						var2.method6163(this.field2312); // L: 143
					} else {
						var2.method6037(this.field2312); // L: 146
					}

					return true; // L: 148
				case 97:
					if (this.field2311) { // L: 168
						var2.method5955(this.field2312); // L: 169
					} else {
						var2.method5953(this.field2312); // L: 172
					}

					return true; // L: 174
				case 98:
					if (this.field2311) { // L: 218
						var2.method5967(); // L: 219
					} else {
						var2.method5956(this.field2312); // L: 222
					}

					return true; // L: 224
				case 99:
					if (this.field2311) { // L: 160
						var2.method5968(); // L: 161
					} else {
						var2.method5957(this.field2312); // L: 164
					}

					return true; // L: 166
				case 101:
					if (this.field2311) { // L: 226
						var2.method5944(); // L: 227
					} else {
						var2.method6124(); // L: 230
					}

					return true; // L: 232
				case 102:
					if (this.field2311) { // L: 176
						var2.method6132(this.field2312); // L: 177
					} else {
						var2.method5923(this.field2312); // L: 180
					}

					return true; // L: 182
				case 103:
					if (this.field2311) { // L: 210
						var2.method6160(this.field2312); // L: 211
					} else {
						var2.method6060(this.field2312); // L: 214
					}

					return true; // L: 216
				case 104:
					if (this.field2311) { // L: 134
						var2.method5960(this.field2312); // L: 135
					} else {
						var2.method5958(this.field2312); // L: 138
					}

					return true; // L: 140
				case 105:
					if (this.field2311) { // L: 126
						var2.method5961(this.field2312); // L: 127
					} else {
						var2.method5959(this.field2312); // L: 130
					}

					return true; // L: 132
				default:
					return false; // L: 234
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-56"
	)
	static boolean method4129(int var0) {
		return (var0 & 128) != 0; // L: 107
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-175438217"
	)
	static final void method4128(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12758
		PacketWriter.clientPreferences.updateSoundEffectVolume(var0); // L: 12759
	} // L: 12760
}
