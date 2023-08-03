import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
public class class85 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;II)V",
		garbageValue = "2138211638"
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
		int var7;
		for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 77
			var7 = Players.Players_indices[var4]; // L: 78
			if ((Players.field1362[var7] & 1) == 0) { // L: 79
				if (var3 > 0) { // L: 80
					--var3; // L: 81
					var10000 = Players.field1362; // L: 82
					var10000[var7] = (byte)(var10000[var7] | 2);
				} else {
					var6 = var0.readBits(1); // L: 85
					if (var6 == 0) { // L: 86
						var3 = class141.method3120(var0); // L: 87
						var10000 = Players.field1362; // L: 88
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						GrandExchangeOfferNameComparator.readPlayerUpdate(var0, var7); // L: 91
					}
				}
			}
		}

		var0.exportIndex(); // L: 94
		if (var3 != 0) { // L: 95
			throw new RuntimeException(); // L: 96
		} else {
			var0.importIndex(); // L: 98

			for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 99
				var7 = Players.Players_indices[var4]; // L: 100
				if ((Players.field1362[var7] & 1) != 0) { // L: 101
					if (var3 > 0) { // L: 102
						--var3; // L: 103
						var10000 = Players.field1362; // L: 104
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						var6 = var0.readBits(1); // L: 107
						if (var6 == 0) { // L: 108
							var3 = class141.method3120(var0); // L: 109
							var10000 = Players.field1362; // L: 110
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							GrandExchangeOfferNameComparator.readPlayerUpdate(var0, var7); // L: 113
						}
					}
				}
			}

			var0.exportIndex(); // L: 116
			if (var3 != 0) { // L: 117
				throw new RuntimeException(); // L: 118
			} else {
				var0.importIndex(); // L: 120

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 121
					var7 = Players.Players_emptyIndices[var4]; // L: 122
					if ((Players.field1362[var7] & 1) != 0) { // L: 123
						if (var3 > 0) { // L: 124
							--var3; // L: 125
							var10000 = Players.field1362; // L: 126
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							var6 = var0.readBits(1); // L: 129
							if (var6 == 0) { // L: 130
								var3 = class141.method3120(var0); // L: 131
								var10000 = Players.field1362; // L: 132
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else if (class183.updateExternalPlayer(var0, var7)) { // L: 135
								var10000 = Players.field1362;
								var10000[var7] = (byte)(var10000[var7] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 138
				if (var3 != 0) { // L: 139
					throw new RuntimeException(); // L: 140
				} else {
					var0.importIndex(); // L: 142

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 143
						var7 = Players.Players_emptyIndices[var4]; // L: 144
						if ((Players.field1362[var7] & 1) == 0) { // L: 145
							if (var3 > 0) { // L: 146
								--var3; // L: 147
								var10000 = Players.field1362; // L: 148
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else {
								var6 = var0.readBits(1); // L: 151
								if (var6 == 0) { // L: 152
									var3 = class141.method3120(var0); // L: 153
									var10000 = Players.field1362; // L: 154
									var10000[var7] = (byte)(var10000[var7] | 2);
								} else if (class183.updateExternalPlayer(var0, var7)) { // L: 157
									var10000 = Players.field1362;
									var10000[var7] = (byte)(var10000[var7] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 160
					if (var3 != 0) { // L: 161
						throw new RuntimeException(); // L: 162
					} else {
						Players.Players_count = 0; // L: 164
						Players.Players_emptyIdxCount = 0; // L: 165

						for (var4 = 1; var4 < 2048; ++var4) { // L: 166
							var10000 = Players.field1362; // L: 167
							var10000[var4] = (byte)(var10000[var4] >> 1);
							Player var5 = Client.players[var4]; // L: 168
							if (var5 != null) { // L: 169
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4; // L: 170
							}
						}

						class25.method377(var0); // L: 173
						if (var0.offset - var2 != var1) { // L: 174
							throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 175
						}
					}
				}
			}
		}
	} // L: 177

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Lcx;",
		garbageValue = "1077626874"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 39
		return var2.getMessage(var1); // L: 40
	}
}