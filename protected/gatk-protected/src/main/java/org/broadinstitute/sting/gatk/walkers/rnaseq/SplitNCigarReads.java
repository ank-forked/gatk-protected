/*
*  By downloading the PROGRAM you agree to the following terms of use:
*  
*  BROAD INSTITUTE - SOFTWARE LICENSE AGREEMENT - FOR ACADEMIC NON-COMMERCIAL RESEARCH PURPOSES ONLY
*  
*  This Agreement is made between the Broad Institute, Inc. with a principal address at 7 Cambridge Center, Cambridge, MA 02142 (BROAD) and the LICENSEE and is effective at the date the downloading is completed (EFFECTIVE DATE).
*  
*  WHEREAS, LICENSEE desires to license the PROGRAM, as defined hereinafter, and BROAD wishes to have this PROGRAM utilized in the public interest, subject only to the royalty-free, nonexclusive, nontransferable license rights of the United States Government pursuant to 48 CFR 52.227-14; and
*  WHEREAS, LICENSEE desires to license the PROGRAM and BROAD desires to grant a license on the following terms and conditions.
*  NOW, THEREFORE, in consideration of the promises and covenants made herein, the parties hereto agree as follows:
*  
*  1. DEFINITIONS
*  1.1 PROGRAM shall mean copyright in the object code and source code known as GATK2 and related documentation, if any, as they exist on the EFFECTIVE DATE and can be downloaded from http://www.broadinstitute/GATK on the EFFECTIVE DATE.
*  
*  2. LICENSE
*  2.1   Grant. Subject to the terms of this Agreement, BROAD hereby grants to LICENSEE, solely for academic non-commercial research purposes, a non-exclusive, non-transferable license to: (a) download, execute and display the PROGRAM and (b) create bug fixes and modify the PROGRAM. 
*  The LICENSEE may apply the PROGRAM in a pipeline to data owned by users other than the LICENSEE and provide these users the results of the PROGRAM provided LICENSEE does so for academic non-commercial purposes only.  For clarification purposes, academic sponsored research is not a commercial use under the terms of this Agreement.
*  2.2  No Sublicensing or Additional Rights. LICENSEE shall not sublicense or distribute the PROGRAM, in whole or in part, without prior written permission from BROAD.  LICENSEE shall ensure that all of its users agree to the terms of this Agreement.  LICENSEE further agrees that it shall not put the PROGRAM on a network, server, or other similar technology that may be accessed by anyone other than the LICENSEE and its employees and users who have agreed to the terms of this agreement.
*  2.3  License Limitations. Nothing in this Agreement shall be construed to confer any rights upon LICENSEE by implication, estoppel, or otherwise to any computer software, trademark, intellectual property, or patent rights of BROAD, or of any other entity, except as expressly granted herein. LICENSEE agrees that the PROGRAM, in whole or part, shall not be used for any commercial purpose, including without limitation, as the basis of a commercial software or hardware product or to provide services. LICENSEE further agrees that the PROGRAM shall not be copied or otherwise adapted in order to circumvent the need for obtaining a license for use of the PROGRAM.  
*  
*  3. OWNERSHIP OF INTELLECTUAL PROPERTY 
*  LICENSEE acknowledges that title to the PROGRAM shall remain with BROAD. The PROGRAM is marked with the following BROAD copyright notice and notice of attribution to contributors. LICENSEE shall retain such notice on all copies.  LICENSEE agrees to include appropriate attribution if any results obtained from use of the PROGRAM are included in any publication.
*  Copyright 2012 Broad Institute, Inc.
*  Notice of attribution:  The GATK2 program was made available through the generosity of Medical and Population Genetics program at the Broad Institute, Inc.
*  LICENSEE shall not use any trademark or trade name of BROAD, or any variation, adaptation, or abbreviation, of such marks or trade names, or any names of officers, faculty, students, employees, or agents of BROAD except as states above for attribution purposes.
*  
*  4. INDEMNIFICATION
*  LICENSEE shall indemnify, defend, and hold harmless BROAD, and their respective officers, faculty, students, employees, associated investigators and agents, and their respective successors, heirs and assigns, (Indemnitees), against any liability, damage, loss, or expense (including reasonable attorneys fees and expenses) incurred by or imposed upon any of the Indemnitees in connection with any claims, suits, actions, demands or judgments arising out of any theory of liability (including, without limitation, actions in the form of tort, warranty, or strict liability and regardless of whether such action has any factual basis) pursuant to any right or license granted under this Agreement.
*  
*  5. NO REPRESENTATIONS OR WARRANTIES
*  THE PROGRAM IS DELIVERED AS IS.  BROAD MAKES NO REPRESENTATIONS OR WARRANTIES OF ANY KIND CONCERNING THE PROGRAM OR THE COPYRIGHT, EXPRESS OR IMPLIED, INCLUDING, WITHOUT LIMITATION, WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, NONINFRINGEMENT, OR THE ABSENCE OF LATENT OR OTHER DEFECTS, WHETHER OR NOT DISCOVERABLE. BROAD EXTENDS NO WARRANTIES OF ANY KIND AS TO PROGRAM CONFORMITY WITH WHATEVER USER MANUALS OR OTHER LITERATURE MAY BE ISSUED FROM TIME TO TIME.
*  IN NO EVENT SHALL BROAD OR ITS RESPECTIVE DIRECTORS, OFFICERS, EMPLOYEES, AFFILIATED INVESTIGATORS AND AFFILIATES BE LIABLE FOR INCIDENTAL OR CONSEQUENTIAL DAMAGES OF ANY KIND, INCLUDING, WITHOUT LIMITATION, ECONOMIC DAMAGES OR INJURY TO PROPERTY AND LOST PROFITS, REGARDLESS OF WHETHER BROAD SHALL BE ADVISED, SHALL HAVE OTHER REASON TO KNOW, OR IN FACT SHALL KNOW OF THE POSSIBILITY OF THE FOREGOING.
*  
*  6. ASSIGNMENT
*  This Agreement is personal to LICENSEE and any rights or obligations assigned by LICENSEE without the prior written consent of BROAD shall be null and void.
*  
*  7. MISCELLANEOUS
*  7.1 Export Control. LICENSEE gives assurance that it will comply with all United States export control laws and regulations controlling the export of the PROGRAM, including, without limitation, all Export Administration Regulations of the United States Department of Commerce. Among other things, these laws and regulations prohibit, or require a license for, the export of certain types of software to specified countries.
*  7.2 Termination. LICENSEE shall have the right to terminate this Agreement for any reason upon prior written notice to BROAD. If LICENSEE breaches any provision hereunder, and fails to cure such breach within thirty (30) days, BROAD may terminate this Agreement immediately. Upon termination, LICENSEE shall provide BROAD with written assurance that the original and all copies of the PROGRAM have been destroyed, except that, upon prior written authorization from BROAD, LICENSEE may retain a copy for archive purposes.
*  7.3 Survival. The following provisions shall survive the expiration or termination of this Agreement: Articles 1, 3, 4, 5 and Sections 2.2, 2.3, 7.3, and 7.4.
*  7.4 Notice. Any notices under this Agreement shall be in writing, shall specifically refer to this Agreement, and shall be sent by hand, recognized national overnight courier, confirmed facsimile transmission, confirmed electronic mail, or registered or certified mail, postage prepaid, return receipt requested.  All notices under this Agreement shall be deemed effective upon receipt. 
*  7.5 Amendment and Waiver; Entire Agreement. This Agreement may be amended, supplemented, or otherwise modified only by means of a written instrument signed by all parties. Any waiver of any rights or failure to act in a specific instance shall relate only to such instance and shall not be construed as an agreement to waive any rights or fail to act in any other instance, whether or not similar. This Agreement constitutes the entire agreement among the parties with respect to its subject matter and supersedes prior agreements or understandings between the parties relating to its subject matter. 
*  7.6 Binding Effect; Headings. This Agreement shall be binding upon and inure to the benefit of the parties and their respective permitted successors and assigns. All headings are for convenience only and shall not affect the meaning of any provision of this Agreement.
*  7.7 Governing Law. This Agreement shall be construed, governed, interpreted and applied in accordance with the internal laws of the Commonwealth of Massachusetts, U.S.A., without regard to conflict of laws principles.
*/

