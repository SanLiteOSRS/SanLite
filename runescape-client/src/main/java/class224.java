import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public class class224 implements class29 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	Widget field2384;
	@ObfuscatedName("ap")
	boolean field2385;
	@ObfuscatedName("af")
	boolean field2386;

	public class224() {
		this.field2384 = null; // L: 14
		this.field2385 = false; // L: 15
		this.field2386 = false; // L: 16
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1871329380"
	)
	public boolean vmethod4418(int var1) {
		if (this.field2384 == null) { // L: 60
			return false;
		} else {
			class27 var2 = this.field2384.method6724(); // L: 61
			if (var2 == null) { // L: 62
				return false;
			} else {
				if (var2.method398(var1)) { // L: 63
					switch(var1) { // L: 64
					case 81:
						this.field2386 = true; // L: 66
						break;
					case 82:
						this.field2385 = true; // L: 74
						break;
					default:
						if (this.method4412(var1)) { // L: 69
							FaceNormal.invalidateWidget(this.field2384); // L: 70
						}
					}
				}

				return var2.method412(var1); // L: 78
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-139541289"
	)
	public boolean vmethod4460(int var1) {
		switch(var1) { // L: 82
		case 81:
			this.field2386 = false; // L: 87
			return false; // L: 88
		case 82:
			this.field2385 = false; // L: 84
			return false; // L: 85
		default:
			return false; // L: 90
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "47"
	)
	public boolean vmethod4420(char var1) {
		if (this.field2384 == null) { // L: 94
			return false;
		} else {
			boolean var2;
			if (var1 >= ' ' && var1 < 127 || var1 > 127 && var1 < 160 || var1 > 160 && var1 <= 255) { // L: 97
				var2 = true; // L: 98
			} else {
				label93: {
					if (var1 != 0) { // L: 101
						char[] var3 = class400.cp1252AsciiExtension; // L: 103

						for (int var4 = 0; var4 < var3.length; ++var4) { // L: 104
							char var5 = var3[var4]; // L: 105
							if (var5 == var1) { // L: 107
								var2 = true; // L: 108
								break label93;
							}
						}
					}

					var2 = false; // L: 115
				}
			}

			if (!var2) { // L: 117
				return false;
			} else {
				class344 var7 = this.field2384.method6700(); // L: 118
				if (var7 != null && var7.method6472()) { // L: 119
					class27 var6 = this.field2384.method6724(); // L: 120
					if (var6 == null) { // L: 121
						return false;
					} else {
						if (var6.method399(var1) && var7.method6434(var1)) { // L: 122 123
							FaceNormal.invalidateWidget(this.field2384); // L: 124
						}

						return var6.method418(var1); // L: 127
					}
				} else {
					return false;
				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1335637558"
	)
	public boolean vmethod4422(boolean var1) {
		return false; // L: 131
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lnn;B)V",
		garbageValue = "1"
	)
	public void method4391(Widget var1) {
		if (var1 != null) { // L: 19
			if (var1 != this.field2384) { // L: 20
				this.method4407(); // L: 21
				this.field2384 = var1; // L: 22
			}

			class342 var2 = var1.method6716(); // L: 24
			if (var2 != null) { // L: 25
				if (!var2.field3635.method6468() && var2.field3633 != null) { // L: 26
					ScriptEvent var3 = new ScriptEvent(); // L: 27
					var3.method2355(var1); // L: 28
					var3.setArgs(var2.field3633); // L: 29
					class27.method401().addFirst(var3); // L: 30
				}

				var2.field3635.method6475(true); // L: 32
			}
		} else {
			this.method4407(); // L: 36
		}

	} // L: 38

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lnn;",
		garbageValue = "-1734459633"
	)
	public Widget method4392() {
		return this.field2384; // L: 41
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1497290053"
	)
	public void method4407() {
		if (this.field2384 != null) { // L: 45
			class342 var1 = this.field2384.method6716(); // L: 46
			Widget var2 = this.field2384; // L: 47
			this.field2384 = null; // L: 48
			if (var1 != null) { // L: 49
				if (var1.field3635.method6468() && var1.field3633 != null) { // L: 50
					ScriptEvent var3 = new ScriptEvent(); // L: 51
					var3.method2355(var2); // L: 52
					var3.setArgs(var1.field3633); // L: 53
					class27.method401().addFirst(var3); // L: 54
				}

				var1.field3635.method6475(false); // L: 56
			}
		}
	} // L: 57

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	boolean method4412(int var1) {
		if (this.field2384 == null) { // L: 135
			return false;
		} else {
			class344 var2 = this.field2384.method6700(); // L: 136
			if (var2 != null && var2.method6472()) { // L: 137
				Clipboard var5;
				switch(var1) { // L: 138
				case 13:
					this.method4407(); // L: 205
					return true; // L: 206
				case 48:
					if (this.field2385) { // L: 192
						var2.method6440(); // L: 193
					}

					return true; // L: 195
				case 65:
					if (this.field2385) { // L: 182
						var5 = VertexNormal.client.method502(); // L: 186
						var2.method6459(var5); // L: 188
					}

					return true; // L: 190
				case 66:
					if (this.field2385) { // L: 258
						var5 = VertexNormal.client.method502(); // L: 262
						var2.method6458(var5); // L: 264
					}

					return true; // L: 266
				case 67:
					if (this.field2385) { // L: 156
						var5 = VertexNormal.client.method502(); // L: 160
						var2.method6460(var5); // L: 162
					}

					return true; // L: 164
				case 84:
					if (var2.method6663() == 0) { // L: 224
						var2.method6434(10); // L: 225
					} else if (this.field2386 && var2.method6482()) { // L: 228
						var2.method6434(10); // L: 229
					} else {
						class342 var3 = this.field2384.method6716(); // L: 232
						ScriptEvent var4 = new ScriptEvent(); // L: 233
						var4.method2355(this.field2384); // L: 234
						var4.setArgs(var3.field3629); // L: 235
						class27.method401().addFirst(var4); // L: 236
						this.method4407(); // L: 237
					}

					return true; // L: 240
				case 85:
					if (this.field2385) { // L: 174
						var2.method6618(); // L: 175
					} else {
						var2.method6545(); // L: 178
					}

					return true; // L: 180
				case 96:
					if (this.field2385) { // L: 242
						var2.method6615(this.field2386); // L: 243
					} else {
						var2.method6653(this.field2386); // L: 246
					}

					return true; // L: 248
				case 97:
					if (this.field2385) { // L: 140
						var2.method6575(this.field2386); // L: 141
					} else {
						var2.method6447(this.field2386); // L: 144
					}

					return true; // L: 146
				case 98:
					if (this.field2385) { // L: 148
						var2.method6558(); // L: 149
					} else {
						var2.method6450(this.field2386); // L: 152
					}

					return true; // L: 154
				case 99:
					if (this.field2385) { // L: 166
						var2.method6544(); // L: 167
					} else {
						var2.method6451(this.field2386); // L: 170
					}

					return true; // L: 172
				case 101:
					if (this.field2385) { // L: 268
						var2.method6438(); // L: 269
					} else {
						var2.method6662(); // L: 272
					}

					return true; // L: 274
				case 102:
					if (this.field2385) { // L: 216
						var2.method6444(this.field2386); // L: 217
					} else {
						var2.method6682(this.field2386); // L: 220
					}

					return true; // L: 222
				case 103:
					if (this.field2385) { // L: 208
						var2.method6523(this.field2386); // L: 209
					} else {
						var2.method6443(this.field2386); // L: 212
					}

					return true; // L: 214
				case 104:
					if (this.field2385) { // L: 250
						var2.method6454(this.field2386); // L: 251
					} else {
						var2.method6526(this.field2386); // L: 254
					}

					return true; // L: 256
				case 105:
					if (this.field2385) { // L: 197
						var2.method6455(this.field2386); // L: 198
					} else {
						var2.method6599(this.field2386); // L: 201
					}

					return true; // L: 203
				default:
					return false; // L: 276
				}
			} else {
				return false;
			}
		}
	}
}
