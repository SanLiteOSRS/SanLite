import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("h")
	@Export("name")
	String name;
	@ObfuscatedName("e")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lqi;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 79
		String var4;
		if (var1 == null) { // L: 83
			var4 = null; // L: 84
		} else {
			label85: {
				int var5 = 0; // L: 87

				int var6;
				for (var6 = var1.length(); var5 < var6; ++var5) { // L: 88 91 101
					char var8 = var1.charAt(var5); // L: 93
					boolean var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-'; // L: 95
					if (!var7) { // L: 97
						break;
					}
				}

				while (var6 > var5 && GrandExchangeOfferOwnWorldComparator.method1212(var1.charAt(var6 - 1))) { // L: 103
					--var6;
				}

				int var13 = var6 - var5; // L: 104
				if (var13 >= 1) { // L: 106
					byte var9;
					if (var2 == null) { // L: 110
						var9 = 12; // L: 111
					} else {
						switch(var2.field4833) { // L: 114
						case 1:
							var9 = 20; // L: 119
							break;
						default:
							var9 = 12; // L: 116
						}
					}

					if (var13 <= var9) { // L: 123
						StringBuilder var12 = new StringBuilder(var13); // L: 128

						for (int var14 = var5; var14 < var6; ++var14) { // L: 129
							char var10 = var1.charAt(var14); // L: 130
							if (RouteStrategy.method4181(var10)) { // L: 131
								char var11 = NameableContainer.method7589(var10); // L: 132
								if (var11 != 0) { // L: 133
									var12.append(var11); // L: 134
								}
							}
						}

						if (var12.length() == 0) { // L: 136
							var4 = null; // L: 137
						} else {
							var4 = var12.toString(); // L: 140
						}
						break label85;
					}
				}

				var4 = null; // L: 125
			}
		}

		this.cleanName = var4; // L: 142
	} // L: 143

	public Username(String var1) {
		this.name = var1; // L: 11
		LoginType var4 = LoginType.oldscape; // L: 14
		String var3;
		if (var1 == null) { // L: 16
			var3 = null; // L: 17
		} else {
			label85: {
				int var5 = 0; // L: 20

				int var6;
				for (var6 = var1.length(); var5 < var6; ++var5) { // L: 21 24 34
					char var8 = var1.charAt(var5); // L: 26
					boolean var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-'; // L: 28
					if (!var7) { // L: 30
						break;
					}
				}

				while (var6 > var5 && GrandExchangeOfferOwnWorldComparator.method1212(var1.charAt(var6 - 1))) { // L: 36
					--var6;
				}

				int var13 = var6 - var5; // L: 37
				if (var13 >= 1) { // L: 39
					byte var9;
					if (var4 == null) { // L: 43
						var9 = 12; // L: 44
					} else {
						switch(var4.field4833) { // L: 47
						case 1:
							var9 = 20; // L: 49
							break; // L: 50
						default:
							var9 = 12; // L: 52
						}
					}

					if (var13 <= var9) { // L: 56
						StringBuilder var12 = new StringBuilder(var13); // L: 61

						for (int var14 = var5; var14 < var6; ++var14) { // L: 62
							char var10 = var1.charAt(var14); // L: 63
							if (RouteStrategy.method4181(var10)) { // L: 64
								char var11 = NameableContainer.method7589(var10); // L: 65
								if (var11 != 0) { // L: 66
									var12.append(var11); // L: 67
								}
							}
						}

						if (var12.length() == 0) { // L: 69
							var3 = null; // L: 70
						} else {
							var3 = var12.toString(); // L: 73
						}
						break label85;
					}
				}

				var3 = null; // L: 58
			}
		}

		this.cleanName = var3; // L: 75
	} // L: 76

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1788894577"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 146
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-94"
	)
	public String method9160() {
		return this.cleanName; // L: 150
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-35"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 154
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lrp;B)I",
		garbageValue = "115"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) { // L: 181
			return var1.cleanName == null ? 0 : 1; // L: 182 183
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName); // L: 185 186
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) { // L: 159
			Username var2 = (Username)var1; // L: 160
			if (this.cleanName == null) {
				return var2.cleanName == null; // L: 161
			} else if (var2.cleanName == null) { // L: 162
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName); // L: 163 164
			}
		} else {
			return false; // L: 166
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode(); // L: 171 172
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 190
	}

	public String toString() {
		return this.getName(); // L: 177
	}
}
