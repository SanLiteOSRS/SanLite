import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vj")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("at")
	@Export("name")
	String name;
	@ObfuscatedName("ah")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ltt;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 98
		this.cleanName = class14.method180(var1, var2); // L: 99
	} // L: 100

	public Username(String var1) {
		this.name = var1; // L: 11
		LoginType var4 = LoginType.oldscape; // L: 14
		String var3;
		if (var1 == null) { // L: 16
			var3 = null; // L: 17
		} else {
			label109: {
				int var5 = 0; // L: 20

				int var6;
				for (var6 = var1.length(); var5 < var6 && class489.method8666(var1.charAt(var5)); ++var5) { // L: 21 22
				}

				while (var6 > var5 && class489.method8666(var1.charAt(var6 - 1))) { // L: 23
					--var6;
				}

				int var7 = var6 - var5; // L: 24
				if (var7 >= 1) { // L: 26
					byte var9;
					if (var4 == null) { // L: 30
						var9 = 12; // L: 31
					} else {
						switch(var4.field5022) { // L: 34
						case 1:
							var9 = 20; // L: 39
							break;
						default:
							var9 = 12; // L: 36
						}
					}

					if (var7 <= var9) { // L: 43
						StringBuilder var15 = new StringBuilder(var7); // L: 48

						for (int var17 = var5; var17 < var6; ++var17) { // L: 49
							char var10 = var1.charAt(var17); // L: 50
							boolean var11;
							if (Character.isISOControl(var10)) { // L: 53
								var11 = false; // L: 54
							} else if (class25.isAlphaNumeric(var10)) { // L: 57
								var11 = true; // L: 58
							} else {
								char[] var12 = class505.field5030; // L: 62
								int var13 = 0;

								label76:
								while (true) {
									char var14;
									if (var13 >= var12.length) {
										var12 = class505.field5031; // L: 72

										for (var13 = 0; var13 < var12.length; ++var13) { // L: 73
											var14 = var12[var13]; // L: 74
											if (var14 == var10) { // L: 75
												var11 = true; // L: 76
												break label76; // L: 77
											}
										}

										var11 = false; // L: 81
										break;
									}

									var14 = var12[var13]; // L: 64
									if (var10 == var14) { // L: 65
										var11 = true; // L: 66
										break; // L: 67
									}

									++var13; // L: 63
								}
							}

							if (var11) { // L: 83
								char var16 = FriendsChatManager.method8113(var10); // L: 84
								if (var16 != 0) { // L: 85
									var15.append(var16); // L: 86
								}
							}
						}

						if (var15.length() == 0) { // L: 88
							var3 = null; // L: 89
						} else {
							var3 = var15.toString(); // L: 92
						}
						break label109;
					}
				}

				var3 = null; // L: 45
			}
		}

		this.cleanName = var3; // L: 94
	} // L: 95

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "8"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 103
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1344600615"
	)
	public String method9937() {
		return this.cleanName; // L: 107
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "19"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 111
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)I",
		garbageValue = "1848187995"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) { // L: 138
			return var1.cleanName == null ? 0 : 1; // L: 139 140
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName); // L: 142 143
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) { // L: 116
			Username var2 = (Username)var1; // L: 117
			if (this.cleanName == null) {
				return var2.cleanName == null; // L: 118
			} else if (var2.cleanName == null) { // L: 119
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName); // L: 120 121
			}
		} else {
			return false; // L: 123
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode(); // L: 128 129
	}

	public String toString() {
		return this.getName(); // L: 134
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 147
	}
}
