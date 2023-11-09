import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uc")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("au")
	@Export("name")
	String name;
	@ObfuscatedName("ae")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lsl;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 66
		String var4;
		if (var1 == null) { // L: 70
			var4 = null; // L: 71
		} else {
			label71: {
				int var5 = 0; // L: 74

				int var6;
				for (var6 = var1.length(); var5 < var6 && ArchiveDiskActionHandler.method6640(var1.charAt(var5)); ++var5) { // L: 75 76
				}

				while (var6 > var5 && ArchiveDiskActionHandler.method6640(var1.charAt(var6 - 1))) { // L: 77
					--var6;
				}

				int var7 = var6 - var5; // L: 78
				if (var7 >= 1) { // L: 80
					byte var9;
					if (var2 == null) { // L: 84
						var9 = 12; // L: 85
					} else {
						switch(var2.field4988) { // L: 88
						case 0:
							var9 = 20; // L: 93
							break;
						default:
							var9 = 12; // L: 90
						}
					}

					if (var7 <= var9) { // L: 97
						StringBuilder var12 = new StringBuilder(var7); // L: 102

						for (int var13 = var5; var13 < var6; ++var13) { // L: 103
							char var10 = var1.charAt(var13); // L: 104
							if (ClientPreferences.method2555(var10)) { // L: 105
								char var11 = class25.method378(var10); // L: 106
								if (var11 != 0) { // L: 107
									var12.append(var11); // L: 108
								}
							}
						}

						if (var12.length() == 0) { // L: 110
							var4 = null; // L: 111
						} else {
							var4 = var12.toString(); // L: 114
						}
						break label71;
					}
				}

				var4 = null; // L: 99
			}
		}

		this.cleanName = var4; // L: 116
	} // L: 117

	public Username(String var1) {
		this.name = var1; // L: 11
		LoginType var4 = LoginType.oldscape; // L: 14
		String var3;
		if (var1 == null) { // L: 16
			var3 = null; // L: 17
		} else {
			label71: {
				int var5 = 0; // L: 20

				int var6;
				for (var6 = var1.length(); var5 < var6 && ArchiveDiskActionHandler.method6640(var1.charAt(var5)); ++var5) { // L: 21 22
				}

				while (var6 > var5 && ArchiveDiskActionHandler.method6640(var1.charAt(var6 - 1))) { // L: 23
					--var6;
				}

				int var7 = var6 - var5; // L: 24
				if (var7 >= 1) { // L: 26
					byte var9;
					if (var4 == null) { // L: 30
						var9 = 12; // L: 31
					} else {
						switch(var4.field4988) { // L: 34
						case 0:
							var9 = 20; // L: 39
							break;
						default:
							var9 = 12; // L: 36
						}
					}

					if (var7 <= var9) { // L: 43
						StringBuilder var12 = new StringBuilder(var7); // L: 48

						for (int var13 = var5; var13 < var6; ++var13) { // L: 49
							char var10 = var1.charAt(var13); // L: 50
							if (ClientPreferences.method2555(var10)) { // L: 51
								char var11 = class25.method378(var10); // L: 52
								if (var11 != 0) { // L: 53
									var12.append(var11); // L: 54
								}
							}
						}

						if (var12.length() == 0) { // L: 56
							var3 = null; // L: 57
						} else {
							var3 = var12.toString(); // L: 60
						}
						break label71;
					}
				}

				var3 = null; // L: 45
			}
		}

		this.cleanName = var3; // L: 62
	} // L: 63

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1021488493"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 120
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "28"
	)
	public String method9688() {
		return this.cleanName; // L: 124
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-911492900"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 128
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luc;I)I",
		garbageValue = "-2077400310"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) { // L: 155
			return var1.cleanName == null ? 0 : 1; // L: 156 157
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName); // L: 159 160
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) { // L: 133
			Username var2 = (Username)var1; // L: 134
			if (this.cleanName == null) { // L: 135
				return var2.cleanName == null;
			} else if (var2.cleanName == null) { // L: 136
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName); // L: 137 138
			}
		} else {
			return false; // L: 140
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode(); // L: 145 146
	}

	public String toString() {
		return this.getName(); // L: 151
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 164
	}
}
