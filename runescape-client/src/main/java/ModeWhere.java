import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("ModeWhere")
public enum ModeWhere implements Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3686("", 0, new class286[]{class286.field3667}),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3702("", 1, new class286[]{class286.field3668, class286.field3667}),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3699("", 2, new class286[]{class286.field3668, class286.field3671, class286.field3667}),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3698("", 3, new class286[]{class286.field3668}),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3690("", 4),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3687("", 5, new class286[]{class286.field3668, class286.field3667}),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3692("", 6, new class286[]{class286.field3667}),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3693("", 8, new class286[]{class286.field3668, class286.field3667}),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3694("", 9, new class286[]{class286.field3668, class286.field3671}),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3695("", 10, new class286[]{class286.field3668}),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3696("", 11, new class286[]{class286.field3668}),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3697("", 12, new class286[]{class286.field3668, class286.field3667}),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3689("", 13, new class286[]{class286.field3668});

	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 448487515
	)
	@Export("id")
	final int id;
	@ObfuscatedName("e")
	final Set field3700;

	static {
		method5162();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lky;)V"
	)
	ModeWhere(String var3, int var4, class286[] var5) {
		this.field3700 = new HashSet();
		this.id = var4;
		class286[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class286 var8 = var6[var7];
			this.field3700.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field3700 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907662946"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lmr;I)Lmr;",
		garbageValue = "-391561047"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = Player.method2128(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)Lio;",
		garbageValue = "-594011323"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = Frames.getWidget(var0);
		if (var1 == -1) {
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkl;",
		garbageValue = "1537765097"
	)
	static ModeWhere[] method5162() {
		return new ModeWhere[]{field3702, field3695, field3697, field3686, field3699, field3696, field3692, field3687, field3698, field3694, field3690, field3693, field3689};
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Lio;II)I",
		garbageValue = "411912150"
	)
	static final int method5160(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = Frames.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!class260.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = class93.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = Frames.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!class260.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.runEnergy;
					}

					if (var6 == 12) {
						var7 = Client.weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = Skeleton.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = VertexNormal.baseX * 64 + (class93.localPlayer.x >> 7);
					}

					if (var6 == 19) {
						var7 = SoundSystem.baseY * 64 + (class93.localPlayer.y >> 7);
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}
}
