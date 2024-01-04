import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public class class221 implements class29 {
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = -93724707
	)
	static int field2343;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	Widget field2340;
	@ObfuscatedName("ah")
	boolean field2341;
	@ObfuscatedName("ar")
	boolean field2342;

	public class221() {
		this.field2340 = null; // L: 14
		this.field2341 = false; // L: 15
		this.field2342 = false; // L: 16
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "512"
	)
	public boolean vmethod4310(int var1) {
		if (this.field2340 == null) { // L: 60
			return false;
		} else {
			class27 var2 = this.field2340.method6690(); // L: 61
			if (var2 == null) { // L: 62
				return false;
			} else {
				if (var2.method422(var1)) { // L: 63
					switch(var1) { // L: 64
					case 81:
						this.field2342 = true;
						break; // L: 74
					case 82:
						this.field2341 = true; // L: 71
						break; // L: 72
					default:
						if (this.method4285(var1)) { // L: 66
							class159.invalidateWidget(this.field2340); // L: 67
						}
					}
				}

				return var2.method409(var1); // L: 78
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1146773117"
	)
	public boolean vmethod4320(int var1) {
		switch(var1) { // L: 82
		case 81:
			this.field2342 = false; // L: 84
			return false; // L: 85
		case 82:
			this.field2341 = false; // L: 87
			return false; // L: 88
		default:
			return false; // L: 90
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "984376689"
	)
	public boolean vmethod4321(char var1) {
		if (this.field2340 == null) { // L: 94
			return false;
		} else if (!DirectByteArrayCopier.method6830(var1)) { // L: 95
			return false;
		} else {
			class341 var2 = this.field2340.method6688(); // L: 96
			if (var2 != null && var2.method6394()) { // L: 97
				class27 var3 = this.field2340.method6690(); // L: 98
				if (var3 == null) {
					return false; // L: 99
				} else {
					if (var3.method412(var1) && var2.method6378(var1)) { // L: 100 101
						class159.invalidateWidget(this.field2340); // L: 102
					}

					return var3.method410(var1); // L: 105
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-49"
	)
	public boolean vmethod4312(boolean var1) {
		return false; // L: 109
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)V",
		garbageValue = "950407656"
	)
	public void method4279(Widget var1) {
		if (var1 != null) { // L: 19
			if (var1 != this.field2340) { // L: 20
				this.method4281(); // L: 21
				this.field2340 = var1; // L: 22
			}

			class339 var2 = var1.method6767(); // L: 24
			if (var2 != null) { // L: 25
				if (!var2.field3593.method6640() && var2.field3592 != null) { // L: 26
					ScriptEvent var3 = new ScriptEvent(); // L: 27
					var3.method2357(var1); // L: 28
					var3.setArgs(var2.field3592); // L: 29
					FileSystem.method4225().addFirst(var3); // L: 30
				}

				var2.field3593.method6361(true); // L: 32
			}
		} else {
			this.method4281(); // L: 36
		}

	} // L: 38

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(S)Lnn;",
		garbageValue = "-15065"
	)
	public Widget method4303() {
		return this.field2340; // L: 41
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-881991302"
	)
	public void method4281() {
		if (this.field2340 != null) { // L: 45
			class339 var1 = this.field2340.method6767(); // L: 46
			Widget var2 = this.field2340; // L: 47
			this.field2340 = null; // L: 48
			if (var1 != null) { // L: 49
				if (var1.field3593.method6640() && var1.field3592 != null) { // L: 50
					ScriptEvent var3 = new ScriptEvent(); // L: 51
					var3.method2357(var2); // L: 52
					var3.setArgs(var1.field3592); // L: 53
					FileSystem.method4225().addFirst(var3); // L: 54
				}

				var1.field3593.method6361(false); // L: 56
			}
		}
	} // L: 57

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "2"
	)
	boolean method4285(int var1) {
		if (this.field2340 == null) { // L: 113
			return false;
		} else {
			class341 var2 = this.field2340.method6688(); // L: 114
			if (var2 != null && var2.method6394()) { // L: 115
				Clipboard var5;
				switch(var1) { // L: 116
				case 13:
					this.method4281(); // L: 118
					return true; // L: 119
				case 48:
					if (this.field2341) { // L: 217
						var2.method6434(); // L: 218
					}

					return true; // L: 220
				case 65:
					if (this.field2341) { // L: 147
						var5 = SpriteMask.client.method498(); // L: 151
						var2.method6403(var5); // L: 153
					}

					return true; // L: 155
				case 66:
					if (this.field2341) { // L: 129
						var5 = SpriteMask.client.method498(); // L: 133
						var2.method6402(var5); // L: 135
					}

					return true; // L: 137
				case 67:
					if (this.field2341) { // L: 181
						var5 = SpriteMask.client.method498(); // L: 185
						var2.method6546(var5); // L: 187
					}

					return true; // L: 189
				case 84:
					if (var2.method6423() == 0) { // L: 191
						var2.method6378(10); // L: 192
					} else if (this.field2342 && var2.method6426()) { // L: 195
						var2.method6378(10); // L: 196
					} else {
						class339 var3 = this.field2340.method6767(); // L: 199
						ScriptEvent var4 = new ScriptEvent(); // L: 200
						var4.method2357(this.field2340); // L: 201
						var4.setArgs(var3.field3595); // L: 202
						FileSystem.method4225().addFirst(var4); // L: 203
						this.method4281(); // L: 204
					}

					return true; // L: 207
				case 85:
					if (this.field2341) { // L: 209
						var2.method6428(); // L: 210
					} else {
						var2.method6368(); // L: 213
					}

					return true; // L: 215
				case 96:
					if (this.field2341) { // L: 139
						var2.method6392(this.field2342); // L: 140
					} else {
						var2.method6390(this.field2342); // L: 143
					}

					return true; // L: 145
				case 97:
					if (this.field2341) { // L: 246
						var2.method6393(this.field2342); // L: 247
					} else {
						var2.method6391(this.field2342); // L: 250
					}

					return true; // L: 252
				case 98:
					if (this.field2341) { // L: 230
						var2.method6405(); // L: 231
					} else {
						var2.method6602(this.field2342); // L: 234
					}

					return true; // L: 236
				case 99:
					if (this.field2341) { // L: 121
						var2.method6406(); // L: 122
					} else {
						var2.method6395(this.field2342); // L: 125
					}

					return true; // L: 127
				case 101:
					if (this.field2341) { // L: 238
						var2.method6382(); // L: 239
					} else {
						var2.method6380(); // L: 242
					}

					return true; // L: 244
				case 102:
					if (this.field2341) { // L: 165
						var2.method6565(this.field2342); // L: 166
					} else {
						var2.method6440(this.field2342); // L: 169
					}

					return true; // L: 171
				case 103:
					if (this.field2341) { // L: 173
						var2.method6389(this.field2342); // L: 174
					} else {
						var2.method6387(this.field2342); // L: 177
					}

					return true; // L: 179
				case 104:
					if (this.field2341) { // L: 157
						var2.method6596(this.field2342); // L: 158
					} else {
						var2.method6396(this.field2342); // L: 161
					}

					return true; // L: 163
				case 105:
					if (this.field2341) { // L: 222
						var2.method6506(this.field2342); // L: 223
					} else {
						var2.method6397(this.field2342); // L: 226
					}

					return true; // L: 228
				default:
					return false; // L: 254
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Laa;",
		garbageValue = "-14"
	)
	public static class6[] method4305() {
		return new class6[]{class6.field16}; // L: 12
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luo;I)V",
		garbageValue = "-620397215"
	)
	static final void method4304(PacketBuffer var0) {
		int var1 = 0; // L: 338
		var0.importIndex(); // L: 339

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 340
			var5 = Players.Players_indices[var2]; // L: 341
			if ((Players.field1366[var5] & 1) == 0) { // L: 342
				if (var1 > 0) { // L: 343
					--var1; // L: 344
					var10000 = Players.field1366; // L: 345
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var4 = var0.readBits(1); // L: 348
					if (var4 == 0) { // L: 349
						var1 = Client.method1394(var0); // L: 350
						var10000 = Players.field1366; // L: 351
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						class9.readPlayerUpdate(var0, var5); // L: 354
					}
				}
			}
		}

		var0.exportIndex(); // L: 357
		if (var1 != 0) { // L: 358
			throw new RuntimeException(); // L: 359
		} else {
			var0.importIndex(); // L: 361

			for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 362
				var5 = Players.Players_indices[var2]; // L: 363
				if ((Players.field1366[var5] & 1) != 0) { // L: 364
					if (var1 > 0) { // L: 365
						--var1; // L: 366
						var10000 = Players.field1366; // L: 367
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var4 = var0.readBits(1); // L: 370
						if (var4 == 0) { // L: 371
							var1 = Client.method1394(var0); // L: 372
							var10000 = Players.field1366; // L: 373
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							class9.readPlayerUpdate(var0, var5); // L: 376
						}
					}
				}
			}

			var0.exportIndex(); // L: 379
			if (var1 != 0) { // L: 380
				throw new RuntimeException(); // L: 381
			} else {
				var0.importIndex(); // L: 383

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 384
					var5 = Players.Players_emptyIndices[var2]; // L: 385
					if ((Players.field1366[var5] & 1) != 0) { // L: 386
						if (var1 > 0) { // L: 387
							--var1; // L: 388
							var10000 = Players.field1366; // L: 389
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var4 = var0.readBits(1); // L: 392
							if (var4 == 0) { // L: 393
								var1 = Client.method1394(var0); // L: 394
								var10000 = Players.field1366; // L: 395
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (Buddy.updateExternalPlayer(var0, var5)) { // L: 398
								var10000 = Players.field1366;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 401
				if (var1 != 0) { // L: 402
					throw new RuntimeException(); // L: 403
				} else {
					var0.importIndex(); // L: 405

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 406
						var5 = Players.Players_emptyIndices[var2]; // L: 407
						if ((Players.field1366[var5] & 1) == 0) { // L: 408
							if (var1 > 0) { // L: 409
								--var1; // L: 410
								var10000 = Players.field1366; // L: 411
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var4 = var0.readBits(1); // L: 414
								if (var4 == 0) { // L: 415
									var1 = Client.method1394(var0); // L: 416
									var10000 = Players.field1366; // L: 417
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (Buddy.updateExternalPlayer(var0, var5)) { // L: 420
									var10000 = Players.field1366;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 423
					if (var1 != 0) { // L: 424
						throw new RuntimeException(); // L: 425
					} else {
						Players.Players_count = 0; // L: 427
						Players.Players_emptyIdxCount = 0; // L: 428

						for (var2 = 1; var2 < 2048; ++var2) { // L: 429
							var10000 = Players.field1366; // L: 430
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2]; // L: 431
							if (var3 != null) { // L: 432
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2; // L: 433
							}
						}

					}
				}
			}
		}
	} // L: 435
}
