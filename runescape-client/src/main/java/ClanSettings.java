import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("wp")
	@ObfuscatedGetter(
		intValue = 1722699089
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("ay")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("ar")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 3256517989990406667L
	)
	long field1704;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1193316427
	)
	int field1707;
	@ObfuscatedName("aj")
	@Export("name")
	public String name;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -222192347
	)
	int field1709;
	@ObfuscatedName("az")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("av")
	public byte field1712;
	@ObfuscatedName("ap")
	public byte field1706;
	@ObfuscatedName("aq")
	public byte field1713;
	@ObfuscatedName("at")
	public byte field1714;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 573236545
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("ax")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("aa")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("au")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("ae")
	int[] field1719;
	@ObfuscatedName("ab")
	public int[] field1720;
	@ObfuscatedName("ad")
	public boolean[] field1721;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -626375487
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 50961917
	)
	public int field1725;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 646577823
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("an")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("af")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("ai")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Lty;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1707 = 0; // L: 14
		this.name = null; // L: 15
		this.field1709 = 0; // L: 16
		this.currentOwner = -1; // L: 29
		this.field1725 = -1; // L: 30
		this.method3243(var1); // L: 43
	} // L: 44

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-99"
	)
	void method3225(int var1) {
		if (this.useHashes) { // L: 47
			if (this.memberHashes != null) { // L: 48
				System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[var1], 0, this.memberCount);
			} else {
				this.memberHashes = new long[var1]; // L: 49
			}
		}

		if (this.useNames) { // L: 51
			if (this.memberNames != null) { // L: 52
				System.arraycopy(this.memberNames, 0, this.memberNames = new String[var1], 0, this.memberCount);
			} else {
				this.memberNames = new String[var1]; // L: 53
			}
		}

		if (this.memberRanks != null) {
			System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, this.memberCount); // L: 55
		} else {
			this.memberRanks = new byte[var1]; // L: 56
		}

		if (this.field1719 != null) { // L: 57
			System.arraycopy(this.field1719, 0, this.field1719 = new int[var1], 0, this.memberCount);
		} else {
			this.field1719 = new int[var1]; // L: 58
		}

		if (this.field1720 != null) { // L: 59
			System.arraycopy(this.field1720, 0, this.field1720 = new int[var1], 0, this.memberCount);
		} else {
			this.field1720 = new int[var1]; // L: 60
		}

		if (this.field1721 != null) {
			System.arraycopy(this.field1721, 0, this.field1721 = new boolean[var1], 0, this.memberCount); // L: 61
		} else {
			this.field1721 = new boolean[var1]; // L: 62
		}

	} // L: 63

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "27"
	)
	void method3226(int var1) {
		if (this.useHashes) { // L: 66
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount); // L: 67
			} else {
				this.bannedMemberHashes = new long[var1]; // L: 68
			}
		}

		if (this.useNames) { // L: 70
			if (this.bannedMemberNames != null) { // L: 71
				System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberNames = new String[var1]; // L: 72
			}
		}

	} // L: 74

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "0"
	)
	public int method3241(String var1) {
		if (var1 != null && var1.length() != 0) { // L: 77
			for (int var2 = 0; var2 < this.memberCount; ++var2) { // L: 78
				if (this.memberNames[var2].equals(var1)) { // L: 79
					return var2;
				}
			}

			return -1; // L: 81
		} else {
			return -1;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1559681164"
	)
	public int method3270(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1; // L: 85
		return (this.field1719[var1] & var4) >>> var2; // L: 86
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Integer;",
		garbageValue = "-1591193195"
	)
	@Export("getTitleGroupValue")
	public Integer getTitleGroupValue(int var1) {
		if (this.parameters == null) { // L: 90
			return null;
		} else {
			Node var2 = this.parameters.get((long)var1); // L: 91
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null; // L: 92 93
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-7"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.memberCount];
			this.sortedMembers = new int[this.memberCount];

			for (int var2 = 0; var2 < this.memberCount; this.sortedMembers[var2] = var2++) { // L: 103
				var1[var2] = this.memberNames[var2]; // L: 101
				if (var1[var2] != null) { // L: 102
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			int[] var3 = this.sortedMembers; // L: 105
			Actor.method2413(var1, var3, 0, var1.length - 1); // L: 107
		}

		return this.sortedMembers; // L: 110
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;II)V",
		garbageValue = "467664753"
	)
	void method3233(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) { // L: 114
			var3 = null;
		}

		if (this.useHashes != var1 > 0L) { // L: 115
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) { // L: 116
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) { // L: 117
				this.method3225(this.memberCount + 5);
			}

			if (this.memberHashes != null) { // L: 118
				this.memberHashes[this.memberCount] = var1;
			}

			if (this.memberNames != null) { // L: 119
				this.memberNames[this.memberCount] = var3;
			}

			if (this.currentOwner == -1) { // L: 120
				this.currentOwner = this.memberCount; // L: 121
				this.memberRanks[this.memberCount] = 126; // L: 122
			} else {
				this.memberRanks[this.memberCount] = 0; // L: 125
			}

			this.field1719[this.memberCount] = 0; // L: 127
			this.field1720[this.memberCount] = var4; // L: 128
			this.field1721[this.memberCount] = false; // L: 129
			++this.memberCount; // L: 130
			this.sortedMembers = null; // L: 131
		}
	} // L: 132

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1952591895"
	)
	void method3277(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) { // L: 135
			--this.memberCount; // L: 136
			this.sortedMembers = null; // L: 137
			if (this.memberCount == 0) { // L: 138
				this.memberHashes = null; // L: 139
				this.memberNames = null; // L: 140
				this.memberRanks = null; // L: 141
				this.field1719 = null; // L: 142
				this.field1720 = null; // L: 143
				this.field1721 = null; // L: 144
				this.currentOwner = -1; // L: 145
				this.field1725 = -1; // L: 146
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1); // L: 149
				System.arraycopy(this.field1719, var1 + 1, this.field1719, var1, this.memberCount - var1); // L: 150
				System.arraycopy(this.field1720, var1 + 1, this.field1720, var1, this.memberCount - var1); // L: 151
				System.arraycopy(this.field1721, var1 + 1, this.field1721, var1, this.memberCount - var1); // L: 152
				if (this.memberHashes != null) { // L: 153
					System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, this.memberCount - var1);
				}

				if (this.memberNames != null) { // L: 154
					System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, this.memberCount - var1);
				}

				this.updateOwner(); // L: 155
			}

		} else {
			throw new RuntimeException("");
		}
	} // L: 157

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "512"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) { // L: 160
			this.currentOwner = -1; // L: 161
			this.field1725 = -1; // L: 162
		} else {
			this.currentOwner = -1; // L: 165
			this.field1725 = -1; // L: 166
			int var1 = 0; // L: 167
			byte var2 = this.memberRanks[0]; // L: 168

			for (int var3 = 1; var3 < this.memberCount; ++var3) { // L: 169
				if (this.memberRanks[var3] > var2) { // L: 170
					if (var2 == 125) { // L: 171
						this.field1725 = var1;
					}

					var1 = var3; // L: 172
					var2 = this.memberRanks[var3]; // L: 173
				} else if (this.field1725 == -1 && this.memberRanks[var3] == 125) { // L: 175
					this.field1725 = var3; // L: 176
				}
			}

			this.currentOwner = var1; // L: 179
			if (this.currentOwner != -1) { // L: 180
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	} // L: 163 181

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;B)V",
		garbageValue = "14"
	)
	void method3234(long var1, String var3) {
		if (var3 != null && var3.length() == 0) { // L: 184
			var3 = null;
		}

		if (this.useHashes != var1 > 0L) { // L: 185
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) { // L: 186
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) { // L: 187
				this.method3226(this.bannedMemberCount + 5);
			}

			if (this.bannedMemberHashes != null) { // L: 188
				this.bannedMemberHashes[this.bannedMemberCount] = var1;
			}

			if (this.bannedMemberNames != null) { // L: 189
				this.bannedMemberNames[this.bannedMemberCount] = var3;
			}

			++this.bannedMemberCount; // L: 190
		}
	} // L: 191

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1088918765"
	)
	void method3235(int var1) {
		--this.bannedMemberCount; // L: 194
		if (this.bannedMemberCount == 0) { // L: 195
			this.bannedMemberHashes = null; // L: 196
			this.bannedMemberNames = null; // L: 197
		} else {
			if (this.bannedMemberHashes != null) { // L: 200
				System.arraycopy(this.bannedMemberHashes, var1 + 1, this.bannedMemberHashes, var1, this.bannedMemberCount - var1);
			}

			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, var1 + 1, this.bannedMemberNames, var1, this.bannedMemberCount - var1); // L: 201
			}
		}

	} // L: 203

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IBB)I",
		garbageValue = "52"
	)
	int method3236(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) { // L: 206
			if (this.currentOwner == var1 && (this.field1725 == -1 || this.memberRanks[this.field1725] < 125)) { // L: 207
				return -1;
			} else if (this.memberRanks[var1] == var2) { // L: 208
				return -1;
			} else {
				this.memberRanks[var1] = var2; // L: 209
				this.updateOwner(); // L: 210
				return var1; // L: 211
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-396487017"
	)
	boolean method3232(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) { // L: 215
			this.memberRanks[this.currentOwner] = 125; // L: 216
			this.field1725 = this.currentOwner; // L: 217
			this.memberRanks[var1] = 126; // L: 218
			this.currentOwner = var1; // L: 219
			return true; // L: 220
		} else {
			return false;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-2064740841"
	)
	int method3259(int var1, boolean var2) {
		if (this.field1721[var1] == var2) {
			return -1;
		} else {
			this.field1721[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "1959406854"
	)
	int method3239(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 230
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		int var8 = this.field1719[var1];
		if ((var8 & var7) == var2) {
			return -1; // L: 236
		} else {
			var8 &= ~var7;
			this.field1719[var1] = var8 | var2;
			return var1; // L: 239
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1527590852"
	)
	boolean method3240(int var1, int var2) {
		if (this.parameters != null) {
			Node var3 = this.parameters.get((long)var1);
			if (var3 != null) { // L: 245
				if (var3 instanceof IntegerNode) { // L: 246
					IntegerNode var4 = (IntegerNode)var3; // L: 247
					if (var2 == var4.integer) { // L: 248
						return false;
					}

					var4.integer = var2; // L: 249
					return true; // L: 250
				}

				var3.remove(); // L: 252
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 255
		}

		this.parameters.put(new IntegerNode(var2), (long)var1); // L: 256
		return true; // L: 257
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "1527727717"
	)
	boolean method3237(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 261
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 262
		int var7 = var6 ^ var5; // L: 263
		var2 <<= var3; // L: 264
		var2 &= var7; // L: 265
		if (this.parameters != null) { // L: 266
			Node var8 = this.parameters.get((long)var1); // L: 267
			if (var8 != null) { // L: 268
				if (var8 instanceof IntegerNode) { // L: 269
					IntegerNode var9 = (IntegerNode)var8; // L: 270
					if ((var9.integer & var7) == var2) { // L: 271
						return false;
					}

					var9.integer &= ~var7; // L: 272
					var9.integer |= var2; // L: 273
					return true; // L: 274
				}

				var8.remove(); // L: 276
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 279
		}

		this.parameters.put(new IntegerNode(var2), (long)var1); // L: 280
		return true; // L: 281
	}

	@ObfuscatedName("ab")
	boolean method3242(int var1, long var2) {
		if (this.parameters != null) { // L: 285
			Node var4 = this.parameters.get((long)var1); // L: 286
			if (var4 != null) { // L: 287
				if (var4 instanceof class471) { // L: 288
					class471 var5 = (class471)var4; // L: 289
					if (var5.field4815 == var2) { // L: 290
						return false;
					}

					var5.field4815 = var2; // L: 291
					return true; // L: 292
				}

				var4.remove(); // L: 294
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 297
		}

		this.parameters.put(new class471(var2), (long)var1); // L: 298
		return true; // L: 299
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)Z",
		garbageValue = "15012"
	)
	boolean method3288(int var1, String var2) {
		if (var2 == null) { // L: 303
			var2 = "";
		} else if (var2.length() > 80) { // L: 304
			var2 = var2.substring(0, 80);
		}

		if (this.parameters != null) { // L: 305
			Node var3 = this.parameters.get((long)var1); // L: 306
			if (var3 != null) { // L: 307
				if (var3 instanceof ObjectNode) { // L: 308
					ObjectNode var4 = (ObjectNode)var3; // L: 309
					if (var4.obj instanceof String) { // L: 310
						if (var2.equals(var4.obj)) { // L: 311
							return false;
						}

						var4.remove(); // L: 312
						this.parameters.put(new ObjectNode(var2), var4.key); // L: 313
						return true; // L: 314
					}
				}

				var3.remove(); // L: 317
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 320
		}

		this.parameters.put(new ObjectNode(var2), (long)var1); // L: 321
		return true; // L: 322
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "-641248299"
	)
	void method3243(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 326
		if (var2 >= 1 && var2 <= 6) { // L: 327
			int var3 = var1.readUnsignedByte(); // L: 328
			if ((var3 & 1) != 0) { // L: 329
				this.useHashes = true;
			}

			if ((var3 & 2) != 0) { // L: 330
				this.useNames = true;
			}

			if (!this.useHashes) { // L: 331
				this.memberHashes = null; // L: 332
				this.bannedMemberHashes = null; // L: 333
			}

			if (!this.useNames) { // L: 335
				this.memberNames = null; // L: 336
				this.bannedMemberNames = null; // L: 337
			}

			this.field1707 = var1.readInt(); // L: 339
			this.field1709 = var1.readInt(); // L: 340
			if (var2 <= 3 && this.field1709 != 0) { // L: 341
				this.field1709 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort(); // L: 342
			this.bannedMemberCount = var1.readUnsignedByte(); // L: 343
			this.name = var1.readStringCp1252NullTerminated(); // L: 344
			if (var2 >= 4) { // L: 345
				var1.readInt(); // L: 346
			}

			this.allowGuests = var1.readUnsignedByte() == 1; // L: 348
			this.field1712 = var1.readByte(); // L: 349
			this.field1706 = var1.readByte(); // L: 350
			this.field1713 = var1.readByte(); // L: 351
			this.field1714 = var1.readByte(); // L: 352
			int var4;
			if (this.memberCount > 0) { // L: 353
				if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < this.memberCount)) { // L: 354
					this.memberHashes = new long[this.memberCount];
				}

				if (this.useNames && (this.memberNames == null || this.memberNames.length < this.memberCount)) { // L: 355
					this.memberNames = new String[this.memberCount];
				}

				if (this.memberRanks == null || this.memberRanks.length < this.memberCount) { // L: 356
					this.memberRanks = new byte[this.memberCount];
				}

				if (this.field1719 == null || this.field1719.length < this.memberCount) { // L: 357
					this.field1719 = new int[this.memberCount];
				}

				if (this.field1720 == null || this.field1720.length < this.memberCount) { // L: 358
					this.field1720 = new int[this.memberCount];
				}

				if (this.field1721 == null || this.field1721.length < this.memberCount) { // L: 359
					this.field1721 = new boolean[this.memberCount];
				}

				for (var4 = 0; var4 < this.memberCount; ++var4) { // L: 360
					if (this.useHashes) { // L: 361
						this.memberHashes[var4] = var1.readLong();
					}

					if (this.useNames) { // L: 362
						this.memberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}

					this.memberRanks[var4] = var1.readByte(); // L: 363
					if (var2 >= 2) { // L: 364
						this.field1719[var4] = var1.readInt();
					}

					if (var2 >= 5) { // L: 365
						this.field1720[var4] = var1.readUnsignedShort();
					} else {
						this.field1720[var4] = 0; // L: 366
					}

					if (var2 >= 6) { // L: 367
						this.field1721[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1721[var4] = false; // L: 368
					}
				}

				this.updateOwner(); // L: 370
			}

			if (this.bannedMemberCount > 0) { // L: 372
				if (this.useHashes && (this.bannedMemberHashes == null || this.bannedMemberHashes.length < this.bannedMemberCount)) { // L: 373
					this.bannedMemberHashes = new long[this.bannedMemberCount];
				}

				if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount)) { // L: 374
					this.bannedMemberNames = new String[this.bannedMemberCount];
				}

				for (var4 = 0; var4 < this.bannedMemberCount; ++var4) { // L: 375
					if (this.useHashes) { // L: 376
						this.bannedMemberHashes[var4] = var1.readLong();
					}

					if (this.useNames) { // L: 377
						this.bannedMemberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}

			if (var2 >= 3) { // L: 380
				var4 = var1.readUnsignedShort(); // L: 381
				if (var4 > 0) { // L: 382
					this.parameters = new IterableNodeHashTable(var4 < 16 ? UrlRequest.method2837(var4) : 16); // L: 383

					while (var4-- > 0) { // L: 384
						int var5 = var1.readInt(); // L: 385
						int var6 = var5 & 1073741823; // L: 386
						int var7 = var5 >>> 30; // L: 387
						if (var7 == 0) { // L: 388
							int var12 = var1.readInt(); // L: 389
							this.parameters.put(new IntegerNode(var12), (long)var6); // L: 390
						} else if (var7 == 1) { // L: 392
							long var10 = var1.readLong(); // L: 393
							this.parameters.put(new class471(var10), (long)var6); // L: 394
						} else if (var7 == 2) { // L: 396
							String var8 = var1.readStringCp1252NullTerminated(); // L: 397
							this.parameters.put(new ObjectNode(var8), (long)var6); // L: 398
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	} // L: 403

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-422907991"
	)
	static char method3292(char var0) {
		if (var0 == 198) { // L: 95
			return 'E';
		} else if (var0 == 230) { // L: 96
			return 'e';
		} else if (var0 == 223) {
			return 's'; // L: 97
		} else if (var0 == 338) { // L: 98
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000'); // L: 99 100
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lcr;Lcr;IZI)I",
		garbageValue = "242171091"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 222
			int var4 = var0.population; // L: 223
			int var5 = var1.population; // L: 224
			if (!var3) { // L: 225
				if (var4 == -1) { // L: 226
					var4 = 2001;
				}

				if (var5 == -1) { // L: 227
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 229
		} else if (var2 == 2) { // L: 231
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 232
			if (var0.activity.equals("-")) { // L: 233
				if (var1.activity.equals("-")) { // L: 234
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 235
				}
			} else if (var1.activity.equals("-")) { // L: 237
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 238
			}
		} else if (var2 == 4) { // L: 240
			return var0.method1812() ? (var1.method1812() ? 0 : 1) : (var1.method1812() ? -1 : 0);
		} else if (var2 == 5) { // L: 241
			return var0.method1810() ? (var1.method1810() ? 0 : 1) : (var1.method1810() ? -1 : 0);
		} else if (var2 == 6) { // L: 242
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 243
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 244
		}
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "993695105"
	)
	static void method3291(int var0, int var1) {
		int var2 = Calendar.fontBold12.stringWidth("Choose Option"); // L: 9303

		int var3;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) { // L: 9304
			Font var7 = Calendar.fontBold12; // L: 9305
			String var8;
			if (var3 < 0) { // L: 9308
				var8 = ""; // L: 9309
			} else if (Client.menuTargets[var3].length() > 0) { // L: 9312
				var8 = Client.menuActions[var3] + " " + Client.menuTargets[var3];
			} else {
				var8 = Client.menuActions[var3]; // L: 9313
			}

			int var6 = var7.stringWidth(var8); // L: 9315
			if (var6 > var2) { // L: 9316
				var2 = var6;
			}
		}

		var2 += 8; // L: 9318
		var3 = Client.menuOptionsCount * 15 + 22; // L: 9319
		int var4 = var0 - var2 / 2; // L: 9320
		if (var2 + var4 > GrandExchangeOfferTotalQuantityComparator.canvasWidth) { // L: 9321
			var4 = GrandExchangeOfferTotalQuantityComparator.canvasWidth - var2;
		}

		if (var4 < 0) { // L: 9322
			var4 = 0;
		}

		int var5 = var1; // L: 9323
		if (var3 + var1 > WorldMapArchiveLoader.canvasHeight) { // L: 9324
			var5 = WorldMapArchiveLoader.canvasHeight - var3;
		}

		if (var5 < 0) { // L: 9325
			var5 = 0;
		}

		Canvas.menuX = var4; // L: 9326
		UserComparator6.menuY = var5; // L: 9327
		UserComparator5.menuWidth = var2; // L: 9328
		ModeWhere.menuHeight = Client.menuOptionsCount * 15 + 22; // L: 9329
	} // L: 9330
}