package org.broadinstitute.sting.gatk.walkers.rnaseq;

import net.sf.samtools.*;
import org.broadinstitute.sting.commandline.Advanced;
import org.broadinstitute.sting.commandline.Argument;
import org.broadinstitute.sting.commandline.Hidden;
import org.broadinstitute.sting.commandline.Output;
import org.broadinstitute.sting.gatk.CommandLineGATK;
import org.broadinstitute.sting.gatk.GenomeAnalysisEngine;
import org.broadinstitute.sting.gatk.contexts.ReferenceContext;
import org.broadinstitute.sting.gatk.io.StingSAMFileWriter;
import org.broadinstitute.sting.gatk.refdata.RefMetaDataTracker;
import org.broadinstitute.sting.gatk.walkers.DataSource;
import org.broadinstitute.sting.gatk.walkers.ReadWalker;
import org.broadinstitute.sting.gatk.walkers.Requires;
import org.broadinstitute.sting.utils.Utils;
import org.broadinstitute.sting.utils.clipping.ReadClipper;
import org.broadinstitute.sting.utils.exceptions.UserException;
import org.broadinstitute.sting.utils.fasta.CachingIndexedFastaSequenceFile;
import org.broadinstitute.sting.utils.help.DocumentedGATKFeature;
import org.broadinstitute.sting.utils.help.HelpConstants;
import org.broadinstitute.sting.utils.sam.CigarUtils;
import org.broadinstitute.sting.utils.sam.GATKSAMRecord;

