import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("fq")
public class class143 extends class144 {
	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	@Export("friendsChatManager")
	static FriendsChatManager friendsChatManager;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1582781707
	)
	int field1675;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class143(class147 var1) {
		this.this$0 = var1;
		this.field1675 = -1; // L: 114
	} // L: 116

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1253598633"
	)
	void vmethod3420(Buffer var1) {
		this.field1675 = var1.readUnsignedShort(); // L: 119
	} // L: 120

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;B)V",
		garbageValue = "-123"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3290(this.field1675); // L: 123
	} // L: 124

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;B)[F",
		garbageValue = "11"
	)
	static float[] method3147(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4]; // L: 277

		try {
			JSONArray var3 = var0.getJSONArray(var1); // L: 279
			var2[0] = (float)var3.optDouble(0, 0.0D); // L: 280
			var2[1] = (float)var3.optDouble(1, 0.0D); // L: 281
			var2[2] = (float)var3.optDouble(2, 1.0D); // L: 282
			var2[3] = (float)var3.optDouble(3, 1.0D); // L: 283
		} catch (JSONException var4) { // L: 285
			var2[0] = 0.0F; // L: 286
			var2[1] = 0.0F; // L: 287
			var2[2] = 1.0F; // L: 288
			var2[3] = 1.0F; // L: 289
		}

		return var2; // L: 291
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "([Lnt;IS)V",
		garbageValue = "32722"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 12286
			Widget var3 = var0[var2]; // L: 12287
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class430.isComponentHidden(var3))) { // L: 12288 12289 12290
				int var5;
				if (var3.type == 0) { // L: 12291
					if (!var3.isIf3 && class430.isComponentHidden(var3) && var3 != ModelData0.mousedOverWidgetIf1) { // L: 12292
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 12293
					if (var3.children != null) { // L: 12294
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 12295
					if (var4 != null) { // L: 12296
						var5 = var4.group; // L: 12297
						if (class243.field2620.method6285(var5)) { // L: 12299
							drawModelComponents(class243.field2620.field3645[var5], -1); // L: 12300
						}
					}
				}

				if (var3.type == 6) { // L: 12304
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 12305
						boolean var8 = SoundSystem.runCs1(var3); // L: 12306
						if (var8) { // L: 12308
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 12309
						}

						if (var5 != -1) { // L: 12310
							SequenceDefinition var6 = DevicePcmPlayerProvider.SequenceDefinition_get(var5); // L: 12311
							if (!var6.isCachedModelIdSet()) { // L: 12312
								for (var3.modelFrameCycle += Client.field545; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; WorldMapData_0.invalidateWidget(var3)) { // L: 12313 12314 12321
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 12315
									++var3.modelFrame; // L: 12316
									if (var3.modelFrame >= var6.frameIds.length) { // L: 12317
										var3.modelFrame -= var6.frameCount; // L: 12318
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 12319
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.field545; // L: 12325
								int var7 = var6.method4232(); // L: 12326
								if (var3.modelFrame >= var7) { // L: 12327
									var3.modelFrame -= var6.frameCount; // L: 12328
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) { // L: 12329
										var3.modelFrame = 0;
									}
								}

								WorldMapData_0.invalidateWidget(var3); // L: 12331
							}
						}
					}

					if (var3.field3737 != 0 && !var3.isIf3) { // L: 12335
						int var9 = var3.field3737 >> 16; // L: 12336
						var5 = var3.field3737 << 16 >> 16; // L: 12337
						var9 *= Client.field545; // L: 12338
						var5 *= Client.field545; // L: 12339
						var3.modelAngleX = var9 + var3.modelAngleX & 2047; // L: 12340
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 12341
						WorldMapData_0.invalidateWidget(var3); // L: 12342
					}
				}
			}
		}

	} // L: 12346
}
