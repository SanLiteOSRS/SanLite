import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("h")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("w")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -6876764368805247545L
	)
	long field1602;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1040141595
	)
	int field1603;
	@ObfuscatedName("q")
	@Export("name")
	public String name;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1527353311
	)
	int field1605;
	@ObfuscatedName("k")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("o")
	public byte field1606;
	@ObfuscatedName("n")
	public byte field1599;
	@ObfuscatedName("d")
	public byte field1615;
	@ObfuscatedName("a")
	public byte field1610;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1915205487
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("u")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("l")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("z")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("r")
	int[] field1617;
	@ObfuscatedName("y")
	public int[] field1616;
	@ObfuscatedName("p")
	public boolean[] field1619;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 857724597
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -275598333
	)
	public int field1608;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -756344105
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("f")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("t")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("j")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1603 = 0; // L: 14
		this.name = null; // L: 15
		this.field1605 = 0; // L: 16
		this.currentOwner = -1; // L: 29
		this.field1608 = -1; // L: 30
		this.method2918(var1); // L: 43
	} // L: 44

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "45"
	)
	void method2899(int var1) {
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

		if (this.field1617 != null) { // L: 57
			System.arraycopy(this.field1617, 0, this.field1617 = new int[var1], 0, this.memberCount);
		} else {
			this.field1617 = new int[var1]; // L: 58
		}

		if (this.field1616 != null) { // L: 59
			System.arraycopy(this.field1616, 0, this.field1616 = new int[var1], 0, this.memberCount);
		} else {
			this.field1616 = new int[var1]; // L: 60
		}

		if (this.field1619 != null) { // L: 61
			System.arraycopy(this.field1619, 0, this.field1619 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1619 = new boolean[var1]; // L: 62
		}

	} // L: 63

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-480172131"
	)
	void method2900(int var1) {
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-86"
	)
	public int method2901(String var1) {
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "115"
	)
	public int method2915(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1; // L: 85
		return (this.field1617[var1] & var4) >>> var2; // L: 86
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Integer;",
		garbageValue = "-862731127"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1735554841"
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

			int[] var3 = this.sortedMembers; // L: 105
			PlayerType.method5694(var1, var3, 0, var1.length - 1); // L: 107
		}

		return this.sortedMembers; // L: 110
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;II)V",
		garbageValue = "1531827343"
	)
	void method2955(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) { // L: 114
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) { // L: 115
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) { // L: 116
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) { // L: 117
				this.method2899(this.memberCount + 5);
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

			this.field1617[this.memberCount] = 0; // L: 127
			this.field1616[this.memberCount] = var4; // L: 128
			this.field1619[this.memberCount] = false; // L: 129
			++this.memberCount; // L: 130
			this.sortedMembers = null; // L: 131
		}
	} // L: 132

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-307358890"
	)
	void method2906(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) { // L: 135
			--this.memberCount; // L: 136
			this.sortedMembers = null; // L: 137
			if (this.memberCount == 0) { // L: 138
				this.memberHashes = null; // L: 139
				this.memberNames = null; // L: 140
				this.memberRanks = null; // L: 141
				this.field1617 = null; // L: 142
				this.field1616 = null; // L: 143
				this.field1619 = null; // L: 144
				this.currentOwner = -1; // L: 145
				this.field1608 = -1; // L: 146
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1); // L: 149
				System.arraycopy(this.field1617, var1 + 1, this.field1617, var1, this.memberCount - var1); // L: 150
				System.arraycopy(this.field1616, var1 + 1, this.field1616, var1, this.memberCount - var1); // L: 151
				System.arraycopy(this.field1619, var1 + 1, this.field1619, var1, this.memberCount - var1); // L: 152
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) { // L: 160
			this.currentOwner = -1; // L: 161
			this.field1608 = -1; // L: 162
		} else {
			this.currentOwner = -1; // L: 165
			this.field1608 = -1; // L: 166
			int var1 = 0; // L: 167
			byte var2 = this.memberRanks[0]; // L: 168

			for (int var3 = 1; var3 < this.memberCount; ++var3) { // L: 169
				if (this.memberRanks[var3] > var2) { // L: 170
					if (var2 == 125) {
						this.field1608 = var1; // L: 171
					}

					var1 = var3; // L: 172
					var2 = this.memberRanks[var3]; // L: 173
				} else if (this.field1608 == -1 && this.memberRanks[var3] == 125) { // L: 175
					this.field1608 = var3; // L: 176
				}
			}

			this.currentOwner = var1; // L: 179
			if (this.currentOwner != -1) { // L: 180
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	} // L: 163 181

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)V",
		garbageValue = "-1575850225"
	)
	void method2908(long var1, String var3) {
		if (var3 != null && var3.length() == 0) { // L: 184
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) { // L: 185
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) { // L: 186
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) { // L: 187
				this.method2900(this.bannedMemberCount + 5);
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-791090337"
	)
	void method2942(int var1) {
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IBI)I",
		garbageValue = "292758535"
	)
	int method2910(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) { // L: 206
			if (this.currentOwner == var1 && (this.field1608 == -1 || this.memberRanks[this.field1608] < 125)) { // L: 207
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "694670194"
	)
	boolean method2935(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) { // L: 215
			this.memberRanks[this.currentOwner] = 125; // L: 216
			this.field1608 = this.currentOwner; // L: 217
			this.memberRanks[var1] = 126; // L: 218
			this.currentOwner = var1; // L: 219
			return true; // L: 220
		} else {
			return false;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "1021729166"
	)
	int method2913(int var1, boolean var2) {
		if (this.field1619[var1] == var2) { // L: 224
			return -1;
		} else {
			this.field1619[var1] = var2; // L: 225
			return var1; // L: 226
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-433175497"
	)
	int method2937(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 230
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 231
		int var7 = var6 ^ var5; // L: 232
		var2 <<= var3; // L: 233
		var2 &= var7; // L: 234
		int var8 = this.field1617[var1]; // L: 235
		if ((var8 & var7) == var2) {
			return -1; // L: 236
		} else {
			var8 &= ~var7; // L: 237
			this.field1617[var1] = var8 | var2; // L: 238
			return var1; // L: 239
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-14"
	)
	boolean method2914(int var1, int var2) {
		if (this.parameters != null) { // L: 243
			Node var3 = this.parameters.get((long)var1); // L: 244
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-1944379283"
	)
	boolean method2960(int var1, int var2, int var3, int var4) {
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

	@ObfuscatedName("y")
	boolean method2916(int var1, long var2) {
		if (this.parameters != null) { // L: 285
			Node var4 = this.parameters.get((long)var1); // L: 286
			if (var4 != null) { // L: 287
				if (var4 instanceof class408) { // L: 288
					class408 var5 = (class408)var4; // L: 289
					if (var5.field4465 == var2) { // L: 290
						return false;
					}

					var5.field4465 = var2; // L: 291
					return true; // L: 292
				}

				var4.remove(); // L: 294
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 297
		}

		this.parameters.put(new class408(var2), (long)var1); // L: 298
		return true; // L: 299
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Z",
		garbageValue = "87"
	)
	boolean method2966(int var1, String var2) {
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "1388510046"
	)
	void method2918(Buffer var1) {
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

			this.field1603 = var1.readInt(); // L: 339
			this.field1605 = var1.readInt(); // L: 340
			if (var2 <= 3 && this.field1605 != 0) { // L: 341
				this.field1605 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort(); // L: 342
			this.bannedMemberCount = var1.readUnsignedByte(); // L: 343
			this.name = var1.readStringCp1252NullTerminated(); // L: 344
			if (var2 >= 4) { // L: 345
				var1.readInt(); // L: 346
			}

			this.allowGuests = var1.readUnsignedByte() == 1; // L: 348
			this.field1606 = var1.readByte(); // L: 349
			this.field1599 = var1.readByte(); // L: 350
			this.field1615 = var1.readByte(); // L: 351
			this.field1610 = var1.readByte(); // L: 352
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

				if (this.field1617 == null || this.field1617.length < this.memberCount) { // L: 357
					this.field1617 = new int[this.memberCount];
				}

				if (this.field1616 == null || this.field1616.length < this.memberCount) { // L: 358
					this.field1616 = new int[this.memberCount];
				}

				if (this.field1619 == null || this.field1619.length < this.memberCount) { // L: 359
					this.field1619 = new boolean[this.memberCount];
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
						this.field1617[var4] = var1.readInt();
					}

					if (var2 >= 5) { // L: 365
						this.field1616[var4] = var1.readUnsignedShort();
					} else {
						this.field1616[var4] = 0; // L: 366
					}

					if (var2 >= 6) { // L: 367
						this.field1619[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1619[var4] = false; // L: 368
					}
				}

				this.updateOwner(); // L: 370
			}

			if (this.bannedMemberCount > 0) { // L: 372
				if (this.useHashes && (this.bannedMemberHashes == null || this.bannedMemberHashes.length < this.bannedMemberCount)) {
					this.bannedMemberHashes = new long[this.bannedMemberCount]; // L: 373
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
					this.parameters = new IterableNodeHashTable(var4 < 16 ? WorldMapDecoration.method4914(var4) : 16); // L: 383

					while (var4-- > 0) { // L: 384
						int var5 = var1.readInt(); // L: 385
						int var6 = var5 & 1073741823; // L: 386
						int var7 = var5 >>> 30; // L: 387
						if (var7 == 0) { // L: 388
							int var12 = var1.readInt(); // L: 389
							this.parameters.put(new IntegerNode(var12), (long)var6); // L: 390
						} else if (var7 == 1) { // L: 392
							long var10 = var1.readLong(); // L: 393
							this.parameters.put(new class408(var10), (long)var6); // L: 394
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1219209452"
	)
	public static int method2909(int var0) {
		return var0 >>> 4 & class439.field4687; // L: 22
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "23663686"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field706 = 0L; // L: 4328
		if (var0 >= 2) { // L: 4329
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4330
		}

		if (Canvas.getWindowedMode() == 1) { // L: 4331
			AbstractByteArrayCopier.client.setMaxCanvasSize(765, 503); // L: 4332
		} else {
			AbstractByteArrayCopier.client.setMaxCanvasSize(7680, 2160); // L: 4335
		}

		if (Client.gameState >= 25) { // L: 4337
			PacketBufferNode var1 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2990, Client.packetWriter.isaacCipher); // L: 4339
			var1.packetBuffer.writeByte(Canvas.getWindowedMode()); // L: 4340
			var1.packetBuffer.writeShort(class7.canvasWidth); // L: 4341
			var1.packetBuffer.writeShort(DecorativeObject.canvasHeight); // L: 4342
			Client.packetWriter.addNode(var1); // L: 4343
		}

	} // L: 4345
}
