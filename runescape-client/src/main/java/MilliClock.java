import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	public static class388 field2352;
	@ObfuscatedName("ak")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("aq")
	long[] field2353;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 476101663
	)
	int field2351;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1855746457
	)
	int field2348;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -9122481072101471877L
	)
	long field2349;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -988131973
	)
	int field2350;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1508861897
	)
	int field2346;

	MilliClock() {
		this.field2353 = new long[10]; // L: 7
		this.field2351 = 256; // L: 15
		this.field2348 = 1; // L: 16
		this.field2350 = 0; // L: 17
		this.field2349 = SecureRandomCallable.method2320(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2353[var1] = this.field2349; // L: 20
		}

	} // L: 22

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "481365769"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field2353[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-29"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2351; // L: 31
		int var4 = this.field2348; // L: 32
		this.field2351 = 300; // L: 33
		this.field2348 = 1; // L: 34
		this.field2349 = SecureRandomCallable.method2320(); // L: 35
		if (this.field2353[this.field2346] == 0L) { // L: 36
			this.field2351 = var3; // L: 37
			this.field2348 = var4; // L: 38
		} else if (this.field2349 > this.field2353[this.field2346]) { // L: 40
			this.field2351 = (int)((long)(var1 * 2560) / (this.field2349 - this.field2353[this.field2346]));
		}

		if (this.field2351 < 25) { // L: 41
			this.field2351 = 25;
		}

		if (this.field2351 > 256) { // L: 42
			this.field2351 = 256; // L: 43
			this.field2348 = (int)((long)var1 - (this.field2349 - this.field2353[this.field2346]) / 10L); // L: 44
		}

		if (this.field2348 > var1) { // L: 46
			this.field2348 = var1;
		}

		this.field2353[this.field2346] = this.field2349; // L: 47
		this.field2346 = (this.field2346 + 1) % 10; // L: 48
		int var5;
		if (this.field2348 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (this.field2353[var5] != 0L) { // L: 51
					this.field2353[var5] += (long)this.field2348;
				}
			}
		}

		if (this.field2348 < var2) {
			this.field2348 = var2;
		}

		class143.method3209((long)this.field2348); // L: 55

		for (var5 = 0; this.field2350 < 256; this.field2350 += this.field2351) {
			++var5;
		}

		this.field2350 &= 255;
		return var5;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lhs;",
		garbageValue = "1405746606"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 52
		if (var1 != null) { // L: 53
			return var1; // L: 54
		} else {
			byte[] var2 = class149.SequenceDefinition_archive.takeFile(12, var0); // L: 56
			var1 = new SequenceDefinition(); // L: 57
			if (var2 != null) { // L: 58
				var1.decode(new Buffer(var2)); // L: 59
			}

			var1.postDecode(); // L: 61
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 62
			return var1; // L: 63
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)[Llq;",
		garbageValue = "53"
	)
	public static class311[] method4249() {
		return new class311[]{class311.field3284, class311.field3275, class311.field3276, class311.field3277, class311.field3278, class311.field3279, class311.field3286, class311.field3285, class311.field3282, class311.field3281, class311.field3287, class311.field3280}; // L: 19
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIII)V",
		garbageValue = "-584845785"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (VarpDefinition.localPlayer != var0) { // L: 10563
			if (Client.menuOptionsCount < 400) { // L: 10564
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 10566
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 10567
					var7 = var0.combatLevel; // L: 10569
					int var8 = VarpDefinition.localPlayer.combatLevel; // L: 10570
					int var9 = var8 - var7; // L: 10572
					String var6;
					if (var9 < -9) { // L: 10573
						var6 = class370.colorStartTag(16711680); // L: 10574
					} else if (var9 < -6) { // L: 10577
						var6 = class370.colorStartTag(16723968); // L: 10578
					} else if (var9 < -3) { // L: 10581
						var6 = class370.colorStartTag(16740352); // L: 10582
					} else if (var9 < 0) { // L: 10585
						var6 = class370.colorStartTag(16756736); // L: 10586
					} else if (var9 > 9) { // L: 10589
						var6 = class370.colorStartTag(65280); // L: 10590
					} else if (var9 > 6) { // L: 10593
						var6 = class370.colorStartTag(4259584); // L: 10594
					} else if (var9 > 3) { // L: 10597
						var6 = class370.colorStartTag(8453888); // L: 10598
					} else if (var9 > 0) { // L: 10601
						var6 = class370.colorStartTag(12648192); // L: 10602
					} else {
						var6 = class370.colorStartTag(16776960); // L: 10605
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 10607
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 10609
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 10610
					UrlRequest.insertMenuItemNoShift("Use", Client.field822 + " " + "->" + " " + class370.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 10611
				} else if (Client.isSpellSelected) { // L: 10614
					if ((class128.field1520 & 8) == 8) { // L: 10615
						UrlRequest.insertMenuItemNoShift(Client.field696, Client.field574 + " " + "->" + " " + class370.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 10616
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 10621
						if (Client.playerMenuActions[var10] != null) { // L: 10622
							short var11 = 0; // L: 10623
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 10624
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) { // L: 10625
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > VarpDefinition.localPlayer.combatLevel) { // L: 10626
									var11 = 2000; // L: 10627
								}

								if (VarpDefinition.localPlayer.team != 0 && var0.team != 0) { // L: 10629
									if (var0.team == VarpDefinition.localPlayer.team) { // L: 10630
										var11 = 2000;
									} else {
										var11 = 0; // L: 10631
									}
								} else if (AttackOption.field1362 == Client.playerAttackOption && var0.isClanMember()) { // L: 10633
									var11 = 2000; // L: 10634
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 10637
								var11 = 2000;
							}

							boolean var12 = false; // L: 10638
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 10639
							UrlRequest.insertMenuItemNoShift(Client.playerMenuActions[var10], class370.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 10640
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 10645
					if (Client.menuOpcodes[var10] == 23) { // L: 10646
						Client.menuTargets[var10] = class370.colorStartTag(16777215) + var4; // L: 10647
						break;
					}
				}

			}
		}
	} // L: 10651
}