import java.io.FileNotFoundException;

/**
 *
 * Splits reads that contain Ns in their cigar string (e.g. spanning splicing events).
 *
 * Identifies all N cigar elements and creates k+1 new reads (where k is the number of N cigar elements).
 * The first read includes the bases that are to the left of the first N element, while the part of the read that is to the right of the N
 * (including the Ns) is hard clipped and so on for the rest of the new reads.
 *
 *
 * User: ami
 * Date: 11/14/13
 * Time: 11:52 AM
 */

@DocumentedGATKFeature( groupName = HelpConstants.DOCS_CAT_DATA, extraDocs = {CommandLineGATK.class} )
@Requires({DataSource.READS, DataSource.REFERENCE})
public class SplitNCigarReads extends ReadWalker<GATKSAMRecord, OverhangFixingManager> {

    // The name that will go in the @PG tag
    public static final String PROGRAM_RECORD_NAME = "GATK SplitNCigarReads";


    @Output(doc="Write output to this BAM filename instead of STDOUT")
    protected StingSAMFileWriter writer;

    /**
     * For expert users only!  To minimize memory consumption you can lower this number, but then the tool may skip
     * overhang fixing in regions with too much coverage.  Just make sure to give Java enough memory!  4Gb should be
     * enough with the default value.
     */
    @Advanced
    @Argument(fullName="maxReadsInMemory", shortName="maxInMemory", doc="max reads allowed to be kept in memory at a time by the BAM writer", required=false)
    protected int MAX_RECORDS_IN_MEMORY = 150000;

    /**
     * If there are more than this many mismatches within the overhang regions, the whole overhang will get hard-clipped out.
     * It is still possible in some cases that the overhang could get clipped if the number of mismatches do not exceed this
     * value, e.g. if most of the overhang mismatches.
     */
    @Advanced
    @Argument(fullName="maxMismatchesInOverhang", shortName="maxMismatches", doc="max number of mismatches allowed in the overhang", required=false)
    protected int MAX_MISMATCHES_IN_OVERHANG = 1;

    /**
     * If there are more than this many bases in the overhang, we won't try to hard-clip them out
     */
    @Advanced
    @Argument(fullName="maxBasesInOverhang", shortName="maxOverhang", doc="max number of bases allowed in the overhang", required=false)
    protected int MAX_BASES_TO_CLIP = 40;

    @Argument(fullName="doNotFixOverhangs", shortName="doNotFixOverhangs", doc="do not have the walker hard-clip overhanging sections of the reads", required=false)
    protected boolean doNotFixOverhangs = false;

    @Hidden
    @Argument(fullName = "no_pg_tag", shortName = "npt", doc = "Necessary for integration tests", required = false)
    protected boolean NO_PG_TAG = false;

    /**
     * This stores all of the already-split reads and manages any processing (e.g. clipping overhangs) that happens to them.
     * It will emit reads to the underlying writer as needed so we don't need to worry about any of that in this class.
     */
    protected OverhangFixingManager overhangManager;


    @Override
    public void initialize() {
        final GenomeAnalysisEngine toolkit = getToolkit();

        if ( !NO_PG_TAG ) {
            // we don't want to assume that reads will be written in order by the manager because in deep, deep pileups it won't work
            Utils.setupWriter(writer, toolkit, toolkit.getSAMFileHeader(), false, this, PROGRAM_RECORD_NAME);
        }

        try {
            final CachingIndexedFastaSequenceFile referenceReader = new CachingIndexedFastaSequenceFile(toolkit.getArguments().referenceFile);
            overhangManager = new OverhangFixingManager(writer, toolkit.getGenomeLocParser(), referenceReader, MAX_RECORDS_IN_MEMORY, MAX_MISMATCHES_IN_OVERHANG, MAX_BASES_TO_CLIP, doNotFixOverhangs);
        }
        catch (FileNotFoundException ex) {
            throw new UserException.CouldNotReadInputFile(toolkit.getArguments().referenceFile, ex);
        }
    }

