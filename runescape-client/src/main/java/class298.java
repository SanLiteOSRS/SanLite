import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public class class298 {
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(Ldi;II)V",
		garbageValue = "-2052019601"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var4;
		int var9;
		if (var0.spotAnimation >= Client.cycle) { // L: 4146
			int var2 = Math.max(1, var0.spotAnimation - Client.cycle); // L: 4147
			var9 = var0.field1155 * 1292107776 + var0.field1203 * 128; // L: 4148
			var4 = var0.field1155 * 1292107776 + var0.field1205 * 128; // L: 4149
			var0.x += (var9 - var0.x) / var2; // L: 4150
			var0.y += (var4 - var0.y) / var2; // L: 4151
			var0.field1225 = 0; // L: 4152
			var0.orientation = var0.field1209; // L: 4153
		} else if (var0.field1208 >= Client.cycle) { // L: 4155
			boolean var10 = var0.field1208 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0; // L: 4156
			if (!var10) { // L: 4157
				SequenceDefinition var3 = WorldMapLabelSize.SequenceDefinition_get(var0.sequence); // L: 4158
				if (var3 != null && !var3.isCachedModelIdSet()) { // L: 4159
					var10 = var0.sequenceFrameCycle + 1 > var3.frameLengths[var0.sequenceFrame]; // L: 4163
				} else {
					var10 = true; // L: 4160
				}
			}

			if (var10) { // L: 4166
				var9 = var0.field1208 - var0.spotAnimation; // L: 4167
				var4 = Client.cycle - var0.spotAnimation; // L: 4168
				int var5 = var0.field1155 * 1292107776 + var0.field1203 * 128; // L: 4169
				int var6 = var0.field1155 * 1292107776 + var0.field1205 * 128; // L: 4170
				int var7 = var0.field1155 * 1292107776 + var0.field1173 * 128; // L: 4171
				int var8 = var0.field1155 * 1292107776 + var0.field1206 * 128; // L: 4172
				var0.x = (var4 * var7 + var5 * (var9 - var4)) / var9; // L: 4173
				var0.y = (var8 * var4 + var6 * (var9 - var4)) / var9; // L: 4174
			}

			var0.field1225 = 0; // L: 4176
			var0.orientation = var0.field1209; // L: 4177
			var0.rotation = var0.orientation; // L: 4178
		} else {
			Clock.method3550(var0); // L: 4180
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4181
			var0.sequence = -1; // L: 4182
			var0.spotAnimation = 0; // L: 4183
			var0.field1208 = 0; // L: 4184
			var0.method2365(); // L: 4185
			var0.x = var0.field1155 * 1292107776 + var0.pathX[0] * 128; // L: 4186
			var0.y = var0.field1155 * 1292107776 + var0.pathY[0] * 128; // L: 4187
			var0.method2364(); // L: 4188
		}

		if (Projectile.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4190 4191
			var0.sequence = -1; // L: 4192
			var0.spotAnimation = 0; // L: 4193
			var0.field1208 = 0; // L: 4194
			var0.method2365(); // L: 4195
			var0.x = var0.field1155 * 1292107776 + var0.pathX[0] * 128; // L: 4196
			var0.y = var0.field1155 * 1292107776 + var0.pathY[0] * 128; // L: 4197
			var0.method2364(); // L: 4198
		}

		PcmPlayer.method797(var0); // L: 4201
		class104.method2671(var0); // L: 4202
	} // L: 4203
}
