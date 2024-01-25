import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
public class class388 {
	@ObfuscatedName("aq")
	@Export("SpriteBuffer_yOffsets")
	static int[] SpriteBuffer_yOffsets;

	static {
		new HashMap();
	} // L: 9

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luo;II)V",
		garbageValue = "632783225"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 72
		Players.Players_pendingUpdateCount = 0; // L: 73
		int var3 = 0; // L: 75
		var0.importIndex(); // L: 76

		byte[] var10000;
		int var4;
		int var6;
		int var8;
		int var9;
		int var10;
		for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 77
			var10 = Players.Players_indices[var4]; // L: 78
			if ((Players.field1355[var10] & 1) == 0) { // L: 79
				if (var3 > 0) { // L: 80
					--var3; // L: 81
					var10000 = Players.field1355; // L: 82
					var10000[var10] = (byte)(var10000[var10] | 2);
				} else {
					var6 = var0.readBits(1); // L: 85
					if (var6 == 0) { // L: 86
						var8 = var0.readBits(2); // L: 89
						if (var8 == 0) { // L: 91
							var9 = 0;
						} else if (var8 == 1) { // L: 92
							var9 = var0.readBits(5);
						} else if (var8 == 2) { // L: 93
							var9 = var0.readBits(8);
						} else {
							var9 = var0.readBits(11); // L: 94
						}

						var3 = var9; // L: 97
						var10000 = Players.field1355; // L: 98
						var10000[var10] = (byte)(var10000[var10] | 2);
					} else {
						class513.readPlayerUpdate(var0, var10); // L: 101
					}
				}
			}
		}

		var0.exportIndex(); // L: 104
		if (var3 != 0) { // L: 105
			throw new RuntimeException(); // L: 106
		} else {
			var0.importIndex(); // L: 108

			for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 109
				var10 = Players.Players_indices[var4]; // L: 110
				if ((Players.field1355[var10] & 1) != 0) { // L: 111
					if (var3 > 0) { // L: 112
						--var3; // L: 113
						var10000 = Players.field1355; // L: 114
						var10000[var10] = (byte)(var10000[var10] | 2);
					} else {
						var6 = var0.readBits(1); // L: 117
						if (var6 == 0) { // L: 118
							var8 = var0.readBits(2); // L: 121
							if (var8 == 0) { // L: 123
								var9 = 0;
							} else if (var8 == 1) { // L: 124
								var9 = var0.readBits(5);
							} else if (var8 == 2) { // L: 125
								var9 = var0.readBits(8);
							} else {
								var9 = var0.readBits(11); // L: 126
							}

							var3 = var9; // L: 129
							var10000 = Players.field1355; // L: 130
							var10000[var10] = (byte)(var10000[var10] | 2);
						} else {
							class513.readPlayerUpdate(var0, var10); // L: 133
						}
					}
				}
			}

			var0.exportIndex(); // L: 136
			if (var3 != 0) { // L: 137
				throw new RuntimeException(); // L: 138
			} else {
				var0.importIndex(); // L: 140

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 141
					var10 = Players.Players_emptyIndices[var4]; // L: 142
					if ((Players.field1355[var10] & 1) != 0) { // L: 143
						if (var3 > 0) { // L: 144
							--var3; // L: 145
							var10000 = Players.field1355; // L: 146
							var10000[var10] = (byte)(var10000[var10] | 2);
						} else {
							var6 = var0.readBits(1); // L: 149
							if (var6 == 0) { // L: 150
								var8 = var0.readBits(2); // L: 153
								if (var8 == 0) { // L: 155
									var9 = 0;
								} else if (var8 == 1) { // L: 156
									var9 = var0.readBits(5);
								} else if (var8 == 2) { // L: 157
									var9 = var0.readBits(8);
								} else {
									var9 = var0.readBits(11); // L: 158
								}

								var3 = var9; // L: 161
								var10000 = Players.field1355; // L: 162
								var10000[var10] = (byte)(var10000[var10] | 2);
							} else if (Players.updateExternalPlayer(var0, var10)) { // L: 165
								var10000 = Players.field1355;
								var10000[var10] = (byte)(var10000[var10] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 168
				if (var3 != 0) { // L: 169
					throw new RuntimeException(); // L: 170
				} else {
					var0.importIndex(); // L: 172

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 173
						var10 = Players.Players_emptyIndices[var4]; // L: 174
						if ((Players.field1355[var10] & 1) == 0) { // L: 175
							if (var3 > 0) { // L: 176
								--var3; // L: 177
								var10000 = Players.field1355; // L: 178
								var10000[var10] = (byte)(var10000[var10] | 2);
							} else {
								var6 = var0.readBits(1); // L: 181
								if (var6 == 0) { // L: 182
									var8 = var0.readBits(2); // L: 185
									if (var8 == 0) { // L: 187
										var9 = 0;
									} else if (var8 == 1) { // L: 188
										var9 = var0.readBits(5);
									} else if (var8 == 2) { // L: 189
										var9 = var0.readBits(8);
									} else {
										var9 = var0.readBits(11); // L: 190
									}

									var3 = var9; // L: 193
									var10000 = Players.field1355; // L: 194
									var10000[var10] = (byte)(var10000[var10] | 2);
								} else if (Players.updateExternalPlayer(var0, var10)) { // L: 197
									var10000 = Players.field1355;
									var10000[var10] = (byte)(var10000[var10] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 200
					if (var3 != 0) { // L: 201
						throw new RuntimeException(); // L: 202
					} else {
						Players.Players_count = 0; // L: 204
						Players.Players_emptyIdxCount = 0; // L: 205

						for (var4 = 1; var4 < 2048; ++var4) { // L: 206
							var10000 = Players.field1355; // L: 207
							var10000[var4] = (byte)(var10000[var4] >> 1);
							Player var5 = Client.players[var4]; // L: 208
							if (var5 != null) { // L: 209
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4; // L: 210
							}
						}

						SoundSystem.method877(var0); // L: 213
						if (var0.offset - var2 != var1) { // L: 214
							throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 215
						}
					}
				}
			}
		}
	} // L: 217
}
