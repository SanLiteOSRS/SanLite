import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("ah")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("ar")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 6267051267450243407L
	)
	long field1722;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -753632835
	)
	public int field1701;
	@ObfuscatedName("au")
	@Export("name")
	public String name;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1520903843
	)
	int field1720;
	@ObfuscatedName("ac")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("al")
	public byte field1705;
	@ObfuscatedName("az")
	public byte field1706;
	@ObfuscatedName("ap")
	public byte field1707;
	@ObfuscatedName("av")
	public byte field1708;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2054003043
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("as")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("ay")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("ak")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("aj")
	int[] field1713;
	@ObfuscatedName("am")
	public int[] field1723;
	@ObfuscatedName("aq")
	public boolean[] field1698;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1045056595
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -358083271
	)
	public int field1717;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 943007671
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("an")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("ag")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("ad")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Luj;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1701 = 0; // L: 14
		this.name = null; // L: 15
		this.field1720 = 0; // L: 16
		this.currentOwner = -1; // L: 29
		this.field1717 = -1; // L: 30
		this.method3340(var1); // L: 43
	} // L: 44

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "95"
	)
	void method3383(int var1) {
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

		if (this.field1713 != null) { // L: 57
			System.arraycopy(this.field1713, 0, this.field1713 = new int[var1], 0, this.memberCount);
		} else {
			this.field1713 = new int[var1]; // L: 58
		}

		if (this.field1723 != null) { // L: 59
			System.arraycopy(this.field1723, 0, this.field1723 = new int[var1], 0, this.memberCount);
		} else {
			this.field1723 = new int[var1]; // L: 60
		}

		if (this.field1698 != null) { // L: 61
			System.arraycopy(this.field1698, 0, this.field1698 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1698 = new boolean[var1]; // L: 62
		}

	} // L: 63

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1189145621"
	)
	void method3322(int var1) {
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
		garbageValue = "1"
	)
	public int method3323(String var1) {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1718718774"
	)
	public int method3341(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1; // L: 85
		return (this.field1713[var1] & var4) >>> var2; // L: 86
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Integer;",
		garbageValue = "2128934080"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-672366104"
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
			class475.method8597(var1, var3, 0, var1.length - 1); // L: 107
		}

		return this.sortedMembers; // L: 110
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;II)V",
		garbageValue = "613838614"
	)
	void method3327(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) { // L: 114
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) { // L: 115
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) {
				this.method3383(this.memberCount + 5);
			}

			if (this.memberHashes != null) {
				this.memberHashes[this.memberCount] = var1;
			}

			if (this.memberNames != null) {
				this.memberNames[this.memberCount] = var3;
			}

			if (this.currentOwner == -1) {
				this.currentOwner = this.memberCount;
				this.memberRanks[this.memberCount] = 126;
			} else {
				this.memberRanks[this.memberCount] = 0; // L: 125
			}

			this.field1713[this.memberCount] = 0;
			this.field1723[this.memberCount] = var4;
			this.field1698[this.memberCount] = false;
			++this.memberCount; // L: 130
			this.sortedMembers = null;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2072484175"
	)
	void method3328(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) {
			--this.memberCount;
			this.sortedMembers = null;
			if (this.memberCount == 0) { // L: 138
				this.memberHashes = null;
				this.memberNames = null;
				this.memberRanks = null;
				this.field1713 = null;
				this.field1723 = null;
				this.field1698 = null;
				this.currentOwner = -1;
				this.field1717 = -1; // L: 146
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1);
				System.arraycopy(this.field1713, var1 + 1, this.field1713, var1, this.memberCount - var1);
				System.arraycopy(this.field1723, var1 + 1, this.field1723, var1, this.memberCount - var1);
				System.arraycopy(this.field1698, var1 + 1, this.field1698, var1, this.memberCount - var1);
				if (this.memberHashes != null) {
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
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) { // L: 160
			this.currentOwner = -1; // L: 161
			this.field1717 = -1;
		} else {
			this.currentOwner = -1;
			this.field1717 = -1; // L: 166
			int var1 = 0;
			byte var2 = this.memberRanks[0];

			for (int var3 = 1; var3 < this.memberCount; ++var3) {
				if (this.memberRanks[var3] > var2) {
					if (var2 == 125) {
						this.field1717 = var1;
					}

					var1 = var3;
					var2 = this.memberRanks[var3]; // L: 173
				} else if (this.field1717 == -1 && this.memberRanks[var3] == 125) {
					this.field1717 = var3;
				}
			}

			this.currentOwner = var1;
			if (this.currentOwner != -1) {
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)V",
		garbageValue = "-1952730404"
	)
	void method3358(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (this.useHashes != var1 > 0L) {
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) {
				this.method3322(this.bannedMemberCount + 5);
			}

			if (this.bannedMemberHashes != null) { // L: 188
				this.bannedMemberHashes[this.bannedMemberCount] = var1;
			}

			if (this.bannedMemberNames != null) { // L: 189
				this.bannedMemberNames[this.bannedMemberCount] = var3;
			}

			++this.bannedMemberCount;
		}
	} // L: 191

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1253930747"
	)
	void method3338(int var1) {
		--this.bannedMemberCount;
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IBB)I",
		garbageValue = "-88"
	)
	int method3379(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) { // L: 206
			if (this.currentOwner == var1 && (this.field1717 == -1 || this.memberRanks[this.field1717] < 125)) { // L: 207
				return -1;
			} else if (this.memberRanks[var1] == var2) {
				return -1; // L: 208
			} else {
				this.memberRanks[var1] = var2; // L: 209
				this.updateOwner(); // L: 210
				return var1; // L: 211
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "7"
	)
	boolean method3366(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) { // L: 215
			this.memberRanks[this.currentOwner] = 125; // L: 216
			this.field1717 = this.currentOwner; // L: 217
			this.memberRanks[var1] = 126; // L: 218
			this.currentOwner = var1; // L: 219
			return true; // L: 220
		} else {
			return false;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1328118008"
	)
	int method3334(int var1, boolean var2) {
		if (this.field1698[var1] == var2) { // L: 224
			return -1;
		} else {
			this.field1698[var1] = var2; // L: 225
			return var1; // L: 226
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "2048454468"
	)
	int method3335(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 230
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 231
		int var7 = var6 ^ var5; // L: 232
		var2 <<= var3; // L: 233
		var2 &= var7; // L: 234
		int var8 = this.field1713[var1]; // L: 235
		if ((var8 & var7) == var2) {
			return -1; // L: 236
		} else {
			var8 &= ~var7; // L: 237
			this.field1713[var1] = var8 | var2; // L: 238
			return var1; // L: 239
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2056023373"
	)
	boolean method3336(int var1, int var2) {
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-303137716"
	)
	boolean method3337(int var1, int var2, int var3, int var4) {
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

	@ObfuscatedName("am")
	boolean method3330(int var1, long var2) {
		if (this.parameters != null) { // L: 285
			Node var4 = this.parameters.get((long)var1); // L: 286
			if (var4 != null) { // L: 287
				if (var4 instanceof class482) { // L: 288
					class482 var5 = (class482)var4; // L: 289
					if (var5.field4845 == var2) { // L: 290
						return false;
					}

					var5.field4845 = var2; // L: 291
					return true; // L: 292
				}

				var4.remove(); // L: 294
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 297
		}

		this.parameters.put(new class482(var2), (long)var1); // L: 298
		return true; // L: 299
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Z",
		garbageValue = "-1755861280"
	)
	boolean method3365(int var1, String var2) {
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)V",
		garbageValue = "-1"
	)
	void method3340(Buffer var1) {
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

			this.field1701 = var1.readInt(); // L: 339
			this.field1720 = var1.readInt(); // L: 340
			if (var2 <= 3 && this.field1720 != 0) { // L: 341
				this.field1720 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort(); // L: 342
			this.bannedMemberCount = var1.readUnsignedByte(); // L: 343
			this.name = var1.readStringCp1252NullTerminated(); // L: 344
			if (var2 >= 4) { // L: 345
				var1.readInt(); // L: 346
			}

			this.allowGuests = var1.readUnsignedByte() == 1; // L: 348
			this.field1705 = var1.readByte(); // L: 349
			this.field1706 = var1.readByte(); // L: 350
			this.field1707 = var1.readByte(); // L: 351
			this.field1708 = var1.readByte(); // L: 352
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

				if (this.field1713 == null || this.field1713.length < this.memberCount) { // L: 357
					this.field1713 = new int[this.memberCount];
				}

				if (this.field1723 == null || this.field1723.length < this.memberCount) { // L: 358
					this.field1723 = new int[this.memberCount];
				}

				if (this.field1698 == null || this.field1698.length < this.memberCount) { // L: 359
					this.field1698 = new boolean[this.memberCount];
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
						this.field1713[var4] = var1.readInt();
					}

					if (var2 >= 5) { // L: 365
						this.field1723[var4] = var1.readUnsignedShort();
					} else {
						this.field1723[var4] = 0; // L: 366
					}

					if (var2 >= 6) { // L: 367
						this.field1698[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1698[var4] = false; // L: 368
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
					this.parameters = new IterableNodeHashTable(var4 < 16 ? class184.method3680(var4) : 16); // L: 383

					while (var4-- > 0) { // L: 384
						int var5 = var1.readInt(); // L: 385
						int var6 = var5 & 1073741823; // L: 386
						int var7 = var5 >>> 30; // L: 387
						if (var7 == 0) { // L: 388
							int var12 = var1.readInt(); // L: 389
							this.parameters.put(new IntegerNode(var12), (long)var6); // L: 390
						} else if (var7 == 1) { // L: 392
							long var10 = var1.readLong(); // L: 393
							this.parameters.put(new class482(var10), (long)var6); // L: 394
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
		descriptor = "(Lri;FFFI)F",
		garbageValue = "-584068586"
	)
	static float method3387(class464 var0, float var1, float var2, float var3) {
		float var4 = WorldMapID.method4936(var0.field4786, var0.field4787, var1); // L: 116
		if (Math.abs(var4) < class127.field1484) { // L: 117
			return var1;
		} else {
			float var5 = WorldMapID.method4936(var0.field4786, var0.field4787, var2); // L: 118
			if (Math.abs(var5) < class127.field1484) { // L: 119
				return var2;
			} else {
				float var6 = 0.0F; // L: 120
				float var7 = 0.0F; // L: 121
				float var8 = 0.0F; // L: 122
				float var13 = 0.0F; // L: 127
				boolean var14 = true; // L: 128
				boolean var15 = false; // L: 129

				do {
					var15 = false; // L: 131
					if (var14) { // L: 132
						var6 = var1; // L: 133
						var13 = var4; // L: 134
						var7 = var2 - var1; // L: 135
						var8 = var7; // L: 136
						var14 = false; // L: 137
					}

					if (Math.abs(var13) < Math.abs(var5)) { // L: 139
						var1 = var2; // L: 140
						var2 = var6; // L: 141
						var6 = var1; // L: 142
						var4 = var5; // L: 143
						var5 = var13; // L: 144
						var13 = var4; // L: 145
					}

					float var16 = class127.field1485 * Math.abs(var2) + 0.5F * var3; // L: 147
					float var17 = (var6 - var2) * 0.5F; // L: 148
					boolean var18 = Math.abs(var17) > var16 && var5 != 0.0F; // L: 149
					if (var18) { // L: 150
						if (Math.abs(var8) >= var16 && Math.abs(var4) > Math.abs(var5)) { // L: 151
							float var12 = var5 / var4; // L: 156
							float var9;
							float var10;
							if (var6 == var1) { // L: 157
								var9 = var12 * var17 * 2.0F; // L: 158
								var10 = 1.0F - var12; // L: 159
							} else {
								var10 = var4 / var13; // L: 162
								float var11 = var5 / var13; // L: 163
								var9 = (var17 * 2.0F * var10 * (var10 - var11) - (var2 - var1) * (var11 - 1.0F)) * var12; // L: 164
								var10 = (var12 - 1.0F) * (var11 - 1.0F) * (var10 - 1.0F); // L: 165
							}

							if ((double)var9 > 0.0D) { // L: 167
								var10 = -var10;
							} else {
								var9 = -var9; // L: 168
							}

							var12 = var8; // L: 169
							var8 = var7; // L: 170
							if (var9 * 2.0F < var17 * 3.0F * var10 - Math.abs(var16 * var10) && var9 < Math.abs(var12 * 0.5F * var10)) { // L: 171
								var7 = var9 / var10; // L: 172
							} else {
								var7 = var17; // L: 175
								var8 = var17; // L: 176
							}
						} else {
							var7 = var17; // L: 152
							var8 = var17; // L: 153
						}

						var1 = var2; // L: 179
						var4 = var5; // L: 180
						if (Math.abs(var7) > var16) { // L: 181
							var2 += var7;
						} else if ((double)var17 > 0.0D) { // L: 182
							var2 += var16;
						} else {
							var2 -= var16; // L: 183
						}

						var5 = WorldMapID.method4936(var0.field4786, var0.field4787, var2); // L: 184
						if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) { // L: 185
							var14 = true; // L: 186
							var15 = true; // L: 187
						} else {
							var15 = true; // L: 190
						}
					}
				} while(var15);

				return var2; // L: 194
			}
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "25188"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[ItemLayer.Client_plane][var0][var1]; // L: 8765
		if (var2 == null) { // L: 8766
			class36.scene.removeGroundItemPile(ItemLayer.Client_plane, var0, var1); // L: 8767
		} else {
			long var3 = -99999999L; // L: 8770
			TileItem var5 = null; // L: 8771

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8772 8773 8783
				ItemComposition var7 = class214.ItemComposition_get(var6.id); // L: 8774
				long var11 = (long)var7.price; // L: 8775
				if (var7.isStackable == 1) { // L: 8776
					var11 *= var6.quantity < Integer.MAX_VALUE ? (long)(var6.quantity + 1) : (long)var6.quantity; // L: 8777
				}

				if (var11 > var3) { // L: 8779
					var3 = var11; // L: 8780
					var5 = var6; // L: 8781
				}
			}

			if (var5 == null) { // L: 8785
				class36.scene.removeGroundItemPile(ItemLayer.Client_plane, var0, var1); // L: 8786
			} else {
				var2.addLast(var5); // L: 8789
				TileItem var13 = null; // L: 8790
				TileItem var8 = null; // L: 8791

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8792 8793 8798
					if (var6.id != var5.id) { // L: 8794
						if (var13 == null) { // L: 8795
							var13 = var6;
						}

						if (var6.id != var13.id && var8 == null) { // L: 8796
							var8 = var6;
						}
					}
				}

				long var9 = Player.calculateTag(var0, var1, 3, false, 0); // L: 8800
				class36.scene.newGroundItemPile(ItemLayer.Client_plane, var0, var1, WorldMapDecorationType.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, ItemLayer.Client_plane), var5, var9, var13, var8); // L: 8801
			}
		}
	} // L: 8768 8787 8802

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static final void method3333() {
		int var0 = FriendSystem.menuX; // L: 9290
		int var1 = class60.menuY; // L: 9291
		int var2 = class428.menuWidth; // L: 9292
		int var3 = class515.menuHeight; // L: 9293
		int var4 = 6116423; // L: 9294
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4); // L: 9295
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0); // L: 9296
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0); // L: 9297
		GrandExchangeOfferTotalQuantityComparator.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1); // L: 9298
		int var5 = MouseHandler.MouseHandler_x; // L: 9299
		int var6 = MouseHandler.MouseHandler_y; // L: 9300

		for (int var7 = 0; var7 < Client.menuOptionsCount; ++var7) { // L: 9301
			int var8 = var1 + (Client.menuOptionsCount - 1 - var7) * 15 + 31; // L: 9302
			int var9 = 16777215; // L: 9303
			if (var5 > var0 && var5 < var2 + var0 && var6 > var8 - 13 && var6 < var8 + 3) { // L: 9304
				var9 = 16776960;
			}

			Font var10 = GrandExchangeOfferTotalQuantityComparator.fontBold12; // L: 9305
			String var11;
			if (var7 < 0) { // L: 9308
				var11 = ""; // L: 9309
			} else if (Client.menuTargets[var7].length() > 0) { // L: 9312
				var11 = Client.menuActions[var7] + " " + Client.menuTargets[var7];
			} else {
				var11 = Client.menuActions[var7]; // L: 9313
			}

			var10.draw(var11, var0 + 3, var8, var9, 0); // L: 9315
		}

		SoundSystem.method867(FriendSystem.menuX, class60.menuY, class428.menuWidth, class515.menuHeight); // L: 9317
	} // L: 9318
}
