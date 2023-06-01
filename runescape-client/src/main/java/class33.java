import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
public class class33 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lty;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = -1006900437
	)
	static int field167;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1963800391
	)
	int field165;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2099611359
	)
	int field161;

	class33(int var1, int var2) {
		this.field165 = var1; // L: 14
		this.field161 = var2; // L: 15
	} // L: 16

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lbi;I)Z",
		garbageValue = "-130388708"
	)
	boolean method471(class29 var1) {
		if (var1 == null) { // L: 19
			return false;
		} else {
			switch(this.field165) { // L: 20
			case 1:
				return var1.vmethod4080(this.field161); // L: 30
			case 2:
				return var1.vmethod4114(this.field161); // L: 26
			case 3:
				return var1.vmethod4081((char)this.field161); // L: 24
			case 4:
				return var1.vmethod4083(this.field161 == 1); // L: 22
			default:
				return false; // L: 28
			}
		}
	}

	@ObfuscatedName("an")
	static boolean method470(long var0) {
		return ReflectionCheck.method692(var0) == 2; // L: 48
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ltn;I)V",
		garbageValue = "-198382064"
	)
	static final void method465(PacketBuffer var0) {
		int var1 = 0; // L: 91
		var0.importIndex(); // L: 92

		byte[] var10000;
		int var2;
		int var4;
		int var6;
		int var7;
		int var8;
		for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 93
			var8 = Players.Players_indices[var2]; // L: 94
			if ((Players.field1327[var8] & 1) == 0) { // L: 95
				if (var1 > 0) { // L: 96
					--var1; // L: 97
					var10000 = Players.field1327; // L: 98
					var10000[var8] = (byte)(var10000[var8] | 2);
				} else {
					var4 = var0.readBits(1); // L: 101
					if (var4 == 0) { // L: 102
						var6 = var0.readBits(2); // L: 105
						if (var6 == 0) { // L: 107
							var7 = 0;
						} else if (var6 == 1) { // L: 108
							var7 = var0.readBits(5);
						} else if (var6 == 2) { // L: 109
							var7 = var0.readBits(8);
						} else {
							var7 = var0.readBits(11); // L: 110
						}

						var1 = var7; // L: 113
						var10000 = Players.field1327; // L: 114
						var10000[var8] = (byte)(var10000[var8] | 2);
					} else {
						VarpDefinition.readPlayerUpdate(var0, var8); // L: 117
					}
				}
			}
		}

		var0.exportIndex(); // L: 120
		if (var1 != 0) { // L: 121
			throw new RuntimeException(); // L: 122
		} else {
			var0.importIndex(); // L: 124

			for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 125
				var8 = Players.Players_indices[var2]; // L: 126
				if ((Players.field1327[var8] & 1) != 0) { // L: 127
					if (var1 > 0) { // L: 128
						--var1; // L: 129
						var10000 = Players.field1327; // L: 130
						var10000[var8] = (byte)(var10000[var8] | 2);
					} else {
						var4 = var0.readBits(1); // L: 133
						if (var4 == 0) { // L: 134
							var6 = var0.readBits(2); // L: 137
							if (var6 == 0) { // L: 139
								var7 = 0;
							} else if (var6 == 1) { // L: 140
								var7 = var0.readBits(5);
							} else if (var6 == 2) { // L: 141
								var7 = var0.readBits(8);
							} else {
								var7 = var0.readBits(11); // L: 142
							}

							var1 = var7; // L: 145
							var10000 = Players.field1327; // L: 146
							var10000[var8] = (byte)(var10000[var8] | 2);
						} else {
							VarpDefinition.readPlayerUpdate(var0, var8); // L: 149
						}
					}
				}
			}

			var0.exportIndex(); // L: 152
			if (var1 != 0) { // L: 153
				throw new RuntimeException(); // L: 154
			} else {
				var0.importIndex(); // L: 156

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 157
					var8 = Players.Players_emptyIndices[var2]; // L: 158
					if ((Players.field1327[var8] & 1) != 0) { // L: 159
						if (var1 > 0) { // L: 160
							--var1; // L: 161
							var10000 = Players.field1327; // L: 162
							var10000[var8] = (byte)(var10000[var8] | 2);
						} else {
							var4 = var0.readBits(1); // L: 165
							if (var4 == 0) { // L: 166
								var6 = var0.readBits(2); // L: 169
								if (var6 == 0) { // L: 171
									var7 = 0;
								} else if (var6 == 1) { // L: 172
									var7 = var0.readBits(5);
								} else if (var6 == 2) { // L: 173
									var7 = var0.readBits(8);
								} else {
									var7 = var0.readBits(11); // L: 174
								}

								var1 = var7; // L: 177
								var10000 = Players.field1327; // L: 178
								var10000[var8] = (byte)(var10000[var8] | 2);
							} else if (class196.updateExternalPlayer(var0, var8)) { // L: 181
								var10000 = Players.field1327;
								var10000[var8] = (byte)(var10000[var8] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 184
				if (var1 != 0) { // L: 185
					throw new RuntimeException(); // L: 186
				} else {
					var0.importIndex(); // L: 188

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 189
						var8 = Players.Players_emptyIndices[var2]; // L: 190
						if ((Players.field1327[var8] & 1) == 0) { // L: 191
							if (var1 > 0) { // L: 192
								--var1; // L: 193
								var10000 = Players.field1327; // L: 194
								var10000[var8] = (byte)(var10000[var8] | 2);
							} else {
								var4 = var0.readBits(1); // L: 197
								if (var4 == 0) { // L: 198
									var6 = var0.readBits(2); // L: 201
									if (var6 == 0) { // L: 203
										var7 = 0;
									} else if (var6 == 1) { // L: 204
										var7 = var0.readBits(5);
									} else if (var6 == 2) { // L: 205
										var7 = var0.readBits(8);
									} else {
										var7 = var0.readBits(11); // L: 206
									}

									var1 = var7; // L: 209
									var10000 = Players.field1327; // L: 210
									var10000[var8] = (byte)(var10000[var8] | 2);
								} else if (class196.updateExternalPlayer(var0, var8)) { // L: 213
									var10000 = Players.field1327;
									var10000[var8] = (byte)(var10000[var8] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 216
					if (var1 != 0) { // L: 217
						throw new RuntimeException(); // L: 218
					} else {
						Players.Players_count = 0; // L: 220
						Players.Players_emptyIdxCount = 0; // L: 221

						for (var2 = 1; var2 < 2048; ++var2) { // L: 222
							var10000 = Players.field1327; // L: 223
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2]; // L: 224
							if (var3 != null) { // L: 225
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2; // L: 226
							}
						}

					}
				}
			}
		}
	} // L: 228

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lmo;I)I",
		garbageValue = "1974446407"
	)
	static int method469(Widget var0) {
		if (var0.type != 11) { // L: 1558
			Interpreter.Interpreter_stringStack[class156.Interpreter_stringStackSize - 1] = ""; // L: 1559
			return 1; // L: 1560
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 1562
			Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var0.method6570(var1); // L: 1563
			return 1; // L: 1564
		}
	}
}
