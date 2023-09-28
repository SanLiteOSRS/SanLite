import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
public class class16 implements ThreadFactory {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	@Export("pcmPlayerProvider")
	public static class51 pcmPlayerProvider;
	@ObfuscatedName("bi")
	static String field91;
	@ObfuscatedName("ac")
	final ThreadGroup field88;
	@ObfuscatedName("al")
	final AtomicInteger field90;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Las;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1;
		this.field90 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field88 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field88, var1, this.this$0.field81 + "-rest-request-" + this.field90.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "-718248289"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 61

		for (int var6 = 0; var6 < var5; ++var6) { // L: 62
			char var7 = var0.charAt(var6 + var1); // L: 63
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 64
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 65
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 66
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 67
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 68
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 69
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 70
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 71
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120; // L: 72
			} else if (var7 == 8240) { // L: 73
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 74
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 75
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 76
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 77
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 78
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 79
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 80
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 81
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 82
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 83
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) { // L: 84
				var3[var6 + var4] = -105;
			} else if (var7 == 732) { // L: 85
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 86
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 87
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 88
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 89
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 90
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 91
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 92
			}
		}

		return var5; // L: 94
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-70585586"
	)
	public static final void method197(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0; // L: 96
		ViewportMouse.ViewportMouse_y = var1; // L: 97
		ViewportMouse.ViewportMouse_isInViewport = true; // L: 98
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 99
		ViewportMouse.ViewportMouse_false0 = false; // L: 100
	} // L: 101

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Ldc;IIII)V",
		garbageValue = "951617823"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 10493
		if (Client.menuOptionsCount < 400) { // L: 10494
			if (var4.transforms != null) { // L: 10495
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 10496
				if (var4.isInteractable) { // L: 10497
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 10498
						String var5 = var0.method2672(); // L: 10499
						int var6;
						if (var4.combatLevel != 0 && var0.field1262 != 0) { // L: 10500
							var6 = var0.field1262 != -1 ? var0.field1262 : var4.combatLevel; // L: 10501
							var5 = var5 + class338.method6257(var6, TextureProvider.localPlayer.combatLevel) + " " + " (" + "level-" + var6 + ")"; // L: 10502
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 10504
							class153.insertMenuItemNoShift("Examine", Client.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10505
						}

						if (Client.isItemSelected == 1) { // L: 10508
							class153.insertMenuItemNoShift("Use", Client.field772 + " " + "->" + " " + Client.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 10509
						} else if (Client.isSpellSelected) { // L: 10512
							if ((class31.field173 & 2) == 2) { // L: 10513
								class153.insertMenuItemNoShift(Client.field751, Client.field688 + " " + "->" + " " + Client.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 10514
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 10519
							String[] var7 = var4.actions; // L: 10520
							int var8;
							int var9;
							if (var7 != null) { // L: 10521
								for (var8 = 4; var8 >= 0; --var8) { // L: 10522
									if (var0.method2623(var8) && var7[var8] != null && !var7[var8].equalsIgnoreCase("Attack")) { // L: 10523 10524
										var9 = 0; // L: 10525
										if (var8 == 0) { // L: 10526
											var9 = var6 + 9;
										}

										if (var8 == 1) { // L: 10527
											var9 = var6 + 10;
										}

										if (var8 == 2) { // L: 10528
											var9 = var6 + 11;
										}

										if (var8 == 3) { // L: 10529
											var9 = var6 + 12;
										}

										if (var8 == 4) { // L: 10530
											var9 = var6 + 13;
										}

										class153.insertMenuItemNoShift(var7[var8], Client.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10531
									}
								}
							}

							if (var7 != null) { // L: 10536
								for (var8 = 4; var8 >= 0; --var8) { // L: 10537
									if (var0.method2623(var8) && var7[var8] != null && var7[var8].equalsIgnoreCase("Attack")) { // L: 10538 10539
										short var10 = 0; // L: 10540
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) { // L: 10541
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > TextureProvider.localPlayer.combatLevel) { // L: 10542
												var10 = 2000; // L: 10543
											}

											var9 = 0; // L: 10545
											if (var8 == 0) { // L: 10546
												var9 = var10 + 9;
											}

											if (var8 == 1) {
												var9 = var10 + 10; // L: 10547
											}

											if (var8 == 2) { // L: 10548
												var9 = var10 + 11;
											}

											if (var8 == 3) { // L: 10549
												var9 = var10 + 12;
											}

											if (var8 == 4) { // L: 10550
												var9 = var10 + 13;
											}

											class153.insertMenuItemNoShift(var7[var8], Client.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10551
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 10556
								class153.insertMenuItemNoShift("Examine", Client.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10557
							}
						}

					}
				}
			}
		}
	} // L: 10561
}
