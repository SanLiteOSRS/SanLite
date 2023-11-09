import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("an")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("aw")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 3071145065741142973L
	)
	long field1729;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -584024417
	)
	int field1712;
	@ObfuscatedName("ab")
	@Export("name")
	public String name;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -468068655
	)
	int field1714;
	@ObfuscatedName("al")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("at")
	public byte field1728;
	@ObfuscatedName("aa")
	public byte field1717;
	@ObfuscatedName("ay")
	public byte field1718;
	@ObfuscatedName("ao")
	public byte field1709;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1247430143
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("ai")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("ag")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("ah")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("av")
	int[] field1726;
	@ObfuscatedName("ar")
	public int[] field1725;
	@ObfuscatedName("am")
	public boolean[] field1734;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 680027429
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1218077019
	)
	public int field1733;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -325159675
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("az")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("ad")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("ae")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Lsg;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1712 = 0; // L: 14
		this.name = null; // L: 15
		this.field1714 = 0; // L: 16
		this.currentOwner = -1; // L: 29
		this.field1733 = -1; // L: 30
		this.method3319(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1318866700"
	)
	void method3335(int var1) {
		if (this.useHashes) { // L: 47
			if (this.memberHashes != null) {
				System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[var1], 0, this.memberCount);
			} else {
				this.memberHashes = new long[var1];
			}
		}

		if (this.useNames) {
			if (this.memberNames != null) {
				System.arraycopy(this.memberNames, 0, this.memberNames = new String[var1], 0, this.memberCount);
			} else {
				this.memberNames = new String[var1];
			}
		}

		if (this.memberRanks != null) {
			System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, this.memberCount);
		} else {
			this.memberRanks = new byte[var1];
		}

		if (this.field1726 != null) {
			System.arraycopy(this.field1726, 0, this.field1726 = new int[var1], 0, this.memberCount);
		} else {
			this.field1726 = new int[var1];
		}

		if (this.field1725 != null) {
			System.arraycopy(this.field1725, 0, this.field1725 = new int[var1], 0, this.memberCount);
		} else {
			this.field1725 = new int[var1];
		}

		if (this.field1734 != null) {
			System.arraycopy(this.field1734, 0, this.field1734 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1734 = new boolean[var1];
		}

	} // L: 63

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-100"
	)
	void method3304(int var1) {
		if (this.useHashes) {
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount); // L: 67
			} else {
				this.bannedMemberHashes = new long[var1];
			}
		}

		if (this.useNames) {
			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberNames = new String[var1]; // L: 72
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "79"
	)
	public int method3302(String var1) {
		if (var1 != null && var1.length() != 0) { // L: 77
			for (int var2 = 0; var2 < this.memberCount; ++var2) { // L: 78
				if (this.memberNames[var2].equals(var1)) {
					return var2;
				}
			}

			return -1; // L: 81
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "60"
	)
	public int method3303(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field1726[var1] & var4) >>> var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Integer;",
		garbageValue = "-112"
	)
	@Export("getTitleGroupValue")
	public Integer getTitleGroupValue(int var1) {
		if (this.parameters == null) {
			return null;
		} else {
			Node var2 = this.parameters.get((long)var1);
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null; // L: 92
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "33"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.memberCount];
			this.sortedMembers = new int[this.memberCount]; // L: 99

			for (int var2 = 0; var2 < this.memberCount; this.sortedMembers[var2] = var2++) { // L: 100
				var1[var2] = this.memberNames[var2]; // L: 101
				if (var1[var2] != null) {
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			int[] var3 = this.sortedMembers;
			class138.method3212(var1, var3, 0, var1.length - 1); // L: 107
		}

		return this.sortedMembers; // L: 110
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;II)V",
		garbageValue = "-706420067"
	)
	void method3299(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) {
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) {
				this.method3335(this.memberCount + 5);
			}

			if (this.memberHashes != null) {
				this.memberHashes[this.memberCount] = var1;
			}

			if (this.memberNames != null) { // L: 119
				this.memberNames[this.memberCount] = var3;
			}

			if (this.currentOwner == -1) {
				this.currentOwner = this.memberCount;
				this.memberRanks[this.memberCount] = 126; // L: 122
			} else {
				this.memberRanks[this.memberCount] = 0;
			}

			this.field1726[this.memberCount] = 0;
			this.field1725[this.memberCount] = var4; // L: 128
			this.field1734[this.memberCount] = false; // L: 129
			++this.memberCount; // L: 130
			this.sortedMembers = null; // L: 131
		}
	} // L: 132

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-122"
	)
	void method3307(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) {
			--this.memberCount; // L: 136
			this.sortedMembers = null;
			if (this.memberCount == 0) {
				this.memberHashes = null;
				this.memberNames = null; // L: 140
				this.memberRanks = null;
				this.field1726 = null; // L: 142
				this.field1725 = null;
				this.field1734 = null;
				this.currentOwner = -1;
				this.field1733 = -1; // L: 146
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1);
				System.arraycopy(this.field1726, var1 + 1, this.field1726, var1, this.memberCount - var1); // L: 150
				System.arraycopy(this.field1725, var1 + 1, this.field1725, var1, this.memberCount - var1); // L: 151
				System.arraycopy(this.field1734, var1 + 1, this.field1734, var1, this.memberCount - var1); // L: 152
				if (this.memberHashes != null) { // L: 153
					System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, this.memberCount - var1);
				}

				if (this.memberNames != null) {
					System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, this.memberCount - var1);
				}

				this.updateOwner();
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1881573906"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) {
			this.currentOwner = -1;
			this.field1733 = -1; // L: 162
		} else {
			this.currentOwner = -1;
			this.field1733 = -1;
			int var1 = 0;
			byte var2 = this.memberRanks[0];

			for (int var3 = 1; var3 < this.memberCount; ++var3) {
				if (this.memberRanks[var3] > var2) {
					if (var2 == 125) {
						this.field1733 = var1;
					}

					var1 = var3;
					var2 = this.memberRanks[var3]; // L: 173
				} else if (this.field1733 == -1 && this.memberRanks[var3] == 125) {
					this.field1733 = var3; // L: 176
				}
			}

			this.currentOwner = var1;
			if (this.currentOwner != -1) { // L: 180
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	} // L: 163 181

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)V",
		garbageValue = "-1787643966"
	)
	void method3309(long var1, String var3) {
		if (var3 != null && var3.length() == 0) { // L: 184
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) { // L: 185
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) { // L: 186
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) { // L: 187
				this.method3304(this.bannedMemberCount + 5);
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-394037024"
	)
	void method3310(int var1) {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IBI)I",
		garbageValue = "-456839417"
	)
	int method3324(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) { // L: 206
			if (this.currentOwner == var1 && (this.field1733 == -1 || this.memberRanks[this.field1733] < 125)) { // L: 207
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-1"
	)
	boolean method3301(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) { // L: 215
			this.memberRanks[this.currentOwner] = 125; // L: 216
			this.field1733 = this.currentOwner; // L: 217
			this.memberRanks[var1] = 126; // L: 218
			this.currentOwner = var1; // L: 219
			return true; // L: 220
		} else {
			return false;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IZS)I",
		garbageValue = "-16552"
	)
	int method3313(int var1, boolean var2) {
		if (this.field1734[var1] == var2) { // L: 224
			return -1;
		} else {
			this.field1734[var1] = var2; // L: 225
			return var1; // L: 226
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "789169188"
	)
	int method3323(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 230
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 231
		int var7 = var6 ^ var5; // L: 232
		var2 <<= var3; // L: 233
		var2 &= var7; // L: 234
		int var8 = this.field1726[var1]; // L: 235
		if ((var8 & var7) == var2) {
			return -1; // L: 236
		} else {
			var8 &= ~var7; // L: 237
			this.field1726[var1] = var8 | var2; // L: 238
			return var1; // L: 239
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "276195611"
	)
	boolean method3315(int var1, int var2) {
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-458025371"
	)
	boolean method3316(int var1, int var2, int var3, int var4) {
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

	@ObfuscatedName("ar")
	boolean method3312(int var1, long var2) {
		if (this.parameters != null) { // L: 285
			Node var4 = this.parameters.get((long)var1); // L: 286
			if (var4 != null) { // L: 287
				if (var4 instanceof class446) { // L: 288
					class446 var5 = (class446)var4; // L: 289
					if (var2 == var5.field4742) { // L: 290
						return false;
					}

					var5.field4742 = var2; // L: 291
					return true; // L: 292
				}

				var4.remove(); // L: 294
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 297
		}

		this.parameters.put(new class446(var2), (long)var1); // L: 298
		return true; // L: 299
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Z",
		garbageValue = "1681536577"
	)
	boolean method3318(int var1, String var2) {
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lsg;B)V",
		garbageValue = "-101"
	)
	void method3319(Buffer var1) {
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

			this.field1712 = var1.readInt(); // L: 339
			this.field1714 = var1.readInt(); // L: 340
			if (var2 <= 3 && this.field1714 != 0) { // L: 341
				this.field1714 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort(); // L: 342
			this.bannedMemberCount = var1.readUnsignedByte(); // L: 343
			this.name = var1.readStringCp1252NullTerminated(); // L: 344
			if (var2 >= 4) { // L: 345
				var1.readInt(); // L: 346
			}

			this.allowGuests = var1.readUnsignedByte() == 1; // L: 348
			this.field1728 = var1.readByte(); // L: 349
			this.field1717 = var1.readByte(); // L: 350
			this.field1718 = var1.readByte(); // L: 351
			this.field1709 = var1.readByte(); // L: 352
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

				if (this.field1726 == null || this.field1726.length < this.memberCount) { // L: 357
					this.field1726 = new int[this.memberCount];
				}

				if (this.field1725 == null || this.field1725.length < this.memberCount) { // L: 358
					this.field1725 = new int[this.memberCount];
				}

				if (this.field1734 == null || this.field1734.length < this.memberCount) { // L: 359
					this.field1734 = new boolean[this.memberCount];
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
						this.field1726[var4] = var1.readInt();
					}

					if (var2 >= 5) { // L: 365
						this.field1725[var4] = var1.readUnsignedShort();
					} else {
						this.field1725[var4] = 0; // L: 366
					}

					if (var2 >= 6) { // L: 367
						this.field1734[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1734[var4] = false; // L: 368
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
					this.parameters = new IterableNodeHashTable(var4 < 16 ? class70.method2044(var4) : 16); // L: 383

					while (var4-- > 0) { // L: 384
						int var5 = var1.readInt(); // L: 385
						int var6 = var5 & 1073741823; // L: 386
						int var7 = var5 >>> 30; // L: 387
						if (var7 == 0) { // L: 388
							int var12 = var1.readInt(); // L: 389
							this.parameters.put(new IntegerNode(var12), (long)var6); // L: 390
						} else if (var7 == 1) { // L: 392
							long var10 = var1.readLong(); // L: 393
							this.parameters.put(new class446(var10), (long)var6); // L: 394
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "68"
	)
	static boolean method3355(int var0, int var1) {
		return var0 != 4 || var1 < 8; // L: 26
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "1203832974"
	)
	public static File method3356(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2; // L: 40
		JagexCache.JagexCache_locationFile = new File(HorizontalAlignment.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat"); // L: 41
		String var4 = null; // L: 42
		String var5 = null; // L: 43
		boolean var6 = false; // L: 44
		Buffer var8;
		int var11;
		File var27;
		if (JagexCache.JagexCache_locationFile.exists()) { // L: 45
			try {
				AccessFile var7 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 48

				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) { // L: 49 50 53
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset); // L: 51
					if (var9 == -1) { // L: 52
						throw new IOException();
					}
				}

				var8.offset = 0; // L: 55
				var9 = var8.readUnsignedByte(); // L: 56
				if (var9 < 1 || var9 > 3) { // L: 57
					throw new IOException("" + var9);
				}

				int var10 = 0; // L: 58
				if (var9 > 1) { // L: 59
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) { // L: 60
					var4 = var8.readStringCp1252NullCircumfixed(); // L: 61
					if (var10 == 1) { // L: 62
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8(); // L: 65
					if (var10 == 1) { // L: 66
						var5 = var8.readCESU8();
					}
				}

				var7.close(); // L: 68
			} catch (IOException var25) { // L: 70
				var25.printStackTrace(); // L: 71
			}

			if (var4 != null) { // L: 73
				var27 = new File(var4); // L: 74
				if (!var27.exists()) { // L: 75
					var4 = null; // L: 76
				}
			}

			if (var4 != null) { // L: 79
				var27 = new File(var4, "test.dat"); // L: 80

				boolean var28;
				try {
					RandomAccessFile var15 = new RandomAccessFile(var27, "rw"); // L: 84
					var11 = var15.read(); // L: 85
					var15.seek(0L); // L: 86
					var15.write(var11); // L: 87
					var15.seek(0L); // L: 88
					var15.close(); // L: 89
					var27.delete(); // L: 90
					var28 = true; // L: 91
				} catch (Exception var23) { // L: 93
					var28 = false; // L: 94
				}

				if (!var28) { // L: 97
					var4 = null; // L: 98
				}
			}
		}

		if (var4 == null && var2 == 0) { // L: 102
			label154:
			for (int var16 = 0; var16 < class96.cacheSubPaths.length; ++var16) { // L: 103
				for (int var17 = 0; var17 < class130.cacheParentPaths.length; ++var17) { // L: 104
					File var18 = new File(class130.cacheParentPaths[var17] + class96.cacheSubPaths[var16] + File.separatorChar + var0 + File.separatorChar); // L: 105
					if (var18.exists()) { // L: 106
						File var19 = new File(var18, "test.dat"); // L: 108

						boolean var29;
						try {
							RandomAccessFile var12 = new RandomAccessFile(var19, "rw"); // L: 111
							int var13 = var12.read(); // L: 112
							var12.seek(0L); // L: 113
							var12.write(var13); // L: 114
							var12.seek(0L); // L: 115
							var12.close(); // L: 116
							var19.delete(); // L: 117
							var29 = true; // L: 118
						} catch (Exception var22) { // L: 120
							var29 = false; // L: 121
						}

						if (var29) { // L: 124
							var4 = var18.toString(); // L: 125
							var6 = true; // L: 126
							break label154; // L: 127
						}
					}
				}
			}
		}

		if (var4 == null) { // L: 133
			var4 = HorizontalAlignment.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 134
			var6 = true; // L: 135
		}

		File var26;
		if (var5 != null) { // L: 137
			var26 = new File(var5); // L: 138
			var27 = new File(var4); // L: 139

			try {
				File[] var33 = var26.listFiles(); // L: 141
				File[] var31 = var33; // L: 143

				for (var11 = 0; var11 < var31.length; ++var11) { // L: 144
					File var30 = var31[var11]; // L: 145
					File var20 = new File(var27, var30.getName()); // L: 147
					boolean var14 = var30.renameTo(var20); // L: 148
					if (!var14) { // L: 149
						throw new IOException();
					}
				}
			} catch (Exception var24) { // L: 154
				var24.printStackTrace(); // L: 155
			}

			var6 = true; // L: 157
		}

		if (var6) { // L: 159
			var26 = new File(var4); // L: 160
			var8 = null; // L: 161

			try {
				AccessFile var34 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 165
				Buffer var32 = new Buffer(500); // L: 166
				var32.writeByte(3); // L: 167
				var32.writeByte(var8 != null ? 1 : 0); // L: 168
				var32.writeCESU8(var26.getPath()); // L: 169
				if (var8 != null) { // L: 170
					var32.writeCESU8("");
				}

				var34.write(var32.array, 0, var32.offset); // L: 171
				var34.close(); // L: 172
			} catch (IOException var21) { // L: 174
				var21.printStackTrace(); // L: 175
			}
		}

		return new File(var4); // L: 179
	}
}