    @Override
    public GATKSAMRecord map(final ReferenceContext ref, final GATKSAMRecord read, final RefMetaDataTracker metaDataTracker) {
          return read;
    }

    @Override
    public OverhangFixingManager reduceInit() {
        return overhangManager;
    }

    @Override
    public OverhangFixingManager reduce(final GATKSAMRecord read, final OverhangFixingManager manager) {
        splitNCigarRead(read, manager);
        return manager;
    }

    @Override
    public void onTraversalDone(final OverhangFixingManager manager) {
        manager.close();
    }

    /**
     * Goes through the cigar string of the read and create new reads for each consecutive non-N elements (while hard clipping the rest of the read).
     * For example: for a read with cigar '1H2M2D1M2N1M2I1N1M2S' 3 new reads will be created with cigar strings: 1H2M2D1M, 1M2I and 1M2S
     *
     * @param read     the read to split
     * @param manager  the output manager
     */
    public static void splitNCigarRead(final GATKSAMRecord read, final OverhangFixingManager manager) {
        final int numCigarElements = read.getCigar().numCigarElements();

        int firstCigarIndex = 0;
        for ( int i = 0; i < numCigarElements; i++ ) {
            final CigarElement cigarElement = read.getCigar().getCigarElement(i);
            if (cigarElement.getOperator() == CigarOperator.N) {
                manager.addRead(splitReadBasedOnCigar(read, firstCigarIndex, i, manager));
                firstCigarIndex = i+1;
            }
        }

        // if there are no N's in the read
        if (firstCigarIndex == 0) {
            manager.addRead(read);
        }
        //add the last section of the read: from the last N to the the end of the read
        // (it will be done for all the usual cigar string that does not end with N)
        else if (firstCigarIndex < numCigarElements) {
            manager.addRead(splitReadBasedOnCigar(read, firstCigarIndex, numCigarElements, null));
        }
    }

    /**
     * Pull out an individual split position for a read
     *
     * @param read               the read being split
     * @param cigarStartIndex    the index of the first cigar element to keep
     * @param cigarEndIndex      the index of the last cigar element to keep
     * @param forSplitPositions  the manager for keeping track of split positions; can be null
     * @return a non-null read representing the section of the original read being split out
     */
    private static GATKSAMRecord splitReadBasedOnCigar(final GATKSAMRecord read, final int cigarStartIndex, final int cigarEndIndex, final OverhangFixingManager forSplitPositions) {
        int cigarFirstIndex = cigarStartIndex;
        int cigarSecondIndex = cigarEndIndex;

        //in case a section of the read ends or starts with D (for example the first section in 1M1D1N1M is 1M1D), we should trim this cigar element
        // it can be 'if', but it was kept as 'while' to make sure the code can work with Cigar strings that were not "cleaned"
        while(read.getCigar().getCigarElement(cigarFirstIndex).getOperator().equals(CigarOperator.D))
            cigarFirstIndex++;
        while(read.getCigar().getCigarElement(cigarSecondIndex-1).getOperator().equals(CigarOperator.D))
            cigarSecondIndex--;
        if(cigarFirstIndex > cigarSecondIndex)
            throw new UserException.BadInput("Cannot split this read (might be an empty section between Ns, for example 1N1D1N): "+read.getCigarString());

        // we keep only the section of the read that is aligned to the reference between startRefIndex and stopRefIndex (inclusive).
        // the other sections of the read are clipped:
        final int startRefIndex = read.getOriginalAlignmentStart() + CigarUtils.countRefBasesBasedOnCigar(read,0,cigarFirstIndex); //goes through the prefix of the cigar (up to cigarStartIndex) and move the reference index.
        final int stopRefIndex = startRefIndex + CigarUtils.countRefBasesBasedOnCigar(read,cigarFirstIndex,cigarSecondIndex)-1; //goes through a consecutive non-N section of the cigar (up to cigarEndIndex) and move the reference index.

        if ( forSplitPositions != null ) {
            final String contig = read.getReferenceName();
            final int splitStart = startRefIndex + CigarUtils.countRefBasesBasedOnCigar(read,cigarFirstIndex,cigarEndIndex);  //we use cigarEndIndex instead of cigarSecondIndex so we won't take into account the D's at the end.
            final int splitEnd = splitStart + read.getCigar().getCigarElement(cigarEndIndex).getLength() - 1;
            forSplitPositions.addSplicePosition(contig, splitStart, splitEnd);
        }

        return ReadClipper.hardClipToRegionIncludingClippedBases(read, startRefIndex, stopRefIndex);
    }
}
