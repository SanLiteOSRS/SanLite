import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class174 {
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 277232791
	)
	static int field1833;

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1751113687"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3207, Client.packetWriter.isaacCipher); // L: 10180
		var2.packetBuffer.writeShort(var1); // L: 10181
		var2.packetBuffer.method9423(var0); // L: 10182
		Client.packetWriter.addNode(var2); // L: 10183
	} // L: 10184

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1678554385"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 11096

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 11097
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 11098
		}

		if (var1.length() > 9) { // L: 11100
			return " " + Client.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + Client.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + Client.colorStartTag(16776960) + var1 + "</col>"; // L: 11101 11102
		}
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "([Lnm;II)V",
		garbageValue = "-1247730840"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 12168
			Widget var3 = var0[var2]; // L: 12169
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !CollisionMap.isComponentHidden(var3))) { // L: 12170 12171 12172
				if (var3.type == 0) { // L: 12173
					if (!var3.isIf3 && CollisionMap.isComponentHidden(var3) && var3 != class64.mousedOverWidgetIf1) { // L: 12174
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 12175
					if (var3.children != null) { // L: 12176
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 12177
					if (var4 != null) { // L: 12178
						class178.method3552(var4.group);
					}
				}

				if (var3.type == 6) { // L: 12180
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 12181
						boolean var8 = UserComparator9.runCs1(var3); // L: 12182
						if (var8) { // L: 12184
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 12185
						}

						if (var5 != -1) { // L: 12186
							SequenceDefinition var6 = class36.SequenceDefinition_get(var5); // L: 12187
							if (!var6.isCachedModelIdSet()) { // L: 12188
								for (var3.modelFrameCycle += Client.field709; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; ClanChannelMember.invalidateWidget(var3)) { // L: 12189 12190 12197
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 12191
									++var3.modelFrame; // L: 12192
									if (var3.modelFrame >= var6.frameIds.length) { // L: 12193
										var3.modelFrame -= var6.frameCount; // L: 12194
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 12195
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.field709; // L: 12201
								int var7 = var6.method4177(); // L: 12202
								if (var3.modelFrame >= var7) { // L: 12203
									var3.modelFrame -= var6.frameCount; // L: 12204
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) { // L: 12205
										var3.modelFrame = 0;
									}
								}

								ClanChannelMember.invalidateWidget(var3); // L: 12207
							}
						}
					}

					if (var3.field3733 != 0 && !var3.isIf3) { // L: 12211
						int var9 = var3.field3733 >> 16; // L: 12212
						var5 = var3.field3733 << 16 >> 16; // L: 12213
						var9 *= Client.field709; // L: 12214
						var5 *= Client.field709; // L: 12215
						var3.modelAngleX = var9 + var3.modelAngleX & 2047; // L: 12216
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 12217
						ClanChannelMember.invalidateWidget(var3); // L: 12218
					}
				}
			}
		}

	} // L: 12222

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "512465925"
	)
	static void method3513() {
		if (Client.oculusOrbState == 1) { // L: 12836
			Client.field618 = true; // L: 12837
		}

	} // L: 12839
}
