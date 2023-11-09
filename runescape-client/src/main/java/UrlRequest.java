import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -513413295
	)
	static int field1404;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 460487335
	)
	static int field1405;
	@ObfuscatedName("at")
	final URL field1407;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1650044907
	)
	volatile int field1403;
	@ObfuscatedName("ax")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1404 = -1;
		field1405 = -2;
	}

	UrlRequest(URL var1) {
		this.field1403 = field1404; // L: 135
		this.field1407 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-57"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1403 != field1404; // L: 143
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-91"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1290466605"
	)
	public String method2833() {
		return this.field1407.toString();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)V",
		garbageValue = "-27"
	)
	static final void method2839(PacketBuffer var0) {
		int var1 = 0; // L: 91
		var0.importIndex(); // L: 92

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 93
			var5 = Players.Players_indices[var2]; // L: 94
			if ((Players.field1330[var5] & 1) == 0) { // L: 95
				if (var1 > 0) { // L: 96
					--var1; // L: 97
					var10000 = Players.field1330; // L: 98
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var4 = var0.readBits(1); // L: 101
					if (var4 == 0) { // L: 102
						var1 = InterfaceParent.method2244(var0); // L: 103
						var10000 = Players.field1330; // L: 104
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						class72.readPlayerUpdate(var0, var5); // L: 107
					}
				}
			}
		}

		var0.exportIndex(); // L: 110
		if (var1 != 0) { // L: 111
			throw new RuntimeException(); // L: 112
		} else {
			var0.importIndex(); // L: 114

			for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 115
				var5 = Players.Players_indices[var2]; // L: 116
				if ((Players.field1330[var5] & 1) != 0) { // L: 117
					if (var1 > 0) { // L: 118
						--var1; // L: 119
						var10000 = Players.field1330; // L: 120
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var4 = var0.readBits(1); // L: 123
						if (var4 == 0) { // L: 124
							var1 = InterfaceParent.method2244(var0); // L: 125
							var10000 = Players.field1330; // L: 126
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							class72.readPlayerUpdate(var0, var5); // L: 129
						}
					}
				}
			}

			var0.exportIndex(); // L: 132
			if (var1 != 0) { // L: 133
				throw new RuntimeException(); // L: 134
			} else {
				var0.importIndex(); // L: 136

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 137
					var5 = Players.Players_emptyIndices[var2]; // L: 138
					if ((Players.field1330[var5] & 1) != 0) { // L: 139
						if (var1 > 0) { // L: 140
							--var1; // L: 141
							var10000 = Players.field1330; // L: 142
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var4 = var0.readBits(1); // L: 145
							if (var4 == 0) { // L: 146
								var1 = InterfaceParent.method2244(var0); // L: 147
								var10000 = Players.field1330; // L: 148
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (UserComparator7.updateExternalPlayer(var0, var5)) { // L: 151
								var10000 = Players.field1330;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 154
				if (var1 != 0) { // L: 155
					throw new RuntimeException(); // L: 156
				} else {
					var0.importIndex(); // L: 158

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 159
						var5 = Players.Players_emptyIndices[var2]; // L: 160
						if ((Players.field1330[var5] & 1) == 0) { // L: 161
							if (var1 > 0) { // L: 162
								--var1; // L: 163
								var10000 = Players.field1330; // L: 164
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var4 = var0.readBits(1); // L: 167
								if (var4 == 0) { // L: 168
									var1 = InterfaceParent.method2244(var0); // L: 169
									var10000 = Players.field1330; // L: 170
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (UserComparator7.updateExternalPlayer(var0, var5)) { // L: 173
									var10000 = Players.field1330;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 176
					if (var1 != 0) { // L: 177
						throw new RuntimeException(); // L: 178
					} else {
						Players.Players_count = 0; // L: 180
						Players.Players_emptyIdxCount = 0; // L: 181

						for (var2 = 1; var2 < 2048; ++var2) { // L: 182
							var10000 = Players.field1330; // L: 183
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2]; // L: 184
							if (var3 != null) { // L: 185
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2; // L: 186
							}
						}

					}
				}
			}
		}
	} // L: 188
}
