import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vs")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("am")
	@Export("name")
	String name;
	@ObfuscatedName("ap")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lth;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 47
		String var4;
		if (var1 == null) { // L: 51
			var4 = null; // L: 52
		} else {
			int var5 = 0; // L: 55

			int var6;
			for (var6 = var1.length(); var5 < var6 && MilliClock.method4262(var1.charAt(var5)); ++var5) { // L: 56 57
			}

			while (var6 > var5 && MilliClock.method4262(var1.charAt(var6 - 1))) { // L: 58
				--var6;
			}

			int var7 = var6 - var5; // L: 59
			if (var7 >= 1 && var7 <= class332.method6308(var2)) { // L: 60
				StringBuilder var8 = new StringBuilder(var7); // L: 64

				for (int var9 = var5; var9 < var6; ++var9) { // L: 65
					char var10 = var1.charAt(var9); // L: 66
					if (Messages.method2837(var10)) { // L: 67
						char var11 = class385.method7273(var10); // L: 68
						if (var11 != 0) { // L: 69
							var8.append(var11); // L: 70
						}
					}
				}

				if (var8.length() == 0) { // L: 72
					var4 = null; // L: 73
				} else {
					var4 = var8.toString(); // L: 76
				}
			} else {
				var4 = null; // L: 61
			}
		}

		this.cleanName = var4; // L: 78
	} // L: 79

	public Username(String var1) {
		this.name = var1; // L: 11
		LoginType var4 = LoginType.oldscape; // L: 14
		String var3;
		if (var1 == null) { // L: 16
			var3 = null; // L: 17
		} else {
			int var5 = 0; // L: 20

			int var6;
			for (var6 = var1.length(); var5 < var6 && MilliClock.method4262(var1.charAt(var5)); ++var5) { // L: 21 22
			}

			while (var6 > var5 && MilliClock.method4262(var1.charAt(var6 - 1))) { // L: 23
				--var6;
			}

			int var7 = var6 - var5; // L: 24
			if (var7 >= 1 && var7 <= class332.method6308(var4)) { // L: 25
				StringBuilder var8 = new StringBuilder(var7); // L: 29

				for (int var9 = var5; var9 < var6; ++var9) { // L: 30
					char var10 = var1.charAt(var9); // L: 31
					if (Messages.method2837(var10)) { // L: 32
						char var11 = class385.method7273(var10); // L: 33
						if (var11 != 0) { // L: 34
							var8.append(var11); // L: 35
						}
					}
				}

				if (var8.length() == 0) { // L: 37
					var3 = null; // L: 38
				} else {
					var3 = var8.toString(); // L: 41
				}
			} else {
				var3 = null; // L: 26
			}
		}

		this.cleanName = var3; // L: 43
	} // L: 44

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1794179494"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 82
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1874735961"
	)
	public String method10004() {
		return this.cleanName; // L: 86
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "63"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 90
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvs;I)I",
		garbageValue = "162874778"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) { // L: 117
			return var1.cleanName == null ? 0 : 1; // L: 118 119
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName); // L: 121 122
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) { // L: 95
			Username var2 = (Username)var1; // L: 96
			if (this.cleanName == null) {
				return var2.cleanName == null; // L: 97
			} else if (var2.cleanName == null) { // L: 98
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName); // L: 99 100
			}
		} else {
			return false; // L: 102
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode(); // L: 107 108
	}

	public String toString() {
		return this.getName(); // L: 113
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 126
	}
}
