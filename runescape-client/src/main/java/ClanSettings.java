import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("er")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("f")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("c")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = -4089509781435719023L
	)
	long field1663;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2140101991
	)
	int field1664;
	@ObfuscatedName("j")
	@Export("name")
	public String name;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1487254367
	)
	int field1666;
	@ObfuscatedName("d")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("n")
	public byte field1670;
	@ObfuscatedName("r")
	public byte field1660;
	@ObfuscatedName("l")
	public byte field1680;
	@ObfuscatedName("s")
	public byte field1671;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1926211067
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("b")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("o")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("u")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("z")
	int[] field1668;
	@ObfuscatedName("t")
	public int[] field1677;
	@ObfuscatedName("w")
	public boolean[] field1678;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1509135395
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1241325217
	)
	public int field1673;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 868971787
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("e")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("g")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("k")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1664 = 0; // L: 14
		this.name = null; // L: 15
		this.field1666 = 0; // L: 16
		this.currentOwner = -1; // L: 29
		this.field1673 = -1; // L: 30
		this.method3093(var1); // L: 43
	} // L: 44

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "46"
	)
	void method3074(int var1) {
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

		if (this.memberRanks != null) { // L: 55
			System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, this.memberCount);
		} else {
			this.memberRanks = new byte[var1]; // L: 56
		}

		if (this.field1668 != null) { // L: 57
			System.arraycopy(this.field1668, 0, this.field1668 = new int[var1], 0, this.memberCount);
		} else {
			this.field1668 = new int[var1]; // L: 58
		}

		if (this.field1677 != null) { // L: 59
			System.arraycopy(this.field1677, 0, this.field1677 = new int[var1], 0, this.memberCount);
		} else {
			this.field1677 = new int[var1]; // L: 60
		}

		if (this.field1678 != null) { // L: 61
			System.arraycopy(this.field1678, 0, this.field1678 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1678 = new boolean[var1]; // L: 62
		}

	} // L: 63

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "478236636"
	)
	void method3075(int var1) {
		if (this.useHashes) { // L: 66
			if (this.bannedMemberHashes != null) { // L: 67
				System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount);
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "56"
	)
	public int method3076(String var1) {
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1508873516"
	)
	public int method3113(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1; // L: 85
		return (this.field1668[var1] & var4) >>> var2; // L: 86
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Integer;",
		garbageValue = "2130471957"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-86"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 97
			String[] var1 = new String[this.memberCount]; // L: 98
			this.sortedMembers = new int[this.memberCount]; // L: 99

			for (int var2 = 0; var2 < this.memberCount; this.sortedMembers[var2] = var2++) { // L: 100 103
				var1[var2] = this.memberNames[var2]; // L: 101
				if (var1[var2] != null) { // L: 102
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			TileItem.method2554(var1, this.sortedMembers); // L: 105
		}

		return this.sortedMembers; // L: 107
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;II)V",
		garbageValue = "-1585985229"
	)
	void method3080(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) { // L: 111
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) { // L: 112
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) { // L: 113
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) { // L: 114
				this.method3074(this.memberCount + 5);
			}

			if (this.memberHashes != null) { // L: 115
				this.memberHashes[this.memberCount] = var1;
			}

			if (this.memberNames != null) { // L: 116
				this.memberNames[this.memberCount] = var3;
			}

			if (this.currentOwner == -1) { // L: 117
				this.currentOwner = this.memberCount; // L: 118
				this.memberRanks[this.memberCount] = 126; // L: 119
			} else {
				this.memberRanks[this.memberCount] = 0; // L: 122
			}

			this.field1668[this.memberCount] = 0; // L: 124
			this.field1677[this.memberCount] = var4; // L: 125
			this.field1678[this.memberCount] = false; // L: 126
			++this.memberCount; // L: 127
			this.sortedMembers = null; // L: 128
		}
	} // L: 129

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1873491787"
	)
	void method3081(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) { // L: 132
			--this.memberCount; // L: 133
			this.sortedMembers = null; // L: 134
			if (this.memberCount == 0) { // L: 135
				this.memberHashes = null; // L: 136
				this.memberNames = null; // L: 137
				this.memberRanks = null; // L: 138
				this.field1668 = null; // L: 139
				this.field1677 = null; // L: 140
				this.field1678 = null; // L: 141
				this.currentOwner = -1; // L: 142
				this.field1673 = -1; // L: 143
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1); // L: 146
				System.arraycopy(this.field1668, var1 + 1, this.field1668, var1, this.memberCount - var1); // L: 147
				System.arraycopy(this.field1677, var1 + 1, this.field1677, var1, this.memberCount - var1); // L: 148
				System.arraycopy(this.field1678, var1 + 1, this.field1678, var1, this.memberCount - var1); // L: 149
				if (this.memberHashes != null) { // L: 150
					System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, this.memberCount - var1);
				}

				if (this.memberNames != null) { // L: 151
					System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, this.memberCount - var1);
				}

				this.updateOwner(); // L: 152
			}

		} else {
			throw new RuntimeException("");
		}
	} // L: 154

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "250789495"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) { // L: 157
			this.currentOwner = -1; // L: 158
			this.field1673 = -1; // L: 159
		} else {
			this.currentOwner = -1; // L: 162
			this.field1673 = -1; // L: 163
			int var1 = 0; // L: 164
			byte var2 = this.memberRanks[0]; // L: 165

			for (int var3 = 1; var3 < this.memberCount; ++var3) { // L: 166
				if (this.memberRanks[var3] > var2) { // L: 167
					if (var2 == 125) {
						this.field1673 = var1; // L: 168
					}

					var1 = var3; // L: 169
					var2 = this.memberRanks[var3]; // L: 170
				} else if (this.field1673 == -1 && this.memberRanks[var3] == 125) { // L: 172
					this.field1673 = var3; // L: 173
				}
			}

			this.currentOwner = var1; // L: 176
			if (this.currentOwner != -1) { // L: 177
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	} // L: 160 178

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;B)V",
		garbageValue = "1"
	)
	void method3122(long var1, String var3) {
		if (var3 != null && var3.length() == 0) { // L: 181
			var3 = null;
		}

		if (this.useHashes != var1 > 0L) { // L: 182
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) { // L: 183
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) { // L: 184
				this.method3075(this.bannedMemberCount + 5);
			}

			if (this.bannedMemberHashes != null) { // L: 185
				this.bannedMemberHashes[this.bannedMemberCount] = var1;
			}

			if (this.bannedMemberNames != null) { // L: 186
				this.bannedMemberNames[this.bannedMemberCount] = var3;
			}

			++this.bannedMemberCount; // L: 187
		}
	} // L: 188

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-88"
	)
	void method3084(int var1) {
		--this.bannedMemberCount; // L: 191
		if (this.bannedMemberCount == 0) { // L: 192
			this.bannedMemberHashes = null; // L: 193
			this.bannedMemberNames = null; // L: 194
		} else {
			if (this.bannedMemberHashes != null) { // L: 197
				System.arraycopy(this.bannedMemberHashes, var1 + 1, this.bannedMemberHashes, var1, this.bannedMemberCount - var1);
			}

			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, var1 + 1, this.bannedMemberNames, var1, this.bannedMemberCount - var1); // L: 198
			}
		}

	} // L: 200

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IBI)I",
		garbageValue = "636837268"
	)
	int method3085(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) { // L: 203
			if (this.currentOwner == var1 && (this.field1673 == -1 || this.memberRanks[this.field1673] < 125)) { // L: 204
				return -1;
			} else if (this.memberRanks[var1] == var2) { // L: 205
				return -1;
			} else {
				this.memberRanks[var1] = var2; // L: 206
				this.updateOwner(); // L: 207
				return var1; // L: 208
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "244076401"
	)
	boolean method3086(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) { // L: 212
			this.memberRanks[this.currentOwner] = 125; // L: 213
			this.field1673 = this.currentOwner; // L: 214
			this.memberRanks[var1] = 126; // L: 215
			this.currentOwner = var1; // L: 216
			return true; // L: 217
		} else {
			return false;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-883299607"
	)
	int method3102(int var1, boolean var2) {
		if (this.field1678[var1] == var2) { // L: 221
			return -1;
		} else {
			this.field1678[var1] = var2; // L: 222
			return var1; // L: 223
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "1200635442"
	)
	int method3088(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 227
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 228
		int var7 = var6 ^ var5; // L: 229
		var2 <<= var3; // L: 230
		var2 &= var7; // L: 231
		int var8 = this.field1668[var1]; // L: 232
		if ((var8 & var7) == var2) {
			return -1; // L: 233
		} else {
			var8 &= ~var7; // L: 234
			this.field1668[var1] = var8 | var2; // L: 235
			return var1; // L: 236
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "18495"
	)
	boolean method3116(int var1, int var2) {
		if (this.parameters != null) { // L: 240
			Node var3 = this.parameters.get((long)var1); // L: 241
			if (var3 != null) { // L: 242
				if (var3 instanceof IntegerNode) { // L: 243
					IntegerNode var4 = (IntegerNode)var3; // L: 244
					if (var2 == var4.integer) { // L: 245
						return false;
					}

					var4.integer = var2; // L: 246
					return true; // L: 247
				}

				var3.remove(); // L: 249
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 252
		}

		this.parameters.put(new IntegerNode(var2), (long)var1); // L: 253
		return true; // L: 254
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-22565721"
	)
	boolean method3090(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 258
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 259
		int var7 = var6 ^ var5; // L: 260
		var2 <<= var3; // L: 261
		var2 &= var7; // L: 262
		if (this.parameters != null) { // L: 263
			Node var8 = this.parameters.get((long)var1); // L: 264
			if (var8 != null) { // L: 265
				if (var8 instanceof IntegerNode) { // L: 266
					IntegerNode var9 = (IntegerNode)var8; // L: 267
					if ((var9.integer & var7) == var2) { // L: 268
						return false;
					}

					var9.integer &= ~var7; // L: 269
					var9.integer |= var2; // L: 270
					return true; // L: 271
				}

				var8.remove(); // L: 273
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 276
		}

		this.parameters.put(new IntegerNode(var2), (long)var1); // L: 277
		return true; // L: 278
	}

	@ObfuscatedName("t")
	boolean method3091(int var1, long var2) {
		if (this.parameters != null) { // L: 282
			Node var4 = this.parameters.get((long)var1); // L: 283
			if (var4 != null) { // L: 284
				if (var4 instanceof class427) { // L: 285
					class427 var5 = (class427)var4; // L: 286
					if (var2 == var5.field4632) { // L: 287
						return false;
					}

					var5.field4632 = var2; // L: 288
					return true; // L: 289
				}

				var4.remove(); // L: 291
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 294
		}

		this.parameters.put(new class427(var2), (long)var1); // L: 295
		return true; // L: 296
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Z",
		garbageValue = "814808491"
	)
	boolean method3092(int var1, String var2) {
		if (var2 == null) { // L: 300
			var2 = "";
		} else if (var2.length() > 80) { // L: 301
			var2 = var2.substring(0, 80);
		}

		if (this.parameters != null) { // L: 302
			Node var3 = this.parameters.get((long)var1); // L: 303
			if (var3 != null) { // L: 304
				if (var3 instanceof ObjectNode) { // L: 305
					ObjectNode var4 = (ObjectNode)var3; // L: 306
					if (var4.obj instanceof String) { // L: 307
						if (var2.equals(var4.obj)) { // L: 308
							return false;
						}

						var4.remove(); // L: 309
						this.parameters.put(new ObjectNode(var2), var4.key); // L: 310
						return true; // L: 311
					}
				}

				var3.remove(); // L: 314
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 317
		}

		this.parameters.put(new ObjectNode(var2), (long)var1); // L: 318
		return true; // L: 319
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-888364959"
	)
	void method3093(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 323
		if (var2 >= 1 && var2 <= 6) { // L: 324
			int var3 = var1.readUnsignedByte(); // L: 325
			if ((var3 & 1) != 0) { // L: 326
				this.useHashes = true;
			}

			if ((var3 & 2) != 0) { // L: 327
				this.useNames = true;
			}

			if (!this.useHashes) { // L: 328
				this.memberHashes = null; // L: 329
				this.bannedMemberHashes = null; // L: 330
			}

			if (!this.useNames) { // L: 332
				this.memberNames = null; // L: 333
				this.bannedMemberNames = null; // L: 334
			}

			this.field1664 = var1.readInt(); // L: 336
			this.field1666 = var1.readInt(); // L: 337
			if (var2 <= 3 && this.field1666 != 0) { // L: 338
				this.field1666 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort(); // L: 339
			this.bannedMemberCount = var1.readUnsignedByte(); // L: 340
			this.name = var1.readStringCp1252NullTerminated(); // L: 341
			if (var2 >= 4) { // L: 342
				var1.readInt(); // L: 343
			}

			this.allowGuests = var1.readUnsignedByte() == 1; // L: 345
			this.field1670 = var1.readByte(); // L: 346
			this.field1660 = var1.readByte(); // L: 347
			this.field1680 = var1.readByte(); // L: 348
			this.field1671 = var1.readByte(); // L: 349
			int var4;
			if (this.memberCount > 0) { // L: 350
				if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < this.memberCount)) { // L: 351
					this.memberHashes = new long[this.memberCount];
				}

				if (this.useNames && (this.memberNames == null || this.memberNames.length < this.memberCount)) { // L: 352
					this.memberNames = new String[this.memberCount];
				}

				if (this.memberRanks == null || this.memberRanks.length < this.memberCount) { // L: 353
					this.memberRanks = new byte[this.memberCount];
				}

				if (this.field1668 == null || this.field1668.length < this.memberCount) { // L: 354
					this.field1668 = new int[this.memberCount];
				}

				if (this.field1677 == null || this.field1677.length < this.memberCount) { // L: 355
					this.field1677 = new int[this.memberCount];
				}

				if (this.field1678 == null || this.field1678.length < this.memberCount) { // L: 356
					this.field1678 = new boolean[this.memberCount];
				}

				for (var4 = 0; var4 < this.memberCount; ++var4) { // L: 357
					if (this.useHashes) { // L: 358
						this.memberHashes[var4] = var1.readLong();
					}

					if (this.useNames) { // L: 359
						this.memberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}

					this.memberRanks[var4] = var1.readByte(); // L: 360
					if (var2 >= 2) { // L: 361
						this.field1668[var4] = var1.readInt();
					}

					if (var2 >= 5) { // L: 362
						this.field1677[var4] = var1.readUnsignedShort();
					} else {
						this.field1677[var4] = 0; // L: 363
					}

					if (var2 >= 6) { // L: 364
						this.field1678[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1678[var4] = false; // L: 365
					}
				}

				this.updateOwner(); // L: 367
			}

			if (this.bannedMemberCount > 0) { // L: 369
				if (this.useHashes && (this.bannedMemberHashes == null || this.bannedMemberHashes.length < this.bannedMemberCount)) { // L: 370
					this.bannedMemberHashes = new long[this.bannedMemberCount];
				}

				if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount)) { // L: 371
					this.bannedMemberNames = new String[this.bannedMemberCount];
				}

				for (var4 = 0; var4 < this.bannedMemberCount; ++var4) { // L: 372
					if (this.useHashes) { // L: 373
						this.bannedMemberHashes[var4] = var1.readLong();
					}

					if (this.useNames) { // L: 374
						this.bannedMemberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}

			if (var2 >= 3) { // L: 377
				var4 = var1.readUnsignedShort(); // L: 378
				if (var4 > 0) { // L: 379
					this.parameters = new IterableNodeHashTable(var4 < 16 ? class37.method712(var4) : 16); // L: 380

					while (var4-- > 0) { // L: 381
						int var5 = var1.readInt(); // L: 382
						int var6 = var5 & 1073741823; // L: 383
						int var7 = var5 >>> 30; // L: 384
						if (var7 == 0) { // L: 385
							int var12 = var1.readInt(); // L: 386
							this.parameters.put(new IntegerNode(var12), (long)var6); // L: 387
						} else if (var7 == 1) { // L: 389
							long var10 = var1.readLong(); // L: 390
							this.parameters.put(new class427(var10), (long)var6); // L: 391
						} else if (var7 == 2) { // L: 393
							String var8 = var1.readStringCp1252NullTerminated(); // L: 394
							this.parameters.put(new ObjectNode(var8), (long)var6); // L: 395
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	} // L: 400

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-26"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 156
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "2011850487"
	)
	static int method3078(int var0, Script var1, boolean var2) {
		Widget var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 1836
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1837
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class167.Widget_unpackTargetMask(class197.getWidgetFlags(var3)); // L: 1838
			return 1; // L: 1839
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1841
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1848
				if (var3.dataText == null) { // L: 1849
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1850
				}

				return 1; // L: 1851
			} else {
				return 2; // L: 1853
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 1842
			--var4; // L: 1843
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1844
				Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1845
			} else {
				Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1846
		}
	}
}
