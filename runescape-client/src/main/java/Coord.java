import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1160775587
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1700089243
	)
	@Export("x")
	public int x;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -680325577
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lki;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane;
		this.x = var1.x;
		this.y = var1.y; // L: 17
	}

	public Coord(int var1, int var2, int var3) {
		this.plane = var1; // L: 9
		this.x = var2; // L: 10
		this.y = var3; // L: 11
	}

	public Coord(int var1) {
		if (var1 == -1) {
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3;
			this.x = var1 >> 14 & 16383; // L: 24
			this.y = var1 & 16383;
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-282255296"
	)
	@Export("packed")
	public int packed() {
		int var2 = this.plane;
		int var3 = this.x; // L: 32
		int var4 = this.y; // L: 33
		int var1 = var2 << 28 | var3 << 14 | var4; // L: 35
		return var1; // L: 37
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lki;I)Z",
		garbageValue = "1951856036"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) { // L: 48
			return false;
		} else if (this.x != var1.x) {
			return false;
		} else {
			return this.y == var1.y;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "127"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63); // L: 64
	}

	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1);
		}
	}

	public String toString() {
		return this.toString(","); // L: 60
	}

	public int hashCode() {
		return this.packed();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Lov;",
		garbageValue = "-1033948030"
	)
	public static class407 method5706() {
		synchronized(class407.field4563) {
			if (class407.field4565 == 0) {
				return new class407();
			} else {
				class407.field4563[--class407.field4565].method7646();
				return class407.field4563[class407.field4565];
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;IIB)Ljava/lang/String;",
		garbageValue = "-9"
	)
	public static String method5704(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 12
			return "";
		} else if (var2 == 1) { // L: 13
			CharSequence var10 = var0[var1]; // L: 14
			return var10 == null ? "null" : var10.toString(); // L: 15 16
		} else {
			int var3 = var2 + var1; // L: 18
			int var4 = 0; // L: 19

			for (int var5 = var1; var5 < var3; ++var5) { // L: 20
				CharSequence var9 = var0[var5]; // L: 21
				if (var9 == null) { // L: 22
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 23
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 25

			for (int var6 = var1; var6 < var3; ++var6) { // L: 26
				CharSequence var7 = var0[var6]; // L: 27
				if (var7 == null) { // L: 28
					var8.append("null");
				} else {
					var8.append(var7); // L: 29
				}
			}

			return var8.toString(); // L: 31
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILob;Llx;B)V",
		garbageValue = "-34"
	)
	static void method5688(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 40
		var3.type = 1; // L: 41
		var3.key = (long)var0; // L: 42
		var3.archiveDisk = var1; // L: 43
		var3.archive = var2; // L: 44
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 45
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 46
		} // L: 47

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 49
			if (ArchiveDiskActionHandler.field4122 == 0) { // L: 50
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 51
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 52
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 53
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 54
			}

			ArchiveDiskActionHandler.field4122 = 600; // L: 56
		}
	} // L: 59

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Lcc;IIII)V",
		garbageValue = "-1785567817"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 10087
		if (Client.menuOptionsCount < 400) { // L: 10088
			if (var4.transforms != null) { // L: 10089
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 10090
				if (var4.isInteractable) { // L: 10091
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 10092
						String var5 = var0.method2492(); // L: 10093
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1212 != 0) { // L: 10094
							var6 = var0.field1212 != -1 ? var0.field1212 : var4.combatLevel; // L: 10095
							var9 = class296.localPlayer.combatLevel; // L: 10098
							int var10 = var9 - var6; // L: 10100
							String var8;
							if (var10 < -9) { // L: 10101
								var8 = GameObject.colorStartTag(16711680); // L: 10102
							} else if (var10 < -6) { // L: 10105
								var8 = GameObject.colorStartTag(16723968); // L: 10106
							} else if (var10 < -3) { // L: 10109
								var8 = GameObject.colorStartTag(16740352); // L: 10110
							} else if (var10 < 0) { // L: 10113
								var8 = GameObject.colorStartTag(16756736); // L: 10114
							} else if (var10 > 9) { // L: 10117
								var8 = GameObject.colorStartTag(65280); // L: 10118
							} else if (var10 > 6) { // L: 10121
								var8 = GameObject.colorStartTag(4259584); // L: 10122
							} else if (var10 > 3) { // L: 10125
								var8 = GameObject.colorStartTag(8453888); // L: 10126
							} else if (var10 > 0) { // L: 10129
								var8 = GameObject.colorStartTag(12648192); // L: 10130
							} else {
								var8 = GameObject.colorStartTag(16776960); // L: 10133
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")"; // L: 10135
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 10137
							class16.insertMenuItemNoShift("Examine", GameObject.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10138
						}

						if (Client.isItemSelected == 1) { // L: 10141
							class16.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + GameObject.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 10142
						} else if (Client.isSpellSelected) { // L: 10145
							if ((UserComparator5.selectedSpellFlags & 2) == 2) { // L: 10146
								class16.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + GameObject.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 10147
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 10152
							String[] var7 = var4.actions; // L: 10153
							int var11;
							if (var7 != null) { // L: 10154
								for (var11 = 4; var11 >= 0; --var11) { // L: 10155
									if (var0.method2511(var11) && var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) { // L: 10156 10157
										var9 = 0; // L: 10158
										if (var11 == 0) { // L: 10159
											var9 = var6 + 9;
										}

										if (var11 == 1) { // L: 10160
											var9 = var6 + 10;
										}

										if (var11 == 2) { // L: 10161
											var9 = var6 + 11;
										}

										if (var11 == 3) { // L: 10162
											var9 = var6 + 12;
										}

										if (var11 == 4) { // L: 10163
											var9 = var6 + 13;
										}

										class16.insertMenuItemNoShift(var7[var11], GameObject.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10164
									}
								}
							}

							if (var7 != null) { // L: 10169
								for (var11 = 4; var11 >= 0; --var11) { // L: 10170
									if (var0.method2511(var11) && var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) { // L: 10171 10172
										short var12 = 0; // L: 10173
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) { // L: 10174
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > class296.localPlayer.combatLevel) { // L: 10175
												var12 = 2000; // L: 10176
											}

											var9 = 0; // L: 10178
											if (var11 == 0) { // L: 10179
												var9 = var12 + 9;
											}

											if (var11 == 1) { // L: 10180
												var9 = var12 + 10;
											}

											if (var11 == 2) { // L: 10181
												var9 = var12 + 11;
											}

											if (var11 == 3) { // L: 10182
												var9 = var12 + 12;
											}

											if (var11 == 4) { // L: 10183
												var9 = var12 + 13;
											}

											class16.insertMenuItemNoShift(var7[var11], GameObject.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10184
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 10189
								class16.insertMenuItemNoShift("Examine", GameObject.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10190
							}
						}

					}
				}
			}
		}
	} // L: 10194
}
