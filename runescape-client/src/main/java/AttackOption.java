import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("AttackOption")
public enum AttackOption implements MouseWheel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	field1228(2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	field1226(4);

	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -495870189
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)Lei;",
		garbageValue = "99"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkz;I)I",
		garbageValue = "-640916313"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length();
		int var4 = var1.length();
		int var5 = 0;
		int var6 = 0;
		char var7 = 0;
		char var8 = 0;

		while (var5 - var7 < var3 || var6 - var8 < var4) {
			if (var5 - var7 >= var3) {
				return -1;
			}

			if (var6 - var8 >= var4) {
				return 1;
			}

			char var9;
			if (var7 != 0) {
				var9 = var7;
				boolean var14 = false;
			} else {
				var9 = var0.charAt(var5++);
			}

			char var10;
			if (var8 != 0) {
				var10 = var8;
				boolean var15 = false;
			} else {
				var10 = var1.charAt(var6++);
			}

			var7 = class28.method399(var9);
			var8 = class28.method399(var10);
			var9 = class317.standardizeChar(var9, var2);
			var10 = class317.standardizeChar(var10, var2);
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var9 != var10) {
					return WallDecoration.lowercaseChar(var9, var2) - WallDecoration.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4);

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17;
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var11 = var0.charAt(var5);
			var12 = var1.charAt(var6);
			if (var12 != var11 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
				var11 = Character.toLowerCase(var11);
				var12 = Character.toLowerCase(var12);
				if (var12 != var11) {
					return WallDecoration.lowercaseChar(var11, var2) - WallDecoration.lowercaseChar(var12, var2);
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) {
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) {
				var12 = var0.charAt(var18);
				char var13 = var1.charAt(var18);
				if (var12 != var13) {
					return WallDecoration.lowercaseChar(var12, var2) - WallDecoration.lowercaseChar(var13, var2);
				}
			}

			return 0;
		}
	}

	@ObfuscatedName("w")
	static final void method2308(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1018671860"
	)
	static void method2297(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1);
		NetFileRequest var4 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var2);
		if (var4 != null) {
			NetCache.NetCache_pendingWritesQueue.addLast(var4);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "91"
	)
	static int method2304(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
