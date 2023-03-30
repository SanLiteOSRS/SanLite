import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("ay")
class class13 extends DefaultTlsClient {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Las;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 285
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions(); // L: 288
		if (var1 == null) { // L: 289
			var1 = new Hashtable(); // L: 290
		}

		byte[] var2 = this.this$1.val$host.getBytes(); // L: 292
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(); // L: 293
		DataOutputStream var4 = new DataOutputStream(var3); // L: 294
		var4.writeShort(var2.length + 3); // L: 295
		var4.writeByte(0); // L: 296
		var4.writeShort(var2.length); // L: 297
		var4.write(var2); // L: 298
		var4.close(); // L: 299
		var1.put(0, var3.toByteArray()); // L: 300
		return var1; // L: 301
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this); // L: 306
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lhz;",
		garbageValue = "371230407"
	)
	public static FloorOverlayDefinition method160(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0); // L: 30
		if (var1 != null) { // L: 31
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0); // L: 32
			var1 = new FloorOverlayDefinition(); // L: 33
			if (var2 != null) { // L: 34
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 35
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0); // L: 36
			return var1; // L: 37
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "28"
	)
	static boolean method162(String var0) {
		if (var0 == null) { // L: 65
			return false;
		} else {
			try {
				new URL(var0);
				return true; // L: 72
			} catch (MalformedURLException var2) { // L: 69
				return false; // L: 70
			}
		}
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1466811282"
	)
	static int method161() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1569
			int var0 = 0; // L: 1570

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1571
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1572
			}

			return var0 * 10000 / Client.field715; // L: 1574
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(Ldq;B)V",
		garbageValue = "25"
	)
	static final void method154(Actor var0) {
		var0.isWalking = false; // L: 4145
		SequenceDefinition var1;
		int var2;
		if (var0.movementSequence != -1) { // L: 4146
			var1 = Coord.SequenceDefinition_get(var0.movementSequence); // L: 4147
			if (var1 != null) { // L: 4148
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 4149
					++var0.movementFrameCycle; // L: 4150
					if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) { // L: 4151
						var0.movementFrameCycle = 1; // L: 4152
						++var0.movementFrame; // L: 4153
						class10.method91(var1, var0.movementFrame, var0.x, var0.y); // L: 4154
					}

					if (var0.movementFrame >= var1.frameIds.length) { // L: 4156
						if (var1.frameCount > 0) { // L: 4157
							var0.movementFrame -= var1.frameCount; // L: 4158
							if (var1.field2272) { // L: 4159
								++var0.field1181;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field2272 && var0.field1181 >= var1.field2261) { // L: 4160
								var0.movementFrameCycle = 0; // L: 4161
								var0.movementFrame = 0; // L: 4162
								var0.field1181 = 0; // L: 4163
							}
						} else {
							var0.movementFrameCycle = 0; // L: 4167
							var0.movementFrame = 0; // L: 4168
						}

						class10.method91(var1, var0.movementFrame, var0.x, var0.y); // L: 4170
					}
				} else if (var1.isCachedModelIdSet()) { // L: 4173
					++var0.movementFrame; // L: 4174
					var2 = var1.method4015(); // L: 4175
					if (var0.movementFrame < var2) { // L: 4176
						GrandExchangeOfferOwnWorldComparator.method1216(var1, var0.movementFrame, var0.x, var0.y); // L: 4177
					} else {
						if (var1.frameCount > 0) { // L: 4180
							var0.movementFrame -= var1.frameCount; // L: 4181
							if (var1.field2272) { // L: 4182
								++var0.field1181;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field2272 && var0.field1181 >= var1.field2261) { // L: 4183
								var0.movementFrame = 0; // L: 4184
								var0.movementFrameCycle = 0; // L: 4185
								var0.field1181 = 0; // L: 4186
							}
						} else {
							var0.movementFrameCycle = 0; // L: 4190
							var0.movementFrame = 0; // L: 4191
						}

						GrandExchangeOfferOwnWorldComparator.method1216(var1, var0.movementFrame, var0.x, var0.y); // L: 4193
					}
				} else {
					var0.movementSequence = -1; // L: 4196
				}
			} else {
				var0.movementSequence = -1; // L: 4198
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1190) { // L: 4200
			if (var0.spotAnimationFrame < 0) {
				var0.spotAnimationFrame = 0; // L: 4201
			}

			int var4 = DevicePcmPlayerProvider.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 4202
			if (var4 != -1) { // L: 4203
				SequenceDefinition var5 = Coord.SequenceDefinition_get(var4); // L: 4204
				if (var5 != null && var5.frameIds != null && !var5.isCachedModelIdSet()) { // L: 4205
					++var0.field1175; // L: 4206
					if (var0.spotAnimationFrame < var5.frameIds.length && var0.field1175 > var5.frameLengths[var0.spotAnimationFrame]) { // L: 4207
						var0.field1175 = 1; // L: 4208
						++var0.spotAnimationFrame; // L: 4209
						class10.method91(var5, var0.spotAnimationFrame, var0.x, var0.y); // L: 4210
					}

					if (var0.spotAnimationFrame >= var5.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var5.frameIds.length)) { // L: 4212 4213
						var0.spotAnimation = -1;
					}
				} else if (var5.isCachedModelIdSet()) { // L: 4216
					++var0.spotAnimationFrame; // L: 4217
					int var3 = var5.method4015(); // L: 4218
					if (var0.spotAnimationFrame < var3) { // L: 4219
						GrandExchangeOfferOwnWorldComparator.method1216(var5, var0.spotAnimationFrame, var0.x, var0.y); // L: 4220
					} else if (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var3) { // L: 4223
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 4226
				}
			} else {
				var0.spotAnimation = -1; // L: 4228
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4230
			var1 = Coord.SequenceDefinition_get(var0.sequence); // L: 4231
			if (var1.field2277 == 1 && var0.field1215 > 0 && var0.field1196 <= Client.cycle && var0.field1197 < Client.cycle) { // L: 4232 4233
				var0.sequenceDelay = 1; // L: 4234
				return; // L: 4235
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4239
			var1 = Coord.SequenceDefinition_get(var0.sequence); // L: 4240
			if (var1 != null) { // L: 4241
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 4242
					++var0.sequenceFrameCycle; // L: 4243
					if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) { // L: 4244
						var0.sequenceFrameCycle = 1; // L: 4245
						++var0.sequenceFrame; // L: 4246
						class10.method91(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4247
					}

					if (var0.sequenceFrame >= var1.frameIds.length) { // L: 4249
						var0.sequenceFrame -= var1.frameCount; // L: 4250
						++var0.field1186; // L: 4251
						if (var0.field1186 >= var1.field2261) { // L: 4252
							var0.sequence = -1; // L: 4253
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) { // L: 4255
							class10.method91(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4259
						} else {
							var0.sequence = -1; // L: 4256
						}
					}

					var0.isWalking = var1.field2268; // L: 4262
				} else if (var1.isCachedModelIdSet()) { // L: 4264
					++var0.sequenceFrame; // L: 4265
					var2 = var1.method4015(); // L: 4266
					if (var0.sequenceFrame < var2) { // L: 4267
						GrandExchangeOfferOwnWorldComparator.method1216(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4268
					} else {
						var0.sequenceFrame -= var1.frameCount; // L: 4271
						++var0.field1186; // L: 4272
						if (var0.field1186 >= var1.field2261) { // L: 4273
							var0.sequence = -1; // L: 4274
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2) { // L: 4276
							GrandExchangeOfferOwnWorldComparator.method1216(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4280
						} else {
							var0.sequence = -1; // L: 4277
						}
					}
				} else {
					var0.sequence = -1; // L: 4284
				}
			} else {
				var0.sequence = -1; // L: 4286
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4288
			--var0.sequenceDelay;
		}

	} // L: 4289
}
