import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vx")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("az")
	@Export("name")
	String name;
	@ObfuscatedName("ah")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ltr;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 98
		String var4;
		if (var1 == null) { // L: 102
			var4 = null; // L: 103
		} else {
			label108: {
				int var5 = 0; // L: 106

				int var6;
				for (var6 = var1.length(); var5 < var6 && class226.method4307(var1.charAt(var5)); ++var5) { // L: 107 108
				}

				while (var6 > var5 && class226.method4307(var1.charAt(var6 - 1))) { // L: 109
					--var6;
				}

				int var7 = var6 - var5; // L: 110
				if (var7 >= 1) { // L: 112
					byte var9;
					if (var2 == null) { // L: 116
						var9 = 12; // L: 117
					} else {
						switch(var2.field5114) { // L: 120
						case 4:
							var9 = 20; // L: 125
							break;
						default:
							var9 = 12; // L: 122
						}
					}

					if (var7 <= var9) { // L: 129
						StringBuilder var15 = new StringBuilder(var7); // L: 134

						for (int var17 = var5; var17 < var6; ++var17) { // L: 135
							char var10 = var1.charAt(var17); // L: 136
							boolean var11;
							if (Character.isISOControl(var10)) { // L: 139
								var11 = false; // L: 140
							} else if (class210.isAlphaNumeric(var10)) { // L: 143
								var11 = true; // L: 144
							} else {
								char[] var12 = class513.field5125; // L: 148
								int var13 = 0;

								label75:
								while (true) {
									char var14;
									if (var13 >= var12.length) {
										var12 = class513.field5122; // L: 158

										for (var13 = 0; var13 < var12.length; ++var13) { // L: 159
											var14 = var12[var13]; // L: 160
											if (var14 == var10) { // L: 161
												var11 = true; // L: 162
												break label75; // L: 163
											}
										}

										var11 = false; // L: 167
										break;
									}

									var14 = var12[var13]; // L: 150
									if (var10 == var14) { // L: 151
										var11 = true; // L: 152
										break; // L: 153
									}

									++var13; // L: 149
								}
							}

							if (var11) { // L: 169
								char var16 = LoginType.method8998(var10); // L: 170
								if (var16 != 0) { // L: 171
									var15.append(var16); // L: 172
								}
							}
						}

						if (var15.length() == 0) { // L: 174
							var4 = null; // L: 175
						} else {
							var4 = var15.toString(); // L: 178
						}
						break label108;
					}
				}

				var4 = null; // L: 131
			}
		}

		this.cleanName = var4; // L: 180
	} // L: 181

	public Username(String var1) {
		this.name = var1; // L: 11
		LoginType var4 = LoginType.oldscape; // L: 14
		String var3;
		if (var1 == null) { // L: 16
			var3 = null; // L: 17
		} else {
			label108: {
				int var5 = 0; // L: 20

				int var6;
				for (var6 = var1.length(); var5 < var6 && class226.method4307(var1.charAt(var5)); ++var5) { // L: 21 22
				}

				while (var6 > var5 && class226.method4307(var1.charAt(var6 - 1))) { // L: 23
					--var6;
				}

				int var7 = var6 - var5; // L: 24
				if (var7 >= 1) { // L: 26
					byte var9;
					if (var4 == null) { // L: 30
						var9 = 12; // L: 31
					} else {
						switch(var4.field5114) { // L: 34
						case 4:
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
							} else if (class210.isAlphaNumeric(var10)) { // L: 57
								var11 = true; // L: 58
							} else {
								char[] var12 = class513.field5125; // L: 62
								int var13 = 0;

								label75:
								while (true) {
									char var14;
									if (var13 >= var12.length) {
										var12 = class513.field5122; // L: 72

										for (var13 = 0; var13 < var12.length; ++var13) { // L: 73
											var14 = var12[var13]; // L: 74
											if (var14 == var10) { // L: 75
												var11 = true; // L: 76
												break label75; // L: 77
											}
										}

										var11 = false; // L: 81
										break;
									}

									var14 = var12[var13]; // L: 64
									if (var14 == var10) { // L: 65
										var11 = true; // L: 66
										break; // L: 67
									}

									++var13; // L: 63
								}
							}

							if (var11) { // L: 83
								char var16 = LoginType.method8998(var10); // L: 84
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
						break label108;
					}
				}

				var3 = null; // L: 45
			}
		}

		this.cleanName = var3; // L: 94
	} // L: 95

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "847884069"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 184
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2010003749"
	)
	public String method9893() {
		return this.cleanName; // L: 188
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1523802503"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 192
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvx;I)I",
		garbageValue = "-734248268"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) { // L: 219
			return var1.cleanName == null ? 0 : 1; // L: 220 221
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName); // L: 223 224
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) { // L: 197
			Username var2 = (Username)var1; // L: 198
			if (this.cleanName == null) {
				return var2.cleanName == null; // L: 199
			} else if (var2.cleanName == null) { // L: 200
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName); // L: 201 202
			}
		} else {
			return false; // L: 204
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode(); // L: 209 210
	}

	public String toString() {
		return this.getName(); // L: 215
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 228
	}
}
